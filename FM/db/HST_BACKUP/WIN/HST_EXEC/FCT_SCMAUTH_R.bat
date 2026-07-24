pushd "%~dp0"
call ..\mc_export.bat FCT_SCMAUTH_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

