\encoding UTF-8

ALTER TABLE mst_std_insp_act_all
 ADD CONSTRAINT mst_std_insp_act_all_ck01 CHECK (cnf_flg IN ('0', '1'));

