\encoding UTF-8

ALTER TABLE mst_io_schd_if_all
 ADD CONSTRAINT mst_io_schd_if_all_ck01 CHECK (accrual_flg IN ('0', '1'));

