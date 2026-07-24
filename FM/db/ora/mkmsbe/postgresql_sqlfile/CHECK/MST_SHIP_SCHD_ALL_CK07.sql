\encoding UTF-8

ALTER TABLE mst_ship_schd_all
 ADD CONSTRAINT mst_ship_schd_all_ck07 CHECK (not_dt_calc_flg IN ('0', '1'));

