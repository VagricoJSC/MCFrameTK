\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck16 CHECK (stk_lst_issue_flg IN ('0', '1'));

