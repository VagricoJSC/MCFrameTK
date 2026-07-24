\encoding UTF-8

ALTER TABLE mst_po_schd_all
 ADD CONSTRAINT mst_po_schd_all_ck10 CHECK (rqst_upd_stop_flg IN ('0', '1'));

