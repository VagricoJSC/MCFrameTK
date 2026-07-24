\encoding UTF-8

ALTER TABLE mst_wrk_mng_all
 ADD CONSTRAINT mst_wrk_mng_all_ck02 CHECK (flg2 IN ('0', '1'));

