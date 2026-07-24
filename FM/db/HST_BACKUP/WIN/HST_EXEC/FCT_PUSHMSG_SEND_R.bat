pushd "%~dp0"
call ..\mc_export.bat FCT_PUSHMSG_SEND_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

