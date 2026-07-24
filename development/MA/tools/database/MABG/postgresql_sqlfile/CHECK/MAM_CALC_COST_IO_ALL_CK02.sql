\encoding UTF-8

ALTER TABLE mam_calc_cost_io_all
 ADD CONSTRAINT mam_calc_cost_io_all_ck02 CHECK (del_flg IN ('0', '1'));

