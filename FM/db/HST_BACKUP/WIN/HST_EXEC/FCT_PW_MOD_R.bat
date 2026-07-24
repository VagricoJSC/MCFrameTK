pushd "%~dp0"
call ..\mc_export.bat FCT_PW_MOD_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

