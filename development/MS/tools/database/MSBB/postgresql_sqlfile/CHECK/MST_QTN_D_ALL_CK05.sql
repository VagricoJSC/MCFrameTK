\encoding UTF-8

ALTER TABLE mst_qtn_d_all
 ADD CONSTRAINT mst_qtn_d_all_ck05 CHECK (upri_not_tgt_flg IN ('0', '1'));

