\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mbt_bp_stop_snd_if_all'
	 OR table_name = 'mbt_itm_stop_snd_if_all'
	 OR table_name = 'mbt_ex_ctrl_snd_if_all'
	 OR table_name = 'mbt_purc_upri_if_all'
	 OR table_name = 'mbt_proc_upri_if_all'
	 OR table_name = 'mbt_bp_if_all'
	 OR table_name = 'mbc_bulk_imp_ctg_lcl_all'
	 OR table_name = 'mbc_bulk_imp_ctl_lcl_all'
	;

