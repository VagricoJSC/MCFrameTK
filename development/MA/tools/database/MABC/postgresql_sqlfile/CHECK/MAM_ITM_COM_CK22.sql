\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck22 CHECK (comp_core_itm_flg IN ('0', '1'));

