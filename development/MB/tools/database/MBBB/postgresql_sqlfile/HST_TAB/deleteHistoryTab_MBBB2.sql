\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mbt_jnl_historyd_all'
	 OR table_name = 'mbt_jnl_no_ctl_all'
	 OR table_name = 'mbt_jnl_grp_no_ctl_all'
	 OR table_name = 'mbt_note_history_all'
	 OR table_name = 'mbt_account_if_all'
	 OR table_name = 'mbt_sub_account_if_all'
	 OR table_name = 'mbt_ac_dpt_if_all'
	 OR table_name = 'mbt_bank_if_all'
	 OR table_name = 'mbt_bank_branch_if_all'
	;

