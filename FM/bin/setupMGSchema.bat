@ECHO OFF
@SETLOCAL

SET DBHOME=%~dp0..\db
SET SETUP_HOME=%~dp0..
SET MCDB=ora
SET MOO_DBUTIL=%SETUP_HOME%\bin\mooDBUtil.bat

call %~dp0\schemaEnv.cmd 

set EXECTYPE=SETUP
set AUTOCOMMIT=true

PUSHD "%DBHOME%"

IF EXIST .\log\mkmg ( RMDIR /S /Q .\log\mkmg )
MKDIR .\log\mkmg
MKDIR .\log\mkmg\sql

set NLS_LANG=American_america.AL32UTF8

@echo MG database objects (log: .\log\mkmg\mkmg.log)
pushd .\ora\mkmg\make\
set SQLFILE_HOME=%DBHOME%\log\mkmg\sql
set LOG_FILE=%DBHOME%\log\mkmg\mkmg.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmg\make\makeAll.json

popd

@echo patch version (log: .\log\ins_pver_MG.log)
pushd ..\bin\patch\
call ins_pver_MG.bat
popd

POPD
:FIN
@ENDLOCAL
