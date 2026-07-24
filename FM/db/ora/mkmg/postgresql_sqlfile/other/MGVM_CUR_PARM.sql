\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_cur_parm(
cur_cd,
amt_rnd_typ,
amt_dec_place,
ave_rnd_typ,
ave_dec_place
)
AS
SELECT	mgvm_cur_parm_mgt_calc_cur_parm_t1.cur_cd,
	mgvm_cur_parm_mgt_calc_cur_parm_t1.amt_rnd_typ,
	mgvm_cur_parm_mgt_calc_cur_parm_t1.amt_dec_place,
	mgvm_cur_parm_mgt_calc_cur_parm_t1.ave_rnd_typ,
	mgvm_cur_parm_mgt_calc_cur_parm_t1.ave_dec_place
FROM	mgw_arg mgvm_cur_parm_mgw_arg_w1, mgt_calc_cur_parm mgvm_cur_parm_mgt_calc_cur_parm_t1
WHERE	0=0
AND	mgvm_cur_parm_mgw_arg_w1.calc_no = mgvm_cur_parm_mgt_calc_cur_parm_t1.calc_no
AND	mgvm_cur_parm_mgw_arg_w1.calc_grp_cd = mgvm_cur_parm_mgt_calc_cur_parm_t1.calc_grp_cd
;;

