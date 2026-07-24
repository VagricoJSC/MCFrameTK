\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck26 CHECK (def_rqmt_sno2_flg IN ('0', '1'));

