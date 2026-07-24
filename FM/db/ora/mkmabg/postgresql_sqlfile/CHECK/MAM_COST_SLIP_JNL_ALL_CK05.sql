\encoding UTF-8

ALTER TABLE mam_cost_slip_jnl_all
 ADD CONSTRAINT mam_cost_slip_jnl_all_ck05 CHECK (del_flg IN ('0', '1'));

