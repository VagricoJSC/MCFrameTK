\encoding UTF-8

ALTER TABLE mst_oper_act_all
 ADD CONSTRAINT mst_oper_act_all_ck03 CHECK (bkf_not_ref_flg IN ('0', '1'));

