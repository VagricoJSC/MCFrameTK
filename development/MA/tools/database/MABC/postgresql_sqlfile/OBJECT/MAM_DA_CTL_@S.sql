\encoding UTF-8

CREATE OR REPLACE VIEW mam_da_ctl_$s(
	da_cd,
	wg_cd,
	dpt_cd,
	loc_cd,
	lg_grp_cd,
	alloc_grp_cd,
	st_dt,
	end_dt,
	rd_flg,
	wr_flg,
	memo1,
	memo2,
	memo3,
	del_flg,
	del_usr_id,
	del_usr_nm,
	del_ts,
	ins_usr_id,
	ins_usr_nm,
	ins_ts,
	ins_func_id,
	upd_cntr,
	upd_usr_id,
	upd_usr_nm,
	upd_ts,
	upd_func_id,
	upd_srv_req_no
	)
AS
SELECT
	mam_da_ctl_$s_mam_da_ctl_all_org.da_cd,
	mam_da_ctl_$s_mam_da_ctl_all_org.wg_cd,
	mam_da_ctl_$s_mam_da_ctl_all_org.dpt_cd,
	mam_da_ctl_$s_mam_da_ctl_all_org.loc_cd,
	mam_da_ctl_$s_mam_da_ctl_all_org.lg_grp_cd,
	mam_da_ctl_$s_mam_da_ctl_all_org.alloc_grp_cd,
	mam_da_ctl_$s_mam_da_ctl_all_org.st_dt,
	mam_da_ctl_$s_mam_da_ctl_all_org.end_dt,
	mam_da_ctl_$s_mam_da_ctl_all_org.rd_flg,
	mam_da_ctl_$s_mam_da_ctl_all_org.wr_flg,
	mam_da_ctl_$s_mam_da_ctl_all_org.memo1,
	mam_da_ctl_$s_mam_da_ctl_all_org.memo2,
	mam_da_ctl_$s_mam_da_ctl_all_org.memo3,
	mam_da_ctl_$s_mam_da_ctl_all_org.del_flg,
	mam_da_ctl_$s_mam_da_ctl_all_org.del_usr_id,
	mam_da_ctl_$s_mam_da_ctl_all_org.del_usr_nm,
	mam_da_ctl_$s_mam_da_ctl_all_org.del_ts,
	mam_da_ctl_$s_mam_da_ctl_all_org.ins_usr_id,
	mam_da_ctl_$s_mam_da_ctl_all_org.ins_usr_nm,
	mam_da_ctl_$s_mam_da_ctl_all_org.ins_ts,
	mam_da_ctl_$s_mam_da_ctl_all_org.ins_func_id,
	mam_da_ctl_$s_mam_da_ctl_all_org.upd_cntr,
	mam_da_ctl_$s_mam_da_ctl_all_org.upd_usr_id,
	mam_da_ctl_$s_mam_da_ctl_all_org.upd_usr_nm,
	mam_da_ctl_$s_mam_da_ctl_all_org.upd_ts,
	mam_da_ctl_$s_mam_da_ctl_all_org.upd_func_id,
	mam_da_ctl_$s_mam_da_ctl_all_org.upd_srv_req_no
FROM
	mam_da_ctl_all mam_da_ctl_$s_mam_da_ctl_all_org
WHERE
	0 = 0
	AND mam_da_ctl_$s_mam_da_ctl_all_org.co_cd = (SELECT co_cd FROM fct_context mam_da_ctl_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_da_ctl_$s_mam_da_ctl_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_da_ctl_$s_maw_del_flg_ctl_W WHERE lower(mam_da_ctl_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_da_ctl'))
;

