\encoding UTF-8

ALTER TABLE fct_patchversion
 ADD CONSTRAINT fct_patchversion_ak01 UNIQUE (product_id,module_id,version,branch);

