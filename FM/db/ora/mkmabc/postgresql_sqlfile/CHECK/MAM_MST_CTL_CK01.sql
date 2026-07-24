\encoding UTF-8

ALTER TABLE mam_mst_ctl
 ADD CONSTRAINT mam_mst_ctl_ck01 CHECK (lcl_flg IN ('0', '1'));

