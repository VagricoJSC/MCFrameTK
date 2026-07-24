\encoding UTF-8

ALTER TABLE mgt_act_inst_wk_if_all
 ADD CONSTRAINT mgt_act_inst_wk_if_all_ck03 CHECK (scm_if_flg IN ('0', '1'));

