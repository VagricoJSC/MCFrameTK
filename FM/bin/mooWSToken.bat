@setlocal

@set RET=0

@pushd %~p0

@if "%1"=="" (
@echo Usage : mooWSToken -u userid [-s systemid] [-d expire]
@goto END
)

@set JAVA_COMMAND=java.exe
@if EXIST ..\jre\bin\java.exe (
@set JAVA_COMMAND=..\jre\bin\java.exe
)

@SET FMOO_JAR=..\fw_jar\mc-login-server-7.0.3.jar;..\fw_jar\mc-kernel-common-7.0.3.jar;..\ext\mcjwt.jar;..\ext\jackson-core-2.15.2.jar;..\ext\jackson-databind-2.15.2.jar;..\ext\jackson-annotations-2.15.2.jar
@SET PJ_CLASS=
@SET LOG_JAR=
@SET CPATH=%FMENC_CPATH%;%PJ_CLASS%;%FMOO_JAR%;%LOG_JAR%


%JAVA_COMMAND% -classpath "%CPATH%" mcframe.serverCore.login.MCDefaultAccessTokenChecker %*

@if not errorlevel 2 (
@set RET=%errorlevel%
@goto END
)

:END

@popd

@endlocal
@exit /b %RET%
