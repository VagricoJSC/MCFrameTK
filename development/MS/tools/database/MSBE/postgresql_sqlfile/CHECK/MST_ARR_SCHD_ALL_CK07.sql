\encoding UTF-8

ALTER TABLE mst_arr_schd_all
 ADD CONSTRAINT mst_arr_schd_all_ck07 CHECK (arr_split_flg IN ('0', '1'));

