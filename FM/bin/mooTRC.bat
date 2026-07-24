@IF NOT "!MCF_HOME_LIST!".=="". GOTO :END_MH

:NEXT_MHF
@IF NOT "!MCF_HOME_FILE!".=="". GOTO :END_MHF
@set /P MCF_HOME_FILE="mcf_home list file..."
@GOTO :NEXT_MHF

:END_MHF
@SET DIR_DELIM=
@FOR /F "usebackq tokens=*" %%A IN ("!MCF_HOME_FILE!") DO @(
@IF NOT "!MCF_HOME_LIST!".=="". @SET DIR_DELIM=;
@SET MCF_HOME_LIST=!MCF_HOME_LIST!!DIR_DELIM!%%A
)

:END_MH
:NEXT_RES
@IF !RES_TYPE!.==message. GOTO :END_PKG
@IF !RES_TYPE!.==label. GOTO :NEXT_PKG
@IF !RES_TYPE!.==reportlabel. GOTO :NEXT_PKG
@IF !RES_TYPE!.==dblabel. GOTO :NEXT_PKG
@IF !RES_TYPE!.==logiclabel. GOTO :NEXT_PKG
@set /P RES_TYPE="resource type...(label or reportlabel or dblabel or logiclabel)"
@GOTO :NEXT_RES

:NEXT_PKG
@IF NOT "!PKG_ROOT_LIST!".=="". GOTO :END_PKG

:NEXT_PKGF
@IF NOT "!PKG_ROOT_FILE!".=="". GOTO :END_PKGF
@set /P PKG_ROOT_FILE="package root list file..."
@GOTO :NEXT_PKGF

:END_PKGF
@SET DIR_DELIM=
@FOR /F "usebackq tokens=*" %%A IN ("%PKG_ROOT_FILE%") DO @(
@IF NOT "!PKG_ROOT_LIST!".=="". @SET DIR_DELIM=;
@SET PKG_ROOT_LIST=!PKG_ROOT_LIST!!DIR_DELIM!%%A
)

:END_PKG