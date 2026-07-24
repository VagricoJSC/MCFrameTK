pushd "%~dp0"
call ..\mc_export.bat FCM_USER_GRP_ALL_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

