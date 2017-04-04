package cn.edu.bupt.springmvc.web.service.impl;

import cn.edu.bupt.springmvc.core.generic.GenericDao;
import cn.edu.bupt.springmvc.core.generic.GenericServiceImpl;
import cn.edu.bupt.springmvc.web.dao.RoleMapper;
import cn.edu.bupt.springmvc.web.model.Role;
import cn.edu.bupt.springmvc.web.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FirenzesEagle on 2016/4/18 0018.
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }

}
