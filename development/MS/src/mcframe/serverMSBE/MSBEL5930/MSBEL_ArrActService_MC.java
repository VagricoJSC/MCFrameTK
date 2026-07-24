package mcframe.serverMSBE.MSBEL5930;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5930.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMBBA.MBBAL5010.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBB.MSBBL6210.*;
import mcframe.serverMSBC.MSBCL6130.*;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import mcframe.serverMSBD.MSBDL5030.*;
import mcframe.serverMSBD.MSBDL5180.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5270.*;
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5540.*;
import mcframe.serverMSBE.MSBEL5740.*;
import mcframe.serverMSBE.MSBEL5900.*;
import static mcframe.serverMSBE.MSBEL5930.Query.*;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBF.MSBFL5110.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBI.MSBIL5010.*;
import mcframe.serverMABC.MABCL5010.*;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;

import java.util.Map;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ArrActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ArrActService_MC extends MSBEL_ArrActService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ArrAct_Upd01オペレーション.<p>
	 *
	 * 登録済みの入荷実績（リビジョン管理）および各実績を更新する。<br>
	 */
	public class ArrAct_Upd01 extends MSBEL_ArrActService_MC_A.ArrAct_Upd01 {
		protected final String ORG_TRD_UNIT_QTY = "_org_trd_unit_qty";
		protected final String ORG_BASE_UNIT_QTY = "_org_base_unit_qty";
		protected final String ORG_ARR_LOC_CD = "_org_arr_loc_cd";

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doCache();
			editUp();
			callPurcActRegService();
			updArrAct();
			callIoActIns01();
			doSub1();
			doSub2();
			callIoActUpd01();
			callLotService();
			setDown();
		}

		protected void doCache() {
			MCList<MST_ARR_SCHD_R> bindL = MCList.create(MST_ARR_SCHD_R.class);
			MCList<MST_ARR_SCHD_R> ship2L = MCList.create(MST_ARR_SCHD_R.class);
			MCList<MST_ARR_SCHD_R> ship3L = MCList.create(MST_ARR_SCHD_R.class);

			for(ArrAct_DtlR r : up1()) {

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
					r.arr_schd_no(aaR.arr_schd_no());
				}

				if (!isNull(r.arr_schd_no())) {
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					if (!isNull(asR.getString("sls_ret_schd_d_no"))) {
						bindL.add(asR);
					}
					if (!isNull(asR.getString("ret_dlv_slip_d_no"))) {
						MST_ARR_SCHD_R tmpR = MST_ARR_SCHD_R.create();
						tmpR.setStringNE("dlv_slip_d_no", asR.getString("ret_dlv_slip_d_no"));
						ship2L.add(tmpR);
					}
					if (!isNull(asR.getString("dlv_slip_d_no"))
						&& isNull(asR.getString("sls_ret_schd_d_no"))) {
						ship2L.add(asR);
					}
					if (!isNull(asR.getString("dlv_slip_d_no"))
						&& !isNull(asR.getString("iv_d_no"))) {
						ship3L.add(asR);
					}
				}
			}
			initSlsRetSchdDL(bindL);
			initShipActDL2(ship2L);
			initShipActDL3(ship2L);
			initIvShipActDL(ship3L);
			initPurcAct(up1());
		}

		protected void editUp() {
			MCList<ArrAct_DtlR> inspL = MCList.create(ArrAct_DtlR.class);
			
			for (ArrAct_DtlR r : up1()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (!isNull(r.arr_schd_no())
						&& (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()))) {
						inspL.add(r);
					}
					else if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
						if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
							|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
							inspL.add(r);
						}
					}
				}
				else {
					MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
					r.trd_ptn_typ(aaR.trd_ptn_typ());
					r.arr_schd_no(aaR.arr_schd_no());
					r.purc_id_typ(aaR.purc_id_typ());
					r.sync_flg(aaR.sync_flg());
					r.arr_ptn_typ(aaR.getString("arr_ptn_typ"));
					r.arr_tm(aaR.arr_tm());
					r.arr_loc_cd(aaR.arr_loc_cd());
					r.itm_cd(aaR.itm_cd());
					r.itm_sub1(aaR.itm_sub1());
					r.itm_sub2(aaR.itm_sub2());
					r.itm_sub3(aaR.itm_sub3());
					r.trd_unit_qty(aaR.trd_unit_qty());
					r.trd_unit_cd(aaR.trd_unit_cd());
				}
				
				r.addNumberColumn(ORG_TRD_UNIT_QTY);
				r.addNumberColumn(ORG_BASE_UNIT_QTY);
				r.addStringColumn(ORG_ARR_LOC_CD);
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
					r.setNumber(ORG_TRD_UNIT_QTY, aaR.trd_unit_qty());
					r.setNumber(ORG_BASE_UNIT_QTY, aaR.base_unit_qty());
					r.setString(ORG_ARR_LOC_CD, aaR.arr_loc_cd());
					// 仕入実績登録サービスから呼び出す場合、以下の項目は仕入実績登録時に変更できないため、補完する
					if (!up0().purc_act_flg()) {
						r.arr_usr_cd(aaR.arr_usr_cd());
						r.arr_dpt_cd(aaR.arr_dpt_cd());
						r.insp_cnt_rmrks(aaR.insp_cnt_rmrks());
						r.intr_rmrks(aaR.intr_rmrks());
						r.trd_rmrks(aaR.trd_rmrks());
						r.trd_d_rmrks(aaR.trd_d_rmrks());
						r.sub_char1(aaR.sub_char1());
						r.sub_char2(aaR.sub_char2());
						r.sub_char3(aaR.sub_char3());
					}
				}
				if (!MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
					r.insp_cnt_rmrks(null);
				}
				
				r.temp_ap_flg(isTempAp(r.arr_act_no(), r.sppl_cd(), r.arr_ptn_typ()));
				r.can_ac_dt(getCanAcDt(r));
			}
			
			callInspSchdSrch02(inspL);
		}

		protected void setDown() {
			setPrStsTyp();
			down0().setAll(up1());
		}

		/**
		 * 進捗状況設定
		 */
		protected void setPrStsTyp() {
			initArrSchdCache(up1());
			for (ArrAct_DtlR r : up1()) {
				if (!isNull(r.arr_schd_no())) {
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					r.pr_sts_typ(asR.pr_sts_typ());
				}
			}
		}

		/**
		 * 取引パタン別業務データ更新（その１）
		 */
		protected void doSub1() {
			MCList<ArrAct_DtlR>
				sub1_1L = MCList.create(ArrAct_DtlR.class), //　移動移送、移動移送返品、支給、支給返品
				sub1_2L = MCList.create(ArrAct_DtlR.class), // 仕入、経費購買
				sub1_3L = MCList.create(ArrAct_DtlR.class), // 売上返品、出荷返品
				sub1_4L = MCList.create(ArrAct_DtlR.class); // 入荷

			for(ArrAct_DtlR r : up1()) {
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					sub1_1L.add(r);
				}
				else if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
					sub1_2L.add(r);
				}
				else if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
					sub1_3L.add(r);
				}
				else if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
					if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
						|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
						sub1_4L.add(r);
					}
				}
			}
			doSub1_1(sub1_1L);
			doSub1_2(sub1_2L);
			doSub1_3(sub1_3L);
			doSub1_4(sub1_4L);
		}
		/** 移動移送、移動移送返品、支給、支給返品 */
		protected void doSub1_1(MCList<ArrAct_DtlR> list) {
			callProvActService(list);
			callArrSchdService(list);
			callShipService(list, false);
			callSloStsRegService(list, false);
		}
		/** 仕入、経費購買 */
		protected void doSub1_2(MCList<ArrAct_DtlR> list) {
			callProvActService(list);
			callInspSchdUpd01(list);
			callInspSchdUpd03(list);
			callArrSchdService(list);
			callAprvService(list);
			callSloStsRegService(list, true);
			callMrktJudgService(list);
			callSundryItmUpd01(list);
			callPurcSchdService(list);
		}
		/** 売上返品、出荷返品 */
		protected void doSub1_3(MCList<ArrAct_DtlR> list) {
			callArrSchdService(list);
			callShipService(list, true);
		}
		/** 入荷 */
		protected void doSub1_4(MCList<ArrAct_DtlR> list) {
			callProvActService(list);
			callInspSchdUpd01(list);
			callInspSchdUpd03(list);
			callSundryItmUpd01(list);
		}


		/**
		 * 取引パタン別業務データ更新（その２）
		 */
		protected void doSub2() {
			MCList<ArrAct_DtlR>
			sub2_1L = MCList.create(ArrAct_DtlR.class), //　仕入、経費購買
			sub2_2L = MCList.create(ArrAct_DtlR.class); // 売上返品（同時計上）、出荷返品

			for(ArrAct_DtlR r : up1()) {
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
					sub2_1L.add(r);
				}
				else if ((MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ()) && r.sync_flg())
						|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
					sub2_2L.add(r);
				}
			}
			doSub2_1(sub2_1L);
			doSub2_2(sub2_2L);
		}
		/** 仕入、経費購買 */
		protected void doSub2_1(MCList<ArrAct_DtlR> list) {
			MCList<ArrAct_DtlR> trgList = MCList.create(ArrAct_DtlR.class);
			for(ArrAct_DtlR r: list) {
				if((r.sync_flg() || r.temp_ap_flg())
						&& !MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
						&& !MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
					trgList.add(r);
				}
			}
			callPurcUpd02(trgList);
			callOutSrcActService(list);
			callRcptIvRegUpd02(list);
		}
		/** 売上返品（同時計上）、出荷返品 */
		protected void doSub2_2(MCList<ArrAct_DtlR> list) {
			callSlsRetService(list);
			callShipService(list, true);
		}


		/**
		 * 支給実績サービス呼び出し
		 */
		protected void callProvActService(MCList<ArrAct_DtlR> list) {
			MCList<ArrAct_DtlR>
				provL = MCList.create(ArrAct_DtlR.class);

			MCList<MST_PROV_ACT_R>
				orgProvL = getProvActL(list.subList(r -> !isNull(r.arr_act_no())));
			MCIndexKey idx = orgProvL.createIndex(MST_PROV_ACT_R.$prov_src_act_no);

			for (ArrAct_DtlR r : list) {
				MAM_LOC_R locR = getLocR(r.arr_loc_cd());

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_PROV_ACT_R provR = orgProvL.getFirst(idx, r.arr_act_no());
					if (!isNull(provR)) {
						provL.add(r);
					}
				}
				// 下記のいずれかに該当する場合に支給実績サービスを呼び出す
				// ・取引パタンが「支給」かつ使用基準以外かつ同一発注先以外
				// ・直送支給かつ未着管理
				// ・直送支給かつ通常管理かつ無償受給
				else if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					MST_SHIP_ACT_D_R shipActDR = getShipActDR3(asR.getString("dlv_slip_d_no"));
					MAM_LOC_R frLocR = getLocR(shipActDR.getString("ship_loc_cd"));

					if (!MAC_PROV_BASIS_TYP.isINPT(shipActDR.getString("prov_basis_typ"))
						&& !isSame(locR.sppl_cd(), frLocR.sppl_cd())) {
						provL.add(r);
					}
				}
				else if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
					if (!isNull(locR.sppl_cd())
						&& (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())
							 || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ()))) {
						provL.add(r);
					}
				}
			}
			if (provL.isEmpty())	return;

			callProvActUpd01(provL);
		}
		/**
		 * 支給実績サービス.登録
		 */
		protected void callProvActUpd01(MCList<ArrAct_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBEL_ProvActService.ProvAct_Upd01 o = MSBEL_ProvActService.crtProvAct_Upd01();
			setAll(o.up0(), l, createMap_ProvActUpd01_DtlR_ArrAct_DtlR());
			o.exec();

			// 支給実績NOを引き継ぐ
			copyByPegNo(up1(), new String[]{ArrAct_DtlR.$prov_act_no}, o.down0(), new String[]{ProvActUpd01_DtlR.$prov_act_no});
		}
		protected Map_ProvActUpd01_DtlR_ArrAct_DtlR<ProvActUpd01_DtlR,ArrAct_DtlR> createMap_ProvActUpd01_DtlR_ArrAct_DtlR() {
			return new Map_ProvActUpd01_DtlR_ArrAct_DtlR<ProvActUpd01_DtlR, ArrAct_DtlR>();
		}
		public class Map_ProvActUpd01_DtlR_ArrAct_DtlR<D extends ProvActUpd01_DtlR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvActUpd01_DtlR.$peg_no, ArrAct_DtlR.$peg_no);
				addColumnPathMap(ProvActUpd01_DtlR.$data_crud_typ, ArrAct_DtlR.$data_crud_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$prov_src_act_no, ArrAct_DtlR.$arr_act_no);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_cd, ArrAct_DtlR.$trd_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_ptn_typ, ArrAct_DtlR.$trd_ptn_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_cd, ArrAct_DtlR.$itm_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_cd, ArrAct_DtlR.$trd_unit_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_qty, ArrAct_DtlR.$trd_unit_qty);
				addColumnPathMap(ProvActUpd01_DtlR.$base_unit_cd, ArrAct_DtlR.$base_unit_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$base_unit_qty, ArrAct_DtlR.$base_unit_qty);
				addColumnPathMap(ProvActUpd01_DtlR.$ac_dt, ArrAct_DtlR.$ac_dt);
				addColumnPathMap(ProvActUpd01_DtlR.$can_ac_dt, ArrAct_DtlR.$can_ac_dt);
				addColumnPathMap(ProvActUpd01_DtlR.$loc_cd, ArrAct_DtlR.$arr_loc_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$str_ln_cd, ArrAct_DtlR.$str_ln_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_arrv_bp_cd, ArrAct_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$lot_no, ArrAct_DtlR.$lot_no);
				addColumnPathMap(ProvActUpd01_DtlR.$sublot_no, ArrAct_DtlR.$sublot_no);
				addColumnPathMap(ProvActUpd01_DtlR.$sno1, ArrAct_DtlR.$sno1);
				addColumnPathMap(ProvActUpd01_DtlR.$sno2, ArrAct_DtlR.$sno2);
				addColumnPathMap(ProvActUpd01_DtlR.$sno3, ArrAct_DtlR.$sno3);
				addColumnPathMap(ProvActUpd01_DtlR.$sno4, ArrAct_DtlR.$sno4);
				addColumnPathMap(ProvActUpd01_DtlR.$gd_cd, ArrAct_DtlR.$gd_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$quality_typ, ArrAct_DtlR.$quality_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_insp_typ, ArrAct_DtlR.$stk_insp_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_id_typ, ArrAct_DtlR.$stk_id_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_bp_cd, ArrAct_DtlR.$stk_bp_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_d_rmrks, ArrAct_DtlR.$trd_d_rmrks);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				dest.prov_schd_no(asR.getString("prov_schd_no"));
				dest.prov_src_schd_no1(null);
				dest.prov_src_schd_no2(src.arr_schd_no());
				if (!MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
					// 支給実績から設定
					MST_ARR_ACT_R aaR = getArrActR(src.arr_act_no());
					dest.prov_act_no(aaR.getString("prov_act_no"));
				}

				MAM_LOC_R locR = getLocR(src.arr_loc_cd());
				dest.wg_cd(locR.wg_cd());
				dest.prsppl_cd(locR.sppl_cd());

				if (MAC_TRD_PTN_TYP.isPURC(src.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(src.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isARR(src.trd_ptn_typ())) {
					if (MSC_ARR_PTN_TYP.isN_YET_ARR(src.arr_ptn_typ())) {
						dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.NON_ARR_DDLV.value());
					}
					else {
						dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.NCV_RCV_DDLV.value());
					}
					dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.DDLV.value());
					dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());
					if(isNull(dest.prov_schd_no())) {
						dest.trd_cd(null);
					}
					dest.accpt_dt(src.arr_tm());
				}
				else {
					dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.SHIP.value());
					dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.SHIP.value());
					dest.xfr_rsn_cd(src.rsn_cd());

					MAM_BP_R bpR = getBpR(dest.prsppl_cd());
					if (MAC_PROV_RCV_TYP.isNOT_ARR(bpR.prov_rcv_typ())) {

						// 着荷不要の場合、(出荷予定NO)は設定できない
						dest.prov_src_schd_no1(null);
						dest.prov_src_schd_no2(null);

						// 支給予定を参照できないので、納品伝票の値を使用する
						dest.accpt_dt(nvl(asR.getDate("ship_tm"), src.arr_tm()));
						dest.prov_typ(asR.getString("prov_typ"));
						dest.prov_basis_typ(asR.getString("prov_basis_typ"));
						dest.trd_cur_cd(asR.getString("trd_cur_cd"));
						if (asR.getBoolean("xrate_inpt_flg")) {
							dest.xrate(asR.getNumber("xrate"));
						}
						if (asR.getBoolean("ptax_xrate_inpt_flg")) {
							dest.ptax_xrate(asR.getNumber("ptax_xrate"));
						}
						if (asR.getBoolean("tax_fix_flg")) {
							dest.tax_cd(asR.getString("tax_cd"));
						}
						dest.trd_cur_upri(asR.getNumber("trd_cur_upri"));
						dest.wtax_rate(asR.getNumber("wtax_rate"));
					}
					else {
						dest.accpt_dt(src.arr_tm());
					}
				}
				if (!isNull(dest.accpt_dt())) {
					dest.accpt_dt(dest.accpt_dt().trunc(MCDateFieldType.DAY));
				}
			}
		}


		/**
		 * 市場出荷判定情報サービス呼び出し
		 */
		protected void callMrktJudgService(MCList<ArrAct_DtlR> list) {
			MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR r : list) {
				MAM_LOC_R locR = getLocR(r.arr_loc_cd());
				if(MAC_LOC_MNG_TYP.isSLS(locR.loc_mng_typ())) {
					// 仕入直送は対象としない
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					if (!asR.getBoolean("purc_ddlv_flg")) {
						l.add(r);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					// 販売場所→生産場所へ変更された場合は削除する
					locR = getLocR(r.getString(ORG_ARR_LOC_CD));
					if(MAC_LOC_MNG_TYP.isSLS(locR.loc_mng_typ())) {
						ArrAct_DtlR delR = r.clone();
						delR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						l.add(delR);
					}
				}
			}
			callMrktJudgUpd01(l);
		}
		/**
		 * 市場出荷判定情報サービス.市場出荷判定作成
		 */
		protected void callMrktJudgUpd01(MCList<ArrAct_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBFL_MrktJudgService.MrktJudg_Upd01 o = MSBFL_MrktJudgService.crtMrktJudg_Upd01();
			setAll(o.up0(), l, createMap_MrktJudg_Chk01_RsltR_ArrAct_DtlR());
			o.exec();
		}
		protected Map_MrktJudg_Chk01_RsltR_ArrAct_DtlR<MrktJudg_Chk01_RsltR,ArrAct_DtlR> createMap_MrktJudg_Chk01_RsltR_ArrAct_DtlR() {
			return new Map_MrktJudg_Chk01_RsltR_ArrAct_DtlR<MrktJudg_Chk01_RsltR, ArrAct_DtlR>();
		}
		public class Map_MrktJudg_Chk01_RsltR_ArrAct_DtlR<D extends MrktJudg_Chk01_RsltR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MrktJudg_Chk01_RsltR.$peg_no, ArrAct_DtlR.$peg_no);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$loc_cd, ArrAct_DtlR.$arr_loc_cd);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$sppl_cd, ArrAct_DtlR.$sppl_cd);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$maker_cd, ArrAct_DtlR.$maker_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.mrkt_judg_src_typ(MSC_MRKT_JUDG_SRC_TYP.SLS_LOC_ARR.value());
				dest.upd_dt(src.arr_tm().trunc(MCDateFieldType.DAY));

				if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.mrkt_judg_src_no_del(src.arr_act_no());
				}
				else {
					dest.mrkt_judg_src_no(src.arr_act_no());
					dest.itm_cd(src.itm_cd());
					dest.itm_sub1(src.itm_sub1());
					dest.itm_sub2(src.itm_sub2());
					dest.itm_sub3(src.itm_sub3());
					dest.lot_no(src.lot_no());
					dest.sublot_no(src.sublot_no());
					dest.base_unit_cd(src.base_unit_cd());
					dest.base_unit_qty(src.base_unit_qty());
					if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
						dest.mrkt_judg_src_no_del(src.arr_act_no());
					}
				}
			}
		}


		/**
		 * 出荷予定・出荷実績サービス呼び出し
		 */
		protected void callShipService(MCList<ArrAct_DtlR> list, boolean isShip) {
			MCList<ArrAct_DtlR>
				l1 = MCList.create(ArrAct_DtlR.class),
				l2 = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR r : list) {
				MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());

				if (isShip) {
					if (!isNull(aaR.getString("ret_dlv_slip_d_no"))) {
						l1.add(r);
						l2.add(r);
					}
				}
				else {
					if (!isNull(aaR.getString("dlv_slip_d_no"))) {
						l1.add(r);
						MST_SHIP_ACT_D_R shipActDR = getShipActDR3(aaR.getString("dlv_slip_d_no"));
						if (shipActDR != null && !isNull(shipActDR.getString("xfr_schd_no"))) {
							l2.add(r);
						}
					}
				}
			}
			callShipActUpd02(l1);
			callShipSchdUpd05(l2);
		}
		/**
		 * 出荷実績サービス.更新（出荷返品・入荷）
		 */
		protected void callShipActUpd02(MCList<ArrAct_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBEL_ShipActService.ShipAct_Upd02 o = MSBEL_ShipActService.crtShipAct_Upd02();
			MCList<ShipAct_DtlR> lst = MCList.create(ShipAct_DtlR.class);
			setAll(lst, l, createMap_ShipAct_DtlR_ArrAct_DtlR());
			o.up0().setAll(lst.groupBy(
				ShipAct_DtlR.$dlv_slip_d_no, ShipAct_DtlR.$ship_ret_flg));
			o.exec();
		}
		protected Map_ShipAct_DtlR_ArrAct_DtlR<ShipAct_DtlR,ArrAct_DtlR> createMap_ShipAct_DtlR_ArrAct_DtlR() {
			return new Map_ShipAct_DtlR_ArrAct_DtlR<ShipAct_DtlR, ArrAct_DtlR>();
		}
		public class Map_ShipAct_DtlR_ArrAct_DtlR<D extends ShipAct_DtlR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());

				if (MAC_TRD_PTN_TYP.isSHIP_RTN(src.trd_ptn_typ())) {
					dest.dlv_slip_d_no(asR.getString("ret_dlv_slip_d_no"));
					dest.ship_ret_flg(true);
				}
				else {
					dest.dlv_slip_d_no(asR.getString("dlv_slip_d_no"));
					dest.ship_ret_flg(false);
				}
			}
		}
		/**
		 * 出荷予定サービス.更新（売上・出荷返品・入荷）
		 */
		protected void callShipSchdUpd05(MCList<ArrAct_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBEL_ShipSchdService.ShipSchd_Upd05 o = MSBEL_ShipSchdService.crtShipSchd_Upd05();
			MCList<ShipSchd_Upd05_DtlR> lst = MCList.create(ShipSchd_Upd05_DtlR.class);
			setAll(lst, l, createMap_ShipSchd_Upd05_DtlR_ArrAct_DtlR());
			o.up0().setAll(lst.groupBy(
				ShipSchd_Upd05_DtlR.$dlv_slip_d_no, ShipSchd_Upd05_DtlR.$ship_ret_flg));
			o.exec();
		}
		protected Map_ShipSchd_Upd05_DtlR_ArrAct_DtlR<ShipSchd_Upd05_DtlR,ArrAct_DtlR> createMap_ShipSchd_Upd05_DtlR_ArrAct_DtlR() {
			return new Map_ShipSchd_Upd05_DtlR_ArrAct_DtlR<ShipSchd_Upd05_DtlR, ArrAct_DtlR>();
		}
		public class Map_ShipSchd_Upd05_DtlR_ArrAct_DtlR<D extends ShipSchd_Upd05_DtlR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());

				if (MAC_TRD_PTN_TYP.isSHIP_RTN(src.trd_ptn_typ())) {
					dest.dlv_slip_d_no(asR.getString("ret_dlv_slip_d_no"));
					dest.ship_ret_flg(true);
				}
				else {
					dest.dlv_slip_d_no(asR.getString("dlv_slip_d_no"));
					dest.ship_ret_flg(false);
				}
			}
		}


		/**
		 * 受注状況更新サービス呼び出し
		 */
		protected void callSloStsRegService(MCList<ArrAct_DtlR> list, boolean purcFlg) {
			MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR r : list) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				if (purcFlg) {
					if (!isNull(asR.getString("slo_d_no")) && !asR.getBooleanNE("rqst_can_flg")) {
						if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							ArrAct_DtlR rr = r.clone();
							rr.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							l.add(rr);
						}
						l.add(r);
					}
				}
				else {
					if (!isNull(asR.getString("dlv_slip_d_no"))) {
						MST_SHIP_ACT_D_R shipActDR = getShipActDR3(asR.getString("dlv_slip_d_no"));
						if (shipActDR != null
							&& MSC_XFR_SRC_TYP.isWG_RQST(shipActDR.getString("xfr_src_typ"))
							&& !isNull(shipActDR.getString("slo_d_no"))
							&& !shipActDR.getBoolean("rqst_can_flg")) {
							if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
								ArrAct_DtlR rr = r.clone();
								rr.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								l.add(rr);
							}
							l.add(r);
						}
					}
				}
			}
			callSloStsIns01(l);
		}
		/**
		 * 受注状況更新サービス.更新
		 */
		protected void callSloStsIns01(MCList<ArrAct_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBBL_SloStsRegService.SloSts_Ins01 o = MSBBL_SloStsRegService.crtSloSts_Ins01();
			setAll(o.up0(), l, createMap_SloSts_DtlR_ArrAct_DtlR());
			o.exec();
		}
		protected Map_SloSts_DtlR_ArrAct_DtlR<SloSts_DtlR,ArrAct_DtlR> createMap_SloSts_DtlR_ArrAct_DtlR() {
			return new Map_SloSts_DtlR_ArrAct_DtlR<SloSts_DtlR, ArrAct_DtlR>();
		}

		public class Map_SloSts_DtlR_ArrAct_DtlR<D extends SloSts_DtlR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloSts_DtlR.$unit_cd, ArrAct_DtlR.$trd_unit_cd);
				addColumnPathMap(SloSts_DtlR.$qty, ArrAct_DtlR.$trd_unit_qty);
				addColumnPathMap(SloSts_DtlR.$loc_cd, ArrAct_DtlR.$arr_loc_cd);
				addColumnPathMap(SloSts_DtlR.$ac_dt, ArrAct_DtlR.$ac_dt);
				addColumnPathMap(SloSts_DtlR.$biz_tm, ArrAct_DtlR.$arr_tm);
				addColumnPathMap(SloSts_DtlR.$arr_act_no, ArrAct_DtlR.$arr_act_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());

				dest.slo_sts_typ(MSC_SLO_STS_TYP.ARR.value());
				
				if(MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.ac_dt(src.can_ac_dt());
					dest.qty(src.getNumber(ORG_TRD_UNIT_QTY).negate());
				}
				
				if(MAC_TRD_PTN_TYP.isPURC(src.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(src.trd_ptn_typ())) {
					MST_PO_D_R poDR = getPoDR(asR.getString("po_d_no"));
					if (poDR != null) {
						dest.slo_d_no(poDR.slo_d_no());
						dest.po_no(poDR.po_no());
						dest.po_d_no(asR.getString("po_d_no"));
					}
				}
				else if (MAC_TRD_PTN_TYP.isXFR(src.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					MST_SHIP_ACT_D_R shipActDR = getShipActDR3(asR.getString("dlv_slip_d_no"));
					if (shipActDR != null) {
						dest.slo_d_no(shipActDR.getString("slo_d_no"));
						dest.wg_rqst_no(shipActDR.getString("wg_rqst_no"));
					}
					// Ｉ／Ｖ単位出荷
					if (asR.getBoolean("iv_ship_flg")) {
						dest.iv_no(src.iv_no());
						dest.iv_d_no(asR.getString("iv_d_no"));
					}
					// その他
					else {
						dest.dlv_slip_no(shipActDR.getString("dlv_slip_no"));
						dest.dlv_slip_d_no(shipActDR.dlv_slip_d_no());
					}
				}
			}
		}
		
		/**
		 * 外注製造実績登録サービス呼び出し
		 * 外注製造実績作成ＦＬＧ＝オンのとき実行
		 */
		protected void callOutSrcActService(MCList<ArrAct_DtlR> list) {
			if(!up0().outsrc_act_flg()) {
				return;
			}
			MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR r : list) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				if (asR.outsrc_flg()
					&& (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()))) {
					l.add(r);
				}
			}
			callOutSrcActUpd01(l);
		}
		/**
		 * 外注製造実績登録サービス.更新
		 */
		protected void callOutSrcActUpd01(MCList<ArrAct_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBCL_OutSrcActService.OutSrcAct_Upd01 o = MSBCL_OutSrcActService.crtOutSrcAct_Upd01();
			setAll(o.up0(), l, createMap_OutSrcAct_Upd01_ActDR_ArrAct_DtlR());
			o.exec();
		}
		protected Map_OutSrcAct_Upd01_ActDR_ArrAct_DtlR<OutSrcAct_Upd01_ActDR,ArrAct_DtlR> createMap_OutSrcAct_Upd01_ActDR_ArrAct_DtlR() {
			return new Map_OutSrcAct_Upd01_ActDR_ArrAct_DtlR<OutSrcAct_Upd01_ActDR, ArrAct_DtlR>();
		}
		public class Map_OutSrcAct_Upd01_ActDR_ArrAct_DtlR<D extends OutSrcAct_Upd01_ActDR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OutSrcAct_Upd01_ActDR.$data_crud_typ, ArrAct_DtlR.$data_crud_typ);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MST_ARR_ACT_R aaR = getArrActR(src.arr_act_no());
				dest.mfg_inst_no(aaR.getString("mfg_inst_no"));
				if (MSC_ARR_PTN_TYP.isN_YET_ARR(src.arr_ptn_typ())) {
					// 「未着管理」の場合
					dest.arr_act_no(null);
					dest.purc_act_io_no(aaR.getString("purc_act_io_no"));
				}
				else {
					// 「未着管理」以外(「通常管理」、「未設定」)の場合
					dest.arr_act_no(src.arr_act_no());
					dest.purc_act_io_no(null);
				}

				if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.can_ac_dt(src.can_ac_dt());
				}
			}
		}
		
		/**
		 * 検査予定サービス.検査関連データ登録
		 */
		protected void callInspSchdUpd01(MCList<ArrAct_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBFL_InspSchdService.InspSchd_Upd01 o = MSBFL_InspSchdService.crtInspSchd_Upd01();
			setAll(o.up0(), l, createMap_InspSchd_Upd01_CndR_ArrAct_DtlR());
			o.exec();
		}
		protected Map_InspSchd_Upd01_CndR_ArrAct_DtlR<InspSchd_Upd01_CndR,ArrAct_DtlR> createMap_InspSchd_Upd01_CndR_ArrAct_DtlR() {
			return new Map_InspSchd_Upd01_CndR_ArrAct_DtlR<InspSchd_Upd01_CndR, ArrAct_DtlR>();
		}
		public class Map_InspSchd_Upd01_CndR_ArrAct_DtlR<D extends InspSchd_Upd01_CndR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Upd01_CndR.$data_crud_typ, ArrAct_DtlR.$data_crud_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no3, ArrAct_DtlR.$arr_schd_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no4, ArrAct_DtlR.$arr_act_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_cd, ArrAct_DtlR.$itm_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
				addColumnPathMap(InspSchd_Upd01_CndR.$loc_cd, ArrAct_DtlR.$arr_loc_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$str_ln_cd, ArrAct_DtlR.$str_ln_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$quality_typ, ArrAct_DtlR.$quality_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$stk_insp_typ, ArrAct_DtlR.$stk_insp_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$stk_arrv_bp_cd, ArrAct_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$stk_id_typ, ArrAct_DtlR.$stk_id_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$bp_cd, ArrAct_DtlR.$stk_bp_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$gd_cd, ArrAct_DtlR.$gd_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$lot_no, ArrAct_DtlR.$lot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$sublot_no, ArrAct_DtlR.$sublot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno1, ArrAct_DtlR.$sno1);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno1_mng_typ, ArrAct_DtlR.$sno1_mng_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno2, ArrAct_DtlR.$sno2);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno2_mng_typ, ArrAct_DtlR.$sno2_mng_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno3, ArrAct_DtlR.$sno3);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno3_mng_typ, ArrAct_DtlR.$sno3_mng_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno4, ArrAct_DtlR.$sno4);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno4_mng_typ, ArrAct_DtlR.$sno4_mng_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$sppl_cd, ArrAct_DtlR.$sppl_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$maker_cd, ArrAct_DtlR.$maker_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$bp_lot_no, ArrAct_DtlR.$bp_lot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$gr_tm, ArrAct_DtlR.$arr_tm);
				addColumnPathMap(InspSchd_Upd01_CndR.$ac_dt, ArrAct_DtlR.$ac_dt);
				addColumnPathMap(InspSchd_Upd01_CndR.$base_unit_qty, ArrAct_DtlR.$base_unit_qty);
				addColumnPathMap(InspSchd_Upd01_CndR.$base_unit_cd, ArrAct_DtlR.$base_unit_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$ver_no, ArrAct_DtlR.$ver_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$insp_cnt_rmrks, ArrAct_DtlR.$insp_cnt_rmrks);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				MST_ARR_ACT_R aaR = getArrActR(src.arr_act_no());
				
				dest.act_flg(true);
				dest.src_no1(aaR.getString("po_d_no"));
				dest.insp_typ(MSC_INSP_TYP.ACCPT.value());

				if(MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.src_no3(aaR.arr_schd_no());
					dest.itm_cd(aaR.itm_cd());
					dest.itm_sub1(aaR.itm_sub1());
					dest.itm_sub2(aaR.itm_sub2());
					dest.itm_sub3(aaR.itm_sub3());
					dest.lot_no(aaR.lot_no());
					dest.sublot_no(aaR.sublot_no());
					dest.sno1(aaR.sno1());
					dest.sno2(aaR.sno2());
					dest.sno3(aaR.sno3());
					dest.sno4(aaR.sno4());
				}
				else {
					MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(src.itm_cd(),src.itm_sub1(),src.itm_sub2(),src.itm_sub3(),src.trd_unit_cd());
					if (itmUnitR.pack_flg()) {
						dest.pack_unit_qty(src.trd_unit_qty());
						dest.pack_unit_cd(src.trd_unit_cd());
					}
					else {
						dest.pack_unit_qty(src.base_unit_qty());
						dest.pack_unit_cd(src.base_unit_cd());
					}
					dest.mfg_loc_cd(MAC_STR.NULL_VAL.value());
					
					// 資産区分
					if (!MSC_STK_ID_TYP.isCOSTK(src.stk_id_typ())) {
						dest.asst_typ(MAC_ASST_TYP.OTH.value());
					}
					else {
						MAM_LOC_R locR = getLocR(src.arr_loc_cd());
						if (MAC_LOC_MNG_TYP.isSLS(locR.loc_mng_typ())) {
							dest.asst_typ(MAC_ASST_TYP.CO_SLS.value());
						}
						else if (MAC_LOC_MNG_TYP.isPRD(locR.loc_mng_typ())) {
							dest.asst_typ(MAC_ASST_TYP.CO_PROD.value());
						}
					}
					
					// 納品先ＣＤ
					MST_PO_D_R podR = getPoDR(dest.src_no1());
					if (!isNull(podR)) {
						dest.dlv_cd(podR.dlv_cd());
					}
				}
				dest.not_stk_flg(MAC_STK_MNG_TYP.isNOT_MNG(src.stk_mng_typ()));
			}
		}
		/**
		 * 検査予定サービス.検査省略処理
		 */
		protected void callInspSchdUpd03(MCList<ArrAct_DtlR> list) {
			MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR r : list) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					l.add(r);
				}
			}
			if (l.isEmpty()) return ;
			MSBFL_InspSchdService.InspSchd_Upd03 o = MSBFL_InspSchdService.crtInspSchd_Upd03();
			setAll(o.up0(), l, createMap_InspSchd_Upd03_CndR_ArrAct_DtlR());
			o.exec();
		}
		protected Map_InspSchd_Upd03_CndR_ArrAct_DtlR<InspSchd_Upd03_CndR,ArrAct_DtlR> createMap_InspSchd_Upd03_CndR_ArrAct_DtlR() {
			return new Map_InspSchd_Upd03_CndR_ArrAct_DtlR<InspSchd_Upd03_CndR, ArrAct_DtlR>();
		}

		public class Map_InspSchd_Upd03_CndR_ArrAct_DtlR<D extends InspSchd_Upd03_CndR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Upd03_CndR.$src_no4, ArrAct_DtlR.$arr_act_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
			}
		}


		/**
		 * 承認提供サービス呼び出し
		 */
		protected void callAprvService(MCList<ArrAct_DtlR> list) {
			MCList<ArrAct_DtlR>
				upd02L = MCList.create(ArrAct_DtlR.class),
				upd03L = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR r : list) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				if (asR.getBoolean("aprv_flg") && up0().purc_act_flg()) {
					if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						upd02L.add(r);
					}
					else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						if (!isAprvNextOpr(asR.getString("po_no"), null)) {
							upd03L.add(r);
						}
					}
				}
			}
			callAprvUpd02(upd02L);
			callAprvUpd03(upd03L);
		}
		/**
		 * 承認提供サービス.次処理済更新
		 * @param list
		 */
		protected void callAprvUpd02(MCList<ArrAct_DtlR> l) {
			if (l.isEmpty()) return ;
			MBBAL_AprvService.Aprv_Upd02 o = MBBAL_AprvService.crtAprv_Upd02();
			setAll(o.up0(), l, createMap_Aprv_Upd02_Rslt1R_ArrAct_DtlR());
			o.exec();
		}
		/**
		 * 承認提供サービス.次処理済解除
		 * @param list
		 */
		protected void callAprvUpd03(MCList<ArrAct_DtlR> l) {
			if (l.isEmpty()) return ;
			MBBAL_AprvService.Aprv_Upd03 o = MBBAL_AprvService.crtAprv_Upd03();
			setAll(o.up0(), l, createMap_Aprv_Upd02_Rslt1R_ArrAct_DtlR());
			o.exec();
		}
		protected Map_Aprv_Upd02_Rslt1R_ArrAct_DtlR<Aprv_Chk02_Rslt1R,ArrAct_DtlR> createMap_Aprv_Upd02_Rslt1R_ArrAct_DtlR() {
			return new Map_Aprv_Upd02_Rslt1R_ArrAct_DtlR<Aprv_Chk02_Rslt1R, ArrAct_DtlR>();
		}
		public class Map_Aprv_Upd02_Rslt1R_ArrAct_DtlR<D extends Aprv_Chk02_Rslt1R, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.aprv_no(getArrSchdR(src.arr_schd_no()).getString("aprv_no"));
			}
		}


		/**
		 * ロット情報サービス呼び出し
		 */
		protected void callLotService() {
			MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR r : up1()) {
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
					l.add(r);
				}
				else if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
					if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
						|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
						l.add(r);
					}
				}
			}
			callLotUpd08(l);
		}
		/**
		 * ロット情報サービス.ロット更新（出来高・入荷）
		 */
		protected void callLotUpd08(MCList<ArrAct_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBFL_LotService.Lot_Upd08 o = MSBFL_LotService.crtLot_Upd08();
			setAll(o.up0(), l, createMap_Lot_Upd08_CndR_ArrAct_DtlR());
			o.exec();
		}
		protected Map_Lot_Upd08_CndR_ArrAct_DtlR<Lot_Upd08_CndR,ArrAct_DtlR> createMap_Lot_Upd08_CndR_ArrAct_DtlR() {
			return new Map_Lot_Upd08_CndR_ArrAct_DtlR<Lot_Upd08_CndR, ArrAct_DtlR>();
		}
		public class Map_Lot_Upd08_CndR_ArrAct_DtlR<D extends Lot_Upd08_CndR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd08_CndR.$data_crud_typ, ArrAct_DtlR.$data_crud_typ);
				addColumnPathMap(Lot_Upd08_CndR.$itm_cd, ArrAct_DtlR.$itm_cd);
				addColumnPathMap(Lot_Upd08_CndR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
				addColumnPathMap(Lot_Upd08_CndR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
				addColumnPathMap(Lot_Upd08_CndR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
				addColumnPathMap(Lot_Upd08_CndR.$lot_no, ArrAct_DtlR.$lot_no);
				addColumnPathMap(Lot_Upd08_CndR.$sublot_no, ArrAct_DtlR.$sublot_no);
				addColumnPathMap(Lot_Upd08_CndR.$ver_no, ArrAct_DtlR.$ver_no);
				addColumnPathMap(Lot_Upd08_CndR.$bp_lot_no, ArrAct_DtlR.$bp_lot_no);
				addColumnPathMap(Lot_Upd08_CndR.$sppl_cd, ArrAct_DtlR.$sppl_cd);
				addColumnPathMap(Lot_Upd08_CndR.$maker_cd, ArrAct_DtlR.$maker_cd);
				addColumnPathMap(Lot_Upd08_CndR.$loc_cd, ArrAct_DtlR.$arr_loc_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				MST_ARR_ACT_R aaR = getArrActR(src.arr_act_no());
				dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				dest.src_no1(aaR.getString("po_d_no"));
				dest.src_no3(aaR.arr_schd_no());
				dest.src_no4(aaR.arr_act_no());
				
				if(MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.itm_cd(aaR.itm_cd());
					dest.itm_sub1(aaR.itm_sub1());
					dest.itm_sub2(aaR.itm_sub2());
					dest.itm_sub3(aaR.itm_sub3());
					dest.lot_no(aaR.lot_no());
					dest.sublot_no(aaR.sublot_no());
					dest.loc_cd(aaR.arr_loc_cd());
				}
				else {
					MAM_LOC_R locR = getLocR(src.arr_loc_cd());
					dest.base_dt(src.arr_tm().trunc(MCDateFieldType.DAY));
					dest.site_cd(locR.site_cd());
				}
			}
		}


		/**
		 * 売上返品サービス呼び出し
		 */
		protected void callSlsRetService(MCList<ArrAct_DtlR> list) {
			callSlsRetUpd02(list);
		}
		/**
		 * 売上返品サービス.売上返品登録
		 */
		protected void callSlsRetUpd02(MCList<ArrAct_DtlR> l) {
			if (l.isEmpty() || !up0().sls_act_flg()) return ;
			MSBBL_SlsRetService.SlsRet_Upd02 o = MSBBL_SlsRetService.crtSlsRet_Upd02();
			setAll(o.up0(), l, createMap_SlsRet_Upd02_CndR_ArrAct_DtlR());
			o.exec();
		}
		protected Map_SlsRet_Upd02_CndR_ArrAct_DtlR<SlsRet_Upd02_CndR,ArrAct_DtlR> createMap_SlsRet_Upd02_CndR_ArrAct_DtlR() {
			return new Map_SlsRet_Upd02_CndR_ArrAct_DtlR<SlsRet_Upd02_CndR, ArrAct_DtlR>();
		}
		public class Map_SlsRet_Upd02_CndR_ArrAct_DtlR<D extends SlsRet_Upd02_CndR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsRet_Upd02_CndR.$data_crud_typ, ArrAct_DtlR.$data_crud_typ);
				addColumnPathMap(SlsRet_Upd02_CndR.$can_ac_dt, ArrAct_DtlR.$can_ac_dt);
				addColumnPathMap(SlsRet_Upd02_CndR.$arr_act_no, ArrAct_DtlR.$arr_act_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
					dest.can_ac_dt(null);
				}
			}
		}

		/**
		 * 諸口品登録.登録サービス呼び出し
		 */
		protected void callSundryItmUpd01(MCList<ArrAct_DtlR> list) {
			//計画外入荷、かつ諸口品の場合のみ実行
			MCList<ArrAct_DtlR> l = list.subList(
				r -> isNull(r.arr_schd_no()) && r.sundry_itm_flg());
			if (l.isEmpty()) return ;

			MABCL_SundryItmRegService.SundryItm_Upd01 o = MABCL_SundryItmRegService.crtSundryItm_Upd01();
			setAll(o.up0(), l, createMap_SundryItm_Upd01_DtlR_ArrAct_DtlR());
			o.exec();
		}
		protected Map_SundryItm_Upd01_DtlR_ArrAct_DtlR<SundryItm_Upd01_DtlR,ArrAct_DtlR> createMap_SundryItm_Upd01_DtlR_ArrAct_DtlR() {
			return new Map_SundryItm_Upd01_DtlR_ArrAct_DtlR<SundryItm_Upd01_DtlR, ArrAct_DtlR>();
		}
		public class Map_SundryItm_Upd01_DtlR_ArrAct_DtlR<D extends SundryItm_Upd01_DtlR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SundryItm_Upd01_DtlR.$itm_cd, ArrAct_DtlR.$itm_cd);
				addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
				addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
				addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
				addColumnPathMap(SundryItm_Upd01_DtlR.$sno1, ArrAct_DtlR.$sno1);
				addColumnPathMap(SundryItm_Upd01_DtlR.$sno2, ArrAct_DtlR.$sno2);
				addColumnPathMap(SundryItm_Upd01_DtlR.$sno3, ArrAct_DtlR.$sno3);
				addColumnPathMap(SundryItm_Upd01_DtlR.$sno4, ArrAct_DtlR.$sno4);
				addColumnPathMap(SundryItm_Upd01_DtlR.$itm_nm, ArrAct_DtlR.$itm_nm);
			}
		}
		
		protected void callPurcSchdService(MCList<ArrAct_DtlR> list) {
			// 入荷によって仕入予定が完了から未完了になる場合があるので仕入予定サービスを呼ぶ
			MCList<ArrAct_DtlR> tgtList = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR r : list) {
				if (isPurcEntryTgt(r)) {
					tgtList.add(r);
				}
			}
			if (tgtList.isEmpty()) return ;
			
			MCList<PurcSchd_DtlR> schdSvParmList = MCList.create(PurcSchd_DtlR.class);
			for (ArrAct_DtlR tgtR : tgtList) {
				PurcSchd_DtlR dtlR = PurcSchd_DtlR.create();
				dtlR.peg_no(tgtR.peg_no());
				dtlR.arr_schd_no(tgtR.arr_schd_no());
				dtlR.abort_flg(tgtR.abort_flg());
				schdSvParmList.add(dtlR);
			}
			MSBDL_PurcSchdRegService.PurcSchd_Upd02 ope = MSBDL_PurcSchdRegService.crtPurcSchd_Upd02();
			ope.up0().addAll(schdSvParmList);
			ope.exec();
		}
		
		/**
		 * 仕入実績登録サービス呼び出し
		 */
		protected void callPurcActRegService() {
			MCList<ArrAct_DtlR> upList = MCList.create(ArrAct_DtlR.class);
			for(ArrAct_DtlR up1 : up1()){
				if (MAC_TRD_PTN_TYP.isPURC(up1.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(up1.trd_ptn_typ())) {
					// 未着管理、かつ打切または打切解除の場合、仕入実績サービスを呼び出す。
					MST_ARR_SCHD_R asR = getArrSchdR(up1.arr_schd_no());
					if(MSC_ARR_PTN_TYP.isN_YET_ARR(up1.arr_ptn_typ()) && (up1.abort_flg() || (asR.abort_flg() && !up1.abort_flg()))){
						upList.add(up1);
					}
				}
			}
			callPurcUpd02(upList);
		}
		/**
		 * 仕入実績登録サービス.仕入実績更新（キャッシュ使用）
		 */
		protected void callPurcUpd02(MCList<ArrAct_DtlR> upList) {
			if(isNull(upList) || upList.isEmpty() || !up0().purc_act_flg()) return;
			
			MSBDL_PurcActRegService.Purc_Upd02 o = crtPurcUpd02(upList);
			o.exec();
		}
		
		protected MSBDL_PurcActRegService.Purc_Upd02 crtPurcUpd02(MCList<ArrAct_DtlR> upList){
			MSBDL_PurcActRegService.Purc_Upd02 o = MSBDL_PurcActRegService.crtPurc_Upd02();
			o.up0().arr_flg(true);
			o.up0().amt_calc_flg(true);

			for(ArrAct_DtlR r : upList){
				// up1
				Purc_Ins01_DtlR up1 = o.up2().createRow();
				up1.peg_no(r.peg_no());
				o.up2().add(up1);
				// up2
				Purc_Ins01_IoR up2 = o.up3().createRow();
				up2.peg_no(r.peg_no());
				up2.arr_act_no(r.arr_act_no());
				o.up3().add(up2);
			}
			return o;
		}

		/**
		 * 入荷実績登録
		 */
		protected void updArrAct() {
			MCList<MST_ARR_ACT_R>
					insL = MCList.create(MST_ARR_ACT_R.class),
					updL = MCList.create(MST_ARR_ACT_R.class),
					delL = MCList.create(MST_ARR_ACT_R.class);

			MCList<ArrAct_DtlR> setNumL = MCList.create(ArrAct_DtlR.class);
			
			// Chk01で発番・キャッシュしたロットＮＯ取得
			MCList<ArrAct_DtlR> lotL = getLotCache();
			MCIndexKey lotKey = lotL.createIndex(ArrAct_DtlR.$peg_no);
			MCList<ArrAct_DtlR> sublotL = getSublotCache();
			MCIndexKey sublotKey = sublotL.createIndex(ArrAct_DtlR.$peg_no);

			for(ArrAct_DtlR r : up1()) {
				// 新規
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.arr_act());

					// 発番準備
					setNumL.add(r);
					r.arr_act_rev(1);
				}
				// 更新
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r.arr_act());

					MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
					r.arr_act_rev(aaR.arr_act_rev().add(1));
				}
				// 削除
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.arr_act().can_flg(true);
					delL.add(r.arr_act());
					continue;
				}
				MAM_LOC_R locR = getLocR(r.arr_loc_cd());
				if (isNull(r.lg_grp_cd())) {
					r.lg_grp_cd(locR.lg_grp_cd());
				}
				if (isNull(r.wg_cd())) {
					r.wg_cd(locR.wg_cd());
				}

				if (!r.sundry_itm_flg()
					|| MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					r.itm_nm(null);
					r.rcpt_iv_itm_nm(null);
				}
				MAM_BP_R bpR = getBpR(r.sppl_cd());
				if (!bpR.sppl_iv_flg()) {
					r.rcpt_iv_itm_nm(null);
				}

				MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
				if (itmUnitR.pack_flg()) {
					r.arr_act().pack_unit_qty(r.trd_unit_qty());
					r.arr_act().pack_unit_cd(r.trd_unit_cd());
				}
				else {
					r.arr_act().pack_unit_qty(r.base_unit_qty());
					r.arr_act().pack_unit_cd(r.base_unit_cd());
				}
				r.arr_act().can_flg(false);

				// Chk01で発番したロットＮＯ・サブロットＮＯの設定
				ArrAct_DtlR lotR = lotL.getFirst(lotKey, r.peg_no());
				if (!isNull(lotR)) {
					r.lot_no(lotR.lot_no());
				}
				ArrAct_DtlR sublotR = sublotL.getFirst(sublotKey, r.peg_no());
				if (!isNull(sublotR)) {
					r.sublot_no(sublotR.sublot_no());
				}
				
				if (isNull(r.sno1())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.sno2())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.sno3())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.sno4())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.lot_no())) {
					r.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.sublot_no())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.stk_arrv_bp_cd())) {
					r.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.stk_bp_cd())) {
					r.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.maker_cd())) {
					r.maker_cd(MAC_STR.NULL_VAL.value());
				}
			}
			
			// 金額計算
			setAmtForYet(up1());
			
			// 入荷実績ＮＯ発番
			MCList<ElmArgsR> elmArgsL = doSetNum(setNumL, MAC_NUM_BIZ_TYP.ARRACT);
			for (int i = 0; i < elmArgsL.size(); i++) {
				ArrAct_DtlR r = setNumL.get(i);
				r.arr_act_no(elmArgsL.get(i).new_no());
			}
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);

				delL_bldr.setSet(t.can_flg);
				dbUpdateKey("MSBEL5930_MST_ARR_ACT_U01", delL, delL_bldr);
			}
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(t);

				dbInsert("MSBEL5930_MST_ARR_ACT_I01", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);

				updL_bldr.removeSet(MST_ARR_ACT_R.$stk_lst_prnt_flg);
				updL_bldr.removeSet(MST_ARR_ACT_R.$wms_flg);
				updL_bldr.removeSet(MST_ARR_ACT_R.$ext_sys_cd);
				updL_bldr.removeSet(MST_ARR_ACT_R.$ext_arr_act_no);
				updL_bldr.removeSet(MST_ARR_ACT_R.$edi_flg);
				dbUpdateKey("MSBEL5930_MST_ARR_ACT_U02", updL, updL_bldr);
			}

			// キャッシュを取り直す
			initArrActCache(up1());
		}

		/**
		 * 受払実績サービス.受払更新
		 * 受払実績作成ＦＬＧ＝オンのとき実行
		 */
		protected void callIoActUpd01() {
			if (up0().io_act_flg()) {
				MSBEL_IoActService.IoAct_Upd01 o = MSBEL_IoActService.crtIoAct_Upd01();
				o.exec();
			}
		}
		
		/**
		 * 受払実績サービス.受払実績ＷＫ登録
		 */
		protected void callIoActIns01() {
			MCList<ArrAct_DtlR>
			del01L = MCList.create(ArrAct_DtlR.class),
			// 移送、移送返品、支給、支給返品、出荷返品（乙仲・未売上）※入荷進捗.返品元納品書明細ＮＯあり
			ins01SrXXrPPrL = MCList.create(ArrAct_DtlR.class),
			ins01OthL = MCList.create(ArrAct_DtlR.class);// その他
			MCMessageList msgList = new MCMessageList();

			for (ArrAct_DtlR r : up1()) {

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					del01L.add(r);
				}
				else if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
					if (!isNull(r.arr_schd_no())) {
						MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
						if (!isNull(asR.getString("ret_dlv_slip_d_no"))) {
							ins01SrXXrPPrL.add(r);
							continue;
						}
					}
					ins01OthL.add(r);
				}
				else if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					ins01SrXXrPPrL.add(r);
				}
				else {
					ins01OthL.add(r);
				}
			}

			MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
			setAll(o.up0(), ins01OthL, createMap_IoAct_Ins01_DtlR_ArrAct_DtlR());
			addAll(o.up0(), del01L, createMap_IoAct_Ins01_DtlR_ArrAct_DtlR());

			// 数量減の入荷を優先に処理する
			ins01SrXXrPPrL.sort(new java.util.Comparator<ArrAct_DtlR>() {
				@Override
				public int compare(ArrAct_DtlR o1, ArrAct_DtlR o2) {
					MCNumber
						val1 = MCNumber.ZERO,
						val2 = MCNumber.ZERO;
					if (MAC_DATA_CRUD_TYP.isUPD(o1.data_crud_typ())) {
						val1 = o1.getNumber(ORG_BASE_UNIT_QTY).subtract(o1.base_unit_qty());
					}
					if (MAC_DATA_CRUD_TYP.isUPD(o2.data_crud_typ())) {
						val2 = o2.getNumber(ORG_BASE_UNIT_QTY).subtract(o2.base_unit_qty());
					}
					return val1.compareTo(val2) * -1;
				}
			});
			// 出荷返品（乙仲・未売上）、移送、移送返品、支給、支給返品
			for (ArrAct_DtlR ins01SrXXrPPrR : ins01SrXXrPPrL) {
				ArrAct_DtlR r = ins01SrXXrPPrR.clone();

				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				boolean isEx = !isNull(asR.getString("iv_d_no"));

				MCList<MST_SHIP_ACT_D_R> shipActDL = null;
				if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
					r.dlv_slip_d_no(asR.getString("ret_dlv_slip_d_no"));
					r.dlv_slip_no(asR.dlv_slip_no());
				}
				else {
					r.dlv_slip_d_no(asR.getString("dlv_slip_d_no"));
					r.setStringNE("iv_d_no", asR.getString("iv_d_no"));
				}
				shipActDL =  isEx ? getIvShipActDL(r) : getShipActDL2(r);

				IoAct_Ins01_DtlR base = IoAct_Ins01_DtlR.create();
				copy(base, r, createMap_IoAct_Ins01_DtlR_ArrAct_DtlR());
				base.setBooleanNE("isEx", isEx);	// 輸出か(入荷マップ作成で使用)

				MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(r.itm_cd(),r.itm_sub1(),r.itm_sub2(),r.itm_sub3(),r.trd_unit_cd());
				MCNumber baseQty = r.base_unit_qty();

				MCList<IoAct_Ins01_DtlR>addIoActs =MCList.create(IoAct_Ins01_DtlR.class);
				for(MST_SHIP_ACT_D_R shipActR : shipActDL) {
					if (!shipActR.getNumber("not_appl_qty").isPositive()) {	// 残なし
						continue;
					}

					MAM_LOC_R locR = getLocR(shipActR.ship_loc_cd());
					IoAct_Ins01_DtlR dest = base.clone();

					dest.act_d_no(isEx ? shipActR.getString("iv_ship_act_d_no") : shipActR.ship_act_d_no());
					dest.gi_wg_cd(locR.wg_cd());
					dest.gi_loc_cd(shipActR.ship_loc_cd());
					dest.gi_str_ln_cd(shipActR.ship_str_ln_cd());

					// 出荷返品
					if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
						dest.gi_gd_cd(shipActR.gd_cd());
					}
					// 支給返品または計上後のVMI品の移送・支給
					else if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
						|| (MSC_STK_ID_TYP.isRNT_RCV(shipActR.stk_id_typ())
							&& MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()))) {
						dest.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
						dest.stk_id_typ(r.stk_id_typ());
						dest.stk_bp_cd(r.stk_bp_cd());
					}
					else {
						dest.stk_arrv_bp_cd(shipActR.stk_arrv_bp_cd());
						dest.stk_id_typ(shipActR.stk_id_typ());
						dest.stk_bp_cd(shipActR.stk_bp_cd());
					}

					if (baseQty.gte(shipActR.getNumber("not_appl_qty"))) {
						dest.base_unit_qty(shipActR.getNumber("not_appl_qty"));
						baseQty = baseQty.subtract(shipActR.getNumber("not_appl_qty"));
						shipActR.setNumber("not_appl_qty", MCNumber.ZERO);
					}
					else {
						dest.base_unit_qty(baseQty);
						shipActR.setNumber(
							"not_appl_qty", shipActR.getNumber("not_appl_qty").subtract(baseQty));
						baseQty = MCNumber.ZERO;
					}

					dest.trd_unit_qty(
						rvrsBaseUnitConv(
							dest.base_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
							itmUnitR.dec_place(), itmUnitR.rnd_typ(), true));
					if (isNull(dest.trd_unit_qty())) {
						dest.trd_unit_qty(dest.base_unit_qty());
						dest.trd_unit_cd(dest.base_unit_cd());
					}
					// 同一キーで追加済みの場合は数量を加算する
					// (数量を増やして訂正し、未消込分を新たに消し込んだ場合に必要)
					MCIndexKey idx = o.up0().createIndex(IoAct_Ins01_DtlR.$act_no, IoAct_Ins01_DtlR.$act_d_no);
					IoAct_Ins01_DtlR ioActR = o.up0().getFirst(idx, dest.toArray(idx.getKeys()));
					if (isNull(ioActR)) {
						o.up0().add(dest);
						addIoActs.add(dest);
					}
					else {
						ioActR.base_unit_qty(sum(ioActR.base_unit_qty(), dest.base_unit_qty()));
						ioActR.trd_unit_qty(sum(ioActR.trd_unit_qty(), dest.trd_unit_qty()));
						ioActR.pack_unit_qty(sum(ioActR.pack_unit_qty(), dest.pack_unit_qty()));
					}

					if (!baseQty.isPositive()) {
						if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())){
							MCList<MST_SHIP_ACT_D_R> shipActDLb = getShipActDL3(r);
							for (MST_SHIP_ACT_D_R actbfR : shipActDLb) {
								int count = 0;
								for(MST_SHIP_ACT_D_R actafR : shipActDL) {
									// 変更前の出荷実績明細ＮＯと変更後の出荷実績明細ＮＯが一致していなかったら削除
									if (isSame(actbfR.ship_act_d_no(), actafR.ship_act_d_no())) {
										count ++;
										break;
									}
								}
								if(count == 0) {
									ArrAct_DtlR delR = r.clone();
									delR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
									ioActR = o.up0().add();
									copy(ioActR, delR, createMap_IoAct_Ins01_DtlR_ArrAct_DtlR());
									ioActR.act_d_no(actbfR.ship_act_d_no());
								}
							}
						}
						for (MST_SHIP_ACT_D_R actR : shipActDL) {
							if (!isNull(actR.getString("arr_act_no"))) {
								// 入荷済みの数量が減り、余った分を解放する
								if (actR.getNumber("not_appl_qty").isPositive()) {
									actR.setString("arr_act_no", null);
								}
								// 入荷数量が減り、訂正前に消し込んでいた出荷実績明細が不要になった場合、受払実績を削除する
								if (isSame(actR.getNumber("arr_qty"), actR.getNumber("not_appl_qty"))) {
									ArrAct_DtlR delR = r.clone();
									delR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());

									ioActR = o.up0().add();
									copy(ioActR, delR, createMap_IoAct_Ins01_DtlR_ArrAct_DtlR());
									ioActR.act_d_no(isEx ? actR.getString("iv_ship_act_d_no") : actR.ship_act_d_no());
								}
							}
						}
						break;
					}
				}
				
				MAM_ITM_R itmBaseUnitR = getItmR(r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3());
				
				boolean isMultipleActs =addIoActs.size()>1;
				
				for (IoAct_Ins01_DtlR ioActR : addIoActs) {
					if (isMultipleActs) {
						MCNumber trdUnitQty = cnvBaseToTrdUnitQty(
								ioActR.base_unit_qty(), itmUnitR.conv_base_qty(),
								itmUnitR.conv_qty(), itmUnitR.dec_place(),
								itmUnitR.rnd_typ(), itmBaseUnitR.dec_place(),
								itmBaseUnitR.rnd_typ());
						ioActR.trd_unit_qty(trdUnitQty);
						ioActR.trd_unit_cd(r.trd_unit_cd());

						if (isNull(ioActR.trd_unit_qty())) {
							ioActR.trd_unit_qty(ioActR.base_unit_qty());
							ioActR.trd_unit_cd(ioActR.base_unit_cd());
						}
					}
					else {
						ioActR.trd_unit_qty(r.trd_unit_qty());
						ioActR.trd_unit_cd(r.trd_unit_cd());
					}
					
					if (itmUnitR.pack_flg()) {
						ioActR.pack_unit_qty(ioActR.trd_unit_qty());
						ioActR.pack_unit_cd(ioActR.trd_unit_cd());
					}
					else {
						ioActR.pack_unit_qty(ioActR.base_unit_qty());
						ioActR.pack_unit_cd(ioActR.base_unit_cd());
					}
				}
				if (baseQty.isPositive()) {
					msgList.add(new MCMessage(r, null, MSBEL1051, asR.dlv_slip_no(), r.dlv_slip_d_no(), r.lot_no(), r.sublot_no(), r.base_unit_qty().subtract(baseQty), toDispGUIIndex(r)));
				}
			}
			if (msgList.size() > 0) {
				setError(msgList);
			}
			if (o.up0().isEmpty()) return ;
			o.exec();
			
			// 入荷マップ更新
			updArrMap(o.up0());
		}

		/**
		 * 入荷マップを更新する
		 */
		protected void updArrMap(MCList<IoAct_Ins01_DtlR> ioActL) {
			MCList<MST_ARR_MAP_R>
				insL = MCList.create(MST_ARR_MAP_R.class),
				delL = MCList.create(MST_ARR_MAP_R.class);

			for (IoAct_Ins01_DtlR r : ioActL) {
				if ( !(MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) ) {
					continue;
				}
				MST_ARR_MAP_R delR = delL.add();
				delR.arr_act_no(r.act_no());

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
					|| isNull(r.act_d_no())) {
					continue;
				}
				MST_ARR_MAP_R insR = insL.add();
				insR.arr_act_no(r.act_no());
				if (r.getBooleanNE("isEx")) {
					insR.iv_ship_act_d_no(r.act_d_no());
				}
				else {
					insR.ship_act_d_no(r.act_d_no());
				}
				insR.arr_qty(r.base_unit_qty());
			}
			if (!delL.isEmpty()) {
				MST_ARR_MAP_R t = MST_ARR_MAP_R.create("T");

				execDbDelete("MSBEL5930_MST_ARR_MAP_D01", t, t.arr_act_no.eq(bind("arr_act_no")), delL.groupBy(MST_ARR_MAP_R.$arr_act_no));
			}
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_ARR_MAP_R.create("T"));
				
				dbInsert("MSBEL5930_MST_ARR_MAP_I01", insL, insL_bldr);
			}
		}


		/**
		 * 入荷予定サービス呼び出し
		 */
		protected void callArrSchdService(MCList<ArrAct_DtlR> list) {
			MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR r : list) {
				MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
				if (!isNull(aaR.arr_schd_no())) {
					l.add(r);
				}
			}
			callArrSchdUpd02(l);
			callArrSchdUpd03(l);
		}
		/**
		 * 入荷予定.更新（予定・実績）
		 */
		protected void callArrSchdUpd02(MCList<ArrAct_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBEL_ArrSchdService.ArrSchd_Upd02 o = MSBEL_ArrSchdService.crtArrSchd_Upd02();
			for (MCList<ArrAct_DtlR> lst : l.groupList(ArrAct_DtlR.$arr_schd_no)) {
				copy(o.up0().add(), lst.distinctNE(ArrAct_DtlR.$data_crud_typ).get(0), createMap_ArrSchd_DtlR_ArrAct_DtlR());
			}
			o.exec();
		}
		protected Map_ArrSchd_DtlR_ArrAct_DtlR<ArrSchd_DtlR,ArrAct_DtlR> createMap_ArrSchd_DtlR_ArrAct_DtlR() {
			return new Map_ArrSchd_DtlR_ArrAct_DtlR<ArrSchd_DtlR, ArrAct_DtlR>();
		}
		public class Map_ArrSchd_DtlR_ArrAct_DtlR<D extends ArrSchd_DtlR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArrSchd_DtlR.$arr_schd_no, ArrAct_DtlR.$arr_schd_no);
				addColumnPathMap(ArrSchd_DtlR.$arr_ptn_typ, ArrAct_DtlR.$arr_ptn_typ);
				addColumnPathMap(ArrSchd_DtlR.$abort_flg, ArrAct_DtlR.$abort_flg);
				addColumnPathMap(ArrSchd_DtlR.$base_unit_qty, ArrAct_DtlR.$base_unit_qty);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				dest.lot_no(asR.lot_no());
				dest.sublot_no(asR.sublot_no());
				dest.mfg_inst_no(asR.mfg_inst_no());
				dest.pre_mfg_act_no(asR.pre_mfg_act_no());

				MST_ARR_ACT_R aaR = getArrActR(src.arr_act_no());
				if(MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
					dest.rem_abort_flg(aaR.getBoolean("rem_abort_flg"));
				}
				if(MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.arr_schd_no(aaR.arr_schd_no());
					dest.arr_ptn_typ(aaR.getString("arr_ptn_typ"));
					dest.arr_qty(0);
					dest.abort_flg(false);
				}
				dest.is_src_arract_srv_flg(true);
			}
		}
		
		protected void callArrSchdUpd03(MCList<ArrAct_DtlR> l) {
			// 入荷によって入荷予定が完了から未完了になる場合があるので入荷予定サービスを呼ぶ
			MCList<ArrAct_DtlR> slsRtnL = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR r : l) {
				if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ()) && !r.sync_flg()) {
					slsRtnL.add(r);
				}
			}
			if (slsRtnL.isEmpty()) return ;
			MSBEL_ArrSchdService.ArrSchd_Upd03 o = MSBEL_ArrSchdService.crtArrSchd_Upd03();
			MCList<ArrSchd_DtlR> tgtL = MCList.create(ArrSchd_DtlR.class);
			for (MCList<ArrAct_DtlR> lst : slsRtnL.groupList(ArrAct_DtlR.$arr_schd_no)) {
				ArrSchd_DtlR tgtR= ArrSchd_DtlR.create();
				tgtR.arr_schd_no(lst.get(0).arr_schd_no());
				MST_ARR_SCHD_R asR = getArrSchdR(lst.get(0).arr_schd_no());
				tgtR.sls_ret_schd_abort_flg(asR.sls_ret_schd_abort_flg());
				tgtL.add(tgtR);
			}
			o.up0().addAll(tgtL);
			o.exec();
		}
		
		/**
		 * 受領インボイス登録サービス（受領オンボイスＮＯ仮登録）呼び出し
		 */
		protected void callRcptIvRegUpd02(MCList<ArrAct_DtlR> list) {
			// 受領インボイスマップを取得
			initRcptIv4Act(list.subList(r -> !isNull(r.arr_act_no())));
			
			MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR r : list) {
				String spplCd = isNull(r.arr_act_no()) ? r.sppl_cd() : getArrActR(r.arr_act_no()).sppl_cd();
				MAM_BP_R spplR = getBpR(spplCd);
				if (spplR.sppl_iv_flg()) {
					if (!isNull(r.temp_rcpt_iv_no())) {
						l.add(r);
					}
					else if (!isNull(r.arr_act_no())) {
						MCList<MST_RCPT_IV_D_R> rcptIvL = getRcptIv4ActL(r.arr_act_no());
						for (MST_RCPT_IV_D_R rcptIvR : rcptIvL) {
							if (!isNull(rcptIvR.getStringNE("temp_rcpt_iv_no"))) {
								l.add(r);
							}
						}
					} 
				}
			}
			if (l.isEmpty()) return;
			
			MSBEL_RcptIvRegService.RcptIv_Upd02 o = MSBEL_RcptIvRegService.crtRcptIv_Upd02();
			setAll(o.up0(), l, createMap_RcptIv_Chk02_MapR_ArrAct_DtlR());
			o.exec();
		}
	}
	
	/**
	 * 未着品の入荷に対して金額を算出する
	 */
	protected void setAmtForYet(MCList<ArrAct_DtlR> up1L) {
		MCList<ArrAct_DtlR> purcL = MCList.create(ArrAct_DtlR.class);
		for (ArrAct_DtlR r : up1L) {
			if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
				&& (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()))
				&& MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
				purcL.add(r);
			}
		}
		if (purcL.isEmpty())	return;

		String[][] amtCols = {
				{MST_PURC_ACT_IO_R.$trd_cur_amt, MST_PURC_ACT_R.$trd_cur_cd},
				{MST_PURC_ACT_IO_R.$trd_cur_tax_amt, MST_PURC_ACT_R.$trd_cur_cd},
				{MST_PURC_ACT_IO_R.$base_cur_amt, MST_PURC_ACT_R.$base_cur_cd},
				{MST_PURC_ACT_IO_R.$base_cur_tax_amt, MST_PURC_ACT_R.$base_cur_cd},
				{MST_PURC_ACT_IO_R.$ptax_cur_amt, MST_PURC_ACT_R.$ptax_cur_cd},
				{MST_PURC_ACT_IO_R.$ptax_cur_tax_amt, MST_PURC_ACT_R.$ptax_cur_cd}
		};

		// 入荷済み分の金額
		initArrActL(purcL);

		for (MCList<ArrAct_DtlR> l : purcL.groupList(ArrAct_DtlR.$purc_act_io_no)) {
			l.sort(ArrAct_DtlR.$arr_act_no);
			ArrAct_DtlR grpR = l.get(l.size() - 1);	// 案分後の残をよせる入荷

			// 仕入金額を入荷数量で案分する
			MST_PURC_ACT_IO_R purcIoR = getPurcActIoR(grpR.purc_act_io_no());
			for (ArrAct_DtlR r : l) {
				for (String[] col : amtCols) {
					// 仕入金額／仕入数量＊入荷数量
					r.setNumber(col[0],
						calcBaseQtyAmt(
							purcIoR.getNumber(col[0]), purcIoR.base_unit_qty(), r.base_unit_qty(),
							getCurR(purcIoR.getString(col[1])).amt_dec_place()));
				}
			}

			// 入荷に金額は持っていないので、登録済みの受払実績から取得する
			MCList<MST_ARR_ACT_R>
				arrL = getArrActL(grpR.purc_act_io_no()), rmL = MCList.create(MST_ARR_ACT_R.class);

			MST_ARR_ACT_R actR = MST_ARR_ACT_R.create();
			if (!arrL.isEmpty()) {
				// 今回訂正分の受払実績を除外した登録済み分のみ抽出
				for (MST_ARR_ACT_R r : arrL) {
					if (l.getFirst(ArrAct_DtlR.$arr_act_no, r.getString("arr_act_no")) != null) {
						rmL.add(r);
					}
				}
				arrL.removeAll(rmL);
				if (!arrL.isEmpty()) {
					MCGroupByPolicy p = new MCGroupByPolicy("purc_act_io_no");
					p.sum("base_unit_qty");
					for (String[] cols : amtCols) {
						p.sum(cols[0]);
					}
					actR = arrL.groupBy(p).get(0);
				}
			}

			// 全数入荷の場合、算出した金額との差分を最後に追加された入荷に合算する
			MCNumber yetQty = 
				purcIoR.base_unit_qty().subtract(
					nvl(actR.base_unit_qty(), MCNumber.ZERO).add(l.sum(ArrAct_DtlR.$base_unit_qty)));
			if (!yetQty.isPositive()) {	// 全数入荷
				for (String[] col : amtCols) {
					MCNumber amt =
						nvl(purcIoR.getNumber(col[0]), MCNumber.ZERO).subtract(
							nvl(actR.getNumber(col[0]), MCNumber.ZERO).add(l.sum(col[0])));
					if (!isNull(amt) && amt.isPositive()) {
						grpR.setNumber(col[0], nvl(grpR.getNumber(col[0]), MCNumber.ZERO).add(amt));
					}
				}
			}
		}
	}
	
	/**
	 * 入荷数量に対する金額を求める際の比率（仕入金額／仕入数量）
	 */
	protected int _arrQtyAmtDecPlace = 9;
	protected MCNumber calcBaseQtyAmt(
		MCNumber purcAmt, MCNumber purcQty, MCNumber arrQty, MCNumber decPlace) {
		if(isNullOr(purcAmt, purcQty, arrQty) || purcQty.isZero()) {
			return null;
		}
		return purcAmt.divide(purcQty, _arrQtyAmtDecPlace, MCNumber.MODE_DOWN)
				.multiply(arrQty)
				.setScale(decPlace.intValue(), MCNumber.MODE_DOWN);
	}
	
	protected Map_IoAct_Ins01_DtlR_ArrAct_DtlR<IoAct_Ins01_DtlR,ArrAct_DtlR> createMap_IoAct_Ins01_DtlR_ArrAct_DtlR() {
		return new Map_IoAct_Ins01_DtlR_ArrAct_DtlR<IoAct_Ins01_DtlR, ArrAct_DtlR>();
	}
	public class Map_IoAct_Ins01_DtlR_ArrAct_DtlR<D extends IoAct_Ins01_DtlR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoAct_Ins01_DtlR.$data_crud_typ, ArrAct_DtlR.$data_crud_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$ac_dt, ArrAct_DtlR.$ac_dt);
			addColumnPathMap(IoAct_Ins01_DtlR.$can_ac_dt, ArrAct_DtlR.$can_ac_dt);
			addColumnPathMap(IoAct_Ins01_DtlR.$act_no, ArrAct_DtlR.$arr_act_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$act_rev_no, ArrAct_DtlR.$arr_act_rev);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_cd, ArrAct_DtlR.$trd_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_ptn_typ, ArrAct_DtlR.$trd_ptn_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$act_usr_cd, ArrAct_DtlR.$arr_usr_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$act_dpt_cd, ArrAct_DtlR.$arr_dpt_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_cd, ArrAct_DtlR.$itm_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_nm, ArrAct_DtlR.$itm_nm);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_mng_typ, ArrAct_DtlR.$stk_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sundry_itm_flg, ArrAct_DtlR.$sundry_itm_flg);
			addColumnPathMap(IoAct_Ins01_DtlR.$gr_loc_cd, ArrAct_DtlR.$arr_loc_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$gr_str_ln_cd, ArrAct_DtlR.$str_ln_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_arrv_bp_cd, ArrAct_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$lot_no, ArrAct_DtlR.$lot_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$sublot_no, ArrAct_DtlR.$sublot_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno1, ArrAct_DtlR.$sno1);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno1_mng_typ, ArrAct_DtlR.$sno1_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno2, ArrAct_DtlR.$sno2);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno2_mng_typ, ArrAct_DtlR.$sno2_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno3, ArrAct_DtlR.$sno3);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno3_mng_typ, ArrAct_DtlR.$sno3_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno4, ArrAct_DtlR.$sno4);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno4_mng_typ, ArrAct_DtlR.$sno4_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$gr_gd_cd, ArrAct_DtlR.$gd_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$quality_typ, ArrAct_DtlR.$quality_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$cst_cd, ArrAct_DtlR.$cst_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$sppl_cd, ArrAct_DtlR.$sppl_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_insp_typ, ArrAct_DtlR.$stk_insp_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$purc_id_typ, ArrAct_DtlR.$purc_id_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_id_typ, ArrAct_DtlR.$stk_id_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_bp_cd, ArrAct_DtlR.$stk_bp_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_qty, ArrAct_DtlR.$trd_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_cd, ArrAct_DtlR.$trd_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_qty, ArrAct_DtlR.$base_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_cd, ArrAct_DtlR.$base_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$arr_ptn_typ, ArrAct_DtlR.$arr_ptn_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_rmrks, ArrAct_DtlR.$trd_rmrks);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_d_rmrks, ArrAct_DtlR.$trd_d_rmrks);
			addColumnPathMap(IoAct_Ins01_DtlR.$rsn_cd, ArrAct_DtlR.$rsn_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.trn_typ(MSC_TRN_TYP.ARR.value());
			if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				return ;
			}

			MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
			MAM_LOC_R locR = getLocR(src.arr_loc_cd());

			dest.act_tm(src.arr_tm());
			if (!isNull(src.arr_schd_no())) {
				dest.rsn_cd(src.rsn_cd());
				dest.bd_dpt_cd(src.bd_dpt_cd());
				dest.gi_gd_cd(asR.gd_cd());
			}
			if (locR != null) {
				dest.gr_wg_cd(locR.wg_cd());
			}

			// 取引パタン区分「仕入」「経費購買」「売上返品」「入荷」「出荷返品」
			// 上記以外は後で埋める
			if (MAC_TRD_PTN_TYP.isPURC(src.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(src.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(src.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isARR(src.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP_RTN(src.trd_ptn_typ())) {

				MST_SLS_RET_SCHD_D_R slsSchdDR = getSlsRetSchdDR(asR.getString("sls_ret_schd_d_no"));

				MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(src.itm_cd(),src.itm_sub1(),src.itm_sub2(),src.itm_sub3(),src.trd_unit_cd());
				if (itmUnitR.pack_flg()) {
					dest.pack_unit_qty(src.trd_unit_qty());
					dest.pack_unit_cd(src.trd_unit_cd());
				}
				else {
					dest.pack_unit_qty(src.base_unit_qty());
					dest.pack_unit_cd(src.base_unit_cd());
				}

				// 売上返品
				if (MAC_TRD_PTN_TYP.isSLS_RTN(src.trd_ptn_typ())) {
					if (!isNull(asR.getString("sls_ret_schd_d_no"))) {
						dest.sls_usr_cd(slsSchdDR.getString("sls_usr_cd"));
						dest.dlv_cd(slsSchdDR.sret_fr_cd());
						dest.tdlv_cd(slsSchdDR.tdlv_cd());
					}
					else{
						// 計画外
						dest.sls_usr_cd(src.rqst_usr_cd());
						dest.sls_dpt_cd(src.rqst_dpt_cd());
						dest.dlv_cd(src.sret_fr_cd());
					}
				}
				// 出荷返品
				if (MAC_TRD_PTN_TYP.isSHIP_RTN(src.trd_ptn_typ())) {
					if (!isNull(asR.getString("ret_dlv_slip_d_no")) && isNull(slsSchdDR.tdlv_cd())) {	// 未売上
						dest.fix_no_typ(MSC_FIX_NO_TYP.DLV_SLIP_NO.value());
						dest.fix_no(asR.dlv_slip_no());
					}
					else {	// 貸出返品
						dest.gi_wg_cd(getLocR(src.ret_loc_cd()).wg_cd());
						dest.gi_loc_cd(src.ret_loc_cd());
						dest.gi_str_ln_cd(src.ret_str_ln_cd());
					}
					if (!isNull(asR.getString("sls_ret_schd_d_no"))) {
						dest.dlv_cd(slsSchdDR.sret_fr_cd());
						dest.tdlv_cd(slsSchdDR.tdlv_cd());
						dest.cst_cd(slsSchdDR.getString("cst_cd"));
						dest.stk_arrv_bp_cd(asR.getString("ret_stk_arrv_bp_cd"));
						dest.gi_gd_cd(asR.ret_gd_cd());
					}
					else {
						// 計画外
						dest.dlv_cd(src.sret_fr_cd());
						dest.stk_arrv_bp_cd(src.sret_fr_cd());
						dest.gi_gd_cd(src.ret_gd_cd());
					}
				}
				// 仕入・経費購買
				if (MAC_TRD_PTN_TYP.isPURC(src.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(src.trd_ptn_typ())) {

					dest.rcpt_iv_no(src.rcpt_iv_no());
					dest.sppl_cd(src.sppl_cd());
					dest.sppl_itm_cd(src.sppl_itm_cd());
					dest.sppl_itm_nm(src.sppl_itm_nm());
					dest.purc_id_typ(src.purc_id_typ());

					MST_PO_D_R poDR = getPoDR(asR.getString("po_d_no"));
					if (!isNull(asR.getString("po_d_no"))) {
						dest.slo_no(poDR.slo_no());
						dest.po_no(poDR.po_no());
					}
					else{
						// 計画外の場合
						dest.sls_usr_cd(src.rqst_usr_cd());
						dest.sls_dpt_cd(src.rqst_dpt_cd());
					}
				}
				// 入荷
				if (MAC_TRD_PTN_TYP.isARR(src.trd_ptn_typ())) {
					// 検査対象の場合のみ確定NOを設定する
					if (!MSC_STK_INSP_TYP.isFIN(src.stk_insp_typ())) {
						dest.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
						dest.fix_no(src.arr_act_no());
					}
				}
			}

			// 入荷パタン区分「未着管理」
			if (MSC_ARR_PTN_TYP.isN_YET_ARR(src.arr_ptn_typ())) {
				dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());

				MST_PURC_ACT_IO_R purcIoR = getPurcActIoR(src.purc_act_io_no());
				if (!isNull(src.purc_act_io_no())) {
					dest.un_fix_flg(purcIoR.getBoolean("interim_flg"));
					dest.purc_dpt_cd(purcIoR.getString("purc_dpt_cd"));
					dest.ap_dpt_cd(purcIoR.getString("ap_dpt_cd"));
					dest.purc_usr_cd(purcIoR.getString("purc_usr_cd"));
					dest.trd_cur_cd(purcIoR.getString("trd_cur_cd"));
					dest.trd_cur_upri(purcIoR.trd_cur_upri());
					dest.base_cur_cd(purcIoR.getString("base_cur_cd"));
					dest.base_cur_upri(purcIoR.base_cur_upri());
					dest.ptax_cur_cd(purcIoR.getString("ptax_cur_cd"));
					dest.ptax_cur_upri(purcIoR.ptax_cur_upri());
					dest.trd_cur_amt(src.trd_cur_amt());
					dest.trd_cur_tax_amt(src.trd_cur_tax_amt());
					dest.base_cur_amt(src.base_cur_amt());
					dest.base_cur_tax_amt(src.base_cur_tax_amt());
					dest.ptax_cur_amt(src.ptax_cur_amt());
					dest.ptax_cur_tax_amt(src.ptax_cur_tax_amt());
					dest.tax_cd(purcIoR.getString("tax_cd"));
					dest.xrate_cd(purcIoR.getString("xrate_cd"));
					dest.xrate(purcIoR.getNumber("xrate"));
					dest.ptax_xrate_cd(purcIoR.getString("xrate_cd"));
					dest.ptax_xrate(purcIoR.getNumber("ptax_xrate"));
					dest.asppl_cd(purcIoR.getString("asppl_cd"));
					dest.purc_typ(purcIoR.getString("purc_typ"));
					
					if (!isSame(src.arr_loc_cd(), purcIoR.in_to_loc_cd())
						|| !isSame(src.str_ln_cd(), purcIoR.str_ln_cd())) {
						dest.gr_loc_cd(purcIoR.in_to_loc_cd());
						dest.gr_str_ln_cd(purcIoR.str_ln_cd());
						dest.strg_loc_cd(src.arr_loc_cd());
						dest.strg_str_ln_cd(src.str_ln_cd());
					}
					if (MAC_TRD_PTN_TYP.isPURC(src.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPURC_XPNS(src.trd_ptn_typ())) {
						dest.fix_no_typ(MSC_FIX_NO_TYP.PURC_ACT_IO_NO.value());
						dest.fix_no(purcIoR.purc_act_io_no());
					}
				}
			}
			// 入荷パタン区分「未着管理」以外(「通常管理」「未設定」)
			else {
				if (MAC_TRD_PTN_TYP.isXFR(src.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isXFR_RTN(src.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) {
					dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_XFR.value());
					if (!isSame(src.arr_loc_cd(), asR.arr_loc_cd())
							|| !isSame(src.str_ln_cd(), asR.str_ln_cd())) {
						dest.gr_loc_cd(asR.arr_loc_cd());
						dest.gr_str_ln_cd(asR.str_ln_cd());
						dest.strg_loc_cd(src.arr_loc_cd());
						dest.strg_str_ln_cd(src.str_ln_cd());
					}
				}
				else {
					dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				}
				if (MAC_TRD_PTN_TYP.isPURC(src.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(src.trd_ptn_typ())) {
					// 仕入検収前または検査対象の場合のみ確定NOを設定する
					if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(src.stk_id_typ())
						|| !MSC_STK_INSP_TYP.isFIN(src.stk_insp_typ())) {
						dest.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
						dest.fix_no(src.arr_act_no());
					}
				}
			}
			if (asR.outsrc_flg()) {
				dest.mfg_inst_no(src.mfg_inst_no());
			}
			if (src.pre_outsrc_act_flg()) {
				dest.mfg_act_no(asR.pre_mfg_act_no());
			}
		}
	}

	/**
	 * ArrAct_Upd02オペレーション.<p>
	 *
	 * 現品票発行済フラグをオン(発行済)に更新する。<br>
	 */
	public class ArrAct_Upd02 extends MSBEL_ArrActService_MC_A.ArrAct_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			updArrAct();
		}

		protected void editUp() {
			up0().arr_act().stk_lst_prnt_flg(true);
		}
		/**
		 * 入荷実績.現品票発行済ＦＬＧ更新
		 */
		protected void updArrAct() {
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_ARR_ACT_R dbc = up0().arr_act();
			dbc_bldr.setSet(t.stk_lst_prnt_flg);
			dbUpdateKey("MSBEL5930_MST_ARR_ACT_U03", dbc, dbc_bldr);
		}
	}
	/**
	 * ArrAct_Chk01オペレーション.<p>
	 *
	 * 登録前のチェック処理を実行する。<br>
	 */
	public class ArrAct_Chk01 extends MSBEL_ArrActService_MC_A.ArrAct_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doCache();
			doCheck();
			// ファイル入力時はロット発番しない
			if(!up1().file_imp_flg()) {
				doLot(up0());
			}
			doService();
			setDown();
		}

		protected void doCache() {
			initArrActCache(up0());
			initPurcAct(up0());
			editUp();
			initArrSchdCache(up0());
			initLocCache(up0());
			initItmCache(up0());
			initBpCache(up0());
			initItmUnitCache(up0());
			callInspSchdSrch01(up0()
					.subList(
							new TrdPtnTypMatcher(MAC_TRD_PTN_TYP.PURC,
									MAC_TRD_PTN_TYP.PURC_XPNS,
									MAC_TRD_PTN_TYP.ARR)));
			MCList<ArrAct_DtlR> bindL = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR r : up0()) {
				if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
					bindL.add(r);
				}
			}
			initPurcSchdCache(up0());
			initPurcActIoL(bindL);
			initPurcActIoNrmlL(up0());
			initSlsActIoNrmlL(up0());
			initBpStpCache(up0());
			initStopItmCache(up0());
			MCList<MST_ARR_SCHD_R> poDL = MCList.create(MST_ARR_SCHD_R.class);
			poDL.addStringColumn("po_d_no");
			for(ArrAct_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
					r.arr_schd_no(aaR.arr_schd_no());
				}
				if (!isNull(r.arr_schd_no())) {
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					if (!isNull(asR.getString("po_d_no"))) {
						poDL.add(asR);
					}
				}
			}
			initPoDCache(poDL);
		}

		protected void editUp() {
			for (ArrAct_DtlR r : up0()) {
				// 削除レコードに対して必要な項目を実績からコピー
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
					r.trd_ptn_typ(aaR.trd_ptn_typ());
					r.arr_schd_no(aaR.arr_schd_no());
					r.purc_id_typ(aaR.purc_id_typ());
					r.sync_flg(aaR.sync_flg());
					r.arr_ptn_typ(aaR.getString("arr_ptn_typ"));
					r.arr_tm(aaR.arr_tm());
					// 以下はキャッシュ用
					r.arr_loc_cd(aaR.arr_loc_cd());
					r.itm_cd(aaR.itm_cd());
					r.itm_sub1(aaR.itm_sub1());
					r.itm_sub2(aaR.itm_sub2());
					r.itm_sub3(aaR.itm_sub3());
					r.lot_no(aaR.lot_no());
					r.sublot_no(aaR.sublot_no());
					r.sppl_cd(aaR.sppl_cd());
					r.trd_unit_cd(aaR.trd_unit_cd());
				}
				// 入荷日の設定（入荷日時の時分情報を削除）
				if (!isNull(r.arr_tm())) {
					r.arr_dt(r.arr_tm().trunc(MCDateFieldType.DAY));
				}
				
				r.temp_ap_flg(isTempAp(r.arr_act_no(), r.sppl_cd(), r.arr_ptn_typ()));
				r.can_ac_dt(getCanAcDt(r));
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected void doCheck() {
			doCheckCommon(up0());
			doCheckProv(up0());

			// データ更新区分別のチェック
			MCMessageList msgL = new MCMessageList();
			MCList<MST_RCPT_IV_D_R> rcptIvL = getRcptIvCacheByPoDNo();
			MCIndexKey rcptIvKey = rcptIvL.createIndex(MST_RCPT_IV_D_R.$po_d_no,
					MST_RCPT_IV_D_R.$purc_schd_no);
			for (ArrAct_DtlR r : up0()) {
				// 新規
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					if (!MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
							&& !MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
							&& MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0114, toDispGUIIndex(r)));
					}
					if (!isNull(rcptIvL)) {
						msgL.addAll(chkCanInsArrAct(r, rcptIvL, rcptIvKey));
					}
				}
				// 更新
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					// 同時計上でない、かつ暫定買掛でない
					if (!r.sync_flg() && !r.temp_ap_flg()) {
						//　「仕入」「経費購買」
						if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {

							MCList<MST_PURC_ACT_IO_R> painL = getPurcActIoNrmlR(r.arr_act_no());
							MCNumber purcQty = nvl(painL.sum(MST_PURC_ACT_IO_R.$base_unit_qty), MCNumber.ZERO);
							
							//未着管理以外(「通常管理」「未設定」)
							if (!MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ()) && purcQty.gt(0)) {
								r.err_flg(true);
								msgL.add(new MCMessage(r, null, MSBEL0121, toDispGUIIndex(r)));
							}
						}

						//　「売上返品」「出荷返品」
						if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
							
							MCList<MST_SLS_ACT_IO_R> sainL = getSlsActIoNrmlR(r.arr_act_no());
							MCNumber slsRetQty = nvl(sainL.sum(MST_SLS_ACT_IO_R.$base_unit_qty), MCNumber.ZERO);

							// 「未着管理」以外(「通常管理」「未設定」)
							if (!MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ()) && slsRetQty.gt(0)) {
								r.err_flg(true);
								msgL.add(new MCMessage(r, null, MSBEL0127, toDispGUIIndex(r)));
							}
						}
					}
					MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					if (isUpdTgt(r, asR) && aaR.getBoolean("rem_abort_flg")) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL1103, toDispGUIIndex(r)));
					}
				}
				// 削除
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
					if(aaR.getBoolean("abort_flg")) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0131, toDispGUIIndex(r)));
					}
					// 同時計上でない、かつ暫定買掛でない
					if (!r.sync_flg() && !r.temp_ap_flg()) {
						//未着管理以外(「通常管理」「未設定」)
						if (!MSC_ARR_PTN_TYP.isN_YET_ARR(aaR.getString("arr_ptn_typ"))) {
							//　「仕入」「経費購買」
							if (MAC_TRD_PTN_TYP.isPURC(aaR.trd_ptn_typ())
									|| MAC_TRD_PTN_TYP.isPURC_XPNS(aaR.trd_ptn_typ())) {

								MCList<MST_PURC_ACT_IO_R> painL = getPurcActIoNrmlR(r.arr_act_no());
								MCNumber purcQty = nvl(painL.sum(MST_PURC_ACT_IO_R.$base_unit_qty), MCNumber.ZERO);

								if (purcQty.gt(0)) {
									r.err_flg(true);
									msgL.add(new MCMessage(r, null, MSBEL0132, toDispGUIIndex(r)));
								}
							}
							//　「売上返品」「出荷返品」
							if (MAC_TRD_PTN_TYP.isSLS_RTN(aaR.trd_ptn_typ())
									|| MAC_TRD_PTN_TYP.isSHIP_RTN(aaR.trd_ptn_typ())) {

								MCList<MST_SLS_ACT_IO_R> sainL = getSlsActIoNrmlR(r.arr_act_no());
								MCNumber slsRetQty = nvl(sainL.sum(MST_SLS_ACT_IO_R.$base_unit_qty), MCNumber.ZERO);

								if (slsRetQty.gt(0)) {
									r.err_flg(true);
									msgL.add(new MCMessage(r, null, MSBEL0133, toDispGUIIndex(r)));
								}
							}
						}
					}
				}
				// 更新 or 削除
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {

					// 同時計上が異なる
					MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
					if (!isSame(r.sync_flg(), aaR.sync_flg())) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0123, toDispGUIIndex(r)));
					}
				}
				// 新規 or 更新
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {

					MST_PO_D_R poDR = getPoDR(r.po_d_no());
					// 仕入計上区分チェック
					if (!isNull(poDR.purc_basis_typ()) && !MAC_PURC_BASIS_TYP.isANY_BASIS(poDR.purc_basis_typ())) {
						if (MAC_PURC_BASIS_TYP.isARR_BASIS(poDR.purc_basis_typ()) && !r.sync_flg()) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBDL0411, toDispGUIIndex(r)));
						}
						if (MAC_PURC_BASIS_TYP.isIN_BASIS(poDR.purc_basis_typ()) && r.sync_flg()) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBDL0412, toDispGUIIndex(r)));
						}
					}
				}
			}
			MCMessagePool.addAll(msgL);
		}

		protected void doService() {
			MCList<ArrAct_DtlR> l2 = MCList.create(ArrAct_DtlR.class);
			MCList<ArrAct_DtlR> l3 = MCList.create(ArrAct_DtlR.class);

			for(ArrAct_DtlR r : up0()) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
					&& MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
					if (r.crt_lot_flg()) {
						// ファイル入力時はロットを発番しないのでチェックしない
						if (!up1().file_imp_flg() || !isNull(r.lot_no())) {
							l2.add(r);
						}
					}
					else {
						l3.add(r);

						// 取引パタンが「仕入」「経費購買」「入荷(無償受給、VMI)」の場合、
						// 同一ロット不許可を考慮して重複チェックを行う
						if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !isNull(r.purc_id_typ())) {

							if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
								if (!isNull(r.arr_schd_no())) {
									MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
									if (!isSame(r.lot_no(), asR.lot_no()) || !isSame(r.sublot_no(), asR.sublot_no())) {
										l2.add(r);
									}
								}
								else {
									l2.add(r);
								}
							}
							else {
								MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
								if (!isSame(r.lot_no(), aaR.lot_no()) || !isSame(r.sublot_no(), aaR.sublot_no())) {
									l2.add(r);
								}
							}
						}
					}
				}
			}

			callLotChk02(l2);
			callLotChk03(l3);
			callOutSrcActChk01(up0());
			callArrSchdChk02(up0());
			callProvActChk01(up0());
			callMrktJudgChk01(up0());
			callInspSchdChk01(up0());
			callAprvChk02(up0());
			callAprvChk03(up0());
			callSlsRetChk01(up0());
			callClChk03(up0());
			callSundryItmChk01(up0());
			callPurcChk02(up0());
			callRcptIvRegChk02(up0());
			callPurcSchdChk01(up0());
		}
		
		protected boolean isUpdTgt(ArrAct_DtlR dtlR, MST_ARR_SCHD_R asR) {
			MCNumber arrQty = MCNumber.max(asR.arr_qty(), asR.purc_qty());
			if (!isSame(dtlR.base_unit_qty(), arrQty) || !isSame(dtlR.abort_flg(), asR.abort_flg())) {
				return true;
			}
			return false;
		}
		
		protected MCMessageList chkCanInsArrAct(ArrAct_DtlR r, MCList<MST_RCPT_IV_D_R> rcptIvL, MCIndexKey rcptIvKey) {
			MCMessageList msgL = new MCMessageList();
			if (isPurcEntryTgt(r) && !isNull(r.rcpt_iv_no())) {
				MST_PURC_SCHD_R purcSchdR = getPurcSchdCache(r.arr_schd_no());
				MST_RCPT_IV_D_R rcptIvR = rcptIvL.getFirst(rcptIvKey, r.po_d_no(), purcSchdR.purc_schd_no());
				MST_ARR_SCHD_R arrSchdR = getArrSchdR(r.arr_schd_no());
				if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(rcptIvR.getStringNE("rcpt_iv_src_typ"))
						&& purcSchdR.cmpl_flg()
						&& arrSchdR.cmpl_flg()) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL1136, r.rcpt_iv_no(), r.arr_schd_no(), r.po_d_no(), toDispGUIIndex(r)));
				}
			}
			return msgL;
		}
		
		protected MCList<MST_RCPT_IV_D_R> getRcptIvCacheByPoDNo() {
			MCList<MST_RCPT_IV_D_R> rcptIvDL = MCList.create(MST_RCPT_IV_D_R.class);
			
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
			dbWkDelete("MSBEL5930_MSW_PO_D_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5930_MSW_PO_D_I01", up0().groupBy(ArrAct_DtlR.$po_d_no), wkL_bldr.getBaseDbc());
			
			MSW_PO_D_KEY_R poDKey = MSW_PO_D_KEY_R.create("PODKEY");
			MST_RCPT_IV_D_R rcptIvDR = MST_RCPT_IV_D_R.create("RCPTIVD");
			MST_RCPT_IV_R rcptIvR = MST_RCPT_IV_R.create("RCPTIV");
			MCQueryApiBuilder rcptIvDL_bldr = MCQueryApiBuilder.create(rcptIvDR);
			rcptIvDL_bldr.setSelect(
					rcptIvR.rcpt_iv_mng_no,
					rcptIvR.rcpt_iv_no,
					rcptIvR.rcpt_iv_src_typ,
					rcptIvDR.po_d_no,
					rcptIvDR.purc_schd_no
			);
			rcptIvDL_bldr.addInnerJoin(poDKey, bracket(poDKey.po_d_no.eq(rcptIvDR.po_d_no)));
			rcptIvDL_bldr.addInnerJoin(rcptIvR, bracket(rcptIvR.rcpt_iv_mng_no.eq(rcptIvDR.rcpt_iv_mng_no)));
			dbSelect("MSBEL5930_MST_RCPT_IV_S01", rcptIvDL, rcptIvDL_bldr);
			return rcptIvDL;
		}
	}
	/**
	 * ArrAct_Srch01オペレーション.<p>
	 *
	 * 未入荷、一部入荷の入荷予定を検索する。<br>
	 */
	public class ArrAct_Srch01 extends MSBEL_ArrActService_MC_A.ArrAct_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
		}
		@Override
		protected void initSearch() {
			super.initSearch();
			editSrchCnd(up0());
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			doSrchArrSchd();
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			// down0＝searchForDLでグループ単位にフェッチした件数分
			setValuesDbc(up0(), down0());
			editArrSchd(down0());
			doEditDownForSrch(down0());
		}

		/**
		 * 入荷予定および未着分の仕入実績を検索する
		 */
		protected void doSrchArrSchd() {
			searchForDL(
					MSBEL5930_MST_ARR_SCHD_S02(),
				up0(), down0(), _$srch01_key);
		}
	}

	/**
	 * ArrAct_Srch02オペレーション.<p>
	 *
	 * 一部入荷、全数入荷の入荷実績を検索する。<br>
	 */
	public class ArrAct_Srch02 extends MSBEL_ArrActService_MC_A.ArrAct_Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
		}
		@Override
		protected void initSearch() {
			super.initSearch();
			editSrchCnd(up0());
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			doSrchArrAct();
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			setValuesDbc(up0(), down0());
			editArrAct(down0());
			doEditDownForSrch(down0());
		}

		/**
		 * 入荷実績を検索する
		 */
		protected void doSrchArrAct() {
			searchForDL(
					up0().outsrc_loc_flg() ?
						MSBEL5930_MST_ARR_ACT_S03() : MSBEL5930_MST_ARR_ACT_S02(),
				up0(), down0(), _$srch02_key);
		}
	}

	/**
	 * ArrAct_Srch03オペレーション.<p>
	 *
	 * 未入荷、一部入荷の入荷予定、および一部入荷、全数入荷の入荷実績を検索する。<br>
	 */
	public class ArrAct_Srch03 extends MSBEL_ArrActService_MC_A.ArrAct_Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
		}
		@Override
		protected void initSearch() {
			super.initSearch();
			editSrchCnd(up0());
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			doSrchArrSchd();
			doSrchArrAct();
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			// down0＝searchForDLでグループ単位にフェッチした件数分
			setValuesDbc(up0(), down0());
			editArrSchd(down0());
			editArrAct(down0());
			doEditDownForSrch(down0());
		}

		/**
		 * 実績項目
		 */
		protected String[] _actCols = {
			ArrAct_CndR.$arr_hm_fr,
			ArrAct_CndR.$arr_hm_to,
			ArrAct_CndR.$ac_dt_fr,
			ArrAct_CndR.$ac_dt_to,
			ArrAct_CndR.$arr_usr_cd,
			ArrAct_CndR.$arr_usr_nm,
			ArrAct_CndR.$arr_dpt_cd,
			ArrAct_CndR.$arr_dpt_nm,
			ArrAct_CndR.$arr_act_no,
			ArrAct_CndR.$sls_act_no,
			ArrAct_CndR.$ext_arr_act_no,
			ArrAct_CndR.$prov_src_act_typ,
			ArrAct_CndR.$prov_src_act_no,
			ArrAct_CndR.$prov_act_no
		};

		/**
		 * 検索条件に実績項目が含まれているか
		 */
		protected boolean containsActCols() {
			return !isNullAnd(up0().toArray(_actCols));
		}

		/**
		 * 入荷予定を検索する
		 */
		protected void doSrchArrSchd() {
			if (containsActCols()) {
				return;
			}
			searchForDL(
					MSBEL5930_MST_ARR_SCHD_S02(),
				up0(), down0(), _$srch01_key);
		}

		/**
		 * 入荷実績を検索する
		 */
		protected void doSrchArrAct() {
			searchForDL(
					up0().outsrc_loc_flg() ?
						MSBEL5930_MST_ARR_ACT_S03() : MSBEL5930_MST_ARR_ACT_S02(),
				up0(), down0(), _$srch02_key);
		}
	}

	// ///////////////////////////////////////////////
	// 検索処理共通（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 検索条件を加工する
	 */
	protected void editSrchCnd(ArrAct_CndR upR) {
		// 現品票発行モード
		if (upR.stk_lst_prnt_flg()) {
			upR.setStringNE("TMP_STK_LST_FLG_T", toTrueStr(true));
		}
		// 未入荷
		if (upR.arr_yet_flg()) {
			upR.setStringNE("TMP_ARR_YET", toTrueStr(true));
		}
		// 入荷
		if (upR.arr_done_flg()) {
			upR.setStringNE("TMP_ARR", toTrueStr(true));
		}
		// 打切
		if (upR.abort_flg()) {
			upR.setStringNE("TMP_ABORT", toTrueStr(true));
		}
		// 現品票未発行
		if (upR.prnt_yet_flg()) {
			upR.setStringNE("TMP_PRNT_YET", toTrueStr(true));
		}
		// 現品票発行済
		if (upR.prnt_done_flg()) {
			upR.setStringNE("TMP_PRNT_DONE", toTrueStr(true));
		}
		// ＷＭＳ対象
		if (upR.wms_flg()) {
			upR.setStringNE("TMP_WMS_T", toTrueStr(true));
		}
		// ＷＭＳ対象外
		if (upR.not_wms_flg()) {
			upR.setStringNE("TMP_WMS_F", toTrueStr(true));
		}
		// 外注場所のみ
		if (upR.outsrc_loc_flg()) {
			upR.setStringNE("TMP_OUTSRC_T", toTrueStr(true));
		}
		else {
			upR.setStringNE("TMP_OUTSRC_F", toTrueStr(true));
		}
		// EDI対象を含む
		if (upR.edi_flg()) {
			upR.setStringNE("TMP_EDI_T", toTrueStr(true));
		}
		if (upR.edi_invalid_flg()) {
			upR.setStringNE("TMP_EDI_F", toTrueStr(true));
		}
		// 未検収の未着品を含む
		if (!upR.purc_act_yet_flg()) {
			upR.setStringNE("TMP_PURC_ACT_YET", toTrueStr(true));
		}
		// 支給伝票未発行
		if (upR.prov_slip_prnt_yet_flg()) {
			upR.setStringNE("TMP_PROV_SLIP_PRNT_YET", toTrueStr(true));
		}
		// 支給伝票発行済
		if (upR.prov_slip_prnt_done_flg()) {
			upR.setStringNE("TMP_PROV_SLIP_PRNT_DONE", toTrueStr(true));
		}
		upR.setDateNE("TODAY", getToday());
		if (isSame(upR.ope(), "1") || isSame(upR.ope(), "2")) {
			// 操作種別が「訂正する」または「取り消す」の場合、表示する計画外入荷を「入荷」「出荷返品」のみに限定
			upR.setStringNE("TMP_UPD_UPLND", toTrueStr(true));
		}
	}

	/**
	 * 入荷予定検索時のユニークキー
	 */
	protected String[] _$srch01_key = {
		ArrAct_RsltR.$arr_schd_dt,
		ArrAct_RsltR.$arr_schd_hm,
		ArrAct_RsltR.$arr_schd_no,
		ArrAct_RsltR.$purc_act_io_no
	};

	/**
	 * 入荷実績検索時のユニークキー
	 */
	protected String[] _$srch02_key = {
		ArrAct_RsltR.$arr_act_no
	};

	/**
	 * 検索結果を加工する<br>
	 * 通常管理品は入荷予定の単位で未入荷分を作成するが、<br>
	 * 未着管理品は仕入実績受払の単位で未入荷分を作成する<br>
	 */
	protected void editArrSchd(MCList<ArrAct_RsltR> d0) {

		// 対象なし、もしくは実績検索では以降の処理は行わない
		if (d0.isEmpty() || !isNull(d0.get(0).arr_act_no())) {
			return;
		}

		MCList<ArrAct_RsltR> downL = MCList.create(ArrAct_RsltR.class);
		for (MCList<ArrAct_RsltR> l : d0.groupList(_$srch01_key)) {
			ArrAct_RsltR r = l.get(0);
			// 未着管理（未検収の未着は除く）
			if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())
				&& !isNull(r.getString(ArrAct_RsltR.$purc_act_io_no))) {
				if (!isSame(nvl(l.sum("aa_base_unit_qty"), MCNumber.ZERO), MCNumber.ZERO)) {
					// 仕入実績受払の数量（入荷済み分を除く）を未入荷分とする
					// 未入荷分は、仕入実績受払の単位に換算して設定する。換算できない場合は基準単位で設定する
					MCNumber yetQty = nvl(r.pa_io_base_unit_qty(), MCNumber.ZERO)
									.subtract(nvl(l.sum("aa_base_unit_qty"), MCNumber.ZERO));
					if (!yetQty.isPositive()) {
						continue;
					}
					r.base_unit_qty(yetQty);
					r.trd_unit_qty(
						cnvBaseToTrdUnitQty(
							yetQty, r, 
							r.pa_io_trd_unit_conv_base_qty(), r.pa_io_trd_unit_conv_qty(),
							r.pa_io_trd_unit_dec_place(), r.pa_io_trd_unit_rnd_typ()));
					if (isNull(r.trd_unit_qty())) {
						r.trd_unit_qty(yetQty);
						r.trd_unit_cd(r.base_unit_cd());
						r.trd_unit_nm(r.base_unit_nm());
						r.trd_unit_conv_base_qty(MCNumber.ONE);
						r.trd_unit_conv_qty(MCNumber.ONE);
						r.trd_unit_dec_place(r.base_unit_dec_place());
						r.trd_unit_rnd_typ(r.base_unit_rnd_typ());
					}
					else {
						r.trd_unit_cd(r.pa_io_trd_unit_cd());
						r.trd_unit_nm(r.pa_io_trd_unit_nm());
						r.trd_unit_conv_base_qty(r.pa_io_trd_unit_conv_base_qty());
						r.trd_unit_conv_qty(r.pa_io_trd_unit_conv_qty());
						r.trd_unit_dec_place(r.pa_io_trd_unit_dec_place());
						r.trd_unit_rnd_typ(r.pa_io_trd_unit_rnd_typ());
					}
				}
			}
			// 未入荷分（通常管理、または未着かつ未検収の場合）
			else {
				if (!isSame(nvl(r.arr_qty(), MCNumber.ZERO), MCNumber.ZERO)) {
					// 入荷済み分を除いた数量を未入荷分とする
					// 未入荷分は、取引単位に換算して設定する。換算できない場合は基準単位で設定する
					MCNumber yetQty = r.base_unit_qty().subtract(nvl(r.arr_qty(), MCNumber.ZERO));
					if (!yetQty.isPositive()) {
						continue;
					}
					r.base_unit_qty(yetQty);
					r.trd_unit_qty(
						cnvBaseToTrdUnitQty(
							yetQty, r, 
							r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
							r.trd_unit_dec_place(), r.trd_unit_rnd_typ()));
					if (isNull(r.trd_unit_qty())) {
						r.trd_unit_qty(yetQty);
						r.trd_unit_cd(r.base_unit_cd());
						r.trd_unit_nm(r.base_unit_nm());
						r.trd_unit_conv_base_qty(MCNumber.ONE);
						r.trd_unit_conv_qty(MCNumber.ONE);
						r.trd_unit_dec_place(r.base_unit_dec_place());
						r.trd_unit_rnd_typ(r.base_unit_rnd_typ());
					}
				}
			}
			downL.add(r);
		}
		d0.setAll(downL);
		d0.sort(_$srch01_key);
	}

	protected void editArrAct(MCList<ArrAct_RsltR> d0) {

		// 対象なし、予定検索、もしくは支給でない場合は以降の処理は行わない
		if (d0.isEmpty() || isNull(d0.get(0).arr_act_no()) || isNull(d0.get(0).loc_sppl_cd())) {
			return;
		}
		MCList<ArrAct_RsltR> downL = MCList.create(ArrAct_RsltR.class);
		for (MCList<ArrAct_RsltR> l : d0.groupList(_$srch02_key)) {
			ArrAct_RsltR r = l.get(0);

			String[] cols = null;
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				// 通常管理の場合、仕入実績は入荷に対してＮ件になるので総数を取得して設定する
				cols = new String[]{
					ArrAct_RsltR.$purc_qty, ArrAct_RsltR.$purc_act_no,
					ArrAct_RsltR.$purc_act_d_no, ArrAct_RsltR.$purc_act_io_no,
					ArrAct_RsltR.$prov_src_act_no, ArrAct_RsltR.$prov_act_no 
				};
			}
			else if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
				// 売上実績は入荷に対してＮ件になるので総数を取得して設定する
				cols = new String[]{
					ArrAct_RsltR.$sls_ret_qty, ArrAct_RsltR.$sls_act_no,
					ArrAct_RsltR.$sls_act_d_no, ArrAct_RsltR.$sls_act_io_no
				};
			}
			if (cols != null) {
				MCList<ArrAct_RsltR> lst = createArrAct_RsltL();
				for (ArrAct_RsltR rr : l) {
					if (!isNull(rr.getString(cols[1]))) {
						lst.add(rr);	// 新規伝票のみ抽出
					}
				}
				if (!lst.isEmpty()) {
					r = lst.get(0);
					r.setNumber(cols[0], nvl(l.sum(cols[0]), MCNumber.ZERO));

					if (lst.size() > 1) {
						// 仕入実績または売上実績が分割されている場合、分割フラグをオンにしてNOは表示しない
						r.split_flg(true);
						r.purc_act_no(null);
						r.purc_act_d_no(null);
						r.purc_act_io_no(null);
						r.prov_src_act_no(null);
						r.prov_act_no(null);
						r.sls_act_no(null);
						r.sls_act_d_no(null);
						r.sls_act_io_no(null);
					}
				}
				else {
					for (String s : cols) {
						r.setValue(s, null);
					}
				}
			}
			downL.add(r);
		}
		d0.setAll(downL);
		d0.sort(_$srch02_key);
	}

	/**
	 * 検索処理の下り電文を編集する
	 */
	protected void doEditDownForSrch(MCList<ArrAct_RsltR> d0) {
		for (ArrAct_RsltR r : d0) {
			if (r.sundry_itm_flg()) {
				// トランの品名、未設定の場合は諸口品マスタの品名
				r.itm_nm(nvl(nvl(r.itm_nm(), r.itm_nm_sundry()), r.itm_nm_itm()));
			}
			else {
				// 品目マスタの品名（受領Ｉ／Ｖ表記品名はロケールマスタの品名）
				r.itm_nm(r.itm_nm_itm());
				r.rcpt_iv_itm_nm(r.itm_nm_lcl());
			}
			if (isNullAnd(r.arr_act_no(), r.purc_act_d_no())) {
				MAM_ITM_R dbcR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.sno1_mng_typ(dbcR.sno1_mng_typ());
				r.sno2_mng_typ(dbcR.sno2_mng_typ());
				r.sno3_mng_typ(dbcR.sno3_mng_typ());
				r.sno4_mng_typ(dbcR.sno4_mng_typ());
			}
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				MST_PO_D_R pdR = _cachePoD.get(r.po_d_no());
				r.slo_no(pdR.slo_no());
				r.slo_d_no(pdR.slo_d_no());
				r.purc_basis_typ(pdR.purc_basis_typ());

				// 支給は対象外
				if (isNull(r.loc_sppl_cd())) {
					// 未着管理
					if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
						if (!isNull(r.purc_act_io_no())) {	// 検収済み
							MCRow dbcR =
								isNull(r.arr_act_no()) ?
										_cachePurcActIo.get(r.purc_act_io_no(), r.purc_act_io_seq()) :
									_cacheArrActPurc2.get(r.arr_act_no());
							// 仕入実績明細
							r.purc_act_no(dbcR.getStringNE("purc_act_no"));
							r.purc_act_d_no(dbcR.getStringNE("purc_act_d_no"));
							r.bd_dpt_cd(dbcR.getStringNE("bd_dpt_cd"));
							r.bd_dpt_nm(_cacheDpt.get(r.master_dt(), r.bd_dpt_cd()).dpt_nm());
							r.bd_wg_cd(dbcR.getStringNE("bd_wg_cd"));
							r.bd_wg_nm(_cacheWg.get(r.bd_wg_cd()).wg_nm());
							r.bd_itm_cd(dbcR.getStringNE("bd_itm_cd"));
							r.bd_itm_sub1(dbcR.getStringNE("bd_itm_sub1"));
							r.bd_itm_sub2(dbcR.getStringNE("bd_itm_sub2"));
							r.bd_itm_sub3(dbcR.getStringNE("bd_itm_sub3"));
							r.bd_itm_nm(_cacheItm.get(r.bd_itm_cd(), r.bd_itm_sub1(), r.bd_itm_sub2(), r.bd_itm_sub3()).itm_nm());
							r.bd_lot_no(dbcR.getStringNE("bd_lot_no"));
							r.bd_sublot_no(dbcR.getStringNE("bd_sublot_no"));
							r.bd_sno1(dbcR.getStringNE("bd_sno1"));
							r.bd_sno2(dbcR.getStringNE("bd_sno2"));
							r.bd_sno3(dbcR.getStringNE("bd_sno3"));
							r.bd_sno4(dbcR.getStringNE("bd_sno4"));
							r.bd_bp_cd(dbcR.getStringNE("bd_bp_cd"));
							r.bd_bp_nm(_cacheBpNm.get(r.bd_bp_cd()).bp_nm());
							r.bd_loc_cd(dbcR.getStringNE("bd_loc_cd"));
							r.bd_loc_nm(_cacheLoc.get(r.bd_loc_cd()).loc_nm());
							r.bd_ctg_cd(dbcR.getStringNE("bd_ctg_cd"));
							r.bd_ctg_nm(_cacheCostCtg.get(r.bd_ctg_cd()).ctg_nm());
							r.bd_oper_cd(dbcR.getStringNE("bd_oper_cd"));
							r.bd_oper_nm(_cacheOper.get(r.bd_oper_cd()).oper_nm());
							r.bd_iv_no(dbcR.getStringNE("bd_iv_no"));
							r.bd_slo_no(dbcR.getStringNE("bd_slo_no"));
							r.bd_po_no(dbcR.getStringNE("bd_po_no"));
							// 仕入実績受払
							r.purc_qty(dbcR.getNumberNE("base_unit_qty"));
						}
					}
					// 通常管理
					else {
						// 入荷あり
						if (!isNull(r.arr_act_no())) {
							MST_ARR_ACT_R aaR = MST_ARR_ACT_R.create();
							if (_cacheArrActPurc != null) {
								aaR = _cacheArrActPurc.getCache(r.arr_act_no());
								if (isNull(aaR)) {
									aaR = MST_ARR_ACT_R.create();
								}
							}
							r.purc_qty(aaR.base_unit_qty());
							MCNumber cnt = aaR.getNumberNE("cnt");
							if (isNull(cnt) ||  cnt.intValue() > 1) {
								r.purc_act_no(null);
								r.purc_act_d_no(null);
								r.purc_act_io_no(null);
								r.prov_src_act_no(null);
								r.prov_act_no(null);
								r.split_flg(!isNull(cnt));
							}
							else {
								r.purc_act_no(aaR.getStringNE("purc_act_no"));
								r.purc_act_d_no(aaR.getStringNE("purc_act_d_no"));
								r.purc_act_io_no(aaR.getStringNE("purc_act_io_no"));
								r.split_flg(false);
							}
						}
					}
				}
			}
			else if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
				MST_SLS_RET_SCHD_D_R dbcR = _cacheSlsRetSchdD.get(r.sls_ret_schd_d_no());
				r.slo_no(dbcR.slo_no());
				r.slo_d_no(dbcR.slo_d_no());
				r.sret_fr_nm(nvl(dbcR.sret_fr_nm(), r.sret_fr_nm()));
				if (!isNull(r.ret_stk_arrv_bp_cd())) {
					r.ret_stk_arrv_bp_nm(nvl(dbcR.sret_fr_nm(), r.ret_stk_arrv_bp_nm()));
				}

				if (!isNull(r.arr_act_no())) {
					MST_ARR_ACT_R aaR = MST_ARR_ACT_R.create();
					if (_cacheArrActSls != null) {
						aaR = _cacheArrActSls.getCache(r.arr_act_no());
						if (isNull(aaR)) {
							aaR = MST_ARR_ACT_R.create();
						}
					}
					r.sls_ret_qty(aaR.base_unit_qty());
					MCNumber cnt = aaR.getNumberNE("cnt");
					if (isNull(cnt) ||  cnt.intValue() > 1) {
						r.sls_act_no(null);
						r.sls_act_d_no(null);
						r.sls_act_io_no(null);
						r.split_flg(!isNull(cnt));
					}
					else {
						r.sls_act_no(aaR.getStringNE("sls_act_no"));
						r.sls_act_d_no(aaR.getStringNE("sls_act_d_no"));
						r.sls_act_io_no(aaR.getStringNE("sls_act_io_no"));
						r.split_flg(false);
					}
				}
			}
			MST_ARR_SCHD_R dbcR = _cacheArrSchdDlvSlip.get(r.arr_schd_no());
			if (!isNull(dbcR)) {
				r.ship_ex_flg(MAC_VIA_DLV_TYP.isVIA(dbcR.getStringNE("via_dlv_typ")));
			}

			// 以下の未入荷分に対しては在庫関連の情報は表示しない
			if (isNull(r.arr_act_no())) {
				if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
						|| (isNull(r.purc_act_no()) 
								&& (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())))) {
					// 売上返品、または、仕入・経費購買で仕入実績がない場合、在庫がまだないため在庫の情報はnullで表示
					r.quality_typ(null);
					r.quality_typ_nm(null);
					r.stk_id_typ(null);
					r.stk_id_typ_nm(null);
					r.stk_bp_cd(null);
					r.stk_bp_nm(null);
				}
			}
			// 進捗状況区分
			if (isNull(r.arr_schd_no())) {
				r.pr_sts_typ(MSC_PR_STS_TYP.ARR.value());
			}
			// 受領Ｉ／Ｖ表記品名
			if (!r.sppl_iv_flg()) {
				r.rcpt_iv_itm_nm(null);
			}
			// 預り
			r.cststk_flg(MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ()));
			// 棚・ロット無
			r.arr_str_ln_cd_none_flg(r.arr_str_ln_tgt_flg() && MAC_STR.isNULL_VAL(r.arr_str_ln_cd()));
			// 予定単位換算入荷数量
			if (isSame(r.trd_unit_cd(), r.schd_unit_cd())) {
				r.arr_schd_unit_qty(r.trd_unit_qty());
			}
			else {
				// 基準単位→予定時の単位に換算
				r.arr_schd_unit_qty(
					rvrsBaseUnitConv(
						r.base_unit_qty(),
						r.schd_unit_conv_base_qty(), r.schd_unit_conv_qty(),
						r.schd_unit_dec_place(), r.schd_unit_rnd_typ()));
			}
			// 仕入実績数、売上返品数
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				r.purc_qty(nvl(r.purc_qty(), MCNumber.ZERO));
				r.sls_ret_qty(null);
			}
			else if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
				r.purc_qty(null);
				r.sls_ret_qty(nvl(r.sls_ret_qty(), MCNumber.ZERO));
			}
			else {
				r.purc_qty(null);
				r.sls_ret_qty(null);
			}
			if (r.cont_fctr_flg()) {
				// 仕入有効成分係数
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !r.cststk_flg()) {
					r.purc_cont_fctr(
						calcContFctr(r.base_unit_qty(), r.purc_cont_qty(), r.cont_fctr_dec_place()));
				}
				// 標準有効成分
				r.std_cont_qty(
					convToContFctrUnit(
						r.base_unit_qty(), r.std_cont_fctr(), r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ())
				);
			}

			// 出荷計画外
			if (isNull(r.ship_act_no())) {
				r.ship_uplnd_flg(false);
			}
			// 在庫管理区分・ロット管理区分・サブロット管理区分
			if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())
				&& MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
				if (MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()) 
					|| MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())) {
					if (r.xpns_purc_flg()) {
						r.stk_mng_typ(MAC_STK_MNG_TYP.NOT_MNG.value());
						r.lot_mng_typ(MAC_LOT_MNG_TYP.NOT_MNG.value());
						r.sublot_mng_typ(MAC_SUBLOT_MNG_TYP.NOT_MNG.value());
					}
				}
			}
			
			// 同一発注先への支給では、支給は発生しないので設定されている値をクリアする
			if (MSC_PROV_SRC_SCHD_TYP.isSHIP(r.prov_src_schd_typ()) && isNull(r.dlv_slip_prov_typ())) {
				r.prov_typ(null);
				r.prov_typ_nm(null);
				r.prov_basis_typ(null);
				r.prov_basis_typ_nm(null);
				r.prov_src_schd_typ(null);
				r.prov_src_schd_typ_nm(null);
				r.prov_src_schd_no1(null);
				r.prov_src_schd_no2(null);
				r.prov_schd_no(null);
				r.prov_src_act_typ(null);
				r.prov_src_act_typ_nm(null);
				r.prov_src_act_no(null);
				r.prov_act_no(null);
			}
			
			r.temp_ap_flg(isTempAp(r.arr_act_no(), r.sppl_cd(), r.arr_ptn_typ()));
		}
	}

	/**
	 * 基準単位数量から取引単位数量に換算する<br>
	 * 換算時に余りが出る場合はnullを返却する
	 */
	protected MCNumber cnvBaseToTrdUnitQty(
		MCNumber baseUnitQty, ArrAct_RsltR rsltR,
		MCNumber convBaseQty, MCNumber convQty, MCNumber decPlace, String rndTyp) {
		// 基準単位数量→取引単位数量
		MCNumber trdUnitQty
			= rvrsBaseUnitConv(
				baseUnitQty, convBaseQty, convQty, decPlace, rndTyp);
		// 取引単位数量→基準単位数量
		MCNumber cnvQty
			= convToBaseUnit(
				trdUnitQty, convBaseQty, convQty, rsltR.base_unit_dec_place(), rsltR.base_unit_rnd_typ());
		// 基準単位数量⇔取引単位数量に換算できた場合のみ、取引単位数量を返す
		if (baseUnitQty.eq(cnvQty)) {
			return trdUnitQty;
		}
		return null;
	}
	
	protected MCNumber cnvBaseToTrdUnitQty(
			MCNumber baseUnitQty,
			MCNumber convBaseQty, MCNumber convQty, MCNumber decPlace, String rndTyp,
			MCNumber base_unit_dec_place, String base_unit_rnd_typ) {

			ArrAct_RsltR rsltR = ArrAct_RsltR.create();
			rsltR.base_unit_dec_place(base_unit_dec_place);
			rsltR.base_unit_rnd_typ(base_unit_rnd_typ);
			return cnvBaseToTrdUnitQty(	baseUnitQty, rsltR, convBaseQty, convQty, decPlace, rndTyp);
		}

	protected void initDbcCache(ArrAct_CndR cndR, MCList<ArrAct_RsltR> down) {
		initDbcCacheItm(down);
		initDbcCacheDpt(down);
		initDbcCacheWg(down);
		initDbcCacheBpNm(down);
		initDbcCacheOper(down);
		initDbcCacheCostCtg(down);
		initDbcCacheLoc(down);
		initDbcCachePoD(down);
		initDbcCacheArrSchdDlvInst(down);
		initDbcCacheArrSchdPrmsRcpt(down);
		initDbcCacheArrSchdDlvSlip(down);
		initDbcCachePurcSchd(down);
		initRcptIv4Act(down);
		initPurcAct(down);
		
		if (!cndR.prov_arrv_req_flg()) {
			// 入荷実績一覧登録のみ売上と仕入を取得
			// ※支給品着荷登録の場合、仕入はメインのSQLで取得する
			initDbcCacheSlsRetSchdD(down);
			initDbcCachePurcActIo(down);
			if (!isSame(cndR.ope(), "0")) {
				// 「登録する以外」の場合、実績を取得
				initDbcCacheArrActSls(down);
				initDbcCacheArrActPurc(down);
			}
		}
		
		if (!isSame(cndR.ope(), "0")) {
			// 未着の仕入実績を取得するDBコンテナ
			// 実績検索時に使用する。取得するカラムは「MST_PURC_ACT_IO」と同じにすること
			initDbcCacheArrActPurc2(down);
		}
	}
	protected void setValuesDbc(ArrAct_CndR upR, MCList<ArrAct_RsltR> down) {
		initDbcCache(upR, down);
		
		for (ArrAct_RsltR dtlR : down) {
			if (_cacheArrActPurc != null) {
				MST_ARR_ACT_R arrActPurcR = _cacheArrActPurc.getCache(dtlR.arr_act_no());
				if (arrActPurcR != null && !isNull(arrActPurcR.arr_act_no())) {
					dtlR.purc_act_no(arrActPurcR.getStringNE(ArrAct_RsltR.$purc_act_no));
					dtlR.purc_act_d_no(arrActPurcR.getStringNE(ArrAct_RsltR.$purc_act_d_no));
					dtlR.purc_qty(arrActPurcR.getNumberNE(ArrAct_RsltR.$base_unit_qty));
				}
			}
			
			if (_cacheArrActSls != null) {
				MST_ARR_ACT_R arrActSlsR = _cacheArrActSls.getCache(dtlR.arr_act_no());
				if (arrActSlsR != null && !isNull(arrActSlsR.arr_act_no())) {
					dtlR.sls_act_no(arrActSlsR.getStringNE(ArrAct_RsltR.$sls_act_no));
					dtlR.sls_act_d_no(arrActSlsR.getStringNE(ArrAct_RsltR.$sls_act_d_no));
					dtlR.sls_act_io_no(arrActSlsR.getStringNE(ArrAct_RsltR.$sls_act_io_no));
					dtlR.sls_ret_qty(arrActSlsR.getNumberNE(ArrAct_RsltR.$base_unit_qty));
				}
			}
			
			if (_cacheArrSchdDlvInst != null) {
				MST_ARR_SCHD_R arrSchdDlvInstR = _cacheArrSchdDlvInst.get(dtlR.arr_schd_no());
				if (!isNull(arrSchdDlvInstR.arr_schd_no())) {
					dtlR.dlv_inst_no(arrSchdDlvInstR.getStringNE("dlv_inst_no"));
					dtlR.dlv_inst_print_d_rmrks(arrSchdDlvInstR.getStringNE("dlv_inst_print_d_rmrks"));
				}
			}
			if (_cacheArrSchdPrmsRcpt != null) {
				MST_ARR_SCHD_R arrSchdPrmsRcptR = _cacheArrSchdPrmsRcpt.get(dtlR.arr_schd_no());
				if (!isNull(arrSchdPrmsRcptR.arr_schd_no())) {
					dtlR.prms_rcpt_no(arrSchdPrmsRcptR.getStringNE("prms_rcpt_no"));
					dtlR.prms_rmrks(arrSchdPrmsRcptR.getStringNE("prms_rmrks"));
				}
			}
			
			if (_cacheArrSchdDlvSlip != null) {
				MST_ARR_SCHD_R arrSchdDlvSlipR = _cacheArrSchdDlvSlip.get(dtlR.arr_schd_no());
				if (!isNull(arrSchdDlvSlipR.arr_schd_no())) {
					dtlR.ship_act_no(arrSchdDlvSlipR.getStringNE("dlv_slip_act_no"));
					dtlR.ship_lg_grp_cd(arrSchdDlvSlipR.getStringNE("ship_fr_lg_grp_cd"));
					dtlR.ship_wg_cd(arrSchdDlvSlipR.getStringNE("wg_cd"));
					dtlR.ship_uplnd_flg(MCBooleanUtil.dbStringToBoolean(arrSchdDlvSlipR.getStringNE("uplnd_flg")));
					dtlR.dlv_slip_prov_typ(arrSchdDlvSlipR.getStringNE(ArrAct_RsltR.$prov_typ));
				}
			}
			
			if (_cacheRcptIv4Act != null) {
				MCList<MST_RCPT_IV_D_R> rcptIvL = getRcptIv4ActL(dtlR.arr_act_no());
				if (rcptIvL.size() > 1) {
					dtlR.rcpt_iv_multi_flg(true);
				}
				else if (rcptIvL.size() == 1) {
					MST_RCPT_IV_D_R rcptIvR = rcptIvL.get(0);
					if (!isNullOrNullVal(rcptIvR.getStringNE("temp_rcpt_iv_no"))) {
						dtlR.rcpt_iv_no(rcptIvR.getStringNE("temp_rcpt_iv_no"));
						dtlR.rcpt_iv_temp_ent_flg(true);
					}
					else {
						dtlR.rcpt_iv_no(rcptIvR.getStringNE(MST_RCPT_IV_R.$rcpt_iv_no));
						dtlR.rcpt_iv_mng_no(rcptIvR.rcpt_iv_mng_no());
						dtlR.rcpt_iv_d_no(rcptIvR.rcpt_iv_d_no());
					}
				}
				else if (!isNull(dtlR.purc_schd_no())) {
					if (_cachePurcSchd != null) {
						MST_PURC_SCHD_R purcSchdR = _cachePurcSchd.get(dtlR.purc_schd_no());
						if (!isNull(purcSchdR.purc_schd_no())
							&& MSC_RCPT_IV_SRC_TYP.isARR_SCHD(purcSchdR.getStringNE("rcpt_iv_src_typ"))) {
							dtlR.rcpt_iv_no(purcSchdR.getStringNE(ArrAct_RsltR.$rcpt_iv_no));
							dtlR.rcpt_iv_mng_no(purcSchdR.getStringNE(ArrAct_RsltR.$rcpt_iv_mng_no));
							dtlR.rcpt_iv_d_no(purcSchdR.getStringNE(ArrAct_RsltR.$rcpt_iv_d_no));
						}
					}
				}
				else if (!isNull(dtlR.purc_act_d_no())) {
					// 計画外の仕入
					MST_PURC_ACT_R purcActR = getPurcAct(dtlR.arr_act_no());
					if (!isNull(purcActR)) {
						dtlR.rcpt_iv_no(purcActR.rcpt_iv_no());
						dtlR.rcpt_iv_mng_no(purcActR.rcpt_iv_mng_no());
						dtlR.rcpt_iv_d_no(purcActR.getStringNE(MST_PURC_ACT_D_R.$rcpt_iv_d_no));
					}
				}
			}
			
			if (_cachePoD != null) {
				MST_PO_D_R poDR = _cachePoD.get(dtlR.po_d_no());
				if (!isNull(poDR.po_d_no())) {
					dtlR.itm_nm_lcl(poDR.itm_cd());
					dtlR.bd_dpt_cd(poDR.bd_dpt_cd());
					dtlR.bd_wg_cd(poDR.bd_wg_cd());
					dtlR.bd_itm_cd(poDR.bd_itm_cd());
					dtlR.bd_itm_sub1(poDR.bd_itm_sub1());
					dtlR.bd_itm_sub2(poDR.bd_itm_sub2());
					dtlR.bd_itm_sub3(poDR.bd_itm_sub3());
					dtlR.bd_lot_no(poDR.bd_lot_no());
					dtlR.bd_sublot_no(poDR.bd_sublot_no());
					dtlR.bd_sno1(poDR.bd_sno1());
					dtlR.bd_sno2(poDR.bd_sno2());
					dtlR.bd_sno3(poDR.bd_sno3());
					dtlR.bd_sno4(poDR.bd_sno4());
					dtlR.bd_bp_cd(poDR.bd_bp_cd());
					dtlR.bd_loc_cd(poDR.bd_loc_cd());
					dtlR.bd_ctg_cd(poDR.bd_ctg_cd());
					dtlR.bd_oper_cd(poDR.bd_oper_cd());
					dtlR.bd_iv_no(poDR.bd_iv_no());
					dtlR.bd_slo_no(poDR.bd_slo_no());
					dtlR.bd_po_no(poDR.bd_po_no());
					dtlR.purc_rqst_wg_cd(poDR.getStringNE(ArrAct_RsltR.$rqst_wg_cd));
					dtlR.purc_rqst_wg_nm(poDR.getStringNE("wg_nm"));
					dtlR.po_schd_src_typ(poDR.getStringNE(ArrAct_RsltR.$po_schd_src_typ));
					dtlR.po_schd_src_no(poDR.getStringNE(ArrAct_RsltR.$po_schd_src_no));
					dtlR.po_no(poDR.po_no());
					dtlR.po_schd_no(poDR.getStringNE(ArrAct_RsltR.$po_schd_no));
				}
			}
			
			if (_cachePurcActIo != null) {
				MST_PURC_ACT_IO_R purcActIoR = _cachePurcActIo.get(dtlR.purc_act_io_no(),
						dtlR.purc_act_io_seq());
				if (!isNull(purcActIoR.purc_act_io_no())) {
					dtlR.purc_act_io_no(purcActIoR.purc_act_io_no());
				}
			}
		}
		
		setValuesDbc(MSBEL5930_ArrAct_RsltR_J01(), upR, down);
	}
	protected FXUCL_MCDbcCache<MST_ARR_ACT_R> _cacheArrActPurc2;
	protected void initDbcCacheArrActPurc2(MCList<ArrAct_RsltR> down) {
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
		MST_PURC_ACT_IO_R t1 = MST_PURC_ACT_IO_R.create("T1");
		MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_R t3 = MST_PURC_ACT_R.create("T3");
		MCQueryApiBuilder arrActPurc2_bldr = MCQueryApiBuilder.create(t);

		arrActPurc2_bldr.setSelect(t.arr_act_no, t1.purc_act_io_no);
		arrActPurc2_bldr.addInnerJoin(t1,
				bracket(t1.purc_act_io_no.eq(t.purc_act_io_no)));
		arrActPurc2_bldr.addInnerJoin(t2, bracket(t2.purc_act_d_no.eq(t1.purc_act_d_no)
				.and(t2.purc_act_d_seq.eq(t1.purc_act_d_seq))));
		arrActPurc2_bldr.addInnerJoin(t3,
				bracket(t3.purc_act_no.eq(t2.purc_act_no)
						.and(t3.purc_act_seq.eq(t2.purc_act_seq))
						.and(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		arrActPurc2_bldr.addSelect(t.base_unit_qty, t2.purc_act_no, t2.purc_act_d_no,
				t2.bd_dpt_cd, t2.bd_wg_cd, t2.bd_itm_cd, t2.bd_itm_sub1, t2.bd_itm_sub2,
				t2.bd_itm_sub3, t2.bd_lot_no, t2.bd_sublot_no, t2.bd_sno1, t2.bd_sno2,
				t2.bd_sno3, t2.bd_sno4, t2.bd_bp_cd, t2.bd_loc_cd, t2.bd_ctg_cd,
				t2.bd_oper_cd, t2.bd_iv_no, t2.bd_slo_no, t2.bd_po_no);
		
		_cacheArrActPurc2 = new FXUCL_MCDbcCache<MST_ARR_ACT_R>(arrActPurc2_bldr, down,
				ArrAct_RsltR.$arr_act_no);
	}
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
	protected void initDbcCacheItm(MCList<ArrAct_RsltR> down) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
		
		itm_bldr.setSelect(t.itm_nm);
		itm_bldr.addSelect(t.sno1_mng_typ, t.sno2_mng_typ, t.sno3_mng_typ, t.sno4_mng_typ);
		
		MCList<MAM_ITM_R> bindL = MCList.create(MAM_ITM_R.class);
		for (ArrAct_RsltR r : down) {
			MAM_ITM_R bind1R = MAM_ITM_R.create();
			bind1R.itm_cd(r.itm_cd());
			bind1R.itm_sub1(r.itm_sub1());
			bind1R.itm_sub2(r.itm_sub2());
			bind1R.itm_sub3(r.itm_sub3());
			bindL.add(bind1R);
			if (!isNull(r.bd_itm_cd())) {
				MAM_ITM_R bind2R = MAM_ITM_R.create();
				bind2R.itm_cd(r.bd_itm_cd());
				bind2R.itm_sub1(r.bd_itm_sub1());
				bind2R.itm_sub2(r.bd_itm_sub2());
				bind2R.itm_sub3(r.bd_itm_sub3());
				bindL.add(bind2R);
			}
		}
		_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itm_bldr, bindL, MAM_ITM_R.$itm_cd,
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;
	protected void initDbcCacheDpt(MCList<ArrAct_RsltR> down) {
		MAM_DPT_R t = MAM_DPT_R.create("T");
		MCQueryApiBuilder dpt_bldr = MCQueryApiBuilder.create(t);
		
		dpt_bldr.setSelect(t.dpt_nm);
		
		_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dpt_bldr, down, ArrAct_RsltR.$bd_dpt_cd);
	}
	protected FXUCL_MCDbcCache<MAM_WG_R> _cacheWg;
	protected void initDbcCacheWg(MCList<ArrAct_RsltR> down) {
		MAM_WG_R t = MAM_WG_R.create("T");
		MCQueryApiBuilder wg_bldr = MCQueryApiBuilder.create(t);
		
		wg_bldr.setSelect(t.wg_nm);
		
		_cacheWg = new FXUCL_MCDbcCache<MAM_WG_R>(wg_bldr, down, ArrAct_RsltR.$bd_wg_cd);
	}
	protected FXUCL_MCDbcCache<MAVM_BP_NM_R> _cacheBpNm;
	protected void initDbcCacheBpNm(MCList<ArrAct_RsltR> down) {
		MAVM_BP_NM_R t = MAVM_BP_NM_R.create("T");
		MCQueryApiBuilder bpNm_bldr = MCQueryApiBuilder.create(t);
		
		bpNm_bldr.setSelect(t.bp_nm);
		
		_cacheBpNm = new FXUCL_MCDbcCache<MAVM_BP_NM_R>(bpNm_bldr, down, ArrAct_RsltR.$bd_bp_cd);
	}
	protected FXUCL_MCDbcCache<MAM_OPER_R> _cacheOper;
	protected void initDbcCacheOper(MCList<ArrAct_RsltR> down) {
		MAM_OPER_R t = MAM_OPER_R.create("T");
		MCQueryApiBuilder oper_bldr = MCQueryApiBuilder.create(t);
		
		oper_bldr.setSelect(t.oper_nm);
		
		_cacheOper = new FXUCL_MCDbcCache<MAM_OPER_R>(oper_bldr, down, ArrAct_RsltR.$bd_oper_cd);
	}
	protected FXUCL_MCDbcCache<MAM_COST_CTG_R> _cacheCostCtg;
	protected void initDbcCacheCostCtg(MCList<ArrAct_RsltR> down) {
		MAM_COST_CTG_R t = MAM_COST_CTG_R.create("T");
		MCQueryApiBuilder costCtg_bldr = MCQueryApiBuilder.create(t);
		
		costCtg_bldr.setSelect(t.ctg_nm);
		
		_cacheCostCtg = new FXUCL_MCDbcCache<MAM_COST_CTG_R>(costCtg_bldr, down, ArrAct_RsltR.$bd_ctg_cd);
	}
	protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc;
	protected void initDbcCacheLoc(MCList<ArrAct_RsltR> down) {
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder loc_bldr = MCQueryApiBuilder.create(t);
		
		loc_bldr.setSelect(t.loc_nm);
		
		_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(loc_bldr, down, ArrAct_RsltR.$bd_loc_cd);
	}
	protected FXUCL_MCDbcCache<MST_SLS_RET_SCHD_D_R> _cacheSlsRetSchdD;
	protected void initDbcCacheSlsRetSchdD(MCList<? extends MCConstRow> down) {
		MST_SLS_RET_SCHD_D_R t = MST_SLS_RET_SCHD_D_R.create("T");
		MCQueryApiBuilder slsRetSchdD_bldr = MCQueryApiBuilder.create(t);
		
		slsRetSchdD_bldr.setSelect(t.slo_no);
		slsRetSchdD_bldr.addSelect(t.slo_d_no);
		slsRetSchdD_bldr.addSelect(t.sret_fr_nm);
		
		_cacheSlsRetSchdD = new FXUCL_MCDbcCache<MST_SLS_RET_SCHD_D_R>(slsRetSchdD_bldr, down, ArrAct_RsltR.$sls_ret_schd_d_no);
	}
	protected FXUCL_MCDbcCache<MST_PO_D_R> _cachePoD;
	protected void initDbcCachePoD(MCList<ArrAct_RsltR> down) {
		MST_PO_D_R t = MST_PO_D_R.create("T");
		MST_PO_R t2 = MST_PO_R.create("T2");
		MST_PO_SCHD_R t3 = MST_PO_SCHD_R.create("T3");
		MAM_WG_R m2 = MAM_WG_R.create("M2");
		MAM_BP_R m3 = MAM_BP_R.create("M3");
		MAM_ITM_LCL_R m4 = MAM_ITM_LCL_R.create("M4");
		MCQueryApiBuilder poD_bldr = MCQueryApiBuilder.create(t);
		
		poD_bldr.setSelect(m4.itm_nm, t.bd_dpt_cd, t.bd_wg_cd, t.bd_itm_cd, t.bd_itm_sub1,
				t.bd_itm_sub2, t.bd_itm_sub3, t.bd_lot_no, t.bd_sublot_no, t.bd_sno1,
				t.bd_sno2, t.bd_sno3, t.bd_sno4, t.bd_bp_cd, t.bd_loc_cd, t.bd_ctg_cd,
				t.bd_oper_cd, t.bd_iv_no, t.bd_slo_no, t.bd_po_no, t3.rqst_wg_cd,
				m2.wg_nm, t3.po_schd_src_typ, t3.po_schd_src_no, t.po_no, t3.po_schd_no,
				t.po_d_no, t.purc_basis_typ);
		poD_bldr.addSelect(t.slo_no, t.slo_d_no);
		poD_bldr.addInnerJoin(t2, bracket(t2.po_no.eq(t.po_no)));
		poD_bldr.addLeftOuterJoin(t3, bracket(t3.po_schd_no.eq(t.po_schd_no)));
		poD_bldr.addLeftOuterJoin(m2, bracket(m2.wg_cd.eq(t3.rqst_wg_cd)));
		poD_bldr.addLeftOuterJoin(m3, bracket(m3.bp_cd.eq(t2.sppl_cd)));
		poD_bldr.addLeftOuterJoin(m4, bracket(m4.itm_cd.eq(t.itm_cd)
				.and(m4.itm_sub1.eq(t.itm_sub1))
				.and(m4.itm_sub2.eq(t.itm_sub2))
				.and(m4.itm_sub3.eq(t.itm_sub3))
				.and(m4.lcl_cd.eq(m3.prnt_lcl_cd))));
		
		_cachePoD = new FXUCL_MCDbcCache<MST_PO_D_R>(poD_bldr, down, ArrAct_RsltR.$po_d_no);
	}
	protected FXUCL_Cache<MST_ARR_ACT_R> _cacheArrActPurc;
	protected void initDbcCacheArrActPurc(MCList<ArrAct_RsltR> down) {
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
		MST_PURC_ACT_IO_R t2 = MST_PURC_ACT_IO_R.create("T2");
		MST_PURC_ACT_D_R t3 = MST_PURC_ACT_D_R.create("T3");
		MST_PURC_ACT_R t4 = MST_PURC_ACT_R.create("T4");
		MCQueryApiBuilder arrActPurc_bldr = MCQueryApiBuilder.create(t);
		
		arrActPurc_bldr.setGroupBy(t.arr_act_no);
		arrActPurc_bldr.addGroupFunc(sum(t2.base_unit_qty), "base_unit_qty");
		arrActPurc_bldr.addGroupFunc(max(t2.purc_act_io_no), "purc_act_io_no");
		arrActPurc_bldr.addGroupFunc(max(t3.purc_act_d_no), "purc_act_d_no");
		arrActPurc_bldr.addGroupFunc(max(t4.purc_act_no), "purc_act_no");
		arrActPurc_bldr.addGroupFunc(count(t.arr_act_no), "cnt");
		arrActPurc_bldr.addInnerJoin(t2, bracket(t2.arr_act_no.eq(t.arr_act_no)));
		arrActPurc_bldr.addInnerJoin(t3, bracket(t3.purc_act_d_no.eq(t2.purc_act_d_no)
				.and(t3.purc_act_d_seq.eq(t2.purc_act_d_seq))));
		arrActPurc_bldr.addInnerJoin(t4,
				bracket(t4.purc_act_no.eq(t3.purc_act_no)
						.and(t4.purc_act_seq.eq(t3.purc_act_seq))
						.and(t4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		
		MCList<MST_ARR_ACT_R> rslt = MCList.create(MST_ARR_ACT_R.class);
		dbSelectKey("MSBEL5930_MST_ARR_ACT_S01", rslt, arrActPurc_bldr, down);
		
		if (!rslt.isEmpty()) {
			_cacheArrActPurc = new FXUCL_Cache<MST_ARR_ACT_R>();
			_cacheArrActPurc.setFixMaxCacheSize(-1);
			for (MST_ARR_ACT_R r : rslt) {
				_cacheArrActPurc.putCache(new String[]{r.arr_act_no()}, r);
			}
		}
	}
	protected FXUCL_Cache<MST_ARR_ACT_R> _cacheArrActSls;
	protected void initDbcCacheArrActSls(MCList<ArrAct_RsltR> down) {
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
		MST_SLS_ACT_IO_R t2 = MST_SLS_ACT_IO_R.create("T2");
		MST_SLS_ACT_D_R t3 = MST_SLS_ACT_D_R.create("T3");
		MST_SLS_ACT_R t4 = MST_SLS_ACT_R.create("T4");
		MCQueryApiBuilder arrActSls_bldr = MCQueryApiBuilder.create(t);
		
		arrActSls_bldr.setGroupBy(t.arr_act_no);
		arrActSls_bldr.addGroupFunc(sum(t2.base_unit_qty), "base_unit_qty");
		arrActSls_bldr.addGroupFunc(max(t2.sls_act_io_no), "sls_act_io_no");
		arrActSls_bldr.addGroupFunc(max(t3.sls_act_d_no), "sls_act_d_no");
		arrActSls_bldr.addGroupFunc(max(t4.sls_act_no), "sls_act_no");
		arrActSls_bldr.addGroupFunc(count(t.arr_act_no), "cnt");
		arrActSls_bldr.addInnerJoin(t2, bracket(t2.arr_act_no.eq(t.arr_act_no)));
		arrActSls_bldr.addInnerJoin(t3, bracket(t3.sls_act_d_no.eq(t2.sls_act_d_no)
				.and(t3.sls_act_d_seq.eq(t2.sls_act_d_seq))));
		arrActSls_bldr.addInnerJoin(t4,
				bracket(t4.sls_act_no.eq(t3.sls_act_no)
						.and(t4.sls_act_seq.eq(t3.sls_act_seq))
						.and(t4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		
		MCList<MST_ARR_ACT_R> rslt = MCList.create(MST_ARR_ACT_R.class);
		dbSelectKey("MSBEL5930_MST_ARR_ACT_S02", rslt, arrActSls_bldr, down);
		
		if (!rslt.isEmpty()) {
			_cacheArrActSls = new FXUCL_Cache<MST_ARR_ACT_R>();
			_cacheArrActSls.setFixMaxCacheSize(-1);
			for (MST_ARR_ACT_R r : rslt) {
				_cacheArrActSls.putCache(new String[]{r.arr_act_no()}, r);
			}
		}
	}
	protected FXUCL_MCDbcCache<MST_PURC_ACT_IO_R> _cachePurcActIo;
	protected void initDbcCachePurcActIo(MCList<ArrAct_RsltR> down) {
		MST_PURC_ACT_IO_R t = MST_PURC_ACT_IO_R.create("T");
		MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_R t3 = MST_PURC_ACT_R.create("T3");
		MCQueryApiBuilder purcActIo_bldr = MCQueryApiBuilder.create(t);

		purcActIo_bldr.setSelect(t.purc_act_io_no);
		purcActIo_bldr.addSelect(t.base_unit_qty, t2.purc_act_no, t2.purc_act_d_no,
				t2.bd_dpt_cd, t2.bd_wg_cd, t2.bd_itm_cd, t2.bd_itm_sub1, t2.bd_itm_sub2,
				t2.bd_itm_sub3, t2.bd_lot_no, t2.bd_sublot_no, t2.bd_sno1, t2.bd_sno2,
				t2.bd_sno3, t2.bd_sno4, t2.bd_bp_cd, t2.bd_loc_cd, t2.bd_ctg_cd,
				t2.bd_oper_cd, t2.bd_iv_no, t2.bd_slo_no, t2.bd_po_no);
		purcActIo_bldr.addInnerJoin(t2, bracket(t2.purc_act_d_no.eq(t.purc_act_d_no)
				.and(t2.purc_act_d_seq.eq(t.purc_act_d_seq))));
		purcActIo_bldr.addInnerJoin(t3,
				bracket(t3.purc_act_no.eq(t2.purc_act_no)
						.and(t3.purc_act_seq.eq(t2.purc_act_seq))
						.and(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		
		_cachePurcActIo = new FXUCL_MCDbcCache<MST_PURC_ACT_IO_R>(purcActIo_bldr, down,
				ArrAct_RsltR.$purc_act_io_no, ArrAct_RsltR.$purc_act_io_seq);
	}
	protected FXUCL_MCDbcCache<MST_ARR_SCHD_R> _cacheArrSchdDlvSlip;
	protected void initDbcCacheArrSchdDlvSlip(MCList<ArrAct_RsltR> down) {
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
		MST_DLV_SLIP_R t3 = MST_DLV_SLIP_R.create("T3");
		MST_DLV_SLIP_D_R t4 = MST_DLV_SLIP_D_R.create("T4");
		MST_SHIP_ACT_R t5 = MST_SHIP_ACT_R.create("T5");
		MCQueryApiBuilder arrSchdDlvSlip_bldr = MCQueryApiBuilder.create(t);
		
		arrSchdDlvSlip_bldr.setSelect(t.arr_schd_no, t3.dlv_slip_act_no,
				t3.ship_fr_lg_grp_cd, t3.wg_cd, t5.uplnd_flg, t4.prov_typ);
		arrSchdDlvSlip_bldr.addSelect(t5.via_dlv_typ);
		arrSchdDlvSlip_bldr.addInnerJoin(t2, bracket(t2.arr_pr_no.eq(t.arr_pr_no)));
		arrSchdDlvSlip_bldr.addInnerJoin(t3, bracket(t3.dlv_slip_no.eq(t.dlv_slip_no)
				.and(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
				.and(t.dlv_slip_mng_no.isNull()))));
		arrSchdDlvSlip_bldr.addLeftOuterJoin(t4,
				bracket(t4.dlv_slip_no.eq(t3.dlv_slip_no)
						.and(t4.dlv_slip_seq.eq(t3.dlv_slip_seq))
						.and(t4.dlv_slip_d_no.eq(t2.dlv_slip_d_no))));
		arrSchdDlvSlip_bldr.addLeftOuterJoin(t5,
				bracket(t5.ship_act_no.eq(t3.dlv_slip_act_no)));
		
		_cacheArrSchdDlvSlip = new FXUCL_MCDbcCache<MST_ARR_SCHD_R>(arrSchdDlvSlip_bldr,
				down, ArrAct_RsltR.$arr_schd_no);
	}
	
	protected FXUCL_MCDbcCache<MST_ARR_SCHD_R> _cacheArrSchdDlvInst;
	protected void initDbcCacheArrSchdDlvInst(MCList<ArrAct_RsltR> down) {
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
		MST_DLV_INST_D_R t3 = MST_DLV_INST_D_R.create("T3");
		MCQueryApiBuilder arrSchdDlvInst_bldr = MCQueryApiBuilder.create(t);
		
		arrSchdDlvInst_bldr.setSelect(t.arr_schd_no, t3.dlv_inst_no, t3.dlv_inst_print_d_rmrks);
		arrSchdDlvInst_bldr.addInnerJoin(t2, bracket(t2.arr_pr_no.eq(t.arr_pr_no)));
		arrSchdDlvInst_bldr.addInnerJoin(t3, bracket(t3.dlv_inst_d_no.eq(t.dlv_inst_d_no)));
		
		_cacheArrSchdDlvInst = new FXUCL_MCDbcCache<MST_ARR_SCHD_R>(arrSchdDlvInst_bldr,
				down, ArrAct_RsltR.$arr_schd_no);
	}
	
	protected FXUCL_MCDbcCache<MST_ARR_SCHD_R> _cacheArrSchdPrmsRcpt;
	protected void initDbcCacheArrSchdPrmsRcpt(MCList<ArrAct_RsltR> down) {
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
		MST_PRMS_RCPT_D_R t3 = MST_PRMS_RCPT_D_R.create("T3");
		MCQueryApiBuilder arrSchdPrmsRcpt_bldr = MCQueryApiBuilder.create(t);
		
		arrSchdPrmsRcpt_bldr.setSelect(t.arr_schd_no, t3.prms_rcpt_no, t3.prms_rmrks);
		arrSchdPrmsRcpt_bldr.addInnerJoin(t2, bracket(t2.arr_pr_no.eq(t.arr_pr_no)));
		arrSchdPrmsRcpt_bldr.addInnerJoin(t3, bracket(t3.prms_rcpt_d_no.eq(t.prms_rcpt_d_no)));
		
		_cacheArrSchdPrmsRcpt = new FXUCL_MCDbcCache<MST_ARR_SCHD_R>(arrSchdPrmsRcpt_bldr,
				down, ArrAct_RsltR.$arr_schd_no);
	}
	protected FXUCL_MCDbcCache<MST_PURC_SCHD_R> _cachePurcSchd;
	protected void initDbcCachePurcSchd(MCList<ArrAct_RsltR> down) {
		MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
		MST_RCPT_IV_D_R t2 = MST_RCPT_IV_D_R.create("T2");
		MST_RCPT_IV_R t3 = MST_RCPT_IV_R.create("T3");
		MCQueryApiBuilder purcSchd_bldr = MCQueryApiBuilder.create(t);
		
		purcSchd_bldr.setSelect(
			t.purc_schd_no, t2.rcpt_iv_d_no,
			t3.rcpt_iv_no, t2.rcpt_iv_mng_no, t3.rcpt_iv_src_typ);
		purcSchd_bldr.addInnerJoin(t2, bracket(t2.purc_schd_no.eq(t.purc_schd_no)));
		purcSchd_bldr.addInnerJoin(t3, bracket(t3.rcpt_iv_mng_no.eq(t2.rcpt_iv_mng_no)));
		
		_cachePurcSchd = new FXUCL_MCDbcCache<MST_PURC_SCHD_R>(purcSchd_bldr,
				down, ArrAct_RsltR.$purc_schd_no);
	}
	
	MCList<MST_PURC_ACT_R> _cachePurcAct;
	MCIndexKey _cachePurcActKey;
	protected void initPurcAct(MCList<? extends MCRow> down) {
		MCList<MST_PURC_ACT_R> dbc = MCList.create(MST_PURC_ACT_R.class);
		MST_PURC_ACT_R t = MST_PURC_ACT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_IO_R t3 = MST_PURC_ACT_IO_R.create("T3");

		dbc.addStringColumn("arr_act_no");
		dbc.addBooleanColumn("temp_ap_flg");
		dbc.addStringColumn("rcpt_iv_d_no");
		dbc_bldr.setSelect(t3.arr_act_no, t.temp_ap_use_flg, t2.temp_ap_flg);
		dbc_bldr.addSelect(t.rcpt_iv_no, t.rcpt_iv_mng_no, t2.rcpt_iv_d_no);
		dbc_bldr.addInnerJoin(t2, bracket(t.purc_act_no.eq(t2.purc_act_no)
				.and(t.purc_act_seq.eq(t2.purc_act_seq))));
		dbc_bldr.addInnerJoin(t3, bracket(t2.purc_act_d_no.eq(t3.purc_act_d_no)
				.and(t2.purc_act_d_seq.eq(t3.purc_act_d_seq))));
		dbc_bldr.setWhere(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		dbc_bldr.addWhereWithAnd(t3.arr_act_no.eq(bind("arr_act_no")));
		dbSelect("MSBEL5930_MST_PURC_ACT_S01", dbc, dbc_bldr, down);

		object(CLAZZ)._cachePurcAct = dbc;
		object(CLAZZ)._cachePurcActKey = object(CLAZZ)._cachePurcAct.createIndex("arr_act_no");
	}
	protected MST_PURC_ACT_R getPurcAct(String arrActNo) {
		return object(CLAZZ)._cachePurcAct.getFirst(object(CLAZZ)._cachePurcActKey, arrActNo);
	}
	protected MCList<MST_RCPT_IV_D_R> _cacheRcptIv4Act;
	protected MCIndexKey _cacheRcptIv4ActKey;
	protected void initRcptIv4Act(MCList<? extends MCRow> down) {
		// 引数の down は項目に arr_act_no をもつリスト
		MST_RCPT_IV_MAP_R t1 = MST_RCPT_IV_MAP_R.create("T1");
		MST_RCPT_IV_D_R t2 = MST_RCPT_IV_D_R.create("T2");
		MST_RCPT_IV_R t3 = MST_RCPT_IV_R.create("T3");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
		
		bldr.setSelect(
			t1.arr_act_no, t1.rcpt_iv_no.as("temp_rcpt_iv_no"),
			t1.rcpt_iv_d_no, t3.rcpt_iv_mng_no, t3.rcpt_iv_no
		);
		
		bldr.addLeftOuterJoin(t2, t2.rcpt_iv_d_no.eq(t1.rcpt_iv_d_no));
		bldr.addLeftOuterJoin(t3, t3.rcpt_iv_mng_no.eq(t2.rcpt_iv_mng_no));
		bldr.setWhere(t1.arr_act_no.eq(bind("arr_act_no")));
		
		_cacheRcptIv4Act = MCList.create(MST_RCPT_IV_D_R.class);
		dbSelect("MSBEL5930_MST_RCPT_IV_MAP_S01", _cacheRcptIv4Act, bldr, down);
		
		_cacheRcptIv4ActKey = _cacheRcptIv4Act.createIndex("arr_act_no");
	}
	protected MCList<MST_RCPT_IV_D_R> getRcptIv4ActL(String arrActNo) {
		// 入荷実績は複数の受領インボイスに割り当て可能
		return _cacheRcptIv4Act.subList(_cacheRcptIv4ActKey, arrActNo);
	}
	
	// ///////////////////////////////////////////////
	// 検索処理共通（ここまで）
	// ///////////////////////////////////////////////



	// ///////////////////////////////////////////////
	// チェック処理共通（ここから）
	// ///////////////////////////////////////////////

	/**
	 * 新規行と更新行の共通の固有チェック
	 * @param list
	 */
	protected void doCheckCommon(MCList<ArrAct_DtlR> list) {
		MCMessageList msgL = new MCMessageList();
		
		MCIndexKey
			schdKey = list.createIndex(ArrAct_DtlR.$arr_schd_no);

		// 発注先がインボイス取引対象の場合の数量チェック用
		MCList<MST_ARR_SCHD_R> tmpArrSchdL = MCList.create(MST_ARR_SCHD_R.class);
		MST_ARR_SCHD_R t1 = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder tmpArrSchdL_bldr = MCQueryApiBuilder.create(t1);
		dbWkDelete("MSBEL5930_MSW_ARR_SCHD_D01", tmpArrSchdL_bldr.getBaseDbc());
		MCList<MST_ARR_ACT_R> tmpArrActL = MCList.create(MST_ARR_ACT_R.class);
		MCQueryApiBuilder tmpArrActL_bldr = MCQueryApiBuilder.create(MST_ARR_ACT_R.create("T"));
		dbWkDelete("MSBEL5930_MSW_ARR_ACT_D01", tmpArrActL_bldr.getBaseDbc());
		for (ArrAct_DtlR r : list) {
			// 「仕入」「経費購買」
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				MAM_BP_R bpR = getBpR(r.sppl_cd());
				if (bpR.sppl_iv_flg()) {
					MST_ARR_SCHD_R arrSchdR = MST_ARR_SCHD_R.create();
					arrSchdR.arr_schd_no(r.arr_schd_no());
					tmpArrSchdL.add(arrSchdR);
					
					if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						MST_ARR_ACT_R arrActR = MST_ARR_ACT_R.create();
						arrActR.arr_act_no(r.arr_act_no());
						tmpArrActL.add(arrActR);
					}
				}
			}
		}
		MSW_ARR_SCHD_KEY_R t2 = MSW_ARR_SCHD_KEY_R.create("T2");
		MSW_ARR_ACT_KEY_R S1T_T1 = MSW_ARR_ACT_KEY_R.create("T_T1");
		MCList<MST_ARR_ACT_R> arrActL = MCList.create(MST_ARR_ACT_R.class);
		MST_ARR_ACT_R t4 = MST_ARR_ACT_R.create("T");
		MCQueryApiBuilder arrActL_bldr = MCQueryApiBuilder.create(t4);
		if (!tmpArrSchdL.isEmpty()) {
			MCList<MST_ARR_SCHD_R> tmpArrSchdL2 = tmpArrSchdL.groupBy(MST_ARR_SCHD_R.$arr_schd_no);
			MCQueryApiBuilder tmpArrSchdL2_bldr = MCQueryApiBuilder.create(t1);
			dbWkInsert("MSBEL5930_MSW_ARR_SCHD_I01", tmpArrSchdL2, tmpArrSchdL2_bldr.getBaseDbc());
			if (!tmpArrActL.isEmpty()) {
				dbWkInsert("MSBEL5930_MSW_ARR_ACT_I01", tmpArrActL, tmpArrActL_bldr.getBaseDbc());
			}
			
			arrActL_bldr.setSelect(t4.arr_act_no, t4.arr_schd_no, t4.base_unit_qty);
			arrActL_bldr.addInnerJoin(t2, bracket( t2.arr_schd_no.eq(t4.arr_schd_no)));
			arrActL_bldr.setWhere(notExists( subQuery() .select(nullValue()) .from(S1T_T1) .where( S1T_T1.arr_act_no.eq(t4.arr_act_no) )));
			arrActL_bldr.addWhereWithAnd(t4.can_flg.eq(value(false)));
			dbSelect("MSBEL5930_MST_ARR_ACT_S03", arrActL, arrActL_bldr);
		}
		MCIndexKey arrActKey = arrActL.createIndex(MST_ARR_ACT_R.$arr_schd_no);
		
		for (ArrAct_DtlR r : list) {
			if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				continue;
			}

			MAM_LOC_R locR = getLocR(r.arr_loc_cd());
			MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());

			// 計画外
			if (isNull(r.arr_schd_no())) {
				if ( !(!r.purc_act_chk_flg() || !r.sls_ret_chk_flg()) ) {
					// 入荷実績一覧登録から実行された場合のみチェックする
					if ( !(MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) ) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0111, r.trd_cd(), r.trd_ptn_typ(), toDispGUIIndex(r)));
					}
					if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !isNull(r.purc_id_typ())) {
						MAM_BP_R bpR = getBpR(r.sppl_cd());
						if (bpR.sppl_iv_flg()) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBEL0113, r.sppl_cd(), toDispGUIIndex(r)));
						}
					}
				}
				if ((MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ()))
					&& !MAC_QUALITY_TYP.isGOOD(r.quality_typ())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL0112, toDispGUIIndex(r)));
				}
			}
			// 経費購買の場合、マスタ上在庫品でも非在庫として扱うことがある
			// よって、ロット管理対象だけでなく、トランの在庫管理区分も条件に追加する
			if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ()) && isNull(r.lot_no()) && !r.crt_lot_flg()) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL0001, toDispGUIIndex(r)));
				}
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ()) && isNull(r.sublot_no()) && !r.crt_lot_flg() && !isCrtSublot(r)) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL0002, toDispGUIIndex(r)));
				}
			}
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				if (itmR.bp_lot_flg() && isNull(r.bp_lot_no())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL0003, toDispGUIIndex(r)));
				}
				if (MSC_PURC_UNFIX_STR.isUNFIXED(r.lot_no())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL0115, toDispGUIIndex(r)));
				}
				if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ()) && r.abort_flg()) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL0116, toDispGUIIndex(r)));
				}
			}
			if (!isNull(r.arr_schd_no())) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				MST_PURC_SCHD_R psR = getPurcSchdCache(r.arr_schd_no());

				MAM_LOC_R orgLocR = getLocR(asR.arr_loc_cd());
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					orgLocR = getLocR(getArrActR(r.arr_act_no()).arr_loc_cd());
				}
				// 発注明細NOの補完
				r.po_no(asR.getString("po_no"));
				r.po_d_no(asR.getString("po_d_no"));
				MAM_LOC_R schdLocR = getLocR(asR.arr_loc_cd());
				if (!isSame(locR.sppl_cd(), schdLocR.sppl_cd())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL0008, toDispGUIIndex(r)));
				}
				// 「仕入」「経費購買」
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
					// 仕入直送の場合（外注先への直送は未着管理あり）
					if (asR.getBoolean("purc_ddlv_flg") && isNull(schdLocR.sppl_cd())
						&& MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0125, toDispGUIIndex(r)));
					}
					if (asR.outsrc_flg() && isNull(r.mfg_inst_no())) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0126, toDispGUIIndex(r)));
					}
					
					// 発注先がインボイス取引の場合、予定数量以上の入荷はできない
					MAM_BP_R bpR = getBpR(r.sppl_cd());
					if (bpR.sppl_iv_flg()) {
						MCList<ArrAct_DtlR> tmpL = list.subList(schdKey, r.arr_schd_no());
						MCNumber arrQty = MCNumber.ZERO;
						for (ArrAct_DtlR tmpR : tmpL) {
							arrQty = arrQty.add(MAC_DATA_CRUD_TYP.isDEL(tmpR.data_crud_typ()) ? tmpR.base_unit_qty().multiply(-1) : tmpR.base_unit_qty());
						}
						MCList<MST_ARR_ACT_R> tmpL2 = arrActL.subList(arrActKey, r.arr_schd_no());
						MCNumber tmpArrQty = tmpL2.sum(MST_ARR_ACT_R.$base_unit_qty);
						arrQty = arrQty.add(nvl(tmpArrQty, MCNumber.ZERO));
						
					}
				}
				// 入荷予定に対する入荷数量の合計を算出
				MCNumber actQty = asR.arr_qty();
				for (ArrAct_DtlR upR : list.subList(schdKey, r.arr_schd_no())) {
					if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
						MST_ARR_ACT_R aaR = getArrActR(upR.arr_act_no());
						actQty = actQty.subtract(aaR.base_unit_qty());
					}
					else if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
						MST_ARR_ACT_R aaR = getArrActR(upR.arr_act_no());
						actQty = actQty.subtract(aaR.base_unit_qty());
						continue;
					}
					actQty = sum(actQty, upR.base_unit_qty());
				}
				// 「移動・移送」「移動・移送返品」「支給」「支給返品」
				if ((MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ()))) {
					if (r.abort_flg()) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0130, toDispGUIIndex(r)));
					}
					if (actQty.neq(asR.base_unit_qty())) {
						r.err_flg(true);
						msgL.add(new MCMessage(
							r, null, MSBEL0247, r.arr_schd_no(), asR.base_unit_qty(), actQty, toDispGUIIndex(r)));
					}
				}
				// 「出荷返品」
				if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
					if (!isNull(asR.getString("ret_dlv_slip_d_no"))) {
						MAM_BP_R bpR = getBpR(asR.getString("cst_cd"));
						if (bpR.cst_iv_flg()
							&& (!isSame(r.trd_unit_cd(), asR.trd_unit_cd())
								|| !isSame(r.trd_unit_qty(), asR.trd_unit_qty()))) {
							r.err_flg(true);
							msgL.add(new MCMessage(
								r, null, MSBEL0293, r.arr_schd_no(), asR.getString("cst_cd"),
								asR.trd_unit_cd(), asR.trd_unit_qty(), r.trd_unit_cd(), r.trd_unit_qty(), toDispGUIIndex(r)));
						}
						if (bpR.cst_iv_flg() && r.abort_flg()) {
							// インボイス取引対象は打切不可
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBEL1043, toDispGUIIndex(r)));
						}
					}
				}
				if (r.abort_flg()) {
					// 予定数以上の入荷に対する打ち切り
					if (actQty.gte(asR.base_unit_qty())) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0328, asR.base_unit_qty(), actQty, toDispGUIIndex(r)));
					}
					// 「入荷実績一覧登録画面または入荷実績受信IFから実行」かつ「同時計上オン」の場合
					if (r.purc_act_chk_flg() && r.sync_flg()) {
						if (!isNull(psR) && !psR.isEmpty()) {
							MCNumber arrRmnQty = asR.base_unit_qty().subtract(actQty);
							MCNumber purcRmnQty = psR.base_unit_schd_qty();
							purcRmnQty= purcRmnQty.subtract(MCNumber.sum(psR.base_unit_purc_qty(), psR.base_unit_accpt_dfct_qty()));
							// 仕入予定残数に上り電文の数量を反映する
							for (ArrAct_DtlR tmpR : list.subList(schdKey, r.arr_schd_no())) {
								if (tmpR.sync_flg()) {
									MST_ARR_ACT_R aaR = getArrActR(tmpR.arr_act_no());
									if (!isNull(aaR) && !aaR.isEmpty()) {
										purcRmnQty = MCNumber.sum(purcRmnQty, aaR.base_unit_qty());
									}
									purcRmnQty = purcRmnQty.subtract(tmpR.base_unit_qty());
								}
							}
							// 入荷・仕入を打切るときに、仕入残数と入荷残数が一致しない場合、エラー
							if (!isSame(purcRmnQty, arrRmnQty)) {
								r.err_flg(true);
								msgL.add(new MCMessage(r, null, MSBEL1069, asR.arr_schd_no(), toDispGUIIndex(r)));
							}
						}
					}
				}
				if (itmR.dscnt_itm_flg() && r.abort_flg()) {
					// 値引品目は打切不可
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL1044, toDispGUIIndex(r)));
				}
			}
			if (!isNull(locR.sppl_cd()) && MSC_STK_ID_TYP.isRNT_RCV(r.purc_id_typ())) {
				r.err_flg(true);
				msgL.add(new MCMessage(r, null, MSBEL0117, toDispGUIIndex(r)));
			}
			if (MAC_ASSET_MNG_TYP.isNOT_MNG(itmR.asset_mng_typ()) && MSC_STK_ID_TYP.isRNT_RCV(r.purc_id_typ())) {
				r.err_flg(true);
				msgL.add(new MCMessage(r, null, MSBEL0233, toDispGUIIndex(r)));
			} 
			if ((MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()))
					&& isNull(r.ship_fr_valid_dt())) {

				InspSchd_Srch01_CndR itmInspR = getItmInspR(r.peg_no());

				if (itmInspR != null && MAC_LMT_DT_FRM_TYP.isDPND_SHIP_FR(itmInspR.lmt_dt_frm_typ()) && itmR.lmt_ctl_flg()) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL0118, toDispGUIIndex(r)));
				}
			}
			InspSchd_Srch01_CndR itmInspR = getItmInspR(r.peg_no());
			if (!isNull(itmInspR)) {
				setShipFrValidDtErr(r, list, itmR, itmInspR, msgL);
				setValidDtNotSameErr(r, list, itmInspR, msgL);
			}
			if (!isNull(r.sppl_cd())) {
				MAM_BP_R bpR = getBpR(r.sppl_cd());
				// 下請対象
				if (bpR.subcon_flg()) {
					// 計画外入荷
					if (isNull(r.arr_schd_no())) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0119, toDispGUIIndex(r)));
					}
					// 同時計上
					else if(!r.sync_flg()
							&& !MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
							&& !MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0120, toDispGUIIndex(r)));
					}
				}
			}
			if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
				MST_PURC_ACT_IO_R purcActIoR = getPurcActIoR(r.purc_act_io_no());
				if (r.base_unit_qty().gt(purcActIoR.base_unit_qty())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL0122, toDispGUIIndex(r)));
				}
			}
			if (!(MAC_TRD_PTN_TYP.isPURC_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_DSCNT(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XTRA(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(r.trd_ptn_typ()))
					) {
				// 取引先・禁止チェック
				MAM_BP_STOP_R bpStopRow = getBpStpCache().get(r.sppl_cd());
				if (!isNull(bpStopRow.bp_cd())) {
					if(r.arr_dt().gte(bpStopRow.purc_stop_dt())){
						r.err_flg(true);
						msgL.add(new MCMessage(r, ArrAct_DtlR.$sppl_cd, MSBEL0241,
								r.sppl_cd(), toDispGUIIndex(r)));
					}
				}
				if (!MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					// 品目・禁止チェック
					MAM_ITM_STOP_R itmStopRow = getItmStopCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					if (!isNull(itmStopRow.itm_cd())) {
						if (r.arr_dt().gte(itmStopRow.purc_stop_dt())) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, ArrAct_DtlR.$itm_cd, MSBEL0242, 
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()) ,toDispGUIIndex(r)));
						}
					}
				}
			}
		}
		
		MCList<ArrAct_DtlR> shipRetChkL = MCList.create(ArrAct_DtlR.class);
		shipRetChkL.addStringColumn("ret_dlv_slip_d_no");
		for (ArrAct_DtlR r : list) {
			if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				MAM_BP_R bpR = getBpR(asR.getString("cst_cd"));
				if (bpR.cst_iv_flg() && !isNull(asR.getString("ret_dlv_slip_d_no"))) {
					r.setStringNE("ret_dlv_slip_d_no", asR.getString("ret_dlv_slip_d_no"));
					shipRetChkL.add(r);
				}
			}
		}
		MCList<MST_SHIP_ACT_D_R> shipRetL = getShipRetLForIV(shipRetChkL);
		MCIndexKey shipRetIdx = shipRetL.createIndex(MST_SHIP_ACT_D_R.$dlv_slip_d_no);

		// 返品対象の納品書明細ごとに返品できる数量の上限数をチェックする
		for (MCList<ArrAct_DtlR> chkGrpL : shipRetChkL.groupList("ret_dlv_slip_d_no")) {
			ArrAct_DtlR r = chkGrpL.get(0);
			MCList<MST_SHIP_ACT_D_R> lst = shipRetL.subList(shipRetIdx, r.getString("ret_dlv_slip_d_no"));
			MCNumber chkQty = MCNumber.ZERO;
			MCNumber retQty = lst.sum("retQty");
			for (ArrAct_DtlR rr : chkGrpL) {
				// 訂正前の、取消前の返品数を増やす
				if (!MAC_DATA_CRUD_TYP.isCRT(rr.data_crud_typ())) {
					MST_ARR_ACT_R aaR = getArrActR(rr.arr_act_no());
					retQty = retQty.add(aaR.base_unit_qty());
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(rr.data_crud_typ())) {
					chkQty = chkQty.add(rr.base_unit_qty());
				}
			}
			
			if (chkQty.gt(retQty)) {
				chkGrpL.setBooleanNE(ArrAct_DtlR.$err_flg, true);
				msgL.add(new MCMessage(r, null, MSBBL0302, retQty, toDispGUIIndex(r)));
			}
		}
		
		MCMessagePool.addAll(msgL);
	}

	/**
	 * 支給に対する固有チェック
	 */
	protected void doCheckProv(MCList<ArrAct_DtlR> list) {
		MCMessageList msgL = new MCMessageList();

		// チェック対象
		MCList<ArrAct_DtlR> upL = MCList.create(ArrAct_DtlR.class);
		for(ArrAct_DtlR r : list) {
			if(MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					&& MAC_PROV_TYP.isONR_PROV(getArrSchdR(r.arr_schd_no()).getString("prov_typ"))
					&& !MAC_PROV_BASIS_TYP.isINPT(getArrSchdR(r.arr_schd_no()).getString("prov_basis_typ"))
					&& MAC_TAX_CALC_TYP.isSLIP(getLocR(r.arr_loc_cd()).getString("prov_tax_calc_typ"))) {
				upL.add(r);
			}
		}
		if (upL.isEmpty()) {
			return;
		}

		// チェック対象(上り電文)の入荷予定
		MSW_ARR_SCHD_KEY_R w = MSW_ARR_SCHD_KEY_R.create("W");
		MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");

		MCList<MST_ARR_SCHD_R> dbc = MCList.create(MST_ARR_SCHD_R.class);
		for (ArrAct_DtlR r : upL) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
				r.arr_schd_no(aaR.arr_schd_no());
				r.base_unit_qty(aaR.base_unit_qty());
			}
			dbc.add().arr_schd_no(r.arr_schd_no());
		}
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbWkDelete("MSBEL5930_MSW_ARR_SCHD_D02", dbc_bldr.getBaseDbc());
		MCList<MST_ARR_SCHD_R> dbc2 = dbc.groupBy(MST_ARR_SCHD_R.$arr_schd_no);
		dbWkInsert("MSBEL5930_MSW_ARR_SCHD_I02", dbc2, dbc_bldr.getBaseDbc());

		// 同時に入荷する必要のある入荷予定
		dbc.init();
		dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setDistinct();
		dbc_bldr.setSelect(t2.arr_schd_no, t2.base_unit_qty, t2.dlv_slip_no);
		dbc_bldr.addInnerJoin(w, bracket( w.arr_schd_no.eq(t.arr_schd_no)));
		dbc_bldr.addInnerJoin(t2, bracket( t2.dlv_slip_no.eq(t.dlv_slip_no)));
		dbSelect("MSBEL5930_MST_ARR_SCHD_S01", dbc, dbc_bldr);

		// 納品伝票ごとに入荷予定の数量がすべて揃っているかチェック
		MCIndexKey idx = upL.createIndex(ArrAct_DtlR.$arr_schd_no);
		for (MCList<MST_ARR_SCHD_R> asL : dbc.groupList(MST_ARR_SCHD_R.$dlv_slip_no)) {

			boolean nodata = false;
			MCList<ArrAct_DtlR> dlvL = createArrAct_DtlL();
			int msgCnt = msgL.size();

			for (MST_ARR_SCHD_R asR : asL) {
				MCList<ArrAct_DtlR> chkL = upL.subList(idx, asR.arr_schd_no());
				if (chkL.isEmpty()) {
					// 入荷対象に含まれていない
					nodata = true;
				}
				else {
					MCNumber aaQty = nvl(chkL.sum(ArrAct_DtlR. $base_unit_qty), MCNumber.ZERO);
					if (!isSame(asR.base_unit_qty(), aaQty)) {
						// 数量が異なる
						chkL.forEach(r -> {
							msgL.add(new MCMessage(r, null, MSBEL0326,
								asR.arr_schd_no(), asR.dlv_slip_no(), asR.base_unit_qty(), aaQty, toDispGUIIndex(r)));
						});
					}
				}
				dlvL.addAll(chkL);
			}
			if (nodata) {
				// 入荷対象に不足有り
				ArrAct_DtlR r = dlvL.isEmpty() ? dlvL.createRow() : dlvL.get(0);
				msgL.add(new MCMessage(r, null, MSBEL0327,
					asL.get(0).arr_schd_no(), asL.get(0).dlv_slip_no(), toDispGUIIndex(r)));
			}
			if (msgL.size() > msgCnt) {
				// 納品書内に一件でも不備があったらすべてNGとする
				dlvL.forEach(r -> r.err_flg(true));
			}
		} 
		MCMessagePool.addAll(msgL);
	}
	
	// ///////////////////////////////////////////////
	// チェック処理共通（ここまで）
	// ///////////////////////////////////////////////
	
	// ///////////////////////////////////////////////
	// チェック処理のサービス呼び出し共有（ここから）
	// ///////////////////////////////////////////////

	protected final String TMP_SUBLOT_NO = "tmp_sublot_no";
	/**
	 * ロット情報サービス.ロット重複チェック
	 */
	protected void callLotChk02(MCList<ArrAct_DtlR> l) {
		MCList<ArrAct_DtlR>
			chkL = MCList.create(ArrAct_DtlR.class),
			sameLotL = MCList.create(ArrAct_DtlR.class);

		for (ArrAct_DtlR r : l) {
			r.addStringColumn(TMP_SUBLOT_NO, r.sublot_no());
			MAM_ITM_R itmR = object(CLAZZ)._itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (!itmR.isEmpty() && MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
				r.sublot_no(MAC_STR.NULL_VAL.value());
			}
			// 取引パタンが「仕入」「経費購買」のみ同一ロットを認める
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {

				if (r.same_lot_flg()) {
					sameLotL.add(r);
					continue;
				}
			}
			chkL.add(r);
		}
		// 同一ロット対象は先頭行のみチェック対象とする
		for(MCList<ArrAct_DtlR> lst : sameLotL.groupList(_sameLotGrpCols)) {
			chkL.add(lst.get(0));
		}

		if (chkL.isEmpty()) return ;
		MSBFL_LotService.Lot_Chk02 o = MSBFL_LotService.crtLot_Chk02();
		setAll(o.up0(), chkL, createMap_Lot_Chk02_CndR_ArrAct_DtlR());
		o.exec();
		copyErrFlg(chkL, o.down0());
		MCIndexKey idx = sameLotL.createIndex(ArrAct_DtlR.$lot_no, ArrAct_DtlR.$sublot_no);
		for (ArrAct_DtlR r : chkL) {
			if (r.err_flg()) {
				MCList<ArrAct_DtlR> lst = sameLotL.subList(idx, r.lot_no(), r.sublot_no());
				if (!isNull(lst)) {
					lst.setBoolean(ArrAct_DtlR.$err_flg, r.err_flg());
				}
			}
		}
		l.setColumnValue(ArrAct_DtlR.$sublot_no, TMP_SUBLOT_NO);
	}
	protected Map_Lot_Chk02_CndR_ArrAct_DtlR<Lot_Chk02_CndR,ArrAct_DtlR> createMap_Lot_Chk02_CndR_ArrAct_DtlR() {
		return new Map_Lot_Chk02_CndR_ArrAct_DtlR<Lot_Chk02_CndR, ArrAct_DtlR>();
	}
	public class Map_Lot_Chk02_CndR_ArrAct_DtlR<D extends Lot_Chk02_CndR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk02_CndR.$peg_no, ArrAct_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk02_CndR.$itm_cd, ArrAct_DtlR.$itm_cd);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
			addColumnPathMap(Lot_Chk02_CndR.$lot_no, ArrAct_DtlR.$lot_no);
			addColumnPathMap(Lot_Chk02_CndR.$sublot_no, ArrAct_DtlR.$sublot_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
			dest.lot_not_change_flg(setLotNotChangeFlg(src.lot_no(), asR.lot_no()));
		}
	}

	/**
	 * ロット情報サービス.ロット存在チェック
	 */
	protected void callLotChk03(MCList<ArrAct_DtlR> l) {
		if (l.isEmpty()) return ;
		MSBFL_LotService.Lot_Chk03 o = MSBFL_LotService.crtLot_Chk03();
		setAll(o.up0(), l, createMap_Lot_Chk03_CndR_ArrAct_DtlR());
		o.exec();
		copyErrFlg(l, o.down0());
	}
	protected Map_Lot_Chk03_CndR_ArrAct_DtlR<Lot_Chk03_CndR,ArrAct_DtlR> createMap_Lot_Chk03_CndR_ArrAct_DtlR() {
		return new Map_Lot_Chk03_CndR_ArrAct_DtlR<Lot_Chk03_CndR, ArrAct_DtlR>();
	}
	public class Map_Lot_Chk03_CndR_ArrAct_DtlR<D extends Lot_Chk03_CndR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, ArrAct_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, ArrAct_DtlR.$itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, ArrAct_DtlR.$lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, ArrAct_DtlR.$sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$ver_no, ArrAct_DtlR.$ver_no);
		}
	}

	/**
	 * 外注製造実績登録サービス.更新前チェック
	 */
	protected void callOutSrcActChk01(MCList<ArrAct_DtlR> list) {
		MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
		for (ArrAct_DtlR r : list) {
			if (!r.outsrc_act_chk_flg()) {
				continue;
			}
			MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
			if (asR.outsrc_flg()
				&& (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()))) {
				l.add(r);
			}
		}
		if (l.isEmpty()) return ;
		MSBCL_OutSrcActService.OutSrcAct_Chk01 o = MSBCL_OutSrcActService.crtOutSrcAct_Chk01();
		setAll(o.up0(), l, createMap_OutSrcAct_Chk01_ActDR_ArrAct_DtlR());
		o.exec();
		copyErrFlg(l, o.down0());
	}
	protected Map_OutSrcAct_Chk01_ActDR_ArrAct_DtlR<OutSrcAct_Chk01_ActDR,ArrAct_DtlR> createMap_OutSrcAct_Chk01_ActDR_ArrAct_DtlR() {
		return new Map_OutSrcAct_Chk01_ActDR_ArrAct_DtlR<OutSrcAct_Chk01_ActDR, ArrAct_DtlR>();
	}

	public class Map_OutSrcAct_Chk01_ActDR_ArrAct_DtlR<D extends OutSrcAct_Chk01_ActDR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(OutSrcAct_Chk01_ActDR.$peg_no, ArrAct_DtlR.$peg_no);
			addColumnPathMap(OutSrcAct_Chk01_ActDR.$data_crud_typ, "data_crud_typ");
			addColumnPathMap(OutSrcAct_Chk01_ActDR.$mfg_inst_no, ArrAct_DtlR.$mfg_inst_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				MST_ARR_ACT_R aaR = getArrActR(src.arr_act_no());
				dest.mfg_inst_no(aaR.getString("mfg_inst_no"));
			}
			dest.st_act_dt(src.arr_tm().startTimeOfDay());
		}
	}

	/**
	 * 入荷予定サービス.更新（予定・実績）前チェック
	 */
	protected void callArrSchdChk02(MCList<ArrAct_DtlR> list) {
		MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
		for (ArrAct_DtlR r : list) {
			if (!isNull(r.arr_schd_no())) {
				l.add(r);
			}
		}
		if (l.isEmpty()) return ;
		MSBEL_ArrSchdService.ArrSchd_Chk02 o = MSBEL_ArrSchdService.crtArrSchd_Chk02();

		Map<MCNumber, MCList<ArrAct_DtlR>> map = new HashMap<>();
		for (MCList<ArrAct_DtlR> grpL : l.groupList(ArrAct_DtlR.$arr_schd_no)) {
			ArrAct_DtlR r = grpL.get(0).clone();
			r.base_unit_qty(grpL.sum(ArrAct_DtlR.$base_unit_qty));
			copy(o.up0().add(), r, createMap_ArrSchd_DtlR_ArrAct_DtlR());
			map.put(r.peg_no(), grpL);
		}
		o.exec();
		for (ArrSchd_DtlR r : o.down0()) {
			if (r.err_flg()) {
				MCList<ArrAct_DtlR> grpL = map.get(r.peg_no());
				if (!isNull(grpL)) {
					grpL.setBoolean(ArrAct_DtlR.$err_flg, r.err_flg());
				}
			}
		}
	}
	protected Map_ArrSchd_DtlR_ArrAct_DtlR<ArrSchd_DtlR,ArrAct_DtlR> createMap_ArrSchd_DtlR_ArrAct_DtlR() {
		return new Map_ArrSchd_DtlR_ArrAct_DtlR<ArrSchd_DtlR, ArrAct_DtlR>();
	}
	public class Map_ArrSchd_DtlR_ArrAct_DtlR<D extends ArrSchd_DtlR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(src.peg_no());
			dest.arr_schd_no(src.arr_schd_no());
			dest.abort_flg(src.abort_flg());
			if (dest.abort_flg()) {
				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				dest.abort_qty(asR.base_unit_qty().subtract(src.base_unit_qty()));
			}
			dest.is_src_arract_srv_flg(true);

		}
	}

	/**
	 * 支給実績サービス.登録前チェック
	 */
	protected void callProvActChk01(MCList<ArrAct_DtlR> list) {
		MCList<ArrAct_DtlR>
			provL = MCList.create(ArrAct_DtlR.class);
		for (ArrAct_DtlR r : list) {
			MAM_LOC_R locR = getLocR(r.arr_loc_cd());

			// 下記のいずれかに該当する場合に支給実績サービスを呼び出す
			// ・取引パタンが「支給」
			// ・直送支給かつ未着管理
			// ・直送支給かつ通常管理かつ無償受給
			if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
				|| ((MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()))
					&& !isNull(locR.sppl_cd())
					&& (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())
						 || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())))) {
				provL.add(r);
			}
		}
		if (provL.isEmpty()) return ;

		MSBEL_ProvActService.ProvAct_Chk01 o = MSBEL_ProvActService.crtProvAct_Chk01();
		setAll(o.up0(), provL, createMap_ProvActChk01_DtlR_ArrAct_DtlR());
		o.exec();
		copyErrFlg(provL, o.down0());
	}
	protected Map_ProvActChk01_DtlR_ArrAct_DtlR<ProvActChk01_DtlR,ArrAct_DtlR> createMap_ProvActChk01_DtlR_ArrAct_DtlR() {
		return new Map_ProvActChk01_DtlR_ArrAct_DtlR<ProvActChk01_DtlR, ArrAct_DtlR>();
	}
	public class Map_ProvActChk01_DtlR_ArrAct_DtlR<D extends ProvActChk01_DtlR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProvActChk01_DtlR.$peg_no, ArrAct_DtlR.$peg_no);
			addColumnPathMap(ProvActChk01_DtlR.$data_crud_typ, "data_crud_typ");
			addColumnPathMap(ProvActChk01_DtlR.$ac_dt, ArrAct_DtlR.$ac_dt);
			addColumnPathMap(ProvActChk01_DtlR.$trd_ptn_typ, ArrAct_DtlR.$trd_ptn_typ);
			addColumnPathMap(ProvActChk01_DtlR.$itm_cd, ArrAct_DtlR.$itm_cd);
			addColumnPathMap(ProvActChk01_DtlR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
			addColumnPathMap(ProvActChk01_DtlR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
			addColumnPathMap(ProvActChk01_DtlR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
			addColumnPathMap(ProvActChk01_DtlR.$loc_cd, ArrAct_DtlR.$arr_loc_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			String crudTyp = src.getString("data_crud_typ");

			if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
				dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.SHIP.value());
			}
			else {
				dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.DDLV.value());
			}
			MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
			dest.prov_schd_no(asR.getString("prov_schd_no"));
			dest.prov_src_schd_no1(null);
			dest.prov_src_schd_no2(src.arr_schd_no());

			// 新規
			if (MAC_DATA_CRUD_TYP.isCRT(crudTyp)) {
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.SHIP.value());
				}
				else {
					dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.NON_ARR_DDLV.value());
				}
				MAM_LOC_R locR = getLocR(src.arr_loc_cd());
				dest.wg_cd(locR.wg_cd());
				dest.prsppl_cd(locR.sppl_cd());
				dest.stk_id_typ(src.stk_id_typ());

				MAM_BP_R bpR = getBpR(dest.prsppl_cd());
				if (MAC_PROV_RCV_TYP.isNOT_ARR(bpR.prov_rcv_typ())) {

					// 着荷不要の場合、(出荷予定NO)は設定できない
					dest.prov_src_schd_no1(null);
					dest.prov_src_schd_no2(null);

					// 支給予定を参照できないので、納品伝票の値を使用する
					dest.prov_typ(asR.getString("prov_typ"));
					dest.prov_basis_typ(asR.getString("prov_basis_typ"));
					dest.xrate(asR.getNumber("xrate"));
					dest.ptax_xrate(asR.getNumber("ptax_xrate"));
					dest.trd_cur_cd(asR.getString("trd_cur_cd"));
					dest.tax_cd(asR.getString("tax_cd"));
					dest.accpt_dt(nvl(asR.getDate("ship_tm"), src.arr_tm()));
					dest.trd_cur_upri(asR.getNumber("trd_cur_upri"));
				}
				else {
					dest.accpt_dt(src.arr_tm());
				}
			}
			// 更新、削除
			else {
				MST_ARR_ACT_R aaR = getArrActR(src.arr_act_no());

				dest.can_ac_dt(src.can_ac_dt());
				dest.prov_act_no(aaR.getString("prov_act_no"));
				dest.prov_src_act_typ(aaR.getString("prov_src_act_typ"));
				dest.prov_src_act_no(aaR.getString("prov_src_act_no"));

				if (MAC_DATA_CRUD_TYP.isUPD(crudTyp)) {
					MAM_LOC_R locR = getLocR(src.arr_loc_cd());
					dest.wg_cd(locR.wg_cd());
					dest.prsppl_cd(locR.sppl_cd());

					MAM_BP_R bpR = getBpR(dest.prsppl_cd());
					if (MAC_PROV_RCV_TYP.isNOT_ARR(bpR.prov_rcv_typ())) {
						dest.accpt_dt(nvl(asR.getDate("ship_tm"), src.arr_tm()));
					}
					else {
						dest.accpt_dt(src.arr_tm());
					}
				}
			}
		}
	}

	/**
	 * 市場出荷判定サービス.市場出荷判定作成前チェック
	 */
	protected void callMrktJudgChk01(MCList<ArrAct_DtlR> list) {
		MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
		for (ArrAct_DtlR r : list) {
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				MAM_LOC_R locR = getLocR(r.arr_loc_cd());
				if(MAC_LOC_MNG_TYP.isSLS(locR.loc_mng_typ())) {
					// 仕入直送は対象としない
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					if (!asR.getBoolean("purc_ddlv_flg")) {
						l.add(r);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					// 販売場所→生産場所へ変更された場合は削除する
					MST_ARR_ACT_R aaR = getArrActR(r.arr_act_no());
					locR = getLocR(aaR.arr_loc_cd());
					if(MAC_LOC_MNG_TYP.isSLS(locR.loc_mng_typ())) {
						ArrAct_DtlR delR = r.clone();
						delR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						l.add(delR);
					}
				}
			}
		}
		if (l.isEmpty()) return ;
		MSBFL_MrktJudgService.MrktJudg_Chk01 o = MSBFL_MrktJudgService.crtMrktJudg_Chk01();
		setAll(o.up0(), l, createMap_MrktJudg_Chk01_RsltR_ArrAct_DtlR());
		o.exec();
		copyErrFlg(list, o.down0());
	}
	protected Map_MrktJudg_Chk01_RsltR_ArrAct_DtlR<MrktJudg_Chk01_RsltR,ArrAct_DtlR> createMap_MrktJudg_Chk01_RsltR_ArrAct_DtlR() {
		return new Map_MrktJudg_Chk01_RsltR_ArrAct_DtlR<MrktJudg_Chk01_RsltR, ArrAct_DtlR>();
	}
	public class Map_MrktJudg_Chk01_RsltR_ArrAct_DtlR<D extends MrktJudg_Chk01_RsltR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MrktJudg_Chk01_RsltR.$peg_no, ArrAct_DtlR.$peg_no);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$lot_no, ArrAct_DtlR.$lot_no);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$sublot_no, ArrAct_DtlR.$sublot_no);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$base_unit_qty, ArrAct_DtlR.$base_unit_qty);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$base_unit_cd, ArrAct_DtlR.$base_unit_cd);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$loc_cd, ArrAct_DtlR.$arr_loc_cd);
			addColumnPathMap(MrktJudg_Chk01_RsltR.$mrkt_judg_src_no, ArrAct_DtlR.$arr_act_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.mrkt_judg_src_typ(MSC_MRKT_JUDG_SRC_TYP.SLS_LOC_ARR.value());
			
			if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				dest.mrkt_judg_src_no_del(src.arr_act_no());
			}
			else {
				dest.mrkt_judg_src_no(src.arr_act_no());
				dest.itm_cd(src.itm_cd());
				dest.itm_sub1(src.itm_sub1());
				dest.itm_sub2(src.itm_sub2());
				dest.itm_sub3(src.itm_sub3());
				if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
					dest.mrkt_judg_src_no_del(src.arr_act_no());
				}
			}
		}
	}

	/**
	 * 仕入実績登録サービス.仕入実績更新前チェック
	 */
	protected void callPurcChk02(MCList<ArrAct_DtlR> list) {
		MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
		for (ArrAct_DtlR r : list) {
			// 既にエラーになっている明細は渡さない
			// ※渡してしまうと、チェック処理と本処理とで明細件数が異なってしまうため
			// ※また、チェック処理と本処理とで明細件数が異ならないように、仕入実績のチェック処理は
			// ※すべてのチェック処理が終わってから実行する必要がある
			if (!r.purc_act_chk_flg() || r.err_flg()) {
				continue;
			}
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				if((r.sync_flg() || r.temp_ap_flg())
						&& !MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
						&& !MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
					if (!l.contains(r)) {
						l.add(r);
					}
				}
			}
		}
		if (l.isEmpty()) return ;
		callInspSchdSrch02(l);
		MSBDL_PurcActRegService.Purc_Chk02 o = MSBDL_PurcActRegService.crtPurc_Chk02();
		setAll(o.up0(), l, createMap_Purc_Chk02_IoR_ArrAct_DtlR());
		o.exec();
		copyErrFlg(l, o.down0());
	}
	protected Map_Purc_Chk02_IoR_ArrAct_DtlR<Purc_Chk02_IoR,ArrAct_DtlR> createMap_Purc_Chk02_IoR_ArrAct_DtlR() {
		return new Map_Purc_Chk02_IoR_ArrAct_DtlR<Purc_Chk02_IoR, ArrAct_DtlR>();
	}
	public class Map_Purc_Chk02_IoR_ArrAct_DtlR<D extends Purc_Chk02_IoR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Purc_Chk02_IoR.$peg_no, ArrAct_DtlR.$peg_no);
			addColumnPathMap(Purc_Chk02_IoR.$data_crud_typ, ArrAct_DtlR.$data_crud_typ);
			addColumnPathMap(Purc_Chk02_IoR.$arr_schd_no, ArrAct_DtlR.$arr_schd_no);
			addColumnPathMap(Purc_Chk02_IoR.$arr_ptn_typ, ArrAct_DtlR.$arr_ptn_typ);
			addColumnPathMap(Purc_Chk02_IoR.$ac_dt, ArrAct_DtlR.$ac_dt);
			addColumnPathMap(Purc_Chk02_IoR.$can_ac_dt, ArrAct_DtlR.$can_ac_dt);
			addColumnPathMap(Purc_Chk02_IoR.$mfg_inst_no, ArrAct_DtlR.$mfg_inst_no);
			addColumnPathMap(Purc_Chk02_IoR.$abort_flg, ArrAct_DtlR.$abort_flg);
			addColumnPathMap(Purc_Chk02_IoR.$maker_cd, ArrAct_DtlR.$maker_cd);
			addColumnPathMap(Purc_Chk02_IoR.$stk_mng_typ, ArrAct_DtlR.$stk_mng_typ);
			addColumnPathMap(Purc_Chk02_IoR.$itm_cd, ArrAct_DtlR.$itm_cd);
			addColumnPathMap(Purc_Chk02_IoR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
			addColumnPathMap(Purc_Chk02_IoR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
			addColumnPathMap(Purc_Chk02_IoR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
			addColumnPathMap(Purc_Chk02_IoR.$itm_nm, ArrAct_DtlR.$itm_nm);
			addColumnPathMap(Purc_Chk02_IoR.$iv_itm_nm, ArrAct_DtlR.$rcpt_iv_itm_nm);
			addColumnPathMap(Purc_Chk02_IoR.$sundry_itm_flg, ArrAct_DtlR.$sundry_itm_flg);
			addColumnPathMap(Purc_Chk02_IoR.$trd_unit_cd, ArrAct_DtlR.$trd_unit_cd);
			addColumnPathMap(Purc_Chk02_IoR.$trd_unit_qty, ArrAct_DtlR.$trd_unit_qty);
			addColumnPathMap(Purc_Chk02_IoR.$base_unit_cd, ArrAct_DtlR.$base_unit_cd);
			addColumnPathMap(Purc_Chk02_IoR.$base_unit_qty, ArrAct_DtlR.$base_unit_qty);
			addColumnPathMap(Purc_Chk02_IoR.$purc_cont_qty, ArrAct_DtlR.$purc_cont_qty);
			addColumnPathMap(Purc_Chk02_IoR.$gd_cd, ArrAct_DtlR.$gd_cd);
			addColumnPathMap(Purc_Chk02_IoR.$gi_loc_cd, ArrAct_DtlR.$arr_loc_cd);
			addColumnPathMap(Purc_Chk02_IoR.$gi_str_ln_cd, ArrAct_DtlR.$str_ln_cd);			
			addColumnPathMap(Purc_Chk02_IoR.$from_gd_cd, ArrAct_DtlR.$gd_cd);
			addColumnPathMap(Purc_Chk02_IoR.$in_to_loc_cd, ArrAct_DtlR.$arr_loc_cd);
			addColumnPathMap(Purc_Chk02_IoR.$str_ln_cd, ArrAct_DtlR.$str_ln_cd);
			addColumnPathMap(Purc_Chk02_IoR.$lot_no, ArrAct_DtlR.$lot_no);
			addColumnPathMap(Purc_Chk02_IoR.$sublot_no, ArrAct_DtlR.$sublot_no);
			addColumnPathMap(Purc_Chk02_IoR.$ver_no, ArrAct_DtlR.$ver_no);
			addColumnPathMap(Purc_Chk02_IoR.$quality_typ, ArrAct_DtlR.$quality_typ);
			addColumnPathMap(Purc_Chk02_IoR.$stk_insp_typ, ArrAct_DtlR.$stk_insp_typ);
			addColumnPathMap(Purc_Chk02_IoR.$stk_bp_cd, ArrAct_DtlR.$sppl_cd);
			addColumnPathMap(Purc_Chk02_IoR.$sppl_itm_cd, ArrAct_DtlR.$sppl_itm_cd);
			addColumnPathMap(Purc_Chk02_IoR.$sppl_itm_nm, ArrAct_DtlR.$sppl_itm_nm);
			addColumnPathMap(Purc_Chk02_IoR.$bp_lot_no, ArrAct_DtlR.$bp_lot_no);
			addColumnPathMap(Purc_Chk02_IoR.$bp_dlv_slip_no, ArrAct_DtlR.$bp_dlv_slip_no);
			addColumnPathMap(Purc_Chk02_IoR.$bp_dlv_slip_d_no, ArrAct_DtlR.$bp_dlv_slip_d_no);
			addColumnPathMap(Purc_Chk02_IoR.$edi_flg, ArrAct_DtlR.$edi_flg);
			addColumnPathMap(Purc_Chk02_IoR.$arr_sync_flg, ArrAct_DtlR.$sync_flg);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.stk_id_typ(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value());

			String crudTyp = src.getString("data_crud_typ");
			// 削除
			if (MAC_DATA_CRUD_TYP.isDEL(crudTyp)) {
				dest.arr_act_no(src.arr_act_no());
			}
			else {
				MAM_ITM_R itmR = getItmR(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3());
				MAM_LOC_R locR = getLocR(src.arr_loc_cd());

				dest.arr_dt(src.arr_tm().trunc(MCDateFieldType.DAY));
				dest.asset_mng_typ(itmR.asset_mng_typ());
				dest.gi_wg_cd(locR.wg_cd());
				dest.in_to_loc_wg_cd(locR.wg_cd());

				MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(src.itm_cd(),src.itm_sub1(),src.itm_sub2(),src.itm_sub3(),src.trd_unit_cd());
				if (itmUnitR.pack_flg()) {
					dest.pack_unit_qty(src.trd_unit_qty());
					dest.pack_unit_cd(src.trd_unit_cd());
				}
				else {
					dest.pack_unit_qty(src.base_unit_qty());
					dest.pack_unit_cd(src.base_unit_cd());
				}

				if (isNull(dest.stk_bp_cd())) {
					dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}

				// 新規
				if (MAC_DATA_CRUD_TYP.isCRT(crudTyp)) {
					dest.trd_cd(src.trd_cd());
				}
				// 更新
				else {
					dest.arr_act_no(src.arr_act_no());
				}
			}
			
		}
	}

	protected void callPurcSchdChk01(MCList<ArrAct_DtlR> list) {
		MSBDL_PurcSchdRegService.PurcSchd_Chk01 ope = MSBDL_PurcSchdRegService.crtPurcSchd_Chk01();
		for (ArrAct_DtlR r : list) {
			if(isPurcEntryTgt(r)) {
				MST_PURC_SCHD_R psR = getPurcSchdCache(r.arr_schd_no());
				if (!isNull(psR.purc_schd_no())) {
					PurcSchd_DtlR upR = PurcSchd_DtlR.create();
					upR.peg_no(r.peg_no());
					upR.arr_schd_no(r.arr_schd_no());
					upR.purc_schd_no(psR.purc_schd_no());
					upR.abort_flg(psR.abort_flg());
					upR.base_unit_purc_qty(psR.base_unit_purc_qty());
					upR.base_unit_accpt_dfct_qty(psR.base_unit_accpt_dfct_qty());
					ope.up0().add(upR);
				}
			}
		}
		if (ope.up0().isEmpty()) return ;
		ope.exec();
		copyErrFlg(list, ope.down0());
	}

	/**
	 * 検査予定登録サービス.更新可能チェック
	 */
	protected void callInspSchdChk01(MCList<ArrAct_DtlR> list) {
		MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
		for (ArrAct_DtlR r : list) {
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				l.add(r);
			}
			else if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
				if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
					|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
					l.add(r);
				}
			}
		}
		if (l.isEmpty()) return ;
		MSBFL_InspSchdService.InspSchd_Chk01 o = MSBFL_InspSchdService.crtInspSchd_Chk01();
		setAll(o.up0(), l, createMap_InspSchd_Chk01_CndR_ArrAct_DtlR());
		o.exec();
		copyErrFlg(l, o.down0());
	}
	protected Map_InspSchd_Chk01_CndR_ArrAct_DtlR<InspSchd_Chk01_CndR,ArrAct_DtlR> createMap_InspSchd_Chk01_CndR_ArrAct_DtlR() {
		return new Map_InspSchd_Chk01_CndR_ArrAct_DtlR<InspSchd_Chk01_CndR, ArrAct_DtlR>();
	}
	public class Map_InspSchd_Chk01_CndR_ArrAct_DtlR<D extends InspSchd_Chk01_CndR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspSchd_Chk01_CndR.$peg_no, ArrAct_DtlR.$peg_no);
			addColumnPathMap(InspSchd_Chk01_CndR.$data_crud_typ, ArrAct_DtlR.$data_crud_typ);
			addColumnPathMap(InspSchd_Chk01_CndR.$src_no3, ArrAct_DtlR.$arr_schd_no);
			addColumnPathMap(InspSchd_Chk01_CndR.$src_no4, ArrAct_DtlR.$arr_act_no);
			addColumnPathMap(InspSchd_Chk01_CndR.$itm_cd, ArrAct_DtlR.$itm_cd);
			addColumnPathMap(InspSchd_Chk01_CndR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
			addColumnPathMap(InspSchd_Chk01_CndR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
			addColumnPathMap(InspSchd_Chk01_CndR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
			addColumnPathMap(InspSchd_Chk01_CndR.$lot_no, ArrAct_DtlR.$lot_no);
			addColumnPathMap(InspSchd_Chk01_CndR.$sublot_no, ArrAct_DtlR.$sublot_no);
			addColumnPathMap(InspSchd_Chk01_CndR.$quality_typ, ArrAct_DtlR.$quality_typ);
			addColumnPathMap(InspSchd_Chk01_CndR.$gd_cd, ArrAct_DtlR.$gd_cd);
			addColumnPathMap(InspSchd_Chk01_CndR.$base_unit_qty, ArrAct_DtlR.$base_unit_qty);
			addColumnPathMap(InspSchd_Chk01_CndR.$base_unit_cd, ArrAct_DtlR.$base_unit_cd);
			addColumnPathMap(InspSchd_Chk01_CndR.$loc_cd, ArrAct_DtlR.$arr_loc_cd);
			addColumnPathMap(InspSchd_Chk01_CndR.$str_ln_cd, ArrAct_DtlR.$str_ln_cd);
			addColumnPathMap(InspSchd_Chk01_CndR.$stk_arrv_bp_cd, ArrAct_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(InspSchd_Chk01_CndR.$stk_insp_typ, ArrAct_DtlR.$stk_insp_typ);
			addColumnPathMap(InspSchd_Chk01_CndR.$stk_id_typ, ArrAct_DtlR.$stk_id_typ);
			addColumnPathMap(InspSchd_Chk01_CndR.$stk_bp_cd, ArrAct_DtlR.$stk_bp_cd);
			addColumnPathMap(InspSchd_Chk01_CndR.$sno1, ArrAct_DtlR.$sno1);
			addColumnPathMap(InspSchd_Chk01_CndR.$sno2, ArrAct_DtlR.$sno2);
			addColumnPathMap(InspSchd_Chk01_CndR.$sno3, ArrAct_DtlR.$sno3);
			addColumnPathMap(InspSchd_Chk01_CndR.$sno4, ArrAct_DtlR.$sno4);
			addColumnPathMap(InspSchd_Chk01_CndR.$gr_tm, ArrAct_DtlR.$arr_tm);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
			dest.skip_chk_plnt_aprv_flg(true);

			String crudTyp = src.getString("data_crud_typ");

			// 削除
			if (MAC_DATA_CRUD_TYP.isDEL(crudTyp)) {
				MST_ARR_ACT_R aaR = getArrActR(src.arr_act_no());

				dest.src_no1(aaR.getString("po_d_no"));
				dest.src_no3(aaR.arr_schd_no());
				dest.src_no4(aaR.arr_act_no());
				dest.itm_cd(aaR.itm_cd());
				dest.itm_sub1(aaR.itm_sub1());
				dest.itm_sub2(aaR.itm_sub2());
				dest.itm_sub3(aaR.itm_sub3());
				dest.lot_no(aaR.lot_no());
				dest.sublot_no(aaR.sublot_no());
				dest.quality_typ(aaR.quality_typ());
				dest.gd_cd(aaR.gd_cd());
				dest.base_unit_qty(aaR.base_unit_qty());
				dest.loc_cd(aaR.arr_loc_cd());
				dest.str_ln_cd(aaR.str_ln_cd());
				dest.stk_arrv_bp_cd(aaR.stk_arrv_bp_cd());
				dest.stk_insp_typ(aaR.stk_insp_typ());
				dest.stk_id_typ(aaR.stk_id_typ());
				dest.stk_bp_cd(aaR.stk_bp_cd());
				dest.sno1(aaR.sno1());
				dest.sno2(aaR.sno2());
				dest.sno3(aaR.sno3());
				dest.sno4(aaR.sno4());
				dest.gr_tm(aaR.arr_tm());

				if(aaR.getBoolean("pack_flg")) {
					dest.pack_unit_cd(aaR.trd_unit_cd());
					dest.pack_unit_qty(aaR.trd_unit_qty());
				}
				else {
					dest.pack_unit_cd(aaR.base_unit_cd());
					dest.pack_unit_qty(aaR.base_unit_qty());
				}
			}
			else {
				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(src.itm_cd(), src.itm_sub1(),
						src.itm_sub2(), src.itm_sub3(), src.trd_unit_cd());
	
				dest.src_no1(asR.getString("po_d_no"));
				if (itmUnitR.pack_flg()) {
					dest.pack_unit_cd(src.trd_unit_cd());
					dest.pack_unit_qty(src.trd_unit_qty());
				}
				else {
					dest.pack_unit_cd(src.base_unit_cd());
					dest.pack_unit_qty(src.base_unit_qty());
				}
			}
		}
	}

	/**
	 * 承認提供サービス.承認次処理済更新前チェック
	 */
	protected void callAprvChk02(MCList<ArrAct_DtlR> list) {
		MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
		for (ArrAct_DtlR r : list) {
			if (!r.purc_act_chk_flg()) {
				// 仕入実績SVでチェックするので入荷実績SVでは実行しない
				continue;
			}
			MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
			if (asR.getBoolean("aprv_flg")) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					l.add(r);
				}
			}
		}
		if (l.isEmpty()) return ;
		MBBAL_AprvService.Aprv_Chk02 o = MBBAL_AprvService.crtAprv_Chk02();
		setAll(o.up0(), l, createMap_Aprv_Chk02_Rslt1R_ArrAct_DtlR());
		o.exec();
		copyErrFlg(list, o.down0());
	}
	/**
	 * 承認提供サービス.承認次処理済解除前チェック
	 */
	protected void callAprvChk03(MCList<ArrAct_DtlR> list) {
		MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
		for (ArrAct_DtlR r : list) {
			if (!r.purc_act_chk_flg()) {
				// 仕入実績SVでチェックするので入荷実績SVでは実行しない
				continue;
			}
			MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
			if (asR.getBoolean("aprv_flg")) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					l.add(r);
				}
			}
		}
		if (l.isEmpty()) return ;
		MBBAL_AprvService.Aprv_Chk03 o = MBBAL_AprvService.crtAprv_Chk03();
		setAll(o.up0(), l, createMap_Aprv_Chk02_Rslt1R_ArrAct_DtlR());
		o.exec();
		copyErrFlg(list, o.down0());
	}
	protected Map_Aprv_Chk02_Rslt1R_ArrAct_DtlR<Aprv_Chk02_Rslt1R,ArrAct_DtlR> createMap_Aprv_Chk02_Rslt1R_ArrAct_DtlR() {
		return new Map_Aprv_Chk02_Rslt1R_ArrAct_DtlR<Aprv_Chk02_Rslt1R, ArrAct_DtlR>();
	}
	public class Map_Aprv_Chk02_Rslt1R_ArrAct_DtlR<D extends Aprv_Chk02_Rslt1R, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.aprv_no(getArrSchdR(src.arr_schd_no()).getString("aprv_no"));
			dest.peg_no(src.peg_no());
		}
	}

	/**
	 * 売上返品サービス.登録前チェック
	 */
	protected void callSlsRetChk01(MCList<ArrAct_DtlR> list) {
		MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
		for (ArrAct_DtlR r : list) {
			if (!r.sls_ret_chk_flg()) {
				continue;
			}
			if ((MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ()) && r.sync_flg())
					|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
				l.add(r);
			}
		}
		if (l.isEmpty()) return ;
		MSBBL_SlsRetService.SlsRet_Chk01 o = MSBBL_SlsRetService.crtSlsRet_Chk01();
		setAll(o.up0(), l, createMap_SlsRet_Chk01_HdrR_ArrAct_DtlR());
		o.exec();
	}
	protected Map_SlsRet_Chk01_HdrR_ArrAct_DtlR<SlsRet_Chk01_HdrR,ArrAct_DtlR> createMap_SlsRet_Chk01_HdrR_ArrAct_DtlR() {
		return new Map_SlsRet_Chk01_HdrR_ArrAct_DtlR<SlsRet_Chk01_HdrR, ArrAct_DtlR>();
	}
	public class Map_SlsRet_Chk01_HdrR_ArrAct_DtlR<D extends SlsRet_Chk01_HdrR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				dest.sls_ret_schd_no(asR.getString("sls_ret_schd_no"));
			}
			else {
				MST_ARR_ACT_R aaR = getArrActR(src.arr_act_no());
				dest.sls_ret_schd_no(aaR.getString("sls_ret_schd_no"));
			}
		}
	}

	/**
	 * 締め処理提供サービス.締日チェック
	 */
	protected void callClChk03(MCList<ArrAct_DtlR> l) {
		if (l.isEmpty()) return ;
		MSBIL_ClService.Cl_Chk03 o = MSBIL_ClService.crtCl_Chk03();
		setAll(o.up0(), l, createMap_Cl_Chk03_CndR_ArrAct_DtlR());
		o.exec();
		copyErrFlg(l, o.down0());
	}
	protected Map_Cl_Chk03_CndR_ArrAct_DtlR<Cl_Chk03_CndR,ArrAct_DtlR> createMap_Cl_Chk03_CndR_ArrAct_DtlR() {
		return new Map_Cl_Chk03_CndR_ArrAct_DtlR<Cl_Chk03_CndR, ArrAct_DtlR>();
	}
	public class Map_Cl_Chk03_CndR_ArrAct_DtlR<D extends Cl_Chk03_CndR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk03_CndR.$peg_no, ArrAct_DtlR.$peg_no);
			addColumnPathMap(Cl_Chk03_CndR.$ac_dt, ArrAct_DtlR.$ac_dt);
			addColumnPathMap(Cl_Chk03_CndR.$loc_cd, ArrAct_DtlR.$arr_loc_cd);
			addColumnPathMap(Cl_Chk03_CndR.$itm_cd, ArrAct_DtlR.$itm_cd);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.stk_cls_chk_flg(true);

			if (!MAC_DATA_CRUD_TYP.isCRT(src.getString("data_crud_typ"))) {
				dest.can_ac_dt(src.can_ac_dt());

				MST_ARR_ACT_R aaR = getArrActR(src.arr_act_no());
				dest.old_loc_cd(aaR.arr_loc_cd());
				dest.old_itm_cd(aaR.itm_cd());
				dest.old_itm_sub1(aaR.itm_sub1());
				dest.old_itm_sub2(aaR.itm_sub2());
				dest.old_itm_sub3(aaR.itm_sub3());
			}
			if (MAC_DATA_CRUD_TYP.isDEL(src.getString("data_crud_typ"))) {
				dest.ac_dt(null);
			}
		}
	}
	/**
	 * 諸口品登録サービス.登録前チェック
	 */
	protected void callSundryItmChk01(MCList<ArrAct_DtlR> l) {

		//計画外入荷、かつ諸口品の場合のみ実行
		MCList<ArrAct_DtlR> list = MCList.create(ArrAct_DtlR.class);
		for (ArrAct_DtlR r : l) {
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
				if (isNull(r.arr_schd_no())
					&& r.sundry_itm_flg()) {
					list.add(r);
				}
			}
		}
		if (list.isEmpty()) return ;
		
		MABCL_SundryItmRegService.SundryItm_Chk01 o = MABCL_SundryItmRegService.crtSundryItm_Chk01();
		setAll(o.up0(), list, createMap_SundryItm_Chk01_DtlR_ArrAct_DtlR());
		o.exec();
		copyErrFlg(l, o.down0());
		
	}
	protected Map_SundryItm_Chk01_DtlR_ArrAct_DtlR<SundryItm_Chk01_DtlR,ArrAct_DtlR> createMap_SundryItm_Chk01_DtlR_ArrAct_DtlR() {
		return new Map_SundryItm_Chk01_DtlR_ArrAct_DtlR<SundryItm_Chk01_DtlR, ArrAct_DtlR>();
	}
	public class Map_SundryItm_Chk01_DtlR_ArrAct_DtlR<D extends SundryItm_Chk01_DtlR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Chk01_DtlR.$peg_no, ArrAct_DtlR.$peg_no);
			addColumnPathMap(SundryItm_Chk01_DtlR.$data_crud_typ, ArrAct_DtlR.$data_crud_typ);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_cd, ArrAct_DtlR.$itm_cd);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno1, ArrAct_DtlR.$sno1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno2, ArrAct_DtlR.$sno2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno3, ArrAct_DtlR.$sno3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno4, ArrAct_DtlR.$sno4);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_nm, ArrAct_DtlR.$itm_nm);

		}
	}
	/**
	 * 受領インボイス登録サービス（受領オンボイスＮＯ仮登録前チェック）呼び出し
	 */
	protected void callRcptIvRegChk02(MCList<ArrAct_DtlR> list) {
		MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
		for (ArrAct_DtlR r : list) {
			MAM_BP_R spplR = getBpR(r.sppl_cd());
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
					&& spplR.sppl_iv_flg()
					&& !isNull(r.temp_rcpt_iv_no())) {
					l.add(r);
				}
			}
		}
		if (l.isEmpty()) return;
		
		MSBEL_RcptIvRegService.RcptIv_Chk02 o = MSBEL_RcptIvRegService.crtRcptIv_Chk02();
		setAll(o.up0(), l, createMap_RcptIv_Chk02_MapR_ArrAct_DtlR());
		o.exec();
		copyErrFlg(l, o.down0());
	}
	protected Map_RcptIv_Chk02_MapR_ArrAct_DtlR<RcptIv_Chk02_MapR,ArrAct_DtlR> createMap_RcptIv_Chk02_MapR_ArrAct_DtlR() {
		return new Map_RcptIv_Chk02_MapR_ArrAct_DtlR<RcptIv_Chk02_MapR, ArrAct_DtlR>();
	}
	public class Map_RcptIv_Chk02_MapR_ArrAct_DtlR<D extends RcptIv_Chk02_MapR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RcptIv_Chk02_MapR.$peg_no, ArrAct_DtlR.$peg_no);
			addColumnPathMap(RcptIv_Chk02_MapR.$rcpt_iv_no, ArrAct_DtlR.$temp_rcpt_iv_no);
			addColumnPathMap(RcptIv_Chk02_MapR.$arr_act_no, ArrAct_DtlR.$arr_act_no);
			addColumnPathMap(RcptIv_Chk02_MapR.$trd_unit_qty, ArrAct_DtlR.$trd_unit_qty);
			addColumnPathMap(RcptIv_Chk02_MapR.$base_unit_qty, ArrAct_DtlR.$base_unit_qty);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				dest.rcpt_iv_no(null);
			}
		}
	}
	// ///////////////////////////////////////////////
	// チェック処理のサービス呼び出し共有（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// キャッシュ（ここから）
	// ///////////////////////////////////////////////

	protected static final Class<MSBEL_ArrActService> CLAZZ = MSBEL_ArrActService.class;

	/**
	 * MST_ARR_SCHDキャッシュ
	 */
	protected static void initArrSchdCache(MCList<ArrAct_DtlR> dtlL) {
		object(CLAZZ)._initArrSchdCache(dtlL);
	}
	protected MCList<MST_ARR_SCHD_R> _arrSchdCache = null;
	protected MCIndexKey _arrSchdCacheKey = null;
	protected MCQueryApiBuilder _arrSchdCache_bldr = null;
	protected void _initArrSchdCache(MCList<ArrAct_DtlR> dtlL) {
		insArrSchdWk(dtlL);

		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MST_ARR_PR_R t1 = MST_ARR_PR_R.create("T1");
		MSW_ARR_SCHD_KEY_R w = MSW_ARR_SCHD_KEY_R.create("W");
		
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t); 
		l_bldr.addInnerJoin(w, bracket( w.arr_schd_no.eq(t.arr_schd_no)));
		l_bldr.addInnerJoin(t1, bracket( t1.arr_pr_no.eq(t.arr_pr_no)));
		l_bldr.setLockTable(t1.arr_pr_no);
		l_bldr.setOrderByAsc(l_bldr.getBaseDbc().getKeyColumn$());
		dbSelectForUpdateNoFetch("MSBEL5930_MST_ARR_SCHD_S02", l_bldr);

		_arrSchdCache = MCList.create(MST_ARR_SCHD_R.class);
		
		MST_SLS_RET_SCHD_D_R t2 = MST_SLS_RET_SCHD_D_R.create("T2");
		MST_PROV_SCHD_R t3 = MST_PROV_SCHD_R.create("T3");
		MST_IV_D_R t4 = MST_IV_D_R.create("T4");
		MST_IV_R t5 = MST_IV_R.create("T5");
		MST_PO_D_R t6 = MST_PO_D_R.create("T6");
		MST_PO_R t7 = MST_PO_R.create("T7");
		MCTempView t8 = createTempView("T8");
		MSW_ARR_SCHD_KEY_R S1W = MSW_ARR_SCHD_KEY_R.create("S1W");
		MST_ARR_SCHD_R S1W1 = MST_ARR_SCHD_R.create("W1");
		MST_ARR_PR_R S1W2 = MST_ARR_PR_R.create("W2");
		MST_DLV_SLIP_D_R S1W3 = MST_DLV_SLIP_D_R.create("W3");
		MST_DLV_SLIP_R S1W4 = MST_DLV_SLIP_R.create("W4");
		MST_SHIP_ACT_D_R t9 = MST_SHIP_ACT_D_R.create("T9");
		MST_SHIP_ALLOC_STS_R t10 = MST_SHIP_ALLOC_STS_R.create("T10");
		MST_PROV_SCHD_R t11 = MST_PROV_SCHD_R.create("T11");
		_arrSchdCache_bldr = MCQueryApiBuilder.create(t);
		_arrSchdCache.addBooleanColumn("purc_ddlv_flg");
		_arrSchdCache.addStringColumn("rqst_dpt_cd");
		_arrSchdCache.addStringColumn("cst_cd");
		_arrSchdCache.addStringColumn("sppl_cd");
		_arrSchdCache.addStringColumn("rqst_wg_cd");
		_arrSchdCache.addStringColumn("po_no");
		_arrSchdCache.addStringColumn("po_d_no");
		_arrSchdCache.addStringColumn("dlv_slip_d_no");
		_arrSchdCache.addStringColumn("ret_dlv_slip_d_no");
		_arrSchdCache.addStringColumn("ret_stk_arrv_bp_cd");
		_arrSchdCache.addStringColumn("rsn_cd");
		_arrSchdCache.addStringColumn("bd_dpt_cd");
		_arrSchdCache.addStringColumn("sls_ret_schd_d_no");
		_arrSchdCache.addStringColumn("iv_d_no");
		_arrSchdCache.addStringColumn("sls_ret_schd_no");
		_arrSchdCache.addStringColumn("prov_schd_no");
		_arrSchdCache.addStringColumn("prov_typ");
		_arrSchdCache.addStringColumn("prov_basis_typ");
		_arrSchdCache.addNumberColumn("xrate");
		_arrSchdCache.addNumberColumn("ptax_xrate");
		_arrSchdCache.addStringColumn("trd_cur_cd");
		_arrSchdCache.addStringColumn("tax_cd");
		_arrSchdCache.addNumberColumn("trd_cur_upri");
		_arrSchdCache.addNumberColumn("wtax_rate");
		_arrSchdCache.addDateColumn("ship_tm");
		_arrSchdCache.addBooleanColumn("iv_ship_flg");
		_arrSchdCache.addStringColumn("slo_d_no");
		_arrSchdCache.addBooleanColumn("aprv_flg");
		_arrSchdCache.addStringColumn("aprv_no");
		_arrSchdCache.addBooleanColumn("rqst_can_flg");
		_arrSchdCache.addBooleanColumn("xrate_inpt_flg");
		_arrSchdCache.addBooleanColumn("ptax_xrate_inpt_flg");
		_arrSchdCache.addBooleanColumn("tax_fix_flg");
		_arrSchdCache_bldr.setGroupBy(t1.purc_ddlv_flg, t1.rqst_dpt_cd, t1.cst_cd,
				t1.sppl_cd, t1.rqst_wg_cd, t6.po_no, t1.po_d_no, t1.dlv_slip_d_no,
				t1.ret_dlv_slip_d_no, t1.ret_stk_arrv_bp_cd, t1.rsn_cd, t1.bd_dpt_cd,
				t1.sls_ret_schd_d_no, t1.iv_d_no, t2.sls_ret_schd_no, t3.prov_schd_no,
				t8.pr(S1W4.ship_tm), t5.iv_ship_flg, t6.slo_d_no, t7.aprv_flg, t7.aprv_no,
				t6.rqst_can_flg);
		for (MCExprColumn col :_arrSchdCache_bldr.getBaseDbc().getAllColumn$()) {
			_arrSchdCache_bldr.addGroupBy(col);
		}

		_arrSchdCache_bldr.addGroupFunc(decode( t3.prov_schd_no, nullValue(), t8.pr(S1W3.prov_typ), t3.prov_typ), "prov_typ");
		_arrSchdCache_bldr.addGroupByValue(t3.prov_schd_no);
		_arrSchdCache_bldr.addGroupByValue(t8.pr(S1W3.prov_typ));
		_arrSchdCache_bldr.addGroupByValue(t3.prov_typ);
		
		_arrSchdCache_bldr.addGroupFunc(decode( t3.prov_schd_no, nullValue(), t8.pr(S1W3.prov_basis_typ), t3.prov_basis_typ), "prov_basis_typ");
		_arrSchdCache_bldr.addGroupByValue(t8.pr(S1W3.prov_basis_typ));
		_arrSchdCache_bldr.addGroupByValue(t3.prov_basis_typ);

		_arrSchdCache_bldr.addGroupFunc(nvl( t5.xrate, decode( t3.prov_schd_no, nullValue(), t8.pr(S1W4.xrate), t3.xrate )), "xrate");
		_arrSchdCache_bldr.addGroupByValue(t5.xrate);
		_arrSchdCache_bldr.addGroupByValue(t8.pr(S1W4.xrate));
		_arrSchdCache_bldr.addGroupByValue(t3.xrate);

		_arrSchdCache_bldr.addGroupFunc(nvl( t5.ptax_xrate, decode( t3.prov_schd_no, nullValue(), t8.pr(S1W4.ptax_xrate), t3.ptax_xrate )), "ptax_xrate");
		_arrSchdCache_bldr.addGroupByValue(t5.ptax_xrate);
		_arrSchdCache_bldr.addGroupByValue(t8.pr(S1W4.ptax_xrate));
		_arrSchdCache_bldr.addGroupByValue(t3.ptax_xrate);
		
		_arrSchdCache_bldr.addGroupFunc(decode( t3.prov_schd_no, nullValue(), t8.pr(S1W4.trd_cur_cd), t3.trd_cur_cd), "trd_cur_cd");
		_arrSchdCache_bldr.addGroupByValue(t8.pr(S1W4.trd_cur_cd));
		_arrSchdCache_bldr.addGroupByValue(t3.trd_cur_cd);

		_arrSchdCache_bldr.addGroupFunc(decode( t3.prov_schd_no, nullValue(), t8.pr(S1W3.tax_cd), t3.tax_cd), "tax_cd");
		_arrSchdCache_bldr.addGroupByValue(t8.pr(S1W3.tax_cd));
		_arrSchdCache_bldr.addGroupByValue(t3.tax_cd);

		_arrSchdCache_bldr.addGroupFunc(decode( t3.prov_schd_no, nullValue(), t8.pr(S1W3.trd_cur_upri), t3.trd_cur_upri), "trd_cur_upri");
		_arrSchdCache_bldr.addGroupByValue(t8.pr(S1W3.trd_cur_upri));
		_arrSchdCache_bldr.addGroupByValue(t3.trd_cur_upri);

		_arrSchdCache_bldr.addGroupFunc(decode( t3.prov_schd_no, nullValue(), t8.pr(S1W3.wtax_rate), t3.wtax_rate), "wtax_rate");
		_arrSchdCache_bldr.addGroupByValue(t8.pr(S1W3.wtax_rate));
		_arrSchdCache_bldr.addGroupByValue(t3.wtax_rate);

		_arrSchdCache_bldr.addMax(t11.xrate_inpt_flg, "xrate_inpt_flg");
		_arrSchdCache_bldr.addMax(t11.ptax_xrate_inpt_flg, "ptax_xrate_inpt_flg");
		_arrSchdCache_bldr.addMax(t11.tax_fix_flg, "tax_fix_flg");
		_arrSchdCache_bldr.addInnerJoin(w, bracket( w.arr_schd_no.eq(t.arr_schd_no)));
		_arrSchdCache_bldr.addInnerJoin(t1, bracket( t1.arr_pr_no.eq(t.arr_pr_no)));
		_arrSchdCache_bldr.addLeftOuterJoin(t2, bracket( t2.sls_ret_schd_d_no.eq(t1.sls_ret_schd_d_no)));
		_arrSchdCache_bldr.addLeftOuterJoin(t3, bracket(t3.prov_src_schd_no2.eq(t.arr_schd_no)
				.and(t3.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.SHIP.value()))
						.or(t3.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.DDLV.value()))))));
		_arrSchdCache_bldr.addLeftOuterJoin(t4, bracket( t4.iv_d_no.eq(t1.iv_d_no)));
		_arrSchdCache_bldr.addLeftOuterJoin(t5, bracket( t5.iv_mng_no.eq(t4.iv_mng_no)));
		_arrSchdCache_bldr.addLeftOuterJoin(t6, bracket( t6.po_d_no.eq(t1.po_d_no)));
		_arrSchdCache_bldr.addLeftOuterJoin(t7, bracket( t7.po_no.eq(t6.po_no)));
		_arrSchdCache_bldr.addLeftOuterJoin(subQuery()
								.select(S1W3.dlv_slip_d_no, S1W3.prov_typ,
										S1W3.prov_basis_typ, S1W3.tax_cd,
										S1W3.trd_cur_upri, S1W3.wtax_rate, S1W4.xrate,
										S1W4.ptax_xrate, S1W4.trd_cur_cd, S1W4.ship_tm)
								.from(S1W.innerJoin(S1W1)
										.on(bracket(S1W1.arr_schd_no.eq(S1W.arr_schd_no)))
										.innerJoin(S1W2)
										.on(bracket(S1W2.arr_pr_no.eq(S1W1.arr_pr_no)))
										.innerJoin(S1W3).on(
												bracket(S1W3.dlv_slip_d_no.eq(S1W2.dlv_slip_d_no)))
										.innerJoin(S1W4)
										.on(bracket(S1W4.dlv_slip_no.eq(S1W3.dlv_slip_no)
												.and(S1W4.dlv_slip_seq.eq(S1W3.dlv_slip_seq))
												.and(S1W4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))))))
								.view(t8),
						bracket(t8.pr(S1W3.dlv_slip_d_no).eq(t1.dlv_slip_d_no)));
		_arrSchdCache_bldr.addLeftOuterJoin(t9, bracket(t9.dlv_slip_d_no.eq(t8.pr(S1W3.dlv_slip_d_no))
				.and(t9.can_flg.eq(value(false)))));
		_arrSchdCache_bldr.addLeftOuterJoin(t10, bracket( t10.ship_alloc_sts_no.eq(t9.ship_alloc_sts_no)));
		_arrSchdCache_bldr.addLeftOuterJoin(t11,
				bracket(bracket(t11.prov_src_schd_no1.eq(t10.ship_schd_no))
						.and(t11.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.SHIP.value())))));
		_arrSchdCache_bldr.setOrderByAsc(_arrSchdCache_bldr.getBaseDbc().getKeyColumn$());
		dbSelect("MSBEL5930_MST_ARR_SCHD_S03", _arrSchdCache, _arrSchdCache_bldr);
		_arrSchdCacheKey = _arrSchdCache.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
	}
	protected static MCList<MST_ARR_SCHD_R> getArrSchdCache() {
		return object(CLAZZ)._arrSchdCache;
	}
	protected static MST_ARR_SCHD_R getArrSchdR(String arrSchdNo) {
		MCList<MST_ARR_SCHD_R> dbc = getArrSchdCache();
		if (!isNull(arrSchdNo)) {
			MST_ARR_SCHD_R r = dbc.getFirst(object(CLAZZ)._arrSchdCacheKey, arrSchdNo);
			if (!isNull(r)) {
				return r;
			}
			// キャッシュを退避
			MCList<MST_ARR_SCHD_R> lst = dbc.createInstance();
			lst.setAll(dbc);
	
			// 入荷進捗をロック
			MST_ARR_PR_R t1 = MST_ARR_PR_R.create("T1");

			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.setWhere(t.arr_schd_no.eq(bind("1")), arrSchdNo);
			l_bldr.addInnerJoin(t1, bracket( t1.arr_pr_no.eq(t.arr_pr_no)));
			l_bldr.setLockTable(t1.arr_pr_no);
			l_bldr.setOrderByAsc(l_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoFetch("MSBEL5930_MST_ARR_SCHD_S04", l_bldr);
			
			// データ取得
			r = MST_ARR_SCHD_R.create();
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r.arr_schd_no(arrSchdNo);
			dbWkDelete("MSBEL5930_MSW_ARR_SCHD_D03", r_bldr.getBaseDbc());
			dbWkInsert("MSBEL5930_MSW_ARR_SCHD_I03", r, r_bldr.getBaseDbc());
			int cnt = dbSelect("MSBEL5930_MST_ARR_SCHD_S05", dbc, object(CLAZZ)._arrSchdCache_bldr);
			dbc.addAll(lst);
			object(CLAZZ)._arrSchdCacheKey
				= dbc.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
			if (cnt > 0) {
				return dbc.getFirst(object(CLAZZ)._arrSchdCacheKey, arrSchdNo);
			}
		}
		return dbc.createRow();
	}

	/**
	 * 引数の入荷予定ＮＯをワークに登録する
	 */
	protected void insArrSchdWk(MCList<ArrAct_DtlR> bindL) {
		MCList<MST_ARR_SCHD_R> wkL = MCList.create(MST_ARR_SCHD_R.class);
		for (ArrAct_DtlR r : bindL) {
			if (!isNull(r.arr_schd_no())) {
				wkL.add().arr_schd_no(r.arr_schd_no());
			}
		}
		wkL = wkL.groupBy(MST_ARR_SCHD_R.$arr_schd_no);
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T"));
		dbWkDelete("MSBEL5930_MSW_ARR_SCHD_D04", wkL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5930_MSW_ARR_SCHD_I04", wkL, wkL_bldr.getBaseDbc());
	}

	/**
	 * MST_ARR_ACTキャッシュ
	 */
	protected static void initArrActCache(MCList<ArrAct_DtlR> dtlL) {
		object(CLAZZ)._initArrActCache(dtlL);
	}
	protected MCList<MST_ARR_ACT_R> _arrActCache = null;
	protected MCIndexKey _arrActCacheKey = null;
	protected void _initArrActCache(MCList<ArrAct_DtlR> dtlL) {
		insArrActWk(dtlL);

		if (_arrActCache == null) {
			_arrActCache = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder arrActCache_bldr = MCQueryApiBuilder.create(t);
			_arrActCache.addBooleanColumn("abort_flg");
			_arrActCache.addStringColumn("arr_ptn_typ");
			_arrActCache.addStringColumn("mfg_inst_no");
			_arrActCache.addBooleanColumn("pre_outsrc_act_flg");
			_arrActCache.addStringColumn("prov_act_no");
			_arrActCache.addStringColumn("prov_src_act_typ");
			_arrActCache.addStringColumn("prov_src_act_no");
			_arrActCache.addStringColumn("prov_typ");
			_arrActCache.addStringColumn("prov_basis_typ");
			_arrActCache.addNumberColumn("xrate");
			_arrActCache.addNumberColumn("ptax_xrate");
			_arrActCache.addStringColumn("trd_cur_cd");
			_arrActCache.addStringColumn("tax_cd");
			_arrActCache.addNumberColumn("trd_cur_upri");
			_arrActCache.addNumberColumn("wtax_rate");
			_arrActCache.addStringColumn("po_d_no");
			_arrActCache.addStringColumn("ret_dlv_slip_d_no");
			_arrActCache.addStringColumn("sls_ret_schd_no");
			_arrActCache.addBooleanColumn("pack_flg");
			_arrActCache.addBooleanColumn("rem_abort_flg");
			makeDml(arrActCache_bldr, _arrActCache);
		}

		MCList<MST_ARR_ACT_R>
			dbc = _arrActCache.subList((String[])null, (Comparable[])null);	// 一時カラム情報を含めた空インスタンス
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_ARR_ACT_R.create("T"));
		makeDml(dbc_bldr, dbc);
		dbSelectForUpdate("MSBEL5930_MST_ARR_ACT_S04", dbc, dbc_bldr);
		
		if (_arrActCache.isEmpty()) {
			_arrActCache.setAll(dbc);
		}
		else {
			MCList<MST_ARR_ACT_R> l = _arrActCache.createInstance();
			for (ArrAct_DtlR r : dtlL) {
				l.add(_arrActCache.getFirst(_arrActCacheKey, r.arr_act_no()));
			}
			if (!l.isEmpty()) {
				_arrActCache.removeAll(l);
			}
			_arrActCache.addAll(dbc);
		}
			
		_arrActCacheKey = _arrActCache.createIndex(MST_ARR_ACT_R.$arr_act_no);
	}
	protected void makeDml(MCQueryApiBuilder builder, MCList<MST_ARR_ACT_R> list) {
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create(builder.getBaseDbcAlias());
		MSW_ARR_ACT_KEY_R w = MSW_ARR_ACT_KEY_R.create("W");
		MST_ARR_SCHD_R t1 = MST_ARR_SCHD_R.create("T1");
		MST_PROV_ACT_R t2 = MST_PROV_ACT_R.create("T2");
		MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
		MST_PO_D_R t4 = MST_PO_D_R.create("T4");
		MST_SLS_RET_SCHD_D_R t6 = MST_SLS_RET_SCHD_D_R.create("T6");
		MAVM_ITM_UNIT_R m1 = MAVM_ITM_UNIT_R.create("M1");

		builder.removeSelect(MST_ARR_ACT_R.$dlv_slip_no, MST_ARR_ACT_R.$dlv_slip_d_no);
		builder.addSelect(t1.abort_flg, t1.arr_ptn_typ, t1.mfg_inst_no,
				t1.pre_outsrc_act_flg, t2.prov_act_no, t2.prov_src_act_typ,
				t2.prov_src_act_no, t2.prov_typ, t2.prov_basis_typ, t2.xrate,
				t2.ptax_xrate, t2.trd_cur_cd, t2.tax_cd, t2.trd_cur_upri, t2.wtax_rate,
				t3.po_d_no, t3.dlv_slip_d_no, t3.ret_dlv_slip_d_no, t6.sls_ret_schd_no,
				t1.dlv_slip_no, m1.pack_flg);
		builder.addSelect(t3.abort_flg.as("rem_abort_flg"));
		builder.addInnerJoin(w, bracket( w.arr_act_no.eq(t.arr_act_no)));
		builder.addLeftOuterJoin(t1, bracket( t1.arr_schd_no.eq(t.arr_schd_no)));
		builder.addLeftOuterJoin(t2, bracket(t2.prov_src_act_no.eq(t.arr_act_no)
				.and(t2.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.SHIP.value()))
						.or(t2.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.NON_ARR_DDLV.value())))
						.or(t2.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.NCV_RCV_DDLV.value()))))
				.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		builder.addLeftOuterJoin(t3, bracket( t3.arr_pr_no.eq(t1.arr_pr_no)));
		builder.addLeftOuterJoin(t4, bracket( t4.po_d_no.eq(t3.po_d_no)));
		builder.addLeftOuterJoin(t6, bracket( t6.sls_ret_schd_d_no.eq(t3.sls_ret_schd_d_no)));
		builder.addLeftOuterJoin(m1, bracket(m1.itm_cd.eq(t.itm_cd)
				.and(m1.itm_sub1.eq(t.itm_sub1))
				.and(m1.itm_sub2.eq(t.itm_sub2))
				.and(m1.itm_sub3.eq(t.itm_sub3))
				.and(m1.unit_cd.eq(t.trd_unit_cd))));
		builder.setLockTable(t.arr_act_no);
		builder.setOrderByAsc(builder.getBaseDbc().getKeyColumn$());
	}
	protected static MCList<MST_ARR_ACT_R> getArrActCache() {
		return object(CLAZZ)._arrActCache;
	}
	protected static MST_ARR_ACT_R getArrActR(String arrActNo) {
		MCList<MST_ARR_ACT_R> dbc = getArrActCache();
		if (!isNull(arrActNo)) {
			MST_ARR_ACT_R r = dbc.getFirst(object(CLAZZ)._arrActCacheKey, arrActNo);
			if (!isNull(r)) {
				return r;
			}
			// キャッシュを退避
			MCList<MST_ARR_ACT_R> lst = dbc.createInstance();
			lst.setAll(dbc);

			MCList<ArrAct_DtlR> l = MCList.create(ArrAct_DtlR.class);
			l.add().arr_act_no(arrActNo);
			object(CLAZZ).insArrActWk(l);
	
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_ARR_ACT_R.create("T"));
			int cnt = dbSelectForUpdate("MSBEL5930_MST_ARR_ACT_S05", dbc, dbc_bldr);
			dbc.addAll(lst);
			object(CLAZZ)._arrActCacheKey
				= dbc.createIndex(MST_ARR_ACT_R.$arr_act_no);
			if (cnt > 0) {
				return dbc.getFirst(object(CLAZZ)._arrActCacheKey, arrActNo);
			}
		}
		return dbc.createRow();
	}

	/**
	 * 引数の入荷実績ＮＯをワークに登録する
	 */
	protected void insArrActWk(MCList<ArrAct_DtlR> bindL) {
		MCList<MST_ARR_ACT_R> wkL = MCList.create(MST_ARR_ACT_R.class);
		for (ArrAct_DtlR r : bindL) {
			if (!isNull(r.arr_act_no())) {
				wkL.add().arr_act_no(r.arr_act_no());
			}
		}
		wkL = wkL.groupBy(MST_ARR_ACT_R.$arr_act_no);
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_ARR_ACT_R.create("T"));
		dbWkDelete("MSBEL5930_MSW_ARR_ACT_D02", wkL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5930_MSW_ARR_ACT_I02", wkL, wkL_bldr.getBaseDbc());
	}

	/**
	 * MAM_LOCキャッシュ
	 */
	protected static void initLocCache(MCList<ArrAct_DtlR> dtlL) {
		object(CLAZZ)._initLocCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	protected void _initLocCache(MCList<?> dtlL) {
		MAM_BP_R t1 = MAM_BP_R.create("T1");

		MCList<MAM_LOC_R> dbc = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc.addStringColumn("prov_basis_typ");
		dbc_bldr.setSelect(t.loc_cd, t.loc_nm, t.sppl_cd, t.site_cd, t.wg_cd, t.lg_grp_cd, t.loc_mng_typ, t1.prov_basis_typ, t.zip_cd, t.addr1, t.addr2, t.addr3, t.addr4, t.tel, t.fax, t1.prov_rcv_typ, t1.prov_tax_calc_typ);
		dbc_bldr.addLeftOuterJoin(t1, bracket( t1.bp_cd.eq(t.sppl_cd)));
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc, dbc_bldr, dtlL,
				ArrAct_DtlR.$arr_loc_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_LOC_R> getLocCache() {
		if (object(CLAZZ)._locCache == null) {
			object(CLAZZ)._initLocCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._locCache;
	}
	protected static MAM_LOC_R getLocR(String locCd) {
		return getLocCache().get(locCd);
	}

	/**
	 * MAM_ITMキャッシュ
	 */
	protected static void initItmCache(MCList<ArrAct_DtlR> dtlL) {
		object(CLAZZ)._initItmCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	protected void _initItmCache(MCList<?> dtlL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.lot_mng_typ,
				t.sublot_mng_typ,
				t.bp_lot_flg,
				t.asset_mng_typ,
				t.stk_mng_typ,
				t.lot_no_ptn_cd,
				t.sublot_no_ptn_cd,
				t.lmt_ctl_flg,
				t.dec_place,
				t.rnd_typ,
				t.dscnt_itm_flg);
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, dtlL,
				MAM_ITM_R.$itm_cd,
				MAM_ITM_R.$itm_sub1,
				MAM_ITM_R.$itm_sub2,
				MAM_ITM_R.$itm_sub3);
	}
	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		if (object(CLAZZ)._itmCache == null) {
			object(CLAZZ)._initItmCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmCache;
	}
	protected static MAM_ITM_R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return getItmCache().get(itmCd, itmSub1, itmSub2, itmSub3);
	}

	/**
	 * MAM_BPキャッシュ
	 */
	protected static void initBpCache(MCList<ArrAct_DtlR> dtlL) {
		object(CLAZZ)._initBpCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache = null;
	protected void _initBpCache(MCList<?> dtlL) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.subcon_flg,
				t.prov_rcv_typ,
				t.sppl_iv_flg,
				t.cst_iv_flg
		);
		_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbc_bldr, dtlL,
				ArrAct_DtlR.$sppl_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_BP_R> getBpCache() {
		if (object(CLAZZ)._bpCache == null) {
			object(CLAZZ)._initBpCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._bpCache;
	}
	protected static MAM_BP_R getBpR(String bpCd) {
		return getBpCache().get(bpCd);
	}

	/**
	 * MAVM_ITM_UNITキャッシュ
	 */
	protected static void initItmUnitCache(MCList<ArrAct_DtlR> dtlL) {
		object(CLAZZ)._initItmUnitCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected void _initItmUnitCache(MCList<?> dtlL) {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.conv_base_qty,
				t.conv_qty,
				t.dec_place,
				t.rnd_typ,
				t.pack_flg
		);
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc_bldr, dtlL,
				ArrAct_DtlR.$itm_cd, ArrAct_DtlR.$itm_sub1, ArrAct_DtlR.$itm_sub2,
				ArrAct_DtlR.$itm_sub3, ArrAct_DtlR.$trd_unit_cd);
	}
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		if (object(CLAZZ)._itmUnitCache == null) {
			object(CLAZZ)._initItmUnitCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmUnitCache;
	}
	protected static MAVM_ITM_UNIT_R getItmUnitR(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
		return getItmUnitCache().get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
	}

	/**
	 * MAM_CURキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_CUR_R> _curCache = null;
	protected MAM_CUR_R getCurR(String curCd) {
		if (_curCache == null) {
			MAM_CUR_R t = MAM_CUR_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(
					t.amt_dec_place
			);
			_curCache = new FXUCL_MCDbcCache<MAM_CUR_R>(dbc_bldr);
		}
		return _curCache.get(curCd);
	}

	/**
	 * MST_PO_Dキャッシュ
	 */
	protected static void initPoDCache(MCList<? extends MCRow> dtlL) {
		object(CLAZZ)._initPoDCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MST_PO_D_R> _poDCache = null;
	protected void _initPoDCache(MCList<?> dtlL) {
		// キャッシュ時のgroupByでエラーにならないためリストに対して一時カラムを追加
		if (dtlL.isEmpty()) {
			dtlL.addStringColumn("po_d_no");
		}

		MST_PO_D_R t = MST_PO_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.slo_no,
				t.po_no,
				t.slo_d_no,
				t.dlv_cd,
				t.purc_basis_typ
		);
		_poDCache = new FXUCL_MCDbcCache<MST_PO_D_R>(dbc_bldr, dtlL,
				MST_PO_D_R.$po_d_no);
	}
	protected static FXUCL_MCDbcCache<MST_PO_D_R> getPoDCache() {
		if (object(CLAZZ)._poDCache == null) {
			object(CLAZZ)._initPoDCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._poDCache;
	}
	protected static MST_PO_D_R getPoDR(String poDNo) {
		return getPoDCache().get(poDNo);
	}

	/**
	 * 検査予定サービス.品管関連マスタ取得
	 */
	MCList<InspSchd_Srch01_CndR> _itmInspL;
	MCIndexKey _itmInspKey;
	protected void callInspSchdSrch01(MCList<ArrAct_DtlR> l) {
		if (l.isEmpty()) return ;
		MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
		setAll(o.up0(), l, createMap_InspSchd_Srch01_CndR_ArrAct_DtlR());
		o.exec();
		object(CLAZZ)._itmInspL = o.down0();
		object(CLAZZ)._itmInspKey = object(CLAZZ)._itmInspL.createIndex("peg_no");
	}
	protected Map_InspSchd_Srch01_CndR_ArrAct_DtlR<InspSchd_Srch01_CndR,ArrAct_DtlR> createMap_InspSchd_Srch01_CndR_ArrAct_DtlR() {
		return new Map_InspSchd_Srch01_CndR_ArrAct_DtlR<InspSchd_Srch01_CndR, ArrAct_DtlR>();
	}
	public class Map_InspSchd_Srch01_CndR_ArrAct_DtlR<D extends InspSchd_Srch01_CndR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, ArrAct_DtlR.$peg_no);
			addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, ArrAct_DtlR.$itm_cd);
			addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
			addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
			addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
			addColumnPathMap(InspSchd_Srch01_CndR.$sppl_cd, ArrAct_DtlR.$sppl_cd);
			addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd, ArrAct_DtlR.$maker_cd);
			addColumnPathMap(InspSchd_Srch01_CndR.$to_loc_cd, ArrAct_DtlR.$arr_loc_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.mfg_loc_cd(null);
			dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
			dest.insp_ptn_cd(null);
			dest.from_loc_cd(null);
			if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				MST_ARR_ACT_R aaR = getArrActR(src.arr_act_no());
				dest.itm_cd(aaR.itm_cd());
				dest.itm_sub1(aaR.itm_sub1());
				dest.itm_sub2(aaR.itm_sub2());
				dest.itm_sub3(aaR.itm_sub3());
				dest.sppl_cd(aaR.sppl_cd());
				dest.maker_cd(aaR.maker_cd());
				dest.to_loc_cd(aaR.arr_loc_cd());
				dest.base_dt(aaR.arr_tm().trunc(MCDateFieldType.DAY));
			}
			else {
				dest.base_dt(src.arr_tm().trunc(MCDateFieldType.DAY));
			}
			dest.no_insp_srch_flg(true);
		}
	}
	protected InspSchd_Srch01_CndR getItmInspR(MCNumber pegNo) {
		if (object(CLAZZ)._itmInspL == null) {
			return null;
		}
		else {
			return object(CLAZZ)._itmInspL.getFirst(object(CLAZZ)._itmInspKey, pegNo);
		}
	}

	protected MCList<MST_PURC_SCHD_R> _purcSchdL = null;
	MCIndexKey _purcSchdKey;

	/**
	 * 仕入予定キャッシュを作成する
	 * @param dtlL 入荷予定ＮＯが含まれる上り電文リスト
	 */
	protected static void initPurcSchdCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initPurcSchdCache(bindL);
	}
	protected void _initPurcSchdCache(MCList<? extends MCRow> bindL) {
		_purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
		MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
		MCQueryApiBuilder purcSchdL_bldr = MCQueryApiBuilder.create(t);
		purcSchdL_bldr.setWhere(t.arr_schd_no.eq(bind("arr_schd_no")));
		dbSelect("MSBEL5930_MST_PURC_SCHD_S01", _purcSchdL, purcSchdL_bldr, bindL);
		_purcSchdKey = _purcSchdL.createIndex(MST_PURC_SCHD_R.$arr_schd_no);
	}
	protected static MST_PURC_SCHD_R getPurcSchdCache(String arrSchdNo) {
		return object(CLAZZ)._getPurcSchdCache(arrSchdNo);
	}
	protected MST_PURC_SCHD_R _getPurcSchdCache(String arrSchdNo) {
		return _purcSchdL.getFirst(_purcSchdKey, arrSchdNo);
	}

	/**
	 * 仕入実績受払のデータを取得します。<br>
	 * （最新のもの）
	 * @param bindL 「purc_act_io_no」に仕入実績受払ＮＯを格納したリスト
	 * @return 仕入実績受払のデータ
	 */
	MCList<MST_PURC_ACT_IO_R> _purcActIoL;
	MCIndexKey _purcActIoKey;
	protected void initPurcActIoL(MCList<? extends MCRow> bindL) {
		MST_PURC_ACT_D_R t1 = MST_PURC_ACT_D_R.create("T1");
		MST_PURC_ACT_R t2 = MST_PURC_ACT_R.create("T2");

				MCList<MST_PURC_ACT_IO_R> dbc = MCList.create(MST_PURC_ACT_IO_R.class);
				MST_PURC_ACT_IO_R t = MST_PURC_ACT_IO_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc.addStringColumn("purc_act_no");
				dbc.addBooleanColumn("interim_flg");
				dbc.addStringColumn("ap_dpt_cd");
				dbc.addStringColumn("tax_cd");
				dbc.addStringColumn("purc_typ");
				dbc.addStringColumn("purc_dpt_cd");
				dbc.addStringColumn("trd_cur_cd");
				dbc.addStringColumn("base_cur_cd");
				dbc.addStringColumn("ptax_cur_cd");
				dbc.addStringColumn("xrate_cd");
				dbc.addNumberColumn("xrate");
				dbc.addNumberColumn("ptax_xrate");
				dbc.addStringColumn("asppl_cd");
				dbc_bldr.setSelect(
						t.purc_act_io_no,
						t.purc_act_d_no,
						t.base_unit_qty,
						t.in_to_loc_cd,
						t.str_ln_cd,
						t.trd_cur_amt,
						t.trd_cur_tax_amt,
						t.base_cur_amt,
						t.base_cur_tax_amt,
						t.ptax_cur_amt,
						t.ptax_cur_tax_amt,
						t1.purc_act_no,
						t1.interim_flg,
						t1.ap_dpt_cd,
						t1.trd_cur_upri,
						t1.base_cur_upri,
						t1.ptax_cur_upri,
						t1.tax_cd,
						t1.purc_typ,
						t2.purc_dpt_cd,
						t2.purc_usr_cd,
						t2.trd_cur_cd,
						t2.base_cur_cd,
						t2.ptax_cur_cd,
						t2.xrate_cd,
						t2.xrate,
						t2.ptax_xrate,
						t2.asppl_cd
				);
		dbc_bldr.addInnerJoin(t1, bracket(t1.purc_act_d_no.eq(t.purc_act_d_no)
				.and(t1.purc_act_d_seq.eq(t.purc_act_d_seq))));
		dbc_bldr.addInnerJoin(t2,
				bracket(t2.purc_act_no.eq(t1.purc_act_no)
						.and(t2.purc_act_seq.eq(t1.purc_act_seq))
						.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		dbc_bldr.setWhere(t.purc_act_io_no.eq(bind("purc_act_io_no")));
				dbSelect("MSBEL5930_MST_PURC_ACT_IO_S01", dbc, dbc_bldr, bindL);
				
				object(CLAZZ)._purcActIoL = dbc;
				object(CLAZZ)._purcActIoKey = object(CLAZZ)._purcActIoL.createIndex("purc_act_io_no");
	}
	protected MST_PURC_ACT_IO_R getPurcActIoR(String purcActIoNo) {
		return object(CLAZZ)._purcActIoL.getFirst(object(CLAZZ)._purcActIoKey, purcActIoNo);
	}

	/**
	 * 入荷実績(未着)のデータを取得します。<br>
	 * （最新のもの）
	 * @param bindL 「purc_act_io_no」に仕入実績受払ＮＯを格納したリスト
	 * @return 入荷実績のデータ
	 */
	MCList<MST_ARR_ACT_R> _arrActL;
	MCIndexKey _arrActKey;
	protected void initArrActL(MCList<? extends MCRow> bindL) {
		MCList<MST_ARR_ACT_R> dbc = MCList.create(MST_ARR_ACT_R.class);
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.arr_act_no,
				t.purc_act_io_no,
				t.base_unit_qty,
				t.trd_cur_amt,
				t.trd_cur_tax_amt,
				t.base_cur_amt,
				t.base_cur_tax_amt,
				t.ptax_cur_amt,
				t.ptax_cur_tax_amt
		);
		dbc_bldr.setWhere(t.purc_act_io_no.eq(bind("purc_act_io_no")));
		dbc_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBEL5930_MST_ARR_ACT_S06", dbc, dbc_bldr, bindL.groupBy("purc_act_io_no"));

		object(CLAZZ)._arrActL = dbc;
		object(CLAZZ)._arrActKey = object(CLAZZ)._arrActL.createIndex("purc_act_io_no");	}
	protected MCList<MST_ARR_ACT_R> getArrActL(String purcActIoNo) {
		return object(CLAZZ)._arrActL.subList(object(CLAZZ)._arrActKey, purcActIoNo);
	}

	/**
	 * 売上返品予定明細のデータを取得します。<br>
	 * @param bindL 「sls_ret_schd_d_no」に売上返品予定明細ＮＯを格納したリスト
	 * @return 売上返品予定明細のデータ
	 */
	MCList<MST_SLS_RET_SCHD_D_R> _slsRetSchdDL;
	MCIndexKey _slsRetSchdDKey;
	protected void initSlsRetSchdDL(MCList<? extends MCRow> bindL) {
		MST_SLS_RET_SCHD_R t1 = MST_SLS_RET_SCHD_R.create("T1");

		MCList<MST_SLS_RET_SCHD_D_R> dbc = MCList.create(MST_SLS_RET_SCHD_D_R.class);
		MST_SLS_RET_SCHD_D_R t = MST_SLS_RET_SCHD_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc.addStringColumn("cst_cd");
		dbc.addStringColumn("sls_usr_cd");
		dbc_bldr.setSelect(t.sls_ret_schd_d_no, t.sret_fr_cd, t.sret_fr_nm, t.tdlv_cd, t1.cst_cd, t1.sls_usr_cd);
		dbc_bldr.addLeftOuterJoin(t1, bracket( t1.sls_ret_schd_no.eq(t.sls_ret_schd_no)));
		dbc_bldr.setWhere(t.sls_ret_schd_d_no.eq(bind("sls_ret_schd_d_no")));
		dbSelect("MSBEL5930_MST_SLS_RET_SCHD_D_S01", dbc, dbc_bldr, bindL);
		
		object(CLAZZ)._slsRetSchdDL = dbc;
		object(CLAZZ)._slsRetSchdDKey = object(CLAZZ)._slsRetSchdDL.createIndex("sls_ret_schd_d_no");
	}
	protected MST_SLS_RET_SCHD_D_R getSlsRetSchdDR(String slsRetSchdDNo) {
		return object(CLAZZ)._slsRetSchdDL.getFirst(object(CLAZZ)._slsRetSchdDKey, slsRetSchdDNo);
	}

	/**
	 * 出荷実績明細のデータを取得します。<br>
	 * （出荷返品（未売上・乙仲）、移送、移送返品、支給、支給返品用）
	 * @param bindL 「dlv_slip_d_no」に納品書明細ＮＯを格納したリスト
	 * @return 出荷実績明細のデータ
	 */
	MCList<MST_SHIP_ACT_D_R> _shipActDL2;
	MCIndexKey _shipActDKey2;
	MCIndexKey _shipActDKey4;
	protected void initShipActDL2(MCList<? extends MCRow> bindL) {
		MST_ARR_MAP_R t1 = MST_ARR_MAP_R.create("T1");
		MST_PROV_ACT_R t2 = MST_PROV_ACT_R.create("T2");
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");

		MCList<MST_SHIP_ACT_D_R> dbc = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc.addStringColumn("arr_act_no");
		dbc.addNumberColumn("arr_qty");
		dbc.addNumberColumn("not_appl_qty");
		dbc.addStringColumn("prov_trd_ptn_typ");
		dbc.addStringColumn("prov_typ");
		dbc.addBooleanColumn("gi_vmi_flg");
		dbc_bldr.setSelect(t.ship_act_d_no, t.dlv_slip_d_no, t.trd_ptn_typ, t.ship_loc_cd,
				t.ship_str_ln_cd, t.lot_no, t.sublot_no, t.gd_cd, t.quality_typ,
				t.stk_id_typ, t.stk_bp_cd, t.stk_arrv_bp_cd, t.trd_unit_qty,
				t.base_unit_qty);
		dbc_bldr.addSelect(t1.arr_act_no, nvl(t1.arr_qty, value(0)).as("arr_qty"),
				nvl(t1.arr_qty, value(0)).as("not_appl_qty"),
				t2.trd_ptn_typ.as("prov_trd_ptn_typ"), t2.prov_typ, m1.gi_vmi_flg);
		dbc_bldr.addLeftOuterJoin(t1, bracket( t1.ship_act_d_no.eq(t.ship_act_d_no)));
		dbc_bldr.addLeftOuterJoin(t2,
				bracket(t2.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value()))
						.and(t2.prov_src_act_no.eq(t.ship_act_d_no))
						.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		dbc_bldr.addLeftOuterJoin(m1, bracket( m1.loc_cd.eq(t.ship_loc_cd)));
		dbc_bldr.setWhere(t.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
		dbc_bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBEL5930_MST_SHIP_ACT_D_S01", dbc, dbc_bldr, bindL, null);

		object(CLAZZ)._shipActDL2 = toArrApplL(dbc, MST_SHIP_ACT_D_R.$ship_act_d_no);
		object(CLAZZ)._shipActDKey2 = object(CLAZZ)._shipActDL2.createIndex(
			MST_SHIP_ACT_D_R.$dlv_slip_d_no,
			MST_SHIP_ACT_D_R.$lot_no,
			MST_SHIP_ACT_D_R.$sublot_no,
			MST_SHIP_ACT_D_R.$quality_typ,
			MST_SHIP_ACT_D_R.$stk_arrv_bp_cd,
			MST_SHIP_ACT_D_R.$stk_id_typ,
			MST_SHIP_ACT_D_R.$stk_bp_cd
		);
		object(CLAZZ)._shipActDKey4 = object(CLAZZ)._shipActDL2.createIndex(
			MST_ARR_ACT_R.$arr_act_no
		);
	}
	protected MCList<MST_SHIP_ACT_D_R> getShipActDL2(ArrAct_DtlR r) {
		// 場所と格付(出荷返品のみ)は出荷から変更して入荷できるのでキーから除外する
		MCList<MST_SHIP_ACT_D_R> lst = 
			object(CLAZZ)._shipActDL2.subList(object(CLAZZ)._shipActDKey2,
				r.dlv_slip_d_no(),
				r.lot_no(),
				r.sublot_no(),
				r.quality_typ(),
				r.stk_arrv_bp_cd(),
				r.stk_id_typ(),
				r.stk_bp_cd());
		if (!MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
			String[] key = {
				MST_SHIP_ACT_D_R.$gd_cd
			};
			lst = lst.subList(key, r.toArray(key));
		}

		MCList<MST_SHIP_ACT_D_R> retL = lst.subList("arr_act_no", null);
		if (!isNull(r.arr_act_no())) {
			retL.addAll(lst.subList("arr_act_no", r.arr_act_no()));
		}
		retL.sort("arr_act_no", "ship_act_d_no");
		MCMessageList msgList = new MCMessageList();
		if (lst.isEmpty()) {
			msgList.add(new MCMessage(r, null, MSBEL1050, r.dlv_slip_no(), r.dlv_slip_d_no(), r.lot_no(), r.sublot_no(), toDispGUIIndex(r)));
		} 
		else if (retL.isEmpty()){
			msgList.add(new MCMessage(r, null, MSBEL1052, r.dlv_slip_no(), r.dlv_slip_d_no(), r.lot_no(), r.sublot_no(), toDispGUIIndex(r)));
		}
		if (msgList.size() > 0) {
			setError(msgList);
		}
		return retL;
	}
	protected MCList<MST_SHIP_ACT_D_R> getShipActDL3(ArrAct_DtlR r) {
		MCList<MST_SHIP_ACT_D_R> lst = 
			object(CLAZZ)._shipActDL2.subList(object(CLAZZ)._shipActDKey4,
					r.arr_act_no());
		lst.sort("arr_act_no", "ship_act_d_no");
		return lst;
	}

	protected void setError(MCMessageList msgList){
		int i = 0;
		MCAppException ex = new MCAppException(msgList.get(0));
		for (MCMessage aMsg : msgList) {
			if (i > 0) {
				ex.addCauseMessage(aMsg);
			}
			i++;
		}
		throw ex;
	}

	/**
	 * 出荷実績リストを入荷の消込用に加工する
	 */
	protected MCList<MST_SHIP_ACT_D_R>
		toArrApplL(MCList<MST_SHIP_ACT_D_R> shipL, String grpKey) {

		// 出荷時から在庫の属性を変更
		for (MST_SHIP_ACT_D_R r : shipL) {
			// 支給返品（外注間支給も含む）
			if (MAC_TRD_PTN_TYP.isPROV_RTN(r.getString("prov_trd_ptn_typ"))) {
				r.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());

				// 有償支給
				if (MAC_PROV_TYP.isONR_PROV(r.getString("prov_typ"))) {
					r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					r.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
			}
			// 支給、または出庫時VMI計上フラグがオン
			else if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ()) || r.getBoolean("gi_vmi_flg")) {
				// VMI品
				if (MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())) {
					r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					r.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}

		// 消込用の数量を設定
		MCList<MST_SHIP_ACT_D_R> l = shipL.createInstance();
		for (MCList<MST_SHIP_ACT_D_R> lst : shipL.groupList(grpKey)) {
			MST_SHIP_ACT_D_R r = lst.get(0);

			if (lst.size() == 1 && isNull(r.getString("arr_act_no"))) {
				r.setNumber("not_appl_qty", r.base_unit_qty());
				l.add(r);
			}
			else {
				l.addAll(lst);

				MCNumber qty = r.base_unit_qty().subtract(lst.sum("arr_qty"));
				if (qty.isPositive()) {
					MST_SHIP_ACT_D_R rr = r.clone();
					rr.setString("arr_act_no", null);
					rr.setNumber("arr_qty", 0);
					rr.setNumber("not_appl_qty", qty);
					l.add(rr);
				}
			}
		}
		return l;
	}

	/**
	 * ＩＶ出荷実績明細のデータを取得します。<br>
	 * （移送、移送返品、支給、支給返品用（輸出））
	 * @param bindL 「dlv_slip_d_no」に納品書明細ＮＯ、「iv_d_no」にインボイス明細ＮＯを格納したリスト
	 * @return ＩＶ出荷実績明細のデータ
	 */
	MCList<MST_SHIP_ACT_D_R> _ivShipActDL;
	MCIndexKey _ivShipActDKey;
	protected void initIvShipActDL(MCList<? extends MCRow> bindL) {
		MST_IV_SHIP_ACT_D_R t1 = MST_IV_SHIP_ACT_D_R.create("T1");
		MST_ARR_MAP_R t2 = MST_ARR_MAP_R.create("T2");
		MST_PROV_ACT_R t3 = MST_PROV_ACT_R.create("T3");
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");

		MCList<MST_SHIP_ACT_D_R> dbc = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc.addStringColumn("arr_act_no");
		dbc.addNumberColumn("not_appl_qty");
		dbc.addStringColumn("prov_trd_ptn_typ");
		dbc.addStringColumn("prov_typ");
		dbc.addBooleanColumn("gi_vmi_flg");
		dbc_bldr.setSelect(t1.iv_ship_act_d_no, t1.iv_d_no, t.trd_ptn_typ, t.ship_loc_cd,
				t.ship_str_ln_cd, t.lot_no, t.sublot_no, t.gd_cd, t.quality_typ,
				t.stk_id_typ, t.stk_bp_cd, t.stk_arrv_bp_cd, t1.trd_unit_qty,
				t1.base_unit_qty, t.dlv_slip_d_no);
		dbc_bldr.addSelect(t2.arr_act_no, nvl(t2.arr_qty, value(0)).as("arr_qty"),
				nvl(t2.arr_qty, value(0)).as("not_appl_qty"),
				t3.trd_ptn_typ.as("prov_trd_ptn_typ"), t3.prov_typ, m1.gi_vmi_flg);
		dbc_bldr.addInnerJoin(t1, bracket( t1.ship_act_d_no.eq(t.ship_act_d_no)));
		dbc_bldr.addLeftOuterJoin(t2, bracket( t2.iv_ship_act_d_no.eq(t1.iv_ship_act_d_no)));
		dbc_bldr.addLeftOuterJoin(t3,
				bracket(t3.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value()))
						.and(t3.prov_src_act_no.eq(t.ship_act_d_no))
						.and(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		dbc_bldr.addLeftOuterJoin(m1, bracket( m1.loc_cd.eq(t.ship_loc_cd)));
		dbc_bldr.setWhere(t1.iv_d_no.eq(bind("iv_d_no")));
		dbc_bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBEL5930_MST_SHIP_ACT_D_S02", dbc, dbc_bldr, bindL, null);

		object(CLAZZ)._ivShipActDL = toArrApplL(dbc, "iv_ship_act_d_no");
		object(CLAZZ)._ivShipActDKey = object(CLAZZ)._ivShipActDL.createIndex(
			MST_IV_SHIP_ACT_D_R.$iv_d_no,
			MST_SHIP_ACT_D_R.$dlv_slip_d_no,
			MST_SHIP_ACT_D_R.$lot_no,
			MST_SHIP_ACT_D_R.$sublot_no,
			MST_SHIP_ACT_D_R.$gd_cd,
			MST_SHIP_ACT_D_R.$quality_typ,
			MST_SHIP_ACT_D_R.$stk_arrv_bp_cd,
			MST_SHIP_ACT_D_R.$stk_id_typ,
			MST_SHIP_ACT_D_R.$stk_bp_cd
		);
	}
	protected MCList<MST_SHIP_ACT_D_R> getIvShipActDL(ArrAct_DtlR r) {
		MCList<MST_SHIP_ACT_D_R> lst = 
			object(CLAZZ)._ivShipActDL.subList(object(CLAZZ)._ivShipActDKey,
				r.getString("iv_d_no"),
				r.dlv_slip_d_no(),
				r.lot_no(),
				r.sublot_no(),
				r.gd_cd(),
				r.quality_typ(),
				r.stk_arrv_bp_cd(),
				r.stk_id_typ(),
				r.stk_bp_cd());

		MCList<MST_SHIP_ACT_D_R> retL = lst.subList("arr_act_no", null);
		if (!isNull(r.arr_act_no())) {
			retL.addAll(lst.subList("arr_act_no", r.arr_act_no()));
		}
		retL.sort("arr_act_no", "iv_ship_act_d_no");
		return retL;
	}

	/**
	 * 通常品管理の仕入実績受払のデータを取得します。<br>
	 * （最新のもの）
	 * @param bindL 「arr_act_no」に入荷実績ＮＯを格納したリスト
	 * @return 仕入実績受払のデータ
	 */
	MCList<MST_PURC_ACT_IO_R> _purcActIoNrmlL;
	MCIndexKey _purcActIoNrmlKey;
	protected void initPurcActIoNrmlL(MCList<? extends MCRow> bindL) {
		MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_R t3 = MST_PURC_ACT_R.create("T3");

		MCList<MST_PURC_ACT_IO_R> dbc = MCList.create(MST_PURC_ACT_IO_R.class);
		MST_PURC_ACT_IO_R t = MST_PURC_ACT_IO_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.arr_act_no, t.base_unit_qty);
		dbc_bldr.addInnerJoin(t2, bracket(t.purc_act_d_no.eq(t2.purc_act_d_no)
				.and(t.purc_act_d_seq.eq(t2.purc_act_d_seq))));
		dbc_bldr.addInnerJoin(t3, bracket(t2.purc_act_no.eq(t3.purc_act_no)
				.and(t2.purc_act_seq.eq(t3.purc_act_seq))));
		dbc_bldr.setWhere(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		dbc_bldr.addWhereWithAnd(t.arr_act_no.eq(bind("arr_act_no")));
		dbSelect("MSBEL5930_MST_PURC_ACT_IO_S02", dbc, dbc_bldr, bindL);

		object(CLAZZ)._purcActIoNrmlL = dbc;
		object(CLAZZ)._purcActIoNrmlKey = object(CLAZZ)._purcActIoNrmlL.createIndex("arr_act_no");
	}
	protected MCList<MST_PURC_ACT_IO_R> getPurcActIoNrmlR(String arrActNo) {
		return object(CLAZZ)._purcActIoNrmlL.subList(object(CLAZZ)._purcActIoNrmlKey, arrActNo);
	}

	/**
	 * 通常品管理の売上実績受払のデータを取得します。<br>
	 * （最新のもの）
	 * @param bindL 「arr_act_no」に入荷実績ＮＯを格納したリスト
	 * @return 売上実績受払のデータ
	 */
	MCList<MST_SLS_ACT_IO_R> _slsActIoNrmlL;
	MCIndexKey _slsActIoNrmlKey;
	protected void initSlsActIoNrmlL(MCList<? extends MCRow> bindL) {
		MCList<MST_SLS_ACT_IO_R> dbc = MCList.create(MST_SLS_ACT_IO_R.class);
		MST_SLS_ACT_IO_R t = MST_SLS_ACT_IO_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_ACT_R t3 = MST_SLS_ACT_R.create("T3");
		dbc_bldr.setSelect(t.arr_act_no, t.base_unit_qty);
		dbc_bldr.addInnerJoin(t2, bracket(t.sls_act_d_no.eq(t2.sls_act_d_no)
				.and(t.sls_act_d_seq.eq(t2.sls_act_d_seq))));
		dbc_bldr.addInnerJoin(t3, bracket(t2.sls_act_no.eq(t3.sls_act_no)
				.and(t2.sls_act_seq.eq(t3.sls_act_seq))));
		dbc_bldr.setWhere(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		dbc_bldr.addWhereWithAnd(t.arr_act_no.eq(bind("arr_act_no")));
		dbSelect("MSBEL5930_MST_SLS_ACT_IO_S01", dbc, dbc_bldr, bindL);

		object(CLAZZ)._slsActIoNrmlL = dbc;
		object(CLAZZ)._slsActIoNrmlKey = object(CLAZZ)._slsActIoNrmlL.createIndex("arr_act_no");
	}
	protected MCList<MST_SLS_ACT_IO_R> getSlsActIoNrmlR(String arrActNo) {
		return object(CLAZZ)._slsActIoNrmlL.subList(object(CLAZZ)._slsActIoNrmlKey, arrActNo);
	}

	/**
	 * 出荷実績明細のデータを取得します。<br>
	 * （移動・移送元区分取得用）
	 * @param bindL 「dlv_slip_d_no」に納品書明細ＮＯを格納したリスト
	 * @return 出荷実績明細のデータ
	 */
	MCList<MST_SHIP_ACT_D_R> _shipActDL3;
	MCIndexKey _shipActDKey3;
	protected void initShipActDL3(MCList<? extends MCRow> bindL) {
		MST_SHIP_ALLOC_STS_R t1 = MST_SHIP_ALLOC_STS_R.create("T1");
		MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_PR_R t3 = MST_SHIP_PR_R.create("T3");
		MST_XFR_SCHD_R t4 = MST_XFR_SCHD_R.create("T4");
		MST_WG_RQST_PRMS_R t5 = MST_WG_RQST_PRMS_R.create("T5");
		MST_DLV_SLIP_D_R t6 = MST_DLV_SLIP_D_R.create("T6");

		MCList<MST_SHIP_ACT_D_R> dbc = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc.addStringColumn("xfr_src_typ");
		dbc.addStringColumn("slo_d_no");
		dbc.addStringColumn("xfr_schd_no");
		dbc.addStringColumn("wg_rqst_no");
		dbc.addStringColumn("prov_typ");
		dbc.addStringColumn("prov_basis_typ");
		dbc.addBooleanColumn("rqst_can_flg");
		dbc_bldr.setSelect(t.dlv_slip_d_no, t.ship_loc_cd, t4.xfr_schd_no, t4.xfr_src_typ,
				t4.slo_d_no, t5.wg_rqst_no, t6.dlv_slip_no, t6.prov_typ,
				t6.prov_basis_typ, t4.rqst_can_flg);
		dbc_bldr.addLeftOuterJoin(t1, bracket( t1.ship_alloc_sts_no.eq(t.ship_alloc_sts_no)));
		dbc_bldr.addLeftOuterJoin(t2, bracket(t2.ship_schd_no.eq(t1.ship_schd_no)
				.or(t2.ship_inst_d_no.eq(t1.ship_inst_d_no))));
		dbc_bldr.addLeftOuterJoin(t3, bracket( t3.ship_pr_no.eq(t2.ship_pr_no)));
		dbc_bldr.addLeftOuterJoin(t4, bracket( t4.xfr_schd_no.eq(t3.xfr_schd_no)));
		dbc_bldr.addLeftOuterJoin(t5, bracket( t5.wg_rqst_prms_no.eq(t4.xfr_src_no)));
		dbc_bldr.addInnerJoin(t6, bracket(
			t6.dlv_slip_d_no.eq(t.dlv_slip_d_no)
			.and(t6.dlv_slip_no.eq(t.dlv_slip_no))
			.and(t6.dlv_slip_seq.eq(t.dlv_slip_seq))
		));
		dbc_bldr.setWhere(t.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
		dbc_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBEL5930_MST_SHIP_ACT_D_S03", dbc, dbc_bldr, bindL);

		object(CLAZZ)._shipActDL3 = dbc;
		object(CLAZZ)._shipActDKey3 = object(CLAZZ)._shipActDL3.createIndex("dlv_slip_d_no");
	}
	protected MST_SHIP_ACT_D_R getShipActDR3(String dlvSlipDNo) {
		return object(CLAZZ)._shipActDL3.getFirst(object(CLAZZ)._shipActDKey3, dlvSlipDNo);
	}

	/**
	 * ロットＮＯキャッシュ
	 */
	protected MCList<ArrAct_DtlR> _lotCache = null;
	protected static void setLotCache(MCList<ArrAct_DtlR> dtlL) {
		object(CLAZZ)._lotCache = dtlL;
	}
	protected static MCList<ArrAct_DtlR> getLotCache() {
		return object(CLAZZ)._lotCache;
	}

	/**
	 * サブロットＮＯキャッシュ
	 */
	protected MCList<ArrAct_DtlR> _sublotCache = null;
	protected static void setSublotCache(MCList<ArrAct_DtlR> dtlL) {
		object(CLAZZ)._sublotCache = dtlL;
	}
	protected static MCList<ArrAct_DtlR> getSublotCache() {
		return object(CLAZZ)._sublotCache;
	}

	/** 取引先禁止マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_BP_STOP_R> _bpStpCache = null;
	/**
	 * 取引先禁止マスタをキャッシュする
	 * @param HdrL ヘッダチェック上り電文リスト
	 */
	protected static void initBpStpCache(MCList<ArrAct_DtlR> dtlL) {	
		object(CLAZZ)._initBpStpCache(dtlL);
	}	
	protected void _initBpStpCache(MCList<ArrAct_DtlR> dtlL) {
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_BP_STOP_R.create("T"));
		_bpStpCache = new FXUCL_MCDbcCache<MAM_BP_STOP_R>(dbc_bldr,dtlL,"sppl_cd");
	}
	/**
	 * 取引先禁止マスタキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MAM_BP_STOP_R> getBpStpCache() {
		return object(CLAZZ)._bpStpCache;
	}
	
	/** 品目禁止マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_ITM_STOP_R> _itmStopCache = null;
	/**
	 * 品目禁止マスタをキャッシュする
	 * @param dtlL 明細チェック上り電文リスト
	 */
	protected static void initStopItmCache(MCList<ArrAct_DtlR> dtlL) {
		object(CLAZZ)._initStopItmCache(dtlL);
	}
	protected void _initStopItmCache(MCList<ArrAct_DtlR> dtlL) {
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_ITM_STOP_R.create("T"));
		_itmStopCache = new FXUCL_MCDbcCache<MAM_ITM_STOP_R>(dbc_bldr, dtlL, ArrAct_DtlR.$itm_cd,
				ArrAct_DtlR.$itm_sub1, ArrAct_DtlR.$itm_sub2, ArrAct_DtlR.$itm_sub3);
	}
	/**
	 * 品目禁止マスタキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MAM_ITM_STOP_R> getItmStopCache() {
		return object(CLAZZ)._itmStopCache;
	}

	/**
	 * 支給実績のデータを取得します。<br>
	 * （最新のもの）
	 * @param bindL 「arr_act_no」に入荷予定ＮＯを格納したリスト
	 * @return 支給予定のデータ
	 */
	protected MCList<MST_PROV_ACT_R> getProvActL(MCList<ArrAct_DtlR> bindL) {
		insArrActWk(bindL);
		
		MSW_ARR_ACT_KEY_R w = MSW_ARR_ACT_KEY_R.create("W");
		MCList<MST_PROV_ACT_R> dbc = MCList.create(MST_PROV_ACT_R.class);
		MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelectAll();
		dbc_bldr.addInnerJoin(w, bracket( w.arr_act_no.eq(t.prov_src_act_no)));
		dbc_bldr.setWhere(t.prov_src_act_typ.in( value(MSC_PROV_SRC_ACT_TYP.SHIP.value()), value(MSC_PROV_SRC_ACT_TYP.NON_ARR_DDLV.value()), value(MSC_PROV_SRC_ACT_TYP.NCV_RCV_DDLV.value())));
		dbc_bldr.addWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		dbSelect("MSBEL5930_MST_PROV_ACT_S01", dbc, dbc_bldr);
		return dbc;
	}
	/**
	 * 返品元納品書明細を元に出荷予定を特定し、その出荷予定に対する出荷実績明細を取得する
	 * 
	 * @param lst	「ret_dlv_slip_d_no」を項目に持つリストを指定する
	 * @return 項目「retQty」に、出荷実績明細の数量のうち「返品できる数量」が設定されたリスト
	 */
	protected MCList<MST_SHIP_ACT_D_R> getShipRetLForIV(MCList<? extends MCRow> lst) {
		
		MCList<MST_SHIP_ACT_D_R> dbc = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
		MST_IV_SHIP_ACT_D_R S1W = MST_IV_SHIP_ACT_D_R.create("W");
		MST_SHIP_ALLOC_STS_R t2 = MST_SHIP_ALLOC_STS_R.create("T2");
		MST_SHIP_SCHD_R t3 = MST_SHIP_SCHD_R.create("T3");
		MST_SHIP_ALLOC_STS_R t4 = MST_SHIP_ALLOC_STS_R.create("T4");
		MST_SHIP_ACT_D_R t5 = MST_SHIP_ACT_D_R.create("T5");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc.addStringColumn(MST_SHIP_SCHD_R.$ship_schd_no);
		dbc.addStringColumn(MST_IV_SHIP_ACT_D_R.$iv_ship_act_d_no);
		dbc.addNumberColumn(MST_SHIP_SCHD_R.$iv_schd_qty);
		dbc_bldr.setDistinct(); // 出荷予定：出荷引当状況＝１：Ｎ、もしくは出荷引当状況：出荷実績明細＝１：Ｎの時、出荷予定が重複する
		dbc_bldr.setSelect(t.ship_act_d_no, t.dlv_slip_d_no, t.base_unit_qty,
				t.ship_ret_qty, t3.ship_schd_no, t3.iv_schd_qty,
				bracket(subQuery()
						.select(min(S1W.iv_ship_act_d_no))
						.from(S1W)
						.where(S1W.ship_act_d_no.eq(t.ship_act_d_no)))
						.as("iv_ship_act_d_no"));
		dbc_bldr.addInnerJoin(t2, bracket(t2.ship_alloc_sts_no.eq(t.ship_alloc_sts_no)));
		dbc_bldr.addInnerJoin(t3, bracket(t3.ship_schd_no.eq(t2.ship_schd_no)));
		dbc_bldr.addInnerJoin(t4, bracket(t4.ship_schd_no.eq(t3.ship_schd_no)));
		dbc_bldr.addInnerJoin(t5, bracket(t5.ship_alloc_sts_no.eq(t4.ship_alloc_sts_no)
				.and(t5.can_flg.eq(value(false)))));
		dbc_bldr.setWhere(t5.dlv_slip_d_no.eq(bind("ret_dlv_slip_d_no")));
		dbc_bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBEL5930_MST_SHIP_ACT_D_S04", dbc, dbc_bldr, lst.groupBy("ret_dlv_slip_d_no"), null);
		
		dbc.addNumberColumn("retQty");
		dbc.forEach(r -> r.setNumber("retQty", r.base_unit_qty().subtract(r.ship_ret_qty())));
		
		for (MCList<MST_SHIP_ACT_D_R> grp : dbc.groupList(MST_SHIP_SCHD_R.$ship_schd_no)) {
			MCNumber ivQty = grp.get(0).getNumber(MST_SHIP_SCHD_R.$iv_schd_qty);
			if (!ivQty.isPositive()) {
				continue;
			}
			
			// インボイス数を出荷実績明細の数量で消し込む
			// 消し込みできない分が「返品できる数量（retQty）」
			grp.sort(MST_IV_SHIP_ACT_D_R.$iv_ship_act_d_no, MST_SHIP_ACT_D_R.$ship_act_d_no);
			for (MST_SHIP_ACT_D_R r : grp) {
				MCNumber qty = r.base_unit_qty().subtract(r.ship_ret_qty());
				if (ivQty.gte(qty)) {
					r.setNumber("retQty", MCNumber.ZERO);
				}
				else {
					r.setNumber("retQty", qty.subtract(ivQty));
				}
				ivQty = ivQty.subtract(qty);
				if (!ivQty.isPositive()) {
					break;
				}
			}
		}
		if (dbc.isEmpty()) {
			dbc.setAll(getShipRetLForUplndIV(lst));
		}
		return dbc;
	}
	
	/**
	 * 返品元納品書明細を元に出荷実績明細の返品できる数量を取得する（インボイス取引対象計画外出荷）。
	 * @param lst	「ret_dlv_slip_d_no」を項目に持つリストを指定する
	 * @return 項目「retQty」に、出荷実績明細の数量のうち「返品できる数量」が設定されたリスト
	 */
	protected MCList<MST_SHIP_ACT_D_R> getShipRetLForUplndIV(MCList<? extends MCRow> lst) {
		
		MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R shipActD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MCTempView wIvShipActMap = createTempView("WIVSHIPACTMAP");
		MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		
		MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(shipActD);
		
		shipActDL_bldr.setSelect( shipActD.ship_act_d_no, shipActD.dlv_slip_d_no,
				shipActD.base_unit_qty.subtract(shipActD.ship_ret_qty).subtract(nvl(wIvShipActMap.pr("iv_qty"), value(0))).as("retQty"));
		shipActDL_bldr.addLeftOuterJoin(subQuery()
				.select(
						ivShipActMap.ship_act_d_no,
						sum(ivShipActMap.base_unit_qty).as("iv_qty")
					).from(ivShipActMap)
					.groupBy(ivShipActMap.ship_act_d_no)
					.view(wIvShipActMap) ,shipActD.ship_act_d_no.eq(wIvShipActMap.pr(ivShipActMap.ship_act_d_no)));
		shipActDL_bldr.setWhere(shipActD.dlv_slip_d_no.eq(bind("ret_dlv_slip_d_no")));
		
		dbSelect("MSBBL1330_MST_IV_SHIP_ACT_MAP_S01", shipActDL, shipActDL_bldr, lst);
		
		return shipActDL;
	}

	// ///////////////////////////////////////////////
	// キャッシュ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	protected String[] _sameLotGrpCols = {
		ArrAct_DtlR.$trd_ptn_typ,
		ArrAct_DtlR.$lot_no, ArrAct_DtlR.$sublot_no,
		ArrAct_DtlR.$itm_cd, ArrAct_DtlR.$itm_sub1, ArrAct_DtlR.$itm_sub2, ArrAct_DtlR.$itm_sub3,
		ArrAct_DtlR.$sno1 ,ArrAct_DtlR.$sno2 ,ArrAct_DtlR.$sno2 ,ArrAct_DtlR.$sno4,
		ArrAct_DtlR.$arr_dpt_cd, ArrAct_DtlR.$arr_dt, ArrAct_DtlR.$sppl_cd,
		ArrAct_DtlR.$bp_lot_no ,ArrAct_DtlR.$ship_fr_valid_dt ,ArrAct_DtlR.$po_d_no ,ArrAct_DtlR.$arr_schd_no
	};
	/**
	 * ロットＮＯ・サブロットＮＯ発番
	 */
	protected void doLot(MCList<ArrAct_DtlR> l) {

		MCList<ArrAct_DtlR>
			listLot = MCList.create(ArrAct_DtlR.class),
			listSublot = MCList.create(ArrAct_DtlR.class),
			sameLotL = MCList.create(ArrAct_DtlR.class),
			notSameLotL = MCList.create(ArrAct_DtlR.class),
			lotL  = MCList.create(ArrAct_DtlR.class),
			sublotL = MCList.create(ArrAct_DtlR.class);

		for (ArrAct_DtlR r : l) {
			// 取引パタンが「仕入」「経費購買」のみ同一ロットを認める
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {

				if (r.same_lot_flg()) {
					if (!isNull(r.arr_schd_no())) {
						MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
						r.lot_issue_row_flg(isSame(r.arr_loc_cd(), asR.arr_loc_cd()));
					}
					sameLotL.add(r);
					continue;
				}
			}
			notSameLotL.add(r);
		}

		Map<MCNumber, MCList<ArrAct_DtlR>> lotMap = new HashMap<>();

		// 同一ロット対象
		for(MCList<ArrAct_DtlR> lst : sameLotL.groupList(_sameLotGrpCols)) {
			lst.sort(SortType.DESC, ArrAct_DtlR.$lot_issue_row_flg);
			ArrAct_DtlR r = lst.get(0);
			if (r.crt_lot_flg() || isCrtSublot(r)){
				MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isNull(r.lot_no()) && r.crt_lot_flg()) {
					listLot.add(r);
				}
				if (isNull(r.sublot_no()) && !MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
					listSublot.add(r);
				}
				lotMap.put(r.peg_no(), lst);
			}
		}
		// 同一ロット対象以外
		for(ArrAct_DtlR r : notSameLotL) {
			if (r.crt_lot_flg() || isCrtSublot(r)){
				MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isNull(r.lot_no()) && r.crt_lot_flg()) {
					listLot.add(r);
				}
				if (isNull(r.sublot_no()) && !MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
					listSublot.add(r);
				}
				MCList<ArrAct_DtlR> lst = MCList.create(ArrAct_DtlR.class);
				lst.add(r);
				lotMap.put(r.peg_no(), lst);
			}
		}

		// ロットＮＯ・サブロットＮＯ発番
		if (!listLot.isEmpty()) {
			MCList<ElmArgsR> lotNumL = doSetNum(listLot, MAC_NUM_BIZ_TYP.LOT);
			for (ElmArgsR r : lotNumL) {
				MCList<ArrAct_DtlR>lst = lotMap.get(r.peg_no());
				if (!isNull(lst)) {
					lst.setString(ArrAct_DtlR.$lot_no, r.new_no());
					lotL.addAll(lst);
				}
			}
		}
		if (!listSublot.isEmpty()) {
			MCList<ElmArgsR> sublotNumL = doSetNum(listSublot, MAC_NUM_BIZ_TYP.SUBLOT);
			for (ElmArgsR r : sublotNumL) {
				MCList<ArrAct_DtlR>lst = lotMap.get(r.peg_no());
				if (!isNull(lst)) {
					lst.setString(ArrAct_DtlR.$sublot_no, r.new_no());
					sublotL.addAll(lst);
				}
			}
		}
		// Upd01で使うためキャッシュする
		setLotCache(lotL);
		setSublotCache(sublotL);
	}
	
	/**
	 * ロット発番はしないが、サブロット発番するか判定する
	 * @param r
	 * @return
	 */
	protected boolean isCrtSublot(ArrAct_DtlR r) {
		// ロット作成フラグがオンになるパタンは、仕入、経費購買、入荷(預り以外)のみ
		if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
			|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
			|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !isNull(r.purc_id_typ())) {

			MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(itmR.sublot_no_typ())
					&& isNull(r.sublot_no())) {
				return true;
			}
		}
		return false;
	}
	
	protected boolean isPurcEntryTgt(ArrAct_DtlR r) {
		return !r.sync_flg()
				&& !MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
				&& !MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
				&& (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) ;
	}
	
	protected MCList<ElmArgsR> doSetNum(MCList<ArrAct_DtlR> l, MAC_NUM_BIZ_TYP numBizTyp) {
		MCList<ElmArgsR> argL = MCList.create(ElmArgsR.class);
		for (ArrAct_DtlR r : l) {
			MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
			MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			MAM_LOC_R locR = getLocR(r.arr_loc_cd());

			ElmArgsR argR = ElmArgsR.create();
			// 入荷実績ＮＯ
			if (MAC_NUM_BIZ_TYP.isARRACT(numBizTyp)) {
				argR.trd_cd(r.trd_cd());
				argR.wg_cd(nvl(asR.getString("rqst_wg_cd"), locR.wg_cd()));
			}
			// ロットＮＯ・サブロットＮＯ
			else {
				argR.wg_cd(locR.wg_cd());
				argR.num_ptn_cd(itmR.lot_no_ptn_cd());
				argR.loc_cd(r.arr_loc_cd());
				argR.bp_cd(nvl(asR.getString("sppl_cd"), r.sppl_cd()));
				argR.str(null);
				argR.bp_lot_no(r.bp_lot_no());
				argR.sno1(r.sno1());
				argR.sno2(r.sno2());
				argR.sno3(r.sno3());
				argR.sno4(r.sno4());
				if (MAC_NUM_BIZ_TYP.isSUBLOT(numBizTyp)) {
					argR.num_ptn_cd(itmR.sublot_no_ptn_cd());
					argR.lot_no(r.lot_no());
				}
			}
			argR.itm_cd(r.itm_cd());
			argR.itm_sub1(r.itm_sub1());
			argR.itm_sub2(r.itm_sub2());
			argR.itm_sub3(r.itm_sub3());
			argR.co_cd(getCo().co_cd());
			argR.site_cd(locR.site_cd());
			argR.dt(r.arr_tm().trunc(MCDateFieldType.DAY));
			argR.peg_no(r.peg_no());
			argL.add(argR);
		}
		setNum(numBizTyp, argL);
		
		return argL;
	}

	/**
	 * 取引パタン区分ロウマッチャー
	 */
	public class TrdPtnTypMatcher implements MCRowMatcher<ArrAct_DtlR> {

		MAC_TRD_PTN_TYP[] _trdPtnTyp;
		
		public TrdPtnTypMatcher(MAC_TRD_PTN_TYP... trdPtnTyp) {
			_trdPtnTyp = trdPtnTyp;
		}

		@Override
		public boolean match(ArrAct_DtlR r) {
			for (MAC_TRD_PTN_TYP typ : _trdPtnTyp) {
				if (isSame(r.trd_ptn_typ(), typ.value())) {
					return true ;
				}
			}
			return false;
		}
	}
	
	/**
	 * 検査予定サービス.区分取得（入庫）
	 * 在庫検査区分の設定
	 */
	protected void callInspSchdSrch02(MCList<ArrAct_DtlR> l) {
		if (l.isEmpty()) return ;
		MSBFL_InspSchdService.InspSchd_Srch02 o = MSBFL_InspSchdService.crtInspSchd_Srch02();
		setAll(o.up0(), l, createMap_InspSchd_Srch02_CndR_ArrAct_DtlR());
		o.exec();
		MCIndexKey idxkey = l.createIndex(ArrAct_DtlR.$peg_no);
		for(InspSchd_Srch02_CndR r : o.down0()) {
			if (!isNull(r.stk_insp_typ())) {
				ArrAct_DtlR row = l.getFirst(idxkey, r.peg_no());
				row.stk_insp_typ(r.stk_insp_typ());
			}
		}
	}
	protected Map_InspSchd_Srch02_CndR_ArrAct_DtlR<InspSchd_Srch02_CndR,ArrAct_DtlR> createMap_InspSchd_Srch02_CndR_ArrAct_DtlR() {
		return new Map_InspSchd_Srch02_CndR_ArrAct_DtlR<InspSchd_Srch02_CndR, ArrAct_DtlR>();
	}
	public class Map_InspSchd_Srch02_CndR_ArrAct_DtlR<D extends InspSchd_Srch02_CndR, S extends ArrAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspSchd_Srch02_CndR.$peg_no, ArrAct_DtlR.$peg_no);
			addColumnPathMap(InspSchd_Srch02_CndR.$src_no3, ArrAct_DtlR.$arr_schd_no);
			addColumnPathMap(InspSchd_Srch02_CndR.$src_no4, ArrAct_DtlR.$arr_act_no);
			addColumnPathMap(InspSchd_Srch02_CndR.$itm_cd, ArrAct_DtlR.$itm_cd);
			addColumnPathMap(InspSchd_Srch02_CndR.$itm_sub1, ArrAct_DtlR.$itm_sub1);
			addColumnPathMap(InspSchd_Srch02_CndR.$itm_sub2, ArrAct_DtlR.$itm_sub2);
			addColumnPathMap(InspSchd_Srch02_CndR.$itm_sub3, ArrAct_DtlR.$itm_sub3);
			addColumnPathMap(InspSchd_Srch02_CndR.$quality_typ, ArrAct_DtlR.$quality_typ);
			addColumnPathMap(InspSchd_Srch02_CndR.$sppl_cd, ArrAct_DtlR.$sppl_cd);
			addColumnPathMap(InspSchd_Srch02_CndR.$maker_cd, ArrAct_DtlR.$maker_cd);
			addColumnPathMap(InspSchd_Srch02_CndR.$loc_cd, ArrAct_DtlR.$arr_loc_cd);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());

			dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
			dest.src_no1(asR.getString("po_d_no"));
			dest.gr_dt(src.arr_tm().trunc(MCDateFieldType.DAY));
			dest.not_stk_flg(MAC_STK_MNG_TYP.isNOT_MNG(src.stk_mng_typ()));
		}
	}
	
	/**
	 * ロットが一致した場合にTRUEを返却する
	 */
	protected boolean setLotNotChangeFlg(String lot, String oldlot){
		if(isNull(lot) || isNull(oldlot)) {
			return false;
		}
		if(isSame(lot, oldlot)) {
			return true;
		}
		return false;
	}
	/**
	 * 暫定買掛か判定する
	 * @param arrActNo 入荷実績ＮＯ
	 * @param spplCd 発注先ＣＤ
	 * @param arrPtnTyp 入荷パタン区分
	 * @return 暫定買掛の場合trueを返却する
	 */
	protected boolean isTempAp(String arrActNo, String spplCd, String arrPtnTyp) {
		if (isNull(arrActNo)) {
			// 以下の場合はtrue
			// ・入荷パタンが「未着管理」でない
			// ・発注先が受領インボイス取引対象
			// ・会社マスタの暫定買掛使用ＦＬＧがオン
			MAM_BP_R bpR = getBpR(spplCd);
			if (!MSC_ARR_PTN_TYP.isN_YET_ARR(arrPtnTyp)
					&& bpR.sppl_iv_flg()
					&& getCo().temp_ap_use_flg()) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			MST_PURC_ACT_R paR = getPurcAct(arrActNo);
			if (isNull(paR)) {
				// 入荷済で未仕入の場合、登録時に暫定買掛でなかったと判断
				return false;
			}
			else {
				// 仕入の場合、仕入実績の暫定買掛を設定
				return (paR.getBooleanNE("temp_ap_flg"));
			}
		}
	}
	
	/**
	 * 暫定買掛で取消計上日が締前の場合、計上日を返却する
	 */
	protected MCDate getCanAcDt(ArrAct_DtlR r) {
		if (r.temp_ap_flg() && !isNull(r.arr_act_no())) {
			MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();
			Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
			cndR.ac_dt(r.can_ac_dt());
			cndR.purc_cls_chk_flg(true);
			op.up0().add(cndR);
			op.up1().no_msg_flg(true);
			op.exec();
			if (op.down0().get(0).err_flg()) {
				return r.ac_dt();
			}
		}
		return r.can_ac_dt();
	}

	/**
	 * ArrAct_Upd03オペレーション.<p>
	 *
	 * 仕入実績受払に対応する入荷実績を更新する。<br>
	 */
	public class ArrAct_Upd03 extends MSBEL_ArrActService_MC_A.ArrAct_Upd03 {
		
		protected MCList<ArrAct_DtlR> _updArrActL;
	
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			initProc();
			initArrAct();
			editArrAct();
			updArrAct();
			callIoAct();
		}
		
		/**
		 * 初期処理
		 */
		protected void initProc() {
			_updArrActL = MCList.create(ArrAct_DtlR.class);
		}
		
		protected void initArrAct() {
			initArrActL(up0());
			MCList<ArrAct_DtlR> arrActL = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR up0R : up0()) {
				for (MST_ARR_ACT_R actR : getArrActL(up0R.purc_act_io_no())) {
					ArrAct_DtlR arrActR = arrActL.add();
					arrActR.arr_act(actR);
				}
			}
			initArrActCache(arrActL);
		}
		
		protected void initCache() {
			initArrSchdCache(_updArrActL);
			initSlsRetSchdDL(_updArrActL);
			initPurcActIoL(_updArrActL);
			initPoDCache(_updArrActL);
			initLocCache(_updArrActL);
			initItmUnitCache(_updArrActL);
		}
		
		protected void editArrAct() {
			for (ArrAct_DtlR up0R : up0()) {
				for (MST_ARR_ACT_R r : getArrActL(up0R.purc_act_io_no())) {
					MST_ARR_ACT_R actR = getArrActR(r.arr_act_no());
					
					ArrAct_DtlR arrActR = _updArrActL.add();
					arrActR.arr_act(actR);
					
					arrActR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					arrActR.arr_act_rev(arrActR.arr_act_rev().add(1));
					
					MCDate acDt = getAcDt(arrActR.ac_dt());
					arrActR.ac_dt(acDt);
					arrActR.can_ac_dt(acDt);
					
					arrActR.setAttributes(up0R);
				}
			}
			
			setDpt(_updArrActL, ArrAct_DtlR.$bd_dpt_cd, ArrAct_DtlR.$ac_dt);
			
			initCache();
			
			for (ArrAct_DtlR arrActR : _updArrActL) {
				MST_ARR_SCHD_R arrSchdR = getArrSchdR(arrActR.arr_schd_no());
				arrActR.rcpt_iv_no(arrSchdR.rcpt_iv_no());
				arrActR.arr_ptn_typ(arrSchdR.arr_ptn_typ());
				arrActR.mfg_inst_no(arrSchdR.mfg_inst_no());
				arrActR.pre_outsrc_act_flg(arrSchdR.pre_outsrc_act_flg());
				
				if (!isNull(arrActR.bd_dpt_cd())) {
					MAM_DPT_R bdDptR = getDptR(arrActR.bd_dpt_cd(), arrActR.ac_dt());
					arrActR.bd_wg_cd(bdDptR.wg_cd());
				}
			}
			
			setAmtForYet(_updArrActL);
		}
		
		protected void updArrAct() {
			MST_ARR_ACT_R arrAct = MST_ARR_ACT_R.create("ARRACT");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(arrAct);
			bldr.setSet(
				arrAct.arr_act_rev,
				arrAct.ac_dt,
				arrAct.bd_dpt_cd,
				arrAct.bd_wg_cd,
				arrAct.trd_cur_amt,
				arrAct.trd_cur_tax_amt,
				arrAct.base_cur_amt,
				arrAct.base_cur_tax_amt,
				arrAct.ptax_cur_amt,
				arrAct.ptax_cur_tax_amt
			);
			dbUpdateKey("MSBEL5930_MST_ARR_ACT_U04", _updArrActL, bldr);
		}
		
		protected void callIoAct() {
			MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
			setAll(o.up0(), _updArrActL, createMap_IoAct_Ins01_DtlR_ArrAct_DtlR());
			o.exec();
		}
	}
	
	protected boolean isCloseStk(MCDate acDt) {
		MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();
		Cl_Chk03_CndR cndR = op.up0().add();
		cndR.ac_dt(acDt);
		cndR.stk_cls_chk_flg(true);
		op.up1().no_msg_flg(true);
		op.exec();
		
		return op.down0().get(0).err_flg();
	}
	
	/**
	 * ArrAct_Chk03オペレーション.<p>
	 *
	 * 更新（未着品入荷）前のチェック処理を実行する<br>
	 */
	public class ArrAct_Chk03 extends MSBEL_ArrActService_MC_A.ArrAct_Chk03 {
		
		protected MCList<ArrAct_DtlR> _updArrActL;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			initProc();
			initArrAct();
			editArrAct();
			check();
			setDown();
		}
		
		protected void initProc() {
			_updArrActL = MCList.create(ArrAct_DtlR.class);
		}
		
		protected void initArrAct() {
			initArrActL(up0());
			MCList<ArrAct_DtlR> arrActL = MCList.create(ArrAct_DtlR.class);
			for (ArrAct_DtlR up0R : up0()) {
				for (MST_ARR_ACT_R actR : getArrActL(up0R.purc_act_io_no())) {
					ArrAct_DtlR arrActR = arrActL.add();
					arrActR.arr_act(actR);
				}
			}
			initArrActCache(arrActL);
		}
		
		protected void editArrAct() {
			for (ArrAct_DtlR up0R : up0()) {
				for (MST_ARR_ACT_R r : getArrActL(up0R.purc_act_io_no())) {
					MST_ARR_ACT_R actR = getArrActR(r.arr_act_no());
					
					ArrAct_DtlR arrActR = _updArrActL.add();
					arrActR.arr_act(actR);
					
					MCDate acDt = getAcDt(arrActR.ac_dt());
					arrActR.ac_dt(acDt);
					
					arrActR.setAttributes(up0R);
				}
			}
		}
		
		protected void check() {
			chkDpt();
		}
		
		protected void chkDpt() {
			setDpt(_updArrActL, ArrAct_DtlR.$bd_dpt_cd, ArrAct_DtlR.$ac_dt);
			
			// 変換後の負担部門に対するチェック
			chkBdDpt(_updArrActL);
			
			MCIndexKey idx = up0().createIndex(ArrAct_DtlR.$purc_act_io_no);
			for (ArrAct_DtlR arrActR : _updArrActL) {
				if (arrActR.err_flg()) {
					ArrAct_DtlR up0R = up0().getFirst(idx, arrActR.purc_act_io_no());
					if (!isNull(up0R)) {
						up0R.err_flg(true);
					}
				}
			}
		}
		
		protected void chkBdDpt(MCList<ArrAct_DtlR> arrActL) {
			for (ArrAct_DtlR r : arrActL) {
				chkBdDpt(r);
			}
		}
		
		protected void chkBdDpt(ArrAct_DtlR arrActR) {
			if (!isNull(arrActR.bd_dpt_cd())) {
				MAM_DPT_R dptR = getDptR(arrActR.bd_dpt_cd(), arrActR.ac_dt());
				if (isNull(dptR) || !dptR.bd_dpt_flg()) {
					MCMessagePool.add(
						new MCMessage(arrActR, null, MSBEL0356,
							toYMDString(arrActR.ac_dt()), arrActR.bd_dpt_cd(),
							arrActR.arr_act_no(), toDispGUIIndex(arrActR))
					);
					arrActR.err_flg(true);
				}
			}
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	protected Map<MCDate, MCDate> _acDtMap;
	protected static MCDate getAcDt(MCDate acDt) {
		return object(CLAZZ)._getAcDt(acDt);
	}
	protected MCDate _getAcDt(MCDate acDt) {
		if (_acDtMap == null) {
			_acDtMap = new HashMap<>();
		}
		
		if (!_acDtMap.containsKey(acDt)) {
			if (isCloseStk(acDt)) {
				_acDtMap.put(acDt, getToday());
			}
			else {
				_acDtMap.put(acDt, acDt);
			}
		}
		
		return _acDtMap.get(acDt);
	}
	
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dptCache;
	protected static MAM_DPT_R getDptR(String dptCd, MCDate baseDt) {
		return object(CLAZZ)._getDptR(dptCd, baseDt);
	}
	protected MAM_DPT_R _getDptR(String dptCd, MCDate baseDt) {
		if (_dptCache == null) {
			_dptCache = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
				MCQueryApiBuilder.create(MAM_DPT_R.create("DPT"))
			);
		}
		return _dptCache.get(baseDt, dptCd);
	}
	
	protected void setShipFrValidDtErr(ArrAct_DtlR r, MCList<ArrAct_DtlR> list, MAM_ITM_R itmR, InspSchd_Srch01_CndR itmInspR, MCMessageList msgL) {
		if (!MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
			&& !MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
			&& !(MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ()))){
			return;
		}
		
		if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
			if (MAC_LMT_DT_FRM_TYP.isARR_DT(itmInspR.lmt_dt_frm_typ())
					|| MAC_LMT_DT_FRM_TYP.isDPND_SHIP_FR(itmInspR.lmt_dt_frm_typ())) {
				// ロットに紐づく入荷実績の数が1件の場合はチェック対象外
				MCNumber arrActCnt = getArrActCnt(r);
				if (arrActCnt.eq(MCNumber.ONE)) {
					return;
				}
			}
		}
		
		if (isNull(r.ship_fr_valid_dt())) {
			return;
		}
		
		if (itmR.lmt_ctl_flg() && MAC_LMT_DT_FRM_TYP.isDPND_SHIP_FR(itmInspR.lmt_dt_frm_typ())) {
			
			MST_LOT_R lotR = getLot(r);
			
			if (lotR.isEmpty()) {
				return;
			}
			
			if (lotR.unreg_lmt_flg() || isNull(lotR.vld_dt()) || isNull(lotR.lmt_dt())) {
				return;
			}
			
			// 出荷元期限がロット情報と異なる場合はエラー
			if (!isSame(r.ship_fr_valid_dt(), lotR.vld_dt())) {
				r.err_flg(true);
				msgL.add(new MCMessage(r, null, MSBEL1301, toYMDString(r.ship_fr_valid_dt()), toYMDString(lotR.vld_dt()), toYMDString(lotR.lmt_dt()), toDispGUIIndex(r)));
			}
		}
	}
	
	protected MCNumber getArrActCnt(ArrAct_DtlR r) {
		
		// ロットから入荷実績を取得
		MST_ARR_ACT_R actR = MST_ARR_ACT_R.create("T");
		MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(actR);
		String cntStr = "cnt";
		actR.addNumberColumn(cntStr);
		actR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
		actR_bldr.setWhere(actR.itm_cd.eq(bind("1")), r.itm_cd());
		actR_bldr.addWhereWithAnd(actR.itm_sub1.eq(bind("1")), r.itm_sub1());
		actR_bldr.addWhereWithAnd(actR.itm_sub2.eq(bind("1")), r.itm_sub2());
		actR_bldr.addWhereWithAnd(actR.itm_sub3.eq(bind("1")), r.itm_sub3());
		actR_bldr.addWhereWithAnd(actR.lot_no.eq(bind("1")), r.lot_no());
		actR_bldr.addWhereWithAnd(actR.sublot_no.eq(bind("1")), r.sublot_no());
		actR_bldr.addWhereWithAnd(actR.can_flg.eq(value(false)));
		dbSelect("MSBEL5930_MST_ARR_ACT_S07", actR, actR_bldr);
		
		// 取得結果がない場合を考慮し、0を設定する
		if (isNull(actR)) {
			actR.setNumberNE(cntStr, MCNumber.ZERO);
		}
		
		return actR.getNumber(cntStr);
	}
	
	protected MST_LOT_R getLot(ArrAct_DtlR r) {
		
		// ロット情報を取得
		MST_LOT_R lotR = MST_LOT_R.create();
		MST_LOT_R lotL_t = MST_LOT_R.create("T");
		MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(lotL_t);
		lotL_bldr.setSelect(lotL_t.unreg_lmt_flg);
		lotL_bldr.addSelect(lotL_t.itm_cd);
		lotL_bldr.addSelect(lotL_t.itm_sub1);
		lotL_bldr.addSelect(lotL_t.itm_sub2);
		lotL_bldr.addSelect(lotL_t.itm_sub3);
		lotL_bldr.addSelect(lotL_t.lot_no);
		lotL_bldr.addSelect(lotL_t.sublot_no);
		lotL_bldr.addSelect(lotL_t.vld_dt);
		lotL_bldr.addSelect(lotL_t.lmt_dt);
		dbSelectKey("MSBEL5930_MST_LOT_S01", lotR, lotL_bldr, r);
		
		return lotR;
	}
	
	protected void setValidDtNotSameErr(ArrAct_DtlR r, MCList<ArrAct_DtlR> list, InspSchd_Srch01_CndR itmInspR, MCMessageList msgL) {
		// 同一ロットのサブリストを作成
		String[] keys = new String[] {
				MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1,
				MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
				MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no
		};
		Comparable<?>[] vals = new Comparable[] {
				r.itm_cd(), r.itm_sub1(),
				r.itm_sub2(), r.itm_sub3(),
				r.lot_no(), r.sublot_no()
		};
		MCList<ArrAct_DtlR> lotList = list.subList(keys, vals);
		
		// 複数件存在する場合
		if (lotList.size() > 1) {
			// 新規 or 更新
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				for (ArrAct_DtlR lotR : lotList) {
					if (MAC_LMT_DT_FRM_TYP.isARR_DT(itmInspR.lmt_dt_frm_typ())) {
						// 入荷実績日の場合、入荷日時が異なる場合はエラー
						if (!r.arr_tm().eqDate(lotR.arr_tm())) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBEL1302, r.arr_schd_no(), toDispGUIIndex(r)));
							break;
						}
					}
					else {
						// 出荷元期限が異なる場合はエラー
						if (!isNull(r.ship_fr_valid_dt())
								&& !r.ship_fr_valid_dt().eqDate(lotR.ship_fr_valid_dt())) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBEL1302, r.arr_schd_no(), toDispGUIIndex(r)));
							break;
						}
					}
				}
			}
		}
	}

	//FMCB CUSTOM END
}