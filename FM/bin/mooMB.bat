@setlocal


@set RET=0

pushd %~p0

@IF NOT "%OUT%"=="" GOTO :ENDIF1
@set OUT=out
@set /P OUT="Enter the output directory. If no input is output to %OUT% of the current Dir."
:ENDIF1

@IF NOT "%RESOURCE_OUT%"=="" GOTO :ENDIF2
@set RESOURCE_OUT=%OUT%
@set /P RESOURCE_OUT="Enter the resource file output directory. If no input is output to %OUT% of the current Dir."
:ENDIF2

@IF NOT "%VM_OPT%"=="" GOTO :ENDIF4
@set VM_OPT=-Xmx256m
:ENDIF4

@IF NOT %CSV_TMP%.==. GOTO :ENDIF5
@set CSV_TMP=csv
:ENDIF5
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


@echo Generate CSV file from Excel file.

:LOOP
@IF %1.==. GOTO BREAK
@set XLSS=%XLSS% %1
@SHIFT
@GOTO LOOP
:BREAK

del /Q /F %CSV_TMP%
%JAVA_COMMAND% -classpath "%CPATH%" %VM_OPT% -DSPEC_CODE=M mcframe.fm.excel.FMExcel2Csv %CSV_TMP% %XLSS%

@if errorlevel 1 (
@echo %errorlevel%
@echo -----------------------------------------------------------------------
@if %errorlevel%==1 (
@echo A CSV output error occurred.
@echo see log\debug.log
)
@if %errorlevel%==255 (
@echo A CSV output error occurred.
@echo see mcfdump_[timestamp].dat
)
@echo -----------------------------------------------------------------------
@echo Press any key to continue ...
@pause > NUL
@set RET=%errorlevel%
@goto END
)

@echo Automatically generate source from CSV file.
%JAVA_COMMAND% -classpath "%CPATH%" %VM_OPT% mcframe.fm.meta.FMMetaBuilderVassal "%OUT% " "%RESOURCE_OUT% " %CSV_TMP%

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
