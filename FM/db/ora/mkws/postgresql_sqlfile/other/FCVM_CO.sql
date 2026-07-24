\encoding UTF-8

CREATE OR REPLACE VIEW fcvm_co(
co_cd,
co_nm
)
AS
SELECT
	m1.co_cd,
	CASE
		WHEN m2.lcl_cd IS NOT NULL THEN m2.co_nm
		ELSE m1.co_nm
	END
FROM fcm_co_all m1
	LEFT OUTER JOIN fcm_co_lcl_all m2
		ON (m1.co_cd = m2.co_cd AND fcpa_context$f_get_locale() = m2.lcl_cd)
WHERE 0 = 0
;;

