\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck49 CHECK (batch_pay_schd_cl_flg IN ('0', '1'));

