\encoding UTF-8

ALTER TABLE mst_ship_act_d_all
 ADD CONSTRAINT mst_ship_act_d_all_ck03 CHECK (sundry_itm_flg IN ('0', '1'));

