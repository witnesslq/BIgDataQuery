package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.web.model.WorkTable;
import cn.edu.bupt.springmvc.web.model.WorkTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkTableMapper {
    int countByExample(WorkTableExample example);

    int deleteByExample(WorkTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkTable record);

    int insertSelective(WorkTable record);

    List<WorkTable> selectByExample(WorkTableExample example);

    WorkTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkTable record, @Param("example") WorkTableExample example);

    int updateByExample(@Param("record") WorkTable record, @Param("example") WorkTableExample example);

    int updateByPrimaryKeySelective(WorkTable record);

    int updateByPrimaryKey(WorkTable record);
}