\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_lot_inh_src_all'
	 OR table_name = 'mam_itm_ver_all'
	 OR table_name = 'mam_itm_not_fix_all'
	 OR table_name = 'mam_loss_rsn_all'
	 OR table_name = 'mam_wg_rqst_ctl_all'
	 OR table_name = 'mam_itm_lg_grp_all'
	 OR table_name = 'mam_itm_str_ln_all'
	 OR table_name = 'mam_a_wrk_no_issue_all'
	 OR table_name = 'mam_item_ship_comp_all'
	;

