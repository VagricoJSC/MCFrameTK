\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck35 CHECK (def_insp_aprv_flg IN ('0', '1'));

