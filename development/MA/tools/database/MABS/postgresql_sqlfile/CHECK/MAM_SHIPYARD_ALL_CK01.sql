\encoding UTF-8

ALTER TABLE mam_shipyard_all
 ADD CONSTRAINT mam_shipyard_all_ck01 CHECK (del_flg IN ('0', '1'));

