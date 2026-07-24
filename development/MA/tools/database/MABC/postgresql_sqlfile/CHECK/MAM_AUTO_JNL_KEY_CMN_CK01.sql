\encoding UTF-8

ALTER TABLE mam_auto_jnl_key_cmn
 ADD CONSTRAINT mam_auto_jnl_key_cmn_ck01 CHECK (del_flg IN ('0', '1'));

