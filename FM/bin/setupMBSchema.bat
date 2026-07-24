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

IF EXIST .\log\mkmb ( RMDIR /S /Q .\log\mkmb )
MKDIR .\log\mkmb
MKDIR .\log\mkmb\sql

IF EXIST .\log\mkmbba ( RMDIR /S /Q .\log\mkmbba )
MKDIR .\log\mkmbba
MKDIR .\log\mkmbba\sql

IF EXIST .\log\mkmbbb ( RMDIR /S /Q .\log\mkmbbb )
MKDIR .\log\mkmbbb
MKDIR .\log\mkmbbb\sql

IF EXIST .\log\mkmbbc ( RMDIR /S /Q .\log\mkmbbc )
MKDIR .\log\mkmbbc
MKDIR .\log\mkmbbc\sql

IF EXIST .\log\mkmbbe ( RMDIR /S /Q .\log\mkmbbe )
MKDIR .\log\mkmbbe
MKDIR .\log\mkmbbe\sql

set NLS_LANG=American_america.AL32UTF8

@echo MB database objects (log: .\log\mkmb\mkmb.log)
pushd .\ora\mkmb\make\
set SQLFILE_HOME=%DBHOME%\log\mkmb\sql
set LOG_FILE=%DBHOME%\log\mkmb\mkmb.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmb\make\makeAll.json
popd

@echo MBBA database objects (log: .\log\mkmbba\mkmbba.log)
pushd .\ora\mkmbba\make\
set SQLFILE_HOME=%DBHOME%\log\mkmbba\sql
set LOG_FILE=%DBHOME%\log\mkmbba\mkmbba.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmbba\make\makeAll.json
popd

@echo MBBB database objects (log: .\log\mkmbbb\mkmbbb.log)
pushd .\ora\mkmbbb\make\
set SQLFILE_HOME=%DBHOME%\log\mkmbbb\sql
set LOG_FILE=%DBHOME%\log\mkmbbb\mkmbbb.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmbbb\make\makeAll.json
popd

@echo MBBC database objects (log: .\log\mkmbbc\mkmbbc.log)
pushd .\ora\mkmbbc\make\
set SQLFILE_HOME=%DBHOME%\log\mkmbbc\sql
set LOG_FILE=%DBHOME%\log\mkmbbc\mkmbbc.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmbbc\make\makeAll.json
popd

@echo MBBE database objects (log: .\log\mkmbbe\mkmbbe.log)
pushd .\ora\mkmbbe\make\
set SQLFILE_HOME=%DBHOME%\log\mkmbbe\sql
set LOG_FILE=%DBHOME%\log\mkmbbe\mkmbbe.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmbbe\make\makeAll.json
popd

@echo patch version (log: .\log\ins_pver_MB.log)
pushd ..\bin\patch\
call ins_pver_MB.bat
popd

POPD
:FIN
@ENDLOCAL
