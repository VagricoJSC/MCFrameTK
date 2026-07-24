\encoding UTF-8

ALTER TABLE fct_pw_mod
 ADD CONSTRAINT fct_pw_mod_ak01 UNIQUE (user_id,user_pw);

CREATE UNIQUE INDEX fct_pw_mod_ak01_ie ON fct_pw_mod (user_id,COALESCE(user_pw,''));

