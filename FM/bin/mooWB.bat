@setlocal


@set RET=0

pushd %~p0

@IF NOT "%OUT%"=="" GOTO :ENDIF1
@set OUT=out
@set /P OUT="Enter the output directory. If no input is output to %OUT% of the current Dir."
:ENDIF1

@IF NOT "%REGEXP%"=="" GOTO :ENDIF2
@set /P REGEXP="Regular expression that specifies the target operation (If nothing is entered, all operation implementation specifications of the repository will be covered.)"
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
@rem SET PJ_CLASS=C:\Documents and Settings\f-inoue\workspace33\fmoo\bin
@SET JCOM_JAR=..\fm_jar\jcom.jar
@SET FREEM_JAR=..\fm_jar\freemarker.jar
@SET LOG_JAR=..\fm_jar\commons-logging-1.2.jar
@SET CPATH=%PJ_CLASS%;%FMOO_JAR%;%JCOM_JAR%;%FREEM_JAR%;%LOG_JAR%

@echo Automatically generate WebService source.
%JAVA_COMMAND% -classpath "%CPATH%" %VM_OPT% mcframe.fm.ws.FMWsBuilderVassal "%OUT% " %REGEXP%

@if errorlevel 1 @echo -----------------------------------------------------------------------
@if %errorlevel%==1 @echo ## An error has occurred. Please check Log. ##
@if %errorlevel%==2 @echo ## A warning has occurred. Please check Log. ##
@if %errorlevel%==3 (
@echo ## An error and warning has occurred. Please check Log. ##
)
@if %errorlevel%==255 @echo ## An error occurred during automatic generation. Please check Stacktrace. ##
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
