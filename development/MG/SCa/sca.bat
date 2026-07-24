setlocal

PUSHD %1
set SCA_HOME=%~dp0
set BIN_DIR=%SCA_HOME%\win64

set SCA_CO=%2
set SCA_USER=%3
set SCA_LANG=%4
set SCA_CALC_GRP_CD=%5
set SCA_CALC_NO=%6
set /a SCA_CALC_CNT=%7+1
set SCA_CALC_CNT_TOTAL=%8

set ORA_DB_USER=%9
set POS_DB_USER=%9
shift
set ORA_DB_PASSWD=%9
set POS_DB_PASSWD=%9
shift
set ORA_DB_HOST=%9
set POS_DB_HOST=%9
shift
set ORA_DB_PORT=%9
set POS_DB_PORT=%9
shift
set POS_DB_NAME=%9
shift
set POS_DB_SCHEMA=%9
shift
set ORA_DB_SID=%9
shift
set MCF_HOME=%9
shift
set IS_ORACLE=%9
shift
set IS_POSTGRESQL=%9


set SCA_DATA_HOME=%SCA_HOME%\data\%SCA_CO%\%SCA_USER%\%SCA_CALC_GRP_CD%
set DATA_DIR=%SCA_DATA_HOME%\in
set OUT_DIR=%SCA_DATA_HOME%\out
if not exist %DATA_DIR% mkdir %DATA_DIR%
if not exist %OUT_DIR% mkdir %OUT_DIR%

set LOG_FILE=%OUT_DIR%\sca_log.dat
set LOG_FILE_APPEND=1
if not exist %LOG_FILE% goto :log_skip
if "%SCA_CALC_CNT%"=="1"  del %LOG_FILE%
:log_skip

set INI_FILE=%SCA_HOME%\sca.ini
set DBUTIL_INI=%INI_FILE%
set INI_FILE_COMM=#
set ENV_SECTION=SCA
set MSG_FILE=%SCA_HOME%\msg\%SCA_LANG%\err_msg.dat,%MCF_HOME%\dbutil\msg\%SCA_LANG%\err_dbutil.dat

set SCA_EXEC=%BIN_DIR%\sca -u

if "%IS_ORACLE%"=="true" set DATABASE=Oracle
if "%IS_POSTGRESQL%"=="true" set DATABASE=PostgreSQL
set DB_LOAD_RIGID=1
set UNLOAD_TIMESTAMP_FORMAT=yyyyMMdd

set VM_OPT=-Xmx1024m

call %MCF_HOME%\dbutil\mooDBUtil.bat %SCA_HOME%\SCa.sql

POPD
endlocal
exit errorlevel
