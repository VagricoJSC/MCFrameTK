@ECHO OFF
@SETLOCAL

SET DBHOME=%~dp0..\db
SET SETUP_HOME=%~dp0..
SET MCDB=ora

call %~dp0\schemaEnv.cmd 

PUSHD "%DBHOME%"

IF EXIST .\log ( RMDIR /S /Q .\log )
MKDIR .\log

@echo Create Framework Schema..  db\log\mkws.log
CALL "%DBHOME%\%MCDB%\mkws.bat"

POPD
:FIN
@ENDLOCAL
