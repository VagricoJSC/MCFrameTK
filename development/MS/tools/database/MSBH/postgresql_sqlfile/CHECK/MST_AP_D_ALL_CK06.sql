\encoding UTF-8

ALTER TABLE mst_ap_d_all
 ADD CONSTRAINT mst_ap_d_all_ck06 CHECK (outsrc_flg IN ('0', '1'));

