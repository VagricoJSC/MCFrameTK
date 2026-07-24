\encoding UTF-8

ALTER TABLE mam_cost_io_all
 ADD CONSTRAINT mam_cost_io_all_ck04 CHECK (in_flg IN ('0', '1'));

