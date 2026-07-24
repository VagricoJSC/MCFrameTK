\encoding UTF-8

ALTER TABLE mst_purc_dlv_slip_d_all
 ADD CONSTRAINT mst_purc_dlv_slip_d_all_ck05 CHECK (purc_ddlv_flg IN ('0', '1'));

