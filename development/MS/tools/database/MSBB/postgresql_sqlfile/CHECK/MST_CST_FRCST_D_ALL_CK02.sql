\encoding UTF-8

ALTER TABLE mst_cst_frcst_d_all
 ADD CONSTRAINT mst_cst_frcst_d_all_ck02 CHECK (frcst_stop_flg IN ('0', '1'));

