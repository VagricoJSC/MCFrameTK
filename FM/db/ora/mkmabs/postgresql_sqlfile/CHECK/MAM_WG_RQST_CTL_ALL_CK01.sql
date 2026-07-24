\encoding UTF-8

ALTER TABLE mam_wg_rqst_ctl_all
 ADD CONSTRAINT mam_wg_rqst_ctl_all_ck01 CHECK (auto_prms_flg IN ('0', '1'));

