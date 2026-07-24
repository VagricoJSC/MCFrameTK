pushd "%~dp0"
call ..\mc_export.bat FCM_LICENSE_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

