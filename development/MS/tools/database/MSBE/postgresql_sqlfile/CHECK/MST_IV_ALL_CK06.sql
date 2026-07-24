\encoding UTF-8

ALTER TABLE mst_iv_all
 ADD CONSTRAINT mst_iv_all_ck06 CHECK (pl_skip_flg IN ('0', '1'));

