\encoding UTF-8

ALTER TABLE mam_itm_typ_d_all
 ADD CONSTRAINT mam_itm_typ_d_all_ck36 CHECK (def_mfg_aprv_flg IN ('0', '1'));

