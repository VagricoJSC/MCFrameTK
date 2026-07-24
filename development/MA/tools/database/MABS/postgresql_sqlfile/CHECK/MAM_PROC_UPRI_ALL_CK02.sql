\encoding UTF-8

ALTER TABLE mam_proc_upri_all
 ADD CONSTRAINT mam_proc_upri_all_ck02 CHECK (not_cost_flg IN ('0', '1'));

