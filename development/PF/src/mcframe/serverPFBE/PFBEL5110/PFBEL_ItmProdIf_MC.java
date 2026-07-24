package mcframe.serverPFBE.PFBEL5110;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPFBZ.PFBZL9020.*;
import mcframe.commonPFBE.PFBER5110.*;
import mcframe.commonPFBE.PFBER5110.PFBER_ItmProdPrnt;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBEL_ItmProdIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBEL_ItmProdIf_MC extends PFBEL_ItmProdIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmProdIf_Conv01オペレーション.<p>
	 *
	 */
	public class ItmProdIf_Conv01 extends PFBEL_ItmProdIf_MC_A.ItmProdIf_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		/**
		 * 送受信IFのレポートセットのインスタンスを生成します
		 * 
		 */
		@Override
		@SuppressWarnings("unchecked")
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class,
					MBT_ITM_SND_IF_R.class);
			_IfRptSet.setReportSet(PFBER_ItmProdPrnt.create());
			_IfRptSet.setRowMapper(new DtlR_MBT_ITM_SND_IF_R());
			_IfRptSet.setConvClass(this);
		}

		@Override
		protected void preWrite() {
			super.preWrite();
			setExeStsSkp();
		}

		/**
		 * 対応する取引先マスタがない送信ＩＦデータの実行状況区分にスキップを設定
		 */
		protected void setExeStsSkp() {
			MBT_ITM_SND_IF_R t = MBT_ITM_SND_IF_R.create("T");
			MAM_ITM_SRCH_R S1W = MAM_ITM_SRCH_R.create("W");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			// 前回のスキップのデータがあれば未処理に戻す
			dbc_bldr.setSet("exe_sts_typ", t.getColumn$("exe_sts_typ"), value(MAC_EXE_STS_TYP.NOT_EXE.value()));
			dbc_bldr.setWhere(t.data_no.eq(bindEx("data_no")));
			dbc_bldr.addWhereWithAnd(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.SKP.value())));
			dbUpdate("PFBEL5110_MBT_ITM_SND_IF_U01", up0(), dbc_bldr);

			// スキップ設定
			dbc_bldr.setSet("exe_sts_typ", t.getColumn$("exe_sts_typ"), value(MAC_EXE_STS_TYP.SKP.value()));
			dbc_bldr.setWhere(t.data_no.eq(bindEx("data_no")));
			dbc_bldr.addWhereWithAnd(t.data_crud_typ.neq(bind("1")),
					MAC_DATA_CRUD_TYP.DEL.value());
			dbc_bldr.addWhereWithAnd(notExists(subQuery().select(value("X")).from(S1W)
					.where(S1W.itm_cd.eq(t.itm_cd)
							.and(S1W.itm_sub1.eq(t.itm_sub1))
							.and(S1W.itm_sub2.eq(t.itm_sub2))
							.and(S1W.itm_sub3.eq(t.itm_sub3))
							.and(S1W.itm_typ.eq(value("2"))))));
			dbUpdate("PFBEL5110_MBT_ITM_SND_IF_U02", up0(), dbc_bldr);
		}

		@Override
		public void initCache(MCList<? extends MCDBContainer> ifL) {
			initItmCache((MCList<MBT_ITM_SND_IF_R>)ifL);
		}

		public class DtlR_MBT_ITM_SND_IF_R<D extends DtlR, S extends MBT_ITM_SND_IF_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_crud_typ, MBT_ITM_SND_IF_R.$data_crud_typ);
				addColumnPathMap(DtlR.$itm_cd, MBT_ITM_SND_IF_R.$itm_cd);
				addColumnPathMap(DtlR.$itm_sub1, MBT_ITM_SND_IF_R.$itm_sub1);
				addColumnPathMap(DtlR.$itm_sub2, MBT_ITM_SND_IF_R.$itm_sub2);
				addColumnPathMap(DtlR.$itm_sub3, MBT_ITM_SND_IF_R.$itm_sub3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.co_cd(getCo().co_cd());

				if (MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
					return;
				}

				MAM_ITM_SRCH_R r = getItmR(dest.itm_cd(), dest.itm_sub1(), dest.itm_sub2(), dest.itm_sub3());
				if (r == null) {
					return;
				}
				// 品目マスタから(MAM_ITM_SRCH)
				dest.itm_nm(r.itm_nm());
				dest.itm_alt_nm1(r.base_itm_alt_nm1());
				dest.itm_alt_nm2(r.base_itm_alt_nm2());
				dest.itm_alt_nm3(r.base_itm_alt_nm3());
				dest.itm_alt_nm4(r.base_itm_alt_nm4());
				dest.itm_grp_cd1(r.itm_grp_cd1());
				dest.itm_grp_cd2(r.itm_grp_cd2());
				dest.itm_grp_cd3(r.itm_grp_cd3());
				dest.itm_grp_cd4(r.itm_grp_cd4());
				dest.itm_grp_cd5(r.itm_grp_cd5());
				dest.itm_grp_cd6(r.itm_grp_cd6());
				dest.itm_grp_cd7(r.itm_grp_cd7());
				dest.itm_grp_cd8(r.itm_grp_cd8());
				dest.itm_grp_cd9(r.itm_grp_cd9());
				dest.itm_grp_cd10(r.itm_grp_cd10());
				dest.stk_mng_typ(r.stk_mng_typ());
				dest.asset_mng_typ(r.asset_mng_typ());
				dest.sundry_itm_flg(r.sundry_itm_flg());
				dest.dscnt_itm_flg(r.dscnt_itm_flg());
				dest.unit_cd(r.unit_cd());
				dest.dec_place(r.dec_place());
				dest.rnd_typ(r.rnd_typ());
				dest.dim_unit_cd(r.dim_unit_cd());
				dest.dim(r.dim());
				dest.wt_unit_cd(r.wt_unit_cd());
				dest.wt(r.wt());
				dest.conts_unit_cd(r.conts_unit_cd());
				dest.conts_qty(r.conts_qty());
				dest.unit_dim(r.unit_dim());
				dest.unit_wt(r.unit_wt());
				dest.hs_cd(r.hs_cd());
				dest.jan_typ(r.jan_typ());
				dest.jan_cd(r.jan_cd());
				dest.itf_cd(r.itf_cd());
				dest.gtin_cd(r.gtin_cd());
				dest.sls_itm_grp_cd(r.sls_itm_grp_cd());
				dest.memo1_c(r.memo1_c());
				dest.memo2_c(r.memo2_c());
				dest.memo3_c(r.memo3_c());
				dest.itm_typ(r.itm_typ());
				dest.itm_typ_d_cd(r.itm_typ_d_cd());
				dest.itm_jnl_cd(r.itm_jnl_cd());
				dest.ac_itm_grp_cd(r.ac_itm_grp_cd());
				dest.minus_stk_flg(r.minus_stk_flg());
				dest.not_new_lot_flg(r.not_new_lot_flg());
				dest.gi_alloc_flg(r.gi_alloc_flg());
				dest.ship_unit_cd(r.ship_unit_cd());
				dest.mfg_unit_cd(r.mfg_unit_cd());
				dest.purc_unit_cd(r.purc_unit_cd());
				dest.po_schd_unit_cd(r.po_schd_unit_cd());
				dest.pack_alloc_flg(r.pack_alloc_flg());
				dest.pckg_unit_cd(r.pckg_unit_cd());
				dest.lot_mng_typ(r.lot_mng_typ());
				dest.lot_no_typ(r.lot_no_typ());
				dest.lot_no_ptn_cd(r.lot_no_ptn_cd());
				dest.sublot_mng_typ(r.sublot_mng_typ());
				dest.sublot_no_typ(r.sublot_no_typ());
				dest.sublot_no_ptn_cd(r.sublot_no_ptn_cd());
				dest.bp_lot_flg(r.bp_lot_flg());
				dest.insp_bind_typ(r.insp_bind_typ());
				dest.skip_chk_ship_flg(r.skip_chk_ship_flg());
				dest.mrkt_judg_flg(r.mrkt_judg_flg());
				dest.mrkt_judg_role_cd(r.mrkt_judg_role_cd());
				dest.mrkt_judg_upd_role_cd(r.mrkt_judg_upd_role_cd());
				dest.lmt_ctl_flg(r.lmt_ctl_flg());
				dest.lmt_ctl_categ(r.lmt_ctl_categ());
				dest.cont_fctr_flg(r.cont_fctr_flg());
				dest.std_cont_fctr(r.std_cont_fctr());
				dest.cont_fctr_unit_cd(r.cont_fctr_unit_cd());
				dest.cont_fctr_rnd_typ(r.cont_fctr_rnd_typ());
				dest.cont_fctr_dec_place(r.cont_fctr_dec_place());
				dest.sno1_mng_typ(r.sno1_mng_typ());
				dest.slo_sno1_flg(r.slo_sno1_flg());
				dest.rqmt_sno1_flg(r.rqmt_sno1_flg());
				dest.sno1_num_typ(r.sno1_num_typ());
				dest.sno1_ptn_cd(r.sno1_ptn_cd());
				dest.sno2_mng_typ(r.sno2_mng_typ());
				dest.slo_sno2_flg(r.slo_sno2_flg());
				dest.rqmt_sno2_flg(r.rqmt_sno2_flg());
				dest.sno2_num_typ(r.sno2_num_typ());
				dest.sno2_ptn_cd(r.sno2_ptn_cd());
				dest.sno3_mng_typ(r.sno3_mng_typ());
				dest.slo_sno3_flg(r.slo_sno3_flg());
				dest.rqmt_sno3_flg(r.rqmt_sno3_flg());
				dest.sno3_num_typ(r.sno3_num_typ());
				dest.sno3_ptn_cd(r.sno3_ptn_cd());
				dest.sno4_mng_typ(r.sno4_mng_typ());
				dest.slo_sno4_flg(r.slo_sno4_flg());
				dest.rqmt_sno4_flg(r.rqmt_sno4_flg());
				dest.sno4_num_typ(r.sno4_num_typ());
				dest.sno4_ptn_cd(r.sno4_ptn_cd());
				dest.def_bom_ptn(r.def_bom_ptn());
				dest.mfg_inst_unit_typ(r.mfg_inst_unit_typ());
				dest.mrp_proc_typ(r.mrp_proc_typ());
				dest.rqmt_typ(r.rqmt_typ());
				dest.prod_pln_typ(r.prod_pln_typ());
				dest.dmnd_date_div_mons(r.dmnd_date_div_mons());
				dest.alloc_margin_days(r.alloc_margin_days());
				dest.mrp_alloc_margin_days(r.mrp_alloc_margin_days());
				dest.mrp_opn_xfr_days(r.mrp_opn_xfr_days());
				dest.rqmt_rstr_qty(r.rqmt_rstr_qty());
				dest.inpt_itm_add_flg(r.inpt_itm_add_flg());
				dest.inpt_itm_del_flg(r.inpt_itm_del_flg());
				dest.sch_flg(r.sch_flg());
				dest.cntry_org_cd(r.cntry_org_cd());
				dest.comp_spec_typ(r.comp_spec_typ());
				dest.comp_rev_at_slo_flg(r.comp_rev_at_slo_flg());
				dest.comp_core_itm_flg(r.comp_core_itm_flg());
				dest.itm_spec_grp_cd(r.itm_spec_grp_cd());
				dest.sls_upri_grp_cd(r.sls_upri_grp_cd());
				dest.bill_crryovr_times(r.bill_crryovr_times());
				dest.pay_crryovr_times(r.pay_crryovr_times());
				dest.slo_proc_flg(r.slo_proc_flg());
				dest.slo_proc_typ(r.slo_proc_typ());
				dest.ship_inst_typ(r.ship_inst_typ());
				dest.ship_lot_back_stop_flg(r.ship_lot_back_stop_flg());
				dest.itm_ship_grp_cd(r.itm_ship_grp_cd());
				dest.ship_valid_grp_cd(r.ship_valid_grp_cd());
				dest.arr_skip_flg(r.arr_skip_flg());
				dest.ship_term_cd(r.ship_term_cd());
				dest.exim_xpns_typ(r.exim_xpns_typ());
				dest.stk_lst_flg(r.stk_lst_flg());
				dest.ver_flg(r.ver_flg());
				dest.sls_upri_cng_flg(r.sls_upri_cng_flg());
				dest.purc_upri_cng_flg(r.purc_upri_cng_flg());
				dest.prov_upri_cng_flg(r.prov_upri_cng_flg());
				dest.ext_sys_no_itm(r.ext_sys_no_itm());
				dest.chng_no(r.chng_no());
				dest.calc_ptn_cd(r.calc_ptn_cd());
				dest.cost_std_qty(r.cost_std_qty());
				dest.itm_alc_grp(r.itm_alc_grp());
				dest.memo1(r.memo1());
				dest.memo2(r.memo2());
				dest.memo3(r.memo3());
				dest.del_flg(r.del_flg());
				// 品目マスタロケールから
				dest.itm_nm_en(r.getString("itm_nm_en"));
				dest.itm_alt_nm1_en(r.getString("itm_alt_nm1_en"));
				dest.itm_alt_nm2_en(r.getString("itm_alt_nm2_en"));
				dest.itm_alt_nm3_en(r.getString("itm_alt_nm3_en"));
				dest.itm_alt_nm4_en(r.getString("itm_alt_nm4_en"));
				// ファンクションから
				dest.sls_tax_cd(r.sls_tax_cd());
				dest.new_sls_tax_cd(r.getString("new_sls_tax_cd"));
				dest.new_sls_tax_dt(r.getDate("new_sls_tax_dt"));
				dest.purc_tax_cd(r.purc_tax_cd());
				dest.new_purc_tax_cd(r.getString("new_purc_tax_cd"));
				dest.new_purc_tax_dt(r.getDate("new_purc_tax_dt"));
				dest.prov_tax_cd(r.prov_tax_cd());
				dest.new_prov_tax_cd(r.getString("new_prov_tax_cd"));
				dest.new_prov_tax_dt(r.getDate("new_prov_tax_dt"));
				dest.wtax_rate(r.wtax_rate());
				// 取引先マスタ送信IFテーブルから
				dest.if_sub_char1(src.if_sub_char1());
				dest.if_sub_char2(src.if_sub_char2());
				dest.if_sub_char3(src.if_sub_char3());
				dest.if_sub_char4(src.if_sub_char4());
				dest.if_sub_char5(src.if_sub_char5());
				dest.if_sub_char6(src.if_sub_char6());
				dest.if_sub_char7(src.if_sub_char7());
				dest.if_sub_char8(src.if_sub_char8());
				dest.if_sub_char9(src.if_sub_char9());
				dest.if_sub_char10(src.if_sub_char10());
				dest.if_sub_char11(src.if_sub_char11());
				dest.if_sub_char12(src.if_sub_char12());
				dest.if_sub_char13(src.if_sub_char13());
				dest.if_sub_char14(src.if_sub_char14());
				dest.if_sub_char15(src.if_sub_char15());
				dest.if_sub_char16(src.if_sub_char16());
				dest.if_sub_char17(src.if_sub_char17());
				dest.if_sub_char18(src.if_sub_char18());
				dest.if_sub_char19(src.if_sub_char19());
				dest.if_sub_char20(src.if_sub_char20());
				dest.if_sub_char21(src.if_sub_char21());
				dest.if_sub_char22(src.if_sub_char22());
				dest.if_sub_char23(src.if_sub_char23());
				dest.if_sub_char24(src.if_sub_char24());
				dest.if_sub_char25(src.if_sub_char25());
				dest.if_sub_char26(src.if_sub_char26());
				dest.if_sub_char27(src.if_sub_char27());
				dest.if_sub_char28(src.if_sub_char28());
				dest.if_sub_char29(src.if_sub_char29());
				dest.if_sub_char30(src.if_sub_char30());
				dest.if_sub_num1(src.if_sub_num1());
				dest.if_sub_num2(src.if_sub_num2());
				dest.if_sub_num3(src.if_sub_num3());
				dest.if_sub_num4(src.if_sub_num4());
				dest.if_sub_num5(src.if_sub_num5());
				dest.if_sub_dt1(src.if_sub_dt1());
				dest.if_sub_dt2(src.if_sub_dt2());
				dest.if_sub_dt3(src.if_sub_dt3());
				dest.if_sub_dt4(src.if_sub_dt4());
				dest.if_sub_dt5(src.if_sub_dt5());			}
		}
	}
	protected static final Class<PFBEL_ItmProdIf> CLAZZ = PFBEL_ItmProdIf.class;

	/**
	 * 「MAM_BP_」取得
	 */
	MCList<MAM_ITM_SRCH_R> _itmL;
	MCIndexKey _itmKey;

	protected void initItmCache(MCList<MBT_ITM_SND_IF_R> ifL) {
		MAM_ITM_SRCH_R t = MAM_ITM_SRCH_R.create("T");
		MAM_ITM_LCL_R li = MAM_ITM_LCL_R.create("LI");
		MBT_ITM_SND_IF_R S1W1 = MBT_ITM_SND_IF_R.create("W1");
		PFW_SDRV_IF_R S1W2 = PFW_SDRV_IF_R.create("W2");

		MCList<MAM_ITM_SRCH_R> dbc = MCList.create(MAM_ITM_SRCH_R.class);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.itm_nm,
				t.base_itm_alt_nm1, t.base_itm_alt_nm2, t.base_itm_alt_nm3, t.base_itm_alt_nm4,
				t.itm_grp_cd1, t.itm_grp_cd2, t.itm_grp_cd3, t.itm_grp_cd4, t.itm_grp_cd5,
				t.itm_grp_cd6, t.itm_grp_cd7, t.itm_grp_cd8, t.itm_grp_cd9,
				t.itm_grp_cd10, t.stk_mng_typ, t.asset_mng_typ, t.sundry_itm_flg,
				t.dscnt_itm_flg, t.unit_cd, t.dec_place, t.rnd_typ, t.dim_unit_cd, t.dim,
				t.wt_unit_cd, t.wt, t.conts_unit_cd, t.conts_qty, t.unit_dim, t.unit_wt,
				t.hs_cd, t.jan_typ, t.jan_cd, t.itf_cd, t.gtin_cd, t.sls_itm_grp_cd,
				t.memo1_c, t.memo2_c, t.memo3_c, t.itm_typ, t.itm_typ_d_cd, t.itm_jnl_cd,
				t.ac_itm_grp_cd, t.minus_stk_flg, t.not_new_lot_flg, t.gi_alloc_flg,
				t.ship_unit_cd, t.mfg_unit_cd, t.purc_unit_cd, t.po_schd_unit_cd,
				t.pack_alloc_flg, t.pckg_unit_cd, t.lot_mng_typ, t.lot_no_typ,
				t.lot_no_ptn_cd, t.sublot_mng_typ, t.sublot_no_typ, t.sublot_no_ptn_cd,
				t.bp_lot_flg, t.insp_bind_typ, t.skip_chk_ship_flg, t.mrkt_judg_flg,
				t.mrkt_judg_role_cd, t.mrkt_judg_upd_role_cd, t.lmt_ctl_flg,
				t.lmt_ctl_categ, t.cont_fctr_flg, t.std_cont_fctr, t.cont_fctr_unit_cd,
				t.cont_fctr_rnd_typ, t.cont_fctr_dec_place, t.sno1_mng_typ,
				t.slo_sno1_flg, t.rqmt_sno1_flg, t.sno1_num_typ, t.sno1_ptn_cd,
				t.sno2_mng_typ, t.slo_sno2_flg, t.rqmt_sno2_flg, t.sno2_num_typ,
				t.sno2_ptn_cd, t.sno3_mng_typ, t.slo_sno3_flg, t.rqmt_sno3_flg,
				t.sno3_num_typ, t.sno3_ptn_cd, t.sno4_mng_typ, t.slo_sno4_flg,
				t.rqmt_sno4_flg, t.sno4_num_typ, t.sno4_ptn_cd, t.def_bom_ptn,
				t.mfg_inst_unit_typ, t.mrp_proc_typ, t.rqmt_typ, t.prod_pln_typ,
				t.dmnd_date_div_mons, t.alloc_margin_days, t.mrp_alloc_margin_days,
				t.mrp_opn_xfr_days, t.rqmt_rstr_qty, t.inpt_itm_add_flg,
				t.inpt_itm_del_flg, t.sch_flg, t.cntry_org_cd, t.comp_spec_typ,
				t.comp_rev_at_slo_flg, t.comp_core_itm_flg, t.itm_spec_grp_cd,
				t.sls_upri_grp_cd, t.bill_crryovr_times, t.pay_crryovr_times,
				t.slo_proc_flg, t.slo_proc_typ, t.ship_inst_typ, t.ship_lot_back_stop_flg,
				t.itm_ship_grp_cd, t.ship_valid_grp_cd, t.arr_skip_flg, t.ship_term_cd,
				t.exim_xpns_typ, t.stk_lst_flg, t.ver_flg, t.sls_upri_cng_flg,
				t.purc_upri_cng_flg, t.prov_upri_cng_flg, t.ext_sys_no_itm, t.chng_no,
				t.calc_ptn_cd, t.cost_std_qty, t.itm_alc_grp, t.memo1, t.memo2, t.memo3,
				t.del_flg);
		dbc_bldr.addSelect(MAPA_TAX$F_GET_SLS_TAX_CD(t.itm_cd, t.itm_sub1, t.itm_sub2,
				t.itm_sub3, nullValue(), bind("today")).as("sls_tax_cd"));
		dbc_bldr.addSelect(MAPA_TAX$F_GET_NEW_SLS_TAX_CD(t.itm_cd, t.itm_sub1, t.itm_sub2,
				t.itm_sub3, nullValue(), bind("today")).as("new_sls_tax_cd"));
		dbc_bldr.addSelect(MAPA_TAX$F_GET_NEW_SLS_TAX_DT(t.itm_cd, t.itm_sub1, t.itm_sub2,
				t.itm_sub3, nullValue(), bind("today")).as("new_sls_tax_dt"));
		dbc_bldr.addSelect(MAPA_TAX$F_GET_PURC_TAX_CD(t.itm_cd, t.itm_sub1, t.itm_sub2,
				t.itm_sub3, nullValue(), bind("today")).as("purc_tax_cd"));
		dbc_bldr.addSelect(MAPA_TAX$F_GET_NEW_PURC_TAX_CD(t.itm_cd, t.itm_sub1,
				t.itm_sub2, t.itm_sub3, nullValue(), bind("today")).as("new_purc_tax_cd"));
		dbc_bldr.addSelect(MAPA_TAX$F_GET_NEW_PURC_TAX_DT(t.itm_cd, t.itm_sub1,
				t.itm_sub2, t.itm_sub3, nullValue(), bind("today")).as("new_purc_tax_dt"));
		dbc_bldr.addSelect(MAPA_TAX$F_GET_PROV_TAX_CD(t.itm_cd, t.itm_sub1, t.itm_sub2,
				t.itm_sub3, nullValue(), bind("today")).as("prov_tax_cd"));
		dbc_bldr.addSelect(MAPA_TAX$F_GET_NEW_PROV_TAX_CD(t.itm_cd, t.itm_sub1,
				t.itm_sub2, t.itm_sub3, nullValue(), bind("today")).as("new_prov_tax_cd"));
		dbc_bldr.addSelect(MAPA_TAX$F_GET_NEW_PROV_TAX_DT(t.itm_cd, t.itm_sub1,
				t.itm_sub2, t.itm_sub3, nullValue(), bind("today")).as("new_prov_tax_dt"));
		dbc_bldr.addSelect(MAPA_TAX$F_GET_WTAX_RATE(t.itm_cd, t.itm_sub1, t.itm_sub2,
				t.itm_sub3, bind("today")).as("wtax_rate"));
		dbc_bldr.addSelect(li.itm_nm.as("itm_nm_en"));
		dbc_bldr.addSelect(li.itm_alt_nm1.as("itm_alt_nm1_en"));
		dbc_bldr.addSelect(li.itm_alt_nm2.as("itm_alt_nm2_en"));
		dbc_bldr.addSelect(li.itm_alt_nm3.as("itm_alt_nm3_en"));
		dbc_bldr.addSelect(li.itm_alt_nm4.as("itm_alt_nm4_en"));
		dbc_bldr.addLeftOuterJoin(li,
				bracket(li.itm_cd.eq(t.itm_cd)
						.and(li.itm_sub1.eq(t.itm_sub1))
						.and(li.itm_sub2.eq(t.itm_sub2))
						.and(li.itm_sub3.eq(t.itm_sub3))
						.and(li.lcl_cd.eq(value("en_US")))));
		dbc_bldr.setWhere(t.itm_typ.eq(value("2")));
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X"))
				.from(S1W1.innerJoin(S1W2).on(S1W2.data_no.eq(S1W1.data_no)))
				.where(S1W1.itm_cd.eq(t.itm_cd)
						.and(S1W1.itm_sub1.eq(t.itm_sub1))
						.and(S1W1.itm_sub2.eq(t.itm_sub2))
						.and(S1W1.itm_sub3.eq(t.itm_sub3))
						.and(S1W1.ext_master_typ.eq(value(MAC_EXT_MASTER_TYP.PROD_ITM.value())))
						.and(value(MAC_DATA_CRUD_TYP.DEL.value()).neq(S1W1.data_crud_typ)))));
		dbc_bldr.addOrderByAsc(t.itm_cd);
		dbc_bldr.addOrderByAsc(t.itm_sub1);
		dbc_bldr.addOrderByAsc(t.itm_sub2);
		dbc_bldr.addOrderByAsc(t.itm_sub3);
		if(!isNull(ifL)) {
			MCList<MAW_ITM_KEY_R> itmKeyL = MCList.create(MAW_ITM_KEY_R.class);
			addAll(itmKeyL, ifL, createMap_MAW_ITM_KEY_R_MBT_ITM_SND_IF_R());
			
			MCQueryApiBuilder itmKeyL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("ITM"));
			dbWkDelete("PFBEL5110_MAW_ITM_KEY_D01", itmKeyL_bldr.getBaseDbc());
			dbWkInsert("PFBEL5110_MAW_ITM_KEY_I01", itmKeyL, itmKeyL_bldr.getBaseDbc());
			
			MAW_ITM_KEY_R itmKeyT = MAW_ITM_KEY_R.create("ITMKEY");
			dbc_bldr.addInnerJoin(itmKeyT, 
				bracket(itmKeyT.itm_cd.eq(t.itm_cd)
						.and(itmKeyT.itm_sub1.eq(t.itm_sub1))
						.and(itmKeyT.itm_sub2.eq(t.itm_sub2))
						.and(itmKeyT.itm_sub3.eq(t.itm_sub3))
						)
				);
		}
		MCRow bindR = MCRow.create();
		bindR.addDateColumn("TODAY", getToday());
		dbSelect("PFBEL5110_MAM_ITM_SRCH_S01", dbc, dbc_bldr, bindR);

		// インデックス作成
		object(CLAZZ)._itmL = dbc;
		object(CLAZZ)._itmKey = object(CLAZZ)._itmL.createIndex(MAM_ITM_SRCH_R.$itm_cd,
				MAM_ITM_SRCH_R.$itm_sub1, MAM_ITM_SRCH_R.$itm_sub2,
				MAM_ITM_SRCH_R.$itm_sub3);

	}

	protected MAM_ITM_SRCH_R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		if (object(CLAZZ)._itmL == null) {
			initItmCache(null);
		}
		return object(CLAZZ)._itmL.getFirst(object(CLAZZ)._itmKey, itmCd, itmSub1, itmSub2, itmSub3);
	}

	protected Map_MAW_ITM_KEY_R_MBT_ITM_SND_IF_R<MAW_ITM_KEY_R,MBT_ITM_SND_IF_R> createMap_MAW_ITM_KEY_R_MBT_ITM_SND_IF_R() {
		return new Map_MAW_ITM_KEY_R_MBT_ITM_SND_IF_R<MAW_ITM_KEY_R, MBT_ITM_SND_IF_R>();
	}

	public class Map_MAW_ITM_KEY_R_MBT_ITM_SND_IF_R<D extends MAW_ITM_KEY_R, S extends MBT_ITM_SND_IF_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAW_ITM_KEY_R.$itm_cd, MBT_ITM_SND_IF_R.$itm_cd);
			addColumnPathMap(MAW_ITM_KEY_R.$itm_sub1, MBT_ITM_SND_IF_R.$itm_sub1);
			addColumnPathMap(MAW_ITM_KEY_R.$itm_sub2, MBT_ITM_SND_IF_R.$itm_sub2);
			addColumnPathMap(MAW_ITM_KEY_R.$itm_sub3, MBT_ITM_SND_IF_R.$itm_sub3);
		}
	}

	//FMCB CUSTOM END
}