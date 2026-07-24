\encoding UTF-8

ALTER TABLE mam_itm_typ_d_all
 ADD CONSTRAINT mam_itm_typ_d_all_ck15 CHECK (def_arr_skip_flg IN ('0', '1'));

