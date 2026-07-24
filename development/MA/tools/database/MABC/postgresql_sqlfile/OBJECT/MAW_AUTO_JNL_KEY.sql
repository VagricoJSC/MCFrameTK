\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_auto_jnl_key()
RETURNS TABLE (
	ac_slip_typ varchar,
	auto_jnl_key_cd varchar,
	auto_jnl_grp varchar,
	jnl_ptn_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_auto_jnl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_auto_jnl_key$temp(
				ac_slip_typ varchar (5) NULL,
				auto_jnl_key_cd varchar (5) NULL,
				auto_jnl_grp varchar (5) NULL,
				jnl_ptn_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_auto_jnl_key_pk_ie ON maw_auto_jnl_key$temp
				USING BTREE (ac_slip_typ,auto_jnl_key_cd,auto_jnl_grp,jnl_ptn_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_auto_jnl_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_auto_jnl_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_auto_jnl_key
AS
SELECT *
FROM maw_auto_jnl_key();

CREATE OR REPLACE FUNCTION maw_auto_jnl_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_auto_jnl_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_auto_jnl_key$temp(
				ac_slip_typ varchar (5) NULL,
				auto_jnl_key_cd varchar (5) NULL,
				auto_jnl_grp varchar (5) NULL,
				jnl_ptn_cd varchar (20) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_auto_jnl_key_pk_ie ON maw_auto_jnl_key$temp
				USING BTREE (ac_slip_typ,auto_jnl_key_cd,auto_jnl_grp,jnl_ptn_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_auto_jnl_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_auto_jnl_key$temp(
			ac_slip_typ,
			auto_jnl_key_cd,
			auto_jnl_grp,
			jnl_ptn_cd
		)VALUES (
			NEW.ac_slip_typ,
			NEW.auto_jnl_key_cd,
			NEW.auto_jnl_grp,
			NEW.jnl_ptn_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_auto_jnl_key$temp
		SET 
			ac_slip_typ = NEW.ac_slip_typ,
			auto_jnl_key_cd = NEW.auto_jnl_key_cd,
			auto_jnl_grp = NEW.auto_jnl_grp,
			jnl_ptn_cd = NEW.jnl_ptn_cd
		WHERE 0=0
		AND (ac_slip_typ = OLD.ac_slip_typ OR ac_slip_typ IS NULL AND OLD.ac_slip_typ IS NULL)
		AND (auto_jnl_key_cd = OLD.auto_jnl_key_cd OR auto_jnl_key_cd IS NULL AND OLD.auto_jnl_key_cd IS NULL)
		AND (auto_jnl_grp = OLD.auto_jnl_grp OR auto_jnl_grp IS NULL AND OLD.auto_jnl_grp IS NULL)
		AND (jnl_ptn_cd = OLD.jnl_ptn_cd OR jnl_ptn_cd IS NULL AND OLD.jnl_ptn_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_auto_jnl_key$temp
		WHERE 0=0
		AND (ac_slip_typ = OLD.ac_slip_typ OR ac_slip_typ IS NULL AND OLD.ac_slip_typ IS NULL)
		AND (auto_jnl_key_cd = OLD.auto_jnl_key_cd OR auto_jnl_key_cd IS NULL AND OLD.auto_jnl_key_cd IS NULL)
		AND (auto_jnl_grp = OLD.auto_jnl_grp OR auto_jnl_grp IS NULL AND OLD.auto_jnl_grp IS NULL)
		AND (jnl_ptn_cd = OLD.jnl_ptn_cd OR jnl_ptn_cd IS NULL AND OLD.jnl_ptn_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_auto_jnl_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_auto_jnl_key
FOR EACH ROW
EXECUTE PROCEDURE maw_auto_jnl_key$func();
;

