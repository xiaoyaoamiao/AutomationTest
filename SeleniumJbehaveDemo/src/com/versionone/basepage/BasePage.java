/**
 * This is the Base Page class from which every page class is inherited.
 *
 * @author Gergely Brautigam
 */
package com.versionone.basepage;

/**
 * Base Page for all pages.
 * @author Brautigam Gergely
 *
 */
public class BasePage
{
    /**
     * Default time out for Pages.
     */
    protected String defaultPageTimeOut = "90000";

    /**
     * Default time out for Ajax requests.
     */
    protected String defaultAjaxTimeOut = "15000";

    /**
     * Default element wait.
     */
    protected final int defaultElementTimeOut = 30000;

    /**
     * Possible language specification names found in local cookie.
     */
    protected enum Language {en_US,ja_JP};
}
