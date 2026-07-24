@setlocal

set CUR=%~d0%~p0
set FM_HOME=%CUR%..\..\..

cscript %FM_HOME%\bin\xlsScrInit.vbs  %FM_HOME%\tools\msg\msgVba.xlsm %CUR%msgSetting.xlsx

@endlocal
