pushd "%~dp0"
call ..\mc_export.bat FCM_PUSHMSG_SETTING_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

