pushd "%~dp0"
call ..\mc_export.bat FCT_HST_LOGIN
set RTN=%errorlevel%
popd
@exit /B %RTN%

