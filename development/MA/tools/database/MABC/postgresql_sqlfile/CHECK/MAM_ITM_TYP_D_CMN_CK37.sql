\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck37 CHECK (def_inst_lot_fix_flg IN ('0', '1'));

