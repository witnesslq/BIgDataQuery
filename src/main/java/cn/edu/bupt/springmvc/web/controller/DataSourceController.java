package cn.edu.bupt.springmvc.web.controller;

import java.sql.SQLException;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lmk.database_schema.schema.TableSchema;

import cn.edu.bupt.springmvc.core.util.ReturnModel;
import cn.edu.bupt.springmvc.web.service.DataSourceService;
import cn.edu.bupt.springmvc.web.service.impl.DataSourceServiceImpl;

@Controller
@RequestMapping(value = "/DataSource")
public class DataSourceController {
   
	@Resource
	private DataSourceService dataSourceService;
	/**
	 * 
	 * @param IP
	 * @param port
	 * @param username
	 * @param password
	 * @param databaseName
	 * @param type
	 * @return 如果数据库可用，返回所有的表名
	 */
    @RequestMapping(value = "/testDatabaseAvaliable",method =RequestMethod.POST)
    public @ResponseBody ReturnModel testDatabaseAvaliable(
    		String IP,String port,  String username,String password,String databaseName,String type) {
    	
    	dataSourceService.init(IP,port,username,password,databaseName,type);
    	
        ReturnModel result = new ReturnModel();
        Set<String> tableNames = null;
        
    	try {
			tableNames = dataSourceService.testDataSourceAvaliable();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.setResult(false);
			result.setReason(e.getMessage());
			return result;
		}
    	result.setResult(true);
    	result.setDatum(tableNames);
    	return result;
    }

    @RequestMapping("/addDatabaseDataSource")
    public  @ResponseBody ReturnModel addDatabaseDataSource(
    		String IP,String port,  String username,String password,String databaseName,String type,
    		@RequestParam(value="tables[]") String[] tables,
    		String dataSourceName,String tags,boolean isSync,int hour,int minute
    		){
    	ReturnModel result = new ReturnModel();
    	dataSourceService.init(IP,port,username,password,databaseName,type);
    	Set<String> tableNames = null;
    	try {
			tableNames = dataSourceService.testDataSourceAvaliable();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.setResult(false);
			result.setReason(e.getMessage());
			return result;
		}
    	dataSourceService.addDatabaseDataSource(IP, port, username, password, databaseName, type, tables, dataSourceName, tags, isSync, hour, minute);
    	result.setResult(true);
//    	result.setDatum(tableNames);
        return result;
    }
    
    @RequestMapping("/getDatabaseTableSchema")
    public  @ResponseBody ReturnModel getDatabaseTableSchema(
    		String tableName
    		){
    	ReturnModel result = new ReturnModel();
    	TableSchema tableSchema = null;
    	try {
    		tableSchema = dataSourceService.getTableSchema(tableName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.setResult(false);
			result.setReason(e.getMessage());
			return result;
		}
    	result.setResult(true);
    	result.setDatum(tableSchema);
        return result;
    }
    
    @RequestMapping("/getDatabaseTableDemo")
    public  @ResponseBody ReturnModel getDatabaseTableDemo(
    		String tableName
    		){
    	ReturnModel result = new ReturnModel();
    	String  tableDemo= null;
    	try {
    		tableDemo = dataSourceService.getTableDataDemo(tableName,20,0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.setResult(false);
			result.setReason(e.getMessage());
			return result;
		}
    	result.setResult(true);
    	result.setDatum(tableDemo);
        return result;
    }
}
