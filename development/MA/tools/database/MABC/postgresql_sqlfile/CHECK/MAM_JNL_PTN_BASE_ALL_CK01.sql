\encoding UTF-8

ALTER TABLE mam_jnl_ptn_base_all
 ADD CONSTRAINT mam_jnl_ptn_base_all_ck01 CHECK (del_flg IN ('0', '1'));

