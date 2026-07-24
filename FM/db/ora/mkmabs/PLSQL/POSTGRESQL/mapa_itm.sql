CREATE OR REPLACE FUNCTION mapa_itm$f_is_slo_stop(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目が受注禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	1: 受注禁止 / 0: 受注可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_itm_stop m
	WHERE	0=0
	AND	m.itm_cd = i_itm_cd
	AND	m.itm_sub1 = i_itm_sub1
	AND	m.itm_sub2 = i_itm_sub2
	AND	m.itm_sub3 = i_itm_sub3
	AND	m.slo_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0';
	ELSE
		RETURN '1';
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_itm$f_is_po_stop(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目が発注禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	1: 発注禁止 / 0: 発注可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_itm_stop m
	WHERE	0=0
	AND	m.itm_cd = i_itm_cd
	AND	m.itm_sub1 = i_itm_sub1
	AND	m.itm_sub2 = i_itm_sub2
	AND	m.itm_sub3 = i_itm_sub3
	AND	m.po_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0';
	ELSE
		RETURN '1';
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_itm$f_is_sls_stop(
	 IN i_itm_cd VARCHAR, 
	 IN i_itm_sub1 VARCHAR, 
	 IN i_itm_sub2 VARCHAR, 
	 IN i_itm_sub3 VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目が売上・出荷禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	1: 売上・出荷禁止 / 0: 売上・出荷可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_itm_stop m
	WHERE	0=0
	AND	m.itm_cd = i_itm_cd
	AND	m.itm_sub1 = i_itm_sub1
	AND	m.itm_sub2 = i_itm_sub2
	AND	m.itm_sub3 = i_itm_sub3
	AND	m.sls_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0';
	ELSE
		RETURN '1';
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_itm$f_is_purc_stop(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目が仕入・入荷禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	1: 仕入・入荷禁止 / 0: 仕入・入荷可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_itm_stop m
	WHERE	0=0
	AND	m.itm_cd = i_itm_cd
	AND	m.itm_sub1 = i_itm_sub1
	AND	m.itm_sub2 = i_itm_sub2
	AND	m.itm_sub3 = i_itm_sub3
	AND	m.purc_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0';
	ELSE
		RETURN '1';
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_itm$f_is_order_stop(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目が所要・オーダ禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	1: 所要・オーダ禁止 / 0: 所要・オーダ可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_itm_stop m
	WHERE	0=0
	AND	m.itm_cd = i_itm_cd
	AND	m.itm_sub1 = i_itm_sub1
	AND	m.itm_sub2 = i_itm_sub2
	AND	m.itm_sub3 = i_itm_sub3
	AND	m.order_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0';
	ELSE
		RETURN '1';
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_itm$f_is_mfg_inst_stop(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目が製造指図禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	1: 製造指図禁止 / 0: 製造指図可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_itm_stop m
	WHERE	0=0
	AND	m.itm_cd = i_itm_cd
	AND	m.itm_sub1 = i_itm_sub1
	AND	m.itm_sub2 = i_itm_sub2
	AND	m.itm_sub3 = i_itm_sub3
	AND	m.mfg_inst_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0';
	ELSE
		RETURN '1';
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_itm$f_is_ship_inst_stop(
	 IN i_itm_cd VARCHAR, 
	 IN i_itm_sub1 VARCHAR, 
	 IN i_itm_sub2 VARCHAR, 
	 IN i_itm_sub3 VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目が出荷指図禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	1: 出荷指図禁止 / 0: 出荷指図可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_itm_stop m
	WHERE	0=0
	AND	m.itm_cd = i_itm_cd
	AND	m.itm_sub1 = i_itm_sub1
	AND	m.itm_sub2 = i_itm_sub2
	AND	m.itm_sub3 = i_itm_sub3
	AND	m.ship_inst_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0';
	ELSE
		RETURN '1';
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_itm$f_is_xfr_stop(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目が移送・移動禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	1: 移送・移動禁止 / 0: 移送・移動可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_itm_stop m
	WHERE	0=0
	AND	m.itm_cd = i_itm_cd
	AND	m.itm_sub1 = i_itm_sub1
	AND	m.itm_sub2 = i_itm_sub2
	AND	m.itm_sub3 = i_itm_sub3
	AND	m.xfr_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0';
	ELSE
		RETURN '1';
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_itm$f_is_ex_stop(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_cntry_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		品目が輸出禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_cntry_cd
		国ＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
		1: 輸出禁止 / 0: 輸出可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_ex_ctrl m
	WHERE	0=0
	AND	m.cntry_cd = i_cntry_cd
	AND	m.st_dt <= i_base_dt
	AND	m.end_dt >= i_base_dt
	AND	m.del_flg = '0'
	AND	EXISTS (
			SELECT	'X'
			FROM	mam_itm x
			WHERE	0=0
			AND	x.itm_cd = i_itm_cd
			AND	x.itm_sub1 = i_itm_sub1
			AND	x.itm_sub2 = i_itm_sub2
			AND	x.itm_sub3 = i_itm_sub3
			AND	x.hs_cd = m.hs_cd
		)
	;

	IF l_cnt = 0 THEN
		RETURN '0';
	ELSE
		RETURN '1';
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_itm$f_get_sls_itm_grp_cd(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	販売品目体系ＣＤを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	販売品目体系ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_sls_itm_grp_cd mam_itm.sls_itm_grp_cd%TYPE;
	x RECORD;
BEGIN
	l_sls_itm_grp_cd := NULL;

	FOR x IN
		SELECT	p.sls_itm_grp_cd
		FROM	(
			SELECT	m.sls_itm_grp_cd,
				99 AS prio
			FROM	mam_itm m
			WHERE	0=0
			AND	m.itm_cd = i_itm_cd
			AND	m.itm_sub1 = i_itm_sub1
			AND	m.itm_sub2 = i_itm_sub2
			AND	m.itm_sub3 = i_itm_sub3
			UNION ALL
			SELECT	m.sls_itm_grp_cd,
				1 AS prio
			FROM	mam_itm_sub m
			WHERE	0=0
			AND	m.itm_cd = i_itm_cd
			AND	m.itm_sub1 = i_itm_sub1
			AND	m.itm_sub2 = i_itm_sub2
			AND	m.itm_sub3 = i_itm_sub3
			AND	m.st_dt <= i_base_dt
			AND	m.end_dt >= i_base_dt
			AND	m.del_flg = '0'
			) p
		WHERE	0=0
		ORDER BY p.prio
	LOOP
		l_sls_itm_grp_cd := x.sls_itm_grp_cd;
		EXIT;
	END LOOP;

	RETURN l_sls_itm_grp_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_itm$p_del_itm()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	maw_itm_keyに登録されている品目に対して
	品目マスタのレコードを削除する
<REMARKS>
<ARGUMENTS>
<RETURNVALUE>
<HISTORY>
**********************************************************/
DECLARE
	c_mam_itm CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM') ;
	c_all_com CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM') ;

	l_cnt NUMERIC;
	l_co mam_co.co_cd%TYPE;

	l_bind VARCHAR[];
	l_parm mam_sys_parm.parm_val%TYPE;

	x1 RECORD;
	y1 RECORD;
BEGIN
	l_co := fcpa_context$f_get_co_cd();

	SELECT	MAX(m.parm_val)
	INTO	STRICT l_parm
	FROM	mam_sys_parm m
	WHERE	0=0
	AND	m.parm_key = 'ITM_SUB_TYP'
	AND	m.del_flg = '0'
	;

	FOR x1 IN
		SELECT
			m.itm_cd,
			m.itm_sub1,
			m.itm_sub2,
			m.itm_sub3,
			m.release_flg
		FROM	maw_itm_key w, mam_itm_com m
		WHERE	0=0
		AND	w.itm_cd = m.itm_cd
		AND	w.itm_sub1 = m.itm_sub1
		AND	w.itm_sub2 = m.itm_sub2
		AND	w.itm_sub3 = m.itm_sub3
		AND	m.co_cd = l_co
		ORDER BY m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3
		FOR UPDATE OF m NOWAIT
	LOOP
		IF x1.release_flg = '1' THEN
			l_bind := fcpa_err$msg_binder(mapa_comm$f_to_disp_itm(x1.itm_cd, x1.itm_sub1, x1.itm_sub2, x1.itm_sub3, l_parm));
			CALL fcpa_err$raise_app_err('MABCD0001', l_bind);
		END IF;
	END LOOP;

	DELETE FROM mam_itm_com m
	WHERE	0=0
	AND	m.co_cd = l_co
	AND	EXISTS (
			SELECT	'X'
			FROM	maw_itm_key w
			WHERE	0=0
			AND	w.itm_cd = m.itm_cd
			AND	w.itm_sub1 = m.itm_sub1
			AND	w.itm_sub2 = m.itm_sub2
			AND	w.itm_sub3 = m.itm_sub3
		)
	;

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_mst_ctl m
	WHERE	0=0
	AND	m.mst_nm = c_mam_itm
	AND	m.mst_set_typ = c_all_com
	;

	IF l_cnt = 0 THEN
		DELETE FROM mam_itm_cmn_upd m
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	maw_itm_key w
				WHERE	0=0
				AND	w.itm_cd = m.itm_cd
				AND	w.itm_sub1 = m.itm_sub1
				AND	w.itm_sub2 = m.itm_sub2
				AND	w.itm_sub3 = m.itm_sub3
			)
		;

		DELETE FROM mam_itm_lcl m
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	maw_itm_key w
				WHERE	0=0
				AND	w.itm_cd = m.itm_cd
				AND	w.itm_sub1 = m.itm_sub1
				AND	w.itm_sub2 = m.itm_sub2
				AND	w.itm_sub3 = m.itm_sub3
			)
		;
	ELSE
		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mam_sys_parm m
		WHERE	0=0
		AND	m.parm_key = 'ITM_CMN_DEL'
		AND	m.parm_val = '1'
		AND	m.del_flg = '0'
		;

		IF l_cnt > 0 THEN
			FOR y1 IN
				SELECT	w.*
				FROM	maw_itm_key w
				WHERE	0=0
			LOOP
				SELECT	COUNT(*)
				INTO	STRICT l_cnt
				FROM	mam_itm_com m
				WHERE	0=0
				AND	m.itm_cd = y1.itm_cd
				AND	m.itm_sub1 = y1.itm_sub1
				AND	m.itm_sub2 = y1.itm_sub2
				AND	m.itm_sub3 = y1.itm_sub3
				;

				IF l_cnt = 0 THEN
					DELETE FROM mam_itm_cmn_upd m
					WHERE	0=0
					AND	m.itm_cd = y1.itm_cd
					AND	m.itm_sub1 = y1.itm_sub1
					AND	m.itm_sub2 = y1.itm_sub2
					AND	m.itm_sub3 = y1.itm_sub3
					;

					DELETE FROM mam_itm_lcl m
					WHERE	0=0
					AND	m.itm_cd = y1.itm_cd
					AND	m.itm_sub1 = y1.itm_sub1
					AND	m.itm_sub2 = y1.itm_sub2
					AND	m.itm_sub3 = y1.itm_sub3
					;
				END IF;
			END LOOP;
		END IF;
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;
