\encoding UTF-8

ALTER TABLE mam_jnl_act_cmn
 ADD CONSTRAINT mam_jnl_act_cmn_ck02 CHECK (del_flg IN ('0', '1'));

