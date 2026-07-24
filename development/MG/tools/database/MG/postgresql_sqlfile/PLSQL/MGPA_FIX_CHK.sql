\encoding UTF-8

CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_dtl(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目詳細に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.itm_cd = i_itm_cd
	AND	t.itm_sub1 = i_itm_sub1
	AND	t.itm_sub2 = i_itm_sub2
	AND	t.itm_sub3 = i_itm_sub3
	AND	t.term = i_term
	AND	(i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND	EXISTS (
	    SELECT	'X'
	    FROM	mam_grp_ctg m1, mam_grp_ctg m2
	    WHERE	0=0
	    AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
	    AND	m1.calc_ctg_cd = t.calc_ctg_cd
	    AND	m1.calc_grp_cd = t.calc_grp_cd
	    AND	m1.calc_grp_cd = m2.calc_grp_cd
	    AND	m2.calc_ctg_cd = i_calc_ctg_cd
	    AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_dtl()
	    )
	LIMIT 1
	;

	IF i_wg_cd = c_null_val AND l_cnt > 0 THEN
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_std_fix t
		WHERE	0=0
		AND	t.itm_cd = i_itm_cd
		AND	t.itm_sub1 = i_itm_sub1
		AND	t.itm_sub2 = i_itm_sub2
		AND	t.itm_sub3 = i_itm_sub3
		AND	t.term = i_term
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
				AND	x.calc_ctg_cd = i_calc_ctg_cd
		)
		;
	END IF ;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_bom(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	ＢＯＭに関する標準単価が確定済みかチェックする。
<REMARKS>
<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.itm_cd = i_itm_cd
	AND	t.itm_sub1 = i_itm_sub1
	AND	t.itm_sub2 = i_itm_sub2
	AND	t.itm_sub3 = i_itm_sub3
	AND	t.term = i_term
	AND	(i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND	EXISTS (
	    SELECT	'X'
	    FROM	mam_grp_ctg m1, mam_grp_ctg m2
	    WHERE	0=0
	    AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
	    AND	m1.calc_ctg_cd = t.calc_ctg_cd
	    AND	m1.calc_grp_cd = t.calc_grp_cd
	    AND	m1.calc_grp_cd = m2.calc_grp_cd
	    AND	m2.calc_ctg_cd = i_calc_ctg_cd
	    AND	m2.calc_ctg_typ = mac_calc_ctg_typ$bom()
	    )
	LIMIT 1
	;

	IF i_wg_cd = c_null_val AND l_cnt > 0 THEN
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_std_fix t
		WHERE	0=0
		AND	t.itm_cd = i_itm_cd
		AND	t.itm_sub1 = i_itm_sub1
		AND	t.itm_sub2 = i_itm_sub2
		AND	t.itm_sub3 = i_itm_sub3
		AND	t.term = i_term
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
				AND	x.calc_ctg_cd = i_calc_ctg_cd
		)
		;
	END IF ;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_oper(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目工程に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.itm_cd = i_itm_cd
	AND	t.itm_sub1 = i_itm_sub1
	AND	t.itm_sub2 = i_itm_sub2
	AND	t.itm_sub3 = i_itm_sub3
	AND	t.term = i_term
	AND	(i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND	EXISTS (
	    SELECT	'X'
	    FROM	mam_grp_ctg m1, mam_grp_ctg m2
	    WHERE	0=0
	    AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
	    AND	m1.calc_ctg_cd = t.calc_ctg_cd
	    AND	m1.calc_grp_cd = t.calc_grp_cd
	    AND	m1.calc_grp_cd = m2.calc_grp_cd
	    AND	m2.calc_ctg_cd = i_calc_ctg_cd
	    AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_oper()
	    )
	LIMIT 1
	;

	IF i_wg_cd = c_null_val AND l_cnt > 0 THEN
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_std_fix t
		WHERE	0=0
		AND	t.itm_cd = i_itm_cd
		AND	t.itm_sub1 = i_itm_sub1
		AND	t.itm_sub2 = i_itm_sub2
		AND	t.itm_sub3 = i_itm_sub3
		AND	t.term = i_term
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
				AND	x.calc_ctg_cd = i_calc_ctg_cd
		)
		;
	END IF ;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_wk(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目工数に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.itm_cd = i_itm_cd
	AND	t.itm_sub1 = i_itm_sub1
	AND	t.itm_sub2 = i_itm_sub2
	AND	t.itm_sub3 = i_itm_sub3
	AND	t.term = i_term
	AND	(i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND	EXISTS (
	    SELECT	'X'
	    FROM	mam_grp_ctg m1, mam_grp_ctg m2
	    WHERE	0=0
	    AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
	    AND	m1.calc_ctg_cd = t.calc_ctg_cd
	    AND	m1.calc_grp_cd = t.calc_grp_cd
	    AND	m1.calc_grp_cd = m2.calc_grp_cd
	    AND	m2.calc_ctg_cd = i_calc_ctg_cd
	    AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_wk()
	    )
	LIMIT 1
	;

	IF i_wg_cd = c_null_val AND l_cnt > 0 THEN
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_std_fix t
		WHERE	0=0
		AND	t.itm_cd = i_itm_cd
		AND	t.itm_sub1 = i_itm_sub1
		AND	t.itm_sub2 = i_itm_sub2
		AND	t.itm_sub3 = i_itm_sub3
		AND	t.term = i_term
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
				AND	x.calc_ctg_cd = i_calc_ctg_cd
		)
		;
	END IF ;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_purc(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目購買単価に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.itm_cd = i_itm_cd
	AND	t.itm_sub1 = i_itm_sub1
	AND	t.itm_sub2 = i_itm_sub2
	AND	t.itm_sub3 = i_itm_sub3
	AND	t.term = i_term
	AND	(i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND	EXISTS (
	    SELECT	'X'
	    FROM	mam_grp_ctg m1, mam_grp_ctg m2
	    WHERE	0=0
	    AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
	    AND	m1.calc_ctg_cd = t.calc_ctg_cd
	    AND	m1.calc_grp_cd = t.calc_grp_cd
	    AND	m1.calc_grp_cd = m2.calc_grp_cd
	    AND	m2.calc_ctg_cd = i_calc_ctg_cd
	    AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_purc()
	    )
	LIMIT 1
	;

	IF i_wg_cd = c_null_val AND l_cnt > 0 THEN
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_std_fix t
		WHERE	0=0
		AND	t.itm_cd = i_itm_cd
		AND	t.itm_sub1 = i_itm_sub1
		AND	t.itm_sub2 = i_itm_sub2
		AND	t.itm_sub3 = i_itm_sub3
		AND	t.term = i_term
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
				AND	x.calc_ctg_cd = i_calc_ctg_cd
		)
		;
	END IF ;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_proc(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目加工単価に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.itm_cd = i_itm_cd
	AND	t.itm_sub1 = i_itm_sub1
	AND	t.itm_sub2 = i_itm_sub2
	AND	t.itm_sub3 = i_itm_sub3
	AND	t.term = i_term
	AND	(i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND	EXISTS (
	    SELECT	'X'
	    FROM	mam_grp_ctg m1, mam_grp_ctg m2
	    WHERE	0=0
	    AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
	    AND	m1.calc_ctg_cd = t.calc_ctg_cd
	    AND	m1.calc_grp_cd = t.calc_grp_cd
	    AND	m1.calc_grp_cd = m2.calc_grp_cd
	    AND	m2.calc_ctg_cd = i_calc_ctg_cd
	    AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_proc()
	    )
	LIMIT 1
	;

	IF i_wg_cd = c_null_val AND l_cnt > 0 THEN
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_std_fix t
		WHERE	0=0
		AND	t.itm_cd = i_itm_cd
		AND	t.itm_sub1 = i_itm_sub1
		AND	t.itm_sub2 = i_itm_sub2
		AND	t.itm_sub3 = i_itm_sub3
		AND	t.term = i_term
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
				AND	x.calc_ctg_cd = i_calc_ctg_cd
		)
		;
	END IF ;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_prov(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目支給単価に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.itm_cd = i_itm_cd
	AND	t.itm_sub1 = i_itm_sub1
	AND	t.itm_sub2 = i_itm_sub2
	AND	t.itm_sub3 = i_itm_sub3
	AND	t.term = i_term
	AND	(i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND	EXISTS (
	    SELECT	'X'
	    FROM	mam_grp_ctg m1, mam_grp_ctg m2
	    WHERE	0=0
	    AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
	    AND	m1.calc_ctg_cd = t.calc_ctg_cd
	    AND	m1.calc_grp_cd = t.calc_grp_cd
	    AND	m1.calc_grp_cd = m2.calc_grp_cd
	    AND	m2.calc_ctg_cd = i_calc_ctg_cd
	    AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_prov()
	    )
	LIMIT 1
	;

	IF i_wg_cd = c_null_val AND l_cnt > 0 THEN
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_std_fix t
		WHERE	0=0
		AND	t.itm_cd = i_itm_cd
		AND	t.itm_sub1 = i_itm_sub1
		AND	t.itm_sub2 = i_itm_sub2
		AND	t.itm_sub3 = i_itm_sub3
		AND	t.term = i_term
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
				AND	x.calc_ctg_cd = i_calc_ctg_cd
		)
		;
	END IF ;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_fix(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目で
	品目指値に関する標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND	t.itm_cd = i_itm_cd
	AND	t.itm_sub1 = i_itm_sub1
	AND	t.itm_sub2 = i_itm_sub2
	AND	t.itm_sub3 = i_itm_sub3
	AND	t.term = i_term
	AND	(i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND	EXISTS (
	    SELECT	'X'
	    FROM	mam_grp_ctg m1, mam_grp_ctg m2
	    WHERE	0=0
	    AND	m1.calc_ctg_typ = mac_calc_ctg_typ$calc_itm()
	    AND	m1.calc_ctg_cd = t.calc_ctg_cd
	    AND	m1.calc_grp_cd = t.calc_grp_cd
	    AND	m1.calc_grp_cd = m2.calc_grp_cd
	    AND	m2.calc_ctg_cd = i_calc_ctg_cd
	    AND	m2.calc_ctg_typ = mac_calc_ctg_typ$itm_fix()
	    )
	LIMIT 1
	;

	IF i_wg_cd = c_null_val AND l_cnt > 0 THEN
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_std_fix t
		WHERE	0=0
		AND	t.itm_cd = i_itm_cd
		AND	t.itm_sub1 = i_itm_sub1
		AND	t.itm_sub2 = i_itm_sub2
		AND	t.itm_sub3 = i_itm_sub3
		AND	t.term = i_term
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	mgt_calc_itm_fix x
				WHERE	0=0
				AND	x.calc_no = t.calc_no
				AND	x.calc_grp_cd = t.calc_grp_cd
				AND	x.itm_cd = t.itm_cd
				AND	x.itm_sub1 = t.itm_sub1
				AND	x.itm_sub2 = t.itm_sub2
				AND	x.itm_sub3 = t.itm_sub3
				AND	x.wg_cd = t.wg_cd
				AND	x.calc_ctg_cd = i_calc_ctg_cd
		)
		;
	END IF ;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_itm_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR,
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_on	CONSTANT CHAR(1) := '1' ;
	l_cnt	NUMERIC ;
BEGIN
	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_itm m
	WHERE	0=0
	AND (m.itm_cd = i_itm_cd OR i_itm_cd IS NULL)
	AND (m.itm_sub1 = i_itm_sub1 OR i_itm_sub1 IS NULL)
	AND (m.itm_sub2 = i_itm_sub2 OR i_itm_sub2 IS NULL)
	AND (m.itm_sub3 = i_itm_sub3 OR i_itm_sub3 IS NULL)
	AND m.term = i_term
	AND m.calc_ctg_cd = i_calc_ctg_cd
	AND m.wg_cd = i_wg_cd
	AND m.fix_flg = c_on
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_dtl_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目詳細情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN
	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND t.term = i_term
	AND (i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND EXISTS (
			SELECT 'X'
			FROM	mgt_calc_itm_dtl x
			WHERE	0=0
			AND x.calc_no = t.calc_no
			AND x.calc_grp_cd = t.calc_grp_cd
			AND x.itm_cd = t.itm_cd
			AND x.itm_sub1 = t.itm_sub1
			AND x.itm_sub2 = t.itm_sub2
			AND x.itm_sub3 = t.itm_sub3
			AND x.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM	mgt_itm_dtl m
					WHERE	0=0
					AND m.itm_cd = x.itm_cd
					AND m.itm_sub1 = x.itm_sub1
					AND m.itm_sub2 = x.itm_sub2
					AND m.itm_sub3 = x.itm_sub3
					AND m.loc_cd = x.loc_cd
					AND m.sppl_cd = x.sppl_cd
					AND m.rqst_wg_cd = x.rqst_wg_cd
					AND m.calc_ctg_cd = x.calc_ctg_cd
					AND m.wg_cd = i_wg_cd AND m.term = i_term
					AND m.calc_ctg_cd = i_calc_ctg_cd
				)
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_bom_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	ＢＯＭ情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND t.term = i_term
	AND (i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND EXISTS (
			SELECT 'X'
			FROM	mgt_calc_bom x
			WHERE	0=0
			AND x.calc_no = t.calc_no
			AND x.calc_grp_cd = t.calc_grp_cd
			AND x.par_itm_cd = t.itm_cd
			AND x.par_itm_sub1 = t.itm_sub1
			AND x.par_itm_sub2 = t.itm_sub2
			AND x.par_itm_sub3 = t.itm_sub3
			AND x.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM	mgt_bom m
					WHERE	0=0
					AND m.par_itm_cd = x.par_itm_cd
					AND m.par_itm_sub1 = x.par_itm_sub1
					AND m.par_itm_sub2 = x.par_itm_sub2
					AND m.par_itm_sub3 = x.par_itm_sub3
					AND m.bom_ptn = x.bom_ptn
					AND (m.oper_cd = x.oper_cd OR m.oper_cd IS NULL AND x.oper_cd IS NULL)
					AND (m.oper_seq = x.oper_seq OR m.oper_seq IS NULL AND x.oper_seq IS NULL)
					AND m.chd_itm_cd = x.chd_itm_cd
					AND m.chd_itm_sub1 = x.chd_itm_sub1
					AND m.chd_itm_sub2 = x.chd_itm_sub2
					AND m.chd_itm_sub3 = x.chd_itm_sub3
					AND (m.alt_grp_cd = x.alt_grp_cd OR m.alt_grp_cd IS NULL AND x.alt_grp_cd IS NULL)
					AND (m.expns_cd = x.expns_cd OR m.expns_cd IS NULL AND x.expns_cd IS NULL)
					AND m.calc_ctg_cd = x.calc_ctg_cd
					AND m.wg_cd = i_wg_cd
					AND m.term = i_term
					AND m.calc_ctg_cd = i_calc_ctg_cd
				)
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_oper_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目工程情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND t.term = i_term
	AND (i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND EXISTS (
			SELECT 'X'
			FROM	mgt_calc_itm_oper x
			WHERE	0=0
			AND x.calc_no = t.calc_no
			AND x.calc_grp_cd = t.calc_grp_cd
			AND x.itm_cd = t.itm_cd
			AND x.itm_sub1 = t.itm_sub1
			AND x.itm_sub2 = t.itm_sub2
			AND x.itm_sub3 = t.itm_sub3
			AND x.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM	mgt_itm_oper m
					WHERE	0=0
					AND m.itm_cd = x.itm_cd
					AND m.itm_sub1 = x.itm_sub1
					AND m.itm_sub2 = x.itm_sub2
					AND m.itm_sub3 = x.itm_sub3
					AND m.loc_cd = x.loc_cd
					AND m.oper_ptn = x.oper_ptn
					AND m.oper_cd = x.oper_cd
					AND m.oper_seq = x.oper_seq
					AND m.calc_ctg_cd = x.calc_ctg_cd
					AND m.wg_cd = i_wg_cd
					AND m.term = i_term
					AND m.calc_ctg_cd = i_calc_ctg_cd
				)
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_wk_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目工数情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND t.term = i_term
	AND (i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND EXISTS (
			SELECT 'X'
			FROM	mgt_calc_itm_wk x
			WHERE	0=0
			AND x.calc_no = t.calc_no
			AND x.calc_grp_cd = t.calc_grp_cd
			AND x.itm_cd = t.itm_cd
			AND x.itm_sub1 = t.itm_sub1
			AND x.itm_sub2 = t.itm_sub2
			AND x.itm_sub3 = t.itm_sub3
			AND x.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM	mgt_itm_wk m
					WHERE	0=0
					AND m.itm_cd = x.itm_cd
					AND m.itm_sub1 = x.itm_sub1
					AND m.itm_sub2 = x.itm_sub2
					AND m.itm_sub3 = x.itm_sub3
					AND m.loc_cd = x.loc_cd
					AND m.oper_ptn = x.oper_ptn
					AND m.oper_cd = x.oper_cd
					AND m.oper_seq = x.oper_seq
					AND m.wk_cost_cd = x.wk_cost_cd
					AND m.calc_ctg_cd = x.calc_ctg_cd
					AND m.wg_cd = i_wg_cd
					AND m.term = i_term
					AND m.calc_ctg_cd = i_calc_ctg_cd
				)
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_purc_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目購買単価情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND t.term = i_term
	AND (i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND EXISTS (
			SELECT 'X'
			FROM	mgt_calc_itm_purc x
			WHERE	0=0
			AND x.calc_no = t.calc_no
			AND x.calc_grp_cd = t.calc_grp_cd
			AND x.itm_cd = t.itm_cd
			AND x.itm_sub1 = t.itm_sub1
			AND x.itm_sub2 = t.itm_sub2
			AND x.itm_sub3 = t.itm_sub3
			AND x.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM	mgt_itm_purc m
					WHERE	0=0
					AND m.itm_cd = x.itm_cd
					AND m.itm_sub1 = x.itm_sub1
					AND m.itm_sub2 = x.itm_sub2
					AND m.itm_sub3 = x.itm_sub3
					AND m.sppl_cd = x.sppl_cd
					AND m.calc_ctg_cd = x.calc_ctg_cd
					AND m.wg_cd = i_wg_cd
					AND m.term = i_term
					AND m.calc_ctg_cd = i_calc_ctg_cd
				)
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_proc_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目加工単価情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND t.term = i_term
	AND (i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND EXISTS (
			SELECT 'X'
			FROM	mgt_calc_itm_proc x
			WHERE	0=0
			AND x.calc_no = t.calc_no
			AND x.calc_grp_cd = t.calc_grp_cd
			AND x.itm_cd = t.itm_cd
			AND x.itm_sub1 = t.itm_sub1
			AND x.itm_sub2 = t.itm_sub2
			AND x.itm_sub3 = t.itm_sub3
			AND x.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM	mgt_itm_proc m
					WHERE	0=0
					AND m.itm_cd = x.itm_cd
					AND m.itm_sub1 = x.itm_sub1
					AND m.itm_sub2 = x.itm_sub2
					AND m.itm_sub3 = x.itm_sub3
					AND m.sppl_cd = x.sppl_cd
					AND m.calc_ctg_cd = x.calc_ctg_cd
					AND m.wg_cd = i_wg_cd
					AND m.term = i_term
					AND m.calc_ctg_cd = i_calc_ctg_cd
				)
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_prov_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目支給単価情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN

	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND t.term = i_term
	AND (i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND EXISTS (
			SELECT 'X'
			FROM	mgt_calc_itm_prov x
			WHERE	0=0
			AND x.calc_no = t.calc_no
			AND x.calc_grp_cd = t.calc_grp_cd
			AND x.itm_cd = t.itm_cd
			AND x.itm_sub1 = t.itm_sub1
			AND x.itm_sub2 = t.itm_sub2
			AND x.itm_sub3 = t.itm_sub3
			AND x.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM	mgt_itm_prov m
					WHERE	0=0
					AND m.itm_cd = x.itm_cd
					AND m.itm_sub1 = x.itm_sub1
					AND m.itm_sub2 = x.itm_sub2
					AND m.itm_sub3 = x.itm_sub3
					AND m.prsppl_cd = x.prsppl_cd
					AND m.calc_ctg_cd = x.calc_ctg_cd
					AND m.wg_cd = i_wg_cd
					AND m.term = i_term
					AND m.calc_ctg_cd = i_calc_ctg_cd
				)
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_fix_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤ、品目が
	品目指値情報にあり標準単価が確定済みかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	l_cnt	NUMERIC ;
BEGIN
	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_fix t
	WHERE	0=0
	AND t.term = i_term
	AND (i_wg_cd = c_null_val OR t.wg_cd = i_wg_cd)
	AND EXISTS (
			SELECT 'X'
			FROM	mgt_calc_itm_fix x
			WHERE	0=0
			AND x.calc_no = t.calc_no
			AND x.calc_grp_cd = t.calc_grp_cd
			AND x.itm_cd = t.itm_cd
			AND x.itm_sub1 = t.itm_sub1
			AND x.itm_sub2 = t.itm_sub2
			AND x.itm_sub3 = t.itm_sub3
			AND x.wg_cd = i_wg_cd
			AND EXISTS (
					SELECT 'X'
					FROM	mgt_itm_fix m
					WHERE	0=0
					AND m.itm_cd = x.itm_cd
					AND m.itm_sub1 = x.itm_sub1
					AND m.itm_sub2 = x.itm_sub2
					AND m.itm_sub3 = x.itm_sub3
					AND m.expns_cd = x.expns_cd
					AND m.calc_ctg_cd = x.calc_ctg_cd
					AND m.wg_cd = i_wg_cd
					AND m.term = i_term
					AND m.calc_ctg_cd = i_calc_ctg_cd
				)
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_alc_rate_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_ctg_cd VARCHAR,
	 IN i_wg_cd VARCHAR
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	指定した期、計算カテゴリＣＤ、ワーキンググループＣＤで
	標準配賦率が確定済みのレコードが存在するかチェックする。
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_calc_ctg_cd
		計算カテゴリＣＤ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_on	CONSTANT CHAR(1) := '1' ;
	l_cnt	NUMERIC ;
BEGIN
	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_alc_rate m
	WHERE	0=0
	AND m.term = i_term
	AND m.calc_ctg_cd = i_calc_ctg_cd
	AND m.wg_cd = i_wg_cd
	AND m.fix_flg = c_on
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_alc_rule_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	配賦方法マスタ確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_on	CONSTANT CHAR(1) := '1' ;
	l_cnt	NUMERIC ;
BEGIN
	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_alc_rate m
	WHERE	0=0
	AND m.term = i_term
	AND m.fix_flg = c_on
	AND EXISTS (
			SELECT 'X'
			FROM	mam_alc_rule x
			WHERE	0=0
			AND x.alc_ptn_cd = m.fix_alc_ptn_cd
			AND x.term = m.term
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_alc_wk_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	工数配賦マスタ確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_on	CONSTANT CHAR(1) := '1' ;
	l_cnt	NUMERIC ;
BEGIN
	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_alc_rate m
	WHERE	0=0
	AND m.term = i_term
	AND m.fix_flg = c_on
		AND EXISTS (
			SELECT 'X'
			FROM	mam_alc_wk x
			WHERE	0=0
			AND x.alc_ptn_cd = m.fix_alc_ptn_cd
			AND x.term = m.term
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_alc_expns_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	費目配賦マスタ確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_on	CONSTANT CHAR(1) := '1' ;
	l_cnt	NUMERIC ;
BEGIN
	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_alc_rate m
	WHERE	0=0
	AND m.term = i_term
	AND m.fix_flg = c_on
	AND EXISTS (
			SELECT 'X'
			FROM	mam_alc_expns x
			WHERE	0=0
			AND x.alc_ptn_cd = m.fix_alc_ptn_cd
			AND x.term = m.term
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_alc_inpt_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	投入配賦マスタ確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_on	CONSTANT CHAR(1) := '1' ;
	l_cnt	NUMERIC ;
BEGIN
	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_alc_rate m
	WHERE	0=0
	AND m.term = i_term
	AND m.fix_flg = c_on
	AND EXISTS (
			SELECT 'X'
			FROM	mam_alc_inpt x
			WHERE	0=0
			AND x.alc_ptn_cd = m.fix_alc_ptn_cd
			AND x.term = m.term
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_fix_chk$f_alc_other_m(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	任意基準値配賦マスタ確定チェック
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<RETURNVALUE>
	確定済みのときは'1'、未確定のときは'0'を返す
<HISTORY>
**************************************************************************/
DECLARE
	c_ok	CONSTANT CHAR(1) := '0' ;
	c_ng	CONSTANT CHAR(1) := '1' ;
	c_on	CONSTANT CHAR(1) := '1' ;
	l_cnt	NUMERIC ;
BEGIN
	SELECT COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_std_alc_rate m
	WHERE	0=0
	AND m.term = i_term
	AND m.fix_flg = c_on
	AND EXISTS (
			SELECT 'X'
			FROM	mam_alc_other x
			WHERE	0=0
			AND x.alc_ptn_cd = m.fix_alc_ptn_cd
			AND x.term = m.term
		)
	LIMIT 1
	;

	IF l_cnt = 0 THEN
		RETURN c_ok ;
	ELSE
		RETURN c_ng ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

