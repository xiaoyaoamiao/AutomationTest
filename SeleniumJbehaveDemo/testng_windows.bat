@echo off
title testng.xml execution
echo Execute xml
set CLASSPATH=%CLASSPATH%;C:\Users\csuo\jarhome;c:\Project_classpath
cd C:\Users\csuo
java org.testng.TestNG testng.xml
pause
