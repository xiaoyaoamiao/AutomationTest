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
    public static final String COPY_DIR = "conf//copies//content.properties";
    public static final String TESTCASE_CONFIG = "googleXlsTests.properties";
    public static final String TEST_REPORT = "file:////Users/bmiao/Documents/AutomationStaff/selenium/SeleniumJbehaveDemo/AutomationTest/SeleniumJbehaveDemo/test-output/index.html";
    
    public static final String PROFILE_LOGIN = PROFILE_HOST;
    /**
     * Hidden constructor.
     */
    private ConfigFiles()
    {

    }
}
