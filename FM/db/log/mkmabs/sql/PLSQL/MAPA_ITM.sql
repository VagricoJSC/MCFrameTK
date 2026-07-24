SET SQLBLANKLINES ON

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
show errors;


CREATE OR REPLACE PACKAGE BODY MAPA_ITM
IS
	FUNCTION F_IS_SLO_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_ITM_STOP m
		WHERE	0 = 0
		AND	m.ITM_CD = I_ITM_CD
		AND	m.ITM_SUB1 = I_ITM_SUB1
		AND	m.ITM_SUB2 = I_ITM_SUB2
		AND	m.ITM_SUB3 = I_ITM_SUB3
		AND	m.SLO_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_SLO_STOP ;

	FUNCTION F_IS_PO_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_ITM_STOP m
		WHERE	0 = 0
		AND	m.ITM_CD = I_ITM_CD
		AND	m.ITM_SUB1 = I_ITM_SUB1
		AND	m.ITM_SUB2 = I_ITM_SUB2
		AND	m.ITM_SUB3 = I_ITM_SUB3
		AND	m.PO_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_PO_STOP ;

	FUNCTION F_IS_SLS_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_ITM_STOP m
		WHERE	0 = 0
		AND	m.ITM_CD = I_ITM_CD
		AND	m.ITM_SUB1 = I_ITM_SUB1
		AND	m.ITM_SUB2 = I_ITM_SUB2
		AND	m.ITM_SUB3 = I_ITM_SUB3
		AND	m.SLS_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_SLS_STOP;

	FUNCTION F_IS_PURC_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_ITM_STOP m
		WHERE	0 = 0
		AND	m.ITM_CD = I_ITM_CD
		AND	m.ITM_SUB1 = I_ITM_SUB1
		AND	m.ITM_SUB2 = I_ITM_SUB2
		AND	m.ITM_SUB3 = I_ITM_SUB3
		AND	m.PURC_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_PURC_STOP ;

	FUNCTION F_IS_ORDER_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_ITM_STOP m
		WHERE	0 = 0
		AND	m.ITM_CD = I_ITM_CD
		AND	m.ITM_SUB1 = I_ITM_SUB1
		AND	m.ITM_SUB2 = I_ITM_SUB2
		AND	m.ITM_SUB3 = I_ITM_SUB3
		AND	m.ORDER_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_ORDER_STOP;

	FUNCTION F_IS_MFG_INST_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_ITM_STOP m
		WHERE	0 = 0
		AND	m.ITM_CD = I_ITM_CD
		AND	m.ITM_SUB1 = I_ITM_SUB1
		AND	m.ITM_SUB2 = I_ITM_SUB2
		AND	m.ITM_SUB3 = I_ITM_SUB3
		AND	m.MFG_INST_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_MFG_INST_STOP ;

	FUNCTION F_IS_SHIP_INST_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_ITM_STOP m
		WHERE	0 = 0
		AND	m.ITM_CD = I_ITM_CD
		AND	m.ITM_SUB1 = I_ITM_SUB1
		AND	m.ITM_SUB2 = I_ITM_SUB2
		AND	m.ITM_SUB3 = I_ITM_SUB3
		AND	m.SHIP_INST_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_SHIP_INST_STOP ;

	FUNCTION F_IS_XFR_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_ITM_STOP m
		WHERE	0 = 0
		AND	m.ITM_CD = I_ITM_CD
		AND	m.ITM_SUB1 = I_ITM_SUB1
		AND	m.ITM_SUB2 = I_ITM_SUB2
		AND	m.ITM_SUB3 = I_ITM_SUB3
		AND	m.XFR_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_XFR_STOP ;

	FUNCTION F_IS_EX_STOP (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_CNTRY_CD	IN	MAPA_META.CNTRY_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	<RETURNVALUE>
			1: 輸出禁止 / 0: 輸出可能
	<HISTORY>
	**********************************************************/
	IS
		L_CNT		NUMBER ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_EX_CTRL m
		WHERE	0=0
		AND	m.CNTRY_CD = I_CNTRY_CD
		AND	m.ST_DT <= I_BASE_DT
		AND	m.END_DT >= I_BASE_DT
		AND	m.DEL_FLG = '0'
		AND	EXISTS (
				SELECT	'X'
				FROM	MAM_ITM x
				WHERE	0=0
				AND	x.ITM_CD = I_ITM_CD
				AND	x.ITM_SUB1 = I_ITM_SUB1
				AND	x.ITM_SUB2 = I_ITM_SUB2
				AND	x.ITM_SUB3 = I_ITM_SUB3
				AND	x.HS_CD = m.HS_CD
			)
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_EX_STOP ;

	FUNCTION F_GET_SLS_ITM_GRP_CD (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.SLS_ITM_GRP_CD%TYPE
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
	IS
		L_SLS_ITM_GRP_CD	MAPA_META.SLS_ITM_GRP_CD%TYPE ;
	BEGIN
		L_SLS_ITM_GRP_CD := NULL ;
		FOR x IN (
			SELECT	p.SLS_ITM_GRP_CD
			FROM	(
				SELECT	m.SLS_ITM_GRP_CD,
					99	PRIO
				FROM	MAM_ITM m
				WHERE	0=0
				AND	m.ITM_CD = I_ITM_CD
				AND	m.ITM_SUB1 = I_ITM_SUB1
				AND	m.ITM_SUB2 = I_ITM_SUB2
				AND	m.ITM_SUB3 = I_ITM_SUB3
				UNION ALL
				SELECT	m.SLS_ITM_GRP_CD,
					1	PRIO
				FROM	MAM_ITM_SUB m
				WHERE	0=0
				AND	m.ITM_CD = I_ITM_CD
				AND	m.ITM_SUB1 = I_ITM_SUB1
				AND	m.ITM_SUB2 = I_ITM_SUB2
				AND	m.ITM_SUB3 = I_ITM_SUB3
				AND	m.ST_DT  <= I_BASE_DT
				AND	m.END_DT >= I_BASE_DT
				AND	m.del_flg = '0'
				) p
			WHERE	0=0
			ORDER BY p.PRIO
			)
		LOOP
			L_SLS_ITM_GRP_CD := x.SLS_ITM_GRP_CD ;
			EXIT ;
		END LOOP ;

		RETURN L_SLS_ITM_GRP_CD ;

	END F_GET_SLS_ITM_GRP_CD ;

	PROCEDURE P_DEL_ITM
	/*********************************************************
	<SYNOPSIS>
		MAW_ITM_KEYに登録されている品目に対して
		品目マスタのレコードを削除する
	<REMARKS>
	<ARGUMENTS>
	<RETURNVALUE>
	<HISTORY>
	**********************************************************/
	IS
		L_CNT	NUMBER ;
		L_CO	MAPA_META.CO_CD%TYPE ;

		L_BIND	FCPA_ERR.MSG_BINDER ;
		L_PARM	MAPA_META.PARM_VAL%TYPE ;
	BEGIN
		L_CO := FCPA_CONTEXT.F_GET_CO_CD ;

		SELECT	MAX(m.PARM_VAL)
		INTO	L_PARM
		FROM	MAM_SYS_PARM m
		WHERE	0=0
		AND	m.PARM_KEY = 'ITM_SUB_TYP'
		AND	m.DEL_FLG = '0'
		;

		FOR x1 IN (
			SELECT	/*+ORDERED*/
				m.ITM_CD,
				m.ITM_SUB1,
				m.ITM_SUB2,
				m.ITM_SUB3,
				m.RELEASE_FLG
			FROM	MAW_ITM_KEY w, MAM_ITM_COM m
			WHERE	0=0
			AND	w.ITM_CD = m.ITM_CD
			AND	w.ITM_SUB1 = m.ITM_SUB1
			AND	w.ITM_SUB2 = m.ITM_SUB2
			AND	w.ITM_SUB3 = m.ITM_SUB3
			AND	m.CO_CD = L_CO
			ORDER BY m.ITM_CD, m.ITM_SUB1, m.ITM_SUB2, m.ITM_SUB3
			FOR UPDATE OF m.ITM_CD NOWAIT
			)
		LOOP
			IF x1.RELEASE_FLG = '1' THEN
				L_BIND := FCPA_ERR.MSG_BINDER(MAPA_COMM.F_TO_DISP_ITM(x1.ITM_CD, x1.ITM_SUB1, x1.ITM_SUB2, x1.ITM_SUB3, L_PARM)) ;
				FCPA_ERR.RAISE_APP_ERR('MABCD0001', L_BIND) ;
			END IF ;
		END LOOP ;

		DELETE	MAM_ITM_COM m
		WHERE	0=0
		AND	m.CO_CD = L_CO
		AND	EXISTS (
				SELECT	'X'
				FROM	MAW_ITM_KEY w
				WHERE	0=0
				AND	w.ITM_CD = m.ITM_CD
				AND	w.ITM_SUB1 = m.ITM_SUB1
				AND	w.ITM_SUB2 = m.ITM_SUB2
				AND	w.ITM_SUB3 = m.ITM_SUB3
			)
		;

		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_MST_CTL m
		WHERE	0=0
		AND	m.MST_NM = MAC_MST_NM.MAM_ITM
		AND	m.MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM
		;

		IF L_CNT = 0 THEN
			DELETE	MAM_ITM_CMN_UPD m
			WHERE	0=0
			AND	EXISTS (
					SELECT	'X'
					FROM	MAW_ITM_KEY w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
				)
			;

			DELETE	MAM_ITM_LCL m
			WHERE	0=0
			AND	EXISTS (
					SELECT	'X'
					FROM	MAW_ITM_KEY w
					WHERE	0=0
					AND	w.ITM_CD = m.ITM_CD
					AND	w.ITM_SUB1 = m.ITM_SUB1
					AND	w.ITM_SUB2 = m.ITM_SUB2
					AND	w.ITM_SUB3 = m.ITM_SUB3
				)
			;
		ELSE
			SELECT	COUNT(*)
			INTO	L_CNT
			FROM	MAM_SYS_PARM m
			WHERE	0=0
			AND	m.PARM_KEY = 'ITM_CMN_DEL'
			AND	m.PARM_VAL = '1'
			AND	m.DEL_FLG = '0'
			;

			IF L_CNT > 0 THEN
				FOR y1 IN (
					SELECT	w.*
					FROM	MAW_ITM_KEY w
					WHERE	0=0
					)
				LOOP
					SELECT	COUNT(*)
					INTO	L_CNT
					FROM	MAM_ITM_COM m
					WHERE	0=0
					AND	m.ITM_CD = y1.ITM_CD
					AND	m.ITM_SUB1 = y1.ITM_SUB1
					AND	m.ITM_SUB2 = y1.ITM_SUB2
					AND	m.ITM_SUB3 = y1.ITM_SUB3
					;

					IF L_CNT = 0 THEN
						DELETE	MAM_ITM_CMN_UPD m
						WHERE	0=0
						AND	m.ITM_CD = y1.ITM_CD
						AND	m.ITM_SUB1 = y1.ITM_SUB1
						AND	m.ITM_SUB2 = y1.ITM_SUB2
						AND	m.ITM_SUB3 = y1.ITM_SUB3
						;

						DELETE	MAM_ITM_LCL m
						WHERE	0=0
						AND	m.ITM_CD = y1.ITM_CD
						AND	m.ITM_SUB1 = y1.ITM_SUB1
						AND	m.ITM_SUB2 = y1.ITM_SUB2
						AND	m.ITM_SUB3 = y1.ITM_SUB3
						;
					END IF ;
				END LOOP ;
			END IF ;
		END IF ;

	END P_DEL_ITM ;

END MAPA_ITM ;

/
show errors;


