@setlocal enabledelayedexpansion

@pushd "%~dp0"

@set P_TAR_PRE=FC703

@REM Create ins_pver.sql
IF %FMC_DATABASE%==oracle (
	IF EXIST .\ORACLE ( RMDIR /S /Q .\ORACLE )
	MKDIR .\ORACLE
	@set IPV=ORACLE\ins_pver.sql
	@set TM=SYSTIMESTAMP
) ELSE IF %FMC_DATABASE%==postgresql (
	IF EXIST .\POSTGRESQL ( RMDIR /S /Q .\POSTGRESQL )
	MKDIR .\POSTGRESQL
	@set IPV=POSTGRESQL\ins_pver.sql
	@set TM=fcpa_postgres_util$systimestamp^^^(^^^)
)
@type nul > %IPV%
@for /f "delims=" %%a in ('dir %P_TAR_PRE%*#* /b /ad ^| sort') do @set PVER_FS=!PVER_FS! %%a

if not "%PVER_FS%"=="" (
	@for  %%f in (!PVER_FS!) do @(
		@set pver=%%f
		@echo DELETE FROM FCT_PATCHVERSION WHERE PRODUCT_ID = 'JAVA-FS' AND MODULE_ID = 'FS' AND VERSION = '!pver!' AND BRANCH = '0'; >> %IPV%
		@echo INSERT INTO FCT_PATCHVERSION VALUES ('JAVA-FS', 'FS','!pver!', '0', %TM%^); >> %IPV%
	)

	@REM Execute ins_pver.sql
	@ECHO %FMC_DB_USER% %FMC_DB_HOST% %FMC_DB_PORT% > "%SETUP_HOME%\db\log\ins_pver.log"
	set LOG_FILE=%SETUP_HOME%\db\log\ins_pver.log
	set SQLFILE_HOME=%DBHOME%\patch\sql\ins_pver
	CALL %MOO_DBUTIL% %DBHOME%\patch\ins_pver.json
	echo.
)

@popd


@endlocal