pushd "%~dp0"
call ..\mc_export.bat FCM_GRANT_MENU_PTN_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

