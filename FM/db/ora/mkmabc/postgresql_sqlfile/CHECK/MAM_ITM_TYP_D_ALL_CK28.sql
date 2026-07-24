\encoding UTF-8

ALTER TABLE mam_itm_typ_d_all
 ADD CONSTRAINT mam_itm_typ_d_all_ck28 CHECK (def_rqmt_sno3_flg IN ('0', '1'));

