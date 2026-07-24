\encoding UTF-8

ALTER TABLE mam_wg_rqst_ctl_all
 ADD CONSTRAINT mam_wg_rqst_ctl_all_ck02 CHECK (del_flg IN ('0', '1'));

