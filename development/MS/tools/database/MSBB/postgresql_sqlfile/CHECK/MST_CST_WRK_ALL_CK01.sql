\encoding UTF-8

ALTER TABLE mst_cst_wrk_all
 ADD CONSTRAINT mst_cst_wrk_all_ck01 CHECK (cst_sundry_flg IN ('0', '1'));

