\encoding UTF-8

ALTER TABLE mst_qtn_d_all
 ADD CONSTRAINT mst_qtn_d_all_ck02 CHECK (sundry_itm_flg IN ('0', '1'));

