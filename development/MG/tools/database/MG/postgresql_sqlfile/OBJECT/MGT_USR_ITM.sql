\encoding UTF-8

CREATE OR REPLACE VIEW mgt_usr_itm(
	usr_cd,
	calc_grp_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3
	)
AS
SELECT
	mgt_usr_itm_mgt_usr_itm_all_org.usr_cd,
	mgt_usr_itm_mgt_usr_itm_all_org.calc_grp_cd,
	mgt_usr_itm_mgt_usr_itm_all_org.itm_cd,
	mgt_usr_itm_mgt_usr_itm_all_org.itm_sub1,
	mgt_usr_itm_mgt_usr_itm_all_org.itm_sub2,
	mgt_usr_itm_mgt_usr_itm_all_org.itm_sub3
FROM
	mgt_usr_itm_all mgt_usr_itm_mgt_usr_itm_all_org
WHERE
	0 = 0
	AND mgt_usr_itm_mgt_usr_itm_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_usr_itm_fct_context WHERE pid = pg_backend_pid())
;

