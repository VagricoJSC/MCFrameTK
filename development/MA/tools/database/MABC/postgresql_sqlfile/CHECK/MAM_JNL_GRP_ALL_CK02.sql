\encoding UTF-8

ALTER TABLE mam_jnl_grp_all
 ADD CONSTRAINT mam_jnl_grp_all_ck02 CHECK (ac_bank_flg2 IN ('0', '1'));

