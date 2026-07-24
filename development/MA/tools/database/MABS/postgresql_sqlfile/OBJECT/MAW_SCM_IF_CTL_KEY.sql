\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_scm_if_ctl_key()
RETURNS TABLE (
	if_proc_typ varchar,
	loc_cd varchar,
	lg_grp_cd varchar,
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	oper_cd varchar,
	wk_cost_cd varchar,
	dlv_cd varchar,
	gr_loc_cd varchar,
	st_dt timestamp(0)
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_scm_if_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_scm_if_ctl_key$temp(
				if_proc_typ varchar (10) NULL,
				loc_cd varchar (20) NULL,
				lg_grp_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				oper_cd varchar (10) NULL,
				wk_cost_cd varchar (10) NULL,
				dlv_cd varchar (20) NULL,
				gr_loc_cd varchar (20) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_scm_if_ctl_key_pk_ie ON maw_scm_if_ctl_key$temp
				USING BTREE (if_proc_typ,loc_cd,lg_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,oper_cd,wk_cost_cd,dlv_cd,gr_loc_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_scm_if_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_scm_if_ctl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_scm_if_ctl_key
AS
SELECT *
FROM maw_scm_if_ctl_key();
ALTER VIEW maw_scm_if_ctl_key ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_scm_if_ctl_key ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_scm_if_ctl_key ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_scm_if_ctl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_scm_if_ctl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_scm_if_ctl_key$temp(
				if_proc_typ varchar (10) NULL,
				loc_cd varchar (20) NULL,
				lg_grp_cd varchar (10) NULL,
				itm_cd varchar (40) NULL,
				itm_sub1 varchar (5) DEFAULT '*' NULL,
				itm_sub2 varchar (5) DEFAULT '*' NULL,
				itm_sub3 varchar (5) DEFAULT '*' NULL,
				oper_cd varchar (10) NULL,
				wk_cost_cd varchar (10) NULL,
				dlv_cd varchar (20) NULL,
				gr_loc_cd varchar (20) NULL,
				st_dt timestamp(0)  NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_scm_if_ctl_key_pk_ie ON maw_scm_if_ctl_key$temp
				USING BTREE (if_proc_typ,loc_cd,lg_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,oper_cd,wk_cost_cd,dlv_cd,gr_loc_cd,st_dt);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_scm_if_ctl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_scm_if_ctl_key$temp(
			if_proc_typ,
			loc_cd,
			lg_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			oper_cd,
			wk_cost_cd,
			dlv_cd,
			gr_loc_cd,
			st_dt
		)VALUES (
			NEW.if_proc_typ,
			NEW.loc_cd,
			NEW.lg_grp_cd,
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.oper_cd,
			NEW.wk_cost_cd,
			NEW.dlv_cd,
			NEW.gr_loc_cd,
			NEW.st_dt
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_scm_if_ctl_key$temp
		SET 
			if_proc_typ = NEW.if_proc_typ,
			loc_cd = NEW.loc_cd,
			lg_grp_cd = NEW.lg_grp_cd,
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			oper_cd = NEW.oper_cd,
			wk_cost_cd = NEW.wk_cost_cd,
			dlv_cd = NEW.dlv_cd,
			gr_loc_cd = NEW.gr_loc_cd,
			st_dt = NEW.st_dt
		WHERE 0=0
		AND (if_proc_typ = OLD.if_proc_typ OR if_proc_typ IS NULL AND OLD.if_proc_typ IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (lg_grp_cd = OLD.lg_grp_cd OR lg_grp_cd IS NULL AND OLD.lg_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (wk_cost_cd = OLD.wk_cost_cd OR wk_cost_cd IS NULL AND OLD.wk_cost_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (gr_loc_cd = OLD.gr_loc_cd OR gr_loc_cd IS NULL AND OLD.gr_loc_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_scm_if_ctl_key$temp
		WHERE 0=0
		AND (if_proc_typ = OLD.if_proc_typ OR if_proc_typ IS NULL AND OLD.if_proc_typ IS NULL)
		AND (loc_cd = OLD.loc_cd OR loc_cd IS NULL AND OLD.loc_cd IS NULL)
		AND (lg_grp_cd = OLD.lg_grp_cd OR lg_grp_cd IS NULL AND OLD.lg_grp_cd IS NULL)
		AND (itm_cd = OLD.itm_cd OR itm_cd IS NULL AND OLD.itm_cd IS NULL)
		AND (itm_sub1 = OLD.itm_sub1 OR itm_sub1 IS NULL AND OLD.itm_sub1 IS NULL)
		AND (itm_sub2 = OLD.itm_sub2 OR itm_sub2 IS NULL AND OLD.itm_sub2 IS NULL)
		AND (itm_sub3 = OLD.itm_sub3 OR itm_sub3 IS NULL AND OLD.itm_sub3 IS NULL)
		AND (oper_cd = OLD.oper_cd OR oper_cd IS NULL AND OLD.oper_cd IS NULL)
		AND (wk_cost_cd = OLD.wk_cost_cd OR wk_cost_cd IS NULL AND OLD.wk_cost_cd IS NULL)
		AND (dlv_cd = OLD.dlv_cd OR dlv_cd IS NULL AND OLD.dlv_cd IS NULL)
		AND (gr_loc_cd = OLD.gr_loc_cd OR gr_loc_cd IS NULL AND OLD.gr_loc_cd IS NULL)
		AND (st_dt = OLD.st_dt OR st_dt IS NULL AND OLD.st_dt IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_scm_if_ctl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_scm_if_ctl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_scm_if_ctl_key$func();
;

