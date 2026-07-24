pushd "%~dp0"
call ..\mc_export.bat FCM_PARA_OPE_GRP_R
set RTN=%errorlevel%
popd
@exit /B %RTN%

