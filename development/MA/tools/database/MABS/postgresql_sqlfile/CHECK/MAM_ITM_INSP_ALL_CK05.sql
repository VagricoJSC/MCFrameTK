\encoding UTF-8

ALTER TABLE mam_itm_insp_all
 ADD CONSTRAINT mam_itm_insp_all_ck05 CHECK (inst_rslt_issue_flg IN ('0', '1'));

