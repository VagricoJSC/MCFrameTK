\encoding UTF-8

ALTER TABLE fcm_memo
 ADD CONSTRAINT fcm_memo_ak01 UNIQUE (user_id,locale,memo_key,co_cd,ext_attr1,ext_attr2,ext_attr3);

CREATE UNIQUE INDEX fcm_memo_ak01_ie ON fcm_memo (COALESCE(user_id,''),COALESCE(locale,''),memo_key,COALESCE(co_cd,''),COALESCE(ext_attr1,''),COALESCE(ext_attr2,''),COALESCE(ext_attr3,''));

