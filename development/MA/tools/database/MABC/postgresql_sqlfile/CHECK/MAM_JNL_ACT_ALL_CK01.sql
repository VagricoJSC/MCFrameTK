\encoding UTF-8

ALTER TABLE mam_jnl_act_all
 ADD CONSTRAINT mam_jnl_act_all_ck01 CHECK (jnl_del_flg IN ('0', '1'));

