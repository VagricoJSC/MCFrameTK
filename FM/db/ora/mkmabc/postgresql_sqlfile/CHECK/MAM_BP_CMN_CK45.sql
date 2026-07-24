\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck45 CHECK (prms_recv_flg IN ('0', '1'));

