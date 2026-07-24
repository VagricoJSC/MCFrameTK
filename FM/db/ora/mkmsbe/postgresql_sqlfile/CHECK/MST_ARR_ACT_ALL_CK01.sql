\encoding UTF-8

ALTER TABLE mst_arr_act_all
 ADD CONSTRAINT mst_arr_act_all_ck01 CHECK (sundry_itm_flg IN ('0', '1'));

