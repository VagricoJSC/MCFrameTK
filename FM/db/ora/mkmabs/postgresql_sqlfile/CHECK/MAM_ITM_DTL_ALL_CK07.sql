\encoding UTF-8

ALTER TABLE mam_itm_dtl_all
 ADD CONSTRAINT mam_itm_dtl_all_ck07 CHECK (not_mrp_flg IN ('0', '1'));

