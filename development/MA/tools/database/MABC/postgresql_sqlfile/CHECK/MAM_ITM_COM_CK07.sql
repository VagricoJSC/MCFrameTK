\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck07 CHECK (mrkt_judg_flg IN ('0', '1'));

