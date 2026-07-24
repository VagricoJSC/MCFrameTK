\encoding UTF-8

ALTER TABLE mam_slip_jnl_cmn
 ADD CONSTRAINT mam_slip_jnl_cmn_ck04 CHECK (bill_no_flg IN ('0', '1'));

