package cn.edu.bupt.springmvc.web.service;

import cn.edu.bupt.springmvc.core.generic.GenericService;
import cn.edu.bupt.springmvc.web.model.Permission;

import java.util.List;

/**
 * Created by FirenzesEagle on 2016/4/18 0018.
 */
public interface PermissionService extends GenericService<Permission,Long> {

    /**
     * 通过角色id 查询角色 拥有的权限
     *
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);

}
