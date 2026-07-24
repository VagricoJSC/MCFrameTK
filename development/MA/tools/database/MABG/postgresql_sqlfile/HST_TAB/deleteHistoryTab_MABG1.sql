\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_calc_grp_all'
	 OR table_name = 'mam_calc_menu_all'
	 OR table_name = 'mam_calc_ptn_cmn'
	 OR table_name = 'mam_calc_ptn_all'
	 OR table_name = 'mam_grp_ptn_all'
	 OR table_name = 'mam_grp_ctg_all'
	 OR table_name = 'mam_grp_wg_all'
	 OR table_name = 'mam_co_parm_all'
	 OR table_name = 'mam_cost_sls_cmn'
	;

