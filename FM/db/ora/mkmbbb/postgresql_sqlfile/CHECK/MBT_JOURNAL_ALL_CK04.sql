\encoding UTF-8

ALTER TABLE mbt_journal_all
 ADD CONSTRAINT mbt_journal_all_ck04 CHECK (send_flg IN ('0', '1'));

