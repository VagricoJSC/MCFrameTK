\encoding UTF-8

ALTER TABLE mam_sls_anly_all
 ADD CONSTRAINT mam_sls_anly_all_ck01 CHECK (del_flg IN ('0', '1'));

