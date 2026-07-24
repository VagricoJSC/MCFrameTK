@echo off
@setlocal

@set RET=0

pushd "%~dp0"

set DUMP_FILE=%1
set MCF_DUMP_DIR=%2
set LOG_NAME=%3
set ORA_DB_USER=%4
set ORA_DB_PASSWD=%5
set ORA_DB_SID=%6

@REM execute:IMPORT
IMPDP %ORA_DB_USER%/%ORA_DB_PASSWD%@%ORA_DB_SID% DIRECTORY=%MCF_DUMP_DIR% DUMPFILE=%DUMP_FILE% LOGFILE=%LOG_NAME% CONTENT=DATA_ONLY
set RET=%errorlevel%

popd
@endlocal
@exit /b %RET%
