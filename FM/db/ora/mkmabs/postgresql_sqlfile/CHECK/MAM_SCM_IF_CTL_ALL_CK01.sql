\encoding UTF-8

ALTER TABLE mam_scm_if_ctl_all
 ADD CONSTRAINT mam_scm_if_ctl_all_ck01 CHECK (del_flg IN ('0', '1'));

