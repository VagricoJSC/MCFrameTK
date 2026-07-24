\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck22 CHECK (bfw_bal_disp_flg IN ('0', '1'));

