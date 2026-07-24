\encoding UTF-8

ALTER TABLE mst_po_schd_all
 ADD CONSTRAINT mst_po_schd_all_ck05 CHECK (outsrc_itm_ord_crt_flg IN ('0', '1'));

