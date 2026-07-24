\encoding UTF-8

ALTER TABLE mam_jnl_ptn_cmn
 ADD CONSTRAINT mam_jnl_ptn_cmn_ck07 CHECK (mon03_invalid_flg IN ('0', '1'));

