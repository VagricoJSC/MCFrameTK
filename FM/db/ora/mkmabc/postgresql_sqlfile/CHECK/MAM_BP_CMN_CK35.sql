\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck35 CHECK (prms_rcpt_dlv_slip_flg IN ('0', '1'));

