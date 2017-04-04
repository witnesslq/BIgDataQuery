package cn.edu.bupt.springmvc.web.security;

import cn.edu.bupt.springmvc.web.model.Permission;
import cn.edu.bupt.springmvc.web.model.Role;
import cn.edu.bupt.springmvc.web.model.User;
import cn.edu.bupt.springmvc.web.service.PermissionService;
import cn.edu.bupt.springmvc.web.service.RoleService;
import cn.edu.bupt.springmvc.web.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户身份验证,授权 Realm 组件
 * <p>
 * Created by FirenzesEagle on 2016/4/18 0018.
 */
@Component(value = "securityRealm")
public class SecurityRealm extends AuthorizingRealm {

    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;

    @Resource
    private PermissionService permissionService;

    /**
     * 权限检查
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        String username = String.valueOf(principalCollection.getPrimaryPrincipal());

        final User user = userService.selectByUsername(username);
        final List<Role> roleInfos = roleService.selectRolesByUserId(user.getId());
        for (Role role : roleInfos) {
            //添加角色
            System.out.println("role = [" + role + "]");
            authorizationInfo.addRole(role.getRoleSign());

            final List<Permission> permissions = permissionService.selectPermissionsByRoleId(role.getId());
            for (Permission permission : permissions) {
                //添加权限
                System.out.println("permission = [" + permission + "]");
                authorizationInfo.addStringPermission(permission.getPermissionSign());
            }
        }
        return authorizationInfo;
    }

    /**
     * 登录验证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = String.valueOf(authenticationToken.getPrincipal());
        String password = new String((char[]) authenticationToken.getCredentials());
        //通过数据库进行验证
        final User authentication = userService.authentication(new User(username, password));
        if (authentication == null) {
            throw new AuthenticationException("用户名或密码错误！");
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, password, getName());
        return authenticationInfo;
    }
}
