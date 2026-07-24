\encoding UTF-8

ALTER TABLE mam_attach_info_all
 ADD CONSTRAINT mam_attach_info_all_ck01 CHECK (del_flg IN ('0', '1'));

