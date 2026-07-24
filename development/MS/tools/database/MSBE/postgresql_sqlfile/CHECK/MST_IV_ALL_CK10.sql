\encoding UTF-8

ALTER TABLE mst_iv_all
 ADD CONSTRAINT mst_iv_all_ck10 CHECK (iv_prnt_flg IN ('0', '1'));

