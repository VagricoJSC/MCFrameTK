\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck31 CHECK (def_lmt_ctl_flg IN ('0', '1'));

