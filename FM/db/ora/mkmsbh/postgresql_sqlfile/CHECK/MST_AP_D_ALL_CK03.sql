\encoding UTF-8

ALTER TABLE mst_ap_d_all
 ADD CONSTRAINT mst_ap_d_all_ck03 CHECK (chk_flg IN ('0', '1'));

