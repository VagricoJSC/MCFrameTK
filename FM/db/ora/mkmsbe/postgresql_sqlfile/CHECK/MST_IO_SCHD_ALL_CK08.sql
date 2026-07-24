\encoding UTF-8

ALTER TABLE mst_io_schd_all
 ADD CONSTRAINT mst_io_schd_all_ck08 CHECK (accrual_flg IN ('0', '1'));

