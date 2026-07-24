\encoding UTF-8

ALTER TABLE mst_wrk_all
 ADD CONSTRAINT mst_wrk_all_ck01 CHECK (wrk_ar_flg IN ('0', '1'));

