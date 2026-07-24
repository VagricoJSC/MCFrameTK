\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck02 CHECK (not_new_lot_flg IN ('0', '1'));

