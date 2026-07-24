pushd "%~dp0"
call ..\mc_export.bat FCT_RUNNING_GRPS_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

