pushd "%~dp0"
call ..\mc_export.bat FCT_SERV_STS_CTRL_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

