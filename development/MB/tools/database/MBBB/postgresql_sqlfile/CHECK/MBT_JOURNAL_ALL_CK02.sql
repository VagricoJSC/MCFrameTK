\encoding UTF-8

ALTER TABLE mbt_journal_all
 ADD CONSTRAINT mbt_journal_all_ck02 CHECK (alloc_jnl_flg IN ('0', '1'));

