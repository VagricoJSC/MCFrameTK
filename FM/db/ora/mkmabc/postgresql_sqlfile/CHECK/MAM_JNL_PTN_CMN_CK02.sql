\encoding UTF-8

ALTER TABLE mam_jnl_ptn_cmn
 ADD CONSTRAINT mam_jnl_ptn_cmn_ck02 CHECK (cr_trd_sml_flg IN ('0', '1'));

