@ECHO OFF

IF NOT EXIST %1 goto FIN

IF %2.==. goto noparam

FOR /F "eol=# tokens=1,2 delims==" %%A IN (%1) DO @IF NOT %%A.==. IF %%A==%2 IF NOT %%B.==. (
	set %%A=%%B
	echo %%A=%%B
	)

goto FIN

:noparam 
FOR /F "eol=# tokens=1,2 delims==" %%A IN (%1) DO @IF NOT %%A.==. IF NOT %%B.==. (
	set %%A=%%B
	echo %%A=%%B
	)

:FIN