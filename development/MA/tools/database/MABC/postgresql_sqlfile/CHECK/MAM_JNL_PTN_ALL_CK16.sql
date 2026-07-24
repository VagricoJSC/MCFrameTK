\encoding UTF-8

ALTER TABLE mam_jnl_ptn_all
 ADD CONSTRAINT mam_jnl_ptn_all_ck16 CHECK (mon12_invalid_flg IN ('0', '1'));

