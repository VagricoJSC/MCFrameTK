\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck35 CHECK (prms_rcpt_dlv_slip_flg IN ('0', '1'));

