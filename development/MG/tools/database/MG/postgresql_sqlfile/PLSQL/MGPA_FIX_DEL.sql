\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_fix_del$p_itm_dtl(
	 IN i_usr VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価品目詳細取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
DECLARE
	c_on		CONSTANT CHAR(1) := '1';
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');

	l_log_no		fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE;

	l_cnt NUMERIC;
	l_flg BOOLEAN;
	sql$rowcount BIGINT;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.term = i_term
	LIMIT 1;

	IF l_cnt > 0 THEN
		<<NEXT_DELETE>>
		BEGIN
			SELECT	COUNT(*)
			INTO	STRICT l_cnt
			FROM	mgw_imp_itm_dtl w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd <> c_null_val
			LIMIT 1;

			IF l_cnt = 0 THEN
				EXIT NEXT_DELETE;
			END IF;

			DELETE FROM	mgw_imp_itm_dtl w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.term = w.term
				AND	t.wg_cd = w.wg_cd
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_dtl()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := sql$rowcount > 0;
		END;

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgw_imp_itm_dtl w
		WHERE	0=0
		AND	w.term = i_term
		AND	w.imp_flg = c_on
		AND	w.upd_usr_id = i_usr
		AND	w.wg_cd = c_null_val
		LIMIT 1;

		IF l_cnt > 0 THEN
			DELETE FROM	mgw_imp_itm_dtl w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd = c_null_val
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.term = w.term
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_dtl()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	mgt_calc_itm_dtl x
					WHERE	0=0
					AND	x.calc_no = t.calc_no
					AND	x.calc_grp_cd = t.calc_grp_cd
					AND	x.itm_cd = t.itm_cd
					AND	x.itm_sub1 = t.itm_sub1
					AND	x.itm_sub2 = t.itm_sub2
					AND	x.itm_sub3 = t.itm_sub3
					AND	x.wg_cd = t.wg_cd
					AND	x.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := l_flg OR sql$rowcount > 0;
		END IF;

		IF l_flg THEN
			CALL fcpa_batch_log$p_data_log('MGBDD0022', l_log_no, l_log_sub_key1, l_log_sub_key2);
		END IF;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_fix_del$p_bom(
	 IN i_usr VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価ＢＯＭ取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
DECLARE
	c_on		CONSTANT CHAR(1) := '1';
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');

	l_log_no		fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE;

	l_cnt NUMERIC;
	l_flg BOOLEAN;
	sql$rowcount BIGINT;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.term = i_term
	LIMIT 1;

	IF l_cnt > 0 THEN
		<<NEXT_DELETE>>
		BEGIN
			SELECT	COUNT(*)
			INTO	STRICT l_cnt
			FROM	mgw_imp_bom w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd <> c_null_val
			LIMIT 1;

			IF l_cnt = 0 THEN
				EXIT NEXT_DELETE;
			END IF;

			DELETE FROM	mgw_imp_bom w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.par_itm_cd
				AND	t.itm_sub1 = w.par_itm_sub1
				AND	t.itm_sub2 = w.par_itm_sub2
				AND	t.itm_sub3 = w.par_itm_sub3
				AND	t.term = w.term
				AND	t.wg_cd = w.wg_cd
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$bom()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := sql$rowcount > 0;
		END;

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgw_imp_bom w
		WHERE	0=0
		AND	w.term = i_term
		AND	w.imp_flg = c_on
		AND	w.upd_usr_id = i_usr
		AND	w.wg_cd = c_null_val
		LIMIT 1;

		IF l_cnt > 0 THEN
			DELETE FROM	mgw_imp_bom w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd = c_null_val
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.par_itm_cd
				AND	t.itm_sub1 = w.par_itm_sub1
				AND	t.itm_sub2 = w.par_itm_sub2
				AND	t.itm_sub3 = w.par_itm_sub3
				AND	t.term = w.term
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$bom()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	mgt_calc_bom x
					WHERE	0=0
					AND	x.calc_no = t.calc_no
					AND	x.calc_grp_cd = t.calc_grp_cd
					AND	x.par_itm_cd = t.itm_cd
					AND	x.par_itm_sub1 = t.itm_sub1
					AND	x.par_itm_sub2 = t.itm_sub2
					AND	x.par_itm_sub3 = t.itm_sub3
					AND	x.wg_cd = t.wg_cd
					AND	x.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := l_flg OR sql$rowcount > 0;
		END IF;

		IF l_flg THEN
			CALL fcpa_batch_log$p_data_log('MGBDD0022', l_log_no, l_log_sub_key1, l_log_sub_key2);
		END IF;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_fix_del$p_itm_oper(
	 IN i_usr VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価品目工程取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
DECLARE
	c_on		CONSTANT CHAR(1) := '1';
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');

	l_log_no		fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE;

	l_cnt NUMERIC;
	l_flg BOOLEAN;
	sql$rowcount BIGINT;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.term = i_term
	LIMIT 1;

	IF l_cnt > 0 THEN
		<<NEXT_DELETE>>
		BEGIN
			SELECT	COUNT(*)
			INTO	STRICT l_cnt
			FROM	mgw_imp_itm_oper w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd <> c_null_val
			LIMIT 1;

			IF l_cnt = 0 THEN
				EXIT NEXT_DELETE;
			END IF;

			DELETE FROM	mgw_imp_itm_oper w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.term = w.term
				AND	t.wg_cd = w.wg_cd
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_oper()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := sql$rowcount > 0;
		END;

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgw_imp_itm_oper w
		WHERE	0=0
		AND	w.term = i_term
		AND	w.imp_flg = c_on
		AND	w.upd_usr_id = i_usr
		AND	w.wg_cd = c_null_val
		LIMIT 1;

		IF l_cnt > 0 THEN
			DELETE FROM	mgw_imp_itm_oper w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd = c_null_val
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.term = w.term
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_oper()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	mgt_calc_itm_oper x
					WHERE	0=0
					AND	x.calc_no = t.calc_no
					AND	x.calc_grp_cd = t.calc_grp_cd
					AND	x.itm_cd = t.itm_cd
					AND	x.itm_sub1 = t.itm_sub1
					AND	x.itm_sub2 = t.itm_sub2
					AND	x.itm_sub3 = t.itm_sub3
					AND	x.wg_cd = t.wg_cd
					AND	x.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := l_flg OR sql$rowcount > 0;
		END IF;

		IF l_flg THEN
			CALL fcpa_batch_log$p_data_log('MGBDD0022', l_log_no, l_log_sub_key1, l_log_sub_key2);
		END IF;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_fix_del$p_itm_wk(
	 IN i_usr VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価品目工数取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
DECLARE
	c_on		CONSTANT CHAR(1) := '1';
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');

	l_log_no		fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE;

	l_cnt NUMERIC;
	l_flg BOOLEAN;
	sql$rowcount BIGINT;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.term = i_term
	LIMIT 1;

	IF l_cnt > 0 THEN
		<<NEXT_DELETE>>
		BEGIN
			SELECT	COUNT(*)
			INTO	STRICT l_cnt
			FROM	mgw_imp_itm_wk w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd <> c_null_val
			LIMIT 1;

			IF l_cnt = 0 THEN
				EXIT NEXT_DELETE;
			END IF;

			DELETE FROM	mgw_imp_itm_wk w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.term = w.term
				AND	t.wg_cd = w.wg_cd
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_wk()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := sql$rowcount > 0;
		END;

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgw_imp_itm_wk w
		WHERE	0=0
		AND	w.term = i_term
		AND	w.imp_flg = c_on
		AND	w.upd_usr_id = i_usr
		AND	w.wg_cd = c_null_val
		LIMIT 1;

		IF l_cnt > 0 THEN
			DELETE FROM	mgw_imp_itm_wk w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd = c_null_val
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.term = w.term
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_wk()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	mgt_calc_itm_wk x
					WHERE	0=0
					AND	x.calc_no = t.calc_no
					AND	x.calc_grp_cd = t.calc_grp_cd
					AND	x.itm_cd = t.itm_cd
					AND	x.itm_sub1 = t.itm_sub1
					AND	x.itm_sub2 = t.itm_sub2
					AND	x.itm_sub3 = t.itm_sub3
					AND	x.wg_cd = t.wg_cd
					AND	x.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := l_flg OR sql$rowcount > 0;
		END IF;

		IF l_flg THEN
			CALL fcpa_batch_log$p_data_log('MGBDD0022', l_log_no, l_log_sub_key1, l_log_sub_key2);
		END IF;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_fix_del$p_itm_purc(
	 IN i_usr VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価品目購買単価取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
DECLARE
	c_on		CONSTANT CHAR(1) := '1';
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');

	l_log_no		fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE;

	l_cnt NUMERIC;
	l_flg BOOLEAN;
	sql$rowcount BIGINT;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.term = i_term
	LIMIT 1;

	IF l_cnt > 0 THEN
		<<NEXT_DELETE>>
		BEGIN
			SELECT	COUNT(*)
			INTO	STRICT l_cnt
			FROM	mgw_imp_itm_purc w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd <> c_null_val
			LIMIT 1;

			IF l_cnt = 0 THEN
				EXIT NEXT_DELETE;
			END IF;

			DELETE FROM	mgw_imp_itm_purc w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.term = w.term
				AND	t.wg_cd = w.wg_cd
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_purc()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := sql$rowcount > 0;
		END;

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgw_imp_itm_purc w
		WHERE	0=0
		AND	w.term = i_term
		AND	w.imp_flg = c_on
		AND	w.upd_usr_id = i_usr
		AND	w.wg_cd = c_null_val
		LIMIT 1;

		IF l_cnt > 0 THEN
			DELETE FROM	mgw_imp_itm_purc w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd = c_null_val
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.term = w.term
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_purc()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	mgt_calc_itm_purc x
					WHERE	0=0
					AND	x.calc_no = t.calc_no
					AND	x.calc_grp_cd = t.calc_grp_cd
					AND	x.itm_cd = t.itm_cd
					AND	x.itm_sub1 = t.itm_sub1
					AND	x.itm_sub2 = t.itm_sub2
					AND	x.itm_sub3 = t.itm_sub3
					AND	x.wg_cd = t.wg_cd
					AND	x.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := l_flg OR sql$rowcount > 0;
		END IF;

		IF l_flg THEN
			CALL fcpa_batch_log$p_data_log('MGBDD0022', l_log_no, l_log_sub_key1, l_log_sub_key2);
		END IF;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_fix_del$p_itm_proc(
	 IN i_usr VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価品目加工単価取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
DECLARE
	c_on		CONSTANT CHAR(1) := '1';
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');

	l_log_no		fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE;

	l_cnt NUMERIC;
	l_flg BOOLEAN;
	sql$rowcount BIGINT;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.term = i_term
	LIMIT 1;

	IF l_cnt > 0 THEN
		<<NEXT_DELETE>>
		BEGIN
			SELECT	COUNT(*)
			INTO	STRICT l_cnt
			FROM	mgw_imp_itm_proc w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd <> c_null_val
			LIMIT 1;

			IF l_cnt = 0 THEN
				EXIT NEXT_DELETE;
			END IF;

			DELETE FROM	mgw_imp_itm_proc w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	EXISTS (
			SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.term = w.term
				AND	t.wg_cd = w.wg_cd
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_proc()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := sql$rowcount > 0;
		END;

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgw_imp_itm_proc w
		WHERE	0=0
		AND	w.term = i_term
		AND	w.imp_flg = c_on
		AND	w.upd_usr_id = i_usr
		AND	w.wg_cd = c_null_val
		LIMIT 1;

		IF l_cnt > 0 THEN
			DELETE FROM	mgw_imp_itm_proc w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd = c_null_val
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.term = w.term
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_proc()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	mgt_calc_itm_proc x
					WHERE	0=0
					AND	x.calc_no = t.calc_no
					AND	x.calc_grp_cd = t.calc_grp_cd
					AND	x.itm_cd = t.itm_cd
					AND	x.itm_sub1 = t.itm_sub1
					AND	x.itm_sub2 = t.itm_sub2
					AND	x.itm_sub3 = t.itm_sub3
					AND	x.wg_cd = t.wg_cd
					AND	x.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := l_flg OR sql$rowcount > 0;
		END IF;

		IF l_flg THEN
			CALL fcpa_batch_log$p_data_log('MGBDD0022', l_log_no, l_log_sub_key1, l_log_sub_key2);
		END IF;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_fix_del$p_itm_prov(
	 IN i_usr VARCHAR,
	 IN i_term TIMESTAMP WITHOUT TIME ZONE)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価品目支給単価取込対象ワークから確定品目を削除する。
<REMARKS>

<ARGUMENTS>
<IN>	I_USR
		ユーザ
<IN>	I_TERM
		期
<HISTORY>
**************************************************************************/
DECLARE
	c_on		CONSTANT CHAR(1) := '1';
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR', 'NULL_VAL');

	l_log_no		fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE;

	l_cnt NUMERIC;
	l_flg BOOLEAN;
	sql$rowcount BIGINT;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.term = i_term
	LIMIT 1;

	IF l_cnt > 0 THEN
		<<NEXT_DELETE>>
		BEGIN
			SELECT	COUNT(*)
			INTO	STRICT l_cnt
			FROM	mgw_imp_itm_prov w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd <> c_null_val
			LIMIT 1;

			IF l_cnt = 0 THEN
				EXIT NEXT_DELETE;
			END IF;

			DELETE FROM	mgw_imp_itm_prov w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.term = w.term
				AND	t.wg_cd = w.wg_cd
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_prov()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := sql$rowcount > 0;
		END;

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgw_imp_itm_prov w
		WHERE	0=0
		AND	w.term = i_term
		AND	w.imp_flg = c_on
		AND	w.upd_usr_id = i_usr
		AND	w.wg_cd = c_null_val
		LIMIT 1;

		IF l_cnt > 0 THEN
			DELETE FROM	mgw_imp_itm_prov w
			WHERE	0=0
			AND	w.term = i_term
			AND	w.imp_flg = c_on
			AND	w.upd_usr_id = i_usr
			AND	w.wg_cd = c_null_val
			AND	EXISTS (
				SELECT	'X'
				FROM	mgt_std_fix t
				WHERE	0=0
				AND	t.itm_cd = w.itm_cd
				AND	t.itm_sub1 = w.itm_sub1
				AND	t.itm_sub2 = w.itm_sub2
				AND	t.itm_sub3 = w.itm_sub3
				AND	t.term = w.term
				AND	EXISTS (
					SELECT	'X'
					FROM	mam_grp_ctg m1, mam_grp_ctg m2
					WHERE	0=0
					AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
					AND	m1.calc_ctg_cd = t.calc_ctg_cd
					AND	m1.calc_grp_cd = t.calc_grp_cd
					AND	m1.calc_grp_cd = m2.calc_grp_cd
					AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_prov()
					AND	m2.calc_ctg_cd = w.calc_ctg_cd
				)
				AND	NOT EXISTS (
					SELECT	'X'
					FROM	mgt_calc_itm_prov x
					WHERE	0=0
					AND	x.calc_no = t.calc_no
					AND	x.calc_grp_cd = t.calc_grp_cd
					AND	x.itm_cd = t.itm_cd
					AND	x.itm_sub1 = t.itm_sub1
					AND	x.itm_sub2 = t.itm_sub2
					AND	x.itm_sub3 = t.itm_sub3
					AND	x.wg_cd = t.wg_cd
					AND	x.calc_ctg_cd = w.calc_ctg_cd
				)
			);

			GET DIAGNOSTICS sql$rowcount = ROW_COUNT;
			l_flg := l_flg OR sql$rowcount > 0;
		END IF;

		IF l_flg THEN
			CALL fcpa_batch_log$p_data_log('MGBDD0022', l_log_no, l_log_sub_key1, l_log_sub_key2);
		END IF;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;

