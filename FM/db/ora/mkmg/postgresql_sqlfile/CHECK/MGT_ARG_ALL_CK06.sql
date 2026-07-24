\encoding UTF-8

ALTER TABLE mgt_arg_all
 ADD CONSTRAINT mgt_arg_all_ck06 CHECK (trd_amt_flg IN ('0', '1'));

