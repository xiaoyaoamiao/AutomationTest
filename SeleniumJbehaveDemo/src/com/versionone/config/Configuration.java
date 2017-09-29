package com.versionone.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

/**
 * Configuration class. It provides access for java property files.
 *
 * @author Brautigam Gergely
 *
 */
public final class Configuration
{

    /**
     * Private constructor of Configuration class.
     */
    private Configuration()
    {

    }

    /**
     * Properties.
     */
    private static String executaionProperties;
    public static void setProperties(String propertyName){
    	executaionProperties = propertyName;
    }
    
    private static Properties properties;

    /**
     * Get a Value from a configuration file.
     *
     * @param value The name of the value to look for
     * @return The value of the variable looked for
     */
    public static String getPublicValue(final String value)
    {

        File localConfig = new File("conf//seleniumConfig.local.properties");

        properties = new Properties();
        try
        {
            if (localConfig.exists())
            {
                properties.load(new FileInputStream(
                        "conf//seleniumConfig.local.properties"));
            }
            else
            {
                properties.load(new FileInputStream(
                        "conf//seleniumConfig.properties"));
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        String removeQuotaion = properties.getProperty(value).replace("\"", "");
        return removeQuotaion;
    }

    public static String getXpath(final String value)
    {
    	String fileDir = "conf//xpathes//"+executaionProperties+".properties";
        File localConfig = new File(fileDir);
        properties = new Properties();
        try
        {
            if (localConfig.exists())
            {
                properties.load(new FileInputStream(fileDir));
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty(value));
        String removeQuotaion = properties.getProperty(value).replace("\"", "");
        return removeQuotaion;
    }
    
    public static String getXpath(final String value, final String file)
    {
        File localConfig = new File("conf//xpathes//"+file+".properties");
        properties = new Properties();
        try
        {
            if (localConfig.exists())
            {
                properties.load(new FileInputStream("conf//xpathes//"+file+".properties"));
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("conf//xpathes//"+file+".properties");
        System.out.println(properties.getProperty(value));
        String removeQuotaion = properties.getProperty(value).replace("\"", "");
        return removeQuotaion;
    }
    
    /**
     * Overload for the method getValue. Can access custome files.
     *
     * @param configFile The file to open. Must be located in the conf folder.
     * @param value Value to get.
     * @return string value of the Value searched for.
     */
    public static String getValue(final String configFile, final String value)
    {

        properties = new Properties();
        try
        {

            properties.load(new FileInputStream("conf//xpathes//" + configFile));

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        return properties.getProperty(value);

    }
    
    
    public static String getValue(final String value)
    {

        properties = new Properties();
        try
        {

            properties.load(new FileInputStream("conf//xpathes//" + executaionProperties));

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        return properties.getProperty(value);

    }

    /**
     * Get a Value from a configuration file.
     *
     * @param value The name of the value to look for
     * @return The value of the variable looked for
     */
    public static String getCopy(final String value)
    {
    	String property_file = ConfigFiles.COPY_DIR + ConfigFiles.XDisneyInternalPreferredLanguage+".properties";
        File localConfig = new File(property_file);
        properties = new Properties();
        try
        {
            if (localConfig.exists())
            {
                properties.load(new FileInputStream(property_file));
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        if(!properties.containsKey(value))
        {
        	Reporter.log("Cannot found key: "+ value);
        	return "";
        }
        String removeQuotaion = properties.getProperty(value);//.replace("\"", "");
        removeQuotaion = removeQuotaion.substring(1, removeQuotaion.length()-1);
        return removeQuotaion.trim();
    }
}
