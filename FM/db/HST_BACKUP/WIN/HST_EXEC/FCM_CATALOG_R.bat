pushd "%~dp0"
call ..\mc_export.bat FCM_CATALOG_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

