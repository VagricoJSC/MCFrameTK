\encoding UTF-8

ALTER TABLE mgt_acc_sml_cost1_if_all
 ADD CONSTRAINT mgt_acc_sml_cost1_if_all_ck01 CHECK (fix_flg IN ('0', '1'));

