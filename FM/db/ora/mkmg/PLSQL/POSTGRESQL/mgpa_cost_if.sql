CREATE OR REPLACE FUNCTION mgpa_cost_if$f_get_dpt(
	 IN i_dpt VARCHAR,
	 IN i_fix_dpt VARCHAR,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_not_flg CHARACTER)
RETURNS VARCHAR
AS
$BODY$
/************************************************************************
<SYNOPSIS>
	部門ＣＤを原価部門ＣＤに変換する
<REMARKS>

<ARGUMENTS>
<IN>	i_dpt
		対象部門ＣＤ
<IN>	i_fix_dpt
		固定部門ＣＤ
<IN>	i_dt
		対象日
<IN>	i_not_flg
		変換無効フラグ
<RETURNVALUE>
		変換した原価部門ＣＤ
<HISTORY>
*************************************************************************/
DECLARE
	c_on CONSTANT CHAR(1) := '1' ;

	l_dpt_r mam_dpt%ROWTYPE;
	l_dt TIMESTAMP WITHOUT TIME ZONE;
BEGIN
	IF i_dpt IS NULL THEN
		RETURN NULL;
	END IF;

	IF i_fix_dpt IS NOT NULL THEN
		RETURN i_fix_dpt;
	END IF;

	IF i_not_flg = c_on THEN
		RETURN i_dpt;
	END IF;

	l_dt := DATE_TRUNC('DAY', i_dt);

	SELECT m.*
	INTO STRICT l_dpt_r
	FROM mam_dpt m
	WHERE 0=0
	AND m.dpt_cd = i_dpt
	AND m.st_dt <= l_dt
	AND m.end_dt >= l_dt;

	RETURN l_dpt_r.cost_dpt_cd;

EXCEPTION
	WHEN others THEN
		RETURN NULL;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_cost_if$p_get_dpt(
	 IN i_dpt VARCHAR,
	 IN i_fix_dpt VARCHAR,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	 INOUT io_rec_dpt mam_dpt[],
	 INOUT o_cost_dpt VARCHAR,
	 IN i_dpt_warn CHARACTER)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	部門マスタから原価部門を取得する。
<REMARKS>

<ARGUMENTS>
<IN>	i_dpt
		対象部門ＣＤ
<IN>	i_fix_dpt
		固定部門ＣＤ
<IN>	i_dt
		対象日
<IN>	io_rec_dpt
		部門ＣＤから原価部門ＣＤへの変換対応キャッシュデータ
<OUT>	o_cost_dpt
		変換した原価部門ＣＤ
<IN>	i_dpt_warn
		部門が取得できない場合にログを出力するか
<HISTORY>
*************************************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;

	l_dpt_warn CHAR(1);
	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	rec mam_dpt%ROWTYPE;
BEGIN
	IF i_dpt IS NULL THEN
		o_cost_dpt := i_dpt;
		RETURN;
	END IF;

	/* デフォルト値はc_onとする */
	IF i_dpt_warn IS NULL THEN
		l_dpt_warn := c_on;
	ELSE
		l_dpt_warn := i_dpt_warn;
	END IF;

	FOREACH rec IN ARRAY io_rec_dpt LOOP
		IF rec.dpt_cd = i_dpt THEN
			/* 部門マスタの原価部門 */
			o_cost_dpt := rec.cost_dpt_cd;
			RETURN;
		END IF;
	END LOOP;

	o_cost_dpt := mgpa_cost_if$f_get_dpt(i_dpt, i_fix_dpt, i_dt, c_off);

	rec.dpt_cd := i_dpt;
	rec.cost_dpt_cd := o_cost_dpt;

	io_rec_dpt[COALESCE(array_length(io_rec_dpt, 1), 0)+1] := rec;

	IF l_dpt_warn = c_on AND o_cost_dpt IS NULL THEN
		/* 対象の部門を原価部門に変換できませんでした。部門：{1} */
		CALL fcpa_batch_log$p_data_log('MGUCD0001', l_log_no, l_log_sub_key1, l_log_sub_key2, i_dpt);
	END IF ;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_cost_if$p_loc_init()
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	キャッシュをクリアする
<REMARKS>

<ARGUMENTS>
<HISTORY>
*************************************************************************/
BEGIN
	CALL fcpa_postgres_util$type_is_table_col('mgpa_cost_if$rec_loc', 'varchar', 'varchar') ;
	TRUNCATE TABLE mgpa_cost_if$rec_loc;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_cost_if$p_loc_cache(
	 IN i_loc VARCHAR,
	 IN i_cost_dpt VARCHAR)
AS 
$BODY$
/************************************************************************
<SYNOPSIS>
	場所ＣＤと原価部門ＣＤの組み合わせをキャッシュする
<REMARKS>

<ARGUMENTS>
<IN>	i_loc
		対象場所ＣＤ
<IN>	i_cost_dpt
		変換した原価部門ＣＤ
<HISTORY>
*************************************************************************/
BEGIN
	INSERT INTO mgpa_cost_if$rec_loc (_index_, _elem_) VALUES (i_loc, i_cost_dpt);
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_cost_if$f_get_loc_to_dpt(
	 IN i_loc VARCHAR)
RETURNS VARCHAR
AS
$BODY$
/************************************************************************
<SYNOPSIS>
	場所ＣＤを原価部門ＣＤに変換する
<REMARKS>

<ARGUMENTS>
<IN>	i_loc
		対象場所ＣＤ
<RETURNVALUE>
		変換した原価部門ＣＤ
<HISTORY>
*************************************************************************/
DECLARE
	l_cnt INTEGER;
	l_cost_dpt VARCHAR;
BEGIN
	IF i_loc IS NULL THEN
		RETURN NULL;
	END IF;

	SELECT COUNT(*) INTO STRICT l_cnt FROM mgpa_cost_if$rec_loc WHERE _index_ = i_loc;
	IF l_cnt > 0 THEN
		SELECT _elem_ INTO STRICT l_cost_dpt FROM mgpa_cost_if$rec_loc WHERE _index_ = i_loc;
		RETURN l_cost_dpt;
	END IF;
	RETURN NULL;
END;
$BODY$
LANGUAGE plpgsql
;
