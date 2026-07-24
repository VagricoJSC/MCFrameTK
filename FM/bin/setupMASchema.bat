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

IF EXIST .\log\mkma ( RMDIR /S /Q .\log\mkma )
MKDIR .\log\mkma
MKDIR .\log\mkma\sql

IF EXIST .\log\mkmabc ( RMDIR /S /Q .\log\mkmabc )
MKDIR .\log\mkmabc
MKDIR .\log\mkmabc\sql

IF EXIST .\log\mkmabs ( RMDIR /S /Q .\log\mkmabs )
MKDIR .\log\mkmabs
MKDIR .\log\mkmabs\sql

IF EXIST .\log\mkmabg ( RMDIR /S /Q .\log\mkmabg )
MKDIR .\log\mkmabg
MKDIR .\log\mkmabg\sql

IF EXIST .\log\mkmaua ( RMDIR /S /Q .\log\mkmaua )
MKDIR .\log\mkmaua
MKDIR .\log\mkmaua\sql

set NLS_LANG=American_america.AL32UTF8

@echo MA database objects (log: .\log\mkma\mkma.log)
pushd .\ora\mkma\make\
set SQLFILE_HOME=%DBHOME%\log\mkma\sql
set LOG_FILE=%DBHOME%\log\mkma\mkma.log
call %MOO_DBUTIL% %DBHOME%\ora\mkma\make\makeAll.json

@echo MABC database objects (log: .\log\mkmabc\mkmabc.log)
pushd .\ora\mkmabc\make\
set SQLFILE_HOME=%DBHOME%\log\mkmabc\sql
set LOG_FILE=%DBHOME%\log\mkmabc\mkmabc.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmabc\make\makeAll.json

@echo MABS database objects (log: .\log\mkmabs\mkmabs.log)
pushd .\ora\mkmabs\make\
set SQLFILE_HOME=%DBHOME%\log\mkmabs\sql
set LOG_FILE=%DBHOME%\log\mkmabs\mkmabs.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmabs\make\makeAll.json
popd

@echo MABG database objects (log: .\log\mkmabg\mkmabg.log)
pushd .\ora\mkmabg\make\
set SQLFILE_HOME=%DBHOME%\log\mkmabg\sql
set LOG_FILE=%DBHOME%\log\mkmabg\mkmabg.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmabg\make\makeAll.json
popd

@echo MAUA database objects (log: .\log\mkmaua\mkmaua.log)
pushd .\ora\mkmaua\make\
set SQLFILE_HOME=%DBHOME%\log\mkmaua\sql
set LOG_FILE=%DBHOME%\log\mkmaua\mkmaua.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmaua\make\makeAll.json
popd

@echo patch version (log: .\log\ins_pver_MA.log)
pushd ..\bin\patch\
call ins_pver_MA.bat
popd

POPD
:FIN
@ENDLOCAL
