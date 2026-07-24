\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck33 CHECK (def_mrkt_judg_flg IN ('0', '1'));

