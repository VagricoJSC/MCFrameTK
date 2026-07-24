\encoding UTF-8

ALTER TABLE mam_cost_io_all
 ADD CONSTRAINT mam_cost_io_all_ck02 CHECK (sls_flg IN ('0', '1'));

