CREATE OR REPLACE PACKAGE MAPA_TAX
/*********************************************************
<Synopsis>
		税関連ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	FUNCTION F_GET_SLS_TAX_CD (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する売上税コードを返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		売上税ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PURC_TAX_CD (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する仕入税コードを返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		仕入税ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PROV_TAX_CD (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する（有償）支給税コードを返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		支給税ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_WTAX_RATE (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_RATE%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目に対する源泉徴収税率を返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		源泉徴収税率
	<HISTORY>
	**********************************************************/
	FUNCTION F_GET_NEW_SLS_TAX_CD (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する新売上税コードを返す
	<REMARKS>
		基準日から最も近い日で変更される売上税コードを返す
		最も近い日の売上税コードが取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		売上税ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_NEW_SLS_TAX_DT (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.DT%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する新売上税コードが適用される日付を返す
	<REMARKS>
		基準日から最も近い日で変更される売上税コードに対する適用開始日を返す
		最も近い日の売上税コードが取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		適用開始日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_NEW_PURC_TAX_CD (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する新仕入税コードを返す
	<REMARKS>
		基準日から最も近い日で変更される仕入税コードを返す
		最も近い日の仕入税コードが取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		仕入税ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_NEW_PURC_TAX_DT (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.DT%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する新仕入税コードが適用される日付を返す
	<REMARKS>
		基準日から最も近い日で変更される仕入税コードに対する適用開始日を返す
		最も近い日の仕入税コードが取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		適用開始日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_NEW_PROV_TAX_CD (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する新（有償）支給税コードを返す
	<REMARKS>
		基準日から最も近い日で変更される（有償）支給税コードを返す
		最も近い日の（有償）支給税コードが取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		（有償）支給税ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_NEW_PROV_TAX_DT (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.DT%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する新（有償）支給税コードが適用される日付を返す
	<REMARKS>
		基準日から最も近い日で変更される（有償）支給税コードに対する適用開始日を返す
		最も近い日の（有償）支給税コードが取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		適用開始日
	<HISTORY>
	**********************************************************/

END MAPA_TAX ;
/
