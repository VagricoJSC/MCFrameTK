\encoding UTF-8

ALTER TABLE mam_jnl_act_cmn
 ADD CONSTRAINT mam_jnl_act_cmn_ck01 CHECK (jnl_del_flg IN ('0', '1'));

