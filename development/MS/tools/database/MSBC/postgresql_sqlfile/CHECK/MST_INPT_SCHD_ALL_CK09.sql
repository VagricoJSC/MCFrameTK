\encoding UTF-8

ALTER TABLE mst_inpt_schd_all
 ADD CONSTRAINT mst_inpt_schd_all_ck09 CHECK (yield_calc_flg IN ('0', '1'));

