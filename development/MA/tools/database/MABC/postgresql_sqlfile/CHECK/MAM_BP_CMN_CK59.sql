\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck59 CHECK (tdlv_req_flg IN ('0', '1'));

