\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck16 CHECK (slo_sno4_flg IN ('0', '1'));

