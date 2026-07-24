\encoding UTF-8

ALTER TABLE fcm_resource
 ADD CONSTRAINT fcm_resource_ak01 UNIQUE (user_id,co_cd,ext_attr1,ext_attr2,ext_attr3,locale,name,res_key);

CREATE UNIQUE INDEX fcm_resource_ak01_ie ON fcm_resource (user_id,COALESCE(co_cd,''),COALESCE(ext_attr1,''),COALESCE(ext_attr2,''),COALESCE(ext_attr3,''),COALESCE(locale,''),name,res_key);

