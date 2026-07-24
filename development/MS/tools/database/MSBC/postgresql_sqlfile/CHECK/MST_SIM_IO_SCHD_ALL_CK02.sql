\encoding UTF-8

ALTER TABLE mst_sim_io_schd_all
 ADD CONSTRAINT mst_sim_io_schd_all_ck02 CHECK (sno2_null_flg IN ('0', '1'));

