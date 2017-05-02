package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.web.model.SyncTask;
import cn.edu.bupt.springmvc.web.model.SyncTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyncTaskMapper {
    int countByExample(SyncTaskExample example);

    int deleteByExample(SyncTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SyncTask record);

    int insertSelective(SyncTask record);

    List<SyncTask> selectByExample(SyncTaskExample example);

    SyncTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SyncTask record, @Param("example") SyncTaskExample example);

    int updateByExample(@Param("record") SyncTask record, @Param("example") SyncTaskExample example);

    int updateByPrimaryKeySelective(SyncTask record);

    int updateByPrimaryKey(SyncTask record);
}