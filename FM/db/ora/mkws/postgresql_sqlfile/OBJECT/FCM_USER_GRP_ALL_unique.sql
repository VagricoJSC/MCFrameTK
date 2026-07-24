\encoding UTF-8

ALTER TABLE fcm_user_grp_all
 ADD CONSTRAINT fcm_user_grp_all_ak01 UNIQUE (group_id);

