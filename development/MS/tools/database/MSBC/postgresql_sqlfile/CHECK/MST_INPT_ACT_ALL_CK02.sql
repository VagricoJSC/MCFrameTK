\encoding UTF-8

ALTER TABLE mst_inpt_act_all
 ADD CONSTRAINT mst_inpt_act_all_ck02 CHECK (add_flg IN ('0', '1'));

