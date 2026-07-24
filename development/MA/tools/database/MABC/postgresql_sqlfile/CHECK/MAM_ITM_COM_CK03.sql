\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck03 CHECK (gi_alloc_flg IN ('0', '1'));

