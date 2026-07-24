pushd "%~dp0"
call ..\mc_export.bat FCM_REPORT_CONF_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

