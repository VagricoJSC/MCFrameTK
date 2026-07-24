\encoding UTF-8

ALTER TABLE mst_xfr_act_d_all
 ADD CONSTRAINT mst_xfr_act_d_all_ck01 CHECK (skip_chk_ship_flg IN ('0', '1'));

