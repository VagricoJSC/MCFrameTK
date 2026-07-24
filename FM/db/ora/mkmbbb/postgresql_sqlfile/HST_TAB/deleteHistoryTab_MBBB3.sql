\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mbt_bank_ac_if_all'
	 OR table_name = 'mbt_cur_xrate_if_all'
	 OR table_name = 'mbt_ac_tax_if_all'
	 OR table_name = 'mbt_bac_ac_if_all'
	 OR table_name = 'mbt_journal_snd_if_all'
	 OR table_name = 'mbt_note_snd_if_all'
	 OR table_name = 'mbt_bp_snd_if_all'
	 OR table_name = 'mbt_schd_pay_history_all'
	 OR table_name = 'mbt_schd_pay_snd_if_all'
	;

