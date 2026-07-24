\encoding UTF-8

ALTER TABLE mam_itm_insp_ptn_all
 ADD CONSTRAINT mam_itm_insp_ptn_all_ck03 CHECK (del_flg IN ('0', '1'));

