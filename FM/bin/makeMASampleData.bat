@ECHO ON
@SETLOCAL

SET DBHOME=%~dp0..\db
SET SETUP_HOME=%~dp0..
SET MCDB=ora
SET MOO_DBUTIL=%SETUP_HOME%\bin\mooDBUtil.bat

call %~dp0\schemaEnv.cmd 

set EXECTYPE=SETUP
set AUTOCOMMIT=true

PUSHD "%DBHOME%"

IF NOT EXIST .\log\mkma ( MKDIR .\log\mkma )
IF NOT EXIST .\log\mkma\sql_sample ( MKDIR .\log\mkma\sql_sample )

set NLS_LANG=American_america.AL32UTF8

@echo MA sample data (log: db\log\mkma)
PUSHD .\ora\mkma\make\
set SQLFILE_HOME=%DBHOME%\log\mkma\sql_sample
echo %SQLFILE_HOME%
set LOG_FILE=%DBHOME%\log\mkma\mkma_sample.log
call %MOO_DBUTIL% %DBHOME%\ora\mkma\make\mkma_sampleData.json

POPD
:FIN
@ENDLOCAL