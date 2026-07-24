\encoding UTF-8

ALTER TABLE mst_po_schd_all
 ADD CONSTRAINT mst_po_schd_all_ck11 CHECK (rqst_crrct_flg IN ('0', '1'));

