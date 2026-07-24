\encoding UTF-8

ALTER TABLE mam_da_ctl_all
 ADD CONSTRAINT mam_da_ctl_all_ck03 CHECK (del_flg IN ('0', '1'));

