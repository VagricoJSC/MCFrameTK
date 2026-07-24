\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck45 CHECK (prms_recv_flg IN ('0', '1'));

