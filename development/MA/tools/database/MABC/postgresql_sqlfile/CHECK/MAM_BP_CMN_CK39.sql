\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck39 CHECK (wrk_ap_flg IN ('0', '1'));

