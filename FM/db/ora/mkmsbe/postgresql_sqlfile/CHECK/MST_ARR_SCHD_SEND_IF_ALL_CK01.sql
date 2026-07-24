\encoding UTF-8

ALTER TABLE mst_arr_schd_send_if_all
 ADD CONSTRAINT mst_arr_schd_send_if_all_ck01 CHECK (abort_flg IN ('0', '1'));

