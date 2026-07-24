package mcframe.serverMSBB.MSBBL1220;

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
import mcframe.serverMSBB.MSBBL6020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL1220.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import static mcframe.serverMSBB.MSBBL1220.Query.*;
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;
import java.util.ArrayList;
import java.util.List;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.commonCore.param.MCParam;
import mcframe.serverFXUC.FXUCL0030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SloSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SloSrch_MC extends MSBBL_SloSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * ヘッダモードで受注を検索する<br>
	 */
	public class Srch01 extends MSBBL_SloSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			
			setGrpFlgTrue(up0());
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			setUpTmpCol();
			MCQueryPlan sql;
			if(up0().inc_past_flg()) {
				sql = MSBBL1220_MST_SLO_S02();
			}
			else {
				sql = MSBBL1220_MST_SLO_S01();
			}
			searchForDL(sql, up0(), down0());
		}
		
		/**
		 * 検索条件に対する一時カラムを設定する。
		 */
		protected void setUpTmpCol() {

			setUpTmpColCommon(up0());
			setUpTmpColCan(up0());
		}
		
		/**
		 * 分類ＦＬＧを設定する。
		 * @param cndR 検索条件
		 */
		protected void setGrpFlgTrue(Srch01_CndR cndR) {
			// 得意先
			cndR.cst_grp_flg1(true);
			cndR.cst_grp_flg2(true);
			cndR.cst_grp_flg3(true);
			cndR.cst_grp_flg4(true);
			cndR.cst_grp_flg5(true);
			cndR.cst_grp_flg6(true);
			cndR.cst_grp_flg7(true);
			cndR.cst_grp_flg8(true);
			cndR.cst_grp_flg9(true);
			cndR.cst_grp_flg10(true);
			// 納品先
			cndR.dlv_grp_flg1(true);
			cndR.dlv_grp_flg2(true);
			cndR.dlv_grp_flg3(true);
			cndR.dlv_grp_flg4(true);
			cndR.dlv_grp_flg5(true);
			cndR.dlv_grp_flg6(true);
			cndR.dlv_grp_flg7(true);
			cndR.dlv_grp_flg8(true);
			cndR.dlv_grp_flg9(true);
			cndR.dlv_grp_flg10(true);
			// 品目
			cndR.itm_grp_flg1(true);
			cndR.itm_grp_flg2(true);
			cndR.itm_grp_flg3(true);
			cndR.itm_grp_flg4(true);
			cndR.itm_grp_flg5(true);
			cndR.itm_grp_flg6(true);
			cndR.itm_grp_flg7(true);
			cndR.itm_grp_flg8(true);
			cndR.itm_grp_flg9(true);
			cndR.itm_grp_flg10(true);
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 明細モードで受注を検索する<br>
	 */
	public class Srch02 extends MSBBL_SloSrch_MC_A.Srch02 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			setUpTmpCol();
			
			MCQueryPlan sql = MSBBL1220_MST_SLO_D_S01();
			
			searchForDL(sql, up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			calcBaseCur();
			
			calcProfRate();
			
			crtSloDWk();
			
			setAllocWaitQty();
			
			setDlvInstDt();
			
			calcOverduePrspct();
		}
		
		/**
		 * 受注明細のワークテーブルを作成する。
		 */
		protected void crtSloDWk() {
			
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R sloDR = null;
			
			for (Srch01_RsltR rsltR : down0().groupBy(Srch01_RsltR.$slo_d_no)) {
				
				if (!isNull(rsltR.slo_d_no())) {
					
					sloDR = MST_SLO_D_R.create();
					sloDR.slo_d_no(rsltR.slo_d_no());
					
					sloDL.add(sloDR);
				}
			}
			
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			dbWkDelete("MSBBL1220_MSW_SLO_D_D01", sloDL_bldr.getBaseDbc());
			dbWkInsert("MSBBL1220_MSW_SLO_D_I01", sloDL, sloDL_bldr.getBaseDbc());
		}
		
		/**
		 * 引当数・保留数を設定する。
		 */
		protected void setAllocWaitQty() {

			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			executeQuery(rsltL, MSBBL1220_MST_SHIP_SCHD_S02());
			
			MCIndexKey idxkey = rsltL.createIndex(Srch01_RsltR.$slo_d_no);
			
			for (Srch01_RsltR downR : down0()) {
				
				Srch01_RsltR rsltR = rsltL.getFirst(idxkey, downR.slo_d_no());
				
				if (!isNull(rsltR)) {
					
					downR.alloc_qty(nvl(rsltR.alloc_qty(), MCNumber.ZERO));
					downR.wait_qty(nvl(rsltR.wait_qty(), MCNumber.ZERO));
					downR.ship_block_flg(nvl(rsltR.ship_block_flg(), false));
				}
				else {
					
					downR.alloc_qty(0);
					downR.wait_qty(0);
					downR.ship_block_flg(false);
				}
				downR.alloc_sts_typ(MSUCL_SlsUtil.getAllocStsTyp(
						downR.alloc_typ(),
						downR.ship_pr_base_unit_qty(),
						downR.alloc_qty(),
						downR.ship_schd_abort_qty(),
						downR.slo_d_can_flg()));
			}
		}
		
		/**
		 * 納入指示納期を設定する。
		 */
		protected void setDlvInstDt() {

			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			executeQuery(rsltL, MSBBL1220_MST_DLV_INST_RCPT_S01());
			
			MCIndexKey idxkey = rsltL.createIndex(Srch01_RsltR.$slo_d_no);
			
			for (Srch01_RsltR downR : down0()) {
				
				Srch01_RsltR rsltR = rsltL.getFirst(idxkey, downR.slo_d_no());
				
				if (!isNull(rsltR)) {
					
					downR.dlv_inst_dt(rsltR.dlv_inst_dt());
					downR.dlv_inst_hm(rsltR.dlv_inst_hm());
				}
			}
		}
		
		/**
		 * 遅れ見込数量を算出する。
		 */
		protected void calcOverduePrspct() {
			
			if (!up0().overdue_prspct_disp_flg()) {
				return;
			}
			
			// 出荷予定を取得
			MCList<Srch02_OverduePrspctRsltR> shipSchdL = MCList.create(Srch02_OverduePrspctRsltR.class);
			executeQuery(shipSchdL, MSBBL1220_MST_SHIP_SCHD_S03());
			
			// 依頼数量を取得
			MCList<Srch02_OverduePrspctRsltR> rqstL = MCList.create(Srch02_OverduePrspctRsltR.class);
			executeQuery(rqstL, MSBBL1220_MST_SLO_D_S02());
			
			shipSchdL = removeAllocShipSchd(shipSchdL, rqstL);
			
			// ＷＧ間依頼を取得
			MCList<Srch02_OverduePrspctRsltR> wgRqstPrmsL = MCList.create(Srch02_OverduePrspctRsltR.class);
			executeQuery(wgRqstPrmsL, MSBBL1220_MST_WG_RQST_PRMS_S01());
			
			// 調整済出荷予定を取得する。
			MCList<Srch02_OverduePrspctRsltR> adjShipSchdL = adjShipSchd(shipSchdL, wgRqstPrmsL);
			
			// 出荷予定日
			MCDate shipSchdDt = null;
			// 出荷予定数量
			MCNumber shipSchdQtySum = null;
			// 出荷予定日までの調整済出荷予定数
			MCNumber adjShipSchdQtySum = null;
			// 出荷実績数量
			MCNumber shipActQtySum = null;
			// 回答数量
			MCNumber prmsQtySum = null;
			// 遅れ見込数量
			MCNumber overduePrspctQty = null;
			
			MCList<Srch02_OverduePrspctRsltR> sloAdjShipSchdL = null;
			MCList<Srch02_OverduePrspctRsltR> sloShipSchdL = null;
			
			MCList<Srch01_RsltR> overduePrspctOnlyRslt = MCList.create(Srch01_RsltR.class);
			MCIndexKey ikShipSchd = shipSchdL.createIndex(Srch02_OverduePrspctRsltR.$slo_d_no);
			MCIndexKey ikAdjShipSchd = adjShipSchdL.createIndex(Srch02_OverduePrspctRsltR.$slo_d_no);
			
			for (Srch01_RsltR downR : down0()) {
				
				shipSchdQtySum = MCNumber.ZERO;
				adjShipSchdQtySum = MCNumber.ZERO;
				shipActQtySum = MCNumber.ZERO;
				prmsQtySum = MCNumber.ZERO;
				overduePrspctQty = MCNumber.ZERO;
				
				sloShipSchdL = shipSchdL.subList(ikShipSchd, downR.slo_d_no());
				sloAdjShipSchdL = adjShipSchdL.subList(ikAdjShipSchd, downR.slo_d_no());
				shipSchdDt = (MCDate)sloShipSchdL.max(Srch02_OverduePrspctRsltR.$dt);
				prmsQtySum = nvl(sloAdjShipSchdL.sum(Srch02_OverduePrspctRsltR.$prms_qty), MCNumber.ZERO);
				
				if (sloShipSchdL.isEmpty() 
						|| isNull(shipSchdDt)
						|| prmsQtySum.isZero()) {
					
					continue;
				}
				
				for (Srch02_OverduePrspctRsltR sloAdjShipSchdR : sloAdjShipSchdL) {
					
					if (!isNull(sloAdjShipSchdR.dt()) && MAUCL_DateUtil.isBeforeAfter(sloAdjShipSchdR.dt(), shipSchdDt)) {
						adjShipSchdQtySum = adjShipSchdQtySum.add(nvl(sloAdjShipSchdR.adj_ship_shcd_qty(), MCNumber.ZERO));
					}
				}
				
				shipActQtySum = nvl(sloShipSchdL.sum(Srch02_OverduePrspctRsltR.$ship_act_qty), MCNumber.ZERO);
				shipSchdQtySum = nvl(sloShipSchdL.sum(Srch02_OverduePrspctRsltR.$ship_schd_qty), MCNumber.ZERO);
				
				if (shipSchdQtySum.gt(shipActQtySum) && shipSchdQtySum.gt(prmsQtySum)) {
					
					// 未回答の出荷予定を遅れ見込みとする。
					overduePrspctQty = shipSchdQtySum.subtract(prmsQtySum);
					
					// 遅れ見込数量 = 調整済出荷予定日  > 出荷予定日の数量合計
					for (Srch02_OverduePrspctRsltR sloAdjShipSchdR : sloAdjShipSchdL) {
						
						if (!isNull(sloAdjShipSchdR.dt()) && !MAUCL_DateUtil.isBeforeAfter(sloAdjShipSchdR.dt(), shipSchdDt)) {
							overduePrspctQty = overduePrspctQty.add(nvl(sloAdjShipSchdR.adj_ship_shcd_qty(), MCNumber.ZERO));
						}
					}
					
					overduePrspctQty = MCNumber.min(overduePrspctQty, shipSchdQtySum.subtract(shipActQtySum));
				}
				else if (!MAUCL_DateUtil.isBeforeAfter((MCDate)sloAdjShipSchdL.max(Srch02_OverduePrspctRsltR.$dt), shipSchdDt)) {
					
					if (MAUCL_DateUtil.isBeforeAfter(MCDate.now().modDate(getToday()), shipSchdDt) && adjShipSchdQtySum.gt(shipActQtySum)) {
						
						// 遅れ見込数量 = 調整済出荷予定日  > 出荷予定日の数量合計
						for (Srch02_OverduePrspctRsltR sloAdjShipSchdR : sloAdjShipSchdL) {
							
							if (!MAUCL_DateUtil.isBeforeAfter(sloAdjShipSchdR.dt(), shipSchdDt)) {
								overduePrspctQty = overduePrspctQty.add(nvl(sloAdjShipSchdR.adj_ship_shcd_qty(), MCNumber.ZERO));
							}
						}
					} else {
						// 遅れ見込数量 = 調整済出荷予定数量合計 - 出荷実績数量
						overduePrspctQty = nvl(sloAdjShipSchdL.sum(Srch02_OverduePrspctRsltR.$adj_ship_shcd_qty), MCNumber.ZERO).subtract(shipActQtySum);
					}
				}
				
				downR.overdue_prspct_qty(overduePrspctQty.isPositive() ? overduePrspctQty : MCNumber.ZERO);
				
				if (!downR.overdue_prspct_qty().isZero()) {
					overduePrspctOnlyRslt.add(downR.clone());
				}
			}
			
			if (up0().overdue_prspct_only_flg()) {
				down0().setAll(overduePrspctOnlyRslt);
			}
		}
		
		/**
		 * 引当後手配の場合に、依頼数量は出荷予定数量と異なるため、在庫を引当できた分を除外する。
		 * @param shipSchdL 出荷予定リスト
		 * @param rqstL 依頼数量リスト（受注明細の依頼数量、単位を格納したりすと）
		 * @return
		 */
		protected MCList<Srch02_OverduePrspctRsltR> removeAllocShipSchd(MCList<Srch02_OverduePrspctRsltR> shipSchdL, MCList<Srch02_OverduePrspctRsltR> rqstL) {
			
			if (isNull(rqstL) || rqstL.isEmpty()) {
				return shipSchdL;
			}
			
			MCList<Srch02_OverduePrspctRsltR> rqstShipSchdL = MCList.create(Srch02_OverduePrspctRsltR.class);
			
			MCGroupByPolicy policy = new MCGroupByPolicy(Srch02_OverduePrspctRsltR.$slo_d_no);
			policy.sum(Srch02_OverduePrspctRsltR.$ship_schd_qty);
			MCList<Srch02_OverduePrspctRsltR> grpShipSchdL = shipSchdL.groupBy(policy);
			
			MCIndexKey shipSchdIdxkey = shipSchdL.createIndex(Srch02_OverduePrspctRsltR.$slo_d_no);
			MCIndexKey rqstIdxkey = rqstL.createIndex(Srch02_OverduePrspctRsltR.$slo_d_no);
			
			for (Srch02_OverduePrspctRsltR rqstR : rqstL) {
				if (!isSame(rqstR.rqst_unit_cd(), rqstR.base_unit_cd())) {
					rqstR.base_unit_rqst_qty(
							convToBaseUnit(
									rqstR.rqst_qty(), 
									rqstR.conv_base_qty(), 
									rqstR.conv_qty(), 
									rqstR.base_unit_dec_place(), 
									rqstR.base_unit_rnd_typ()));
				}
				else {
					rqstR.base_unit_rqst_qty(rqstR.rqst_qty());
				}
			}
			
			for (Srch02_OverduePrspctRsltR grpShipSchdR : grpShipSchdL) {
				
				MCList<Srch02_OverduePrspctRsltR> subShipSchdL = shipSchdL.subList(shipSchdIdxkey, grpShipSchdR.slo_d_no());
						
				Srch02_OverduePrspctRsltR rqstR = rqstL.getFirst(rqstIdxkey, grpShipSchdR.slo_d_no());
				
				if (!isNull(rqstR) && !isSame(grpShipSchdR.ship_schd_qty(), rqstR.base_unit_rqst_qty())) {
					
					// 引当数量 = 出荷予定数量の合計 - 依頼数量
					MCNumber shipSchdAllocQty = grpShipSchdR.ship_schd_qty().subtract(rqstR.base_unit_rqst_qty());
					MCNumber shipActAllocQty = shipSchdAllocQty;
					
					subShipSchdL.sort(SortType.ASC, Srch02_OverduePrspctRsltR.$dt);
					for (Srch02_OverduePrspctRsltR subShipSchdR : subShipSchdL) {
						
						if (!isNull(subShipSchdR.ship_schd_qty()) && subShipSchdR.ship_schd_qty().isPositive()) {
							
							if (subShipSchdR.ship_schd_qty().lte(shipSchdAllocQty)) {
								shipSchdAllocQty = shipSchdAllocQty.subtract(subShipSchdR.ship_schd_qty());
								subShipSchdR.ship_schd_qty(MCNumber.ZERO);
							}
							else {
								subShipSchdR.ship_schd_qty(subShipSchdR.ship_schd_qty().subtract(shipSchdAllocQty));
								shipSchdAllocQty = MCNumber.ZERO;
							}
						}
						
						if (!isNull(subShipSchdR.ship_act_qty()) && subShipSchdR.ship_act_qty().isPositive()) {
							
							if (subShipSchdR.ship_act_qty().lte(shipActAllocQty)) {
								shipActAllocQty = shipActAllocQty.subtract(subShipSchdR.ship_act_qty());
								subShipSchdR.ship_act_qty(MCNumber.ZERO);
							}
							else {
								
								subShipSchdR.ship_act_qty(subShipSchdR.ship_act_qty().subtract(shipActAllocQty));
								shipActAllocQty = MCNumber.ZERO;
							}
						}
						
						if ((!isNull(subShipSchdR.ship_schd_qty()) && subShipSchdR.ship_schd_qty().isPositive())
								|| !isNull(subShipSchdR.ship_act_qty()) && subShipSchdR.ship_act_qty().isPositive()) {
							rqstShipSchdL.add(subShipSchdR);
						}
					}
				}
				else {
					rqstShipSchdL.addAll(subShipSchdL);
				}
			}
			
			return rqstShipSchdL;
		}
		
		/**
		 * 出荷予定とＷＧ間依頼回答を照らし合わせて、見込出荷予定を調整する。
		 * @param shipSchdL 出荷予定リスト
		 * @param wgRqstPrmsL ＷＧ間依頼回答リスト
		 * @return 調整済出荷予定
		 */
		protected MCList<Srch02_OverduePrspctRsltR> adjShipSchd(MCList<Srch02_OverduePrspctRsltR> shipSchdL, MCList<Srch02_OverduePrspctRsltR> wgRqstPrmsL) {
			
			MCList<Srch02_OverduePrspctRsltR> adjShipSchdL = MCList.create(Srch02_OverduePrspctRsltR.class);
			adjShipSchdL.setAll(shipSchdL);
			adjShipSchdL.addAll(wgRqstPrmsL);
			
			MCGroupByPolicy policy = new MCGroupByPolicy(
					Srch02_OverduePrspctRsltR.$slo_d_no, 
					Srch02_OverduePrspctRsltR.$dt);
			policy.sum(Srch02_OverduePrspctRsltR.$ship_schd_qty,
					Srch02_OverduePrspctRsltR.$prms_qty);
			
			MCList<Srch02_OverduePrspctRsltR> grpAdjShipSchdL = adjShipSchdL.groupBy(policy);
			
			MCList<Srch02_OverduePrspctRsltR> sloAdjShipSchdL = null;
			MCNumber shipSchdQtySum = null;
			MCNumber prmsQtySum = null;
			MCNumber adjShipSchdQtySum = null;
			MCIndexKey ikGrpAdjShipSchd = grpAdjShipSchdL.createIndex(Srch02_OverduePrspctRsltR.$slo_d_no);
			
			for (Srch02_OverduePrspctRsltR grpAdjShipSchdR : grpAdjShipSchdL.groupBy(Srch02_OverduePrspctRsltR.$slo_d_no)) {
				
				shipSchdQtySum = MCNumber.ZERO;
				prmsQtySum = MCNumber.ZERO;
				adjShipSchdQtySum = MCNumber.ZERO;
				
				sloAdjShipSchdL = grpAdjShipSchdL.subList(ikGrpAdjShipSchd, grpAdjShipSchdR.slo_d_no());
				sloAdjShipSchdL.sort(Srch02_OverduePrspctRsltR.$dt);
				
				for (Srch02_OverduePrspctRsltR sloAdjShipSchdR : sloAdjShipSchdL) {
					
					shipSchdQtySum = shipSchdQtySum.add(nvl(sloAdjShipSchdR.ship_schd_qty(), MCNumber.ZERO));
					prmsQtySum = prmsQtySum.add(nvl(sloAdjShipSchdR.prms_qty(), MCNumber.ZERO));
					
					sloAdjShipSchdR.adj_ship_shcd_qty(MCNumber.min(shipSchdQtySum, prmsQtySum).subtract(adjShipSchdQtySum));
					adjShipSchdQtySum =  MCNumber.min(shipSchdQtySum, prmsQtySum);
				}
			}
			
			return grpAdjShipSchdL;
		}
		
		/**
		 * 基準通貨の単価・金額項目を算出する。
		 */
		protected void calcBaseCur() {
			
			String rndMode = getCo().xrate_rnd_typ();
			MCNumber baseAmtDecPlace = getBaseCur().amt_dec_place();
			MCNumber baseUpriDecPlace = getBaseCur().upri_dec_place();
			
			MCNumber ptaxAmtDecPlace = getPtaxCur().amt_dec_place();
			MCNumber ptaxUpriDecPlace = getPtaxCur().upri_dec_place();
			
			for (Srch01_RsltR rsltR : down0()) {
				
				rsltR.base_cur_upri(convToBaseCur(rsltR.trd_cur_upri(), rsltR.xrate(), baseUpriDecPlace, rndMode));
				rsltR.base_cur_amt(convToBaseCur(rsltR.trd_cur_amt(), rsltR.xrate(), baseAmtDecPlace, rndMode));
				rsltR.base_cur_tax_amt(convToBaseCur(rsltR.trd_cur_tax_amt(), rsltR.xrate(), baseAmtDecPlace, rndMode));
				rsltR.base_cur_inc_tax_amt(convToBaseCur(rsltR.trd_cur_inc_tax_amt(), rsltR.xrate(), baseAmtDecPlace, rndMode));
				
				rsltR.ptax_cur_upri(convCur(rsltR.trd_cur_upri(), rsltR.ptax_xrate(), ptaxUpriDecPlace, rndMode));
				rsltR.ptax_cur_amt(convCur(rsltR.trd_cur_amt(), rsltR.ptax_xrate(), ptaxAmtDecPlace, rndMode));
				rsltR.ptax_cur_tax_amt(convCur(rsltR.trd_cur_tax_amt(), rsltR.ptax_xrate(), ptaxAmtDecPlace, rndMode));
				rsltR.ptax_cur_inc_tax_amt(convCur(rsltR.trd_cur_inc_tax_amt(), rsltR.ptax_xrate(), ptaxAmtDecPlace, rndMode));
			}
		}
		
		/**
		 * 粗利率を計算する。
		 */
		protected void calcProfRate() {

			for (Srch01_RsltR rsltR : down0()) {
				
				rsltR.prof_rate(MSUCL_SlsUtil.getProfRate(rsltR.base_cur_amt(), rsltR.cost_amt()));
			}
		}
		
		/**
		 * 検索条件に対する一時カラムを設定する。
		 */
		protected void setUpTmpCol() {

			setUpTmpColCommon(up0());
			setUpTmpColSlsSts(up0());
			setUpTmpColAllocSts(up0());
			setUpTmpColKpiCommon(up0());
			setUpTmpColKpiDtl(up0());
			setUpTmpColCan(up0());
			setUpTmpColAbort(up0());
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 出荷予定モードで受注を検索する<br>
	 */
	public class Srch03 extends MSBBL_SloSrch_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			setUpTmpCol();
			
			MCQueryPlan sql = MSBBL1220_MST_SHIP_SCHD_S01();
			searchForDL(sql, up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			setAllocStsTyp();
			setPurcDdlvDlvSlip();
		}
		
		/**
		 * 検索条件に対する一時カラムを設定する。
		 */
		protected void setUpTmpCol() {

			setUpTmpColCommon(up0());
			setUpTmpColAllocSts(up0());
			setUpTmpColPrSts(up0());
			setUpTmpColKpiCommon(up0());
			setUpTmpColPdInstDlvDtOverdue(up0());
			setUpTmpColShipBlock(up0());
			setUpTmpColAbort(up0());
		}
		
		/**
		 * 引当状況区分を設定する
		 */
		protected void setAllocStsTyp() {
		
			for (Srch01_RsltR downR : down0()) {
				downR.alloc_sts_typ(MSUCL_SlsUtil.getAllocStsTyp(
						downR.alloc_typ(), 
						downR.base_unit_qty(), 
						downR.alloc_qty(), 
						null, 
						false));
			}
		}
		/**
		 * 発注・納入指示・納期回答受領で作成される、仕入直送の納品書ＮＯを取得する
		 */
		protected void setPurcDdlvDlvSlip() {
			MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			for (Srch01_RsltR rsltR : down0()) {
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(rsltR.proc_typ())) {
					MST_SHIP_SCHD_R shipSchdR = shipSchdL.add();
					shipSchdR.ship_schd_no(rsltR.ship_schd_no());
				}
			}
			if (shipSchdL.isEmpty()) {
				return;
			}
			
			delShipSchdWk();
			insShipSchdWk(shipSchdL);
			
			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			executeQuery(rsltL, MSBBL1220_MST_PURC_DLV_SLIP_D_S01());
			
			MCIndexKey idx = down0().createIndex(Srch01_RsltR.$ship_schd_no);
			for (Srch01_RsltR rsltR : rsltL) {
				Srch01_RsltR downR = down0().getFirst(idx, rsltR.ship_schd_no());
				downR.dlv_slip_no(rsltR.dlv_slip_no());
				downR.dlv_slip_d_no(rsltR.dlv_slip_d_no());
			}
			
			delShipSchdWk();
		}
		protected void insShipSchdWk(MCList<MST_SHIP_SCHD_R> shipSchdL) {
			dbWkInsert("MSBBL1220_MSW_SHIP_SCHD_I01", shipSchdL, MST_SHIP_SCHD_R.create("T"));
		}
		protected void delShipSchdWk() {
			dbWkDelete("MSBBL1220_MSW_SHIP_SCHD_D01", MST_SHIP_SCHD_R.create("T"));
		}
	}
	
	/**
	 * 
	 * 検索条件に対する一時カラムを設定する。（共通）
	 * @param cndR 検索条件
	 */
	protected void setUpTmpColCommon(Srch01_CndR cndR) {
		
		cndR.addStringColumn("APRV_FLG_STR", MCBooleanUtil.booleanToDBString(cndR.aprv_invalid_flg()));
		
		List<String> aprvStsL = new ArrayList<String>();
		
		if (cndR.aprv_open_flg()) {
			aprvStsL.add(MAC_APRV_STS_TYP.OPN.value());
		}
		if (cndR.aprv_fix_flg()) {
			aprvStsL.add(MAC_APRV_STS_TYP.FIX.value());
		}
		if (cndR.aprv_acpt_flg()) {
			aprvStsL.add(MAC_APRV_STS_TYP.ACPT.value());
		}
		if (cndR.aprv_rjct_flg()) {
			aprvStsL.add(MAC_APRV_STS_TYP.RJCT.value());
		}
		if (cndR.aprv_last_rjct_flg()) {
			aprvStsL.add(MAC_APRV_STS_TYP.LAST_RJCT.value());
		}
		
		cndR.addStringColumn(MAC_APRV_STS_TYP.$VALUE, MCStringUtil.arrayValueJoin(aprvStsL.toArray(new String[0])));
		
		if (!isSame(cndR.iv_trd_invalid_flg(), cndR.iv_trd_flg())) {
			
			cndR.addStringColumn("IV_TRD_FLG_STR", MCBooleanUtil.booleanToDBString(cndR.iv_trd_flg()));
		}

		if (!isSame(cndR.edi_invalid_flg(), cndR.edi_flg())) {
			
			cndR.addStringColumn("EDI_FLG_STR", MCBooleanUtil.booleanToDBString(cndR.edi_flg()));
		}
	}
	
	/**
	 * 検索条件（販売状況）に対する一時カラムを設定する。
	 * @param cndR 検索条件
	 */
	protected void setUpTmpColSlsSts(Srch01_CndR cndR) {
		
		List<String> slsStsL = new ArrayList<>();
		
		if (cndR.slo_flg()) {
			slsStsL.add(MSC_SLS_STS_TYP.SLO.value());
		}
		if (cndR.prms_flg()) {
			slsStsL.add(MSC_SLS_STS_TYP.PRMS.value());
		}
		if (cndR.dlv_inst_rcpt_flg()) {
			slsStsL.add(MSC_SLS_STS_TYP.DLV_INST_RCPT.value());
		}
		if (cndR.dlv_inst_prms_flg()) {
			slsStsL.add(MSC_SLS_STS_TYP.DLV_INST_PRMS.value());
		}
		if (cndR.sls_flg()) {
			slsStsL.add(MSC_SLS_STS_TYP.SLS.value());
		}
		if (cndR.sls_ship_flg()) {
			slsStsL.add(MSC_SLS_STS_TYP.SHIP.value());
		}
		if (cndR.sls_compl_flg()) {
			slsStsL.add(MSC_SLS_STS_TYP.COMPL.value());
		}
		
		cndR.addStringColumn(MSC_SLS_STS_TYP.$VALUE, MCStringUtil.arrayValueJoin(slsStsL.toArray(new String[0])));
	}
	
	/**
	 * 検索条件（引当状況）に対する一時カラムを設定する。
	 * @param cndR 検索条件
	 */
	protected void setUpTmpColAllocSts(Srch01_CndR cndR) {
		
		if (cndR.not_alloc_flg() && cndR.part_alloc_flg() && cndR.all_alloc_flg() && cndR.alloc_invalid_flg()) {
			// 全てTRUEの場合は、引当状況に関するWHERE句はカットオフされるようにする
		}
		else {
			cndR.addStringColumn("NOT_ALLOC_FLG_STR", MCBooleanUtil.booleanToDBString(cndR.not_alloc_flg()));
			cndR.addStringColumn("PART_ALLOC_FLG_STR", MCBooleanUtil.booleanToDBString(cndR.part_alloc_flg()));
			cndR.addStringColumn("ALL_ALLOC_FLG_STR", MCBooleanUtil.booleanToDBString(cndR.all_alloc_flg()));
			cndR.addStringColumn("ALLOC_INVALID_FLG_STR", MCBooleanUtil.booleanToDBString(cndR.alloc_invalid_flg()));
		}
	}
	
	/**
	 * 検索条件（進捗状況区分）に対する一時カラムを設定する。
	 * @param cndR 検索条件
	 */
	protected void setUpTmpColPrSts(Srch01_CndR cndR) {
		
		List<String> prStsL = new ArrayList<String>();
		
		if (cndR.not_inst_flg()) {
			prStsL.add(MSC_PR_STS_TYP.NOT_INST.value());
		}
		if (cndR.inst_flg()) {
			prStsL.add(MSC_PR_STS_TYP.INST.value());
		}
		if (cndR.not_ship_flg()) {
			prStsL.add(MSC_PR_STS_TYP.NOT_SHIP.value());
		}
		if (cndR.part_ship_flg()) {
			prStsL.add(MSC_PR_STS_TYP.PART_SHIP.value());
		}
		if (cndR.ship_flg()) {
			prStsL.add(MSC_PR_STS_TYP.SHIP.value());
		}
		cndR.addStringColumn(MSC_PR_STS_TYP.$VALUE, MCStringUtil.arrayValueJoin(prStsL.toArray(new String[0])));
	}
	
	/**
	 * 検索条件（出荷留め）に対する一時カラムを設定する。
	 * @param cndR 検索条件
	 */
	protected void setUpTmpColShipBlock(Srch01_CndR cndR) {
		
		cndR.addStringColumn("SHIP_BLOCK_FLG_STR", toTrueStr(cndR.ship_block_flg()));
	}
	
	/**
	 * 検索条件（ＫＰＩ共通）に対する一時カラムを設定する。
	 * @param cndR 検索条件
	 */
	protected void setUpTmpColKpiCommon(Srch01_CndR cndR) {

		cndR.addStringColumn("SHIP_RQST_DT_OVERDUE_FLG_STR", toTrueStr(cndR.ship_rqst_dt_overdue_flg()));
		cndR.addStringColumn("DLV_RQST_DT_OVERDUE_FLG_STR", toTrueStr(cndR.dlv_rqst_dt_overdue_flg()));
		
	}
	
	/**
	 * 検索条件（納品依頼日遅れ（予定））に対する一時カラムを設定する。
	 * @param cndR 検索条件
	 */
	protected void setUpTmpColPdInstDlvDtOverdue(Srch01_CndR cndR) {
		
		cndR.addStringColumn("PD_INST_DLV_DT_OVERDUE_FLG_STR", toTrueStr(cndR.pd_inst_dlv_dt_overdue_flg()));
	}
	
	/**
	 * 検索条件（ＫＰＩ明細モード）に対する一時カラムを設定する。
	 * @param cndR 検索条件
	 */
	protected void setUpTmpColKpiDtl(Srch01_CndR cndR) {

		cndR.addStringColumn("DLV_RQST_DT_OVERDUE_ACT_FLG_STR", toTrueStr(cndR.dlv_rqst_dt_overdue_act_flg()));
		cndR.addStringColumn("PRMS_DLV_DT_OVERDUE_ACT_FLG_STR", toTrueStr(cndR.prms_dlv_dt_overdue_act_flg()));
	}
	
	/**
	 * 検索条件（取消含む）に対する一時カラムを設定する。
	 * @param cndR 検索条件
	 */
	protected void setUpTmpColCan(Srch01_CndR cndR) {

		cndR.addStringColumn("INC_CAN_FLG_STR", toFalseStr(cndR.inc_can_flg()));
	}
	
	/**
	 * 検索条件（打切り含む）に対する一時カラムを設定する。
	 * @param cndR 検索条件
	 */
	protected void setUpTmpColAbort(Srch01_CndR cndR) {

		cndR.addStringColumn("INC_ABORT_FLG_STR", toFalseStr(cndR.inc_abort_flg()));
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ受注のチェック処理を行う。<br>
	 */
	public class Imp01 extends MSBBL_SloSrch_MC_A.Imp01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt(){
			editUp();
			callSloBulkImpChk01();
			setDown();
		}

		protected void editUp() {
			setPegNo(Slo_BulkImp_Chk01_DtlR.$peg_no, up0());
			up0().setStringNE(Slo_BulkImp_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
		}

		protected void callSloBulkImpChk01() {
			MSBBL_SloRegService.Slo_BulkImp_Chk01 ope = MSBBL_SloRegService.crtSlo_BulkImp_Chk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 受注を登録する。<br>
	 */
	public class Ins01 extends MSBBL_SloSrch_MC_A.Ins01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			
			editUp();
			callSloBulkImpChk01();
			
			MCList<Slo_BulkImp_Chk01_DtlR> notErrL = up0().subList(Slo_BulkImp_Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {
				callSloBulkImpIns01(notErrL);
			}
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setShipDlvDt();
			setPegNo(Slo_BulkImp_Chk01_DtlR.$peg_no, up0());
			up0().setStringNE(Slo_BulkImp_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			
			MCList<Slo_BulkImp_Chk01_DtlR>[] grpL = up0().groupList(getGrpKey());
			int cnt = 0;
			for (MCList<Slo_BulkImp_Chk01_DtlR> l : grpL) {
				l.setNumber(Slo_BulkImp_Chk01_DtlR.$hdr_peg_no, cnt++);
			}
		}

		protected void setShipDlvDt() {
			for (Slo_BulkImp_Chk01_DtlR upR : up0()) {
				if (upR.not_dt_calc_flg()) {
					upR.ship_schd_dt(upR.ship_schd_tm());
					upR.ship_schd_hm(upR.ship_schd_tm());
					upR.dlv_schd_dt(upR.dlv_schd_tm());
					upR.dlv_schd_hm(upR.dlv_schd_tm());
				}
				upR.ship_rqst_dt(upR.ship_rqst_tm());
				upR.ship_rqst_hm(upR.ship_rqst_tm());
				upR.dlv_rqst_dt(upR.dlv_rqst_tm());
				upR.dlv_rqst_hm(upR.dlv_rqst_tm());
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callSloBulkImpChk01() {
			MSBBL_SloRegService.Slo_BulkImp_Chk01 ope = MSBBL_SloRegService.crtSlo_BulkImp_Chk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		/**
		 * 受注登録サービスの更新処理を実行する
		 */
		protected void callSloBulkImpIns01(MCList<Slo_BulkImp_Chk01_DtlR> notErrL) {
			MSBBL_SloRegService.Slo_BulkImp_Ins01 ope = MSBBL_SloRegService.crtSlo_BulkImp_Ins01();
			ope.up0().setAll(notErrL);
			ope.exec();
			
			copyByPegNo(up0(), new String[]{Slo_BulkImp_Chk01_DtlR.$peg_no},
					ope.down0(), new String[]{Slo_BulkImp_Chk01_DtlR.$peg_no});
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Slo_BulkImp_Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Slo_BulkImp_Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Slo_BulkImp_Chk01_DtlR> up0L = ((MCList<Slo_BulkImp_Chk01_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		protected List<MCList<Slo_BulkImp_Chk01_DtlR>> splitUp(MCList<Slo_BulkImp_Chk01_DtlR> list, int max) {
			List<MCList<Slo_BulkImp_Chk01_DtlR>> ret = new ArrayList<>();
			MCList<Slo_BulkImp_Chk01_DtlR> tmp = MCList.create(Slo_BulkImp_Chk01_DtlR.class);
			// データ補完
			crrctData(list);

			MCList<Slo_BulkImp_Chk01_DtlR>[] credCdGrpL = list.groupList(Slo_BulkImp_Chk01_DtlR.$cred_cd);
			for (MCList<Slo_BulkImp_Chk01_DtlR> credCdL : credCdGrpL) {
				if (!isNull(credCdL.get(0).cred_cd())) {
					if (tmp.size() >= max) {
						ret.add(tmp);
						tmp = MCList.create(Slo_BulkImp_Chk01_DtlR.class);
					}
					tmp.addAll(credCdL);
				}
				else {
					// 与信管理先ＣＤがなければ得意先ＣＤ
					MCList<Slo_BulkImp_Chk01_DtlR>[] cstCdGrpL = credCdL.groupList(Slo_BulkImp_Chk01_DtlR.$cst_cd);
					for (MCList<Slo_BulkImp_Chk01_DtlR> cstCdL : cstCdGrpL) {
						if (tmp.size() >= max) {
							ret.add(tmp);
							tmp = MCList.create(Slo_BulkImp_Chk01_DtlR.class);
						}
						tmp.addAll(cstCdL);
					}
				}
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * データ補完
		 * @param list
		 */
		protected void crrctData(MCList<Slo_BulkImp_Chk01_DtlR> list) {
			
			MCList<Slo_BulkImp_Chk01_DtlR>[] grpL = list.groupList(getGrpKey());
			for (MCList<Slo_BulkImp_Chk01_DtlR> l : grpL) {
				// 与信管理先ＣＤ
				String credCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_CRED_OF_CST", "01"), MAPA_BP$F_GET_CRED_OF_CST(value(l.get(0).cst_cd())));
				l.setStringNE(Slo_BulkImp_Chk01_DtlR.$cred_cd, credCd);
			}
		}

		/** 下り電文設定 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** 正常終了したスレッドの後処理 */
		protected void handleSuccess() {
			dbTran().commit();
			for (Slo_BulkImp_Chk01_DtlR r : up0()) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/** 例外が発生したスレッドのエラー処理 */
		protected void handleEx(Exception e) {

			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Slo_BulkImp_Chk01_DtlR r : up0()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 同一取込グループのキーを返す。
		 * @return 同一取込グループのキー
		 */
		protected String[] getGrpKey() {
			
			return new String[] { 
					Slo_BulkImp_Chk01_DtlR.$qtn_no,
					Slo_BulkImp_Chk01_DtlR.$qtn_rev,
					Slo_BulkImp_Chk01_DtlR.$trd_cd,
					Slo_BulkImp_Chk01_DtlR.$cst_cd,
					Slo_BulkImp_Chk01_DtlR.$hdr_grp_no};
		}

		/** 取引先マスタ取得 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _bp;
		/**
		 * 取引先ＣＤから取引先マスタ情報を取得する。
		 * 
		 * @param bpCd
		 */
		public MAM_BP_R getBp(String bpCd) {
			if (_bp == null) {
				_bp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")));
			}
			return _bp.get(bpCd);
		}

	}

	//FMCB CUSTOM END
}