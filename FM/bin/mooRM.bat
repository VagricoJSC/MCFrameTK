@setlocal

pushd %MCF_DEV%\bin


CALL "%MCF_DEV%\bin\mooMGbackup.bat" "%MC_OUT_FILE%"

@IF NOT "%VM_OPT%"=="" GOTO :ENDIF
@set VM_OPT=-Xmx256m
:ENDIF

@set JAVA_COMMAND=java.exe
@if EXIST %MCF_DEV%\jre\bin\java.exe (
@set JAVA_COMMAND=%MCF_DEV%\jre\bin\java.exe
)

@call setEnvPath.bat

@SET FMOO_JAR=%MCF_DEV%\fw_jar\mc-kernel-common-7.0.3.jar;%MCF_DEV%\fw_jar\mc-kernel-client-7.0.3.jar;%MCF_DEV%\fw_jar\mc-kernel-server-7.0.3.jar;%MCF_DEV%\fw_jar\mc-resource-7.0.3.jar;%MCF_DEV%\fw_jar\mc-report-common-7.0.3.jar
@SET PJ_CLASS=%MCF_DEV%\fm_jar\fm-7.0.3.jar
@SET JCOM_JAR=%MCF_DEV%\fm_jar\jcom.jar
@SET FREEM_JAR=%MCF_DEV%\fm_jar\freemarker.jar
@SET LOG_JAR=%MCF_DEV%\fm_jar\commons-logging-1.2.jar
@SET CPATH=%PJ_CLASS%;%FMOO_JAR%;%JCOM_JAR%;%FREEM_JAR%;%LOG_JAR%

@echo We will create an implementation specification document.
%JAVA_COMMAND% -classpath "%CPATH%" %VM_OPT% -DMCConfig#FM.REPOSITORY_DIR=%REPOSITORY% mcframe.fm.wizard.FMRepSpecMerger "%MC_OUT_FILE%" "%MC_MG_FILE%" "%MCF_DEV%" "MG" "%MC_REPORT_ID%" "%MC_HST_SRC_BASE%" "%MC_HST_NAME%" "%MC_HST_PATCH%" "%MC_HST_SRC%"
@echo -----------------------------------------------------------------------
@set RET=%errorlevel%
@goto END
)

:END

popd
