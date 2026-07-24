\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck24 CHECK (bill_dtl_adv_flg IN ('0', '1'));

