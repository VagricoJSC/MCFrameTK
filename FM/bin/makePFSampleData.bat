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

IF NOT EXIST .\log\mkpf ( MKDIR .\log\mkpf )
IF NOT EXIST .\log\mkpf\sql_sample ( MKDIR .\log\mkpf\sql_sample )

set NLS_LANG=American_america.AL32UTF8

@echo PF sample data (log: db\log\mkpf)
PUSHD .\ora\mkpf\make\
set SQLFILE_HOME=%DBHOME%\log\mkpf\sql_sample
echo %SQLFILE_HOME%
set LOG_FILE=%DBHOME%\log\mkpf\mkpf_sampleData.log
call %MOO_DBUTIL% %DBHOME%\ora\mkpf\make\mkpf_sampleData.json

POPD
:FIN
@ENDLOCAL
