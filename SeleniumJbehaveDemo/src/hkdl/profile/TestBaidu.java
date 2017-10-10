package hkdl.profile;

import org.testng.annotations.*;

import com.versionone.config.ConfigFiles;
import com.versionone.config.Configuration;
import Configuration.SeleniumTest;


public class TestBaidu  extends SeleniumTest{

	
	@BeforeMethod
	public void setup() {
		
		//Start ff browser and open google page(ff and url are set as default)
		start();
		Configuration.setProperties("TestBaidu");
	}
	
	
	@Test
	public void demoTest() {
		
		open(ConfigFiles.PROFILE_LOGIN);
		//verifyTitle("baidu.title");
		//verifyCopy("baidu.news");
		enter("baidu.searchfield","accenture");
		click("baidu.searchBtn");
		verifyCopy("baidu.search.result");
		
	}

	
	@AfterMethod  
	public void end() {
		
		quit();
		
	}

}
