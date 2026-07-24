pushd "%~dp0"
call ..\mc_export.bat FCT_SRV_REQUEST_FILE_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

