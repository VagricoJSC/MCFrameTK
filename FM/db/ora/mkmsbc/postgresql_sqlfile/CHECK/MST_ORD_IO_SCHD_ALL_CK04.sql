\encoding UTF-8

ALTER TABLE mst_ord_io_schd_all
 ADD CONSTRAINT mst_ord_io_schd_all_ck04 CHECK (sno4_null_flg IN ('0', '1'));

