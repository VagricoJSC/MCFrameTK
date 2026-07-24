\encoding UTF-8

ALTER TABLE mst_sim_mrp_all
 ADD CONSTRAINT mst_sim_mrp_all_ck04 CHECK (gi_flg IN ('0', '1'));

