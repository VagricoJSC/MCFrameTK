\encoding UTF-8

ALTER TABLE mam_proc_upri_apl_all
 ADD CONSTRAINT mam_proc_upri_apl_all_ck02 CHECK (interim_flg IN ('0', '1'));

