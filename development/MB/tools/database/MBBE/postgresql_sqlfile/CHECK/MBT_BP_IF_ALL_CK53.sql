\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck53 CHECK (pay_ntc_bfw_bal_disp_flg IN ('0', '1'));

