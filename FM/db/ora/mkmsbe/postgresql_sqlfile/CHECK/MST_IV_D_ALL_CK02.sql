\encoding UTF-8

ALTER TABLE mst_iv_d_all
 ADD CONSTRAINT mst_iv_d_all_ck02 CHECK (upri_not_tgt_flg IN ('0', '1'));

