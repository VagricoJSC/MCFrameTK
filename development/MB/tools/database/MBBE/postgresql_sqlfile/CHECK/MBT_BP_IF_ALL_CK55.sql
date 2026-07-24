\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck55 CHECK (pay_ntc_dtl_pay_flg IN ('0', '1'));

