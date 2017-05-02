package cn.edu.bupt.springmvc.web.service.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.lmk.database_schema.DataSourceConnectionPool;
import com.lmk.database_schema.DatabaseSchema;
import com.lmk.database_schema.schema.TableSchema;

import cn.edu.bupt.springmvc.core.util.TableUtil;
import cn.edu.bupt.springmvc.web.dao.DataSourceMapper;
import cn.edu.bupt.springmvc.web.dao.FolderTableMapper;
import cn.edu.bupt.springmvc.web.dao.RelationalDatabaseInfoMapper;
import cn.edu.bupt.springmvc.web.dao.SyncTaskMapper;
import cn.edu.bupt.springmvc.web.dao.WorkTableLogMapper;
import cn.edu.bupt.springmvc.web.model.DataSource;
import cn.edu.bupt.springmvc.web.model.FolderTable;
import cn.edu.bupt.springmvc.web.model.RelationalDatabaseInfo;
import cn.edu.bupt.springmvc.web.model.SyncTask;
import cn.edu.bupt.springmvc.web.service.DataSourceService;


@Service
public class DataSourceServiceImpl implements DataSourceService {

	@Autowired
	private DataSourceMapper dataSourceDao;
	@Autowired
	private FolderTableMapper folderTableDao;
	@Autowired
	private RelationalDatabaseInfoMapper relationalDatabaseInfoDao;
	@Autowired
	private WorkTableLogMapper workTableDao;
	@Autowired
	private WorkTableLogMapper workTableLogDao;
	@Autowired
	private SyncTaskMapper syncTaskDao;
	
	private DatabaseSchema schema = null;
	
	@Override
	public void init(String IP,String port,  String username,String password,String databaseName,String type) {
		schema = new DatabaseSchema(type, IP,port, databaseName,username , password);
	}
	
	
	@Override
	public Set<String> testDataSourceAvaliable() throws SQLException {
		// TODO Auto-generated method stub
		
		return schema.getTableNames();
	}

	@Override
	public TableSchema getTableSchema(String tableName) throws SQLException{
		return schema.getTableSchema(tableName);
	}
	
	@Override
	public String getTableDataDemo(String tableName,int limit ,int offset) throws SQLException{
		return schema.getTableDataDemo(tableName, limit, offset);
	}
	
	@Override
	public boolean addDatabaseDataSource(String IP,String port,  String username,String password,String databaseName,String type,
    		@RequestParam(value="tables[]") String[] tables,
    		String dataSourceName,String tags,boolean isSync,int hour,int minute) {
		boolean result = false;
		
		RelationalDatabaseInfo dbInfo = new RelationalDatabaseInfo();
		dbInfo.setIpHost(IP);dbInfo.setPort(port);dbInfo.setUsername(username);dbInfo.setPassword(password);
		dbInfo.setDbName(databaseName);dbInfo.setType(type);
		relationalDatabaseInfoDao.insertSelective(dbInfo);
		
		DataSource ds = new DataSource();
//		ds.setCreateorId(createorId);ds.setIsDeleted(false);
		ds.setName(dataSourceName);ds.setBasedTableType(TableUtil.getBasedTableType(type));
		ds.setCreateTime(new Date());ds.setDataId(dbInfo.getId());ds.setTableNames(TableUtil.convertTablesToStr(tables));
		ds.setTags(tags);
		dataSourceDao.insertSelective(ds);
		
//		FolderTable folder = new FolderTable();
//		folder.setName(name);
		
				
		SyncTask syncTask = new SyncTask();
		syncTask.setDatasourceId(ds.getId());syncTask.setHour(hour);syncTask.setMinute(minute);
		syncTaskDao.insertSelective(syncTask);
		
		//开一个新的线程来从 sqoop同步到 hive

		
		//worktable 以及 worktablelog的问题
		
		return result;
	}
}
