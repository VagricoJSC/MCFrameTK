set MSG=%~dp0stderr.log

set CMD_ARG01=%1
set CMD_ARG02=%2
set CMD_ARG03=%3
set CMD_ARG04=%4
set CMD_ARG05=%5
set CMD_ARG06=%6
set CMD_ARG07=%7
set CMD_ARG08=%~8
set OBJECT_NAME=%9
shift
set VTB_NAME=%9
shift
set IMP_CONDITION=%9

pushd %CMD_ARG01%
call dwtab_import %CMD_ARG02% %CMD_ARG03% %CMD_ARG04% %CMD_ARG05% %CMD_ARG06% %OBJECT_NAME% %CMD_ARG07% %VTB_NAME% "" %IMP_CONDITION% 1 1 0 >%MSG%
if %errorlevel% neq 0 goto end

if %CMD_ARG08% equ 2 (
 call dwtab_export_table %CMD_ARG02% %CMD_ARG03% %CMD_ARG04% %CMD_ARG05% %CMD_ARG06% "SELECT * FROM %OBJECT_NAME%" %CMD_ARG06% %OBJECT_NAME:_IF=% 1 2 >%MSG%
) else (
 call dwscr_execute %CMD_ARG02% %CMD_ARG03% %CMD_ARG04% %CMD_ARG05% "SCRIPT_ROOT/imp_mst_data.dhn" "" "$VAR_DB_NM" %CMD_ARG06% "$VAR_IF_TBL_NM" %OBJECT_NAME% "$VAR_TBL_NM" %OBJECT_NAME:_IF=% >%MSG%
)
:end
set cmderrlvl=%errorlevel%
if %cmderrlvl% neq 0 if exist %MSG% type %MSG% 1>&2
del /q %MSG% 2>nul
popd

exit /b %cmderrlvl%
