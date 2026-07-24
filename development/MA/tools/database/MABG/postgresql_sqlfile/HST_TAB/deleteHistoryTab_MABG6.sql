\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_pre_alc_dpt_all'
	 OR table_name = 'mam_pre_rate_tgt_all'
	 OR table_name = 'mam_pre_alc_wk_all'
	 OR table_name = 'mam_cost_itm_out_all'
	 OR table_name = 'mam_xpns_purc_alc_all'
	 OR table_name = 'mam_ac_map_all'
	 OR table_name = 'mam_sub_ac_map_all'
	 OR table_name = 'mam_alc_ac_imp_all'
	 OR table_name = 'mam_cost_ac_dpt_map_all'
	;

