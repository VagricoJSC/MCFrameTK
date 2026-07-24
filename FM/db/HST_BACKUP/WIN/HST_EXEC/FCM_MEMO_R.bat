pushd "%~dp0"
call ..\mc_export.bat FCM_MEMO_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

