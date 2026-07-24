
@rem In windows jre is different so it gets an error.
@rem The result of -version is output to the error stream, so delete it.
@%JAVA_COMMAND% -d64 -version 2> NUL
@IF %ERRORLEVEL%==0 SET PATH=..\dll\win64;%PATH%
@IF %ERRORLEVEL%==1 SET PATH=..\dll\win32;%PATH%
