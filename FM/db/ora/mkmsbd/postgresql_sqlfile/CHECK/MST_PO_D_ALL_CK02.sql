\encoding UTF-8

ALTER TABLE mst_po_d_all
 ADD CONSTRAINT mst_po_d_all_ck02 CHECK (dlv_sundry_flg IN ('0', '1'));

