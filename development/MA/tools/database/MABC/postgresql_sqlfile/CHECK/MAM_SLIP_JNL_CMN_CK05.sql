\encoding UTF-8

ALTER TABLE mam_slip_jnl_cmn
 ADD CONSTRAINT mam_slip_jnl_cmn_ck05 CHECK (trd_unit_flg IN ('0', '1'));

