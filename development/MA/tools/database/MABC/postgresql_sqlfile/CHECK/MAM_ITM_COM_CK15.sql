\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck15 CHECK (rqmt_sno3_flg IN ('0', '1'));

