package mcframe.serverMSBE.MSBEL6610;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.commonCore.report.container.*;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.commonMSBE.MSBER0300.*;
import mcframe.commonMSBE.MSBER0310.*;
import mcframe.serverMSBE.MSBEL6600.*;

import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StktkListPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StktkListPrntService_MC extends MSBEL_StktkListPrntService_MC_A{
	//FMCB CUSTOM START

	/**
	 * StktkList_Prnt01オペレーション.<p>
	 *
	 * 棚卸表あるいは実棚差異リストを印刷します。<br>
	 */
	public class StktkList_Prnt01 extends MSBEL_StktkListPrntService_MC_A.StktkList_Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			up0().sort(StktkList_Prnt01_DtlR.$ctrl_tgt_dt, StktkList_Prnt01_DtlR.$loc_cd, StktkList_Prnt01_DtlR.$itm_cd, StktkList_Prnt01_DtlR.$itm_sub1, StktkList_Prnt01_DtlR.$itm_sub2, StktkList_Prnt01_DtlR.$itm_sub3);
			// 棚卸表か差異リストか（混在はない前提）
			if (up0().get(0).stktk_rpt_flg()) {
				prntStktkRpt();
			}
			else if (up0().get(0).diff_rpt_flg()) {
				prntDiffRpt();
			}
		}
		
		/**
		 * 棚卸表印刷
		 */
		protected void prntStktkRpt() {
			List<MCReportSet> stkList = new ArrayList<MCReportSet>();

			for (StktkList_Prnt01_DtlR r : up0()) {
				MCReportSet reportSet;
				reportSet = MSBER_StkTkLst.create();

				// ヘッダ取得
				MAM_LOC_R m1 = MAM_LOC_R.create("M1");
				MAM_DPT_R m2 = MAM_DPT_R.create("M2");
				MAM_USR_R m3 = MAM_USR_R.create("M3");
				MAM_SITE_R m4 = MAM_SITE_R.create("M4");

				MST_STKTK_R stktkR = MST_STKTK_R.create();
				MST_STKTK_R t = MST_STKTK_R.create("T");
				MCQueryApiBuilder stktkR_bldr = MCQueryApiBuilder.create(t);
				stktkR_bldr.addSelect(m1.loc_nm,m2.dpt_nm);
				stktkR_bldr.addSelect(m1.stktk_tor_disp_flg);
				stktkR_bldr.addSelect(m3.usr_nm);
				stktkR_bldr.addSelect(m1.site_cd,m4.site_nm);
				stktkR_bldr.addLeftOuterJoin(m1, t.loc_cd.eq(m1.loc_cd));
				stktkR_bldr.addLeftOuterJoin(m2, t.act_dpt_cd.eq(m2.dpt_cd).and(m2.st_dt.lte(t.ctrl_tgt_dt)).and(m2.end_dt.gt(t.ctrl_tgt_dt)));
				stktkR_bldr.addLeftOuterJoin(m3, t.act_usr_cd.eq(m3.usr_cd));
				stktkR_bldr.addLeftOuterJoin(m4, m1.site_cd.eq(m4.site_cd));
				dbSelectKey("MSBEL6610_MST_STKTK_S01", stktkR, stktkR_bldr, r);
				if (stktkR.isEmpty()) {
					continue;
				}

				// 明細取得
				MCList<StktkAct_Srch01_RsltR> rsltL = srchStktkAct(r);
				if (rsltL.isEmpty()) {
					continue;
				}
				if (!isSame(stktkR.getStringNE("stktk_tor_disp_flg"), toTrueStr(true))) {
					// 理論在庫初期表示がオフ
					rsltL.setNumber(StktkAct_Srch01_RsltR.$tor_qty, null);
				}
				
				// ヘッダ設定
				StkTkLstHdrR hdrR = StkTkLstHdrR.create();
				copy(hdrR, stktkR, createMap_StkTkLstHdrR_MST_STKTK_R());
				hdrR.stktk_rpt_rmrks(r.stktk_rpt_rmrks());
				
				// 明細設定
				MCList<StkTkLstDtlR> dtlL = MCList.create(StkTkLstDtlR.class);
				addAll(dtlL, rsltL, createMap_StkTkLstDtlR_StktkAct_Srch01_RsltR());
				
				setStktkListData(reportSet, hdrR, dtlL, rsltL);
				setBizInfo(reportSet, stktkR);

				// 印刷データ作成
				if (0 < reportSet.size()) {
					stkList.add(reportSet);
					MCServerReportManager.request(reportSet, false);
				}

				// 更新処理
				updStktk(r);
			}
			// 発行処理
			prntAll(stkList);
		}

		/**
		 * 取得した値を編集し、レポートセットにセットする
		 */
		protected void setStktkListData(MCReportSet reportSet, StkTkLstHdrR hdrR, MCList<StkTkLstDtlR> dtlL, MCList<StktkAct_Srch01_RsltR> rsltL) {
			reportSet.addRow(hdrR);

			if (dtlL.isEmpty()) return;
			
			putPrntItmSub1(dtlL, StkTkLstDtlR.$itm_sub1_view, StkTkLstDtlR.$itm_sub1_data);
			putPrntItmSub2(dtlL, StkTkLstDtlR.$itm_sub2_view, StkTkLstDtlR.$itm_sub2_data);
			putPrntItmSub3(dtlL, StkTkLstDtlR.$itm_sub3_view, StkTkLstDtlR.$itm_sub3_data);

			putPrntSnoLabel1(dtlL, StkTkLstDtlR.$sno1_lbl);
			putPrntSno1(dtlL, StkTkLstDtlR.$sno1_view, StkTkLstDtlR.$sno1_data);
			putPrntSnoLabel2(dtlL, StkTkLstDtlR.$sno2_lbl);
			putPrntSno2(dtlL, StkTkLstDtlR.$sno2_view, StkTkLstDtlR.$sno2_data);
			putPrntSnoLabel3(dtlL, StkTkLstDtlR.$sno3_lbl);
			putPrntSno3(dtlL, StkTkLstDtlR.$sno3_view, StkTkLstDtlR.$sno3_data);
			putPrntSnoLabel4(dtlL, StkTkLstDtlR.$sno4_lbl);
			putPrntSno4(dtlL, StkTkLstDtlR.$sno4_view, StkTkLstDtlR.$sno4_data);

			putPrntStr(dtlL, StkTkLstDtlR.$lot_no_view, StkTkLstDtlR.$lot_no_data);
			putPrntStr(dtlL, StkTkLstDtlR.$sublot_no_view, StkTkLstDtlR.$sublot_no_data);

			int i = 0;
			for (StkTkLstDtlR r : dtlL) {
				r.addNumberColumn("trd_unit_dec_place", rsltL.get(i).trd_unit_dec_place());
				i++;
			}
			dtlL.addNumberColumn("upri_dec_place", getBaseCur().upri_dec_place());
			putNumStr(reportSet, dtlL, StkTkLstDtlR.$s_tor_qty, StkTkLstDtlR.$tor_qty, "trd_unit_dec_place");
			putNumStr(reportSet, dtlL, StkTkLstDtlR.$s_int_tor_qty, StkTkLstDtlR.$s_dec_tor_qty, StkTkLstDtlR.$tor_qty, "trd_unit_dec_place");
			putNumStr(reportSet, dtlL, StkTkLstDtlR.$s_act_qty, StkTkLstDtlR.$act_qty, "trd_unit_dec_place");
			putNumStr(reportSet, dtlL, StkTkLstDtlR.$s_int_act_qty, StkTkLstDtlR.$s_dec_act_qty, StkTkLstDtlR.$act_qty, "trd_unit_dec_place");
			putNumStr(reportSet, dtlL, StkTkLstDtlR.$s_std_upri, StkTkLstDtlR.$std_upri, getBaseCur().upri_dec_place());
			putNumStr(reportSet, dtlL, StkTkLstDtlR.$s_int_std_upri, StkTkLstDtlR.$s_dec_std_upri, StkTkLstDtlR.$std_upri, "upri_dec_place");
			
			reportSet.addAll(dtlL);
		}

		/**
		 * 業務情報を設定する
		 * 
		 * @param reportSet
		 * @param prntHdr
		 */
		protected void setBizInfo(MCReportSet reportSet, MST_STKTK_R stktkR) {
			reportSet.setAppUsrCd1(stktkR.act_dpt_cd());
			reportSet.setAppUsrNm1(stktkR.getStringNE("dpt_nm"));
			reportSet.setAppUsrCd2(stktkR.act_usr_cd());
			reportSet.setAppUsrNm2(stktkR.getStringNE("usr_nm"));
			reportSet.setAppFromCd1(stktkR.loc_cd());
			reportSet.setAppFromNm1(stktkR.getStringNE("loc_nm"));
			reportSet.setAppFromCd2(stktkR.getStringNE("site_cd"));
			reportSet.setAppFromNm2(stktkR.getStringNE("site_nm"));
			reportSet.setAppRmrks1(toYMDString(stktkR.ctrl_tgt_dt()));
		}

		/**
		 * 差異リスト印刷
		 */
		protected void prntDiffRpt() {
			List<MCReportSet> diffList = new ArrayList<MCReportSet>();

			for (StktkList_Prnt01_DtlR r : up0()) {
				MCReportSet reportSet;
				reportSet = MSBER_StkDiffLst.create();

				// ヘッダ取得
				MAM_LOC_R m1 = MAM_LOC_R.create("M1");
				MAM_DPT_R m2 = MAM_DPT_R.create("M2");
				MAM_USR_R m3 = MAM_USR_R.create("M3");
				MAM_SITE_R m4 = MAM_SITE_R.create("M4");

				MST_STKTK_R stktkR = MST_STKTK_R.create();
				MST_STKTK_R t = MST_STKTK_R.create("T");
				MCQueryApiBuilder stktkR_bldr = MCQueryApiBuilder.create(t);
				stktkR_bldr.addSelect(m1.loc_nm,m2.dpt_nm);
				stktkR_bldr.addSelect(m1.stktk_act_ex_zero_flg);
				stktkR_bldr.addSelect(m3.usr_nm);
				stktkR_bldr.addSelect(m1.site_cd,m4.site_nm);
				stktkR_bldr.addSelect(m1.stktk_tor_disp_flg);
				stktkR_bldr.addLeftOuterJoin(m1, t.loc_cd.eq(m1.loc_cd));
				stktkR_bldr.addLeftOuterJoin(m2, t.act_dpt_cd.eq(m2.dpt_cd).and(m2.st_dt.lte(t.ctrl_tgt_dt)).and(m2.end_dt.gt(t.ctrl_tgt_dt)));
				stktkR_bldr.addLeftOuterJoin(m3, t.act_usr_cd.eq(m3.usr_cd));
				stktkR_bldr.addLeftOuterJoin(m4, m1.site_cd.eq(m4.site_cd));
				dbSelectKey("MSBEL6610_MST_STKTK_S02", stktkR, stktkR_bldr, r);
				if (stktkR.isEmpty()) {
					continue;
				}

				// 明細取得
				MCList<StktkAct_Srch01_RsltR> rsltL = srchStktkAct(r);
				if (rsltL.isEmpty()) {
					continue;
				}
				if (isSame(stktkR.getStringNE("stktk_act_ex_zero_flg"), toTrueStr(true))) {
					// 実棚差異数０除外ＦＬＧがオン
					rsltL = rsltL.subList(rsltR -> isDiff(rsltR));
					if(rsltL.isEmpty()) {
						continue;
					}
				}
				if (isSame(stktkR.getStringNE("stktk_tor_disp_flg"), toTrueStr(true))) {
					for (StktkAct_Srch01_RsltR rsltR : rsltL) {
						if (!rsltR.getBooleanNE(StktkAct_Srch01_RsltR.$act_input_flg)) {
							rsltR.setNumber(StktkAct_Srch01_RsltR.$trd_unit_qty, null);
							rsltR.setNumber(StktkAct_Srch01_RsltR.$act_diff_qty, null);
						}
					}
				}
				
				// ヘッダ設定
				StkDiffLstHdrR hdrR = StkDiffLstHdrR.create();
				copy(hdrR, stktkR, createMap_StkDiffLstHdrR_MST_STKTK_R());
				
				// 明細設定
				MCList<StkDiffLstDtlR> dtlL = MCList.create(StkDiffLstDtlR.class);
				addAll(dtlL, rsltL, createMap_StkDiffLstDtlR_StktkAct_Srch01_RsltR());
				
				setDiffListData(reportSet, hdrR, dtlL, rsltL);
				setBizInfo(reportSet, stktkR);

				// 印刷データ作成
				if (0 < reportSet.size()) {
					diffList.add(reportSet);
					MCServerReportManager.request(reportSet, false);
				}
				// 更新処理
				updStktk(r);
			}

			// 発行処理
			prntAll(diffList);
		}

		/**
		 * 実棚差異数量が０でない
		 */
		protected boolean isDiff(StktkAct_Srch01_RsltR r) {
			if(isNull(r.act_diff_qty())) return true;
			return !r.act_diff_qty().isZero();
		}

		/**
		 * 取得した値を編集し、レポートセットにセットする
		 */
		protected void setDiffListData(MCReportSet reportSet, StkDiffLstHdrR hdrR, MCList<StkDiffLstDtlR> dtlL, MCList<StktkAct_Srch01_RsltR> rsltL) {
			reportSet.addRow(hdrR);

			if (dtlL.isEmpty()) return;
			
			putPrntItmSub1(dtlL, StkDiffLstDtlR.$itm_sub1_view, StkDiffLstDtlR.$itm_sub1_data);
			putPrntItmSub2(dtlL, StkDiffLstDtlR.$itm_sub2_view, StkDiffLstDtlR.$itm_sub2_data);
			putPrntItmSub3(dtlL, StkDiffLstDtlR.$itm_sub3_view, StkDiffLstDtlR.$itm_sub3_data);

			putPrntSnoLabel1(dtlL, StkDiffLstDtlR.$sno1_lbl);
			putPrntSno1(dtlL, StkDiffLstDtlR.$sno1_view, StkDiffLstDtlR.$sno1_data);
			putPrntSnoLabel2(dtlL, StkDiffLstDtlR.$sno2_lbl);
			putPrntSno2(dtlL, StkDiffLstDtlR.$sno2_view, StkDiffLstDtlR.$sno2_data);
			putPrntSnoLabel3(dtlL, StkDiffLstDtlR.$sno3_lbl);
			putPrntSno3(dtlL, StkDiffLstDtlR.$sno3_view, StkDiffLstDtlR.$sno3_data);
			putPrntSnoLabel4(dtlL, StkDiffLstDtlR.$sno4_lbl);
			putPrntSno4(dtlL, StkDiffLstDtlR.$sno4_view, StkDiffLstDtlR.$sno4_data);

			putPrntStr(dtlL, StkDiffLstDtlR.$lot_no_view, StkDiffLstDtlR.$lot_no_data);
			putPrntStr(dtlL, StkDiffLstDtlR.$sublot_no_view, StkDiffLstDtlR.$sublot_no_data);

			int i = 0;
			for (StkDiffLstDtlR r : dtlL) {
				r.addNumberColumn("trd_unit_dec_place", rsltL.get(i).trd_unit_dec_place());
				i++;
			}
			dtlL.addNumberColumn("upri_dec_place", getBaseCur().upri_dec_place());
			putNumStr(reportSet, dtlL, StkDiffLstDtlR.$s_tor_qty, StkDiffLstDtlR.$tor_qty, "trd_unit_dec_place");
			putNumStr(reportSet, dtlL, StkDiffLstDtlR.$s_int_tor_qty, StkDiffLstDtlR.$s_dec_tor_qty, StkDiffLstDtlR.$tor_qty, "trd_unit_dec_place");
			putNumStr(reportSet, dtlL, StkDiffLstDtlR.$s_act_qty, StkDiffLstDtlR.$act_qty, "trd_unit_dec_place");
			putNumStr(reportSet, dtlL, StkDiffLstDtlR.$s_int_act_qty, StkDiffLstDtlR.$s_dec_act_qty, StkDiffLstDtlR.$act_qty, "trd_unit_dec_place");
			putNumStr(reportSet, dtlL, StkDiffLstDtlR.$s_int_act_diff_qty, StkDiffLstDtlR.$s_dec_act_diff_qty, StkDiffLstDtlR.$act_diff_qty, "trd_unit_dec_place");
			putNumStr(reportSet, dtlL, StkDiffLstDtlR.$s_int_act_diff_amt, StkDiffLstDtlR.$s_dec_act_diff_amt, StkDiffLstDtlR.$act_diff_amt, "upri_dec_place");
			
			reportSet.addAll(dtlL);
		}

		/**
		 * 実棚情報を検索する
		 * @param r
		 * @return
		 */
		protected MCList<StktkAct_Srch01_RsltR> srchStktkAct(StktkList_Prnt01_DtlR r) {
			MSBEL_StktkActService.StktkAct_Srch01 o = MSBEL_StktkActService.crtStktkAct_Srch01();
			StktkAct_Srch01_CndR cndR = StktkAct_Srch01_CndR.create();
			copy(cndR, r, createMap_StktkAct_Srch01_CndR_StktkList_Prnt01_DtlR());
			MCRow.copyall(o.up0(), cndR);
			o.exec();
			return o.down0();
		}

		/**
		 * MCReportSetのListをもとに帳票を発行します。
		 * 1件分のMCReportSetを引数に指定した場合は、印刷データの登録と帳票発行します。
		 * 複数件のMCReportSetを引数に指定した場合は、１つのデータファイルにまとめて発行し、
		 * 印刷データは登録しません。
		 * 
		 * @param reportSets MCReportSetのList
		 */
		protected <E extends MCReportSet> void prntAll(List<E> reportSets) {

			if (reportSets == null) {
				return;
			}
			int cnt = reportSets.size();
			if (cnt == 0) {
				return;
			}
			else if (cnt == 1) {
				reportSets.get(0).setPersistent(false);
				MCServerReportManager.request(reportSets.get(0));
			}
			else {

				MCReportSet all = reportSets.get(0).createInstance();
				for (MCReportSet reportSet : reportSets) {
					all.addAll(reportSet.getAll());
				}

				all.setPersistent(false);
				MCServerReportManager.request(all);
			}
		}

		/**
		 * 棚卸制御を更新する
		 * 
		 * @param r
		 */
		protected void updStktk(StktkList_Prnt01_DtlR r) {

			MST_STKTK_R upd = MST_STKTK_R.create();
			MST_STKTK_R t = MST_STKTK_R.create("T");
			MCQueryApiBuilder upd_bldr = MCQueryApiBuilder.create(t);

			copy(upd, r, createMap_MST_STKTK_R_StktkList_Prnt01_DtlR());

			if (r.stktk_rpt_flg()) {
				upd_bldr.setSet(t.stktk_rpt_prnt_flg);
			}
			if (r.diff_rpt_flg()) {
				upd_bldr.setSet(t.diff_rpt_prnt_flg);
			}
			if (!isNull(upd.stktk_rpt_rmrks())) {
				upd_bldr.addSet(t.stktk_rpt_rmrks);
			}
			dbUpdateKey("MSBEL6610_MST_STKTK_U01", upd, upd_bldr);

		}
	}

	protected Map_StktkAct_Srch01_CndR_StktkList_Prnt01_DtlR<StktkAct_Srch01_CndR,StktkList_Prnt01_DtlR> createMap_StktkAct_Srch01_CndR_StktkList_Prnt01_DtlR() {
		return new Map_StktkAct_Srch01_CndR_StktkList_Prnt01_DtlR<StktkAct_Srch01_CndR, StktkList_Prnt01_DtlR>();
	}

	public class Map_StktkAct_Srch01_CndR_StktkList_Prnt01_DtlR<D extends StktkAct_Srch01_CndR, S extends StktkList_Prnt01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StktkAct_Srch01_CndR.$stktk_base_dt, StktkList_Prnt01_DtlR.$ctrl_tgt_dt);
			addColumnPathMap(StktkAct_Srch01_CndR.$loc_cd, StktkList_Prnt01_DtlR.$loc_cd);
			addColumnPathMap(StktkAct_Srch01_CndR.$itm_cd, StktkList_Prnt01_DtlR.$itm_cd);
			addColumnPathMap(StktkAct_Srch01_CndR.$itm_sub1, StktkList_Prnt01_DtlR.$itm_sub1);
			addColumnPathMap(StktkAct_Srch01_CndR.$itm_sub2, StktkList_Prnt01_DtlR.$itm_sub2);
			addColumnPathMap(StktkAct_Srch01_CndR.$itm_sub3, StktkList_Prnt01_DtlR.$itm_sub3);
//			addColumnPathMap(StktkAct_Srch01_CndR.$inc_entrd_flg, );

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.itm_cd(nullValToNull(src.itm_cd()));
			dest.itm_sub1(nullValToNull(src.itm_sub1()));
			dest.itm_sub2(nullValToNull(src.itm_sub2()));
			dest.itm_sub3(nullValToNull(src.itm_sub3()));
			dest.inc_entrd_flg(true);
			dest.only_enable_flg(true);
		}
	}

	protected Map_StkTkLstHdrR_MST_STKTK_R<StkTkLstHdrR,MST_STKTK_R> createMap_StkTkLstHdrR_MST_STKTK_R() {
		return new Map_StkTkLstHdrR_MST_STKTK_R<StkTkLstHdrR, MST_STKTK_R>();
	}

	public class Map_StkTkLstHdrR_MST_STKTK_R<D extends StkTkLstHdrR, S extends MST_STKTK_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StkTkLstHdrR.$stktk_base_dt, MST_STKTK_R.$ctrl_tgt_dt);
			addColumnPathMap(StkTkLstHdrR.$loc_cd, MST_STKTK_R.$loc_cd);
			addColumnPathMap(StkTkLstHdrR.$loc_nm, "loc_nm");
			addColumnPathMap(StkTkLstHdrR.$act_dpt_cd, MST_STKTK_R.$act_dpt_cd);
			addColumnPathMap(StkTkLstHdrR.$act_dpt_nm, "dpt_nm");
			addColumnPathMap(StkTkLstHdrR.$stktk_rpt_rmrks, MST_STKTK_R.$stktk_rpt_rmrks);
//			addColumnPathMap(StkTkLstHdrR.$prnt_tm, );

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.prnt_tm(MCDate.now());
		}
	}

	protected Map_StkTkLstDtlR_StktkAct_Srch01_RsltR<StkTkLstDtlR,StktkAct_Srch01_RsltR> createMap_StkTkLstDtlR_StktkAct_Srch01_RsltR() {
		return new Map_StkTkLstDtlR_StktkAct_Srch01_RsltR<StkTkLstDtlR, StktkAct_Srch01_RsltR>();
	}

	public class Map_StkTkLstDtlR_StktkAct_Srch01_RsltR<D extends StkTkLstDtlR, S extends StktkAct_Srch01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StkTkLstDtlR.$str_ln_nm, StktkAct_Srch01_RsltR.$str_ln_nm);
			addColumnPathMap(StkTkLstDtlR.$str_ln_cd, StktkAct_Srch01_RsltR.$str_ln_cd);
			addColumnPathMap(StkTkLstDtlR.$itm_cd, StktkAct_Srch01_RsltR.$itm_cd);
//			addColumnPathMap(StkTkLstDtlR.$itm_sub1_view, );
			addColumnPathMap(StkTkLstDtlR.$itm_sub1_data, StktkAct_Srch01_RsltR.$itm_sub1);
//			addColumnPathMap(StkTkLstDtlR.$itm_sub2_view, );
			addColumnPathMap(StkTkLstDtlR.$itm_sub2_data, StktkAct_Srch01_RsltR.$itm_sub2);
//			addColumnPathMap(StkTkLstDtlR.$itm_sub3_view, );
			addColumnPathMap(StkTkLstDtlR.$itm_sub3_data, StktkAct_Srch01_RsltR.$itm_sub3);
			addColumnPathMap(StkTkLstDtlR.$itm_nm, StktkAct_Srch01_RsltR.$itm_nm);
			addColumnPathMap(StkTkLstDtlR.$itm_alt_nm1, StktkAct_Srch01_RsltR.$itm_alt_nm1);
			addColumnPathMap(StkTkLstDtlR.$itm_alt_nm2, StktkAct_Srch01_RsltR.$itm_alt_nm2);
			addColumnPathMap(StkTkLstDtlR.$itm_alt_nm3, StktkAct_Srch01_RsltR.$itm_alt_nm3);
			addColumnPathMap(StkTkLstDtlR.$itm_alt_nm4, StktkAct_Srch01_RsltR.$itm_alt_nm4);
			addColumnPathMap(StkTkLstDtlR.$in_xfr_typ, StktkAct_Srch01_RsltR.$in_xfr_typ);
			addColumnPathMap(StkTkLstDtlR.$in_xfr_typ_nm, StktkAct_Srch01_RsltR.$in_xfr_typ_nm);
			addColumnPathMap(StkTkLstDtlR.$quality_typ_nm, StktkAct_Srch01_RsltR.$quality_typ_nm);
			addColumnPathMap(StkTkLstDtlR.$quality_typ, StktkAct_Srch01_RsltR.$quality_typ);
			addColumnPathMap(StkTkLstDtlR.$gd_nm, StktkAct_Srch01_RsltR.$gd_nm);
			addColumnPathMap(StkTkLstDtlR.$gd_cd, StktkAct_Srch01_RsltR.$gd_cd);
//			addColumnPathMap(StkTkLstDtlR.$stk_insp_typ_lbl, );
			addColumnPathMap(StkTkLstDtlR.$stk_insp_typ_nm, StktkAct_Srch01_RsltR.$stk_insp_typ_nm);
			addColumnPathMap(StkTkLstDtlR.$stk_insp_typ, StktkAct_Srch01_RsltR.$stk_insp_typ);
			addColumnPathMap(StkTkLstDtlR.$stk_id_typ_nm, StktkAct_Srch01_RsltR.$stk_id_typ_nm);
			addColumnPathMap(StkTkLstDtlR.$stk_id_typ, StktkAct_Srch01_RsltR.$stk_id_typ);
			addColumnPathMap(StkTkLstDtlR.$stk_bp_nm, StktkAct_Srch01_RsltR.$stk_bp_nm);
			addColumnPathMap(StkTkLstDtlR.$stk_bp_alt_nm1, StktkAct_Srch01_RsltR.$stk_bp_alt_nm1);
			addColumnPathMap(StkTkLstDtlR.$stk_bp_alt_nm2, StktkAct_Srch01_RsltR.$stk_bp_alt_nm2);
			addColumnPathMap(StkTkLstDtlR.$stk_bp_alt_nm3, StktkAct_Srch01_RsltR.$stk_bp_alt_nm3);
			addColumnPathMap(StkTkLstDtlR.$stk_bp_alt_nm4, StktkAct_Srch01_RsltR.$stk_bp_alt_nm4);
			addColumnPathMap(StkTkLstDtlR.$stk_bp_cd, StktkAct_Srch01_RsltR.$stk_bp_cd);
			addColumnPathMap(StkTkLstDtlR.$stk_arrv_bp_nm, StktkAct_Srch01_RsltR.$stk_arrv_bp_nm);
			addColumnPathMap(StkTkLstDtlR.$stk_arrv_bp_alt_nm1, StktkAct_Srch01_RsltR.$stk_arrv_bp_alt_nm1);
			addColumnPathMap(StkTkLstDtlR.$stk_arrv_bp_alt_nm2, StktkAct_Srch01_RsltR.$stk_arrv_bp_alt_nm2);
			addColumnPathMap(StkTkLstDtlR.$stk_arrv_bp_alt_nm3, StktkAct_Srch01_RsltR.$stk_arrv_bp_alt_nm3);
			addColumnPathMap(StkTkLstDtlR.$stk_arrv_bp_alt_nm4, StktkAct_Srch01_RsltR.$stk_arrv_bp_alt_nm4);
			addColumnPathMap(StkTkLstDtlR.$stk_arrv_bp_cd, StktkAct_Srch01_RsltR.$stk_arrv_bp_cd);
//			addColumnPathMap(StkTkLstDtlR.$lot_no_view, );
			addColumnPathMap(StkTkLstDtlR.$lot_no_data, StktkAct_Srch01_RsltR.$lot_no);
//			addColumnPathMap(StkTkLstDtlR.$sublot_no_view, );
			addColumnPathMap(StkTkLstDtlR.$sublot_no_data, StktkAct_Srch01_RsltR.$sublot_no);
//			addColumnPathMap(StkTkLstDtlR.$sno1_lbl, );
//			addColumnPathMap(StkTkLstDtlR.$sno1_view, );
			addColumnPathMap(StkTkLstDtlR.$sno1_data, StktkAct_Srch01_RsltR.$sno1);
//			addColumnPathMap(StkTkLstDtlR.$sno2_lbl, );
//			addColumnPathMap(StkTkLstDtlR.$sno2_view, );
			addColumnPathMap(StkTkLstDtlR.$sno2_data, StktkAct_Srch01_RsltR.$sno2);
//			addColumnPathMap(StkTkLstDtlR.$sno3_lbl, );
//			addColumnPathMap(StkTkLstDtlR.$sno3_view, );
			addColumnPathMap(StkTkLstDtlR.$sno3_data, StktkAct_Srch01_RsltR.$sno3);
//			addColumnPathMap(StkTkLstDtlR.$sno4_lbl, );
//			addColumnPathMap(StkTkLstDtlR.$sno4_view, );
			addColumnPathMap(StkTkLstDtlR.$sno4_data, StktkAct_Srch01_RsltR.$sno4);
			addColumnPathMap(StkTkLstDtlR.$tor_qty, StktkAct_Srch01_RsltR.$tor_qty);
//			addColumnPathMap(StkTkLstDtlR.$s_tor_qty, );
//			addColumnPathMap(StkTkLstDtlR.$s_int_tor_qty, );
//			addColumnPathMap(StkTkLstDtlR.$s_dec_tor_qty, );
			addColumnPathMap(StkTkLstDtlR.$pack_unit_nm, StktkAct_Srch01_RsltR.$trd_unit_nm);
			addColumnPathMap(StkTkLstDtlR.$act_qty, StktkAct_Srch01_RsltR.$trd_unit_qty);
//			addColumnPathMap(StkTkLstDtlR.$s_act_qty, );
//			addColumnPathMap(StkTkLstDtlR.$s_int_act_qty, );
//			addColumnPathMap(StkTkLstDtlR.$s_dec_act_qty, );
			addColumnPathMap(StkTkLstDtlR.$std_upri, StktkAct_Srch01_RsltR.$std_upri);
//			addColumnPathMap(StkTkLstDtlR.$s_std_upri, );
//			addColumnPathMap(StkTkLstDtlR.$s_int_std_upri, );
//			addColumnPathMap(StkTkLstDtlR.$s_dec_std_upri, );
			addColumnPathMap(StkTkLstDtlR.$sub_char1, StktkAct_Srch01_RsltR.$sub_char1);
			addColumnPathMap(StkTkLstDtlR.$sub_char2, StktkAct_Srch01_RsltR.$sub_char2);
			addColumnPathMap(StkTkLstDtlR.$sub_char3, StktkAct_Srch01_RsltR.$sub_char3);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.stk_insp_typ_lbl(MSC_STKTK_LIST_STR.STK_INSP_TYP.name(getUsrLocale()));
		}
	}

	protected Map_StkDiffLstHdrR_MST_STKTK_R<StkDiffLstHdrR,MST_STKTK_R> createMap_StkDiffLstHdrR_MST_STKTK_R() {
		return new Map_StkDiffLstHdrR_MST_STKTK_R<StkDiffLstHdrR, MST_STKTK_R>();
	}

	public class Map_StkDiffLstHdrR_MST_STKTK_R<D extends StkDiffLstHdrR, S extends MST_STKTK_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StkDiffLstHdrR.$stktk_base_dt, MST_STKTK_R.$ctrl_tgt_dt);
			addColumnPathMap(StkDiffLstHdrR.$loc_cd, MST_STKTK_R.$loc_cd);
			addColumnPathMap(StkDiffLstHdrR.$loc_nm, "loc_nm");
			addColumnPathMap(StkDiffLstHdrR.$act_dpt_cd, MST_STKTK_R.$act_dpt_cd);
			addColumnPathMap(StkDiffLstHdrR.$act_dpt_nm, "dpt_nm");
//			addColumnPathMap(StkDiffLstHdrR.$prnt_tm, );

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.prnt_tm(MCDate.now());
		}
	}

	protected Map_StkDiffLstDtlR_StktkAct_Srch01_RsltR<StkDiffLstDtlR,StktkAct_Srch01_RsltR> createMap_StkDiffLstDtlR_StktkAct_Srch01_RsltR() {
		return new Map_StkDiffLstDtlR_StktkAct_Srch01_RsltR<StkDiffLstDtlR, StktkAct_Srch01_RsltR>();
	}

	public class Map_StkDiffLstDtlR_StktkAct_Srch01_RsltR<D extends StkDiffLstDtlR, S extends StktkAct_Srch01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StkDiffLstDtlR.$str_ln_nm, StktkAct_Srch01_RsltR.$str_ln_nm);
			addColumnPathMap(StkDiffLstDtlR.$str_ln_cd, StktkAct_Srch01_RsltR.$str_ln_cd);
			addColumnPathMap(StkDiffLstDtlR.$itm_cd, StktkAct_Srch01_RsltR.$itm_cd);
//			addColumnPathMap(StkDiffLstDtlR.$itm_sub1_view, );
			addColumnPathMap(StkDiffLstDtlR.$itm_sub1_data, StktkAct_Srch01_RsltR.$itm_sub1);
//			addColumnPathMap(StkDiffLstDtlR.$itm_sub2_view, );
			addColumnPathMap(StkDiffLstDtlR.$itm_sub2_data, StktkAct_Srch01_RsltR.$itm_sub2);
//			addColumnPathMap(StkDiffLstDtlR.$itm_sub3_view, );
			addColumnPathMap(StkDiffLstDtlR.$itm_sub3_data, StktkAct_Srch01_RsltR.$itm_sub3);
			addColumnPathMap(StkDiffLstDtlR.$itm_nm, StktkAct_Srch01_RsltR.$itm_nm);
			addColumnPathMap(StkDiffLstDtlR.$itm_alt_nm1, StktkAct_Srch01_RsltR.$itm_alt_nm1);
			addColumnPathMap(StkDiffLstDtlR.$itm_alt_nm2, StktkAct_Srch01_RsltR.$itm_alt_nm2);
			addColumnPathMap(StkDiffLstDtlR.$itm_alt_nm3, StktkAct_Srch01_RsltR.$itm_alt_nm3);
			addColumnPathMap(StkDiffLstDtlR.$itm_alt_nm4, StktkAct_Srch01_RsltR.$itm_alt_nm4);
			addColumnPathMap(StkDiffLstDtlR.$in_xfr_typ, StktkAct_Srch01_RsltR.$in_xfr_typ);
			addColumnPathMap(StkDiffLstDtlR.$in_xfr_typ_nm, StktkAct_Srch01_RsltR.$in_xfr_typ_nm);
			addColumnPathMap(StkDiffLstDtlR.$quality_typ_nm, StktkAct_Srch01_RsltR.$quality_typ_nm);
			addColumnPathMap(StkDiffLstDtlR.$quality_typ, StktkAct_Srch01_RsltR.$quality_typ);
			addColumnPathMap(StkDiffLstDtlR.$gd_nm, StktkAct_Srch01_RsltR.$gd_nm);
			addColumnPathMap(StkDiffLstDtlR.$gd_cd, StktkAct_Srch01_RsltR.$gd_cd);
//			addColumnPathMap(StkDiffLstDtlR.$stk_insp_typ_lbl, );
			addColumnPathMap(StkDiffLstDtlR.$stk_insp_typ_nm, StktkAct_Srch01_RsltR.$stk_insp_typ_nm);
			addColumnPathMap(StkDiffLstDtlR.$stk_insp_typ, StktkAct_Srch01_RsltR.$stk_insp_typ);
			addColumnPathMap(StkDiffLstDtlR.$stk_id_typ_nm, StktkAct_Srch01_RsltR.$stk_id_typ_nm);
			addColumnPathMap(StkDiffLstDtlR.$stk_id_typ, StktkAct_Srch01_RsltR.$stk_id_typ);
			addColumnPathMap(StkDiffLstDtlR.$stk_bp_nm, StktkAct_Srch01_RsltR.$stk_bp_nm);
			addColumnPathMap(StkDiffLstDtlR.$stk_bp_alt_nm1, StktkAct_Srch01_RsltR.$stk_bp_alt_nm1);
			addColumnPathMap(StkDiffLstDtlR.$stk_bp_alt_nm2, StktkAct_Srch01_RsltR.$stk_bp_alt_nm2);
			addColumnPathMap(StkDiffLstDtlR.$stk_bp_alt_nm3, StktkAct_Srch01_RsltR.$stk_bp_alt_nm3);
			addColumnPathMap(StkDiffLstDtlR.$stk_bp_alt_nm4, StktkAct_Srch01_RsltR.$stk_bp_alt_nm4);
			addColumnPathMap(StkDiffLstDtlR.$stk_bp_cd, StktkAct_Srch01_RsltR.$stk_bp_cd);
			addColumnPathMap(StkDiffLstDtlR.$stk_arrv_bp_nm, StktkAct_Srch01_RsltR.$stk_arrv_bp_nm);
			addColumnPathMap(StkDiffLstDtlR.$stk_arrv_bp_alt_nm1, StktkAct_Srch01_RsltR.$stk_arrv_bp_alt_nm1);
			addColumnPathMap(StkDiffLstDtlR.$stk_arrv_bp_alt_nm2, StktkAct_Srch01_RsltR.$stk_arrv_bp_alt_nm2);
			addColumnPathMap(StkDiffLstDtlR.$stk_arrv_bp_alt_nm3, StktkAct_Srch01_RsltR.$stk_arrv_bp_alt_nm3);
			addColumnPathMap(StkDiffLstDtlR.$stk_arrv_bp_alt_nm4, StktkAct_Srch01_RsltR.$stk_arrv_bp_alt_nm4);
			addColumnPathMap(StkDiffLstDtlR.$stk_arrv_bp_cd, StktkAct_Srch01_RsltR.$stk_arrv_bp_cd);
//			addColumnPathMap(StkDiffLstDtlR.$lot_no_view, );
			addColumnPathMap(StkDiffLstDtlR.$lot_no_data, StktkAct_Srch01_RsltR.$lot_no);
//			addColumnPathMap(StkDiffLstDtlR.$sublot_no_view, );
			addColumnPathMap(StkDiffLstDtlR.$sublot_no_data, StktkAct_Srch01_RsltR.$sublot_no);
//			addColumnPathMap(StkDiffLstDtlR.$sno1_lbl, );
//			addColumnPathMap(StkDiffLstDtlR.$sno1_view, );
			addColumnPathMap(StkDiffLstDtlR.$sno1_data, StktkAct_Srch01_RsltR.$sno1);
//			addColumnPathMap(StkDiffLstDtlR.$sno2_lbl, );
//			addColumnPathMap(StkDiffLstDtlR.$sno2_view, );
			addColumnPathMap(StkDiffLstDtlR.$sno2_data, StktkAct_Srch01_RsltR.$sno2);
//			addColumnPathMap(StkDiffLstDtlR.$sno3_lbl, );
//			addColumnPathMap(StkDiffLstDtlR.$sno3_view, );
			addColumnPathMap(StkDiffLstDtlR.$sno3_data, StktkAct_Srch01_RsltR.$sno3);
//			addColumnPathMap(StkDiffLstDtlR.$sno4_lbl, );
//			addColumnPathMap(StkDiffLstDtlR.$sno4_view, );
			addColumnPathMap(StkDiffLstDtlR.$sno4_data, StktkAct_Srch01_RsltR.$sno4);
			addColumnPathMap(StkDiffLstDtlR.$tor_qty, StktkAct_Srch01_RsltR.$tor_qty);
//			addColumnPathMap(StkDiffLstDtlR.$s_tor_qty, );
//			addColumnPathMap(StkDiffLstDtlR.$s_int_tor_qty, );
//			addColumnPathMap(StkDiffLstDtlR.$s_dec_tor_qty, );
			addColumnPathMap(StkDiffLstDtlR.$std_upri, StktkAct_Srch01_RsltR.$std_upri);
			addColumnPathMap(StkDiffLstDtlR.$pack_unit_nm, StktkAct_Srch01_RsltR.$trd_unit_nm);
			addColumnPathMap(StkDiffLstDtlR.$act_qty, StktkAct_Srch01_RsltR.$trd_unit_qty);
//			addColumnPathMap(StkDiffLstDtlR.$s_act_qty, );
//			addColumnPathMap(StkDiffLstDtlR.$s_int_act_qty, );
//			addColumnPathMap(StkDiffLstDtlR.$s_dec_act_qty, );
			addColumnPathMap(StkDiffLstDtlR.$act_diff_qty, StktkAct_Srch01_RsltR.$act_diff_qty);
//			addColumnPathMap(StkDiffLstDtlR.$s_int_act_diff_qty, );
//			addColumnPathMap(StkDiffLstDtlR.$s_dec_act_diff_qty, );
			addColumnPathMap(StkDiffLstDtlR.$act_diff_amt, StktkAct_Srch01_RsltR.$act_diff_cost);
//			addColumnPathMap(StkDiffLstDtlR.$s_int_act_diff_amt, );
//			addColumnPathMap(StkDiffLstDtlR.$s_dec_act_diff_amt, );
			addColumnPathMap(StkDiffLstDtlR.$stktk_act_rmrks, StktkAct_Srch01_RsltR.$stktk_act_rmrks);
			addColumnPathMap(StkDiffLstDtlR.$sub_char1, StktkAct_Srch01_RsltR.$sub_char1);
			addColumnPathMap(StkDiffLstDtlR.$sub_char2, StktkAct_Srch01_RsltR.$sub_char2);
			addColumnPathMap(StkDiffLstDtlR.$sub_char3, StktkAct_Srch01_RsltR.$sub_char3);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.stk_insp_typ_lbl(MSC_STKTK_LIST_STR.STK_INSP_TYP.name(getUsrLocale()));
		}
	}

	protected Map_MST_STKTK_R_StktkList_Prnt01_DtlR<MST_STKTK_R,StktkList_Prnt01_DtlR> createMap_MST_STKTK_R_StktkList_Prnt01_DtlR() {
		return new Map_MST_STKTK_R_StktkList_Prnt01_DtlR<MST_STKTK_R, StktkList_Prnt01_DtlR>();
	}

	public class Map_MST_STKTK_R_StktkList_Prnt01_DtlR<D extends MST_STKTK_R, S extends StktkList_Prnt01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_STKTK_R.$loc_cd, StktkList_Prnt01_DtlR.$loc_cd);
			addColumnPathMap(MST_STKTK_R.$ctrl_tgt_dt, StktkList_Prnt01_DtlR.$ctrl_tgt_dt);
			addColumnPathMap(MST_STKTK_R.$itm_cd, StktkList_Prnt01_DtlR.$itm_cd);
			addColumnPathMap(MST_STKTK_R.$itm_sub1, StktkList_Prnt01_DtlR.$itm_sub1);
			addColumnPathMap(MST_STKTK_R.$itm_sub2, StktkList_Prnt01_DtlR.$itm_sub2);
			addColumnPathMap(MST_STKTK_R.$itm_sub3, StktkList_Prnt01_DtlR.$itm_sub3);
			addColumnPathMap(MST_STKTK_R.$stktk_typ, StktkList_Prnt01_DtlR.$stktk_typ);
			addColumnPathMap(MST_STKTK_R.$stktk_rpt_rmrks, StktkList_Prnt01_DtlR.$stktk_rpt_rmrks);
			addColumnPathMap(MST_STKTK_R.$stktk_rpt_prnt_flg, StktkList_Prnt01_DtlR.$stktk_rpt_flg);
			addColumnPathMap(MST_STKTK_R.$diff_rpt_prnt_flg, StktkList_Prnt01_DtlR.$diff_rpt_flg);

		}
	}

	//FMCB CUSTOM END
}