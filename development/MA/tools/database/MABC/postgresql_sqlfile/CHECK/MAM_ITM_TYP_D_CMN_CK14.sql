\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck14 CHECK (def_ship_lot_back_stop_flg IN ('0', '1'));

