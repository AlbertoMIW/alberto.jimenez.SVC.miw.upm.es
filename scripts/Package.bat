﻿@echo off
set workspace=E:\workspaceEclipse\alberto.jimenez.SVC.miw.upm.es
::Las variables de entorno se pueden configurar directamente en Windows cuando se tienen los permisos necesarios
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_25
set M2_HOME=E:\workspaceEclipse\apache-maven-3.3.9
set PATH=%PATH%;%JAVA_HOME%\bin;%M2_HOME%\bin
echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo JAVA_HOME --- %JAVA_HOME%
echo M2_HOME   --- %M2_HOME%
echo .
cd %workspace%

echo "============ mvn -ff clean test (profile: develop) =================="
echo .
call mvn clean test -Denvironment.type=developer
call mvn package -Denvironment.type=preproduction
pause
exit