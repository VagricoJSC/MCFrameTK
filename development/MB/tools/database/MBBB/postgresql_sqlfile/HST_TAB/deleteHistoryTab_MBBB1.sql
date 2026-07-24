\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mbt_ac_io_all'
	 OR table_name = 'mbt_ac_stk_all'
	 OR table_name = 'mbt_ac_cost_all'
	 OR table_name = 'mbt_ac_rcv_all'
	 OR table_name = 'mbt_ac_note_all'
	 OR table_name = 'mbt_ac_pay_all'
	 OR table_name = 'mbt_ac_schd_pay_all'
	 OR table_name = 'mbt_journal_all'
	 OR table_name = 'mbt_jnl_history_all'
	;

