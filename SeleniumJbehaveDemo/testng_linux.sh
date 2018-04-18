@echo off
title testng.xml execution
echo Execute xml
export CLASSPATH=$CLASSPATH:/Users/bmiao/Documents/AutomationTest/AutomationProjects/Java_selenium/AutomationTest/SeleniumJbehaveDemo/target/classes
cd /Users/bmiao/Documents/AutomationTest/AutomationProjects/Java_selenium/AutomationTest/SeleniumJbehaveDemo/
java org.testng.TestNG testng.xml
