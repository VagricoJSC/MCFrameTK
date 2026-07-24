\encoding UTF-8

ALTER TABLE fcm_grant_serv_sts
 ADD CONSTRAINT fcm_grant_serv_sts_ak01 UNIQUE (user_id,sid);

