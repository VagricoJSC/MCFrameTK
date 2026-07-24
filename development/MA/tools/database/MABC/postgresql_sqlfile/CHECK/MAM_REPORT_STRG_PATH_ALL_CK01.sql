\encoding UTF-8

ALTER TABLE mam_report_strg_path_all
 ADD CONSTRAINT mam_report_strg_path_all_ck01 CHECK (del_flg IN ('0', '1'));

