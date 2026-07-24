\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_proc_upri_srv()
RETURNS TABLE (
	peg_no numeric,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	sppl_cd varchar,
	maker_cd varchar,
	unit_cd varchar,
	qty numeric,
	cur_cd varchar,
	loc_cd varchar,
	dlv_cd varchar,
	proc_upri_typ varchar,
	wg_cd varchar,
	dt timestamp(0),
	grp_no varchar,
	upri numeric,
	interim_flg char
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_proc_upri_srv$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_proc_upri_srv$temp(
				peg_no numeric (9,0) NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				sppl_cd varchar (20) NOT NULL,
				maker_cd varchar (20) NULL,
				unit_cd varchar (5) NOT NULL,
				qty numeric (21,8) NOT NULL,
				cur_cd varchar (3) NOT NULL,
				loc_cd varchar (20) NULL,
				dlv_cd varchar (20) NULL,
				proc_upri_typ varchar (1) NULL,
				wg_cd varchar (10) NOT NULL,
				dt timestamp(0)  NOT NULL,
				grp_no varchar (20) NULL,
				upri numeric (21,8) NULL,
				interim_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_proc_upri_srv_ie01 ON maw_proc_upri_srv$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,sppl_cd,maker_cd,unit_cd,cur_cd,wg_cd);
			ALTER TABLE maw_proc_upri_srv$temp
			ADD CONSTRAINT maw_proc_upri_srv_pk PRIMARY KEY(peg_no);
			
			ALTER TABLE maw_proc_upri_srv$temp
				ADD CONSTRAINT maw_proc_upri_srv_ck01 CHECK (interim_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_proc_upri_srv$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_proc_upri_srv$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_proc_upri_srv
AS
SELECT *
FROM maw_proc_upri_srv();
ALTER VIEW maw_proc_upri_srv ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_proc_upri_srv ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_proc_upri_srv ALTER COLUMN itm_sub3 SET DEFAULT '*';
ALTER VIEW maw_proc_upri_srv ALTER COLUMN interim_flg SET DEFAULT '0';

CREATE OR REPLACE FUNCTION maw_proc_upri_srv$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_proc_upri_srv$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_proc_upri_srv$temp(
				peg_no numeric (9,0) NOT NULL,
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				sppl_cd varchar (20) NOT NULL,
				maker_cd varchar (20) NULL,
				unit_cd varchar (5) NOT NULL,
				qty numeric (21,8) NOT NULL,
				cur_cd varchar (3) NOT NULL,
				loc_cd varchar (20) NULL,
				dlv_cd varchar (20) NULL,
				proc_upri_typ varchar (1) NULL,
				wg_cd varchar (10) NOT NULL,
				dt timestamp(0)  NOT NULL,
				grp_no varchar (20) NULL,
				upri numeric (21,8) NULL,
				interim_flg char (1) DEFAULT '0' NOT NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_proc_upri_srv_ie01 ON maw_proc_upri_srv$temp
				USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,sppl_cd,maker_cd,unit_cd,cur_cd,wg_cd);
			ALTER TABLE maw_proc_upri_srv$temp
			ADD CONSTRAINT maw_proc_upri_srv_pk PRIMARY KEY(peg_no);
			
			ALTER TABLE maw_proc_upri_srv$temp
			ADD CONSTRAINT maw_proc_upri_srv_ck01 CHECK (interim_flg IN ('0', '1'));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_proc_upri_srv$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_proc_upri_srv$temp(
			peg_no,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sppl_cd,
			maker_cd,
			unit_cd,
			qty,
			cur_cd,
			loc_cd,
			dlv_cd,
			proc_upri_typ,
			wg_cd,
			dt,
			grp_no,
			upri,
			interim_flg
		)VALUES (
			NEW.peg_no,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.sppl_cd,
			NEW.maker_cd,
			NEW.unit_cd,
			NEW.qty,
			NEW.cur_cd,
			NEW.loc_cd,
			NEW.dlv_cd,
			NEW.proc_upri_typ,
			NEW.wg_cd,
			NEW.dt,
			NEW.grp_no,
			NEW.upri,
			NEW.interim_flg
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_proc_upri_srv$temp
		SET 
			peg_no = NEW.peg_no,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			sppl_cd = NEW.sppl_cd,
			maker_cd = NEW.maker_cd,
			unit_cd = NEW.unit_cd,
			qty = NEW.qty,
			cur_cd = NEW.cur_cd,
			loc_cd = NEW.loc_cd,
			dlv_cd = NEW.dlv_cd,
			proc_upri_typ = NEW.proc_upri_typ,
			wg_cd = NEW.wg_cd,
			dt = NEW.dt,
			grp_no = NEW.grp_no,
			upri = NEW.upri,
			interim_flg = NEW.interim_flg
		WHERE 0=0
		AND peg_no = OLD.peg_no
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND sppl_cd = OLD.sppl_cd
		AND (maker_cd = OLD.maker_cd OR maker_cd IS NULL AND OLD.maker_cd IS NULL)
		AND unit_cd = OLD.unit_cd
		AND qty = OLD.qty
		AND cur_cd = OLD.cur_cd
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (proc_upri_typ = OLD.proc_upri_typ OR proc_upri_typ IS NULL AND OLD.proc_upri_typ IS NULL)
		AND wg_cd = OLD.wg_cd
		AND dt = OLD.dt
		AND (grp_no = OLD.grp_no OR grp_no IS NULL AND OLD.grp_no IS NULL)
		AND (upri = OLD.upri OR upri IS NULL AND OLD.upri IS NULL)
		AND interim_flg = OLD.interim_flg;
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_proc_upri_srv$temp
		WHERE 0=0
		AND peg_no = OLD.peg_no
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND sppl_cd = OLD.sppl_cd
		AND (maker_cd = OLD.maker_cd OR maker_cd IS NULL AND OLD.maker_cd IS NULL)
		AND unit_cd = OLD.unit_cd
		AND qty = OLD.qty
		AND cur_cd = OLD.cur_cd
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (proc_upri_typ = OLD.proc_upri_typ OR proc_upri_typ IS NULL AND OLD.proc_upri_typ IS NULL)
		AND wg_cd = OLD.wg_cd
		AND dt = OLD.dt
		AND (grp_no = OLD.grp_no OR grp_no IS NULL AND OLD.grp_no IS NULL)
		AND (upri = OLD.upri OR upri IS NULL AND OLD.upri IS NULL)
		AND interim_flg = OLD.interim_flg;
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_proc_upri_srv$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_proc_upri_srv
FOR EACH ROW
EXECUTE PROCEDURE maw_proc_upri_srv$func();
;

