@echo off
@setlocal

@set RET=0

pushd "%~dp0"

set TABLE_NAME=%1
set DUMP_FILE=%2
set F=%~n2
set T=%~x2
set MCF_DUMP_DIR=%3
set LOG_NAME=%4
set POS_DB_USER=%5
set POS_DB_PASSWD=%6
set POS_DB_HOST=%7
set POS_DB_PORT=%8
set POS_DB_NAME=%9
shift
set POS_DB_SCHEMA=%9

set HEADER_DUMP_FILE=%F%_HEADER%T%
set IMPORT_DUMP_NAME=%MCF_DUMP_DIR%/%DUMP_FILE%
set IMPORT_HEADER_DUMP_NAME=%MCF_DUMP_DIR%/%HEADER_DUMP_FILE%
set PGPASSWORD=%POS_DB_PASSWD%

@REM IMPORT
ECHO IMPORT START %DUMP_FILE% %date% %time% ============ >> .\log\%LOG_NAME%
psql -h %POS_DB_HOST% -p %POS_DB_PORT% -U %POS_DB_USER% -d %POS_DB_NAME% -c "\COPY %TABLE_NAME% from '%IMPORT_DUMP_NAME%' (format binary)" >> .\log\%LOG_NAME% 2>&1
set RET=%errorlevel%
if NOT %RET%==0 goto FIN

if %TABLE_NAME%==FCT_OPRHISTORY (goto NO_HEADER) else if %TABLE_NAME%==FCT_HST_LOGIN (goto NO_HEADER)

ECHO IMPORT START %HEADER_DUMP_FILE% %date% %time% ============ >> .\log\%LOG_NAME%
psql -h %POS_DB_HOST% -p %POS_DB_PORT% -U %POS_DB_USER% -d %POS_DB_NAME% -c "\COPY FCT_HST_HEADER from '%IMPORT_HEADER_DUMP_NAME%' (format binary)" >> .\log\%LOG_NAME% 2>&1
set RET=%errorlevel%
if NOT %RET%==0 goto FIN

:NO_HEADER

ECHO IMPORT SUCCESSFUL >> .\log\%LOG_NAME%
ECHO IMPORT END ============ >> .\log\%LOG_NAME%
ECHO.>> .\log\%LOG_NAME%

:FIN
popd
@endlocal
@exit /b %RET%
