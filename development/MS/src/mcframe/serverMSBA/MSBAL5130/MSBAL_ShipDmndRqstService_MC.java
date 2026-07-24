package mcframe.serverMSBA.MSBAL5130;

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
import mcframe.serverFSBD.FSBDL0030.Srch01_RsltR;
import mcframe.serverMSBA.MSBAL5130.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBA.MSBAL5100.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBD.MSBDL5040.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverMSBD.MSBDL5090.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5200.*;
import mcframe.serverMSUC.MSUCL0110.MSUCL_StrLnUtil;
import mcframe.serverMSUC.MSUCL0110.StrLnUtil_Srch01_CndR;

import static mcframe.serverCore.requester.MCRequestObject.*;

import java.util.Map;
import java.util.HashMap;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBAL_ShipDmndRqstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBAL_ShipDmndRqstService_MC extends MSBAL_ShipDmndRqstService_MC_A{
	//FMCB CUSTOM START
	protected String _sysParm = getSysParm("MASTER_DT_BASE");

	/**
	 * ShipDmndRqst_Upd01オペレーション.<p>
	 *
	 * 発注予定、移動・移送予定を登録するか、ＷＧ間依頼を登録するか制御する。<br>
	 */
	public class ShipDmndRqst_Upd01 extends MSBAL_ShipDmndRqstService_MC_A.ShipDmndRqst_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			sprtItmDtl();
			setSrcTyp();
			callNextSrv();
			down0().setAll(up0());
		}
		
		/**
		 * 品目詳細マスタをキャッシュより補完する。
		 */
		protected void sprtItmDtl() {
			for(ShipDmndRqst_Upd01_DtlR r : up0()) {
				// 場所マスタよりワーキンググループを補完
				MAM_LOC_R locR = getLocR(r.gr_loc_cd());
				if(!isNull(locR)) {
					r.gr_loc_wg_cd(locR.wg_cd());
				}

				// 購買依頼で受注からの依頼の場合、外注の可能性がある。
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					if(MSC_WG_RQST_SRC_TYP.isSLO(r.wg_rqst_src_typ())) {
						if (isSame(_sysParm, "1")) {
							MCDate baseDt = r.avl_schd_dt();
							MAM_ITM_DTL_R itmDtlR = getPurcItmDtlR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_wg_cd(), baseDt, r.sppl_cd(), r.maker_cd());
							// 取得できない場合は、外注ではなく、購買
							itmDtlR = getPoSchdOutsrcItmDtlR(itmDtlR, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_wg_cd(), baseDt, r.sppl_cd(), nvl(r.maker_cd(),MAC_STR.NULL_VAL.value()), r.slo_d_no(), r.data_crud_typ());
							if(isNull(itmDtlR)) {
								r.mfg_loc_cd(MAC_STR.NULL_VAL.value());
								r.bom_ptn(MAC_STR.NULL_VAL.value());
							}
							else {
								r.mfg_loc_cd(itmDtlR.mfg_loc_cd());
								r.bom_ptn(itmDtlR.bom_ptn());
							}
						} else {
							MCDate baseDt = getBaseDate(r, true);
							if (isNull(baseDt)) {
								r.mfg_loc_cd(MAC_STR.NULL_VAL.value());
								r.bom_ptn(MAC_STR.NULL_VAL.value());
							}
							else {
								MAM_ITM_DTL_R itmDtlR = getPurcItmDtlR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_wg_cd(), baseDt, r.sppl_cd(), nvl(r.maker_cd(),MAC_STR.NULL_VAL.value()));
								// 取得できない場合は、外注ではなく、購買
								itmDtlR = getPoSchdOutsrcItmDtlR(itmDtlR, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_wg_cd(), baseDt, r.sppl_cd(), nvl(r.maker_cd(),MAC_STR.NULL_VAL.value()), r.slo_d_no(), r.data_crud_typ());
								if(isNull(itmDtlR)) {
									r.mfg_loc_cd(MAC_STR.NULL_VAL.value());
									r.bom_ptn(MAC_STR.NULL_VAL.value());
								}
								else {
									r.mfg_loc_cd(itmDtlR.mfg_loc_cd());
									r.bom_ptn(itmDtlR.bom_ptn());
								}
							}
						}
					}
				}
				//　ＷＧ間依頼種類区分が未指定の場合のみ、品目詳細マスタより補完する。
				if(isNull(r.wg_rqst_typ())) {

					MAM_ITM_DTL_R itmDtlR =null;
					if (isSame(_sysParm, "1")) {
						// 品目詳細マスタが取得できない場合、エラー
						MCDate baseDt = r.avl_schd_dt();
						itmDtlR = getItmDtlR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_wg_cd(), baseDt);
					} else {
						// マスタ参照日取得
						MCDate baseDt = getBaseDate(r, false);
						if (isNull(baseDt)) {
							continue;
						}
						itmDtlR = getItmDtlR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_wg_cd(), baseDt);
					}
					// チェック時にエラーになっているはずなので、該当ケースなし
					if(isNull(itmDtlR)) {
						continue;
					}
					// 発注先が設定されている場合
					if(!isSame(nvl(itmDtlR.sppl_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
						r.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
						r.rqst_to_wg_cd(itmDtlR.rqst_wg_cd());
						r.sppl_cd(itmDtlR.sppl_cd());
						r.maker_cd(itmDtlR.maker_cd());
					}
					// 製造場所、および発注先が指定されている場合
					else if(!isSame(nvl(itmDtlR.getStringNE("loc_sppl_cd"), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
						r.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
						r.rqst_to_wg_cd(itmDtlR.rqst_wg_cd());
						r.sppl_cd(itmDtlR.getStringNE("loc_sppl_cd"));
						r.maker_cd(itmDtlR.getStringNE("loc_maker_cd"));
						r.mfg_loc_cd(itmDtlR.mfg_loc_cd());
						r.bom_ptn(itmDtlR.bom_ptn());
					}
					// 依頼先場所が指定されている場合
					else if(!isSame(itmDtlR.rqst_loc_cd(), MAC_STR.NULL_VAL.value())) {
						r.wg_rqst_typ(MSC_WG_RQST_TYP.XFR.value());
						r.rqst_to_wg_cd(itmDtlR.getStringNE("loc_wg_cd"));
						r.gi_loc_cd(itmDtlR.rqst_loc_cd());
					}
				}
				
				if(isNull(r.rqst_to_wg_cd())) {
					r.rqst_to_wg_cd(r.rqst_fr_wg_cd());
				}
				if(isNull(r.gr_str_ln_cd())) {
					r.gr_str_ln_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * 発注予定作成元区分、移動・移送元区分、元ＮＯを補完する。
		 */
		protected void setSrcTyp() {
			for(ShipDmndRqst_Upd01_DtlR r : up0()) {
				// 購買依頼の場合、発注予定作成元区分を補完
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					if(MSC_WG_RQST_SRC_TYP.isSLO(r.wg_rqst_src_typ())) {
						r.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.SLO.value());
					}
					else if(MSC_WG_RQST_SRC_TYP.isORD(r.wg_rqst_src_typ())) {
						r.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.PPLN.value());
					}
					else if(MSC_WG_RQST_SRC_TYP.isOP_RPL(r.wg_rqst_src_typ())) {
						r.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.OP.value());
					}
					r.po_schd_src_no(r.wg_rqst_src_no());
				}
				// 移送依頼の場合、移動・移送元区分を補完
				else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					if(MSC_WG_RQST_SRC_TYP.isSLO(r.wg_rqst_src_typ())) {
						r.xfr_src_typ(MSC_XFR_SRC_TYP.SLO.value());
					}
					else if(MSC_WG_RQST_SRC_TYP.isORD(r.wg_rqst_src_typ())) {
						r.xfr_src_typ(MSC_XFR_SRC_TYP.ITM_ORD.value());
					}
					else if(MSC_WG_RQST_SRC_TYP.isOP_RPL(r.wg_rqst_src_typ())) {
						r.xfr_src_typ(MSC_XFR_SRC_TYP.OP_RPL.value());
					}
					r.xfr_src_no(r.wg_rqst_src_no());
				}
			}
		}
		
		/**
		 * ＷＧを跨ぐか判断し、後続のサービスを実行する。
		 */
		protected void callNextSrv() {
			MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd02 shipDmndRqstUpd02 = MSBAL_ShipDmndRqstService.crtShipDmndRqst_Upd02();
			MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd02 delShipDmndRqstUpd02 = MSBAL_ShipDmndRqstService.crtShipDmndRqst_Upd02();
			MSBAL_WgRqstService.WgRqst_Upd01 wgRqstUpd01 = MSBAL_WgRqstService.crtWgRqst_Upd01();
			MSBAL_WgRqstService.WgRqst_Upd01 delWgRqstUpd01 = MSBAL_WgRqstService.crtWgRqst_Upd01();
			MSBBL_SloStsRegService.SloSts_Ins01 sloStsIns01 = MSBBL_SloStsRegService.crtSloSts_Ins01(); 
			
			// 同一ＷＧ内の場合は、前回の依頼と変更があるか判断するため、発注予定、移動・移送予定を取得
			MCList<ShipDmndRqst_Upd01_DtlR> poSchdBindL = MCList.create(ShipDmndRqst_Upd01_DtlR.class);
			MCList<ShipDmndRqst_Upd01_DtlR> xfrSchdBindL = MCList.create(ShipDmndRqst_Upd01_DtlR.class);
			for(ShipDmndRqst_Upd01_DtlR r : up0().subList(ShipDmndRqst_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value())) {
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					poSchdBindL.add(r);
				}
				else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					xfrSchdBindL.add(r);
				}
			}
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			// 発注予定を取得
			if(!poSchdBindL.isEmpty()) {
				MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
				MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
				poSchdL_bldr.setWhere(t.po_schd_src_typ.eq(bind("po_schd_src_typ")));
				poSchdL_bldr.addWhereWithAnd(t.po_schd_src_no.eq(bind("po_schd_src_no")));
				poSchdL_bldr.addWhereWithAnd(t.rqst_can_flg.eq(value(false)));
				poSchdL_bldr.addWhereWithAnd(t.split_src_schd_no.isNull());
				dbSelectForUpdate("MSBAL5130_MST_PO_SCHD_S01", poSchdL, poSchdL_bldr, poSchdBindL);
			}
			MCIndexKey poSchdKey = poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_src_typ, MST_PO_SCHD_R.$po_schd_src_no);

			// 移動・移送予定を取得
			MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
			if(!xfrSchdBindL.isEmpty()) {
				MST_XFR_SCHD_R t2 = MST_XFR_SCHD_R.create("T");
				MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(t2);
				xfrSchdL_bldr.setWhere(t2.xfr_src_typ.eq(bind("xfr_src_typ")));
				xfrSchdL_bldr.addWhereWithAnd(t2.xfr_src_no.eq(bind("xfr_src_no")));
				xfrSchdL_bldr.addWhereWithAnd(t2.rqst_can_flg.eq(value(false)));
				dbSelectForUpdate("MSBAL5130_MST_XFR_SCHD_S01", xfrSchdL, xfrSchdL_bldr, xfrSchdBindL);
			}
			MCIndexKey xfrSchdKey = xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_src_typ, MST_XFR_SCHD_R.$xfr_src_no);

			// ＷＧ間依頼を取得
			MCList<ShipDmndRqst_Upd01_DtlR> bindL = MCList.create(ShipDmndRqst_Upd01_DtlR.class);
			bindL.addAll(up0().subList(ShipDmndRqst_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value()));
			bindL.addAll(up0().subList(ShipDmndRqst_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value()));

			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MCIndexKey wgRqstKey = wgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_src_typ, MST_WG_RQST_R.$wg_rqst_src_no);
			if(!bindL.isEmpty()) {
				MST_WG_RQST_R t3 = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder wgRqstL_bldr = MCQueryApiBuilder.create(t3);
				wgRqstL_bldr.setWhere(t3.wg_rqst_src_typ.eq(bind("wg_rqst_src_typ")));
				wgRqstL_bldr.addWhereWithAnd(t3.wg_rqst_src_no.eq(bind("wg_rqst_src_no")));
				wgRqstL_bldr.addWhereWithAnd(t3.can_flg.eq(value(false)));
				dbSelectForUpdate("MSBAL5130_MST_WG_RQST_S01", wgRqstL, wgRqstL_bldr, bindL);
				wgRqstKey = wgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_src_typ, MST_WG_RQST_R.$wg_rqst_src_no, MST_WG_RQST_R.$wg_rqst_typ);
			}

			for(ShipDmndRqst_Upd01_DtlR r : up0()) {
				// 前回の依頼先ＷＧを取得
				if(r.abort_flg() || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(wgRqstKey, r.wg_rqst_src_typ(), r.wg_rqst_src_no(), r.wg_rqst_typ());
					if(!isNull(wgRqstR)) {
						r.rqst_to_wg_cd(wgRqstR.rqst_to_wg_cd());
					}
				}

				// ＷＧを跨がない場合、当サービスのShipDmndRqst_Upd02を実行
				if(isSame(r.rqst_fr_wg_cd(), r.rqst_to_wg_cd())) {
					// 出荷依頼の場合は、既に予定が作成されているため、次処理はしない。
					if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						boolean wgRqstExists = false;
						// 更新の場合は前回、ＷＧ間依頼であった場合を考慮
						if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
							MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(wgRqstKey, r.wg_rqst_src_typ(), r.wg_rqst_src_no(), r.wg_rqst_typ());
							if(!isNull(wgRqstR)) {
								WgRqst_Upd01_DtlR wgRqstUpd01DtlR = WgRqst_Upd01_DtlR.create();
								copy(wgRqstUpd01DtlR, r, createMap_WgRqst_Upd01_DtlR_ShipDmndRqst_Upd01_DtlR());
								wgRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								delWgRqstUpd01.up0().add(wgRqstUpd01DtlR);

								wgRqstExists = true;
							}
						}
						
						if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
							// 依頼内容が変わるような変更の場合は、削除・新規で連携する。
							MST_PO_SCHD_R poSchdR = poSchdL.getFirst(poSchdKey, r.po_schd_src_typ(), r.po_schd_src_no());
							if(mainColChgPurc(poSchdR, r)) {
								ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
								MCRow.copyall(shipDmndRqstUpd01DtlR, r);
								shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								delShipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
								
								shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
								MCRow.copyall(shipDmndRqstUpd01DtlR, r);
								shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								delShipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
							}
							else {
								// 打切の場合は削除
								if(r.abort_flg()) {
									ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
									MCRow.copyall(shipDmndRqstUpd01DtlR, r);
									shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
									shipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
								}
								// 打切取消の場合は新規
								else if(r.abort_can_flg()) {
									ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
									MCRow.copyall(shipDmndRqstUpd01DtlR, r);
									shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
									shipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
								}
								else {
									ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = r.clone();
									
									// ＷＧ間依頼からＷＧ内になった場合は新規で連携
									if(wgRqstExists) {
										shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
									}
									shipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
								}
							}
						}
						else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
							// 依頼内容が変わるような変更の場合は、削除・新規で連携する。
							MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(xfrSchdKey, r.xfr_src_typ(), r.xfr_src_no());
							if(mainColChgXfr(xfrSchdR, r)) {
								ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
								MCRow.copyall(shipDmndRqstUpd01DtlR, r);
								shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								delShipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
								
								shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
								MCRow.copyall(shipDmndRqstUpd01DtlR, r);
								shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								delShipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);								
							}
							else {
								// 打切の場合は削除
								if(r.abort_flg()) {
									ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
									MCRow.copyall(shipDmndRqstUpd01DtlR, r);
									shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
									shipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
								}
								// 打切取消の場合は新規
								else if(r.abort_can_flg()) {
									ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
									MCRow.copyall(shipDmndRqstUpd01DtlR, r);
									shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
									shipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
								}
								else {
									ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = r.clone();
									
									// ＷＧ間依頼からＷＧ内になった場合は新規で連携
									if(wgRqstExists) {
										shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
									}
									shipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
								}
							}
						}
					}
					else if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {						
						shipDmndRqstUpd02.up0().add(r);
					}
					else if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						delShipDmndRqstUpd02.up0().add(r);
					}
				}
				// ＷＧを跨ぐ場合、ＷＧ間依頼サービスを実行
				else {
					boolean wgInnerExists = false;
					// 更新の場合は前回、ＷＧ内依頼であった場合を考慮
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
						MST_PO_SCHD_R poSchdR = poSchdL.getFirst(poSchdKey, r.po_schd_src_typ(), r.po_schd_src_no());
						if(!isNull(poSchdR)) {
							// 削除として連携
							ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
							MCRow.copyall(shipDmndRqstUpd01DtlR, r);
							shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							shipDmndRqstUpd01DtlR.rqst_to_wg_cd(r.rqst_fr_wg_cd());

							delShipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
							wgInnerExists = true;
						}
					}
					else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
						MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(xfrSchdKey, r.xfr_src_typ(), r.xfr_src_no());
						if(!isNull(xfrSchdR)) {
							// 削除として連携
							ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
							MCRow.copyall(shipDmndRqstUpd01DtlR, r);
							shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							shipDmndRqstUpd01DtlR.rqst_to_wg_cd(r.rqst_fr_wg_cd());

							delShipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
							wgInnerExists = true;
						}
					}
					
					WgRqst_Upd01_DtlR wgRqstUpd01DtlR = WgRqst_Upd01_DtlR.create();
					copy(wgRqstUpd01DtlR, r, createMap_WgRqst_Upd01_DtlR_ShipDmndRqst_Upd01_DtlR());
					if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						delWgRqstUpd01.up0().add(wgRqstUpd01DtlR);
					}
					else {
						if(r.abort_flg()) {
							wgRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						}
						else if(r.abort_can_flg()) {
							wgRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						}
						// 前回ＷＧ内の依頼の場合、新規として連携
						else if(wgInnerExists) {
							wgRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						}
						else if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(wgRqstKey, r.wg_rqst_src_typ(), r.wg_rqst_src_no(), r.wg_rqst_typ());
							// 主要項目が変更された場合、削除・新規で連携する
							if(!isNull(wgRqstR) && mainColChgWg(wgRqstR, r)) {
								wgRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								delWgRqstUpd01.up0().add(wgRqstUpd01DtlR);
								wgRqstUpd01DtlR = wgRqstUpd01DtlR.clone();
								wgRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							}
						}

						wgRqstUpd01.up0().add(wgRqstUpd01DtlR);
					}
				}
			}			

			// 削除用の出荷・供給依頼サービスの予定登録を実行
			if(!delShipDmndRqstUpd02.up0().isEmpty()) {
				delShipDmndRqstUpd02.exec();
				
				String[] destCols = new String[] {ShipDmndRqst_Upd01_DtlR.$rqst_to_wg_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_wg_cd, ShipDmndRqst_Upd01_DtlR.$gi_lg_grp_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_cd, ShipDmndRqst_Upd01_DtlR.$gi_str_ln_cd, ShipDmndRqst_Upd01_DtlR.$sppl_cd, ShipDmndRqst_Upd01_DtlR.$maker_cd, ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd, ShipDmndRqst_Upd01_DtlR.$bom_ptn};
				String[] srcCols = new String[] {ShipDmndRqst_Upd01_DtlR.$rqst_to_wg_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_wg_cd, ShipDmndRqst_Upd01_DtlR.$gi_lg_grp_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_cd, ShipDmndRqst_Upd01_DtlR.$gi_str_ln_cd, ShipDmndRqst_Upd01_DtlR.$sppl_cd, ShipDmndRqst_Upd01_DtlR.$maker_cd, ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd, ShipDmndRqst_Upd01_DtlR.$bom_ptn};
				copyByPegNo(up0(), destCols, delShipDmndRqstUpd02.down0(), srcCols);
			}

			// 出荷・供給依頼サービスの予定登録を実行
			if(!shipDmndRqstUpd02.up0().isEmpty()) {
				setDefStrLnCd(shipDmndRqstUpd02.up0());
				shipDmndRqstUpd02.exec();
				
				String[] destCols = new String[] {ShipDmndRqst_Upd01_DtlR.$rqst_to_wg_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_wg_cd, ShipDmndRqst_Upd01_DtlR.$gi_lg_grp_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_cd, ShipDmndRqst_Upd01_DtlR.$gi_str_ln_cd, ShipDmndRqst_Upd01_DtlR.$sppl_cd, ShipDmndRqst_Upd01_DtlR.$maker_cd, ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd, ShipDmndRqst_Upd01_DtlR.$bom_ptn};
				String[] srcCols = new String[] {ShipDmndRqst_Upd01_DtlR.$rqst_to_wg_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_wg_cd, ShipDmndRqst_Upd01_DtlR.$gi_lg_grp_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_cd, ShipDmndRqst_Upd01_DtlR.$gi_str_ln_cd, ShipDmndRqst_Upd01_DtlR.$sppl_cd, ShipDmndRqst_Upd01_DtlR.$maker_cd, ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd, ShipDmndRqst_Upd01_DtlR.$bom_ptn};
				copyByPegNo(up0(), destCols, shipDmndRqstUpd02.down0(), srcCols);
			}

			// 削除用のＷＧ間依頼サービスのＷＧ間依頼更新を実行
			if(!delWgRqstUpd01.up0().isEmpty()) {
				delWgRqstUpd01.exec();
				
				for(WgRqst_Upd01_DtlR r : delWgRqstUpd01.down0()) {
					for(ShipDmndRqst_Upd01_DtlR upR : up0().subList(ShipDmndRqst_Upd01_DtlR.$peg_no, r.peg_no())) {
						if(isSame(upR.wg_rqst_typ(), r.wg_rqst_typ())) {
							upR.wg_rqst_no(r.wg_rqst_no());
						}
					}
				}
			}

			// ＷＧ間依頼サービスのＷＧ間依頼更新を実行
			if(!wgRqstUpd01.up0().isEmpty()) {
				setDefStrLnCd(wgRqstUpd01.up0());
				wgRqstUpd01.exec();

				for(WgRqst_Upd01_DtlR r : wgRqstUpd01.down0()) {
					for(ShipDmndRqst_Upd01_DtlR upR : up0().subList(ShipDmndRqst_Upd01_DtlR.$peg_no, r.peg_no())) {
						if(isSame(upR.wg_rqst_typ(), r.wg_rqst_typ())) {
							upR.wg_rqst_no(r.wg_rqst_no());
						}
					}
				}
			}
			
			for(ShipDmndRqst_Upd01_DtlR r : up0()) {
				// ＷＧ間依頼でないもののみ対象
				if(MSC_WG_RQST_SRC_TYP.isSLO(r.wg_rqst_src_typ()) && isSame(r.rqst_fr_wg_cd(), r.rqst_to_wg_cd())) {
					// 受注状況更新サービスの上り電文を設定
					SloSts_DtlR sloStsDtlR = SloSts_DtlR.create();
					copy(sloStsDtlR, r, createMap_SloSts_DtlR_ShipDmndRqst_Upd01_DtlR());
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
						if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
							sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST.value());
							sloStsDtlR.unit_cd(r.trd_unit_cd());
							sloStsDtlR.qty(r.trd_unit_qty());
						}
						else if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							if(r.abort_flg()) {
								sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST_CAN.value());
							}
							else if(r.abort_can_flg()) {
								sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST.value());
							}
							else {
								sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST_UPD.value());
							}
							sloStsDtlR.unit_cd(r.trd_unit_cd());
							sloStsDtlR.qty(r.trd_unit_qty());
						}
						else {
							sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST_CAN.value());
						}
					}
					sloStsIns01.up0().add(sloStsDtlR);
				}
			}
			
			// 受注状況更新サービスを実行
			if(!sloStsIns01.up0().isEmpty()) {
				sloStsIns01.exec();
			}
		}

		/**
		 * 標準の棚・ラインCDを設定します。
		 */
		protected void setDefStrLnCd(MCList<?> list) {
			if (list.isEmpty()) {
				return;
			}

			MSUCL_StrLnUtil.StrLnUtil_Srch01 ope = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
			list.forEach(r ->{
				StrLnUtil_Srch01_CndR cndR = null;
				// ＷＧ間依頼作成元区分が品目オーダ確定または発注点在庫補充
				// 移動・移送元区分が品目オーダまたは発注点在庫補充
				if (MSC_WG_RQST_SRC_TYP.isORD(r.getStringNE("wg_rqst_src_typ"))
						|| MSC_WG_RQST_SRC_TYP.isOP_RPL(r.getStringNE("wg_rqst_src_typ"))
						|| MSC_XFR_SRC_TYP.isITM_ORD(r.getStringNE("xfr_src_typ"))
						|| MSC_XFR_SRC_TYP.isOP_RPL(r.getStringNE("xfr_src_typ"))) {
					cndR = StrLnUtil_Srch01_CndR.create();
					cndR.peg_no(r.getNumberNE("peg_no"));
					cndR.itm_cd(r.getStringNE("itm_cd"));
					cndR.itm_sub1(r.getStringNE("itm_sub1"));
					cndR.itm_sub2(r.getStringNE("itm_sub2"));
					cndR.itm_sub3(r.getStringNE("itm_sub3"));
					cndR.loc_cd(r.getStringNE("gr_loc_cd"));
				}
				ope.up0().add(cndR);
			});
			ope.exec();
			ope.down0().forEach(downR -> {
				MCRow r = list.getFirst("peg_no", downR.peg_no());
				if (isNull(downR.str_ln_cd())) {
					r.setBooleanNE("gr_str_ln_cd_none_flg", true);
				}
				else {
					r.setStringNE("gr_str_ln_cd", downR.str_ln_cd());
				}
			});
		}

		/**
		 * 前回の依頼内容と今回の依頼内容が変わっているか判断する【ＷＧ間依頼用】
		 * @param wgRqstR 前回の依頼内容
		 * @param r　今回の依頼内容
		 * @return boolean 変更があるかどうか
		 */
		protected boolean mainColChgWg(MST_WG_RQST_R wgRqstR, ShipDmndRqst_Upd01_DtlR r) {
			if(!isSame(wgRqstR.itm_cd(), r.itm_cd())
				|| !isSame(wgRqstR.itm_nm(), r.itm_nm())
				|| !isSame(wgRqstR.itm_sub1(), r.itm_sub1())
				|| !isSame(wgRqstR.itm_sub2(), r.itm_sub2())
				|| !isSame(wgRqstR.itm_sub3(), r.itm_sub3())
				|| !isSame(wgRqstR.gr_loc_cd(), r.gr_loc_cd())
				|| !isSame(wgRqstR.gr_str_ln_cd(), r.gr_str_ln_cd())
				|| !isSame(wgRqstR.sno1(), r.sno1())
				|| !isSame(wgRqstR.sno1_null_flg(), r.sno1_null_flg())
				|| !isSame(wgRqstR.sno2(), r.sno2())
				|| !isSame(wgRqstR.sno2_null_flg(), r.sno2_null_flg())
				|| !isSame(wgRqstR.sno3(), r.sno3())
				|| !isSame(wgRqstR.sno3_null_flg(), r.sno3_null_flg())
				|| !isSame(wgRqstR.sno4(), r.sno4())
				|| !isSame(wgRqstR.sno4_null_flg(), r.sno4_null_flg())
				|| !isSame(wgRqstR.ver_no(), r.ver_no())
				|| !isSame(wgRqstR.rqst_to_wg_cd(), r.rqst_to_wg_cd())
			) {
				return true;
			}			
			return false;
		}
		
		/**
		 * 前回の依頼内容と今回の依頼内容が変わっているか判断する【購買依頼用】
		 * @param poSchdR　前回の発注予定
		 * @param r　今回の依頼内容
		 * @return boolean 変更があるかどうか
		 */
		protected boolean mainColChgPurc(MST_PO_SCHD_R poSchdR, ShipDmndRqst_Upd01_DtlR r) {
			if(isNull(poSchdR) || poSchdR.isEmpty()) {
				return false;
			}
			if(!isSame(poSchdR.itm_cd(), r.itm_cd())
				|| !isSame(poSchdR.itm_nm(), r.itm_nm())
				|| !isSame(poSchdR.itm_sub1(), r.itm_sub1())
				|| !isSame(poSchdR.itm_sub2(), r.itm_sub2())
				|| !isSame(poSchdR.itm_sub3(), r.itm_sub3())
				|| !isSame(poSchdR.in_to_loc_cd(), r.gr_loc_cd())
				|| !isSame(poSchdR.str_ln_cd(), r.gr_str_ln_cd())
				|| !isSame(poSchdR.sno1(), r.sno1())
				|| !isSame(poSchdR.sno2(), r.sno2())
				|| !isSame(poSchdR.sno3(), r.sno3())
				|| !isSame(poSchdR.sno4(), r.sno4())
				|| !isSame(poSchdR.ver_no(), r.ver_no())
			) {
				return true;
			}			
			return false;
		}

		/**
		 * 前回の依頼内容と今回の依頼内容が変わっているか判断する【移送依頼用】
		 * @param xfrSchdR　前回の移動・移送予定
		 * @param r　今回の依頼内容
		 * @return boolean 変更があるかどうか
		 */
		protected boolean mainColChgXfr(MST_XFR_SCHD_R xfrSchdR, ShipDmndRqst_Upd01_DtlR r) {
			if(isNull(xfrSchdR) || xfrSchdR.isEmpty()) {
				return false;
			}
			if(!isSame(xfrSchdR.itm_cd(), r.itm_cd())
				|| !isSame(xfrSchdR.itm_sub1(), r.itm_sub1())
				|| !isSame(xfrSchdR.itm_sub2(), r.itm_sub2())
				|| !isSame(xfrSchdR.itm_sub3(), r.itm_sub3())
				|| !isSame(xfrSchdR.gr_loc_cd(), r.gr_loc_cd())
				|| !isSame(xfrSchdR.gr_str_ln_cd(), r.gr_str_ln_cd())
				|| !isSame(xfrSchdR.sno1(), r.sno1())
				|| !isSame(xfrSchdR.sno1_null_flg(), r.sno1_null_flg())
				|| !isSame(xfrSchdR.sno2(), r.sno2())
				|| !isSame(xfrSchdR.sno2_null_flg(), r.sno2_null_flg())
				|| !isSame(xfrSchdR.sno3(), r.sno3())
				|| !isSame(xfrSchdR.sno3_null_flg(), r.sno3_null_flg())
				|| !isSame(xfrSchdR.sno4(), r.sno4())
				|| !isSame(xfrSchdR.sno4_null_flg(), r.sno4_null_flg())
				|| !isSame(xfrSchdR.ver_no(), r.ver_no())
			) {
				return true;
			}
			return false;
		}
		
		protected Map_WgRqst_Upd01_DtlR_Upd01_DtlR<WgRqst_Upd01_DtlR,ShipDmndRqst_Upd01_DtlR> createMap_WgRqst_Upd01_DtlR_ShipDmndRqst_Upd01_DtlR() {
			return new Map_WgRqst_Upd01_DtlR_Upd01_DtlR<WgRqst_Upd01_DtlR, ShipDmndRqst_Upd01_DtlR>();
		}

		public class Map_WgRqst_Upd01_DtlR_Upd01_DtlR<D extends WgRqst_Upd01_DtlR, S extends ShipDmndRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Upd01_DtlR.$data_crud_typ, ShipDmndRqst_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(WgRqst_Upd01_DtlR.$peg_no, ShipDmndRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_typ, ShipDmndRqst_Upd01_DtlR.$wg_rqst_typ);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_src_typ, ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_typ);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_src_no, ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_dt, ShipDmndRqst_Upd01_DtlR.$rqst_dt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_fr_wg_cd, ShipDmndRqst_Upd01_DtlR.$rqst_fr_wg_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_fr_dpt_cd, ShipDmndRqst_Upd01_DtlR.$rqst_fr_dpt_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_fr_usr_cd, ShipDmndRqst_Upd01_DtlR.$rqst_fr_usr_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gr_loc_wg_cd, ShipDmndRqst_Upd01_DtlR.$gr_loc_wg_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gr_lg_grp_cd, ShipDmndRqst_Upd01_DtlR.$gr_lg_grp_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gr_loc_cd, ShipDmndRqst_Upd01_DtlR.$gr_loc_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gr_str_ln_cd, ShipDmndRqst_Upd01_DtlR.$gr_str_ln_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gr_rqst_tm, ShipDmndRqst_Upd01_DtlR.$gr_rqst_tm);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_to_wg_cd, ShipDmndRqst_Upd01_DtlR.$rqst_to_wg_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gi_loc_wg_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_wg_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gi_lg_grp_cd, ShipDmndRqst_Upd01_DtlR.$gi_lg_grp_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gi_loc_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gi_str_ln_cd, ShipDmndRqst_Upd01_DtlR.$gi_str_ln_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gi_rqst_tm, ShipDmndRqst_Upd01_DtlR.$gi_rqst_tm);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_cd, ShipDmndRqst_Upd01_DtlR.$itm_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_sub1, ShipDmndRqst_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_sub2, ShipDmndRqst_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_sub3, ShipDmndRqst_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_nm, ShipDmndRqst_Upd01_DtlR.$itm_nm);
				addColumnPathMap(WgRqst_Upd01_DtlR.$lot_no, ShipDmndRqst_Upd01_DtlR.$lot_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sublot_no, ShipDmndRqst_Upd01_DtlR.$sublot_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno1, ShipDmndRqst_Upd01_DtlR.$sno1);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno1_null_flg, ShipDmndRqst_Upd01_DtlR.$sno1_null_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno2, ShipDmndRqst_Upd01_DtlR.$sno2);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno2_null_flg, ShipDmndRqst_Upd01_DtlR.$sno2_null_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno3, ShipDmndRqst_Upd01_DtlR.$sno3);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno3_null_flg, ShipDmndRqst_Upd01_DtlR.$sno3_null_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno4, ShipDmndRqst_Upd01_DtlR.$sno4);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno4_null_flg, ShipDmndRqst_Upd01_DtlR.$sno4_null_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$ver_no, ShipDmndRqst_Upd01_DtlR.$ver_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gd_cd, ShipDmndRqst_Upd01_DtlR.$gd_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$vld_dt_fr, ShipDmndRqst_Upd01_DtlR.$vld_dt_fr);
				addColumnPathMap(WgRqst_Upd01_DtlR.$vld_dt_to, ShipDmndRqst_Upd01_DtlR.$vld_dt_to);
				addColumnPathMap(WgRqst_Upd01_DtlR.$trd_unit_qty, ShipDmndRqst_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(WgRqst_Upd01_DtlR.$trd_unit_cd, ShipDmndRqst_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$base_unit_qty, ShipDmndRqst_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(WgRqst_Upd01_DtlR.$base_unit_cd, ShipDmndRqst_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sppl_cd, ShipDmndRqst_Upd01_DtlR.$sppl_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$maker_cd, ShipDmndRqst_Upd01_DtlR.$maker_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$io_schd_pr_no, ShipDmndRqst_Upd01_DtlR.$io_schd_pr_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$slo_no, ShipDmndRqst_Upd01_DtlR.$slo_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$slo_d_no, ShipDmndRqst_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$cst_cd, ShipDmndRqst_Upd01_DtlR.$cst_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$dlv_cd, ShipDmndRqst_Upd01_DtlR.$dlv_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$dlv_sundry_flg, ShipDmndRqst_Upd01_DtlR.$dlv_sundry_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$dlv_nm, ShipDmndRqst_Upd01_DtlR.$dlv_nm);
				addColumnPathMap(WgRqst_Upd01_DtlR.$dlv_cntct_dpt, ShipDmndRqst_Upd01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$dlv_cntct_psn, ShipDmndRqst_Upd01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(WgRqst_Upd01_DtlR.$dlv_zip_cd, ShipDmndRqst_Upd01_DtlR.$dlv_zip_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$dlv_addr1, ShipDmndRqst_Upd01_DtlR.$dlv_addr1);
				addColumnPathMap(WgRqst_Upd01_DtlR.$dlv_addr2, ShipDmndRqst_Upd01_DtlR.$dlv_addr2);
				addColumnPathMap(WgRqst_Upd01_DtlR.$dlv_addr3, ShipDmndRqst_Upd01_DtlR.$dlv_addr3);
				addColumnPathMap(WgRqst_Upd01_DtlR.$dlv_addr4, ShipDmndRqst_Upd01_DtlR.$dlv_addr4);
				addColumnPathMap(WgRqst_Upd01_DtlR.$dlv_tel, ShipDmndRqst_Upd01_DtlR.$dlv_tel);
				addColumnPathMap(WgRqst_Upd01_DtlR.$dlv_fax, ShipDmndRqst_Upd01_DtlR.$dlv_fax);
				addColumnPathMap(WgRqst_Upd01_DtlR.$tdlv_cd, ShipDmndRqst_Upd01_DtlR.$tdlv_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$tdlv_sundry_flg, ShipDmndRqst_Upd01_DtlR.$tdlv_sundry_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$tdlv_nm, ShipDmndRqst_Upd01_DtlR.$tdlv_nm);
				addColumnPathMap(WgRqst_Upd01_DtlR.$tdlv_zip_cd, ShipDmndRqst_Upd01_DtlR.$tdlv_zip_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$tdlv_addr1, ShipDmndRqst_Upd01_DtlR.$tdlv_addr1);
				addColumnPathMap(WgRqst_Upd01_DtlR.$tdlv_addr2, ShipDmndRqst_Upd01_DtlR.$tdlv_addr2);
				addColumnPathMap(WgRqst_Upd01_DtlR.$tdlv_addr3, ShipDmndRqst_Upd01_DtlR.$tdlv_addr3);
				addColumnPathMap(WgRqst_Upd01_DtlR.$tdlv_addr4, ShipDmndRqst_Upd01_DtlR.$tdlv_addr4);
				addColumnPathMap(WgRqst_Upd01_DtlR.$tdlv_cntct_dpt, ShipDmndRqst_Upd01_DtlR.$tdlv_cntct_dpt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$tdlv_cntct_psn, ShipDmndRqst_Upd01_DtlR.$tdlv_cntct_psn);
				addColumnPathMap(WgRqst_Upd01_DtlR.$tdlv_tel, ShipDmndRqst_Upd01_DtlR.$tdlv_tel);
				addColumnPathMap(WgRqst_Upd01_DtlR.$tdlv_fax, ShipDmndRqst_Upd01_DtlR.$tdlv_fax);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_ord_no, ShipDmndRqst_Upd01_DtlR.$itm_ord_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$mfg_loc_cd, ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bom_ptn, ShipDmndRqst_Upd01_DtlR.$bom_ptn);
				addColumnPathMap(WgRqst_Upd01_DtlR.$purc_rsn_cd, ShipDmndRqst_Upd01_DtlR.$purc_rsn_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$xpns_po_flg, ShipDmndRqst_Upd01_DtlR.$xpns_po_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_dpt_cd, ShipDmndRqst_Upd01_DtlR.$bd_dpt_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_cnt_rmrks, ShipDmndRqst_Upd01_DtlR.$wg_rqst_cnt_rmrks);
				addColumnPathMap(WgRqst_Upd01_DtlR.$cred_no_up_flg, ShipDmndRqst_Upd01_DtlR.$cred_no_up_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$comp_cng_flg, ShipDmndRqst_Upd01_DtlR.$comp_cng_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$spec_cng_flg, ShipDmndRqst_Upd01_DtlR.$spec_cng_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$abort_flg, ShipDmndRqst_Upd01_DtlR.$abort_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$abort_can_flg, ShipDmndRqst_Upd01_DtlR.$abort_can_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$po_schd_dt, ShipDmndRqst_Upd01_DtlR.$po_schd_dt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$mfg_st_schd_dt, ShipDmndRqst_Upd01_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$mfg_end_schd_dt, ShipDmndRqst_Upd01_DtlR.$mfg_end_schd_dt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gi_schd_dt, ShipDmndRqst_Upd01_DtlR.$gi_schd_dt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$strg_schd_dt, ShipDmndRqst_Upd01_DtlR.$strg_schd_dt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$accpt_schd_dt, ShipDmndRqst_Upd01_DtlR.$accpt_schd_dt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$insp_end_schd_dt, ShipDmndRqst_Upd01_DtlR.$insp_end_schd_dt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$avl_schd_dt, ShipDmndRqst_Upd01_DtlR.$avl_schd_dt);
			}
		}
		
		protected Map_SloSts_DtlR_ShipDmndRqst_Upd01_DtlR<SloSts_DtlR,ShipDmndRqst_Upd01_DtlR> createMap_SloSts_DtlR_ShipDmndRqst_Upd01_DtlR() {
			return new Map_SloSts_DtlR_ShipDmndRqst_Upd01_DtlR<SloSts_DtlR, ShipDmndRqst_Upd01_DtlR>();
		}

		public class Map_SloSts_DtlR_ShipDmndRqst_Upd01_DtlR<D extends SloSts_DtlR, S extends ShipDmndRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloSts_DtlR.$slo_d_no, ShipDmndRqst_Upd01_DtlR.$slo_d_no);
			}
		}
	}

	/**
	 * ShipDmndRqst_Chk01オペレーション.<p>
	 *
	 * 登録前のチェックを行う。<br>
	 */
	public class ShipDmndRqst_Chk01 extends MSBAL_ShipDmndRqstService_MC_A.ShipDmndRqst_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			cacheLoc(up0());
			chkLoc();
			cacheItmDtl(up0());
			cachePoSchd(up0());
			chkItmDtl();
			setSrcTyp();
			chkSchd();
			down0().setAll(up0());
		}

		/**
		 * 場所マスタを補完する。
		 */
		protected void chkLoc() {
			for(ShipDmndRqst_Chk01_DtlR r : up0()) {
				// 場所マスタよりワーキンググループを補完
				MAM_LOC_R locR = getLocR(r.gr_loc_cd());
				if(!isNull(locR)) {
					r.gr_loc_wg_cd(locR.wg_cd());
				}
				if(isNull(r.gr_str_ln_cd())) {
					r.gr_str_ln_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * 品目詳細マスタをチェック、補完する。
		 */
		protected void chkItmDtl() {
			for(ShipDmndRqst_Chk01_DtlR r : up0()) {
				// 購買依頼で受注からの依頼の場合、外注の可能性がある。
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					if(MSC_WG_RQST_SRC_TYP.isSLO(r.wg_rqst_src_typ())) {
						if (isSame(_sysParm, "1")) {
							MCDate baseDt = r.getDate("avl_schd_dt");
							MAM_ITM_DTL_R itmDtlR = getPurcItmDtlR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_wg_cd(), baseDt, r.sppl_cd(), r.maker_cd());
							// 取得できない場合は、外注ではなく、購買
							itmDtlR = getPoSchdOutsrcItmDtlR(itmDtlR, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_wg_cd(), baseDt, r.sppl_cd(), nvl(r.maker_cd(),MAC_STR.NULL_VAL.value()), r.slo_d_no(), r.data_crud_typ());
							if(isNull(itmDtlR)) {
								continue;
							}
							else {
								r.mfg_loc_cd(itmDtlR.mfg_loc_cd());
								r.bom_ptn(itmDtlR.bom_ptn());
							}
						} else {
							// マスタ参照日取得
							MCDate baseDt = getBaseDate(r, true);
							if (isNull(baseDt)) {
								continue;
							}
							else {
								MAM_ITM_DTL_R itmDtlR = getPurcItmDtlR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_wg_cd(), baseDt, r.sppl_cd(), nvl(r.maker_cd(),MAC_STR.NULL_VAL.value()));
								// 取得できない場合は、外注ではなく、購買
								itmDtlR = getPoSchdOutsrcItmDtlR(itmDtlR, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_wg_cd(), baseDt, r.sppl_cd(), nvl(r.maker_cd(),MAC_STR.NULL_VAL.value()), r.slo_d_no(), r.data_crud_typ());
								if(isNull(itmDtlR)) {
									continue;
								}
								else {
									r.mfg_loc_cd(itmDtlR.mfg_loc_cd());
									r.bom_ptn(itmDtlR.bom_ptn());
								}
							}
						}
					}
				}
				//　ＷＧ間依頼種類区分が未指定の場合のみ、品目詳細マスタより補完する。
				if(isNull(r.wg_rqst_typ())) {
					MAM_ITM_DTL_R itmDtlR = null;
					if (isSame(_sysParm, "1")) {
						// 品目詳細マスタが取得できない場合、エラー
						MCDate baseDt = r.getDateNE("avl_schd_dt");
						itmDtlR = getItmDtlR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_wg_cd(), baseDt);
					} else {
						// マスタ参照日取得
						MCDate baseDt = getBaseDate(r, false);
						if (isNull(baseDt)) {
							MCMessagePool.add(new MCMessage(r, null, MSBAL0023, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.gr_loc_wg_cd(), toYMDString(r.gr_rqst_tm()), toDispGUIIndex(r)));
							r.err_flg(true);
							continue;
						}
						itmDtlR = getItmDtlR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gr_loc_wg_cd(), baseDt);
					}
					if(isNull(itmDtlR)) {
						MCMessagePool.add(new MCMessage(r, null, MSBAL0023, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.gr_loc_wg_cd(), toYMDString(r.gr_rqst_tm()), toDispGUIIndex(r)));
						r.err_flg(true);
						continue;
					}
					// 発注先が設定されている場合
					if(!isSame(nvl(itmDtlR.sppl_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
						r.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
						r.rqst_to_wg_cd(itmDtlR.rqst_wg_cd());
						r.sppl_cd(itmDtlR.sppl_cd());
						r.maker_cd(itmDtlR.maker_cd());
					}
					// 製造場所、および発注先が指定されている場合
					else if(!isSame(nvl(itmDtlR.getStringNE("loc_sppl_cd"), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
						r.wg_rqst_typ(MSC_WG_RQST_TYP.PURC.value());
						r.rqst_to_wg_cd(itmDtlR.rqst_wg_cd());
						r.sppl_cd(itmDtlR.getStringNE("loc_sppl_cd"));
						r.maker_cd(itmDtlR.getStringNE("loc_maker_cd"));
						r.mfg_loc_cd(itmDtlR.mfg_loc_cd());
						r.bom_ptn(itmDtlR.bom_ptn());
					}
					// 依頼先場所が指定されている場合
					else if(!isSame(itmDtlR.rqst_loc_cd(), MAC_STR.NULL_VAL.value())) {
						r.wg_rqst_typ(MSC_WG_RQST_TYP.XFR.value());
						r.rqst_to_wg_cd(itmDtlR.getStringNE("loc_wg_cd"));
						r.gi_loc_cd(itmDtlR.rqst_loc_cd());
					}
				}
				
				if(isNull(r.rqst_to_wg_cd())) {
					r.rqst_to_wg_cd(r.rqst_fr_wg_cd());
				}
			}
		}
		
		/**
		 * 発注予定作成元区分、移動・移送元区分、元ＮＯを補完する。
		 */
		protected void setSrcTyp() {
			for(ShipDmndRqst_Chk01_DtlR r : up0()) {
				// 購買依頼の場合、発注予定作成元区分を補完
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					if(MSC_WG_RQST_SRC_TYP.isSLO(r.wg_rqst_src_typ())) {
						r.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.SLO.value());
					}
					else if(MSC_WG_RQST_SRC_TYP.isORD(r.wg_rqst_src_typ())) {
						r.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.PPLN.value());
					}
					else if(MSC_WG_RQST_SRC_TYP.isOP_RPL(r.wg_rqst_src_typ())) {
						r.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.OP.value());
					}
					r.po_schd_src_no(r.wg_rqst_src_no());
				}
				// 移送依頼の場合、移動・移送元区分を補完
				else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					if(MSC_WG_RQST_SRC_TYP.isSLO(r.wg_rqst_src_typ())) {
						r.xfr_src_typ(MSC_XFR_SRC_TYP.SLO.value());
					}
					else if(MSC_WG_RQST_SRC_TYP.isORD(r.wg_rqst_src_typ())) {
						r.xfr_src_typ(MSC_XFR_SRC_TYP.ITM_ORD.value());
					}
					else if(MSC_WG_RQST_SRC_TYP.isOP_RPL(r.wg_rqst_src_typ())) {
						r.xfr_src_typ(MSC_XFR_SRC_TYP.OP_RPL.value());
					}
					r.xfr_src_no(r.wg_rqst_src_no());
				}
			}
		}

		/**
		 * ＷＧを跨がない場合、発注予定、移動・移送予定のチェックを実行
		 * ＷＧを跨ぐ場合、ＷＧ間依頼サービスの更新前チェックを実行
		 */
		protected void chkSchd() {
			MSBAL_WgRqstService.WgRqst_Chk01 wgRqstChk01 = MSBAL_WgRqstService.crtWgRqst_Chk01();
			MSBDL_PoSchdRegService.PoSchd_Chk01 poSchdChk01 = MSBDL_PoSchdRegService.crtPoSchd_Chk01();
			MSBEL_XfrSchdService.XfrSchd_Chk04 xfrSchdChk04 = MSBEL_XfrSchdService.crtXfrSchd_Chk04();
			
			MCMessageList nextChkMsgL = new MCMessageList();
			
			// 同一ＷＧ内の場合は、前回の依頼と変更があるか判断するため、発注予定、移動・移送予定を取得
			MCList<ShipDmndRqst_Chk01_DtlR> poSchdBindL = MCList.create(ShipDmndRqst_Chk01_DtlR.class);
			MCList<ShipDmndRqst_Chk01_DtlR> xfrSchdBindL = MCList.create(ShipDmndRqst_Chk01_DtlR.class);
			for(ShipDmndRqst_Chk01_DtlR r : up0().subList(ShipDmndRqst_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value())) {
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					poSchdBindL.add(r);
				}
				else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					xfrSchdBindL.add(r);
				}
			}
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			// 発注予定を取得
			if(!poSchdBindL.isEmpty()) {
				MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
				MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
				poSchdL_bldr.setWhere(t.po_schd_src_typ.eq(bind("po_schd_src_typ")));
				poSchdL_bldr.addWhereWithAnd(t.po_schd_src_no.eq(bind("po_schd_src_no")));
				poSchdL_bldr.addWhereWithAnd(t.rqst_can_flg.eq(value(false)));
				poSchdL_bldr.addWhereWithAnd(t.split_src_schd_no.isNull());
				poSchdL_bldr.setOrderByAsc(poSchdL_bldr.getBaseDbc().getKeyColumn$());
				dbSelectForUpdate("MSBAL5130_MST_PO_SCHD_S02", poSchdL, poSchdL_bldr, poSchdBindL);
			}
			MCIndexKey poSchdKey = poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_src_typ, MST_PO_SCHD_R.$po_schd_src_no);

			// 移動・移送予定を取得
			MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
			if(!xfrSchdBindL.isEmpty()) {
				MST_XFR_SCHD_R t2 = MST_XFR_SCHD_R.create("T");
				MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(t2);
				xfrSchdL_bldr.setWhere(t2.xfr_src_typ.eq(bind("xfr_src_typ")));
				xfrSchdL_bldr.addWhereWithAnd(t2.xfr_src_no.eq(bind("xfr_src_no")));
				xfrSchdL_bldr.addWhereWithAnd(t2.rqst_can_flg.eq(value(false)));
				xfrSchdL_bldr.setOrderByAsc(xfrSchdL_bldr.getBaseDbc().getKeyColumn$());
				dbSelectForUpdate("MSBAL5130_MST_XFR_SCHD_S02", xfrSchdL, xfrSchdL_bldr, xfrSchdBindL);
			}
			MCIndexKey xfrSchdKey = xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_src_typ, MST_XFR_SCHD_R.$xfr_src_no);
			
			MCList<ShipDmndRqst_Chk01_DtlR> bindL = MCList.create(ShipDmndRqst_Chk01_DtlR.class);
			bindL.addAll(up0().subList(ShipDmndRqst_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value()));
			bindL.addAll(up0().subList(ShipDmndRqst_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value()));
			
			// ＷＧ間依頼の情報を取得
			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			if(!bindL.isEmpty()) {
				MST_WG_RQST_R S1TMP = MST_WG_RQST_R.create("TMP");
				MST_WG_RQST_R t3 = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder wgRqstL_bldr = MCQueryApiBuilder.create(t3);
				wgRqstL_bldr.setWhere(t3.wg_rqst_src_typ.eq(bind("wg_rqst_src_typ")));
				wgRqstL_bldr.addWhereWithAnd(t3.wg_rqst_src_no.eq(bind("wg_rqst_src_no")));
				wgRqstL_bldr.addWhereWithAnd(t3.can_flg.eq(value(false)));
				wgRqstL_bldr.addWhereWithAnd(notExists(subQuery().select(nullValue())
						.from(S1TMP).where(value(0).eq(value(0))
								.and(S1TMP.last_wg_rqst_no.eq(t3.wg_rqst_no)))));
				wgRqstL_bldr.setOrderByAsc(wgRqstL_bldr.getBaseDbc().getKeyColumn$());
				dbSelectForUpdate("MSBAL5130_MST_WG_RQST_S02", wgRqstL, wgRqstL_bldr, bindL);
			}
			MCIndexKey wgRqstKey = wgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_src_typ, MST_WG_RQST_R.$wg_rqst_src_no, MST_WG_RQST_R.$wg_rqst_typ);
			
			
			for(ShipDmndRqst_Chk01_DtlR r : up0()) {
				if(isNull(r.rqst_to_wg_cd())) {
					r.rqst_to_wg_cd(r.rqst_fr_wg_cd());
				}
				
				// 前回の依頼先ＷＧを取得
				if(r.abort_flg() || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(wgRqstKey, r.wg_rqst_src_typ(), r.wg_rqst_src_no(), r.wg_rqst_typ());
					if(!isNull(wgRqstR)) {
						r.rqst_to_wg_cd(wgRqstR.rqst_to_wg_cd());
					}
				}
				
				// ＷＧを跨がない場合
				if(isSame(r.rqst_fr_wg_cd(), r.rqst_to_wg_cd())) {
					boolean wgRqstExists = false;
					// 更新の場合は前回、ＷＧ間依頼であった場合を考慮
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
						if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(wgRqstKey, r.wg_rqst_src_typ(), r.wg_rqst_src_no(), r.wg_rqst_typ());
							if(!isNull(wgRqstR)) {
								// 削除として連携
								WgRqst_Chk01_DtlR wgRqstChk01DtlR = WgRqst_Chk01_DtlR.create();
								copy(wgRqstChk01DtlR, r, createMap_WgRqst_Chk01_DtlR_ShipDmndRqst_Chk01_DtlR());
								wgRqstChk01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								wgRqstChk01.up0().add(wgRqstChk01DtlR);
								wgRqstExists = true;
							}
						}
					}
					
					// 購買依頼の場合、発注予定登録サービスのチェックを実行
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {						
						// 依頼内容が変わるような変更の場合は、削除・新規で連携する。
						MST_PO_SCHD_R poSchdR = poSchdL.getFirst(poSchdKey, r.po_schd_src_typ(), r.po_schd_src_no());
						if(mainColChgPurc(poSchdR, r)) {
							// 削除
							PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
							copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR());
							poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							poSchdChk01.up0().add(poSchdUpd01DtlR);
							
							// 新規
							poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
							copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR());
							poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							poSchdChk01.up0().add(poSchdUpd01DtlR);
						}
						else {
							PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
							copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR());
							if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
								poSchdUpd01DtlR.rqst_crrct_flg(true);
							}
							else {
								poSchdUpd01DtlR.rqst_crrct_flg(false);
							}
							
							if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
								poSchdChk01.up0().add(poSchdUpd01DtlR);
							}
							else {
								// 打切は削除としてチェック
								if(r.abort_flg()) {
									poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								}
								// 打切取消は新規としてチェック
								else if(r.abort_can_flg()) {
									poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());									
								}
								
								// ＷＧ間依頼からＷＧ内になった場合は新規で連携
								if(wgRqstExists) {
									poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								}
								poSchdChk01.up0().add(poSchdUpd01DtlR);
							}
						}
					}
					// 移送依頼の場合、移動・移送予定サービスのチェックサービスを実行
					else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
						// 更新の場合は、削除・新規で連携する。
						if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							XfrSchdChk04_DtlR xfrSchdChk04DtlR = XfrSchdChk04_DtlR.create();

							// 打切取消、ＷＧ間からＷＧ内に変更された場合は除外
							if(!r.abort_can_flg() && !wgRqstExists) {
								// 削除
								copy(xfrSchdChk04DtlR, r, createMap_XfrSchdChk04_DtlR_ShipDmndRqst_Chk01_DtlR());
								xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
							}
							// 新規
							xfrSchdChk04DtlR = XfrSchdChk04_DtlR.create();
							copy(xfrSchdChk04DtlR, r, createMap_XfrSchdChk04_DtlR_ShipDmndRqst_Chk01_DtlR());
							xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
						}
						else {
							// 移動・移送予定サービスのチェックを実行
							XfrSchdChk04_DtlR xfrSchdChk04DtlR = XfrSchdChk04_DtlR.create();
							copy(xfrSchdChk04DtlR, r, createMap_XfrSchdChk04_DtlR_ShipDmndRqst_Chk01_DtlR());
							xfrSchdChk04.up0().add(xfrSchdChk04DtlR);							
						}
					}
				}
				// ＷＧを跨ぐ場合
				else {
					// 更新の場合
					if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						boolean wgInnerExists = false;
						// 更新の場合は前回、ＷＧ内依頼であった場合を考慮
						if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
							MST_PO_SCHD_R poSchdR = poSchdL.getFirst(poSchdKey, r.po_schd_src_typ(), r.po_schd_src_no());
							if(!isNull(poSchdR)) {
								// 削除として連携
								PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
								copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR());
								poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								poSchdChk01.up0().add(poSchdUpd01DtlR);

								wgInnerExists = true;
							}
						}
						else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
							MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(xfrSchdKey, r.xfr_src_typ(), r.xfr_src_no());
							if(!isNull(xfrSchdR)) {
								// 削除として連携
								XfrSchdChk04_DtlR xfrSchdChk04DtlR = XfrSchdChk04_DtlR.create();
								copy(xfrSchdChk04DtlR, r, createMap_XfrSchdChk04_DtlR_ShipDmndRqst_Chk01_DtlR());
								xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								xfrSchdChk04.up0().add(xfrSchdChk04DtlR);

								wgInnerExists = true;
							}
						}

						
						MST_WG_RQST_R chkWgRqst = wgRqstL.getFirst(wgRqstKey, r.wg_rqst_src_typ(), r.wg_rqst_src_no(), r.wg_rqst_typ());
						if(!isNull(chkWgRqst)) {
							if(isNull(r.gr_str_ln_cd())) {
								r.gr_str_ln_cd(MAC_STR.NULL_VAL.value());
							}

							// 依頼内容が変わるような変更の場合は、削除・新規で連携する。
							if(mainColChgWg(chkWgRqst, r)) {
								// 削除
								WgRqst_Chk01_DtlR wgRqstChk01DtlR = WgRqst_Chk01_DtlR.create();
								copy(wgRqstChk01DtlR, r, createMap_WgRqst_Chk01_DtlR_ShipDmndRqst_Chk01_DtlR());
								wgRqstChk01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								wgRqstChk01.up0().add(wgRqstChk01DtlR);
								
								// 新規
								wgRqstChk01DtlR = WgRqst_Chk01_DtlR.create();
								copy(wgRqstChk01DtlR, r, createMap_WgRqst_Chk01_DtlR_ShipDmndRqst_Chk01_DtlR());
								wgRqstChk01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								wgRqstChk01.up0().add(wgRqstChk01DtlR);
							}
							else {
								WgRqst_Chk01_DtlR wgRqstChk01DtlR = WgRqst_Chk01_DtlR.create();
								copy(wgRqstChk01DtlR, r, createMap_WgRqst_Chk01_DtlR_ShipDmndRqst_Chk01_DtlR());
								if(r.abort_flg()) {
									wgRqstChk01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								}
								else if(r.abort_can_flg()) {
									wgRqstChk01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								}
								wgRqstChk01.up0().add(wgRqstChk01DtlR);
							}
						}
						else {
							WgRqst_Chk01_DtlR wgRqstChk01DtlR = WgRqst_Chk01_DtlR.create();
							copy(wgRqstChk01DtlR, r, createMap_WgRqst_Chk01_DtlR_ShipDmndRqst_Chk01_DtlR());
							if(r.abort_flg()) {
								wgRqstChk01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							}
							else if(r.abort_can_flg()) {
								wgRqstChk01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							}
							
							// 前回ＷＧ内の依頼の場合
							if(!wgInnerExists) {
								wgRqstChk01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							}
							wgRqstChk01.up0().add(wgRqstChk01DtlR);
						}
					}
					// 更新以外
					else {
						WgRqst_Chk01_DtlR wgRqstChk01DtlR = WgRqst_Chk01_DtlR.create();
						copy(wgRqstChk01DtlR, r, createMap_WgRqst_Chk01_DtlR_ShipDmndRqst_Chk01_DtlR());
						wgRqstChk01.up0().add(wgRqstChk01DtlR);
					}
				}
			}
			
			MCIndexKey up0Key = up0().createIndex(ShipDmndRqst_Chk01_DtlR.$peg_no, ShipDmndRqst_Chk01_DtlR.$wg_rqst_typ);
			
			// ＷＧ間依頼サービスのチェックを実行
			if(!wgRqstChk01.up0().isEmpty()) {
				MCNumber startPegNo = MCNumber.ZERO;
				if (!poSchdChk01.up0().isEmpty()) {
					startPegNo = startPegNo.add(poSchdChk01.up0().size());
				}
				if (!xfrSchdChk04.up0().isEmpty()) {
					startPegNo = startPegNo.add(xfrSchdChk04.up0().size());
				}
				wgRqstChk01.up1().start_peg_no(startPegNo);
				
				wgRqstChk01.exec();
				copyErrFlg(up0(), wgRqstChk01.down0());

				for(WgRqst_Chk01_DtlR wgRqstChk01R : wgRqstChk01.down0()) {
					for(ShipDmndRqst_Chk01_DtlR up0 : up0().subList(up0Key, wgRqstChk01R.peg_no(), wgRqstChk01R.wg_rqst_typ())) {
						if(wgRqstChk01R.inst_po_flg()) {
							up0.inst_po_flg(wgRqstChk01R.inst_po_flg());
						}
						if(wgRqstChk01R.act_flg()) {
							up0.act_flg(wgRqstChk01R.act_flg());
						}
					}
				}
				
				// ＷＧ間依頼サービスで作成した後続サービスの上り電文を追加
				for(WgRqst_Chk01_Dtl2R r : wgRqstChk01.down1()) {
					poSchdChk01.up0().add(r.poSchdChk01());
				}
				for(WgRqst_Chk01_Dtl3R r : wgRqstChk01.down2()) {
					xfrSchdChk04.up0().add(r.xfrSchdChk04());
				}
			}
			
			MCNumber pegNo = MCNumber.ZERO;
			
			// 発注予定登録サービスのチェックを実行
			if(!poSchdChk01.up0().isEmpty()) {
				for(PoSchd_Upd01_DtlR poSchdChk01DtlR : poSchdChk01.up0()) {
					if (isNull(poSchdChk01DtlR.getNumberNE("org_peg_no"))) {
						getPegNoMapForPoSchd().put(pegNo, poSchdChk01DtlR.peg_no());
						getPegNoMapBySrcNo().putCache(toVals(MSC_WG_RQST_TYP.PURC.value(), nvl(poSchdChk01DtlR.po_schd_src_no(), MAC_STR.NULL_VAL.value()), poSchdChk01DtlR.peg_no()), pegNo);
						poSchdChk01DtlR.addNumberColumn("org_peg_no", poSchdChk01DtlR.peg_no());
						poSchdChk01DtlR.peg_no(pegNo);
						pegNo = pegNo.add(1);
					}
					else {
						getPegNoMapForPoSchd().put(poSchdChk01DtlR.peg_no(), poSchdChk01DtlR.getNumber("org_peg_no"));
						getPegNoMapBySrcNo().putCache(toVals(MSC_WG_RQST_TYP.PURC.value(), nvl(poSchdChk01DtlR.po_schd_src_no(), MAC_STR.NULL_VAL.value()), poSchdChk01DtlR.peg_no()), poSchdChk01DtlR.peg_no());
					}
				}
				
				MCMessageList tmpMsgL = (MCMessageList)MCMessagePool.getMessageList().clone();
				MCMessagePool.clear();
				
				poSchdChk01.exec();
				
				nextChkMsgL.addAll((MCMessageList)MCMessagePool.getMessageList().clone());
				
				MCMessagePool.clear();
				MCMessagePool.addAll(tmpMsgL);
				
				boolean noCauseRowMsgAddFlg = false;
				for(PoSchd_Upd01_DtlR poSchdChk01R : poSchdChk01.down0()) {
					MCNumber tmpPegNo = getPegNoMapForPoSchd().get(poSchdChk01R.peg_no());
					for(ShipDmndRqst_Chk01_DtlR up0 : up0().subList(up0Key, tmpPegNo, MSC_WG_RQST_TYP.PURC.value())) {
						if(poSchdChk01R.err_flg()) {
							up0.err_flg(poSchdChk01R.err_flg());
						}
						if(poSchdChk01R.po_flg()) {
							up0.inst_po_flg(poSchdChk01R.po_flg());
						}
						if(poSchdChk01R.act_flg()) {
							up0.act_flg(poSchdChk01R.act_flg());
						}
						if(!poSchdChk01R.po_flg() && !poSchdChk01R.act_flg() && poSchdChk01R.err_flg()) {
							// 退避していたメッセージを格納
							for(MCMessage msgR : nextChkMsgL) {
								if (msgR.getCauseRow() == null) {
									noCauseRowMsgAddFlg = true;
								}
								else if (isSame(msgR.getCauseRow().getParamRowIndex(), up0.getParamRowIndex())) {
									MCMessagePool.add(msgR);
								}
							}
						}
					}
				}
				if (noCauseRowMsgAddFlg) {
					for(MCMessage msgR : nextChkMsgL) {
						if (msgR.getCauseRow() == null) {
							MCMessagePool.add(msgR);
						}
					}
				}
			}

			// 移動・移送予定サービスのチェックを実行
			if(!xfrSchdChk04.up0().isEmpty()) {
				// 移動・移送予定サービスに紐付けＮＯを一意で連携するために元々の紐付けＮＯとのマッピングを保持する
				for(XfrSchdChk04_DtlR xfrSchdChk04DtlR : xfrSchdChk04.up0()) {
					if (isNull(xfrSchdChk04DtlR.getNumberNE("org_peg_no"))) {
						getPegNoMapForXfrSchd().put(pegNo, xfrSchdChk04DtlR.peg_no());
						getPegNoMapBySrcNo().putCache(toVals(MSC_WG_RQST_TYP.XFR.value(), nvl(xfrSchdChk04DtlR.xfr_src_no(), MAC_STR.NULL_VAL.value()), xfrSchdChk04DtlR.peg_no()), pegNo);
						xfrSchdChk04DtlR.addNumberColumn("org_peg_no", xfrSchdChk04DtlR.peg_no());
						xfrSchdChk04DtlR.peg_no(pegNo);
						pegNo = pegNo.add(1);
					}
					else {
						getPegNoMapForXfrSchd().put(xfrSchdChk04DtlR.peg_no(), xfrSchdChk04DtlR.getNumber("org_peg_no"));
						getPegNoMapBySrcNo().putCache(toVals(MSC_WG_RQST_TYP.XFR.value(), nvl(xfrSchdChk04DtlR.xfr_src_no(), MAC_STR.NULL_VAL.value()), xfrSchdChk04DtlR.peg_no()), xfrSchdChk04DtlR.peg_no());
					}
				}

				MCMessageList tmpMsgL = (MCMessageList)MCMessagePool.getMessageList().clone();
				MCMessagePool.clear();
				
				xfrSchdChk04.exec();

				nextChkMsgL.addAll((MCMessageList)MCMessagePool.getMessageList().clone());

				MCMessagePool.clear();
				MCMessagePool.addAll(tmpMsgL);

				boolean noCauseRowMsgAddFlg = false;
				// 一時的に発番した紐付けＮＯを元に上り電文を処理する
				for(XfrSchdChk04_DtlR xfrSchdChk04R : xfrSchdChk04.down0()) {
					MCNumber tmpPegNo = getPegNoMapForXfrSchd().get(xfrSchdChk04R.peg_no());
					for(ShipDmndRqst_Chk01_DtlR up0 : up0().subList(up0Key, tmpPegNo, MSC_WG_RQST_TYP.XFR.value())) {
						if(xfrSchdChk04R.inst_flg()) {
							up0.inst_po_flg(xfrSchdChk04R.inst_flg());
						}
						if(xfrSchdChk04R.act_flg()) {
							up0.act_flg(xfrSchdChk04R.act_flg());
						}
						if(!xfrSchdChk04R.inst_flg() && !xfrSchdChk04R.act_flg() && xfrSchdChk04R.err_flg()) {
							up0.err_flg(xfrSchdChk04R.err_flg());
							// 退避していたメッセージを格納
							for(MCMessage msgR : nextChkMsgL) {
								if (msgR.getCauseRow() == null) {
									noCauseRowMsgAddFlg = true;
								}
								else if (isSame(msgR.getCauseRow().getParamRowIndex(), up0.getParamRowIndex())) {
									MCMessagePool.add(msgR);
								}
							}
						}
					}
				}
				if (noCauseRowMsgAddFlg) {
					for(MCMessage msgR : nextChkMsgL) {
						if (msgR.getCauseRow() == null) {
							MCMessagePool.add(msgR);
						}
					}
				}
			}
						
			// 次処理済の場合、エラーとすべきか判断する。
			for(ShipDmndRqst_Chk01_DtlR r : up0()) {
				if (!r.inst_po_flg() && !r.act_flg()) {
					continue;
				}
				MST_PO_SCHD_R poSchdR = poSchdL.getFirst(poSchdKey, r.po_schd_src_typ(), r.po_schd_src_no());
				MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(xfrSchdKey, r.xfr_src_typ(), r.xfr_src_no());
				// ＷＧを跨がない場合
				if(isSame(r.rqst_fr_wg_cd(), r.rqst_to_wg_cd()) || !isNull(poSchdR) || !isNull(xfrSchdR)) {
					// 購買依頼
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
						if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							// 品目などが変更された場合、エラー
							if(!isNull(poSchdR)) {
								if(mainColChgPurc(poSchdR, r) || !isSame(r.rqst_to_wg_cd(), poSchdR.rqst_wg_cd())) {
									r.err_flg(true);
								}
							}

							// 実績済の場合はエラー
							if(r.act_flg() && !r.abort_flg()) {
								r.err_flg(true);
							}
							
							// 仕入直送で打切の場合はエラー
							if(!isNull(r.dlv_cd()) && r.abort_flg()) {
								r.err_flg(true);
							}
							// 仕入直送でＷＧ間からＷＧ内へ変更された場合はエラー
							if(!isNull(r.dlv_cd())) {
								MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(wgRqstKey, r.wg_rqst_src_typ(), r.wg_rqst_src_no(), r.wg_rqst_typ());
								if(!isNull(wgRqstR)) {
									r.err_flg(true);
								}
							}
						}
						else if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							// 仕入直送、品目オーダからの場合、エラー
							if(!isNull(r.dlv_cd()) || !isNull(r.itm_ord_no())) {
								r.err_flg(true);
							}
							
							// 更新のための削除の場合はエラー
							if(r.upd_flg()) {
								r.err_flg(true);
							}
						}
					}
					// 移送依頼
					else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
						if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							if(!isNull(xfrSchdR)) {
								if(mainColChgXfr(xfrSchdR, r) || !isSame(r.rqst_to_wg_cd(), xfrSchdR.gi_wg_cd())) {
									r.err_flg(true);
								}
							}
							// 実績済の場合はエラー
							if(r.act_flg() && !r.abort_flg()) {
								r.err_flg(true);
							}
						}
						else if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							// 品目オーダからの場合、エラー
							if(!isNull(r.itm_ord_no())) {
								r.err_flg(true);
							}
							
							// 更新のための削除の場合はエラー
							if(r.upd_flg()) {
								r.err_flg(true);
							}
						}
					}
					
					if(r.err_flg()) {
						// 退避していたメッセージを格納
						for(MCMessage msgR : nextChkMsgL) {
							if(msgR.getCauseRow() == null
									|| isSame(msgR.getCauseRow().getParamRowIndex(), r.getParamRowIndex())) {
								MCMessagePool.add(msgR);
							}
						}						
					}
					else {
						MCMessagePool.add(new MCMessage(r, null, MSBAL0032, toDispGUIIndex(r)));
					}
				}
				// ＷＧを跨ぐ場合
				else if(!isSame(r.rqst_fr_wg_cd(), r.rqst_to_wg_cd())) {
					if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						// 品目オーダから作成された依頼の場合はエラー
						if(!isNull(r.itm_ord_no())) {
							r.err_flg(true);
						}
						// 仕入直送の場合はエラー
						else if(!isNull(r.dlv_cd())) {
							if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
								r.err_flg(true);
							}
						}
						// 更新のための削除の場合はエラー
						else if(r.upd_flg()) {
							r.err_flg(true);
						}
					}
					else if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						// 実績済での変更はエラー
						if(r.act_flg() && !r.abort_flg()) {
							r.err_flg(true);
						}
						// 依頼内容が変わるような変更の場合は、削除で連携しているため、チェック
						MST_WG_RQST_R chkWgRqst = wgRqstL.getFirst(wgRqstKey, r.wg_rqst_src_typ(), r.wg_rqst_src_no(), r.wg_rqst_typ());
						if(!isNull(chkWgRqst)) {
							if(mainColChgWg(chkWgRqst, r)) {
								r.err_flg(true);
							}
						}
						// 仕入直送の打切の場合はエラー
						if(!isNull(r.dlv_cd()) && r.abort_flg()) {
							if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
								r.err_flg(true);
							}
						}
					}
					
					if(r.err_flg()) {
						// 退避していたメッセージを格納
						for(MCMessage msgR : nextChkMsgL) {
							if(msgR.getCauseRow() == null
									|| isSame(msgR.getCauseRow().getParamRowIndex(), r.getParamRowIndex())) {
								MCMessagePool.add(msgR);
							}
						}
					}
					else {
						MCMessagePool.add(new MCMessage(r, null, MSBAL0032, toDispGUIIndex(r)));
					}
				}
			}
		}
		
		/**
		 * 前回の依頼内容と今回の依頼内容が変わっているか判断する【ＷＧ間依頼用】
		 * @param wgRqstR 前回の依頼内容
		 * @param r　今回の依頼内容
		 * @return boolean 変更があるかどうか
		 */
		protected boolean mainColChgWg(MST_WG_RQST_R wgRqstR, ShipDmndRqst_Chk01_DtlR r) {
			if(!isSame(wgRqstR.itm_cd(), r.itm_cd())
				|| !isSame(wgRqstR.itm_nm(), r.itm_nm())
				|| !isSame(wgRqstR.itm_sub1(), r.itm_sub1())
				|| !isSame(wgRqstR.itm_sub2(), r.itm_sub2())
				|| !isSame(wgRqstR.itm_sub3(), r.itm_sub3())
				|| !isSame(wgRqstR.gr_loc_cd(), r.gr_loc_cd())
				|| !isSame(wgRqstR.gr_str_ln_cd(), r.gr_str_ln_cd())
				|| !isSame(wgRqstR.sno1(), r.sno1())
				|| !isSame(wgRqstR.sno1_null_flg(), r.sno1_null_flg())
				|| !isSame(wgRqstR.sno2(), r.sno2())
				|| !isSame(wgRqstR.sno2_null_flg(), r.sno2_null_flg())
				|| !isSame(wgRqstR.sno3(), r.sno3())
				|| !isSame(wgRqstR.sno3_null_flg(), r.sno3_null_flg())
				|| !isSame(wgRqstR.sno4(), r.sno4())
				|| !isSame(wgRqstR.sno4_null_flg(), r.sno4_null_flg())
				|| !isSame(wgRqstR.ver_no(), r.ver_no())
				|| !isSame(wgRqstR.rqst_to_wg_cd(), r.rqst_to_wg_cd())
			) {
				return true;
			}
			return false;
		}

		/**
		 * 前回の依頼内容と今回の依頼内容が変わっているか判断する【購買依頼用】
		 * @param poSchdR　前回の発注予定
		 * @param r　今回の依頼内容
		 * @return boolean 変更があるかどうか
		 */
		protected boolean mainColChgPurc(MST_PO_SCHD_R poSchdR, ShipDmndRqst_Chk01_DtlR r) {
			if(isNull(poSchdR) || poSchdR.isEmpty()) {
				return false;
			}
			if(!isSame(poSchdR.itm_cd(), r.itm_cd())
				|| !isSame(poSchdR.itm_nm(), r.itm_nm())
				|| !isSame(poSchdR.itm_sub1(), r.itm_sub1())
				|| !isSame(poSchdR.itm_sub2(), r.itm_sub2())
				|| !isSame(poSchdR.itm_sub3(), r.itm_sub3())
				|| !isSame(poSchdR.in_to_loc_cd(), r.gr_loc_cd())
				|| !isSame(poSchdR.str_ln_cd(), r.gr_str_ln_cd())
				|| !isSame(poSchdR.sno1(), r.sno1())
				|| !isSame(poSchdR.sno2(), r.sno2())
				|| !isSame(poSchdR.sno3(), r.sno3())
				|| !isSame(poSchdR.sno4(), r.sno4())
				|| !isSame(poSchdR.ver_no(), r.ver_no())
			) {
				return true;
			}			
			return false;
		}

		/**
		 * 前回の依頼内容と今回の依頼内容が変わっているか判断する【移送依頼用】
		 * @param xfrSchdR　前回の移動・移送予定
		 * @param r　今回の依頼内容
		 * @return boolean 変更があるかどうか
		 */
		protected boolean mainColChgXfr(MST_XFR_SCHD_R xfrSchdR, ShipDmndRqst_Chk01_DtlR r) {
			if(isNull(xfrSchdR) || xfrSchdR.isEmpty()) {
				return false;
			}
			if(!isSame(xfrSchdR.itm_cd(), r.itm_cd())
				|| !isSame(xfrSchdR.itm_sub1(), r.itm_sub1())
				|| !isSame(xfrSchdR.itm_sub2(), r.itm_sub2())
				|| !isSame(xfrSchdR.itm_sub3(), r.itm_sub3())
				|| !isSame(xfrSchdR.gr_loc_cd(), r.gr_loc_cd())
				|| !isSame(xfrSchdR.gr_str_ln_cd(), r.gr_str_ln_cd())
				|| !isSame(xfrSchdR.sno1(), r.sno1())
				|| !isSame(xfrSchdR.sno1_null_flg(), r.sno1_null_flg())
				|| !isSame(xfrSchdR.sno2(), r.sno2())
				|| !isSame(xfrSchdR.sno2_null_flg(), r.sno2_null_flg())
				|| !isSame(xfrSchdR.sno3(), r.sno3())
				|| !isSame(xfrSchdR.sno3_null_flg(), r.sno3_null_flg())
				|| !isSame(xfrSchdR.sno4(), r.sno4())
				|| !isSame(xfrSchdR.sno4_null_flg(), r.sno4_null_flg())
				|| !isSame(xfrSchdR.ver_no(), r.ver_no())
			) {
				return true;
			}
			return false;
		}

		protected Map_PoSchd_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR<PoSchd_Upd01_DtlR,ShipDmndRqst_Chk01_DtlR> createMap_PoSchd_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR() {
			return new Map_PoSchd_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR<PoSchd_Upd01_DtlR, ShipDmndRqst_Chk01_DtlR>();
		}

		public class Map_PoSchd_Upd01_DtlR_ShipDmndRqst_Chk01_DtlR<D extends PoSchd_Upd01_DtlR, S extends ShipDmndRqst_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSchd_Upd01_DtlR.$peg_no, ShipDmndRqst_Chk01_DtlR.$peg_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$data_crud_typ, ShipDmndRqst_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_typ, ShipDmndRqst_Chk01_DtlR.$po_schd_src_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_no, ShipDmndRqst_Chk01_DtlR.$po_schd_src_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_cd, ShipDmndRqst_Chk01_DtlR.$itm_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub1, ShipDmndRqst_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub2, ShipDmndRqst_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub3, ShipDmndRqst_Chk01_DtlR.$itm_sub3);
			}
		}
		
		protected Map_XfrSchdChk04_DtlR_ShipDmndRqst_Chk01_DtlR<XfrSchdChk04_DtlR,ShipDmndRqst_Chk01_DtlR> createMap_XfrSchdChk04_DtlR_ShipDmndRqst_Chk01_DtlR() {
			return new Map_XfrSchdChk04_DtlR_ShipDmndRqst_Chk01_DtlR<XfrSchdChk04_DtlR, ShipDmndRqst_Chk01_DtlR>();
		}

		public class Map_XfrSchdChk04_DtlR_ShipDmndRqst_Chk01_DtlR<D extends XfrSchdChk04_DtlR, S extends ShipDmndRqst_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, ShipDmndRqst_Chk01_DtlR.$peg_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$data_crud_typ, ShipDmndRqst_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$xfr_src_typ, ShipDmndRqst_Chk01_DtlR.$xfr_src_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$xfr_src_no, ShipDmndRqst_Chk01_DtlR.$xfr_src_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_loc_cd, ShipDmndRqst_Chk01_DtlR.$gi_loc_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_loc_cd, ShipDmndRqst_Chk01_DtlR.$gr_loc_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_cd, ShipDmndRqst_Chk01_DtlR.$itm_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub1, ShipDmndRqst_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub2, ShipDmndRqst_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub3, ShipDmndRqst_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_rqst_tm, ShipDmndRqst_Chk01_DtlR.$gi_rqst_tm);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_rqst_tm, ShipDmndRqst_Chk01_DtlR.$gr_rqst_tm);
			}
		}
		
		protected Map_WgRqst_Chk01_DtlR_ShipDmndRqst_Chk01_DtlR<WgRqst_Chk01_DtlR,ShipDmndRqst_Chk01_DtlR> createMap_WgRqst_Chk01_DtlR_ShipDmndRqst_Chk01_DtlR() {
			return new Map_WgRqst_Chk01_DtlR_ShipDmndRqst_Chk01_DtlR<WgRqst_Chk01_DtlR, ShipDmndRqst_Chk01_DtlR>();
		}

		public class Map_WgRqst_Chk01_DtlR_ShipDmndRqst_Chk01_DtlR<D extends WgRqst_Chk01_DtlR, S extends ShipDmndRqst_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Chk01_DtlR.$data_crud_typ, ShipDmndRqst_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(WgRqst_Chk01_DtlR.$peg_no, ShipDmndRqst_Chk01_DtlR.$peg_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$wg_rqst_typ, ShipDmndRqst_Chk01_DtlR.$wg_rqst_typ);
				addColumnPathMap(WgRqst_Chk01_DtlR.$wg_rqst_src_typ, ShipDmndRqst_Chk01_DtlR.$wg_rqst_src_typ);
				addColumnPathMap(WgRqst_Chk01_DtlR.$wg_rqst_src_no, ShipDmndRqst_Chk01_DtlR.$wg_rqst_src_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$rqst_dt, ShipDmndRqst_Chk01_DtlR.$rqst_dt);
				addColumnPathMap(WgRqst_Chk01_DtlR.$rqst_fr_wg_cd, ShipDmndRqst_Chk01_DtlR.$rqst_fr_wg_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$rqst_fr_dpt_cd, ShipDmndRqst_Chk01_DtlR.$rqst_fr_dpt_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$gr_loc_cd, ShipDmndRqst_Chk01_DtlR.$gr_loc_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$gr_str_ln_cd, ShipDmndRqst_Chk01_DtlR.$gr_str_ln_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$gr_rqst_tm, ShipDmndRqst_Chk01_DtlR.$gr_rqst_tm);
				addColumnPathMap(WgRqst_Chk01_DtlR.$rqst_to_wg_cd, ShipDmndRqst_Chk01_DtlR.$rqst_to_wg_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$gi_loc_cd, ShipDmndRqst_Chk01_DtlR.$gi_loc_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$gi_str_ln_cd, ShipDmndRqst_Chk01_DtlR.$gi_str_ln_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$gi_rqst_tm, ShipDmndRqst_Chk01_DtlR.$gi_rqst_tm);
				addColumnPathMap(WgRqst_Chk01_DtlR.$itm_cd, ShipDmndRqst_Chk01_DtlR.$itm_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$itm_sub1, ShipDmndRqst_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(WgRqst_Chk01_DtlR.$itm_sub2, ShipDmndRqst_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(WgRqst_Chk01_DtlR.$itm_sub3, ShipDmndRqst_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(WgRqst_Chk01_DtlR.$itm_nm, ShipDmndRqst_Chk01_DtlR.$itm_nm);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno1, ShipDmndRqst_Chk01_DtlR.$sno1);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno1_null_flg, ShipDmndRqst_Chk01_DtlR.$sno1_null_flg);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno2, ShipDmndRqst_Chk01_DtlR.$sno2);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno2_null_flg, ShipDmndRqst_Chk01_DtlR.$sno2_null_flg);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno3, ShipDmndRqst_Chk01_DtlR.$sno3);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno3_null_flg, ShipDmndRqst_Chk01_DtlR.$sno3_null_flg);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno4, ShipDmndRqst_Chk01_DtlR.$sno4);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno4_null_flg, ShipDmndRqst_Chk01_DtlR.$sno4_null_flg);
				addColumnPathMap(WgRqst_Chk01_DtlR.$trd_unit_qty, ShipDmndRqst_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(WgRqst_Chk01_DtlR.$trd_unit_cd, ShipDmndRqst_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sppl_cd, ShipDmndRqst_Chk01_DtlR.$sppl_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$maker_cd, ShipDmndRqst_Chk01_DtlR.$maker_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$slo_no, ShipDmndRqst_Chk01_DtlR.$slo_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$slo_d_no, ShipDmndRqst_Chk01_DtlR.$slo_d_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$cst_cd, ShipDmndRqst_Chk01_DtlR.$cst_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$dlv_cd, ShipDmndRqst_Chk01_DtlR.$dlv_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$itm_ord_no, ShipDmndRqst_Chk01_DtlR.$itm_ord_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$mfg_loc_cd, ShipDmndRqst_Chk01_DtlR.$mfg_loc_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$bom_ptn, ShipDmndRqst_Chk01_DtlR.$bom_ptn);
				addColumnPathMap(WgRqst_Chk01_DtlR.$upd_flg, ShipDmndRqst_Chk01_DtlR.$upd_flg);
				addColumnPathMap(WgRqst_Chk01_DtlR.$abort_flg, ShipDmndRqst_Chk01_DtlR.$abort_flg);
				addColumnPathMap(WgRqst_Chk01_DtlR.$abort_can_flg, ShipDmndRqst_Chk01_DtlR.$abort_can_flg);
				addColumnPathMap(WgRqst_Chk01_DtlR.$cred_no_up_flg, ShipDmndRqst_Chk01_DtlR.$cred_no_up_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if(MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
					if(!src.abort_flg()) {
						dest.upd_flg(true);						
					}
				}
				dest.setDateNE("avl_schd_dt", src.getDateNE("avl_schd_dt"));
			}
		}
	}
	/**
	 * ShipDmndRqst_Upd02オペレーション.<p>
	 *
	 * 発注予定、移動・移送予定を登録・訂正・削除する。<br>
	 */
	public class ShipDmndRqst_Upd02 extends MSBAL_ShipDmndRqstService_MC_A.ShipDmndRqst_Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 作成元区分、作成元ＮＯを補完
			setSrcTyp();
			
			// 関連マスタを補完
			sprtMst();
			
			// 発注予定、移動・移送予定、受払予定を登録・訂正・削除する
			regSchd();
		}
		
		/**
		 * 発注予定作成元区分、移動・移送元区分、元ＮＯを補完
		 */
		protected void setSrcTyp() {
			for(ShipDmndRqst_Upd01_DtlR r : up0()) {
				// 購買依頼の場合、発注予定作成元区分を補完
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					if(isSame(r.rqst_fr_wg_cd(), r.rqst_to_wg_cd())) {
						if(MSC_WG_RQST_SRC_TYP.isSLO(r.wg_rqst_src_typ())) {
							r.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.SLO.value());
						}
						else if(MSC_WG_RQST_SRC_TYP.isORD(r.wg_rqst_src_typ())) {
							r.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.PPLN.value());
						}
						else if(MSC_WG_RQST_SRC_TYP.isOP_RPL(r.wg_rqst_src_typ())) {
							r.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.OP.value());
						}
						r.po_schd_src_no(r.wg_rqst_src_no());
					}
					else {
						r.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.RQST.value());
						r.po_schd_src_no(r.wg_rqst_prms_no());
					}
				}
				// 移送依頼の場合、移動・移送元区分を補完
				else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					if(isSame(r.rqst_fr_wg_cd(), r.rqst_to_wg_cd())) {
						if(MSC_WG_RQST_SRC_TYP.isSLO(r.wg_rqst_src_typ())) {
							r.xfr_src_typ(MSC_XFR_SRC_TYP.SLO.value());
						}
						else if(MSC_WG_RQST_SRC_TYP.isORD(r.wg_rqst_src_typ())) {
							r.xfr_src_typ(MSC_XFR_SRC_TYP.ITM_ORD.value());
						}
						else if(MSC_WG_RQST_SRC_TYP.isOP_RPL(r.wg_rqst_src_typ())) {
							r.xfr_src_typ(MSC_XFR_SRC_TYP.OP_RPL.value());
						}
						r.xfr_src_no(r.wg_rqst_src_no());
					}
					else {
						r.xfr_src_typ(MSC_XFR_SRC_TYP.WG_RQST.value());
						r.xfr_src_no(r.wg_rqst_prms_no());
					}
				}
			}
		}
		
		/**
		 * 関連するマスタを補完
		 */
		protected void sprtMst() {
			// 品目マスタを取得
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setSelect(t.itm_nm);
			itmL_bldr.addSelect(t.asset_mng_typ);
			itmL_bldr.addSelect(t.sundry_itm_flg);
			itmL_bldr.addSelect(t.itm_cd);
			itmL_bldr.addSelect(t.itm_sub1);
			itmL_bldr.addSelect(t.itm_sub2);
			itmL_bldr.addSelect(t.itm_sub3);
			dbSelectKey("MSBAL5130_MAM_ITM_S01", itmL, itmL_bldr, up0());
			MCIndexKey itmKey = itmL.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);

			// 入庫場所に対する場所マスタを取得
			MCList<MAM_LOC_R> grLocL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t2 = MAM_LOC_R.create("T");
			MCQueryApiBuilder grLocL_bldr = MCQueryApiBuilder.create(t2);
			grLocL_bldr.setSelect(t2.wg_cd);
			grLocL_bldr.addSelect(t2.lg_grp_cd);
			grLocL_bldr.addSelect(t2.loc_cd);
			grLocL_bldr.setWhere(t2.loc_cd.eq(bind("gr_loc_cd")));
			dbSelect("MSBAL5130_MAM_LOC_S01", grLocL, grLocL_bldr, up0().groupBy(ShipDmndRqst_Upd01_DtlR.$gr_loc_cd));
			MCIndexKey grLocKey = grLocL.createIndex(MAM_LOC_R.$loc_cd);

			// 出庫場所に対する場所マスタを取得
			MCList<MAM_LOC_R> giLocL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t3 = MAM_LOC_R.create("T");
			MCQueryApiBuilder giLocL_bldr = MCQueryApiBuilder.create(t3);
			giLocL_bldr.setSelect(t3.wg_cd);
			giLocL_bldr.addSelect(t3.lg_grp_cd);
			giLocL_bldr.addSelect(t3.loc_cd);
			giLocL_bldr.setWhere(t3.loc_cd.eq(bind("gi_loc_cd")));
			dbSelect("MSBAL5130_MAM_LOC_S02", giLocL, giLocL_bldr, up0().groupBy(ShipDmndRqst_Upd01_DtlR.$gi_loc_cd));
			MCIndexKey giLocKey = giLocL.createIndex(MAM_LOC_R.$loc_cd);			
			
			// 受注紐付での経費購買用の業務理由マスタを取得
			MAM_BIZ_RSN_R bizRsnR = MAM_BIZ_RSN_R.create();
			MAM_BIZ_RSN_R t4 = MAM_BIZ_RSN_R.create("T");
			MCQueryApiBuilder bizRsnR_bldr = MCQueryApiBuilder.create(t4);
			bizRsnR_bldr.setSelect(t4.biz_rsn_cd);
			bizRsnR_bldr.setWhere(t4.slo_xpns_purc_flg.eq(value(true)));
			dbSelect("MSBAL5130_MAM_BIZ_RSN_S01", bizRsnR, bizRsnR_bldr);
			
			for(ShipDmndRqst_Upd01_DtlR r : up0()) {
				// 品目マスタの情報を補完
				MAM_ITM_R itmR = itmL.getFirst(itmKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if(!isNull(itmR)) {
					r.sundry_itm_flg(itmR.sundry_itm_flg());
					r.asset_mng_typ(itmR.asset_mng_typ());
				}
				
				// 入庫場所の情報を補完
				MAM_LOC_R grLocR = grLocL.getFirst(grLocKey, r.gr_loc_cd());
				if(!isNull(grLocR)) {
					r.gr_loc_wg_cd(grLocR.wg_cd());
					r.gr_lg_grp_cd(grLocR.lg_grp_cd());
				}

				// 出庫場所の情報を補完
				MAM_LOC_R giLocR = giLocL.getFirst(giLocKey, r.gi_loc_cd());
				if(!isNull(giLocR)) {
					r.gi_loc_wg_cd(giLocR.wg_cd());
					r.gi_lg_grp_cd(giLocR.lg_grp_cd());
				}
				
				// 受注紐付での購買依頼で経費購買の場合、デフォルトの理由、負担部門を設定
				if(!isNull(r.slo_d_no())) {
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
						if(MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ())) {
							// 売上部門を負担部門に設定
							r.bd_dpt_cd(r.rqst_fr_dpt_cd());
							if(!bizRsnR.isEmpty()) {
								r.purc_rsn_cd(bizRsnR.biz_rsn_cd());
							}
						}
					}
				}
			}
		}

		/**
		 * 発注予定、移動・移送予定、受払予定を登録・訂正・削除する。
		 */
		protected void regSchd() {
			MSBDL_PoSchdRegService.PoSchd_Upd01 poSchdUpd01 = MSBDL_PoSchdRegService.crtPoSchd_Upd01();
			MSBDL_PoSchdRegService.PoSchd_Upd04 poSchdUpd04 = MSBDL_PoSchdRegService.crtPoSchd_Upd04();
			MSBCL_OrdRegService.Ord_Sprt02 ordSprt02 = MSBCL_OrdRegService.crtOrd_Sprt02();
			MSBCL_OrdRegService.Ord_Sprt04 ordSprt04 = MSBCL_OrdRegService.crtOrd_Sprt04();
			MSBCL_OrdRegService.Ord_Upd01 ordUpd01 = MSBCL_OrdRegService.crtOrd_Upd01();
			MSBEL_IoSchdService.IoSchd_Ins01 ioSchdIns01 = MSBEL_IoSchdService.crtIoSchd_Ins01();
			MSBEL_IoSchdService.IoSchd_Del02 ioSchdDel02 = MSBEL_IoSchdService.crtIoSchd_Del02();
			MSBEL_XfrSchdService.XfrSchd_Upd01 xfrSchdUpd01 = MSBEL_XfrSchdService.crtXfrSchd_Upd01();
			MSBEL_XfrSchdService.XfrSchd_Upd01 delXfrSchdUpd01 = MSBEL_XfrSchdService.crtXfrSchd_Upd01();
			MSBEL_XfrSchdService.XfrSchd_Upd03 xfrSchdUpd03 = MSBEL_XfrSchdService.crtXfrSchd_Upd03();

			// オーダ登録サービスの予定日計算を実行
			callOrdSprt03();
			
			// 各予定の状況を取得する。
			MCList<ShipDmndRqst_Upd01_DtlR> purcBindL = MCList.create(ShipDmndRqst_Upd01_DtlR.class);
			MCList<ShipDmndRqst_Upd01_DtlR> xfrBindL = MCList.create(ShipDmndRqst_Upd01_DtlR.class);
			for(ShipDmndRqst_Upd01_DtlR r : up0()) {
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					purcBindL.add(r);
				}
				else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					xfrBindL.add(r);
				}
			}
			
			// 発注予定の状況を取得
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			if(!purcBindL.isEmpty()) {
				MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
				MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
				MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
				purcBindL.sort(ShipDmndRqst_Upd01_DtlR.$po_schd_src_typ, ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_no);
				poSchdL_bldr.setSelect(t.po_flg);
				poSchdL_bldr.addSelect(t.rqst_upd_stop_flg);
				poSchdL_bldr.addSelect(t.can_flg);
				poSchdL_bldr.addSelect(t.abort_flg);
				poSchdL_bldr.addSelect(t.outsrc_itm_ord_no);
				poSchdL_bldr.addSelect(t2.itm_mfg_inst_no);
				poSchdL_bldr.addSelect(t.po_schd_src_typ);
				poSchdL_bldr.addSelect(t.po_schd_src_no);
				poSchdL_bldr.addLeftOuterJoin(t2, bracket(t2.itm_ord_no .eq(t.outsrc_itm_ord_no)
						.and(t2.can_flg.eq(value(false)))));
				poSchdL_bldr.setWhere(t.po_schd_src_typ.eq(bind("po_schd_src_typ")));
				poSchdL_bldr.addWhereWithAnd(t.po_schd_src_no.eq(bind("po_schd_src_no")));
				poSchdL_bldr.addWhereWithAnd(t.rqst_can_flg.eq(value(false)));
				poSchdL_bldr.addWhereWithAnd(t.split_src_schd_no.isNull());
				dbSelect("MSBAL5130_MST_PO_SCHD_S03", poSchdL, poSchdL_bldr, purcBindL);
			}
			MCIndexKey poSchdKey = poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_src_typ, MST_PO_SCHD_R.$po_schd_src_no);

			// 移動・移送予定の状況を取得
			MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
			if(!xfrBindL.isEmpty()) {
				MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
				MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(t);
				MST_XFR_ALLOC_STS_R t2 = MST_XFR_ALLOC_STS_R.create("T2");
				MST_SHIP_PR_R t3 = MST_SHIP_PR_R.create("T3");
				xfrBindL.sort(ShipDmndRqst_Upd01_DtlR.$xfr_src_typ, ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_no);
				xfrSchdL.addBooleanColumn("xfr_abort_flg");
				xfrSchdL.addBooleanColumn("cmpl_flg");
				xfrSchdL.addBooleanColumn("ship_pr_abort_flg");
				xfrSchdL.addBooleanColumn("dlv_cmpl_flg");
				xfrSchdL_bldr.setSelect(t.trd_ptn_typ);
				xfrSchdL_bldr.addSelect(nvl( t2.abort_flg, value(false)).as("xfr_abort_flg"));
				xfrSchdL_bldr.addSelect(nvl( t2.cmpl_flg, value(false)).as("cmpl_flg"));
				xfrSchdL_bldr.addSelect(nvl( t3.abort_flg, value(false)).as("ship_pr_abort_flg"));
				xfrSchdL_bldr.addSelect(nvl( t3.dlv_cmpl_flg, value(false)).as("dlv_cmpl_flg"));
				xfrSchdL_bldr.addSelect(nvl( t3.ship_inst_qty, value(0)).as("ship_inst_qty"));
				xfrSchdL_bldr.addSelect(nvl( t3.ship_act_qty, value(0)).as("ship_act_qty"));
				xfrSchdL_bldr.addSelect(t.xfr_src_typ);
				xfrSchdL_bldr.addSelect(t.xfr_src_no);
				xfrSchdL_bldr.addSelect(t.gi_lg_grp_cd);
				xfrSchdL_bldr.addSelect(t.gr_lg_grp_cd);
				xfrSchdL_bldr.setWhere(t.xfr_src_typ.eq(bind("xfr_src_typ")));
				xfrSchdL_bldr.addWhereWithAnd(t.xfr_src_no.eq(bind("xfr_src_no")));
				xfrSchdL_bldr.addWhereWithAnd(t.rqst_can_flg.eq(value(false)));
				xfrSchdL_bldr.addWhereWithAnd(t.gi_lg_grp_cd.neq(t.gr_lg_grp_cd));
				xfrSchdL_bldr.addLeftOuterJoin(t2, bracket( t2.xfr_schd_no.eq(t.xfr_schd_no)));
				xfrSchdL_bldr.addLeftOuterJoin(t3, bracket( t3.xfr_schd_no.eq(t.xfr_schd_no)));
				xfrSchdL_bldr.setOrderByAsc(t.xfr_src_typ, t.xfr_src_no);
				dbSelect("MSBAL5130_MST_XFR_SCHD_S03", xfrSchdL, xfrSchdL_bldr, xfrBindL);
			}

			// 移動・移送予定の状況を取得
			if(!xfrBindL.isEmpty()) {
				MCList<MST_XFR_SCHD_R> xfrSchdL2 = MCList.create(MST_XFR_SCHD_R.class);
				xfrSchdL2.addBooleanColumn("xfr_inst_flg");
				xfrSchdL2.addStringColumn("xfr_alloc_sts_typ");
				xfrSchdL2.addBooleanColumn("xfr_alloc_sts_cmpl_flg");
				xfrSchdL2.addStringColumn("pr_sts_typ");
				xfrSchdL2.addStringColumn("xfr_alloc_sts_no");
				
				MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
				MCQueryApiBuilder xfrSchdL2_bldr = MCQueryApiBuilder.create(t);
				MST_XFR_ALLOC_STS_R t2 = MST_XFR_ALLOC_STS_R.create("T2");
				// 移動
				xfrSchdL2_bldr.setSelect(t.xfr_src_typ);
				xfrSchdL2_bldr.addSelect(t.xfr_src_no);
				xfrSchdL2_bldr.addSelect(t2.xfr_alloc_sts_no);
				xfrSchdL2_bldr.addSelect(t.gi_lg_grp_cd);
				xfrSchdL2_bldr.addSelect(t.gr_lg_grp_cd);
				xfrSchdL2_bldr.addSelect(nvl( t2.cmpl_flg, value(false)).as("xfr_alloc_sts_cmpl_flg"));
				xfrSchdL2_bldr.addSelect(t2.pr_sts_typ);
				xfrSchdL2_bldr.setWhere(t.xfr_src_typ.eq(bind("xfr_src_typ")));
				xfrSchdL2_bldr.addWhereWithAnd(t.xfr_src_no.eq(bind("xfr_src_no")));
				xfrSchdL2_bldr.addWhereWithAnd(t.rqst_can_flg.eq(value(false)));
				xfrSchdL2_bldr.addWhereWithAnd(t.gi_lg_grp_cd.eq(t.gr_lg_grp_cd));
				xfrSchdL2_bldr.addLeftOuterJoin(t2, bracket( t2.xfr_schd_no.eq(t.xfr_schd_no)));
				dbSelect("MSBAL5130_MST_XFR_SCHD_S04", xfrSchdL2, xfrSchdL2_bldr, xfrBindL);
	
				if (!xfrSchdL2.isEmpty()) {
					MCList<MST_XFR_SCHD_R> tmpXfrSchdL = xfrSchdL2.clone();
					// ベース
					MCGroupByPolicy baseGbp = new MCGroupByPolicy(MST_XFR_SCHD_R.$xfr_src_typ, MST_XFR_SCHD_R.$xfr_src_no, MST_XFR_SCHD_R.$gi_lg_grp_cd, MST_XFR_SCHD_R.$gr_lg_grp_cd);
					tmpXfrSchdL.setAll(xfrSchdL2.groupBy(baseGbp));
	
					MCList<MST_XFR_SCHD_R> grpL1 = xfrSchdL2.groupBy(MST_XFR_SCHD_R.$xfr_src_no, "xfr_alloc_sts_cmpl_flg");
					MCList<MST_XFR_SCHD_R> grpL2 = xfrSchdL2.groupBy(MST_XFR_SCHD_R.$xfr_src_no, "pr_sts_typ");
					MCIndexKey grpL1Key = grpL1.createIndex(MST_XFR_SCHD_R.$xfr_src_no,	"xfr_alloc_sts_cmpl_flg");
					MCIndexKey grpL2Key = grpL2.createIndex(MST_XFR_SCHD_R.$xfr_src_no,	"pr_sts_typ");
					for (MST_XFR_SCHD_R r : tmpXfrSchdL) {
						// 移動移送予定に紐づく移動引当状況で完了したデータがある場合、次処理済
						 if (!isNull(grpL1.getFirst(grpL1Key, r.xfr_src_no(), true))) {
							r.setBooleanNE("xfr_inst_flg", true);
						}
						// 移動移送予定に紐づく移動引当状況に未指図以外（指図済・一部完了・完了）のレコードが存在する場合は、次処理済
						else if (!isNull(grpL2.getFirst(grpL2Key, r.xfr_src_no(), MSC_PR_STS_TYP.INST.value()))
									|| !isNull(grpL2.getFirst(grpL2Key, r.xfr_src_no(),	MSC_PR_STS_TYP.PART_COMP.value()))
									|| !isNull(grpL2.getFirst(grpL2Key, r.xfr_src_no(),	MSC_PR_STS_TYP.COMP.value()))) {
							r.setBooleanNE("xfr_inst_flg", true);
						}
						// 上記以外は、次処理未
						else {
							r.setBooleanNE("xfr_inst_flg", false);
						}
					}
	
					xfrSchdL.addAll(tmpXfrSchdL);
				}
			}

			MCIndexKey xfrSchdKey = xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_src_typ, MST_XFR_SCHD_R.$xfr_src_no);
			
			for(ShipDmndRqst_Upd01_DtlR r : up0()) {
				// 購買依頼の場合
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					// 外注品の場合、計画外の外注オーダを登録する。
					if(!isNullOrNullVal(r.mfg_loc_cd())) {
						MST_PO_SCHD_R poSchdR = poSchdL.getFirst(poSchdKey, r.po_schd_src_typ(), r.po_schd_src_no());
						
						// ＷＧを跨がず、品目オーダからの依頼の場合はオーダが既にあるため、対象外
						if(!isSame(r.rqst_fr_wg_cd(), r.rqst_to_wg_cd()) || isNull(r.itm_ord_no())) {
							if(isNull(poSchdR)) {
								// オーダ登録サービスのオーダ補完の上り電文を設定
								Ord_Upd01_Dtl1R ordUpd01Dtl1R = Ord_Upd01_Dtl1R.create();
								copy(ordUpd01Dtl1R, r, createMap_Ord_Upd01_Dtl1R_ShipDmndRqst_Upd01_DtlR());
								ordSprt04.up0().add(ordUpd01Dtl1R);
							}
							else {
								// 発注予定が次処理済でない場合、計画外の品目オーダを削除する
								if(!isNextOprPoSchd(poSchdR)) {
									// オーダ登録サービスのオーダ補完の上り電文を設定
									Ord_Upd01_Dtl1R ordUpd01Dtl1R = Ord_Upd01_Dtl1R.create();
									copy(ordUpd01Dtl1R, r, createMap_Ord_Upd01_Dtl1R_ShipDmndRqst_Upd01_DtlR());
									ordSprt04.up0().add(ordUpd01Dtl1R);
								}
							}
						}
						// 品目オーダから作成された外注オーダの場合、品目オーダＮＯを外注品目オーダＮＯに設定
						else {
							r.outsrc_itm_ord_no(r.itm_ord_no());
						}
						
						if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							// 投入品の受払予定を削除
							if(!isNull(poSchdR)) {
								// 発注予定が既に次処理済でない場合、投入品の受払予定の削除する
								if(!isNextOprPoSchd(poSchdR)) {
									MSW_IO_SCHD_DEL_R ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
									ioSchdDelR.setAttributes(r);
									ioSchdDelR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
									ioSchdDelR.io_schd_sub_no1(poSchdR.outsrc_itm_ord_no());
									ioSchdDel02.up0().add(ioSchdDelR);
								}
							}
						}
						else if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							if(!isNull(poSchdR)) {
								// 発注予定が既に次処理済でない場合、投入品の受払予定の削除・作成する
								if(!isNextOprPoSchd(poSchdR)) {
									// 投入品の受払予定を削除
									MSW_IO_SCHD_DEL_R ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
									ioSchdDelR.setAttributes(r);
									ioSchdDelR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
									ioSchdDelR.io_schd_sub_no1(poSchdR.outsrc_itm_ord_no());
									ioSchdDel02.up0().add(ioSchdDelR);
									
									// 投入品の受払予定を作成するため、構成展開を行う
									Ord_Sprt02_DtlR ordSprt02DtlR = Ord_Sprt02_DtlR.create();
									copy(ordSprt02DtlR, r, createMap_Ord_Sprt02_DtlR_ShipDmndRqst_Upd01_DtlR());
									ordSprt02.up1().add(ordSprt02DtlR);
								}
							}
						}
						else {
							// 投入品の受払予定を作成するため、構成展開を行う
							Ord_Sprt02_DtlR ordSprt02DtlR = Ord_Sprt02_DtlR.create();
							copy(ordSprt02DtlR, r, createMap_Ord_Sprt02_DtlR_ShipDmndRqst_Upd01_DtlR());
							ordSprt02.up1().add(ordSprt02DtlR);
						}
					}
					
					if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						// 発注予定登録サービスの登録
						PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
						copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_ShipDmndRqst_Upd01_DtlR());
						poSchdUpd01.up0().add(poSchdUpd01DtlR);						
					}
					else {
						MST_PO_SCHD_R poSchdR = poSchdL.getFirst(poSchdKey, r.po_schd_src_typ(), r.po_schd_src_no());
						if(isNull(poSchdR)) {
							// 発注予定登録サービスの登録
							PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
							copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_ShipDmndRqst_Upd01_DtlR());
							poSchdUpd01.up0().add(poSchdUpd01DtlR);
						}
						else {
							r.outsrc_itm_ord_no(poSchdR.outsrc_itm_ord_no());

							// 発注予定が既に発注済や打切済の場合は、依頼元訂正ＦＬＧ更新を実行する。
							if(isNextOprPoSchd(poSchdR) && !r.uplnd_outsrc_flg()) {
								PoSchd_Upd04_DtlR poSchdUpd04DtlR = PoSchd_Upd04_DtlR.create();
								copy(poSchdUpd04DtlR, r, createMap_PoSchd_Upd04_DtlR_ShipDmndRqst_Upd01_DtlR());
								poSchdUpd04.up0().add(poSchdUpd04DtlR);
							}
							else {
								// 発注予定登録サービスの登録
								PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
								copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_ShipDmndRqst_Upd01_DtlR());
								poSchdUpd01.up0().add(poSchdUpd01DtlR);
							}
						}						
					}					
				}
				// 移送依頼の場合
				else if (MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						// 移動・移送予定サービスのマッピング
						XfrSchd_DtlR xfrSchdDtlR = XfrSchd_DtlR.create();
						copy(xfrSchdDtlR, r, createMap_XfrSchd_DtlR_ShipDmndRqst_Upd01_DtlR());
						xfrSchdUpd01.up0().add(xfrSchdDtlR);
					}
					else {
						MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(xfrSchdKey, r.xfr_src_typ(), r.xfr_src_no());
						if(isNull(xfrSchdR)) {
							// 移動・移送予定サービスのマッピング
							XfrSchd_DtlR xfrSchdDtlR = XfrSchd_DtlR.create();
							copy(xfrSchdDtlR, r, createMap_XfrSchd_DtlR_ShipDmndRqst_Upd01_DtlR());
							xfrSchdUpd01.up0().add(xfrSchdDtlR);							
						}
						else {
							// 移動・移送予定が既に指図済の場合は、依頼元訂正ＦＬＧを更新する。
							if(isNextOprXfrSchd(xfrSchdR)) {
								XfrSchdMod_DtlR xfrSchdModDtlR = XfrSchdMod_DtlR.create();
								copy(xfrSchdModDtlR, r, createMap_XfrSchdMod_DtlR_ShipDmndRqst_Upd01_DtlR());
								xfrSchdUpd03.up0().add(xfrSchdModDtlR);
							}
							else {
								// 移動・移送予定サービスのマッピング
								if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
									// 更新の場合は、削除・新規で連携
									XfrSchd_DtlR xfrSchdDtlR = XfrSchd_DtlR.create();
									// 打切解除の場合は除外
									if(!r.abort_can_flg()) {
										copy(xfrSchdDtlR, r, createMap_XfrSchd_DtlR_ShipDmndRqst_Upd01_DtlR());
										xfrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
										delXfrSchdUpd01.up0().add(xfrSchdDtlR);
									}
									
									xfrSchdDtlR = XfrSchd_DtlR.create();
									copy(xfrSchdDtlR, r, createMap_XfrSchd_DtlR_ShipDmndRqst_Upd01_DtlR());
									xfrSchdDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
									xfrSchdUpd01.up0().add(xfrSchdDtlR);									
								}
								else {
									XfrSchd_DtlR xfrSchdDtlR = XfrSchd_DtlR.create();
									copy(xfrSchdDtlR, r, createMap_XfrSchd_DtlR_ShipDmndRqst_Upd01_DtlR());
									delXfrSchdUpd01.up0().add(xfrSchdDtlR);									
								}
							}
						}
					}
				}
			}
			
			MCIndexKey up0Key = up0().createIndex(ShipDmndRqst_Upd01_DtlR.$peg_no, ShipDmndRqst_Upd01_DtlR.$wg_rqst_typ);
			
			// 削除用の移動・移送予定サービスを実行
			if(!delXfrSchdUpd01.up0().isEmpty()) {
				for(XfrSchd_DtlR r : delXfrSchdUpd01.up0()) {
					MCNumber pegNo = getPegNoMapBySrcNo().getCache(MSC_WG_RQST_TYP.XFR.value(), nvl(r.xfr_src_no(), MAC_STR.NULL_VAL.value()), r.peg_no());
					if(isNull(pegNo)) {
						pegNo = getPegNoMapBySrcNo().getCache(MSC_WG_RQST_TYP.XFR.value(), MAC_STR.NULL_VAL.value(), r.peg_no());
					}

					if(!isNull(pegNo)) {
						r.peg_no(pegNo);
					}
				}

				delXfrSchdUpd01.exec();
			}
			
			// 移動・移送予定サービスを実行
			if(!xfrSchdUpd01.up0().isEmpty()) {
				// 品目マスタを取得し、ロットＮＯ、サブロットＮＯにNULL文字を補完
				MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
				MAM_ITM_R t = MAM_ITM_R.create("T");
				MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
				itmL_bldr.setSelect(t.itm_cd);
				itmL_bldr.addSelect(t.itm_sub1);
				itmL_bldr.addSelect(t.itm_sub2);
				itmL_bldr.addSelect(t.itm_sub3);
				itmL_bldr.addSelect(t.lot_mng_typ);
				itmL_bldr.addSelect(t.sublot_mng_typ);
				itmL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
				itmL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
				itmL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
				itmL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
				dbSelect("MSBAL5130_MAM_ITM_S02", itmL, itmL_bldr, xfrSchdUpd01.up0().groupBy(XfrSchd_DtlR.$itm_cd, XfrSchd_DtlR.$itm_sub1, XfrSchd_DtlR.$itm_sub2, XfrSchd_DtlR.$itm_sub3));
				
				MCIndexKey itmKey = itmL.createIndex(MAM_ITM_R.$itm_cd,
						MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
				
				for(XfrSchd_DtlR r : xfrSchdUpd01.up0()) {
					MAM_ITM_R itmR = itmL.getFirst(itmKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					if(isNull(r.lot_no())) {
						if(!isNull(itmR) && MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
							r.lot_no(MAC_STR.NULL_VAL.value());
						}
					}
					if(isNull(r.sublot_no())) {
						if(!isNull(itmR) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
							r.sublot_no(MAC_STR.NULL_VAL.value());
						}
					}
					
					MCNumber pegNo = getPegNoMapBySrcNo().getCache(MSC_WG_RQST_TYP.XFR.value(), nvl(r.xfr_src_no(), MAC_STR.NULL_VAL.value()), r.peg_no());
					if(isNull(pegNo)) {
						pegNo = getPegNoMapBySrcNo().getCache(MSC_WG_RQST_TYP.XFR.value(), MAC_STR.NULL_VAL.value(), r.peg_no());
					}
					
					if(!isNull(pegNo)) {
						r.peg_no(pegNo);
					}
				}

				xfrSchdUpd01.exec();
				
				for(XfrSchd_DtlR r : xfrSchdUpd01.down0()) {
					MCNumber tmpPegNo = getPegNoMapForXfrSchd().get(r.peg_no());
					for(ShipDmndRqst_Upd01_DtlR up0 : up0().subList(up0Key, tmpPegNo, MSC_WG_RQST_TYP.XFR.value())) {
						up0.xfr_schd_no(r.xfr_schd_no());
					}
				}
			}
			
			// オーダ登録サービスのオーダ補完を実行
			if(!ordSprt04.up0().isEmpty()) {
				ordSprt04.exec();

				// オーダ登録サービスのオーダ更新の電文定義
				for(Ord_Upd01_Dtl1R r : ordSprt04.down0()) {
					ShipDmndRqst_Upd01_DtlR up0R = up0().getFirst(up0Key, r.peg_no(), MSC_WG_RQST_TYP.PURC.value());
					Ord_Upd01_Dtl1R ordUpd01Dtl1R = Ord_Upd01_Dtl1R.create();
					MCRow.copyall(ordUpd01Dtl1R, r);
					ordUpd01Dtl1R.setAttributes(up0R);
					ordUpd01Dtl1R.mrp_typ(MSC_MRP_TYP.MRP.value());
					ordUpd01Dtl1R.data_crud_typ(r.data_crud_typ());
					ordUpd01Dtl1R.itm_ord_no(up0R.outsrc_itm_ord_no());
					ordUpd01Dtl1R.ord_gnrt_typ(MSC_ORD_GNRT_TYP.UPLND.value());
					ordUpd01Dtl1R.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
					ordUpd01Dtl1R.io_schd_pr_no(up0R.io_schd_pr_no());
					ordUpd01Dtl1R.not_fix_flg(false);
					ordUpd01Dtl1R.oper_ord_pr_flg(true);
					ordUpd01Dtl1R.io_schd_pr_flg(false);
					// 仕入直送
					if(MSC_WG_RQST_TYP.isPURC(up0R.wg_rqst_typ()) && !isNull(up0R.dlv_cd())) {
						ordUpd01Dtl1R.accpt_insp_lt(0);
						ordUpd01Dtl1R.accpt_schd_dt(up0R.accpt_schd_dt());
						ordUpd01Dtl1R.insp_offst(null);
						ordUpd01Dtl1R.insp_st_schd_dt(null);
						ordUpd01Dtl1R.insp_lt(null);
						ordUpd01Dtl1R.insp_end_schd_dt(null);
						ordUpd01Dtl1R.avl_schd_dt(up0R.avl_schd_dt());
					}
					ordUpd01.up0().add(ordUpd01Dtl1R);
				}
			}
			
			// オーダ登録サービスのオーダ更新を実行
			MCIndexKey up0key = up0().createIndex(ShipDmndRqst_Upd01_DtlR.$peg_no);
			if(!ordUpd01.up0().isEmpty()) {
				ordUpd01.exec();
				
				MCIndexKey poSchdKeyByPegNo = poSchdUpd01.up0().createIndex(PoSchd_Upd01_DtlR.$peg_no);
				for(Ord_Upd01_Rslt1R r : ordUpd01.down0()) {
					MCList<PoSchd_Upd01_DtlR> poSchdUpd01DtlL = poSchdUpd01.up0().subList(poSchdKeyByPegNo, r.peg_no());
					for(PoSchd_Upd01_DtlR poSchdUpd01DtlR : poSchdUpd01DtlL) {
						poSchdUpd01DtlR.outsrc_itm_ord_no(r.itm_ord_no());
						// 計画外の場合は、計画品目オーダＮＯも設定
						if(isNull(poSchdUpd01DtlR.pln_itm_ord_no())) {
							poSchdUpd01DtlR.pln_itm_ord_no(r.itm_ord_no());
						}
						// 計画外の場合は、受払進捗管理ＮＯに品目オーダＮＯを設定
						if(isNull(poSchdUpd01DtlR.io_schd_pr_no())) {
							poSchdUpd01DtlR.io_schd_pr_no(r.itm_ord_no());
							
							ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = up0().getFirst(up0key, poSchdUpd01DtlR.peg_no());
							shipDmndRqstUpd01DtlR.io_schd_pr_no(r.itm_ord_no());
						}
					}
				}
				
				String[] destCols = new String[] {ShipDmndRqst_Upd01_DtlR.$outsrc_itm_ord_no};
				String[] srcCols = new String[] {Ord_Upd01_Rslt1R.$itm_ord_no};
				copyByPegNo(up0(), destCols, ordUpd01.down0(), srcCols);
			}
			
			// オーダ登録サービスの構成展開を行い、投入品の受払予定を作成する
			if(!ordSprt02.up1().isEmpty()) {
				MCList<MST_OPER_ORDER_R> operOrderL = MCList.create(MST_OPER_ORDER_R.class);
				MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
				MCQueryApiBuilder operOrderL_bldr = MCQueryApiBuilder.create(t);
				operOrderL_bldr.setSelect(t.itm_ord_no);
				operOrderL_bldr.addSelect(t.oper_ord_no);
				operOrderL_bldr.setWhere(t.itm_ord_no.eq(bind("outsrc_itm_ord_no")));
				dbSelect("MSBAL5130_MST_OPER_ORDER_S01", operOrderL, operOrderL_bldr, up0().groupBy(ShipDmndRqst_Upd01_DtlR.$outsrc_itm_ord_no));
				MCIndexKey operOrderKey = operOrderL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
				
				ordSprt02.exec();
				
				
				for(Ord_Sprt02_RsltR ordSprt02RsltR : ordSprt02.down0()) {
					ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = up0().getFirst(up0key, ordSprt02RsltR.peg_no());
					if(isNull(shipDmndRqstUpd01DtlR)) {
						continue;
					}
					
					// 受払予定サービスの上り電文に設定
					IoSchd_Ins01_DtlR ioSchdIns01DtlR = IoSchd_Ins01_DtlR.create();
					copy(ioSchdIns01DtlR, ordSprt02RsltR, createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR());
					ioSchdIns01DtlR.gd_cd(getDefaultFeedStkGd().gd_cd());
					ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
					ioSchdIns01DtlR.io_schd_no(shipDmndRqstUpd01DtlR.outsrc_itm_ord_no());
					ioSchdIns01DtlR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
					ioSchdIns01DtlR.io_schd_sub_no1(shipDmndRqstUpd01DtlR.outsrc_itm_ord_no());
					MST_OPER_ORDER_R operOrderR = operOrderL.getFirst(operOrderKey, shipDmndRqstUpd01DtlR.outsrc_itm_ord_no());
					if(!isNull(operOrderR)) {
						ioSchdIns01DtlR.oper_ord_no(operOrderR.oper_ord_no());
					}
					ioSchdIns01DtlR.io_schd_pr_no(shipDmndRqstUpd01DtlR.io_schd_pr_no());
					ioSchdIns01.up0().add(ioSchdIns01DtlR);
				}
			}
			
			// 受払予定サービスの削除を実行
			if(!ioSchdDel02.up0().isEmpty()) {
				ioSchdDel02.exec();
			}

			// 受払予定サービスを実行
			if(!ioSchdIns01.up0().isEmpty()) {
				ioSchdIns01.exec();
			}

			// 発注予定登録サービスの登録を実行
			if(!poSchdUpd01.up0().isEmpty()) {
				for(PoSchd_Upd01_DtlR r : poSchdUpd01.up0()) {
					MCNumber pegNo = getPegNoMapBySrcNo().getCache(MSC_WG_RQST_TYP.PURC.value(), nvl(r.po_schd_src_no(), MAC_STR.NULL_VAL.value()), r.peg_no());
					if(isNull(pegNo)) {
						pegNo = getPegNoMapBySrcNo().getCache(MSC_WG_RQST_TYP.PURC.value(), MAC_STR.NULL_VAL.value(), r.peg_no());
					}

					if(!isNull(pegNo)) {
						r.peg_no(pegNo);
					}
				}

				poSchdUpd01.exec();
				
				for(PoSchd_Upd01_DtlR r : poSchdUpd01.down0()) {
					MCNumber tmpPegNo = getPegNoMapForXfrSchd().get(r.peg_no());
					for(ShipDmndRqst_Upd01_DtlR up0 : up0().subList(up0Key, tmpPegNo, MSC_WG_RQST_TYP.PURC.value())) {
						up0.po_schd_no(r.po_schd_no());
					}
					if (!isSame(_sysParm, "1")) {
						if (MSC_PO_SCHD_SRC_TYP.isRQST(r.po_schd_src_typ())
						|| MSC_PO_SCHD_SRC_TYP.isSLO(r.po_schd_src_typ())) {
							// 発注予定日が運用日付より過去日の場合
							if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && r.po_schd_dt().lt(getToday())) {
								MCMessagePool.add(new MCMessage(r, null, MSBAL0100,
										toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
										r.sppl_cd(), r.maker_cd(), toYMDString(r.po_schd_dt()), toYMDString(getToday()), toDispGUIIndex(r)));
							}
						}
					}
				}
			}
			
			// 発注予定登録サービスの依頼元訂正ＦＬＧ更新を実行
			if(!poSchdUpd04.up0().isEmpty()) {
				poSchdUpd04.exec();
			}
			
			// 移動・移送予定サービスの依頼元訂正ＦＬＧ更新を実行
			if(!xfrSchdUpd03.up0().isEmpty()) {
				xfrSchdUpd03.exec();
			}
			
		}
		
		/**
		 * オーダ登録サービスの予定日計算を実行し、日付項目を補完する。
		 */
		protected void callOrdSprt03() {
			doLgDefLocCache(up0());
			initItmLgGrpLocCache(up0());
			MSBCL_OrdRegService.Ord_Sprt03 ordSprt03 = MSBCL_OrdRegService.crtOrd_Sprt03();
			// 日付項目が未設定の場合、オーダ登録サービスを使用して日付計算を行う。
			for(ShipDmndRqst_Upd01_DtlR r : up0()) {
				Ord_Sprt03_DtlR ordSprt03DtlR = Ord_Sprt03_DtlR.create();
				// 出荷依頼の場合は、既に予定が作成されているため、何もしない
				if(MSC_WG_RQST_TYP.isSHIP(r.wg_rqst_typ())) {
					continue;
				}
				else if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && r.uplnd_outsrc_flg()) {
						continue;
					}
					// 外注の場合
					if(!isSame(nvl(r.mfg_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
						if(isNullOr(r.po_schd_dt(), r.mfg_st_schd_dt(), r.mfg_end_schd_dt(), r.strg_schd_dt(), r.accpt_schd_dt())) {
							ordSprt03DtlR.master_dt(getMasterDate(r));
							copy(ordSprt03DtlR, r, createMap_Ord_Sprt03_DtlR_ShipDmndRqst_Upd01_DtlR());
							// 仕入直送以外
							if (isNull(r.dlv_cd())) {
								ordSprt03DtlR.strg_schd_dt(r.gr_rqst_tm());
								ordSprt03DtlR.avl_schd_dt(r.avl_schd_dt());
							}
							ordSprt03.up0().add(ordSprt03DtlR);
						}
					}
					// 外注以外の場合
					else {
						if(isNullOr(r.po_schd_dt(), r.strg_schd_dt(), r.accpt_schd_dt())) {
							ordSprt03DtlR.master_dt(getMasterDate(r));
							copy(ordSprt03DtlR, r, createMap_Ord_Sprt03_DtlR_ShipDmndRqst_Upd01_DtlR());
							// 仕入直送以外
							if (isNull(r.dlv_cd())) {
								ordSprt03DtlR.strg_schd_dt(r.gr_rqst_tm());
								ordSprt03DtlR.avl_schd_dt(r.avl_schd_dt());
							}
							ordSprt03.up0().add(ordSprt03DtlR);
						}
					}
				}
				else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					if(isNullOr(r.gi_schd_dt(), r.strg_schd_dt())) {
						if (isSame(_sysParm, "1")) {
							ordSprt03DtlR.master_dt(r.gr_rqst_tm());
						} else {
							ordSprt03DtlR.master_dt(getMasterDate(r));
						}
						copy(ordSprt03DtlR, r, createMap_Ord_Sprt03_DtlR_ShipDmndRqst_Upd01_DtlR());
						if (isNullOrNullVal(ordSprt03DtlR.rqst_loc_cd())) {
							MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpLocCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.gi_lg_grp_cd());
							if (!itmLgGrpR.isEmpty()) {
								ordSprt03DtlR.rqst_loc_cd(itmLgGrpR.lg_def_loc_cd());
							}
							else {
								ordSprt03DtlR.rqst_loc_cd(getLgDefLoc(r.gi_lg_grp_cd()));
							}
						}
						if (isNullOrNullVal(ordSprt03DtlR.rqst_loc_cd()) && isNull(r.gi_schd_dt())) {
							// 出庫予定日が未設定かつ出庫場所ＣＤが未設定かつ物流標準場所も取得できない場合、対象外とする
							continue;
						}
						ordSprt03.up0().add(ordSprt03DtlR);
					}
				}
			}

			// オーダ登録サービスの予定日計算を実行
			if(!ordSprt03.up0().isEmpty()) {
				ordSprt03.exec();
				
				String[] destCols = new String[] {
						ShipDmndRqst_Upd01_DtlR.$po_schd_dt,
						ShipDmndRqst_Upd01_DtlR.$mfg_st_schd_dt,
						ShipDmndRqst_Upd01_DtlR.$mfg_end_schd_dt,
						ShipDmndRqst_Upd01_DtlR.$gi_schd_dt,
						ShipDmndRqst_Upd01_DtlR.$strg_schd_dt,
						ShipDmndRqst_Upd01_DtlR.$accpt_schd_dt,
						ShipDmndRqst_Upd01_DtlR.$insp_end_schd_dt,
						ShipDmndRqst_Upd01_DtlR.$avl_schd_dt
				};
				String[] srcCols = new String[] {
						Ord_Sprt03_DtlR.$po_schd_dt, Ord_Sprt03_DtlR.$mfg_st_schd_dt,
						Ord_Sprt03_DtlR.$mfg_end_schd_dt, Ord_Sprt03_DtlR.$gi_schd_dt,
						Ord_Sprt03_DtlR.$strg_schd_dt, Ord_Sprt03_DtlR.$accpt_schd_dt,
						Ord_Sprt03_DtlR.$insp_end_schd_dt, Ord_Sprt03_DtlR.$avl_schd_dt
				};
				copyByPegNo(up0(), destCols, ordSprt03.down0(), srcCols);
				for(ShipDmndRqst_Upd01_DtlR r : up0()) {
					// 仕入直送
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()) && !isNull(r.dlv_cd())) {
						r.accpt_schd_dt(r.strg_schd_dt());
						r.avl_schd_dt(r.strg_schd_dt());
					}
				}
			}
		}

		/**
		 * 発注予定が次処理済か判定する
		 * @param poSchdR　対象の発注予定
		 * @return
		 */
		protected boolean isNextOprPoSchd(MST_PO_SCHD_R poSchdR) {
			if (poSchdR.po_flg() || poSchdR.rqst_upd_stop_flg() || poSchdR.can_flg()
					|| poSchdR.abort_flg()
					|| !isNull(poSchdR.getStringNE("ITM_MFG_INST_NO"))) {
				
				return true;
			}
			return false;
		}

		/**
		 * 移動・移送予定が次処理済か判定する
		 * @param xfrSchdR　対象の移動・移送予定
		 * @return
		 */
		protected boolean isNextOprXfrSchd(MST_XFR_SCHD_R xfrSchdR) {
			if (!isNull(xfrSchdR)) {
				// 移送
				if (!isSame(xfrSchdR.gi_lg_grp_cd(), xfrSchdR.gr_lg_grp_cd())) {
					if (xfrSchdR.getBooleanNE("xfr_abort_flg")
							|| xfrSchdR.getBooleanNE("cmpl_flg")
							|| xfrSchdR.getBooleanNE("ship_pr_abort_flg")
							|| xfrSchdR.getBooleanNE("dlv_cmpl_flg")
							|| !xfrSchdR.getNumberNE("SHIP_ACT_QTY").isZero()
							|| !xfrSchdR.getNumberNE("SHIP_INST_QTY").isZero()) {

						return true;
					}
				}
				// 移動
				else {
					if (xfrSchdR.getBooleanNE("xfr_inst_flg"))
						return true;
				}
			}
			return false;
		}

		
		protected Map_PoSchd_Upd01_DtlR_ShipDmndRqst_Upd01_DtlR<PoSchd_Upd01_DtlR,ShipDmndRqst_Upd01_DtlR> createMap_PoSchd_Upd01_DtlR_ShipDmndRqst_Upd01_DtlR() {
			return new Map_PoSchd_Upd01_DtlR_ShipDmndRqst_Upd01_DtlR<PoSchd_Upd01_DtlR, ShipDmndRqst_Upd01_DtlR>();
		}

		public class Map_PoSchd_Upd01_DtlR_ShipDmndRqst_Upd01_DtlR<D extends PoSchd_Upd01_DtlR, S extends ShipDmndRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSchd_Upd01_DtlR.$peg_no, ShipDmndRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$data_crud_typ, ShipDmndRqst_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_typ, ShipDmndRqst_Upd01_DtlR.$po_schd_src_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_no, ShipDmndRqst_Upd01_DtlR.$po_schd_src_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$io_schd_pr_no, ShipDmndRqst_Upd01_DtlR.$io_schd_pr_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_cd, ShipDmndRqst_Upd01_DtlR.$itm_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub1, ShipDmndRqst_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub2, ShipDmndRqst_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub3, ShipDmndRqst_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_nm, ShipDmndRqst_Upd01_DtlR.$itm_nm);
				addColumnPathMap(PoSchd_Upd01_DtlR.$iv_itm_nm, ShipDmndRqst_Upd01_DtlR.$iv_itm_nm);
				addColumnPathMap(PoSchd_Upd01_DtlR.$ver_no, ShipDmndRqst_Upd01_DtlR.$ver_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$sno1, ShipDmndRqst_Upd01_DtlR.$sno1);
				addColumnPathMap(PoSchd_Upd01_DtlR.$sno2, ShipDmndRqst_Upd01_DtlR.$sno2);
				addColumnPathMap(PoSchd_Upd01_DtlR.$sno3, ShipDmndRqst_Upd01_DtlR.$sno3);
				addColumnPathMap(PoSchd_Upd01_DtlR.$sno4, ShipDmndRqst_Upd01_DtlR.$sno4);
				addColumnPathMap(PoSchd_Upd01_DtlR.$purc_rsn_cd, ShipDmndRqst_Upd01_DtlR.$purc_rsn_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$in_to_loc_cd, ShipDmndRqst_Upd01_DtlR.$gr_loc_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$str_ln_cd, ShipDmndRqst_Upd01_DtlR.$gr_str_ln_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_cd, ShipDmndRqst_Upd01_DtlR.$dlv_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_sundry_flg, ShipDmndRqst_Upd01_DtlR.$dlv_sundry_flg);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_nm, ShipDmndRqst_Upd01_DtlR.$dlv_nm);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_cntct_dpt, ShipDmndRqst_Upd01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_cntct_psn, ShipDmndRqst_Upd01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_zip_cd, ShipDmndRqst_Upd01_DtlR.$dlv_zip_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_addr1, ShipDmndRqst_Upd01_DtlR.$dlv_addr1);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_addr2, ShipDmndRqst_Upd01_DtlR.$dlv_addr2);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_addr3, ShipDmndRqst_Upd01_DtlR.$dlv_addr3);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_addr4, ShipDmndRqst_Upd01_DtlR.$dlv_addr4);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_tel, ShipDmndRqst_Upd01_DtlR.$dlv_tel);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_fax, ShipDmndRqst_Upd01_DtlR.$dlv_fax);
				addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_cd, ShipDmndRqst_Upd01_DtlR.$tdlv_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_sundry_flg, ShipDmndRqst_Upd01_DtlR.$tdlv_sundry_flg);
				addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_nm, ShipDmndRqst_Upd01_DtlR.$tdlv_nm);
				addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_zip_cd, ShipDmndRqst_Upd01_DtlR.$tdlv_zip_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_addr1, ShipDmndRqst_Upd01_DtlR.$tdlv_addr1);
				addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_addr2, ShipDmndRqst_Upd01_DtlR.$tdlv_addr2);
				addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_addr3, ShipDmndRqst_Upd01_DtlR.$tdlv_addr3);
				addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_addr4, ShipDmndRqst_Upd01_DtlR.$tdlv_addr4);
				addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_cntct_dpt, ShipDmndRqst_Upd01_DtlR.$tdlv_cntct_dpt);
				addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_cntct_psn, ShipDmndRqst_Upd01_DtlR.$tdlv_cntct_psn);
				addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_tel, ShipDmndRqst_Upd01_DtlR.$tdlv_tel);
				addColumnPathMap(PoSchd_Upd01_DtlR.$tdlv_fax, ShipDmndRqst_Upd01_DtlR.$tdlv_fax);
				addColumnPathMap(PoSchd_Upd01_DtlR.$reg_dt, ShipDmndRqst_Upd01_DtlR.$rqst_dt);
				addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_wg_cd, ShipDmndRqst_Upd01_DtlR.$rqst_fr_wg_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$wg_cd, ShipDmndRqst_Upd01_DtlR.$rqst_to_wg_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$sppl_cd, ShipDmndRqst_Upd01_DtlR.$sppl_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$maker_cd, ShipDmndRqst_Upd01_DtlR.$maker_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$outsrc_itm_ord_no, ShipDmndRqst_Upd01_DtlR.$outsrc_itm_ord_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$pln_itm_ord_no, ShipDmndRqst_Upd01_DtlR.$itm_ord_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$mfg_loc_cd, ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bom_ptn, ShipDmndRqst_Upd01_DtlR.$bom_ptn);
				addColumnPathMap(PoSchd_Upd01_DtlR.$trd_unit_qty, ShipDmndRqst_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(PoSchd_Upd01_DtlR.$trd_unit_cd, ShipDmndRqst_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$base_unit_qty, ShipDmndRqst_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(PoSchd_Upd01_DtlR.$base_unit_cd, ShipDmndRqst_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_dt, ShipDmndRqst_Upd01_DtlR.$po_schd_dt);
				addColumnPathMap(PoSchd_Upd01_DtlR.$dlv_rqst_tm, ShipDmndRqst_Upd01_DtlR.$strg_schd_dt);
				addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_dlv_rqst_tm, ShipDmndRqst_Upd01_DtlR.$strg_schd_dt);
				addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_avl_rqst_dt, ShipDmndRqst_Upd01_DtlR.$avl_schd_dt);
				addColumnPathMap(PoSchd_Upd01_DtlR.$purc_schd_dt, ShipDmndRqst_Upd01_DtlR.$accpt_schd_dt);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_itm_cd, ShipDmndRqst_Upd01_DtlR.$bd_itm_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_itm_sub1, ShipDmndRqst_Upd01_DtlR.$bd_itm_sub1);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_itm_sub2, ShipDmndRqst_Upd01_DtlR.$bd_itm_sub2);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_itm_sub3, ShipDmndRqst_Upd01_DtlR.$bd_itm_sub3);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_sno1, ShipDmndRqst_Upd01_DtlR.$bd_sno1);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_sno2, ShipDmndRqst_Upd01_DtlR.$bd_sno2);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_sno3, ShipDmndRqst_Upd01_DtlR.$bd_sno3);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_sno4, ShipDmndRqst_Upd01_DtlR.$bd_sno4);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_lot_no, ShipDmndRqst_Upd01_DtlR.$bd_lot_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_sublot_no, ShipDmndRqst_Upd01_DtlR.$bd_sublot_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_loc_cd, ShipDmndRqst_Upd01_DtlR.$bd_loc_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_dpt_cd, ShipDmndRqst_Upd01_DtlR.$bd_dpt_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_ctg_cd, ShipDmndRqst_Upd01_DtlR.$bd_ctg_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_oper_cd, ShipDmndRqst_Upd01_DtlR.$bd_oper_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_slo_no, ShipDmndRqst_Upd01_DtlR.$bd_slo_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_iv_no, ShipDmndRqst_Upd01_DtlR.$bd_iv_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$bd_po_no, ShipDmndRqst_Upd01_DtlR.$bd_po_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$slo_no, ShipDmndRqst_Upd01_DtlR.$slo_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$slo_d_no, ShipDmndRqst_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$cred_no_up_flg, ShipDmndRqst_Upd01_DtlR.$cred_no_up_flg);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_cnt_rmrks, ShipDmndRqst_Upd01_DtlR.$wg_rqst_cnt_rmrks);
				addColumnPathMap(PoSchd_Upd01_DtlR.$trd_cd, ShipDmndRqst_Upd01_DtlR.$trd_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$trd_ptn_typ, ShipDmndRqst_Upd01_DtlR.$trd_ptn_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_fr_dpt_cd, ShipDmndRqst_Upd01_DtlR.$rqst_fr_dpt_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$rqst_fr_usr_cd, ShipDmndRqst_Upd01_DtlR.$rqst_fr_usr_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if(!isSame(nvl(src.mfg_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
					dest.outsrc_flg(true);
				}
				else {
					dest.outsrc_flg(false);
				}
				if (src.uplnd_outsrc_flg()) {
					dest.pln_itm_ord_no(null);
				}
			}
		}
		
		protected Map_PoSchd_Upd04_DtlR_ShipDmndRqst_Upd01_DtlR<PoSchd_Upd04_DtlR,ShipDmndRqst_Upd01_DtlR> createMap_PoSchd_Upd04_DtlR_ShipDmndRqst_Upd01_DtlR() {
			return new Map_PoSchd_Upd04_DtlR_ShipDmndRqst_Upd01_DtlR<PoSchd_Upd04_DtlR, ShipDmndRqst_Upd01_DtlR>();
		}

		public class Map_PoSchd_Upd04_DtlR_ShipDmndRqst_Upd01_DtlR<D extends PoSchd_Upd04_DtlR, S extends ShipDmndRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSchd_Upd04_DtlR.$po_schd_src_typ, ShipDmndRqst_Upd01_DtlR.$po_schd_src_typ);
				addColumnPathMap(PoSchd_Upd04_DtlR.$po_schd_src_no, ShipDmndRqst_Upd01_DtlR.$po_schd_src_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.rqst_crrct_flg(true);
				if(src.abort_flg() || MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.rqst_can_flg(true);
				}
				else {
					dest.rqst_can_flg(false);
				}
			}
		}
		
		protected Map_XfrSchd_DtlR_ShipDmndRqst_Upd01_DtlR<XfrSchd_DtlR,ShipDmndRqst_Upd01_DtlR> createMap_XfrSchd_DtlR_ShipDmndRqst_Upd01_DtlR() {
			return new Map_XfrSchd_DtlR_ShipDmndRqst_Upd01_DtlR<XfrSchd_DtlR, ShipDmndRqst_Upd01_DtlR>();
		}

		public class Map_XfrSchd_DtlR_ShipDmndRqst_Upd01_DtlR<D extends XfrSchd_DtlR, S extends ShipDmndRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchd_DtlR.$peg_no, ShipDmndRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(XfrSchd_DtlR.$data_crud_typ, ShipDmndRqst_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(XfrSchd_DtlR.$xfr_src_typ, ShipDmndRqst_Upd01_DtlR.$xfr_src_typ);
				addColumnPathMap(XfrSchd_DtlR.$xfr_src_no, ShipDmndRqst_Upd01_DtlR.$xfr_src_no);
				addColumnPathMap(XfrSchd_DtlR.$gi_wg_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_wg_cd);
				addColumnPathMap(XfrSchd_DtlR.$gi_lg_grp_cd, ShipDmndRqst_Upd01_DtlR.$gi_lg_grp_cd);
				addColumnPathMap(XfrSchd_DtlR.$gi_loc_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_cd);
				addColumnPathMap(XfrSchd_DtlR.$gi_str_ln_cd, ShipDmndRqst_Upd01_DtlR.$gi_str_ln_cd);
				addColumnPathMap(XfrSchd_DtlR.$gr_wg_cd, ShipDmndRqst_Upd01_DtlR.$gr_loc_wg_cd);
				addColumnPathMap(XfrSchd_DtlR.$gr_lg_grp_cd, ShipDmndRqst_Upd01_DtlR.$gr_lg_grp_cd);
				addColumnPathMap(XfrSchd_DtlR.$gr_loc_cd, ShipDmndRqst_Upd01_DtlR.$gr_loc_cd);
				addColumnPathMap(XfrSchd_DtlR.$gr_str_ln_cd, ShipDmndRqst_Upd01_DtlR.$gr_str_ln_cd);
				addColumnPathMap(XfrSchd_DtlR.$itm_cd, ShipDmndRqst_Upd01_DtlR.$itm_cd);
				addColumnPathMap(XfrSchd_DtlR.$itm_sub1, ShipDmndRqst_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(XfrSchd_DtlR.$itm_sub2, ShipDmndRqst_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(XfrSchd_DtlR.$itm_sub3, ShipDmndRqst_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(XfrSchd_DtlR.$lot_no, ShipDmndRqst_Upd01_DtlR.$lot_no);
				addColumnPathMap(XfrSchd_DtlR.$sublot_no, ShipDmndRqst_Upd01_DtlR.$sublot_no);
				addColumnPathMap(XfrSchd_DtlR.$sno1, ShipDmndRqst_Upd01_DtlR.$sno1);
				addColumnPathMap(XfrSchd_DtlR.$sno1_null_flg, ShipDmndRqst_Upd01_DtlR.$sno1_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$sno2, ShipDmndRqst_Upd01_DtlR.$sno2);
				addColumnPathMap(XfrSchd_DtlR.$sno2_null_flg, ShipDmndRqst_Upd01_DtlR.$sno2_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$sno3, ShipDmndRqst_Upd01_DtlR.$sno3);
				addColumnPathMap(XfrSchd_DtlR.$sno3_null_flg, ShipDmndRqst_Upd01_DtlR.$sno3_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$sno4, ShipDmndRqst_Upd01_DtlR.$sno4);
				addColumnPathMap(XfrSchd_DtlR.$sno4_null_flg, ShipDmndRqst_Upd01_DtlR.$sno4_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$ver_no, ShipDmndRqst_Upd01_DtlR.$ver_no);
				addColumnPathMap(XfrSchd_DtlR.$gd_cd, ShipDmndRqst_Upd01_DtlR.$gd_cd);
				addColumnPathMap(XfrSchd_DtlR.$vld_dt_fr, ShipDmndRqst_Upd01_DtlR.$vld_dt_fr);
				addColumnPathMap(XfrSchd_DtlR.$vld_dt_to, ShipDmndRqst_Upd01_DtlR.$vld_dt_to);
				addColumnPathMap(XfrSchd_DtlR.$trd_unit_cd, ShipDmndRqst_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(XfrSchd_DtlR.$trd_unit_qty, ShipDmndRqst_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(XfrSchd_DtlR.$base_unit_cd, ShipDmndRqst_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(XfrSchd_DtlR.$base_unit_qty, ShipDmndRqst_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(XfrSchd_DtlR.$gi_rqst_tm, ShipDmndRqst_Upd01_DtlR.$gi_rqst_tm);
				addColumnPathMap(XfrSchd_DtlR.$gr_rqst_tm, ShipDmndRqst_Upd01_DtlR.$gr_rqst_tm);
				addColumnPathMap(XfrSchd_DtlR.$rqst_usr_cd, ShipDmndRqst_Upd01_DtlR.$rqst_fr_usr_cd);
				addColumnPathMap(XfrSchd_DtlR.$rqst_dpt_cd, ShipDmndRqst_Upd01_DtlR.$rqst_fr_dpt_cd);
				addColumnPathMap(XfrSchd_DtlR.$itm_ord_no, ShipDmndRqst_Upd01_DtlR.$itm_ord_no);
				addColumnPathMap(XfrSchd_DtlR.$slo_no, ShipDmndRqst_Upd01_DtlR.$slo_no);
				addColumnPathMap(XfrSchd_DtlR.$slo_d_no, ShipDmndRqst_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(XfrSchd_DtlR.$io_schd_pr_no, ShipDmndRqst_Upd01_DtlR.$io_schd_pr_no);
				addColumnPathMap(XfrSchd_DtlR.$rqst_cnt_rmrks, ShipDmndRqst_Upd01_DtlR.$wg_rqst_cnt_rmrks);
			}
		}
		
		protected Map_XfrSchdMod_DtlR_ShipDmndRqst_Upd01_DtlR<XfrSchdMod_DtlR,ShipDmndRqst_Upd01_DtlR> createMap_XfrSchdMod_DtlR_ShipDmndRqst_Upd01_DtlR() {
			return new Map_XfrSchdMod_DtlR_ShipDmndRqst_Upd01_DtlR<XfrSchdMod_DtlR, ShipDmndRqst_Upd01_DtlR>();
		}

		public class Map_XfrSchdMod_DtlR_ShipDmndRqst_Upd01_DtlR<D extends XfrSchdMod_DtlR, S extends ShipDmndRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdMod_DtlR.$xfr_src_typ, ShipDmndRqst_Upd01_DtlR.$xfr_src_typ);
				addColumnPathMap(XfrSchdMod_DtlR.$xfr_src_no, ShipDmndRqst_Upd01_DtlR.$xfr_src_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.rqst_mod_flg(true);
				if(src.abort_flg() || MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.rqst_can_flg(true);
				}
				else {
					dest.rqst_can_flg(false);
				}
			}
		}
		
		protected Map_Ord_Upd01_Dtl1R_ShipDmndRqst_Upd01_DtlR<Ord_Upd01_Dtl1R,ShipDmndRqst_Upd01_DtlR> createMap_Ord_Upd01_Dtl1R_ShipDmndRqst_Upd01_DtlR() {
			return new Map_Ord_Upd01_Dtl1R_ShipDmndRqst_Upd01_DtlR<Ord_Upd01_Dtl1R, ShipDmndRqst_Upd01_DtlR>();
		}

		public class Map_Ord_Upd01_Dtl1R_ShipDmndRqst_Upd01_DtlR<D extends Ord_Upd01_Dtl1R, S extends ShipDmndRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, ShipDmndRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, ShipDmndRqst_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, ShipDmndRqst_Upd01_DtlR.$outsrc_itm_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, ShipDmndRqst_Upd01_DtlR.$itm_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, ShipDmndRqst_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, ShipDmndRqst_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, ShipDmndRqst_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ver_no, ShipDmndRqst_Upd01_DtlR.$ver_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, ShipDmndRqst_Upd01_DtlR.$gr_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_wg_cd, ShipDmndRqst_Upd01_DtlR.$rqst_to_wg_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, ShipDmndRqst_Upd01_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, ShipDmndRqst_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, ShipDmndRqst_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$po_schd_dt, ShipDmndRqst_Upd01_DtlR.$po_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_st_schd_dt, ShipDmndRqst_Upd01_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_end_schd_dt, ShipDmndRqst_Upd01_DtlR.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$gi_schd_dt, ShipDmndRqst_Upd01_DtlR.$gi_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_schd_dt, ShipDmndRqst_Upd01_DtlR.$strg_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$accpt_schd_dt, ShipDmndRqst_Upd01_DtlR.$accpt_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$insp_st_schd_dt, ShipDmndRqst_Upd01_DtlR.$insp_st_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$insp_end_schd_dt, ShipDmndRqst_Upd01_DtlR.$insp_end_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$avl_schd_dt, ShipDmndRqst_Upd01_DtlR.$avl_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, ShipDmndRqst_Upd01_DtlR.$sno1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, ShipDmndRqst_Upd01_DtlR.$sno2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, ShipDmndRqst_Upd01_DtlR.$sno3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, ShipDmndRqst_Upd01_DtlR.$sno4);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.mrp_typ(MSC_MRP_TYP.MRP.value());
				dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				dest.ord_gnrt_typ(MSC_ORD_GNRT_TYP.UPLND.value());
				dest.nmr_qty(MCNumber.ONE);
				dest.dnm_qty(MCNumber.ONE);
				dest.fxd_yield_qty(MCNumber.ZERO);
				dest.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
				dest.master_dt(nvl(src.master_dt(), src.avl_schd_dt()));
				dest.sppl_cd(MAC_STR.NULL_VAL.value());
				dest.maker_cd(MAC_STR.NULL_VAL.value());
				dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
			}
		}
		
		protected Map_Ord_Sprt02_DtlR_ShipDmndRqst_Upd01_DtlR<Ord_Sprt02_DtlR,ShipDmndRqst_Upd01_DtlR> createMap_Ord_Sprt02_DtlR_ShipDmndRqst_Upd01_DtlR() {
			return new Map_Ord_Sprt02_DtlR_ShipDmndRqst_Upd01_DtlR<Ord_Sprt02_DtlR, ShipDmndRqst_Upd01_DtlR>();
		}

		public class Map_Ord_Sprt02_DtlR_ShipDmndRqst_Upd01_DtlR<D extends Ord_Sprt02_DtlR, S extends ShipDmndRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt02_DtlR.$peg_no, ShipDmndRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_cd, ShipDmndRqst_Upd01_DtlR.$itm_cd);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub1, ShipDmndRqst_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub2, ShipDmndRqst_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub3, ShipDmndRqst_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Sprt02_DtlR.$mfg_loc_cd, ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt02_DtlR.$bom_ptn, ShipDmndRqst_Upd01_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Sprt02_DtlR.$inst_qty, ShipDmndRqst_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(Ord_Sprt02_DtlR.$mfg_st_schd_dt, ShipDmndRqst_Upd01_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$st_schd_tm, ShipDmndRqst_Upd01_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$end_schd_tm, ShipDmndRqst_Upd01_DtlR.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno1, ShipDmndRqst_Upd01_DtlR.$sno1);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno2, ShipDmndRqst_Upd01_DtlR.$sno2);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno3, ShipDmndRqst_Upd01_DtlR.$sno3);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno4, ShipDmndRqst_Upd01_DtlR.$sno4);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.oper_cd(MAC_STR.NULL_VAL.value());		//　外注のため、デフォルト工程
				dest.oper_seq(MCNumber.ZERO);
			}
		}
		
		protected Map_Ord_Sprt03_DtlR_ShipDmndRqst_Upd01_DtlR<Ord_Sprt03_DtlR,ShipDmndRqst_Upd01_DtlR> createMap_Ord_Sprt03_DtlR_ShipDmndRqst_Upd01_DtlR() {
			return new Map_Ord_Sprt03_DtlR_ShipDmndRqst_Upd01_DtlR<Ord_Sprt03_DtlR, ShipDmndRqst_Upd01_DtlR>();
		}

		public class Map_Ord_Sprt03_DtlR_ShipDmndRqst_Upd01_DtlR<D extends Ord_Sprt03_DtlR, S extends ShipDmndRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt03_DtlR.$peg_no, ShipDmndRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(Ord_Sprt03_DtlR.$po_schd_dt, ShipDmndRqst_Upd01_DtlR.$po_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$gi_schd_dt, ShipDmndRqst_Upd01_DtlR.$gi_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_st_schd_dt, ShipDmndRqst_Upd01_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_end_schd_dt, ShipDmndRqst_Upd01_DtlR.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt, ShipDmndRqst_Upd01_DtlR.$gr_rqst_tm);
				addColumnPathMap(Ord_Sprt03_DtlR.$accpt_schd_dt, ShipDmndRqst_Upd01_DtlR.$accpt_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$insp_st_schd_dt, ShipDmndRqst_Upd01_DtlR.$insp_st_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$insp_end_schd_dt, ShipDmndRqst_Upd01_DtlR.$insp_end_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$avl_schd_dt, ShipDmndRqst_Upd01_DtlR.$avl_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, ShipDmndRqst_Upd01_DtlR.$itm_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, ShipDmndRqst_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, ShipDmndRqst_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, ShipDmndRqst_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$sppl_cd, ShipDmndRqst_Upd01_DtlR.$sppl_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$maker_cd, ShipDmndRqst_Upd01_DtlR.$maker_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$rqst_loc_cd, ShipDmndRqst_Upd01_DtlR.$gi_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, ShipDmndRqst_Upd01_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, ShipDmndRqst_Upd01_DtlR.$gr_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, ShipDmndRqst_Upd01_DtlR.$base_unit_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 外注の場合
				if(!isSame(nvl(src.mfg_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
					dest.mfg_sppl_cd(src.sppl_cd());
					dest.sppl_cd(MAC_STR.NULL_VAL.value());
					dest.maker_cd(MAC_STR.NULL_VAL.value());
				}
				else if(MSC_WG_RQST_TYP.isPURC(src.wg_rqst_typ())) {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.PURC.value());
				}
				else if(MSC_WG_RQST_TYP.isXFR(src.wg_rqst_typ())) {
					if(isSame(src.rqst_fr_wg_cd(), src.rqst_to_wg_cd())) {
						dest.itm_ord_typ(MSC_ITM_ORD_TYP.XFR.value());
					}
					else {
						dest.itm_ord_typ(MSC_ITM_ORD_TYP.WG_XFR.value());
					}
				}
				if (!isSame(_sysParm, "1")) {
					// 仕入直送はdlv_cdを設定 ("slod_proc_typ", "slod_dlv_cd"は事前に実行したgetMasterDateで設定)
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(src.getString("slod_proc_typ"))) {
						dest.dlv_cd(src.getString("slod_dlv_cd"));
					}
				}
			}
		}
		
		protected Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR,Ord_Sprt02_RsltR> createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR() {
			return new Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR, Ord_Sprt02_RsltR>();
		}

		public class Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<D extends IoSchd_Ins01_DtlR, S extends Ord_Sprt02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, Ord_Sprt02_RsltR.$schd_in_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, Ord_Sprt02_RsltR.$itm_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, Ord_Sprt02_RsltR.$itm_sub1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, Ord_Sprt02_RsltR.$itm_sub2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, Ord_Sprt02_RsltR.$itm_sub3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, Ord_Sprt02_RsltR.$ver_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_grp_cd, Ord_Sprt02_RsltR.$alt_grp_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_grp_seq, Ord_Sprt02_RsltR.$alt_grp_seq);
				addColumnPathMap(IoSchd_Ins01_DtlR.$oper_ord_no, Ord_Sprt02_RsltR.$oper_ord_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_qty, Ord_Sprt02_RsltR.$alt_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_itm_typ, Ord_Sprt02_RsltR.$alt_itm_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_itm_ratio, Ord_Sprt02_RsltR.$alt_itm_ratio);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_alloc_prio, Ord_Sprt02_RsltR.$alt_alloc_prio);
				addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, Ord_Sprt02_RsltR.$loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, Ord_Sprt02_RsltR.$sno1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, Ord_Sprt02_RsltR.$sno2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, Ord_Sprt02_RsltR.$sno3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, Ord_Sprt02_RsltR.$sno4);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, Ord_Sprt02_RsltR.$unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, Ord_Sprt02_RsltR.$rqmt_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, Ord_Sprt02_RsltR.$unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, Ord_Sprt02_RsltR.$rqmt_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$inpt_ctl_typ, Ord_Sprt02_RsltR.$inpt_ctl_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$peg_no, Ord_Sprt02_RsltR.$peg_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ1())) {
					dest.sno1_null_flg(true);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ2())) {
					dest.sno2_null_flg(true);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ3())) {
					dest.sno3_null_flg(true);
				}
				if (MAC_SNO_TYP.isEXTND_NULL(src.sno_typ4())) {
					dest.sno4_null_flg(true);
				}
				dest.alloc_flg(false);
			}
		}
	}

	protected static final Class<MSBAL_ShipDmndRqstService> CLAZZ = MSBAL_ShipDmndRqstService.class;

	// 一時的に発番する発注予定用の紐付けＮＯをキャッシュする
	protected Map<MCNumber, MCNumber> _pegNoMapForPoSchd = null;
	// 一時的に発番する移動・移送予定用の紐付けＮＯをキャッシュする
	protected Map<MCNumber, MCNumber> _pegNoMapForXfrSchd = null;
	// 依頼元ＮＯと一時的に発番する紐付けＮＯをキャッシュする
	protected FXUCL_Cache<MCNumber> _pegNoMapBySrcNo = null;

	// 品目詳細マスタの結果をキャッシュ
	MCList<MAM_ITM_DTL_R> _purcItmDtlL = null;
	MCList<MAM_ITM_DTL_R> _itmDtlL = null;
	MCIndexKey _itmDtlKey = null;
	MCIndexKey _purcItmDtlKey = null;

	// 場所マスタの結果をキャッシュ
	MCList<MAM_LOC_R> _locL = null;
	MCIndexKey _locKey = null;

	MCList<MST_PO_SCHD_R> _poSchdL = null;
	MCList<MAM_ITM_DTL_R> _outsrcItmDtlL = null;
	MCIndexKey _poSchdKey = null;
	MCIndexKey _outsrcItmDtlKey = null;
	
	protected static Map<MCNumber, MCNumber> getPegNoMapForPoSchd() {
		return object(CLAZZ)._getPegNoMapForPoSchd();
	}
	
	protected Map<MCNumber, MCNumber> _getPegNoMapForPoSchd() {
		if (_pegNoMapForPoSchd == null) {
			_pegNoMapForPoSchd = new HashMap<MCNumber, MCNumber>();
		}
		return _pegNoMapForPoSchd;
	}
	
	protected static Map<MCNumber, MCNumber> getPegNoMapForXfrSchd() {
		return object(CLAZZ)._getPegNoMapForXfrSchd();
	}
	
	protected Map<MCNumber, MCNumber> _getPegNoMapForXfrSchd() {
		if (_pegNoMapForXfrSchd == null) {
			_pegNoMapForXfrSchd = new HashMap<MCNumber, MCNumber>();
		}
		return _pegNoMapForXfrSchd;
	}
	
	protected static FXUCL_Cache<MCNumber> getPegNoMapBySrcNo() {
		return object(CLAZZ)._getPegNoMapBySrcNo();
	}
	
	protected FXUCL_Cache<MCNumber> _getPegNoMapBySrcNo() {
		if (_pegNoMapBySrcNo == null) {
			_pegNoMapBySrcNo = new FXUCL_Cache<MCNumber>();
			_pegNoMapBySrcNo.setFixMaxCacheSize(-1);
		}
		return _pegNoMapBySrcNo;
	}
	
	protected Comparable<?>[] toVals(Comparable<?>... args) {
		if (args == null) {
			return null;
		}
		Comparable<?>[] vals = new Comparable<?>[args.length];
		for (int i = 0; i < args.length; i++) {
			vals[i] = args[i];
		}
		return vals;
	}
	/**
	 * 品目詳細マスタをキャッシュする
	 * 
	 * @param dtlL　チェック対象のリスト
	 */
	protected static void cacheItmDtl(MCList<ShipDmndRqst_Chk01_DtlR> dtlL) {
		object(CLAZZ)._cacheItmDtl(dtlL);
		object(CLAZZ)._cachePurcItmDtl(dtlL);
		object(CLAZZ)._cacheOutsrcItmDtl(dtlL);
	}
	
	/**
	 * 品目詳細マスタのキャッシュ、値の補完
	 * 
	 * @param dtlL　チェック対象のリスト
	 */
	protected void _cacheItmDtl(MCList<ShipDmndRqst_Chk01_DtlR> dtlL) {
		MCList<ShipDmndRqst_Chk01_DtlR> bindL = MCList.create(ShipDmndRqst_Chk01_DtlR.class);			
	
		for(ShipDmndRqst_Chk01_DtlR r : dtlL) {
			//　ＷＧ間依頼種類区分が未指定の場合のみ、品目詳細マスタより補完する。
			if(isNull(r.wg_rqst_typ())) {
				bindL.add(r);
			}
		}
		_itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		if(!bindL.isEmpty()) {
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_LOC_R m2 = MAM_LOC_R.create("M2");
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder itmDtlL_bldr = MCQueryApiBuilder.create(t);
			itmDtlL_bldr.setSelect(t.itm_cd);
			itmDtlL_bldr.addSelect(t.itm_sub1);
			itmDtlL_bldr.addSelect(t.itm_sub2);
			itmDtlL_bldr.addSelect(t.itm_sub3);
			itmDtlL_bldr.addSelect(t.mfg_loc_cd);
			itmDtlL_bldr.addSelect(t.sppl_cd);
			itmDtlL_bldr.addSelect(t.maker_cd);
			itmDtlL_bldr.addSelect(t.rqst_loc_cd);
			itmDtlL_bldr.addSelect(t.wg_cd);
			itmDtlL_bldr.addSelect(t.bom_ptn);
			itmDtlL_bldr.addSelect(nvl( t.rqst_wg_cd, t.wg_cd).as("rqst_wg_cd"));
			itmDtlL_bldr.addSelect(t.st_dt);
			itmDtlL_bldr.addSelect(t.end_dt);
			itmDtlL_bldr.addSelect(t.prio);
			itmDtlL_bldr.addSelect(m1.sppl_cd.as("loc_sppl_cd"));
			itmDtlL_bldr.addSelect(m1.maker_cd.as("loc_maker_cd"));
			itmDtlL_bldr.addSelect(m2.wg_cd.as("loc_wg_cd"));
			itmDtlL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			itmDtlL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			itmDtlL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			itmDtlL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			itmDtlL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("gr_loc_wg_cd")));
			itmDtlL_bldr.addWhereWithAnd(bracket(
								t.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
										.or( t.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))
												.and(m1.sppl_cd.neq(value(MAC_STR.NULL_VAL.value()))) )));
			itmDtlL_bldr.addLeftOuterJoin(m1, bracket( m1.loc_cd.eq(t.mfg_loc_cd)));
			itmDtlL_bldr.addLeftOuterJoin(m2, bracket( m2.loc_cd.eq(t.rqst_loc_cd)));
			itmDtlL_bldr.setOrderByAsc(t.itm_cd,t.itm_sub1,t.itm_sub2,t.itm_sub3,t.wg_cd,t.prio);
			dbSelect("MSBAL5130_MAM_ITM_DTL_S01", _itmDtlL, itmDtlL_bldr, bindL);
		}
		_itmDtlKey = _itmDtlL.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd);
	}

	/**
	 * 品目詳細マスタのキャッシュ、値の補完【外注用】
	 * 
	 * @param dtlL　チェック対象のリスト
	 */
	protected void _cachePurcItmDtl(MCList<ShipDmndRqst_Chk01_DtlR> dtlL) {
	
		// 購買依頼の場合、外注の可能性があるため、製造場所、構成パタンを補完する。
		MCList<ShipDmndRqst_Chk01_DtlR> bindL = MCList.create(ShipDmndRqst_Chk01_DtlR.class);			
	
		MCList<ShipDmndRqst_Chk01_DtlR> dtlLforBind = dtlL.clone();
		for(ShipDmndRqst_Chk01_DtlR r : dtlLforBind) {
			if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
				if(!isNullOrNullVal(r.sppl_cd())) {
					if(isNullOrNullVal(r.mfg_loc_cd())) {
						r.maker_cd(nvl(r.maker_cd(),MAC_STR.NULL_VAL.value()));
						bindL.add(r);
					}
				}
			}
		}
		
		_purcItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		
		if(!bindL.isEmpty()) {
			MAM_ITM_DTL_R S1TMP = MAM_ITM_DTL_R.create("TMP");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder purcItmDtlL_bldr = MCQueryApiBuilder.create(t);
			bindL.sort(ShipDmndRqst_Chk01_DtlR.$itm_cd, ShipDmndRqst_Chk01_DtlR.$itm_sub1, ShipDmndRqst_Chk01_DtlR.$itm_sub2, ShipDmndRqst_Chk01_DtlR.$itm_sub3);
	
			purcItmDtlL_bldr.setSelect(t.itm_cd);
			purcItmDtlL_bldr.addSelect(t.itm_sub1);
			purcItmDtlL_bldr.addSelect(t.itm_sub2);
			purcItmDtlL_bldr.addSelect(t.itm_sub3);
			purcItmDtlL_bldr.addSelect(t.wg_cd);
			purcItmDtlL_bldr.addSelect(t.mfg_loc_cd);
			purcItmDtlL_bldr.addSelect(t.bom_ptn);
			purcItmDtlL_bldr.addSelect(t.st_dt);
			purcItmDtlL_bldr.addSelect(t.end_dt);
			purcItmDtlL_bldr.addSelect(m1.sppl_cd);
			purcItmDtlL_bldr.addSelect(nvl( m1.maker_cd, value(MAC_STR.NULL_VAL.value())).as("maker_cd"));
			purcItmDtlL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			purcItmDtlL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			purcItmDtlL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			purcItmDtlL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			purcItmDtlL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("gr_loc_wg_cd")));
			if (isSame(_sysParm, "1")) {
				purcItmDtlL_bldr.addWhereWithAnd(bind("avl_schd_dt").between(t.st_dt, t.end_dt));
			}
			purcItmDtlL_bldr.addWhereWithAnd(t.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))
							.and(m1.sppl_cd.eq(bind("sppl_cd")))
							.and( nvl( m1.maker_cd, value(MAC_STR.NULL_VAL.value()) ).eq(bind("maker_cd"))));
			purcItmDtlL_bldr
					.addWhereWithAnd(notExists(subQuery().select(nullValue()).from(S1TMP)
							.where(value(0).eq(value(0))
									.and(S1TMP.itm_cd.eq(t.itm_cd))
									.and(S1TMP.itm_sub1.eq(t.itm_sub1))
									.and(S1TMP.itm_sub2.eq(t.itm_sub2))
									.and(S1TMP.itm_sub3.eq(t.itm_sub3))
									.and(S1TMP.wg_cd.eq(t.wg_cd))
									.and(S1TMP.sppl_cd.eq(bind("sppl_cd")))
									.and(S1TMP.maker_cd.eq(bind("maker_cd")))
									.and(bind("avl_schd_dt").between(S1TMP.st_dt, S1TMP.end_dt)))));
			purcItmDtlL_bldr.addLeftOuterJoin(m1, bracket(m1.loc_cd.eq(t.mfg_loc_cd)));
			purcItmDtlL_bldr.setOrderByAsc(t.itm_cd,t.itm_sub1,t.itm_sub2,t.itm_sub3,t.wg_cd,t.mfg_loc_cd,t.prio);
			dbSelect("MSBAL5130_MAM_ITM_DTL_S02", _purcItmDtlL, purcItmDtlL_bldr, bindL);
		}
		_purcItmDtlKey = _purcItmDtlL.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd, MAM_LOC_R.$sppl_cd, MAM_LOC_R.$maker_cd);
	}

	/**
	 * 各ＬＴを考慮して品目詳細マスタを参照する日付を取得
	 * 
	 * @param dtlR 処理対象行
	 * @param purcOnlyFlg 購買のケースのみ参照する場合にtrue
	 * @return マスタ参照日付、対象がない場合はNULL
	 */
	protected MCDate getBaseDate(MCRow dtlR, boolean purcOnlyFlg) {
		MCDate baseDt = null;
		
		// 対象となりえる品目詳細マスタを取得
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder tmpItmDtlL_bldr = MCQueryApiBuilder.create(t);
		tmpItmDtlL_bldr.addSelect(m1.sppl_cd.as("loc_sppl_cd"));
		tmpItmDtlL_bldr.addSelect(m1.maker_cd.as("loc_maker_cd"));
		tmpItmDtlL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
		tmpItmDtlL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		tmpItmDtlL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		tmpItmDtlL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		tmpItmDtlL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("gr_loc_wg_cd")));
		if (purcOnlyFlg) {
			tmpItmDtlL_bldr.addWhereWithAnd(bracket(
							t.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
									.and(t.sppl_cd.eq(bind("sppl_cd")))
									.and(t.maker_cd.eq(bind("maker_cd")))
											.or( t.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))
													.and(m1.sppl_cd.neq(value(MAC_STR.NULL_VAL.value())))
													.and(m1.sppl_cd.eq(bind("sppl_cd"))) )));
		}
		else {
			tmpItmDtlL_bldr.addWhereWithAnd(bracket(
							t.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
									.or( t.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))
											.and(m1.sppl_cd.neq(value(MAC_STR.NULL_VAL.value()))) )));
		}
		tmpItmDtlL_bldr.addLeftOuterJoin(m1, bracket( m1.loc_cd.eq(t.mfg_loc_cd)));
		
		tmpItmDtlL_bldr.setOrderByAsc(t.prio);
		MCList<MAM_ITM_DTL_R> tmpItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		dbSelect("MSBAL5130_MAM_ITM_DTL_S03", tmpItmDtlL, tmpItmDtlL_bldr, dtlR);
		
		if (!tmpItmDtlL.isEmpty()) {
			// 受注明細より必要情報取得
			setSloDInfo(dtlR);
			MAM_LOC_R locR = getLoc(dtlR.getString("gr_loc_cd"));
			
			tmpItmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn, MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$rqst_loc_cd);
			for (MAM_ITM_DTL_R tmpItmDtlR : tmpItmDtlL) {
				if (!isSame(nvl(tmpItmDtlR.sppl_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())
						|| !isSame(nvl(tmpItmDtlR.getStringNE("loc_sppl_cd"), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
					// 購買ユーティリティで算出した日付で処理
					PurcUtil_Srch01_DtlR rslt = callPurcUtilSrch01(dtlR, locR, tmpItmDtlR);
					baseDt = rslt.po_schd_dt();
				}
				// 依頼先場所が指定されている場合＝「依頼」
				else if(!isSame(tmpItmDtlR.rqst_loc_cd(), MAC_STR.NULL_VAL.value())) {
					// ＬＴを加味したマスタ参照基準日取得
					MCNumber diffLt = getDiffLT(dtlR, locR, tmpItmDtlR.rqst_loc_cd());
					baseDt = getCalDateLoc(dtlR.getDate("gr_rqst_tm"), diffLt, false,  dtlR.getString("gr_loc_cd"), true);
				}
				
				// 取得した日付が処理対象の品目詳細マスタで適用開始・終了の範囲内ならばその日付を返す
				if (!isNull(baseDt) && tmpItmDtlR.st_dt().lte(baseDt) && tmpItmDtlR.end_dt().gte(baseDt)) {
					break;
				}
				else {
					baseDt = null;
				}
			}
		}
		
		return baseDt;
	}

	/**
	 * オーダ登録サービス予定日計算用のマスタ参照日付を取得
	 * 
	 * @param dtlR 処理対象行
	 * @return マスタ参照日付
	 */
	protected MCDate getMasterDate(MCRow dtlR) {
		MCDate baseDt = null;
		setSloDInfo(dtlR);
		MAM_LOC_R locR = getLoc(dtlR.getString("gr_loc_cd"));

		// 購買
		if (MSC_WG_RQST_TYP.isPURC(dtlR.getString("wg_rqst_typ"))) {
			// 購買ユーティリティで算出した日付
			PurcUtil_Srch01_DtlR rslt = callPurcUtilSrch01(dtlR, locR, null);
			if (isSame(_sysParm, "1")) {
				baseDt = rslt.rqst_dlv_rqst_dt();
			}
			else {
				baseDt = rslt.po_schd_dt();
			}
			
		}
		// 移送
		else if (MSC_WG_RQST_TYP.isXFR(dtlR.getString("wg_rqst_typ"))) {
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");

			// 対象となりえる品目詳細マスタを取得
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder tmpItmDtlL_bldr = MCQueryApiBuilder.create(t);
			tmpItmDtlL_bldr.addSelect(m1.sppl_cd.as("loc_sppl_cd"));
			tmpItmDtlL_bldr.addSelect(m1.maker_cd.as("loc_maker_cd"));
			tmpItmDtlL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			tmpItmDtlL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			tmpItmDtlL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			tmpItmDtlL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			tmpItmDtlL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("gr_loc_wg_cd")));
			tmpItmDtlL_bldr.addWhereWithAnd(t.rqst_loc_cd.eq(bind("gi_loc_cd")));
			tmpItmDtlL_bldr.addWhereWithAnd(bracket(
							t.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
									.or( t.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))
											.and(m1.sppl_cd.neq(value(MAC_STR.NULL_VAL.value()))) )));
			tmpItmDtlL_bldr.addLeftOuterJoin(m1, bracket( m1.loc_cd.eq(t.mfg_loc_cd)));
			tmpItmDtlL_bldr.setOrderByDesc(t.st_dt);
			MCList<MAM_ITM_DTL_R> tmpItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			dbSelect("MSBAL5130_MAM_ITM_DTL_S04", tmpItmDtlL, tmpItmDtlL_bldr, dtlR);

			// ＬＴを加味したマスタ参照基準日（出庫依頼日）取得
			MCNumber diffLt = getDiffLT(dtlR, locR, null);
			MCDate tmpDt = getCalDateLoc(dtlR.getDate("gr_rqst_tm"), diffLt, false, dtlR.getString("gr_loc_cd"), true);
			// マスタ参照基準日（出庫依頼日）を適用期間内にもつ品目詳細マスタが存在するかチェック
			for (MAM_ITM_DTL_R tmpItmDtlR : tmpItmDtlL) {
				if (!isNull(tmpDt) && tmpItmDtlR.st_dt().lte(tmpDt) && tmpItmDtlR.end_dt().gte(tmpDt)) {
					baseDt = tmpDt;
					break;
				}
			}
		}
		return baseDt;
	}

	/**
	 * 受注明細から必要な情報取得し設定する
	 */
	protected void setSloDInfo(MCRow dtlR) {
		if (isNull(dtlR.getString("slo_d_no"))) {
			// 受注明細が無い場合
			dtlR.addStringColumn("slod_tdlv_cd", null);
			dtlR.addStringColumn("slod_tdlv_lg_grp_cd", null);
			dtlR.addStringColumn("slod_dlv_cd", null);
			dtlR.addStringColumn("slod_dlv_lg_grp_cd", null);
			dtlR.addStringColumn("slod_dlv_cal_cd", null);
			dtlR.addNumberColumn("slod_base_unit_qty", null);
			dtlR.addStringColumn("slod_ship_term_cd", null);
			dtlR.addStringColumn("slod_proc_typ", null);
		}
		else {
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MAM_BP_R m1 = MAM_BP_R.create("M1");

			MST_SLO_D_R sloDR = MST_SLO_D_R.create();
			MCQueryApiBuilder sloDR_bldr = MCQueryApiBuilder.create(t);
			sloDR_bldr.setSelect(t.tdlv_cd);
			sloDR_bldr.addSelect(t.tdlv_lg_grp_cd);
			sloDR_bldr.addSelect(t.dlv_cd);
			sloDR_bldr.addSelect(t.dlv_lg_grp_cd);
			sloDR_bldr.addSelect(t.base_unit_qty);
			sloDR_bldr.addSelect(t.ship_term_cd);
			sloDR_bldr.addSelect(t.proc_typ);
			sloDR_bldr.addSelect(m1.dlv_cal_cd.as("slod_dlv_cal_cd"));
			sloDR_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
			sloDR_bldr.addLeftOuterJoin(m1, bracket( m1.bp_cd.eq(t.dlv_cd)));
			dbSelect("MSBAL5130_MST_SLO_D_S01", sloDR, sloDR_bldr, dtlR);

			dtlR.addStringColumn("slod_tdlv_cd", sloDR.tdlv_cd());
			dtlR.addStringColumn("slod_tdlv_lg_grp_cd", sloDR.tdlv_lg_grp_cd());
			dtlR.addStringColumn("slod_dlv_cd", sloDR.dlv_cd());
			dtlR.addStringColumn("slod_dlv_lg_grp_cd", sloDR.dlv_lg_grp_cd());
			dtlR.addStringColumn("slod_dlv_cal_cd", sloDR.getString("slod_dlv_cal_cd"));
			dtlR.addNumberColumn("slod_base_unit_qty", sloDR.base_unit_qty());
			dtlR.addStringColumn("slod_ship_term_cd", sloDR.ship_term_cd());
			dtlR.addStringColumn("slod_proc_typ", sloDR.proc_typ());
		}
	}

	/**
	 * 移動ＬＴ（負数）を取得
	 * 
	 * @param dtlR 処理対象明細行
	 * @param locR 納入場所
	 * @param rqstLocCd 依頼先場所ＣＤ（getBaseDateから呼ばれるとき、dtlRに出庫場所が指定されていない場合に使用）
	 * @return (移送ＬＴ)×-1
	 */
	protected MCNumber getDiffLT(MCRow dtlR, MAM_LOC_R locR, String rqstLocCd) {

		// 物流制御マスタより移動ＬＴを取得
		MAM_LG_CTL_R t = MAM_LG_CTL_R.create("T");
		MCQueryApiBuilder lgCtlR_bldr = MCQueryApiBuilder.create(t);
		lgCtlR_bldr.setSelect(t.xfr_lt);
	
		if (isNull(dtlR.getString("slo_d_no"))) {
			// 受注明細が無い場合
			lgCtlR_bldr.setWhere(t.fr_lg_grp_cd.eq(bind("1")), dtlR.getString("gi_lg_grp_cd"));
		}
		else {
			if (isNull(dtlR.getStringNE("gi_lg_grp_cd"))) {
				MAM_LOC_R rqstLocR = getLoc(rqstLocCd);
				lgCtlR_bldr.setWhere(t.fr_lg_grp_cd.eq(bind("1")), rqstLocR.lg_grp_cd());
			}
			else {
				lgCtlR_bldr.setWhere(t.fr_lg_grp_cd.eq(bind("1")), dtlR.getString("gi_lg_grp_cd"));
			}
		}
		lgCtlR_bldr.addWhereWithAnd(t.to_lg_grp_cd.eq(bind("1")), locR.lg_grp_cd());
		lgCtlR_bldr.addWhereWithAnd(t.ship_term_cd.eq(bind("1")), nvl(dtlR.getString("slod_ship_term_cd"), MAC_STR.NULL_VAL.value()));
		MAM_LG_CTL_R lgCtlR = MAM_LG_CTL_R.create();
		dbSelect("MSBAL5130_MAM_LG_CTL_S01", lgCtlR, lgCtlR_bldr);
		return nvl(lgCtlR.xfr_lt(), MCNumber.ZERO).multiply(-1);
	}
	
	protected MAM_ITM_DTL_R getPoSchdOutsrcItmDtlR(
			MAM_ITM_DTL_R itmDtlR
			,String itmCd
			, String itmSub1
			, String itmSub2
			, String itmSub3
			, String wgCd
			, MCDate grRqstTm
			, String spplCd
			, String makerCd
			, String sloDNo
			, String crudTyp) {
		if (!isNull(itmDtlR) || !MAC_DATA_CRUD_TYP.isUPD(crudTyp)) {
			return itmDtlR;
		}
		MST_PO_SCHD_R poSchdR = getPoSchdR(sloDNo);
		if (isNull(poSchdR)) {
			return itmDtlR;
		}
		return getOutsrcItmDtlR(itmCd, itmSub1, itmSub2, itmSub3, poSchdR.mfg_loc_cd(), poSchdR.bom_ptn(), wgCd, spplCd, makerCd, grRqstTm);
	}
	
	protected static void cachePoSchd(MCList<ShipDmndRqst_Chk01_DtlR> dtlL) {
		object(CLAZZ)._cachePoSchd(dtlL);
	}
	protected void _cachePoSchd(MCList<ShipDmndRqst_Chk01_DtlR> dtlL) {
		MCList<ShipDmndRqst_Chk01_DtlR> bindL = MCList.create(ShipDmndRqst_Chk01_DtlR.class);			
		for(ShipDmndRqst_Chk01_DtlR r : dtlL) {
			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				bindL.add(r);
			}
		}
		
		_poSchdL = MCList.create(MST_PO_SCHD_R.class);
		if (!bindL.isEmpty()) {
			MST_PO_SCHD_R poSchd = MST_PO_SCHD_R.create("POSCHD");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(poSchd);
			poSchdL_bldr.setSelect(poSchd.po_schd_no);
			poSchdL_bldr.addSelect(poSchd.po_schd_src_no);
			poSchdL_bldr.addSelect(poSchd.outsrc_flg);
			poSchdL_bldr.addSelect(poSchd.mfg_loc_cd);
			poSchdL_bldr.addSelect(poSchd.bom_ptn);
			poSchdL_bldr.setWhere(poSchd.po_schd_src_no.eq(bind("wg_rqst_src_no")));
			poSchdL_bldr.addWhereWithAnd(poSchd.rqst_can_flg.eq(value(false)));
			poSchdL_bldr.addWhereWithAnd(poSchd.outsrc_flg.eq(value(true)));
			poSchdL_bldr.addWhereWithAnd(poSchd.split_src_schd_no.isNull());
			dbSelect("MSBAL5130_MST_PO_SCHD_S04", _poSchdL, poSchdL_bldr, bindL);
		}
		_poSchdKey =_poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_src_no);
	}
	
	protected static MST_PO_SCHD_R getPoSchdR(String sloDNo) {
		return object(CLAZZ)._getPoSchdR(sloDNo);
	}
	
	protected MST_PO_SCHD_R _getPoSchdR(String sloDNo) {
		return _poSchdL.getFirst(_poSchdKey, sloDNo);
	}
	
	protected void _cacheOutsrcItmDtl(MCList<ShipDmndRqst_Chk01_DtlR> dtlL) {
		MCList<ShipDmndRqst_Chk01_DtlR> bindL = MCList.create(ShipDmndRqst_Chk01_DtlR.class);
		MCList<ShipDmndRqst_Chk01_DtlR> dtlLforBind = dtlL.clone();
		for(ShipDmndRqst_Chk01_DtlR r : dtlLforBind) {
			if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()) && MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				if(!isNullOrNullVal(r.sppl_cd())) {
					if(isNullOrNullVal(r.mfg_loc_cd())) {
						r.maker_cd(nvl(r.maker_cd(),MAC_STR.NULL_VAL.value()));
						bindL.add(r);
					}
				}
			}
		}
		
		_outsrcItmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		if(!bindL.isEmpty()) {
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");
			MAM_ITM_DTL_R itmDtl = MAM_ITM_DTL_R.create("ITMDTL");
			MCQueryApiBuilder outsrcItmDtlL_bldr = MCQueryApiBuilder.create(itmDtl);
			bindL.sort(ShipDmndRqst_Chk01_DtlR.$itm_cd, ShipDmndRqst_Chk01_DtlR.$itm_sub1, ShipDmndRqst_Chk01_DtlR.$itm_sub2, ShipDmndRqst_Chk01_DtlR.$itm_sub3);
			outsrcItmDtlL_bldr.setSelect(itmDtl.itm_cd);
			outsrcItmDtlL_bldr.addSelect(itmDtl.itm_sub1);
			outsrcItmDtlL_bldr.addSelect(itmDtl.itm_sub2);
			outsrcItmDtlL_bldr.addSelect(itmDtl.itm_sub3);
			outsrcItmDtlL_bldr.addSelect(itmDtl.wg_cd);
			outsrcItmDtlL_bldr.addSelect(itmDtl.mfg_loc_cd);
			outsrcItmDtlL_bldr.addSelect(itmDtl.bom_ptn);
			outsrcItmDtlL_bldr.addSelect(itmDtl.st_dt);
			outsrcItmDtlL_bldr.addSelect(itmDtl.end_dt);
			outsrcItmDtlL_bldr.addSelect(loc.sppl_cd);
			outsrcItmDtlL_bldr.addSelect(nvl(loc.maker_cd, value(MAC_STR.NULL_VAL.value())).as("maker_cd"));
			outsrcItmDtlL_bldr.setWhere(itmDtl.itm_cd.eq(bind("itm_cd")));
			outsrcItmDtlL_bldr.addWhereWithAnd(itmDtl.itm_sub1.eq(bind("itm_sub1")));
			outsrcItmDtlL_bldr.addWhereWithAnd(itmDtl.itm_sub2.eq(bind("itm_sub2")));
			outsrcItmDtlL_bldr.addWhereWithAnd(itmDtl.itm_sub3.eq(bind("itm_sub3")));
			outsrcItmDtlL_bldr.addWhereWithAnd(itmDtl.wg_cd.eq(bind("gr_loc_wg_cd")));
			outsrcItmDtlL_bldr.addWhereWithAnd(itmDtl.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))
							.and(loc.sppl_cd.eq(bind("sppl_cd")))
							.and(nvl(loc.maker_cd, value(MAC_STR.NULL_VAL.value()) ).eq(bind("maker_cd"))));
			if (isSame(_sysParm, "1")) {
				outsrcItmDtlL_bldr.addWhereWithAnd(bind("avl_schd_dt").between(itmDtl.st_dt, itmDtl.end_dt));
			}
			outsrcItmDtlL_bldr.addLeftOuterJoin(loc, bracket(loc.loc_cd.eq(itmDtl.mfg_loc_cd)));
			outsrcItmDtlL_bldr.setOrderByAsc(itmDtl.itm_cd,itmDtl.itm_sub1,itmDtl.itm_sub2,itmDtl.itm_sub3,itmDtl.wg_cd,itmDtl.mfg_loc_cd,itmDtl.prio);
			dbSelect("MSBAL5130_MAM_ITM_DTL_S05", _outsrcItmDtlL, outsrcItmDtlL_bldr, bindL);
		}
		_outsrcItmDtlKey = _outsrcItmDtlL.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2, MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd, MAM_LOC_R.$sppl_cd, MAM_LOC_R.$maker_cd);
	}
	
	protected static MAM_ITM_DTL_R getOutsrcItmDtlR(
		String itmCd
		, String itmSub1
		, String itmSub2
		, String itmSub3
		, String mfgLocCd
		, String bomPtn
		, String wgCd
		, String spplCd
		, String makerCd
		, MCDate grRqstTm
	) {
		return object(CLAZZ)._getOutsrcItmDtlR(itmCd, itmSub1, itmSub2, itmSub3, mfgLocCd, bomPtn, wgCd, spplCd, makerCd, grRqstTm);
	}
	
	protected MAM_ITM_DTL_R _getOutsrcItmDtlR(
		String itmCd
		, String itmSub1
		, String itmSub2
		, String itmSub3
		, String mfgLocCd
		, String bomPtn
		, String wgCd
		, String spplCd
		, String makerCd
		, MCDate grRqstTm
	) {
		MCList<MAM_ITM_DTL_R> itmDtlL = _outsrcItmDtlL.subList(_outsrcItmDtlKey, itmCd, itmSub1, itmSub2, itmSub3, wgCd, spplCd, makerCd);
		itmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn, MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$rqst_loc_cd);
		for(MAM_ITM_DTL_R r : itmDtlL) {
			if (isNullOrNullVal(r.sppl_cd())) {
				continue;
			}
			if (!isSame(mfgLocCd, r.mfg_loc_cd())) {
				continue;
			}
			if (!isSame(bomPtn, r.bom_ptn())) {
				continue;
			}
			if(grRqstTm.gte(r.st_dt()) && grRqstTm.lte(r.end_dt())) {
				return r;
			}
		}
		return null;
	}
	
	/**
	 * 購買共通ユーティリティ呼出
	 * 
	 * @param dtlR 処理対象明細行
	 * @param locR 納入場所
	 * @param tmpItmDtlR 品目詳細マスタの処理対象行
	 * @return 購買共通ユーティリティ取得結果
	 */
	protected PurcUtil_Srch01_DtlR callPurcUtilSrch01(MCRow dtlR, MAM_LOC_R locR, MAM_ITM_DTL_R tmpItmDtlR) {
		MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
		PurcUtil_Srch01_DtlR purcSrchDtlR = PurcUtil_Srch01_DtlR.create();
		purcSrchDtlR.peg_no(dtlR.getNumber("peg_no"));
		purcSrchDtlR.dlv_rqst_dt(dtlR.getDateNE("gr_rqst_tm")); // WG間依頼から登録したとき、入庫依頼日が基準になる
		purcSrchDtlR.rqst_dlv_rqst_dt(dtlR.getDateNE("avl_schd_dt")); // 受注から登録したとき、出荷予定日が基準になる
		purcSrchDtlR.itm_cd(dtlR.getString("itm_cd"));
		purcSrchDtlR.itm_sub1(dtlR.getString("itm_sub1"));
		purcSrchDtlR.itm_sub2(dtlR.getString("itm_sub2"));
		purcSrchDtlR.itm_sub3(dtlR.getString("itm_sub3"));
		purcSrchDtlR.wg_cd(dtlR.getString("gr_loc_wg_cd"));
		purcSrchDtlR.in_to_loc_cd(dtlR.getString("gr_loc_cd"));
		purcSrchDtlR.prov_ddlv_flg(isNull(locR.sppl_cd()) ? false : true);
		purcSrchDtlR.site_cd(locR.site_cd());
		purcSrchDtlR.in_to_loc_cal_cd(locR.cal_cd());

		if (isNull(tmpItmDtlR)) {// getMasterDateから呼ばれる場合
			if (!isNullOrNullVal(dtlR.getString("mfg_loc_cd"))) {
				purcSrchDtlR.mfg_loc_cd(dtlR.getString("mfg_loc_cd"));
				purcSrchDtlR.bom_ptn(dtlR.getString("bom_ptn"));
			}
			purcSrchDtlR.sppl_cd(dtlR.getString("sppl_cd"));
			purcSrchDtlR.maker_cd(dtlR.getString("maker_cd"));
			MAM_BP_R spplR = getBp(dtlR.getString("sppl_cd"));
			purcSrchDtlR.sppl_cal_cd(spplR.sppl_cal_cd());
		}
		else {// getBaseDateから呼ばれる場合
			if (!isNullOrNullVal(tmpItmDtlR.mfg_loc_cd())) {
				purcSrchDtlR.mfg_loc_cd(tmpItmDtlR.mfg_loc_cd());
				purcSrchDtlR.bom_ptn(tmpItmDtlR.bom_ptn());
			}
			purcSrchDtlR.sppl_cd(nvl(tmpItmDtlR.getString("loc_sppl_cd"), tmpItmDtlR.sppl_cd()));
			purcSrchDtlR.maker_cd(nvl(tmpItmDtlR.getString("loc_maker_cd"), tmpItmDtlR.maker_cd()));
			MAM_BP_R spplR = getBp(purcSrchDtlR.sppl_cd());
			purcSrchDtlR.sppl_cal_cd(spplR.sppl_cal_cd());
		}
		// 仕入直送の場合
		if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.getString("slod_proc_typ"))) {
			purcSrchDtlR.dlv_cd(dtlR.getString("slod_dlv_cd"));
			purcSrchDtlR.dlv_cal_cd(dtlR.getString("slod_dlv_cal_cd"));
		}
		// 物流グループＣＤ
		if (!isNull(dtlR.getString("slod_tdlv_cd"))) {
			purcSrchDtlR.lg_grp_cd(dtlR.getString("slod_tdlv_lg_grp_cd"));
		}
		else {
			purcSrchDtlR.lg_grp_cd(dtlR.getString("slod_dlv_lg_grp_cd"));
		}
		purcSrchDtlR.base_unit_qty(dtlR.getNumber("slod_base_unit_qty"));
		purcUtilSrch01.up0().add(purcSrchDtlR);

		// 購買共通ユーティリティ呼出
		purcUtilSrch01.exec();

		// 購買ユーティリティで取得できなかった場合
		if (purcUtilSrch01.down0().get(0).err_flg()) {
			return PurcUtil_Srch01_DtlR.create();
		}
		return purcUtilSrch01.down0().get(0);
	}
	
	/** 取引先マスタ取得 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _bpR;
	protected static MAM_BP_R getBp(String bpCd) {
		return object(CLAZZ)._getBp(bpCd);
	}
	protected MAM_BP_R _getBp(String bpCd) {
		if (_bpR == null) {
			MCQueryApiBuilder bpR_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			_bpR = new FXUCL_MCDbcCache<MAM_BP_R>(bpR_bldr);
		}
		return _bpR.get(bpCd);
	}
	
	/** 場所マスタ取得 */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locR;
	protected static MAM_LOC_R getLoc(String locCd) {
		return object(CLAZZ)._getLoc(locCd);
	}
	protected MAM_LOC_R _getLoc(String locCd) {
		
		if (_locR == null) {
			MCQueryApiBuilder locR_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));
			_locR = new FXUCL_MCDbcCache<MAM_LOC_R>(locR_bldr);
		}
		return _locR.get(locCd);
	}
	
	/**
	 * キャッシュから品目詳細マスタを取得する
	 * @param itm_cd 品目
	 * @param itm_sub1　枝番１
	 * @param itm_sub2　枝番２
	 * @param itm_sub3　枝番３
	 * @param gr_loc_wg_cd　入庫ワーキンググループ
	 * @param gr_rqst_tm　入庫依頼日時
	 * @return　MAM_ITM_DTL_R 該当の品目詳細マスタ
	 */
	protected static MAM_ITM_DTL_R getItmDtlR(
		String itm_cd
		, String itm_sub1
		, String itm_sub2
		, String itm_sub3
		, String gr_loc_wg_cd
		, MCDate gr_rqst_tm
	) {
		return object(CLAZZ)._getItmDtlR(itm_cd, itm_sub1, itm_sub2, itm_sub3, gr_loc_wg_cd, gr_rqst_tm);
	}
	protected MAM_ITM_DTL_R _getItmDtlR(
		String itm_cd
		, String itm_sub1
		, String itm_sub2
		, String itm_sub3
		, String gr_loc_wg_cd
		, MCDate gr_rqst_tm
	) {
		MCList<MAM_ITM_DTL_R> itmDtlL = _itmDtlL.subList(_itmDtlKey, itm_cd, itm_sub1, itm_sub2, itm_sub3, gr_loc_wg_cd);
		itmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn, MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$rqst_loc_cd);
		for(MAM_ITM_DTL_R r : itmDtlL) {
			if(gr_rqst_tm.gte(r.st_dt()) && gr_rqst_tm.lte(r.end_dt())) {
				return r;
			}
		}
		return null;
	}

	/**
	 * キャッシュから品目詳細マスタを取得する【外注用】
	 * @param itm_cd
	 * @param itm_sub1
	 * @param itm_sub2
	 * @param itm_sub3
	 * @param gr_loc_wg_cd
	 * @param gr_rqst_tm
	 * @param sppl_cd
	 * @param maker_cd
	 * @return MAM_ITM_DTL_R
	 */
	protected static MAM_ITM_DTL_R getPurcItmDtlR(
		String itm_cd
		, String itm_sub1
		, String itm_sub2
		, String itm_sub3
		, String gr_loc_wg_cd
		, MCDate gr_rqst_tm
		, String sppl_cd
		, String maker_cd
	) {
		return object(CLAZZ)._getPurcItmDtlR(itm_cd, itm_sub1, itm_sub2, itm_sub3, gr_loc_wg_cd, gr_rqst_tm, sppl_cd, maker_cd);
	}
	protected MAM_ITM_DTL_R _getPurcItmDtlR(
		String itm_cd
		, String itm_sub1
		, String itm_sub2
		, String itm_sub3
		, String gr_loc_wg_cd
		, MCDate gr_rqst_tm
		, String sppl_cd
		, String maker_cd
	) {
		for(MAM_ITM_DTL_R r : _purcItmDtlL.subList(_purcItmDtlKey, itm_cd, itm_sub1, itm_sub2, itm_sub3, gr_loc_wg_cd, sppl_cd, maker_cd)) {
			if(gr_rqst_tm.gte(r.st_dt()) && gr_rqst_tm.lte(r.end_dt())) {
				return r;
			}
		}
		return null;
	}
	
	/**
	 * 場所マスタをキャッシュする
	 * 
	 * @param dtlL　チェック対象のリスト
	 */
	protected static void cacheLoc(MCList<ShipDmndRqst_Chk01_DtlR> dtlL) {
		object(CLAZZ)._cacheLoc(dtlL);
	}

	/**
	 * 場所マスタのキャッシュ、値の補完
	 * 
	 * @param dtlL　チェック対象のリスト
	 */
	protected void _cacheLoc(MCList<ShipDmndRqst_Chk01_DtlR> dtlL) {
		// 入庫場所に対する場所マスタを取得
		_locL = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
		locL_bldr.setSelect(t.loc_cd);
		locL_bldr.addSelect(t.wg_cd);
		locL_bldr.setWhere(t.loc_cd.eq(bind("gr_loc_cd")));
		dbSelect("MSBAL5130_MAM_LOC_S03", _locL, locL_bldr, dtlL.groupBy(ShipDmndRqst_Chk01_DtlR.$gr_loc_cd));

		_locKey = _locL.createIndex(MAM_LOC_R.$loc_cd);
	}

	/**
	 * キャッシュから場所マスタを取得する
	 * @param loc_cd 場所
	 * @return　MAM_LOC_R 該当の場所マスタ
	 */
	protected static MAM_LOC_R getLocR(
		String loc_cd
	) {
		return object(CLAZZ)._getLocR(loc_cd);
	}
	protected MAM_LOC_R _getLocR(
		String loc_cd
	) {
		return _locL.getFirst(_locKey, loc_cd);
	}
	/**
	 * 物流標準場所のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _lgDefLocCache = null;
	protected void doLgDefLocCache(MCList<ShipDmndRqst_Upd01_DtlR> dtlL) {
		
		MCList<MAM_LG_GRP_R> cndL = MCList.create(MAM_LG_GRP_R.class);
		for (ShipDmndRqst_Upd01_DtlR r : dtlL) {
			if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())
					&& isNullOr(r.gi_schd_dt(), r.strg_schd_dt())
					&& isNullOrNullVal(r.gi_loc_cd())
					&& !isNullOrNullVal(r.gi_lg_grp_cd())) {
				cndL.add().lg_grp_cd(r.gi_lg_grp_cd());
			}
		}

		MAM_LOC_R t1 = MAM_LOC_R.create("T1");

		MAM_LG_GRP_R t = MAM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t1.loc_cd);
		dbc_bldr.addInnerJoin(t1, bracket( t1.lg_grp_cd.eq(t.lg_grp_cd) .and(t1.lg_def_flg.eq(value(true)))));

		object(CLAZZ)._lgDefLocCache = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(dbc_bldr, -1, cndL, MAM_LG_GRP_R.$lg_grp_cd);
	}
	
	protected String getLgDefLoc(String lgGrpCd) {
		
		return object(CLAZZ)._lgDefLocCache.get(lgGrpCd).getStringNE("loc_cd");
	}
	protected FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R> _itmLgGrpLocCache = null;
	// 品目、出庫物流場所グループに対するデフォルト場所
	protected static void initItmLgGrpLocCache(MCList<? extends MCRow> mcL) {
		object(CLAZZ)._initItmLgGrpLocCache(mcL);
	}	

	protected void _initItmLgGrpLocCache(MCList<? extends MCRow> mcL) {
		MAM_ITM_LG_GRP_R t = MAM_ITM_LG_GRP_R.create("T");

		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.lg_def_loc_cd);

		_itmLgGrpLocCache = new FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R>(dbcL_bldr, mcL,
				ShipDmndRqst_Upd01_DtlR.$itm_cd, ShipDmndRqst_Upd01_DtlR.$itm_sub1,
				ShipDmndRqst_Upd01_DtlR.$itm_sub2, ShipDmndRqst_Upd01_DtlR.$itm_sub3,
				ShipDmndRqst_Upd01_DtlR.$gi_lg_grp_cd);

	}

	protected static FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R> itmLgGrpLocCache() {
		return object(CLAZZ)._itmLgGrpLocCache;
	}

	//FMCB CUSTOM END
}