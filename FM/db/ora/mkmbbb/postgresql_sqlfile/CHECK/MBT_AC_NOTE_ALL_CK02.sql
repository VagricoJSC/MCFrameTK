\encoding UTF-8

ALTER TABLE mbt_ac_note_all
 ADD CONSTRAINT mbt_ac_note_all_ck02 CHECK (fin_flg IN ('0', '1'));

