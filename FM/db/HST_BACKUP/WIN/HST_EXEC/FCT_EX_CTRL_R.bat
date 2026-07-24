pushd "%~dp0"
call ..\mc_export.bat FCT_EX_CTRL_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

