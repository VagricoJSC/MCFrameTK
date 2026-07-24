\encoding UTF-8

CREATE OR REPLACE FUNCTION mgpa_co_parm$f_get_rec()
RETURNS mam_co_parm
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	原価会社パラメータマスタのレコードを返す
<REMARKS>

<ARGUMENTS>

<RETURNVALUE>
	対象となるMAM_CO_PARMのレコード
<HISTORY>
**********************************************************/
DECLARE
	l_rec mam_co_parm%ROWTYPE;
BEGIN
	BEGIN
		SELECT	m.*
		INTO	STRICT l_rec
		FROM	mam_co_parm m
		WHERE	0=0;
	EXCEPTION
		WHEN no_data_found THEN
			CALL fcpa_err$raise_app_err('MGBXD0038');
	END;
	RETURN l_rec;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_co_parm$f_get_calc_ctg_cd(
	 IN i_calc_ctg_cd VARCHAR)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	I_CALC_CTG_CDがNULLなら原価会社パラメータマスタの
	デフォルト計算カテゴリＣＤを返す
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_CTG_CD
		計算カテゴリＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_co_parm mam_co_parm%ROWTYPE;
	l_calc_ctg_cd mam_calc_ctg.calc_ctg_cd%TYPE;
BEGIN
	l_calc_ctg_cd := i_calc_ctg_cd;

	IF l_calc_ctg_cd IS NULL THEN
		l_co_parm := mgpa_co_parm$f_get_rec();

		IF l_co_parm.def_calc_ctg_cd IS NULL THEN
			/* 計算カテゴリが取得できませんでした。画面から指定するか、 */
			/* 原価会社パラメータマスタのデフォルト計算カテゴリＣＤを設定してください。 */
			CALL fcpa_err$raise_app_err('MGBDD0056');
		ELSE
			l_calc_ctg_cd := l_co_parm.def_calc_ctg_cd;
		END IF;
	END IF;
	RETURN l_calc_ctg_cd;
END;
$BODY$
LANGUAGE plpgsql
;

