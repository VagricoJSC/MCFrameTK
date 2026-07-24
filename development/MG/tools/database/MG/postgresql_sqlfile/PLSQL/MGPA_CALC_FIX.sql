\encoding UTF-8

CREATE OR REPLACE FUNCTION mgpa_calc_fix$f_get_calc_fix (
	IN i_calc_grp_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
RETURNS mgt_calc_fix
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	MGT_CALC_FIXのレコードを返す
<REMARKS>
	存在しないときはエラーとなる
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<RETURNVALUE>
	対象となるMGT_CALC_FIXのレコード
<HISTORY>
**************************************************************************/
DECLARE
	l_msg VARCHAR[];
	l_rec mgt_calc_fix%ROWTYPE;
BEGIN
	BEGIN
		SELECT	t.*
		INTO	STRICT l_rec
		FROM	mgt_calc_fix t
		WHERE	0=0
			AND t.calc_grp_cd = i_calc_grp_cd
			AND t.ym = i_ym;
	EXCEPTION
		WHEN no_data_found THEN
			l_msg := fcpa_err$msg_binder(i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
			CALL fcpa_err$raise_app_err('MGBXD0011', l_msg);
	END;
	RETURN l_rec;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_calc_fix$f_chk_fix (
	IN i_calc_grp_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<RETURNVALUE>
	確定済みのときは１、未確定のときは０を返す
<HISTORY>
**************************************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_calc_fix t
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.ym = i_ym;

	IF l_cnt > 0 THEN
		RETURN '1';
	END IF;

	RETURN '0';
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_chk_fix (
	IN i_calc_grp_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
DECLARE
	l_msg VARCHAR[];
	l_flg CHAR(1);
BEGIN
	l_flg := mgpa_calc_fix$f_chk_fix(i_calc_grp_cd, i_ym);

	IF l_flg = '1' THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
		CALL fcpa_err$raise_app_err('MGBXD0014', l_msg);
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_chk_fix_calc_no (
	IN i_calc_grp_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	IN i_calc_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	確定チェック
<REMARKS>
	計算グループＣＤ・年月に対して確定されており、
	確定対象の原価計算ＮＯが入力値の原価計算ＮＯと異なるときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<IN>	I_CALC_NO
		原価計算ＮＯ
**************************************************************************/
DECLARE
	l_msg VARCHAR[];
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_calc_fix t
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.ym = i_ym
		AND t.calc_no != i_calc_no;

	IF l_cnt > 0 THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
		CALL fcpa_err$raise_app_err('MGBXD0014', l_msg);
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_lock (
	IN i_calc_grp_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	確定情報(MGT_CALC_FIX)に対するロック処理
<REMARKS>
	NOWAITでロックする
	対象となるデータが存在しないときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
DECLARE
	l_msg VARCHAR[];
	lock_calc_fix CURSOR FOR
		SELECT	t.calc_grp_cd
		FROM	mgt_calc_fix t
		WHERE	0=0
			AND t.calc_grp_cd = i_calc_grp_cd
			AND t.ym = i_ym
		FOR UPDATE NOWAIT;
	l_rec mgt_calc_fix%ROWTYPE;

	x RECORD;
BEGIN
	l_rec := mgpa_calc_fix$f_get_calc_fix(i_calc_grp_cd, i_ym);

	FOR x IN lock_calc_fix LOOP EXIT;
	END LOOP;

EXCEPTION
	WHEN lock_not_available THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
		CALL fcpa_err$raise_app_err('MGBXD0010', l_msg);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_del_ave_fix (
	IN i_calc_grp_cd VARCHAR,
	IN i_calc_no VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	確定総平均単価データを削除する
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
BEGIN
	DELETE FROM	mgt_ave_fix t
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.calc_no = i_calc_no
		AND t.ym = i_ym;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_ins_ave_fix (
	IN i_calc_grp_cd VARCHAR,
	IN i_calc_no VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	確定総平均単価データを作成する
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
DECLARE
	c_calc_rec_ave CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','AVE');
BEGIN
	CALL mgpa_calc_fix$p_del_ave_fix(i_calc_grp_cd, i_calc_no, i_ym);

	INSERT INTO mgt_ave_fix (
		calc_grp_cd,
		wg_cd,
		ym,
		mng_dpt_cd,
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		lot_no,
		sublot_no,
		sno1,
		sno2,
		sno3,
		sno4,
		sppl_cd,
		asst_typ,
		std_qty,
		ave_upri,
		std_upri,
		calc_no,
		top_rec_no
		)
	SELECT
		t1.calc_grp_cd,
		t1.wg_cd,
		t1.ym,
		t1.mng_dpt_cd,
		t1.itm_cd,
		t1.itm_sub1,
		t1.itm_sub2,
		t1.itm_sub3,
		t1.lot_no,
		t1.sublot_no,
		t1.sno1,
		t1.sno2,
		t1.sno3,
		t1.sno4,
		t1.bp_cd,
		t1.asst_typ,
		t1.qty,
		COALESCE(SUM(t2.act_cost), 0),
		COALESCE(SUM(t2.std_cost), 0),
		t1.calc_no,
		MAX(t1.top_rec_no)
	FROM	mgt_acc_top t1
		LEFT OUTER JOIN mgt_acc_sml_cost t2
			ON (t1.calc_no = t2.calc_no
				AND t1.calc_grp_cd = t2.calc_grp_cd
				AND t1.top_rec_no = t2.top_rec_no)
	WHERE	0=0
		AND t1.calc_no = i_calc_no
		AND t1.calc_grp_cd = i_calc_grp_cd
		AND t1.calc_rec_typ = c_calc_rec_ave
		AND t1.ym = i_ym
	GROUP BY
		t1.calc_grp_cd,
		t1.wg_cd,
		t1.ym,
		t1.mng_dpt_cd,
		t1.itm_cd,
		t1.itm_sub1,
		t1.itm_sub2,
		t1.itm_sub3,
		t1.lot_no,
		t1.sublot_no,
		t1.sno1,
		t1.sno2,
		t1.sno3,
		t1.sno4,
		t1.bp_cd,
		t1.asst_typ,
		t1.qty,
		t1.calc_no
	;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_ins_ym_no (
	IN i_calc_grp_cd VARCHAR,
	IN i_calc_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	年月別原価計算ＮＯデータを作成する
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	l_calc_grp	mam_calc_grp%ROWTYPE ;
	l_arg		mgt_arg%ROWTYPE ;
	l_ym		mgt_ym_no.ym%TYPE ;

	l_arg2		mgt_arg%ROWTYPE ;
	l_calc_no2	mgt_arg.calc_no%TYPE ;

	rec_ym	timestamp without time zone[] ;

BEGIN
	IF i_calc_grp_cd IS NULL OR i_calc_no IS NULL THEN
		RETURN ;
	END IF ;

	l_calc_grp := mgpa_calc_grp$f_get_rec(i_calc_grp_cd) ;

	IF l_calc_grp.max_mons = 0 THEN
		RETURN ;
	END IF ;

	l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

	l_ym := l_arg.st_ym ;
	l_calc_no2 := NULL ;
	rec_ym := '{}' ;
	LOOP
		SELECT	MIN(t.calc_no)
		INTO	STRICT l_calc_no2
		FROM	mgt_ym_no t
		WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.ym = l_ym
		;

		IF l_calc_no2 IS NOT NULL THEN
			IF i_calc_no <> l_calc_no2 THEN
				l_arg2 := mgpa_arg$f_get_arg(i_calc_grp_cd, l_calc_no2) ;
				IF l_arg.st_ym <> l_arg2.st_ym OR l_arg.end_ym >= l_arg2.end_ym THEN
					rec_ym[COALESCE(array_length(rec_ym, 1), 0) + 1] := l_ym ;
				END IF ;
			END IF ;
		ELSE
			rec_ym[COALESCE(array_length(rec_ym, 1), 0) + 1] := l_ym ;
		END IF ;

		IF l_ym >= l_arg.end_ym THEN
			EXIT ;
		END IF ;

		l_ym := fcpa_postgres_util$add_months(l_ym, 1) ;

	END LOOP ;

	IF COALESCE(array_length(rec_ym, 1), 0) = 0 THEN
		RETURN ;
	END IF ;

	FOR i IN 1..COALESCE(array_length(rec_ym, 1), 0) LOOP
		IF (SELECT COUNT(*) FROM mgt_ym_no t
			WHERE 0=0
			AND t.calc_grp_cd = i_calc_grp_cd
			AND t.ym = rec_ym[i]
			) > 0
		THEN
			UPDATE mgt_ym_no t SET calc_no = i_calc_no WHERE t.calc_grp_cd = i_calc_grp_cd AND t.ym = rec_ym[i] ;
		ELSE
			INSERT INTO mgt_ym_no (
				calc_grp_cd, ym, calc_no
				)
			VALUES (
				i_calc_grp_cd, rec_ym[i], i_calc_no
				)
			;
		END IF ;
	END LOOP ;

	rec_ym := '{}' ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_remake_ym_no (
	IN i_calc_grp_cd VARCHAR,
	IN i_calc_no VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	削除されるデータをもとに年月別原価計算ＮＯデータを再作成する
<REMARKS>
	作成対象の年月で確定されている原価計算ＮＯで再作成する
<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		削除対象となる原価計算ＮＯ
<IN>	I_YM
		作成対象となる年月
<HISTORY>
**************************************************************************/
DECLARE
	l_calc_no mgt_arg.calc_no%TYPE ;
	l_cnt NUMERIC ;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_ym_no t
	WHERE	0=0
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	t.ym = i_ym
	AND	t.calc_no != i_calc_no
	;

	IF l_cnt > 0 THEN
		RETURN ;
	END IF ;

	SELECT	MAX(t.calc_no)
	INTO	STRICT l_calc_no
	FROM	mgt_calc_fix t
	WHERE	0=0
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	t.ym = i_ym
	;

	IF l_calc_no IS NULL THEN
		RETURN ;
	END IF ;

	CALL mgpa_calc_fix$p_ins_ym_no(i_calc_grp_cd, l_calc_no) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_fix (
	IN i_calc_grp_cd VARCHAR,
	IN i_calc_no VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	確定処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
DECLARE
	l_msg VARCHAR[];
	l_calc_grp mam_calc_grp%ROWTYPE;
	l_calc_no mgt_arg.calc_no%TYPE;
	l_cnt NUMERIC;
	x RECORD;
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0030', i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()), i_calc_no);

	l_calc_grp := mgpa_calc_grp$f_get_rec(i_calc_grp_cd);

	IF l_calc_grp.max_mons <= 0 THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd);
		CALL fcpa_err$raise_app_err('MGBXD0020', l_msg);
	END IF;

	/* 原価計算情報のロック */
	CALL mgpa_arg$p_lock(i_calc_grp_cd, i_calc_no, '1');
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_calc_fix t
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.ym = i_ym;

	IF l_cnt > 0 THEN
		RETURN;
	END IF;

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_grp_wg m
	WHERE	0=0
		AND m.calc_grp_cd = i_calc_grp_cd
		AND NOT EXISTS (
			SELECT	'X'
			FROM	mavm_wr_wg w
			WHERE	0=0 AND m.wg_cd = w.wg_cd);

	IF l_cnt > 0 THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd);
		CALL fcpa_err$raise_app_err('MGBXD0047', l_msg);
	END IF;

	SELECT	MIN(t.calc_no)
	INTO	STRICT l_calc_no
	FROM	mgt_stk_loss t
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.ym = i_ym
		AND t.calc_no != i_calc_no;

	IF l_calc_no IS NOT NULL THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()), l_calc_no);
		CALL fcpa_err$raise_app_err('MGBXD0027', l_msg);
	END IF;

	FOR x IN
		SELECT	t.trd_calc_no,
			t.trd_calc_grp_cd
		FROM	mgt_calc_trd_calc_no t
		WHERE	0=0
			AND t.calc_no = i_calc_no
			AND t.calc_grp_cd = i_calc_grp_cd
	LOOP
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_arg t
		WHERE	0=0
			AND t.calc_no = x.trd_calc_no
			AND t.calc_grp_cd = x.trd_calc_grp_cd
			AND t.fix_flg = '1';

		IF l_cnt = 0 THEN
			l_msg := fcpa_err$msg_binder(x.trd_calc_grp_cd, x.trd_calc_no);
			CALL fcpa_err$raise_app_err('MGBDD0018', l_msg);
		END IF;
	END LOOP;

	INSERT INTO mgt_calc_fix (
		calc_grp_cd, ym, calc_no, ac_if_flg
		)
	VALUES (
		i_calc_grp_cd, i_ym, i_calc_no, '0'
		);

	INSERT INTO mgt_ctg_fix (
		calc_grp_cd,
		ym,
		calc_ctg_typ,
		calc_ctg_cd
		)
	SELECT DISTINCT
		i_calc_grp_cd,
		i_ym,
		m.calc_ctg_typ,
		m.calc_ctg_cd
	FROM	mam_grp_ctg m
	WHERE	0=0
		AND m.calc_grp_cd = i_calc_grp_cd;

	INSERT INTO mgt_wg_fix (calc_grp_cd, ym, wg_cd)
	SELECT
		i_calc_grp_cd, i_ym, m.wg_cd
	FROM	mam_grp_wg m
	WHERE	0=0 AND m.calc_grp_cd = i_calc_grp_cd;

	/* 確定総平均単価作成処理 */
	CALL mgpa_calc_fix$p_ins_ave_fix(i_calc_grp_cd, i_calc_no, i_ym);

	/* 年月別原価計算ＮＯ情報作成処理 */
	CALL mgpa_calc_fix$p_ins_ym_no(i_calc_grp_cd, i_calc_no);

	/* 繰越処理 */
	IF mgpa_calc_grp$f_chk_max_mons(mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no)) = '1' THEN
		CALL mgpa_carry_over$p_main(i_calc_grp_cd, i_calc_no);
	END IF;

	UPDATE mgt_arg t
	SET fix_flg = '1'
	WHERE	0=0
	AND t.calc_grp_cd = i_calc_grp_cd
	AND t.calc_no = i_calc_no;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_CALC_FIX.P_FIX');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_cancel (
	IN i_calc_grp_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	確定取消処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
DECLARE
	l_msg VARCHAR[];
	l_calc_no mgt_arg.calc_no%TYPE;
	l_cnt NUMERIC;
	x RECORD;
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0030', i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()), NULL);

	/* 確定情報のロック */
	CALL mgpa_calc_fix$p_lock(i_calc_grp_cd, i_ym);

	SELECT	MAX(t.calc_no)
	INTO	STRICT l_calc_no
	FROM	mgt_calc_fix t
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.ym = i_ym
		AND t.ac_if_flg = '0';

	IF l_calc_no IS NULL THEN
		RETURN;
	END IF;

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_grp_wg m
	WHERE	0=0
		AND m.calc_grp_cd = i_calc_grp_cd
		AND NOT EXISTS (
			SELECT	'X'
			FROM	mavm_wr_wg w
			WHERE	0=0
			AND m.wg_cd = w.wg_cd);

	IF l_cnt > 0 THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd);
		CALL fcpa_err$raise_app_err('MGBXD0047', l_msg);
	END IF;

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_calc_fix t
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.ym > i_ym;

	IF l_cnt > 0 THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
		CALL fcpa_err$raise_app_err('MGBXD0019', l_msg);
	END IF;

	/* 原価計算情報のロック */
	CALL mgpa_arg$p_lock(i_calc_grp_cd, l_calc_no, '1');

	FOR x IN
		SELECT	t.calc_no,
			t.calc_grp_cd
		FROM	mgt_calc_trd_calc_no t
		WHERE	0=0
			AND t.trd_calc_no = l_calc_no
			AND t.trd_calc_grp_cd = i_calc_grp_cd
	LOOP
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_arg t
		WHERE	0=0
			AND t.calc_no = x.calc_no
			AND t.calc_grp_cd = x.calc_grp_cd
			AND t.fix_flg = '1';

		IF l_cnt > 0 THEN
			l_msg := fcpa_err$msg_binder(x.calc_grp_cd, x.calc_no);
			CALL fcpa_err$raise_app_err('MGBDD0019', l_msg);
		END IF;
	END LOOP;

	/* 確定総平均単価削除処理 */
	CALL mgpa_calc_fix$p_del_ave_fix(i_calc_grp_cd, l_calc_no, i_ym);

	DELETE FROM	mgt_wg_fix t
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.ym = i_ym;

	DELETE FROM	mgt_ctg_fix t
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.ym = i_ym;

	DELETE FROM	mgt_calc_fix t
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.ym = i_ym
		AND t.ac_if_flg = '0';

	UPDATE mgt_arg t
	SET fix_flg = '0'
	WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.calc_no = l_calc_no;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_CALC_FIX.P_CANCEL');
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_chk_fix_act (
	IN i_calc_ctg_cd VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	IN i_mfg CHARACTER,
	IN i_tran CHARACTER,
	IN i_stk CHARACTER
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	実績データに対する確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<IN>	I_MFG
		製造実績関連(製造、購買、投入、工数、品目製造指図、指図工程) 0:実行しない 1:実行する
<IN>	I_TRAN
		入出庫関連(入出庫、売上) 0:実行しない 1:実行する
<IN>	I_STK
		在庫情報 0:実行しない 1:実行する
<HISTORY>
**************************************************************************/
DECLARE
	l_mfg CHAR(1) := '0';
	l_purc CHAR(1) := '0';
	l_inpt CHAR(1) := '0';
	l_inst_wk CHAR(1) := '0';
	l_other_wk CHAR(1) := '0';
	l_inst_wip CHAR(1) := '0';
	l_io CHAR(1) := '0';
	l_sls CHAR(1) := '0';
	l_stk CHAR(1) := '0';
BEGIN
	IF i_mfg = '1' THEN
		l_mfg := '1';
		l_purc := '1';
		l_inpt := '1';
		l_inst_wk := '1';
		l_other_wk := '1';
		l_inst_wip := '1';
	END IF;

	IF i_tran = '1' THEN
		l_io := '1';
		l_sls := '1';
	END IF;

	IF i_stk = '1' THEN
		l_stk := '1';
	END IF;

	CALL mgpa_calc_fix$p_chk_fix_act(i_calc_ctg_cd, i_wg_cd, i_ym, l_mfg, l_purc, l_inpt, l_inst_wk, l_other_wk, l_inst_wip, l_io, l_sls, l_stk);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_chk_fix_act (
	IN i_calc_ctg_cd VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE,
	IN i_mfg CHARACTER,
	IN i_purc CHARACTER,
	IN i_inpt CHARACTER,
	IN i_inst_wk CHARACTER,
	IN i_other_wk CHARACTER,
	IN i_inst_wip CHARACTER,
	IN i_io CHARACTER,
	IN i_sls CHARACTER,
	IN i_stk CHARACTER
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	実績データに対する確定チェック
<REMARKS>
	確定済みのときはエラーとする
<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<IN>	I_MFG
		製造実績 0:実行しない 1:実行する
<IN>	I_PURC
		購買実績 0:実行しない 1:実行する
<IN>	I_INPT
		投入実績 0:実行しない 1:実行する
<IN>	I_INST_WK
		指図工数実績 0:実行しない 1:実行する
<IN>	I_OTHER_WK
		指図外工数実績 0:実行しない 1:実行する
<IN>	I_INST_WIP
		指図仕掛実績 0:実行しない 1:実行する
<IN>	I_IO
		入出庫実績 0:実行しない 1:実行する
<IN>	I_SLS
		売上実績 0:実行しない 1:実行する
<IN>	I_STK
		在庫実績 0:実行しない 1:実行する
<HISTORY>
**************************************************************************/
DECLARE
	c_sa_act CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'ACT');
	c_ctg_mfg CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'MFG');
	c_ctg_purc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'PURC');
	c_ctg_inpt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'INPT');
	c_ctg_wk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'WK');
	c_ctg_other_wk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'OTHER_WK');
	c_ctg_inst_wip CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'INST_WIP');
	c_ctg_io CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'IO');
	c_ctg_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'SLS');
	c_ctg_end_stk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP', 'END_STK');
	l_err_flg CHAR(1) := '0';
	l_cnt NUMERIC := 0;
	x RECORD;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE;
BEGIN
	IF i_mfg = '0'
		AND i_purc = '0'
		AND i_inpt = '0'
		AND i_inst_wk = '0'
		AND i_other_wk = '0'
		AND i_inst_wip = '0'
		AND i_io = '0'
		AND i_sls = '0'
		AND i_stk = '0'
	THEN
		RETURN;
	END IF;

	FOR x IN
		SELECT	t1.calc_grp_cd
		FROM	mgt_calc_fix t1,
			mgt_arg t2
		WHERE	0=0
			AND t1.ym = i_ym
			AND t1.calc_no = t2.calc_no
			AND t1.calc_grp_cd = t2.calc_grp_cd
			AND t2.sa_typ = c_sa_act
	LOOP
		SELECT	COUNT(t.wg_cd)
		INTO	STRICT l_cnt
		FROM	mgt_wg_fix t
		WHERE	0=0
			AND t.calc_grp_cd = x.calc_grp_cd
			AND t.ym = i_ym
			AND t.wg_cd = i_wg_cd;

		IF l_cnt = 0 THEN
			CONTINUE;
		END IF;

		IF i_mfg = '1' THEN
			/* 製造実績 */
			SELECT	COUNT(t.calc_ctg_cd)
			INTO	STRICT l_cnt
			FROM	mgt_ctg_fix t
			WHERE	0=0
				AND t.calc_grp_cd = x.calc_grp_cd
				AND t.ym = i_ym
				AND t.calc_ctg_typ = c_ctg_mfg
				AND t.calc_ctg_cd = i_calc_ctg_cd;

			IF l_cnt > 0 THEN
				l_err_flg := '1';
				CALL fcpa_batch_log$p_data_log('MGBXD0016', l_log_no, l_log_sub_key1, l_log_sub_key2, 'MGT_ACT_MFG', x.calc_grp_cd, i_calc_ctg_cd, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
			END IF;
		END IF;

		IF i_purc = '1' THEN
			/* 購買実績 */
			SELECT	COUNT(t.calc_ctg_cd)
			INTO	STRICT l_cnt
			FROM	mgt_ctg_fix t
			WHERE	0=0
				AND t.calc_grp_cd = x.calc_grp_cd
				AND t.ym = i_ym
				AND t.calc_ctg_typ = c_ctg_purc
				AND t.calc_ctg_cd = i_calc_ctg_cd;

			IF l_cnt > 0 THEN
				l_err_flg := '1';
				CALL fcpa_batch_log$p_data_log('MGBXD0016', l_log_no, l_log_sub_key1, l_log_sub_key2, 'MGT_ACT_PURC', x.calc_grp_cd, i_calc_ctg_cd, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
			END IF;
		END IF;

		IF i_inpt = '1' THEN
			/* 投入実績 */
			SELECT	COUNT(t.calc_ctg_cd)
			INTO	STRICT l_cnt
			FROM	mgt_ctg_fix t
			WHERE	0=0
				AND t.calc_grp_cd = x.calc_grp_cd
				AND t.ym = i_ym
				AND t.calc_ctg_typ = c_ctg_inpt
				AND t.calc_ctg_cd = i_calc_ctg_cd;

			IF l_cnt > 0 THEN
				l_err_flg := '1';
				CALL fcpa_batch_log$p_data_log('MGBXD0016', l_log_no, l_log_sub_key1, l_log_sub_key2, 'MGT_ACT_INPT', x.calc_grp_cd, i_calc_ctg_cd, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
			END IF;
		END IF;

		IF i_inst_wk = '1' THEN
			/* 指図工数実績 */
			SELECT	COUNT(t.calc_ctg_cd)
			INTO	STRICT l_cnt
			FROM	mgt_ctg_fix t
			WHERE	0=0
				AND t.calc_grp_cd = x.calc_grp_cd
				AND t.ym = i_ym
				AND t.calc_ctg_typ = c_ctg_wk
				AND t.calc_ctg_cd = i_calc_ctg_cd;

			IF l_cnt > 0 THEN
				l_err_flg := '1';
				CALL fcpa_batch_log$p_data_log('MGBXD0016', l_log_no, l_log_sub_key1, l_log_sub_key2, 'MGT_ACT_INST_WK', x.calc_grp_cd, i_calc_ctg_cd, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
			END IF;
		END IF;

		IF i_other_wk = '1' THEN
			/* 指図外工数実績 */
			SELECT	COUNT(t.calc_ctg_cd)
			INTO	STRICT l_cnt
			FROM	mgt_ctg_fix t
			WHERE	0=0
				AND t.calc_grp_cd = x.calc_grp_cd
				AND t.ym = i_ym
				AND t.calc_ctg_typ = c_ctg_other_wk
				AND t.calc_ctg_cd = i_calc_ctg_cd;

			IF l_cnt > 0 THEN
				l_err_flg := '1';
				CALL fcpa_batch_log$p_data_log('MGBXD0016', l_log_no, l_log_sub_key1, l_log_sub_key2, 'MGT_ACT_OTHER_WK', x.calc_grp_cd, i_calc_ctg_cd, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
			END IF;
		END IF;

		IF i_inst_wip = '1' THEN
			/* 指図仕掛実績 */
			SELECT	COUNT(t.calc_ctg_cd)
			INTO	STRICT l_cnt
			FROM	mgt_ctg_fix t
			WHERE	0=0
				AND t.calc_grp_cd = x.calc_grp_cd
				AND t.ym = i_ym
				AND t.calc_ctg_typ = c_ctg_inst_wip
				AND t.calc_ctg_cd = i_calc_ctg_cd;

			IF l_cnt > 0 THEN
				l_err_flg := '1';
				CALL fcpa_batch_log$p_data_log('MGBXD0016', l_log_no, l_log_sub_key1, l_log_sub_key2, 'MGT_ACT_INST_WIP', x.calc_grp_cd, i_calc_ctg_cd, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
			END IF;
		END IF;

		IF i_io = '1' THEN
			/* 入出庫実績 */
			SELECT	COUNT(t.calc_ctg_cd)
			INTO	STRICT l_cnt
			FROM	mgt_ctg_fix t
			WHERE	0=0
				AND t.calc_grp_cd = x.calc_grp_cd
				AND t.ym = i_ym
				AND t.calc_ctg_typ = c_ctg_io
				AND t.calc_ctg_cd = i_calc_ctg_cd;

			IF l_cnt > 0 THEN
				l_err_flg := '1';
				CALL fcpa_batch_log$p_data_log('MGBXD0016', l_log_no, l_log_sub_key1, l_log_sub_key2, 'MGT_ACT_IO', x.calc_grp_cd, i_calc_ctg_cd, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
			END IF;
		END IF;

		IF i_sls = '1' THEN
			/* 売上実績 */
			SELECT	COUNT(t.calc_ctg_cd)
			INTO	STRICT l_cnt
			FROM	mgt_ctg_fix t
			WHERE	0=0
				AND t.calc_grp_cd = x.calc_grp_cd
				AND t.ym = i_ym
				AND t.calc_ctg_typ = c_ctg_sls
				AND t.calc_ctg_cd = i_calc_ctg_cd;

			IF l_cnt > 0 THEN
				l_err_flg := '1';
				CALL fcpa_batch_log$p_data_log('MGBXD0016', l_log_no, l_log_sub_key1, l_log_sub_key2, 'MGT_ACT_SLS', x.calc_grp_cd, i_calc_ctg_cd, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
			END IF;
		END IF;

		IF i_stk = '1' THEN
			/* 在庫実績 */
			SELECT	COUNT(t.calc_ctg_cd)
			INTO	STRICT l_cnt
			FROM	mgt_ctg_fix t
			WHERE	0=0
				AND t.calc_grp_cd = x.calc_grp_cd
				AND t.ym = i_ym
				AND t.calc_ctg_typ = c_ctg_end_stk
				AND t.calc_ctg_cd = i_calc_ctg_cd;

			IF l_cnt > 0 THEN
				l_err_flg := '1';
				CALL fcpa_batch_log$p_data_log('MGBXD0016', l_log_no, l_log_sub_key1, l_log_sub_key2, 'MGT_ACT_STK', x.calc_grp_cd, i_calc_ctg_cd, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
			END IF;
		END IF;
	END LOOP;

	IF l_err_flg = '1' THEN
		CALL fcpa_err$raise_app_err('MGBXD0005');
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_chk_fix_act_amt (
	IN i_calc_ctg_cd VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	配賦費用実績データに対する確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_YM
		年月
<HISTORY>
**************************************************************************/
DECLARE
	l_msg VARCHAR[];
	c_sa_act CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SA_TYP', 'ACT');
	c_ctg_alc_amt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_CALC_CTG_TYP','ALC_AMT');
	l_calc_grp mam_calc_grp.calc_grp_cd%TYPE;
BEGIN
	SELECT	MIN(t1.calc_grp_cd)
	INTO	STRICT l_calc_grp
	FROM	mgt_ctg_fix t1,
		mgt_wg_fix t2,
		mgt_arg t3
	WHERE	0=0
		AND t1.calc_ctg_typ = c_ctg_alc_amt
		AND t1.calc_ctg_cd = i_calc_ctg_cd
		AND t1.ym = i_ym
		AND t2.wg_cd = i_wg_cd
		AND t2.ym = i_ym
		AND t1.calc_grp_cd = t2.calc_grp_cd
		AND t2.calc_grp_cd = t3.calc_grp_cd
		AND t2.ym = t3.end_ym
		AND t3.sa_typ = c_sa_act;

	IF l_calc_grp IS NOT NULL THEN
		l_msg := fcpa_err$msg_binder(l_calc_grp, i_calc_ctg_cd, i_wg_cd, fcpa_date_util$f_to_char(i_ym, fcpa_date_util$y4m()));
		CALL fcpa_err$raise_app_err('MGBXD0026', l_msg);
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_fix$p_chk_fix_pre_alc (
	IN i_calc_grp_cd VARCHAR,
	IN i_calc_no VARCHAR,
	IN i_calc_ctg_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	一次配賦結果反映時の確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD;
BEGIN
	FOR x IN
		SELECT DISTINCT
			t.wg_cd,
			t.ym
		FROM	mgt_pre_alc t
		WHERE	0=0
			AND t.calc_no = i_calc_no
			AND t.calc_grp_cd = i_calc_grp_cd
	LOOP
		CALL mgpa_calc_fix$p_chk_fix_act_amt(i_calc_ctg_cd, x.wg_cd, x.ym);
	END LOOP;
END;
$BODY$
LANGUAGE plpgsql
;

