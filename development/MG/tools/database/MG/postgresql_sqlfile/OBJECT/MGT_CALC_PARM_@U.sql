\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_parm_$u(
	calc_no,
	calc_grp_cd,
	parm_key,
	parm_val,
	rmrks,
	sub_char1,
	sub_char2,
	sub_char3
	)
AS
SELECT
	mgt_calc_parm_$u_mgt_calc_parm_all_org.calc_no,
	mgt_calc_parm_$u_mgt_calc_parm_all_org.calc_grp_cd,
	mgt_calc_parm_$u_mgt_calc_parm_all_org.parm_key,
	mgt_calc_parm_$u_mgt_calc_parm_all_org.parm_val,
	mgt_calc_parm_$u_mgt_calc_parm_all_org.rmrks,
	mgt_calc_parm_$u_mgt_calc_parm_all_org.sub_char1,
	mgt_calc_parm_$u_mgt_calc_parm_all_org.sub_char2,
	mgt_calc_parm_$u_mgt_calc_parm_all_org.sub_char3
FROM
	mgt_calc_parm_all mgt_calc_parm_$u_mgt_calc_parm_all_org
WHERE
	0 = 0
	AND mgt_calc_parm_$u_mgt_calc_parm_all_org.co_cd = fcpa_context$f_get_co_cd()
;

