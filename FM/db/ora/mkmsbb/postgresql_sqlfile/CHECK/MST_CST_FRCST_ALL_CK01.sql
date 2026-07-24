\encoding UTF-8

ALTER TABLE mst_cst_frcst_all
 ADD CONSTRAINT mst_cst_frcst_all_ck01 CHECK (fix_flg IN ('0', '1'));

