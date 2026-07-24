\encoding UTF-8

CREATE OR REPLACE VIEW mgvt_st_wip_expns(
st_wip_key,
expns_cd,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
itm_ext,
wg_cd,
wip_amt,
inpt_amt
)
AS
SELECT	mgvt_st_wip_expns_mgt_st_wip_expns_t1.st_wip_key,
	mgvt_st_wip_expns_mgt_st_wip_expns_t1.expns_cd,
	mgvt_st_wip_expns_mgvt_st_wip_t2.itm_cd,
	mgvt_st_wip_expns_mgvt_st_wip_t2.itm_sub1,
	mgvt_st_wip_expns_mgvt_st_wip_t2.itm_sub2,
	mgvt_st_wip_expns_mgvt_st_wip_t2.itm_sub3,
	mgvt_st_wip_expns_mgvt_st_wip_t2.itm_ext,
	mgvt_st_wip_expns_mgvt_st_wip_t2.wg_cd,
	mgvt_st_wip_expns_mgt_st_wip_expns_t1.wip_amt,
	mgvt_st_wip_expns_mgt_st_wip_expns_t1.inpt_amt
FROM	mgt_st_wip_expns mgvt_st_wip_expns_mgt_st_wip_expns_t1, mgvt_st_wip mgvt_st_wip_expns_mgvt_st_wip_t2
WHERE	0=0
AND	mgvt_st_wip_expns_mgt_st_wip_expns_t1.st_wip_key = mgvt_st_wip_expns_mgvt_st_wip_t2.st_wip_key
AND	(mgvt_st_wip_expns_mgt_st_wip_expns_t1.wip_amt <> 0 OR mgvt_st_wip_expns_mgt_st_wip_expns_t1.inpt_amt <> 0)
AND EXISTS (
	SELECT	'X'
	FROM	mgw_arg mgvt_st_wip_expns_mgw_arg_w1
	WHERE	0=0
	AND	mgvt_st_wip_expns_mgw_arg_w1.cost_calc_typ IN (
		fcpa_const$get_const_val('MAC_COST_CALC_TYP','CALC_STK'),
		fcpa_const$get_const_val('MAC_COST_CALC_TYP','NOT_STK')
	)
)
;;

