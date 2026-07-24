\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck10 CHECK (slo_sno1_flg IN ('0', '1'));

