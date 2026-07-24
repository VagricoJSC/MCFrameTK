\encoding UTF-8

ALTER TABLE mam_strg_tgt_report_all
 ADD CONSTRAINT mam_strg_tgt_report_all_ck01 CHECK (del_flg IN ('0', '1'));

