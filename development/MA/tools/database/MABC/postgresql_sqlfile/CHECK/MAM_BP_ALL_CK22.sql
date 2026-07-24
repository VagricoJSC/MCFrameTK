\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck22 CHECK (bfw_bal_disp_flg IN ('0', '1'));

