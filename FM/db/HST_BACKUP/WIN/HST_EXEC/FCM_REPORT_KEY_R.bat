pushd "%~dp0"
call ..\mc_export.bat FCM_REPORT_KEY_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

