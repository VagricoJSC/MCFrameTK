\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck10 CHECK (def_comp_rev_at_slo_flg IN ('0', '1'));

