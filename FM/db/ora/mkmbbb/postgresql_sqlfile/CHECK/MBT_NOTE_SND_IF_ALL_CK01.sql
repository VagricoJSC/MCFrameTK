\encoding UTF-8

ALTER TABLE mbt_note_snd_if_all
 ADD CONSTRAINT mbt_note_snd_if_all_ck01 CHECK (foreign_flg IN ('0', '1'));

