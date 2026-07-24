pushd "%~dp0"
call ..\mc_export.bat FCT_PUSHMSG_SCREEN_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

