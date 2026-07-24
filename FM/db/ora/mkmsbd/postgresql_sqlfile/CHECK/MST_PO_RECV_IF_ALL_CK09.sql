\encoding UTF-8

ALTER TABLE mst_po_recv_if_all
 ADD CONSTRAINT mst_po_recv_if_all_ck09 CHECK (pri_print_flg IN ('0', '1'));

