\encoding UTF-8

ALTER TABLE mam_cost_report_all
 ADD CONSTRAINT mam_cost_report_all_ck01 CHECK (del_flg IN ('0', '1'));

