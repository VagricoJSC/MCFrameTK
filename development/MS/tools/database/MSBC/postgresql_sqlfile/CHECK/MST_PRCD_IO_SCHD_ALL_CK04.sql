\encoding UTF-8

ALTER TABLE mst_prcd_io_schd_all
 ADD CONSTRAINT mst_prcd_io_schd_all_ck04 CHECK (sno4_null_flg IN ('0', '1'));

