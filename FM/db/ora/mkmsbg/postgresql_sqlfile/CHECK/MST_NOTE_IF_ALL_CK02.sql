\encoding UTF-8

ALTER TABLE mst_note_if_all
 ADD CONSTRAINT mst_note_if_all_ck02 CHECK (a_imp_flg IN ('0', '1'));

