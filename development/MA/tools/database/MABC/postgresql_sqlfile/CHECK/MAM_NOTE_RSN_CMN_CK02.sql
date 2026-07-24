\encoding UTF-8

ALTER TABLE mam_note_rsn_cmn
 ADD CONSTRAINT mam_note_rsn_cmn_ck02 CHECK (del_flg IN ('0', '1'));

