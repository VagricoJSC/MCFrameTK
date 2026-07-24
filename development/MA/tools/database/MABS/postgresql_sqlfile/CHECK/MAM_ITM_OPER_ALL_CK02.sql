\encoding UTF-8

ALTER TABLE mam_itm_oper_all
 ADD CONSTRAINT mam_itm_oper_all_ck02 CHECK (lmt_fr_dt_flg IN ('0', '1'));

