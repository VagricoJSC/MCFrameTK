@ECHO OFF

PUSHD "%~dp0"

set CUR=%~dp0
set SETENVINI=jdkEnv.ini

IF NOT "%~1".=="". set INIFILE=%1

IF "%INIFILE%".=="". set INIFILE=%SETENVINI%

FOR /F "eol=# tokens=1,2 delims==" %%a in (%INIFILE%) do (
	call :setEnvProperty %%a "%%b"
)
IF "%DIR_NAME%".=="". set DIR_NAME=jre

set JLINK_CMD="%JDK_HOME%\bin\jlink"
set MODULE_PATH="%JDK_HOME%\jmods";"%JAVAFX_HOME%\lib"
set OUTPUT=%CUR%..\%DIR_NAME%
set DEST=%OUTPUT%\bin\javafx\

set ADD_MODULES_DEF=java.base,java.datatransfer,java.desktop,java.logging,java.management,java.naming,java.rmi,java.security.jgss,java.sql,java.xml,java.xml.crypto,jdk.httpserver,jdk.jsobject,jdk.xml.dom,jdk.charsets,jdk.localedata,javafx.base,javafx.controls,javafx.graphics,javafx.web,javafx.swing,jdk.crypto.ec
set ADD_MODULES_DEV=jdk.jdwp.agent,jdk.jdi,java.instrument
set ADD_MODS=%ADD_MODULES_DEF%

IF "%IS_DEV%".=="true". set ADD_MODS=%ADD_MODS%,%ADD_MODULES_DEV%
IF NOT "%ADD_MODULES%".=="". set ADD_MODS=%ADD_MODS%,%ADD_MODULES%

echo JDK creating. > %LOG_FILE%
IF "%IS_BACKUP%".=="true". (
	IF EXIST %OUTPUT% (
		ren %OUTPUT% jre_backup%date:~0,4%%date:~5,2%%date:~8,2%
		echo Backup created. >> %LOG_FILE%
	)
)

%JLINK_CMD% --module-path %MODULE_PATH% --add-modules %ADD_MODS% --output %OUTPUT% >> %LOG_FILE% 2>&1
if %errorlevel% neq 0 (
	echo Failed to create JDK. An error has occurred. [%errorlevel%] >> %LOG_FILE%
) else (
	for %%f in ("%JAVAFX_HOME%\bin\*dll") do (
	    xcopy "%%f" "%DEST%" >> %LOG_FILE%
	)
	echo JDK creation success. >> %LOG_FILE%
)

POPD
goto END

:setEnvProperty
FOR /F "eol=# tokens=1,2 delims=@" %%A IN ("%1") DO @IF %%B.==. (
	call set %~1=%~2
)

:END
exit /b %errorlevel%
