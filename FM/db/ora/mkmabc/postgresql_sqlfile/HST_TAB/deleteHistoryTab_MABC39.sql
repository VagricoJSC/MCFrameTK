\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_sls_itm_grp_lcl_all'
	 OR table_name = 'mam_itm_jnl_lcl_cmn'
	 OR table_name = 'mam_itm_jnl_lcl_all'
	 OR table_name = 'mam_ac_itm_grp_lcl_cmn'
	 OR table_name = 'mam_ac_itm_grp_lcl_all'
	 OR table_name = 'mam_ac_rsn_lcl_cmn'
	 OR table_name = 'mam_ac_rsn_lcl_all'
	 OR table_name = 'mam_biz_rsn_lcl_cmn'
	 OR table_name = 'mam_biz_rsn_lcl_all'
	;

