\encoding UTF-8

ALTER TABLE mam_bank_branch_all
 ADD CONSTRAINT mam_bank_branch_all_ck01 CHECK (del_flg IN ('0', '1'));

