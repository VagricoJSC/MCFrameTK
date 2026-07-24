\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck27 CHECK (rcv_auto_appl_tgt_flg IN ('0', '1'));

