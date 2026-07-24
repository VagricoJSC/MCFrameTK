\encoding UTF-8

ALTER TABLE mam_itm_typ_d_all
 ADD CONSTRAINT mam_itm_typ_d_all_ck31 CHECK (def_lmt_ctl_flg IN ('0', '1'));

