pushd "%~dp0"
call ..\mc_export.bat FCM_MENU_NM_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

