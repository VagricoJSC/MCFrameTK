\encoding UTF-8

ALTER TABLE mst_po_recv_if_all
 ADD CONSTRAINT mst_po_recv_if_all_ck08 CHECK (tax_fix_flg IN ('0', '1'));

