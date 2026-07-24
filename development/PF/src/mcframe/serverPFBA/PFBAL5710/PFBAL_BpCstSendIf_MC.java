package mcframe.serverPFBA.PFBAL5710;

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
import mcframe.commonPFBA.PFBAR5710.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBAL_BpCstSendIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBAL_BpCstSendIf_MC extends PFBAL_BpCstSendIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * BpCstIf_Conv01オペレーション.<p>
	 *
	 */
	public class BpCstIf_Conv01 extends PFBAL_BpCstSendIf_MC_A.BpCstIf_Conv01 {
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
					MBT_BP_SND_IF_R.class);
			_IfRptSet.setReportSet(PFBAR_BpCstPrnt.create());
			_IfRptSet.setRowMapper(new DtlR_MBT_BP_SND_IF_R());
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
			MBT_BP_SND_IF_R t = MBT_BP_SND_IF_R.create("T");
			MAM_BP_R S1W = MAM_BP_R.create("W");

			
			
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			// 前回のスキップのデータがあれば未処理に戻す
			t.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
			dbc_bldr.setSet(t.exe_sts_typ);
			dbc_bldr.setWhere(t.data_no.eq(bind("1")), up0().get(0).data_no());
			dbc_bldr.addWhereWithAnd(t.exe_sts_typ.eq(bind("1")),
					MAC_EXE_STS_TYP.SKP.value());
			dbUpdate("PFBAL5710_MBT_BP_SND_IF_U01", t, dbc_bldr);

			// スキップ設定
			t.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
			dbc_bldr.setWhere(t.data_no.eq(bind("1")), up0().get(0).data_no());
			dbc_bldr.addWhereWithAnd(t.data_crud_typ.neq(bind("1")),
					MAC_DATA_CRUD_TYP.DEL.value());
			dbc_bldr.addWhereWithAnd(notExists(subQuery().select(value("X")).from(S1W)
					.where(S1W.bp_cd.eq(t.bp_cd)
							.and(S1W.cst_flg.eq(value(true))))));
			dbUpdate("PFBAL5710_MBT_BP_SND_IF_U02", t, dbc_bldr);

		}

		public class DtlR_MBT_BP_SND_IF_R<D extends DtlR, S extends MBT_BP_SND_IF_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {

				addColumnPathMap(DtlR.$data_crud_typ, MBT_BP_SND_IF_R.$data_crud_typ);
				addColumnPathMap(DtlR.$bp_cd, MBT_BP_SND_IF_R.$bp_cd);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.co_cd(getCo().co_cd());

				if (MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
					return;
				}

				MAM_BP_R r = getBpR(dest.bp_cd());
				if (r == null) {
					return;
				}

				dest.bp_nm(r.bp_nm());
				dest.bp_alt_nm1(r.bp_alt_nm1());
				dest.bp_alt_nm2(r.bp_alt_nm2());
				dest.bp_alt_nm3(r.bp_alt_nm3());
				dest.bp_alt_nm4(r.bp_alt_nm4());
				dest.zip_cd(r.zip_cd());
				dest.addr1(r.addr1());
				dest.addr2(r.addr2());
				dest.addr3(r.addr3());
				dest.addr4(r.addr4());
				dest.tel(r.tel());
				dest.fax(r.fax());
				dest.ein(r.ein());
				dest.std_co_cd(r.std_co_cd());
				dest.cntry_cd(r.cntry_cd());
				dest.area_cd(r.area_cd());
				dest.cur_cd(r.cur_cd());
				dest.prnt_lcl_cd(r.prnt_lcl_cd());
				dest.bp_grp_cd1(r.bp_grp_cd1());
				dest.bp_grp_cd2(r.bp_grp_cd2());
				dest.bp_grp_cd3(r.bp_grp_cd3());
				dest.bp_grp_cd4(r.bp_grp_cd4());
				dest.bp_grp_cd5(r.bp_grp_cd5());
				dest.bp_grp_cd6(r.bp_grp_cd6());
				dest.bp_grp_cd7(r.bp_grp_cd7());
				dest.bp_grp_cd8(r.bp_grp_cd8());
				dest.bp_grp_cd9(r.bp_grp_cd9());
				dest.bp_grp_cd10(r.bp_grp_cd10());
				dest.bp_alc_grp(r.bp_alc_grp());
				dest.cst_flg(r.cst_flg());
				dest.acst_flg(r.acst_flg());
				dest.bcst_flg(r.bcst_flg());
				dest.rcst_flg(r.rcst_flg());
				dest.sppl_flg(r.sppl_flg());
				dest.asppl_flg(r.asppl_flg());
				dest.bsppl_flg(r.bsppl_flg());
				dest.psppl_flg(r.psppl_flg());
				dest.cred_flg(r.cred_flg());
				dest.dlv_flg(r.dlv_flg());
				dest.maker_flg(r.maker_flg());
				dest.dest_flg(r.dest_flg());
				dest.acst_cd(r.acst_cd());
				dest.cst_cntct_dpt(r.cst_cntct_dpt());
				dest.cst_cntct_psn(r.cst_cntct_psn());
				dest.cst_cntct_psn_title(r.cst_cntct_psn_title());
				dest.cst_sundry_flg(r.cst_sundry_flg());
				dest.sls_upri_req_typ(r.sls_upri_req_typ());
				dest.sls_upri_cng_flg(r.sls_upri_cng_flg());
				dest.sls_upri_rnd_typ(r.sls_upri_rnd_typ());
				dest.sls_amt_rnd_typ(r.sls_amt_rnd_typ());
				dest.sls_tax_calc_typ(r.sls_tax_calc_typ());
				dest.sls_tax_rnd_typ(r.sls_tax_rnd_typ());
				dest.sls_basis_typ(r.sls_basis_typ());
				dest.bill_basis_typ(r.bill_basis_typ());
				dest.ship_schd_split_typ(r.ship_schd_split_typ());
				dest.bill_crryovr_times(r.bill_crryovr_times());
				dest.lot_back_stop_typ(r.lot_back_stop_typ());
				dest.slip_each_lot_typ(r.slip_each_lot_typ());
				dest.cst_ship_form_cd(r.cst_ship_form_cd());
				dest.stk_lst_issue_flg(r.stk_lst_issue_flg());
				dest.stk_lst_form_cd(r.stk_lst_form_cd());
				dest.sls_tax_cd(r.sls_tax_cd());
				dest.sls_tax_cd_prio_flg(r.sls_tax_cd_prio_flg());
				dest.wrk_ar_flg(r.wrk_ar_flg());
				dest.cst_iv_flg(r.cst_iv_flg());
				dest.cst_tterm_cd1(r.cst_tterm_cd1());
				dest.cst_tterm_cd2(r.cst_tterm_cd2());
				dest.cst_tterm_cd3(r.cst_tterm_cd3());
				dest.sls_anly_cd1(r.sls_anly_cd1());
				dest.sls_anly_cd2(r.sls_anly_cd2());
				dest.sls_anly_cd3(r.sls_anly_cd3());
				dest.not_lg_mix_flg(r.not_lg_mix_flg());
				dest.not_lot_mix_flg(r.not_lot_mix_flg());
				dest.not_sublot_mix_flg(r.not_sublot_mix_flg());
				dest.bcst_cd(r.bcst_cd());
				dest.memo1(r.memo1());
				dest.memo2(r.memo2());
				dest.memo3(r.memo3());
				dest.memo4(r.memo4());
				dest.memo5(r.memo5());
				dest.memo6(r.memo6());
				dest.memo7(r.memo7());
				dest.memo8(r.memo8());
				dest.memo9(r.memo9());
				dest.memo10(r.memo10());
				dest.memo11(r.memo11());
				dest.memo12(r.memo12());
				dest.memo13(r.memo13());
				dest.memo14(r.memo14());
				dest.memo15(r.memo15());
				dest.memo16(r.memo16());
				dest.memo17(r.memo17());
				dest.memo18(r.memo18());
				dest.memo19(r.memo19());
				dest.memo20(r.memo20());
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
				dest.if_sub_dt5(src.if_sub_dt5());
				dest.biz_co_no(r.biz_co_no());

			}
		}
	}

	protected static final Class<PFBAL_BpCstSendIf> CLAZZ = PFBAL_BpCstSendIf.class;

	/**
	 * 「MAM_BP_」取得
	 */
	MCList<MAM_BP_R> _bpL;

	MCIndexKey _bpKey;

	protected void initBpCache() {
		MAM_BP_R t = MAM_BP_R.create("T");
		MAM_BP_R acst = MAM_BP_R.create("ACST");
		MBT_BP_SND_IF_R S1W1 = MBT_BP_SND_IF_R.create("W1");
		PFW_SDRV_IF_R S1W2 = PFW_SDRV_IF_R.create("W2");

		MCList<MAM_BP_R> dbc = MCList.create(MAM_BP_R.class);

		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.bp_cd, t.bp_nm, t.bp_alt_nm1, t.bp_alt_nm2, t.bp_alt_nm3,
				t.bp_alt_nm4, t.ein, t.std_co_cd, t.cntry_cd, t.area_cd, t.cur_cd,
				t.prnt_lcl_cd, t.bp_grp_cd1, t.bp_grp_cd2, t.bp_grp_cd3, t.bp_grp_cd4,
				t.bp_grp_cd5, t.bp_grp_cd6, t.bp_grp_cd7, t.bp_grp_cd8, t.bp_grp_cd9,
				t.bp_grp_cd10, t.bp_alc_grp, t.cst_flg, t.acst_flg, t.bcst_flg,
				t.rcst_flg, t.sppl_flg, t.asppl_flg, t.bsppl_flg, t.psppl_flg, t.cred_flg,
				t.dlv_flg, t.maker_flg, t.dest_flg, t.acst_cd, t.cst_sundry_flg,
				t.sls_upri_req_typ, t.sls_upri_cng_flg, t.sls_upri_rnd_typ,
				t.sls_amt_rnd_typ, t.sls_tax_calc_typ, t.sls_tax_rnd_typ, t.sls_basis_typ,
				t.bill_basis_typ, t.ship_schd_split_typ, t.bill_crryovr_times,
				t.lot_back_stop_typ, t.slip_each_lot_typ, t.cst_ship_form_cd,
				t.stk_lst_issue_flg, t.stk_lst_form_cd, t.sls_tax_cd,
				t.sls_tax_cd_prio_flg, t.wrk_ar_flg, t.cst_iv_flg, t.cst_tterm_cd1,
				t.cst_tterm_cd2, t.cst_tterm_cd3, t.sls_anly_cd1, t.sls_anly_cd2,
				t.sls_anly_cd3, t.not_lg_mix_flg, t.not_lot_mix_flg, t.not_sublot_mix_flg, t.memo1, t.memo2, t.memo3,t.memo4, t.memo5, t.memo6, t.memo7, t.memo8, t.memo9, t.memo10, t.memo11,
				t.memo12, t.memo13, t.memo14, t.memo15, t.memo16, t.memo17, t.memo18, t.memo19, t.memo20, t.biz_co_no);
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.ZIP_CD.value())).as("zip_cd"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.ADDR1.value())).as("addr1"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.ADDR2.value())).as("addr2"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.ADDR3.value())).as("addr3"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.ADDR4.value())).as("addr4"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.TEL.value())).as("tel"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.FAX.value())).as("fax"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.CST_CNTCT_DPT.value())).as("cst_cntct_dpt"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.CST_CNTCT_PSN.value())).as("cst_cntct_psn"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.CST_CNTCT_PSN_TITLE.value()))
						.as("cst_cntct_psn_title"));
		dbc_bldr.addSelect(acst.bcst_cd);
		dbc_bldr.addLeftOuterJoin(acst, bracket(acst.bp_cd.eq(t.acst_cd)));
		dbc_bldr.setWhere(t.cst_flg.eq(value(true)));
		dbc_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X"))
				.from(S1W1.innerJoin(S1W2).on(S1W2.data_no.eq(S1W1.data_no)))
				.where(S1W1.bp_cd.eq(t.bp_cd)
						.and(value(MAC_DATA_CRUD_TYP.DEL.value()).neq(S1W1.data_crud_typ)))));

		MCRow bindR = MCRow.create();
		bindR.addDateColumn("TODAY", getToday());

		dbSelect("PFBAL5710_MAM_BP_S01", dbc, dbc_bldr, bindR);

		// インデックス作成
		object(CLAZZ)._bpL = dbc;
		object(CLAZZ)._bpKey = object(CLAZZ)._bpL.createIndex(MAM_BP_R.$bp_cd);

	}

	protected MAM_BP_R getBpR(String bpCd) {
		if (object(CLAZZ)._bpL == null) {
			initBpCache();
		}
		return object(CLAZZ)._bpL.getFirst(object(CLAZZ)._bpKey, bpCd);
	}

	//FMCB CUSTOM END
}