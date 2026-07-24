\encoding UTF-8

ALTER TABLE mst_acxfr_act_p_all
 ADD CONSTRAINT mst_acxfr_act_p_all_ck02 CHECK (can_flg IN ('0', '1'));

