pushd "%~dp0"
call ..\mc_export.bat FCM_CO_LCL_ALL_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

