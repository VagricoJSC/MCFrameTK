\encoding UTF-8

ALTER TABLE mst_po_all
 ADD CONSTRAINT mst_po_all_ck03 CHECK (ptax_xrate_inpt_flg IN ('0', '1'));

