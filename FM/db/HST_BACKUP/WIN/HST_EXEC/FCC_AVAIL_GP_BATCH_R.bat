pushd "%~dp0"
call ..\mc_export.bat FCC_AVAIL_GP_BATCH_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

