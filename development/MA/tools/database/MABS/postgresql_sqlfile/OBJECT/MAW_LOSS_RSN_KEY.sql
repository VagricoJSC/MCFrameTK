\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_loss_rsn_key()
RETURNS TABLE (
	itm_typ varchar,
	itm_typ_d_cd varchar,
	loss_rsn_cd varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_loss_rsn_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_loss_rsn_key$temp(
				itm_typ varchar (1) NULL,
				itm_typ_d_cd varchar (10) NULL,
				loss_rsn_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_loss_rsn_key_pk_ie ON maw_loss_rsn_key$temp
				USING BTREE (itm_typ,itm_typ_d_cd,loss_rsn_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_loss_rsn_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_loss_rsn_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_loss_rsn_key
AS
SELECT *
FROM maw_loss_rsn_key();

CREATE OR REPLACE FUNCTION maw_loss_rsn_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_loss_rsn_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_loss_rsn_key$temp(
				itm_typ varchar (1) NULL,
				itm_typ_d_cd varchar (10) NULL,
				loss_rsn_cd varchar (10) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_loss_rsn_key_pk_ie ON maw_loss_rsn_key$temp
				USING BTREE (itm_typ,itm_typ_d_cd,loss_rsn_cd);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_loss_rsn_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_loss_rsn_key$temp(
			itm_typ,
			itm_typ_d_cd,
			loss_rsn_cd
		)VALUES (
			NEW.itm_typ,
			NEW.itm_typ_d_cd,
			NEW.loss_rsn_cd
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_loss_rsn_key$temp
		SET 
			itm_typ = NEW.itm_typ,
			itm_typ_d_cd = NEW.itm_typ_d_cd,
			loss_rsn_cd = NEW.loss_rsn_cd
		WHERE 0=0
		AND (itm_typ = OLD.itm_typ OR itm_typ IS NULL AND OLD.itm_typ IS NULL)
		AND (itm_typ_d_cd = OLD.itm_typ_d_cd OR itm_typ_d_cd IS NULL AND OLD.itm_typ_d_cd IS NULL)
		AND (loss_rsn_cd = OLD.loss_rsn_cd OR loss_rsn_cd IS NULL AND OLD.loss_rsn_cd IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_loss_rsn_key$temp
		WHERE 0=0
		AND (itm_typ = OLD.itm_typ OR itm_typ IS NULL AND OLD.itm_typ IS NULL)
		AND (itm_typ_d_cd = OLD.itm_typ_d_cd OR itm_typ_d_cd IS NULL AND OLD.itm_typ_d_cd IS NULL)
		AND (loss_rsn_cd = OLD.loss_rsn_cd OR loss_rsn_cd IS NULL AND OLD.loss_rsn_cd IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_loss_rsn_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_loss_rsn_key
FOR EACH ROW
EXECUTE PROCEDURE maw_loss_rsn_key$func();
;

