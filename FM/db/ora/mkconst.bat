@ECHO OFF
@REM ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
@REM ■■
@REM ■■  データベース定数定義の登録
@REM ■■  ※パス区切り文字は必ず"\"で！！
@REM ■■
@REM ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

@SETLOCAL ENABLEDELAYEDEXPANSION

set DBHOME=%~dp0
pushd "%DBHOME%"

IF "%SETUP_HOME%" == "" ( 
SET SETUP_HOME=%~dp0..\..\..
@REM ■ 環境変数の読込み ■
CALL "..\..\bin\schemaEnv.cmd"
)

set USERCONST=..\const
set USERMSG=..\msg
set TOOLHOME=.\mkconst
set TOOLLOG=%SETUP_HOME%\db\log\mcconst.log
set CONSTINI=%TOOLHOME%\mcconst.ini

@REM ■ ログディレクトリ作成 ■
if not exist "%SETUP_HOME%\db\log" mkdir "%SETUP_HOME%\db\log"
echo.> "%TOOLLOG%"

@REM ■ INIファイルからの設定 ■
echo set %INIFILE% >> "%TOOLLOG%"
call "%TOOLHOME%\makeMcconst.bat" > "%CONSTINI%"

@REM ■ [MSGTBL]未設定時 (ファイル名でソート) ■
@REM set MERGEMSG=%TOOLHOME%\mergemsgtbl.dat
@REM find /C "[MSGTBL]" "%CONSTINI%" > NUL 2>&1
@REM if errorlevel 1 (
@REM 	echo msgtbl file search...
@REM 	echo.> "%MERGEMSG%"
@REM 	set MSGLIST=
@REM 	for /f "usebackq" %%f in (`dir /b /o:n /a:-d "%USERMSG%\*.dat"`) do (
@REM 		echo set message %USERMSG%\%%f >> "%TOOLLOG%"
@REM 		set MSGLIST=!MSGLIST! + "%USERMSG%\%%f"
@REM 	)
@REM 	if not "!MSGLIST!"=="" copy /Y /B "%MERGEMSG%" !MSGLIST! "%MERGEMSG%"
@REM 	echo [MSGTBL]>> "%CONSTINI%"
@REM 	echo msgtblFile01=%DBHOME%%MERGEMSG%>> "%CONSTINI%"
@REM 	echo.
@REM )

@REM ■ constディレクトリからの設定 (ファイル名でソート) ■

@REM CONSTファイルの存在チェック
if NOT EXIST %USERCONST%\*.ini goto license

echo const file search...
set CONSTLIST=
for /f "usebackq" %%f in (`dir /b /o:n /a:-d "%USERCONST%\*.ini"`) do (
	echo set const %USERCONST%\%%f >> "%TOOLLOG%"
	set CONSTLIST=!CONSTLIST! + "%USERCONST%\%%f"
)
if not "%CONSTLIST%"=="" copy /Y /B "%CONSTINI%" %CONSTLIST% "%CONSTINI%"

:license
echo.

@REM ■ 登録処理 ■
echo load start... >> "%TOOLLOG%" 2>&1
call "%TOOLHOME%\mcconst.bat" >> "%TOOLLOG%" 2>&1

popd
@ENDLOCAL
