\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck33 CHECK (po_dlv_slip_flg IN ('0', '1'));

