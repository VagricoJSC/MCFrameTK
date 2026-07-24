\encoding UTF-8

ALTER TABLE mgt_act_inst_wk_if_all
 ADD CONSTRAINT mgt_act_inst_wk_if_all_ck01 CHECK (no_pln_flg IN ('0', '1'));

