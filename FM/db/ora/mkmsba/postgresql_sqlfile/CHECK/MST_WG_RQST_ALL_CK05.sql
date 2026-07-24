\encoding UTF-8

ALTER TABLE mst_wg_rqst_all
 ADD CONSTRAINT mst_wg_rqst_all_ck05 CHECK (man_prms_flg IN ('0', '1'));

