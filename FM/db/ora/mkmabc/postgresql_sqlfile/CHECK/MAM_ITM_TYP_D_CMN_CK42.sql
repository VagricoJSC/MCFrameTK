\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck42 CHECK (def_not_cost_bom_flg IN ('0', '1'));

