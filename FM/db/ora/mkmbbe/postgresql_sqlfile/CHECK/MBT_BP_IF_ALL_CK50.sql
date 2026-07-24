\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck50 CHECK (batch_pay_schd_cl_flg IN ('0', '1'));

