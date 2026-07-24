\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck12 CHECK (def_skip_chk_ship_flg IN ('0', '1'));

