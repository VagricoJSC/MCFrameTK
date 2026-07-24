\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck11 CHECK (def_comp_core_itm_flg IN ('0', '1'));

