@setlocal

@set RET=0

@pushd %~p0

@if "%1"=="" (
@echo Usage : mooCrypt value  #for resource
@echo         mooCrypt key value
@goto END
)

@set JAVA_COMMAND=java.exe
@if EXIST ..\jre\bin\java.exe (
@set JAVA_COMMAND=..\jre\bin\java.exe
)

@call setEnvPath.bat

@SET FMOO_JAR=..\fw_jar\mc-kernel-common-7.0.3.jar;..\fw_jar\mc-kernel-client-7.0.3.jar;..\fw_jar\mc-kernel-server-7.0.3.jar;..\fw_jar\mc-resource-7.0.3.jar
@SET PJ_CLASS=..\fm_jar\fm-7.0.3.jar
@SET LOG_JAR=..\fm_jar\commons-logging-1.2.jar
@SET CPATH=%FMENC_CPATH%;%PJ_CLASS%;%FMOO_JAR%;%LOG_JAR%


@echo encryption...
%JAVA_COMMAND% -classpath "%CPATH%" mcframe.fm.crypt.FMEncrypt %1

@if errorlevel 2 @echo -----------------------------------------------------------------------
@if %errorlevel%==2 (
@echo ##An error has occured.##
@echo see log\debug.log
)
@if errorlevel 2 (
@echo -----------------------------------------------------------------------
@echo Press any key to continue ...
@pause > NUL
@set RET=%errorlevel%
@goto END
)

:END

@popd

@endlocal
@exit /b %RET%
