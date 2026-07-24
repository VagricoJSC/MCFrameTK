\encoding UTF-8

ALTER TABLE mst_dlv_slip_all
 ADD CONSTRAINT mst_dlv_slip_all_ck08 CHECK (edi_flg IN ('0', '1'));

