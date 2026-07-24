\encoding UTF-8

ALTER TABLE mam_jnl_ptn_all
 ADD CONSTRAINT mam_jnl_ptn_all_ck06 CHECK (mon02_invalid_flg IN ('0', '1'));

