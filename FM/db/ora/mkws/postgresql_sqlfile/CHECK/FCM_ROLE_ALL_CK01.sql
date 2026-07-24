\encoding UTF-8

ALTER TABLE fcm_role_all
 ADD CONSTRAINT fcm_role_all_ck01 CHECK (history IN ('0', '1'));

