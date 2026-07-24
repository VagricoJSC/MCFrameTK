@setlocal

set CUR=%~d0%~p0
set FM_HOME=%CUR%..\..\..\..\..\FM

cscript %FM_HOME%\bin\xlsScrInit.vbs  %FM_HOME%\tools\listLogic\listLogicVba.xlsm %CUR%listLogicSetting.xlsx

@endlocal
