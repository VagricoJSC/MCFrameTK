\encoding UTF-8

ALTER TABLE mst_po_send_if_all
 ADD CONSTRAINT mst_po_send_if_all_ck07 CHECK (sundry_itm_flg IN ('0', '1'));

