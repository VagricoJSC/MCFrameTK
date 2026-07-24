\encoding UTF-8

ALTER TABLE fct_design
 ADD CONSTRAINT fct_design_ck01 CHECK (is_share IN ('0', '1'));

