\encoding UTF-8

ALTER TABLE mst_po_recv_if_all
 ADD CONSTRAINT mst_po_recv_if_all_ck03 CHECK (xrate_inpt_flg IN ('0', '1'));

