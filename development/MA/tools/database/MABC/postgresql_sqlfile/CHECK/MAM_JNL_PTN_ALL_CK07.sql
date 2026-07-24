\encoding UTF-8

ALTER TABLE mam_jnl_ptn_all
 ADD CONSTRAINT mam_jnl_ptn_all_ck07 CHECK (mon03_invalid_flg IN ('0', '1'));

