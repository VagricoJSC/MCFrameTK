\encoding UTF-8

ALTER TABLE mam_biz_rsn_all
 ADD CONSTRAINT mam_biz_rsn_all_ck08 CHECK (sls_acxfr_flg IN ('0', '1'));

