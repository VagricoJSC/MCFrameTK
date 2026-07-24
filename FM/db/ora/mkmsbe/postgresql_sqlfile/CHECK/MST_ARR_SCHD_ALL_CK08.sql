\encoding UTF-8

ALTER TABLE mst_arr_schd_all
 ADD CONSTRAINT mst_arr_schd_all_ck08 CHECK (arr_skip_flg IN ('0', '1'));

