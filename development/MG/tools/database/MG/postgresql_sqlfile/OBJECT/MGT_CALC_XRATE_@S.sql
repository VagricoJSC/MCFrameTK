\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_xrate_$s(
	calc_no,
	calc_grp_cd,
	fr_cur_cd,
	to_cur_cd,
	xrate_cd,
	xrate
	)
AS
SELECT
	mgt_calc_xrate_$s_mgt_calc_xrate_all_org.calc_no,
	mgt_calc_xrate_$s_mgt_calc_xrate_all_org.calc_grp_cd,
	mgt_calc_xrate_$s_mgt_calc_xrate_all_org.fr_cur_cd,
	mgt_calc_xrate_$s_mgt_calc_xrate_all_org.to_cur_cd,
	mgt_calc_xrate_$s_mgt_calc_xrate_all_org.xrate_cd,
	mgt_calc_xrate_$s_mgt_calc_xrate_all_org.xrate
FROM
	mgt_calc_xrate_all mgt_calc_xrate_$s_mgt_calc_xrate_all_org
WHERE
	0 = 0
	AND mgt_calc_xrate_$s_mgt_calc_xrate_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_calc_xrate_$s_fct_context WHERE pid = pg_backend_pid())
;

