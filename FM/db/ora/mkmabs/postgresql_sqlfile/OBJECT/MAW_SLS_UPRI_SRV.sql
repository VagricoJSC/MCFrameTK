\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_sls_upri_srv()
RETURNS TABLE (
	peg_no numeric,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	cst_cd varchar,
	dlv_cd varchar,
	dest_cd1 varchar,
	dest_cd2 varchar,
	dest_cd3 varchar,
	unit_cd varchar,
	qty numeric,
	cur_cd varchar,
	wg_cd varchar,
	dt timestamp(0),
	grp_no varchar,
	sls_upri numeric,
	std_sls_upri numeric,
	std_upri numeric,
	interim_flg char,
	sls_upri_flg char,
	std_sls_upri_flg char,
	std_upri_flg char,
	std_upri_wg_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_sls_upri_srv$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_sls_upri_srv$temp(
				peg_no numeric (9,0) NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				cst_cd varchar (20) DEFAULT '*' NOT NULL,
				dlv_cd varchar (20) NULL,
				dest_cd1 varchar (20) NULL,
				dest_cd2 varchar (20) NULL,
				dest_cd3 varchar (20) NULL,
				unit_cd varchar (5) NOT NULL,
				qty numeric (21,8) NOT NULL,
				cur_cd varchar (3) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				dt timestamp(0)  NOT NULL,
				grp_no varchar (20) NULL,
				sls_upri numeric (21,8) NULL,
				std_sls_upri numeric (21,8) NULL,
				std_upri numeric (21,8) NULL,
				interim_flg char (1) DEFAULT '0' NOT NULL,
				sls_upri_flg char (1) DEFAULT '0' NOT NULL,
				std_sls_upri_flg char (1) DEFAULT '0' NOT NULL,
				std_upri_flg char (1) DEFAULT '0' NOT NULL,
				std_upri_wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_sls_upri_srv_ie01 ON maw_sls_upri_srv$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,cst_cd,unit_cd,cur_cd,wg_cd);
			ALTER TABLE maw_sls_upri_srv$temp
			ADD CONSTRAINT maw_sls_upri_srv_pk PRIMARY KEY(peg_no);
			
			ALTER TABLE maw_sls_upri_srv$temp
				ADD CONSTRAINT maw_sls_upri_srv_ck01 CHECK (interim_flg IN ('0', '1'));
			ALTER TABLE maw_sls_upri_srv$temp
				ADD CONSTRAINT maw_sls_upri_srv_ck02 CHECK (sls_upri_flg IN ('0', '1'));
			ALTER TABLE maw_sls_upri_srv$temp
				ADD CONSTRAINT maw_sls_upri_srv_ck03 CHECK (std_sls_upri_flg IN ('0', '1'));
			ALTER TABLE maw_sls_upri_srv$temp
				ADD CONSTRAINT maw_sls_upri_srv_ck04 CHECK (std_upri_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_sls_upri_srv$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_sls_upri_srv$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_sls_upri_srv
AS
SELECT *
FROM maw_sls_upri_srv();
ALTER VIEW maw_sls_upri_srv ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_sls_upri_srv ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_sls_upri_srv ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_sls_upri_srv ALTER COLUMN cst_cd SET DEFAULT '*';
ALTER VIEW maw_sls_upri_srv ALTER COLUMN interim_flg SET DEFAULT '0';
ALTER VIEW maw_sls_upri_srv ALTER COLUMN sls_upri_flg SET DEFAULT '0';
ALTER VIEW maw_sls_upri_srv ALTER COLUMN std_sls_upri_flg SET DEFAULT '0';
ALTER VIEW maw_sls_upri_srv ALTER COLUMN std_upri_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION maw_sls_upri_srv$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_sls_upri_srv$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_sls_upri_srv$temp(
				peg_no numeric (9,0) NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				cst_cd varchar (20) DEFAULT '*' NOT NULL,
				dlv_cd varchar (20) NULL,
				dest_cd1 varchar (20) NULL,
				dest_cd2 varchar (20) NULL,
				dest_cd3 varchar (20) NULL,
				unit_cd varchar (5) NOT NULL,
				qty numeric (21,8) NOT NULL,
				cur_cd varchar (3) NOT NULL,
				wg_cd varchar (10) NOT NULL,
				dt timestamp(0)  NOT NULL,
				grp_no varchar (20) NULL,
				sls_upri numeric (21,8) NULL,
				std_sls_upri numeric (21,8) NULL,
				std_upri numeric (21,8) NULL,
				interim_flg char (1) DEFAULT '0' NOT NULL,
				sls_upri_flg char (1) DEFAULT '0' NOT NULL,
				std_sls_upri_flg char (1) DEFAULT '0' NOT NULL,
				std_upri_flg char (1) DEFAULT '0' NOT NULL,
				std_upri_wg_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_sls_upri_srv_ie01 ON maw_sls_upri_srv$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,cst_cd,unit_cd,cur_cd,wg_cd);
			ALTER TABLE maw_sls_upri_srv$temp
			ADD CONSTRAINT maw_sls_upri_srv_pk PRIMARY KEY(peg_no);
			
			ALTER TABLE maw_sls_upri_srv$temp
			ADD CONSTRAINT maw_sls_upri_srv_ck01 CHECK (interim_flg IN ('0', '1'));
			ALTER TABLE maw_sls_upri_srv$temp
			ADD CONSTRAINT maw_sls_upri_srv_ck02 CHECK (sls_upri_flg IN ('0', '1'));
			ALTER TABLE maw_sls_upri_srv$temp
			ADD CONSTRAINT maw_sls_upri_srv_ck03 CHECK (std_sls_upri_flg IN ('0', '1'));
			ALTER TABLE maw_sls_upri_srv$temp
			ADD CONSTRAINT maw_sls_upri_srv_ck04 CHECK (std_upri_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_sls_upri_srv$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_sls_upri_srv$temp(
			peg_no,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			cst_cd,
			dlv_cd,
			dest_cd1,
			dest_cd2,
			dest_cd3,
			unit_cd,
			qty,
			cur_cd,
			wg_cd,
			dt,
			grp_no,
			sls_upri,
			std_sls_upri,
			std_upri,
			interim_flg,
			sls_upri_flg,
			std_sls_upri_flg,
			std_upri_flg,
			std_upri_wg_cd
		)VALUES (
			NEW.peg_no,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.cst_cd,
			NEW.dlv_cd,
			NEW.dest_cd1,
			NEW.dest_cd2,
			NEW.dest_cd3,
			NEW.unit_cd,
			NEW.qty,
			NEW.cur_cd,
			NEW.wg_cd,
			NEW.dt,
			NEW.grp_no,
			NEW.sls_upri,
			NEW.std_sls_upri,
			NEW.std_upri,
			NEW.interim_flg,
			NEW.sls_upri_flg,
			NEW.std_sls_upri_flg,
			NEW.std_upri_flg,
			NEW.std_upri_wg_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_sls_upri_srv$temp
		SET 
			peg_no = NEW.peg_no,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			cst_cd = NEW.cst_cd,
			dlv_cd = NEW.dlv_cd,
			dest_cd1 = NEW.dest_cd1,
			dest_cd2 = NEW.dest_cd2,
			dest_cd3 = NEW.dest_cd3,
			unit_cd = NEW.unit_cd,
			qty = NEW.qty,
			cur_cd = NEW.cur_cd,
			wg_cd = NEW.wg_cd,
			dt = NEW.dt,
			grp_no = NEW.grp_no,
			sls_upri = NEW.sls_upri,
			std_sls_upri = NEW.std_sls_upri,
			std_upri = NEW.std_upri,
			interim_flg = NEW.interim_flg,
			sls_upri_flg = NEW.sls_upri_flg,
			std_sls_upri_flg = NEW.std_sls_upri_flg,
			std_upri_flg = NEW.std_upri_flg,
			std_upri_wg_cd = NEW.std_upri_wg_cd
		WHERE 0=0
		AND peg_no = OLD.peg_no
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND cst_cd = OLD.cst_cd
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (dest_cd1 = OLD.dest_cd1 OR dest_cd1 IS NULL AND OLD.dest_cd1 IS NULL)
		AND (dest_cd2 = OLD.dest_cd2 OR dest_cd2 IS NULL AND OLD.dest_cd2 IS NULL)
		AND (dest_cd3 = OLD.dest_cd3 OR dest_cd3 IS NULL AND OLD.dest_cd3 IS NULL)
		AND unit_cd = OLD.unit_cd
		AND qty = OLD.qty
		AND cur_cd = OLD.cur_cd
		AND wg_cd = OLD.wg_cd
		AND dt = OLD.dt
		AND (grp_no = OLD.grp_no OR grp_no IS NULL AND OLD.grp_no IS NULL)
		AND (sls_upri = OLD.sls_upri OR sls_upri IS NULL AND OLD.sls_upri IS NULL)
		AND (std_sls_upri = OLD.std_sls_upri OR std_sls_upri IS NULL AND OLD.std_sls_upri IS NULL)
		AND (std_upri = OLD.std_upri OR std_upri IS NULL AND OLD.std_upri IS NULL)
		AND interim_flg = OLD.interim_flg
		AND sls_upri_flg = OLD.sls_upri_flg
		AND std_sls_upri_flg = OLD.std_sls_upri_flg
		AND std_upri_flg = OLD.std_upri_flg
		AND (std_upri_wg_cd = OLD.std_upri_wg_cd OR std_upri_wg_cd IS NULL AND OLD.std_upri_wg_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_sls_upri_srv$temp
		WHERE 0=0
		AND peg_no = OLD.peg_no
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND cst_cd = OLD.cst_cd
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (dest_cd1 = OLD.dest_cd1 OR dest_cd1 IS NULL AND OLD.dest_cd1 IS NULL)
		AND (dest_cd2 = OLD.dest_cd2 OR dest_cd2 IS NULL AND OLD.dest_cd2 IS NULL)
		AND (dest_cd3 = OLD.dest_cd3 OR dest_cd3 IS NULL AND OLD.dest_cd3 IS NULL)
		AND unit_cd = OLD.unit_cd
		AND qty = OLD.qty
		AND cur_cd = OLD.cur_cd
		AND wg_cd = OLD.wg_cd
		AND dt = OLD.dt
		AND (grp_no = OLD.grp_no OR grp_no IS NULL AND OLD.grp_no IS NULL)
		AND (sls_upri = OLD.sls_upri OR sls_upri IS NULL AND OLD.sls_upri IS NULL)
		AND (std_sls_upri = OLD.std_sls_upri OR std_sls_upri IS NULL AND OLD.std_sls_upri IS NULL)
		AND (std_upri = OLD.std_upri OR std_upri IS NULL AND OLD.std_upri IS NULL)
		AND interim_flg = OLD.interim_flg
		AND sls_upri_flg = OLD.sls_upri_flg
		AND std_sls_upri_flg = OLD.std_sls_upri_flg
		AND std_upri_flg = OLD.std_upri_flg
		AND (std_upri_wg_cd = OLD.std_upri_wg_cd OR std_upri_wg_cd IS NULL AND OLD.std_upri_wg_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_sls_upri_srv$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_sls_upri_srv
FOR EACH ROW
EXECUTE PROCEDURE maw_sls_upri_srv$func();
;

