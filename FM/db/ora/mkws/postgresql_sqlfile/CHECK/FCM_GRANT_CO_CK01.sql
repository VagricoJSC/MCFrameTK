\encoding UTF-8

ALTER TABLE fcm_grant_co
 ADD CONSTRAINT fcm_grant_co_ck01 CHECK (main_flg IN ('0', '1'));

