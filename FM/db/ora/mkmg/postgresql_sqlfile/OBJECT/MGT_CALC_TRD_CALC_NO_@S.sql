\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_trd_calc_no_$s(
	calc_no,
	calc_grp_cd,
	ym,
	trd_calc_no,
	trd_calc_grp_cd
	)
AS
SELECT
	mgt_calc_trd_calc_no_$s_mgt_calc_trd_calc_no_all_org.calc_no,
	mgt_calc_trd_calc_no_$s_mgt_calc_trd_calc_no_all_org.calc_grp_cd,
	mgt_calc_trd_calc_no_$s_mgt_calc_trd_calc_no_all_org.ym,
	mgt_calc_trd_calc_no_$s_mgt_calc_trd_calc_no_all_org.trd_calc_no,
	mgt_calc_trd_calc_no_$s_mgt_calc_trd_calc_no_all_org.trd_calc_grp_cd
FROM
	mgt_calc_trd_calc_no_all mgt_calc_trd_calc_no_$s_mgt_calc_trd_calc_no_all_org
WHERE
	0 = 0
	AND mgt_calc_trd_calc_no_$s_mgt_calc_trd_calc_no_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_calc_trd_calc_no_$s_fct_context WHERE pid = pg_backend_pid())
;

