\encoding UTF-8

ALTER TABLE mam_report_mng_def_all
 ADD CONSTRAINT mam_report_mng_def_all_ck01 CHECK (del_flg IN ('0', '1'));

