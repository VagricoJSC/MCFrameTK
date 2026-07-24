pushd "%~dp0"
call ..\mc_export.bat FCM_SERV_STS_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

