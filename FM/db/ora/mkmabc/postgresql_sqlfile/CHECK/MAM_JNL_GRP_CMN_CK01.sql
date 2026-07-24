\encoding UTF-8

ALTER TABLE mam_jnl_grp_cmn
 ADD CONSTRAINT mam_jnl_grp_cmn_ck01 CHECK (ac_bank_flg1 IN ('0', '1'));

