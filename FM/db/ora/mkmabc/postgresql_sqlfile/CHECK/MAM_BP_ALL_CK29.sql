\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck29 CHECK (ar_sttl_typ_match_flg IN ('0', '1'));

