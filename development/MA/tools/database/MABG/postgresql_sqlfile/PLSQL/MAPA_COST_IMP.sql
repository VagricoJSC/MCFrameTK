\encoding UTF-8

CREATE OR REPLACE PROCEDURE mapa_cost_imp$p_main (
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt TIMESTAMP WITHOUT TIME ZONE
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	品目情報を原価管理の標準単価関連データに連携する
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		期
<IN>	i_dt
		対象日
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC ;

	l_dtl_flg CHAR(1) ;
	l_bom_flg CHAR(1) ;
	l_oper_flg CHAR(1) ;
	l_proc_flg CHAR(1) ;
	l_prov_flg CHAR(1) ;
	l_purc_flg CHAR(1) ;
	l_wk_flg CHAR(1) ;
	l_sls_typ mam_sys_parm.parm_val%TYPE ;

	x RECORD ;
BEGIN
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	information_schema.tables t
	WHERE	t.table_name ILIKE 'mgw_imp_interactive_key'
	;

	IF l_cnt = 0 THEN
		RETURN ;
	END IF ;

	l_dtl_flg := '0' ;
	l_bom_flg := '0' ;
	l_oper_flg := '0' ;
	l_proc_flg := '0' ;
	l_prov_flg := '0' ;
	l_purc_flg := '0' ;
	l_wk_flg := '0' ;
	l_sls_typ := NULL ;
	FOR x IN
		SELECT	m.parm_key,
			m.parm_val
		FROM	mam_sys_parm m
		WHERE	0=0
		AND m.parm_key LIKE 'COST_REF_%'
		AND m.parm_val IS NOT NULL
		AND m.del_flg= '0'
	LOOP
		IF x.parm_key = 'COST_REF_DTL_FLG' AND x.parm_val = '1' THEN
			l_dtl_flg := '1' ;
		END IF ;

		IF x.parm_key = 'COST_REF_BOM_FLG' AND x.parm_val = '1' THEN
			l_bom_flg := '1' ;
		END IF ;

		IF x.parm_key = 'COST_REF_OPER_FLG' AND x.parm_val = '1' THEN
			l_oper_flg := '1' ;
		END IF ;

		IF x.parm_key = 'COST_REF_PROC_FLG' AND x.parm_val = '1' THEN
			l_proc_flg := '1' ;
		END IF ;

		IF x.parm_key = 'COST_REF_PROV_FLG' AND x.parm_val = '1' THEN
			l_prov_flg := '1' ;
		END IF ;

		IF x.parm_key = 'COST_REF_PURC_FLG' AND x.parm_val = '1' THEN
			l_purc_flg := '1' ;
		END IF ;

		IF x.parm_key = 'COST_REF_WK_FLG' AND x.parm_val = '1' THEN
			l_wk_flg := '1' ;
		END IF ;

		IF x.parm_key = 'COST_REF_SLS_TYP' AND mac_sls_upri_imp_typ$contains(x.parm_val) = '1' THEN
			l_sls_typ := x.parm_val ;
		END IF ;
	END LOOP ;

	IF l_dtl_flg = '1' THEN
		CALL mgpa_imp_itm_dtl$p_set_key(i_term, i_dt) ;
		CALL mgpa_imp_itm_dtl$p_ins_mgw(NULL, NULL, i_term, i_dt) ;
		CALL mgpa_imp_itm_dtl$p_imp_mgt(i_term) ;
	END IF ;

	IF l_bom_flg = '1' THEN
		CALL mgpa_imp_bom$p_set_key(i_term, i_dt) ;
		CALL mgpa_imp_bom$p_ins_mgw(NULL, NULL, i_term, i_dt) ;
		CALL mgpa_imp_bom$p_imp_mgt(i_term) ;
	END IF ;

	IF l_oper_flg = '1' THEN
		CALL mgpa_imp_itm_oper$p_set_key(i_term, i_dt) ;
		CALL mgpa_imp_itm_oper$p_ins_mgw(NULL, NULL, i_term, i_dt) ;
		CALL mgpa_imp_itm_oper$p_imp_mgt(i_term) ;
	END IF ;

	IF l_proc_flg = '1' THEN
		CALL mgpa_imp_itm_proc$p_set_key(i_term, i_dt) ;
		CALL mgpa_imp_itm_proc$p_ins_mgw(NULL, NULL, i_term, i_dt) ;
		CALL mgpa_imp_itm_proc$p_imp_mgt(i_term) ;
	END IF ;

	IF l_prov_flg = '1' THEN
		CALL mgpa_imp_itm_prov$p_set_key(i_term, i_dt) ;
		CALL mgpa_imp_itm_prov$p_ins_mgw(NULL, NULL, i_term, i_dt) ;
		CALL mgpa_imp_itm_prov$p_imp_mgt(i_term) ;
	END IF ;

	IF l_purc_flg = '1' THEN
		CALL mgpa_imp_itm_purc$p_set_key(i_term, i_dt) ;
		CALL mgpa_imp_itm_purc$p_ins_mgw(NULL, NULL, i_term, i_dt) ;
		CALL mgpa_imp_itm_purc$p_imp_mgt(i_term) ;
	END IF ;

	IF l_sls_typ IS NOT NULL THEN
		CALL mgpa_imp_itm_sls$p_set_key(i_term, i_dt) ;
		CALL mgpa_imp_itm_sls$p_ins_mgw(NULL, NULL, i_term, i_dt, l_sls_typ) ;
		CALL mgpa_imp_itm_sls$p_imp_mgt(i_term) ;
	END IF ;

	IF l_wk_flg = '1' THEN
		CALL mgpa_imp_itm_wk$p_set_key(i_term, i_dt) ;
		CALL mgpa_imp_itm_wk$p_ins_mgw(NULL, NULL, i_term, i_dt) ;
		CALL mgpa_imp_itm_wk$p_imp_mgt(i_term) ;
	END IF ;


END ;
$BODY$
LANGUAGE plpgsql
;

