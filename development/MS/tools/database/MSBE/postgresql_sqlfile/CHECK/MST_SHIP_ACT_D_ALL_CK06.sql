\encoding UTF-8

ALTER TABLE mst_ship_act_d_all
 ADD CONSTRAINT mst_ship_act_d_all_ck06 CHECK (wms_flg IN ('0', '1'));

