package testcase.main;

import org.testng.annotations.*;

import com.main.seleniumBase.SeleniumTest;
import com.versionone.config.EnvArguments;
import com.versionone.config.ReadProperty;


public class TestBaidu  extends SeleniumTest{

	
	@BeforeMethod
	public void setup() {
		
		//Start ff browser and open google page(ff and url are set as default)
		start();
		ReadProperty.setProperties("TestBaidu");
	}
	
	
	@Test
	public void demoTest() {
		
		open(EnvArguments.PROFILE_LOGIN);
		//verifyTitle("baidu.title");
		//verifyCopy("baidu.news");
		enter("baidu.searchfield","accenture");
		click("baidu.searchBtn");
		//下面两种方法都可以用来验证页面上显示的和实际期望值正确与否
		verifyCopy("baidu.search.result");   //期望值放到content.properties
		//assertEquals有两个参数，实际值（需要通过Xpath从页面中获取）和期望值
		assertEquals(getTextByKey("baidu.search.result"),"搜索工具\n百度为您找到相关结果约2,330,000个");

	}

	
	@AfterMethod  
	public void end() {
		
		quit();
		
	}

}
