\encoding UTF-8

ALTER TABLE mst_arr_schd_send_if_all
 ADD CONSTRAINT mst_arr_schd_send_if_all_ck02 CHECK (prov_arr_flg IN ('0', '1'));

