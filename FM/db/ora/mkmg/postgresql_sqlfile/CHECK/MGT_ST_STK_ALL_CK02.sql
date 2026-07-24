\encoding UTF-8

ALTER TABLE mgt_st_stk_all
 ADD CONSTRAINT mgt_st_stk_all_ck02 CHECK (std_flg IN ('0', '1'));

