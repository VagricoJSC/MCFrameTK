\encoding UTF-8

ALTER TABLE mam_itm_typ_d_cmn
 ADD CONSTRAINT mam_itm_typ_d_cmn_ck05 CHECK (def_minus_stk_flg IN ('0', '1'));

