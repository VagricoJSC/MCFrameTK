CREATE OR REPLACE PACKAGE MAPA_UTIL
/*********************************************************
<Synopsis>
	マスタユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	FUNCTION F_GET_DEF_GD_CD 
	RETURN MAPA_META.STK_GD_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		デフォルト格付ＣＤの取得
	<REMARKS>
		格付マスタからデフォルトの格付ＣＤを取得する
	<ARGUMENTS>
	<RETURN VALUE>
		格付ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_DEF_TRD_CD (
		I_TRD_PTN_TYP IN MAPA_META.TRD_PTN_TYP%TYPE
	)
	RETURN MAPA_META.TRD_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引パタン区分に対するデフォルト取引ＣＤの取得
	<REMARKS>
		取引パタン区分に対して自動時採用ＦＬＧが
		設定されている取引ＣＤを取得する
	<ARGUMENTS>
	<IN>	I_TRD_PTN_TYP
			取引パタン区分
	<RETURN VALUE>
		格付ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLO_XPNS_PURC_RSN_CD
	RETURN MAPA_META.BIZ_RSN_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		受注紐付の経費購買で使用する業務理由ＣＤの取得
	<REMARKS>
		受注紐付経費購買ＦＬＧが設定されている業務理由ＣＤ
	<ARGUMENTS>
	<RETURN VALUE>
		業務理由ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_FXD_LOSS_RSN_CD
	RETURN MAPA_META.BIZ_RSN_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		固定ロスで使用する業務理由ＣＤの取得
	<REMARKS>
		固定ロスＦＬＧが設定されている業務理由ＣＤを取得する
	<ARGUMENTS>
	<RETURN VALUE>
		業務理由ＣＤ
	<HISTORY>
	**********************************************************/

END MAPA_UTIL ;
/
