\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_cur_parm_$u(
	calc_no,
	calc_grp_cd,
	cur_cd,
	amt_rnd_typ,
	amt_dec_place,
	ave_rnd_typ,
	ave_dec_place
	)
AS
SELECT
	mgt_calc_cur_parm_$u_mgt_calc_cur_parm_all_org.calc_no,
	mgt_calc_cur_parm_$u_mgt_calc_cur_parm_all_org.calc_grp_cd,
	mgt_calc_cur_parm_$u_mgt_calc_cur_parm_all_org.cur_cd,
	mgt_calc_cur_parm_$u_mgt_calc_cur_parm_all_org.amt_rnd_typ,
	mgt_calc_cur_parm_$u_mgt_calc_cur_parm_all_org.amt_dec_place,
	mgt_calc_cur_parm_$u_mgt_calc_cur_parm_all_org.ave_rnd_typ,
	mgt_calc_cur_parm_$u_mgt_calc_cur_parm_all_org.ave_dec_place
FROM
	mgt_calc_cur_parm_all mgt_calc_cur_parm_$u_mgt_calc_cur_parm_all_org
WHERE
	0 = 0
	AND mgt_calc_cur_parm_$u_mgt_calc_cur_parm_all_org.co_cd = fcpa_context$f_get_co_cd()
;

