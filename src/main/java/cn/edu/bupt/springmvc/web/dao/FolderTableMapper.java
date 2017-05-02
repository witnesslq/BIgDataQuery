package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.web.model.FolderTable;
import cn.edu.bupt.springmvc.web.model.FolderTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FolderTableMapper {
    int countByExample(FolderTableExample example);

    int deleteByExample(FolderTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FolderTable record);

    int insertSelective(FolderTable record);

    List<FolderTable> selectByExample(FolderTableExample example);

    FolderTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FolderTable record, @Param("example") FolderTableExample example);

    int updateByExample(@Param("record") FolderTable record, @Param("example") FolderTableExample example);

    int updateByPrimaryKeySelective(FolderTable record);

    int updateByPrimaryKey(FolderTable record);
}