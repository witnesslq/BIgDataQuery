package cn.edu.bupt.springmvc.web.service;

import java.sql.SQLException;
import java.util.Set;

import com.lmk.database_schema.schema.TableSchema;

public interface DataSourceService {

	Set<String> testDataSourceAvaliable() throws SQLException;
	public TableSchema getTableSchema(String tableName) throws SQLException;
	String getTableDataDemo(String tableName, int limit, int offset) throws SQLException;
	boolean addDatabaseDataSource(String IP, String port, String username, String password, String databaseName,
			String type, String[] tables, String dataSourceName, String tags, boolean isSync, int hour, int minute);
	void init(String IP, String port, String username, String password, String databaseName, String type);
	
	
}
