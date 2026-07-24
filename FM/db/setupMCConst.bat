@ECHO OFF
@REM ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
@REM ■■
@REM ■■  データベース定数定義の登録
@REM ■■
@REM ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

@SETLOCAL

PUSHD "%~dp0"

SET MCDB=ora

CALL ".\%MCDB%\mkconst.bat"

POPD
@ENDLOCAL
