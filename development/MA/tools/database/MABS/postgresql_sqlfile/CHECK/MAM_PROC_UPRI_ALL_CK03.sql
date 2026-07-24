\encoding UTF-8

ALTER TABLE mam_proc_upri_all
 ADD CONSTRAINT mam_proc_upri_all_ck03 CHECK (del_flg IN ('0', '1'));

