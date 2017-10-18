package jbehave.test;
import org.jbehave.core.annotations.*;

import com.main.seleniumBase.SeleniumTest;
import com.versionone.config.ReadProperty;

public class BaiduSearchHelloWorldSteps extends SeleniumTest{
	
	@Given("Open Baidu Page")
	public void givenOpenBaiduPage(){
		start();
		ReadProperty.setProperties("BaiduSearchHelloWorldSteps");
	}
	
	@Then("I click search button")
	public void thenIClickSearchButton(){
		click("search.button");
	}
	@Then("I can get text $content")
	public void thenICanGetTextContent(String content){
		assertEquals(getText(ReadProperty.getXpath("searchResult.result")),content);
	}
	@When("I enter Hello World in Search Field")
	public void whenIEnterHelloWorldInSearchField(){
		enter("search.field","hello world");
	}
	@Then("I quick browser")
	public void thenIQuickBrowser(){
		 quit();
	}

}