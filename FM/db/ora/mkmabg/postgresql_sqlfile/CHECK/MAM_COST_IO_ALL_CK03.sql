\encoding UTF-8

ALTER TABLE mam_cost_io_all
 ADD CONSTRAINT mam_cost_io_all_ck03 CHECK (other_flg IN ('0', '1'));

