package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.core.generic.GenericDao;
import cn.edu.bupt.springmvc.web.model.Permission;
import cn.edu.bupt.springmvc.web.model.PermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 权限 Dao 接口
 */
public interface PermissionMapper extends GenericDao<Permission, Long> {
    int countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    /**
     * 通过角色id 查询角色 拥有的权限
     *
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);
}