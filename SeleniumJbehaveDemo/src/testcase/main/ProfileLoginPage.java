package testcase.main;

import org.testng.annotations.*;

import com.main.seleniumBase.SeleniumTest;
import com.versionone.config.EnvArguments;
import com.versionone.config.ReadProperty;


public class ProfileLoginPage  extends SeleniumTest{

	
	@BeforeMethod
	public void setup() {
		
		//Start ff browser and open google page(ff and url are set as default)
		start();
		ReadProperty.setProperties("ProfileLoginPage");
	}
	
	
	@Test
	public void demoTest() {
		
		//input hello world and click search button
		open(EnvArguments.PROFILE_LOGIN);
		verifyTitle("hkdl.site.authentication.authentication.login.translation.meta.pageTitle");
		//check element displays good;
		verifyCopy("login.title");
		verifyCopy("forms.signIn.emailLabel");  //username
		verifyCopy("forms.password.passwordLabel");//password
		verifyCopy("login.forgotPassword"); //forgetpassword
		verifyCopy("signIn.loginName.hint");   //username hint
		verifyCopy("forms.signIn.rememberMe"); //Remember me checkbox
		assertEquals(getText(ReadProperty.getXpath("login.bottom.title")),ReadProperty.getCopy("login.bottom.title"));
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
