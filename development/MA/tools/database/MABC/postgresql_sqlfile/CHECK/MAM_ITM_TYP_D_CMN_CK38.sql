\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck38 CHECK (def_lot_mix_flg IN ('0', '1'));

