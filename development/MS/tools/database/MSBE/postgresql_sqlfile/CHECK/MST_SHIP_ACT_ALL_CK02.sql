\encoding UTF-8

ALTER TABLE mst_ship_act_all
 ADD CONSTRAINT mst_ship_act_all_ck02 CHECK (uplnd_flg IN ('0', '1'));

