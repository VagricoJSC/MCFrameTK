pushd "%~dp0"
call ..\mc_export.bat FCM_MINING_TASK_PARAM_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

