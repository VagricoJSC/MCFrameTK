\encoding UTF-8

ALTER TABLE mst_wg_rqst_all
 ADD CONSTRAINT mst_wg_rqst_all_ck12 CHECK (sno3_null_flg IN ('0', '1'));

