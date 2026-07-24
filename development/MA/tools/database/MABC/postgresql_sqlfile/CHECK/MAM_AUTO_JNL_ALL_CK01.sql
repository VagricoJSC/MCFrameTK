\encoding UTF-8

ALTER TABLE mam_auto_jnl_all
 ADD CONSTRAINT mam_auto_jnl_all_ck01 CHECK (alloc_jnl_flg IN ('0', '1'));

