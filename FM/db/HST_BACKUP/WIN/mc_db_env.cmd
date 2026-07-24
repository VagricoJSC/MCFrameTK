@ECHO OFF

PUSHD "%~dp0"

set SETENVINI=mc_db_env.ini

IF NOT "%~1".=="". set INIFILE=%1

IF NOT "%INIFILE%".=="". goto readIni

IF EXIST %SETENVINI% (
	set INIFILE=%SETENVINI%
)

:readIni

FOR /F "eol=# tokens=1,2 delims==" %%a in (%INIFILE%) do (
	call :setEnvProperty %%a "%%b"
)

POPD

IF %FMC_DATABASE%==oracle (
    set DATABASE=Oracle
    set ORA_DB_USER=%FMC_DB_USER%
    set ORA_DB_PASSWD=%FMC_DB_PASSWORD%
    set ORA_DB_HOST=%FMC_DB_HOST%
    set ORA_DB_PORT=%FMC_DB_PORT%
    set ORA_DB_SID=%FMC_DB_SID%
) ELSE IF %FMC_DATABASE%==postgresql (
    set DATABASE=PostgreSQL
    set POS_DB_USER=%FMC_DB_USER%
    set POS_DB_PASSWD=%FMC_DB_PASSWORD%
    set POS_DB_HOST=%FMC_DB_HOST%
    set POS_DB_PORT=%FMC_DB_PORT%
    set POS_DB_NAME=%FMC_DB_NAME%
    set POS_DB_SCHEMA=%FMC_DB_SCHEMA%
)

goto END

:setEnvProperty
FOR /F "eol=# tokens=1,2 delims=@" %%A IN ("%1") DO @IF %%B.==. (
	call set %~1=%~2
)

:END

