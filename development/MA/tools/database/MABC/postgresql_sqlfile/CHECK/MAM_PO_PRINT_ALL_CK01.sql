\encoding UTF-8

ALTER TABLE mam_po_print_all
 ADD CONSTRAINT mam_po_print_all_ck01 CHECK (del_flg IN ('0', '1'));

