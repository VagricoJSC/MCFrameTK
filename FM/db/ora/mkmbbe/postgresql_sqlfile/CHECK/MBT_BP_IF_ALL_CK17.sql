\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck17 CHECK (stk_lst_issue_flg IN ('0', '1'));

