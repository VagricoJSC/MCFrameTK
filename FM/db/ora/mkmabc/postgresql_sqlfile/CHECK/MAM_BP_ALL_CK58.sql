\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck58 CHECK (tdlv_flg IN ('0', '1'));

