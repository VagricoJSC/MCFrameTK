pushd "%~dp0"
call ..\mc_export.bat FCM_HISTORY_TABLE_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

