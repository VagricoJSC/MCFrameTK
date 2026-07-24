\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck13 CHECK (rqmt_sno2_flg IN ('0', '1'));

