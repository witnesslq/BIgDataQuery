package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.web.model.DataSource;
import cn.edu.bupt.springmvc.web.model.DataSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataSourceMapper {
    int countByExample(DataSourceExample example);

    int deleteByExample(DataSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataSource record);

    int insertSelective(DataSource record);

    List<DataSource> selectByExample(DataSourceExample example);

    DataSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataSource record, @Param("example") DataSourceExample example);

    int updateByExample(@Param("record") DataSource record, @Param("example") DataSourceExample example);

    int updateByPrimaryKeySelective(DataSource record);

    int updateByPrimaryKey(DataSource record);
}