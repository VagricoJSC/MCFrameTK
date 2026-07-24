\encoding UTF-8

ALTER TABLE mst_sls_itm_all
 ADD CONSTRAINT mst_sls_itm_all_ck02 CHECK (no_itm_cd_flg IN ('0', '1'));

