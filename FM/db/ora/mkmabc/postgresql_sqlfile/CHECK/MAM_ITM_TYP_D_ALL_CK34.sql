\encoding UTF-8

ALTER TABLE mam_itm_typ_d_all
 ADD CONSTRAINT mam_itm_typ_d_all_ck34 CHECK (def_plnt_aprv_flg IN ('0', '1'));

