\encoding UTF-8

ALTER TABLE mst_ord_io_schd_all
 ADD CONSTRAINT mst_ord_io_schd_all_ck03 CHECK (sno3_null_flg IN ('0', '1'));

