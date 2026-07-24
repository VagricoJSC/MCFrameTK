\encoding UTF-8

ALTER TABLE mam_lg_ctl_all
 ADD CONSTRAINT mam_lg_ctl_all_ck02 CHECK (non_dmnd_lt_flg IN ('0', '1'));

