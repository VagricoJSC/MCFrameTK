CREATE OR REPLACE PROCEDURE mapa_cost_sys$p_init_calc_parm(
	 IN i_calc_grp_cd VARCHAR,
	 IN i_co_cd VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	原価計算パラメータの初期化
<REMARKS>
	MGT_PARM_ALL、MGT_PARM_DEFが存在しない場合は
	何も行なわない
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
	l_sql CONSTANT VARCHAR := 
					'
					INSERT INTO	mgt_parm_all (
						calc_grp_cd,
						parm_key,
						co_cd,
						parm_val
					) SELECT
						$1,
						m.parm_key,
						$2,
						m.parm_val
					FROM
						mgt_parm_def m
					';
BEGIN
	CALL mapa_cost_sys$p_del_calc_parm(i_calc_grp_cd, i_co_cd);

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.tables t
	WHERE	0=0
	AND	(t.table_name ILIKE 'mgt_parm_all' OR t.table_name ILIKE 'mgt_parm_def')
	;

	IF l_cnt = 2 THEN
		EXECUTE l_sql USING i_calc_grp_cd, i_co_cd;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_cost_sys$p_del_calc_parm(
	 IN i_calc_grp_cd VARCHAR,
	 IN i_co_cd VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	原価計算パラメータの削除
<REMARKS>
	mgt_parm_allが存在しない場合は
	何も行なわない
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
	l_sql CONSTANT VARCHAR := 
					'
					DELETE FROM	mgt_parm_all t
					WHERE	0=0
					AND	t.calc_grp_cd = $1
					AND	t.co_cd = $2
					';
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.tables t
	WHERE	0=0
	AND	t.table_name ILIKE 'mgt_parm_all'
	;

	IF l_cnt = 1 THEN
		EXECUTE l_sql USING i_calc_grp_cd, i_co_cd;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_cost_sys$p_init_non_mov_ctl(
	 IN i_co_cd VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	滞留制御情報を初期化する。
<REMARKS>
	mgc_non_mov_ctl_all、mgc_non_mov_ctl_defが存在しない場合は
	何も行なわない
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
	l_sql CONSTANT VARCHAR := 
					'
					INSERT INTO	mgc_non_mov_ctl_all (
						io_act_typ,
						co_cd,
						memo1,
						memo2,
						memo3
					) SELECT
						m.io_act_typ,
						$1,
						m.memo1,
						m.memo2,
						m.memo3
					FROM
						mgc_non_mov_ctl_def m
					';
BEGIN
	CALL mapa_cost_sys$p_del_non_mov_ctl(i_co_cd);

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.tables t
	WHERE	0=0
	AND	(t.table_name ILIKE 'mgc_non_mov_ctl_all' OR t.table_name ILIKE 'mgc_non_mov_ctl_def')
	;

	IF l_cnt = 2 THEN
		EXECUTE l_sql USING i_co_cd;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_cost_sys$p_del_non_mov_ctl(
	 IN i_co_cd VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	滞留制御情報を削除する。
<REMARKS>
	mgc_non_mov_ctl_allが存在しない場合は
	何も行なわない
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
	l_sql CONSTANT VARCHAR := 
					'
					DELETE FROM	mgc_non_mov_ctl_all t
					WHERE	0=0
					AND	t.co_cd = $1
					';
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.tables t
	WHERE	0=0
	AND	t.table_name ILIKE 'mgc_non_mov_ctl_all'
	;

	IF l_cnt = 1 THEN
		EXECUTE l_sql USING i_co_cd;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_cost_sys$p_ins_non_mov_ctl(
	 IN i_co_cd VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	mgc_non_mov_ctl_allに引数の会社ＣＤで登録されていないデータを追加する。
<REMARKS>
	mgc_non_mov_ctl_all、mgc_non_mov_ctl_defが存在しない場合は
	何も行なわない
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
	l_sql CONSTANT VARCHAR := 
					'
					INSERT INTO	mgc_non_mov_ctl_all (
						io_act_typ,
						co_cd,
						memo1,
						memo2,
						memo3
					) SELECT
						m.io_act_typ,
						$1,
						m.memo1,
						m.memo2,
						m.memo3
					FROM
						mgc_non_mov_ctl_def m
					WHERE	0=0
					AND	NOT EXISTS (
							SELECT	m.io_act_typ
							FROM	mgc_non_mov_ctl_all x
							WHERE	0=0
							AND	x.io_act_typ = m.io_act_typ
							AND	x.co_cd = $2
						)
					';
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.tables t
	WHERE	0=0
	AND	(t.table_name ILIKE 'mgc_non_mov_ctl_all' OR t.table_name ILIKE 'mgc_non_mov_ctl_def')
	;

	IF l_cnt = 2 THEN
		EXECUTE l_sql USING i_co_cd, i_co_cd;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;
