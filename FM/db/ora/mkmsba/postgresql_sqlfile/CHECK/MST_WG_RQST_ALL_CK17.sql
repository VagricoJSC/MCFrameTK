\encoding UTF-8

ALTER TABLE mst_wg_rqst_all
 ADD CONSTRAINT mst_wg_rqst_all_ck17 CHECK (comp_cng_flg IN ('0', '1'));

