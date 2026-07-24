\encoding UTF-8

ALTER TABLE mst_po_send_if_all
 ADD CONSTRAINT mst_po_send_if_all_ck09 CHECK (abort_flg IN ('0', '1'));

