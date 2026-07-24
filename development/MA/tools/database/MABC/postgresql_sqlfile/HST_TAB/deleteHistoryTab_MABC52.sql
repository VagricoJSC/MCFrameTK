\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_alc_ac_lcl_cmn'
	 OR table_name = 'mam_alc_ac_lcl_all'
	 OR table_name = 'mam_ctg_grp_lcl_cmn'
	 OR table_name = 'mam_ctg_grp_lcl_all'
	 OR table_name = 'mam_cost_ctg_lcl_cmn'
	 OR table_name = 'mam_cost_ctg_lcl_all'
	 OR table_name = 'mam_cost_dpt_lcl_cmn'
	 OR table_name = 'mam_cost_dpt_lcl_all'
	 OR table_name = 'mam_act_ptn_lcl_cmn'
	;

