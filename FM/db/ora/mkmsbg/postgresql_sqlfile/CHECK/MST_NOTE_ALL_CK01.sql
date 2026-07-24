\encoding UTF-8

ALTER TABLE mst_note_all
 ADD CONSTRAINT mst_note_all_ck01 CHECK (mat_flg IN ('0', '1'));

