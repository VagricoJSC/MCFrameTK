\encoding UTF-8

ALTER TABLE mam_itm_oper_all
 ADD CONSTRAINT mam_itm_oper_all_ck04 CHECK (del_flg IN ('0', '1'));

