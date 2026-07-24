\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck23 CHECK (slo_proc_flg IN ('0', '1'));

