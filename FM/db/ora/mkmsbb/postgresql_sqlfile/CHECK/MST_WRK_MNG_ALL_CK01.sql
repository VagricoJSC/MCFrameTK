\encoding UTF-8

ALTER TABLE mst_wrk_mng_all
 ADD CONSTRAINT mst_wrk_mng_all_ck01 CHECK (flg1 IN ('0', '1'));

