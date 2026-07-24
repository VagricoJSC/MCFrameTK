\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck24 CHECK (ship_lot_back_stop_flg IN ('0', '1'));

