\encoding UTF-8

ALTER TABLE mam_slip_form_all
 ADD CONSTRAINT mam_slip_form_all_ck01 CHECK (del_flg IN ('0', '1'));

