CREATE OR REPLACE FUNCTION mapa_ctg_itm$cursor_cur_term(
	IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE
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
			AND m.term >= mapa_term$f_get_term(i_ym_from)
			AND m.term <= mapa_term$f_get_term(i_ym_to)
			AND m.del_flg = '0'
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


CREATE OR REPLACE PROCEDURE mapa_ctg_itm$p_set_itm_work(
	 IN i_term	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ctg_cd	VARCHAR,
	 IN i_par_ctg_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群ＣＤに属する品目ＣＤをmaw_ctg_itmに作成する
<REMARKS>
	対象となる期はmaw_termに作成しておく必要がある
<ARGUMENTS>
<IN>
	i_term
		期
<IN>
	i_ctg_cd
		作成対象の品群ＣＤ
<IN>
	i_par_ctg_cd
		品目取得対象の品群ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x1 RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_ctg_itm$ctg_loop', 'CHAR', 'VARCHAR') ;

	IF (SELECT COUNT(*) FROM mapa_ctg_itm$ctg_loop WHERE _index_ = i_par_ctg_cd) > 0 THEN
		RETURN ;
	ELSE
		INSERT INTO mapa_ctg_itm$ctg_loop (_elem_, _index_) VALUES ('1', i_par_ctg_cd) ;
	END IF ;

	INSERT INTO maw_ctg_itm (
		ctg_cd,
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3
		)
	SELECT	i_ctg_cd,
		m.itm_cd,
		m.itm_sub1,
		m.itm_sub2,
		m.itm_sub3
	FROM	mavm_ctg_config m
	WHERE	0=0
	AND	m.par_ctg_cd = i_par_ctg_cd
	AND	m.term = i_term
	AND	m.itm_cd IS NOT NULL
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	maw_ctg_itm x
			WHERE	0=0
			AND	x.ctg_cd = i_ctg_cd
			AND	x.itm_cd = m.itm_cd
			AND	x.itm_sub1 = m.itm_sub1
			AND	x.itm_sub2 = m.itm_sub2
			AND	x.itm_sub3 = m.itm_sub3
			)
	;

	FOR x1 IN
		SELECT	m.ctg_cd
		FROM	mavm_ctg_config m
		WHERE	0=0
		AND	m.term = i_term
		AND	m.par_ctg_cd = i_par_ctg_cd
		AND	m.ctg_cd IS NOT NULL
		AND	m.par_ctg_cd != m.ctg_cd
	LOOP
		CALL mapa_ctg_itm$p_set_itm_work(i_term, i_ctg_cd, x1.ctg_cd) ;
	END LOOP ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_ctg_itm$p_set_ctg_itm(
	 IN i_term	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ctg_cd	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群ＣＤに属する品目ＣＤをmaw_ctg_itmに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_term
		期
<IN>
	i_ctg_cd
		原価品群ＣＤ
<HISTORY>
**************************************************************************/
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_ctg_itm$ctg_loop', 'CHAR', 'VARCHAR') ;

	CALL fcpa_postgres_util$p_truncate_work('maw_term') ;
	INSERT INTO maw_term (term) VALUES (i_term) ;

	CALL fcpa_postgres_util$p_truncate_work('maw_ctg_itm') ;

	TRUNCATE TABLE mapa_ctg_itm$ctg_loop ;
	CALL mapa_ctg_itm$p_set_itm_work(i_term, i_ctg_cd, i_ctg_cd) ;
	TRUNCATE TABLE mapa_ctg_itm$ctg_loop ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_ctg_itm$p_set_ctg_grp_itm(
	 IN i_term	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ctg_grp_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群グループＣＤに属する品群ＣＤに対してmaw_ctg_itmを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_term
		期
<IN>
	i_ctg_grp_cd
		品群グループＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_ctg_itm$ctg_loop', 'CHAR', 'VARCHAR') ;

	CALL fcpa_postgres_util$p_truncate_work('maw_term') ;
	INSERT INTO maw_term (term) VALUES (i_term) ;

	CALL fcpa_postgres_util$p_truncate_work('maw_ctg_itm') ;

	FOR x IN
		SELECT	m.ctg_cd
		FROM	mam_cost_ctg m
		WHERE	0=0
		AND	m.ctg_grp_cd = i_ctg_grp_cd
	LOOP
		TRUNCATE TABLE mapa_ctg_itm$ctg_loop ;
		CALL mapa_ctg_itm$p_set_itm_work(i_term, x.ctg_cd, x.ctg_cd) ;
	END LOOP ;

	TRUNCATE TABLE mapa_ctg_itm$ctg_loop ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_ctg_itm$p_set_ctg_work(
	 IN i_term	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ctg_cd	VARCHAR,
	 IN i_par_ctg_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群ＣＤに属する品群ＣＤをmaw_ctg_ctgに作成する
<REMARKS>
	対象となる期はmaw_termに作成しておく必要がある
<ARGUMENTS>
<IN>
	i_term
		期
<IN>
	i_ctg_cd
		作成対象の品群ＣＤ
<IN>
	i_par_ctg_cd
		品群取得対象の品群ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	l_cnt	NUMERIC ;
	x1 	RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_ctg_itm$ctg_loop', 'CHAR', 'VARCHAR') ;

	IF (SELECT COUNT(*) FROM mapa_ctg_itm$ctg_loop WHERE _index_ = i_par_ctg_cd) > 0 THEN
		RETURN ;
	ELSE
		INSERT INTO mapa_ctg_itm$ctg_loop (_elem_, _index_) VALUES ('1', i_par_ctg_cd) ;
	END IF ;

	IF i_ctg_cd = i_par_ctg_cd THEN
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	maw_ctg_ctg w
		WHERE	0=0
		AND	w.par_ctg_cd = i_ctg_cd
		;

		IF l_cnt = 0 THEN
			INSERT INTO maw_ctg_ctg (
				par_ctg_cd,
				ctg_cd
				)
			VALUES (
				i_ctg_cd,
				i_par_ctg_cd
				)
			;
		END IF ;
	END IF ;

	INSERT INTO maw_ctg_ctg (
		par_ctg_cd,
		ctg_cd
		)
	SELECT	i_ctg_cd,
		m.ctg_cd
	FROM	mavm_ctg_config m
	WHERE	0=0
	AND	m.par_ctg_cd = i_par_ctg_cd
	AND	m.term = i_term
	AND	m.ctg_cd IS NOT NULL
	AND	m.par_ctg_cd != m.ctg_cd
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	maw_ctg_ctg x
			WHERE	0=0
			AND	x.par_ctg_cd = i_ctg_cd
			AND	x.ctg_cd = m.ctg_cd
			)
	;

	FOR x1 IN
		SELECT	m.ctg_cd
		FROM	mavm_ctg_config m
		WHERE	0=0
		AND	m.term = i_term
		AND	m.par_ctg_cd = i_par_ctg_cd
		AND	m.ctg_cd IS NOT NULL
		AND	m.par_ctg_cd != m.ctg_cd
	LOOP
		CALL mapa_ctg_itm$p_set_ctg_work(i_term, i_ctg_cd, x1.ctg_cd) ;
	END LOOP ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_ctg_itm$p_set_ctg_ctg(
	 IN i_term	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ctg_cd	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群ＣＤに属する品群ＣＤをmaw_ctg_ctgに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_term
		期
<IN>
	i_ctg_cd
		原価品群ＣＤ
<HISTORY>
**************************************************************************/
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_ctg_itm$ctg_loop', 'CHAR', 'VARCHAR') ;
	CALL fcpa_postgres_util$p_truncate_work('maw_term') ;
	INSERT INTO maw_term (term) VALUES (i_term) ;

	CALL fcpa_postgres_util$p_truncate_work('maw_ctg_ctg') ;

	TRUNCATE TABLE mapa_ctg_itm$ctg_loop ;
	CALL mapa_ctg_itm$p_set_ctg_work(i_term, i_ctg_cd, i_ctg_cd) ;
	TRUNCATE TABLE mapa_ctg_itm$ctg_loop ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_ctg_itm$p_set_ctg_grp_ctg(
	 IN i_term	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ctg_grp_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる期・品群グループＣＤに属する品群ＣＤに対してMAW_CTG_CTGを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_term
		期
<IN>
	i_ctg_grp_cd
		品群グループＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_ctg_itm$ctg_loop', 'CHAR', 'VARCHAR') ;

	CALL fcpa_postgres_util$p_truncate_work('maw_term') ;
	INSERT INTO maw_term (term) VALUES (i_term) ;

	CALL fcpa_postgres_util$p_truncate_work('maw_ctg_ctg') ;

	FOR x IN
		SELECT	m.ctg_cd
		FROM	mam_cost_ctg m
		WHERE	0=0
		AND	m.ctg_grp_cd = i_ctg_grp_cd
	LOOP
		TRUNCATE TABLE mapa_ctg_itm$ctg_loop ;
		CALL mapa_ctg_itm$p_set_ctg_work(i_term, x.ctg_cd, x.ctg_cd) ;
	END LOOP ;

	TRUNCATE TABLE mapa_ctg_itm$ctg_loop ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_ctg_itm$p_set_ym_list(
	 IN i_cur_term	RECORD,
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
	CALL fcpa_postgres_util$type_is_table_col('mapa_ctg_itm$rec_ym', 'TIMESTAMP WITHOUT TIME ZONE', 'INTEGER') ;

	ym_fr := NULL ;
	ym_to := NULL ;
	ym_tmp := NULL ;

	IF i_cur_term.term <= i_ym_from	THEN
		ym_fr := i_ym_from ;
	ELSE
		ym_fr := i_cur_term.term ;
	END IF;

	ym_tmp := fcpa_postgres_util$add_months(i_cur_term.term_end_ym, -1) ;
	IF ym_tmp <= i_ym_to THEN
		ym_to := ym_tmp ;
	ELSE
		ym_to := i_ym_to ;
	END IF ;

	l_cnt := 0 ;
	ym_tmp := ym_fr ;
	LOOP
		l_cnt := l_cnt + 1 ;
		INSERT INTO mapa_ctg_itm$rec_ym (_elem_, _index_) VALUES (ym_tmp, l_cnt) ;

		ym_tmp := fcpa_postgres_util$add_months(ym_tmp, 1) ;
		EXIT WHEN ym_tmp > ym_to ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_ctg_itm$p_set_ctg_itm_ym(
	 IN i_ym_from	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ctg_cd	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる年月・品群ＣＤに属する品目ＣＤをmaw_ctg_itm_ymに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym_from
		作成年月Ｆｒｏｍ
<IN>
	i_ym_to
		作成年月Ｔｏ
<IN>
	i_ctg_cd
		原価品群ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD ;
	i RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_ctg_itm$rec_ym', 'TIMESTAMP WITHOUT TIME ZONE', 'INTEGER') ;
	CALL fcpa_postgres_util$p_truncate_work('maw_ctg_itm_ym') ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_ctg_itm$cursor_cur_term(i_ym_from, i_ym_to) w
	LOOP
		TRUNCATE TABLE mapa_ctg_itm$rec_ym ;
		CALL fcpa_postgres_util$p_truncate_work('maw_ctg_itm') ;

		CALL mapa_ctg_itm$p_set_ctg_itm(x.term, i_ctg_cd) ;

		CALL mapa_ctg_itm$p_set_ym_list(x, i_ym_from, i_ym_to) ;

		FOR i IN
			SELECT	w.*
			FROM	mapa_ctg_itm$rec_ym w
			ORDER BY w._index_
		LOOP
			INSERT INTO maw_ctg_itm_ym (
				ym,
				ctg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3
				)
			SELECT
				i._elem_,
				w.ctg_cd,
				w.itm_cd,
				w.itm_sub1,
				w.itm_sub2,
				w.itm_sub3
			FROM	maw_ctg_itm w
			WHERE	0=0
			;
		END LOOP ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_ctg_itm$p_set_ctg_grp_itm_ym(
	 IN i_ym_FROM	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ctg_grp_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる年月・品群グループＣＤに属する品群ＣＤに対してmaw_ctg_itm_ymを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym_from
		作成年月Ｆｒｏｍ
<IN>
	i_ym_to
		作成年月Ｔｏ
<IN>
	i_ctg_grp_cd
		品群グループＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD ;
	i RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_ctg_itm$rec_ym', 'TIMESTAMP WITHOUT TIME ZONE', 'INTEGER') ;
	CALL fcpa_postgres_util$p_truncate_work('maw_ctg_itm_ym') ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_ctg_itm$cursor_cur_term(i_ym_from, i_ym_to) w
	LOOP
		TRUNCATE TABLE mapa_ctg_itm$rec_ym ;
		CALL fcpa_postgres_util$p_truncate_work('maw_ctg_itm') ;

		CALL mapa_ctg_itm$p_set_ctg_grp_itm(x.term, i_ctg_grp_cd) ;

		CALL mapa_ctg_itm$p_set_ym_list(x, i_ym_from, i_ym_to) ;

		FOR i IN
			SELECT	w.*
			FROM	mapa_ctg_itm$rec_ym w
			ORDER BY w._index_
		LOOP
			INSERT INTO maw_ctg_itm_ym (
				ym,
				ctg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3
				)
			SELECT
				i._elem_,
				w.ctg_cd,
				w.itm_cd,
				w.itm_sub1,
				w.itm_sub2,
				w.itm_sub3
			FROM	maw_ctg_itm w
			WHERE	0=0
			;
		END LOOP ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_ctg_itm$p_set_ctg_ctg_ym(
	 IN i_ym_FROM	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ctg_cd	VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる年月・品群ＣＤに属する品群ＣＤをmaw_ctg_ctg_ymに作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym_from
		作成年月Ｆｒｏｍ
<IN>
	i_ym_to
		作成年月Ｔｏ
<IN>
	i_ctg_cd
		原価品群ＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD ;
	i RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_ctg_itm$rec_ym', 'TIMESTAMP WITHOUT TIME ZONE', 'INTEGER') ;
	CALL fcpa_postgres_util$p_truncate_work('maw_ctg_ctg_ym') ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_ctg_itm$cursor_cur_term(i_ym_from, i_ym_to) w
	LOOP
		TRUNCATE TABLE mapa_ctg_itm$rec_ym ;
		CALL fcpa_postgres_util$p_truncate_work('maw_ctg_ctg') ;

		CALL mapa_ctg_itm$p_set_ctg_ctg(x.term, i_ctg_cd) ;

		CALL mapa_ctg_itm$p_set_ym_list(x, i_ym_from, i_ym_to) ;

		FOR i IN
			SELECT	w.*
			FROM	mapa_ctg_itm$rec_ym w
			ORDER BY w._index_
		LOOP
			INSERT INTO maw_ctg_ctg_ym (
				ym,
				par_ctg_cd,
				ctg_cd
				)
			SELECT
				i._elem_,
				w.par_ctg_cd,
				w.ctg_cd
			FROM	maw_ctg_ctg w
			WHERE	0=0
			;
		END LOOP ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_ctg_itm$p_set_ctg_grp_ctg_ym(
	 IN i_ym_FROM	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ym_to	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_ctg_grp_cd VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	対象となる年月・品群グループＣＤに属する品群ＣＤに対してmaw_ctg_ctg_ymを作成する
<REMARKS>

<ARGUMENTS>
<IN>
	i_ym_from
		作成年月Ｆｒｏｍ
<IN>
	i_ym_to
		作成年月Ｔｏ
<IN>
	i_ctg_grp_cd
		品群グループＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	x RECORD ;
	i RECORD ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mapa_ctg_itm$rec_ym', 'TIMESTAMP WITHOUT TIME ZONE', 'INTEGER') ;
	CALL fcpa_postgres_util$p_truncate_work('maw_ctg_ctg_ym') ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_ctg_itm$cursor_cur_term(i_ym_from, i_ym_to) w
	LOOP
		TRUNCATE TABLE mapa_ctg_itm$rec_ym ;
		CALL fcpa_postgres_util$p_truncate_work('maw_ctg_ctg') ;

		CALL mapa_ctg_itm$p_set_ctg_grp_ctg(x.term, i_ctg_grp_cd) ;

		CALL mapa_ctg_itm$p_set_ym_list(x, i_ym_from, i_ym_to) ;

		FOR i IN
			SELECT	w.*
			FROM	mapa_ctg_itm$rec_ym w
			ORDER BY w._index_
		LOOP
			INSERT INTO maw_ctg_ctg_ym (
				ym,
				par_ctg_cd,
				ctg_cd
				)
			SELECT
				i._elem_,
				w.par_ctg_cd,
				w.ctg_cd
			FROM	maw_ctg_ctg w
			WHERE	0=0
			;
		END LOOP ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;
