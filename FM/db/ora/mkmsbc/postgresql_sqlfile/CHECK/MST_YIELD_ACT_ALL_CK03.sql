\encoding UTF-8

ALTER TABLE mst_yield_act_all
 ADD CONSTRAINT mst_yield_act_all_ck03 CHECK (sublot_ctl_flg IN ('0', '1'));

