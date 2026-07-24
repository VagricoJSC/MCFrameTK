@echo off
@setlocal 

@set RET=0

pushd "%~dp0"

set DUMP_TABLE=%1
set DOS_LOG_NAME=%2
set TSS=%3
set MCF_DUMP_DIR=%4
set POS_DB_USER=%5
set POS_DB_PASSWD=%6
set POS_DB_HOST=%7
set POS_DB_PORT=%8
set POS_DB_NAME=%9
set POS_DB_SCHEMA=%10

set DUMP_NAME=%MCF_DUMP_DIR%/%DUMP_TABLE%_%TSS%.dmp
set HEADER_DUMP_NAME=%MCF_DUMP_DIR%/%DUMP_TABLE%_%TSS%_HEADER.dmp
set PGPASSWORD=%POS_DB_PASSWD%

@REM EXPORT Target Table
ECHO EXPORT START %DUMP_TABLE% %date% %time% ============ >> .\log\%DOS_LOG_NAME%
if %DUMP_TABLE%==FCT_HST_LOGIN ( 
	psql -h %POS_DB_HOST% -p %POS_DB_PORT% -U %POS_DB_USER% -d %POS_DB_NAME% -c "\COPY (select * from %DUMP_TABLE% where hst_tm < fcpa_historybackup$f_hst_dump_ts('%DUMP_TABLE%')) to '%DUMP_NAME%' (format binary)" >> .\log\%DOS_LOG_NAME% 2>&1
) else if %DUMP_TABLE%==FCT_OPRHISTORY ( 
	psql -h %POS_DB_HOST% -p %POS_DB_PORT% -U %POS_DB_USER% -d %POS_DB_NAME% -c "\COPY (select * from %DUMP_TABLE% where access_ts < fcpa_historybackup$f_hst_dump_ts('%DUMP_TABLE%')) to '%DUMP_NAME%' (format binary)" >> .\log\%DOS_LOG_NAME% 2>&1
) else ( 
	psql -h %POS_DB_HOST% -p %POS_DB_PORT% -U %POS_DB_USER% -d %POS_DB_NAME% -c "\COPY (select * from %DUMP_TABLE% where hst_id in (select hst_id from fct_hst_header where hst_time < fcpa_historybackup$f_hst_dump_ts('%DUMP_TABLE%'))) to '%DUMP_NAME%' (format binary)" >> .\log\%DOS_LOG_NAME% 2>&1
)

set RET=%errorlevel%
if NOT %RET%==0 (goto ERR_EXIT_2) else (ECHO EXPORT FILE %DUMP_NAME% >> .\log\%DOS_LOG_NAME%)

if %DUMP_TABLE%==FCT_OPRHISTORY (goto NO_HEADER) else if %DUMP_TABLE%==FCT_HST_LOGIN (goto NO_HEADER)

@REM EXPORT FCT_HST_HEADER
ECHO EXPORT START FCT_HST_HEADER %date% %time% ============ >> .\log\%DOS_LOG_NAME%
psql -h %POS_DB_HOST% -p %POS_DB_PORT% -U %POS_DB_USER% -d %POS_DB_NAME% -c "\COPY (select * from fct_hst_header where hst_id in (select hst_id from %DUMP_TABLE% where hst_id in (select hst_id from fct_hst_header where hst_time < fcpa_historybackup$f_hst_dump_ts('%DUMP_TABLE%')))) to '%HEADER_DUMP_NAME%' (format binary)" >> .\log\%DOS_LOG_NAME% 2>&1
set RET=%errorlevel%
if NOT %RET%==0 (goto ERR_EXIT_2) else (ECHO EXPORT FILE %HEADER_DUMP_NAME% >> .\log\%DOS_LOG_NAME%)

:NO_HEADER

ECHO EXPORT SUCCESSFUL >> .\log\%DOS_LOG_NAME%
ECHO EXPORT END =================================================== >> .\log\%DOS_LOG_NAME%
ECHO.>> .\log\%DOS_LOG_NAME%

@REM DELETE Target Table
ECHO DATA DELETE START %DUMP_TABLE% ============================== >> .\log\%DOS_LOG_NAME%
psql -h %POS_DB_HOST% -p %POS_DB_PORT% -U %POS_DB_USER% -d %POS_DB_NAME% -f mc_export_del_postgres.sql -v table=%DUMP_TABLE% >> .\log\%DOS_LOG_NAME% 2>&1
set RET=%errorlevel%
if NOT %RET%==0 goto ERR_EXIT_3

ECHO DATA DELETE END %date% %time% ==================== >> .\log\%DOS_LOG_NAME%
ECHO.>> .\log\%DOS_LOG_NAME%

goto FIN

:ERR_EXIT_2
echo error:EXPORT TABLE=%DUMP_TABLE% RTN=%RET% >> .\log\%DOS_LOG_NAME%
ECHO EXPORT END =================================================== >> .\log\%DOS_LOG_NAME%
goto FIN

:ERR_EXIT_3
echo error:delete TABLE=%DUMP_TABLE% RTN=%RET% >> .\log\%DOS_LOG_NAME%
ECHO DATA DELETE END ============================================= >> .\log\%DOS_LOG_NAME%
goto FIN

:FIN
popd
@endlocal
@exit /B %RET
