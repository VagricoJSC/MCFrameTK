\encoding UTF-8

ALTER TABLE mam_slo_alloc_all
 ADD CONSTRAINT mam_slo_alloc_all_ck02 CHECK (del_flg IN ('0', '1'));

