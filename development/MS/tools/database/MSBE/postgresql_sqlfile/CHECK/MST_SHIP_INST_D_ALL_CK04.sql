\encoding UTF-8

ALTER TABLE mst_ship_inst_d_all
 ADD CONSTRAINT mst_ship_inst_d_all_ck04 CHECK (sno3_null_flg IN ('0', '1'));

