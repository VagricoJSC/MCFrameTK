@echo off
@setlocal

@REM == テーブルインストール
@REM 下記の内容を変更してください
@REM DB_USER = DB接続ユーザ名
@REM DB_PASS = DB接続ユーザのパスワード
@REM DB_NAME = DB接続先名

pushd "%~dp0

@REM ■ 環境変数の読込み ■
call ..\..\bin\schemaEnv.cmd 

pushd "%~dp0/mkws"

set DB_USER=%FMC_DB_USER%
set DB_PASS=%FMC_DB_PASSWORD%
set DB_NAME=%FMC_DB_LOCAL_SERVICE%

@REM ■ sqlplusの起動 ■
IF NOT EXIST ..\..\log MKDIR ..\..\log
@echo %DB_USER%/%DB_PASS%@%DB_NAME% > ..\..\log\replaceAll.log
set NLS_LANG=American_america.AL32UTF8
sqlplus /nolog @..\replaceAll.sql %DB_USER% %DB_PASS% %DB_NAME% >> ..\..\log\replaceAll.log

echo.

popd
@endlocal

