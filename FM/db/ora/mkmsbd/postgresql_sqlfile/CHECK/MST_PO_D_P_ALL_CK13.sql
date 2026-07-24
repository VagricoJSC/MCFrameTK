\encoding UTF-8

ALTER TABLE mst_po_d_p_all
 ADD CONSTRAINT mst_po_d_p_all_ck13 CHECK (po_conf_rcpt_flg IN ('0', '1'));

