\encoding UTF-8

ALTER TABLE mst_ship_act_all
 ADD CONSTRAINT mst_ship_act_all_ck03 CHECK (can_flg IN ('0', '1'));

