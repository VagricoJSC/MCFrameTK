\encoding UTF-8

ALTER TABLE mbt_attachment_all
 ADD CONSTRAINT mbt_attachment_all_ck01 CHECK (archive_flg IN ('0', '1'));

