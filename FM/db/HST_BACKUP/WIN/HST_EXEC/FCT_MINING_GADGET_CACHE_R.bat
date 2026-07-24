pushd "%~dp0"
call ..\mc_export.bat FCT_MINING_GADGET_CACHE_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

