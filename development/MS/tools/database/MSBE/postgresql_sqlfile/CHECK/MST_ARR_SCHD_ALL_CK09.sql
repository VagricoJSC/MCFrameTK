\encoding UTF-8

ALTER TABLE mst_arr_schd_all
 ADD CONSTRAINT mst_arr_schd_all_ck09 CHECK (re_arr_schd_flg IN ('0', '1'));

