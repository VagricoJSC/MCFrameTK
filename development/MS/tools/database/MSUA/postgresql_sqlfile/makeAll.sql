\encoding UTF-8

\i ./make1MSUA.sql

\i ./make1MSUA-s.sql

\i ./make2MSUA.sql

\i ./make3MSUA.sql

\i ./makeComment_MSUA.sql

\i ./makeHistoryTab_MSUA.sql

\i ./makeHistoryTrigger_MSUA.sql

\i ./makeExctrlTrigg_MSUA.sql

DO $$
DECLARE
/************************************************************************/
/* SYNOPSIS :								*/
/*	改訂履歴テーブルから登録担当者登録用トリガを削除します。。	*/
/************************************************************************/
	cur_sql CURSOR FOR
		SELECT
			tbl.table_name,
			LOWER(tbl.table_name) || '_tr_u' trg_name,
			'DROP TRIGGER IF EXISTS ' || LOWER(tbl.table_name) || '_tr_u ON ' || LOWER(tbl.table_name) drop_trg_sql,
			'DROP FUNCTION IF EXISTS ' || LOWER(tbl.table_name) || '_tr_u_body' drop_trg_func_sql
		FROM (
			SELECT t.table_name
			FROM information_schema.tables t
			WHERE 0=0
			AND t.table_name IN ('mst_slo_p_all'
								,'mst_slo_d_p_all'
								,'mst_slo_prms_p_all'
								,'mst_itm_mfg_inst_p_all'
								,'mst_mfg_inst_p_all'
								,'mst_oper_inst_p_all'
								,'mst_yield_schd_p_all'
								,'mst_inpt_schd_p_all'
								,'mst_wk_schd_p_all'
								,'mst_po_p_all'
								,'mst_po_d_p_all'
								,'mst_purc_ret_act_p_all'
								,'mst_purc_ret_act_d_p_all'
								,'mst_purc_ret_act_io_p_all'
								,'mst_acxfr_act_p_all'
								,'mst_acxfr_act_d_p_all'
								,'mst_ship_alloc_sts_p_all'
								,'mst_ship_inst_p_all'
								,'mst_ship_inst_d_p_all'
								,'mst_ship_act_p_all'
								,'mst_ship_act_d_p_all')
			AND EXISTS (SELECT 'x' FROM pg_trigger u WHERE LOWER(t.table_name) || '_tr_u' = u.tgname)
			ORDER BY t.table_name
			) tbl
		WHERE 0=0
		;
	x RECORD ;
BEGIN
	FOR x IN cur_sql LOOP
		RAISE INFO '%', x.table_name || ' DROP TRIGGER(' || x.trg_name || ')' ;
		EXECUTE x.drop_trg_sql ;
		EXECUTE x.drop_trg_func_sql ;
		RAISE INFO '%', x.table_name || ' SUCCEED DROP TRIGGER(' || x.trg_name || ')' ;
	END LOOP ;

EXCEPTION
	WHEN OTHERS THEN
		RAISE WARNING 'ERROR !!%', SQLSTATE ;
		RAISE WARNING USING MESSAGE = SQLERRM ;
END ;
$$
;

\i ./makeAll_PJ.sql

