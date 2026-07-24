\encoding UTF-8

CREATE OR REPLACE FUNCTION msw_io_schd_del()
RETURNS TABLE (
	io_schd_typ varchar,
	io_schd_sts_typ varchar,
	io_schd_no varchar,
	io_schd_seq numeric,
	io_schd_sub_typ1 varchar,
	io_schd_sub_no1 varchar,
	io_schd_sub_seq1 numeric,
	io_schd_sub_typ2 varchar,
	io_schd_sub_no2 varchar,
	io_schd_sub_seq2 numeric,
	io_schd_sub_typ3 varchar,
	io_schd_sub_no3 varchar,
	io_schd_sub_seq3 numeric,
	io_schd_sub_typ4 varchar,
	io_schd_sub_no4 varchar,
	io_schd_sub_seq4 numeric,
	io_schd_pr_no varchar
) AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_io_schd_del$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_io_schd_del$temp(
				io_schd_typ varchar (5) NULL,
				io_schd_sts_typ varchar (2) NULL,
				io_schd_no varchar (15) NULL,
				io_schd_seq numeric (3,0) NULL,
				io_schd_sub_typ1 varchar (2) NULL,
				io_schd_sub_no1 varchar (15) NULL,
				io_schd_sub_seq1 numeric (3,0) NULL,
				io_schd_sub_typ2 varchar (2) NULL,
				io_schd_sub_no2 varchar (15) NULL,
				io_schd_sub_seq2 numeric (3,0) NULL,
				io_schd_sub_typ3 varchar (2) NULL,
				io_schd_sub_no3 varchar (15) NULL,
				io_schd_sub_seq3 numeric (3,0) NULL,
				io_schd_sub_typ4 varchar (2) NULL,
				io_schd_sub_no4 varchar (15) NULL,
				io_schd_sub_seq4 numeric (3,0) NULL,
				io_schd_pr_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_io_schd_del$func', 'is_init', '1'::varchar);
	END IF;
	RETURN QUERY SELECT * FROM msw_io_schd_del$temp;
END $BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE VIEW msw_io_schd_del
AS
SELECT *
FROM msw_io_schd_del();

CREATE OR REPLACE FUNCTION msw_io_schd_del$func()
RETURNS TRIGGER AS $BODY$
BEGIN
	IF COALESCE(fcpa_postgres_util$get_var('msw_io_schd_del$func', 'is_init'), '0') = '0' THEN
		BEGIN
			CREATE TEMPORARY TABLE msw_io_schd_del$temp(
				io_schd_typ varchar (5) NULL,
				io_schd_sts_typ varchar (2) NULL,
				io_schd_no varchar (15) NULL,
				io_schd_seq numeric (3,0) NULL,
				io_schd_sub_typ1 varchar (2) NULL,
				io_schd_sub_no1 varchar (15) NULL,
				io_schd_sub_seq1 numeric (3,0) NULL,
				io_schd_sub_typ2 varchar (2) NULL,
				io_schd_sub_no2 varchar (15) NULL,
				io_schd_sub_seq2 numeric (3,0) NULL,
				io_schd_sub_typ3 varchar (2) NULL,
				io_schd_sub_no3 varchar (15) NULL,
				io_schd_sub_seq3 numeric (3,0) NULL,
				io_schd_sub_typ4 varchar (2) NULL,
				io_schd_sub_no4 varchar (15) NULL,
				io_schd_sub_seq4 numeric (3,0) NULL,
				io_schd_pr_no varchar (15) NULL
			) WITH (
				OIDS=FALSE
			)
			ON COMMIT DELETE ROWS;
		EXCEPTION
			WHEN OTHERS THEN
		END;
		PERFORM fcpa_postgres_util$set_var('msw_io_schd_del$func', 'is_init', '1'::varchar);
	END IF;
	IF TG_OP = 'INSERT' THEN
		INSERT INTO msw_io_schd_del$temp(
			io_schd_typ,
			io_schd_sts_typ,
			io_schd_no,
			io_schd_seq,
			io_schd_sub_typ1,
			io_schd_sub_no1,
			io_schd_sub_seq1,
			io_schd_sub_typ2,
			io_schd_sub_no2,
			io_schd_sub_seq2,
			io_schd_sub_typ3,
			io_schd_sub_no3,
			io_schd_sub_seq3,
			io_schd_sub_typ4,
			io_schd_sub_no4,
			io_schd_sub_seq4,
			io_schd_pr_no
		)VALUES (
			NEW.io_schd_typ,
			NEW.io_schd_sts_typ,
			NEW.io_schd_no,
			NEW.io_schd_seq,
			NEW.io_schd_sub_typ1,
			NEW.io_schd_sub_no1,
			NEW.io_schd_sub_seq1,
			NEW.io_schd_sub_typ2,
			NEW.io_schd_sub_no2,
			NEW.io_schd_sub_seq2,
			NEW.io_schd_sub_typ3,
			NEW.io_schd_sub_no3,
			NEW.io_schd_sub_seq3,
			NEW.io_schd_sub_typ4,
			NEW.io_schd_sub_no4,
			NEW.io_schd_sub_seq4,
			NEW.io_schd_pr_no
		);
		RETURN NEW;
	ELSEIF TG_OP = 'UPDATE' THEN
		UPDATE msw_io_schd_del$temp
		SET 
			io_schd_typ = NEW.io_schd_typ,
			io_schd_sts_typ = NEW.io_schd_sts_typ,
			io_schd_no = NEW.io_schd_no,
			io_schd_seq = NEW.io_schd_seq,
			io_schd_sub_typ1 = NEW.io_schd_sub_typ1,
			io_schd_sub_no1 = NEW.io_schd_sub_no1,
			io_schd_sub_seq1 = NEW.io_schd_sub_seq1,
			io_schd_sub_typ2 = NEW.io_schd_sub_typ2,
			io_schd_sub_no2 = NEW.io_schd_sub_no2,
			io_schd_sub_seq2 = NEW.io_schd_sub_seq2,
			io_schd_sub_typ3 = NEW.io_schd_sub_typ3,
			io_schd_sub_no3 = NEW.io_schd_sub_no3,
			io_schd_sub_seq3 = NEW.io_schd_sub_seq3,
			io_schd_sub_typ4 = NEW.io_schd_sub_typ4,
			io_schd_sub_no4 = NEW.io_schd_sub_no4,
			io_schd_sub_seq4 = NEW.io_schd_sub_seq4,
			io_schd_pr_no = NEW.io_schd_pr_no
		WHERE 0=0
		AND (io_schd_typ = OLD.io_schd_typ OR io_schd_typ IS NULL AND OLD.io_schd_typ IS NULL)
		AND (io_schd_sts_typ = OLD.io_schd_sts_typ OR io_schd_sts_typ IS NULL AND OLD.io_schd_sts_typ IS NULL)
		AND (io_schd_no = OLD.io_schd_no OR io_schd_no IS NULL AND OLD.io_schd_no IS NULL)
		AND (io_schd_seq = OLD.io_schd_seq OR io_schd_seq IS NULL AND OLD.io_schd_seq IS NULL)
		AND (io_schd_sub_typ1 = OLD.io_schd_sub_typ1 OR io_schd_sub_typ1 IS NULL AND OLD.io_schd_sub_typ1 IS NULL)
		AND (io_schd_sub_no1 = OLD.io_schd_sub_no1 OR io_schd_sub_no1 IS NULL AND OLD.io_schd_sub_no1 IS NULL)
		AND (io_schd_sub_seq1 = OLD.io_schd_sub_seq1 OR io_schd_sub_seq1 IS NULL AND OLD.io_schd_sub_seq1 IS NULL)
		AND (io_schd_sub_typ2 = OLD.io_schd_sub_typ2 OR io_schd_sub_typ2 IS NULL AND OLD.io_schd_sub_typ2 IS NULL)
		AND (io_schd_sub_no2 = OLD.io_schd_sub_no2 OR io_schd_sub_no2 IS NULL AND OLD.io_schd_sub_no2 IS NULL)
		AND (io_schd_sub_seq2 = OLD.io_schd_sub_seq2 OR io_schd_sub_seq2 IS NULL AND OLD.io_schd_sub_seq2 IS NULL)
		AND (io_schd_sub_typ3 = OLD.io_schd_sub_typ3 OR io_schd_sub_typ3 IS NULL AND OLD.io_schd_sub_typ3 IS NULL)
		AND (io_schd_sub_no3 = OLD.io_schd_sub_no3 OR io_schd_sub_no3 IS NULL AND OLD.io_schd_sub_no3 IS NULL)
		AND (io_schd_sub_seq3 = OLD.io_schd_sub_seq3 OR io_schd_sub_seq3 IS NULL AND OLD.io_schd_sub_seq3 IS NULL)
		AND (io_schd_sub_typ4 = OLD.io_schd_sub_typ4 OR io_schd_sub_typ4 IS NULL AND OLD.io_schd_sub_typ4 IS NULL)
		AND (io_schd_sub_no4 = OLD.io_schd_sub_no4 OR io_schd_sub_no4 IS NULL AND OLD.io_schd_sub_no4 IS NULL)
		AND (io_schd_sub_seq4 = OLD.io_schd_sub_seq4 OR io_schd_sub_seq4 IS NULL AND OLD.io_schd_sub_seq4 IS NULL)
		AND (io_schd_pr_no = OLD.io_schd_pr_no OR io_schd_pr_no IS NULL AND OLD.io_schd_pr_no IS NULL);
		RETURN NEW;
	ELSEIF TG_OP = 'DELETE' THEN
		DELETE FROM msw_io_schd_del$temp
		WHERE 0=0
		AND (io_schd_typ = OLD.io_schd_typ OR io_schd_typ IS NULL AND OLD.io_schd_typ IS NULL)
		AND (io_schd_sts_typ = OLD.io_schd_sts_typ OR io_schd_sts_typ IS NULL AND OLD.io_schd_sts_typ IS NULL)
		AND (io_schd_no = OLD.io_schd_no OR io_schd_no IS NULL AND OLD.io_schd_no IS NULL)
		AND (io_schd_seq = OLD.io_schd_seq OR io_schd_seq IS NULL AND OLD.io_schd_seq IS NULL)
		AND (io_schd_sub_typ1 = OLD.io_schd_sub_typ1 OR io_schd_sub_typ1 IS NULL AND OLD.io_schd_sub_typ1 IS NULL)
		AND (io_schd_sub_no1 = OLD.io_schd_sub_no1 OR io_schd_sub_no1 IS NULL AND OLD.io_schd_sub_no1 IS NULL)
		AND (io_schd_sub_seq1 = OLD.io_schd_sub_seq1 OR io_schd_sub_seq1 IS NULL AND OLD.io_schd_sub_seq1 IS NULL)
		AND (io_schd_sub_typ2 = OLD.io_schd_sub_typ2 OR io_schd_sub_typ2 IS NULL AND OLD.io_schd_sub_typ2 IS NULL)
		AND (io_schd_sub_no2 = OLD.io_schd_sub_no2 OR io_schd_sub_no2 IS NULL AND OLD.io_schd_sub_no2 IS NULL)
		AND (io_schd_sub_seq2 = OLD.io_schd_sub_seq2 OR io_schd_sub_seq2 IS NULL AND OLD.io_schd_sub_seq2 IS NULL)
		AND (io_schd_sub_typ3 = OLD.io_schd_sub_typ3 OR io_schd_sub_typ3 IS NULL AND OLD.io_schd_sub_typ3 IS NULL)
		AND (io_schd_sub_no3 = OLD.io_schd_sub_no3 OR io_schd_sub_no3 IS NULL AND OLD.io_schd_sub_no3 IS NULL)
		AND (io_schd_sub_seq3 = OLD.io_schd_sub_seq3 OR io_schd_sub_seq3 IS NULL AND OLD.io_schd_sub_seq3 IS NULL)
		AND (io_schd_sub_typ4 = OLD.io_schd_sub_typ4 OR io_schd_sub_typ4 IS NULL AND OLD.io_schd_sub_typ4 IS NULL)
		AND (io_schd_sub_no4 = OLD.io_schd_sub_no4 OR io_schd_sub_no4 IS NULL AND OLD.io_schd_sub_no4 IS NULL)
		AND (io_schd_sub_seq4 = OLD.io_schd_sub_seq4 OR io_schd_sub_seq4 IS NULL AND OLD.io_schd_sub_seq4 IS NULL)
		AND (io_schd_pr_no = OLD.io_schd_pr_no OR io_schd_pr_no IS NULL AND OLD.io_schd_pr_no IS NULL);
		RETURN OLD;
	END IF;
END $BODY$ LANGUAGE plpgsql;

CREATE TRIGGER msw_io_schd_del$func
INSTEAD OF INSERT OR DELETE OR UPDATE ON msw_io_schd_del
FOR EACH ROW
EXECUTE PROCEDURE msw_io_schd_del$func();
;

