\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_acc_top_tmp_all'
	 OR table_name = 'mgt_acc_sml_cost_tmp_all'
	 OR table_name = 'mgt_rpt_all'
	 OR table_name = 'mgt_io_all'
	 OR table_name = 'mgt_ave_fix_all'
	 OR table_name = 'mgt_wip_loc_all'
	 OR table_name = 'mgt_cost_io1_all'
	 OR table_name = 'mgt_cost_io2_all'
	 OR table_name = 'mgt_cost_io3_all'
	;

