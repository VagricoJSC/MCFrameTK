\encoding UTF-8

ALTER TABLE mst_ship_inst_all
 ADD CONSTRAINT mst_ship_inst_all_ck05 CHECK (dlv_prnt_flg IN ('0', '1'));

