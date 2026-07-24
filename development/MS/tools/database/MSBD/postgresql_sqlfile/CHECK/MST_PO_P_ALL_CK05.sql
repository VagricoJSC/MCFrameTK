\encoding UTF-8

ALTER TABLE mst_po_p_all
 ADD CONSTRAINT mst_po_p_all_ck05 CHECK (edi_flg IN ('0', '1'));

