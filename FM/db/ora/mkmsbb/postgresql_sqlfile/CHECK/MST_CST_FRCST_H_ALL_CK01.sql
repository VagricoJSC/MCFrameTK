\encoding UTF-8

ALTER TABLE mst_cst_frcst_h_all
 ADD CONSTRAINT mst_cst_frcst_h_all_ck01 CHECK (can_flg IN ('0', '1'));

