@echo off
@setlocal

pushd "%~dp0/DDL"

set DATABASE=%FMC_DATABASE%
set DB_USER=%FMC_DB_USER%
set DB_PASS=%FMC_DB_PASSWORD%
set JDBC=%FMC_JDBC%
set EXECTYPE=SETUP
set AUTOCOMMIT=true
set VIA_SETUP_BAT=1
set MOO_DBUTIL=%SETUP_HOME%\bin\mooDBUtil.bat
set COMM_DB_DIR=%SETUP_HOME%\communication\db

IF %FMC_DATABASE%==oracle (
    set DATABASE=Oracle
    set ORA_DB_USER=%FMC_DB_USER%
    set ORA_DB_PASSWD=%FMC_DB_PASSWORD%
    set ORA_DB_HOST=%FMC_DB_HOST%
    set ORA_DB_PORT=%FMC_DB_PORT%
    set ORA_DB_SID=%FMC_DB_SID%
) ELSE IF %FMC_DATABASE%==postgresql (
    set DATABASE=PostgreSQL
    set POS_DB_USER=%FMC_DB_USER%
    set POS_DB_PASSWD=%FMC_DB_PASSWORD%
    set POS_DB_HOST=%FMC_DB_HOST%
    set POS_DB_PORT=%FMC_DB_PORT%
    set POS_DB_NAME=%FMC_DB_NAME%
    set POS_DB_SCHEMA=%FMC_DB_SCHEMA%
)

set NLS_LANG=American_america.AL32UTF8
IF NOT EXIST "%COMM_DB_DIR%\log" MKDIR "%COMM_DB_DIR%\log"

@ECHO Create mcframe Objects to %DATABASE% %FMC_DB_USER% %FMC_DB_HOST% %FMC_DB_PORT%
set SQLFILE_HOME=%COMM_DB_DIR%\log\sql
set LOG_FILE=%COMM_DB_DIR%\log\mkaw.log
CALL %MOO_DBUTIL% %COMM_DB_DIR%\DDL\mkaw.json
echo.

popd
@endlocal

