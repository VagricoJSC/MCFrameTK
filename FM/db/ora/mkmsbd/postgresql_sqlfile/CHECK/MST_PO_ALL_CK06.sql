\encoding UTF-8

ALTER TABLE mst_po_all
 ADD CONSTRAINT mst_po_all_ck06 CHECK (aprv_flg IN ('0', '1'));

