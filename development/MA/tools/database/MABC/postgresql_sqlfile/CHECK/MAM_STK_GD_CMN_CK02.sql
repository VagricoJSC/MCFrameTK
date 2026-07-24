\encoding UTF-8

ALTER TABLE mam_stk_gd_cmn
 ADD CONSTRAINT mam_stk_gd_cmn_ck02 CHECK (del_flg IN ('0', '1'));

