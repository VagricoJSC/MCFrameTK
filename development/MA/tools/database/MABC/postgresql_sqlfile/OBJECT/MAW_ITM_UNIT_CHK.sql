\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_itm_unit_chk()
RETURNS TABLE (
	itm_cd varchar,
	itm_sub1 varchar,
	itm_sub2 varchar,
	itm_sub3 varchar,
	ship_unit_cd varchar,
	mfg_unit_cd varchar,
	purc_unit_cd varchar,
	pckg_unit_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_unit_chk$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_unit_chk$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				ship_unit_cd varchar (5) NULL,
				mfg_unit_cd varchar (5) NULL,
				purc_unit_cd varchar (5) NULL,
				pckg_unit_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE maw_itm_unit_chk$temp
			ADD CONSTRAINT maw_itm_unit_chk_pk UNIQUE(itm_cd,itm_sub1,itm_sub2,itm_sub3,ship_unit_cd,mfg_unit_cd,purc_unit_cd,pckg_unit_cd);
			CREATE UNIQUE INDEX MAW_ITM_UNIT_CHK_pk_ie ON maw_itm_unit_chk$temp (itm_cd,itm_sub1,itm_sub2,itm_sub3,COALESCE(ship_unit_cd,''),COALESCE(mfg_unit_cd,''),COALESCE(purc_unit_cd,''),COALESCE(pckg_unit_cd,''));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_unit_chk$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_itm_unit_chk$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_itm_unit_chk
AS
SELECT *
FROM maw_itm_unit_chk();
ALTER VIEW maw_itm_unit_chk ALTER COLUMN itm_sub1 SET DEFAULT '*';
ALTER VIEW maw_itm_unit_chk ALTER COLUMN itm_sub2 SET DEFAULT '*';
ALTER VIEW maw_itm_unit_chk ALTER COLUMN itm_sub3 SET DEFAULT '*';

CREATE OR REPLACE FUNCTION maw_itm_unit_chk$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_itm_unit_chk$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_itm_unit_chk$temp(
				itm_cd varchar (40) NOT NULL,
				itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
				itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
				ship_unit_cd varchar (5) NULL,
				mfg_unit_cd varchar (5) NULL,
				purc_unit_cd varchar (5) NULL,
				pckg_unit_cd varchar (5) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			ALTER TABLE maw_itm_unit_chk$temp
			ADD CONSTRAINT maw_itm_unit_chk_pk UNIQUE(itm_cd,itm_sub1,itm_sub2,itm_sub3,ship_unit_cd,mfg_unit_cd,purc_unit_cd,pckg_unit_cd);
			CREATE UNIQUE INDEX MAW_ITM_UNIT_CHK_pk_ie ON maw_itm_unit_chk$temp (itm_cd,itm_sub1,itm_sub2,itm_sub3,COALESCE(ship_unit_cd,''),COALESCE(mfg_unit_cd,''),COALESCE(purc_unit_cd,''),COALESCE(pckg_unit_cd,''));
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_itm_unit_chk$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_itm_unit_chk$temp(
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			ship_unit_cd,
			mfg_unit_cd,
			purc_unit_cd,
			pckg_unit_cd
		)VALUES (
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.ship_unit_cd,
			NEW.mfg_unit_cd,
			NEW.purc_unit_cd,
			NEW.pckg_unit_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_itm_unit_chk$temp
		SET 
			itm_cd = NEW.itm_cd,
			itm_sub1 = NEW.itm_sub1,
			itm_sub2 = NEW.itm_sub2,
			itm_sub3 = NEW.itm_sub3,
			ship_unit_cd = NEW.ship_unit_cd,
			mfg_unit_cd = NEW.mfg_unit_cd,
			purc_unit_cd = NEW.purc_unit_cd,
			pckg_unit_cd = NEW.pckg_unit_cd
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (ship_unit_cd = OLD.ship_unit_cd OR ship_unit_cd IS NULL AND OLD.ship_unit_cd IS NULL)
		AND (mfg_unit_cd = OLD.mfg_unit_cd OR mfg_unit_cd IS NULL AND OLD.mfg_unit_cd IS NULL)
		AND (purc_unit_cd = OLD.purc_unit_cd OR purc_unit_cd IS NULL AND OLD.purc_unit_cd IS NULL)
		AND (pckg_unit_cd = OLD.pckg_unit_cd OR pckg_unit_cd IS NULL AND OLD.pckg_unit_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_itm_unit_chk$temp
		WHERE 0=0
		AND itm_cd = OLD.itm_cd
		AND itm_sub1 = OLD.itm_sub1
		AND itm_sub2 = OLD.itm_sub2
		AND itm_sub3 = OLD.itm_sub3
		AND (ship_unit_cd = OLD.ship_unit_cd OR ship_unit_cd IS NULL AND OLD.ship_unit_cd IS NULL)
		AND (mfg_unit_cd = OLD.mfg_unit_cd OR mfg_unit_cd IS NULL AND OLD.mfg_unit_cd IS NULL)
		AND (purc_unit_cd = OLD.purc_unit_cd OR purc_unit_cd IS NULL AND OLD.purc_unit_cd IS NULL)
		AND (pckg_unit_cd = OLD.pckg_unit_cd OR pckg_unit_cd IS NULL AND OLD.pckg_unit_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_itm_unit_chk$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_itm_unit_chk
FOR EACH ROW
EXECUTE PROCEDURE maw_itm_unit_chk$func();
;

