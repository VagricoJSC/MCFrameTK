\encoding UTF-8

ALTER TABLE mst_po_send_if_all
 ADD CONSTRAINT mst_po_send_if_all_ck02 CHECK (in_to_sundry_flg IN ('0', '1'));

