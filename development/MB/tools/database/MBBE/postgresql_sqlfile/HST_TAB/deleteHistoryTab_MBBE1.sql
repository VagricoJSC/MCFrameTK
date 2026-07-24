\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mbt_biz_dat_dl_all'
	 OR table_name = 'mbc_bulk_imp_ctg_def'
	 OR table_name = 'mbc_bulk_imp_ctg_lcl_def'
	 OR table_name = 'mbc_bulk_imp_ctg_all'
	 OR table_name = 'mbc_bulk_imp_ctl_def'
	 OR table_name = 'mbc_bulk_imp_ctl_lcl_def'
	 OR table_name = 'mbc_bulk_imp_ctl_all'
	 OR table_name = 'mbt_bp_snd_if_ext_all'
	 OR table_name = 'mbt_itm_snd_if_all'
	;

