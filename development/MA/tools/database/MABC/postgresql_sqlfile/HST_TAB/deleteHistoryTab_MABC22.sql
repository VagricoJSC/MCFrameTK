\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_itm_spec_grp_cmn'
	 OR table_name = 'mam_itm_spec_grp_all'
	 OR table_name = 'mam_itm_comp_grp_cmn'
	 OR table_name = 'mam_itm_comp_grp_all'
	 OR table_name = 'mam_spln_itm_cmn'
	 OR table_name = 'mam_spln_itm_all'
	 OR table_name = 'mam_sttl_cmn'
	 OR table_name = 'mam_sttl_all'
	 OR table_name = 'mam_ac_dpt_cmn'
	;

