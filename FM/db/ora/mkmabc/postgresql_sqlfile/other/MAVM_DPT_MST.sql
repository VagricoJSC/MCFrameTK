\encoding UTF-8

CREATE OR REPLACE VIEW mavm_dpt_mst(
dpt_cd,
st_dt,
end_dt,
dpt_nm,
dpt_lvl_cd,
up_lv_dpt_cd,
ac_dpt_cd,
cost_dpt_cd,
new_dpt_cd,
zip_cd,
addr1,
addr2,
addr3,
addr4,
tel,
fax,
wg_cd,
rcv_bank_ac_cd,
pay_bank_ac_cd,
cal_cd,
asst_dpt_flg,
ar_dpt_flg,
ap_dpt_flg,
sls_dpt_flg,
purc_dpt_flg,
ship_dpt_flg,
arr_dpt_flg,
mfg_dpt_flg,
sd_dpt_flg,
insp_dpt_flg,
bd_dpt_flg,
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
upd_srv_req_no,
co_cd,
dpt_nm_lcl1,
dpt_nm_lcl2,
dpt_nm_lcl3,
dpt_nm_lcl4,
dpt_nm_lcl5
)
AS
SELECT
	mavm_dpt_mst_mam_dpt_all_t1.dpt_cd,
	mavm_dpt_mst_mam_dpt_all_t1.st_dt,
	mavm_dpt_mst_mam_dpt_all_t1.end_dt,
	mavm_dpt_mst_mam_dpt_all_t1.dpt_nm,
	mavm_dpt_mst_mam_dpt_all_t1.dpt_lvl_cd,
	mavm_dpt_mst_mam_dpt_all_t1.up_lv_dpt_cd,
	mavm_dpt_mst_mam_dpt_all_t1.ac_dpt_cd,
	mavm_dpt_mst_mam_dpt_all_t1.cost_dpt_cd,
	mavm_dpt_mst_mam_dpt_all_t1.new_dpt_cd,
	mavm_dpt_mst_mam_dpt_all_t1.zip_cd,
	mavm_dpt_mst_mam_dpt_all_t1.addr1,
	mavm_dpt_mst_mam_dpt_all_t1.addr2,
	mavm_dpt_mst_mam_dpt_all_t1.addr3,
	mavm_dpt_mst_mam_dpt_all_t1.addr4,
	mavm_dpt_mst_mam_dpt_all_t1.tel,
	mavm_dpt_mst_mam_dpt_all_t1.fax,
	mavm_dpt_mst_mam_dpt_all_t1.wg_cd,
	mavm_dpt_mst_mam_dpt_all_t1.rcv_bank_ac_cd,
	mavm_dpt_mst_mam_dpt_all_t1.pay_bank_ac_cd,
	mavm_dpt_mst_mam_dpt_all_t1.cal_cd,
	mavm_dpt_mst_mam_dpt_all_t1.asst_dpt_flg,
	mavm_dpt_mst_mam_dpt_all_t1.ar_dpt_flg,
	mavm_dpt_mst_mam_dpt_all_t1.ap_dpt_flg,
	mavm_dpt_mst_mam_dpt_all_t1.sls_dpt_flg,
	mavm_dpt_mst_mam_dpt_all_t1.purc_dpt_flg,
	mavm_dpt_mst_mam_dpt_all_t1.ship_dpt_flg,
	mavm_dpt_mst_mam_dpt_all_t1.arr_dpt_flg,
	mavm_dpt_mst_mam_dpt_all_t1.mfg_dpt_flg,
	mavm_dpt_mst_mam_dpt_all_t1.sd_dpt_flg,
	mavm_dpt_mst_mam_dpt_all_t1.insp_dpt_flg,
	mavm_dpt_mst_mam_dpt_all_t1.bd_dpt_flg,
	mavm_dpt_mst_mam_dpt_all_t1.memo1,
	mavm_dpt_mst_mam_dpt_all_t1.memo2,
	mavm_dpt_mst_mam_dpt_all_t1.memo3,
	mavm_dpt_mst_mam_dpt_all_t1.del_flg,
	mavm_dpt_mst_mam_dpt_all_t1.del_usr_id,
	mavm_dpt_mst_mam_dpt_all_t1.del_usr_nm,
	mavm_dpt_mst_mam_dpt_all_t1.del_ts,
	mavm_dpt_mst_mam_dpt_all_t1.ins_usr_id,
	mavm_dpt_mst_mam_dpt_all_t1.ins_usr_nm,
	mavm_dpt_mst_mam_dpt_all_t1.ins_ts,
	mavm_dpt_mst_mam_dpt_all_t1.ins_func_id,
	mavm_dpt_mst_mam_dpt_all_t1.upd_cntr,
	mavm_dpt_mst_mam_dpt_all_t1.upd_usr_id,
	mavm_dpt_mst_mam_dpt_all_t1.upd_usr_nm,
	mavm_dpt_mst_mam_dpt_all_t1.upd_ts,
	mavm_dpt_mst_mam_dpt_all_t1.upd_func_id,
	mavm_dpt_mst_mam_dpt_all_t1.upd_srv_req_no,
	mavm_dpt_mst_mam_dpt_all_t1.co_cd,
	--部門名（ロケール１）
	(SELECT mavm_dpt_mst_mam_dpt_lcl_all_t.dpt_nm
		FROM mam_dpt_lcl_all mavm_dpt_mst_mam_dpt_lcl_all_t
		WHERE 0 = 0
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.dpt_cd = mavm_dpt_mst_mam_dpt_all_t1.dpt_cd
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.st_dt = mavm_dpt_mst_mam_dpt_all_t1.st_dt
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.co_cd = mavm_dpt_mst_mam_dpt_all_t1.co_cd
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.lcl_cd = 'ja_JP'
	)	dpt_nm_lcl1,
	--部門名（ロケール２）
	(SELECT mavm_dpt_mst_mam_dpt_lcl_all_t.dpt_nm
		FROM mam_dpt_lcl_all mavm_dpt_mst_mam_dpt_lcl_all_t
		WHERE 0 = 0
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.dpt_cd = mavm_dpt_mst_mam_dpt_all_t1.dpt_cd
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.st_dt = mavm_dpt_mst_mam_dpt_all_t1.st_dt
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.co_cd = mavm_dpt_mst_mam_dpt_all_t1.co_cd
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.lcl_cd = 'en_US'
	)	dpt_nm_lcl2,
	--部門名（ロケール３）
	(SELECT mavm_dpt_mst_mam_dpt_lcl_all_t.dpt_nm
		FROM mam_dpt_lcl_all mavm_dpt_mst_mam_dpt_lcl_all_t
		WHERE 0 = 0
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.dpt_cd = mavm_dpt_mst_mam_dpt_all_t1.dpt_cd
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.st_dt = mavm_dpt_mst_mam_dpt_all_t1.st_dt
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.co_cd = mavm_dpt_mst_mam_dpt_all_t1.co_cd
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.lcl_cd = 'TBD3'
	)	dpt_nm_lcl3,
	--部門名（ロケール４）
	(SELECT mavm_dpt_mst_mam_dpt_lcl_all_t.dpt_nm
		FROM mam_dpt_lcl_all mavm_dpt_mst_mam_dpt_lcl_all_t
		WHERE 0 = 0
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.dpt_cd = mavm_dpt_mst_mam_dpt_all_t1.dpt_cd
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.st_dt = mavm_dpt_mst_mam_dpt_all_t1.st_dt
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.co_cd = mavm_dpt_mst_mam_dpt_all_t1.co_cd
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.lcl_cd = 'TBD4'
	)	dpt_nm_lcl4,
	--部門名（ロケール５）
	(SELECT mavm_dpt_mst_mam_dpt_lcl_all_t.dpt_nm
		FROM mam_dpt_lcl_all mavm_dpt_mst_mam_dpt_lcl_all_t
		WHERE 0 = 0
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.dpt_cd = mavm_dpt_mst_mam_dpt_all_t1.dpt_cd
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.st_dt = mavm_dpt_mst_mam_dpt_all_t1.st_dt
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.co_cd = mavm_dpt_mst_mam_dpt_all_t1.co_cd
		AND mavm_dpt_mst_mam_dpt_lcl_all_t.lcl_cd = 'TBD5'
	)	dpt_nm_lcl5
	FROM mam_dpt_all mavm_dpt_mst_mam_dpt_all_t1
	WHERE 0 = 0
	AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_dpt_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_dpt_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_DPT')
			AND	mavm_dpt_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
		)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_dpt_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_dpt_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_DPT')
			)
		)
	)
UNION ALL
SELECT
	mavm_dpt_mst_mam_dpt_cmn_t1.dpt_cd,
	mavm_dpt_mst_mam_dpt_cmn_t1.st_dt,
	mavm_dpt_mst_mam_dpt_cmn_t1.end_dt,
	mavm_dpt_mst_mam_dpt_cmn_t1.dpt_nm,
	mavm_dpt_mst_mam_dpt_cmn_t1.dpt_lvl_cd,
	mavm_dpt_mst_mam_dpt_cmn_t1.up_lv_dpt_cd,
	mavm_dpt_mst_mam_dpt_cmn_t1.ac_dpt_cd,
	mavm_dpt_mst_mam_dpt_cmn_t1.cost_dpt_cd,
	mavm_dpt_mst_mam_dpt_cmn_t1.new_dpt_cd,
	mavm_dpt_mst_mam_dpt_cmn_t1.zip_cd,
	mavm_dpt_mst_mam_dpt_cmn_t1.addr1,
	mavm_dpt_mst_mam_dpt_cmn_t1.addr2,
	mavm_dpt_mst_mam_dpt_cmn_t1.addr3,
	mavm_dpt_mst_mam_dpt_cmn_t1.addr4,
	mavm_dpt_mst_mam_dpt_cmn_t1.tel,
	mavm_dpt_mst_mam_dpt_cmn_t1.fax,
	mavm_dpt_mst_mam_dpt_cmn_t1.wg_cd,
	mavm_dpt_mst_mam_dpt_cmn_t1.rcv_bank_ac_cd,
	mavm_dpt_mst_mam_dpt_cmn_t1.pay_bank_ac_cd,
	mavm_dpt_mst_mam_dpt_cmn_t1.cal_cd,
	mavm_dpt_mst_mam_dpt_cmn_t1.asst_dpt_flg,
	mavm_dpt_mst_mam_dpt_cmn_t1.ar_dpt_flg,
	mavm_dpt_mst_mam_dpt_cmn_t1.ap_dpt_flg,
	mavm_dpt_mst_mam_dpt_cmn_t1.sls_dpt_flg,
	mavm_dpt_mst_mam_dpt_cmn_t1.purc_dpt_flg,
	mavm_dpt_mst_mam_dpt_cmn_t1.ship_dpt_flg,
	mavm_dpt_mst_mam_dpt_cmn_t1.arr_dpt_flg,
	mavm_dpt_mst_mam_dpt_cmn_t1.mfg_dpt_flg,
	mavm_dpt_mst_mam_dpt_cmn_t1.sd_dpt_flg,
	mavm_dpt_mst_mam_dpt_cmn_t1.insp_dpt_flg,
	mavm_dpt_mst_mam_dpt_cmn_t1.bd_dpt_flg,
	mavm_dpt_mst_mam_dpt_cmn_t1.memo1,
	mavm_dpt_mst_mam_dpt_cmn_t1.memo2,
	mavm_dpt_mst_mam_dpt_cmn_t1.memo3,
	mavm_dpt_mst_mam_dpt_cmn_t1.del_flg,
	mavm_dpt_mst_mam_dpt_cmn_t1.del_usr_id,
	mavm_dpt_mst_mam_dpt_cmn_t1.del_usr_nm,
	mavm_dpt_mst_mam_dpt_cmn_t1.del_ts,
	mavm_dpt_mst_mam_dpt_cmn_t1.ins_usr_id,
	mavm_dpt_mst_mam_dpt_cmn_t1.ins_usr_nm,
	mavm_dpt_mst_mam_dpt_cmn_t1.ins_ts,
	mavm_dpt_mst_mam_dpt_cmn_t1.ins_func_id,
	mavm_dpt_mst_mam_dpt_cmn_t1.upd_cntr,
	mavm_dpt_mst_mam_dpt_cmn_t1.upd_usr_id,
	mavm_dpt_mst_mam_dpt_cmn_t1.upd_usr_nm,
	mavm_dpt_mst_mam_dpt_cmn_t1.upd_ts,
	mavm_dpt_mst_mam_dpt_cmn_t1.upd_func_id,
	mavm_dpt_mst_mam_dpt_cmn_t1.upd_srv_req_no,
	mavm_dpt_mst_mam_co_all_t2.co_cd,
	--部門名（ロケール１）
	(SELECT mavm_dpt_mst_mam_dpt_lcl_cmn_t.dpt_nm
		FROM mam_dpt_lcl_cmn mavm_dpt_mst_mam_dpt_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.dpt_cd = mavm_dpt_mst_mam_dpt_cmn_t1.dpt_cd
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.st_dt = mavm_dpt_mst_mam_dpt_cmn_t1.st_dt
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	dpt_nm_lcl1,
	--部門名（ロケール２）
	(SELECT mavm_dpt_mst_mam_dpt_lcl_cmn_t.dpt_nm
		FROM mam_dpt_lcl_cmn mavm_dpt_mst_mam_dpt_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.dpt_cd = mavm_dpt_mst_mam_dpt_cmn_t1.dpt_cd
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.st_dt = mavm_dpt_mst_mam_dpt_cmn_t1.st_dt
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.lcl_cd = 'en_US'
	)	dpt_nm_lcl2,
	--部門名（ロケール３）
	(SELECT mavm_dpt_mst_mam_dpt_lcl_cmn_t.dpt_nm
		FROM mam_dpt_lcl_cmn mavm_dpt_mst_mam_dpt_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.dpt_cd = mavm_dpt_mst_mam_dpt_cmn_t1.dpt_cd
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.st_dt = mavm_dpt_mst_mam_dpt_cmn_t1.st_dt
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.lcl_cd = 'TBD3'
	)	dpt_nm_lcl3,
	--部門名（ロケール４）
	(SELECT mavm_dpt_mst_mam_dpt_lcl_cmn_t.dpt_nm
		FROM mam_dpt_lcl_cmn mavm_dpt_mst_mam_dpt_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.dpt_cd = mavm_dpt_mst_mam_dpt_cmn_t1.dpt_cd
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.st_dt = mavm_dpt_mst_mam_dpt_cmn_t1.st_dt
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.lcl_cd = 'TBD4'
	)	dpt_nm_lcl4,
	--部門名（ロケール５）
	(SELECT mavm_dpt_mst_mam_dpt_lcl_cmn_t.dpt_nm
		FROM mam_dpt_lcl_cmn mavm_dpt_mst_mam_dpt_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.dpt_cd = mavm_dpt_mst_mam_dpt_cmn_t1.dpt_cd
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.st_dt = mavm_dpt_mst_mam_dpt_cmn_t1.st_dt
		AND mavm_dpt_mst_mam_dpt_lcl_cmn_t.lcl_cd = 'TBD5'
	)	dpt_nm_lcl5
	FROM mam_dpt_cmn mavm_dpt_mst_mam_dpt_cmn_t1, mam_co_all mavm_dpt_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_dpt_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_dpt_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_DPT')
		AND	mavm_dpt_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

