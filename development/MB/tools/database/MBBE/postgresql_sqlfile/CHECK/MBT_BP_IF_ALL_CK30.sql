\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck30 CHECK (ar_sttl_typ_match_flg IN ('0', '1'));

