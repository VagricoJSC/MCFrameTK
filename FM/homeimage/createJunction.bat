@echo off
setlocal ENABLEDELAYEDEXPANSION

set MCF_HOME=%~d0%~p0
set APP_DEV=%MCF_HOME%..
set LOG=%MCF_HOME%\createJunction.log

echo Start > %LOG%

for /f %%i in ('dir /b /ad %APP_DEV%\*') do ( 
	for %%j in (conf,const) do (
		set APP_RSRC=%APP_DEV%\%%i\resource\%%j\%%i
		if EXIST !APP_RSRC! ( 
			set APP_LINK=%MCF_HOME%\%%j\%%i
			if not EXIST !APP_LINK! ( 
				mklink /j !APP_LINK! !APP_RSRC! >> %LOG% 2>&1
			) 
		) 
	)
)
echo End >> %LOG%

@endlocal