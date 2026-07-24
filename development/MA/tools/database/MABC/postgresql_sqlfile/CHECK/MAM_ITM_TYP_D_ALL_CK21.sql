\encoding UTF-8

ALTER TABLE mam_itm_typ_d_all
 ADD CONSTRAINT mam_itm_typ_d_all_ck21 CHECK (def_inpt_itm_del_flg IN ('0', '1'));

