\encoding UTF-8

ALTER TABLE mam_itm_oper_all
 ADD CONSTRAINT mam_itm_oper_all_ck01 CHECK (yield_oper_flg IN ('0', '1'));

