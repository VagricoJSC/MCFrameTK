\encoding UTF-8

ALTER TABLE mst_po_send_if_all
 ADD CONSTRAINT mst_po_send_if_all_ck01 CHECK (drct_dlv_flg IN ('0', '1'));

