\encoding UTF-8

ALTER TABLE mam_jnl_ptn_all
 ADD CONSTRAINT mam_jnl_ptn_all_ck01 CHECK (dr_trd_sml_flg IN ('0', '1'));

