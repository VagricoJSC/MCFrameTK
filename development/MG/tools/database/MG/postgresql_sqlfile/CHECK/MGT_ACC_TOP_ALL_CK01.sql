\encoding UTF-8

ALTER TABLE mgt_acc_top_all
 ADD CONSTRAINT mgt_acc_top_all_ck01 CHECK (repurc_obli_flg IN ('0', '1'));

