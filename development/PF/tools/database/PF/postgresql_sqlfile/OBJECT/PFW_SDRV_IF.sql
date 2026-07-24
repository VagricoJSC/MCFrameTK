\encoding UTF-8

CREATE OR REPLACE FUNCTION pfw_sdrv_if()
RETURNS TABLE (
	if_proc_typ varchar,
	data_no numeric,
	ext_sys_cd varchar,
	conv_ope varchar,
	file_io_ope varchar,
	attr_char1 varchar,
	attr_char2 varchar,
	attr_char3 varchar,
	attr_char4 varchar,
	attr_char5 varchar,
	attr_char6 varchar,
	attr_char7 varchar,
	attr_char8 varchar,
	attr_char9 varchar,
	attr_char10 varchar,
	attr_num1 numeric,
	attr_num2 numeric,
	attr_num3 numeric,
	attr_num4 numeric,
	attr_num5 numeric,
	attr_dt1 timestamp(0),
	attr_dt2 timestamp(0),
	attr_dt3 timestamp(0),
	attr_dt4 timestamp(0),
	attr_dt5 timestamp(0),
	sdrv_clt_id varchar,
	sdrv_usr_id varchar,
	sdrv_usr_nm varchar,
	attr_char11 varchar,
	attr_char12 varchar,
	attr_char13 varchar,
	attr_char14 varchar,
	attr_char15 varchar,
	attr_char16 varchar,
	attr_char17 varchar,
	attr_char18 varchar,
	attr_char19 varchar,
	attr_char20 varchar,
	attr_char21 varchar,
	attr_char22 varchar,
	attr_char23 varchar,
	attr_char24 varchar,
	attr_char25 varchar,
	attr_char26 varchar,
	attr_char27 varchar,
	attr_char28 varchar,
	attr_char29 varchar,
	attr_char30 varchar,
	attr_tm1 timestamp(0),
	attr_tm2 timestamp(0),
	attr_tm3 timestamp(0),
	attr_tm4 timestamp(0),
	attr_tm5 timestamp(0),
	not_send_upd_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('pfw_sdrv_if$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE pfw_sdrv_if$temp(
				if_proc_typ varchar (10) NOT NULL,
				data_no numeric (15,0) NOT NULL,
				ext_sys_cd varchar (10) NOT NULL,
				conv_ope varchar (100) NULL,
				file_io_ope varchar (100) NULL,
				attr_char1 varchar (50) NULL,
				attr_char2 varchar (50) NULL,
				attr_char3 varchar (50) NULL,
				attr_char4 varchar (50) NULL,
				attr_char5 varchar (50) NULL,
				attr_char6 varchar (50) NULL,
				attr_char7 varchar (50) NULL,
				attr_char8 varchar (50) NULL,
				attr_char9 varchar (50) NULL,
				attr_char10 varchar (50) NULL,
				attr_num1 numeric (21,8) NULL,
				attr_num2 numeric (21,8) NULL,
				attr_num3 numeric (21,8) NULL,
				attr_num4 numeric (21,8) NULL,
				attr_num5 numeric (21,8) NULL,
				attr_dt1 timestamp(0)  NULL,
				attr_dt2 timestamp(0)  NULL,
				attr_dt3 timestamp(0)  NULL,
				attr_dt4 timestamp(0)  NULL,
				attr_dt5 timestamp(0)  NULL,
				sdrv_clt_id varchar (50) NULL,
				sdrv_usr_id varchar (500) NULL,
				sdrv_usr_nm varchar (100) NULL,
				attr_char11 varchar (50) NULL,
				attr_char12 varchar (50) NULL,
				attr_char13 varchar (50) NULL,
				attr_char14 varchar (50) NULL,
				attr_char15 varchar (50) NULL,
				attr_char16 varchar (50) NULL,
				attr_char17 varchar (50) NULL,
				attr_char18 varchar (50) NULL,
				attr_char19 varchar (50) NULL,
				attr_char20 varchar (50) NULL,
				attr_char21 varchar (50) NULL,
				attr_char22 varchar (50) NULL,
				attr_char23 varchar (50) NULL,
				attr_char24 varchar (50) NULL,
				attr_char25 varchar (50) NULL,
				attr_char26 varchar (50) NULL,
				attr_char27 varchar (50) NULL,
				attr_char28 varchar (50) NULL,
				attr_char29 varchar (50) NULL,
				attr_char30 varchar (50) NULL,
				attr_tm1 timestamp(0)  NULL,
				attr_tm2 timestamp(0)  NULL,
				attr_tm3 timestamp(0)  NULL,
				attr_tm4 timestamp(0)  NULL,
				attr_tm5 timestamp(0)  NULL,
				not_send_upd_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE pfw_sdrv_if$temp
				ADD CONSTRAINT pfw_sdrv_if_ck01 CHECK (not_send_upd_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('pfw_sdrv_if$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM pfw_sdrv_if$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW pfw_sdrv_if
AS
SELECT *
FROM pfw_sdrv_if();
ALTER VIEW pfw_sdrv_if ALTER COLUMN not_send_upd_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION pfw_sdrv_if$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('pfw_sdrv_if$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE pfw_sdrv_if$temp(
				if_proc_typ varchar (10) NOT NULL,
				data_no numeric (15,0) NOT NULL,
				ext_sys_cd varchar (10) NOT NULL,
				conv_ope varchar (100) NULL,
				file_io_ope varchar (100) NULL,
				attr_char1 varchar (50) NULL,
				attr_char2 varchar (50) NULL,
				attr_char3 varchar (50) NULL,
				attr_char4 varchar (50) NULL,
				attr_char5 varchar (50) NULL,
				attr_char6 varchar (50) NULL,
				attr_char7 varchar (50) NULL,
				attr_char8 varchar (50) NULL,
				attr_char9 varchar (50) NULL,
				attr_char10 varchar (50) NULL,
				attr_num1 numeric (21,8) NULL,
				attr_num2 numeric (21,8) NULL,
				attr_num3 numeric (21,8) NULL,
				attr_num4 numeric (21,8) NULL,
				attr_num5 numeric (21,8) NULL,
				attr_dt1 timestamp(0)  NULL,
				attr_dt2 timestamp(0)  NULL,
				attr_dt3 timestamp(0)  NULL,
				attr_dt4 timestamp(0)  NULL,
				attr_dt5 timestamp(0)  NULL,
				sdrv_clt_id varchar (50) NULL,
				sdrv_usr_id varchar (500) NULL,
				sdrv_usr_nm varchar (100) NULL,
				attr_char11 varchar (50) NULL,
				attr_char12 varchar (50) NULL,
				attr_char13 varchar (50) NULL,
				attr_char14 varchar (50) NULL,
				attr_char15 varchar (50) NULL,
				attr_char16 varchar (50) NULL,
				attr_char17 varchar (50) NULL,
				attr_char18 varchar (50) NULL,
				attr_char19 varchar (50) NULL,
				attr_char20 varchar (50) NULL,
				attr_char21 varchar (50) NULL,
				attr_char22 varchar (50) NULL,
				attr_char23 varchar (50) NULL,
				attr_char24 varchar (50) NULL,
				attr_char25 varchar (50) NULL,
				attr_char26 varchar (50) NULL,
				attr_char27 varchar (50) NULL,
				attr_char28 varchar (50) NULL,
				attr_char29 varchar (50) NULL,
				attr_char30 varchar (50) NULL,
				attr_tm1 timestamp(0)  NULL,
				attr_tm2 timestamp(0)  NULL,
				attr_tm3 timestamp(0)  NULL,
				attr_tm4 timestamp(0)  NULL,
				attr_tm5 timestamp(0)  NULL,
				not_send_upd_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE pfw_sdrv_if$temp
			ADD CONSTRAINT pfw_sdrv_if_ck01 CHECK (not_send_upd_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('pfw_sdrv_if$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO pfw_sdrv_if$temp(
			if_proc_typ,
			data_no,
			ext_sys_cd,
			conv_ope,
			file_io_ope,
			attr_char1,
			attr_char2,
			attr_char3,
			attr_char4,
			attr_char5,
			attr_char6,
			attr_char7,
			attr_char8,
			attr_char9,
			attr_char10,
			attr_num1,
			attr_num2,
			attr_num3,
			attr_num4,
			attr_num5,
			attr_dt1,
			attr_dt2,
			attr_dt3,
			attr_dt4,
			attr_dt5,
			sdrv_clt_id,
			sdrv_usr_id,
			sdrv_usr_nm,
			attr_char11,
			attr_char12,
			attr_char13,
			attr_char14,
			attr_char15,
			attr_char16,
			attr_char17,
			attr_char18,
			attr_char19,
			attr_char20,
			attr_char21,
			attr_char22,
			attr_char23,
			attr_char24,
			attr_char25,
			attr_char26,
			attr_char27,
			attr_char28,
			attr_char29,
			attr_char30,
			attr_tm1,
			attr_tm2,
			attr_tm3,
			attr_tm4,
			attr_tm5,
			not_send_upd_flg
		)VALUES (
			NEW.if_proc_typ,
			NEW.data_no,
			NEW.ext_sys_cd,
			NEW.conv_ope,
			NEW.file_io_ope,
			NEW.attr_char1,
			NEW.attr_char2,
			NEW.attr_char3,
			NEW.attr_char4,
			NEW.attr_char5,
			NEW.attr_char6,
			NEW.attr_char7,
			NEW.attr_char8,
			NEW.attr_char9,
			NEW.attr_char10,
			NEW.attr_num1,
			NEW.attr_num2,
			NEW.attr_num3,
			NEW.attr_num4,
			NEW.attr_num5,
			NEW.attr_dt1,
			NEW.attr_dt2,
			NEW.attr_dt3,
			NEW.attr_dt4,
			NEW.attr_dt5,
			NEW.sdrv_clt_id,
			NEW.sdrv_usr_id,
			NEW.sdrv_usr_nm,
			NEW.attr_char11,
			NEW.attr_char12,
			NEW.attr_char13,
			NEW.attr_char14,
			NEW.attr_char15,
			NEW.attr_char16,
			NEW.attr_char17,
			NEW.attr_char18,
			NEW.attr_char19,
			NEW.attr_char20,
			NEW.attr_char21,
			NEW.attr_char22,
			NEW.attr_char23,
			NEW.attr_char24,
			NEW.attr_char25,
			NEW.attr_char26,
			NEW.attr_char27,
			NEW.attr_char28,
			NEW.attr_char29,
			NEW.attr_char30,
			NEW.attr_tm1,
			NEW.attr_tm2,
			NEW.attr_tm3,
			NEW.attr_tm4,
			NEW.attr_tm5,
			NEW.not_send_upd_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE pfw_sdrv_if$temp
		SET 
			if_proc_typ = NEW.if_proc_typ,
			data_no = NEW.data_no,
			ext_sys_cd = NEW.ext_sys_cd,
			conv_ope = NEW.conv_ope,
			file_io_ope = NEW.file_io_ope,
			attr_char1 = NEW.attr_char1,
			attr_char2 = NEW.attr_char2,
			attr_char3 = NEW.attr_char3,
			attr_char4 = NEW.attr_char4,
			attr_char5 = NEW.attr_char5,
			attr_char6 = NEW.attr_char6,
			attr_char7 = NEW.attr_char7,
			attr_char8 = NEW.attr_char8,
			attr_char9 = NEW.attr_char9,
			attr_char10 = NEW.attr_char10,
			attr_num1 = NEW.attr_num1,
			attr_num2 = NEW.attr_num2,
			attr_num3 = NEW.attr_num3,
			attr_num4 = NEW.attr_num4,
			attr_num5 = NEW.attr_num5,
			attr_dt1 = NEW.attr_dt1,
			attr_dt2 = NEW.attr_dt2,
			attr_dt3 = NEW.attr_dt3,
			attr_dt4 = NEW.attr_dt4,
			attr_dt5 = NEW.attr_dt5,
			sdrv_clt_id = NEW.sdrv_clt_id,
			sdrv_usr_id = NEW.sdrv_usr_id,
			sdrv_usr_nm = NEW.sdrv_usr_nm,
			attr_char11 = NEW.attr_char11,
			attr_char12 = NEW.attr_char12,
			attr_char13 = NEW.attr_char13,
			attr_char14 = NEW.attr_char14,
			attr_char15 = NEW.attr_char15,
			attr_char16 = NEW.attr_char16,
			attr_char17 = NEW.attr_char17,
			attr_char18 = NEW.attr_char18,
			attr_char19 = NEW.attr_char19,
			attr_char20 = NEW.attr_char20,
			attr_char21 = NEW.attr_char21,
			attr_char22 = NEW.attr_char22,
			attr_char23 = NEW.attr_char23,
			attr_char24 = NEW.attr_char24,
			attr_char25 = NEW.attr_char25,
			attr_char26 = NEW.attr_char26,
			attr_char27 = NEW.attr_char27,
			attr_char28 = NEW.attr_char28,
			attr_char29 = NEW.attr_char29,
			attr_char30 = NEW.attr_char30,
			attr_tm1 = NEW.attr_tm1,
			attr_tm2 = NEW.attr_tm2,
			attr_tm3 = NEW.attr_tm3,
			attr_tm4 = NEW.attr_tm4,
			attr_tm5 = NEW.attr_tm5,
			not_send_upd_flg = NEW.not_send_upd_flg
		WHERE 0=0
		AND if_proc_typ = OLD.if_proc_typ
		AND data_no = OLD.data_no
		AND ext_sys_cd = OLD.ext_sys_cd
		AND (conv_ope = OLD.conv_ope OR conv_ope IS NULL AND OLD.conv_ope IS NULL)
		AND (file_io_ope = OLD.file_io_ope OR file_io_ope IS NULL AND OLD.file_io_ope IS NULL)
		AND (attr_char1 = OLD.attr_char1 OR attr_char1 IS NULL AND OLD.attr_char1 IS NULL)
		AND (attr_char2 = OLD.attr_char2 OR attr_char2 IS NULL AND OLD.attr_char2 IS NULL)
		AND (attr_char3 = OLD.attr_char3 OR attr_char3 IS NULL AND OLD.attr_char3 IS NULL)
		AND (attr_char4 = OLD.attr_char4 OR attr_char4 IS NULL AND OLD.attr_char4 IS NULL)
		AND (attr_char5 = OLD.attr_char5 OR attr_char5 IS NULL AND OLD.attr_char5 IS NULL)
		AND (attr_char6 = OLD.attr_char6 OR attr_char6 IS NULL AND OLD.attr_char6 IS NULL)
		AND (attr_char7 = OLD.attr_char7 OR attr_char7 IS NULL AND OLD.attr_char7 IS NULL)
		AND (attr_char8 = OLD.attr_char8 OR attr_char8 IS NULL AND OLD.attr_char8 IS NULL)
		AND (attr_char9 = OLD.attr_char9 OR attr_char9 IS NULL AND OLD.attr_char9 IS NULL)
		AND (attr_char10 = OLD.attr_char10 OR attr_char10 IS NULL AND OLD.attr_char10 IS NULL)
		AND (attr_num1 = OLD.attr_num1 OR attr_num1 IS NULL AND OLD.attr_num1 IS NULL)
		AND (attr_num2 = OLD.attr_num2 OR attr_num2 IS NULL AND OLD.attr_num2 IS NULL)
		AND (attr_num3 = OLD.attr_num3 OR attr_num3 IS NULL AND OLD.attr_num3 IS NULL)
		AND (attr_num4 = OLD.attr_num4 OR attr_num4 IS NULL AND OLD.attr_num4 IS NULL)
		AND (attr_num5 = OLD.attr_num5 OR attr_num5 IS NULL AND OLD.attr_num5 IS NULL)
		AND (attr_dt1 = OLD.attr_dt1 OR attr_dt1 IS NULL AND OLD.attr_dt1 IS NULL)
		AND (attr_dt2 = OLD.attr_dt2 OR attr_dt2 IS NULL AND OLD.attr_dt2 IS NULL)
		AND (attr_dt3 = OLD.attr_dt3 OR attr_dt3 IS NULL AND OLD.attr_dt3 IS NULL)
		AND (attr_dt4 = OLD.attr_dt4 OR attr_dt4 IS NULL AND OLD.attr_dt4 IS NULL)
		AND (attr_dt5 = OLD.attr_dt5 OR attr_dt5 IS NULL AND OLD.attr_dt5 IS NULL)
		AND (sdrv_clt_id = OLD.sdrv_clt_id OR sdrv_clt_id IS NULL AND OLD.sdrv_clt_id IS NULL)
		AND (sdrv_usr_id = OLD.sdrv_usr_id OR sdrv_usr_id IS NULL AND OLD.sdrv_usr_id IS NULL)
		AND (sdrv_usr_nm = OLD.sdrv_usr_nm OR sdrv_usr_nm IS NULL AND OLD.sdrv_usr_nm IS NULL)
		AND (attr_char11 = OLD.attr_char11 OR attr_char11 IS NULL AND OLD.attr_char11 IS NULL)
		AND (attr_char12 = OLD.attr_char12 OR attr_char12 IS NULL AND OLD.attr_char12 IS NULL)
		AND (attr_char13 = OLD.attr_char13 OR attr_char13 IS NULL AND OLD.attr_char13 IS NULL)
		AND (attr_char14 = OLD.attr_char14 OR attr_char14 IS NULL AND OLD.attr_char14 IS NULL)
		AND (attr_char15 = OLD.attr_char15 OR attr_char15 IS NULL AND OLD.attr_char15 IS NULL)
		AND (attr_char16 = OLD.attr_char16 OR attr_char16 IS NULL AND OLD.attr_char16 IS NULL)
		AND (attr_char17 = OLD.attr_char17 OR attr_char17 IS NULL AND OLD.attr_char17 IS NULL)
		AND (attr_char18 = OLD.attr_char18 OR attr_char18 IS NULL AND OLD.attr_char18 IS NULL)
		AND (attr_char19 = OLD.attr_char19 OR attr_char19 IS NULL AND OLD.attr_char19 IS NULL)
		AND (attr_char20 = OLD.attr_char20 OR attr_char20 IS NULL AND OLD.attr_char20 IS NULL)
		AND (attr_char21 = OLD.attr_char21 OR attr_char21 IS NULL AND OLD.attr_char21 IS NULL)
		AND (attr_char22 = OLD.attr_char22 OR attr_char22 IS NULL AND OLD.attr_char22 IS NULL)
		AND (attr_char23 = OLD.attr_char23 OR attr_char23 IS NULL AND OLD.attr_char23 IS NULL)
		AND (attr_char24 = OLD.attr_char24 OR attr_char24 IS NULL AND OLD.attr_char24 IS NULL)
		AND (attr_char25 = OLD.attr_char25 OR attr_char25 IS NULL AND OLD.attr_char25 IS NULL)
		AND (attr_char26 = OLD.attr_char26 OR attr_char26 IS NULL AND OLD.attr_char26 IS NULL)
		AND (attr_char27 = OLD.attr_char27 OR attr_char27 IS NULL AND OLD.attr_char27 IS NULL)
		AND (attr_char28 = OLD.attr_char28 OR attr_char28 IS NULL AND OLD.attr_char28 IS NULL)
		AND (attr_char29 = OLD.attr_char29 OR attr_char29 IS NULL AND OLD.attr_char29 IS NULL)
		AND (attr_char30 = OLD.attr_char30 OR attr_char30 IS NULL AND OLD.attr_char30 IS NULL)
		AND (attr_tm1 = OLD.attr_tm1 OR attr_tm1 IS NULL AND OLD.attr_tm1 IS NULL)
		AND (attr_tm2 = OLD.attr_tm2 OR attr_tm2 IS NULL AND OLD.attr_tm2 IS NULL)
		AND (attr_tm3 = OLD.attr_tm3 OR attr_tm3 IS NULL AND OLD.attr_tm3 IS NULL)
		AND (attr_tm4 = OLD.attr_tm4 OR attr_tm4 IS NULL AND OLD.attr_tm4 IS NULL)
		AND (attr_tm5 = OLD.attr_tm5 OR attr_tm5 IS NULL AND OLD.attr_tm5 IS NULL)
		AND not_send_upd_flg = OLD.not_send_upd_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM pfw_sdrv_if$temp
		WHERE 0=0
		AND if_proc_typ = OLD.if_proc_typ
		AND data_no = OLD.data_no
		AND ext_sys_cd = OLD.ext_sys_cd
		AND (conv_ope = OLD.conv_ope OR conv_ope IS NULL AND OLD.conv_ope IS NULL)
		AND (file_io_ope = OLD.file_io_ope OR file_io_ope IS NULL AND OLD.file_io_ope IS NULL)
		AND (attr_char1 = OLD.attr_char1 OR attr_char1 IS NULL AND OLD.attr_char1 IS NULL)
		AND (attr_char2 = OLD.attr_char2 OR attr_char2 IS NULL AND OLD.attr_char2 IS NULL)
		AND (attr_char3 = OLD.attr_char3 OR attr_char3 IS NULL AND OLD.attr_char3 IS NULL)
		AND (attr_char4 = OLD.attr_char4 OR attr_char4 IS NULL AND OLD.attr_char4 IS NULL)
		AND (attr_char5 = OLD.attr_char5 OR attr_char5 IS NULL AND OLD.attr_char5 IS NULL)
		AND (attr_char6 = OLD.attr_char6 OR attr_char6 IS NULL AND OLD.attr_char6 IS NULL)
		AND (attr_char7 = OLD.attr_char7 OR attr_char7 IS NULL AND OLD.attr_char7 IS NULL)
		AND (attr_char8 = OLD.attr_char8 OR attr_char8 IS NULL AND OLD.attr_char8 IS NULL)
		AND (attr_char9 = OLD.attr_char9 OR attr_char9 IS NULL AND OLD.attr_char9 IS NULL)
		AND (attr_char10 = OLD.attr_char10 OR attr_char10 IS NULL AND OLD.attr_char10 IS NULL)
		AND (attr_num1 = OLD.attr_num1 OR attr_num1 IS NULL AND OLD.attr_num1 IS NULL)
		AND (attr_num2 = OLD.attr_num2 OR attr_num2 IS NULL AND OLD.attr_num2 IS NULL)
		AND (attr_num3 = OLD.attr_num3 OR attr_num3 IS NULL AND OLD.attr_num3 IS NULL)
		AND (attr_num4 = OLD.attr_num4 OR attr_num4 IS NULL AND OLD.attr_num4 IS NULL)
		AND (attr_num5 = OLD.attr_num5 OR attr_num5 IS NULL AND OLD.attr_num5 IS NULL)
		AND (attr_dt1 = OLD.attr_dt1 OR attr_dt1 IS NULL AND OLD.attr_dt1 IS NULL)
		AND (attr_dt2 = OLD.attr_dt2 OR attr_dt2 IS NULL AND OLD.attr_dt2 IS NULL)
		AND (attr_dt3 = OLD.attr_dt3 OR attr_dt3 IS NULL AND OLD.attr_dt3 IS NULL)
		AND (attr_dt4 = OLD.attr_dt4 OR attr_dt4 IS NULL AND OLD.attr_dt4 IS NULL)
		AND (attr_dt5 = OLD.attr_dt5 OR attr_dt5 IS NULL AND OLD.attr_dt5 IS NULL)
		AND (sdrv_clt_id = OLD.sdrv_clt_id OR sdrv_clt_id IS NULL AND OLD.sdrv_clt_id IS NULL)
		AND (sdrv_usr_id = OLD.sdrv_usr_id OR sdrv_usr_id IS NULL AND OLD.sdrv_usr_id IS NULL)
		AND (sdrv_usr_nm = OLD.sdrv_usr_nm OR sdrv_usr_nm IS NULL AND OLD.sdrv_usr_nm IS NULL)
		AND (attr_char11 = OLD.attr_char11 OR attr_char11 IS NULL AND OLD.attr_char11 IS NULL)
		AND (attr_char12 = OLD.attr_char12 OR attr_char12 IS NULL AND OLD.attr_char12 IS NULL)
		AND (attr_char13 = OLD.attr_char13 OR attr_char13 IS NULL AND OLD.attr_char13 IS NULL)
		AND (attr_char14 = OLD.attr_char14 OR attr_char14 IS NULL AND OLD.attr_char14 IS NULL)
		AND (attr_char15 = OLD.attr_char15 OR attr_char15 IS NULL AND OLD.attr_char15 IS NULL)
		AND (attr_char16 = OLD.attr_char16 OR attr_char16 IS NULL AND OLD.attr_char16 IS NULL)
		AND (attr_char17 = OLD.attr_char17 OR attr_char17 IS NULL AND OLD.attr_char17 IS NULL)
		AND (attr_char18 = OLD.attr_char18 OR attr_char18 IS NULL AND OLD.attr_char18 IS NULL)
		AND (attr_char19 = OLD.attr_char19 OR attr_char19 IS NULL AND OLD.attr_char19 IS NULL)
		AND (attr_char20 = OLD.attr_char20 OR attr_char20 IS NULL AND OLD.attr_char20 IS NULL)
		AND (attr_char21 = OLD.attr_char21 OR attr_char21 IS NULL AND OLD.attr_char21 IS NULL)
		AND (attr_char22 = OLD.attr_char22 OR attr_char22 IS NULL AND OLD.attr_char22 IS NULL)
		AND (attr_char23 = OLD.attr_char23 OR attr_char23 IS NULL AND OLD.attr_char23 IS NULL)
		AND (attr_char24 = OLD.attr_char24 OR attr_char24 IS NULL AND OLD.attr_char24 IS NULL)
		AND (attr_char25 = OLD.attr_char25 OR attr_char25 IS NULL AND OLD.attr_char25 IS NULL)
		AND (attr_char26 = OLD.attr_char26 OR attr_char26 IS NULL AND OLD.attr_char26 IS NULL)
		AND (attr_char27 = OLD.attr_char27 OR attr_char27 IS NULL AND OLD.attr_char27 IS NULL)
		AND (attr_char28 = OLD.attr_char28 OR attr_char28 IS NULL AND OLD.attr_char28 IS NULL)
		AND (attr_char29 = OLD.attr_char29 OR attr_char29 IS NULL AND OLD.attr_char29 IS NULL)
		AND (attr_char30 = OLD.attr_char30 OR attr_char30 IS NULL AND OLD.attr_char30 IS NULL)
		AND (attr_tm1 = OLD.attr_tm1 OR attr_tm1 IS NULL AND OLD.attr_tm1 IS NULL)
		AND (attr_tm2 = OLD.attr_tm2 OR attr_tm2 IS NULL AND OLD.attr_tm2 IS NULL)
		AND (attr_tm3 = OLD.attr_tm3 OR attr_tm3 IS NULL AND OLD.attr_tm3 IS NULL)
		AND (attr_tm4 = OLD.attr_tm4 OR attr_tm4 IS NULL AND OLD.attr_tm4 IS NULL)
		AND (attr_tm5 = OLD.attr_tm5 OR attr_tm5 IS NULL AND OLD.attr_tm5 IS NULL)
		AND not_send_upd_flg = OLD.not_send_upd_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER pfw_sdrv_if$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON pfw_sdrv_if
FOR EACH ROW
EXECUTE PROCEDURE pfw_sdrv_if$func();
;

