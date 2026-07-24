\encoding UTF-8

ALTER TABLE mam_auto_jnl_all
 ADD CONSTRAINT mam_auto_jnl_all_ck03 CHECK (rev_flg IN ('0', '1'));

