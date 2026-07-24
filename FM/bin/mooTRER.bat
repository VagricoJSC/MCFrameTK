@setlocal enabledelayedexpansion

@set RET=0

@pushd %~dp0

@IF NOT "!FM_FIX_PARAM!".=="". GOTO :END_PARAM


@call .\mooTRC.bat

@IF NOT "!REM_KEY!".=="". GOTO :END_REM_KEY
@set /P REM_KEY="except key..."
:END_REM_KEY

:NEXT_XLS
@IF NOT "!IN_EXCEL_FULL_NAME!".=="". GOTO :END_XLS
@set /P IN_EXCEL_FULL_NAME="excel file for input..."
@GOTO :NEXT_XLS
:END_XLS

:NEXT_PJ
@IF NOT "!PJ!".=="". GOTO :END_PJ
@set /P PJ="Project ID..."
@GOTO :NEXT_PJ
:END_PJ

:END_PARAM
@IF NOT "%VM_OPT%".=="". GOTO :END_VM
@set VM_OPT=-Xmx512m

:END_VM
@set JAVA_COMMAND=java.exe
@if EXIST ..\jre\bin\java.exe (
@set JAVA_COMMAND=..\jre\bin\java.exe
)

@SET FMOO_JAR=..\fw_jar\mc-kernel-common-7.0.3.jar;..\fw_jar\mc-kernel-client-7.0.3.jar;..\fw_jar\mc-kernel-server-7.0.3.jar;..\fw_jar\mc-resource-7.0.3.jar;..\fw_jar\mc-report-common-7.0.3.jar
@SET FM_HOME=.
@SET JCOM_JAR=..\fm_jar\jcom.jar
@SET FREEM_JAR=..\fm_jar\freemarker.jar
@SET LOG_JAR=..\fm_jar\commons-logging-1.2.jar
@SET E_PLUGIN_JAR=..\fm_jar\fm-7.0.3.jar

@call setEnvPath.bat

@SET CPATH=%FM_HOME%;%FMOO_JAR%;%JCOM_JAR%;%FREEM_JAR%;%LOG_JAR%;%E_PLUGIN_JAR%


@SET JV=%JAVA_COMMAND% -classpath "!CPATH!" !VM_OPT! -DSPEC_CODE=L mcframe.fm.translator.engine.batch.FMExcelInResourceOut "!MCF_HOME_LIST!" "!RES_TYPE!" "!PKG_ROOT_LIST!" !REM_KEY! "!IN_EXCEL_FULL_NAME!" "!PJ!"
%JV%

@if errorlevel 1 @echo -----------------------------------------------------------------------
@if %errorlevel%==1 (
@echo ##An error has occured.##
@echo see log\debug.log
)
@if %errorlevel%==2 (
@echo ##Warning.##
@echo see log\debug.log
)
@if %errorlevel%==3 (
@echo ##An error has occured.##
@echo ##Warning.##
@echo see log\debug.log
)
@if errorlevel 1 (
@echo -----------------------------------------------------------------------
@echo Press any key to continue ...
@pause > NUL
@set RET=!errorlevel!
@goto END
)
:END

@popd
@IF NOT "!EXIT_CMD!".=="". (
	GOTO :EXIT_CMD
) ELSE (
	GOTO :EXIT_BAT
)
:EXIT_BAT
@exit /b !RET!
:EXIT_CMD
@exit !RET!
