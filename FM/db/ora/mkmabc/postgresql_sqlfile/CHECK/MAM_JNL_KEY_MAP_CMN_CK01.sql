\encoding UTF-8

ALTER TABLE mam_jnl_key_map_cmn
 ADD CONSTRAINT mam_jnl_key_map_cmn_ck01 CHECK (cost_flg IN ('0', '1'));

