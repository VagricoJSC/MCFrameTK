\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck17 CHECK (rqmt_sno4_flg IN ('0', '1'));

