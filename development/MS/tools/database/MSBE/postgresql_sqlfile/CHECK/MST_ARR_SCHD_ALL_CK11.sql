\encoding UTF-8

ALTER TABLE mst_arr_schd_all
 ADD CONSTRAINT mst_arr_schd_all_ck11 CHECK (pre_outsrc_act_flg IN ('0', '1'));

