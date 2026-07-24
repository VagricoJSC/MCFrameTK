\encoding UTF-8

ALTER TABLE mbt_journal_snd_if_all
 ADD CONSTRAINT mbt_journal_snd_if_all_ck03 CHECK (spot_flg IN ('0', '1'));

