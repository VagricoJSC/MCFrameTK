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

pushd %CMD_ARG01%
call dwtab_import %CMD_ARG02% %CMD_ARG03% %CMD_ARG04% %CMD_ARG05% %CMD_ARG06% %OBJECT_NAME% %CMD_ARG07% %VTB_NAME% "" %IMP_CONDITION% 1 %CMD_ARG08% 0 >&2
popd

exit /b %errorlevel%
