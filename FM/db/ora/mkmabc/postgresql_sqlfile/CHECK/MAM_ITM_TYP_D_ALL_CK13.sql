\encoding UTF-8

ALTER TABLE mam_itm_typ_d_all
 ADD CONSTRAINT mam_itm_typ_d_all_ck13 CHECK (def_slo_proc_flg IN ('0', '1'));

