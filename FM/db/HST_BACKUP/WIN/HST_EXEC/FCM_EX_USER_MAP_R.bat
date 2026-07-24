pushd "%~dp0"
call ..\mc_export.bat FCM_EX_USER_MAP_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

