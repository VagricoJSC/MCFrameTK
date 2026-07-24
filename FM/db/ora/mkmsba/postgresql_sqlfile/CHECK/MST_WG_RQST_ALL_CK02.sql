\encoding UTF-8

ALTER TABLE mst_wg_rqst_all
 ADD CONSTRAINT mst_wg_rqst_all_ck02 CHECK (re_prms_ntc_flg IN ('0', '1'));

