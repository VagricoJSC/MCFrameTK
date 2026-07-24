\encoding UTF-8

ALTER TABLE mgt_itm_all
 ADD CONSTRAINT mgt_itm_all_ck02 CHECK (fix_flg IN ('0', '1'));

