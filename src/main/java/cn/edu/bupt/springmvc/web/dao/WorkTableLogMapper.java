package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.web.model.WorkTableLog;
import cn.edu.bupt.springmvc.web.model.WorkTableLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkTableLogMapper {
    int countByExample(WorkTableLogExample example);

    int deleteByExample(WorkTableLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkTableLog record);

    int insertSelective(WorkTableLog record);

    List<WorkTableLog> selectByExample(WorkTableLogExample example);

    WorkTableLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkTableLog record, @Param("example") WorkTableLogExample example);

    int updateByExample(@Param("record") WorkTableLog record, @Param("example") WorkTableLogExample example);

    int updateByPrimaryKeySelective(WorkTableLog record);

    int updateByPrimaryKey(WorkTableLog record);
}