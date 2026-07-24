\encoding UTF-8

ALTER TABLE mst_po_schd_all
 ADD CONSTRAINT mst_po_schd_all_ck13 CHECK (can_flg IN ('0', '1'));

