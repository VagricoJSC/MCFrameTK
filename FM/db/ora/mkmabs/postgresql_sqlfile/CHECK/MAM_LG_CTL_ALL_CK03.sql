\encoding UTF-8

ALTER TABLE mam_lg_ctl_all
 ADD CONSTRAINT mam_lg_ctl_all_ck03 CHECK (del_flg IN ('0', '1'));

