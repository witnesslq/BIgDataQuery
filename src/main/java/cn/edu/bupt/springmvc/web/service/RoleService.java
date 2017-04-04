package cn.edu.bupt.springmvc.web.service;

import cn.edu.bupt.springmvc.core.generic.GenericService;
import cn.edu.bupt.springmvc.web.model.Role;

import java.util.List;

/**
 * Created by FirenzesEagle on 2016/4/18 0018.
 */
public interface RoleService extends GenericService<Role,Long>{

    /**
     * 通过用户id 查询用户 拥有的角色
     *
     * @param userId
     * @return
     */
    List<Role> selectRolesByUserId(Long userId);

}
