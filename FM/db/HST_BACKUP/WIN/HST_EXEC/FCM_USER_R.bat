pushd "%~dp0"
call ..\mc_export.bat FCM_USER_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

