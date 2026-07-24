CREATE OR REPLACE FUNCTION mapa_dpt_loc$cursor_cur_term(
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TABLE (
	term	TIMESTAMP WITHOUT TIME ZONE,
	term_end_ym	TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
DECLARE
	x	RECORD ;
BEGIN
	FOR x IN 
		SELECT	m.term,
			m.term_end_ym
		FROM	mam_term m
		WHERE	0=0
		AND	m.term >= mapa_term$f_get_term(i_ym_from)
		AND	m.term <= mapa_term$f_get_term(i_ym_to)
		AND	m.del_flg = '0'
	LOOP
		term := x.term ;
		term_end_ym := x.term_end_ym ;

		RETURN NEXT ;
	END LOOP ;

	RETURN ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_dpt_loc$p_set_work_loc(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dpt_cd VARCHAR,
	 IN i_par_dpt_cd VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる部門ＣＤに属する場所・工程ＣＤをmaw_dpt_locに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_term
		期
<IN>
	i_dpt_cd
		作成対象の部門ＣＤ
<IN>
	i_par_dpt_cd
		場所取得対象の部門ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	x1 RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_dpt_loc$dpt_loop', 'CHAR', 'VARCHAR') ;

	IF (SELECT COUNT(*) FROM mapa_dpt_loc$dpt_loop WHERE _index_ = i_par_dpt_cd) > 0 THEN
		RETURN ;
	ELSE
		INSERT INTO mapa_dpt_loc$dpt_loop (_elem_, _index_) VALUES ('1', i_par_dpt_cd) ;
	END IF;

	INSERT INTO maw_dpt_loc (
		dpt_cd,
		loc_cd,
		oper_cd,
		oper_null_flg
		)
	SELECT	i_dpt_cd,
		m.loc_cd,
		m.oper_cd,
		m.oper_null_flg
	FROM	mavm_dpt_config m
	WHERE	0=0
	AND	m.par_dpt_cd = i_par_dpt_cd
	AND	m.term = i_term
	AND	m.loc_cd IS NOT NULL
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	maw_dpt_loc x
			WHERE	0=0
			AND	x.dpt_cd = i_dpt_cd
			AND	x.loc_cd = m.loc_cd
			AND	COALESCE(x.oper_cd, c_null_val) = COALESCE(m.oper_cd, c_null_val)
			AND	x.oper_null_flg = m.oper_null_flg
			)
	;

	FOR x1 IN
		SELECT	m.dpt_cd
		FROM	mavm_dpt_config m
		WHERE	0=0
		AND	m.term = i_term
		AND	m.par_dpt_cd = i_par_dpt_cd
		AND	m.dpt_cd IS NOT NULL
		AND	m.par_dpt_cd != m.dpt_cd
	LOOP
		CALL mapa_dpt_loc$p_set_work_loc(i_term, i_dpt_cd, x1.dpt_cd) ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_dpt_loc$p_set_dpt_loc(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dpt_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門ＣＤに属する場所・工程ＣＤをmaw_dpt_locに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_term
		期
<IN>
	i_dpt_cd
		原価部門ＣＤ
<HISTORY>
**************************************************************************/
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_dpt_loc$dpt_loop', 'CHAR', 'VARCHAR') ;

	CALL fcpa_postgres_util$p_truncate_work('maw_dpt_loc') ;

	TRUNCATE TABLE mapa_dpt_loc$dpt_loop ;
	CALL mapa_dpt_loc$p_set_work_loc(i_term, i_dpt_cd, i_dpt_cd) ;
	TRUNCATE TABLE mapa_dpt_loc$dpt_loop ;

	DELETE FROM maw_dpt_loc w
	WHERE	0=0
	AND	(w.oper_cd IS NOT NULL OR w.oper_null_flg = '1')
	AND	EXISTS (
			SELECT	'X'
			FROM	maw_dpt_loc x
			WHERE	0=0
			AND	x.dpt_cd = w.dpt_cd
			AND	x.loc_cd = w.loc_cd
			AND	x.oper_cd IS NULL
			AND	x.oper_null_flg = '0'
			)
	;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_dpt_loc$p_set_dpt_lvl_loc(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dpt_lvl_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門階層ＣＤに属する部門ＣＤに対してmaw_dpt_locを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_term
		期
<IN>
	i_dpt_lvl_cd
		部門階層ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x1 RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_dpt_loc$dpt_loop', 'CHAR', 'VARCHAR') ;

	CALL fcpa_postgres_util$p_truncate_work('maw_dpt_loc') ;

	FOR x1 IN
		SELECT	m.dpt_cd
		FROM	mam_cost_dpt m
		WHERE	0=0
		AND	m.term = i_term
		AND	m.dpt_lvl_cd = i_dpt_lvl_cd
	LOOP
		TRUNCATE TABLE mapa_dpt_loc$dpt_loop ;
		CALL mapa_dpt_loc$p_set_work_loc(i_term, x1.dpt_cd, x1.dpt_cd) ;
	END LOOP ;

	TRUNCATE TABLE mapa_dpt_loc$dpt_loop ;

	DELETE FROM maw_dpt_loc w
	WHERE	0=0
	AND	(w.oper_cd IS NOT NULL OR w.oper_null_flg = '1')
	AND	EXISTS (
			SELECT	'X'
			FROM	maw_dpt_loc x
			WHERE	0=0
			AND	x.dpt_cd = w.dpt_cd
			AND	x.loc_cd = w.loc_cd
			AND	x.oper_cd IS NULL
			AND	x.oper_null_flg = '0'
			)
	;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_dpt_loc$p_set_dpt_work(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dpt_cd VARCHAR,
	 IN i_par_dpt_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門ＣＤに属する部門ＣＤをmaw_dpt_dptに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_term
		期
<IN>
	i_dpt_cd
		作成対象の部門ＣＤ
<IN>
	i_par_dpt_cd
		部門取得対象の部門ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	l_cnt NUMERIC ;
	x1 RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_dpt_loc$dpt_loop', 'CHAR', 'VARCHAR') ;

	IF (SELECT COUNT(*) FROM mapa_dpt_loc$dpt_loop WHERE _index_ = i_par_dpt_cd) > 0 THEN
		RETURN ;
	ELSE
		INSERT INTO mapa_dpt_loc$dpt_loop (_elem_, _index_) VALUES ('1', i_par_dpt_cd) ;
	END IF ;

	IF i_dpt_cd = i_par_dpt_cd THEN
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	maw_dpt_dpt w
		WHERE	0=0
		AND	w.par_dpt_cd = i_dpt_cd
		;

		IF l_cnt = 0 THEN
			INSERT INTO maw_dpt_dpt (
				par_dpt_cd,
				dpt_cd
				)
			VALUES (
				i_dpt_cd,
				i_par_dpt_cd
				)
			;
		END IF ;
	END IF ;

	INSERT INTO maw_dpt_dpt (
		par_dpt_cd,
		dpt_cd
		)
	SELECT	i_dpt_cd,
		m.dpt_cd
	FROM	mavm_dpt_config m
	WHERE	0=0
	AND	m.par_dpt_cd = i_par_dpt_cd
	AND	m.term = i_term
	AND	m.dpt_cd IS NOT NULL
	AND	m.par_dpt_cd != m.dpt_cd
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	maw_dpt_dpt x
			WHERE	0=0
			AND	x.par_dpt_cd = i_dpt_cd
			AND	x.dpt_cd = m.dpt_cd
			)
	;

	FOR x1 IN
		SELECT	m.dpt_cd
		FROM	mavm_dpt_config m
		WHERE	0=0
		AND	m.term = i_term
		AND	m.par_dpt_cd = i_par_dpt_cd
		AND	m.dpt_cd IS NOT NULL
		AND	m.par_dpt_cd != m.dpt_cd
	LOOP
		CALL mapa_dpt_loc$p_set_dpt_work(i_term, i_dpt_cd, x1.dpt_cd) ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_dpt_loc$p_set_dpt_dpt(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dpt_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門ＣＤに属する部門ＣＤをmaw_dpt_dptに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_term
		期
<IN>
	i_dpt_cd
		原価部門ＣＤ
<HISTORY>
**************************************************************************/
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_dpt_loc$dpt_loop', 'CHAR', 'VARCHAR') ;

	CALL fcpa_postgres_util$p_truncate_work('maw_dpt_dpt') ;

	TRUNCATE TABLE mapa_dpt_loc$dpt_loop ;
	CALL mapa_dpt_loc$p_set_dpt_work(i_term, i_dpt_cd, i_dpt_cd) ;
	TRUNCATE TABLE mapa_dpt_loc$dpt_loop ;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_dpt_loc$p_set_dpt_lvl_dpt(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dpt_lvl_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる期・部門階層ＣＤに属する部門ＣＤに対してmaw_dpt_dptを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_term
		期
<IN>
	i_dpt_lvl_cd
		部門階層ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_dpt_loc$dpt_loop', 'CHAR', 'VARCHAR') ;

	CALL fcpa_postgres_util$p_truncate_work('maw_dpt_dpt') ;

	FOR x IN
		SELECT	m.dpt_cd
		FROM	mam_cost_dpt m
		WHERE	0=0
		AND	m.term = i_term
		AND	m.dpt_lvl_cd = i_dpt_lvl_cd
	LOOP
		TRUNCATE TABLE mapa_dpt_loc$dpt_loop ;
		CALL mapa_dpt_loc$p_set_dpt_work(i_term, x.dpt_cd, x.dpt_cd) ;
	END LOOP ;

	TRUNCATE TABLE mapa_dpt_loc$dpt_loop ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_dpt_loc$p_set_ym_list(
	 IN i_cur_term RECORD,
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	月別ワークテーブルに作成する年月のリストを作成する
<REMARKS>
<ARGUMENTS>
<IN>
	i_cur_term
		対象期間マスタの検索結果
<IN>
	i_ym_from
		作成年月Ｆｒｏｍ
<IN>
	i_ym_to
		作成年月Ｔｏ
<HISTORY>
**************************************************************************/
DECLARE
	ym_fr	mam_term.term%TYPE ;
	ym_to	mam_term.term%TYPE ;
	ym_tmp	mam_term.term%TYPE ;

	l_cnt INTEGER ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_dpt_loc$rec_ym', 'TIMESTAMP WITHOUT TIME ZONE', 'INTEGER') ;
	ym_fr := NULL ;
	ym_to := NULL ;
	ym_tmp := NULL ;

	IF i_cur_term.term <= i_ym_from	THEN
		ym_fr := i_ym_from ;
	ELSE
		ym_fr := i_cur_term.term ;
	END IF;

	ym_tmp := fcpa_postgres_util$add_months(i_cur_term.term_end_ym, - 1) ;
	IF ym_tmp <= i_ym_to THEN
		ym_to := ym_tmp ;
	ELSE
		ym_to := i_ym_to ;
	END IF;

	l_cnt := 0 ;
	ym_tmp := ym_fr ;
	LOOP
		l_cnt := l_cnt + 1 ;
		INSERT INTO mapa_dpt_loc$rec_ym (_elem_, _index_) VALUES (ym_tmp, l_cnt) ;

		ym_tmp := fcpa_postgres_util$add_months(ym_tmp, 1) ;
		EXIT WHEN ym_tmp > ym_to ;
	END LOOP;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_dpt_loc$p_set_dpt_loc_ym(
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dpt_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門ＣＤに属する場所・工程ＣＤをmaw_dpt_loc_ymに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym_from
		作成年月Ｆｒｏｍ
<IN>
	i_ym_to
		作成年月Ｔｏ
<IN>
	i_dpt_cd
		原価部門ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD ;
	i RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_dpt_loc$rec_ym', 'TIMESTAMP WITHOUT TIME ZONE', 'INTEGER') ;
	CALL fcpa_postgres_util$p_truncate_work('maw_dpt_loc_ym') ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_dpt_loc$cursor_cur_term(i_ym_from, i_ym_to) w
	LOOP
		TRUNCATE TABLE mapa_dpt_loc$rec_ym ;
		CALL fcpa_postgres_util$p_truncate_work('maw_dpt_loc') ;

		CALL mapa_dpt_loc$p_set_dpt_loc(x.term, i_dpt_cd) ;
		CALL mapa_dpt_loc$p_set_ym_list(x, i_ym_from, i_ym_to) ;

		FOR i IN
			SELECT	w.*
			FROM	mapa_dpt_loc$rec_ym w
			ORDER BY w._index_
		LOOP
			INSERT INTO maw_dpt_loc_ym (
				ym,
				dpt_cd,
				loc_cd,
				oper_cd,
				oper_null_flg
				)
			SELECT
				i._elem_,
				w.dpt_cd,
				w.loc_cd,
				w.oper_cd,
				w.oper_null_flg
			FROM	maw_dpt_loc w
			WHERE	0=0
			;
		END LOOP ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_dpt_loc$p_set_dpt_lvl_loc_ym(
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dpt_lvl_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門階層ＣＤに属する部門ＣＤに対してmaw_dpt_loc_ymを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym_from
		作成年月Ｆｒｏｍ
<IN>
	i_ym_to
		作成年月Ｔｏ
<IN>
	i_dpt_lvl_cd
		部門階層ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD ;
	i RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_dpt_loc$rec_ym', 'TIMESTAMP WITHOUT TIME ZONE', 'INTEGER') ;
	CALL fcpa_postgres_util$p_truncate_work('maw_dpt_loc_ym') ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_dpt_loc$cursor_cur_term(i_ym_from, i_ym_to) w
	LOOP
		TRUNCATE TABLE mapa_dpt_loc$rec_ym ;
		CALL fcpa_postgres_util$p_truncate_work('maw_dpt_loc') ;

		CALL mapa_dpt_loc$p_set_dpt_lvl_loc(x.term, i_dpt_lvl_cd) ;
		CALL mapa_dpt_loc$p_set_ym_list(x, i_ym_from, i_ym_to) ;

		FOR i IN
			SELECT	w.*
			FROM	mapa_dpt_loc$rec_ym w
			ORDER BY w._index_
		LOOP
			INSERT INTO maw_dpt_loc_ym (
				ym,
				dpt_cd,
				loc_cd,
				oper_cd,
				oper_null_flg
				)
			SELECT
				i._elem_,
				w.dpt_cd,
				w.loc_cd,
				w.oper_cd,
				w.oper_null_flg
			FROM	maw_dpt_loc w
			WHERE	0=0
			;
		END LOOP ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_dpt_loc$p_set_dpt_dpt_ym(
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dpt_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門ＣＤに属する部門ＣＤをmaw_dpt_dpt_ymに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym_from
		作成年月Ｆｒｏｍ
<IN>
	i_ym_to
		作成年月Ｔｏ
<IN>
	i_dpt_cd
		原価部門ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD ;
	i RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_dpt_loc$rec_ym', 'TIMESTAMP WITHOUT TIME ZONE', 'INTEGER') ;
	CALL fcpa_postgres_util$p_truncate_work('maw_dpt_dpt_ym') ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_dpt_loc$cursor_cur_term(i_ym_from, i_ym_to) w
	LOOP
		TRUNCATE TABLE mapa_dpt_loc$rec_ym ;
		CALL fcpa_postgres_util$p_truncate_work('maw_dpt_dpt') ;

		CALL mapa_dpt_loc$p_set_dpt_dpt(x.term, i_dpt_cd) ;
		CALL mapa_dpt_loc$p_set_ym_list(x, i_ym_from, i_ym_to) ;

		FOR i IN
			SELECT	w.*
			FROM	mapa_dpt_loc$rec_ym w
			ORDER BY w._index_
		LOOP
			INSERT INTO maw_dpt_dpt_ym (
				ym,
				par_dpt_cd,
				dpt_cd
				)
			SELECT
				i._elem_,
				w.par_dpt_cd,
				w.dpt_cd
			FROM	maw_dpt_dpt w
			WHERE	0=0
			;
		END LOOP ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_dpt_loc$p_set_dpt_lvl_dpt_ym(
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dpt_lvl_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる年月・部門階層ＣＤに属する部門ＣＤに対してmaw_dpt_dpt_ymを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym_from
		作成年月Ｆｒｏｍ
<IN>
	i_ym_to
		作成年月Ｔｏ
<IN>
	i_dpt_lvl_cd
		部門階層ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD ;
	i RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_dpt_loc$rec_ym', 'TIMESTAMP WITHOUT TIME ZONE', 'INTEGER') ;
	CALL fcpa_postgres_util$p_truncate_work('maw_dpt_dpt_ym') ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_dpt_loc$cursor_cur_term(i_ym_from, i_ym_to) w
	LOOP
		TRUNCATE TABLE mapa_dpt_loc$rec_ym ;
		CALL fcpa_postgres_util$p_truncate_work('maw_dpt_dpt') ;

		CALL mapa_dpt_loc$p_set_dpt_lvl_dpt(x.term, i_dpt_lvl_cd) ;
		CALL mapa_dpt_loc$p_set_ym_list(x, i_ym_from, i_ym_to) ;

		FOR i IN
			SELECT	w.*
			FROM	mapa_dpt_loc$rec_ym w
			ORDER BY w._index_
		LOOP
			INSERT INTO maw_dpt_dpt_ym (
				ym,
				par_dpt_cd,
				dpt_cd
				)
			SELECT
				i._elem_,
				w.par_dpt_cd,
				w.dpt_cd
			FROM	maw_dpt_dpt w
			WHERE	0=0
			;
		END LOOP ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;
