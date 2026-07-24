pushd "%~dp0"
call ..\mc_export.bat FCM_GRANTROLE_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

