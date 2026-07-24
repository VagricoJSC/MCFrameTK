\encoding UTF-8

ALTER TABLE mam_itm_dtl_all
 ADD CONSTRAINT mam_itm_dtl_all_ck03 CHECK (pre_po_tgt_flg IN ('0', '1'));

