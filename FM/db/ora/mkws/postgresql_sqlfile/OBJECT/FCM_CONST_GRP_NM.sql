\encoding UTF-8

CREATE TABLE fcm_const_grp_nm
(c_grp_cd varchar (100) NOT NULL,
locale_cd varchar (20) NULL,
c_grp_nm varchar (1000) NULL,
c_grp_rmrks varchar (1000) NULL
);


ALTER TABLE fcm_const_grp_nm
ADD CONSTRAINT fcm_const_grp_nm_pk UNIQUE(c_grp_cd,locale_cd);


CREATE UNIQUE INDEX fcm_const_grp_nm_pk_ie ON fcm_const_grp_nm (c_grp_cd,COALESCE(locale_cd,''));

