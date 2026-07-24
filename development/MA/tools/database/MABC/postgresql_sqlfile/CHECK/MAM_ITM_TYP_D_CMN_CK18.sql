\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck18 CHECK (def_purc_upri_cng_flg IN ('0', '1'));

