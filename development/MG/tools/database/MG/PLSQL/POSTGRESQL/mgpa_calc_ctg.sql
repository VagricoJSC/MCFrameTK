CREATE OR REPLACE PROCEDURE mgpa_calc_ctg$p_set_work (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_ctg_typ VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	対象となる計算カテゴリＣＤをmgw_calc_ctgに作成する。
<REMARKS>
	mam_grp_ctgのデータはctg_prio, calc_ctg_cdで
	ソートした順で優先度を１から順に設定する。
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_ctg_typ
		計算カテゴリ区分
<HISTORY>
**********************************************************/
DECLARE
	l_ctg_prio	mam_grp_ctg.ctg_prio%TYPE ;
	x	RECORD ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('mgw_calc_ctg') ;

	l_ctg_prio := 0 ;
	FOR x IN
		SELECT
			m.calc_ctg_cd AS calc_ctg_cd,
			m.ctg_prio AS ctg_prio
		FROM	mam_grp_ctg m
		WHERE	0=0
		AND	m.calc_grp_cd = i_calc_grp_cd
		AND	m.calc_ctg_typ = i_calc_ctg_typ
		ORDER BY m.ctg_prio, m.calc_ctg_cd
	LOOP
		l_ctg_prio := l_ctg_prio + 1 ;
		INSERT INTO mgw_calc_ctg (
			calc_ctg_cd,
			ctg_prio
			)
		VALUES (
			x.calc_ctg_cd,
			l_ctg_prio
			)
		;
	END LOOP ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_calc_ctg$p_set_work_all (
	 IN i_calc_grp_cd VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	計算グループＣＤに対して対象となる計算カテゴリ区分ごとに
	計算カテゴリＣＤをmgw_calc_grp_ctgに作成する。
<REMARKS>
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<HISTORY>
**********************************************************/
DECLARE
	x	RECORD ;
BEGIN
	CALL fcpa_postgres_util$p_truncate_work('mgw_calc_grp_ctg') ;

	FOR x IN
		SELECT DISTINCT
			m.calc_ctg_typ
		FROM	mam_grp_ctg m
		WHERE	0=0
		AND	m.calc_grp_cd = i_calc_grp_cd
	LOOP
		CALL mgpa_calc_ctg$p_set_work(i_calc_grp_cd, x.calc_ctg_typ) ;

		INSERT INTO mgw_calc_grp_ctg (
			calc_ctg_typ,
			calc_ctg_cd,
			ctg_prio
			)
		SELECT
			x.calc_ctg_typ,
			w.calc_ctg_cd,
			w.ctg_prio
		FROM	mgw_calc_ctg w
		WHERE	0=0
		;
	END LOOP ;
END ;
$BODY$
LANGUAGE plpgsql
;
