\encoding UTF-8

ALTER TABLE mam_rpt_cmp_sml_all
 ADD CONSTRAINT mam_rpt_cmp_sml_all_ck01 CHECK (minus_flg IN ('0', '1'));

