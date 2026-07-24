\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck30 CHECK (calc_com_paid_flg IN ('0', '1'));

