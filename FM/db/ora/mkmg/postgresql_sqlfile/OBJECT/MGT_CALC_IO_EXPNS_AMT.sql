\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_io_expns_amt(
	calc_no,
	calc_grp_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	itm_ext,
	wg_cd,
	act_io_id,
	act_io_id_sub,
	amt_add_typ,
	expns_cd,
	amt
	)
AS
SELECT
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.calc_no,
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.calc_grp_cd,
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.itm_cd,
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.itm_sub1,
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.itm_sub2,
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.itm_sub3,
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.itm_ext,
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.wg_cd,
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.act_io_id,
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.act_io_id_sub,
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.amt_add_typ,
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.expns_cd,
	mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.amt
FROM
	mgt_calc_io_expns_amt_all mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org
WHERE
	0 = 0
	AND mgt_calc_io_expns_amt_mgt_calc_io_expns_amt_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_calc_io_expns_amt_fct_context WHERE pid = pg_backend_pid())
;

