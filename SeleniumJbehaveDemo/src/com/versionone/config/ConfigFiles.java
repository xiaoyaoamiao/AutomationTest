/**
 *
 */
package com.versionone.config;

import Configuration.Environment;

/**
 * @author hannibal
 *
 */
public final class ConfigFiles
{
    /**
     * Selenium Config File Name.
     */
    public static final String SELENIUM_CONFIG = "seleniumConfig.properties";

    /**
     * Local Selenium Config File Name.
     */
    public static final String SELENIUM_LOCAL_CONFIG = "seleniumConfig.local.properties";

    /**
     * Test Case Config Name.
     */
    //public static final String PROFILE_HOST = "https://origin.latest.profile-ui.hkdl.ap-northeast-1.wdpro.disney.com/";
    public static final String PROFILE_HOST = "https://www.baidu.com/";
    public static final String COPY_DIR = "conf//copies//content.";
    public static final String TESTCASE_CONFIG = "googleXlsTests.properties";
    public static final String TEST_REPORT = "file:///Users/bmiao/Documents/AutomationStaff/seleniumDemo/SeleniumDemo/test-output/index.html";
    
    public static final String XDisneyInternalSite = "HKDL";
    public static final String XDisneyInternalSiteRegion = "intl";
    public static final String XDisneyInternalPreferredLanguage = "zh-hk";
    public static final String XDisneyInternalBaseUrl  = PROFILE_HOST+"/login/";
    
    public static final String ACCOUNT_USERNAME_CH_MOBILE  = "15601878280";
    public static final String ACCOUNT_USERNAME_EMAIL  = "bobby.x.miao.-nd@disney.com";
    public static final String ACCOUNT_PASSWORD  = "123,aA";
    public static final String ACCOUNT_FIRSTNAME  = "autoTestFirstname";
    public static final String ACCOUNT_LASTNAME  = "autoTestLastname";
    

    public static final String PROFILE_LOGIN = PROFILE_HOST + "/zh-hk/login/";
    public static final String PROFILE_FORGOTPASSWORD = PROFILE_HOST+"/zh-hk/forgotpassword/";
    public static final String PROFILE_REGISTRATION = PROFILE_HOST+"/zh-hk/registration/";
    /**
     * Hidden constructor.
     */
    private ConfigFiles()
    {

    }
}
