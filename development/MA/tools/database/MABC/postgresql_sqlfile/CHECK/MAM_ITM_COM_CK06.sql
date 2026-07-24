\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck06 CHECK (skip_chk_ship_flg IN ('0', '1'));

