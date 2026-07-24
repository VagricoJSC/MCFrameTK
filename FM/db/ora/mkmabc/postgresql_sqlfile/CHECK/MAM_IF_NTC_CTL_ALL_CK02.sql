\encoding UTF-8

ALTER TABLE mam_if_ntc_ctl_all
 ADD CONSTRAINT mam_if_ntc_ctl_all_ck02 CHECK (del_flg IN ('0', '1'));

