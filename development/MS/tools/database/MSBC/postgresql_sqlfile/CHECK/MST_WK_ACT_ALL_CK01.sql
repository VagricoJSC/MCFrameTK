\encoding UTF-8

ALTER TABLE mst_wk_act_all
 ADD CONSTRAINT mst_wk_act_all_ck01 CHECK (wk_cost_calc_ctl_flg IN ('0', '1'));

