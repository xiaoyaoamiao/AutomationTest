package com.versionone.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.testng.Reporter;

/**
 * Configuration class. It provides access for java property files.
 *
 * @author Brautigam Gergely
 *
 */
public final class ReadProperty
{

    /**
     * Private constructor of Configuration class.
     */
    private ReadProperty()
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

    public static String getXpath(final String value)
    {
    	String fileDir = EnvArguments.XPATH_DIR + executaionProperties + ".properties";
        File localConfig = new File(fileDir);
        properties = new Properties();
        try
        {
            if (localConfig.exists())
            {
                properties.load(new BufferedReader(new InputStreamReader(new FileInputStream(fileDir),"UTF-8")));
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
        File localConfig = new File(EnvArguments.XPATH_DIR + file + ".properties");
        properties = new Properties();
        try
        {
            if (localConfig.exists())
            {
                properties.load(new BufferedReader(new InputStreamReader(new FileInputStream(EnvArguments.XPATH_DIR + file + ".properties"),"UTF-8")));
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
       
        Reporter.log("Xpath: " + properties.getProperty(value));
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
    public static String getValues(final String value, final String configFile)
    {

        properties = new Properties();
        try
        {
            properties.load(new BufferedReader(new InputStreamReader(new FileInputStream(EnvArguments.XPATH_DIR + configFile),"UTF-8")));
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
        
        return properties.getProperty(value);

    }
    
    
    public static String getValue(final String value)
    {

        properties = new Properties();
        try
        {
        	
            properties.load(new BufferedReader(new InputStreamReader(new FileInputStream(EnvArguments.XPATH_DIR + executaionProperties),"UTF-8")));

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
    	String property_file = EnvArguments.COPY_DIR;
        File localConfig = new File(property_file);
        properties = new Properties();
        try
        {
            if (localConfig.exists())
            {
                properties.load(new BufferedReader(new InputStreamReader(new FileInputStream(property_file),"UTF-8")));
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
