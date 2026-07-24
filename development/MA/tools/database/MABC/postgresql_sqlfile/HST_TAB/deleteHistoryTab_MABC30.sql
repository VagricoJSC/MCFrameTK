\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_dpt_config_all'
	 OR table_name = 'mam_act_ptn_cmn'
	 OR table_name = 'mam_act_ptn_all'
	 OR table_name = 'mam_gp_alc_cmn'
	 OR table_name = 'mam_gp_alc_all'
	 OR table_name = 'mam_calc_ctg_cmn'
	 OR table_name = 'mam_calc_ctg_all'
	 OR table_name = 'mam_rpt_ptn_cmn'
	 OR table_name = 'mam_rpt_ptn_all'
	;

