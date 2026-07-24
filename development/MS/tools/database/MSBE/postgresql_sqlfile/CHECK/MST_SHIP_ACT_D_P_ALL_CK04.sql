\encoding UTF-8

ALTER TABLE mst_ship_act_d_p_all
 ADD CONSTRAINT mst_ship_act_d_p_all_ck04 CHECK (skip_chk_ship_flg IN ('0', '1'));

