@echo off

pushd "%~dp0"
SET RTN=0

set time2=%time: =0%
rem set TSS=%date:~-10,4%%date:~-5,2%%date:~-2,2%%time2:~0,2%%time2:~3,2%%time2:~6,2%
for /f "usebackq" %%A in (`powershell -NoProfile -Command "Get-Date -Format 'yyyyMMddHHmmss'"`) do set "TSS=%%A"
set DOS_LOG_NAME=ALL_DUMP_%TSS%.log


call .\FCT_NOTICE_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_SYSTS_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_SYSTS_CO_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_REPORT_KEY_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_REPORT_CONF_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_SQLTRACE_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_SRV_REQUEST_FILE_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_CONST_NM_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_CONST_GRP_NM_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_LOGIN_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_PW_MOD_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_RESOURCE_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_USER_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_GRANTROLE_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_ROLE_ALL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_ROLEITEM_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_LICENSE_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_LICENSEMAP_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_CATALOG_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_SCMAUTH_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MEMO_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_CO_ALL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_GRANT_CO_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_TODAY_ALL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_USER_GRP_ALL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_GRANT_USER_GRP_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_EX_USER_MAP_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_GRANT_MENU_PTN_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_MSG_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_PARA_OPE_CTRL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_PARA_OPE_GRP_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_PARA_OPE_GRP_ITM_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_EXCLD_GRPS_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_RUNNING_GRPS_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_SERV_STS_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_SERV_STS_MSG_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_GRANT_SERV_STS_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_SERV_STS_CTRL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_EX_CTRL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_REF_TIME_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_SERVER_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_HISTORY_TABLE_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_SEARCHCONDITION_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MENU_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MENU_ARGS_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MENU_NM_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MENU_PTN_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MENU_PTN_INFO_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_PUSHMSG_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_PUSHMSG_SCREEN_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_PUSHMSG_SEND_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_PUSHMSG_SETTING_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MINING_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MINING_CONDITION_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MINING_METHOD_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MINING_SUMCOND_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MINING_TASK_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MINING_TASK_PARAM_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_MINING_TASK_SCHE_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_MINING_TASK_LOG_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_MINING_GADGET_CACHE_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_ROLE_LCL_ALL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_CO_LCL_ALL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_USER_GRP_LCL_ALL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_GP_BATCH_GRP_LCL_ALL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_GP_BATCH_ALL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_GP_BATCH_ARGS_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCM_GP_BATCH_GRP_ALL_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCC_AVAIL_GP_BATCH_R.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_OPRHISTORY.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%

call .\FCT_HST_LOGIN.bat
set TEMP=%errorlevel%
if NOT %TEMP%==0 SET RTN=%TEMP%


popd
@exit %RTN%

