\encoding UTF-8

CREATE OR REPLACE VIEW mavm_itm_mst(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
co_cd,
itm_typ,
itm_typ_d_cd,
itm_jnl_cd,
ac_itm_grp_cd,
minus_stk_flg,
not_new_lot_flg,
gi_alloc_flg,
sls_tax_cd,
purc_tax_cd,
prov_tax_cd,
wtax_rate,
ship_unit_cd,
mfg_unit_cd,
purc_unit_cd,
pckg_unit_cd,
pack_alloc_flg,
lot_mng_typ,
lot_no_typ,
lot_no_ptn_cd,
sublot_mng_typ,
sublot_no_typ,
sublot_no_ptn_cd,
bp_lot_flg,
insp_bind_typ,
skip_chk_ship_flg,
mrkt_judg_flg,
mrkt_judg_role_cd,
mrkt_judg_upd_role_cd,
lmt_ctl_flg,
lmt_ctl_categ,
cont_fctr_flg,
std_cont_fctr,
cont_fctr_unit_cd,
cont_fctr_rnd_typ,
cont_fctr_dec_place,
sno1_mng_typ,
slo_sno1_flg,
rqmt_sno1_flg,
sno1_num_typ,
sno1_ptn_cd,
sno2_mng_typ,
slo_sno2_flg,
rqmt_sno2_flg,
sno2_num_typ,
sno2_ptn_cd,
sno3_mng_typ,
slo_sno3_flg,
rqmt_sno3_flg,
sno3_num_typ,
sno3_ptn_cd,
sno4_mng_typ,
slo_sno4_flg,
rqmt_sno4_flg,
sno4_num_typ,
sno4_ptn_cd,
def_bom_ptn,
mfg_inst_unit_typ,
mrp_proc_typ,
rqmt_typ,
prod_pln_typ,
dmnd_date_div_mons,
alloc_margin_days,
mrp_alloc_margin_days,
mrp_opn_xfr_days,
rqmt_rstr_qty,
inpt_itm_add_flg,
inpt_itm_del_flg,
sch_flg,
cntry_org_cd,
comp_spec_typ,
comp_rev_at_slo_flg,
comp_core_itm_flg,
itm_spec_grp_cd,
sls_upri_grp_cd,
bill_crryovr_times,
pay_crryovr_times,
slo_proc_flg,
slo_proc_typ,
ship_inst_typ,
ship_lot_back_stop_flg,
itm_ship_grp_cd,
ship_valid_grp_cd,
arr_skip_flg,
purc_dlv_slip_flg,
ship_term_cd,
exim_xpns_typ,
stk_lst_flg,
ver_flg,
sls_upri_cng_flg,
purc_upri_cng_flg,
prov_upri_cng_flg,
ref_itm_cd,
ref_itm_sub1,
ref_itm_sub2,
ref_itm_sub3,
ext_sys_no_itm,
chng_no,
calc_ptn_cd,
cost_std_qty,
itm_alc_grp,
sls_flg,
mfg_flg,
purc_flg,
insp_flg,
sls_input_flg,
mfg_input_flg,
purc_input_flg,
insp_input_flg,
release_flg,
release_usr_cd,
release_tm,
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
itm_nm,
itm_alt_nm1,
itm_alt_nm2,
itm_alt_nm3,
itm_alt_nm4,
itm_grp_cd1,
itm_grp_cd2,
itm_grp_cd3,
itm_grp_cd4,
itm_grp_cd5,
itm_grp_cd6,
itm_grp_cd7,
itm_grp_cd8,
itm_grp_cd9,
itm_grp_cd10,
stk_mng_typ,
asset_mng_typ,
sundry_itm_flg,
dscnt_itm_flg,
unit_cd,
dec_place,
rnd_typ,
dim_unit_cd,
dim,
wt_unit_cd,
wt,
conts_unit_cd,
conts_qty,
unit_dim,
unit_wt,
hs_cd,
jan_typ,
jan_cd,
itf_cd,
gtin_cd,
th_image,
sls_itm_grp_cd,
itm_nm_lcl1,
itm_nm_lcl2,
itm_nm_lcl3,
itm_nm_lcl4,
itm_nm_lcl5
)
AS
SELECT
	mavm_itm_mst_mam_itm_com_t1.itm_cd,
	mavm_itm_mst_mam_itm_com_t1.itm_sub1,
	mavm_itm_mst_mam_itm_com_t1.itm_sub2,
	mavm_itm_mst_mam_itm_com_t1.itm_sub3,
	mavm_itm_mst_mam_itm_com_t1.co_cd,
	mavm_itm_mst_mam_itm_com_t1.itm_typ,
	mavm_itm_mst_mam_itm_com_t1.itm_typ_d_cd,
	mavm_itm_mst_mam_itm_com_t1.itm_jnl_cd,
	mavm_itm_mst_mam_itm_com_t1.ac_itm_grp_cd,
	mavm_itm_mst_mam_itm_com_t1.minus_stk_flg,
	mavm_itm_mst_mam_itm_com_t1.not_new_lot_flg,
	mavm_itm_mst_mam_itm_com_t1.gi_alloc_flg,
	mavm_itm_mst_mam_itm_com_t1.sls_tax_cd,
	mavm_itm_mst_mam_itm_com_t1.purc_tax_cd,
	mavm_itm_mst_mam_itm_com_t1.prov_tax_cd,
	mavm_itm_mst_mam_itm_com_t1.wtax_rate,
	mavm_itm_mst_mam_itm_com_t1.ship_unit_cd,
	mavm_itm_mst_mam_itm_com_t1.mfg_unit_cd,
	mavm_itm_mst_mam_itm_com_t1.purc_unit_cd,
	mavm_itm_mst_mam_itm_com_t1.pckg_unit_cd,
	mavm_itm_mst_mam_itm_com_t1.pack_alloc_flg,
	mavm_itm_mst_mam_itm_com_t1.lot_mng_typ,
	mavm_itm_mst_mam_itm_com_t1.lot_no_typ,
	mavm_itm_mst_mam_itm_com_t1.lot_no_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.sublot_mng_typ,
	mavm_itm_mst_mam_itm_com_t1.sublot_no_typ,
	mavm_itm_mst_mam_itm_com_t1.sublot_no_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.bp_lot_flg,
	mavm_itm_mst_mam_itm_com_t1.insp_bind_typ,
	mavm_itm_mst_mam_itm_com_t1.skip_chk_ship_flg,
	mavm_itm_mst_mam_itm_com_t1.mrkt_judg_flg,
	mavm_itm_mst_mam_itm_com_t1.mrkt_judg_role_cd,
	mavm_itm_mst_mam_itm_com_t1.mrkt_judg_upd_role_cd,
	mavm_itm_mst_mam_itm_com_t1.lmt_ctl_flg,
	mavm_itm_mst_mam_itm_com_t1.lmt_ctl_categ,
	mavm_itm_mst_mam_itm_com_t1.cont_fctr_flg,
	mavm_itm_mst_mam_itm_com_t1.std_cont_fctr,
	mavm_itm_mst_mam_itm_com_t1.cont_fctr_unit_cd,
	mavm_itm_mst_mam_itm_com_t1.cont_fctr_rnd_typ,
	mavm_itm_mst_mam_itm_com_t1.cont_fctr_dec_place,
	mavm_itm_mst_mam_itm_com_t1.sno1_mng_typ,
	mavm_itm_mst_mam_itm_com_t1.slo_sno1_flg,
	mavm_itm_mst_mam_itm_com_t1.rqmt_sno1_flg,
	mavm_itm_mst_mam_itm_com_t1.sno1_num_typ,
	mavm_itm_mst_mam_itm_com_t1.sno1_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.sno2_mng_typ,
	mavm_itm_mst_mam_itm_com_t1.slo_sno2_flg,
	mavm_itm_mst_mam_itm_com_t1.rqmt_sno2_flg,
	mavm_itm_mst_mam_itm_com_t1.sno2_num_typ,
	mavm_itm_mst_mam_itm_com_t1.sno2_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.sno3_mng_typ,
	mavm_itm_mst_mam_itm_com_t1.slo_sno3_flg,
	mavm_itm_mst_mam_itm_com_t1.rqmt_sno3_flg,
	mavm_itm_mst_mam_itm_com_t1.sno3_num_typ,
	mavm_itm_mst_mam_itm_com_t1.sno3_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.sno4_mng_typ,
	mavm_itm_mst_mam_itm_com_t1.slo_sno4_flg,
	mavm_itm_mst_mam_itm_com_t1.rqmt_sno4_flg,
	mavm_itm_mst_mam_itm_com_t1.sno4_num_typ,
	mavm_itm_mst_mam_itm_com_t1.sno4_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.def_bom_ptn,
	mavm_itm_mst_mam_itm_com_t1.mfg_inst_unit_typ,
	mavm_itm_mst_mam_itm_com_t1.mrp_proc_typ,
	mavm_itm_mst_mam_itm_com_t1.rqmt_typ,
	mavm_itm_mst_mam_itm_com_t1.prod_pln_typ,
	mavm_itm_mst_mam_itm_com_t1.dmnd_date_div_mons,
	mavm_itm_mst_mam_itm_com_t1.alloc_margin_days,
	mavm_itm_mst_mam_itm_com_t1.mrp_alloc_margin_days,
	mavm_itm_mst_mam_itm_com_t1.mrp_opn_xfr_days,
	mavm_itm_mst_mam_itm_com_t1.rqmt_rstr_qty,
	mavm_itm_mst_mam_itm_com_t1.inpt_itm_add_flg,
	mavm_itm_mst_mam_itm_com_t1.inpt_itm_del_flg,
	mavm_itm_mst_mam_itm_com_t1.sch_flg,
	mavm_itm_mst_mam_itm_com_t1.cntry_org_cd,
	mavm_itm_mst_mam_itm_com_t1.comp_spec_typ,
	mavm_itm_mst_mam_itm_com_t1.comp_rev_at_slo_flg,
	mavm_itm_mst_mam_itm_com_t1.comp_core_itm_flg,
	mavm_itm_mst_mam_itm_com_t1.itm_spec_grp_cd,
	mavm_itm_mst_mam_itm_com_t1.sls_upri_grp_cd,
	mavm_itm_mst_mam_itm_com_t1.bill_crryovr_times,
	mavm_itm_mst_mam_itm_com_t1.pay_crryovr_times,
	mavm_itm_mst_mam_itm_com_t1.slo_proc_flg,
	mavm_itm_mst_mam_itm_com_t1.slo_proc_typ,
	mavm_itm_mst_mam_itm_com_t1.ship_inst_typ,
	mavm_itm_mst_mam_itm_com_t1.ship_lot_back_stop_flg,
	mavm_itm_mst_mam_itm_com_t1.itm_ship_grp_cd,
	mavm_itm_mst_mam_itm_com_t1.ship_valid_grp_cd,
	mavm_itm_mst_mam_itm_com_t1.arr_skip_flg,
	mavm_itm_mst_mam_itm_com_t1.purc_dlv_slip_flg,
	mavm_itm_mst_mam_itm_com_t1.ship_term_cd,
	mavm_itm_mst_mam_itm_com_t1.exim_xpns_typ,
	mavm_itm_mst_mam_itm_com_t1.stk_lst_flg,
	mavm_itm_mst_mam_itm_com_t1.ver_flg,
	mavm_itm_mst_mam_itm_com_t1.sls_upri_cng_flg,
	mavm_itm_mst_mam_itm_com_t1.purc_upri_cng_flg,
	mavm_itm_mst_mam_itm_com_t1.prov_upri_cng_flg,
	mavm_itm_mst_mam_itm_com_t1.ref_itm_cd,
	mavm_itm_mst_mam_itm_com_t1.ref_itm_sub1,
	mavm_itm_mst_mam_itm_com_t1.ref_itm_sub2,
	mavm_itm_mst_mam_itm_com_t1.ref_itm_sub3,
	mavm_itm_mst_mam_itm_com_t1.ext_sys_no_itm,
	mavm_itm_mst_mam_itm_com_t1.chng_no,
	mavm_itm_mst_mam_itm_com_t1.calc_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.cost_std_qty,
	mavm_itm_mst_mam_itm_com_t1.itm_alc_grp,
	mavm_itm_mst_mam_itm_com_t1.sls_flg,
	mavm_itm_mst_mam_itm_com_t1.mfg_flg,
	mavm_itm_mst_mam_itm_com_t1.purc_flg,
	mavm_itm_mst_mam_itm_com_t1.insp_flg,
	mavm_itm_mst_mam_itm_com_t1.sls_input_flg,
	mavm_itm_mst_mam_itm_com_t1.mfg_input_flg,
	mavm_itm_mst_mam_itm_com_t1.purc_input_flg,
	mavm_itm_mst_mam_itm_com_t1.insp_input_flg,
	mavm_itm_mst_mam_itm_com_t1.release_flg,
	mavm_itm_mst_mam_itm_com_t1.release_usr_cd,
	mavm_itm_mst_mam_itm_com_t1.release_tm,
	mavm_itm_mst_mam_itm_com_t1.memo1,
	mavm_itm_mst_mam_itm_com_t1.memo2,
	mavm_itm_mst_mam_itm_com_t1.memo3,
	mavm_itm_mst_mam_itm_com_t1.del_flg,
	mavm_itm_mst_mam_itm_com_t1.del_usr_id,
	mavm_itm_mst_mam_itm_com_t1.del_usr_nm,
	mavm_itm_mst_mam_itm_com_t1.del_ts,
	mavm_itm_mst_mam_itm_com_t1.ins_usr_id,
	mavm_itm_mst_mam_itm_com_t1.ins_usr_nm,
	mavm_itm_mst_mam_itm_com_t1.ins_ts,
	mavm_itm_mst_mam_itm_com_t1.ins_func_id,
	mavm_itm_mst_mam_itm_com_t1.upd_cntr,
	mavm_itm_mst_mam_itm_com_t1.upd_usr_id,
	mavm_itm_mst_mam_itm_com_t1.upd_usr_nm,
	mavm_itm_mst_mam_itm_com_t1.upd_ts,
	mavm_itm_mst_mam_itm_com_t1.upd_func_id,
	mavm_itm_mst_mam_itm_com_t1.upd_srv_req_no,
	mavm_itm_mst_mam_itm_all_t2.itm_nm,
	mavm_itm_mst_mam_itm_all_t2.itm_alt_nm1,
	mavm_itm_mst_mam_itm_all_t2.itm_alt_nm2,
	mavm_itm_mst_mam_itm_all_t2.itm_alt_nm3,
	mavm_itm_mst_mam_itm_all_t2.itm_alt_nm4,
	mavm_itm_mst_mam_itm_all_t2.itm_grp_cd1,
	mavm_itm_mst_mam_itm_all_t2.itm_grp_cd2,
	mavm_itm_mst_mam_itm_all_t2.itm_grp_cd3,
	mavm_itm_mst_mam_itm_all_t2.itm_grp_cd4,
	mavm_itm_mst_mam_itm_all_t2.itm_grp_cd5,
	mavm_itm_mst_mam_itm_all_t2.itm_grp_cd6,
	mavm_itm_mst_mam_itm_all_t2.itm_grp_cd7,
	mavm_itm_mst_mam_itm_all_t2.itm_grp_cd8,
	mavm_itm_mst_mam_itm_all_t2.itm_grp_cd9,
	mavm_itm_mst_mam_itm_all_t2.itm_grp_cd10,
	mavm_itm_mst_mam_itm_all_t2.stk_mng_typ,
	mavm_itm_mst_mam_itm_all_t2.asset_mng_typ,
	mavm_itm_mst_mam_itm_all_t2.sundry_itm_flg,
	mavm_itm_mst_mam_itm_all_t2.dscnt_itm_flg,
	mavm_itm_mst_mam_itm_all_t2.unit_cd,
	mavm_itm_mst_mam_itm_all_t2.dec_place,
	mavm_itm_mst_mam_itm_all_t2.rnd_typ,
	mavm_itm_mst_mam_itm_all_t2.dim_unit_cd,
	mavm_itm_mst_mam_itm_all_t2.dim,
	mavm_itm_mst_mam_itm_all_t2.wt_unit_cd,
	mavm_itm_mst_mam_itm_all_t2.wt,
	mavm_itm_mst_mam_itm_all_t2.conts_unit_cd,
	mavm_itm_mst_mam_itm_all_t2.conts_qty,
	mavm_itm_mst_mam_itm_all_t2.unit_dim,
	mavm_itm_mst_mam_itm_all_t2.unit_wt,
	mavm_itm_mst_mam_itm_all_t2.hs_cd,
	mavm_itm_mst_mam_itm_all_t2.jan_typ,
	mavm_itm_mst_mam_itm_all_t2.jan_cd,
	mavm_itm_mst_mam_itm_all_t2.itf_cd,
	mavm_itm_mst_mam_itm_all_t2.gtin_cd,
	mavm_itm_mst_mam_itm_all_t2.th_image,
	mavm_itm_mst_mam_itm_all_t2.sls_itm_grp_cd,
	--品目名（ロケール１）
	(SELECT itm_nm 
		FROM mam_itm_lcl_all mavm_itm_mst_mam_itm_lcl_all_t
		WHERE 0=0
		AND	mavm_itm_mst_mam_itm_lcl_all_t.itm_cd = mavm_itm_mst_mam_itm_com_t1.itm_cd
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub1 = mavm_itm_mst_mam_itm_com_t1.itm_sub1
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub2 = mavm_itm_mst_mam_itm_com_t1.itm_sub2
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub3 = mavm_itm_mst_mam_itm_com_t1.itm_sub3
		AND mavm_itm_mst_mam_itm_lcl_all_t.co_cd = mavm_itm_mst_mam_itm_com_t1.co_cd
		AND mavm_itm_mst_mam_itm_lcl_all_t.lcl_cd = 'ja_JP'
	)	itm_nm_lcl1,
	--品目名（ロケール２） 
	(SELECT itm_nm 
		FROM mam_itm_lcl_all mavm_itm_mst_mam_itm_lcl_all_t
		WHERE 0=0
		AND	mavm_itm_mst_mam_itm_lcl_all_t.itm_cd = mavm_itm_mst_mam_itm_com_t1.itm_cd
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub1 = mavm_itm_mst_mam_itm_com_t1.itm_sub1
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub2 = mavm_itm_mst_mam_itm_com_t1.itm_sub2
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub3 = mavm_itm_mst_mam_itm_com_t1.itm_sub3
		AND mavm_itm_mst_mam_itm_lcl_all_t.co_cd = mavm_itm_mst_mam_itm_com_t1.co_cd
		AND mavm_itm_mst_mam_itm_lcl_all_t.lcl_cd = 'en_US'
	)	itm_nm_lcl2,
	--品目名（ロケール３） 
	(SELECT itm_nm 
		FROM mam_itm_lcl_all mavm_itm_mst_mam_itm_lcl_all_t
		WHERE 0=0
		AND	mavm_itm_mst_mam_itm_lcl_all_t.itm_cd = mavm_itm_mst_mam_itm_com_t1.itm_cd
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub1 = mavm_itm_mst_mam_itm_com_t1.itm_sub1
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub2 = mavm_itm_mst_mam_itm_com_t1.itm_sub2
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub3 = mavm_itm_mst_mam_itm_com_t1.itm_sub3
		AND mavm_itm_mst_mam_itm_lcl_all_t.co_cd = mavm_itm_mst_mam_itm_com_t1.co_cd
		AND mavm_itm_mst_mam_itm_lcl_all_t.lcl_cd = 'TBD3'
	)	itm_nm_lcl3,	
	--品目名（ロケール４） 
	(SELECT itm_nm 
		FROM mam_itm_lcl_all mavm_itm_mst_mam_itm_lcl_all_t
		WHERE 0=0
		AND	mavm_itm_mst_mam_itm_lcl_all_t.itm_cd = mavm_itm_mst_mam_itm_com_t1.itm_cd
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub1 = mavm_itm_mst_mam_itm_com_t1.itm_sub1
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub2 = mavm_itm_mst_mam_itm_com_t1.itm_sub2
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub3 = mavm_itm_mst_mam_itm_com_t1.itm_sub3
		AND mavm_itm_mst_mam_itm_lcl_all_t.co_cd = mavm_itm_mst_mam_itm_com_t1.co_cd
		AND mavm_itm_mst_mam_itm_lcl_all_t.lcl_cd = 'TBD4'
	)	itm_nm_lcl4,	
	--品目名（ロケール５） 
	(SELECT itm_nm 
		FROM mam_itm_lcl_all mavm_itm_mst_mam_itm_lcl_all_t
		WHERE 0=0
		AND	mavm_itm_mst_mam_itm_lcl_all_t.itm_cd = mavm_itm_mst_mam_itm_com_t1.itm_cd
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub1 = mavm_itm_mst_mam_itm_com_t1.itm_sub1
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub2 = mavm_itm_mst_mam_itm_com_t1.itm_sub2
		AND mavm_itm_mst_mam_itm_lcl_all_t.itm_sub3 = mavm_itm_mst_mam_itm_com_t1.itm_sub3
		AND mavm_itm_mst_mam_itm_lcl_all_t.co_cd = mavm_itm_mst_mam_itm_com_t1.co_cd
		AND mavm_itm_mst_mam_itm_lcl_all_t.lcl_cd = 'TBD5'
	)	itm_nm_lcl5
	FROM mam_itm_com mavm_itm_mst_mam_itm_com_t1
	LEFT OUTER JOIN mam_itm_all mavm_itm_mst_mam_itm_all_t2 ON (
			mavm_itm_mst_mam_itm_com_t1.itm_cd = mavm_itm_mst_mam_itm_all_t2.itm_cd
		AND	mavm_itm_mst_mam_itm_com_t1.itm_sub1 = mavm_itm_mst_mam_itm_all_t2.itm_sub1
		AND mavm_itm_mst_mam_itm_com_t1.itm_sub2 = mavm_itm_mst_mam_itm_all_t2.itm_sub2
		AND mavm_itm_mst_mam_itm_com_t1.itm_sub3 = mavm_itm_mst_mam_itm_all_t2.itm_sub3
		AND mavm_itm_mst_mam_itm_com_t1.co_cd = mavm_itm_mst_mam_itm_all_t2.co_cd
	)
	WHERE 0 = 0
	AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_itm_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_itm_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM')
			AND	mavm_itm_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
		)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_itm_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_itm_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM')
			)
		)
	)
UNION ALL
SELECT
	mavm_itm_mst_mam_itm_com_t1.itm_cd,
	mavm_itm_mst_mam_itm_com_t1.itm_sub1,
	mavm_itm_mst_mam_itm_com_t1.itm_sub2,
	mavm_itm_mst_mam_itm_com_t1.itm_sub3,
	mavm_itm_mst_mam_itm_com_t1.co_cd,
	mavm_itm_mst_mam_itm_com_t1.itm_typ,
	mavm_itm_mst_mam_itm_com_t1.itm_typ_d_cd,
	mavm_itm_mst_mam_itm_com_t1.itm_jnl_cd,
	mavm_itm_mst_mam_itm_com_t1.ac_itm_grp_cd,
	mavm_itm_mst_mam_itm_com_t1.minus_stk_flg,
	mavm_itm_mst_mam_itm_com_t1.not_new_lot_flg,
	mavm_itm_mst_mam_itm_com_t1.gi_alloc_flg,
	mavm_itm_mst_mam_itm_com_t1.sls_tax_cd,
	mavm_itm_mst_mam_itm_com_t1.purc_tax_cd,
	mavm_itm_mst_mam_itm_com_t1.prov_tax_cd,
	mavm_itm_mst_mam_itm_com_t1.wtax_rate,
	mavm_itm_mst_mam_itm_com_t1.ship_unit_cd,
	mavm_itm_mst_mam_itm_com_t1.mfg_unit_cd,
	mavm_itm_mst_mam_itm_com_t1.purc_unit_cd,
	mavm_itm_mst_mam_itm_com_t1.pckg_unit_cd,
	mavm_itm_mst_mam_itm_com_t1.pack_alloc_flg,
	mavm_itm_mst_mam_itm_com_t1.lot_mng_typ,
	mavm_itm_mst_mam_itm_com_t1.lot_no_typ,
	mavm_itm_mst_mam_itm_com_t1.lot_no_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.sublot_mng_typ,
	mavm_itm_mst_mam_itm_com_t1.sublot_no_typ,
	mavm_itm_mst_mam_itm_com_t1.sublot_no_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.bp_lot_flg,
	mavm_itm_mst_mam_itm_com_t1.insp_bind_typ,
	mavm_itm_mst_mam_itm_com_t1.skip_chk_ship_flg,
	mavm_itm_mst_mam_itm_com_t1.mrkt_judg_flg,
	mavm_itm_mst_mam_itm_com_t1.mrkt_judg_role_cd,
	mavm_itm_mst_mam_itm_com_t1.mrkt_judg_upd_role_cd,
	mavm_itm_mst_mam_itm_com_t1.lmt_ctl_flg,
	mavm_itm_mst_mam_itm_com_t1.lmt_ctl_categ,
	mavm_itm_mst_mam_itm_com_t1.cont_fctr_flg,
	mavm_itm_mst_mam_itm_com_t1.std_cont_fctr,
	mavm_itm_mst_mam_itm_com_t1.cont_fctr_unit_cd,
	mavm_itm_mst_mam_itm_com_t1.cont_fctr_rnd_typ,
	mavm_itm_mst_mam_itm_com_t1.cont_fctr_dec_place,
	mavm_itm_mst_mam_itm_com_t1.sno1_mng_typ,
	mavm_itm_mst_mam_itm_com_t1.slo_sno1_flg,
	mavm_itm_mst_mam_itm_com_t1.rqmt_sno1_flg,
	mavm_itm_mst_mam_itm_com_t1.sno1_num_typ,
	mavm_itm_mst_mam_itm_com_t1.sno1_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.sno2_mng_typ,
	mavm_itm_mst_mam_itm_com_t1.slo_sno2_flg,
	mavm_itm_mst_mam_itm_com_t1.rqmt_sno2_flg,
	mavm_itm_mst_mam_itm_com_t1.sno2_num_typ,
	mavm_itm_mst_mam_itm_com_t1.sno2_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.sno3_mng_typ,
	mavm_itm_mst_mam_itm_com_t1.slo_sno3_flg,
	mavm_itm_mst_mam_itm_com_t1.rqmt_sno3_flg,
	mavm_itm_mst_mam_itm_com_t1.sno3_num_typ,
	mavm_itm_mst_mam_itm_com_t1.sno3_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.sno4_mng_typ,
	mavm_itm_mst_mam_itm_com_t1.slo_sno4_flg,
	mavm_itm_mst_mam_itm_com_t1.rqmt_sno4_flg,
	mavm_itm_mst_mam_itm_com_t1.sno4_num_typ,
	mavm_itm_mst_mam_itm_com_t1.sno4_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.def_bom_ptn,
	mavm_itm_mst_mam_itm_com_t1.mfg_inst_unit_typ,
	mavm_itm_mst_mam_itm_com_t1.mrp_proc_typ,
	mavm_itm_mst_mam_itm_com_t1.rqmt_typ,
	mavm_itm_mst_mam_itm_com_t1.prod_pln_typ,
	mavm_itm_mst_mam_itm_com_t1.dmnd_date_div_mons,
	mavm_itm_mst_mam_itm_com_t1.alloc_margin_days,
	mavm_itm_mst_mam_itm_com_t1.mrp_alloc_margin_days,
	mavm_itm_mst_mam_itm_com_t1.mrp_opn_xfr_days,
	mavm_itm_mst_mam_itm_com_t1.rqmt_rstr_qty,
	mavm_itm_mst_mam_itm_com_t1.inpt_itm_add_flg,
	mavm_itm_mst_mam_itm_com_t1.inpt_itm_del_flg,
	mavm_itm_mst_mam_itm_com_t1.sch_flg,
	mavm_itm_mst_mam_itm_com_t1.cntry_org_cd,
	mavm_itm_mst_mam_itm_com_t1.comp_spec_typ,
	mavm_itm_mst_mam_itm_com_t1.comp_rev_at_slo_flg,
	mavm_itm_mst_mam_itm_com_t1.comp_core_itm_flg,
	mavm_itm_mst_mam_itm_com_t1.itm_spec_grp_cd,
	mavm_itm_mst_mam_itm_com_t1.sls_upri_grp_cd,
	mavm_itm_mst_mam_itm_com_t1.bill_crryovr_times,
	mavm_itm_mst_mam_itm_com_t1.pay_crryovr_times,
	mavm_itm_mst_mam_itm_com_t1.slo_proc_flg,
	mavm_itm_mst_mam_itm_com_t1.slo_proc_typ,
	mavm_itm_mst_mam_itm_com_t1.ship_inst_typ,
	mavm_itm_mst_mam_itm_com_t1.ship_lot_back_stop_flg,
	mavm_itm_mst_mam_itm_com_t1.itm_ship_grp_cd,
	mavm_itm_mst_mam_itm_com_t1.ship_valid_grp_cd,
	mavm_itm_mst_mam_itm_com_t1.arr_skip_flg,
	mavm_itm_mst_mam_itm_com_t1.purc_dlv_slip_flg,
	mavm_itm_mst_mam_itm_com_t1.ship_term_cd,
	mavm_itm_mst_mam_itm_com_t1.exim_xpns_typ,
	mavm_itm_mst_mam_itm_com_t1.stk_lst_flg,
	mavm_itm_mst_mam_itm_com_t1.ver_flg,
	mavm_itm_mst_mam_itm_com_t1.sls_upri_cng_flg,
	mavm_itm_mst_mam_itm_com_t1.purc_upri_cng_flg,
	mavm_itm_mst_mam_itm_com_t1.prov_upri_cng_flg,
	mavm_itm_mst_mam_itm_com_t1.ref_itm_cd,
	mavm_itm_mst_mam_itm_com_t1.ref_itm_sub1,
	mavm_itm_mst_mam_itm_com_t1.ref_itm_sub2,
	mavm_itm_mst_mam_itm_com_t1.ref_itm_sub3,
	mavm_itm_mst_mam_itm_com_t1.ext_sys_no_itm,
	mavm_itm_mst_mam_itm_com_t1.chng_no,
	mavm_itm_mst_mam_itm_com_t1.calc_ptn_cd,
	mavm_itm_mst_mam_itm_com_t1.cost_std_qty,
	mavm_itm_mst_mam_itm_com_t1.itm_alc_grp,
	mavm_itm_mst_mam_itm_com_t1.sls_flg,
	mavm_itm_mst_mam_itm_com_t1.mfg_flg,
	mavm_itm_mst_mam_itm_com_t1.purc_flg,
	mavm_itm_mst_mam_itm_com_t1.insp_flg,
	mavm_itm_mst_mam_itm_com_t1.sls_input_flg,
	mavm_itm_mst_mam_itm_com_t1.mfg_input_flg,
	mavm_itm_mst_mam_itm_com_t1.purc_input_flg,
	mavm_itm_mst_mam_itm_com_t1.insp_input_flg,
	mavm_itm_mst_mam_itm_com_t1.release_flg,
	mavm_itm_mst_mam_itm_com_t1.release_usr_cd,
	mavm_itm_mst_mam_itm_com_t1.release_tm,
	mavm_itm_mst_mam_itm_com_t1.memo1,
	mavm_itm_mst_mam_itm_com_t1.memo2,
	mavm_itm_mst_mam_itm_com_t1.memo3,
	mavm_itm_mst_mam_itm_com_t1.del_flg,
	mavm_itm_mst_mam_itm_com_t1.del_usr_id,
	mavm_itm_mst_mam_itm_com_t1.del_usr_nm,
	mavm_itm_mst_mam_itm_com_t1.del_ts,
	mavm_itm_mst_mam_itm_com_t1.ins_usr_id,
	mavm_itm_mst_mam_itm_com_t1.ins_usr_nm,
	mavm_itm_mst_mam_itm_com_t1.ins_ts,
	mavm_itm_mst_mam_itm_com_t1.ins_func_id,
	mavm_itm_mst_mam_itm_com_t1.upd_cntr,
	mavm_itm_mst_mam_itm_com_t1.upd_usr_id,
	mavm_itm_mst_mam_itm_com_t1.upd_usr_nm,
	mavm_itm_mst_mam_itm_com_t1.upd_ts,
	mavm_itm_mst_mam_itm_com_t1.upd_func_id,
	mavm_itm_mst_mam_itm_com_t1.upd_srv_req_no,
	mavm_itm_mst_mam_itm_cmn_t2.itm_nm,
	mavm_itm_mst_mam_itm_cmn_t2.itm_alt_nm1,
	mavm_itm_mst_mam_itm_cmn_t2.itm_alt_nm2,
	mavm_itm_mst_mam_itm_cmn_t2.itm_alt_nm3,
	mavm_itm_mst_mam_itm_cmn_t2.itm_alt_nm4,
	mavm_itm_mst_mam_itm_cmn_t2.itm_grp_cd1,
	mavm_itm_mst_mam_itm_cmn_t2.itm_grp_cd2,
	mavm_itm_mst_mam_itm_cmn_t2.itm_grp_cd3,
	mavm_itm_mst_mam_itm_cmn_t2.itm_grp_cd4,
	mavm_itm_mst_mam_itm_cmn_t2.itm_grp_cd5,
	mavm_itm_mst_mam_itm_cmn_t2.itm_grp_cd6,
	mavm_itm_mst_mam_itm_cmn_t2.itm_grp_cd7,
	mavm_itm_mst_mam_itm_cmn_t2.itm_grp_cd8,
	mavm_itm_mst_mam_itm_cmn_t2.itm_grp_cd9,
	mavm_itm_mst_mam_itm_cmn_t2.itm_grp_cd10,
	mavm_itm_mst_mam_itm_cmn_t2.stk_mng_typ,
	mavm_itm_mst_mam_itm_cmn_t2.asset_mng_typ,
	mavm_itm_mst_mam_itm_cmn_t2.sundry_itm_flg,
	mavm_itm_mst_mam_itm_cmn_t2.dscnt_itm_flg,
	mavm_itm_mst_mam_itm_cmn_t2.unit_cd,
	mavm_itm_mst_mam_itm_cmn_t2.dec_place,
	mavm_itm_mst_mam_itm_cmn_t2.rnd_typ,
	mavm_itm_mst_mam_itm_cmn_t2.dim_unit_cd,
	mavm_itm_mst_mam_itm_cmn_t2.dim,
	mavm_itm_mst_mam_itm_cmn_t2.wt_unit_cd,
	mavm_itm_mst_mam_itm_cmn_t2.wt,
	mavm_itm_mst_mam_itm_cmn_t2.conts_unit_cd,
	mavm_itm_mst_mam_itm_cmn_t2.conts_qty,
	mavm_itm_mst_mam_itm_cmn_t2.unit_dim,
	mavm_itm_mst_mam_itm_cmn_t2.unit_wt,
	mavm_itm_mst_mam_itm_cmn_t2.hs_cd,
	mavm_itm_mst_mam_itm_cmn_t2.jan_typ,
	mavm_itm_mst_mam_itm_cmn_t2.jan_cd,
	mavm_itm_mst_mam_itm_cmn_t2.itf_cd,
	mavm_itm_mst_mam_itm_cmn_t2.gtin_cd,
	mavm_itm_mst_mam_itm_cmn_t2.th_image,
	mavm_itm_mst_mam_itm_cmn_t2.sls_itm_grp_cd,
		--品目名（ロケール１）
	(SELECT itm_nm 
		FROM mam_itm_lcl_cmn mavm_itm_mst_mam_itm_lcl_cmn_t
		WHERE 0=0
		AND	mavm_itm_mst_mam_itm_lcl_cmn_t.itm_cd = mavm_itm_mst_mam_itm_com_t1.itm_cd
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub1 = mavm_itm_mst_mam_itm_com_t1.itm_sub1
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub2 = mavm_itm_mst_mam_itm_com_t1.itm_sub2
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub3 = mavm_itm_mst_mam_itm_com_t1.itm_sub3
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	itm_nm_lcl1,
	--品目名（ロケール２） 
	(SELECT itm_nm 
		FROM mam_itm_lcl_cmn mavm_itm_mst_mam_itm_lcl_cmn_t
		WHERE 0=0
		AND	mavm_itm_mst_mam_itm_lcl_cmn_t.itm_cd = mavm_itm_mst_mam_itm_com_t1.itm_cd
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub1 = mavm_itm_mst_mam_itm_com_t1.itm_sub1
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub2 = mavm_itm_mst_mam_itm_com_t1.itm_sub2
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub3 = mavm_itm_mst_mam_itm_com_t1.itm_sub3
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.lcl_cd = 'en_US'
	)	itm_nm_lcl2,
	--品目名（ロケール３） 
	(SELECT itm_nm 
		FROM mam_itm_lcl_cmn mavm_itm_mst_mam_itm_lcl_cmn_t
		WHERE 0=0
		AND	mavm_itm_mst_mam_itm_lcl_cmn_t.itm_cd = mavm_itm_mst_mam_itm_com_t1.itm_cd
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub1 = mavm_itm_mst_mam_itm_com_t1.itm_sub1
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub2 = mavm_itm_mst_mam_itm_com_t1.itm_sub2
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub3 = mavm_itm_mst_mam_itm_com_t1.itm_sub3
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.lcl_cd = 'TBD3'
	)	itm_nm_lcl3,	
	--品目名（ロケール４） 
	(SELECT itm_nm 
		FROM mam_itm_lcl_cmn mavm_itm_mst_mam_itm_lcl_cmn_t
		WHERE 0=0
		AND	mavm_itm_mst_mam_itm_lcl_cmn_t.itm_cd = mavm_itm_mst_mam_itm_com_t1.itm_cd
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub1 = mavm_itm_mst_mam_itm_com_t1.itm_sub1
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub2 = mavm_itm_mst_mam_itm_com_t1.itm_sub2
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub3 = mavm_itm_mst_mam_itm_com_t1.itm_sub3
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.lcl_cd = 'TBD4'
	)	itm_nm_lcl4,	
	--品目名（ロケール５） 
	(SELECT itm_nm 
		FROM mam_itm_lcl_cmn mavm_itm_mst_mam_itm_lcl_cmn_t
		WHERE 0=0
		AND	mavm_itm_mst_mam_itm_lcl_cmn_t.itm_cd = mavm_itm_mst_mam_itm_com_t1.itm_cd
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub1 = mavm_itm_mst_mam_itm_com_t1.itm_sub1
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub2 = mavm_itm_mst_mam_itm_com_t1.itm_sub2
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.itm_sub3 = mavm_itm_mst_mam_itm_com_t1.itm_sub3
		AND mavm_itm_mst_mam_itm_lcl_cmn_t.lcl_cd = 'TBD5'
	)	itm_nm_lcl5
	FROM mam_itm_com mavm_itm_mst_mam_itm_com_t1
	LEFT OUTER JOIN mam_itm_cmn mavm_itm_mst_mam_itm_cmn_t2 ON (
			mavm_itm_mst_mam_itm_com_t1.itm_cd = mavm_itm_mst_mam_itm_cmn_t2.itm_cd
		AND	mavm_itm_mst_mam_itm_com_t1.itm_sub1 = mavm_itm_mst_mam_itm_cmn_t2.itm_sub1
		AND mavm_itm_mst_mam_itm_com_t1.itm_sub2 = mavm_itm_mst_mam_itm_cmn_t2.itm_sub2
		AND mavm_itm_mst_mam_itm_com_t1.itm_sub3 = mavm_itm_mst_mam_itm_cmn_t2.itm_sub3
	)
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_itm_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_itm_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_ITM')
		AND	mavm_itm_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

