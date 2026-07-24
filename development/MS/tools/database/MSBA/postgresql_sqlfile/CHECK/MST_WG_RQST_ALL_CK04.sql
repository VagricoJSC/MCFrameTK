\encoding UTF-8

ALTER TABLE mst_wg_rqst_all
 ADD CONSTRAINT mst_wg_rqst_all_ck04 CHECK (re_rqst_flg IN ('0', '1'));

