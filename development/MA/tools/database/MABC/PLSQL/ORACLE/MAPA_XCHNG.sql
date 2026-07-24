CREATE OR REPLACE PACKAGE MAPA_XCHNG
/*********************************************************
<Synopsis>
		為替関連ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	FUNCTION F_GET_BASE_CUR_CD
	RETURN MAPA_META.CUR_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		会社マスタから基準通貨ＣＤを取得する
	<REMARKS>
	<ARGUMENTS>
	<RETURNVALUE>
		基準通貨ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PTAX_CUR_CD
	RETURN MAPA_META.CUR_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		会社マスタから納税通貨ＣＤを取得する
	<REMARKS>
	<ARGUMENTS>
	<RETURNVALUE>
		納税通貨ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_CUR_REC (
		I_CUR_CD	 IN	MAPA_META.CUR_CD%TYPE
	)
	RETURN MAM_CUR%ROWTYPE ;
	/*********************************************************
	<SYNOPSIS>
		通貨マスタのレコードを取得する
	<REMARKS>
	<ARGUMENTS>
	<RETURNVALUE>
		通貨マスタのレコード
	<HISTORY>
	**********************************************************/

	PROCEDURE P_GET_CUR_INFO (
		I_CUR_CD	 IN	MAPA_META.CUR_CD%TYPE,
		O_UPRI_DEC_PLACE OUT	MAPA_META.DEC_PLACE%TYPE,
		O_AMT_DEC_PLACE	 OUT	MAPA_META.DEC_PLACE%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		通貨に対する金額端数処理桁・単価端数処理桁を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CUR_CD
			通貨ＣＤ
	<OUT>	O_UPRI_DEC_PLACE
			単価小数部有効桁数
	<OUT>	O_AMT_DEC_PLACE
			金額小数部有効桁数
	<HISTORY>
	**********************************************************/

	PROCEDURE P_GET_BASE_CUR_INFO (
		O_BASE_CUR_CD	 OUT	MAPA_META.CUR_CD%TYPE,
		O_UPRI_DEC_PLACE OUT	MAPA_META.DEC_PLACE%TYPE,
		O_AMT_DEC_PLACE	 OUT	MAPA_META.DEC_PLACE%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		基準通貨に対する通貨ＣＤ・金額端数処理桁・単価端数処理桁を取得する
	<REMARKS>
	<ARGUMENTS>
	<OUT>	O_BASE_CUR_CD
			基準通貨ＣＤ
	<OUT>	O_UPRI_DEC_PLACE
			単価小数部有効桁数
	<OUT>	O_AMT_DEC_PLACE
			金額小数部有効桁数
	<HISTORY>
	**********************************************************/

	PROCEDURE P_GET_PTAX_CUR_INFO (
		O_PTAX_CUR_CD	 OUT	MAPA_META.CUR_CD%TYPE,
		O_UPRI_DEC_PLACE OUT	MAPA_META.DEC_PLACE%TYPE,
		O_AMT_DEC_PLACE	 OUT	MAPA_META.DEC_PLACE%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		納税通貨に対する通貨ＣＤ・金額端数処理桁・単価端数処理桁を取得する
	<REMARKS>
	<ARGUMENTS>
	<OUT>	O_PTAX_CUR_CD
			納税通貨ＣＤ
	<OUT>	O_UPRI_DEC_PLACE
			単価小数部有効桁数
	<OUT>	O_AMT_DEC_PLACE
			金額小数部有効桁数
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_XRATE_NE (
		I_TRD_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_BASE_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_XRATE_CD	IN	MAPA_META.XRATE_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.MONEY%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		為替レートを取得する
		取得できない場合はNULLを返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_TRD_CUR_CD
			取引通貨ＣＤ
	<IN>	I_BASE_CUR_CD
			基準通貨ＣＤ
	<IN>	I_XRATE_CD
			為替レートＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
			為替レート
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_XRATE (
		I_TRD_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_BASE_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_XRATE_CD	IN	MAPA_META.XRATE_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.MONEY%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		為替レートを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_TRD_CUR_CD
			取引通貨ＣＤ
	<IN>	I_BASE_CUR_CD
			基準通貨ＣＤ
	<IN>	I_XRATE_CD
			為替レートＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
			為替レート
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_XRATE (
		I_TRD_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.MONEY%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引通貨ＣＤから基準通貨ＣＤへ換算する売上為替レートを取得する
	<REMARKS>
		会社マスタから基準通貨ＣＤ、売上為替レートＣＤを取得して計算する
	<ARGUMENTS>
	<IN>	I_TRD_CUR_CD
			取引通貨ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		売上為替レート
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_XRATE_NE (
		I_TRD_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.MONEY%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引通貨ＣＤから基準通貨ＣＤへ換算する売上為替レートを取得する
		取得できない場合はNULLを返す
	<REMARKS>
		会社マスタから基準通貨ＣＤ、売上為替レートＣＤを取得して計算する
	<ARGUMENTS>
	<IN>	I_TRD_CUR_CD
			取引通貨ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		売上為替レート
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PURC_XRATE (
		I_TRD_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.MONEY%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引通貨ＣＤから基準通貨ＣＤへ換算する仕入為替レートを取得する
	<REMARKS>
		会社マスタから基準通貨ＣＤ、仕入為替レートＣＤを取得して計算する
	<ARGUMENTS>
	<IN>	I_TRD_CUR_CD
			取引通貨ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		仕入為替レート
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PURC_XRATE_NE (
		I_TRD_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.MONEY%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引通貨ＣＤから基準通貨ＣＤへ換算する仕入為替レートを取得する
		取得できない場合はNULLを返す
	<REMARKS>
		会社マスタから基準通貨ＣＤ、仕入為替レートＣＤを取得して計算する
	<ARGUMENTS>
	<IN>	I_TRD_CUR_CD
			取引通貨ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		仕入為替レート
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PROV_XRATE (
		I_TRD_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.MONEY%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引通貨ＣＤから基準通貨ＣＤへ換算する支給為替レートを取得する
	<REMARKS>
		会社マスタから基準通貨ＣＤ、支給為替レートＣＤを取得して計算する
	<ARGUMENTS>
	<IN>	I_TRD_CUR_CD
			取引通貨ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		支給為替レート
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PROV_XRATE_NE (
		I_TRD_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.MONEY%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引通貨ＣＤから基準通貨ＣＤへ換算する支給為替レートを取得する
		取得できない場合はNULLを返す
	<REMARKS>
		会社マスタから基準通貨ＣＤ、支給為替レートＣＤを取得して計算する
	<ARGUMENTS>
	<IN>	I_TRD_CUR_CD
			取引通貨ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		支給為替レート
	<HISTORY>
	**********************************************************/

	FUNCTION F_XCHNG (
		I_AMT		IN	MAPA_META.MONEY%TYPE,
		I_XRATE		IN	MAPA_META.MONEY%TYPE,
		I_DEC_PLACE	IN	MAPA_META.DEC_PLACE%TYPE,
		I_XRATE_RND_TYP	IN	MAPA_META.RND_TYP%TYPE
	) RETURN MAPA_META.MONEY%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		為替レート換算した金額を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_AMT
			金額
	<IN>	I_XRATE
			為替レート
	<IN>	I_DEC_PLACE
			小数部有効桁数
	<IN>	I_XRATE_RND_TYP
			為替端数処理区分
	<RETURNVALUE>
			為替レート換算後の金額
	<HISTORY>
	**********************************************************/

	PROCEDURE P_XCHNG (
		I_AMT		IN	MAPA_META.MONEY%TYPE,
		I_TRD_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_BASE_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_XRATE_CD	IN	MAPA_META.XRATE_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE,
		I_DEC_PLACE	IN	MAPA_META.DEC_PLACE%TYPE,
		I_XRATE_RND_TYP	IN	MAPA_META.RND_TYP%TYPE,
		O_BASE_CUR_AMT	OUT	MAPA_META.MONEY%TYPE,
		O_XRATE		OUT	MAPA_META.MONEY%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		為替レート換算した金額及び使用した為替レートを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_AMT
			金額
	<IN>	I_TRD_CUR_CD
			取引通貨ＣＤ
	<IN>	I_BASE_CUR_CD
			基準通貨ＣＤ
	<IN>	I_XRATE_CD
			為替レートＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_DEC_PLACE
			小数部有効桁数
	<IN>	I_XRATE_RND_TYP
			為替端数処理区分
	<OUT>	O_BASE_CUR_AMT
			基準通貨金額
	<OUT>	O_XRATE
			為替レート
	<HISTORY>
	**********************************************************/


END MAPA_XCHNG ;
/
