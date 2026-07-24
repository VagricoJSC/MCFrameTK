pushd "%~dp0"
call ..\mc_export.bat FCT_EXCLD_GRPS_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

