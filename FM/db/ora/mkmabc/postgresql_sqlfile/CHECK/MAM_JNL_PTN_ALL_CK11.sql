\encoding UTF-8

ALTER TABLE mam_jnl_ptn_all
 ADD CONSTRAINT mam_jnl_ptn_all_ck11 CHECK (mon07_invalid_flg IN ('0', '1'));

