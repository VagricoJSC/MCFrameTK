CREATE OR REPLACE FUNCTION mapa_comm$f_get_inpt_chk_rec(
	 IN i_func_typ VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR
)
RETURNS mam_inpt_chk
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		対象の入力値チェックマスタのレコードを返す。
		品目分類ＣＤ１～１０を順番に比較して最初にマッチしたレコードを返す。
<REMARKS>
<ARGUMENTS>
<IN>	i_func_typ
		機能区分
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<RETURNVALUE>
		対象の入力値チェックマスタのレコード
<HISTORY>
**********************************************************/
DECLARE
	l_rec mam_inpt_chk%ROWTYPE;
	l_rec_itm mam_itm%ROWTYPE;

	cur_inpt_chk CURSOR FOR
	SELECT	*
	FROM	mam_inpt_chk
	WHERE	0=0
	AND	func_typ = i_func_typ
	AND	del_flg = '0'
	ORDER BY itm_grp_typ
	;

BEGIN
	SELECT	*
	INTO	STRICT l_rec_itm
	FROM	mam_itm
	WHERE	itm_cd = i_itm_cd
	AND	itm_sub1 = i_itm_sub1
	AND	itm_sub2 = i_itm_sub2
	AND	itm_sub3 = i_itm_sub3
	;

	FOR l_rec IN cur_inpt_chk LOOP
		IF l_rec.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP1') THEN
			IF l_rec.itm_grp_cd = l_rec_itm.itm_grp_cd1 THEN RETURN l_rec; END IF;
		ELSIF l_rec.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP2') THEN
			IF l_rec.itm_grp_cd = l_rec_itm.itm_grp_cd2 THEN RETURN l_rec; END IF;
		ELSIF l_rec.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP3') THEN
			IF l_rec.itm_grp_cd = l_rec_itm.itm_grp_cd3 THEN RETURN l_rec; END IF;
		ELSIF l_rec.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP4') THEN
			IF l_rec.itm_grp_cd = l_rec_itm.itm_grp_cd4 THEN RETURN l_rec; END IF;
		ELSIF l_rec.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP5') THEN
			IF l_rec.itm_grp_cd = l_rec_itm.itm_grp_cd5 THEN RETURN l_rec; END IF;
		ELSIF l_rec.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP6') THEN
			IF l_rec.itm_grp_cd = l_rec_itm.itm_grp_cd6 THEN RETURN l_rec; END IF;
		ELSIF l_rec.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP7') THEN
			IF l_rec.itm_grp_cd = l_rec_itm.itm_grp_cd7 THEN RETURN l_rec; END IF;
		ELSIF l_rec.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP8') THEN
			IF l_rec.itm_grp_cd = l_rec_itm.itm_grp_cd8 THEN RETURN l_rec; END IF;
		ELSIF l_rec.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP9') THEN
			IF l_rec.itm_grp_cd = l_rec_itm.itm_grp_cd9 THEN RETURN l_rec; END IF;
		ELSIF l_rec.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP10') THEN
			IF l_rec.itm_grp_cd = l_rec_itm.itm_grp_cd10 THEN RETURN l_rec; END IF;
		END IF;
	END LOOP;
	RETURN NULL;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_comm$p_inpt_chk_ne(
	 IN i_func_typ VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 INOUT o_up_rate_lmt NUMERIC,
	 INOUT o_low_rate_lmt NUMERIC
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		対象の入力値チェックマスタの予実比上限・下限を返す。
		対象のレコードが見つからない場合はNULLまたは'0'（ＦＬＧ型の場合）を返す。
<REMARKS>
<ARGUMENTS>
<IN>	i_func_typ
		機能区分
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<OUT>	o_up_rate_lmt
		予実比上限
<OUT>	o_low_rate_lmt
		予実比下限
<HISTORY>
**********************************************************/
DECLARE
	l_rec mam_inpt_chk%ROWTYPE;
BEGIN
	l_rec := mapa_comm$f_get_inpt_chk_rec(i_func_typ, i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3);
	o_up_rate_lmt := l_rec.up_rate_lmt;
	o_low_rate_lmt := l_rec.low_rate_lmt;
EXCEPTION
	WHEN others THEN
		RETURN;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_comm$f_to_disp_itm(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_itm_sub_typ VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		品目ＣＤ、枝番１～３から表示用の品目情報を返す。
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_itm_sub_typ
		システムパラメータ「ITM_SUB_TYP」
<RETURNVALUE>
		表示用の品目情報
<HISTORY>
**********************************************************/
DECLARE
	l_itm_sub_typ INTEGER;
	l_disp_itm VARCHAR(1000);
BEGIN
	l_itm_sub_typ := i_itm_sub_typ::INTEGER;

	IF l_itm_sub_typ < 0 OR l_itm_sub_typ > 3 THEN
		l_itm_sub_typ := 0;
	END IF;
	l_disp_itm := i_itm_cd;

	IF l_itm_sub_typ > 0 THEN
		l_disp_itm := CONCAT_WS(fcpa_const$get_const_val('MAC_STR','DISP_ITM_DLM1'), l_disp_itm, i_itm_sub1);
	END IF;

	IF l_itm_sub_typ > 1 THEN
		l_disp_itm := CONCAT_WS(fcpa_const$get_const_val('MAC_STR','DISP_ITM_DLM2'), l_disp_itm, i_itm_sub2);
	END IF;

	IF l_itm_sub_typ > 2 THEN
		l_disp_itm := CONCAT_WS(fcpa_const$get_const_val('MAC_STR','DISP_ITM_DLM3'), l_disp_itm, i_itm_sub3);
	END IF;

	RETURN l_disp_itm;
EXCEPTION
	WHEN data_exception THEN
		RETURN i_itm_cd;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_comm$f_to_disp_sno(
	 IN i_sno1 VARCHAR,
	 IN i_sno2 VARCHAR,
	 IN i_sno3 VARCHAR,
	 IN i_sno4 VARCHAR,
	 IN i_sno_typ VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		手配ＮＯ１～４から表示用の手配ＮＯ情報を返す。
<REMARKS>
<ARGUMENTS>
<IN>	i_sno1
		手配ＮＯ１
<IN>	i_sno2
		手配ＮＯ２
<IN>	i_sno3
		手配ＮＯ３
<IN>	i_sno4
		手配ＮＯ３
<IN>	i_sno_typ
		システムパラメータ「SNO_TYP」
<RETURNVALUE>
		表示用の手配ＮＯ情報
<HISTORY>
**********************************************************/
DECLARE
	l_sno_typ INTEGER;
	l_disp_sno VARCHAR(1000);
BEGIN
	l_sno_typ := i_sno_typ::INTEGER;

	IF l_sno_typ < 0 OR l_sno_typ > 4 THEN
		l_sno_typ := 0;
	END IF;

	IF l_sno_typ > 0 THEN
		l_disp_sno := i_sno1;
	END IF;

	IF l_sno_typ > 1 THEN
		l_disp_sno := CONCAT_WS(fcpa_const$get_const_val('MAC_STR','DISP_SNO_DLM1'), l_disp_sno, i_sno2);
	END IF;

	IF l_sno_typ > 2 THEN
		l_disp_sno := CONCAT_WS(fcpa_const$get_const_val('MAC_STR','DISP_SNO_DLM2'), l_disp_sno, i_sno3);
	END IF;

	IF l_sno_typ > 3 THEN
		l_disp_sno := CONCAT_WS(fcpa_const$get_const_val('MAC_STR','DISP_SNO_DLM3'), l_disp_sno, i_sno4);
	END IF;
	RETURN l_disp_sno;
EXCEPTION
	WHEN data_exception THEN
		RETURN NULL;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_comm$f_get_parm(
	 IN i_parm_key VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	システムパラメータマスタに設定されている値を返す
<REMARKS>

<ARGUMENTS>
<IN>	i_parm_key
		パラメータキー
<RETURNVALUE>
	パラメータキーに対する値
<HISTORY>
**********************************************************/
DECLARE
	l_parm_val mam_sys_parm.parm_val%TYPE;
BEGIN
	SELECT	MAX(m.parm_val)
	INTO	STRICT l_parm_val
	FROM	mam_sys_parm m
	WHERE	0=0
	AND	m.parm_key = i_parm_key
	AND	m.del_flg = '0'
	;

	RETURN l_parm_val;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_comm$p_split_disp_itm(
	 IN i_disp_itm VARCHAR,
	 INOUT o_itm_cd VARCHAR,
	 INOUT o_itm_sub1 VARCHAR,
	 INOUT o_itm_sub2 VARCHAR,
	 INOUT o_itm_sub3 VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目ＣＤ:枝番１:枝番２:枝番３を
	品目ＣＤ、枝番１、枝番２、枝番３に変換する。
<REMARKS>
<ARGUMENTS>
<IN>	i_disp_itm
		品目ＣＤ:枝番１:枝番２:枝番３
<OUT>	o_itm_cd
		品目ＣＤ
<OUT>	o_itm_sub1
		枝番１
<OUT>	o_itm_sub2
		枝番２
<OUT>	o_itm_sub3
		枝番３
<HISTORY>
**********************************************************/
DECLARE
	c_itm_dlm1 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','DISP_ITM_DLM1');
	c_itm_dlm2 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','DISP_ITM_DLM2');
	c_itm_dlm3 CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','DISP_ITM_DLM3');

	l_dlm1_pstn NUMERIC(3);
	l_dlm2_pstn NUMERIC(3);
	l_dlm3_pstn NUMERIC(3);
	l_sub1_st_pstn NUMERIC(3);
	l_sub2_st_pstn NUMERIC(3);
	l_sub3_st_pstn NUMERIC(3);
BEGIN
	IF i_disp_itm IS NULL THEN
		o_itm_cd := NULL;
		o_itm_sub1 := NULL;
		o_itm_sub2 := NULL;
		o_itm_sub3 := NULL;
		RETURN;
	END IF;

	l_dlm1_pstn := fcpa_postgres_util$instr(i_disp_itm, c_itm_dlm1, 1);
	IF l_dlm1_pstn < 1 THEN
		o_itm_cd := i_disp_itm;
		o_itm_sub1 := NULL;
		o_itm_sub2 := NULL;
		o_itm_sub3 := NULL;
		RETURN;
	END IF;

	l_sub1_st_pstn := l_dlm1_pstn + LENGTH(c_itm_dlm1);

	l_dlm2_pstn := fcpa_postgres_util$instr(i_disp_itm, c_itm_dlm2, TRUNC(l_sub1_st_pstn)::INT);
	IF l_dlm2_pstn < 1 THEN
		o_itm_cd := fcpa_postgres_util$substr(i_disp_itm, 1, l_dlm1_pstn - 1);
		o_itm_sub1 := fcpa_postgres_util$substr(i_disp_itm, l_sub1_st_pstn);
		o_itm_sub2 := NULL;
		o_itm_sub3 := NULL;
		RETURN;
	END IF;

	l_sub2_st_pstn := l_dlm2_pstn + LENGTH(c_itm_dlm2);

	l_dlm3_pstn := fcpa_postgres_util$instr(i_disp_itm, c_itm_dlm3, TRUNC(l_sub2_st_pstn)::INT);
	IF l_dlm3_pstn < 1 THEN
		o_itm_cd := fcpa_postgres_util$substr(i_disp_itm, 1, l_dlm1_pstn - 1);
		o_itm_sub1 := fcpa_postgres_util$substr(i_disp_itm, l_sub1_st_pstn, l_dlm2_pstn - l_sub1_st_pstn);
		o_itm_sub2 := fcpa_postgres_util$substr(i_disp_itm, l_sub2_st_pstn);
		o_itm_sub3 := NULL;
		RETURN;
	END IF;

	l_sub3_st_pstn := l_dlm3_pstn + LENGTH(c_itm_dlm3);

	o_itm_cd := fcpa_postgres_util$substr(i_disp_itm, 1, l_dlm1_pstn - 1);
	o_itm_sub1 := fcpa_postgres_util$substr(i_disp_itm, l_sub1_st_pstn, l_dlm2_pstn - l_sub1_st_pstn);
	o_itm_sub2 := fcpa_postgres_util$substr(i_disp_itm, l_sub2_st_pstn, l_dlm3_pstn - l_sub2_st_pstn);
	o_itm_sub3 := fcpa_postgres_util$substr(i_disp_itm, l_sub3_st_pstn);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_comm$f_to_itm_cd(
	 IN i_disp_itm VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目ＣＤ:枝番１:枝番２:枝番３から品目ＣＤを取り出す。
<REMARKS>
<ARGUMENTS>
<IN>	i_disp_itm
		品目ＣＤ:枝番１:枝番２:枝番３
<RETURNVALUE>
		品目ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_itm_cd mam_itm.itm_cd%TYPE;
	l_itm_sub1 mam_itm.itm_sub1%TYPE;
	l_itm_sub2 mam_itm.itm_sub2%TYPE;
	l_itm_sub3 mam_itm.itm_sub3%TYPE;
BEGIN
	CALL mapa_comm$p_split_disp_itm(i_disp_itm, l_itm_cd, l_itm_sub1, l_itm_sub2, l_itm_sub3);

	RETURN l_itm_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_comm$f_to_itm_sub1(
	 IN i_disp_itm VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目ＣＤ:枝番１:枝番２:枝番３から枝番１を取り出す。
<REMARKS>
<ARGUMENTS>
<IN>	i_disp_itm
		品目ＣＤ:枝番１:枝番２:枝番３
<RETURNVALUE>
		枝番１
<HISTORY>
**********************************************************/
DECLARE
	l_itm_cd mam_itm.itm_cd%TYPE;
	l_itm_sub1 mam_itm.itm_sub1%TYPE;
	l_itm_sub2 mam_itm.itm_sub2%TYPE;
	l_itm_sub3 mam_itm.itm_sub3%TYPE;
BEGIN
	CALL mapa_comm$p_split_disp_itm(i_disp_itm, l_itm_cd, l_itm_sub1, l_itm_sub2, l_itm_sub3);

	RETURN l_itm_sub1;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_comm$f_to_itm_sub2(
	 IN i_disp_itm VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目ＣＤ:枝番１:枝番２:枝番３から枝番２を取り出す。
<REMARKS>
<ARGUMENTS>
<IN>	i_disp_itm
		品目ＣＤ:枝番１:枝番２:枝番３
<RETURNVALUE>
		枝番２
<HISTORY>
**********************************************************/
DECLARE
	l_itm_cd mam_itm.itm_cd%TYPE;
	l_itm_sub1 mam_itm.itm_sub1%TYPE;
	l_itm_sub2 mam_itm.itm_sub2%TYPE;
	l_itm_sub3 mam_itm.itm_sub3%TYPE;
BEGIN
	CALL mapa_comm$p_split_disp_itm(i_disp_itm, l_itm_cd, l_itm_sub1, l_itm_sub2, l_itm_sub3);

	RETURN l_itm_sub2;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_comm$f_to_itm_sub3(
	 IN i_disp_itm VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目ＣＤ:枝番１:枝番２:枝番３から枝番３を取り出す。
<REMARKS>
<ARGUMENTS>
<IN>	i_disp_itm
		品目ＣＤ:枝番１:枝番２:枝番３
<RETURNVALUE>
		枝番３
<HISTORY>
**********************************************************/
DECLARE
	l_itm_cd mam_itm.itm_cd%TYPE;
	l_itm_sub1 mam_itm.itm_sub1%TYPE;
	l_itm_sub2 mam_itm.itm_sub2%TYPE;
	l_itm_sub3 mam_itm.itm_sub3%TYPE;
BEGIN
	CALL mapa_comm$p_split_disp_itm(i_disp_itm, l_itm_cd, l_itm_sub1, l_itm_sub2, l_itm_sub3);

	RETURN l_itm_sub3;

END;
$BODY$
LANGUAGE plpgsql
;
