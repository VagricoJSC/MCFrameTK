@ECHO OFF
@SETLOCAL

SET DBHOME=%~dp0..\communication\db
SET SETUP_HOME=%~dp0..

call %~dp0\schemaEnv.cmd 

PUSHD "%DBHOME%"

IF EXIST .\log ( RMDIR /S /Q .\log )
MKDIR .\log

@echo Create Communication Schema..  communication\db\log\mkaw.log
CALL "%DBHOME%\mkaw.bat"

POPD
:FIN
@ENDLOCAL
