\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck26 CHECK (bill_dtl_rcv_flg IN ('0', '1'));

