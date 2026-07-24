\encoding UTF-8

ALTER TABLE mgt_act_ptn_config_all
 ADD CONSTRAINT mgt_act_ptn_config_all_ck02 CHECK (err_proceed_flg IN ('0', '1'));

