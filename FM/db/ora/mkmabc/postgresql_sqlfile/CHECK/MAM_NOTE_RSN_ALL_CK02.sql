\encoding UTF-8

ALTER TABLE mam_note_rsn_all
 ADD CONSTRAINT mam_note_rsn_all_ck02 CHECK (del_flg IN ('0', '1'));

