package cn.edu.bupt.springmvc.web.service.impl;

import cn.edu.bupt.springmvc.core.generic.GenericDao;
import cn.edu.bupt.springmvc.core.generic.GenericServiceImpl;
import cn.edu.bupt.springmvc.web.dao.PermissionMapper;
import cn.edu.bupt.springmvc.web.model.Permission;
import cn.edu.bupt.springmvc.web.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FirenzesEagle on 2016/4/18 0018.
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission,Long> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public GenericDao<Permission, Long> getDao() {
        return permissionMapper;
    }

    @Override
    public List<Permission> selectPermissionsByRoleId(Long roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }
}
