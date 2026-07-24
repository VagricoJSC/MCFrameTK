\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_itm_comp_grp_lcl_cmn'
	 OR table_name = 'mam_itm_comp_grp_lcl_all'
	 OR table_name = 'mam_spln_itm_lcl_cmn'
	 OR table_name = 'mam_spln_itm_lcl_all'
	 OR table_name = 'mam_sttl_lcl_cmn'
	 OR table_name = 'mam_sttl_lcl_all'
	 OR table_name = 'mam_ac_dpt_lcl_cmn'
	 OR table_name = 'mam_ac_dpt_lcl_all'
	 OR table_name = 'mam_ac_subtypem_lcl_cmn'
	;

