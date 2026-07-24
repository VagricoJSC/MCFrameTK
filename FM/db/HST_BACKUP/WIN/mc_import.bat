@echo off
@setlocal

@set RET=0

pushd "%~dp0"

IF NOT EXIST .\log MKDIR .\log

@REM target table
if %1.==. GOTO ERR_EXIT_1
set TABLE_NAME=%1

@REM target file
if %2.==. GOTO ERR_EXIT_1
set DUMP_FILE=%2

@REM load env
call .\mc_db_env.cmd

@REM date
set time2=%time: =0%
rem set TSS=%date:~-10,4%%date:~-5,2%%date:~-2,2%%time2:~0,2%%time2:~3,2%%time2:~6,2%
for /f "usebackq" %%A in (`powershell -NoProfile -Command "Get-Date -Format 'yyyyMMddHHmmss'"`) do set "TSS=%%A"

set LOG_NAME=IMP_%DUMP_FILE%_%TSS%.log

@REM execute:IMPORT
IF %DATABASE%==Oracle (
	@REM Oracle
	call mc_import_oracle.bat %DUMP_FILE% %FMC_DB_DUMP_DIR% %LOG_NAME% %ORA_DB_USER% %ORA_DB_PASSWD% %ORA_DB_SID%

) ELSE IF %DATABASE%==PostgreSQL (
	@REM PostgreSQL
	call mc_import_postgres.bat %TABLE_NAME% %DUMP_FILE% %FMC_DB_DUMP_DIR% %LOG_NAME% %POS_DB_USER% %POS_DB_PASSWD% %POS_DB_HOST% %POS_DB_PORT% %POS_DB_NAME% %POS_DB_SCHEMA%
)
set RET=%errorlevel%
if NOT %RET%==0 goto ERR_EXIT_2

goto FIN

:ERR_EXIT_1
set RET=100
echo %date% %time%   error:target file >> .\log\mc_import_err.log
goto FIN

:ERR_EXIT_2
echo %date% %time%   error:IMPORT TABLE=%TABLE_NAME% RTN=%RET% >> .\log\mc_import_err.log
goto FIN

:FIN
popd
@endlocal
@exit /b %RET%
