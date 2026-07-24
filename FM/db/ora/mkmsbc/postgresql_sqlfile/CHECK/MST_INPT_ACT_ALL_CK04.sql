\encoding UTF-8

ALTER TABLE mst_inpt_act_all
 ADD CONSTRAINT mst_inpt_act_all_ck04 CHECK (if_auto_reg_flg IN ('0', '1'));

