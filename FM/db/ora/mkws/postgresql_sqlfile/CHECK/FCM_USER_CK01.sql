\encoding UTF-8

ALTER TABLE fcm_user
 ADD CONSTRAINT fcm_user_ck01 CHECK (inv_flg IN ('0', '1'));

