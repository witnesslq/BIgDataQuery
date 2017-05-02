package cn.edu.bupt.springmvc.web.service.impl;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.junit.Test;

import cn.edu.bupt.springmvc.util.AbstractContextControllerTest;
import cn.edu.bupt.springmvc.web.model.FolderTable;
import cn.edu.bupt.springmvc.web.service.FolderService;

public class FolderServiceImplTest extends AbstractContextControllerTest{

	@Resource
	private FolderServiceImpl folderService;
	
	
	@Test
	public void testIfNotFindThenCreate() throws SQLException {
//		FolderTable folder = folderService.ifNotFindThenCreate(null, "root", "ROOT");
//		logger.info(folder.getId().toString());
		FolderTable folder2 = folderService.ifNotFindThenCreate(1, "workTable", "WORKTABLE");
		FolderTable folder3 = folderService.ifNotFindThenCreate(1, "dashBoard", "DASHBOARD");
	}

}
