set MSG=%~dp0stderr.log

set CMD_ARG01=%1
set CMD_ARG02=%2
set CMD_ARG03=%3
set CMD_ARG04=%4
set CMD_ARG05=%5
set CMD_ARG06=%6
set CMD_ARG07=%7
set CMD_ARG08=%8
set OBJECT_NAME=%9
shift
set VTB_NAME=%9
shift
set IMP_CONDITION=%9
shift
set KEY_VTB_NAME=%9
shift
set DEL_CONDITION=%9
shift
set KEY_DEL_CONDITION=%9

pushd %CMD_ARG01%
call dwtab_import %CMD_ARG02% %CMD_ARG03% %CMD_ARG04% %CMD_ARG05% %CMD_ARG06% "MCFCT_KEY" %CMD_ARG07% %KEY_VTB_NAME% "" %IMP_CONDITION% 1 2 0 >%MSG%
if %errorlevel% neq 0 goto end
call dwtab_delete %CMD_ARG02% %CMD_ARG03% %CMD_ARG04% %CMD_ARG05% %CMD_ARG06% %OBJECT_NAME% %DEL_CONDITION% >%MSG%
if %errorlevel% neq 0 goto end
call dwtab_delete %CMD_ARG02% %CMD_ARG03% %CMD_ARG04% %CMD_ARG05% %CMD_ARG06% "MCFCT_KEY" %KEY_DEL_CONDITION% >%MSG%
if %errorlevel% neq 0 goto end
call dwtab_import %CMD_ARG02% %CMD_ARG03% %CMD_ARG04% %CMD_ARG05% %CMD_ARG06% %OBJECT_NAME% %CMD_ARG07% %VTB_NAME% "" %IMP_CONDITION% 1 %CMD_ARG08% 0 >%MSG%
:end
set cmderrlvl=%errorlevel%
if %cmderrlvl% neq 0 if exist %MSG% type %MSG% 1>&2
del /q %MSG% 2>nul
popd

exit /b %cmderrlvl%
