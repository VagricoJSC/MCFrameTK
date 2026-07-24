@echo off

setlocal

set USAGE1=mooDBUtil.bat SQLJSON_FILE_PATH [OUTPUT_PATH]
set USAGE2=When using ini file, Set the path of the ini file in the environment variable 'DBUTIL_INI'.

pushd %~p0
set CUR=%~d0%~p0
set FM_HOME=%CUR%..
SET DBUTIL_DIR=%FM_HOME%\dbutil
@if "%MSG_FILE%"=="" @set MSG_FILE=%DBUTIL_DIR%\msg\en_US\err_dbutil.dat

if "%1"== "" GOTO USAGE_ERR

echo %1 | find ".json" > NUL
if not ERRORLEVEL 1 goto IS_JSON

:NOT_JSON
set ARG1=%1
goto SET_ARG2

:IS_JSON
set ARG1=MCDDLPath=%1


:SET_ARG2

@if not "%2"=="" @set SQLFILE_HOME=%2

@if not "%DBUTIL_INI%"=="" set ARG2=INI_FILE=%DBUTIL_INI%


GOTO SEARCH_JDBC

:USAGE_ERR
echo %USAGE1%
echo %USAGE2%
rem pause
goto END


:SEARCH_JDBC
pushd ..\dbutil
for /f %%a in (jdbc_driver.ini) do (
  SET JDBC=%%a
)
popd

:EXEC_LOGIC

set JAVA_COMMAND=java.exe
if EXIST %FM_HOME%\jre\bin\java.exe (
set JAVA_COMMAND=%FM_HOME%\jre\bin\java.exe
) else if EXIST %FM_HOME%\..\..\FM\jre\bin\java.exe (
set JAVA_COMMAND=%FM_HOME%\..\..\FM\jre\bin\java.exe
)

SET DBUTIL_JAR=%DBUTIL_DIR%\dbutil-7.0.3.jar
SET FM_JAR=%DBUTIL_DIR%\ext\mc-resource-7.0.3.jar;%DBUTIL_DIR%\ext\mc-kernel-common-7.0.3.jar
SET EXT_JAR=%DBUTIL_DIR%\ext\jackson-annotations-2.19.2.jar;%DBUTIL_DIR%\ext\jackson-core-2.19.2.jar;%DBUTIL_DIR%\ext\jackson-databind-2.19.2.jar;
SET JDBC_JAR=%DBUTIL_DIR%\ext\%JDBC%
SET CPATH=%DBUTIL_JAR%;%FM_JAR%;%EXT_JAR%;%JDBC_JAR%

%JAVA_COMMAND% %VM_OPT% -classpath "%CPATH%" mcframe.dbutil.main.DbUtil %ARG1% %ARG2%

set RET=%errorlevel%
@rem Does not pause when mooDBUtil.bat is started via mkXXX.bat
rem if not %RET%==0 if not "%VIA_SETUP_BAT%"=="1" (
rem @echo error! %RET%
rem pause
rem goto END
rem )


:END

popd
endlocal