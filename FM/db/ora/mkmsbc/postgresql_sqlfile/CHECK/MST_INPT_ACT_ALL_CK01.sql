\encoding UTF-8

ALTER TABLE mst_inpt_act_all
 ADD CONSTRAINT mst_inpt_act_all_ck01 CHECK (bkf_ctl_flg IN ('0', '1'));

