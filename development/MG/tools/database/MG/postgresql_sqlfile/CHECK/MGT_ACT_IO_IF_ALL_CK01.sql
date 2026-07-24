\encoding UTF-8

ALTER TABLE mgt_act_io_if_all
 ADD CONSTRAINT mgt_act_io_if_all_ck01 CHECK (alc_amt_flg IN ('0', '1'));

