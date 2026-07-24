\encoding UTF-8

ALTER TABLE mam_stk_gd_cmn
 ADD CONSTRAINT mam_stk_gd_cmn_ck01 CHECK (slo_flg IN ('0', '1'));

