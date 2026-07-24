\encoding UTF-8

CREATE OR REPLACE VIEW mgvt_arg(
sa_typ,
st_ym,
end_ym,
eval_typ,
exp_calc_typ,
inpt_calc_flg,
wk_calc_flg,
prov_calc_flg,
xfr_calc_flg,
alc_calc_typ,
cost_calc_typ
)
AS
SELECT	mgvt_arg_mgw_arg_t1.sa_typ,
	mgvt_arg_mgw_arg_t1.st_ym,
	mgvt_arg_mgw_arg_t1.end_ym,
	mgvt_arg_mgw_arg_t1.eval_typ,
	mgvt_arg_mgw_arg_t1.exp_calc_typ,
	mgvt_arg_mgw_arg_t1.inpt_calc_flg,
	mgvt_arg_mgw_arg_t1.wk_calc_flg,
	mgvt_arg_mgw_arg_t1.prov_calc_flg,
	mgvt_arg_mgw_arg_t1.xfr_calc_flg,
	mgvt_arg_mgw_arg_t1.alc_calc_typ,
	mgvt_arg_mgw_arg_t1.cost_calc_typ
FROM	mgw_arg mgvt_arg_mgw_arg_t1
WHERE	0=0
;;

