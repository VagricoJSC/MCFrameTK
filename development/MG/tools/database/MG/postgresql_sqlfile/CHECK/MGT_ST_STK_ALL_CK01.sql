\encoding UTF-8

ALTER TABLE mgt_st_stk_all
 ADD CONSTRAINT mgt_st_stk_all_ck01 CHECK (repurc_obli_flg IN ('0', '1'));

