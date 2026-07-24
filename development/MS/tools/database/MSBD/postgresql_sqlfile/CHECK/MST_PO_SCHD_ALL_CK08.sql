\encoding UTF-8

ALTER TABLE mst_po_schd_all
 ADD CONSTRAINT mst_po_schd_all_ck08 CHECK (upri_not_tgt_flg IN ('0', '1'));

