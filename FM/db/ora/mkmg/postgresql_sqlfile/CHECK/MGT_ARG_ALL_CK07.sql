\encoding UTF-8

ALTER TABLE mgt_arg_all
 ADD CONSTRAINT mgt_arg_all_ck07 CHECK (adj_amt_flg IN ('0', '1'));

