\encoding UTF-8

ALTER TABLE mam_po_print_cmn
 ADD CONSTRAINT mam_po_print_cmn_ck01 CHECK (del_flg IN ('0', '1'));

