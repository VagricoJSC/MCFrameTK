\encoding UTF-8

ALTER TABLE mst_sim_io_schd_all
 ADD CONSTRAINT mst_sim_io_schd_all_ck06 CHECK (alloc_flg IN ('0', '1'));

