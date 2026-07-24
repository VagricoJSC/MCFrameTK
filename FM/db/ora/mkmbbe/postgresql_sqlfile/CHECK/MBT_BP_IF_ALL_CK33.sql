\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck33 CHECK (po_dlv_slip_flg IN ('0', '1'));

