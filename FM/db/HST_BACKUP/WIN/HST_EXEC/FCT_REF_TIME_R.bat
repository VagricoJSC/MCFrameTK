pushd "%~dp0"
call ..\mc_export.bat FCT_REF_TIME_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

