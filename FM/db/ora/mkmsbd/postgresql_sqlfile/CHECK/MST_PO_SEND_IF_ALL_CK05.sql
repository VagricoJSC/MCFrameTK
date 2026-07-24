\encoding UTF-8

ALTER TABLE mst_po_send_if_all
 ADD CONSTRAINT mst_po_send_if_all_ck05 CHECK (interim_flg IN ('0', '1'));

