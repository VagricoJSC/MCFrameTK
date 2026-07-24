\encoding UTF-8

ALTER TABLE mam_bp_itm_all
 ADD CONSTRAINT mam_bp_itm_all_ck03 CHECK (purc_commit_flg IN ('0', '1'));

