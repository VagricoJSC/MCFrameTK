\encoding UTF-8

ALTER TABLE mam_itm_dtl_all
 ADD CONSTRAINT mam_itm_dtl_all_ck08 CHECK (del_flg IN ('0', '1'));

