\encoding UTF-8

ALTER TABLE mst_cst_frcst_all
 ADD CONSTRAINT mst_cst_frcst_all_ck02 CHECK (frcst_stop_flg IN ('0', '1'));

