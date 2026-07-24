\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck24 CHECK (def_rqmt_sno1_flg IN ('0', '1'));

