package hkdl.profile;

import org.testng.annotations.*;

import com.versionone.config.ConfigFiles;
import com.versionone.config.Configuration;
import Configuration.SeleniumTest;


public class ProfileLoginPage  extends SeleniumTest{

	
	@BeforeMethod
	public void setup() {
		
		//Start ff browser and open google page(ff and url are set as default)
		start();
		Configuration.setProperties("ProfileLoginPage");
	}
	
	
	@Test
	public void demoTest() {
		
		//input hello world and click search button
		open(ConfigFiles.PROFILE_LOGIN);
		verifyTitle("hkdl.site.authentication.authentication.login.translation.meta.pageTitle");
		//check element displays good
		verifyCopy("login.title");
		verifyCopy("forms.signIn.emailLabel");  //username
		verifyCopy("forms.password.passwordLabel");//password
		verifyCopy("login.forgotPassword"); //forgetpassword
		verifyCopy("signIn.loginName.hint");   //username hint
		verifyCopy("forms.signIn.rememberMe"); //Remember me checkbox
		assertEquals(getText(Configuration.getXpath("login.bottom.title")),Configuration.getCopy("login.bottom.title"));
		verifyCopy("login.bottom.description");
		verifyCopy("signIn.bottom.createAccount");
		verifyCopy("login.submitButton");
		verifyCopy("button.action.cancel");
		click("login.submitButton");
		verifyCopy("forms.signIn.accountSettingsEmailRequired");
		verifyCopy("form.errors.passwordRequired");
		verifyCopy("hkdl.form.errors.pageLevelTitle");
		
		enter("username.field","username");
		enter("password.field","password");
		
		click("login.submitButton");
		verifyCopy("signin.invalidLogin");
		
	}

	
	@AfterMethod  
	public void end() {
		
		quit();
		
	}

}
