\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_ac_itm_grp_cmn'
	 OR table_name = 'mam_ac_itm_grp_all'
	 OR table_name = 'mam_ac_rsn_cmn'
	 OR table_name = 'mam_ac_rsn_all'
	 OR table_name = 'mam_biz_rsn_cmn'
	 OR table_name = 'mam_biz_rsn_all'
	 OR table_name = 'mam_wk_rsn_cmn'
	 OR table_name = 'mam_wk_rsn_all'
	 OR table_name = 'mam_wk_cost_cmn'
	;

