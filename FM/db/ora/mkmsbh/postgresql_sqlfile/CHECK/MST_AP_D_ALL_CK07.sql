\encoding UTF-8

ALTER TABLE mst_ap_d_all
 ADD CONSTRAINT mst_ap_d_all_ck07 CHECK (valid_flg IN ('0', '1'));

