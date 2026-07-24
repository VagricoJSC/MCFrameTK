\encoding UTF-8

ALTER TABLE mgt_std_inpt_all
 ADD CONSTRAINT mgt_std_inpt_all_ck01 CHECK (bottom_flg IN ('0', '1'));

