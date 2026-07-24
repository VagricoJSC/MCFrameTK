@echo off
@setlocal

pushd "%~dp0/mkws"

set MOO_DBUTIL=%SETUP_HOME%\bin\mooDBUtil.bat
set MC_DDL_DIR=%SETUP_HOME%\db\ora\mkws

set EXECTYPE=SETUP
set AUTOCOMMIT=true

@REM execute dbutil
set NLS_LANG=American_america.AL32UTF8
IF NOT EXIST "%SETUP_HOME%\db\log" MKDIR "%SETUP_HOME%\db\log"

@ECHO Create mcframe Objects to %DATABASE% %FMC_DB_USER% %FMC_DB_HOST% %FMC_DB_PORT%
set SQLFILE_HOME=%DBHOME%\log\mkws\sql
set LOG_FILE=%SETUP_HOME%\db\log\mkws.log
CALL %MOO_DBUTIL% %MC_DDL_DIR%\mkws.json
echo.

@ECHO Create mcframe en_US Objects to %DATABASE% %FMC_DB_USER% %FMC_DB_HOST% %FMC_DB_PORT%
set LOG_FILE=%SETUP_HOME%\db\log\mkws_en_US.log
set SQLFILE_HOME=%SQLFILE_HOME%_en_US
CALL %MOO_DBUTIL% %MC_DDL_DIR%\mkws_en_US.json
echo.

popd
pushd "%DBHOME%\patch"
IF EXIST "ins_pver.bat" CALL "ins_pver.bat"

@endlocal

