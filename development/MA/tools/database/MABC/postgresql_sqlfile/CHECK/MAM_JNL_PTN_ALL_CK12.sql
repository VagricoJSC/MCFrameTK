\encoding UTF-8

ALTER TABLE mam_jnl_ptn_all
 ADD CONSTRAINT mam_jnl_ptn_all_ck12 CHECK (mon08_invalid_flg IN ('0', '1'));

