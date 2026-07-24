\encoding UTF-8

ALTER TABLE mam_stk_rpl_all
 ADD CONSTRAINT mam_stk_rpl_all_ck03 CHECK (del_flg IN ('0', '1'));

