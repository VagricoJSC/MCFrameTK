\encoding UTF-8

ALTER TABLE mst_sim_rqmt_all
 ADD CONSTRAINT mst_sim_rqmt_all_ck01 CHECK (fix_flg IN ('0', '1'));

