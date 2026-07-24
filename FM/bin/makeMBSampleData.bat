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

IF NOT EXIST .\log\mkmb ( MKDIR .\log\mkmb )
IF NOT EXIST .\log\mkmb\sql_sample ( MKDIR .\log\mkmb\sql_sample )

set NLS_LANG=American_america.AL32UTF8

@echo MB sample data (log: db\log\mkmb)
PUSHD .\ora\mkmb\make\
set SQLFILE_HOME=%DBHOME%\log\mkmb\sql_sample
echo %SQLFILE_HOME%
set LOG_FILE=%DBHOME%\log\mkmb\mkmb_sample.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmb\make\mkmb_sampleData.json

POPD
:FIN
@ENDLOCAL
