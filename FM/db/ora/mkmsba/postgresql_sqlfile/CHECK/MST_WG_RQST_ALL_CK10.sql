\encoding UTF-8

ALTER TABLE mst_wg_rqst_all
 ADD CONSTRAINT mst_wg_rqst_all_ck10 CHECK (sno1_null_flg IN ('0', '1'));

