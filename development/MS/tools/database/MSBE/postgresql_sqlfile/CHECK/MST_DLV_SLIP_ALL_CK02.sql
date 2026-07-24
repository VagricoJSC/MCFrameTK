\encoding UTF-8

ALTER TABLE mst_dlv_slip_all
 ADD CONSTRAINT mst_dlv_slip_all_ck02 CHECK (dlv_sundry_flg IN ('0', '1'));

