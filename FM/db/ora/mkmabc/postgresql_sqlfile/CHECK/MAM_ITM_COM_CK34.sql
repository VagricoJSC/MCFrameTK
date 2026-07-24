\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck34 CHECK (purc_flg IN ('0', '1'));

