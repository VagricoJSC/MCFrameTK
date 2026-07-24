\encoding UTF-8

ALTER TABLE mam_fb_if_ctl_all
 ADD CONSTRAINT mam_fb_if_ctl_all_ck01 CHECK (bp_cd_null_flg IN ('0', '1'));

