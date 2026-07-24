\encoding UTF-8

ALTER TABLE mst_qtn_d_all
 ADD CONSTRAINT mst_qtn_d_all_ck03 CHECK (no_itm_cd_flg IN ('0', '1'));

