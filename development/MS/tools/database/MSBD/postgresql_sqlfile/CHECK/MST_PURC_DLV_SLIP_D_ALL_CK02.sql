\encoding UTF-8

ALTER TABLE mst_purc_dlv_slip_d_all
 ADD CONSTRAINT mst_purc_dlv_slip_d_all_ck02 CHECK (interim_flg IN ('0', '1'));

