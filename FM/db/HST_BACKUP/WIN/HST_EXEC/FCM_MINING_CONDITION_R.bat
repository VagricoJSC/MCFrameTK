pushd "%~dp0"
call ..\mc_export.bat FCM_MINING_CONDITION_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

