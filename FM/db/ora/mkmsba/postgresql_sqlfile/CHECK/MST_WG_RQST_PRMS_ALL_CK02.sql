\encoding UTF-8

ALTER TABLE mst_wg_rqst_prms_all
 ADD CONSTRAINT mst_wg_rqst_prms_all_ck02 CHECK (can_flg IN ('0', '1'));

