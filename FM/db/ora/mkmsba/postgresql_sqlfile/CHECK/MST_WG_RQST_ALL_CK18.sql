\encoding UTF-8

ALTER TABLE mst_wg_rqst_all
 ADD CONSTRAINT mst_wg_rqst_all_ck18 CHECK (spec_cng_flg IN ('0', '1'));

