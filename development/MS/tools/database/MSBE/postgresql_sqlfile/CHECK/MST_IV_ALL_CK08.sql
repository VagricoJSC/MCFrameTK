\encoding UTF-8

ALTER TABLE mst_iv_all
 ADD CONSTRAINT mst_iv_all_ck08 CHECK (non_cmpl_flg IN ('0', '1'));

