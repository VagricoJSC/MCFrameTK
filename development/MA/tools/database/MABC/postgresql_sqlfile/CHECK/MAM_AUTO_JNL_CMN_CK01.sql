\encoding UTF-8

ALTER TABLE mam_auto_jnl_cmn
 ADD CONSTRAINT mam_auto_jnl_cmn_ck01 CHECK (alloc_jnl_flg IN ('0', '1'));

