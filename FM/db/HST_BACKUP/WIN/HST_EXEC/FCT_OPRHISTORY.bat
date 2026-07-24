pushd "%~dp0"
call ..\mc_export.bat FCT_OPRHISTORY
set RTN=%errorlevel%
popd
@exit /B %RTN%

