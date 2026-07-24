\encoding UTF-8

ALTER TABLE mbt_journal_all
 ADD CONSTRAINT mbt_journal_all_ck01 CHECK (foreign_flg IN ('0', '1'));

