\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck52 CHECK (pay_ntc_bfw_bal_disp_flg IN ('0', '1'));

