@echo off

setlocal

pushd %~p0

set CUR=%~d0%~p0
set FM_HOME=%CUR%..\..\..\..\..\FM
set MOO_DBUTIL=%FM_HOME%\dbutil\mooDBUtil.bat

set MAKE_ALL_JSON_FILE_NAME=makeAll.json
set ERR_LOG=%CUR%dbb_make_all.log
set NO_DEL_LOG_SUCCESS=FALSE

if not defined DBB_MAKE_ALL_INI set DBB_MAKE_ALL_INI=%CUR%dbb_make_all.ini
if exist %DBB_MAKE_ALL_INI% (
  for /f "tokens=1,2 delims==" %%i in (%DBB_MAKE_ALL_INI%) do (
    if not "%%j"=="" (
      if "MAKE_ALL_JSON_FILE_NAME"=="%%i" set MAKE_ALL_JSON_FILE_NAME=%%j
      if "ERR_LOG"=="%%i" set ERR_LOG=%%j
      if "NO_DEL_LOG_SUCCESS"=="%%i" set NO_DEL_LOG_SUCCESS=%%j
    )
  )
)

set EXECTYPE=FILE
set ORACLE_SQLFILE_HOME=%CUR%oracle_sqlfile
set POSTGRESQL_SQLFILE_HOME=%CUR%postgresql_sqlfile
set MAKE_ALL_JSON=%CUR%make\%MAKE_ALL_JSON_FILE_NAME%

echo make_all_json: %MAKE_ALL_JSON% > %ERR_LOG%

echo make Oracle sql file.
echo make Oracle sql file. >> %ERR_LOG% 2>&1
set DATABASE=ORACLE
call %MOO_DBUTIL% %MAKE_ALL_JSON% %ORACLE_SQLFILE_HOME% >> %ERR_LOG% 2>&1

set ERR_ORA=%ERRORLEVEL%
echo ERRORLEVEL: %ERRORLEVEL%

echo make PostgreSQL sql file.
echo make PostgreSQL sql file. >> %ERR_LOG% 2>&1
set DATABASE=POSTGRESQL
call %MOO_DBUTIL% %MAKE_ALL_JSON% %POSTGRESQL_SQLFILE_HOME% >> %ERR_LOG% 2>&1

set ERR_POS=%ERRORLEVEL%
echo ERRORLEVEL: %ERRORLEVEL%

:END

set RET=0
if %ERR_ORA% neq 0 set RET=%ERR_ORA%
if %ERR_POS% neq 0 set RET=%ERR_POS%

echo --------------
if %RET% equ 0 (
  if not "%NO_DEL_LOG_SUCCESS%"=="TRUE" del %ERR_LOG%
  echo Success.
) else (
  echo Error.
  echo Check the log file.
  echo %ERR_LOG%
)

if "%BATCH_MODE%"=="" (
pause
)

popd

@endlocal && exit /b %RET%
