\encoding UTF-8

ALTER TABLE mam_cost_slip_jnl_all
 ADD CONSTRAINT mam_cost_slip_jnl_all_ck04 CHECK (itm_sum_flg IN ('0', '1'));

