\encoding UTF-8

ALTER TABLE mam_itm_dtl_all
 ADD CONSTRAINT mam_itm_dtl_all_ck04 CHECK (inst_rec_issue_flg IN ('0', '1'));

