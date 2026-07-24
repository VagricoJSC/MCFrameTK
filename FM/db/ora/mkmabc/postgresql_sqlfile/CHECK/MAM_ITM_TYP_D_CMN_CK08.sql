\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck08 CHECK (def_pack_alloc_flg IN ('0', '1'));

