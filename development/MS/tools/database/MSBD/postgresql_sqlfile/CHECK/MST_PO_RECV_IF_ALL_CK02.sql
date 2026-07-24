\encoding UTF-8

ALTER TABLE mst_po_recv_if_all
 ADD CONSTRAINT mst_po_recv_if_all_ck02 CHECK (prnt_dlv_flg IN ('0', '1'));

