\encoding UTF-8

ALTER TABLE fcm_grant_user_grp
 ADD CONSTRAINT fcm_grant_user_grp_ak01 UNIQUE (user_id,co_cd,ext_attr1,ext_attr2,ext_attr3,ugid);

CREATE UNIQUE INDEX fcm_grant_user_grp_ak01_ie ON fcm_grant_user_grp (user_id,co_cd,COALESCE(ext_attr1,''),COALESCE(ext_attr2,''),COALESCE(ext_attr3,''),ugid);

