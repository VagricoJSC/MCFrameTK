\encoding UTF-8

ALTER TABLE mst_qtn_d_all
 ADD CONSTRAINT mst_qtn_d_all_ck06 CHECK (tax_fix_flg IN ('0', '1'));

