@echo off
@setlocal

@set RET=0

pushd "%~dp0"

set DUMP_TABLE=%1
set DOS_LOG_NAME=%2
set TSS=%3
set MCF_DUMP_DIR=%4
set ORA_DB_USER=%5
set ORA_DB_PASSWD=%6
set ORA_DB_SID=%7

set DUMP_NAME=%DUMP_TABLE%_%TSS%.dmp
set LOG_NAME=EXP_%DUMP_TABLE%_%TSS%.log
set PARAM_FILE=.\HST_PAR\%DUMP_TABLE%.par

ECHO EXPDP START %DUMP_TABLE% %date% %time% ============ >> .\log\%DOS_LOG_NAME%
EXPDP %ORA_DB_USER%/%ORA_DB_PASSWD%@%ORA_DB_SID% SCHEMAS=%ORA_DB_USER% DUMPFILE=%DUMP_NAME% LOGFILE=%LOG_NAME% DIRECTORY=%MCF_DUMP_DIR% CONTENT=DATA_ONLY PARFILE=%PARAM_FILE%
set RET=%errorlevel%
if NOT %RET%==0 goto ERR_EXIT_2


ECHO EXPDP SUCCESSFUL >> .\log\%DOS_LOG_NAME%
ECHO EXPDP END =================================================== >> .\log\%DOS_LOG_NAME%
ECHO.>> .\log\%DOS_LOG_NAME%

ECHO DATA DELETE START %DUMP_TABLE% ============================== >> .\log\%DOS_LOG_NAME%
sqlplus /nolog @mc_export_del_oracle.sql %ORA_DB_USER% %ORA_DB_PASSWD% %ORA_DB_SID% %DUMP_TABLE% .\log\DEL_SPOOL.log
set RET=%errorlevel%
if NOT %RET%==0 goto ERR_EXIT_3

TYPE .\log\DEL_SPOOL.log >> .\log\%DOS_LOG_NAME%
ECHO DATA DELETE END  %date% %time% ==================== >> .\log\%DOS_LOG_NAME%
ECHO.>> .\log\%DOS_LOG_NAME%

goto FIN

:ERR_EXIT_2
echo error:EXPDP TABLE=%DUMP_TABLE% RTN=%RET% >> .\log\%DOS_LOG_NAME%
ECHO EXPDP END =================================================== >> .\log\%DOS_LOG_NAME%
goto FIN

:ERR_EXIT_3
TYPE .\log\DEL_SPOOL.log >> .\log\%DOS_LOG_NAME%
echo error:delete TABLE=%DUMP_TABLE% RTN=%RET% >> .\log\%DOS_LOG_NAME%
ECHO DATA DELETE END ============================================= >> .\log\%DOS_LOG_NAME%
goto FIN

:FIN
popd
@endlocal
@exit /B %RET
