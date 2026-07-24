\encoding UTF-8

ALTER TABLE mam_slo_alloc_gd_all
 ADD CONSTRAINT mam_slo_alloc_gd_all_ck01 CHECK (del_flg IN ('0', '1'));

