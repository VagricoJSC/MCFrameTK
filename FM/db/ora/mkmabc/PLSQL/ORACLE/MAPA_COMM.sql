CREATE OR REPLACE PACKAGE MAPA_COMM
/*********************************************************
<SYNOPSIS>
	共通ユーティリティ
<REMARKS>
<ARGUMENTS>
*********************************************************/
IS

	PROCEDURE P_INPT_CHK_NE
	(
		I_FUNC_TYP IN MAPA_META.FUNC_TYP%TYPE,
		I_ITM_CD IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1 IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2 IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3 IN MAPA_META.ITM_SUB3%TYPE,
		O_UP_RATE_LMT OUT MAPA_META.RATE_LMT%TYPE,
		O_LOW_RATE_LMT OUT MAPA_META.RATE_LMT%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
			入力値チェックマスタの予実比上限・下限を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_FUNC_TYP
			機能区分
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<OUT>	O_UP_RATE_LMT
			予実比上限
	<OUT>	O_LOW_RATE_LMT
			予実比下限
	<HISTORY>
	**********************************************************/

	FUNCTION F_TO_DISP_ITM (
		I_ITM_CD		IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1		IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2		IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3		IN	MAPA_META.ITM_SUB3%TYPE,
		I_ITM_SUB_TYP	IN	MAPA_META.PARM_VAL%TYPE
	) RETURN VARCHAR2;
	/*********************************************************
	<SYNOPSIS>
			品目ＣＤ、枝番１～３から表示用の品目情報を返す。
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
	<IN>	I_ITM_SUB_TYP
			システムパラメータ「ITM_SUB_TYP」
	<RETURNVALUE>
			表示用の品目情報
	<HISTORY>
	**********************************************************/

	FUNCTION F_TO_DISP_SNO (
		I_SNO1		IN	MAPA_META.SNO1%TYPE,
		I_SNO2		IN	MAPA_META.SNO2%TYPE,
		I_SNO3		IN	MAPA_META.SNO3%TYPE,
		I_SNO4		IN	MAPA_META.SNO4%TYPE,
		I_SNO_TYP	IN	MAPA_META.PARM_VAL%TYPE
	) RETURN VARCHAR2;
	/*********************************************************
	<SYNOPSIS>
			手配ＮＯ１～４から表示用の手配ＮＯ情報を返す。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_SNO1
			手配ＮＯ１
	<IN>	I_SNO2
			手配ＮＯ２
	<IN>	I_SNO3
			手配ＮＯ３
	<IN>	I_SNO4
			手配ＮＯ３
	<IN>	I_SNO_TYP
			システムパラメータ「SNO_TYP」
	<RETURNVALUE>
			表示用の手配ＮＯ情報
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PARM (
		I_PARM_KEY	IN	MAPA_META.PARM_KEY%TYPE
		)
	RETURN MAPA_META.PARM_VAL%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		システムパラメータマスタに設定されている値を返す
	<REMARKS>
	
	<ARGUMENTS>
	<IN>	I_PARM_KEY
			パラメータキー
	<RETURNVALUE>
		パラメータキーに対する値
	<HISTORY>
	**********************************************************/
	PROCEDURE P_SPLIT_DISP_ITM (
		I_DISP_ITM	IN	VARCHAR2,
		O_ITM_CD	OUT	MAPA_META.ITM_CD%TYPE,
		O_ITM_SUB1	OUT	MAPA_META.ITM_SUB1%TYPE,
		O_ITM_SUB2	OUT	MAPA_META.ITM_SUB2%TYPE,
		O_ITM_SUB3	OUT	MAPA_META.ITM_SUB3%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		品目ＣＤ:枝番１:枝番２:枝番３を
		品目ＣＤ、枝番１、枝番２、枝番３に変換する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DISP_ITM
			品目ＣＤ:枝番１:枝番２:枝番３
	<OUT>	O_ITM_CD
			品目ＣＤ
	<OUT>	O_ITM_SUB1
			枝番１
	<OUT>	O_ITM_SUB2
			枝番２
	<OUT>	O_ITM_SUB3
			枝番３
	<HISTORY>
	**********************************************************/

	FUNCTION F_TO_ITM_CD (
		I_DISP_ITM	IN	VARCHAR2
	) RETURN MAPA_META.ITM_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目ＣＤ:枝番１:枝番２:枝番３から品目ＣＤを取り出す。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DISP_ITM
			品目ＣＤ:枝番１:枝番２:枝番３
	<RETURNVALUE>
			品目ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_TO_ITM_SUB1 (
		I_DISP_ITM	IN	VARCHAR2
	) RETURN  MAPA_META.ITM_SUB1%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目ＣＤ:枝番１:枝番２:枝番３から枝番１を取り出す。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DISP_ITM
			品目ＣＤ:枝番１:枝番２:枝番３
	<RETURNVALUE>
			枝番１
	<HISTORY>
	**********************************************************/

	FUNCTION F_TO_ITM_SUB2 (
		I_DISP_ITM	IN	VARCHAR2
	) RETURN  MAPA_META.ITM_SUB2%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目ＣＤ:枝番１:枝番２:枝番３から枝番２を取り出す。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DISP_ITM
			品目ＣＤ:枝番１:枝番２:枝番３
	<RETURNVALUE>
			枝番２
	<HISTORY>
	**********************************************************/

	FUNCTION F_TO_ITM_SUB3 (
		I_DISP_ITM	IN	VARCHAR2
	) RETURN MAPA_META.ITM_SUB3%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		品目ＣＤ:枝番１:枝番２:枝番３から枝番３を取り出す。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DISP_ITM
			品目ＣＤ:枝番１:枝番２:枝番３
	<RETURNVALUE>
			枝番３
	<HISTORY>
	**********************************************************/

END MAPA_COMM;
/
