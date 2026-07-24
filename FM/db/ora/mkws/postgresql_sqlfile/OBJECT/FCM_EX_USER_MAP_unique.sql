\encoding UTF-8

ALTER TABLE fcm_ex_user_map
 ADD CONSTRAINT fcm_ex_user_map_ak01 UNIQUE (user_id,auth_mode);

