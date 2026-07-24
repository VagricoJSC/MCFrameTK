\encoding UTF-8

ALTER TABLE mam_auto_jnl_cmn
 ADD CONSTRAINT mam_auto_jnl_cmn_ck02 CHECK (minus_flg IN ('0', '1'));

