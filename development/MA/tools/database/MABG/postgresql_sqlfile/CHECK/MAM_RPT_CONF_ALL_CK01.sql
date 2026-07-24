\encoding UTF-8

ALTER TABLE mam_rpt_conf_all
 ADD CONSTRAINT mam_rpt_conf_all_ck01 CHECK (sml_flg IN ('0', '1'));

