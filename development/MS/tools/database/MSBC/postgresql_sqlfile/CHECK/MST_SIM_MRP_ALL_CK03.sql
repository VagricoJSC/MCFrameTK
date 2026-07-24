\encoding UTF-8

ALTER TABLE mst_sim_mrp_all
 ADD CONSTRAINT mst_sim_mrp_all_ck03 CHECK (gr_flg IN ('0', '1'));

