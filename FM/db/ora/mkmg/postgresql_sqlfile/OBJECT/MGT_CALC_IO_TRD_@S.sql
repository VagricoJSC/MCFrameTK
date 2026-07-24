\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_io_trd_$s(
	calc_no,
	calc_grp_cd,
	act_io_id,
	act_io_id_sub,
	ym,
	trd_grp,
	wg_cd,
	other_wg_cd,
	cost_io_typ
	)
AS
SELECT
	mgt_calc_io_trd_$s_mgt_calc_io_trd_all_org.calc_no,
	mgt_calc_io_trd_$s_mgt_calc_io_trd_all_org.calc_grp_cd,
	mgt_calc_io_trd_$s_mgt_calc_io_trd_all_org.act_io_id,
	mgt_calc_io_trd_$s_mgt_calc_io_trd_all_org.act_io_id_sub,
	mgt_calc_io_trd_$s_mgt_calc_io_trd_all_org.ym,
	mgt_calc_io_trd_$s_mgt_calc_io_trd_all_org.trd_grp,
	mgt_calc_io_trd_$s_mgt_calc_io_trd_all_org.wg_cd,
	mgt_calc_io_trd_$s_mgt_calc_io_trd_all_org.other_wg_cd,
	mgt_calc_io_trd_$s_mgt_calc_io_trd_all_org.cost_io_typ
FROM
	mgt_calc_io_trd_all mgt_calc_io_trd_$s_mgt_calc_io_trd_all_org
WHERE
	0 = 0
	AND mgt_calc_io_trd_$s_mgt_calc_io_trd_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_calc_io_trd_$s_fct_context WHERE pid = pg_backend_pid())
;

