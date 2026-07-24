CREATE OR REPLACE PACKAGE MAPA_COST_SYS
/*********************************************************
<SYNOPSIS>
		原価計算パラメータ関連ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	PROCEDURE P_INIT_CALC_PARM (
		I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
		I_CO_CD			IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		原価計算パラメータを初期化する。
	<REMARKS>
		MGT_PARM_ALL、MGT_PARM_DEFが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	
	PROCEDURE P_DEL_CALC_PARM (
		I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
		I_CO_CD			IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		原価計算パラメータを削除する。
	<REMARKS>
		MGT_PARM_ALLが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	
	PROCEDURE P_INIT_NON_MOV_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		滞留制御情報を初期化する。
	<REMARKS>
		MGC_NON_MOV_CTL_ALL、MGC_NON_MOV_CTL_DEFが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	
	PROCEDURE P_DEL_NON_MOV_CTL (
		I_CO_CD			IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		滞留制御情報を削除する。
	<REMARKS>
		MGC_NON_MOV_CTL_ALLが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	PROCEDURE P_INS_NON_MOV_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		MGC_NON_MOV_CTL_ALLに引数の会社ＣＤで登録されていないデータを追加する。
	<REMARKS>
		MGC_NON_MOV_CTL_ALL、MGC_NON_MOV_CTL_DEFが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
END MAPA_COST_SYS;
/
