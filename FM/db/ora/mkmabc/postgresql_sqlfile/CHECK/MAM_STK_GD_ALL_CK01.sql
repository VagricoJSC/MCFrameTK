\encoding UTF-8

ALTER TABLE mam_stk_gd_all
 ADD CONSTRAINT mam_stk_gd_all_ck01 CHECK (slo_flg IN ('0', '1'));

