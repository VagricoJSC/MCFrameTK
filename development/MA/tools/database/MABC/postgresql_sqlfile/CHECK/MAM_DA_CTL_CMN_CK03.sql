\encoding UTF-8

ALTER TABLE mam_da_ctl_cmn
 ADD CONSTRAINT mam_da_ctl_cmn_ck03 CHECK (del_flg IN ('0', '1'));

