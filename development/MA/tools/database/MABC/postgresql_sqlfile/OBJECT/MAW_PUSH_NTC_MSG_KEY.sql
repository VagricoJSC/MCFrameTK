\encoding UTF-8

CREATE OR REPLACE FUNCTION maw_push_ntc_msg_key()
RETURNS TABLE (
	push_ntc_no varchar,
	bind_seq numeric
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_push_ntc_msg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_push_ntc_msg_key$temp(
				push_ntc_no varchar (15) NULL,
				bind_seq numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_push_ntc_msg_key_pk_ie ON maw_push_ntc_msg_key$temp
				USING BTREE (push_ntc_no,bind_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_push_ntc_msg_key$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM maw_push_ntc_msg_key$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW maw_push_ntc_msg_key
AS
SELECT *
FROM maw_push_ntc_msg_key();

CREATE OR REPLACE FUNCTION maw_push_ntc_msg_key$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('maw_push_ntc_msg_key$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE maw_push_ntc_msg_key$temp(
				push_ntc_no varchar (15) NULL,
				bind_seq numeric (9,0) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
			CREATE INDEX maw_push_ntc_msg_key_pk_ie ON maw_push_ntc_msg_key$temp
				USING BTREE (push_ntc_no,bind_seq);
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('maw_push_ntc_msg_key$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO maw_push_ntc_msg_key$temp(
			push_ntc_no,
			bind_seq
		)VALUES (
			NEW.push_ntc_no,
			NEW.bind_seq
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE maw_push_ntc_msg_key$temp
		SET 
			push_ntc_no = NEW.push_ntc_no,
			bind_seq = NEW.bind_seq
		WHERE 0=0
		AND (push_ntc_no = OLD.push_ntc_no OR push_ntc_no IS NULL AND OLD.push_ntc_no IS NULL)
		AND (bind_seq = OLD.bind_seq OR bind_seq IS NULL AND OLD.bind_seq IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM maw_push_ntc_msg_key$temp
		WHERE 0=0
		AND (push_ntc_no = OLD.push_ntc_no OR push_ntc_no IS NULL AND OLD.push_ntc_no IS NULL)
		AND (bind_seq = OLD.bind_seq OR bind_seq IS NULL AND OLD.bind_seq IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER maw_push_ntc_msg_key$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON maw_push_ntc_msg_key
FOR EACH ROW
EXECUTE PROCEDURE maw_push_ntc_msg_key$func();
;

