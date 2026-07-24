\encoding UTF-8

ALTER TABLE mam_bank_branch_cmn
 ADD CONSTRAINT mam_bank_branch_cmn_ck01 CHECK (del_flg IN ('0', '1'));

