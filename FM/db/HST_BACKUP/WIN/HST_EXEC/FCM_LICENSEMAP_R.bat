pushd "%~dp0"
call ..\mc_export.bat FCM_LICENSEMAP_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

