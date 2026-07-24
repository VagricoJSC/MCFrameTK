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

IF EXIST .\log\mkpf ( RMDIR /S /Q .\log\mkpf )
MKDIR .\log\mkpf
MKDIR .\log\mkpf\sql

set NLS_LANG=American_america.AL32UTF8

@echo PF database objects (log: .\log\mkpf\mkpf.log)
pushd .\ora\mkpf\make\
set SQLFILE_HOME=%DBHOME%\log\mkpf\sql
set LOG_FILE=%DBHOME%\log\mkpf\mkpf.log
call %MOO_DBUTIL% %DBHOME%\ora\mkpf\make\makeAll.json %DBHOME%\log\mkpf\sql
popd

@echo patch version (log: .\log\ins_pver_PF.log)
pushd ..\bin\patch\
call ins_pver_PF.bat
popd

POPD
:FIN
@ENDLOCAL
