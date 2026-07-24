\encoding UTF-8

ALTER TABLE fcm_role_all
 ADD CONSTRAINT fcm_role_all_ck02 CHECK (admin_flg IN ('0', '1'));

