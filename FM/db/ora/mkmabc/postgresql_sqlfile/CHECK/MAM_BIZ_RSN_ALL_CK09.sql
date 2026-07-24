\encoding UTF-8

ALTER TABLE mam_biz_rsn_all
 ADD CONSTRAINT mam_biz_rsn_all_ck09 CHECK (sls_dscnt_flg IN ('0', '1'));

