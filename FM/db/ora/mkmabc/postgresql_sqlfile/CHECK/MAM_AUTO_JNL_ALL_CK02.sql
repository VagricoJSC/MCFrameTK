\encoding UTF-8

ALTER TABLE mam_auto_jnl_all
 ADD CONSTRAINT mam_auto_jnl_all_ck02 CHECK (minus_flg IN ('0', '1'));

