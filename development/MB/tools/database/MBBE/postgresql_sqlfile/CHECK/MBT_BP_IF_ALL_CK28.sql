\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck28 CHECK (rcv_auto_appl_tgt_flg IN ('0', '1'));

