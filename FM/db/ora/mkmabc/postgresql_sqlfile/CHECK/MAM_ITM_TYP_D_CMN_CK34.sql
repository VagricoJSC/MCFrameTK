\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck34 CHECK (def_plnt_aprv_flg IN ('0', '1'));

