\encoding UTF-8

ALTER TABLE mam_insp_point_all
 ADD CONSTRAINT mam_insp_point_all_ck02 CHECK (del_flg IN ('0', '1'));

