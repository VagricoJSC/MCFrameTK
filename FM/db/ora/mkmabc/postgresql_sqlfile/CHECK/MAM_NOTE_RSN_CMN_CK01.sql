\encoding UTF-8

ALTER TABLE mam_note_rsn_cmn
 ADD CONSTRAINT mam_note_rsn_cmn_ck01 CHECK (dpt_id_flg IN ('0', '1'));

