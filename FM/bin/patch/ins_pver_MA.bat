@setlocal enabledelayedexpansion

@pushd "%~dp0"

@REM Set module-parameters
@set PRODUCT_ID=MA
@set MODULE_ID=MA

@set P_TAR_PRE=%MODULE_ID%703
@set LOG_FILE=%SETUP_HOME%\db\log\ins_pver_%MODULE_ID%.log

@REM Create ins_pver.sql
@set P_TAR_SUF=.txt
@set IPV=ins_pver_%MODULE_ID%.sql
IF %FMC_DATABASE%==oracle (
	IF EXIST .\ORACLE ( RMDIR /S /Q .\ORACLE )
	MKDIR .\ORACLE
	@set IPV=ORACLE\ins_pver_%MODULE_ID%.sql
	@set TM=SYSTIMESTAMP
) ELSE IF %FMC_DATABASE%==postgresql (
	IF EXIST .\POSTGRESQL ( RMDIR /S /Q .\POSTGRESQL )
	MKDIR .\POSTGRESQL
	@set IPV=POSTGRESQL\ins_pver_%MODULE_ID%.sql
	@set TM=fcpa_postgres_util$systimestamp^^^(^^^)
)
@type nul > %IPV%

@set PVER=
@IF EXIST %P_TAR_PRE%*#*%P_TAR_SUF% (
	@for /f "delims=" %%a in ('dir %P_TAR_PRE%*#*%P_TAR_SUF% /b ^| sort') do @set PVER=!PVER! %%a
)

@for %%f in (!PVER!) do @(
	@set fn=%%f
	@set pver=!fn:%P_TAR_SUF%=!
	@echo DELETE FROM FCT_PATCHVERSION WHERE PRODUCT_ID = '%PRODUCT_ID%' AND MODULE_ID = '%MODULE_ID%' AND VERSION = '!pver!' AND BRANCH = '0'; >> %IPV%
	@echo INSERT INTO FCT_PATCHVERSION VALUES ('%PRODUCT_ID%', '%MODULE_ID%','!pver!', '0', %TM%^); >> %IPV%
)

@REM Execute ins_pver.sql
@ECHO %FMC_DB_USER% %FMC_DB_HOST% %FMC_DB_PORT% > "%LOG_FILE%"
set SQLFILE_HOME=%~dp0sql
CALL %MOO_DBUTIL% %~dp0\ins_pver_%MODULE_ID%.json
echo.

:FIN

@popd

@endlocal