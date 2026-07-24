\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck40 CHECK (def_main_itm_flg IN ('0', '1'));

