\encoding UTF-8

ALTER TABLE mam_insp_ptn_all
 ADD CONSTRAINT mam_insp_ptn_all_ck01 CHECK (del_flg IN ('0', '1'));

