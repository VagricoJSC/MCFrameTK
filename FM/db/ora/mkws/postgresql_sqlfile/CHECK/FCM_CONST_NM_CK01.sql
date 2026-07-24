\encoding UTF-8

ALTER TABLE fcm_const_nm
 ADD CONSTRAINT fcm_const_nm_ck01 CHECK (v_f IN ('0', '1'));

