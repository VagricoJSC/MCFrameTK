\encoding UTF-8

CREATE OR REPLACE FUNCTION mgpa_calc_grp$f_get_rec(
	 IN i_calc_grp_cd VARCHAR
)
RETURNS mam_calc_grp
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	計算グループマスタのレコードを返す
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<RETURNVALUE>
	対象となるMAM_CALC_GRPのレコード
<HISTORY>
**********************************************************/
DECLARE
	l_rec mam_calc_grp%ROWTYPE;
	l_msg VARCHAR[];
BEGIN
	BEGIN
		SELECT
			m.*
			INTO	STRICT l_rec
			FROM	mam_calc_grp m
			WHERE	0=0 AND m.calc_grp_cd = i_calc_grp_cd;
	EXCEPTION
		WHEN no_data_found THEN
			l_msg := fcpa_err$msg_binder(i_calc_grp_cd);
			CALL fcpa_err$raise_app_err('MGBXD0042', l_msg);
	END;
	RETURN l_rec;
END;
$BODY$
LANGUAGE  plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_calc_grp$f_chk_max_mons(
	 IN i_arg mgt_arg
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	最大計算年月のときは１を返す
<REMARKS>
	対象となる期の最終月のほうが小さければ、
	対象となる期の最終月と比較する。
<ARGUMENTS>
<IN>	I_ARG
		原価計算情報
<RETURNVALUE>
	最大計算年月のときは１それ以外のときは０
<HISTORY>
**********************************************************/
DECLARE
	l_rec mam_calc_grp%ROWTYPE;
	l_end_ym mam_term.term%TYPE;
	x RECORD;
BEGIN
	l_rec := mgpa_calc_grp$f_get_rec(i_arg.calc_grp_cd);
	l_end_ym := fcpa_postgres_util$add_months(i_arg.st_ym, l_rec.max_mons - 1);

	FOR x IN
		SELECT
			fcpa_postgres_util$add_months(m.term_end_ym, - 1) AS end_ym
		FROM	mam_term m
		WHERE	0=0 
			AND m.term <= i_arg.st_ym 
			AND m.term_end_ym > i_arg.st_ym 
			AND m.term_end_ym <= l_end_ym
	LOOP
		IF x.end_ym < l_end_ym THEN
			l_end_ym := x.end_ym;
		END IF;
	END LOOP;

	IF i_arg.end_ym = l_end_ym THEN
		RETURN '1';
	END IF;
	RETURN '0';
END;
$BODY$
LANGUAGE  plpgsql
;

