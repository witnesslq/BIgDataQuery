package cn.edu.bupt.springmvc.util;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextHierarchy({
		@ContextConfiguration(name = "parent",locations = "classpath:applicationContext.xml"),
		@ContextConfiguration(name = "child",locations = "classpath:spring-mvc.xml")
})
public class AbstractContextControllerTest {
	
	@Autowired
	protected WebApplicationContext wac;
	protected Logger logger = LoggerFactory.getLogger(AbstractContextControllerTest.class);;
	protected MockMvc mockMvc;
	protected Gson gson = new Gson();
	@Before
	public void setup(){
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
}
