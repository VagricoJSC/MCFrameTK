\encoding UTF-8

ALTER TABLE mam_itm_jnl_cmn
 ADD CONSTRAINT mam_itm_jnl_cmn_ck01 CHECK (del_flg IN ('0', '1'));

