@setlocal

@IF NOT "%MC_BACKUP%" == "true" GOTO :END

@IF NOT "%MC_BACKUP_S%" == "" GOTO :ENDIF
@set MC_BACKUP_S=%date:~-10,4%%date:~-5,2%%date:~-2,2%
@set MC_TIME=%time: =0% 
@set MC_BACKUP_S=%MC_BACKUP_S%%MC_TIME:~0,2%%MC_TIME:~3,2%%MC_TIME:~6,2%
:ENDIF

@copy %1 %~dp1%MC_BACKUP_S%%~nx1

:END
