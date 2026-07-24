\encoding UTF-8

ALTER TABLE mgt_std_top_all
 ADD CONSTRAINT mgt_std_top_all_ck01 CHECK (sls_flg IN ('0', '1'));

