\encoding UTF-8

ALTER TABLE mam_itm_typ_d_all
 ADD CONSTRAINT mam_itm_typ_d_all_ck11 CHECK (def_comp_core_itm_flg IN ('0', '1'));

