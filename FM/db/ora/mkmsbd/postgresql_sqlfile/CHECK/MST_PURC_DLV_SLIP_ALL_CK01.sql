\encoding UTF-8

ALTER TABLE mst_purc_dlv_slip_all
 ADD CONSTRAINT mst_purc_dlv_slip_all_ck01 CHECK (sppl_sundry_flg IN ('0', '1'));

