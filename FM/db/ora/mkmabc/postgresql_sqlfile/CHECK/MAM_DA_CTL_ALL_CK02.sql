\encoding UTF-8

ALTER TABLE mam_da_ctl_all
 ADD CONSTRAINT mam_da_ctl_all_ck02 CHECK (wr_flg IN ('0', '1'));

