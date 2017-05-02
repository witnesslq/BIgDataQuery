package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.web.model.RelationalDatabaseInfo;
import cn.edu.bupt.springmvc.web.model.RelationalDatabaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationalDatabaseInfoMapper {
    int countByExample(RelationalDatabaseInfoExample example);

    int deleteByExample(RelationalDatabaseInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RelationalDatabaseInfo record);

    int insertSelective(RelationalDatabaseInfo record);

    List<RelationalDatabaseInfo> selectByExample(RelationalDatabaseInfoExample example);

    RelationalDatabaseInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RelationalDatabaseInfo record, @Param("example") RelationalDatabaseInfoExample example);

    int updateByExample(@Param("record") RelationalDatabaseInfo record, @Param("example") RelationalDatabaseInfoExample example);

    int updateByPrimaryKeySelective(RelationalDatabaseInfo record);

    int updateByPrimaryKey(RelationalDatabaseInfo record);
}