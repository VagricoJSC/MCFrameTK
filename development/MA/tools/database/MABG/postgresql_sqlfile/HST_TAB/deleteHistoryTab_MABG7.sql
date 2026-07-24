\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_cost_slip_jnl_all'
	 OR table_name = 'mam_cost_ac_out_all'
	 OR table_name = 'mam_act_io_all'
	 OR table_name = 'mam_rec_eval_set_all'
	 OR table_name = 'mam_if_parm_all'
	 OR table_name = 'mam_calc_grp_lcl_all'
	 OR table_name = 'mam_calc_ptn_lcl_cmn'
	 OR table_name = 'mam_calc_ptn_lcl_all'
	 OR table_name = 'mam_cost_sls_lcl_cmn'
	;

