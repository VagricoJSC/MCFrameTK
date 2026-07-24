\encoding UTF-8

ALTER TABLE mst_plnt_aprv_all
 ADD CONSTRAINT mst_plnt_aprv_all_ck01 CHECK (skip_chk_ship_flg IN ('0', '1'));

