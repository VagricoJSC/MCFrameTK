setlocal

PUSHD %1
set MRPEA_HOME=%~dp0
set BIN_DIR=%MRPEA_HOME%\win64

set PROC_TYP=%2
set PROC_CNT=%3
set WG_CD=%4
set PROC_CO=%5
set PROC_USR=%6
set PROC_SCREEN_ID=%7
set PROC_SRV_REQ_NO=%8
set MRP_LANG=%9
shift
set SCHD_DT_FR=%9
shift
set DSHOYO_DT_FR=%9
shift
set SIM_MRP_NO=%9
shift
set SIM_TYP=%9
shift
set BATCH_GRP_CD=%9

shift
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


if "%PROC_TYP%" == "1"	goto :N
if "%PROC_TYP%" == "2"	goto :P
if "%PROC_TYP%" == "3"	goto :I
:N
set ORD_GNRT_TYP=1
set P=
goto :nxt
:P
set ORD_GNRT_TYP=3
set P=P
goto :nxt
:I
set ORD_GNRT_TYP=4
set P=I
goto :nxt
:nxt

set MRP_DATA_HOME=%MRPEA_HOME%\%PROC_TYP%\%PROC_CO%\%WG_CD%
set DATA_DIR=%MRP_DATA_HOME%\in
set OUT_DIR=%MRP_DATA_HOME%\out
if not exist %DATA_DIR%	mkdir %DATA_DIR%
if not exist %OUT_DIR%	mkdir %OUT_DIR%

set LOG_FILE=%OUT_DIR%\MRPea.log
if exist %LOG_FILE%		del %LOG_FILE%

set INI_FILE=%MRPEA_HOME%\MRPea.ini
set DBUTIL_INI=%INI_FILE%
set INI_FILE_COMM=#
set ENV_SECTION=MRPEA
set MSG_FILE=%MRPEA_HOME%\msg\%MRP_LANG%\err_msg.dat,%MCF_HOME%\dbutil\msg\%MRP_LANG%\err_dbutil.dat

set MRPEA_EXEC=%BIN_DIR%\mrp -u

if "%IS_ORACLE%"=="true" set DATABASE=Oracle
if "%IS_POSTGRESQL%"=="true" set DATABASE=PostgreSQL
set DB_LOAD_RIGID=1
set UNLOAD_TIMESTAMP_FORMAT=yyyyMMddHHmmss

set VM_OPT=-Xmx1024m

call %MCF_HOME%\dbutil\mooDBUtil.bat %MRPEA_HOME%\MRPea.sql

POPD
endlocal
exit errorlevel
