@ECHO OFF
@SETLOCAL

SET DBHOME=%~dp0..\db
SET SETUP_HOME=%~dp0..
SET MCDB=ora
SET DBUTIL_HOME=%~dp0..\dbutil
SET MOO_DBUTIL=%SETUP_HOME%\bin\mooDBUtil.bat

call %~dp0\schemaEnv.cmd 

set EXECTYPE=SETUP
set AUTOCOMMIT=true

PUSHD "%DBHOME%"

IF EXIST .\log\mkms ( RMDIR /S /Q .\log\mkms )
MKDIR .\log\mkms
MKDIR .\log\mkms\sql

IF EXIST .\log\mkmsba ( RMDIR /S /Q .\log\mkmsba )
MKDIR .\log\mkmsba
MKDIR .\log\mkmsba\sql

IF EXIST .\log\mkmsbb ( RMDIR /S /Q .\log\mkmsbb )
MKDIR .\log\mkmsbb
MKDIR .\log\mkmsbb\sql

IF EXIST .\log\mkmsbc ( RMDIR /S /Q .\log\mkmsbc )
MKDIR .\log\mkmsbc
MKDIR .\log\mkmsbc\sql

IF EXIST .\log\mkmsbd ( RMDIR /S /Q .\log\mkmsbd )
MKDIR .\log\mkmsbd
MKDIR .\log\mkmsbd\sql

IF EXIST .\log\mkmsbe ( RMDIR /S /Q .\log\mkmsbe )
MKDIR .\log\mkmsbe
MKDIR .\log\mkmsbe\sql

IF EXIST .\log\mkmsbf ( RMDIR /S /Q .\log\mkmsbf )
MKDIR .\log\mkmsbf
MKDIR .\log\mkmsbf\sql

IF EXIST .\log\mkmsbg ( RMDIR /S /Q .\log\mkmsbg )
MKDIR .\log\mkmsbg
MKDIR .\log\mkmsbg\sql

IF EXIST .\log\mkmsbh ( RMDIR /S /Q .\log\mkmsbh )
MKDIR .\log\mkmsbh
MKDIR .\log\mkmsbh\sql

IF EXIST .\log\mkmsbi ( RMDIR /S /Q .\log\mkmsbi )
MKDIR .\log\mkmsbi
MKDIR .\log\mkmsbi\sql

IF EXIST .\log\mkmsla ( RMDIR /S /Q .\log\mkmsla )
MKDIR .\log\mkmsla
MKDIR .\log\mkmsla\sql

IF EXIST .\log\mkmslb ( RMDIR /S /Q .\log\mkmslb )
MKDIR .\log\mkmslb
MKDIR .\log\mkmslb\sql

IF EXIST .\log\mkmsua ( RMDIR /S /Q .\log\mkmsua )
MKDIR .\log\mkmsua
MKDIR .\log\mkmsua\sql

set NLS_LANG=American_america.AL32UTF8

@echo MS database objects (log: .\log\mkms\mkms .log)
pushd .\ora\mkms\make\
set SQLFILE_HOME=%DBHOME%\log\mkms\sql
set LOG_FILE=%DBHOME%\log\mkms\mkms.log
call %MOO_DBUTIL% %DBHOME%\ora\mkms\make\makeAll.json
popd

@echo MSBA database objects (log: .\log\mkmsba\mkmsba .log)
pushd .\ora\mkmsba\make\
set SQLFILE_HOME=%DBHOME%\log\mkmsba\sql
set LOG_FILE=%DBHOME%\log\mkmsba\mkmsba.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmsba\make\makeAll.json
popd

@REM MSBE-MSBB-MSBD-MSBF-MSBC
@echo MSBE database objects (log: .\log\mkmsbe\mkmsbe .log)
pushd .\ora\mkmsbe\make\
set SQLFILE_HOME=%DBHOME%\log\mkmsbe\sql
set LOG_FILE=%DBHOME%\log\mkmsbe\mkmsbe.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmsbe\make\makeAll.json
popd

@echo MSBB database objects (log: .\log\mkmsbb\mkmsbb .log)
pushd .\ora\mkmsbb\make\
set SQLFILE_HOME=%DBHOME%\log\mkmsbb\sql
set LOG_FILE=%DBHOME%\log\mkmsbb\mkmsbb.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmsbb\make\makeAll.json
popd

@echo MSBD database objects (log: .\log\mkmsbd\mkmsbd .log)
pushd .\ora\mkmsbd\make\
set SQLFILE_HOME=%DBHOME%\log\mkmsbd\sql
set LOG_FILE=%DBHOME%\log\mkmsbd\mkmsbd.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmsbd\make\makeAll.json
popd

@echo MSBF database objects (log: .\log\mkmsbf\mkmsbf .log)
pushd .\ora\mkmsbf\make\
set SQLFILE_HOME=%DBHOME%\log\mkmsbf\sql
set LOG_FILE=%DBHOME%\log\mkmsbf\mkmsbf.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmsbf\make\makeAll.json
popd

@echo MSBC database objects (log: .\log\mkmsbc\mkmsbc .log)
pushd .\ora\mkmsbc\make\
set SQLFILE_HOME=%DBHOME%\log\mkmsbc\sql
set LOG_FILE=%DBHOME%\log\mkmsbc\mkmsbc.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmsbc\make\makeAll.json
popd

@echo MSBG database objects (log: .\log\mkmsbg\mkmsbg .log)
pushd .\ora\mkmsbg\make\
set SQLFILE_HOME=%DBHOME%\log\mkmsbg\sql
set LOG_FILE=%DBHOME%\log\mkmsbg\mkmsbg.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmsbg\make\makeAll.json
popd

@echo MSBH database objects (log: .\log\mkmsbh\mkmsbh .log)
pushd .\ora\mkmsbh\make\
set SQLFILE_HOME=%DBHOME%\log\mkmsbh\sql
set LOG_FILE=%DBHOME%\log\mkmsbh\mkmsbh.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmsbh\make\makeAll.json
popd

@echo MSBI database objects (log: .\log\mkmsbi\mkmsbi .log)
pushd .\ora\mkmsbi\make\
set SQLFILE_HOME=%DBHOME%\log\mkmsbi\sql
set LOG_FILE=%DBHOME%\log\mkmsbi\mkmsbi.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmsbi\make\makeAll.json
popd

rem @echo MSLA database objects (log: .\log\mkmsla\mkmsla .log)
rem pushd .\ora\mkmsla\make\
rem set SQLFILE_HOME=%DBHOME%\log\mkmsla\sql
rem set LOG_FILE="%DBHOME%\log\mkmsla\mkmsla.log"
rem call %MOO_DBUTIL% %DBHOME%\ora\mkmsla\make\makeAll.json
rem popd

rem @echo MSLB database objects (log: .\log\mkmslb\mkmslb .log)
rem pushd .\ora\mkmslb\make\
rem set SQLFILE_HOME=%DBHOME%\log\mkmslb\sql
rem set LOG_FILE="%DBHOME%\log\mkmslb\mkmslb.log"
rem call %MOO_DBUTIL% %DBHOME%\ora\mkmslb\make\makeAll.json
rem popd

@echo MSLC database objects (log: .\log\mkmslc\mkmslc .log)
pushd .\ora\mkmslc\make\
set SQLFILE_HOME=%DBHOME%\log\mkmslc\sql
set LOG_FILE=%DBHOME%\log\mkmslc\mkmslc.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmslc\make\makeAll.json
popd

@echo MSUA database objects (log: .\log\mkmsua\mkmsua .log)
pushd .\ora\mkmsua\make\
set SQLFILE_HOME=%DBHOME%\log\mkmsua\sql
set LOG_FILE=%DBHOME%\log\mkmsua\mkmsua.log
call %MOO_DBUTIL% %DBHOME%\ora\mkmsua\make\makeAll.json
popd

@echo patch version (log: .\log\ins_pver_MS .log)
pushd ..\bin\patch\
call ins_pver_MS.bat
popd

POPD
:FIN
@ENDLOCAL
