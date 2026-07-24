@echo off
@setlocal ENABLEDELAYEDEXPANSION

@REM *******************************************************
@REM *
@REM * schemaEnv.iniよりmcconst.iniを作成するバッチ
@REM * 第一引数に対象となるファイルパスを指定する
@REM * (デフォルト値はschemaEnv.ini)
@REM * 第二引数にクラスを指定する
@REM * (省略時は全クラス)
@REM * 結果は標準出力に出力されるので、適宜リダイレクトする
@REM *
@REM *******************************************************

pushd "%~dp0"

@REM 引数が指定されている場合は、引数に渡された値を設定する
if not %1.==. set DEFAULTINIFILE=%1
if not %2.==. set CLASS=%2


@REM 引数が指定されていない場合は、デフォルト値を設定する
if %DEFAULTINIFILE%.==. set DEFAULTINIFILE=..\..\..\bin\schemaEnv.ini


@REM 処理開始
set CURRENT=
set ENTRY=
for /F "usebackq eol=# tokens=1,2 delims=@" %%a in ("%DEFAULTINIFILE%") do (
	set ENTRY=%%b
	if not %CLASS%.==. (
		if not %CLASS%.==%%a. (
			set ENTRY=
		)
	)
	if not !ENTRY!.==. (
		if not !CURRENT!.==%%a. (
			set CURRENT=%%a
			echo [!CURRENT!]
		)
		if !CURRENT!. == MSGTBL. (
			for /F "tokens=1,2 delims==" %%m in ("!ENTRY!") do (
				if not exist %%m set ENTRY=%%m=%~dp0..\..\msg\%%n
			)
		)
		echo !ENTRY!
	)
)

popd
@endlocal
