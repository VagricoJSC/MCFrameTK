\encoding UTF-8

ALTER TABLE mam_da_ctl_all
 ADD CONSTRAINT mam_da_ctl_all_ck01 CHECK (rd_flg IN ('0', '1'));

