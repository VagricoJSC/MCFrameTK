@echo off
@setlocal

@set RET=0

pushd %~p0


@IF NOT "%1"=="" @set OUT=%1
@IF NOT "%OUT%"=="" GOTO :ENDIF1
@set OUT=%~dp0out
@set /P OUT="Enter the output directory. If no input is output to %OUT% of the current Dir."
:ENDIF1

@IF NOT "%2"=="" @set PARAM_DIR=%2
@IF NOT "%PARAM_DIR%"=="" GOTO :ENDIF2
@set PARAM_DIR=%~dp0
@set /P PARAM_DIR="Enter the directory where the param.json file is located."
:ENDIF2

@IF NOT "%VM_OPT%"=="" GOTO :ENDIF3
@set VM_OPT=-Xmx256m
:ENDIF3


@set JAVA_COMMAND=java.exe
@if EXIST ..\jre\bin\java.exe (
@set JAVA_COMMAND=..\jre\bin\java.exe
)


@call setEnvPath.bat

@SET FMOO_JAR=..\fw_jar\mc-kernel-common-7.0.3.jar;..\fw_jar\mc-kernel-client-7.0.3.jar;..\fw_jar\mc-kernel-server-7.0.3.jar;..\fw_jar\mc-resource-7.0.3.jar
@SET PJ_CLASS=..\fm_jar\fm-7.0.3.jar
@SET JCOM_JAR=..\fm_jar\jcom.jar
@SET FREEM_JAR=..\fm_jar\freemarker.jar
@SET JACKSON_JAR=..\fm_jar\jackson-core-2.15.2.jar;..\fm_jar\jackson-annotations-2.15.2.jar;..\fm_jar\jackson-databind-2.15.2.jar
@SET LOG_JAR=..\fm_jar\commons-logging-1.2.jar
@SET CPATH=%PJ_CLASS%;%FMOO_JAR%;%JCOM_JAR%;%FREEM_JAR%;%LOG_JAR%;%JACKSON_JAR%

@if not EXIST %OUT% (
@mkdir %OUT%
)


@REM @echo Automatically generate source.
%JAVA_COMMAND% -classpath "%CPATH%" %VM_OPT% mcframe.fm2.dbcontainer.FM2DBContainerBuilder "%OUT%" "%PARAM_DIR%"
@set RET=%errorlevel%

@if %RET% GEQ 1 @echo -----------------------------------------------------------------------
@if %RET%==1 (
@echo ##An error has occured.##
@echo see log\debug.log and [MCF_DEV]\tools\dbb\log\dbb.log
)
@if %RET%==2 (
@echo ##A warning has occurred.##
@echo see log\debug.log and [MCF_DEV]\tools\dbb\log\dbb.log
)
@if %RET%==3 (
@echo ##An error and warning has occured.##
@echo see log\debug.log and [MCF_DEV]\tools\dbb\log\dbb.log
)
@if %RET%==255 (
@echo ##An error has occured.##
@echo see mcfdump_[timestamp].dat
)
@if %RET% GEQ 1 (
@echo -----------------------------------------------------------------------
@echo Press any key to continue ...
@pause > NUL
@goto END
)

:END

popd

@endlocal
@rem exit %RET%
