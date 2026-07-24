\encoding UTF-8

ALTER TABLE mst_iv_ship_act_d_all
 ADD CONSTRAINT mst_iv_ship_act_d_all_ck02 CHECK (sync_flg IN ('0', '1'));

