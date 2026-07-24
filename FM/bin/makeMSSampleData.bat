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

IF NOT EXIST .\log\mkms ( MKDIR .\log\mkms )
IF NOT EXIST .\log\mkms\sql_sample ( MKDIR .\log\mkms\sql_sample )

set NLS_LANG=American_america.AL32UTF8

@echo MS sample data (log: db\log\mkms)
PUSHD .\ora\mkms\make\
set SQLFILE_HOME=%DBHOME%\log\mkms\sql_sample
echo %SQLFILE_HOME%
set LOG_FILE=%DBHOME%\log\mkms\mkms_sampleData.log
call %MOO_DBUTIL% %DBHOME%\ora\mkms\make\mkms_sampleData.json

POPD
:FIN
@ENDLOCAL
