pushd "%~dp0"
call ..\mc_export.bat FCM_GRANT_USER_GRP_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

