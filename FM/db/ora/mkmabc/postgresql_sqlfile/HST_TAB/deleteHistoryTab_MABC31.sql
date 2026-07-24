\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_ext_sys_cmn'
	 OR table_name = 'mam_ext_sys_all'
	 OR table_name = 'mam_if_protocol_cmn'
	 OR table_name = 'mam_if_protocol_all'
	 OR table_name = 'mam_if_adapter_cmn'
	 OR table_name = 'mam_if_adapter_all'
	 OR table_name = 'mam_if_cd_rule_cmn'
	 OR table_name = 'mam_if_cd_rule_all'
	 OR table_name = 'mam_if_x_cmn'
	;

