\encoding UTF-8

ALTER TABLE mam_itm_typ_d_all
 ADD CONSTRAINT mam_itm_typ_d_all_ck06 CHECK (def_not_new_lot_flg IN ('0', '1'));

