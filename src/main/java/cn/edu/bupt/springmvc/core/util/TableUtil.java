package cn.edu.bupt.springmvc.core.util;

public class TableUtil {

	public static String getBasedTableType(String type){
		if (type.toLowerCase().trim().equals("mysql")){
			return "DATABASE";
		}else if (type.toLowerCase().trim().equals("sqlserver")) {
			return "DATABASE";
		}else if (type.toLowerCase().trim().equals("excel")) {
			return "FILE";
		}else if (type.toLowerCase().trim().equals("csv")) {
			return "FILE";
		}
		return "FALSE_BASED_TABLE_TYPE";
	}
	
	public static String convertTablesToStr(String[] tables){
		StringBuilder sb = new StringBuilder();
		for (String t : tables) {
			sb.append(t).append("|");
		}
		return sb.toString();
	}
	
}
