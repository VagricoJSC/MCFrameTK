\encoding UTF-8

ALTER TABLE mst_wrk_all
 ADD CONSTRAINT mst_wrk_all_ck02 CHECK (wrk_ap_flg IN ('0', '1'));

