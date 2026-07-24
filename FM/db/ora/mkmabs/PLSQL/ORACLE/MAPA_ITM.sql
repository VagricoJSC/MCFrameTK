CREATE OR REPLACE PACKAGE MAPA_ITM
/*********************************************************
<Synopsis>
		品目関連ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	FUNCTION F_IS_SLO_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目が受注禁止かどうかを判定する。
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
		1: 受注禁止 / 0: 受注可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_PO_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目が発注禁止かどうかを判定する。
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
		1: 発注禁止 / 0: 発注可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_SLS_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
			品目が売上・出荷禁止かどうかを判定する。
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
		1: 売上・出荷禁止 / 0: 売上・出荷可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_PURC_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
			品目が仕入・入荷禁止かどうかを判定する。
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
			1: 仕入・入荷禁止 / 0: 仕入・入荷可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_ORDER_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
			品目が所要・オーダ禁止かどうかを判定する。
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
		1: 所要・オーダ禁止 / 0: 所要・オーダ可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_MFG_INST_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
			品目が製造指図禁止かどうかを判定する。
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
		1: 製造指図禁止 / 0: 製造指図可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_SHIP_INST_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
			品目が出荷指図禁止かどうかを判定する。
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
		1: 出荷指図禁止 / 0: 出荷指図可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_XFR_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
			品目が移送・移動禁止かどうかを判定する。
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
		1: 移送・移動禁止 / 0: 移送・移動可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_EX_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_CNTRY_CD	IN	MAPA_META.CNTRY_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE;
	/*********************************************************
	<SYNOPSIS>
		品目が輸出禁止かどうかを判定する。
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
	<IN>	I_CNTRY_CD
			国ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		1: 輸出禁止 / 0: 輸出可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_ITM_GRP_CD (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.SLS_ITM_GRP_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
		販売品目体系ＣＤを取得する
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
		販売品目体系ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_DEL_ITM ;
	/*********************************************************
	<SYNOPSIS>
		MAW_ITM_KEYに登録されている品目に対して
		品目マスタのレコードを削除する
	<REMARKS>
	<ARGUMENTS>
	<RETURNVALUE>
	<HISTORY>
	**********************************************************/

END MAPA_ITM ;
/
