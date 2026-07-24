\encoding UTF-8

ALTER TABLE mam_lg_ctl_all
 ADD CONSTRAINT mam_lg_ctl_all_ck01 CHECK (iv_trd_flg IN ('0', '1'));

