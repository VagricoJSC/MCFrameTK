pushd "%~dp0"
call ..\mc_export.bat FCT_MINING_TASK_LOG_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

