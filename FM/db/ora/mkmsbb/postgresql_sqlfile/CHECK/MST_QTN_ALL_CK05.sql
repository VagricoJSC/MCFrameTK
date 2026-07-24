\encoding UTF-8

ALTER TABLE mst_qtn_all
 ADD CONSTRAINT mst_qtn_all_ck05 CHECK (qtn_prnt_flg IN ('0', '1'));

