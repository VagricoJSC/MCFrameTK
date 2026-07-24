\encoding UTF-8

CREATE TABLE fcm_const_nm
(c_grp_cd varchar (100) NOT NULL,
c_key varchar (100) NOT NULL,
locale_cd varchar (20) NULL,
v_s varchar (1000) NULL,
v_n numeric  NULL,
v_d timestamp(0)  NULL,
v_ts timestamp(3)  NULL,
v_f char (1) DEFAULT '0' NOT NULL,
c_name varchar (1000) NULL,
c_rmrks varchar (1000) NULL
);


ALTER TABLE fcm_const_nm
ADD CONSTRAINT fcm_const_nm_pk UNIQUE(c_grp_cd,c_key,locale_cd);


CREATE INDEX fcm_const_nm_ie01
ON fcm_const_nm USING BTREE (c_grp_cd,v_s,locale_cd);


CREATE INDEX fcm_const_nm_ie02
ON fcm_const_nm USING BTREE (c_grp_cd,v_n,locale_cd);


CREATE INDEX fcm_const_nm_ie03
ON fcm_const_nm USING BTREE (c_grp_cd,v_d,locale_cd);


CREATE INDEX fcm_const_nm_ie04
ON fcm_const_nm USING BTREE (c_grp_cd,v_ts,locale_cd);


CREATE INDEX fcm_const_nm_ie05
ON fcm_const_nm USING BTREE (c_grp_cd,v_f,locale_cd);


CREATE UNIQUE INDEX fcm_const_nm_pk_ie ON fcm_const_nm (c_grp_cd,c_key,COALESCE(locale_cd,''));

