@echo off
@setlocal

@set RET=0

pushd "%~dp0"

IF NOT EXIST .\log MKDIR .\log

@REM target table
if %1.==. GOTO ERR_EXIT_1
set DUMP_TABLE=%1

@REM load env
call .\mc_db_env.cmd

@REM date
set time2=%time: =0%
rem set TSS=%date:~-10,4%%date:~-5,2%%date:~-2,2%%time2:~0,2%%time2:~3,2%%time2:~6,2%
for /f "usebackq" %%A in (`powershell -NoProfile -Command "Get-Date -Format 'yyyyMMddHHmmss'"`) do set "TSS=%%A"

set DUMP_NAME=%DUMP_TABLE%_%TSS%.dmp
set LOG_NAME=EXP_%DUMP_TABLE%_%TSS%.log

if %DOS_LOG_NAME%.==. set DOS_LOG_NAME=%DUMP_TABLE%_%TSS%.log

ECHO.>> .\log\%DOS_LOG_NAME%

@REM execute:EXPORT
IF %DATABASE%==Oracle (
	@REM Oracle
	call mc_export_oracle.bat %DUMP_TABLE% %DOS_LOG_NAME% %TSS% %FMC_DB_DUMP_DIR% %ORA_DB_USER% %ORA_DB_PASSWD% %ORA_DB_SID%

) ELSE IF %DATABASE%==PostgreSQL (
	@REM PostgreSQL
	call mc_export_postgres.bat %DUMP_TABLE% %DOS_LOG_NAME% %TSS% %FMC_DB_DUMP_DIR% %POS_DB_USER% %POS_DB_PASSWD% %POS_DB_HOST% %POS_DB_PORT% %POS_DB_NAME% %POS_DB_SCHEMA%

)
set RTN=%errorlevel%
goto FIN

:ERR_EXIT_1
set RET=100
echo error:target table >> .\log\mc_export_err.log
goto FIN

:FIN
popd
@endlocal
@exit /B %RET
