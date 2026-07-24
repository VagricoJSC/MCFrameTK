\encoding UTF-8

ALTER TABLE fct_serv_sts_ctrl
 ADD CONSTRAINT fct_serv_sts_ctrl_ak01 UNIQUE (co_cd,ext_attr1,ext_attr2,ext_attr3);

CREATE UNIQUE INDEX fct_serv_sts_ctrl_ak01_ie ON fct_serv_sts_ctrl (co_cd,COALESCE(ext_attr1,''),COALESCE(ext_attr2,''),COALESCE(ext_attr3,''));

