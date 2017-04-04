package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.core.generic.GenericDao;
import cn.edu.bupt.springmvc.web.model.User;
import cn.edu.bupt.springmvc.web.model.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户Dao接口
 */
public interface UserMapper extends GenericDao<User, Long> {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 用户登录验证查询
     *
     * @param record
     * @return
     */
    User authentication(@Param("record") User record);

}