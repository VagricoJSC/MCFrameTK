\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_push_ntc_trans_key()
RETURNS TABLE (
	push_ntc_no varchar,
	column_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_push_ntc_trans_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_push_ntc_trans_key$temp(
				push_ntc_no varchar (15) NULL,
				column_seq numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_push_ntc_trans_key_pk_ie ON maw_push_ntc_trans_key$temp
				USING BTREE (push_ntc_no,column_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_push_ntc_trans_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_push_ntc_trans_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_push_ntc_trans_key
AS
SELECT *
FROM maw_push_ntc_trans_key();

CREATE OR REPLACE FUNCTION maw_push_ntc_trans_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_push_ntc_trans_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_push_ntc_trans_key$temp(
				push_ntc_no varchar (15) NULL,
				column_seq numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_push_ntc_trans_key_pk_ie ON maw_push_ntc_trans_key$temp
				USING BTREE (push_ntc_no,column_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_push_ntc_trans_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_push_ntc_trans_key$temp(
			push_ntc_no,
			column_seq
		)VALUES (
			NEW.push_ntc_no,
			NEW.column_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_push_ntc_trans_key$temp
		SET 
			push_ntc_no = NEW.push_ntc_no,
			column_seq = NEW.column_seq
		WHERE 0=0
		AND (push_ntc_no = OLD.push_ntc_no OR push_ntc_no IS NULL AND OLD.push_ntc_no IS NULL)
		AND (column_seq = OLD.column_seq OR column_seq IS NULL AND OLD.column_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_push_ntc_trans_key$temp
		WHERE 0=0
		AND (push_ntc_no = OLD.push_ntc_no OR push_ntc_no IS NULL AND OLD.push_ntc_no IS NULL)
		AND (column_seq = OLD.column_seq OR column_seq IS NULL AND OLD.column_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_push_ntc_trans_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_push_ntc_trans_key
FOR EACH ROW
EXECUTE PROCEDURE maw_push_ntc_trans_key$func();
;

