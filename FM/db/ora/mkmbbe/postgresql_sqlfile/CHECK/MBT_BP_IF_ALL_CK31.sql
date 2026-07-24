\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck31 CHECK (calc_com_paid_flg IN ('0', '1'));

