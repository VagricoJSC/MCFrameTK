\encoding UTF-8

ALTER TABLE mst_yield_act_all
 ADD CONSTRAINT mst_yield_act_all_ck01 CHECK (bkf_ctl_flg IN ('0', '1'));

