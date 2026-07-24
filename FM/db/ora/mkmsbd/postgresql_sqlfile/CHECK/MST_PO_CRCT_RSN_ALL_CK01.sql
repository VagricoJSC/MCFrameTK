\encoding UTF-8

ALTER TABLE mst_po_crct_rsn_all
 ADD CONSTRAINT mst_po_crct_rsn_all_ck01 CHECK (del_flg IN ('0', '1'));

