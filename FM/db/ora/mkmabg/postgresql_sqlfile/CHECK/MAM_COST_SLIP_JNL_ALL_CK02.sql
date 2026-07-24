\encoding UTF-8

ALTER TABLE mam_cost_slip_jnl_all
 ADD CONSTRAINT mam_cost_slip_jnl_all_ck02 CHECK (po_no_flg IN ('0', '1'));

