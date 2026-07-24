\encoding UTF-8

ALTER TABLE mst_po_d_all
 ADD CONSTRAINT mst_po_d_all_ck08 CHECK (bndl_flg IN ('0', '1'));

