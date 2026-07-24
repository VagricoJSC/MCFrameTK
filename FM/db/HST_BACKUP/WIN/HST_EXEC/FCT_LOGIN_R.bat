pushd "%~dp0"
call ..\mc_export.bat FCT_LOGIN_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

