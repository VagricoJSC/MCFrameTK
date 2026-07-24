\encoding UTF-8

ALTER TABLE mam_itm_typ_d_all
 ADD CONSTRAINT mam_itm_typ_d_all_ck07 CHECK (def_gi_alloc_flg IN ('0', '1'));

