\encoding UTF-8

ALTER TABLE mam_calc_cost_io_all
 ADD CONSTRAINT mam_calc_cost_io_all_ck01 CHECK (auto_flg IN ('0', '1'));

