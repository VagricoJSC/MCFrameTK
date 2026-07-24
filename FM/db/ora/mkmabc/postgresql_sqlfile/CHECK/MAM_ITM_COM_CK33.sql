\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck33 CHECK (mfg_flg IN ('0', '1'));

