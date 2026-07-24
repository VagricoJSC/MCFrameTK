@setlocal

@set RET=0

pushd %~p0

@set MCConfig#FM.REPOSITORY_DIR=C:\TEMP\20101027\hanbai\repository,C:\omega\trunk\hanbai\dev\repository,C:\omega\trunk\bcomm\dev\repository,C:\MCF_DEV_V620\wApplication\repository,C:\MCF_DEV_V620\xApplication\repository

@set JAVA_COMMAND=java.exe
@if EXIST ..\jre\bin\java.exe (
@set JAVA_COMMAND=..\jre\bin\java.exe
)

@call setEnvPath.bat

@SET FMOO_JAR=..\fw_jar\mc-beans-7.0.3.jar;..\fw_jar\mc-kernel-common-7.0.3.jar;..\fw_jar\mc-kernel-client-7.0.3.jar;..\fw_jar\mc-kernel-server-7.0.3.jar;..\fw_jar\mc-resource-7.0.3.jar
@SET PJ_CLASS=..\fm_jar\fm-7.0.3.jar
@rem SET PJ_CLASS=C:\Documents and Settings\f-inoue\workspace33\fmoo\bin
@SET JCOM_JAR=..\fm_jar\jcom.jar
@SET FREEM_JAR=..\fm_jar\freemarker.jar
@SET LOG_JAR=..\fm_jar\commons-logging-1.2.jar
@SET CPATH=%PJ_CLASS%;%FMOO_JAR%;%JCOM_JAR%;%FREEM_JAR%;%LOG_JAR%

%JAVA_COMMAND% -classpath "%CPATH%" %VM_OPT% mcframe.fm.builder.FMBuilderConsole

@if errorlevel 1 @echo -----------------------------------------------------------------------
@if %errorlevel%==1 (
@echo ##An error has occured.##
@echo see log\debug.log
)
@if %errorlevel%==2 (
@echo ##A warning has occurred.##
@echo see log\debug.log
)
@if %errorlevel%==3 (
@echo ##An error and warning has occured.##
@echo see log\debug.log
)
@if %errorlevel%==255 (
@echo ##An error has occured.##
@echo see mcfdump_[timestamp].dat
)
@if errorlevel 1 (
@echo -----------------------------------------------------------------------
@echo Press any key to continue ...
@pause > NUL
@set RET=%errorlevel%
@goto END
)

:END

popd

@endlocal
@exit /b %RET%
