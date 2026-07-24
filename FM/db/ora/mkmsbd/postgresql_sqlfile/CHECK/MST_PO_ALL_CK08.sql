\encoding UTF-8

ALTER TABLE mst_po_all
 ADD CONSTRAINT mst_po_all_ck08 CHECK (sgl_form_flg IN ('0', '1'));

