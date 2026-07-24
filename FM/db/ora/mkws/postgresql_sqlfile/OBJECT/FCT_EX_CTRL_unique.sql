\encoding UTF-8

ALTER TABLE fct_ex_ctrl
 ADD CONSTRAINT fct_ex_ctrl_ak01 UNIQUE (co_cd,ext_attr1,ext_attr2,ext_attr3,table_name);

CREATE UNIQUE INDEX fct_ex_ctrl_ak01_ie ON fct_ex_ctrl (COALESCE(co_cd,''),COALESCE(ext_attr1,''),COALESCE(ext_attr2,''),COALESCE(ext_attr3,''),table_name);

