\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck09 CHECK (def_bp_lot_flg IN ('0', '1'));

