@echo off
@SETLOCAL

pushd "%~dp0"

@REM ‘æˆêˆø”‚ÉschemaEnv.cmd‚ªw’è‚³‚ê‚Ä‚¢‚éê‡AschemaEnv.cmd‚ğ“Ç‚İ’¼‚·
IF NOT %1.==. call "%1"

@REM ŠÂ‹«•Ï”‚ÉDBÚ‘±î•ñ‚ğİ’è
set DB_USER=%FMC_DB_USER%
set DB_PASS=%FMC_DB_PASSWORD%
set DB_NAME=%FMC_DB_LOCAL_SERVICE%

SET DBSQL_DIR=../mkws
SET CONST_INI=./mcconst.ini

JPerl.exe pa.pl
if errorlevel 1 goto END

call compile.bat
echo.

:END
del compile.bat

popd
@ENDLOCAL
