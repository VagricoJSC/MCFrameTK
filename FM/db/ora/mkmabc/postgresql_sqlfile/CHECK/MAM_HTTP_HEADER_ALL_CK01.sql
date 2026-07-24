\encoding UTF-8

ALTER TABLE mam_http_header_all
 ADD CONSTRAINT mam_http_header_all_ck01 CHECK (del_flg IN ('0', '1'));

