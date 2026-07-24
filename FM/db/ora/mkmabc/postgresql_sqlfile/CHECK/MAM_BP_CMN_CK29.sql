\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck29 CHECK (ar_sttl_typ_match_flg IN ('0', '1'));

