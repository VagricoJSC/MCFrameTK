\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck13 CHECK (def_slo_proc_flg IN ('0', '1'));

