\encoding UTF-8

ALTER TABLE mst_iv_ship_act_map_all
 ADD CONSTRAINT mst_iv_ship_act_map_all_ck01 CHECK (fix_flg IN ('0', '1'));

