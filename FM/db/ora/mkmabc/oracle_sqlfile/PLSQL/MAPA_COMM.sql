SET SQLBLANKLINES ON

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
show errors;


CREATE OR REPLACE PACKAGE BODY MAPA_COMM
IS

	FUNCTION F_GET_INPT_CHK_REC
	(
		I_FUNC_TYP IN MAPA_META.FUNC_TYP%TYPE,
		I_ITM_CD IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1 IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2 IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3 IN MAPA_META.ITM_SUB3%TYPE
	)
	RETURN MAM_INPT_CHK%ROWTYPE
	/*********************************************************
	<SYNOPSIS>
			対象の入力値チェックマスタのレコードを返す。
			品目分類ＣＤ１～１０を順番に比較して最初にマッチしたレコードを返す。
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
	<RETURNVALUE>
			対象の入力値チェックマスタのレコード
	<HISTORY>
	**********************************************************/
	IS
		L_REC MAM_INPT_CHK%ROWTYPE;
		L_REC_ITM MAM_ITM%ROWTYPE;
		
		CURSOR CUR_INPT_CHK IS
   		SELECT * FROM MAM_INPT_CHK
		WHERE 0=0
		AND FUNC_TYP = I_FUNC_TYP
		AND DEL_FLG = '0'
		ORDER BY ITM_GRP_TYP ;

	BEGIN
		SELECT * INTO L_REC_ITM FROM MAM_ITM
		WHERE ITM_CD = I_ITM_CD AND ITM_SUB1 = I_ITM_SUB1 AND ITM_SUB2 = I_ITM_SUB2 AND ITM_SUB3 = I_ITM_SUB3;
	
		FOR L_REC IN CUR_INPT_CHK LOOP
			IF L_REC.ITM_GRP_TYP = MAC_ITM_GRP_TYP.GRP1 THEN
				IF L_REC.ITM_GRP_CD = L_REC_ITM.ITM_GRP_CD1 THEN RETURN L_REC ; END IF;
			ELSIF L_REC.ITM_GRP_TYP = MAC_ITM_GRP_TYP.GRP2 THEN
				IF L_REC.ITM_GRP_CD = L_REC_ITM.ITM_GRP_CD2 THEN RETURN L_REC ; END IF;
			ELSIF L_REC.ITM_GRP_TYP = MAC_ITM_GRP_TYP.GRP3 THEN
				IF L_REC.ITM_GRP_CD = L_REC_ITM.ITM_GRP_CD3 THEN RETURN L_REC ; END IF;
			ELSIF L_REC.ITM_GRP_TYP = MAC_ITM_GRP_TYP.GRP4 THEN
				IF L_REC.ITM_GRP_CD = L_REC_ITM.ITM_GRP_CD4 THEN RETURN L_REC ; END IF;
			ELSIF L_REC.ITM_GRP_TYP = MAC_ITM_GRP_TYP.GRP5 THEN
				IF L_REC.ITM_GRP_CD = L_REC_ITM.ITM_GRP_CD5 THEN RETURN L_REC ; END IF;
			ELSIF L_REC.ITM_GRP_TYP = MAC_ITM_GRP_TYP.GRP6 THEN
				IF L_REC.ITM_GRP_CD = L_REC_ITM.ITM_GRP_CD6 THEN RETURN L_REC ; END IF;
			ELSIF L_REC.ITM_GRP_TYP = MAC_ITM_GRP_TYP.GRP7 THEN
				IF L_REC.ITM_GRP_CD = L_REC_ITM.ITM_GRP_CD7 THEN RETURN L_REC ; END IF;
			ELSIF L_REC.ITM_GRP_TYP = MAC_ITM_GRP_TYP.GRP8 THEN
				IF L_REC.ITM_GRP_CD = L_REC_ITM.ITM_GRP_CD8 THEN RETURN L_REC ; END IF;
			ELSIF L_REC.ITM_GRP_TYP = MAC_ITM_GRP_TYP.GRP9 THEN
				IF L_REC.ITM_GRP_CD = L_REC_ITM.ITM_GRP_CD9 THEN RETURN L_REC ; END IF;
			ELSIF L_REC.ITM_GRP_TYP = MAC_ITM_GRP_TYP.GRP10 THEN
				IF L_REC.ITM_GRP_CD = L_REC_ITM.ITM_GRP_CD10 THEN RETURN L_REC ; END IF;
			END IF;
		END LOOP;
		RETURN NULL;
	END F_GET_INPT_CHK_REC;

	PROCEDURE P_INPT_CHK_NE
	(
		I_FUNC_TYP IN MAPA_META.FUNC_TYP%TYPE,
		I_ITM_CD IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1 IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2 IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3 IN MAPA_META.ITM_SUB3%TYPE,
		O_UP_RATE_LMT OUT MAPA_META.RATE_LMT%TYPE,
		O_LOW_RATE_LMT OUT MAPA_META.RATE_LMT%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
			対象の入力値チェックマスタの予実比上限・下限を返す。
			対象のレコードが見つからない場合はNULLまたは'0'（ＦＬＧ型の場合）を返す。
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
	IS
		L_REC MAM_INPT_CHK%ROWTYPE;
	BEGIN
		L_REC := F_GET_INPT_CHK_REC(I_FUNC_TYP, I_ITM_CD, I_ITM_SUB1, I_ITM_SUB2, I_ITM_SUB3);

		O_UP_RATE_LMT := L_REC.UP_RATE_LMT;
		O_LOW_RATE_LMT := L_REC.LOW_RATE_LMT;
	EXCEPTION
		WHEN OTHERS THEN
			RETURN;
	END P_INPT_CHK_NE;

	FUNCTION F_TO_DISP_ITM (
		I_ITM_CD		IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1		IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2		IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3		IN	MAPA_META.ITM_SUB3%TYPE,
		I_ITM_SUB_TYP	IN	MAPA_META.PARM_VAL%TYPE
	) RETURN VARCHAR2
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
	IS
		L_ITM_SUB_TYP	INTEGER;
		L_DISP_ITM		VARCHAR2(1000);
	BEGIN
		L_ITM_SUB_TYP := TO_NUMBER(I_ITM_SUB_TYP);

		IF L_ITM_SUB_TYP < 0 OR L_ITM_SUB_TYP > 3 THEN
			L_ITM_SUB_TYP := 0;
		END IF;

		L_DISP_ITM := I_ITM_CD;

		IF L_ITM_SUB_TYP > 0 THEN
			L_DISP_ITM := L_DISP_ITM || MAC_STR.DISP_ITM_DLM1 || I_ITM_SUB1;
		END IF;

		IF L_ITM_SUB_TYP > 1 THEN
			L_DISP_ITM := L_DISP_ITM || MAC_STR.DISP_ITM_DLM2 || I_ITM_SUB2;
		END IF;

		IF L_ITM_SUB_TYP > 2 THEN
			L_DISP_ITM := L_DISP_ITM || MAC_STR.DISP_ITM_DLM3 || I_ITM_SUB3;
		END IF;

		RETURN L_DISP_ITM;
	EXCEPTION
		WHEN value_error THEN
			RETURN I_ITM_CD;
	END F_TO_DISP_ITM;

	FUNCTION F_TO_DISP_SNO (
		I_SNO1		IN	MAPA_META.SNO1%TYPE,
		I_SNO2		IN	MAPA_META.SNO2%TYPE,
		I_SNO3		IN	MAPA_META.SNO3%TYPE,
		I_SNO4		IN	MAPA_META.SNO4%TYPE,
		I_SNO_TYP	IN	MAPA_META.PARM_VAL%TYPE
	) RETURN VARCHAR2
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
	IS
		L_SNO_TYP	INTEGER;
		L_DISP_SNO	VARCHAR2(1000);
	BEGIN
		L_SNO_TYP := TO_NUMBER(I_SNO_TYP);

		IF L_SNO_TYP < 0 OR L_SNO_TYP > 4 THEN
			L_SNO_TYP := 0;
		END IF;

		IF L_SNO_TYP > 0 THEN
			L_DISP_SNO := I_SNO1;
		END IF;

		IF L_SNO_TYP > 1 THEN
			L_DISP_SNO := L_DISP_SNO || MAC_STR.DISP_SNO_DLM1  || I_SNO2;
		END IF;

		IF L_SNO_TYP > 2 THEN
			L_DISP_SNO := L_DISP_SNO || MAC_STR.DISP_SNO_DLM2  || I_SNO3;
		END IF;

		IF L_SNO_TYP > 3 THEN
			L_DISP_SNO := L_DISP_SNO || MAC_STR.DISP_SNO_DLM3  || I_SNO4;
		END IF;

		RETURN L_DISP_SNO;
	EXCEPTION
		WHEN value_error THEN
			RETURN NULL;
	END F_TO_DISP_SNO;

	FUNCTION F_GET_PARM (
		I_PARM_KEY	IN	MAPA_META.PARM_KEY%TYPE
		)
	RETURN MAPA_META.PARM_VAL%TYPE
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
	IS
		L_PARM_VAL	MAPA_META.PARM_VAL%TYPE ;
	BEGIN
		SELECT	MAX(m.PARM_VAL)
		INTO	L_PARM_VAL
		FROM	MAM_SYS_PARM m
		WHERE	0=0
		AND	m.PARM_KEY = I_PARM_KEY
		AND	m.DEL_FLG = '0'
		;

		RETURN L_PARM_VAL ;
	END F_GET_PARM;

	PROCEDURE P_SPLIT_DISP_ITM (
		I_DISP_ITM	IN	VARCHAR2,
		O_ITM_CD	OUT	MAPA_META.ITM_CD%TYPE,
		O_ITM_SUB1	OUT	MAPA_META.ITM_SUB1%TYPE,
		O_ITM_SUB2	OUT	MAPA_META.ITM_SUB2%TYPE,
		O_ITM_SUB3	OUT	MAPA_META.ITM_SUB3%TYPE
	)
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
	IS
		L_ITM_DLM1	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.DISP_ITM_DLM1 ;
		L_ITM_DLM2	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.DISP_ITM_DLM2 ;
		L_ITM_DLM3	CONSTANT MAPA_META.STR20%TYPE := MAC_STR.DISP_ITM_DLM3 ;

		L_DLM1_PSTN	NUMBER(3) ;
		L_DLM2_PSTN	NUMBER(3) ;
		L_DLM3_PSTN	NUMBER(3) ;
		L_SUB1_ST_PSTN	NUMBER(3) ;
		L_SUB2_ST_PSTN	NUMBER(3) ;
		L_SUB3_ST_PSTN	NUMBER(3) ;
	BEGIN
		IF I_DISP_ITM IS NULL THEN
			O_ITM_CD := NULL ;
			O_ITM_SUB1 := NULL ;
			O_ITM_SUB2 := NULL ;
			O_ITM_SUB3 := NULL ;
			RETURN ;
		END IF ;

		L_DLM1_PSTN := INSTR(I_DISP_ITM, L_ITM_DLM1, 1) ;
		IF L_DLM1_PSTN < 1 THEN
			O_ITM_CD := I_DISP_ITM ;
			O_ITM_SUB1 := NULL ;
			O_ITM_SUB2 := NULL ;
			O_ITM_SUB3 := NULL ;
			RETURN ;
		END IF ;

		L_SUB1_ST_PSTN := L_DLM1_PSTN + LENGTH(L_ITM_DLM1) ;

		L_DLM2_PSTN := INSTR(I_DISP_ITM, L_ITM_DLM2, L_SUB1_ST_PSTN) ;
		IF L_DLM2_PSTN < 1 THEN
			O_ITM_CD := SUBSTR(I_DISP_ITM, 1, L_DLM1_PSTN - 1) ;
			O_ITM_SUB1 := SUBSTR(I_DISP_ITM, L_SUB1_ST_PSTN) ;
			O_ITM_SUB2 := NULL ;
			O_ITM_SUB3 := NULL ;
			RETURN ;
		END IF ;

		L_SUB2_ST_PSTN := L_DLM2_PSTN + LENGTH(L_ITM_DLM2) ;

		L_DLM3_PSTN := INSTR(I_DISP_ITM, L_ITM_DLM3, L_SUB2_ST_PSTN) ;
		IF L_DLM3_PSTN < 1 THEN
			O_ITM_CD := SUBSTR(I_DISP_ITM, 1, L_DLM1_PSTN - 1) ;
			O_ITM_SUB1 := SUBSTR(I_DISP_ITM, L_SUB1_ST_PSTN, L_DLM2_PSTN - L_SUB1_ST_PSTN) ;
			O_ITM_SUB2 := SUBSTR(I_DISP_ITM, L_SUB2_ST_PSTN) ;
			O_ITM_SUB3 := NULL ;
			RETURN ;
		END IF;

		L_SUB3_ST_PSTN := L_DLM3_PSTN + LENGTH(L_ITM_DLM3) ;

		O_ITM_CD := SUBSTR(I_DISP_ITM, 1, L_DLM1_PSTN - 1) ;
		O_ITM_SUB1 := SUBSTR(I_DISP_ITM, L_SUB1_ST_PSTN, L_DLM2_PSTN - L_SUB1_ST_PSTN) ;
		O_ITM_SUB2 := SUBSTR(I_DISP_ITM, L_SUB2_ST_PSTN, L_DLM3_PSTN - L_SUB2_ST_PSTN) ;
		O_ITM_SUB3 := SUBSTR(I_DISP_ITM, L_SUB3_ST_PSTN) ;

	END P_SPLIT_DISP_ITM ;

	FUNCTION F_TO_ITM_CD (
		I_DISP_ITM	IN	VARCHAR2
	) RETURN MAPA_META.ITM_CD%TYPE
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
	IS
		L_ITM_CD	MAPA_META.ITM_CD%TYPE ;
		L_ITM_SUB1	MAPA_META.ITM_SUB1%TYPE ;
		L_ITM_SUB2	MAPA_META.ITM_SUB2%TYPE ;
		L_ITM_SUB3	MAPA_META.ITM_SUB3%TYPE ;
	BEGIN
		P_SPLIT_DISP_ITM(I_DISP_ITM, L_ITM_CD, L_ITM_SUB1, L_ITM_SUB2, L_ITM_SUB3) ;

		RETURN L_ITM_CD ;

	END F_TO_ITM_CD ;

	FUNCTION F_TO_ITM_SUB1 (
		I_DISP_ITM	IN	VARCHAR2
	) RETURN  MAPA_META.ITM_SUB1%TYPE
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
	IS
		L_ITM_CD	MAPA_META.ITM_CD%TYPE ;
		L_ITM_SUB1	MAPA_META.ITM_SUB1%TYPE ;
		L_ITM_SUB2	MAPA_META.ITM_SUB2%TYPE ;
		L_ITM_SUB3	MAPA_META.ITM_SUB3%TYPE ;
	BEGIN
		P_SPLIT_DISP_ITM(I_DISP_ITM, L_ITM_CD, L_ITM_SUB1, L_ITM_SUB2, L_ITM_SUB3) ;

		RETURN L_ITM_SUB1 ;

	END F_TO_ITM_SUB1 ;

	FUNCTION F_TO_ITM_SUB2 (
		I_DISP_ITM	IN	VARCHAR2
	) RETURN  MAPA_META.ITM_SUB2%TYPE
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
	IS
		L_ITM_CD	MAPA_META.ITM_CD%TYPE ;
		L_ITM_SUB1	MAPA_META.ITM_SUB1%TYPE ;
		L_ITM_SUB2	MAPA_META.ITM_SUB2%TYPE ;
		L_ITM_SUB3	MAPA_META.ITM_SUB3%TYPE ;
	BEGIN
		P_SPLIT_DISP_ITM(I_DISP_ITM, L_ITM_CD, L_ITM_SUB1, L_ITM_SUB2, L_ITM_SUB3) ;

		RETURN L_ITM_SUB2 ;

	END F_TO_ITM_SUB2 ;

	FUNCTION F_TO_ITM_SUB3 (
		I_DISP_ITM	IN	VARCHAR2
	) RETURN MAPA_META.ITM_SUB3%TYPE
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
	IS
		L_ITM_CD	MAPA_META.ITM_CD%TYPE ;
		L_ITM_SUB1	MAPA_META.ITM_SUB1%TYPE ;
		L_ITM_SUB2	MAPA_META.ITM_SUB2%TYPE ;
		L_ITM_SUB3	MAPA_META.ITM_SUB3%TYPE ;
	BEGIN
		P_SPLIT_DISP_ITM(I_DISP_ITM, L_ITM_CD, L_ITM_SUB1, L_ITM_SUB2, L_ITM_SUB3) ;

		RETURN L_ITM_SUB3 ;

	END F_TO_ITM_SUB3 ;

END MAPA_COMM;

/
show errors;


