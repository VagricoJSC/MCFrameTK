\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck24 CHECK (bill_dtl_outp_flg IN ('0', '1'));

