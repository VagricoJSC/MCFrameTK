package mcframe.serverMSBA.MSBAL5100;

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
import mcframe.serverMAUC.MAUCL5010.*;
import mcframe.serverMAUC.MAUCL5020.*;
import mcframe.serverMABC.MABCL5010.*;
import mcframe.serverMSBA.MSBAL5130.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBB.MSBBL6220.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBD.MSBDL5040.*;
import mcframe.serverMSBD.MSBDL5090.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5200.*;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheCW;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBAL_WgRqstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBAL_WgRqstService_MC extends MSBAL_WgRqstService_MC_A{
	//FMCB CUSTOM START
	protected String _sysParm = getSysParm("MASTER_DT_BASE");

	/**
	 * WgRqst_Chk01オペレーション.<p>
	 *
	 * ＷＧ間依頼の登録・更新・削除前のチェックを行う<br>
	 */
	public class WgRqst_Chk01 extends MSBAL_WgRqstService_MC_A.WgRqst_Chk01 {
		MSBDL_PoSchdRegService.PoSchd_Chk01 _poSchdChk01 = MSBDL_PoSchdRegService.crtPoSchd_Chk01();
		MSBEL_XfrSchdService.XfrSchd_Chk04 _xfrSchdChk04 = MSBEL_XfrSchdService.crtXfrSchd_Chk04();

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			cacheWgRqst(up0());
			cacheItm(up0());
			cacheWgRqstCtl(up0());
			
			setWgRqstNo();
			sprtMst();
			chkSchd();
			if (!isSame(_sysParm, "1")) {
				chkOrdSprt03MstrDt();
			}
			
			// 下り電文を設定
			down0().setAll(up0());
			for(PoSchd_Upd01_DtlR r : _poSchdChk01.up0()) {
				WgRqst_Chk01_Dtl2R tmpR = WgRqst_Chk01_Dtl2R.create();
				tmpR.poSchdChk01(r);
				tmpR.setAttributes(r);
				down1().add(tmpR);
			}
			for(XfrSchdChk04_DtlR r : _xfrSchdChk04.up0()) {
				WgRqst_Chk01_Dtl3R tmpR = WgRqst_Chk01_Dtl3R.create();
				tmpR.xfrSchdChk04(r);
				tmpR.setAttributes(r);
				down2().add(tmpR);
			}
		}
		

		/**
		 * ＷＧ間依頼種類区分、ＷＧ間依頼作成元区分、ＷＧ間依頼元識別ＮＯを元に、キャッシュした情報よりＷＧ間依頼ＮＯを補完する。
		 */
		protected void setWgRqstNo() {
			for(WgRqst_Chk01_DtlR r : up0()) {
				// 新規の場合以外はＷＧ間依頼種類区分、ＷＧ間依頼作成元区分、ＷＧ間依頼元識別ＮＯを元に、ＷＧ間依頼ＮＯを取得する。
				if(!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					if(isNull(r.wg_rqst_no())) {
						MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), r.data_crud_typ());
						if(!isNull(wgRqstR)) {
							r.wg_rqst_no(wgRqstR.wg_rqst_no());
						}
					}
				}
			}
		}
		
		/**
		 * 関連するマスタを補完
		 */
		protected void sprtMst() {
			for(WgRqst_Chk01_DtlR r : up0()) {
				// 品目マスタを取得
				MAM_ITM_R itmR = getItmR(r.wg_rqst());
				if(!isNull(itmR)) {
					r.sundry_itm_flg(itmR.sundry_itm_flg());
				}
				
				// 入庫場所の情報を補完
				MAM_LOC_R grLocR = getLoc(r.gr_loc_cd());
				if(!isNull(grLocR)) {
					r.wg_rqst().gr_loc_wg_cd(grLocR.wg_cd());
					r.wg_rqst().gr_lg_grp_cd(grLocR.lg_grp_cd());
				}
				
				// 出庫場所の情報を補完
				MAM_LOC_R giLocR = getLoc(r.gi_loc_cd());
				if(!isNull(giLocR)) {
					r.wg_rqst().gi_loc_wg_cd(giLocR.wg_cd());
					r.wg_rqst().gi_lg_grp_cd(giLocR.lg_grp_cd());
				}
				
				MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), r.data_crud_typ());
				
				// 自動回答できない場合は自動回答ＦＬＧはオフ
				if (!isNull(wgRqstR)
						&& cannotAutoPrms(wgRqstR.wg_rqst_sts_typ(), r.wg_rqst_typ(), wgRqstR.man_prms_flg())) {

					r.auto_prms_flg(false);
				}
				else {
					// ＷＧ間依頼制御マスタより自動回答ＦＬＧを設定
					r.auto_prms_flg(getWgRqstCtlR(r.rqst_to_wg_cd(), r.rqst_fr_wg_cd(),
							r.wg_rqst_typ(), r.rqst_fr_dpt_cd(), r.cst_cd(), r.itm_cd(),
							r.itm_sub1(), r.itm_sub2(), r.itm_sub3()));
				}
			}
		}
		
		/**
		 * 発注予定、移動・移送予定などの各種チェックを実行
		 */
		protected void chkSchd() {
			MSBEL_XfrSchdService.XfrSchd_Sprt01 xfrSchdSprt01 = MSBEL_XfrSchdService.crtXfrSchd_Sprt01();
			MABCL_SundryItmRegService.SundryItm_Chk01 sundryItmChk01 = MABCL_SundryItmRegService.crtSundryItm_Chk01();

			MCMessageList nextChkMsgL = new MCMessageList();
			
			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			wgRqstPrmsL.addStringColumn("XFR_SCHD_NO");
			
			MCList<WgRqst_Chk01_DtlR> bindL = MCList.create(WgRqst_Chk01_DtlR.class);
			for (WgRqst_Chk01_DtlR r : up0()) {
				// 諸口品登録サービスの上り電文を設定
				if(r.sundry_itm_flg()) {
					if(MSC_WG_RQST_SRC_TYP.isMNL(r.wg_rqst_src_typ())) {
						if(!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							SundryItm_Chk01_DtlR sundryItmChk01DtlR = SundryItm_Chk01_DtlR.create();
							copy(sundryItmChk01DtlR, r, createMap_SundryItm_Chk01_DtlR_WgRqst_Chk01_DtlR());
							sundryItmChk01.up0().add(sundryItmChk01DtlR);
						}
					}
				}
				
				// 移送の場合は、移動・移送予定の補完の上り電文設定
				if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					if(!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						XfrSchdEx_DtlR xfrSchdExDtlR = XfrSchdEx_DtlR.create();
						copy(xfrSchdExDtlR, r, createMap_XfrSchdEx_DtlR_WgRqst_Chk01_DtlR());
						xfrSchdSprt01.up0().add(xfrSchdExDtlR);
					}
				}
				
				if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					continue;
				}
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					bindL.add(r);
				}
			}
			bindL.sort(WgRqst_Chk01_DtlR.$wg_rqst_no);

			if(!bindL.isEmpty()) {
				MST_WG_RQST_PRMS_R t1 = MST_WG_RQST_PRMS_R.create("T");
				MCQueryApiBuilder wgRqstPrmsL_bldr1 = MCQueryApiBuilder.create(t1);
				wgRqstPrmsL_bldr1.setWhere(t1.wg_rqst_no.eq(bind("wg_rqst_no")));
				dbSelectForUpdate("MSBAL5100_MST_WG_RQST_PRMS_S01", wgRqstPrmsL, wgRqstPrmsL_bldr1, bindL);
			}
			MCIndexKey idxkey = wgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no, MST_WG_RQST_PRMS_R.$fix_flg);

			// 各予定の状況を取得する。
			MCList<MST_WG_RQST_PRMS_R> purcBindL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MCList<MST_WG_RQST_PRMS_R> xfrBindL = MCList.create(MST_WG_RQST_PRMS_R.class);

			for(WgRqst_Chk01_DtlR r : up0()) {
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					for(MST_WG_RQST_PRMS_R wgRqstPrmsR : wgRqstPrmsL.subList(idxkey, r.wg_rqst_no(), true)) {
						purcBindL.add(wgRqstPrmsR);
					}
				}
				else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					for(MST_WG_RQST_PRMS_R wgRqstPrmsR : wgRqstPrmsL.subList(idxkey, r.wg_rqst_no(), true)) {
						xfrBindL.add(wgRqstPrmsR);
					}
				}
			}

			// 発注予定の状況を取得
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			if(!purcBindL.isEmpty()) {
				purcBindL.sort(MST_WG_RQST_PRMS_R.$wg_rqst_prms_no);
				MST_PO_SCHD_R t2 = MST_PO_SCHD_R.create("T");
				MCQueryApiBuilder poSchdL_bldr2 = MCQueryApiBuilder.create(t2);
				MST_ITM_MFG_INST_R itm = MST_ITM_MFG_INST_R.create("T2");
				poSchdL_bldr2.setSelect(t2.po_flg);
				poSchdL_bldr2.addSelect(t2.rqst_upd_stop_flg);
				poSchdL_bldr2.addSelect(t2.can_flg);
				poSchdL_bldr2.addSelect(t2.abort_flg);
				poSchdL_bldr2.addSelect(t2.outsrc_itm_ord_no);
				poSchdL_bldr2.addSelect(itm.itm_mfg_inst_no);
				poSchdL_bldr2.addSelect(t2.po_schd_src_typ);
				poSchdL_bldr2.addSelect(t2.po_schd_src_no);
				poSchdL_bldr2.addLeftOuterJoin(itm, bracket( itm.itm_ord_no.eq(t2.outsrc_itm_ord_no)
						.and(itm.can_flg.eq(value(false)))));
				poSchdL_bldr2.setWhere(t2.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.RQST.value())));
				poSchdL_bldr2.addWhereWithAnd(t2.po_schd_src_no.eq(bind("wg_rqst_prms_no")));
				poSchdL_bldr2.addWhereWithAnd(t2.rqst_can_flg.eq(value(false)));
				poSchdL_bldr2.addWhereWithAnd(t2.split_src_schd_no.isNull());
				dbSelect("MSBAL5100_MST_PO_SCHD_S01", poSchdL, poSchdL_bldr2, purcBindL);
			}
			MCIndexKey poSchdKey = poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_src_no);

			// 移動・移送予定の状況を取得	
			MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
			if(!xfrBindL.isEmpty()) {
				xfrBindL.sort(MST_WG_RQST_PRMS_R.$wg_rqst_prms_no);
				xfrSchdL.addBooleanColumn("xfr_abort_flg");
				xfrSchdL.addBooleanColumn("cmpl_flg");
				xfrSchdL.addBooleanColumn("ship_pr_abort_flg");
				xfrSchdL.addBooleanColumn("dlv_cmpl_flg");
				MST_XFR_SCHD_R t3 = MST_XFR_SCHD_R.create("T");
				MCQueryApiBuilder xfrSchdL_bldr3 = MCQueryApiBuilder.create(t3);
				MST_XFR_ALLOC_STS_R xfr1 = MST_XFR_ALLOC_STS_R.create("T2");
				MST_SHIP_PR_R ship = MST_SHIP_PR_R.create("T3");
				xfrSchdL_bldr3.setSelect(t3.trd_ptn_typ);
				xfrSchdL_bldr3.addSelect(nvl( xfr1.abort_flg, value(false)).as("xfr_abort_flg"));
				xfrSchdL_bldr3.addSelect(nvl( xfr1.cmpl_flg, value(false)).as("cmpl_flg"));
				xfrSchdL_bldr3.addSelect(nvl( ship.abort_flg, value(false)).as("ship_pr_abort_flg"));
				xfrSchdL_bldr3.addSelect(nvl( ship.dlv_cmpl_flg, value(false)).as("dlv_cmpl_flg"));
				xfrSchdL_bldr3.addSelect(nvl( ship.ship_inst_qty, value(0)).as("ship_inst_qty"));
				xfrSchdL_bldr3.addSelect(nvl( ship.ship_act_qty, value(0)).as("ship_act_qty"));
				xfrSchdL_bldr3.addSelect(t3.xfr_src_typ);
				xfrSchdL_bldr3.addSelect(t3.xfr_src_no);
				xfrSchdL_bldr3.addSelect(t3.gi_lg_grp_cd);
				xfrSchdL_bldr3.addSelect(t3.gr_lg_grp_cd);
				xfrSchdL_bldr3.setWhere(t3.xfr_src_typ.eq(value(MSC_XFR_SRC_TYP.WG_RQST.value())));
				xfrSchdL_bldr3.addWhereWithAnd(t3.xfr_src_no.eq(bind("wg_rqst_prms_no")));
				xfrSchdL_bldr3.addWhereWithAnd(t3.rqst_can_flg.eq(value(false)));
				xfrSchdL_bldr3.addWhereWithAnd(t3.gi_lg_grp_cd.neq(t3.gr_lg_grp_cd));
				xfrSchdL_bldr3.addLeftOuterJoin(xfr1, bracket( xfr1.xfr_schd_no.eq(t3.xfr_schd_no)));
				xfrSchdL_bldr3.addLeftOuterJoin(ship, bracket( ship.xfr_schd_no.eq(t3.xfr_schd_no)));
				xfrSchdL_bldr3.setOrderByAsc(t3.xfr_src_typ, t3.xfr_src_no);
				dbSelect("MSBAL5100_MST_XFR_SCHD_S01", xfrSchdL, xfrSchdL_bldr3, xfrBindL);
			}

			if(!xfrBindL.isEmpty()) {
				// 移動・移送予定の状況を取得
				
				MCList<MST_XFR_SCHD_R> xfrSchdL2 = MCList.create(MST_XFR_SCHD_R.class);
				xfrSchdL2.addBooleanColumn("xfr_inst_flg");
				xfrSchdL2.addStringColumn("xfr_alloc_sts_typ");
				xfrSchdL2.addBooleanColumn("xfr_alloc_sts_cmpl_flg");
				xfrSchdL2.addStringColumn("pr_sts_typ");
				xfrSchdL2.addStringColumn("xfr_alloc_sts_no");
				
				MCList<MST_XFR_SCHD_R> tmpXfrSchdL = xfrSchdL2.clone();
				// 移動
				MST_XFR_SCHD_R t4 = MST_XFR_SCHD_R.create("T");
				MCQueryApiBuilder xfrSchdL2_bldr4 = MCQueryApiBuilder.create(t4);
				MST_XFR_ALLOC_STS_R xfr2 = MST_XFR_ALLOC_STS_R.create("T2");
				xfrSchdL2_bldr4.setSelect(t4.xfr_src_no);
				xfrSchdL2_bldr4.addSelect(xfr2.xfr_alloc_sts_no);
				xfrSchdL2_bldr4.addSelect(t4.gi_lg_grp_cd);
				xfrSchdL2_bldr4.addSelect(t4.gr_lg_grp_cd);
				xfrSchdL2_bldr4.addSelect(nvl( xfr2.cmpl_flg, value(false)).as("xfr_alloc_sts_cmpl_flg"));
				xfrSchdL2_bldr4.addSelect(xfr2.pr_sts_typ);
				xfrSchdL2_bldr4.setWhere(t4.xfr_src_typ.eq(bind("1")), MSC_XFR_SRC_TYP.WG_RQST.value());
				xfrSchdL2_bldr4.addWhereWithAnd(t4.xfr_src_no.eq(bind("wg_rqst_prms_no")));
				xfrSchdL2_bldr4.addWhereWithAnd(t4.gi_lg_grp_cd.eq(t4.gr_lg_grp_cd));
				xfrSchdL2_bldr4.addLeftOuterJoin(xfr2, bracket( xfr2.xfr_schd_no.eq(t4.xfr_schd_no)));
				dbSelect("MSBAL5100_MST_XFR_SCHD_S02", xfrSchdL2, xfrSchdL2_bldr4, xfrBindL);
	
				if (!xfrSchdL2.isEmpty()) {
					// ベース
					MCGroupByPolicy baseGbp = new MCGroupByPolicy(MST_XFR_SCHD_R.$xfr_src_no, MST_XFR_SCHD_R.$gi_lg_grp_cd, MST_XFR_SCHD_R.$gr_lg_grp_cd);
					tmpXfrSchdL.setAll(xfrSchdL2.groupBy(baseGbp));
	
					MCList<MST_XFR_SCHD_R> grpL1 = xfrSchdL2.groupBy(MST_XFR_SCHD_R.$xfr_src_no, "xfr_alloc_sts_cmpl_flg");
					MCList<MST_XFR_SCHD_R> grpL2 = xfrSchdL2.groupBy(MST_XFR_SCHD_R.$xfr_src_no, "pr_sts_typ");
					MCIndexKey grpL1Key = grpL1.createIndex(MST_XFR_SCHD_R.$xfr_src_no,	"xfr_alloc_sts_cmpl_flg");
					MCIndexKey grpL2Key = grpL2.createIndex(MST_XFR_SCHD_R.$xfr_src_no,	"pr_sts_typ");
					for (MST_XFR_SCHD_R r : tmpXfrSchdL) {
						//  移動移送予定に紐づく移動引当状況で完了したデータがある場合、次処理済
						if (!isNull(grpL1.getFirst(grpL1Key, r.xfr_src_no(), true))) {
							r.setBooleanNE("xfr_inst_flg", true);
						}
						// 移動移送予定に紐づく移動引当状況に未指図以外（指図済・一部完了・完了）のレコードが存在する場合は、処理
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

			MCIndexKey xfrSchdKey = xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_src_no);
			
			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t5 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder wgRqstL_bldr5 = MCQueryApiBuilder.create(t5);
			wgRqstL_bldr5.setWhere(t5.wg_rqst_no.eq(bind("wg_rqst_no")));
			wgRqstL_bldr5.setOrderByAsc(wgRqstL_bldr5.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBAL5100_MST_WG_RQST_S01", wgRqstL, wgRqstL_bldr5, bindL);
			MCIndexKey wgRqstKey = wgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_no, MST_WG_RQST_R.$can_flg);

			for(WgRqst_Chk01_DtlR r : up0()) {
				for(MST_WG_RQST_PRMS_R wgRqstPrmsR : wgRqstPrmsL.subList(idxkey, r.wg_rqst_no(), true)) {
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
						// 発注予定登録サービスのマッピング
						if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(wgRqstKey, r.wg_rqst_no(), false);
							MST_PO_SCHD_R poSchdR = poSchdL.getFirst(poSchdKey, wgRqstPrmsR.wg_rqst_prms_no());

							// 発注予定が次処理済の場合は、自動回答対象外
							if(isNextOprPoSchd(poSchdR)) {
								r.auto_prms_flg(false);
							}
							
							// 自動回答で、一部指図・発注済、指図・発注済、完了でない場合
							if (r.auto_prms_flg()
									&& !cannotAutoPrms(wgRqstR.wg_rqst_sts_typ(), wgRqstR.wg_rqst_typ(),  false)) {
								// 削除でチェックする。
								PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
								copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR());
								poSchdUpd01DtlR.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.RQST.value());
								poSchdUpd01DtlR.po_schd_src_no(wgRqstPrmsR.wg_rqst_prms_no());
								poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								_poSchdChk01.up0().add(poSchdUpd01DtlR);
							}
							// 自動回答でない場合
							else {
								// 依頼内容が変更されている場合は、削除・新規でチェックする。
								if(mainColChg(wgRqstR, r)) {
									PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
									copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR());
									poSchdUpd01DtlR.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.RQST.value());
									poSchdUpd01DtlR.po_schd_src_no(wgRqstPrmsR.wg_rqst_prms_no());
									poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
									_poSchdChk01.up0().add(poSchdUpd01DtlR);

									poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
									copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR());
									poSchdUpd01DtlR.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.RQST.value());
									poSchdUpd01DtlR.po_schd_src_no(wgRqstPrmsR.wg_rqst_prms_no());
									poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
									_poSchdChk01.up0().add(poSchdUpd01DtlR);
								}
								else {
									PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
									copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR());
									poSchdUpd01DtlR.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.RQST.value());
									poSchdUpd01DtlR.po_schd_src_no(wgRqstPrmsR.wg_rqst_prms_no());
									// 打切の場合は削除
									if(r.abort_flg()) {
										poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
										_poSchdChk01.up0().add(poSchdUpd01DtlR);
									}
									// 打切取消の場合は新規
									else if(r.abort_can_flg()) {
										poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
										_poSchdChk01.up0().add(poSchdUpd01DtlR);
									}
									else {
										_poSchdChk01.up0().add(poSchdUpd01DtlR);
									}
								}								
							}
						}
						// 更新以外の場合
						else {
							PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
							copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR());
							poSchdUpd01DtlR.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.RQST.value());
							poSchdUpd01DtlR.po_schd_src_no(wgRqstPrmsR.wg_rqst_prms_no());
							_poSchdChk01.up0().add(poSchdUpd01DtlR);
						}
					}
					// 移送依頼の場合
					else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
						if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(wgRqstKey, r.wg_rqst_no(), false);
							MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(xfrSchdKey, wgRqstPrmsR.wg_rqst_prms_no());

							// 移動・移送予定が次処理済の場合は、自動回答対象外
							if(isNextOprXfrSchd(xfrSchdR)) {
								r.auto_prms_flg(false);
							}

							// 自動回答で、一部指図・発注済、指図・発注済、完了でない場合
							if (r.auto_prms_flg()
									&& !cannotAutoPrms(wgRqstR.wg_rqst_sts_typ(), wgRqstR.wg_rqst_typ(), false)) {
								// 削除でチェックする。
								XfrSchdChk04_DtlR xfrSchdChk04DtlR = XfrSchdChk04_DtlR.create();
								copy(xfrSchdChk04DtlR, r, createMap_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR());
								xfrSchdChk04DtlR.xfr_src_typ(MSC_XFR_SRC_TYP.WG_RQST.value());
								xfrSchdChk04DtlR.xfr_src_no(wgRqstPrmsR.wg_rqst_prms_no());
								xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								_xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
							}
							// 自動回答でない場合
							else {
								// 依頼内容が変更されている場合は、削除・新規でチェックする。
								if(mainColChg(wgRqstR, r)) {
									XfrSchdChk04_DtlR xfrSchdChk04DtlR = XfrSchdChk04_DtlR.create();
									copy(xfrSchdChk04DtlR, r, createMap_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR());
									xfrSchdChk04DtlR.xfr_src_typ(MSC_XFR_SRC_TYP.WG_RQST.value());
									xfrSchdChk04DtlR.xfr_src_no(wgRqstPrmsR.wg_rqst_prms_no());
									xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
									_xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
									
									xfrSchdChk04DtlR = xfrSchdChk04DtlR.clone();
									xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
									_xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
								}
								else {
									XfrSchdChk04_DtlR xfrSchdChk04DtlR = XfrSchdChk04_DtlR.create();
									copy(xfrSchdChk04DtlR, r, createMap_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR());
									xfrSchdChk04DtlR.xfr_src_typ(MSC_XFR_SRC_TYP.WG_RQST.value());
									xfrSchdChk04DtlR.xfr_src_no(wgRqstPrmsR.wg_rqst_prms_no());

									// 打切の場合、回答、先の予定を削除
									if(r.abort_flg()) {
										xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
										_xfrSchdChk04.up0().add(xfrSchdChk04DtlR);

										xfrSchdChk04DtlR = xfrSchdChk04DtlR.clone();
										xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
										_xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
									}
									// 打切取消の場合、回答の論理削除復活
									else if(r.abort_can_flg()) {
										xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
										_xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
									}
									else {
										xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
										_xfrSchdChk04.up0().add(xfrSchdChk04DtlR);

										xfrSchdChk04DtlR = xfrSchdChk04DtlR.clone();
										xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
										xfrSchdChk04DtlR.gr_rqst_tm(wgRqstPrmsR.gr_schd_tm());
										xfrSchdChk04DtlR.gi_rqst_tm(wgRqstPrmsR.gi_rqst_tm());

										_xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
									}
								}						
							}
						}
						else if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							XfrSchdChk04_DtlR xfrSchdChk04DtlR = XfrSchdChk04_DtlR.create();
							copy(xfrSchdChk04DtlR, r, createMap_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR());
							xfrSchdChk04DtlR.xfr_src_typ(MSC_XFR_SRC_TYP.WG_RQST.value());
							xfrSchdChk04DtlR.xfr_src_no(wgRqstPrmsR.wg_rqst_prms_no());
							_xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
						}
					}
				}
				
				// 自動回答かつ、新規または更新の場合は依頼内容で回答を新規として連携する
				if(r.auto_prms_flg() && (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()))) {
					// 一部指図・発注済、指図・発注済、完了でない場合のみ対象
					MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(wgRqstKey, r.wg_rqst_no(), false);
					if(isNull(wgRqstR) || (!MSC_WG_RQST_STS_TYP.isCMPL(wgRqstR.wg_rqst_sts_typ()) && !MSC_WG_RQST_STS_TYP.isPART_INST(wgRqstR.wg_rqst_sts_typ()) && !MSC_WG_RQST_STS_TYP.isINST(wgRqstR.wg_rqst_sts_typ()))) {
						// 購買依頼の場合
						if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
							PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
							copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR());
							poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							_poSchdChk01.up0().add(poSchdUpd01DtlR);
						}
						// 移送依頼の場合
						else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
							XfrSchdChk04_DtlR xfrSchdChk04DtlR = XfrSchdChk04_DtlR.create();
							copy(xfrSchdChk04DtlR, r, createMap_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR());
							xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							_xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
						}
					}
				}
			}
			
			// 諸口品登録サービスのチェックを実行
			if (!sundryItmChk01.up0().isEmpty()) {
				sundryItmChk01.exec();
				
				copyErrFlg(up0(), sundryItmChk01.down0());
			}
			
			MCIndexKey up0Key = up0().createIndex(WgRqst_Chk01_DtlR.$peg_no, WgRqst_Chk01_DtlR.$wg_rqst_typ);

			MCNumber pegNo = nvl(up1().start_peg_no(), MCNumber.ZERO);

			if (!_poSchdChk01.up0().isEmpty()) {
				for(PoSchd_Upd01_DtlR poSchdChk01DtlR : _poSchdChk01.up0()) {
					getPegNoMapForPoSchd().put(pegNo, poSchdChk01DtlR.peg_no());
					getPegNoMapByWgRqstPrmsNo().put(nvl(poSchdChk01DtlR.po_schd_src_no(), MAC_STR.NULL_VAL.value()).concat(poSchdChk01DtlR.peg_no().toString()), pegNo);
					poSchdChk01DtlR.addNumberColumn("org_peg_no", poSchdChk01DtlR.peg_no());
					poSchdChk01DtlR.peg_no(pegNo);
					pegNo = pegNo.add(1);
				}
			}
			
			// 発注予定登録サービスの更新前チェックを実行
			// ＷＧ間依頼登録画面から実行した場合のみ
			if (!_poSchdChk01.up0().isEmpty() && up0().get(0).screen_crct_flg()) {
				MCMessageList tmpMsgL = (MCMessageList)MCMessagePool.getMessageList().clone();
				MCMessagePool.clear();
				
				_poSchdChk01.exec();
				
				nextChkMsgL.addAll(MCMessagePool.getMessageList());
				
				MCMessagePool.clear();
				MCMessagePool.addAll(tmpMsgL);

				// 一時的に発番した紐付けＮＯを元に上り電文を処理する
				for(PoSchd_Upd01_DtlR poSchdUpd01DtlR : _poSchdChk01.down0()) {
					MCNumber tmpPegNo = getPegNoMapForPoSchd().get(poSchdUpd01DtlR.peg_no());
					for(WgRqst_Chk01_DtlR up0 : up0().subList(up0Key, tmpPegNo, MSC_WG_RQST_TYP.PURC.value())) {
						if(poSchdUpd01DtlR.err_flg()) {
							up0.err_flg(poSchdUpd01DtlR.err_flg());
						}
						if(poSchdUpd01DtlR.po_flg()) {
							up0.inst_po_flg(poSchdUpd01DtlR.po_flg());
						}
						if(poSchdUpd01DtlR.act_flg()) {
							up0.act_flg(poSchdUpd01DtlR.act_flg());
						}
					}
				}
			}
			
			// 移動・移送予定サービスの補完をチェック用に実行
			if(!xfrSchdSprt01.up0().isEmpty()) {
				xfrSchdSprt01.exec();

				copyErrFlg(up0(), xfrSchdSprt01.down0());
			}
			
			if(!_xfrSchdChk04.up0().isEmpty()) {
				// 移動・移送予定サービスに紐付けＮＯを一意で連携するために元々の紐付けＮＯとのマッピングを保持する
				for(XfrSchdChk04_DtlR xfrSchdChk04DtlR : _xfrSchdChk04.up0()) {
					getPegNoMapForXfrSchd().put(pegNo, xfrSchdChk04DtlR.peg_no());
					getPegNoMapByWgRqstPrmsNo().put(nvl(xfrSchdChk04DtlR.xfr_src_no(), MAC_STR.NULL_VAL.value()).concat(xfrSchdChk04DtlR.peg_no().toString()), pegNo);
					xfrSchdChk04DtlR.addNumberColumn("org_peg_no", xfrSchdChk04DtlR.peg_no());
					xfrSchdChk04DtlR.peg_no(pegNo);
					pegNo = pegNo.add(1);
				}
			}
			
			// 移動・移送予定サービスのチェックを実行
			// ＷＧ間依頼登録画面から実行した場合のみ
			if(!_xfrSchdChk04.up0().isEmpty() && up0().get(0).screen_crct_flg()) {				
				MCMessageList tmpMsgL = (MCMessageList)MCMessagePool.getMessageList().clone();
				MCMessagePool.clear();

				_xfrSchdChk04.exec();

				nextChkMsgL.addAll(MCMessagePool.getMessageList());
				
				MCMessagePool.clear();
				MCMessagePool.addAll(tmpMsgL);

				// 一時的に発番した紐付けＮＯを元に上り電文を処理する
				for(XfrSchdChk04_DtlR xfrSchdChk04DtlR : _xfrSchdChk04.down0()) {
					if(xfrSchdChk04DtlR.err_flg()) {
						MCNumber tmpPegNo = getPegNoMapForXfrSchd().get(xfrSchdChk04DtlR.peg_no());
						for(WgRqst_Chk01_DtlR up0 : up0().subList(up0Key, tmpPegNo, MSC_WG_RQST_TYP.XFR.value())) {
							if(xfrSchdChk04DtlR.inst_flg()) {
								up0.inst_po_flg(xfrSchdChk04DtlR.inst_flg());
							}
							if(xfrSchdChk04DtlR.act_flg()) {
								up0.act_flg(xfrSchdChk04DtlR.act_flg());
							}
							if(!xfrSchdChk04DtlR.inst_flg() && !xfrSchdChk04DtlR.act_flg() && xfrSchdChk04DtlR.err_flg()) {
								up0.err_flg(xfrSchdChk04DtlR.err_flg());
								// 退避していたメッセージを格納
								for(MCMessage msgR : nextChkMsgL) {
									if(msgR.getCauseRow() == null
											|| isSame(msgR.getCauseRow().getParamRowIndex(), up0.getParamRowIndex())) {
										MCMessagePool.add(msgR);
									}
								}
							}
						}
					}
				}
			}
			
			// 次処理済がエラーとなるケースか判断
			for (WgRqst_Chk01_DtlR r : up0()) {
				if (!r.inst_po_flg() && !r.act_flg()) {
					continue;
				}
				if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// ＷＧ間依頼登録画面からの削除はエラー
					if(r.screen_crct_flg()) {
						r.err_flg(true);
					}
					// 品目オーダから作成された依頼の場合はエラー
					else if(!isNull(r.itm_ord_no())) {
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
					// ＷＧ間依頼登録画面からの変更はエラー
					if(r.screen_crct_flg()) {
						r.err_flg(true);
					}
					// 実績済での変更はエラー
					if(r.act_flg()) {
						r.err_flg(true);
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
			}
		}
		
		/**
		 * オーダ登録サービス予定日計算用のマスタ参照日付が取得出来るかチェック
		 */
		protected void chkOrdSprt03MstrDt() {
			MCList<MST_ITM_ORDER_R> itmOrdL = getItmOrdL(up0().innerRowList(WgRqst_Chk01_DtlR.$wg_rqst, MST_WG_RQST_R.class));
			MCIndexKey itmOrdKey = itmOrdL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (WgRqst_Chk01_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
					|| MSC_WG_RQST_TYP.isSHIP(r.wg_rqst_typ())
					|| MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					// 削除行・出荷依頼・移送依頼はチェックしない
					continue;
				}
				MST_ITM_ORDER_R itmOrdR = itmOrdL.getFirst(itmOrdKey, r.itm_ord_no());
				if (isCmplSchdDtByOrd(r.wg_rqst(), r.data_crud_typ(), itmOrdR)) {
					// オーダから予定日を補完するときはチェックしない
					continue;
				}
				
				WgRqst_Chk01_DtlR dtlR = r.clone();
				dtlR.wg_rqst().setNumberNE(WgRqst_Chk01_DtlR.$peg_no, dtlR.peg_no());
				dtlR.wg_rqst().setDateNE("avl_schd_dt", dtlR.getDateNE("avl_schd_dt"));
				
				MCDate dt = getMasterDate(dtlR.wg_rqst());
				if (isNull(dt)) {
					r.err_flg(true);
						MCMessagePool.add(
							new MCMessage(dtlR, null, MSBAL0101,
								toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
								dtlR.wg_rqst().gr_loc_wg_cd(),
								dtlR.sppl_cd(),
								dtlR.maker_cd(),
								dtlR.mfg_loc_cd(),
								dtlR.bom_ptn(),
								toYMDHMSString(dtlR.gr_rqst_tm()),
								toDispGUIIndex(dtlR))
						);
				}
			}
		}
		
		/**
		 * 前回の依頼内容と今回の依頼内容が変わっているか判断する
		 * @param wgRqstR 前回の依頼内容
		 * @param r　今回の回答内容
		 * @return boolean 変更があるかどうか
		 */
		protected boolean mainColChg(MST_WG_RQST_R wgRqstR, WgRqst_Chk01_DtlR r) {
			if(!isSame(r.itm_cd(), wgRqstR.itm_cd())
					|| !isSame(r.itm_sub1(), wgRqstR.itm_sub1())
					|| !isSame(r.itm_sub2(), wgRqstR.itm_sub2())
					|| !isSame(r.itm_sub3(), wgRqstR.itm_sub3())
					|| !isSame(r.itm_nm(), nvl(wgRqstR.itm_nm(), r.itm_nm()))
					|| !isSame(r.iv_itm_nm(), wgRqstR.iv_itm_nm())
					|| !isSame(r.sno1(), wgRqstR.sno1())
					|| !isSame(r.sno1_null_flg(), wgRqstR.sno1_null_flg())
					|| !isSame(r.sno2(), wgRqstR.sno2())
					|| !isSame(r.sno2_null_flg(), wgRqstR.sno2_null_flg())
					|| !isSame(r.sno3(), wgRqstR.sno3())
					|| !isSame(r.sno3_null_flg(), wgRqstR.sno3_null_flg())
					|| !isSame(r.sno4(), wgRqstR.sno4())
					|| !isSame(r.sno4_null_flg(), wgRqstR.sno4_null_flg())
					|| !isSame(r.rqst_fr_wg_cd(), wgRqstR.rqst_fr_wg_cd())
					|| !isSame(r.rqst_to_wg_cd(), wgRqstR.rqst_to_wg_cd())
					|| !isSame(r.gr_loc_cd(), wgRqstR.gr_loc_cd())
					|| !isSame(nvl(r.gr_str_ln_cd(), MAC_STR.NULL_VAL.value()), wgRqstR.gr_str_ln_cd())
					|| !isSame(nvl(r.gi_loc_cd(), MAC_STR.NULL_VAL.value()), wgRqstR.gi_loc_cd())
					|| !isSame(nvl(r.gi_str_ln_cd(), MAC_STR.NULL_VAL.value()), wgRqstR.gi_str_ln_cd())
					|| !isSame(nvl(r.sppl_cd(), MAC_STR.NULL_VAL.value()), wgRqstR.sppl_cd())
					|| !isSame(nvl(r.maker_cd(), MAC_STR.NULL_VAL.value()), wgRqstR.maker_cd())
					|| !isSame(nvl(r.mfg_loc_cd(), MAC_STR.NULL_VAL.value()), wgRqstR.mfg_loc_cd())
					|| !isSame(nvl(r.bom_ptn(), MAC_STR.NULL_VAL.value()), wgRqstR.bom_ptn())
			) {
				return true;
			}			
			return false;
		}
				
		protected Map_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR<PoSchd_Upd01_DtlR, WgRqst_Chk01_DtlR> _map_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR = null;
		protected Map_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR<PoSchd_Upd01_DtlR,WgRqst_Chk01_DtlR> createMap_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR() {
			if (_map_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR == null) {
				_map_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR = new Map_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR<PoSchd_Upd01_DtlR, WgRqst_Chk01_DtlR>();
			}
			return _map_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR;
		}
		public class Map_PoSchd_Upd01_DtlR_WgRqst_Chk01_DtlR<D extends PoSchd_Upd01_DtlR, S extends WgRqst_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSchd_Upd01_DtlR.$peg_no, WgRqst_Chk01_DtlR.$peg_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$data_crud_typ, WgRqst_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_cd, WgRqst_Chk01_DtlR.$itm_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub1, WgRqst_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub2, WgRqst_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(PoSchd_Upd01_DtlR.$itm_sub3, WgRqst_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(PoSchd_Upd01_DtlR.$trd_cd, WgRqst_Upd01_DtlR.$trd_cd);
				addColumnPathMap(PoSchd_Upd01_DtlR.$trd_ptn_typ, WgRqst_Upd01_DtlR.$trd_ptn_typ);
			}
		}

		protected Map_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR<XfrSchdChk04_DtlR, WgRqst_Chk01_DtlR> _map_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR = null;
		protected Map_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR<XfrSchdChk04_DtlR,WgRqst_Chk01_DtlR> createMap_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR() {
			if (_map_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR == null) {
				_map_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR = new Map_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR<XfrSchdChk04_DtlR, WgRqst_Chk01_DtlR>();
			}
			return _map_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR;
		}

		public class Map_XfrSchdChk04_DtlR_WgRqst_Chk01_DtlR<D extends XfrSchdChk04_DtlR, S extends WgRqst_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, WgRqst_Chk01_DtlR.$peg_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$data_crud_typ, WgRqst_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_loc_cd, WgRqst_Chk01_DtlR.$gi_loc_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_loc_cd, WgRqst_Chk01_DtlR.$gr_loc_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_cd, WgRqst_Chk01_DtlR.$itm_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub1, WgRqst_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub2, WgRqst_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub3, WgRqst_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_rqst_tm, WgRqst_Chk01_DtlR.$gi_rqst_tm);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_rqst_tm, WgRqst_Chk01_DtlR.$gr_rqst_tm);
			}
		}
		
		protected Map_SundryItm_Chk01_DtlR_WgRqst_Chk01_DtlR<SundryItm_Chk01_DtlR, WgRqst_Chk01_DtlR> _map_SundryItm_Chk01_DtlR_WgRqst_Chk01_DtlR = null;
		protected Map_SundryItm_Chk01_DtlR_WgRqst_Chk01_DtlR<SundryItm_Chk01_DtlR,WgRqst_Chk01_DtlR> createMap_SundryItm_Chk01_DtlR_WgRqst_Chk01_DtlR() {
			if (_map_SundryItm_Chk01_DtlR_WgRqst_Chk01_DtlR == null) {
				_map_SundryItm_Chk01_DtlR_WgRqst_Chk01_DtlR = new Map_SundryItm_Chk01_DtlR_WgRqst_Chk01_DtlR<SundryItm_Chk01_DtlR, WgRqst_Chk01_DtlR>();
			}
			return _map_SundryItm_Chk01_DtlR_WgRqst_Chk01_DtlR;
		}

		public class Map_SundryItm_Chk01_DtlR_WgRqst_Chk01_DtlR<D extends SundryItm_Chk01_DtlR, S extends WgRqst_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SundryItm_Chk01_DtlR.$peg_no, WgRqst_Chk01_DtlR.$peg_no);
				addColumnPathMap(SundryItm_Chk01_DtlR.$data_crud_typ, WgRqst_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(SundryItm_Chk01_DtlR.$itm_cd, WgRqst_Chk01_DtlR.$itm_cd);
				addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub1, WgRqst_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub2, WgRqst_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub3, WgRqst_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(SundryItm_Chk01_DtlR.$sno1, WgRqst_Chk01_DtlR.$sno1);
				addColumnPathMap(SundryItm_Chk01_DtlR.$sno2, WgRqst_Chk01_DtlR.$sno2);
				addColumnPathMap(SundryItm_Chk01_DtlR.$sno3, WgRqst_Chk01_DtlR.$sno3);
				addColumnPathMap(SundryItm_Chk01_DtlR.$sno4, WgRqst_Chk01_DtlR.$sno4);
				addColumnPathMap(SundryItm_Chk01_DtlR.$itm_nm, WgRqst_Chk01_DtlR.$itm_nm);
			}
		}
		
		protected Map_XfrSchdEx_DtlR_WgRqst_Chk01_DtlR<XfrSchdEx_DtlR, WgRqst_Chk01_DtlR> _map_XfrSchdEx_DtlR_WgRqst_Chk01_DtlR = null;
		protected Map_XfrSchdEx_DtlR_WgRqst_Chk01_DtlR<XfrSchdEx_DtlR,WgRqst_Chk01_DtlR> createMap_XfrSchdEx_DtlR_WgRqst_Chk01_DtlR() {
			if (_map_XfrSchdEx_DtlR_WgRqst_Chk01_DtlR == null) {
				_map_XfrSchdEx_DtlR_WgRqst_Chk01_DtlR = new Map_XfrSchdEx_DtlR_WgRqst_Chk01_DtlR<XfrSchdEx_DtlR, WgRqst_Chk01_DtlR>();
			}
			return _map_XfrSchdEx_DtlR_WgRqst_Chk01_DtlR;
		}

		public class Map_XfrSchdEx_DtlR_WgRqst_Chk01_DtlR<D extends XfrSchdEx_DtlR, S extends WgRqst_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdEx_DtlR.$peg_no, WgRqst_Chk01_DtlR.$peg_no);
				addColumnPathMap(XfrSchdEx_DtlR.$gi_loc_cd, WgRqst_Chk01_DtlR.$gi_loc_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$gr_loc_cd, WgRqst_Chk01_DtlR.$gr_loc_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_cd, WgRqst_Chk01_DtlR.$itm_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_sub1, WgRqst_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_sub2, WgRqst_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_sub3, WgRqst_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(XfrSchdEx_DtlR.$gi_schd_dt, WgRqst_Chk01_DtlR.$gi_rqst_tm);
				addColumnPathMap(XfrSchdEx_DtlR.$gr_schd_dt, WgRqst_Chk01_DtlR.$gr_rqst_tm);
			}
		}
	}

	/**
	 * WgRqst_Upd01オペレーション.<p>
	 * ＜ＷＧ間依頼の登録、更新、削除＞
	 */
	public class WgRqst_Upd01 extends MSBAL_WgRqstService_MC_A.WgRqst_Upd01 {
		MCList<MST_WG_RQST_R> _insL = MCList.create(MST_WG_RQST_R.class);
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			setWgRqstNo();
			sprtMst();
						
			// オーダ登録サービスの日付計算を実行
			callOrdSprt03();
			
			// ＷＧ間依頼を登録・更新
			updWgRqst();
			
			// 受注状況更新サービスを実行
			callSloStsReg();
			
			// 当サービスのＷＧ間依頼回答更新を実行
			updWgRqstPrms();
			
			// ＷＧ間依頼の依頼残数量を算出
			setNotCmplQty();
			
			// 受払予定などを登録・削除
			updSchd();
			
			// ＷＧ間依頼を更新・削除
			updDelWgRqst();
			
			// 下り電文を設定
			down0().setAll(up0());
		}
		
		/**
		 * ＷＧ間依頼種類区分、ＷＧ間依頼作成元区分、ＷＧ間依頼元識別ＮＯを元に、キャッシュした情報よりＷＧ間依頼ＮＯを補完する。
		 */
		protected void setWgRqstNo() {
			for(WgRqst_Upd01_DtlR r : up0()) {
				// 新規の場合以外はＷＧ間依頼種類区分、ＷＧ間依頼作成元区分、ＷＧ間依頼元識別ＮＯを元に、ＷＧ間依頼ＮＯを取得する。
				if(!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					if(isNull(r.wg_rqst_no())) {
						MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), r.data_crud_typ());
						if(!isNull(wgRqstR)) {
							r.wg_rqst_no(wgRqstR.wg_rqst_no());
							r.wg_rqst_sts_typ(wgRqstR.wg_rqst_sts_typ());
							r.io_schd_pr_no(wgRqstR.io_schd_pr_no());
						}
					}
				}
			}
			
			// ＷＧ間依頼ＮＯ、受払進捗管理ＮＯを発番
			MCList<MST_WG_RQST_R> insL = MCList.create(MST_WG_RQST_R.class);
			for(WgRqst_Upd01_DtlR r : up0().subList(WgRqst_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value())) {
				insL.add(r.wg_rqst());
			}

			if(!insL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.WGRQST, insL.size());
	
				MCList<MST_WG_RQST_R> tmpL = MCList.create(MST_WG_RQST_R.class);
				for(MST_WG_RQST_R r : insL) {
					// 購買依頼、移送依頼で、受払進捗管理ＮＯがないものは発番する。
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
						if(isNull(r.io_schd_pr_no())) {
							tmpL.add(r);
						}
					}
				}
				doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, tmpL.size());
				for(WgRqst_Upd01_DtlR r : up0()) {
					if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						r.wg_rqst_no(getStrSeq(MSC_NUM_SYS_TYP.WGRQST));
						// ＷＧ間依頼登録、発注点在庫補充から作成された依頼の場合、依頼元ＮＯにＷＧ間依頼ＮＯを設定
						if(MSC_WG_RQST_SRC_TYP.isMNL(r.wg_rqst_src_typ()) || MSC_WG_RQST_SRC_TYP.isOP_RPL(r.wg_rqst_src_typ())) {
							r.wg_rqst_src_no(r.wg_rqst_no());
						}
						
						// 購買依頼、移送依頼で、受払進捗管理ＮＯがないものは発番する。
						if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
							if(isNull(r.io_schd_pr_no())) {
								r.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
							}
						}
					}
				}
			}
		}
		
		/**
		 * 関連するマスタを補完
		 */
		protected void sprtMst() {
			// 入庫場所に対する場所マスタを取得
			MCList<MAM_LOC_R> grLocL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t1 = MAM_LOC_R.create("T");
			MCQueryApiBuilder grLocL_bldr1 = MCQueryApiBuilder.create(t1);
			grLocL_bldr1.setSelect(t1.loc_cd);
			grLocL_bldr1.addSelect(t1.wg_cd);
			grLocL_bldr1.addSelect(t1.lg_grp_cd);
			grLocL_bldr1.setWhere(t1.loc_cd.eq(bind("gr_loc_cd")));
			dbSelect("MSBAL5100_MAM_LOC_S01", grLocL, grLocL_bldr1, up0().groupBy(WgRqst_Upd01_DtlR.$gr_loc_cd));
			MCIndexKey grLocKey = grLocL.createIndex(MAM_LOC_R.$loc_cd);

			// 出庫場所に対する場所マスタを取得
			MCList<MAM_LOC_R> giLocL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t2 = MAM_LOC_R.create("T");
			MCQueryApiBuilder giLocL_bldr2 = MCQueryApiBuilder.create(t2);
			giLocL_bldr2.setSelect(t2.loc_cd);
			giLocL_bldr2.addSelect(t2.wg_cd);
			giLocL_bldr2.addSelect(t2.lg_grp_cd);
			giLocL_bldr2.setWhere(t2.loc_cd.eq(bind("gi_loc_cd")));
			dbSelect("MSBAL5100_MAM_LOC_S02", giLocL, giLocL_bldr2, up0().groupBy(WgRqst_Upd01_DtlR.$gi_loc_cd));
			MCIndexKey giLocKey = giLocL.createIndex(MAM_LOC_R.$loc_cd);
			
			for(WgRqst_Upd01_DtlR r : up0()) {
				// 品目マスタの情報を補完
				MAM_ITM_R itmR = getItmR(r.wg_rqst());
				if(!isNull(itmR)) {
					r.sundry_itm_flg(itmR.sundry_itm_flg());
					
					if (isNull(r.lot_no())
							&& MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
						r.lot_no(MAC_STR.NULL_VAL.value());
					}
					if (isNull(r.sublot_no())
							&& MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
						r.sublot_no(MAC_STR.NULL_VAL.value());
					}
				}
				
				// 諸口品以外は品名をクリアする
				if(!r.sundry_itm_flg()) {
					r.itm_nm(null);
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
				
				if(isNull(r.gr_str_ln_cd())) {
					r.gr_str_ln_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.mfg_loc_cd())) {
					r.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.bom_ptn())) {
					r.bom_ptn(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.sppl_cd())) {
					r.sppl_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.maker_cd())) {
					r.maker_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.gi_loc_cd())) {
					r.gi_loc_cd(MAC_STR.NULL_VAL.value());
				}				
				if(isNull(r.gi_str_ln_cd())) {
					r.gi_str_ln_cd(MAC_STR.NULL_VAL.value());
				}

				// 自動回答ＦＬＧを設定
				MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), r.data_crud_typ());
				// 自動回答できない場合は自動回答ＦＬＧはオフ
				if (!isNull(wgRqstR)
						&& cannotAutoPrms(wgRqstR.wg_rqst_sts_typ(), r.wg_rqst_typ(), wgRqstR.man_prms_flg())) {
					r.auto_prms_flg(false);
				}
				else {
					if (r.auto_prms_tgt_flg()) {
						r.auto_prms_flg(true);
					}
					else {
						r.auto_prms_flg(getWgRqstCtlR(r.rqst_to_wg_cd(), r.rqst_fr_wg_cd(),
								r.wg_rqst_typ(), r.rqst_fr_dpt_cd(), r.cst_cd(), r.itm_cd(),
								r.itm_sub1(), r.itm_sub2(), r.itm_sub3()));
					}
				}
			}
		}
		
		/**
		 * ＷＧ間依頼を登録する(新規・更新)
		 */
		protected void updWgRqst() {
			MCList<MST_WG_RQST_R> dbInsL = MCList.create(MST_WG_RQST_R.class);
			MCList<MST_WG_RQST_R> dbUpdL = MCList.create(MST_WG_RQST_R.class);
			
			for(WgRqst_Upd01_DtlR r : up0()) {
				if(isNull(r.gi_rqst_tm())) {
					r.gi_rqst_tm(r.gi_schd_dt());
				}

				MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), r.data_crud_typ());

				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.wg_rqst_sts_typ(MSC_WG_RQST_STS_TYP.RQST.value());
					r.not_cmpl_qty(r.base_unit_qty());
					dbInsL.add(r.wg_rqst());
					if(!r.auto_prms_flg()) {
						_insL.add(r.wg_rqst());
					}
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (!isReRqstCng(wgRqstR, r)) {
						r.wg_rqst().rqst_crrct_flg(true);
						r.wg_rqst().rqst_crrct_dt(getToday());
					}
					if (wgRqstR.rqst_crrct_flg()) {
						if (!isReRqstCng2(wgRqstR, r)) {
							r.wg_rqst().rqst_crrct_flg(true);
							r.wg_rqst().rqst_crrct_dt(getToday());
						}
					}
					// 一時的に
					r.not_cmpl_qty(r.base_unit_qty());
					dbUpdL.add(r.wg_rqst());
				}
			}
			insWgRqst(dbInsL);

			if(!dbUpdL.isEmpty()) {
				MST_WG_RQST_R t1 = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder dbUpdL_bldr1 = MCQueryApiBuilder.create(t1);
				editUpdSetStmt(dbUpdL, t1, dbUpdL_bldr1);
				dbUpdL_bldr1.removeSet(MST_WG_RQST_R.$not_cmpl_qty, MST_WG_RQST_R.$re_prms_ntc_flg, MST_WG_RQST_R.$re_prms_dt);
				dbUpdateKey("MSBAL5100_MST_WG_RQST_U01", dbUpdL, dbUpdL_bldr1);
			}
		}
		
		/**
		 * 受注状況更新サービスを実行
		 */
		protected void callSloStsReg() {
			MSBBL_SloStsRegService.SloSts_Ins01 sloStsIns01 = MSBBL_SloStsRegService.crtSloSts_Ins01(); 
			
			for(WgRqst_Upd01_DtlR r : up0()) {
				if (MSC_WG_RQST_SRC_TYP.isSLO(r.wg_rqst_src_typ())
						|| MSC_WG_RQST_SRC_TYP.isSHIP(r.wg_rqst_src_typ())) {
					// 受注状況更新サービスの上り電文を設定
					SloSts_DtlR sloStsDtlR = SloSts_DtlR.create();
					copy(sloStsDtlR, r, createMap_SloSts_DtlR_WgRqst_Upd01_DtlR());
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
						if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
							sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST.value());
						}
						else if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							if(r.abort_flg()) {
								MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), r.data_crud_typ());
								// 回答通知済の場合は、回答取消も書き込む
								if (!isNull(wgRqstR) && wgRqstR.prms_ntc_flg()) {
									sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST_PRMS_CAN.value());
									sloStsIns01.up0().add(sloStsDtlR);
									sloStsDtlR = sloStsDtlR.clone();
								}
								sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST_CAN.value());
							}
							else if(r.abort_can_flg()) {
								sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST.value());
							}
							else {
								sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST_UPD.value());
							}
						}
						else {
							MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), r.data_crud_typ());
							// 回答通知済の場合は、回答取消も書き込む
							if (!isNull(wgRqstR) && wgRqstR.prms_ntc_flg()) {
								sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST_PRMS_CAN.value());
								sloStsIns01.up0().add(sloStsDtlR);
								sloStsDtlR = sloStsDtlR.clone();
							}
							sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST_CAN.value());
						}
					}
					// 出荷依頼の場合
					else {
						// 受注状況更新サービスの上り電文を設定
						if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
							sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_RQST.value());
						}
						else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_RQST_UPD.value());
						}
						else {
							MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), r.data_crud_typ());
							// 回答通知済の場合は、回答取消も書き込む
							if (!isNull(wgRqstR) && wgRqstR.prms_ntc_flg()) {
								sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_RQST_PRMS_CAN.value());
								sloStsIns01.up0().add(sloStsDtlR);
								sloStsDtlR = sloStsDtlR.clone();
							}
							sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_RQST_CAN.value());
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
		 * ＷＧ間依頼回答、発注予定、移動・移送予定を更新・削除する。
		 */
		protected void updWgRqstPrms() {
			MSBAL_WgRqstService.WgRqst_Upd02 wgRqstUpd02 = MSBAL_WgRqstService.crtWgRqst_Upd02();

			// 回答だけ作成されている場合
			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MST_WG_RQST_PRMS_R t1 = MST_WG_RQST_PRMS_R.create("T");
			MCQueryApiBuilder wgRqstPrmsL_bldr1 = MCQueryApiBuilder.create(t1);
			wgRqstPrmsL_bldr1.setWhere(t1.wg_rqst_no.eq(bind("wg_rqst_no")));
			dbSelectForUpdate("MSBAL5100_MST_WG_RQST_PRMS_S02", wgRqstPrmsL, wgRqstPrmsL_bldr1, up0());
			
			MCIndexKey key1 = wgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no, MST_WG_RQST_PRMS_R.$fix_flg);

			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t2 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder wgRqstL_bldr2 = MCQueryApiBuilder.create(t2);
			wgRqstL_bldr2.setWhere(t2.wg_rqst_no.eq(bind("wg_rqst_no")));
			dbSelectForUpdate("MSBAL5100_MST_WG_RQST_S02", wgRqstL, wgRqstL_bldr2,
					wgRqstPrmsL.subList(MST_WG_RQST_PRMS_R.$fix_flg, true).groupBy(MST_WG_RQST_PRMS_R.$wg_rqst_no));

			MCList<MST_WG_RQST_R> wgRqstForAutoPrmsL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t3 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder wgRqstForAutoPrmsL_bldr3 = MCQueryApiBuilder.create(t3);
			wgRqstForAutoPrmsL_bldr3.setWhere(t3.wg_rqst_no.eq(bind("wg_rqst_no")));
			dbSelectForUpdate("MSBAL5100_MST_WG_RQST_S03", wgRqstForAutoPrmsL, wgRqstForAutoPrmsL_bldr3, up0());
			MCIndexKey key4 = wgRqstForAutoPrmsL.createIndex(MST_WG_RQST_R.$wg_rqst_no);

			// 各予定の状況を取得する。
			MCList<MST_WG_RQST_PRMS_R> purcBindL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MCList<MST_WG_RQST_PRMS_R> xfrBindL = MCList.create(MST_WG_RQST_PRMS_R.class);

			MCIndexKey tmpKey = up0().createIndex(WgRqst_Upd01_DtlR.$wg_rqst_no);
			for(MST_WG_RQST_PRMS_R wgRqstPrmsR : wgRqstPrmsL.subList(MST_WG_RQST_PRMS_R.$fix_flg, true)) {
				WgRqst_Upd01_DtlR r = up0().getFirst(tmpKey, wgRqstPrmsR.wg_rqst_no());
				MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), MAC_DATA_CRUD_TYP.UPD.value());

				if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ())) {
					purcBindL.add(wgRqstPrmsR);
				}
				else if(MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
					xfrBindL.add(wgRqstPrmsR);
				}
			}

			// 発注予定の状況を取得
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			if(!purcBindL.isEmpty()) {
				purcBindL.sort(MST_WG_RQST_PRMS_R.$wg_rqst_prms_no);
				MST_PO_SCHD_R t4 = MST_PO_SCHD_R.create("T");
				MCQueryApiBuilder poSchdL_bldr4 = MCQueryApiBuilder.create(t4);
				MST_ITM_MFG_INST_R itm = MST_ITM_MFG_INST_R.create("T2");
				poSchdL_bldr4.setSelect(t4.po_flg);
				poSchdL_bldr4.addSelect(t4.rqst_upd_stop_flg);
				poSchdL_bldr4.addSelect(t4.can_flg);
				poSchdL_bldr4.addSelect(t4.abort_flg);
				poSchdL_bldr4.addSelect(t4.outsrc_itm_ord_no);
				poSchdL_bldr4.addSelect(itm.itm_mfg_inst_no);
				poSchdL_bldr4.addSelect(t4.po_schd_src_typ);
				poSchdL_bldr4.addSelect(t4.po_schd_src_no);
				poSchdL_bldr4.addLeftOuterJoin(itm, bracket( itm.itm_ord_no.eq(t4.outsrc_itm_ord_no)
						.and(itm.can_flg.eq(value(false)))));
				poSchdL_bldr4.setWhere(t4.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.RQST.value())));
				poSchdL_bldr4.addWhereWithAnd(t4.po_schd_src_no.eq(bind("wg_rqst_prms_no")));
				poSchdL_bldr4.addWhereWithAnd(t4.rqst_can_flg.eq(value(false)));
				poSchdL_bldr4.addWhereWithAnd(t4.split_src_schd_no.isNull());
				dbSelect("MSBAL5100_MST_PO_SCHD_S02", poSchdL, poSchdL_bldr4, purcBindL);
			}
			MCIndexKey poSchdKey = poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_src_no);

			// 移動・移送予定の状況を取得
			MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
			if(!xfrBindL.isEmpty()) {
				xfrBindL.sort(MST_WG_RQST_PRMS_R.$wg_rqst_prms_no);
				xfrSchdL.addBooleanColumn("xfr_abort_flg");
				xfrSchdL.addBooleanColumn("cmpl_flg");
				xfrSchdL.addBooleanColumn("ship_pr_abort_flg");
				xfrSchdL.addBooleanColumn("dlv_cmpl_flg");
				MST_XFR_SCHD_R t5 = MST_XFR_SCHD_R.create("T");
				MCQueryApiBuilder xfrSchdL_bldr5 = MCQueryApiBuilder.create(t5);
				MST_XFR_ALLOC_STS_R xfr = MST_XFR_ALLOC_STS_R.create("T2");
				MST_SHIP_PR_R ship = MST_SHIP_PR_R.create("T3");
				xfrSchdL_bldr5.setSelect(t5.trd_ptn_typ);
				xfrSchdL_bldr5.addSelect(nvl( xfr.abort_flg, value(false)).as("xfr_abort_flg"));
				xfrSchdL_bldr5.addSelect(nvl( xfr.cmpl_flg, value(false)).as("cmpl_flg"));
				xfrSchdL_bldr5.addSelect(nvl( ship.abort_flg, value(false)).as("ship_pr_abort_flg"));
				xfrSchdL_bldr5.addSelect(nvl( ship.dlv_cmpl_flg, value(false)).as("dlv_cmpl_flg"));
				xfrSchdL_bldr5.addSelect(nvl( ship.ship_inst_qty, value(0)).as("ship_inst_qty"));
				xfrSchdL_bldr5.addSelect(nvl( ship.ship_act_qty, value(0)).as("ship_act_qty"));
				xfrSchdL_bldr5.addSelect(t5.xfr_src_typ);
				xfrSchdL_bldr5.addSelect(t5.xfr_src_no);
				xfrSchdL_bldr5.addSelect(t5.gi_lg_grp_cd);
				xfrSchdL_bldr5.addSelect(t5.gr_lg_grp_cd);
				xfrSchdL_bldr5.addSelect(t5.slo_d_no);
				xfrSchdL_bldr5.addSelect(t5.not_lot_mix_flg);
				xfrSchdL_bldr5.addSelect(t5.not_sublot_mix_flg);
				xfrSchdL_bldr5.setWhere(t5.xfr_src_typ.eq(value(MSC_XFR_SRC_TYP.WG_RQST.value())));
				xfrSchdL_bldr5.addWhereWithAnd(t5.xfr_src_no.eq(bind("wg_rqst_prms_no")));
				xfrSchdL_bldr5.addWhereWithAnd(t5.rqst_can_flg.eq(value(false)));
				xfrSchdL_bldr5.addWhereWithAnd(t5.gi_lg_grp_cd.neq(t5.gr_lg_grp_cd));
				xfrSchdL_bldr5.addLeftOuterJoin(xfr, bracket( xfr.xfr_schd_no.eq(t5.xfr_schd_no)));
				xfrSchdL_bldr5.addLeftOuterJoin(ship, bracket( ship.xfr_schd_no.eq(t5.xfr_schd_no)));
				xfrSchdL_bldr5.setOrderByAsc(t5.xfr_src_typ, t5.xfr_src_no);
				dbSelect("MSBAL5100_MST_XFR_SCHD_S03", xfrSchdL, xfrSchdL_bldr5, xfrBindL);

				// 移動・移送予定の状況を取得
				MCList<MST_XFR_SCHD_R> xfrSchdL2 = MCList.create(MST_XFR_SCHD_R.class);
				xfrSchdL2.addBooleanColumn("xfr_inst_flg");
				xfrSchdL2.addStringColumn("xfr_alloc_sts_typ");
				xfrSchdL2.addBooleanColumn("xfr_alloc_sts_cmpl_flg");
				xfrSchdL2.addStringColumn("pr_sts_typ");
				xfrSchdL2.addStringColumn("xfr_alloc_sts_no");
	
				MCList<MST_XFR_SCHD_R> tmpXfrSchdL = xfrSchdL2.clone();
				// 移動
				MST_XFR_SCHD_R t6 = MST_XFR_SCHD_R.create("T");
				MCQueryApiBuilder xfrSchdL2_bldr6 = MCQueryApiBuilder.create(t6);
				xfrSchdL2_bldr6.setSelect(t6.xfr_src_no);
				xfrSchdL2_bldr6.addSelect(xfr.xfr_alloc_sts_no);
				xfrSchdL2_bldr6.addSelect(t6.gi_lg_grp_cd);
				xfrSchdL2_bldr6.addSelect(t6.gr_lg_grp_cd);
				xfrSchdL2_bldr6.addSelect(t6.slo_d_no);
				xfrSchdL2_bldr6.addSelect(t6.not_lot_mix_flg);
				xfrSchdL2_bldr6.addSelect(t6.not_sublot_mix_flg);
				xfrSchdL2_bldr6.addSelect(nvl( xfr.cmpl_flg, value(false)).as("xfr_alloc_sts_cmpl_flg"));
				xfrSchdL2_bldr6.addSelect(xfr.pr_sts_typ);
				xfrSchdL2_bldr6.setWhere(t6.xfr_src_typ.eq(bind("1")), MSC_XFR_SRC_TYP.WG_RQST.value());
				xfrSchdL2_bldr6.addWhereWithAnd(t6.xfr_src_no.eq(bind("wg_rqst_prms_no")));
				xfrSchdL2_bldr6.addWhereWithAnd(t6.gi_lg_grp_cd.eq(t6.gr_lg_grp_cd));
				xfrSchdL2_bldr6.addLeftOuterJoin(xfr, bracket( xfr.xfr_schd_no.eq(t6.xfr_schd_no)));
				dbSelect("MSBAL5100_MST_XFR_SCHD_S04", xfrSchdL2, xfrSchdL2_bldr6, xfrBindL);
	
				if (!xfrSchdL2.isEmpty()) {
					// ベース
					MCGroupByPolicy baseGbp = new MCGroupByPolicy(MST_XFR_SCHD_R.$xfr_src_no, MST_XFR_SCHD_R.$gi_lg_grp_cd, MST_XFR_SCHD_R.$gr_lg_grp_cd);
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

			MCIndexKey xfrSchdKey = xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_src_no);

			MCList<MST_XFR_SCHD_R> xfrSchdGrpL = xfrSchdL.groupBy(MST_XFR_SCHD_R.$slo_d_no);
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			if (!xfrSchdGrpL.isEmpty()) {
				MST_SLO_D_R sloD = MST_SLO_D_R.create("T");
				MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(sloD);
				dbSelectKey("MSBAL5100_MST_SLO_D_S01", sloDL, sloDL_bldr, xfrSchdGrpL);
			}
			MCIndexKey sloDKey = sloDL.createIndex(MST_XFR_SCHD_R.$slo_d_no);
			boolean isMixNotCng = true;

			for(WgRqst_Upd01_DtlR r : up0()) {
				// 予定のない回答
				for(MST_WG_RQST_PRMS_R wgRqstPrmsR : wgRqstPrmsL.subList(key1, r.wg_rqst_no(), false)) {
					WgRqst_Upd02_Dtl2R wgRqstUpd02R = WgRqst_Upd02_Dtl2R.create();
					wgRqstUpd02R.setAttributes(r);
					copy(wgRqstUpd02R, wgRqstPrmsR, createMap_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R());
					wgRqstUpd02R.cred_no_up_flg(r.cred_no_up_flg());
					// 削除の場合、回答、先の予定を論理削除
					if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						wgRqstUpd02R.can_flg(true);
					}
					if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), r.data_crud_typ());
						// 依頼内容が変わるような場合、回答を論理削除
						if(mainColChg(wgRqstR, r)) {
							wgRqstUpd02R.can_flg(true);
							wgRqstUpd02R.schd_cng_flg(true);
						}
						// 打切の場合、回答を論理削除
						else if(r.abort_flg()) {
							wgRqstUpd02R.can_flg(true);
						}
						// 打切取消の場合、回答を論理削除復活
						else if(r.abort_can_flg()) {
							wgRqstUpd02R.can_flg(false);
						}
						// それ以外は対象外
						else {
							continue;
						}
					}
					wgRqstUpd02R.data_crud_typ(r.data_crud_typ());
					wgRqstUpd02R.peg_no(r.peg_no());
					wgRqstUpd02R.slo_no(r.slo_no());
					wgRqstUpd02R.slo_d_no(r.slo_d_no());
					wgRqstUpd02.up1().add(wgRqstUpd02R);
				}

				// 予定のある回答
				for(MST_WG_RQST_PRMS_R wgRqstPrmsR : wgRqstPrmsL.subList(key1, r.wg_rqst_no(), true)) {
					MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), r.data_crud_typ());
					MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(xfrSchdKey, wgRqstPrmsR.wg_rqst_prms_no());

					isMixNotCng = true;
					if (!isNull(xfrSchdR) && MSC_WG_RQST_SRC_TYP.isSLO(r.wg_rqst_src_typ())) {
						MST_SLO_D_R sloDR = sloDL.getFirst(sloDKey, xfrSchdR.slo_d_no());
						if (!isSame(xfrSchdR.not_lot_mix_flg(), sloDR.not_lot_mix_flg()) || !isSame(xfrSchdR.not_sublot_mix_flg(), sloDR.not_sublot_mix_flg())) {
							isMixNotCng = false;
						}
					}

					// 削除の場合、回答、先の予定を削除
					if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						WgRqst_Upd02_Dtl2R wgRqstUpd02R = WgRqst_Upd02_Dtl2R.create();
						wgRqstUpd02R.setAttributes(r);
						copy(wgRqstUpd02R, wgRqstPrmsR, createMap_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R());
						wgRqstUpd02R.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						wgRqstUpd02R.can_flg(true);
						wgRqstUpd02R.fix_flg(false);
						wgRqstUpd02R.fix_dt(null);
						wgRqstUpd02R.peg_no(r.peg_no());
						wgRqstUpd02R.slo_no(r.slo_no());
						wgRqstUpd02R.slo_d_no(r.slo_d_no());
						wgRqstUpd02R.prms_ntc_flg(wgRqstR.prms_ntc_flg());
						wgRqstUpd02R.re_prms_ntc_flg(wgRqstR.re_prms_ntc_flg());
						wgRqstUpd02R.auto_prms_flg(r.auto_prms_flg());
						wgRqstUpd02R.cred_no_up_flg(r.cred_no_up_flg());
						wgRqstUpd02.up1().add(wgRqstUpd02R);
					}
					if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						// 主要項目に変更がなく、打切でもない場合は対象外
						if (!isNull(wgRqstR) && !mainColChg(wgRqstR, r) && !r.abort_flg()
								&& isSame(wgRqstR.trd_unit_cd(), r.trd_unit_cd())
								&& isSame(wgRqstR.trd_unit_qty(), r.trd_unit_qty())
								&& isSame(wgRqstR.gr_rqst_tm(), r.gr_rqst_tm())
								&& isSame(wgRqstR.gi_rqst_tm(), r.gi_rqst_tm())
								&& isSame(wgRqstR.gi_loc_cd(), r.gi_loc_cd())
								&& isSame(wgRqstR.gi_str_ln_cd(), r.gi_str_ln_cd())
								&& isSame(wgRqstR.sppl_cd(), r.sppl_cd())
								&& isSame(wgRqstR.maker_cd(), r.maker_cd())
								&& isSame(wgRqstR.mfg_loc_cd(), r.mfg_loc_cd())
								&& isSame(wgRqstR.bom_ptn(), r.bom_ptn())
								&& isSame(wgRqstR.trd_cd(), r.trd_cd())
								&& isSame(wgRqstR.trd_ptn_typ(), r.trd_ptn_typ())
								&& isSame(wgRqstR.gd_cd(), r.gd_cd())
								&& isSame(wgRqstR.lot_no(), r.lot_no())
								&& isSame(wgRqstR.sublot_no(), r.sublot_no())
								&& isSame(wgRqstR.purc_rsn_cd(), r.purc_rsn_cd())
								&& isSame(wgRqstR.bd_itm_cd(), r.bd_itm_cd())
								&& isSame(wgRqstR.bd_itm_sub1(), r.bd_itm_sub1())
								&& isSame(wgRqstR.bd_itm_sub2(), r.bd_itm_sub2())
								&& isSame(wgRqstR.bd_itm_sub3(), r.bd_itm_sub3())
								&& isSame(wgRqstR.bd_sno1(), r.bd_sno1())
								&& isSame(wgRqstR.bd_sno2(), r.bd_sno2())
								&& isSame(wgRqstR.bd_sno3(), r.bd_sno3())
								&& isSame(wgRqstR.bd_sno4(), r.bd_sno4())
								&& isSame(wgRqstR.bd_lot_no(), r.bd_lot_no())
								&& isSame(wgRqstR.bd_sublot_no(), r.bd_sublot_no())
								&& isSame(wgRqstR.bd_loc_cd(), r.bd_loc_cd())
								&& isSame(wgRqstR.bd_dpt_cd(), r.bd_dpt_cd())
								&& isSame(wgRqstR.bd_ctg_cd(), r.bd_ctg_cd())
								&& isSame(wgRqstR.bd_oper_cd(), r.bd_oper_cd())
								&& isSame(wgRqstR.bd_slo_no(), r.bd_slo_no())
								&& isSame(wgRqstR.bd_iv_no(), r.bd_iv_no())
								&& isSame(wgRqstR.bd_po_no(), r.bd_po_no())
								&& isSame(wgRqstR.rqst_fr_usr_cd(), r.rqst_fr_usr_cd())
								&& isSame(wgRqstR.rqst_fr_dpt_cd(), r.rqst_fr_dpt_cd())
								&& !chgDlvTdlv(wgRqstR, r)
								&& isMixNotCng
						) {
							continue;
						}
						
						MST_PO_SCHD_R poSchdR = poSchdL.getFirst(poSchdKey, wgRqstPrmsR.wg_rqst_prms_no());

						// 発注予定、移動・移送予定が次処理済の場合は、自動回答対象外
						if(isNextOprPoSchd(poSchdR) || isNextOprXfrSchd(xfrSchdR)) {
							r.auto_prms_flg(false);
						}

						// 自動回答で、一部指図・発注済、指図・発注済、完了でない場合
						if (r.auto_prms_flg()
								&& !cannotAutoPrms(wgRqstR.wg_rqst_sts_typ(), wgRqstR.wg_rqst_typ(), false)) {
							// 削除
							WgRqst_Upd02_Dtl2R wgRqstUpd02R = WgRqst_Upd02_Dtl2R.create();
							wgRqstUpd02R.setAttributes(r);
							copy(wgRqstUpd02R, wgRqstPrmsR, createMap_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R());
							wgRqstUpd02R.can_flg(true);
							wgRqstUpd02R.fix_flg(false);
							wgRqstUpd02R.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							wgRqstUpd02R.peg_no(r.peg_no());
							wgRqstUpd02R.slo_no(r.slo_no());
							wgRqstUpd02R.slo_d_no(r.slo_d_no());
							wgRqstUpd02R.prms_ntc_flg(wgRqstR.prms_ntc_flg());
							wgRqstUpd02R.re_prms_ntc_flg(wgRqstR.re_prms_ntc_flg());
							wgRqstUpd02R.auto_prms_flg(r.auto_prms_flg());
							wgRqstUpd02R.cred_no_up_flg(r.cred_no_up_flg());
							wgRqstUpd02.up1().add(wgRqstUpd02R);
						}
						// 自動回答でない場合
						else {
							// 依頼内容が変わるような場合、回答、先の予定を削除
							if(mainColChg(wgRqstR, r) || chgDlvTdlv(wgRqstR, r)) {
								WgRqst_Upd02_Dtl2R wgRqstUpd02R = WgRqst_Upd02_Dtl2R.create();
								wgRqstUpd02R.setAttributes(r);
								copy(wgRqstUpd02R, wgRqstPrmsR, createMap_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R());
								wgRqstUpd02R.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
								if(isNextOprPoSchd(poSchdR) || isNextOprXfrSchd(xfrSchdR)) {
									// 購買依頼または移送依頼、かつ、次処理済の場合、数量などの変更と同様に、紐切れにせず、依頼元訂正オンにする
								}
								else {
									// 一部指図・発注済、指図・発注済、完了でない場合、確定で無くす
									if(!MSC_WG_RQST_STS_TYP.isCMPL(wgRqstR.wg_rqst_sts_typ()) && !MSC_WG_RQST_STS_TYP.isINST(wgRqstR.wg_rqst_sts_typ()) && !MSC_WG_RQST_STS_TYP.isPART_INST(wgRqstR.wg_rqst_sts_typ())) {
										wgRqstUpd02R.can_flg(true);
										wgRqstUpd02R.fix_flg(false);
										wgRqstUpd02R.fix_dt(null);
									}
								}
								wgRqstUpd02R.peg_no(r.peg_no());
								wgRqstUpd02R.slo_no(r.slo_no());
								wgRqstUpd02R.slo_d_no(r.slo_d_no());
								wgRqstUpd02R.schd_cng_flg(true);
								wgRqstUpd02R.prms_ntc_flg(wgRqstR.prms_ntc_flg());
								wgRqstUpd02R.re_prms_ntc_flg(wgRqstR.re_prms_ntc_flg());
								wgRqstUpd02R.auto_prms_flg(r.auto_prms_flg());
								wgRqstUpd02R.cred_no_up_flg(r.cred_no_up_flg());
								wgRqstUpd02.up1().add(wgRqstUpd02R);
							}
							else {
								WgRqst_Upd02_Dtl2R wgRqstUpd02R = WgRqst_Upd02_Dtl2R.create();
								wgRqstUpd02R.setAttributes(r);
								copy(wgRqstUpd02R, wgRqstPrmsR, createMap_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R());
								// 打切の場合、回答、先の予定を削除
								if(r.abort_flg()) {
									wgRqstUpd02R.can_flg(true);
									wgRqstUpd02R.fix_flg(false);
								}
								// 打切取消の場合、回答の論理削除復活
								else if(r.abort_can_flg()) {
									wgRqstUpd02R.can_flg(false);
								}
								// 数量などが変わるような場合
								else if (!isNull(wgRqstR)
										&& (!isSame(wgRqstR.trd_unit_cd(), r.trd_unit_cd())
												|| !isSame(wgRqstR.trd_unit_qty(), r.trd_unit_qty())
												|| !isSame(wgRqstR.gr_rqst_tm(), r.gr_rqst_tm())
												|| !isSame(wgRqstR.gi_rqst_tm(), r.gi_rqst_tm())
												|| !isSame(wgRqstR.gi_loc_cd(), r.gi_loc_cd())
												|| !isSame(wgRqstR.gi_str_ln_cd(), r.gi_str_ln_cd())
												|| !isSame(wgRqstR.sppl_cd(), r.sppl_cd())
												|| !isSame(wgRqstR.maker_cd(), r.maker_cd())
												|| !isSame(wgRqstR.mfg_loc_cd(), r.mfg_loc_cd())
												|| !isSame(wgRqstR.bom_ptn(), r.bom_ptn())
												|| !isSame(wgRqstR.gd_cd(), r.gd_cd())
												|| !isSame(wgRqstR.lot_no(), r.lot_no())
												|| !isSame(wgRqstR.sublot_no(), r.sublot_no())
												|| !isSame(wgRqstR.purc_rsn_cd(), r.purc_rsn_cd())
												|| !isSame(wgRqstR.bd_itm_cd(), r.bd_itm_cd())
												|| !isSame(wgRqstR.bd_itm_sub1(), r.bd_itm_sub1())
												|| !isSame(wgRqstR.bd_itm_sub2(), r.bd_itm_sub2())
												|| !isSame(wgRqstR.bd_itm_sub3(), r.bd_itm_sub3())
												|| !isSame(wgRqstR.bd_sno1(), r.bd_sno1())
												|| !isSame(wgRqstR.bd_sno2(), r.bd_sno2())
												|| !isSame(wgRqstR.bd_sno3(), r.bd_sno3())
												|| !isSame(wgRqstR.bd_sno4(), r.bd_sno4())
												|| !isSame(wgRqstR.bd_lot_no(), r.bd_lot_no())
												|| !isSame(wgRqstR.bd_sublot_no(), r.bd_sublot_no())
												|| !isSame(wgRqstR.bd_loc_cd(), r.bd_loc_cd())
												|| !isSame(wgRqstR.bd_dpt_cd(), r.bd_dpt_cd())
												|| !isSame(wgRqstR.bd_ctg_cd(), r.bd_ctg_cd())
												|| !isSame(wgRqstR.bd_oper_cd(), r.bd_oper_cd())
												|| !isSame(wgRqstR.bd_slo_no(), r.bd_slo_no())
												|| !isSame(wgRqstR.bd_iv_no(), r.bd_iv_no())
												|| !isSame(wgRqstR.bd_po_no(), r.bd_po_no())
												|| !isSame(wgRqstR.rqst_fr_usr_cd(), r.rqst_fr_usr_cd())
												|| !isSame(wgRqstR.rqst_fr_dpt_cd(), r.rqst_fr_dpt_cd())
												|| !isMixNotCng
											)
										) {
									wgRqstUpd02R.schd_cng_flg(true);
								}
								// それ以外は対象外
								else {
									continue;
								}
								wgRqstUpd02R.data_crud_typ(r.data_crud_typ());
								wgRqstUpd02R.peg_no(r.peg_no());
								wgRqstUpd02R.slo_no(r.slo_no());
								wgRqstUpd02R.slo_d_no(r.slo_d_no());
								wgRqstUpd02R.prms_ntc_flg(wgRqstR.prms_ntc_flg());
								wgRqstUpd02R.re_prms_ntc_flg(wgRqstR.re_prms_ntc_flg());
								wgRqstUpd02R.auto_prms_flg(r.auto_prms_flg());
								wgRqstUpd02R.cred_no_up_flg(r.cred_no_up_flg());
								wgRqstUpd02.up1().add(wgRqstUpd02R);
							}							
						}
					}
				}
				
				// 自動回答かつ、新規または更新の場合は依頼内容で回答を新規として連携する
				if(r.auto_prms_flg() && (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()))) {
					// 指図・発注済、完了でない場合のみ対象
					MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), r.data_crud_typ());

					// 主要項目に変更がなく、打切でもない場合は対象外
					if (!isNull(wgRqstR) && !mainColChg(wgRqstR, r) && !r.abort_flg()
							&& isSame(wgRqstR.trd_unit_cd(), r.trd_unit_cd())
							&& isSame(wgRqstR.trd_unit_qty(), r.trd_unit_qty())
							&& isSame(wgRqstR.gr_rqst_tm(), r.gr_rqst_tm())
							&& isSame(wgRqstR.gi_rqst_tm(), r.gi_rqst_tm())
							&& isSame(wgRqstR.gi_loc_cd(), r.gi_loc_cd())
							&& isSame(wgRqstR.gi_str_ln_cd(), r.gi_str_ln_cd())
							&& isSame(wgRqstR.sppl_cd(), r.sppl_cd())
							&& isSame(wgRqstR.maker_cd(), r.maker_cd())
							&& isSame(wgRqstR.mfg_loc_cd(), r.mfg_loc_cd())
							&& isSame(wgRqstR.bom_ptn(), r.bom_ptn())
							&& isSame(wgRqstR.trd_cd(), r.trd_cd())
							&& isSame(wgRqstR.trd_ptn_typ(), r.trd_ptn_typ())
							&& isSame(wgRqstR.gd_cd(), r.gd_cd())
							&& isSame(wgRqstR.lot_no(), r.lot_no())
							&& isSame(wgRqstR.sublot_no(), r.sublot_no())
							&& isSame(wgRqstR.purc_rsn_cd(), r.purc_rsn_cd())
							&& isSame(wgRqstR.bd_itm_cd(), r.bd_itm_cd())
							&& isSame(wgRqstR.bd_itm_sub1(), r.bd_itm_sub1())
							&& isSame(wgRqstR.bd_itm_sub2(), r.bd_itm_sub2())
							&& isSame(wgRqstR.bd_itm_sub3(), r.bd_itm_sub3())
							&& isSame(wgRqstR.bd_sno1(), r.bd_sno1())
							&& isSame(wgRqstR.bd_sno2(), r.bd_sno2())
							&& isSame(wgRqstR.bd_sno3(), r.bd_sno3())
							&& isSame(wgRqstR.bd_sno4(), r.bd_sno4())
							&& isSame(wgRqstR.bd_lot_no(), r.bd_lot_no())
							&& isSame(wgRqstR.bd_sublot_no(), r.bd_sublot_no())
							&& isSame(wgRqstR.bd_loc_cd(), r.bd_loc_cd())
							&& isSame(wgRqstR.bd_dpt_cd(), r.bd_dpt_cd())
							&& isSame(wgRqstR.bd_ctg_cd(), r.bd_ctg_cd())
							&& isSame(wgRqstR.bd_oper_cd(), r.bd_oper_cd())
							&& isSame(wgRqstR.bd_slo_no(), r.bd_slo_no())
							&& isSame(wgRqstR.bd_iv_no(), r.bd_iv_no())
							&& isSame(wgRqstR.bd_po_no(), r.bd_po_no())
							&& isSame(wgRqstR.rqst_fr_usr_cd(), r.rqst_fr_usr_cd())
							&& isSame(wgRqstR.rqst_fr_dpt_cd(), r.rqst_fr_dpt_cd())
							&& !chgDlvTdlv(wgRqstR, r)
							&& isMixNotCng
					) {
						continue;
					}

					if (isNull(wgRqstR)
							|| !cannotAutoPrms(wgRqstR.wg_rqst_sts_typ(), wgRqstR.wg_rqst_typ(), false)) {
						WgRqst_Upd02_Dtl1R wgRqstUpd01R = WgRqst_Upd02_Dtl1R.create();
						wgRqstUpd01R.setAttributes(r);
						wgRqstUpd01R.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						wgRqstUpd01R.wg_rqst_no(r.wg_rqst_no());
						wgRqstUpd01R.prms_ntc_flg(true);
						wgRqstUpd01R.prms_dt(getToday());
						r.prms_ntc_flg(true);
						r.prms_dt(getToday());
						if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							wgRqstUpd01R.re_prms_ntc_flg(true);
							wgRqstUpd01R.re_prms_dt(getToday());
						}
						wgRqstUpd01R.auto_prms_flg(r.auto_prms_flg());
						wgRqstUpd01R.auto_prms_tgt_flg(r.auto_prms_tgt_flg());
						wgRqstUpd02.up0().add(wgRqstUpd01R);
						
						WgRqst_Upd02_Dtl2R wgRqstUpd02R = WgRqst_Upd02_Dtl2R.create();
						copy(wgRqstUpd02R, r, createMap_WgRqst_Upd02_Dtl2R_WgRqst_Upd01_DtlR());
						wgRqstUpd02R.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						wgRqstUpd02R.fix_flg(true);
						wgRqstUpd02R.fix_dt(getToday());
						wgRqstUpd02R.auto_prms_flg(r.auto_prms_flg());
						wgRqstUpd02R.cred_no_up_flg(r.cred_no_up_flg());
						wgRqstUpd02R.trd_cd(r.trd_cd());
						wgRqstUpd02R.trd_ptn_typ(r.trd_ptn_typ());
						wgRqstUpd02.up1().add(wgRqstUpd02R);
					}
				}
			}
			
			// 当サービスのＷＧ間依頼回答更新を実行
			MCIndexKey up0Key = up0().createIndex(WgRqst_Upd01_DtlR.$peg_no, WgRqst_Upd01_DtlR.$wg_rqst_typ);
			if(!wgRqstUpd02.up1().isEmpty()) {
				for(WgRqst_Upd02_Dtl2R wgRqstUpd02DtlR : wgRqstUpd02.up1()) {
					MST_WG_RQST_R wgRqstR = wgRqstForAutoPrmsL.getFirst(key4, wgRqstUpd02DtlR.wg_rqst_no());
					if(!isNull(wgRqstR)) {
						MCList<WgRqst_Upd01_DtlR> up0L = up0().subList(up0Key, wgRqstUpd02DtlR.peg_no(), wgRqstR.wg_rqst_typ());
						// 自動回答する場合は、回答未確認をオンにする
						if(wgRqstUpd02DtlR.auto_prms_flg()) {
							for(WgRqst_Upd01_DtlR up0 : up0L) {
								if (!up0.auto_prms_tgt_flg()) {
									up0.prms_uncn_flg(true);
								}
							}
						}
					}

					MCNumber pegNo = getPegNoMapByWgRqstPrmsNo().get(nvl(wgRqstUpd02DtlR.wg_rqst_prms_no(), MAC_STR.NULL_VAL.value()).concat(wgRqstUpd02DtlR.peg_no().toString()));
					if(isNull(pegNo)) {
						pegNo = getPegNoMapByWgRqstPrmsNo().get(MAC_STR.NULL_VAL.value().concat(wgRqstUpd02DtlR.peg_no().toString()));
					}
					
					if(!isNull(pegNo)) {
						wgRqstUpd02DtlR.peg_no(pegNo);
					}
				}
				wgRqstUpd02.exec();
			}
		}

		/**
		 * 前回の依頼内容と今回の依頼内容が変わっているか判断する
		 * @param wgRqstR 前回の依頼内容
		 * @param r　今回の依頼内容
		 * @return boolean 変更があるかどうか
		 */
		protected boolean mainColChg(MST_WG_RQST_R wgRqstR, WgRqst_Upd01_DtlR r) {
			if(isNull(wgRqstR) || wgRqstR.isEmpty()) {
				return false;
			}
			if(!isSame(wgRqstR.itm_cd(), r.itm_cd())
				|| !isSame(wgRqstR.itm_nm(), r.itm_nm())
				|| !isSame(wgRqstR.iv_itm_nm(), r.iv_itm_nm())
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
				|| !isSame(wgRqstR.wg_rqst_cnt_rmrks(), r.wg_rqst_cnt_rmrks())
				|| !isSame(wgRqstR.wg_re_rqst_cnt_rmrks(), r.wg_re_rqst_cnt_rmrks())
				//出庫物流Gが変わるような依頼も、依頼内容が変わるとみなす。
				|| !isSame(wgRqstR.gi_lg_grp_cd(), r.gi_lg_grp_cd())
			) {
				return true;
			}			
			return false;
		}

		
		/**
		 * 前回の依頼内容と今回の依頼内容の納品先、配送先が変わっているか判断する
		 * @param wgRqstR 前回の依頼内容
		 * @param r　今回の依頼内容
		 * @return boolean 変更があるかどうか
		 */
		protected boolean chgDlvTdlv(MST_WG_RQST_R wgRqstR, WgRqst_Upd01_DtlR r) {
			if(isNull(wgRqstR) || wgRqstR.isEmpty()) {
				return false;
			}

			if (!isSame(wgRqstR.dlv_cd(), r.dlv_cd())
				|| !isSame(wgRqstR.tdlv_cd(), r.tdlv_cd())
				|| !isSame(wgRqstR.dlv_cntct_dpt(), r.dlv_cntct_dpt())
				|| !isSame(wgRqstR.dlv_cntct_psn(), r.dlv_cntct_psn())
				|| !isSame(wgRqstR.dlv_zip_cd(), r.dlv_zip_cd())
				|| !isSame(wgRqstR.dlv_addr1(), r.dlv_addr1())
				|| !isSame(wgRqstR.dlv_addr2(), r.dlv_addr2())
				|| !isSame(wgRqstR.dlv_addr3(), r.dlv_addr3())
				|| !isSame(wgRqstR.dlv_addr4(), r.dlv_addr4())
				|| !isSame(wgRqstR.dlv_tel(), r.dlv_tel())
				|| !isSame(wgRqstR.dlv_fax(), r.dlv_fax())
				|| !isSame(wgRqstR.tdlv_zip_cd(), r.tdlv_zip_cd())
				|| !isSame(wgRqstR.tdlv_addr1(), r.tdlv_addr1())
				|| !isSame(wgRqstR.tdlv_addr2(), r.tdlv_addr2())
				|| !isSame(wgRqstR.tdlv_addr3(), r.tdlv_addr3())
				|| !isSame(wgRqstR.tdlv_addr4(), r.tdlv_addr4())
				|| !isSame(wgRqstR.tdlv_cntct_dpt(), r.tdlv_cntct_dpt())
				|| !isSame(wgRqstR.tdlv_cntct_psn(), r.tdlv_cntct_psn())
				|| !isSame(wgRqstR.tdlv_tel(), r.tdlv_tel())
				|| !isSame(wgRqstR.tdlv_fax(), r.tdlv_fax())
			) {
				return true;
			}
			if(wgRqstR.dlv_sundry_flg()) {
				if(!isSame(wgRqstR.dlv_nm(), r.dlv_nm())) {
					return true;
				}
			}
			if(wgRqstR.tdlv_sundry_flg()) {
				if(!isSame(wgRqstR.tdlv_nm(), r.tdlv_nm())) {
					return true;
				}
			}

			return false;
		}

		/**
		 * 依頼数量が変更された場合、ＷＧ間依頼の基準単位依頼残数量を算出する。
		 */
		protected void setNotCmplQty() {
			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MST_WG_RQST_PRMS_R t1 = MST_WG_RQST_PRMS_R.create("T");
			MCQueryApiBuilder wgRqstPrmsL_bldr1 = MCQueryApiBuilder.create(t1);
			wgRqstPrmsL_bldr1.setSelect(t1.prms_base_unit_qty);
			wgRqstPrmsL_bldr1.addSelect(t1.fix_flg);
			wgRqstPrmsL_bldr1.addSelect(t1.wg_rqst_no);
			wgRqstPrmsL_bldr1.setWhere(t1.wg_rqst_no.eq(bind("wg_rqst_no")));
			dbSelect("MSBAL5100_MST_WG_RQST_PRMS_S03", wgRqstPrmsL, wgRqstPrmsL_bldr1,
					up0().groupBy(WgRqst_Upd01_DtlR.$wg_rqst_no));
			MCIndexKey key2 = wgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no, MST_WG_RQST_PRMS_R.$fix_flg);

			for(WgRqst_Upd01_DtlR upR : up0().subList(WgRqst_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value())) {
				MCNumber notCmplQty = upR.base_unit_qty();
				for(MST_WG_RQST_PRMS_R wgRqstPrmsR : wgRqstPrmsL.subList(key2, upR.wg_rqst_no(), true)) {
					notCmplQty = notCmplQty.subtract(wgRqstPrmsR.prms_base_unit_qty());
					if(notCmplQty.isNegative()) {
						notCmplQty = MCNumber.ZERO;
					}
				}

				upR.not_cmpl_qty(notCmplQty);
			}
		}

		/**
		 * 受払予定などの登録、削除
		 */
		protected void updSchd() {
			MSBCL_OrdRegService.Ord_Upd04 ordUpd04 = MSBCL_OrdRegService.crtOrd_Upd04();
			MSBCL_OrdRegService.Ord_Sprt02 ordSprt02 = MSBCL_OrdRegService.crtOrd_Sprt02();
			MSBEL_IoSchdService.IoSchd_Ins01 ioSchdIns01 = MSBEL_IoSchdService.crtIoSchd_Ins01();
			MSBEL_IoSchdService.IoSchd_Del02 ioSchdDel02 = MSBEL_IoSchdService.crtIoSchd_Del02();
			MSBBL_SlsSchdService.Sls_Schd_Upd04 slsSchdUpd04 = MSBBL_SlsSchdService.crtSls_Schd_Upd04();
			MABCL_SundryItmRegService.SundryItm_Upd01 sundryItmUpd01 = MABCL_SundryItmRegService.crtSundryItm_Upd01();
			MSBEL_XfrSchdService.XfrSchd_Sprt01 xfrSchdSprt01 = MSBEL_XfrSchdService.crtXfrSchd_Sprt01();
			
			ordSprt02.up0().inst_exp_flg(false);
			ordSprt02.up0().get_prov_upri_flg(false);
			
			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t1 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder wgRqstL_bldr1 = MCQueryApiBuilder.create(t1);
			wgRqstL_bldr1.setWhere(t1.wg_rqst_no.eq(bind("wg_rqst_no")));
			dbSelect("MSBAL5100_MST_WG_RQST_S04", wgRqstL, wgRqstL_bldr1,
					up0().subList(WgRqst_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value()));
			
			// 品目単位マスタのキャッシュ
			createItmUnitCache(wgRqstL);
			
			// 場所マスタのキャッシュ
			createLocCacheForGrLoc(up0());
			
			// 先の予定があるかチェックして、売上予定サービスの呼び出しを決める
			MCList<WgRqst_Upd01_DtlR> tmpUpL = MCList.create(WgRqst_Upd01_DtlR.class);
			for(WgRqst_Upd01_DtlR r : up0()) {
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()) && !isNull(r.dlv_cd())) {
					tmpUpL.add(r);
				}
			}
			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			if(!tmpUpL.isEmpty()) {
				MST_WG_RQST_PRMS_R t2 = MST_WG_RQST_PRMS_R.create("T");
				MCQueryApiBuilder wgRqstPrmsL_bldr2 = MCQueryApiBuilder.create(t2);
				wgRqstPrmsL_bldr2.setWhere(t2.wg_rqst_no.eq(bind("wg_rqst_no")));
				wgRqstPrmsL_bldr2.addWhereWithAnd(t2.fix_flg.eq(value(true)));
				dbSelect("MSBAL5100_MST_WG_RQST_PRMS_S04", wgRqstPrmsL, wgRqstPrmsL_bldr2, tmpUpL);
			}
			MCIndexKey wgRqstPrmsKey = wgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no);
			
			// 受払予定の登録、削除
			for(WgRqst_Upd01_DtlR r : up0()) {
				// 諸口品でＷＧ間依頼登録画面からの登録の場合、諸口品登録サービスの上り電文を設定する。
				if(r.sundry_itm_flg()) {
					if(MSC_WG_RQST_SRC_TYP.isMNL(r.wg_rqst_src_typ())) {
						if(!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							SundryItm_Upd01_DtlR sundryItmUpd01DtlR = SundryItm_Upd01_DtlR.create();
							copy(sundryItmUpd01DtlR, r, createMap_SundryItm_Upd01_DtlR_WgRqst_Upd01_DtlR());
							sundryItmUpd01.up0().add(sundryItmUpd01DtlR);
						}
					}
				}
				
				// 売上予定サービスの上り電文を設定
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					if(!isNull(r.dlv_cd())) {
						// 予定のある回答がない場合のみ売上予定サービスを実行する
						MST_WG_RQST_PRMS_R wgRqstPrmsR = wgRqstPrmsL.getFirst(wgRqstPrmsKey, r.wg_rqst_no());
						if(isNull(wgRqstPrmsR)) {
							Sls_Schd_Upd04_DtlR slsSchdUpd04DtlR = Sls_Schd_Upd04_DtlR.create();
							copy(slsSchdUpd04DtlR, r, createMap_Sls_Schd_Upd04_DtlR_WgRqst_Upd01_DtlR());
							slsSchdUpd04.up0().add(slsSchdUpd04DtlR);
						}
					}
				}
				
				// 出荷依頼の場合は、受払予定は作成済のため、除外
				if(MSC_WG_RQST_TYP.isSHIP(r.wg_rqst_typ())) {
					continue;
				}

				if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// 自動回答の場合は除外
					if(r.auto_prms_flg()) {
						continue;
					}
					
					// 受払予定の上り電文に設定
					IoSchd_Ins01_DtlR ioSchdIns01DtlR = IoSchd_Ins01_DtlR.create();
					copy(ioSchdIns01DtlR, r, createMap_IoSchd_Ins01_DtlR_WgRqst_Upd01_DtlR());
					if(isNull(r.gd_cd())) {
						ioSchdIns01DtlR.gd_cd(getDefaultFeedStkGd().gd_cd());
					}
					
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
						MAM_LOC_R grLocR = getLocCacheForGrLoc(r.gr_loc_cd());
						if(!isNull(r.dlv_cd())) {
							ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_DDLV.value());
						}
						else if (!isNull(grLocR) && !isNull(grLocR.sppl_cd())) {
							ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());
						}
						else {
							ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR.value());
						}
					}
					else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
						// 移送の場合は、移動・移送予定の補完処理を実行
						XfrSchdEx_DtlR xfrSchdExDtlR = XfrSchdEx_DtlR.create();
						copy(xfrSchdExDtlR, r, createMap_XfrSchdEx_DtlR_WgRqst_Upd01_DtlR());
						xfrSchdSprt01.up0().add(xfrSchdExDtlR);
						
						// 移送
						if (!isSame(xfrSchdExDtlR.gr_lg_grp_cd(), xfrSchdExDtlR.gi_lg_grp_cd())) {
							ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI.value());
						}
						// 移動
						else {
							ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.MOVE_GI.value());
						}
					}
					ioSchdIns01.up0().add(ioSchdIns01DtlR);
					
					// 外注品の場合、オーダ登録サービスの構成展開用の上り電文を設定
					if(!isSame(nvl(r.mfg_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
						Ord_Sprt02_DtlR ordSprt02DtlR = Ord_Sprt02_DtlR.create();
						copy(ordSprt02DtlR, r, createMap_Ord_Sprt02_DtlR_WgRqst_Upd01_DtlR());
						ordSprt02.up1().add(ordSprt02DtlR);
					}
				}
				else if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					// 依頼残数量がある場合
					if(!r.not_cmpl_qty().isZero()) {
						// ＷＧ間依頼から作成された受払予定を削除
						MSW_IO_SCHD_DEL_R ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
						ioSchdDelR.setAttributes(r);
						ioSchdDelR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.WG_RQST_NO.value());
						ioSchdDelR.io_schd_sub_no2(r.wg_rqst_no());
						ioSchdDel02.up0().add(ioSchdDelR);

						// 受払予定を作成する。
						IoSchd_Ins01_DtlR ioSchdIns01DtlR = IoSchd_Ins01_DtlR.create();
						copy(ioSchdIns01DtlR, r, createMap_IoSchd_Ins01_DtlR_WgRqst_Upd01_DtlR());
						if(isNull(r.gd_cd())) {
							ioSchdIns01DtlR.gd_cd(getDefaultFeedStkGd().gd_cd());
						}
						
						if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
							MAM_LOC_R grLocR = getLocCacheForGrLoc(r.gr_loc_cd());
							if(!isNull(r.dlv_cd())) {
								ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_DDLV.value());
							}
							else if (!isNull(grLocR) && !isNull(grLocR.sppl_cd())) {
								ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());
							}
							else {
								ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR.value());
							}
						}
						else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
							// 移送の場合は、移動・移送予定の補完処理を実行
							XfrSchdEx_DtlR xfrSchdExDtlR = XfrSchdEx_DtlR.create();
							copy(xfrSchdExDtlR, r, createMap_XfrSchdEx_DtlR_WgRqst_Upd01_DtlR());
							xfrSchdSprt01.up0().add(xfrSchdExDtlR);
							
							// 移送
							if (!isSame(xfrSchdExDtlR.gr_lg_grp_cd(), xfrSchdExDtlR.gi_lg_grp_cd())) {
								ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI.value());
							}
							// 移動
							else {
								ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.MOVE_GI.value());
							}
						}
												
						ioSchdIns01DtlR.base_unit_qty(r.not_cmpl_qty());
						ioSchdIns01.up0().add(ioSchdIns01DtlR);

						
						// 外注品の場合、オーダ登録サービスの構成展開を行う
						if(!isNullOrNullVal(r.mfg_loc_cd())) {
							Ord_Sprt02_DtlR ordSprt02DtlR = Ord_Sprt02_DtlR.create();
							copy(ordSprt02DtlR, r, createMap_Ord_Sprt02_DtlR_WgRqst_Upd01_DtlR());
							ordSprt02.up1().add(ordSprt02DtlR);
						}
					}
					// 残数量０の場合は受払予定の削除のみ行う
					else {
						// ＷＧ間依頼から作成された受払予定を削除
						MSW_IO_SCHD_DEL_R ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
						ioSchdDelR.setAttributes(r);
						ioSchdDelR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.WG_RQST_NO.value());
						ioSchdDelR.io_schd_sub_no2(r.wg_rqst_no());
						ioSchdDel02.up0().add(ioSchdDelR);
					}
				}
				else if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// ＷＧ間依頼から作成された受払予定を削除
					MSW_IO_SCHD_DEL_R ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
					ioSchdDelR.setAttributes(r);
					ioSchdDelR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.WG_RQST_NO.value());
					ioSchdDelR.io_schd_sub_no2(r.wg_rqst_no());
					ioSchdDel02.up0().add(ioSchdDelR);
					
					//　オーダ登録サービスの品目オーダ実績項目更新の上り電文を設定
					if(!isNull(r.itm_ord_no())) {
						if(r.screen_crct_flg()) {
							Ord_Upd04_DtlR ordUpd04DtlR = Ord_Upd04_DtlR.create();
							ordUpd04DtlR.itm_ord_no(r.itm_ord_no());
							ordUpd04DtlR.abort_flg(true);
							if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
								if(!isSame(nvl(r.mfg_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
									ordUpd04DtlR.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
								}
								else {
									ordUpd04DtlR.itm_ord_typ(MSC_ITM_ORD_TYP.PURC.value());
								}
							}
							else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
								ordUpd04DtlR.itm_ord_typ(MSC_ITM_ORD_TYP.XFR.value());
							}
							ordUpd04.up0().add(ordUpd04DtlR);
						}
					}
				}
			}
			
			// オーダ登録サービスの構成展開を実行
			// 投入品の受払予定を作成
			if(!ordSprt02.up1().isEmpty()) {
				// 工程オーダＮＯを取得
				MCList<MST_OPER_ORDER_R> operOrderL = MCList.create(MST_OPER_ORDER_R.class);
				MST_OPER_ORDER_R t3 = MST_OPER_ORDER_R.create("T");
				MCQueryApiBuilder operOrderL_bldr3 = MCQueryApiBuilder.create(t3);
				operOrderL_bldr3.setSelect(t3.itm_ord_no);
				operOrderL_bldr3.addSelect(t3.oper_ord_no);
				operOrderL_bldr3.setWhere(t3.itm_ord_no.eq(bind("itm_ord_no")));
				dbSelect("MSBAL5100_MST_OPER_ORDER_S01", operOrderL, operOrderL_bldr3, up0().groupBy(WgRqst_Upd01_DtlR.$itm_ord_no));
				MCIndexKey operOrderKey = operOrderL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
				
				ordSprt02.exec();
				
				MCList<IoSchd_Ins01_DtlR> inptIoSchdForNotOrdAndAltL = MCList.create(IoSchd_Ins01_DtlR.class);
				MCIndexKey up0key = up0().createIndex(WgRqst_Upd01_DtlR.$peg_no, WgRqst_Upd01_DtlR.$wg_rqst_typ);
				for(Ord_Sprt02_RsltR ordSprt02RsltR : ordSprt02.down0()) {
					WgRqst_Upd01_DtlR wgRqstUpd01DtlR = up0().getFirst(up0key, ordSprt02RsltR.peg_no(), MSC_WG_RQST_TYP.PURC.value());

					// 受払予定サービスの上り電文に設定
					IoSchd_Ins01_DtlR ioSchdIns01DtlR = IoSchd_Ins01_DtlR.create();
					copy(ioSchdIns01DtlR, ordSprt02RsltR, createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR());
					ioSchdIns01DtlR.gd_cd(getDefaultFeedStkGd().gd_cd());
					ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
					ioSchdIns01DtlR.io_schd_no(wgRqstUpd01DtlR.wg_rqst_no());
					if(MSC_WG_RQST_SRC_TYP.isORD(wgRqstUpd01DtlR.wg_rqst_src_typ())) {
						ioSchdIns01DtlR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
						ioSchdIns01DtlR.io_schd_sub_no1(wgRqstUpd01DtlR.itm_ord_no());
						MST_OPER_ORDER_R operOrderR = operOrderL.getFirst(operOrderKey, wgRqstUpd01DtlR.itm_ord_no());
						if(!isNull(operOrderR)) {
							ioSchdIns01DtlR.oper_ord_no(operOrderR.oper_ord_no());
						}
					}
					if (!isNull(ioSchdIns01DtlR.alt_grp_cd()) && isNull(ioSchdIns01DtlR.oper_ord_no())) {
						inptIoSchdForNotOrdAndAltL.add(ioSchdIns01DtlR);
					}
					ioSchdIns01DtlR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.WG_RQST_NO.value());
					ioSchdIns01DtlR.io_schd_sub_no2(wgRqstUpd01DtlR.wg_rqst_no());
					ioSchdIns01DtlR.io_schd_pr_no(wgRqstUpd01DtlR.io_schd_pr_no());
					ioSchdIns01.up0().add(ioSchdIns01DtlR);
				}
				if (!isNull(inptIoSchdForNotOrdAndAltL)) {
					MCList<IoSchd_Ins01_DtlR>[] altGrpL = inptIoSchdForNotOrdAndAltL.groupList(IoSchd_Ins01_DtlR.$io_schd_sub_no2);
					doSeqCache(MSC_NUM_SYS_TYP.PORD, altGrpL.length);
					for (MCList<IoSchd_Ins01_DtlR> grpL : altGrpL) {
						String operOrdNo = getStrSeq(MSC_NUM_SYS_TYP.PORD);
						for (IoSchd_Ins01_DtlR r : grpL) {
							r.oper_ord_no(operOrdNo);
						}
					}
				}
			}
			
			// 移動・移送予定の補完処理
			if(!xfrSchdSprt01.up0().isEmpty()) {
				xfrSchdSprt01.exec();
				
				// 受払予定サービスの上り電文にマッピング
				String[] destCols = new String[] {
						IoSchd_Ins01_DtlR.$stk_arrv_bp_cd,
						IoSchd_Ins01_DtlR.$ex_cmpl_schd_dt, IoSchd_Ins01_DtlR.$tdlv_cd,
						IoSchd_Ins01_DtlR.$trd_ptn_typ, IoSchd_Ins01_DtlR.$io_schd_typ
				};
				String[] srcCols = new String[] {
						XfrSchdEx_DtlR.$gi_stk_arrv_bp_cd,
						XfrSchdEx_DtlR.$ex_cmpl_schd_dt, XfrSchdEx_DtlR.$tdlv_cd,
						XfrSchdEx_DtlR.$trd_ptn_typ, XfrSchdEx_DtlR.$io_schd_typ
				};
				copyByPegNo(ioSchdIns01.up0(), destCols, xfrSchdSprt01.down0(), srcCols);				
			}

			// 受払予定の削除
			if(!ioSchdDel02.up0().isEmpty()) {
				ioSchdDel02.exec();
			}
			
			// 受払予定の登録
			if(!ioSchdIns01.up0().isEmpty()) {
				ioSchdIns01.exec();
			}
			// オーダ登録サービスの品目オーダ実績項目更新を実行
			if(!ordUpd04.up0().isEmpty()) {
				ordUpd04.exec();
			}
			
			// 諸口品登録サービスの実行
			if(!sundryItmUpd01.up0().isEmpty()) {
				sundryItmUpd01.exec();
			}
			
			// 売上予定サービスの実行
			if(!slsSchdUpd04.up0().isEmpty()) {
				slsSchdUpd04.exec();
			}
			
		}
		
		/**
		 * オーダ登録サービスの予定日計算を実行する。
		 */
		protected void callOrdSprt03() {
			MSBCL_OrdRegService.Ord_Sprt03 ordSprt03 = MSBCL_OrdRegService.crtOrd_Sprt03();
			MCList<MST_ITM_ORDER_R> itmOrdL = getItmOrdL(up0().innerRowList(WgRqst_Upd01_DtlR.$wg_rqst, MST_WG_RQST_R.class));
			MCIndexKey itmOrdKey = itmOrdL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);

			for(WgRqst_Upd01_DtlR r : up0()) {
				if(MSC_WG_RQST_TYP.isSHIP(r.wg_rqst_typ())) {
					continue;
				}
				MST_ITM_ORDER_R itmOrdR = itmOrdL.getFirst(itmOrdKey, r.itm_ord_no());
				if(isCmplSchdDtByOrd(r.wg_rqst(), r.data_crud_typ(), itmOrdR)) {
					cmplSchdDtByOrd(r, itmOrdR);
					continue;
				}

				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {

					// 購買依頼、移送依頼の場合、オーダ登録サービスの日付計算を行う
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
						Ord_Sprt03_DtlR ordSprt03DtlR = Ord_Sprt03_DtlR.create();
						// 出庫依頼日時を逆算してマスタ適用に設定
						ordSprt03DtlR.master_dt(getMasterDate(r));
						copy(ordSprt03DtlR, r, createMap_Ord_Sprt03_DtlR_WgRqst_Upd01_DtlR());
						ordSprt03.up0().add(ordSprt03DtlR);
					}
				}
			}
			if(!ordSprt03.up0().isEmpty()) {
				ordSprt03.exec();

				String[] destCols = new String[] {WgRqst_Upd01_DtlR.$mfg_st_schd_dt, WgRqst_Upd01_DtlR.$mfg_end_schd_dt, WgRqst_Upd01_DtlR.$gi_schd_dt, WgRqst_Upd01_DtlR.$strg_schd_dt, WgRqst_Upd01_DtlR.$accpt_schd_dt, WgRqst_Upd01_DtlR.$insp_end_schd_dt};
				String[] srcCols = new String[] {Ord_Sprt03_RsltR.$mfg_st_schd_dt, Ord_Sprt03_RsltR.$mfg_end_schd_dt, Ord_Sprt03_RsltR.$gi_schd_dt, Ord_Sprt03_RsltR.$strg_schd_dt, Ord_Sprt03_RsltR.$accpt_schd_dt, Ord_Sprt03_RsltR.$avl_schd_dt};
				copyByPegNo(up0(), destCols, ordSprt03.down0(), srcCols);
				
				// 仕入直送の場合は、検収予定日、検査終了予定日を訂正する 入庫依頼日を補完する
				for(WgRqst_Upd01_DtlR r : up0()) {
					if (MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
						if (!isNull(r.dlv_cd())) {
							r.accpt_schd_dt(r.strg_schd_dt());
							r.insp_end_schd_dt(null);
						}
						if (isNull(r.gr_rqst_tm())) {
							r.gr_rqst_tm(r.strg_schd_dt());
						}
					}
				}
			}
		}
		
		/**
		 * ＷＧ間依頼の更新、削除
		 */
		protected void updDelWgRqst() {
			MCList<MST_WG_RQST_R> updL = MCList.create(MST_WG_RQST_R.class);
			MCList<MST_WG_RQST_R> delL = MCList.create(MST_WG_RQST_R.class);
			MCList<MST_WG_RQST_R> dbUpdL = MCList.create(MST_WG_RQST_R.class);
			MCList<MST_WG_RQST_R> dbDelL = MCList.create(MST_WG_RQST_R.class);

			for(WgRqst_Upd01_DtlR r : up0()) {
				if(isNull(r.gi_rqst_tm())) {
					r.gi_rqst_tm(r.gi_schd_dt());
				}

				MST_WG_RQST_R wgRqstR = getWgRqstR(r.wg_rqst(), r.data_crud_typ());

				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (!isReRqstCng(wgRqstR, r)) {
						r.rqst_crrct_flg(true);
						r.wg_rqst().rqst_crrct_dt(getToday());
					}

					// 再調整依頼がオフの場合、回答再通知、回答再通知日を引き継ぐ
					if (!r.re_rqst_flg()) {
						r.wg_rqst().re_prms_ntc_flg(wgRqstR.re_prms_ntc_flg());
						r.wg_rqst().re_prms_dt(wgRqstR.re_prms_dt());
					}
					dbUpdL.add(r.wg_rqst());
					if(!r.auto_prms_flg() && !isReRqstCng(wgRqstR, r)) {
						updL.add(r.wg_rqst());
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// プッシュ通知用に前回の依頼日を補完する
					if(isNull(r.rqst_dt())) {
						r.rqst_dt(wgRqstR.rqst_dt());
					}
					r.wg_rqst().rqst_can_dt(getToday());
					dbDelL.add(r.wg_rqst());
					if(!r.auto_prms_flg()) {
						delL.add(r.wg_rqst());
					}
				}
			}
			updWgRqst(dbUpdL);
			delWgRqst(dbDelL);
			pushSendMessage(_insL, updL, delL);
		}

		/**
		 * 再調整依頼の内容が変わっているか判定する
		 * 
		 * @param r 今回の依頼内容
		 * @param wgRqstR 前回の依頼内容
		 * @return 判定結果
		 */
		protected boolean isReRqstCng(MST_WG_RQST_R wgRqstR, WgRqst_Upd01_DtlR r) {
			// 主要項目に変更がなく、打切でもない場合はtrue
			if (!isNull(wgRqstR) && !mainColChg(wgRqstR, r) && !r.abort_flg()
					&& isSame(wgRqstR.trd_unit_cd(), r.trd_unit_cd())
					&& isSame(wgRqstR.trd_unit_qty(), r.trd_unit_qty())
					&& isSame(wgRqstR.gr_rqst_tm(), r.gr_rqst_tm())
					&& isSame(wgRqstR.gi_rqst_tm(), r.gi_rqst_tm())
					&& isSame(wgRqstR.gi_loc_cd(), r.gi_loc_cd())
					&& isSame(wgRqstR.gi_str_ln_cd(), r.gi_str_ln_cd())
					&& isSame(wgRqstR.sppl_cd(), r.sppl_cd())
					&& isSame(wgRqstR.maker_cd(), r.maker_cd())
					&& isSame(wgRqstR.mfg_loc_cd(), r.mfg_loc_cd())
					&& isSame(wgRqstR.bom_ptn(), r.bom_ptn())
					&& isSame(wgRqstR.re_rqst_flg(), r.re_rqst_flg())
					&& isSame(wgRqstR.re_rqst_dt(), r.re_rqst_dt())
					&& !chgDlvTdlv(wgRqstR, r)
			) {
				return true;
			}
			return false;
		}
		
		/**
		 * 再調整依頼の内容（依頼先に影響しない項目）が変わっているか判定する
		 * 
		 * @param r 今回の依頼内容
		 * @param wgRqstR 前回の依頼内容
		 * @return 判定結果
		 */
		protected boolean isReRqstCng2(MST_WG_RQST_R wgRqstR, WgRqst_Upd01_DtlR r) {
			// 依頼先に影響しない項目に変更がなく、打切でもない場合はtrue
			if (!isNull(wgRqstR) && !r.abort_flg()
					&& isSame(wgRqstR.purc_rsn_cd(), r.purc_rsn_cd())
					&& isSame(wgRqstR.trd_cd(), r.trd_cd())
					&& isSame(wgRqstR.lot_no(), r.lot_no())
					&& isSame(wgRqstR.sublot_no(), r.sublot_no())
					&& isSame(wgRqstR.gd_cd(), r.gd_cd())
					&& isSame(wgRqstR.bd_itm_cd(), r.bd_itm_cd())
					&& isSame(wgRqstR.bd_itm_sub1(), r.bd_itm_sub1())
					&& isSame(wgRqstR.bd_itm_sub2(), r.bd_itm_sub2())
					&& isSame(wgRqstR.bd_itm_sub3(), r.bd_itm_sub3())
					&& isSame(wgRqstR.bd_sno1(), r.bd_sno1())
					&& isSame(wgRqstR.bd_sno2(), r.bd_sno2())
					&& isSame(wgRqstR.bd_sno3(), r.bd_sno3())
					&& isSame(wgRqstR.bd_sno4(), r.bd_sno4())
					&& isSame(wgRqstR.bd_lot_no(), r.bd_lot_no())
					&& isSame(wgRqstR.bd_sublot_no(), r.bd_sublot_no())
					&& isSame(wgRqstR.bd_loc_cd(), r.bd_loc_cd())
					&& isSame(wgRqstR.bd_dpt_cd(), r.bd_dpt_cd())
					&& isSame(wgRqstR.bd_ctg_cd(), r.bd_ctg_cd())
					&& isSame(wgRqstR.bd_oper_cd(), r.bd_oper_cd())
					&& isSame(wgRqstR.bd_slo_no(), r.bd_slo_no())
					&& isSame(wgRqstR.bd_iv_no(), r.bd_iv_no())
					&& isSame(wgRqstR.bd_po_no(), r.bd_po_no())
					&& isSame(wgRqstR.intr_rmrks(), r.intr_rmrks())
					&& isSame(wgRqstR.sub_char1(), r.sub_char1())
					&& isSame(wgRqstR.sub_char2(), r.sub_char2())
					&& isSame(wgRqstR.sub_char3(), r.sub_char3())
			) {
				return true;
			}
			return false;
		}		
		/**
		 * ＷＧ間依頼の新規追加
		 * @param insL 新規追加用のリスト
		 */
		protected void insWgRqst(MCList<MST_WG_RQST_R> insL) {
			if(insL.isEmpty()) {
				return;
			}
			dbInsertEx("MSBAL5100_MST_WG_RQST_I01", insL,
					MCQueryApiBuilder.create(MST_WG_RQST_R.create("T")));
		}

		/**
		 * ＷＧ間依頼回答の更新
		 * @param updL 更新用のリスト
		 */
		protected void updWgRqst(MCList<MST_WG_RQST_R> updL) {
			if(updL.isEmpty()) {
				return;
			}
			MST_WG_RQST_R t1 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder updL_bldr1 = MCQueryApiBuilder.create(t1);
			editUpdSetStmt(updL, t1, updL_bldr1);
			dbUpdateKey("MSBAL5100_MST_WG_RQST_U02", updL, updL_bldr1);
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_WG_RQST_R> L, MST_WG_RQST_R t, MCQueryApiBuilder builder) {

			builder.setSet(
					t.last_wg_rqst_no,
					t.wg_rqst_typ,
					t.wg_rqst_src_typ,
					t.wg_rqst_src_no,
					t.rqst_dt,
					t.prms_uncn_flg,
					t.re_rqst_flg,
					t.re_rqst_dt,
					t.rqst_crrct_flg,
					t.re_prms_ntc_flg,
					t.re_prms_dt,
					t.can_flg,
					t.rqst_fr_wg_cd,
					t.rqst_fr_dpt_cd,
					t.rqst_fr_usr_cd,
					t.gr_loc_wg_cd,
					t.gr_lg_grp_cd,
					t.gr_loc_cd,
					t.gr_str_ln_cd,
					t.gr_rqst_tm,
					t.rqst_to_wg_cd,
					t.gi_loc_wg_cd,
					t.gi_lg_grp_cd,
					t.gi_loc_cd,
					t.gi_str_ln_cd,
					t.gi_rqst_tm,
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.itm_nm,
					t.iv_itm_nm,
					t.sundry_itm_flg,
					t.lot_no,
					t.sublot_no,
					t.sno1,
					t.sno1_null_flg,
					t.sno2,
					t.sno2_null_flg,
					t.sno3,
					t.sno3_null_flg,
					t.sno4,
					t.sno4_null_flg,
					t.ver_no,
					t.gd_cd,
					t.vld_dt_fr,
					t.vld_dt_to,
					t.trd_unit_qty,
					t.trd_unit_cd,
					t.base_unit_qty,
					t.base_unit_cd,
					t.not_cmpl_qty,
					t.sppl_cd,
					t.maker_cd,
					t.slo_no,
					t.slo_d_no,
					t.dlv_cd,
					t.dlv_sundry_flg,
					t.dlv_nm,
					t.dlv_cntct_dpt,
					t.dlv_cntct_psn,
					t.dlv_zip_cd,
					t.dlv_addr1,
					t.dlv_addr2,
					t.dlv_addr3,
					t.dlv_addr4,
					t.dlv_tel,
					t.dlv_fax,
					t.tdlv_cd,
					t.tdlv_sundry_flg,
					t.tdlv_nm,
					t.tdlv_zip_cd,
					t.tdlv_addr1,
					t.tdlv_addr2,
					t.tdlv_addr3,
					t.tdlv_addr4,
					t.tdlv_cntct_psn,
					t.tdlv_cntct_dpt,
					t.tdlv_tel,
					t.tdlv_fax,
					t.mfg_loc_cd,
					t.bom_ptn,
					t.purc_rsn_cd,
					t.xpns_po_flg,
					t.trd_cd,
					t.trd_ptn_typ,
					t.bd_itm_cd,
					t.bd_itm_sub1,
					t.bd_itm_sub2,
					t.bd_itm_sub3,
					t.bd_sno1,
					t.bd_sno2,
					t.bd_sno3,
					t.bd_sno4,
					t.bd_lot_no,
					t.bd_sublot_no,
					t.bd_loc_cd,
					t.bd_dpt_cd,
					t.bd_ctg_cd,
					t.bd_oper_cd,
					t.bd_slo_no,
					t.bd_iv_no,
					t.bd_po_no,
					t.wg_rqst_cnt_rmrks,
					t.wg_re_rqst_cnt_rmrks,
					t.rqst_crrct_dt,
					t.intr_rmrks,
					t.comp_cng_flg,
					t.spec_cng_flg,
					t.sub_char1,
					t.sub_char2,
					t.sub_char3
					);
		}

		/**
		 * ＷＧ間依頼の論理削除
		 * @param delL 削除用のリスト
		 */
		protected void delWgRqst(MCList<MST_WG_RQST_R> delL) {
			if(delL.isEmpty()) {
				return;
			}

			for(MST_WG_RQST_R delR : delL) {
				delR.can_flg(true);
			}
			MST_WG_RQST_R t1 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder delL_bldr1 = MCQueryApiBuilder.create(t1);
			delL_bldr1.setSet(t1.can_flg);
			delL_bldr1.addSet(t1.rqst_can_dt);
			dbUpdateKey("MSBAL5100_MST_WG_RQST_U03", delL, delL_bldr1);
		}
		
		/**
		 * 依頼元、依頼先ＷＧに応じてポップアップ通知を行う。
		 */
		protected void pushSendMessage(MCList<MST_WG_RQST_R> insL, MCList<MST_WG_RQST_R> updL, MCList<MST_WG_RQST_R> delL) {
			MAUCL_PushNtcMgr mgr;
			MAUCL_PushNtcInfo info;
			
			// プッシュ通知用にＷＧマスタを取得する
			MCList<MST_WG_RQST_R> tmpWgRqstL = MCList.create(MST_WG_RQST_R.class);
			tmpWgRqstL.addAll(insL);
			tmpWgRqstL.addAll(updL);
			tmpWgRqstL.addAll(delL);
			
			MCList<MAM_WG_R> wgL = MCList.create(MAM_WG_R.class);
			MCList<MAM_WG_R> tmpL = MCList.create(MAM_WG_R.class);
			for(MST_WG_RQST_R dtlR : tmpWgRqstL) {
				MAM_WG_R wgR = MAM_WG_R.create();
				wgR.wg_cd(dtlR.rqst_fr_wg_cd());
				tmpL.add(wgR);
				
				wgR = MAM_WG_R.create();
				wgR.wg_cd(dtlR.rqst_to_wg_cd());
				tmpL.add(wgR);
			}
			
			tmpL.sort(MAM_WG_R.$wg_cd);
			MAM_WG_R t1 = MAM_WG_R.create("T");
			MCQueryApiBuilder wgL_bldr1 = MCQueryApiBuilder.create(t1);
			wgL_bldr1.setSelect(t1.wg_cd);
			wgL_bldr1.addSelect(t1.wg_nm);
			dbSelectKey("MSBAL5100_MAM_WG_S01", wgL, wgL_bldr1, tmpL.groupBy(MAM_WG_R.$wg_cd));
			MCIndexKey wgKey = wgL.createIndex(MAM_WG_R.$wg_cd);
			
			// 新規依頼
			for(MST_WG_RQST_R r : insL.groupBy(MST_WG_RQST_R.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd, MST_WG_RQST_R.$rqst_dt)) {
				MAM_WG_R frWgR = wgL.getFirst(wgKey, r.rqst_fr_wg_cd());
				MAM_WG_R toWgR = wgL.getFirst(wgKey, r.rqst_to_wg_cd());
				
				MCMessage message = new MCMessage(MSBAL0007, r.rqst_fr_wg_cd(), frWgR.wg_nm(), r.rqst_to_wg_cd(), toWgR.wg_nm());
				// 依頼元
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST_PRMS);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(r.rqst_fr_wg_cd(), r.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.RQST_DT.value(),
						toYMDString(r.rqst_dt()), toYMDString(r.rqst_dt()), false, false,
						true, false, false, true, false,
						MSC_WG_RQST_REG_OPE.OPE_REF.value(), r.rqst_fr_wg_cd(),
						r.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();

				// 依頼先
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(r.rqst_to_wg_cd(), r.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.RQST_DT.value(),
						toYMDString(r.rqst_dt()), toYMDString(r.rqst_dt()), false, false,
						false, false, false, MSC_WG_RQST_ADJST_OPE.OPE_UPD.value(),
						r.rqst_fr_wg_cd(), r.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();
			}

			// 依頼元訂正
			for(MST_WG_RQST_R r : updL.groupBy(MST_WG_RQST_R.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd, MST_WG_RQST_R.$rqst_dt)) {
				MAM_WG_R frWgR = wgL.getFirst(wgKey, r.rqst_fr_wg_cd());
				MAM_WG_R toWgR = wgL.getFirst(wgKey, r.rqst_to_wg_cd());
				
				MCMessage message = new MCMessage(MSBAL0008, r.rqst_fr_wg_cd(), frWgR.wg_nm(), r.rqst_to_wg_cd(), toWgR.wg_nm());
				// 依頼元
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST_PRMS);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(r.rqst_fr_wg_cd(), r.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.RQST_CRRCT_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, true, false, true, true,
						MSC_WG_RQST_REG_OPE.OPE_REF.value(), r.rqst_fr_wg_cd(),
						r.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();

				// 依頼先
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(r.rqst_to_wg_cd(), r.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.RQST_CRRCT_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, false, false, MSC_WG_RQST_ADJST_OPE.OPE_UPD.value(),
						r.rqst_fr_wg_cd(), r.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();
			}

			// 依頼元取消
			for(MST_WG_RQST_R r : delL.groupBy(MST_WG_RQST_R.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd, MST_WG_RQST_R.$rqst_dt)) {
				MAM_WG_R frWgR = wgL.getFirst(wgKey, r.rqst_fr_wg_cd());
				MAM_WG_R toWgR = wgL.getFirst(wgKey, r.rqst_to_wg_cd());
				
				MCMessage message = new MCMessage(MSBAL0009, r.rqst_fr_wg_cd(), frWgR.wg_nm(), r.rqst_to_wg_cd(), toWgR.wg_nm());
				// 依頼元
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST_PRMS);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(r.rqst_fr_wg_cd(), r.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.RQST_CAN_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, true, true, true, true, MSC_WG_RQST_REG_OPE.OPE_REF.value(),
						r.rqst_fr_wg_cd(), r.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();

				// 依頼先
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(r.rqst_to_wg_cd(), r.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.RQST_CAN_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, true, true, MSC_WG_RQST_ADJST_OPE.OPE_REF.value(),
						r.rqst_fr_wg_cd(), r.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();
			}
		}
		
		protected Map_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R<WgRqst_Upd02_Dtl2R,MST_WG_RQST_PRMS_R> _map_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R = null;
		protected Map_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R<WgRqst_Upd02_Dtl2R,MST_WG_RQST_PRMS_R> createMap_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R() {
			if (_map_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R == null) {
				_map_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R = new Map_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R<WgRqst_Upd02_Dtl2R, MST_WG_RQST_PRMS_R>();
			}
			return _map_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R;
		}

		public class Map_WgRqst_Upd02_Dtl2R_MST_WG_RQST_PRMS_R<D extends WgRqst_Upd02_Dtl2R, S extends MST_WG_RQST_PRMS_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$wg_rqst_prms_no, MST_WG_RQST_PRMS_R.$wg_rqst_prms_no);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$wg_rqst_no, MST_WG_RQST_PRMS_R.$wg_rqst_no);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$wg_cd, MST_WG_RQST_PRMS_R.$wg_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$fix_flg, MST_WG_RQST_PRMS_R.$fix_flg);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$fix_dt, MST_WG_RQST_PRMS_R.$fix_dt);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_trd_unit_qty, MST_WG_RQST_PRMS_R.$prms_trd_unit_qty);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_trd_unit_cd, MST_WG_RQST_PRMS_R.$prms_trd_unit_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_base_unit_qty, MST_WG_RQST_PRMS_R.$prms_base_unit_qty);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_base_unit_cd, MST_WG_RQST_PRMS_R.$prms_base_unit_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gr_schd_tm, MST_WG_RQST_PRMS_R.$gr_schd_tm);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gi_lg_grp_cd, MST_WG_RQST_PRMS_R.$gi_lg_grp_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gi_loc_cd, MST_WG_RQST_PRMS_R.$gi_loc_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gi_str_ln_cd, MST_WG_RQST_PRMS_R.$gi_str_ln_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gi_rqst_tm, MST_WG_RQST_PRMS_R.$gi_rqst_tm);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$sppl_cd, MST_WG_RQST_PRMS_R.$sppl_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$maker_cd, MST_WG_RQST_PRMS_R.$maker_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$mfg_loc_cd, MST_WG_RQST_PRMS_R.$mfg_loc_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$bom_ptn, MST_WG_RQST_PRMS_R.$bom_ptn);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$can_flg, MST_WG_RQST_PRMS_R.$can_flg);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_rmrks, MST_WG_RQST_PRMS_R.$prms_rmrks);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$intr_rmrks, MST_WG_RQST_PRMS_R.$intr_rmrks);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$sub_char1, MST_WG_RQST_PRMS_R.$sub_char1);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$sub_char2, MST_WG_RQST_PRMS_R.$sub_char2);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$sub_char3, MST_WG_RQST_PRMS_R.$sub_char3);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$last_fix_flg, MST_WG_RQST_PRMS_R.$fix_flg);
			}
		}
		
		protected Map_WgRqst_Upd02_Dtl2R_WgRqst_Upd01_DtlR<WgRqst_Upd02_Dtl2R,WgRqst_Upd01_DtlR> _map_WgRqst_Upd02_Dtl2R_WgRqst_Upd01_DtlR = null;
		protected Map_WgRqst_Upd02_Dtl2R_WgRqst_Upd01_DtlR<WgRqst_Upd02_Dtl2R,WgRqst_Upd01_DtlR> createMap_WgRqst_Upd02_Dtl2R_WgRqst_Upd01_DtlR() {
			if (_map_WgRqst_Upd02_Dtl2R_WgRqst_Upd01_DtlR == null) {
				_map_WgRqst_Upd02_Dtl2R_WgRqst_Upd01_DtlR = new Map_WgRqst_Upd02_Dtl2R_WgRqst_Upd01_DtlR<WgRqst_Upd02_Dtl2R, WgRqst_Upd01_DtlR>();
			}
			return _map_WgRqst_Upd02_Dtl2R_WgRqst_Upd01_DtlR;
		}

		public class Map_WgRqst_Upd02_Dtl2R_WgRqst_Upd01_DtlR<D extends WgRqst_Upd02_Dtl2R, S extends WgRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$data_crud_typ, WgRqst_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$peg_no, WgRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$wg_rqst_no, WgRqst_Upd01_DtlR.$wg_rqst_no);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$wg_cd, WgRqst_Upd01_DtlR.$rqst_to_wg_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_trd_unit_qty, WgRqst_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_trd_unit_cd, WgRqst_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_base_unit_qty, WgRqst_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_base_unit_cd, WgRqst_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gr_schd_tm, WgRqst_Upd01_DtlR.$gr_rqst_tm);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gi_lg_grp_cd, WgRqst_Upd01_DtlR.$gi_lg_grp_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gi_loc_cd, WgRqst_Upd01_DtlR.$gi_loc_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gi_str_ln_cd, WgRqst_Upd01_DtlR.$gi_str_ln_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gi_rqst_tm, WgRqst_Upd01_DtlR.$gi_rqst_tm);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$sppl_cd, WgRqst_Upd01_DtlR.$sppl_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$maker_cd, WgRqst_Upd01_DtlR.$maker_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$mfg_loc_cd, WgRqst_Upd01_DtlR.$mfg_loc_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$bom_ptn, WgRqst_Upd01_DtlR.$bom_ptn);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$can_flg, WgRqst_Upd01_DtlR.$can_flg);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$slo_no, WgRqst_Upd01_DtlR.$slo_no);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$slo_d_no, WgRqst_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$cred_no_up_flg, WgRqst_Upd01_DtlR.$cred_no_up_flg);
			}
		}
		
		protected Map_Ord_Sprt02_DtlR_WgRqst_Upd01_DtlR<Ord_Sprt02_DtlR,WgRqst_Upd01_DtlR> _map_Ord_Sprt02_DtlR_WgRqst_Upd01_DtlR = null;
		protected Map_Ord_Sprt02_DtlR_WgRqst_Upd01_DtlR<Ord_Sprt02_DtlR,WgRqst_Upd01_DtlR> createMap_Ord_Sprt02_DtlR_WgRqst_Upd01_DtlR() {
			if (_map_Ord_Sprt02_DtlR_WgRqst_Upd01_DtlR == null) {
				_map_Ord_Sprt02_DtlR_WgRqst_Upd01_DtlR = new Map_Ord_Sprt02_DtlR_WgRqst_Upd01_DtlR<Ord_Sprt02_DtlR, WgRqst_Upd01_DtlR>();
			}
			return _map_Ord_Sprt02_DtlR_WgRqst_Upd01_DtlR;
		}

		public class Map_Ord_Sprt02_DtlR_WgRqst_Upd01_DtlR<D extends Ord_Sprt02_DtlR, S extends WgRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt02_DtlR.$peg_no, WgRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_cd, WgRqst_Upd01_DtlR.$itm_cd);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub1, WgRqst_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub2, WgRqst_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub3, WgRqst_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Sprt02_DtlR.$mfg_loc_cd, WgRqst_Upd01_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt02_DtlR.$mfg_st_schd_dt, WgRqst_Upd01_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$st_schd_tm, WgRqst_Upd01_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$end_schd_tm, WgRqst_Upd01_DtlR.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Sprt02_DtlR.$bom_ptn, WgRqst_Upd01_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno1, WgRqst_Upd01_DtlR.$sno1);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno2, WgRqst_Upd01_DtlR.$sno2);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno3, WgRqst_Upd01_DtlR.$sno3);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno4, WgRqst_Upd01_DtlR.$sno4);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if(MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
					dest.inst_qty(src.base_unit_qty());
				}
				else if(MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
					dest.inst_qty(src.not_cmpl_qty());
				}
				dest.oper_cd(MAC_STR.NULL_VAL.value());		//　外注のため、デフォルト工程
				dest.oper_seq(MCNumber.ZERO);
				dest.setAttributes(src);
			}
		}

		protected Map_Ord_Sprt03_DtlR_WgRqst_Upd01_DtlR<Ord_Sprt03_DtlR,WgRqst_Upd01_DtlR> _map_Ord_Sprt03_DtlR_WgRqst_Upd01_DtlR = null;
		protected Map_Ord_Sprt03_DtlR_WgRqst_Upd01_DtlR<Ord_Sprt03_DtlR,WgRqst_Upd01_DtlR> createMap_Ord_Sprt03_DtlR_WgRqst_Upd01_DtlR() {
			if (_map_Ord_Sprt03_DtlR_WgRqst_Upd01_DtlR == null) {
				_map_Ord_Sprt03_DtlR_WgRqst_Upd01_DtlR = new Map_Ord_Sprt03_DtlR_WgRqst_Upd01_DtlR<Ord_Sprt03_DtlR, WgRqst_Upd01_DtlR>();
			}
			return _map_Ord_Sprt03_DtlR_WgRqst_Upd01_DtlR;
		}

		public class Map_Ord_Sprt03_DtlR_WgRqst_Upd01_DtlR<D extends Ord_Sprt03_DtlR, S extends WgRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt03_DtlR.$peg_no, WgRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt, WgRqst_Upd01_DtlR.$gr_rqst_tm);
				addColumnPathMap(Ord_Sprt03_DtlR.$avl_schd_dt, WgRqst_Upd01_DtlR.$avl_schd_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, WgRqst_Upd01_DtlR.$itm_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, WgRqst_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, WgRqst_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, WgRqst_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, WgRqst_Upd01_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$sppl_cd, WgRqst_Upd01_DtlR.$sppl_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$maker_cd, WgRqst_Upd01_DtlR.$maker_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, WgRqst_Upd01_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, WgRqst_Upd01_DtlR.$gr_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, WgRqst_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_sppl_cd, WgRqst_Upd01_DtlR.$sppl_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if(MSC_WG_RQST_TYP.isPURC(src.wg_rqst_typ())) {
					if(!isSame(nvl(src.mfg_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
						dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
						dest.sppl_cd(MAC_STR.NULL_VAL.value());
						dest.maker_cd(MAC_STR.NULL_VAL.value());
					}
					else {
						dest.itm_ord_typ(MSC_ITM_ORD_TYP.PURC.value());
					}
					dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
				}
				else if(MSC_WG_RQST_TYP.isXFR(src.wg_rqst_typ())) {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.WG_XFR.value());
					dest.rqst_loc_cd(src.gi_loc_cd());
				}
				if (!isSame(_sysParm, "1")) {
					// 仕入直送はdlv_cdを設定 ("slod_proc_typ", "slod_dlv_cd"は事前に実行したgetMasterDateで設定)
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(src.getString("slod_proc_typ"))) {
						dest.dlv_cd(src.getString("slod_dlv_cd"));
					}
				}
			}
		}
		
		protected Map_XfrSchdEx_DtlR_WgRqst_Upd01_DtlR<XfrSchdEx_DtlR,WgRqst_Upd01_DtlR> _map_XfrSchdEx_DtlR_WgRqst_Upd01_DtlR = null;
		protected Map_XfrSchdEx_DtlR_WgRqst_Upd01_DtlR<XfrSchdEx_DtlR,WgRqst_Upd01_DtlR> createMap_XfrSchdEx_DtlR_WgRqst_Upd01_DtlR() {
			if (_map_XfrSchdEx_DtlR_WgRqst_Upd01_DtlR == null) {
				_map_XfrSchdEx_DtlR_WgRqst_Upd01_DtlR = new Map_XfrSchdEx_DtlR_WgRqst_Upd01_DtlR<XfrSchdEx_DtlR, WgRqst_Upd01_DtlR>();
			}
			return _map_XfrSchdEx_DtlR_WgRqst_Upd01_DtlR;
		}

		public class Map_XfrSchdEx_DtlR_WgRqst_Upd01_DtlR<D extends XfrSchdEx_DtlR, S extends WgRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdEx_DtlR.$peg_no, WgRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(XfrSchdEx_DtlR.$gi_loc_cd, WgRqst_Upd01_DtlR.$gi_loc_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$gr_loc_cd, WgRqst_Upd01_DtlR.$gr_loc_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_cd, WgRqst_Upd01_DtlR.$itm_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_sub1, WgRqst_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_sub2, WgRqst_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_sub3, WgRqst_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(XfrSchdEx_DtlR.$gi_schd_dt, WgRqst_Upd01_DtlR.$gi_rqst_tm);
				addColumnPathMap(XfrSchdEx_DtlR.$gr_schd_dt, WgRqst_Upd01_DtlR.$gr_rqst_tm);
			}
		}
		
		protected Map_IoSchd_Ins01_DtlR_WgRqst_Upd01_DtlR<IoSchd_Ins01_DtlR,WgRqst_Upd01_DtlR> _map_IoSchd_Ins01_DtlR_WgRqst_Upd01_DtlR = null;
		protected Map_IoSchd_Ins01_DtlR_WgRqst_Upd01_DtlR<IoSchd_Ins01_DtlR,WgRqst_Upd01_DtlR> createMap_IoSchd_Ins01_DtlR_WgRqst_Upd01_DtlR() {
			if (_map_IoSchd_Ins01_DtlR_WgRqst_Upd01_DtlR == null) {
				_map_IoSchd_Ins01_DtlR_WgRqst_Upd01_DtlR = new Map_IoSchd_Ins01_DtlR_WgRqst_Upd01_DtlR<IoSchd_Ins01_DtlR, WgRqst_Upd01_DtlR>();
			}
			return _map_IoSchd_Ins01_DtlR_WgRqst_Upd01_DtlR;
		}

		public class Map_IoSchd_Ins01_DtlR_WgRqst_Upd01_DtlR<D extends IoSchd_Ins01_DtlR, S extends WgRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoSchd_Ins01_DtlR.$peg_no, WgRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_no, WgRqst_Upd01_DtlR.$wg_rqst_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_sub_no2, WgRqst_Upd01_DtlR.$wg_rqst_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_pr_no, WgRqst_Upd01_DtlR.$io_schd_pr_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$accpt_schd_dt, WgRqst_Upd01_DtlR.$accpt_schd_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$insp_cmpl_schd_dt, WgRqst_Upd01_DtlR.$insp_end_schd_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, WgRqst_Upd01_DtlR.$itm_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, WgRqst_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, WgRqst_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, WgRqst_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, WgRqst_Upd01_DtlR.$ver_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$lot_no, WgRqst_Upd01_DtlR.$lot_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sublot_no, WgRqst_Upd01_DtlR.$sublot_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, WgRqst_Upd01_DtlR.$sno1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1_null_flg, WgRqst_Upd01_DtlR.$sno1_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, WgRqst_Upd01_DtlR.$sno2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2_null_flg, WgRqst_Upd01_DtlR.$sno2_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, WgRqst_Upd01_DtlR.$sno3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3_null_flg, WgRqst_Upd01_DtlR.$sno3_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, WgRqst_Upd01_DtlR.$sno4);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4_null_flg, WgRqst_Upd01_DtlR.$sno4_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, WgRqst_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, WgRqst_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, WgRqst_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, WgRqst_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$gd_cd, WgRqst_Upd01_DtlR.$gd_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_fr, WgRqst_Upd01_DtlR.$vld_dt_fr);
				addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_to, WgRqst_Upd01_DtlR.$vld_dt_to);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sppl_cd, WgRqst_Upd01_DtlR.$sppl_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$mfg_loc_cd, WgRqst_Upd01_DtlR.$mfg_loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$tdlv_cd, WgRqst_Upd01_DtlR.$tdlv_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$dlv_cd, WgRqst_Upd01_DtlR.$dlv_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.FIX.value());
				dest.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.WG_RQST_NO.value());
				if(MSC_WG_RQST_TYP.isPURC(src.wg_rqst_typ())) {
					dest.schd_dt(src.gr_rqst_tm());
					dest.loc_cd(src.gr_loc_cd());
					dest.str_ln_cd(src.gr_str_ln_cd());
					if(!isSame(nvl(src.mfg_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
						dest.mfg_inst_unit_typ(MAC_MFG_INST_UNIT_TYP.ITM.value());
					}
				}
				else if (MSC_WG_RQST_TYP.isXFR(src.wg_rqst_typ())) {
					dest.schd_dt(nvl(src.gi_rqst_tm(), src.gi_schd_dt()));
					dest.loc_cd(src.gi_loc_cd());
					dest.str_ln_cd(src.gi_str_ln_cd());
					dest.gr_loc_cd(src.gr_loc_cd());
					dest.gr_str_ln_cd(src.gr_str_ln_cd());
					dest.gr_schd_dt(src.gr_rqst_tm());
				}
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				dest.alloc_flg(false);
			}
		}
		
		protected Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR,Ord_Sprt02_RsltR> _map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR = null;
		protected Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR,Ord_Sprt02_RsltR> createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR() {
			if (_map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR == null) {
				_map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR = new Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR, Ord_Sprt02_RsltR>();
			}
			return _map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR;
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
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.FIX.value());
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
		
		protected Map_Sls_Schd_Upd04_DtlR_WgRqst_Upd01_DtlR<Sls_Schd_Upd04_DtlR,WgRqst_Upd01_DtlR> _map_Sls_Schd_Upd04_DtlR_WgRqst_Upd01_DtlR = null;
		protected Map_Sls_Schd_Upd04_DtlR_WgRqst_Upd01_DtlR<Sls_Schd_Upd04_DtlR,WgRqst_Upd01_DtlR> createMap_Sls_Schd_Upd04_DtlR_WgRqst_Upd01_DtlR() {
			if (_map_Sls_Schd_Upd04_DtlR_WgRqst_Upd01_DtlR == null) {
				_map_Sls_Schd_Upd04_DtlR_WgRqst_Upd01_DtlR = new Map_Sls_Schd_Upd04_DtlR_WgRqst_Upd01_DtlR<Sls_Schd_Upd04_DtlR, WgRqst_Upd01_DtlR>();
			}
			return _map_Sls_Schd_Upd04_DtlR_WgRqst_Upd01_DtlR;
		}

		public class Map_Sls_Schd_Upd04_DtlR_WgRqst_Upd01_DtlR<D extends Sls_Schd_Upd04_DtlR, S extends WgRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$data_crud_typ, WgRqst_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$slo_d_no, WgRqst_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$wg_rqst_no, WgRqst_Upd01_DtlR.$wg_rqst_no);
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$sls_schd_dt, WgRqst_Upd01_DtlR.$gr_rqst_tm);
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$trd_unit_qty, WgRqst_Upd01_DtlR.$trd_unit_qty);
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$trd_unit_cd, WgRqst_Upd01_DtlR.$trd_unit_cd);
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$base_unit_qty, WgRqst_Upd01_DtlR.$base_unit_qty);
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$base_unit_cd, WgRqst_Upd01_DtlR.$base_unit_cd);
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$lot_no, WgRqst_Upd01_DtlR.$lot_no);
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$sublot_no, WgRqst_Upd01_DtlR.$sublot_no);
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$abort_flg, WgRqst_Upd01_DtlR.$abort_flg);
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$cred_no_up_flg, WgRqst_Upd01_DtlR.$cred_no_up_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.WG_RQST.value());
			}
		}
		
		protected Map_SundryItm_Upd01_DtlR_WgRqst_Upd01_DtlR<SundryItm_Upd01_DtlR,WgRqst_Upd01_DtlR> _map_SundryItm_Upd01_DtlR_WgRqst_Upd01_DtlR = null;
		protected Map_SundryItm_Upd01_DtlR_WgRqst_Upd01_DtlR<SundryItm_Upd01_DtlR,WgRqst_Upd01_DtlR> createMap_SundryItm_Upd01_DtlR_WgRqst_Upd01_DtlR() {
			if (_map_SundryItm_Upd01_DtlR_WgRqst_Upd01_DtlR == null) {
				_map_SundryItm_Upd01_DtlR_WgRqst_Upd01_DtlR = new Map_SundryItm_Upd01_DtlR_WgRqst_Upd01_DtlR<SundryItm_Upd01_DtlR, WgRqst_Upd01_DtlR>();
			}
			return _map_SundryItm_Upd01_DtlR_WgRqst_Upd01_DtlR;
		}

		public class Map_SundryItm_Upd01_DtlR_WgRqst_Upd01_DtlR<D extends SundryItm_Upd01_DtlR, S extends WgRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SundryItm_Upd01_DtlR.$itm_cd, WgRqst_Upd01_DtlR.$itm_cd);
				addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub1, WgRqst_Upd01_DtlR.$itm_sub1);
				addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub2, WgRqst_Upd01_DtlR.$itm_sub2);
				addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub3, WgRqst_Upd01_DtlR.$itm_sub3);
				addColumnPathMap(SundryItm_Upd01_DtlR.$sno1, WgRqst_Upd01_DtlR.$sno1);
				addColumnPathMap(SundryItm_Upd01_DtlR.$sno2, WgRqst_Upd01_DtlR.$sno2);
				addColumnPathMap(SundryItm_Upd01_DtlR.$sno3, WgRqst_Upd01_DtlR.$sno3);
				addColumnPathMap(SundryItm_Upd01_DtlR.$sno4, WgRqst_Upd01_DtlR.$sno4);
				addColumnPathMap(SundryItm_Upd01_DtlR.$itm_nm, WgRqst_Upd01_DtlR.$itm_nm);
			}
		}
		
		protected Map_SloSts_DtlR_WgRqst_Upd01_DtlR<SloSts_DtlR,WgRqst_Upd01_DtlR> _map_SloSts_DtlR_WgRqst_Upd01_DtlR = null;
		protected Map_SloSts_DtlR_WgRqst_Upd01_DtlR<SloSts_DtlR,WgRqst_Upd01_DtlR> createMap_SloSts_DtlR_WgRqst_Upd01_DtlR() {
			if (_map_SloSts_DtlR_WgRqst_Upd01_DtlR == null) {
				_map_SloSts_DtlR_WgRqst_Upd01_DtlR = new Map_SloSts_DtlR_WgRqst_Upd01_DtlR<SloSts_DtlR, WgRqst_Upd01_DtlR>();
			}
			return _map_SloSts_DtlR_WgRqst_Upd01_DtlR;
		}

		public class Map_SloSts_DtlR_WgRqst_Upd01_DtlR<D extends SloSts_DtlR, S extends WgRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloSts_DtlR.$slo_d_no, WgRqst_Upd01_DtlR.$slo_d_no);
				addColumnPathMap(SloSts_DtlR.$wg_rqst_no, WgRqst_Upd01_DtlR.$wg_rqst_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (!MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.unit_cd(src.trd_unit_cd());
					dest.qty(src.trd_unit_qty());					
				}
			}
		}
	}
	/**
	 * WgRqst_Chk02オペレーション.<p>
	 *
	 * ＷＧ間依頼回答の登録・更新・削除<br>
	 */
	public class WgRqst_Chk02 extends MSBAL_WgRqstService_MC_A.WgRqst_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		
		@Override
		protected void doIt() {
			MCList<MST_WG_RQST_R> tgtWgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t1 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder tgtWgRqstL_bldr1 = MCQueryApiBuilder.create(t1);
			tgtWgRqstL_bldr1.setWhere(t1.wg_rqst_no.eq(bind("wg_rqst_no")));
			dbSelectKey("MSBAL5100_MST_WG_RQST_S05", tgtWgRqstL, tgtWgRqstL_bldr1,
					up0().groupBy(WgRqst_Chk02_DtlR.$wg_rqst_no));
						
			// 発注予定登録サービスなどのチェックを実行
			chkSchd(tgtWgRqstL);
			
			// 仕入直送のチェック
			chkPurcDdlv(tgtWgRqstL);
			
			if (!isSame(_sysParm, "1")) {
				// 予定日計算用のマスタ基準日のチェック
				chkOrdSprt03MstrDt(tgtWgRqstL);
			}
			
			// 下り電文設定
			down0().setAll(up0());
		}
		
		/**
		 * 発注予定、移動・移送予定のチェックを実行
		 * @param tgtWgRqstL　ＷＧ間依頼のリスト
		 */
		protected void chkSchd(MCList<MST_WG_RQST_R> tgtWgRqstL) {
			MSBDL_PoSchdRegService.PoSchd_Chk01 poSchdChk01 = MSBDL_PoSchdRegService.crtPoSchd_Chk01();
			MSBEL_XfrSchdService.XfrSchd_Chk04 xfrSchdChk04 = MSBEL_XfrSchdService.crtXfrSchd_Chk04();
			MSBEL_XfrSchdService.XfrSchd_Sprt01 xfrSchdSprt01 = MSBEL_XfrSchdService.crtXfrSchd_Sprt01();

			MCIndexKey key = up0().createIndex(WgRqst_Chk02_DtlR.$fix_flg, WgRqst_Chk02_DtlR.$last_fix_flg);
			MCList<WgRqst_Chk02_DtlR> insSchdL = up0().subList(key, true, false);
			MCList<WgRqst_Chk02_DtlR> updSchdL = up0().subList(WgRqst_Chk02_DtlR.$schd_cng_flg, true);
			MCList<WgRqst_Chk02_DtlR> delSchdL = up0().subList(key, false, true);
			
			MCIndexKey wgRqstKey = tgtWgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_no);
						
			// 出荷・供給依頼サービスの予定登録に対するマッピング
			for(WgRqst_Chk02_DtlR r : insSchdL) {
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(wgRqstKey, r.wg_rqst_no());

				if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ())) {
					// 発注予定登録サービスの更新前チェック用の上り電文を設定
					PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
					copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_WgRqst_Chk02_DtlR());
					poSchdUpd01DtlR.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.RQST.value());
					poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					poSchdUpd01DtlR.itm_cd(wgRqstR.itm_cd());
					poSchdUpd01DtlR.itm_sub1(wgRqstR.itm_sub1());
					poSchdUpd01DtlR.itm_sub2(wgRqstR.itm_sub2());
					poSchdUpd01DtlR.itm_sub3(wgRqstR.itm_sub3());
					poSchdChk01.up0().add(poSchdUpd01DtlR);
				}
				else if(MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
					// 移動・移送予定サービスの更新前チェック用の上り電文を設定
					XfrSchdChk04_DtlR xfrSchdChk04DtlR = XfrSchdChk04_DtlR.create();
					copy(xfrSchdChk04DtlR, r, createMap_XfrSchdChk04_DtlR_WgRqst_Chk02_DtlR());
					xfrSchdChk04DtlR.itm_cd(wgRqstR.itm_cd());
					xfrSchdChk04DtlR.itm_sub1(wgRqstR.itm_sub1());
					xfrSchdChk04DtlR.itm_sub2(wgRqstR.itm_sub2());
					xfrSchdChk04DtlR.itm_sub3(wgRqstR.itm_sub3());
					xfrSchdChk04DtlR.gr_loc_cd(wgRqstR.gr_loc_cd());
					xfrSchdChk04DtlR.xfr_src_typ(MSC_XFR_SRC_TYP.WG_RQST.value());
					xfrSchdChk04DtlR.xfr_src_no(r.wg_rqst_prms_no());
					xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
					
					// 移動・移送予定の補完処理の上り電文を設定
					XfrSchdEx_DtlR xfrSchdExDtlR = XfrSchdEx_DtlR.create();
					copy(xfrSchdExDtlR, wgRqstR, createMap_XfrSchdEx_DtlR_MST_WG_RQST_R());
					xfrSchdExDtlR.setAttributes(r);
					xfrSchdExDtlR.peg_no(r.peg_no());
					//出庫場所は入力の依頼回答内容を使用する。出庫物流グループは呼び出し先で出庫場所から補完。
					xfrSchdExDtlR.gi_loc_cd(r.gi_loc_cd());
					xfrSchdExDtlR.gi_lg_grp_cd(null);
					xfrSchdSprt01.up0().add(xfrSchdExDtlR);
				}
			}
			
			// 更新前のＷＧ間依頼回答を取得
			MCList<MST_WG_RQST_PRMS_R> tmpWgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			for (WgRqst_Chk02_DtlR r : updSchdL) {
				MST_WG_RQST_PRMS_R wgRqstPrmsR = MST_WG_RQST_PRMS_R.create();
				wgRqstPrmsR.wg_rqst_prms_no(r.wg_rqst_prms_no());
				tmpWgRqstPrmsL.add(wgRqstPrmsR);
			}
			MCQueryApiBuilder tmpWgRqstPrmsL_bldr1 = MCQueryApiBuilder.create(MST_WG_RQST_PRMS_R.create("T"));
			dbWkDelete("MSBAL5100_MSW_WG_RQST_PRMS_D01", tmpWgRqstPrmsL_bldr1.getBaseDbc());
			dbWkInsert("MSBAL5100_MSW_WG_RQST_PRMS_I01", tmpWgRqstPrmsL, tmpWgRqstPrmsL_bldr1.getBaseDbc());
			
			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsBfL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MST_WG_RQST_PRMS_R t2 = MST_WG_RQST_PRMS_R.create("T");
			MCQueryApiBuilder wgRqstPrmsBfL_bldr2 = MCQueryApiBuilder.create(t2);
			MSW_WG_RQST_PRMS_KEY_R wg = MSW_WG_RQST_PRMS_KEY_R.create("KEY");
			wgRqstPrmsBfL_bldr2.addInnerJoin(wg, bracket( wg.wg_rqst_prms_no.eq(t2.wg_rqst_prms_no)));
			
			dbSelect("MSBAL5100_MST_WG_RQST_PRMS_S05", wgRqstPrmsBfL, wgRqstPrmsBfL_bldr2);
			
			MCIndexKey wgRqstPrmsKey = wgRqstPrmsBfL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_prms_no);

			// 予定のある回答の訂正
			for(WgRqst_Chk02_DtlR r : updSchdL) {
				MST_WG_RQST_PRMS_R wgRqstPrmsBfR = wgRqstPrmsBfL.getFirst(wgRqstPrmsKey, r.wg_rqst_prms_no());
				// 主要項目が変更されていない場合は対象外にする
				if (!mainColChg(wgRqstPrmsBfR, r)) {
					continue;
				}
				
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(wgRqstKey, r.wg_rqst_no());
				if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ())) {
					// 発注予定登録サービスの更新前チェック用の上り電文を設定
					PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
					copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_WgRqst_Chk02_DtlR());
					poSchdUpd01DtlR.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.RQST.value());
					poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					poSchdUpd01DtlR.itm_cd(wgRqstR.itm_cd());
					poSchdUpd01DtlR.itm_sub1(wgRqstR.itm_sub1());
					poSchdUpd01DtlR.itm_sub2(wgRqstR.itm_sub2());
					poSchdUpd01DtlR.itm_sub3(wgRqstR.itm_sub3());
					poSchdChk01.up0().add(poSchdUpd01DtlR);
				}
				else if(MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
					// 移動・移送予定サービスの更新前チェック用の上り電文を設定
					// 更新の場合、削除・新規で連携
					XfrSchdChk04_DtlR xfrSchdChk04DtlR = XfrSchdChk04_DtlR.create();
					copy(xfrSchdChk04DtlR, r, createMap_XfrSchdChk04_DtlR_WgRqst_Chk02_DtlR());
					xfrSchdChk04DtlR.itm_cd(wgRqstR.itm_cd());
					xfrSchdChk04DtlR.itm_sub1(wgRqstR.itm_sub1());
					xfrSchdChk04DtlR.itm_sub2(wgRqstR.itm_sub2());
					xfrSchdChk04DtlR.itm_sub3(wgRqstR.itm_sub3());
					xfrSchdChk04DtlR.gr_loc_cd(wgRqstR.gr_loc_cd());
					xfrSchdChk04DtlR.xfr_src_typ(MSC_XFR_SRC_TYP.WG_RQST.value());
					xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					xfrSchdChk04DtlR.xfr_src_no(r.wg_rqst_prms_no());
					xfrSchdChk04.up0().add(xfrSchdChk04DtlR);

					xfrSchdChk04DtlR = xfrSchdChk04DtlR.clone();
					xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
					
					// 移動・移送予定の補完処理の上り電文を設定
					XfrSchdEx_DtlR xfrSchdExDtlR = XfrSchdEx_DtlR.create();
					copy(xfrSchdExDtlR, wgRqstR, createMap_XfrSchdEx_DtlR_MST_WG_RQST_R());
					xfrSchdExDtlR.setAttributes(r);
					xfrSchdExDtlR.peg_no(r.peg_no());
					//出庫場所は入力の依頼回答内容を使用する。出庫物流グループは呼び出し先で出庫場所から補完。
					xfrSchdExDtlR.gi_loc_cd(r.gi_loc_cd());
					xfrSchdExDtlR.gi_lg_grp_cd(null);
					xfrSchdSprt01.up0().add(xfrSchdExDtlR);
				}
			}
			for(WgRqst_Chk02_DtlR r : delSchdL) {
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(wgRqstKey, r.wg_rqst_no());

				if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ())) {
					// 発注予定登録サービスの更新前チェック用の上り電文を設定
					PoSchd_Upd01_DtlR poSchdUpd01DtlR = PoSchd_Upd01_DtlR.create();
					copy(poSchdUpd01DtlR, r, createMap_PoSchd_Upd01_DtlR_WgRqst_Chk02_DtlR());
					poSchdUpd01DtlR.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.RQST.value());
					poSchdUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					poSchdUpd01DtlR.itm_cd(wgRqstR.itm_cd());
					poSchdUpd01DtlR.itm_sub1(wgRqstR.itm_sub1());
					poSchdUpd01DtlR.itm_sub2(wgRqstR.itm_sub2());
					poSchdUpd01DtlR.itm_sub3(wgRqstR.itm_sub3());
					poSchdChk01.up0().add(poSchdUpd01DtlR);
				}
				else if(MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
					// 移動・移送予定サービスの更新前チェック用の上り電文を設定
					XfrSchdChk04_DtlR xfrSchdChk04DtlR = XfrSchdChk04_DtlR.create();
					copy(xfrSchdChk04DtlR, r, createMap_XfrSchdChk04_DtlR_WgRqst_Chk02_DtlR());
					xfrSchdChk04DtlR.itm_cd(wgRqstR.itm_cd());
					xfrSchdChk04DtlR.itm_sub1(wgRqstR.itm_sub1());
					xfrSchdChk04DtlR.itm_sub2(wgRqstR.itm_sub2());
					xfrSchdChk04DtlR.itm_sub3(wgRqstR.itm_sub3());
					xfrSchdChk04DtlR.gr_loc_cd(wgRqstR.gr_loc_cd());
					xfrSchdChk04DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					xfrSchdChk04DtlR.xfr_src_typ(MSC_XFR_SRC_TYP.WG_RQST.value());
					xfrSchdChk04DtlR.xfr_src_no(r.wg_rqst_prms_no());
					xfrSchdChk04.up0().add(xfrSchdChk04DtlR);
				}
			}
			
			// 発注予定登録サービスの更新前チェックを実行
			if (!poSchdChk01.up0().isEmpty()) {
				poSchdChk01.exec();
				
				// 依頼回答自体を訂正・取消する場合は、エラーとする。
				String[] destCols = new String[] {WgRqst_Chk02_DtlR.$err_flg};
				String[] srcCols = new String[] {PoSchd_Upd01_DtlR.$po_flg};
				copyByPegNo(up0(), destCols, poSchdChk01.down0(), srcCols);
				copyErrFlg(up0(), poSchdChk01.down0());
			}
			
			// 移動・移送予定サービスの補完処理を実行
			if(!xfrSchdSprt01.up0().isEmpty()) {
				xfrSchdSprt01.exec();
				
				copyErrFlg(up0(), xfrSchdSprt01.down0());
			}
			
			// 移動・移送予定サービスのチェックを実行
			if (!xfrSchdChk04.up0().isEmpty()) {
				xfrSchdChk04.exec();
				
				copyErrFlg(up0(), xfrSchdChk04.down0());
			}
		}

		/**
		 * 前回の回答内容と今回の回答内容が変わっているか判断する
		 * @param wgRqstPrmsR 前回の回答内容
		 * @param r　今回の回答内容
		 * @return boolean 変更があるかどうか
		 */
		protected boolean mainColChg(MST_WG_RQST_PRMS_R wgRqstPrmsR, WgRqst_Chk02_DtlR r) {
			if(isNull(wgRqstPrmsR)
				|| !isSame(wgRqstPrmsR.fix_flg(), r.fix_flg())
				|| !isSame(wgRqstPrmsR.prms_trd_unit_cd(), r.prms_trd_unit_cd())
				|| !isSame(wgRqstPrmsR.prms_trd_unit_qty(), r.prms_trd_unit_qty())
				|| !isSame(wgRqstPrmsR.gr_schd_tm(), r.gr_schd_tm())
				|| !isSame(wgRqstPrmsR.gi_loc_cd(), r.gi_loc_cd())
				|| !isSame(wgRqstPrmsR.gi_str_ln_cd(), r.gi_str_ln_cd())
				|| !isSame(wgRqstPrmsR.gi_rqst_tm(), r.gi_rqst_tm())
				|| !isSame(wgRqstPrmsR.sppl_cd(), r.sppl_cd())
				|| !isSame(wgRqstPrmsR.maker_cd(), r.maker_cd())
				|| !isSame(wgRqstPrmsR.mfg_loc_cd(), r.mfg_loc_cd())
				|| !isSame(wgRqstPrmsR.bom_ptn(), r.bom_ptn())
			) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * 仕入直送に対するチェック
		 * @param tgtWgRqstL
		 */
		protected void chkPurcDdlv(MCList<MST_WG_RQST_R> tgtWgRqstL) {
			MCList<MST_WG_RQST_R> chkTmpL = MCList.create(MST_WG_RQST_R.class);
			MCQueryApiBuilder chkTmpL_bldr1 = MCQueryApiBuilder.create(MST_WG_RQST_R.create("T"));
			dbWkDelete("MSBAL5100_MSW_WG_RQST_D01", chkTmpL_bldr1.getBaseDbc());
			
			for(MST_WG_RQST_R wgRqstR : tgtWgRqstL) {
				if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ()) && !isNull(wgRqstR.dlv_cd())) {
					chkTmpL.add(wgRqstR);
				}
			}
			if(chkTmpL.isEmpty()) {
				return;
			}
			dbWkInsert("MSBAL5100_MSW_WG_RQST_I01", chkTmpL, chkTmpL_bldr1.getBaseDbc());
			
			MCList<MST_WG_RQST_PRMS_R> wkWgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MCQueryApiBuilder wkWgRqstPrmsL_bldr2 = MCQueryApiBuilder.create(MST_WG_RQST_PRMS_R.create("T"));
			dbWkDelete("MSBAL5100_MSW_WG_RQST_PRMS_D02", wkWgRqstPrmsL_bldr2.getBaseDbc());
			for(WgRqst_Chk02_DtlR r : up0()) {
				if(!isNull(r.wg_rqst_prms_no())) {
					MST_WG_RQST_PRMS_R wgRqstPrmsR = MST_WG_RQST_PRMS_R.create();
					wgRqstPrmsR.wg_rqst_prms_no(r.wg_rqst_prms_no());
					wkWgRqstPrmsL.add(wgRqstPrmsR);
				}
			}
			dbWkInsert("MSBAL5100_MSW_WG_RQST_PRMS_I02", wkWgRqstPrmsL, wkWgRqstPrmsL_bldr2.getBaseDbc());
			
			MCList<MST_WG_RQST_PRMS_R> chkWgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MST_WG_RQST_PRMS_R t3 = MST_WG_RQST_PRMS_R.create("T");
			MCQueryApiBuilder chkWgRqstPrmsL_bldr3 = MCQueryApiBuilder.create(t3);
			MSW_WG_RQST_KEY_R wg = MSW_WG_RQST_KEY_R.create("T2");
			MSW_WG_RQST_PRMS_KEY_R S1TMP = MSW_WG_RQST_PRMS_KEY_R.create("TMP");
			chkWgRqstPrmsL_bldr3.setSelect(t3.wg_rqst_no);
			chkWgRqstPrmsL_bldr3.addSelect(t3.wg_rqst_prms_no);
			chkWgRqstPrmsL_bldr3.addSelect(t3.fix_flg);
			chkWgRqstPrmsL_bldr3.addInnerJoin(wg, bracket( wg.wg_rqst_no.eq(t3.wg_rqst_no)));
			chkWgRqstPrmsL_bldr3.setWhere(notExists( subQuery() .select(nullValue()) .from(S1TMP)
					.where(value(0).eq(value(0))
							.and(S1TMP.wg_rqst_prms_no.eq(t3.wg_rqst_prms_no)))));
			dbSelect("MSBAL5100_MST_WG_RQST_PRMS_S06", chkWgRqstPrmsL, chkWgRqstPrmsL_bldr3);
			
			// 仕入直送の場合、確定フラグがオンの回答が一件であり、数量も依頼通りでないとエラー
			MCIndexKey up0Key = up0().createIndex(WgRqst_Chk02_DtlR.$wg_rqst_no);
			MCIndexKey wgRqstPrmsKey = chkWgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no);
			for(MST_WG_RQST_R r : chkTmpL) {
				MCNumber fixCnt = MCNumber.ZERO;
				MCNumber prmsQty = MCNumber.ZERO;
				
				for(WgRqst_Chk02_DtlR up0 : up0().subList(up0Key, r.wg_rqst_no())) {
					if(up0.fix_flg() && !MAC_DATA_CRUD_TYP.isDEL(up0.data_crud_typ())) {
						fixCnt = fixCnt.add(1);
						prmsQty = prmsQty.add(up0.prms_base_unit_qty());
					}
				}
				
				MCList<MST_WG_RQST_PRMS_R> tmpWgRqstPrmsL = chkWgRqstPrmsL.subList(wgRqstPrmsKey, r.wg_rqst_no());
				for(MST_WG_RQST_PRMS_R wgRqstPrmsR : tmpWgRqstPrmsL) {
					if(wgRqstPrmsR.fix_flg()) {
						fixCnt = fixCnt.add(1);
						prmsQty = prmsQty.add(wgRqstPrmsR.prms_base_unit_qty());
					}
				}
				
				if(fixCnt.gt(MCNumber.ONE) || (!prmsQty.isZero() && !isSame(r.base_unit_qty(), prmsQty))) {
					for(WgRqst_Chk02_DtlR up0 : up0().subList(up0Key, r.wg_rqst_no())) {
						up0.err_flg(true);
					}
					WgRqst_Chk02_DtlR up0 = up0().getFirst(up0Key, r.wg_rqst_no());
					MCMessagePool.add(new MCMessage(up0, null, MSBAL0022, r.wg_rqst_no(), toDispGUIIndex(up0)));
				}
			}
		}
		
		/**
		 * オーダ登録サービス予定日計算用のマスタ参照日付が取得出来るかチェック
		 */
		protected void chkOrdSprt03MstrDt(MCList<MST_WG_RQST_R> tgtWgRqstL) {
			MCIndexKey up1Key = up0().createIndex(WgRqst_Chk02_DtlR.$wg_rqst_no);
			MCList<MST_ITM_ORDER_R> itmOrdL = getItmOrdL(tgtWgRqstL);
			MCIndexKey itmOrdKey = itmOrdL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (MST_WG_RQST_R r : tgtWgRqstL) {
				WgRqst_Chk02_DtlR updR = up0().getFirst(up1Key, r.wg_rqst_no());
				
				if (isNull(updR)
					|| MSC_WG_RQST_TYP.isSHIP(r.wg_rqst_typ())
					|| MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					//  処理対象でない場合、出荷依頼・移送依頼の場合はチェックしない
					continue;
				}
				MST_ITM_ORDER_R itmOrdR = itmOrdL.getFirst(itmOrdKey, r.itm_ord_no());
				if (isCmplSchdDtByOrd(r, MAC_DATA_CRUD_TYP.UPD.value(), itmOrdR)) {
					// オーダから予定日を補完するときはチェックしない
					continue;
				}
				r.setNumberNE(WgRqst_Chk02_DtlR.$peg_no, updR.peg_no());
				
				MCDate dt = getMasterDate(r);
				if (isNull(dt)) {
					updR.err_flg(true);
						MCMessagePool.add(
							new MCMessage(updR, null, MSBAL0101,
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								r.gr_loc_wg_cd(),
								r.sppl_cd(),
								r.maker_cd(),
								r.mfg_loc_cd(),
								r.bom_ptn(),
								toYMDHMSString(r.gr_rqst_tm()),
								toDispGUIIndex(updR))
						);
				}
			}
		}

		protected Map_PoSchd_Upd01_DtlR_WgRqst_Chk02_DtlR<PoSchd_Upd01_DtlR,WgRqst_Chk02_DtlR> _map_PoSchd_Upd01_DtlR_WgRqst_Chk02_DtlR = null;
		protected Map_PoSchd_Upd01_DtlR_WgRqst_Chk02_DtlR<PoSchd_Upd01_DtlR,WgRqst_Chk02_DtlR> createMap_PoSchd_Upd01_DtlR_WgRqst_Chk02_DtlR() {
			if (_map_PoSchd_Upd01_DtlR_WgRqst_Chk02_DtlR == null) {
				_map_PoSchd_Upd01_DtlR_WgRqst_Chk02_DtlR = new Map_PoSchd_Upd01_DtlR_WgRqst_Chk02_DtlR<PoSchd_Upd01_DtlR, WgRqst_Chk02_DtlR>();
			}
			return _map_PoSchd_Upd01_DtlR_WgRqst_Chk02_DtlR;
		}

		public class Map_PoSchd_Upd01_DtlR_WgRqst_Chk02_DtlR<D extends PoSchd_Upd01_DtlR, S extends WgRqst_Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoSchd_Upd01_DtlR.$peg_no, WgRqst_Chk02_DtlR.$peg_no);
				addColumnPathMap(PoSchd_Upd01_DtlR.$data_crud_typ, WgRqst_Chk02_DtlR.$data_crud_typ);
				addColumnPathMap(PoSchd_Upd01_DtlR.$po_schd_src_no, WgRqst_Chk02_DtlR.$wg_rqst_prms_no);
			}
		}
		
		protected Map_XfrSchdChk04_DtlR_WgRqst_Chk02_DtlR<XfrSchdChk04_DtlR,WgRqst_Chk02_DtlR> _map_XfrSchdChk04_DtlR_WgRqst_Chk02_DtlR = null;
		protected Map_XfrSchdChk04_DtlR_WgRqst_Chk02_DtlR<XfrSchdChk04_DtlR,WgRqst_Chk02_DtlR> createMap_XfrSchdChk04_DtlR_WgRqst_Chk02_DtlR() {
			if (_map_XfrSchdChk04_DtlR_WgRqst_Chk02_DtlR == null) {
				_map_XfrSchdChk04_DtlR_WgRqst_Chk02_DtlR = new Map_XfrSchdChk04_DtlR_WgRqst_Chk02_DtlR<XfrSchdChk04_DtlR, WgRqst_Chk02_DtlR>();
			}
			return _map_XfrSchdChk04_DtlR_WgRqst_Chk02_DtlR;
		}

		public class Map_XfrSchdChk04_DtlR_WgRqst_Chk02_DtlR<D extends XfrSchdChk04_DtlR, S extends WgRqst_Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, WgRqst_Chk02_DtlR.$peg_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$data_crud_typ, WgRqst_Chk02_DtlR.$data_crud_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_loc_cd, WgRqst_Chk02_DtlR.$gi_loc_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_rqst_tm, WgRqst_Chk02_DtlR.$gi_rqst_tm);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_rqst_tm, WgRqst_Chk02_DtlR.$gr_schd_tm);
			}
		}
		
		protected Map_XfrSchdEx_DtlR_MST_WG_RQST_R<XfrSchdEx_DtlR,MST_WG_RQST_R> _map_XfrSchdEx_DtlR_MST_WG_RQST_R = null;
		protected Map_XfrSchdEx_DtlR_MST_WG_RQST_R<XfrSchdEx_DtlR,MST_WG_RQST_R> createMap_XfrSchdEx_DtlR_MST_WG_RQST_R() {
			if (_map_XfrSchdEx_DtlR_MST_WG_RQST_R == null) {
				_map_XfrSchdEx_DtlR_MST_WG_RQST_R = new Map_XfrSchdEx_DtlR_MST_WG_RQST_R<XfrSchdEx_DtlR, MST_WG_RQST_R>();
			}
			return _map_XfrSchdEx_DtlR_MST_WG_RQST_R;
		}

		public class Map_XfrSchdEx_DtlR_MST_WG_RQST_R<D extends XfrSchdEx_DtlR, S extends MST_WG_RQST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdEx_DtlR.$gi_loc_cd, MST_WG_RQST_R.$gi_loc_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$gi_lg_grp_cd, MST_WG_RQST_R.$gi_lg_grp_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$gr_loc_cd, MST_WG_RQST_R.$gr_loc_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_cd, MST_WG_RQST_R.$itm_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_sub1, MST_WG_RQST_R.$itm_sub1);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_sub2, MST_WG_RQST_R.$itm_sub2);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_sub3, MST_WG_RQST_R.$itm_sub3);
				addColumnPathMap(XfrSchdEx_DtlR.$gi_schd_dt, MST_WG_RQST_R.$gi_rqst_tm);
				addColumnPathMap(XfrSchdEx_DtlR.$gr_schd_dt, MST_WG_RQST_R.$gr_rqst_tm);
			}
		}
	}
	
	/**
	 * WgRqst_Upd02オペレーション.<p>
	 * ＜ＷＧ間依頼回答の登録、更新、削除＞
	 */
	public class WgRqst_Upd02 extends MSBAL_WgRqstService_MC_A.WgRqst_Upd02 {
		// 回答が通知されたリスト
		protected MCList<MST_WG_RQST_R> _push1L = MCList.create(MST_WG_RQST_R.class);
		// 回答が通知から非通知されたリスト
		protected MCList<MST_WG_RQST_R> _push2L = MCList.create(MST_WG_RQST_R.class);
		// 回答数が不足しているリスト
		protected MCList<MST_WG_RQST_R> _push3L = MCList.create(MST_WG_RQST_R.class);
		// 納期が遅れている回答があるリスト
		protected MCList<MST_WG_RQST_R> _push4L = MCList.create(MST_WG_RQST_R.class);
		// 品目オーダ情報のリスト
		protected MCList<MST_ITM_ORDER_R> _itmOrdL = MCList.create(MST_ITM_ORDER_R.class);
		protected MCIndexKey _itmOrdKey = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<MST_WG_RQST_R> bindL = MCList.create(MST_WG_RQST_R.class);
			for(WgRqst_Upd02_Dtl1R r : up0()) {
				MST_WG_RQST_R wgRqstR = MST_WG_RQST_R.create();
				wgRqstR.wg_rqst_no(r.wg_rqst_no());
				bindL.add(wgRqstR);
			}
			for(WgRqst_Upd02_Dtl2R r : up1().groupBy(WgRqst_Upd02_Dtl2R.$wg_rqst_no)) {
				MST_WG_RQST_R wgRqstR = MST_WG_RQST_R.create();
				wgRqstR.wg_rqst_no(r.wg_rqst_no());
				bindL.add(wgRqstR);
			}
			
			MCList<MST_WG_RQST_R> tgtWgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t1 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder tgtWgRqstL_bldr1 = MCQueryApiBuilder.create(t1);
			tgtWgRqstL_bldr1.setWhere(t1.wg_rqst_no.eq(bind("wg_rqst_no")));
			dbSelectKey("MSBAL5100_MST_WG_RQST_S06", tgtWgRqstL, tgtWgRqstL_bldr1, bindL.groupBy(MST_WG_RQST_R.$wg_rqst_no));
			
			// 更新前のＷＧ間依頼回答を取得
			MCList<MST_WG_RQST_PRMS_R> tmpWgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			
			MCList<WgRqst_Upd02_Dtl2R> screenCrctL = up1().subList(WgRqst_Upd02_Dtl2R.$screen_crct_flg, true);
			String[] keys = new String[] {WgRqst_Upd02_Dtl2R.$fix_flg, WgRqst_Upd02_Dtl2R.$last_fix_flg, WgRqst_Upd02_Dtl2R.$schd_cng_flg};
			Comparable[] vals = new Comparable[] {true, true, true};
			for (WgRqst_Upd02_Dtl2R r : screenCrctL.subList(keys, vals)) {
				MST_WG_RQST_PRMS_R wgRqstPrmsR = MST_WG_RQST_PRMS_R.create();
				wgRqstPrmsR.wg_rqst_prms_no(r.wg_rqst_prms_no());
				tmpWgRqstPrmsL.add(wgRqstPrmsR);
			}
			
			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsBfL = MCList.create(MST_WG_RQST_PRMS_R.class);
			if (!tmpWgRqstPrmsL.isEmpty()) {
				MCQueryApiBuilder tmpWgRqstPrmsL_bldr = MCQueryApiBuilder.create(MST_WG_RQST_PRMS_R.create("T"));
				dbWkDelete("MSBAL5100_MSW_WG_RQST_PRMS_D03", tmpWgRqstPrmsL_bldr.getBaseDbc());
				dbWkInsert("MSBAL5100_MSW_WG_RQST_PRMS_I03", tmpWgRqstPrmsL, tmpWgRqstPrmsL_bldr.getBaseDbc());

				MST_WG_RQST_PRMS_R t2 = MST_WG_RQST_PRMS_R.create("T");
				MCQueryApiBuilder wgRqstPrmsBfL_bldr2 = MCQueryApiBuilder.create(t2);
				MSW_WG_RQST_PRMS_KEY_R wg = MSW_WG_RQST_PRMS_KEY_R.create("KEY");
				wgRqstPrmsBfL_bldr2.addInnerJoin(wg, bracket( wg.wg_rqst_prms_no.eq(t2.wg_rqst_prms_no)));

				dbSelect("MSBAL5100_MST_WG_RQST_PRMS_S07", wgRqstPrmsBfL, wgRqstPrmsBfL_bldr2);
			}
			
			_itmOrdL = getItmOrdL(tgtWgRqstL);
			_itmOrdKey = _itmOrdL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			
			// ＷＧ間依頼回答を登録
			regWgRqstPrms();
			
			// ＷＧ間依頼を更新
			updWgRqst(tgtWgRqstL);
			
			// 出荷・供給依頼サービスを実行
			regSchd(tgtWgRqstL, wgRqstPrmsBfL);
			
			// 受注明細を更新
			updSloD(tgtWgRqstL);
			
			// ＷＧ間依頼の依頼残数量を更新
			setNotCmplQty();
			
			// ＷＧ間依頼の状況を更新
			updSts();
			
			// 更新後のＷＧ間依頼情報を再取得
			tgtWgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t4 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder tgtWgRqstL_bldr4 = MCQueryApiBuilder.create(t4);
			tgtWgRqstL_bldr4.setWhere(t4.wg_rqst_no.eq(bind("wg_rqst_no")));
			dbSelectKey("MSBAL5100_MST_WG_RQST_S07", tgtWgRqstL, tgtWgRqstL_bldr4,
					bindL.groupBy(MST_WG_RQST_R.$wg_rqst_no));
			
			// プッシュ通知対象データを取得し、プッシュ通知を行う
			getAlertTgt(tgtWgRqstL);
			pushSendMessage();
			
			// 下り電文を設定
			down0().setAll(up0());
			down1().setAll(up1());
		}

		/**
		* ＷＧ間依頼回答の登録、更新、削除を行う
		*/
		protected void regWgRqstPrms() {
			MCList<MST_WG_RQST_PRMS_R> insL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MCList<MST_WG_RQST_PRMS_R> updL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MCList<MST_WG_RQST_PRMS_R> delL = MCList.create(MST_WG_RQST_PRMS_R.class);
			
			doSeqCache(MSC_NUM_SYS_TYP.WGRQSTPRMS, up1().subList(WgRqst_Upd02_Dtl2R.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size());

			for(WgRqst_Upd02_Dtl2R r : up1()) {
				if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// ＷＧ間依頼回答ＮＯを発番
					r.wg_rqst_prms_no(getStrSeq(MSC_NUM_SYS_TYP.WGRQSTPRMS));
					insL.add(r.wg_rqst_prms());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if(!r.fix_flg()) {
						r.fix_dt(null);
					}
					updL.add(r.wg_rqst_prms());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r.wg_rqst_prms());
				}
			}
			
			if (!insL.isEmpty()) {
				dbInsertEx("MSBAL5100_MST_WG_RQST_PRMS_I01", insL,
						MCQueryApiBuilder.create(MST_WG_RQST_PRMS_R.create("T")));
			}
			if (!updL.isEmpty()) {
				MST_WG_RQST_PRMS_R t = MST_WG_RQST_PRMS_R.create("T");
				MCQueryApiBuilder updL_bldr2 = MCQueryApiBuilder.create(t);
				editUpdSetStmt(updL, t, updL_bldr2);
				dbUpdateKey("MSBAL5100_MST_WG_RQST_PRMS_U01", updL, updL_bldr2);
			}
			if (!delL.isEmpty()) {
				dbDeleteKey("MSBAL5100_MST_WG_RQST_PRMS_D01", delL,
						MCQueryApiBuilder.create(MST_WG_RQST_PRMS_R.create("T")));
			}
		}

		/**
		 * 更新時のset句の編集
		 * @param updL 更新対象のリスト
		 */
		protected void editUpdSetStmt(MCList<MST_WG_RQST_PRMS_R> updL , MST_WG_RQST_PRMS_R t2, MCQueryApiBuilder updL_bldr2) {
			
			updL_bldr2.setSet(
					t2.wg_rqst_no,
					t2.wg_cd,
					t2.fix_flg,
					t2.fix_dt,
					t2.prms_trd_unit_qty,
					t2.prms_trd_unit_cd,
					t2.prms_base_unit_qty,
					t2.prms_base_unit_cd,
					t2.gr_schd_tm,
					t2.gi_lg_grp_cd,
					t2.gi_loc_cd,
					t2.gi_str_ln_cd,
					t2.gi_rqst_tm,
					t2.sppl_cd,
					t2.maker_cd,
					t2.mfg_loc_cd,
					t2.bom_ptn,
					t2.can_flg,
					t2.prms_rmrks,
					t2.intr_rmrks,
					t2.sub_char1,
					t2.sub_char2,
					t2.sub_char3
					);
		}

		
		/**
		 * 回答が通知、再通知された場合は、ＷＧ間依頼の関連項目を更新する。
		 * @param tgtWgRqstL ＷＧ間依頼のリスト
		 */
		protected void updWgRqst(MCList<MST_WG_RQST_R> tgtWgRqstL) {
			MCList<MST_WG_RQST_R> updWgRqstL = MCList.create(MST_WG_RQST_R.class);
			MCIndexKey key = tgtWgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_no);
			MSBBL_SloStsRegService.SloSts_Ins01 sloStsIns01 = MSBBL_SloStsRegService.crtSloSts_Ins01();
			
			// 回答通知
			for(WgRqst_Upd02_Dtl1R r : up0().subList(WgRqst_Upd02_Dtl2R.$prms_ntc_flg, true)) {
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(key, r.wg_rqst_no());
				if(!isNull(wgRqstR)) {
					if(!wgRqstR.prms_ntc_flg() || !isSame(wgRqstR.prms_dt(), r.prms_dt())) {
						MST_WG_RQST_R updWgRqstR = MST_WG_RQST_R.create();
						updWgRqstR.prms_ntc_flg(true);
						updWgRqstR.prms_dt(r.prms_dt());
						updWgRqstR.re_prms_ntc_flg(r.re_prms_ntc_flg());
						updWgRqstR.re_prms_dt(r.re_prms_dt());
						if (!r.auto_prms_tgt_flg()) {
							updWgRqstR.prms_uncn_flg(true);
						}
						updWgRqstR.re_rqst_flg(false);
						updWgRqstR.re_rqst_dt(null);
						updWgRqstR.rqst_crrct_flg(false);
						updWgRqstR.rqst_crrct_dt(null);
						updWgRqstR.wg_rqst_no(r.wg_rqst_no());
						// プッシュ通知用
						wgRqstR.prms_dt(r.prms_dt());
						updWgRqstR.rqst_fr_wg_cd(wgRqstR.rqst_fr_wg_cd());
						updWgRqstR.rqst_to_wg_cd(wgRqstR.rqst_to_wg_cd());
						updWgRqstL.add(updWgRqstR);
						if(!r.auto_prms_flg()) {
							_push1L.add(updWgRqstR);
						}
					}
				}
			}
			if(!updWgRqstL.isEmpty()) {
				MST_WG_RQST_R t1 = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder updWgRqstL_bldr1 = MCQueryApiBuilder.create(t1);
				updWgRqstL_bldr1.setSet(t1.prms_ntc_flg);
				updWgRqstL_bldr1.addSet(t1.prms_dt);
				updWgRqstL_bldr1.addSet(t1.re_prms_ntc_flg);
				updWgRqstL_bldr1.addSet(t1.re_prms_dt);
				updWgRqstL_bldr1.addSet(t1.prms_uncn_flg);
				updWgRqstL_bldr1.addSet(t1.re_rqst_flg);
				updWgRqstL_bldr1.addSet(t1.re_rqst_dt);
				updWgRqstL_bldr1.addSet(t1.rqst_crrct_flg);
				updWgRqstL_bldr1.addSet(t1.rqst_crrct_dt);
				dbUpdateKey("MSBAL5100_MST_WG_RQST_U04", updWgRqstL, updWgRqstL_bldr1);
			}

			for(WgRqst_Upd02_Dtl1R r : up0().subList(WgRqst_Upd02_Dtl2R.$prms_ntc_flg, true)) {
				// 受注状況更新サービスの上り電文を設定
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(key, r.wg_rqst_no());
				if(!isNull(wgRqstR) && !isNull(wgRqstR.slo_d_no())) {
					if (MSC_WG_RQST_SRC_TYP.isSLO(wgRqstR.wg_rqst_src_typ())
							|| MSC_WG_RQST_SRC_TYP.isSHIP(wgRqstR.wg_rqst_src_typ())) {

						// 回答通知ＦＬＧがオン→オンの場合は回答取消のステータスを追加する
						if(wgRqstR.prms_ntc_flg() && r.prms_ntc_flg()) {
							SloSts_DtlR sloStsDtlR = SloSts_DtlR.create();
							sloStsDtlR = SloSts_DtlR.create();
							sloStsDtlR.wg_rqst_no(r.wg_rqst_no());
							sloStsDtlR.slo_d_no(wgRqstR.slo_d_no());
							// 供給依頼か出荷依頼か判断する
							if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
								sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST_PRMS_CAN.value());
							}
							else {
								sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_RQST_PRMS_CAN.value());
							}
							sloStsIns01.up0().add(sloStsDtlR);
						}
						// 回答のステータスを追加する
						SloSts_DtlR sloStsDtlR = SloSts_DtlR.create();
						sloStsDtlR = SloSts_DtlR.create();
						sloStsDtlR.wg_rqst_no(r.wg_rqst_no());
						sloStsDtlR.slo_d_no(wgRqstR.slo_d_no());
						// 供給依頼か出荷依頼か判断する
						if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
							sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST_PRMS.value());
						}
						else {
							sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_RQST_PRMS.value());
						}
						sloStsIns01.up0().add(sloStsDtlR);
					}
				}
			}

			// 回答再通知
			updWgRqstL = MCList.create(MST_WG_RQST_R.class);
			for(WgRqst_Upd02_Dtl1R r : up0().subList(WgRqst_Upd02_Dtl1R.$re_prms_ntc_flg, true)) {
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(key, r.wg_rqst_no());
				if(!isNull(wgRqstR)) {
					MST_WG_RQST_R updWgRqstR = MST_WG_RQST_R.create();
					updWgRqstR.re_prms_ntc_flg(true);
					updWgRqstR.re_prms_dt(r.re_prms_dt());
					updWgRqstR.prms_uncn_flg(true);
					updWgRqstR.re_rqst_flg(false);
					updWgRqstR.re_rqst_dt(null);
					updWgRqstR.rqst_crrct_flg(false);
					updWgRqstR.rqst_crrct_dt(null);
					updWgRqstR.wg_rqst_no(r.wg_rqst_no());
					// プッシュ通知用
					updWgRqstR.rqst_fr_wg_cd(wgRqstR.rqst_fr_wg_cd());
					updWgRqstR.rqst_to_wg_cd(wgRqstR.rqst_to_wg_cd());
					updWgRqstR.prms_dt(r.prms_dt());
					updWgRqstL.add(updWgRqstR);
					if(!r.auto_prms_flg()) {
						_push1L.add(updWgRqstR);
					}
				}
			}
			if(!updWgRqstL.isEmpty()) {
				MST_WG_RQST_R t2 = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder updWgRqstL_bldr2 = MCQueryApiBuilder.create(t2);
				updWgRqstL_bldr2.setSet(t2.re_prms_ntc_flg);
				updWgRqstL_bldr2.addSet(t2.re_prms_dt);
				updWgRqstL_bldr2.addSet(t2.prms_uncn_flg);
				updWgRqstL_bldr2.addSet(t2.re_rqst_flg);
				updWgRqstL_bldr2.addSet(t2.re_rqst_dt);
				updWgRqstL_bldr2.addSet(t2.rqst_crrct_flg);
				updWgRqstL_bldr2.addSet(t2.rqst_crrct_dt);
				dbUpdateKey("MSBAL5100_MST_WG_RQST_U05", updWgRqstL, updWgRqstL_bldr2);
			}

			// 回答通知から非通知になった場合
			updWgRqstL = MCList.create(MST_WG_RQST_R.class);
			MCIndexKey up1Key = up1().createIndex(WgRqst_Upd02_Dtl2R.$prms_ntc_flg, WgRqst_Upd02_Dtl2R.$auto_prms_flg);
			for(WgRqst_Upd02_Dtl2R r : up1().subList(up1Key, false, false).groupBy(WgRqst_Upd02_Dtl2R.$wg_rqst_no)) {
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(key, r.wg_rqst_no());
				if(!isNull(wgRqstR)) {
					if(wgRqstR.prms_ntc_flg()) {
						MST_WG_RQST_R updWgRqstR = MST_WG_RQST_R.create();
						updWgRqstR.prms_ntc_flg(false);
						updWgRqstR.prms_dt(null);
						updWgRqstR.re_prms_ntc_flg(false);
						updWgRqstR.re_prms_dt(null);
						updWgRqstR.prms_uncn_flg(false);
						updWgRqstR.prms_can_dt(getToday());
						updWgRqstR.wg_rqst_no(r.wg_rqst_no());
						updWgRqstL.add(updWgRqstR);
						_push2L.add(wgRqstR);
					}
				}
			}
			if(!updWgRqstL.isEmpty()) {
				MST_WG_RQST_R t3 = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder updWgRqstL_bldr3 = MCQueryApiBuilder.create(t3);
				updWgRqstL_bldr3.setSet(t3.prms_ntc_flg);
				updWgRqstL_bldr3.addSet(t3.prms_dt);
				updWgRqstL_bldr3.addSet(t3.re_prms_ntc_flg);
				updWgRqstL_bldr3.addSet(t3.re_prms_dt);
				updWgRqstL_bldr3.addSet(t3.prms_uncn_flg);
				updWgRqstL_bldr3.addSet(t3.prms_can_dt);
				dbUpdateKey("MSBAL5100_MST_WG_RQST_U06", updWgRqstL, updWgRqstL_bldr3);
			}

			for(MST_WG_RQST_R r : updWgRqstL) {
				// 受注状況更新サービスの上り電文を設定
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(key, r.wg_rqst_no());
				if (!isNull(wgRqstR) && !isNull(wgRqstR.slo_d_no())) {
					if(MSC_WG_RQST_SRC_TYP.isSLO(wgRqstR.wg_rqst_src_typ()) ||
					MSC_WG_RQST_SRC_TYP.isSHIP(wgRqstR.wg_rqst_src_typ())) {
						SloSts_DtlR sloStsDtlR = SloSts_DtlR.create();
						sloStsDtlR.wg_rqst_no(r.wg_rqst_no());
						sloStsDtlR.slo_d_no(wgRqstR.slo_d_no());
						// 供給依頼か出荷依頼か判断する
						if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
							sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RQST_PRMS_CAN.value());
						}
						else {
							sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_RQST_PRMS_CAN.value());
						}
						sloStsIns01.up0().add(sloStsDtlR);
					}
				}
			}

			// 回答通知が変更なし、かつ、再通知がオンからオフになった場合
			updWgRqstL = MCList.create(MST_WG_RQST_R.class);
			for(WgRqst_Upd02_Dtl1R r : up0().subList(WgRqst_Upd02_Dtl2R.$re_prms_ntc_flg, false)) {
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(key, r.wg_rqst_no());
				if(!isNull(wgRqstR)) {
					if(isSame(r.prms_ntc_flg(), wgRqstR.prms_ntc_flg()) && wgRqstR.re_prms_ntc_flg()) {
						MST_WG_RQST_R updWgRqstR = MST_WG_RQST_R.create();
						updWgRqstR.re_prms_ntc_flg(false);
						updWgRqstR.re_prms_dt(null);
						updWgRqstR.wg_rqst_no(r.wg_rqst_no());
						updWgRqstL.add(updWgRqstR);
					}
				}
			}
			if(!updWgRqstL.isEmpty()) {
				MST_WG_RQST_R t4 = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder updWgRqstL_bldr4 = MCQueryApiBuilder.create(t4);
				updWgRqstL_bldr4.setSet(t4.re_prms_ntc_flg);
				updWgRqstL_bldr4.addSet(t4.re_prms_dt);
				dbUpdateKey("MSBAL5100_MST_WG_RQST_U07", updWgRqstL, updWgRqstL_bldr4);
			}

			// 受注状況更新サービスを実行
			if(!sloStsIns01.up0().isEmpty()) {
				sloStsIns01.exec();
			}
		}
		
		/**
		 * 回答が通知、再通知された場合は、受注明細の関連項目を更新する。
		 * @param tgtWgRqstL 更新前のＷＧ間依頼のリスト
		 */
		protected void updSloD(MCList<MST_WG_RQST_R> tgtWgRqstL) {
			
			MCList<MST_WG_RQST_R> tmp = tgtWgRqstL.createInstance();
			for (MST_WG_RQST_R tgtWgRqstR : tgtWgRqstL) {
				if (!isNull(tgtWgRqstR.slo_d_no()) && !MSC_WG_RQST_TYP.isSHIP(tgtWgRqstR.wg_rqst_typ())) {
					tmp.add(tgtWgRqstR);
				}
			}
			if (tmp.isEmpty()) {
				return;
			}
			
			// 更新後のＷＧ間依頼
			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t1 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder wgRqstL_bldr1 = MCQueryApiBuilder.create(t1);
			wgRqstL_bldr1.setSelect(t1.base_unit_qty);
			wgRqstL_bldr1.addSelect(t1.prms_ntc_flg);
			wgRqstL_bldr1.addSelect(t1.prms_dt);
			wgRqstL_bldr1.addSelect(t1.re_prms_dt);
			wgRqstL_bldr1.addSelect(t1.slo_d_no);
			wgRqstL_bldr1.addSelect(t1.slo_no);
			wgRqstL_bldr1.addSelect(t1.wg_rqst_no);
			dbSelectKey("MSBAL5100_MST_WG_RQST_S08", wgRqstL, wgRqstL_bldr1, tmp);

			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MST_WG_RQST_PRMS_R t2 = MST_WG_RQST_PRMS_R.create("T");
			MCQueryApiBuilder wgRqstPrmsL_bldr2 = MCQueryApiBuilder.create(t2);
			wgRqstPrmsL_bldr2.setSelect(t2.prms_base_unit_qty);
			wgRqstPrmsL_bldr2.addSelect(t2.wg_rqst_no);
			wgRqstPrmsL_bldr2.addSelect(trunc(t2.gr_schd_tm, MCDateFmt.DD).as("gr_schd_tm"));
			wgRqstPrmsL_bldr2.setWhere(t2.wg_rqst_no.eq(bind("wg_rqst_no")));
			wgRqstPrmsL_bldr2.addConstWhereWithAnd(t2.can_flg.eq(value(false)));
			dbSelect("MSBAL5100_MST_WG_RQST_PRMS_S08", wgRqstPrmsL, wgRqstPrmsL_bldr2,
					tmp.groupBy(MST_WG_RQST_R.$wg_rqst_no), null);
			
			MCIndexKey keyPrms = wgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no);

			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			
			// 回答通知
			for(MST_WG_RQST_R wgRqstR : wgRqstL.subList(MST_WG_RQST_R.$prms_ntc_flg, true)) {
				
				MCList<MST_WG_RQST_PRMS_R> prmsL = wgRqstPrmsL.subList(keyPrms, wgRqstR.wg_rqst_no());
				MCNumber prmsQty = prmsL.sum(MST_WG_RQST_PRMS_R.$prms_base_unit_qty);
				MCDate prmsDlvDt = (MCDate)prmsL.max(MST_WG_RQST_PRMS_R.$gr_schd_tm);
				
				MST_SLO_D_R sloDR = MST_SLO_D_R.create();
				sloDR.slo_d_no(wgRqstR.slo_d_no());
				sloDR.slo_no(wgRqstR.slo_no());
				if (!isNull(prmsQty) && prmsQty.gte(wgRqstR.base_unit_qty())) {
					sloDR.rqst_prms_dt(nvl(wgRqstR.re_prms_dt(), wgRqstR.prms_dt()));
					sloDR.rqst_prms_dlv_dt(prmsDlvDt);
				}
				sloDL.add(sloDR);
			}
			// 回答通知から非通知になった場合
			MCIndexKey keyTgtRqst = tgtWgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_no);

			for(MST_WG_RQST_R wgRqstR : wgRqstL.subList(MST_WG_RQST_R.$prms_ntc_flg, false)) {
				MST_WG_RQST_R tgtWgRqstR = tgtWgRqstL.getFirst(keyTgtRqst, wgRqstR.wg_rqst_no());
				if (tgtWgRqstR != null && tgtWgRqstR.prms_ntc_flg()) {
					MST_SLO_D_R sloDR = MST_SLO_D_R.create();
					sloDR.slo_d_no(wgRqstR.slo_d_no());
					sloDR.slo_no(wgRqstR.slo_no());
					sloDL.add(sloDR);
				}
			}
			
			if (!sloDL.isEmpty()) {
				MST_SLO_D_R t3 = MST_SLO_D_R.create("T");
				MCQueryApiBuilder sloDL_bldr3 = MCQueryApiBuilder.create(t3);
				sloDL_bldr3.setSet(t3.rqst_prms_dt);
				sloDL_bldr3.addSet(t3.rqst_prms_dlv_dt);
				dbUpdateKey("MSBAL5100_MST_SLO_D_U01", sloDL, sloDL_bldr3);
				crtSloKey(sloDL);
				callRevDataServiceIns01();
			}
		}

		/**
		 * 受注のワークテーブルを登録する
		 */
		protected void crtSloKey(MCList<MST_SLO_D_R>sloDL) {
			MCQueryApiBuilder wrkSloDL_bldr1 = MCQueryApiBuilder.create(MST_SLO_R.create("T"));
			dbWkDelete("MSBAL5100_MSW_SLO_D01", wrkSloDL_bldr1.getBaseDbc());
			dbWkInsert("MSBAL5100_MSW_SLO_I01", sloDL.groupBy(MST_SLO_R.$slo_no), wrkSloDL_bldr1.getBaseDbc());
		}

		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 受注改訂履歴テーブルを更新する。
		 * @param sloDL 受注明細
		 */
		protected void callRevDataServiceIns01() {
			MCList<MST_SLO_R> bindL = createBindRevDataIns01();
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
			for(MST_SLO_R bindR : bindL) {
				opeR.rev_data_src_no(bindR.slo_no());
				opeR.rev_no(bindR.slo_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SLO.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}

		/**
		 * 「改訂履歴データ更新リスト」の上り電文用にデータを取得する
		 * @return 
		 */
		protected MCList<MST_SLO_R> createBindRevDataIns01(){
			MCList<MST_SLO_R> bindL = MCList.create(MST_SLO_R.class);
			MST_SLO_R dbc = MST_SLO_R.create("T");
			MSW_SLO_KEY_R w1 = MSW_SLO_KEY_R.create("W1");
			
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSelect(
					dbc.slo_no,
					dbc.slo_rev
			);
			builder.addInnerJoin(w1, bracket(w1.slo_no.eq(dbc.slo_no)));
			dbSelect("MSBAL5100_MST_SLO_S17", bindL, builder);
			
			return bindL;
		}

		/**
		 * ＷＧ間依頼の基準単位依頼残数量を設定する。
		 */
		protected void setNotCmplQty() {
			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MST_WG_RQST_PRMS_R t1 = MST_WG_RQST_PRMS_R.create("T");
			MCQueryApiBuilder wgRqstPrmsL_bldr1 = MCQueryApiBuilder.create(t1);
			wgRqstPrmsL_bldr1.setSelect(t1.prms_base_unit_qty);
			wgRqstPrmsL_bldr1.addSelect(t1.wg_rqst_no);
			wgRqstPrmsL_bldr1.addSelect(t1.fix_flg);
			wgRqstPrmsL_bldr1.setWhere(t1.wg_rqst_no.eq(bind("wg_rqst_no")));
			dbSelect("MSBAL5100_MST_WG_RQST_PRMS_S09", wgRqstPrmsL, wgRqstPrmsL_bldr1,
					up1().groupBy(WgRqst_Upd02_Dtl2R.$wg_rqst_no));

			MCIndexKey key1 = wgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no, MST_WG_RQST_PRMS_R.$fix_flg);

			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t2 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder wgRqstL_bldr2 = MCQueryApiBuilder.create(t2);
			wgRqstL_bldr2.setSelect(t2.base_unit_qty);
			wgRqstL_bldr2.addSelect(t2.not_cmpl_qty);
			wgRqstL_bldr2.addSelect(t2.man_prms_flg);
			wgRqstL_bldr2.addSelect(t2.wg_rqst_no);
			dbSelectKeyForUpdate("MSBAL5100_MST_WG_RQST_S09", wgRqstL, wgRqstL_bldr2,
					up1().groupBy(WgRqst_Upd02_Dtl2R.$wg_rqst_no));
			MCIndexKey key2 = wgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_no);
			
			MCNumber notCmplQty;
			
			MCList<MST_WG_RQST_R> updWgRqstL = MCList.create(MST_WG_RQST_R.class);

			MCIndexKey up0Key = up0().createIndex(WgRqst_Upd02_Dtl1R.$wg_rqst_no);
			for(WgRqst_Upd02_Dtl2R r : up1().groupBy(WgRqst_Upd02_Dtl2R.$wg_rqst_no)) {
				MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(key2, r.wg_rqst_no());
				if(isNull(wgRqstR)) {
					continue;
				}
				
				WgRqst_Upd02_Dtl1R up0 = up0().getFirst(up0Key, r.wg_rqst_no());
				notCmplQty = wgRqstR.base_unit_qty();
				for(MST_WG_RQST_PRMS_R wgRqstPrmsR : wgRqstPrmsL.subList(key1, r.wg_rqst_no(), true)) {
					notCmplQty = notCmplQty.subtract(wgRqstPrmsR.prms_base_unit_qty());	
					if(notCmplQty.isNegative()) {
						notCmplQty = MCNumber.ZERO;
					}
				}
				// 依頼残数量が変わる、または手動回答した場合、更新する。
				if(!isSame(wgRqstR.not_cmpl_qty(), notCmplQty) || (!isNull(up0) && up0.man_prms_flg())) {
					MST_WG_RQST_R updWgRqstR = MST_WG_RQST_R.create();
					updWgRqstR.wg_rqst_no(r.wg_rqst_no());
					updWgRqstR.not_cmpl_qty(notCmplQty);
					if(!isNull(up0) && up0.man_prms_flg()) {
						updWgRqstR.man_prms_flg(up0.man_prms_flg());
					}
					else {
						updWgRqstR.man_prms_flg(wgRqstR.man_prms_flg());
					}
					updWgRqstL.add(updWgRqstR);
				}
			}
			if (!updWgRqstL.isEmpty()) {
				MST_WG_RQST_R t3 = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder updWgRqstL_bldr3 = MCQueryApiBuilder.create(t3);
				updWgRqstL_bldr3.setSet(t3.not_cmpl_qty);
				updWgRqstL_bldr3.addSet(t3.man_prms_flg);
				updWgRqstL_bldr3.setWhere(t3.wg_rqst_no.eq(bindEx("wg_rqst_no")));
				dbUpdate("MSBAL5100_MST_WG_RQST_U08", updWgRqstL, updWgRqstL_bldr3);
				// 受払予定の登録、削除
				regIoSchd(updWgRqstL);
			}
		}

		/**
		 * ＷＧ間依頼に対する受払予定の登録、削除
		 * @param updWgRqstNoL　基準単位依頼残数量が変わったＷＧ間依頼のリスト
		 */
		protected void regIoSchd(MCList<MST_WG_RQST_R> updWgRqstNoL) {
			MSBEL_IoSchdService.IoSchd_Ins01 ioSchdIns01 = MSBEL_IoSchdService.crtIoSchd_Ins01();
			MSBEL_IoSchdService.IoSchd_Del02 ioSchdDel02 = MSBEL_IoSchdService.crtIoSchd_Del02();
			MSBCL_OrdRegService.Ord_Sprt02 ordSprt02 = MSBCL_OrdRegService.crtOrd_Sprt02();
			MSBEL_XfrSchdService.XfrSchd_Sprt01 xfrSchdSprt01 = MSBEL_XfrSchdService.crtXfrSchd_Sprt01();
			
			// 構成展開時に上り電文を特定するためのリスト
			MCList<WgRqst_Upd02_Dtl2R> tmpUp1L = MCList.create(WgRqst_Upd02_Dtl2R.class);
			
			// 残数量更新後のＷＧ間依頼情報を取得し直す
			MCList<MST_WG_RQST_R> updWgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setOrderByAsc(t.wg_rqst_no);
			dbSelectKey("MSBAL5100_MST_WG_RQST_S10", updWgRqstL, bldr, updWgRqstNoL);
			updWgRqstL.addNumberColumn("peg_no");
			updWgRqstL.addDateColumn("mfg_st_schd_dt");
			updWgRqstL.addDateColumn("mfg_end_schd_dt");
			updWgRqstL.addDateColumn("accpt_schd_dt");
			updWgRqstL.addDateColumn("insp_end_schd_dt");
			
			// 品目単位マスタをキャッシュ
			createItmUnitCache(updWgRqstL);
			
			// 入庫場所に対する場所マスタをキャッシュ
			createLocCacheForGrLoc(updWgRqstL);

			MCList<MST_WG_RQST_R> notCmplL = MCList.create(MST_WG_RQST_R.class);
			notCmplL.addNumberColumn("peg_no");
			notCmplL.addDateColumn("mfg_st_schd_dt");
			notCmplL.addDateColumn("mfg_end_schd_dt");
			
			MCIndexKey up1Key = up1().createIndex(WgRqst_Upd02_Dtl2R.$wg_rqst_no);
			
			// オーダ登録サービスの予定日計算を行う
			callOrdSprt03(updWgRqstL);
			
			// 依頼残数量が変わるような場合、ＷＧ間依頼で作成した受払予定を削除、依頼残数量がある場合は残数分受払予定を作成する。
			for(MST_WG_RQST_R r : updWgRqstL) {
				// 出荷依頼は対象外
				if(MSC_WG_RQST_TYP.isSHIP(r.wg_rqst_typ())) {
					continue;
				}
				
				WgRqst_Upd02_Dtl2R updR = up1().getFirst(up1Key, r.wg_rqst_no());
				
				if(isNull(updR)) {
					continue;
				}
				
				// 受払予定の削除
				MSW_IO_SCHD_DEL_R ioSchdDelR = MSW_IO_SCHD_DEL_R.create();
				ioSchdDelR.setAttributes(r);
				ioSchdDelR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.WG_RQST_NO.value());
				ioSchdDelR.io_schd_sub_no2(r.wg_rqst_no());
				ioSchdDel02.up0().add(ioSchdDelR);
				
				if(!r.not_cmpl_qty().isZero()) {
					// 受払予定の上り電文に設定
					IoSchd_Ins01_DtlR ioSchdIns01DtlR = IoSchd_Ins01_DtlR.create();
					copy(ioSchdIns01DtlR, r, createMap_IoSchd_Ins01_DtlR_MST_WG_RQST_R());
					if(isNull(r.gd_cd())) {
						ioSchdIns01DtlR.gd_cd(getDefaultFeedStkGd().gd_cd());
					}
					ioSchdIns01DtlR.peg_no(updR.peg_no());
					
					if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
						MAM_LOC_R grLocR = getLocCacheForGrLoc(r.gr_loc_cd());
						if(!isNull(r.dlv_cd())) {
							ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_DDLV.value());
						}
						else if (!isNull(grLocR) && !isNull(grLocR.sppl_cd())) {
							ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());
						}
						else {
							ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR.value());
						}
						
						// 外注品で品目オーダから作成した場合、予備ＮＯ１に品目オーダＮＯを設定
						if(!isNullOrNullVal(r.mfg_loc_cd())) {
							if(MSC_WG_RQST_SRC_TYP.isORD(r.wg_rqst_src_typ())) {
								ioSchdIns01DtlR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
								ioSchdIns01DtlR.io_schd_sub_no1(r.itm_ord_no());
							}
						}
					}
					else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
						// 移送の場合は、移動・移送予定の補完処理を実行
						XfrSchdEx_DtlR xfrSchdExDtlR = XfrSchdEx_DtlR.create();
						copy(xfrSchdExDtlR, r, createMap_XfrSchdEx_DtlR_MST_WG_RQST_R());
						xfrSchdExDtlR.setAttributes(updR);
						xfrSchdExDtlR.peg_no(updR.peg_no());
						xfrSchdSprt01.up0().add(xfrSchdExDtlR);
						
						// 移送
						if (!isSame(xfrSchdExDtlR.gr_lg_grp_cd(), xfrSchdExDtlR.gi_lg_grp_cd())) {
							ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI.value());;
						}
						// 移動
						else {
							ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.MOVE_GI.value());
						}
					}
					ioSchdIns01.up0().add(ioSchdIns01DtlR);

					
					// 外注品の場合、オーダ登録サービスの予定日計算、構成展開を行う
					if(!isSame(nvl(r.mfg_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
						notCmplL.add(r);
					}
				}
			}
			
			// 受払予定の削除
			if(!ioSchdDel02.up0().isEmpty()) {
				ioSchdDel02.exec();
			}
			
			// 外注品の場合、オーダ登録サービスの構成展開を行う
			for(MST_WG_RQST_R r : notCmplL) {
				WgRqst_Upd02_Dtl2R updR = up1().getFirst(up1Key, r.wg_rqst_no());
				
				if(isNull(updR)) {
					continue;
				}
				Ord_Sprt02_DtlR ordSprt02DtlR = Ord_Sprt02_DtlR.create();
				copy(ordSprt02DtlR, r, createMap_Ord_Sprt02_DtlR_MST_WG_RQST_R());
				ordSprt02DtlR.setAttributes(updR);
				ordSprt02DtlR.peg_no(updR.peg_no());
				ordSprt02DtlR.mfg_st_schd_dt(r.getDateNE("MFG_ST_SCHD_DT"));
				ordSprt02DtlR.st_schd_tm(r.getDateNE("MFG_ST_SCHD_DT"));
				ordSprt02DtlR.end_schd_tm(r.getDateNE("MFG_END_SCHD_DT"));
				ordSprt02.up1().add(ordSprt02DtlR);
				tmpUp1L.add(updR);
			}
			
			
			// オーダ登録サービスの構成展開を実行
			// 投入品の受払予定を作成
			if(!ordSprt02.up1().isEmpty()) {
				// 工程オーダＮＯを取得
				MCList<MST_OPER_ORDER_R> operOrderL = MCList.create(MST_OPER_ORDER_R.class);
				MST_OPER_ORDER_R t2 = MST_OPER_ORDER_R.create("T");
				MCQueryApiBuilder operOrderL_bldr2 = MCQueryApiBuilder.create(t2);
				operOrderL_bldr2.setSelect(t2.itm_ord_no);
				operOrderL_bldr2.addSelect(t2.oper_ord_no);
				operOrderL_bldr2.setWhere(t2.itm_ord_no.eq(bind("itm_ord_no")));
				dbSelect("MSBAL5100_MST_OPER_ORDER_S02", operOrderL, operOrderL_bldr2,
						updWgRqstL.groupBy(MST_WG_RQST_R.$itm_ord_no));
				
				MCIndexKey operOrderKey = operOrderL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
				
				ordSprt02.exec();
				
				MCIndexKey wgRqstKey = updWgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_no);
				MCIndexKey up1key = tmpUp1L.createIndex(WgRqst_Upd02_Dtl2R.$peg_no);
				for(Ord_Sprt02_RsltR ordSprt02RsltR : ordSprt02.down0()) {
					WgRqst_Upd02_Dtl2R wgRqstUpd02Dtl2R = tmpUp1L.getFirst(up1key, ordSprt02RsltR.peg_no());
					if(isNull(wgRqstUpd02Dtl2R)) {
						continue;
					}
					MST_WG_RQST_R wgRqstR = updWgRqstL.getFirst(wgRqstKey, wgRqstUpd02Dtl2R.wg_rqst_no());
					if(isNull(wgRqstR)) {
						continue;
					}
					
					// 受払予定サービスの上り電文に設定
					IoSchd_Ins01_DtlR ioSchdIns01DtlR = IoSchd_Ins01_DtlR.create();
					copy(ioSchdIns01DtlR, ordSprt02RsltR, createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR());
					ioSchdIns01DtlR.gd_cd(getDefaultFeedStkGd().gd_cd());
					ioSchdIns01DtlR.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
					ioSchdIns01DtlR.io_schd_no(wgRqstUpd02Dtl2R.wg_rqst_no());
					if(MSC_WG_RQST_SRC_TYP.isORD(wgRqstR.wg_rqst_src_typ())) {
						ioSchdIns01DtlR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value());
						ioSchdIns01DtlR.io_schd_sub_no1(wgRqstR.itm_ord_no());
						MST_OPER_ORDER_R operOrderR = operOrderL.getFirst(operOrderKey, wgRqstR.itm_ord_no());
						if(!isNull(operOrderR)) {
							ioSchdIns01DtlR.oper_ord_no(operOrderR.oper_ord_no());
						}
					}
					ioSchdIns01DtlR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.WG_RQST_NO.value());
					ioSchdIns01DtlR.io_schd_sub_no2(wgRqstR.wg_rqst_no());
					ioSchdIns01DtlR.io_schd_pr_no(wgRqstR.io_schd_pr_no());
					ioSchdIns01.up0().add(ioSchdIns01DtlR);
				}
			}
			
			// 移動・移送予定サービスの補完処理を実行
			if(!xfrSchdSprt01.up0().isEmpty()) {
				xfrSchdSprt01.exec();
				
				// 受払予定サービスの上り電文にマッピング
				String[] destCols = new String[] {
						IoSchd_Ins01_DtlR.$stk_arrv_bp_cd,
						IoSchd_Ins01_DtlR.$ex_cmpl_schd_dt, IoSchd_Ins01_DtlR.$tdlv_cd,
						IoSchd_Ins01_DtlR.$trd_ptn_typ, IoSchd_Ins01_DtlR.$io_schd_typ
				};
				String[] srcCols = new String[] {
						XfrSchdEx_DtlR.$gi_stk_arrv_bp_cd,
						XfrSchdEx_DtlR.$ex_cmpl_schd_dt, XfrSchdEx_DtlR.$tdlv_cd,
						XfrSchdEx_DtlR.$trd_ptn_typ, XfrSchdEx_DtlR.$io_schd_typ
				};
				copyByPegNo(ioSchdIns01.up0(), destCols, xfrSchdSprt01.down0(), srcCols);
			}
			
			// 残数分、および投入品の受払予定の登録
			if(!ioSchdIns01.up0().isEmpty()) {
				ioSchdIns01.exec();
			}
		}

		/**
		 * オーダ登録サービスの予定日計算を実行する。
		 * @param updWgRqstL　残数のある可能性があるＷＧ間依頼のリスト
		 */
		protected void callOrdSprt03(MCList<MST_WG_RQST_R> updWgRqstL) {
			MSBCL_OrdRegService.Ord_Sprt03 ordSprt03 = MSBCL_OrdRegService.crtOrd_Sprt03();

			MCIndexKey up1Key = up1().createIndex(WgRqst_Upd02_Dtl2R.$wg_rqst_no);

			for(MST_WG_RQST_R r : updWgRqstL) {
				// 依頼残数量が変わるような場合、ＷＧ間依頼で作成した受払予定を削除、依頼残数量がある場合は残数分受払予定を作成する。
				WgRqst_Upd02_Dtl2R updR = up1().getFirst(up1Key, r.wg_rqst_no());
					
				if(isNull(updR)) {
					continue;
				}
				
				r.setNumberNE("peg_no", updR.peg_no());
				
				if(MSC_WG_RQST_TYP.isSHIP(r.wg_rqst_typ())) {
					continue;
				}
				MST_ITM_ORDER_R itmOrdR = _itmOrdL.getFirst(_itmOrdKey, r.itm_ord_no());
				if(isCmplSchdDtByOrd(r, MAC_DATA_CRUD_TYP.UPD.value(), itmOrdR)) {
					cmplSchdDtByOrd(r, itmOrdR);
					continue;
				}

				Ord_Sprt03_DtlR ordSprt03DtlR = Ord_Sprt03_DtlR.create();
				ordSprt03DtlR.peg_no(updR.peg_no());
				ordSprt03DtlR.master_dt(getMasterDate(r));
				copy(ordSprt03DtlR, r, createMap_Ord_Sprt03_DtlR_MST_WG_RQST_R());
				ordSprt03.up0().add(ordSprt03DtlR);
			}
			
			if(!ordSprt03.up0().isEmpty()) {
				ordSprt03.exec();

				String[] destCols = new String[] {
						"MFG_ST_SCHD_DT", "MFG_END_SCHD_DT", "ACCPT_SCHD_DT",
						"INSP_END_SCHD_DT"
				};
				String[] srcCols = new String[] {
						Ord_Sprt03_RsltR.$mfg_st_schd_dt,
						Ord_Sprt03_DtlR.$mfg_end_schd_dt, Ord_Sprt03_DtlR.$accpt_schd_dt,
						Ord_Sprt03_DtlR.$avl_schd_dt
				};
				copyByPegNo(updWgRqstL, destCols, ordSprt03.down0(), srcCols);
				
				// 仕入直送の場合は、検収予定日、検査終了予定日を訂正する
				for(MST_WG_RQST_R r : updWgRqstL) {
					if (MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()) && !isNull(r.dlv_cd())) {
						r.setDate("accpt_schd_dt", r.gr_rqst_tm());
						r.setDate("insp_end_schd_dt", null);
					}
				}
			}
		}
		
		/**
		 * 出荷・供給依頼サービスを実行し、発注予定、移動・移送予定を作成する。
		 * @param tgtWgRqstL　ＷＧ間依頼のリスト
		 * @param wgRqstPrmsBfL　変更前のＷＧ間依頼回答のリスト
		 */
		protected void regSchd(MCList<MST_WG_RQST_R> tgtWgRqstL, MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsBfL) {
			MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd02 shipDmndRqstUpd02 = MSBAL_ShipDmndRqstService.crtShipDmndRqst_Upd02();
			MCIndexKey key = up1().createIndex(WgRqst_Upd02_Dtl2R.$fix_flg, WgRqst_Upd02_Dtl2R.$last_fix_flg);
			MCIndexKey key2 = up1().createIndex(WgRqst_Upd02_Dtl2R.$fix_flg, WgRqst_Upd02_Dtl2R.$last_fix_flg, WgRqst_Upd02_Dtl2R.$schd_cng_flg);
			MCList<WgRqst_Upd02_Dtl2R> insSchdL = up1().subList(key, true, false);
			MCList<WgRqst_Upd02_Dtl2R> updSchdL = up1().subList(key2, true, true, true);
			MCList<WgRqst_Upd02_Dtl2R> delSchdL = up1().subList(key, false, true);
			
			MCIndexKey wgRqstKey = tgtWgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_no);
			
			// 出荷・供給依頼サービスの予定登録に対するマッピング
			for(WgRqst_Upd02_Dtl2R r : insSchdL) {
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(wgRqstKey, r.wg_rqst_no());
				if(!isNull(wgRqstR)) {
					ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
					copy(shipDmndRqstUpd01DtlR, wgRqstR, createMap_ShipDmndRqst_Upd01_DtlR_MST_WG_RQST_R());
					copy(shipDmndRqstUpd01DtlR, r, createMap_ShipDmndRqst_Upd01_DtlR_WgRqst_Upd02_Dtl2R());
					MST_ITM_ORDER_R itmOrdR = _itmOrdL.getFirst(_itmOrdKey, wgRqstR.itm_ord_no());
					if(isCmplSchdDtByOrd(wgRqstR, r, itmOrdR)) {
						cmplSchdDtByOrd(shipDmndRqstUpd01DtlR, itmOrdR);
					}
					shipDmndRqstUpd01DtlR.master_dt(getMasterDate(shipDmndRqstUpd01DtlR));
					if (isNullOrNullVal(shipDmndRqstUpd01DtlR.gi_loc_cd())) {
						shipDmndRqstUpd01DtlR.gi_schd_dt(r.gi_rqst_tm());
						shipDmndRqstUpd01DtlR.gi_lg_grp_cd(wgRqstR.gi_lg_grp_cd());
						shipDmndRqstUpd01DtlR.gi_loc_cd(null);
					}
					shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					shipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
				}
			}
			
			MCIndexKey wgRqstPrmsKey = wgRqstPrmsBfL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_prms_no);

			// 予定のある回答の訂正
			for(WgRqst_Upd02_Dtl2R r : updSchdL) {
				// ＷＧ間依頼調整画面から訂正し、主要項目を変更してされていない場合は対象外にする
				if (r.screen_crct_flg()) {
					MST_WG_RQST_PRMS_R wgRqstPrmsBfR = wgRqstPrmsBfL.getFirst(wgRqstPrmsKey, r.wg_rqst_prms_no());
					if (!mainColChg(wgRqstPrmsBfR, r)) {
						continue;
					}
				}
				
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(wgRqstKey, r.wg_rqst_no());
				if(!isNull(wgRqstR)) {
					ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
					copy(shipDmndRqstUpd01DtlR, wgRqstR, createMap_ShipDmndRqst_Upd01_DtlR_MST_WG_RQST_R());
					copy(shipDmndRqstUpd01DtlR, r, createMap_ShipDmndRqst_Upd01_DtlR_WgRqst_Upd02_Dtl2R());
					MST_ITM_ORDER_R itmOrdR = _itmOrdL.getFirst(_itmOrdKey, wgRqstR.itm_ord_no());
					if(isCmplSchdDtByOrd(wgRqstR, r, itmOrdR)) {
						cmplSchdDtByOrd(shipDmndRqstUpd01DtlR, itmOrdR);
					}
					shipDmndRqstUpd01DtlR.master_dt(getMasterDate(shipDmndRqstUpd01DtlR));
					if (isNullOrNullVal(shipDmndRqstUpd01DtlR.gi_loc_cd())) {
						shipDmndRqstUpd01DtlR.gi_schd_dt(r.gi_rqst_tm());
						shipDmndRqstUpd01DtlR.gi_lg_grp_cd(wgRqstR.gi_lg_grp_cd());
						shipDmndRqstUpd01DtlR.gi_loc_cd(null);
					}
					shipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
				}
			}
			for(WgRqst_Upd02_Dtl2R r : delSchdL) {
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(wgRqstKey, r.wg_rqst_no());
				if(!isNull(wgRqstR)) {
					ShipDmndRqst_Upd01_DtlR shipDmndRqstUpd01DtlR = ShipDmndRqst_Upd01_DtlR.create();
					copy(shipDmndRqstUpd01DtlR, wgRqstR, createMap_ShipDmndRqst_Upd01_DtlR_MST_WG_RQST_R());
					copy(shipDmndRqstUpd01DtlR, r, createMap_ShipDmndRqst_Upd01_DtlR_WgRqst_Upd02_Dtl2R());
					shipDmndRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					shipDmndRqstUpd02.up0().add(shipDmndRqstUpd01DtlR);
				}
			}
			// 出荷・供給依頼サービスの予定登録を実行
			if(!shipDmndRqstUpd02.up0().isEmpty()) {
				shipDmndRqstUpd02.exec();
			}
		}
		
		/**
		 * 前回の回答内容と今回の回答内容が変わっているか判断する
		 * @param wgRqstPrmsR 前回の回答内容
		 * @param r　今回の回答内容
		 * @return boolean 変更があるかどうか
		 */
		protected boolean mainColChg(MST_WG_RQST_PRMS_R wgRqstPrmsR, WgRqst_Upd02_Dtl2R r) {
			if(isNull(wgRqstPrmsR)
				|| !isSame(wgRqstPrmsR.fix_flg(), r.fix_flg())
				|| !isSame(wgRqstPrmsR.prms_trd_unit_cd(), r.prms_trd_unit_cd())
				|| !isSame(wgRqstPrmsR.prms_trd_unit_qty(), r.prms_trd_unit_qty())
				|| !isSame(wgRqstPrmsR.gr_schd_tm(), r.gr_schd_tm())
				|| !isSame(wgRqstPrmsR.gi_loc_cd(), r.gi_loc_cd())
				|| !isSame(wgRqstPrmsR.gi_str_ln_cd(), r.gi_str_ln_cd())
				|| !isSame(wgRqstPrmsR.gi_rqst_tm(), r.gi_rqst_tm())
				|| !isSame(wgRqstPrmsR.sppl_cd(), r.sppl_cd())
				|| !isSame(wgRqstPrmsR.maker_cd(), r.maker_cd())
				|| !isSame(wgRqstPrmsR.mfg_loc_cd(), r.mfg_loc_cd())
				|| !isSame(wgRqstPrmsR.bom_ptn(), r.bom_ptn())
			) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * ＷＧ間依頼のステータスを更新する。
		 */
		protected void updSts() {
			MSBAL_WgRqstService.WgRqst_Upd03 so01 = MSBAL_WgRqstService.crtWgRqst_Upd03();
			MCList<MST_WG_RQST_R> updWgRqstL = MCList.create(MST_WG_RQST_R.class);
			
			MCIndexKey idxkey = up1().createIndex(WgRqst_Upd02_Dtl2R.$fix_flg, WgRqst_Upd02_Dtl2R.$last_fix_flg);
			MCList<WgRqst_Upd02_Dtl2R> updL = up1().subList(idxkey, true, false);
			updL.addAll(up1().subList(idxkey, false, true));
			MCList<WgRqst_Upd02_Dtl2R> unfixL = up1().subList(idxkey, false, true);
			
			addAll(so01.up0(), updL.distinctNE(WgRqst_Upd02_Dtl2R.$wg_rqst_prms_no), createMap_WgRqst_Upd03_DtlR_WgRqst_Upd02_Dtl2R());

			if(!so01.up0().isEmpty()) {
				so01.exec();
			}
			
			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MST_WG_RQST_PRMS_R t = MST_WG_RQST_PRMS_R.create("T");
			MCQueryApiBuilder wgRqstPrmsL_bldr = MCQueryApiBuilder.create(t);
			wgRqstPrmsL_bldr.setWhere(t.wg_rqst_no.eq(bind("wg_rqst_no")));
			dbSelect("MSBAL5100_MST_WG_RQST_PRMS_S10", wgRqstPrmsL, wgRqstPrmsL_bldr, unfixL);
			
			MCIndexKey key = wgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no, MST_WG_RQST_PRMS_R.$fix_flg);
			
			for(WgRqst_Upd02_Dtl2R r : unfixL) {
				MST_WG_RQST_PRMS_R wgRqstPrmsR = wgRqstPrmsL.getFirst(key, r.wg_rqst_no(), true);
				// 確定された回答がない場合は、ＷＧ間依頼状況区分を未確定にする。
				if(isNull(wgRqstPrmsR)) {
					MST_WG_RQST_R updWgRqstR = MST_WG_RQST_R.create();
					updWgRqstR.wg_rqst_no(r.wg_rqst_no());
					updWgRqstR.wg_rqst_sts_typ(MSC_WG_RQST_STS_TYP.RQST.value());
					updWgRqstL.add(updWgRqstR);
				}
			}
			
			if(!updWgRqstL.isEmpty()) {
				MST_WG_RQST_R t1 = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder updWgRqstL_bldr1 = MCQueryApiBuilder.create(t1);
				updWgRqstL_bldr1.setSet(t1.wg_rqst_sts_typ);
				dbUpdateKey("MSBAL5100_MST_WG_RQST_U09", updWgRqstL, updWgRqstL_bldr1);
			}
		}
		
		/**
		 * 回答内容の数量が不足しているもの、納期が間に合わないものを取得する。
		 * @param tgtWgRqstL ＷＧ間依頼のリスト
		 */
		protected void getAlertTgt(MCList<MST_WG_RQST_R> tgtWgRqstL) {
			MCIndexKey key = tgtWgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_no);
			MCList<WgRqst_Upd02_Dtl2R> bindL = up1().subList(WgRqst_Upd02_Dtl2R.$prms_ntc_flg, true).groupBy(WgRqst_Upd02_Dtl2R.$wg_rqst_no, WgRqst_Upd02_Dtl2R.$prms_dt, WgRqst_Upd02_Dtl2R.$auto_prms_flg);

			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			if(!bindL.isEmpty()) {
				MST_WG_RQST_PRMS_R t1 = MST_WG_RQST_PRMS_R.create("T");
				MCQueryApiBuilder wgRqstPrmsL_bldr1 = MCQueryApiBuilder.create(t1);
				wgRqstPrmsL_bldr1.setSelect(t1.wg_rqst_no);
				wgRqstPrmsL_bldr1.addSelect(t1.gr_schd_tm);
				wgRqstPrmsL_bldr1.setWhere(t1.wg_rqst_no.eq(bind("wg_rqst_no")));
				wgRqstPrmsL_bldr1.addWhereWithAnd(t1.fix_flg.eq(value(true)));
				dbSelect("MSBAL5100_MST_WG_RQST_PRMS_S11", wgRqstPrmsL, wgRqstPrmsL_bldr1, bindL);
			}
			MCIndexKey wgRqstPrmsKey = wgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no);
			
			for(WgRqst_Upd02_Dtl2R r : bindL) {
				if(r.auto_prms_flg()) {
					continue;
				}
				MST_WG_RQST_R wgRqstR = tgtWgRqstL.getFirst(key, r.wg_rqst_no());
				if(!isNull(wgRqstR)) {
					// 数量が不足の場合
					if(!wgRqstR.not_cmpl_qty().isZero()) {
						_push3L.add(wgRqstR);
					}
					
					// 納期遅れの場合
					MCList<MST_WG_RQST_PRMS_R> tmpL = wgRqstPrmsL.subList(wgRqstPrmsKey, wgRqstR.wg_rqst_no());
					if(!isNull(tmpL)) {
						for(MST_WG_RQST_PRMS_R tmpR : tmpL) {
							if(tmpR.gr_schd_tm().gt(wgRqstR.gr_rqst_tm())) {
								_push4L.add(wgRqstR);
								break;
							}
						}
					}
				}
			}
		}
		
		/**
		 * 回答が通知、再通知、回答が削除された場合、回答数不足、納期遅れは、ポップアップ通知を行う。
		 */
		protected void pushSendMessage() {
			MAUCL_PushNtcMgr mgr;
			MAUCL_PushNtcInfo info;
			
			// プッシュ通知用にＷＧマスタを取得する
			MCList<MST_WG_RQST_R> tmpWgRqstL = MCList.create(MST_WG_RQST_R.class);
			tmpWgRqstL.addAll(_push1L);
			tmpWgRqstL.addAll(_push2L);
			tmpWgRqstL.addAll(_push3L);
			tmpWgRqstL.addAll(_push4L);
			
			MCList<MAM_WG_R> wgL = MCList.create(MAM_WG_R.class);
			MCList<MAM_WG_R> tmpL = MCList.create(MAM_WG_R.class);
			for(MST_WG_RQST_R dtlR : tmpWgRqstL) {
				MAM_WG_R wgR = MAM_WG_R.create();
				wgR.wg_cd(dtlR.rqst_fr_wg_cd());
				tmpL.add(wgR);
				
				wgR = MAM_WG_R.create();
				wgR.wg_cd(dtlR.rqst_to_wg_cd());
				tmpL.add(wgR);
			}
			
			tmpL.sort(MAM_WG_R.$wg_cd);
			MAM_WG_R t1 = MAM_WG_R.create("T");
			MCQueryApiBuilder wgL_bldr1 = MCQueryApiBuilder.create(t1);
			wgL_bldr1.setSelect(t1.wg_cd);
			wgL_bldr1.addSelect(t1.wg_nm);
			dbSelectKey("MSBAL5100_MAM_WG_S02", wgL, wgL_bldr1, tmpL.groupBy(MAM_WG_R.$wg_cd));
			MCIndexKey wgKey = wgL.createIndex(MAM_WG_R.$wg_cd);
			
			// 回答が通知、再通知された場合
			for(MST_WG_RQST_R wgRqstR : _push1L.groupBy(MST_WG_RQST_R.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd, MST_WG_RQST_R.$prms_dt)) {
				MAM_WG_R frWgR = wgL.getFirst(wgKey, wgRqstR.rqst_fr_wg_cd());
				MAM_WG_R toWgR = wgL.getFirst(wgKey, wgRqstR.rqst_to_wg_cd());
				
				MCMessage message = new MCMessage(MSBAL0010, wgRqstR.rqst_fr_wg_cd(), frWgR.wg_nm(), wgRqstR.rqst_to_wg_cd(), toWgR.wg_nm());
				// 依頼元
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST_PRMS);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_fr_wg_cd(), wgRqstR.prms_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.PRMS_DT.value(),
						toYMDString(wgRqstR.prms_dt()), toYMDString(wgRqstR.prms_dt()),
						false, false, true, true, true, true, false,
						MSC_WG_RQST_REG_OPE.OPE_REF.value(), wgRqstR.rqst_fr_wg_cd(),
						wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。プッシュ通知処理自体は LogicAfter で行われます。
				mgr.exec();

				// 依頼先
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_to_wg_cd(), wgRqstR.prms_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.PRMS_DT.value(),
						toYMDString(wgRqstR.prms_dt()), toYMDString(wgRqstR.prms_dt()),
						false, false, true, true, false,
						MSC_WG_RQST_ADJST_OPE.OPE_REF.value(), wgRqstR.rqst_fr_wg_cd(),
						wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。プッシュ通知処理自体は LogicAfter で行われます。
				mgr.exec();
			}
			
			// 回答が削除された場合
			for(MST_WG_RQST_R wgRqstR : _push2L.groupBy(MST_WG_RQST_R.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd, MST_WG_RQST_R.$rqst_dt)) {
				MAM_WG_R frWgR = wgL.getFirst(wgKey, wgRqstR.rqst_fr_wg_cd());
				MAM_WG_R toWgR = wgL.getFirst(wgKey, wgRqstR.rqst_to_wg_cd());
				
				MCMessage message = new MCMessage(MSBAL0011, wgRqstR.rqst_fr_wg_cd(), frWgR.wg_nm(), wgRqstR.rqst_to_wg_cd(), toWgR.wg_nm());

				// 依頼元
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST_PRMS);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_fr_wg_cd(), wgRqstR.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.PRMS_CAN_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, true, true, true, false,
						MSC_WG_RQST_REG_OPE.OPE_REF.value(), wgRqstR.rqst_fr_wg_cd(),
						wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。プッシュ通知処理自体は LogicAfter で行われます。
				mgr.exec();

				// 依頼先
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_to_wg_cd(), wgRqstR.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.PRMS_CAN_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, true, false, MSC_WG_RQST_ADJST_OPE.OPE_REF.value(),
						wgRqstR.rqst_fr_wg_cd(), wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。プッシュ通知処理自体は LogicAfter で行われます。
				mgr.exec();
			}
			
			// 回答数不足の場合
			for(MST_WG_RQST_R wgRqstR : _push3L.groupBy(MST_WG_RQST_R.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd, MST_WG_RQST_R.$prms_dt)) {
				MAM_WG_R frWgR = wgL.getFirst(wgKey, wgRqstR.rqst_fr_wg_cd());
				MAM_WG_R toWgR = wgL.getFirst(wgKey, wgRqstR.rqst_to_wg_cd());
				
				MCMessage message = new MCMessage(MSBAL0016, wgRqstR.rqst_fr_wg_cd(), frWgR.wg_nm(), wgRqstR.rqst_to_wg_cd(), toWgR.wg_nm());

				// 依頼元
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST_PRMS);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_fr_wg_cd(), wgRqstR.prms_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.PRMS_DT.value(),
						toYMDString(wgRqstR.prms_dt()), toYMDString(wgRqstR.prms_dt()),
						false, true, true, true, true, true, false,
						MSC_WG_RQST_REG_OPE.OPE_REF.value(), wgRqstR.rqst_fr_wg_cd(),
						wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。プッシュ通知処理自体は LogicAfter で行われます。
				mgr.exec();

				// 依頼先
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_to_wg_cd(), wgRqstR.prms_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.PRMS_DT.value(),
						toYMDString(wgRqstR.prms_dt()), toYMDString(wgRqstR.prms_dt()),
						false, true, true, true, false,
						MSC_WG_RQST_ADJST_OPE.OPE_REF.value(), wgRqstR.rqst_fr_wg_cd(),
						wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。プッシュ通知処理自体は LogicAfter で行われます。
				mgr.exec();
			}

			// 回答が納期遅れがある場合
			for(MST_WG_RQST_R wgRqstR : _push4L.groupBy(MST_WG_RQST_R.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd, MST_WG_RQST_R.$prms_dt)) {
				MAM_WG_R frWgR = wgL.getFirst(wgKey, wgRqstR.rqst_fr_wg_cd());
				MAM_WG_R toWgR = wgL.getFirst(wgKey, wgRqstR.rqst_to_wg_cd());
				
				MCMessage message = new MCMessage(MSBAL0017, wgRqstR.rqst_fr_wg_cd(), frWgR.wg_nm(), wgRqstR.rqst_to_wg_cd(), toWgR.wg_nm());

				// 依頼元
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST_PRMS);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_fr_wg_cd(), wgRqstR.prms_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.PRMS_DT.value(),
						toYMDString(wgRqstR.prms_dt()), toYMDString(wgRqstR.prms_dt()),
						true, false, true, true, true, true, false,
						MSC_WG_RQST_REG_OPE.OPE_REF.value(), wgRqstR.rqst_fr_wg_cd(),
						wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。プッシュ通知処理自体は LogicAfter で行われます。
				mgr.exec();

				// 依頼先
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_to_wg_cd(), wgRqstR.prms_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.PRMS_DT.value(),
						toYMDString(wgRqstR.prms_dt()), toYMDString(wgRqstR.prms_dt()),
						true, false, true, true, false,
						MSC_WG_RQST_ADJST_OPE.OPE_REF.value(), wgRqstR.rqst_fr_wg_cd(),
						wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。プッシュ通知処理自体は LogicAfter で行われます。
				mgr.exec();
			}
			
		}
		
		protected Map_ShipDmndRqst_Upd01_DtlR_WgRqst_Upd02_Dtl2R<ShipDmndRqst_Upd01_DtlR,WgRqst_Upd02_Dtl2R> _map_ShipDmndRqst_Upd01_DtlR_WgRqst_Upd02_Dtl2R = null;
		protected Map_ShipDmndRqst_Upd01_DtlR_WgRqst_Upd02_Dtl2R<ShipDmndRqst_Upd01_DtlR,WgRqst_Upd02_Dtl2R> createMap_ShipDmndRqst_Upd01_DtlR_WgRqst_Upd02_Dtl2R() {
			if (_map_ShipDmndRqst_Upd01_DtlR_WgRqst_Upd02_Dtl2R == null) {
				_map_ShipDmndRqst_Upd01_DtlR_WgRqst_Upd02_Dtl2R = new Map_ShipDmndRqst_Upd01_DtlR_WgRqst_Upd02_Dtl2R<ShipDmndRqst_Upd01_DtlR, WgRqst_Upd02_Dtl2R>();
			}
			return _map_ShipDmndRqst_Upd01_DtlR_WgRqst_Upd02_Dtl2R;
		}

		public class Map_ShipDmndRqst_Upd01_DtlR_WgRqst_Upd02_Dtl2R<D extends ShipDmndRqst_Upd01_DtlR, S extends WgRqst_Upd02_Dtl2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$data_crud_typ, WgRqst_Upd02_Dtl2R.$data_crud_typ);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$peg_no, WgRqst_Upd02_Dtl2R.$peg_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_rqst_tm, WgRqst_Upd02_Dtl2R.$gr_schd_tm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_lg_grp_cd, WgRqst_Upd02_Dtl2R.$gi_lg_grp_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_loc_cd, WgRqst_Upd02_Dtl2R.$gi_loc_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_str_ln_cd, WgRqst_Upd02_Dtl2R.$gi_str_ln_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_rqst_tm, WgRqst_Upd02_Dtl2R.$gi_rqst_tm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$trd_unit_qty, WgRqst_Upd02_Dtl2R.$prms_trd_unit_qty);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$trd_unit_cd, WgRqst_Upd02_Dtl2R.$prms_trd_unit_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$base_unit_qty, WgRqst_Upd02_Dtl2R.$prms_base_unit_qty);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$base_unit_cd, WgRqst_Upd02_Dtl2R.$prms_base_unit_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sppl_cd, WgRqst_Upd02_Dtl2R.$sppl_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$maker_cd, WgRqst_Upd02_Dtl2R.$maker_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$slo_no, WgRqst_Upd02_Dtl2R.$slo_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$slo_d_no, WgRqst_Upd02_Dtl2R.$slo_d_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd, WgRqst_Upd02_Dtl2R.$mfg_loc_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bom_ptn, WgRqst_Upd02_Dtl2R.$bom_ptn);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_no, WgRqst_Upd02_Dtl2R.$wg_rqst_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_prms_no, WgRqst_Upd02_Dtl2R.$wg_rqst_prms_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$cred_no_up_flg, WgRqst_Upd02_Dtl2R.$cred_no_up_flg);
			}
		}

		protected Map_ShipDmndRqst_Upd01_DtlR_MST_WG_RQST_R<ShipDmndRqst_Upd01_DtlR,MST_WG_RQST_R> _map_ShipDmndRqst_Upd01_DtlR_MST_WG_RQST_R = null;
		protected Map_ShipDmndRqst_Upd01_DtlR_MST_WG_RQST_R<ShipDmndRqst_Upd01_DtlR,MST_WG_RQST_R> createMap_ShipDmndRqst_Upd01_DtlR_MST_WG_RQST_R() {
			if (_map_ShipDmndRqst_Upd01_DtlR_MST_WG_RQST_R == null) {
				_map_ShipDmndRqst_Upd01_DtlR_MST_WG_RQST_R = new Map_ShipDmndRqst_Upd01_DtlR_MST_WG_RQST_R<ShipDmndRqst_Upd01_DtlR, MST_WG_RQST_R>();
			}
			return _map_ShipDmndRqst_Upd01_DtlR_MST_WG_RQST_R;
		}

		public class Map_ShipDmndRqst_Upd01_DtlR_MST_WG_RQST_R<D extends ShipDmndRqst_Upd01_DtlR, S extends MST_WG_RQST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_typ, MST_WG_RQST_R.$wg_rqst_typ);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_typ, MST_WG_RQST_R.$wg_rqst_src_typ);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_src_no, MST_WG_RQST_R.$wg_rqst_src_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$rqst_dt, MST_WG_RQST_R.$rqst_dt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_fr_wg_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$rqst_fr_dpt_cd, MST_WG_RQST_R.$rqst_fr_dpt_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$rqst_fr_usr_cd, MST_WG_RQST_R.$rqst_fr_usr_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_loc_wg_cd, MST_WG_RQST_R.$gr_loc_wg_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_lg_grp_cd, MST_WG_RQST_R.$gr_lg_grp_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_loc_cd, MST_WG_RQST_R.$gr_loc_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_str_ln_cd, MST_WG_RQST_R.$gr_str_ln_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gr_rqst_tm, MST_WG_RQST_R.$gr_rqst_tm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$rqst_to_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_loc_wg_cd, MST_WG_RQST_R.$gi_loc_wg_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_lg_grp_cd, MST_WG_RQST_R.$gi_lg_grp_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_loc_cd, MST_WG_RQST_R.$gi_loc_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_str_ln_cd, MST_WG_RQST_R.$gi_str_ln_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gi_rqst_tm, MST_WG_RQST_R.$gi_rqst_tm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_cd, MST_WG_RQST_R.$itm_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_sub1, MST_WG_RQST_R.$itm_sub1);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_sub2, MST_WG_RQST_R.$itm_sub2);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_sub3, MST_WG_RQST_R.$itm_sub3);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_nm, MST_WG_RQST_R.$itm_nm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$iv_itm_nm, MST_WG_RQST_R.$iv_itm_nm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$lot_no, MST_WG_RQST_R.$lot_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sublot_no, MST_WG_RQST_R.$sublot_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno1, MST_WG_RQST_R.$sno1);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno1_null_flg, MST_WG_RQST_R.$sno1_null_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno2, MST_WG_RQST_R.$sno2);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno2_null_flg, MST_WG_RQST_R.$sno2_null_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno3, MST_WG_RQST_R.$sno3);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno3_null_flg, MST_WG_RQST_R.$sno3_null_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno4, MST_WG_RQST_R.$sno4);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sno4_null_flg, MST_WG_RQST_R.$sno4_null_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$ver_no, MST_WG_RQST_R.$ver_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$gd_cd, MST_WG_RQST_R.$gd_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$vld_dt_fr, MST_WG_RQST_R.$vld_dt_fr);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$vld_dt_to, MST_WG_RQST_R.$vld_dt_to);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$trd_unit_qty, MST_WG_RQST_R.$trd_unit_qty);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$trd_unit_cd, MST_WG_RQST_R.$trd_unit_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$base_unit_qty, MST_WG_RQST_R.$base_unit_qty);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$base_unit_cd, MST_WG_RQST_R.$base_unit_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$sppl_cd, MST_WG_RQST_R.$sppl_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$maker_cd, MST_WG_RQST_R.$maker_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$io_schd_pr_no, MST_WG_RQST_R.$io_schd_pr_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$slo_no, MST_WG_RQST_R.$slo_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$slo_d_no, MST_WG_RQST_R.$slo_d_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_cd, MST_WG_RQST_R.$dlv_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_sundry_flg, MST_WG_RQST_R.$dlv_sundry_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_nm, MST_WG_RQST_R.$dlv_nm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_cntct_dpt, MST_WG_RQST_R.$dlv_cntct_dpt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_cntct_psn, MST_WG_RQST_R.$dlv_cntct_psn);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_zip_cd, MST_WG_RQST_R.$dlv_zip_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_addr1, MST_WG_RQST_R.$dlv_addr1);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_addr2, MST_WG_RQST_R.$dlv_addr2);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_addr3, MST_WG_RQST_R.$dlv_addr3);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_addr4, MST_WG_RQST_R.$dlv_addr4);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_tel, MST_WG_RQST_R.$dlv_tel);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$dlv_fax, MST_WG_RQST_R.$dlv_fax);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_cd, MST_WG_RQST_R.$tdlv_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_sundry_flg, MST_WG_RQST_R.$tdlv_sundry_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_nm, MST_WG_RQST_R.$tdlv_nm);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_zip_cd, MST_WG_RQST_R.$tdlv_zip_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_addr1, MST_WG_RQST_R.$tdlv_addr1);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_addr2, MST_WG_RQST_R.$tdlv_addr2);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_addr3, MST_WG_RQST_R.$tdlv_addr3);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_addr4, MST_WG_RQST_R.$tdlv_addr4);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_cntct_dpt, MST_WG_RQST_R.$tdlv_cntct_dpt);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_cntct_psn, MST_WG_RQST_R.$tdlv_cntct_psn);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_tel, MST_WG_RQST_R.$tdlv_tel);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$tdlv_fax, MST_WG_RQST_R.$tdlv_fax);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$itm_ord_no, MST_WG_RQST_R.$itm_ord_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$mfg_loc_cd, MST_WG_RQST_R.$mfg_loc_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bom_ptn, MST_WG_RQST_R.$bom_ptn);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$purc_rsn_cd, MST_WG_RQST_R.$purc_rsn_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$xpns_po_flg, MST_WG_RQST_R.$xpns_po_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_itm_cd, MST_WG_RQST_R.$bd_itm_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_itm_sub1, MST_WG_RQST_R.$bd_itm_sub1);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_itm_sub2, MST_WG_RQST_R.$bd_itm_sub2);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_itm_sub3, MST_WG_RQST_R.$bd_itm_sub3);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_sno1, MST_WG_RQST_R.$bd_sno1);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_sno2, MST_WG_RQST_R.$bd_sno2);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_sno3, MST_WG_RQST_R.$bd_sno3);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_sno4, MST_WG_RQST_R.$bd_sno4);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_lot_no, MST_WG_RQST_R.$bd_lot_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_sublot_no, MST_WG_RQST_R.$bd_sublot_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_loc_cd, MST_WG_RQST_R.$bd_loc_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_dpt_cd, MST_WG_RQST_R.$bd_dpt_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_ctg_cd, MST_WG_RQST_R.$bd_ctg_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_oper_cd, MST_WG_RQST_R.$bd_oper_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_slo_no, MST_WG_RQST_R.$bd_slo_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_iv_no, MST_WG_RQST_R.$bd_iv_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$bd_po_no, MST_WG_RQST_R.$bd_po_no);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$wg_rqst_cnt_rmrks, MST_WG_RQST_R.$wg_rqst_cnt_rmrks);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$comp_cng_flg, MST_WG_RQST_R.$comp_cng_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$spec_cng_flg, MST_WG_RQST_R.$spec_cng_flg);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$trd_cd, MST_WG_RQST_R.$trd_cd);
				addColumnPathMap(ShipDmndRqst_Upd01_DtlR.$trd_ptn_typ, MST_WG_RQST_R.$trd_ptn_typ);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.wg_rqst_cnt_rmrks(nvl(src.wg_re_rqst_cnt_rmrks(), src.wg_rqst_cnt_rmrks()));
			}
		}
		
		protected Map_WgRqst_Upd03_DtlR_WgRqst_Upd02_Dtl2R<WgRqst_Upd03_DtlR,WgRqst_Upd02_Dtl2R> _map_WgRqst_Upd03_DtlR_WgRqst_Upd02_Dtl2R = null;
		protected Map_WgRqst_Upd03_DtlR_WgRqst_Upd02_Dtl2R<WgRqst_Upd03_DtlR,WgRqst_Upd02_Dtl2R> createMap_WgRqst_Upd03_DtlR_WgRqst_Upd02_Dtl2R() {
			if (_map_WgRqst_Upd03_DtlR_WgRqst_Upd02_Dtl2R == null) {
				_map_WgRqst_Upd03_DtlR_WgRqst_Upd02_Dtl2R = new Map_WgRqst_Upd03_DtlR_WgRqst_Upd02_Dtl2R<WgRqst_Upd03_DtlR, WgRqst_Upd02_Dtl2R>();
			}
			return _map_WgRqst_Upd03_DtlR_WgRqst_Upd02_Dtl2R;
		}

		public class Map_WgRqst_Upd03_DtlR_WgRqst_Upd02_Dtl2R<D extends WgRqst_Upd03_DtlR, S extends WgRqst_Upd02_Dtl2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Upd03_DtlR.$wg_rqst_prms_no, WgRqst_Upd02_Dtl2R.$wg_rqst_prms_no);
				addColumnPathMap(WgRqst_Upd03_DtlR.$wg_rqst_no, WgRqst_Upd02_Dtl2R.$wg_rqst_no);
			}
		}
		
		protected Map_XfrSchdEx_DtlR_MST_WG_RQST_R<XfrSchdEx_DtlR,MST_WG_RQST_R> _map_XfrSchdEx_DtlR_MST_WG_RQST_R = null;
		protected Map_XfrSchdEx_DtlR_MST_WG_RQST_R<XfrSchdEx_DtlR,MST_WG_RQST_R> createMap_XfrSchdEx_DtlR_MST_WG_RQST_R() {
			if (_map_XfrSchdEx_DtlR_MST_WG_RQST_R == null) {
				_map_XfrSchdEx_DtlR_MST_WG_RQST_R = new Map_XfrSchdEx_DtlR_MST_WG_RQST_R<XfrSchdEx_DtlR, MST_WG_RQST_R>();
			}
			return _map_XfrSchdEx_DtlR_MST_WG_RQST_R;
		}

		public class Map_XfrSchdEx_DtlR_MST_WG_RQST_R<D extends XfrSchdEx_DtlR, S extends MST_WG_RQST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdEx_DtlR.$gi_loc_cd, MST_WG_RQST_R.$gi_loc_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$gi_lg_grp_cd, MST_WG_RQST_R.$gi_lg_grp_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$gr_loc_cd, MST_WG_RQST_R.$gr_loc_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_cd, MST_WG_RQST_R.$itm_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_sub1, MST_WG_RQST_R.$itm_sub1);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_sub2, MST_WG_RQST_R.$itm_sub2);
				addColumnPathMap(XfrSchdEx_DtlR.$itm_sub3, MST_WG_RQST_R.$itm_sub3);
				addColumnPathMap(XfrSchdEx_DtlR.$gi_schd_dt, MST_WG_RQST_R.$gi_rqst_tm);
				addColumnPathMap(XfrSchdEx_DtlR.$gr_schd_dt, MST_WG_RQST_R.$gr_rqst_tm);
			}
		}
		
		protected Map_IoSchd_Ins01_DtlR_MST_WG_RQST_R<IoSchd_Ins01_DtlR,MST_WG_RQST_R> _map_IoSchd_Ins01_DtlR_MST_WG_RQST_R = null;
		protected Map_IoSchd_Ins01_DtlR_MST_WG_RQST_R<IoSchd_Ins01_DtlR,MST_WG_RQST_R> createMap_IoSchd_Ins01_DtlR_MST_WG_RQST_R() {
			if (_map_IoSchd_Ins01_DtlR_MST_WG_RQST_R == null) {
				_map_IoSchd_Ins01_DtlR_MST_WG_RQST_R = new Map_IoSchd_Ins01_DtlR_MST_WG_RQST_R<IoSchd_Ins01_DtlR, MST_WG_RQST_R>();
			}
			return _map_IoSchd_Ins01_DtlR_MST_WG_RQST_R;
		}

		public class Map_IoSchd_Ins01_DtlR_MST_WG_RQST_R<D extends IoSchd_Ins01_DtlR, S extends MST_WG_RQST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_no, MST_WG_RQST_R.$wg_rqst_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_sub_no2, MST_WG_RQST_R.$wg_rqst_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_pr_no, MST_WG_RQST_R.$io_schd_pr_no);				
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, MST_WG_RQST_R.$itm_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, MST_WG_RQST_R.$itm_sub1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, MST_WG_RQST_R.$itm_sub2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, MST_WG_RQST_R.$itm_sub3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, MST_WG_RQST_R.$ver_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$lot_no, MST_WG_RQST_R.$lot_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sublot_no, MST_WG_RQST_R.$sublot_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, MST_WG_RQST_R.$sno1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1_null_flg, MST_WG_RQST_R.$sno1_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, MST_WG_RQST_R.$sno2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2_null_flg, MST_WG_RQST_R.$sno2_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, MST_WG_RQST_R.$sno3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3_null_flg, MST_WG_RQST_R.$sno3_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, MST_WG_RQST_R.$sno4);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4_null_flg, MST_WG_RQST_R.$sno4_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, MST_WG_RQST_R.$trd_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, MST_WG_RQST_R.$base_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, MST_WG_RQST_R.$not_cmpl_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$gd_cd, MST_WG_RQST_R.$gd_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_fr, MST_WG_RQST_R.$vld_dt_fr);
				addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_to, MST_WG_RQST_R.$vld_dt_to);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sppl_cd, MST_WG_RQST_R.$sppl_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$mfg_loc_cd, MST_WG_RQST_R.$mfg_loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$tdlv_cd, MST_WG_RQST_R.$tdlv_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$dlv_cd, MST_WG_RQST_R.$dlv_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.FIX.value());
				dest.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.WG_RQST_NO.value());
				dest.accpt_schd_dt(src.getDate("accpt_schd_dt"));
				dest.insp_cmpl_schd_dt(src.getDate("insp_end_schd_dt"));
				if(MSC_WG_RQST_TYP.isPURC(src.wg_rqst_typ())) {
					dest.schd_dt(src.gr_rqst_tm());
					dest.loc_cd(src.gr_loc_cd());
					dest.str_ln_cd(src.gr_str_ln_cd());
					if(!isSame(nvl(src.mfg_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
						dest.mfg_inst_unit_typ(MAC_MFG_INST_UNIT_TYP.ITM.value());
					}
				}
				else if (MSC_WG_RQST_TYP.isXFR(src.wg_rqst_typ())) {
					dest.schd_dt(nvl(src.gi_rqst_tm(), src.gr_rqst_tm()));
					dest.loc_cd(src.gi_loc_cd());
					dest.str_ln_cd(src.gi_str_ln_cd());
					dest.gr_loc_cd(src.gr_loc_cd());
					dest.gr_str_ln_cd(src.gr_str_ln_cd());
					dest.gr_schd_dt(src.gr_rqst_tm());
				}
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				dest.alloc_flg(false);
			}
		}
		
		protected Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR,Ord_Sprt02_RsltR> _map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR = null;
		protected Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR,Ord_Sprt02_RsltR> createMap_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR() {
			if (_map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR == null) {
				_map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR = new Map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR<IoSchd_Ins01_DtlR, Ord_Sprt02_RsltR>();
			}
			return _map_IoSchd_Ins01_DtlR_Ord_Sprt02_RsltR;
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
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.FIX.value());
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
		
		protected Map_Ord_Sprt02_DtlR_MST_WG_RQST_R<Ord_Sprt02_DtlR,MST_WG_RQST_R> _map_Ord_Sprt02_DtlR_MST_WG_RQST_R = null;
		protected Map_Ord_Sprt02_DtlR_MST_WG_RQST_R<Ord_Sprt02_DtlR,MST_WG_RQST_R> createMap_Ord_Sprt02_DtlR_MST_WG_RQST_R() {
			if (_map_Ord_Sprt02_DtlR_MST_WG_RQST_R == null) {
				_map_Ord_Sprt02_DtlR_MST_WG_RQST_R = new Map_Ord_Sprt02_DtlR_MST_WG_RQST_R<Ord_Sprt02_DtlR, MST_WG_RQST_R>();
			}
			return _map_Ord_Sprt02_DtlR_MST_WG_RQST_R;
		}

		public class Map_Ord_Sprt02_DtlR_MST_WG_RQST_R<D extends Ord_Sprt02_DtlR, S extends MST_WG_RQST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_cd, MST_WG_RQST_R.$itm_cd);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub1, MST_WG_RQST_R.$itm_sub1);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub2, MST_WG_RQST_R.$itm_sub2);
				addColumnPathMap(Ord_Sprt02_DtlR.$itm_sub3, MST_WG_RQST_R.$itm_sub3);
				addColumnPathMap(Ord_Sprt02_DtlR.$mfg_loc_cd, MST_WG_RQST_R.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt02_DtlR.$bom_ptn, MST_WG_RQST_R.$bom_ptn);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno1, MST_WG_RQST_R.$sno1);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno2, MST_WG_RQST_R.$sno2);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno3, MST_WG_RQST_R.$sno3);
				addColumnPathMap(Ord_Sprt02_DtlR.$sno4, MST_WG_RQST_R.$sno4);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.inst_qty(src.not_cmpl_qty());
				dest.oper_cd(MAC_STR.NULL_VAL.value());		//　外注のため、デフォルト工程
				dest.oper_seq(MCNumber.ZERO);
			}
		}
		
		protected Map_Ord_Sprt03_DtlR_MST_WG_RQST_R<Ord_Sprt03_DtlR,MST_WG_RQST_R> _map_Ord_Sprt03_DtlR_MST_WG_RQST_R = null;
		protected Map_Ord_Sprt03_DtlR_MST_WG_RQST_R<Ord_Sprt03_DtlR,MST_WG_RQST_R> createMap_Ord_Sprt03_DtlR_MST_WG_RQST_R() {
			if (_map_Ord_Sprt03_DtlR_MST_WG_RQST_R == null) {
				_map_Ord_Sprt03_DtlR_MST_WG_RQST_R = new Map_Ord_Sprt03_DtlR_MST_WG_RQST_R<Ord_Sprt03_DtlR, MST_WG_RQST_R>();
			}
			return _map_Ord_Sprt03_DtlR_MST_WG_RQST_R;
		}

		public class Map_Ord_Sprt03_DtlR_MST_WG_RQST_R<D extends Ord_Sprt03_DtlR, S extends MST_WG_RQST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_schd_dt, MST_WG_RQST_R.$gr_rqst_tm);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, MST_WG_RQST_R.$itm_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, MST_WG_RQST_R.$itm_sub1);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, MST_WG_RQST_R.$itm_sub2);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, MST_WG_RQST_R.$itm_sub3);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, MST_WG_RQST_R.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$sppl_cd, MST_WG_RQST_R.$sppl_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$maker_cd, MST_WG_RQST_R.$maker_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, MST_WG_RQST_R.$bom_ptn);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, MST_WG_RQST_R.$gr_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, MST_WG_RQST_R.$not_cmpl_qty);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_sppl_cd, MST_WG_RQST_R.$sppl_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if(MSC_WG_RQST_TYP.isPURC(src.wg_rqst_typ())) {
					if(!isSame(nvl(src.mfg_loc_cd(), MAC_STR.NULL_VAL.value()), MAC_STR.NULL_VAL.value())) {
						dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
						dest.sppl_cd(MAC_STR.NULL_VAL.value());
						dest.maker_cd(MAC_STR.NULL_VAL.value());
					}
					else {
						dest.itm_ord_typ(MSC_ITM_ORD_TYP.PURC.value());
					}
					dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
				}
				else if(MSC_WG_RQST_TYP.isXFR(src.wg_rqst_typ())) {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.WG_XFR.value());
					dest.rqst_loc_cd(src.gi_loc_cd());
				}
				if (!isSame(_sysParm, "1")) {
					// 仕入直送はdlv_cdを設定 ("slod_proc_typ", "slod_dlv_cd"は事前に実行したgetMasterDateで設定)
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(src.getString("slod_proc_typ"))) {
						dest.dlv_cd(src.getString("slod_dlv_cd"));
					}
				}
			}
		}
	}
	
	/**
	 * WgRqst_Upd03オペレーション.<p>
	 * ＜ＷＧ間依頼の状況の更新＞
	 */
	public class WgRqst_Upd03 extends MSBAL_WgRqstService_MC_A.WgRqst_Upd03 {
		// 指図登録したものをリスト化
		MCList<MST_WG_RQST_R> _push1L = MCList.create(MST_WG_RQST_R.class);
		// 指図取消したものをリスト化
		MCList<MST_WG_RQST_R> _push2L = MCList.create(MST_WG_RQST_R.class);
		// 実績登録したものをリスト化
		MCList<MST_WG_RQST_R> _push3L = MCList.create(MST_WG_RQST_R.class);
		// 実績取消したものをリスト化
		MCList<MST_WG_RQST_R> _push4L = MCList.create(MST_WG_RQST_R.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// ＷＧ間依頼のステータスを更新
			updSts();
			
			// プッシュ通知を行う
			pushSendMessage();
		}
		
		/**
		 * ＷＧ間依頼状況区分を更新する。
		 */
		protected void updSts() {
			MCList<MST_WG_RQST_R> updWgRqstL = MCList.create(MST_WG_RQST_R.class);
			
			// 購買依頼・移送依頼用の上り電文
			MCList<WgRqst_Upd03_DtlR> tmpUp1L = MCList.create(WgRqst_Upd03_DtlR.class);
			// 出荷依頼用の上り電文
			MCList<WgRqst_Upd03_DtlR> tmpUp2L = MCList.create(WgRqst_Upd03_DtlR.class);

			MCList<MST_WG_RQST_R> wgRqstNoBindL = MCList.create(MST_WG_RQST_R.class);
			for(WgRqst_Upd03_DtlR r : up0()) {
				if(!isNull(r.wg_rqst_prms_no())) {
					if (!isNull(r.wg_rqst_no())) {
						MST_WG_RQST_R tmpR = MST_WG_RQST_R.create();
						tmpR.wg_rqst_no(r.wg_rqst_no());
						wgRqstNoBindL.add(tmpR);
					}
					else {
						tmpUp1L.add(r);
					}
				}
				else if(!isNull(r.slo_d_no())) {
					tmpUp2L.add(r);
				}
			}

			// ＷＧ間依頼ＮＯを取得する。
			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			if(!tmpUp1L.isEmpty()) {
				dbSelectKey("MSBAL5100_MST_WG_RQST_PRMS_S12", wgRqstPrmsL,
						MCQueryApiBuilder.create(MST_WG_RQST_PRMS_R.create("T")), tmpUp1L);
			}
			MCList<MST_WG_RQST_R> tgtWgRqstL = MCList.create(MST_WG_RQST_R.class);
			if(!tmpUp2L.isEmpty()) {
				MST_WG_RQST_R t2 = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder tgtWgRqstL_bldr2 = MCQueryApiBuilder.create(t2);
				tgtWgRqstL_bldr2.setSelect(t2.wg_rqst_no);
				tgtWgRqstL_bldr2.addSelect(t2.slo_d_no);
				tgtWgRqstL_bldr2.setWhere(t2.slo_d_no.eq(bind("slo_d_no")));
				tgtWgRqstL_bldr2.addWhereWithAnd(t2.wg_rqst_typ.eq(value(MSC_WG_RQST_TYP.SHIP.value())));
				tgtWgRqstL_bldr2.addWhereWithAnd(t2.can_flg.eq(value(false)));
				dbSelect("MSBAL5100_MST_WG_RQST_S11", tgtWgRqstL, tgtWgRqstL_bldr2, tmpUp2L);
			}

			for (MST_WG_RQST_PRMS_R r : wgRqstPrmsL) {
				MST_WG_RQST_R tmpR = MST_WG_RQST_R.create();
				tmpR.wg_rqst_no(r.wg_rqst_no());
				wgRqstNoBindL.add(tmpR);
			}
			wgRqstNoBindL.addAll(tgtWgRqstL);
			wgRqstNoBindL = wgRqstNoBindL.distinctNE(MST_WG_RQST_PRMS_R.$wg_rqst_no);
			wgRqstNoBindL.sort(MST_WG_RQST_R.$wg_rqst_no);
			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MCQueryApiBuilder wgRqstL_bldr3 = MCQueryApiBuilder.create(MST_WG_RQST_R.create("T"));
			wgRqstL_bldr3.setOrderByAsc(wgRqstL_bldr3.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdate("MSBAL5100_MST_WG_RQST_S12", wgRqstL, wgRqstL_bldr3, wgRqstNoBindL);
			// ＷＧ間依頼に対する全ての回答を取得する。
			MCList<MST_WG_RQST_PRMS_R> updWgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MST_WG_RQST_PRMS_R t4 = MST_WG_RQST_PRMS_R.create("T");
			MCQueryApiBuilder updWgRqstPrmsL_bldr4 = MCQueryApiBuilder.create(t4);
			updWgRqstPrmsL_bldr4.setWhere(t4.wg_rqst_no.eq(bind("wg_rqst_no")));
			dbSelect("MSBAL5100_MST_WG_RQST_PRMS_S13", updWgRqstPrmsL, updWgRqstPrmsL_bldr4, wgRqstNoBindL);
			
			
			MCIndexKey key1 = updWgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no, MST_WG_RQST_PRMS_R.$fix_flg);
			MCIndexKey wgRqstPrmsKey = updWgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no);

			MCIndexKey key2 = wgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_no);
			
			// 各予定の状況を取得する。
			MCList<MST_WG_RQST_PRMS_R> purcBindL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MCList<MST_WG_RQST_PRMS_R> xfrBindL = MCList.create(MST_WG_RQST_PRMS_R.class);
			tgtWgRqstL.init();
			for(MST_WG_RQST_PRMS_R r : updWgRqstPrmsL.subList(MST_WG_RQST_PRMS_R.$fix_flg, true)) {
				MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(key2, r.wg_rqst_no());
				if(isNull(wgRqstR)) {
					continue;
				}
				if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ())) {
					purcBindL.add(r);
				}
				else if(MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
					xfrBindL.add(r);
				}
				else if(MSC_WG_RQST_TYP.isSHIP(wgRqstR.wg_rqst_typ())) {
					tgtWgRqstL.add(wgRqstR);
				}
			}
						
			// 発注予定の状況を取得
			// ＷＧ跨ぎの場合は発注予定の分割はできない。
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			
			poSchdL.addBooleanColumn("arr_cmpl_flg");
			poSchdL.addNumberColumn("base_unit_po_schd_abort_qty");
			poSchdL.addNumberColumn("base_unit_inst_qty");
			poSchdL.addStringColumn("itm_mfg_inst_no");
			MCList<MST_PO_SCHD_R> wkPoSchdL = poSchdL.clone();
			if(!purcBindL.isEmpty()) {
				MST_PO_SCHD_R t5 = MST_PO_SCHD_R.create("T");
				MCQueryApiBuilder wkPoSchdL_bldr5 = MCQueryApiBuilder.create(t5);
				MST_PO_D_R po = MST_PO_D_R.create("T2");
				MST_ARR_PR_R arr = MST_ARR_PR_R.create("T3");
				MST_ITM_MFG_INST_R itm = MST_ITM_MFG_INST_R.create("T4");
				wkPoSchdL_bldr5.setSelect(t5.po_schd_src_no);
				wkPoSchdL_bldr5.addSelect(po.po_d_no);
				wkPoSchdL_bldr5.addSelect(itm.itm_mfg_inst_no);
				wkPoSchdL_bldr5.addSelect(nvl( arr.arr_cmpl_flg, value(false)).as("arr_cmpl_flg"));
				wkPoSchdL_bldr5.addSelect(t5.po_flg);
				wkPoSchdL_bldr5.addSelect(t5.abort_flg);
				wkPoSchdL_bldr5.addSelect(nvl( t5.base_unit_qty, value(0)).as("base_unit_qty"));
				wkPoSchdL_bldr5.addSelect(nvl( po.base_unit_qty, value(0)).as("base_unit_po_qty"));
				wkPoSchdL_bldr5.addSelect(nvl( itm.base_unit_inst_qty, value(0)).as("base_unit_inst_qty"));
				wkPoSchdL_bldr5.setWhere(t5.po_schd_src_typ.eq(bind("1")), MSC_PO_SCHD_SRC_TYP.RQST.value());
				wkPoSchdL_bldr5.addWhereWithAnd(t5.po_schd_src_no.eq(bind("wg_rqst_prms_no")));
				wkPoSchdL_bldr5.addWhereWithAnd(t5.rqst_can_flg.eq(value(false)));
				wkPoSchdL_bldr5.addWhereWithAnd(t5.split_src_schd_no.isNull());
				wkPoSchdL_bldr5.addLeftOuterJoin(po, bracket( po.po_d_no.eq(t5.po_d_no)
						.and(po.can_flg.eq(value(false)))));
				wkPoSchdL_bldr5.addLeftOuterJoin(arr, bracket( arr.po_d_no.eq(po.po_d_no)));
				wkPoSchdL_bldr5.addLeftOuterJoin(itm, bracket( itm.itm_ord_no.eq(t5.outsrc_itm_ord_no)
						.and(itm.can_flg.eq(value(false)))));
				dbSelect("MSBAL5100_MST_PO_SCHD_S03", wkPoSchdL, wkPoSchdL_bldr5, purcBindL);
				
				// ベース
				MCGroupByPolicy baseGbp = new MCGroupByPolicy(MST_PO_SCHD_R.$po_schd_src_no);
				baseGbp.min("arr_cmpl_flg");
				baseGbp.min("abort_flg");
				baseGbp.min("base_unit_qty");
				poSchdL.setAll(wkPoSchdL.groupBy(baseGbp));
				
				// 外注製造指図数
				MCList<MST_PO_SCHD_R> grpL1 = wkPoSchdL.groupBy(MST_PO_SCHD_R.$po_schd_src_no, "itm_mfg_inst_no", "base_unit_inst_qty");
				MCGroupByPolicy itmMfgInstGbp = new MCGroupByPolicy(MST_PO_SCHD_R.$po_schd_src_no);
				itmMfgInstGbp.sum("base_unit_inst_qty");
				grpL1 = grpL1.groupBy(itmMfgInstGbp);
				MCIndexKey grpL1Key = grpL1.createIndex(MST_PO_SCHD_R.$po_schd_src_no);
				for (MST_PO_SCHD_R r :poSchdL) {
					MST_PO_SCHD_R grpR1 = grpL1.getFirst(grpL1Key, r.po_schd_src_no());
					r.setNumberNE("base_unit_inst_qty", grpR1.getNumberNE("base_unit_inst_qty"));
				}
				
				// 発注数
				MCList<MST_PO_SCHD_R> grpL2 = wkPoSchdL.groupBy(MST_PO_SCHD_R.$po_schd_src_no, "po_d_no", "base_unit_po_qty");
				MCGroupByPolicy poDGbp = new MCGroupByPolicy(MST_PO_SCHD_R.$po_schd_src_no);
				poDGbp.min("po_d_no");
				poDGbp.sum("base_unit_po_qty");
				grpL2 = grpL2.groupBy(poDGbp);
				MCIndexKey grpL2Key = grpL2.createIndex(MST_PO_SCHD_R.$po_schd_src_no);
				for (MST_PO_SCHD_R r :poSchdL) {
					MST_PO_SCHD_R grpR2 = grpL2.getFirst(grpL2Key, r.po_schd_src_no());
					r.setNumberNE("base_unit_po_qty", grpR2.getNumberNE("base_unit_po_qty"));
					// 発注の更新でこのサービスが呼ばれた時点では発注予定の状況（発注済ＦＬＧ、発注数など）が更新されていないため、発注明細ベースで打切数を計算する
					// 発注では予定に対して一部発注はできず、残数は一部打切扱いになる
					if (!isNull("po_d_no") && r.getBooleanNE("abort_flg") && !r.getNumberNE("base_unit_po_qty").isZero()) {
						r.setNumberNE("base_unit_po_schd_abort_qty", r.getNumberNE("base_unit_qty").subtract(r.getNumberNE("base_unit_po_qty")));
					}
					// 未発注で打切りであれば、全数打切（ただし、現状の機能では未発注で打切はできない）
					else if (isNull("po_d_no") && r.getBooleanNE("abort_flg")) {
						r.setNumberNE("base_unit_po_schd_abort_qty", r.getNumberNE("base_unit_qty"));
					}
					else {
						r.setNumberNE("base_unit_po_schd_abort_qty", MCNumber.ZERO);
					}
				}
			}
			MCIndexKey poSchdKey = poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_src_no);

			// 移動・移送予定の状況を取得
			MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
			// 移送用
			xfrSchdL.addBooleanColumn("dlv_cmpl_flg");
			xfrSchdL.addNumberColumn("ship_inst_qty");
			xfrSchdL.addNumberColumn("ship_schd_abort_qty");
			xfrSchdL.addStringColumn("ship_pr_no");

			// 移動用
			xfrSchdL.addBooleanColumn("cmpl_flg");
			xfrSchdL.addBooleanColumn("xfr_alloc_sts_cmpl_flg");
			xfrSchdL.addBooleanColumn("xfr_alloc_sts_abort_flg");
			xfrSchdL.addStringColumn("pr_sts_typ");
			xfrSchdL.addStringColumn("wg_rqst_sts_typ");
			xfrSchdL.addStringColumn("xfr_alloc_sts_no");
			
			MCList<MST_XFR_SCHD_R> wkXfrSchdL = xfrSchdL.clone();
			MCList<MST_XFR_SCHD_R> wkXfrSchdL2 = xfrSchdL.clone();
			MCList<MST_XFR_SCHD_R> tmpXfrSchdL = xfrSchdL.clone();
			if(!xfrBindL.isEmpty()) {
				// 移送
				MST_XFR_SCHD_R t6 = MST_XFR_SCHD_R.create("T");
				MCQueryApiBuilder wkXfrSchdL_bldr6 = MCQueryApiBuilder.create(t6);
				MST_SHIP_PR_R ship = MST_SHIP_PR_R.create("SHIP");
				wkXfrSchdL_bldr6.setSelect(t6.xfr_src_no);
				wkXfrSchdL_bldr6.addSelect(ship.ship_pr_no);
				wkXfrSchdL_bldr6.addSelect(t6.gi_lg_grp_cd);
				wkXfrSchdL_bldr6.addSelect(t6.gr_lg_grp_cd);
				wkXfrSchdL_bldr6.addSelect(nvl( ship.dlv_cmpl_flg, value(false)).as("dlv_cmpl_flg"));
				wkXfrSchdL_bldr6.addSelect(t6.base_unit_qty.as("base_unit_qty"));
				wkXfrSchdL_bldr6.addSelect(nvl( ship.ship_inst_qty, value(0)).as("ship_inst_qty"));
				wkXfrSchdL_bldr6.addSelect(nvl( ship.ship_schd_abort_qty, value(0)).as("ship_schd_abort_qty"));
				wkXfrSchdL_bldr6.setWhere(t6.xfr_src_typ.eq(bind("1")), MSC_XFR_SRC_TYP.WG_RQST.value());
				wkXfrSchdL_bldr6.addWhereWithAnd(t6.xfr_src_no.eq(bind("wg_rqst_prms_no")));
				wkXfrSchdL_bldr6.addWhereWithAnd(t6.gi_lg_grp_cd.neq(t6.gr_lg_grp_cd));
				wkXfrSchdL_bldr6.addLeftOuterJoin(ship, bracket( ship.xfr_schd_no.eq(t6.xfr_schd_no)));
				dbSelect("MSBAL5100_MST_XFR_SCHD_S05", wkXfrSchdL, wkXfrSchdL_bldr6, xfrBindL);

				if (!wkXfrSchdL.isEmpty()) {
					// ベース
					MCGroupByPolicy baseGbp = new MCGroupByPolicy(MST_XFR_SCHD_R.$xfr_src_no, MST_XFR_SCHD_R.$gi_lg_grp_cd, MST_XFR_SCHD_R.$gr_lg_grp_cd);
					baseGbp.min("dlv_cmpl_flg");
					baseGbp.min("base_unit_qty");
					tmpXfrSchdL.setAll(wkXfrSchdL.groupBy(baseGbp));
					
					// 指図数、打切数
					MCList<MST_XFR_SCHD_R> grpL1 = wkXfrSchdL.groupBy(MST_XFR_SCHD_R.$xfr_src_no, "ship_pr_no", "ship_inst_qty", "ship_schd_abort_qty");
					MCGroupByPolicy instPrGbp = new MCGroupByPolicy(MST_XFR_SCHD_R.$xfr_src_no);
					instPrGbp.sum("ship_inst_qty");
					instPrGbp.sum("ship_schd_abort_qty");
					grpL1 = grpL1.groupBy(instPrGbp);
					MCIndexKey grpL1Key = grpL1.createIndex(MST_XFR_SCHD_R.$xfr_src_no);
					for (MST_XFR_SCHD_R r :tmpXfrSchdL) {
						MST_XFR_SCHD_R grpR1 = grpL1.getFirst(grpL1Key, r.xfr_src_no());
						r.setNumberNE("ship_inst_qty", grpR1.getNumberNE("ship_inst_qty"));
						r.setNumberNE("ship_schd_abort_qty", grpR1.getNumberNE("ship_schd_abort_qty"));
					}
					
					xfrSchdL.addAll(tmpXfrSchdL);
				}
				
				// 移動
				MST_XFR_SCHD_R t7 = MST_XFR_SCHD_R.create("T");
				MCQueryApiBuilder wkXfrSchdL2_bldr7 = MCQueryApiBuilder.create(t7);
				MST_XFR_ALLOC_STS_R xfr = MST_XFR_ALLOC_STS_R.create("XFR");
				wkXfrSchdL2_bldr7.setSelect(t7.xfr_src_no);
				wkXfrSchdL2_bldr7.addSelect(xfr.xfr_alloc_sts_no);
				wkXfrSchdL2_bldr7.addSelect(t7.gi_lg_grp_cd);
				wkXfrSchdL2_bldr7.addSelect(t7.gr_lg_grp_cd);
				wkXfrSchdL2_bldr7.addSelect(t7.ship_inst_typ);
				wkXfrSchdL2_bldr7.addSelect(nvl( xfr.cmpl_flg, value(false)).as("xfr_alloc_sts_cmpl_flg"));
				wkXfrSchdL2_bldr7.addSelect(nvl( xfr.abort_flg, value(false)).as("xfr_alloc_sts_abort_flg"));
				wkXfrSchdL2_bldr7.addSelect(xfr.pr_sts_typ);
				wkXfrSchdL2_bldr7.setWhere(t7.xfr_src_typ.eq(bind("1")), MSC_XFR_SRC_TYP.WG_RQST.value());
				wkXfrSchdL2_bldr7.addWhereWithAnd(t7.xfr_src_no.eq(bind("wg_rqst_prms_no")));
				wkXfrSchdL2_bldr7.addWhereWithAnd(t7.gi_lg_grp_cd.eq(t7.gr_lg_grp_cd));
				wkXfrSchdL2_bldr7.addLeftOuterJoin(xfr, bracket( xfr.xfr_schd_no.eq(t7.xfr_schd_no)));
				dbSelect("MSBAL5100_MST_XFR_SCHD_S06", wkXfrSchdL2, wkXfrSchdL2_bldr7, xfrBindL);

				if (!wkXfrSchdL2.isEmpty()) {
					// ベース
					MCGroupByPolicy baseGbp = new MCGroupByPolicy(MST_XFR_SCHD_R.$xfr_src_no, MST_XFR_SCHD_R.$ship_inst_typ, MST_XFR_SCHD_R.$gi_lg_grp_cd, MST_XFR_SCHD_R.$gr_lg_grp_cd);
					tmpXfrSchdL.setAll(wkXfrSchdL2.groupBy(baseGbp));
					
					MCList<MST_XFR_SCHD_R> grpL1 = wkXfrSchdL2.groupBy(MST_XFR_SCHD_R.$xfr_src_no, "xfr_alloc_sts_cmpl_flg");
					MCList<MST_XFR_SCHD_R> grpL2 = wkXfrSchdL2.groupBy(MST_XFR_SCHD_R.$xfr_src_no, "pr_sts_typ");
					MCList<MST_XFR_SCHD_R> grpL3 = wkXfrSchdL2.groupBy(MST_XFR_SCHD_R.$xfr_src_no, "pr_sts_typ", "xfr_alloc_sts_abort_flg");
					MCIndexKey grpL1Key = grpL1.createIndex(MST_XFR_SCHD_R.$xfr_src_no, "xfr_alloc_sts_cmpl_flg");
					MCIndexKey grpL2Key = grpL2.createIndex(MST_XFR_SCHD_R.$xfr_src_no, "pr_sts_typ");
					MCIndexKey grpL3Key = grpL3.createIndex(MST_XFR_SCHD_R.$xfr_src_no, "pr_sts_typ", "xfr_alloc_sts_abort_flg");
					for (MST_XFR_SCHD_R r :tmpXfrSchdL) {
						// 移動移送予定に紐づく移動引当状況が全件完了している場合、完了
						if (isNull(grpL1.getFirst(grpL1Key, r.xfr_src_no(), false))) {
							r.setStringNE("wg_rqst_sts_typ", MSC_WG_RQST_STS_TYP.CMPL.value());
						}
						// 移動指図あり
						else if (!MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())) {							
							// 移動移送予定に紐づく移動引当状況に未指図のレコードがない場合は、指図・発注済み
							if (isNull(grpL2.getFirst(grpL2Key, r.xfr_src_no(), MSC_PR_STS_TYP.NOT_INST.value()))) {
								r.setStringNE("wg_rqst_sts_typ", MSC_WG_RQST_STS_TYP.INST.value());
							}
							// 移動移送予定に紐づく移動引当状況に未指図以外（指図済・一部完了・完了）のレコードが存在する場合
							else if (!isNull(grpL2.getFirst(grpL2Key, r.xfr_src_no(), MSC_PR_STS_TYP.INST.value()))
										|| !isNull(grpL2.getFirst(grpL2Key, r.xfr_src_no(), MSC_PR_STS_TYP.PART_COMP.value()))
										|| !isNull(grpL2.getFirst(grpL2Key, r.xfr_src_no(), MSC_PR_STS_TYP.COMP.value()))
									) {
								// 打切り以外のレコードが全件未指図の場合、確定
								if (isNull(grpL3.getFirst(grpL3Key, r.xfr_src_no(), MSC_PR_STS_TYP.INST.value(), false))
										&& isNull(grpL3.getFirst(grpL3Key, r.xfr_src_no(), MSC_PR_STS_TYP.PART_COMP.value(), false))
										&& isNull(grpL3.getFirst(grpL3Key, r.xfr_src_no(), MSC_PR_STS_TYP.COMP.value(), false))
										) {
									r.setStringNE("wg_rqst_sts_typ", MSC_WG_RQST_STS_TYP.PRMS.value());
								}	
								// 未指図のレコードがある場合は、一部指図・発注済み
								else if (!isNull(grpL3.getFirst(grpL3Key, r.xfr_src_no(), MSC_PR_STS_TYP.NOT_INST.value(), false))) {
									r.setStringNE("wg_rqst_sts_typ", MSC_WG_RQST_STS_TYP.PART_INST.value());
								}
								// それ以外は指図・発注済み
								else {
									r.setStringNE("wg_rqst_sts_typ", MSC_WG_RQST_STS_TYP.INST.value());
								}
							}
							// 上記以外は、確定
							else {
								r.setStringNE("wg_rqst_sts_typ", MSC_WG_RQST_STS_TYP.PRMS.value());
							}
						}
						// 上記以外は、確定
						else {
							r.setStringNE("wg_rqst_sts_typ", MSC_WG_RQST_STS_TYP.PRMS.value());
						}
					}
					
					xfrSchdL.addAll(tmpXfrSchdL);
				}
				
			}
			MCIndexKey xfrSchdKey = xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_src_no);
			
			// 出荷予定の状況を取得
			MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R t8 = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder shipSchdL_bldr8 = MCQueryApiBuilder.create(t8);
			if(!tgtWgRqstL.isEmpty()) {
				shipSchdL_bldr8.setSelect(t8.ship_schd_no,t8.pr_sts_typ,t8.abort_flg);
				shipSchdL_bldr8.setWhere(t8.ship_schd_no.eq(bind("wg_rqst_src_no")));
				dbSelect("MSBAL5100_MST_SHIP_SCHD_S01", shipSchdL, shipSchdL_bldr8,
						tgtWgRqstL.groupBy(MST_WG_RQST_R.$wg_rqst_src_no));
			}
			MCIndexKey shipSchdKey = shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			
			// ＷＧ間依頼状況区分を取得する。
			for(MST_WG_RQST_R wgRqstR : wgRqstL) {
				// 確定が一件もない場合
				MST_WG_RQST_PRMS_R wgRqstPrmsR = updWgRqstPrmsL.getFirst(key1, wgRqstR.wg_rqst_no(), true);				
				if(isNull(wgRqstPrmsR)) {
					MST_WG_RQST_R updWgRqstR = MST_WG_RQST_R.create();
					updWgRqstR.wg_rqst_no(wgRqstR.wg_rqst_no());
					updWgRqstR.wg_rqst_sts_typ(MSC_WG_RQST_STS_TYP.RQST.value());
					updWgRqstL.add(updWgRqstR);
					continue;
				}
				
				// 設定すべきＷＧ間依頼状況区分を取得する。
				String sts = getWgRqstStsTyp(wgRqstR, updWgRqstPrmsL, wgRqstPrmsKey, poSchdL, poSchdKey, xfrSchdL, xfrSchdKey, shipSchdL, shipSchdKey);
				if(!isNull(sts)) {
					// 進捗の確認
					crtPushList(sts, wgRqstR);
					
					if(!isSame(wgRqstR.wg_rqst_sts_typ(), sts)) {
						MST_WG_RQST_R updWgRqstR = MST_WG_RQST_R.create();
						updWgRqstR.wg_rqst_no(wgRqstR.wg_rqst_no());
						updWgRqstR.wg_rqst_sts_typ(sts);
						updWgRqstR.inst_dt(wgRqstR.inst_dt());
						updWgRqstR.inst_can_dt(wgRqstR.inst_can_dt());
						updWgRqstR.act_dt(wgRqstR.act_dt());
						updWgRqstR.act_can_dt(wgRqstR.act_can_dt());
						updWgRqstL.add(updWgRqstR);
					}
				}
			}

			// ＷＧ間依頼のＷＧ間依頼状況区分を更新する。
			MST_WG_RQST_R t9 = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder updWgRqstL_bldr9 = MCQueryApiBuilder.create(t9);
			if(!updWgRqstL.isEmpty()) {
				updWgRqstL_bldr9.setSet(t9.wg_rqst_sts_typ);
				updWgRqstL_bldr9.addSet(t9.inst_dt);
				updWgRqstL_bldr9.addSet(t9.inst_can_dt);
				updWgRqstL_bldr9.addSet(t9.act_dt);
				updWgRqstL_bldr9.addSet(t9.act_can_dt);
				dbUpdateKey("MSBAL5100_MST_WG_RQST_U10", updWgRqstL, updWgRqstL_bldr9);
			}		
		}

		/**
		 * 設定すべきＷＧ間依頼状況区分を判断する。
		 * @param wgRqstR 対象のＷＧ間依頼の情報
		 * @param wgRqstPrmsL ＷＧ間依頼回答のリスト
		 * @param wgRqstPrmsKey ＷＧ間依頼回答のインデックスキー
		 * @param poSchdL 購買依頼のステータス判断用のリスト
		 * @param poSchdKey　購買依頼のインデックスキー
		 * @param xfrSchdL　移送依頼のステータス判断用のリスト
		 * @param xfrSchdKey　移送依頼のインデックスキー
		 * @param shipSchdL　出荷依頼のステータス判断用のリスト
		 * @param shipSchdKey　出荷依頼のインデックスキー
		 * @return String 設定すべきＷＧ間依頼状況区分
		 */
		protected String getWgRqstStsTyp(
				MST_WG_RQST_R wgRqstR
				, MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsL
				, MCIndexKey wgRqstPrmsKey
				, MCList<MST_PO_SCHD_R> poSchdL
				, MCIndexKey poSchdKey
				, MCList<MST_XFR_SCHD_R> xfrSchdL
				, MCIndexKey xfrSchdKey
				, MCList<MST_SHIP_SCHD_R> shipSchdL
				, MCIndexKey shipSchdKey
		) {
			String aSts = null;
			java.util.Set<String> stsSet = new java.util.HashSet<String>();
			for(MST_WG_RQST_PRMS_R r : wgRqstPrmsL.subList(wgRqstPrmsKey, wgRqstR.wg_rqst_no())) {
				// 購買依頼の場合
				if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ())) {
					MST_PO_SCHD_R poSchdR = poSchdL.getFirst(poSchdKey, r.wg_rqst_prms_no());
					if(isNull(poSchdR)) {
						continue;
					}
					if(poSchdR.getBooleanNE("arr_cmpl_flg")) { 
						aSts = MSC_WG_RQST_STS_TYP.CMPL.value();
					}
					// 依頼数 <= 発注数+発注予定打切数 であれば指図・発注済
					else if (poSchdR.base_unit_qty().lte(poSchdR.getNumberNE("base_unit_po_qty").add(poSchdR.getNumberNE("base_unit_po_schd_abort_qty")))) {
						aSts = MSC_WG_RQST_STS_TYP.INST.value();
					}
					// 0 < 発注数 または 0 < 指図数 であれば一部指図・発注済
					else if(poSchdR.getNumberNE("base_unit_po_qty").gt(MCNumber.ZERO) || poSchdR.getNumberNE("base_unit_inst_qty").gt(MCNumber.ZERO)) {
						aSts = MSC_WG_RQST_STS_TYP.PART_INST.value();
					}
					else {
						aSts = MSC_WG_RQST_STS_TYP.PRMS.value();
					}
				}
				// 移送依頼の場合
				else if(MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
					MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(xfrSchdKey, r.wg_rqst_prms_no());
					if(isNull(xfrSchdR)) {
						continue;
					}
					// 移送
					if (!isSame(xfrSchdR.gi_lg_grp_cd(), xfrSchdR.gr_lg_grp_cd())) {
						if(xfrSchdR.getBooleanNE("dlv_cmpl_flg")) {
							aSts = MSC_WG_RQST_STS_TYP.CMPL.value();
						}
						// 依頼数 <= 指図数+出荷予定打切数 であれば指図・発注済
						else if(xfrSchdR.base_unit_qty().lte(xfrSchdR.getNumberNE("ship_inst_qty").add(xfrSchdR.getNumberNE("ship_schd_abort_qty")))) {
							aSts = MSC_WG_RQST_STS_TYP.INST.value();
						}
						// 0 < 指図数 であれば一部指図・発注済
						else if(!xfrSchdR.getNumberNE("ship_inst_qty").isZero()) {
							aSts = MSC_WG_RQST_STS_TYP.PART_INST.value();
						}
						else {
							aSts = MSC_WG_RQST_STS_TYP.PRMS.value();
						}
					}
					// 移動
					else {
						aSts = xfrSchdR.getStringNE("wg_rqst_sts_typ");
					}
				}
				// 出荷依頼の場合
				else if(MSC_WG_RQST_TYP.isSHIP(wgRqstR.wg_rqst_typ())) {
					MST_SHIP_SCHD_R shipSchdR = shipSchdL.getFirst(shipSchdKey, wgRqstR.wg_rqst_src_no());
					if(isNull(shipSchdR)) {
						continue;
					}
					if(MSC_PR_STS_TYP.isSHIP(shipSchdR.pr_sts_typ())
							|| MSC_PR_STS_TYP.isNOT_ARR(shipSchdR.pr_sts_typ())
							|| MSC_PR_STS_TYP.isPART_ARR(shipSchdR.pr_sts_typ())
							|| MSC_PR_STS_TYP.isPART_EXT_ARR(shipSchdR.pr_sts_typ())
							|| MSC_PR_STS_TYP.isARR(shipSchdR.pr_sts_typ())
							|| MSC_PR_STS_TYP.isEXT_ARR(shipSchdR.pr_sts_typ())
							|| MSC_PR_STS_TYP.isPART_COMP(shipSchdR.pr_sts_typ())
							|| MSC_PR_STS_TYP.isCOMP(shipSchdR.pr_sts_typ())
							|| shipSchdR.abort_flg()
					) {
						aSts = MSC_WG_RQST_STS_TYP.CMPL.value();
					}
					// 出荷依頼は一部指図すると、出荷依頼も分割されるため、一部指図・発注済はない
					else if(MSC_PR_STS_TYP.isINST(shipSchdR.pr_sts_typ())
							|| MSC_PR_STS_TYP.isPART_SHIP(shipSchdR.pr_sts_typ())
					) {
						aSts = MSC_WG_RQST_STS_TYP.INST.value();
					}
					else {
						aSts = MSC_WG_RQST_STS_TYP.PRMS.value();
					}
				}
				stsSet.add(aSts);
			}
			
			boolean hasCmpl = stsSet.contains(MSC_WG_RQST_STS_TYP.CMPL.value());
			boolean hasInst = stsSet.contains(MSC_WG_RQST_STS_TYP.INST.value());
			boolean hasPartInst = stsSet.contains(MSC_WG_RQST_STS_TYP.PART_INST.value());
			boolean hasPrms = stsSet.contains(MSC_WG_RQST_STS_TYP.PRMS.value());
			boolean empty = stsSet.isEmpty();
			// 依頼残がない場合
			if(wgRqstR.not_cmpl_qty().isZero()) {
				// 予定がないなら未確定
				if (empty) {
					return MSC_WG_RQST_STS_TYP.RQST.value();
				}
				// 全て完了なら完了
				else if (hasCmpl && !hasInst && !hasPartInst && !hasPrms) {
					return MSC_WG_RQST_STS_TYP.CMPL.value();
				}
				// 全て指図・発注済以上なら指図済
				else if (hasInst && !hasPartInst && !hasPrms) {
					return MSC_WG_RQST_STS_TYP.INST.value();
				}
				// 一部指図・発注済以上を含むなら一部指図・発注済
				else if (hasCmpl || hasInst || hasPartInst) {
					return MSC_WG_RQST_STS_TYP.PART_INST.value();
				}
				// それ以外は確定
				else {
					return MSC_WG_RQST_STS_TYP.PRMS.value();
				}
			}
			// 依頼残がある場合
			else {
				// 予定がないなら未確定
				if (empty) {
					return MSC_WG_RQST_STS_TYP.RQST.value();
				}
				// 一部指図・発注済以上を含むなら一部指図・発注済
				else if (hasCmpl || hasInst || hasPartInst) {
					return MSC_WG_RQST_STS_TYP.PART_INST.value();
				}
				// それ以外は確定
				else {
					return MSC_WG_RQST_STS_TYP.PRMS.value();
				}
			}
		}
		
		/**
		 * ポップアップ通知用のリストを作成する。
		 * @param sts　設定すべきＷＧ間依頼状況区分
		 * @param wgRqstR　対象のＷＧ間依頼の情報
		 */
		protected void crtPushList(String sts, MST_WG_RQST_R wgRqstR) {
			if(isSame(wgRqstR.wg_rqst_sts_typ(), MSC_WG_RQST_STS_TYP.RQST.value())) {
				if(isSame(sts, MSC_WG_RQST_STS_TYP.PART_INST.value()) || isSame(sts, MSC_WG_RQST_STS_TYP.INST.value())) {
					_push1L.add(wgRqstR);
					wgRqstR.inst_dt(getToday());
				}
				else if (isSame(sts, MSC_WG_RQST_STS_TYP.CMPL.value())) {
					_push3L.add(wgRqstR);
					wgRqstR.act_dt(getToday());
				}
			}
			else if(isSame(wgRqstR.wg_rqst_sts_typ(), MSC_WG_RQST_STS_TYP.PRMS.value())) {
				if(isSame(sts, MSC_WG_RQST_STS_TYP.PART_INST.value()) || isSame(sts, MSC_WG_RQST_STS_TYP.INST.value())) {
					_push1L.add(wgRqstR);
					wgRqstR.inst_dt(getToday());
				}
				else if (isSame(sts, MSC_WG_RQST_STS_TYP.CMPL.value())) {
					_push3L.add(wgRqstR);
					wgRqstR.act_dt(getToday());
				}
			}
			else if(isSame(wgRqstR.wg_rqst_sts_typ(), MSC_WG_RQST_STS_TYP.PART_INST.value()) || isSame(wgRqstR.wg_rqst_sts_typ(), MSC_WG_RQST_STS_TYP.INST.value())) {
				if(isSame(sts, MSC_WG_RQST_STS_TYP.CMPL.value())) {
					_push3L.add(wgRqstR);
					wgRqstR.act_dt(getToday());
				}
				else if(isSame(sts, MSC_WG_RQST_STS_TYP.RQST.value())
					|| isSame(sts, MSC_WG_RQST_STS_TYP.PRMS.value())
				) {
					_push2L.add(wgRqstR);
					wgRqstR.inst_can_dt(getToday());
				}
			}
			else if(isSame(wgRqstR.wg_rqst_sts_typ(), MSC_WG_RQST_STS_TYP.CMPL.value())) {
				if(isSame(sts, MSC_WG_RQST_STS_TYP.RQST.value())
					|| isSame(sts, MSC_WG_RQST_STS_TYP.PRMS.value())
					|| isSame(sts, MSC_WG_RQST_STS_TYP.PART_INST.value())
					|| isSame(sts, MSC_WG_RQST_STS_TYP.INST.value())
				) {
					_push4L.add(wgRqstR);
					wgRqstR.act_can_dt(getToday());
				}
			}
		}
		
		/**
		 * 依頼のステータスが変わった場合は、ポップアップ通知を行う。
		 */
		protected void pushSendMessage() {
			MAUCL_PushNtcMgr mgr;
			MAUCL_PushNtcInfo info;

			// プッシュ通知用にＷＧマスタを取得する
			MCList<MST_WG_RQST_R> tmpWgRqstL = MCList.create(MST_WG_RQST_R.class);
			tmpWgRqstL.addAll(_push1L);
			tmpWgRqstL.addAll(_push2L);
			tmpWgRqstL.addAll(_push3L);
			tmpWgRqstL.addAll(_push4L);
			
			MCList<MAM_WG_R> wgL = MCList.create(MAM_WG_R.class);
			MCList<MAM_WG_R> tmpL = MCList.create(MAM_WG_R.class);
			for(MST_WG_RQST_R dtlR : tmpWgRqstL) {
				MAM_WG_R wgR = MAM_WG_R.create();
				wgR.wg_cd(dtlR.rqst_fr_wg_cd());
				tmpL.add(wgR);
				
				wgR = MAM_WG_R.create();
				wgR.wg_cd(dtlR.rqst_to_wg_cd());
				tmpL.add(wgR);
			}
			
			tmpL.sort(MAM_WG_R.$wg_cd);
			MAM_WG_R t1 = MAM_WG_R.create("T");
			MCQueryApiBuilder wgL_bldr1 = MCQueryApiBuilder.create(t1);
			wgL_bldr1.setSelect(t1.wg_cd);
			wgL_bldr1.addSelect(t1.wg_nm);
			dbSelectKey("MSBAL5100_MAM_WG_S03", wgL, wgL_bldr1, tmpL.groupBy(MAM_WG_R.$wg_cd));
			MCIndexKey wgKey = wgL.createIndex(MAM_WG_R.$wg_cd);

			
			// 指図登録
			for(MST_WG_RQST_R wgRqstR : _push1L.groupBy(MST_WG_RQST_R.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd, MST_WG_RQST_R.$rqst_dt)) {
				MAM_WG_R frWgR = wgL.getFirst(wgKey, wgRqstR.rqst_fr_wg_cd());
				MAM_WG_R toWgR = wgL.getFirst(wgKey, wgRqstR.rqst_to_wg_cd());
				
				MCMessage message = new MCMessage(MSBAL0012, wgRqstR.rqst_fr_wg_cd(), frWgR.wg_nm(), wgRqstR.rqst_to_wg_cd(), toWgR.wg_nm());
				// 依頼元
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST_PRMS);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_fr_wg_cd(), wgRqstR.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.INST_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, true, true, true, false,
						MSC_WG_RQST_REG_OPE.OPE_REF.value(), wgRqstR.rqst_fr_wg_cd(),
						wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();

				// 依頼先
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_to_wg_cd(), wgRqstR.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.INST_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, true, false, MSC_WG_RQST_ADJST_OPE.OPE_REF.value(),
						wgRqstR.rqst_fr_wg_cd(), wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();
			}
			
			// 指図取消
			for(MST_WG_RQST_R wgRqstR : _push2L.groupBy(MST_WG_RQST_R.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd, MST_WG_RQST_R.$rqst_dt)) {
				MAM_WG_R frWgR = wgL.getFirst(wgKey, wgRqstR.rqst_fr_wg_cd());
				MAM_WG_R toWgR = wgL.getFirst(wgKey, wgRqstR.rqst_to_wg_cd());
				
				MCMessage message = new MCMessage(MSBAL0014, wgRqstR.rqst_fr_wg_cd(), frWgR.wg_nm(), wgRqstR.rqst_to_wg_cd(), toWgR.wg_nm());
				// 依頼元
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST_PRMS);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_fr_wg_cd(), wgRqstR.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.INST_CAN_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, false, false, true, false,
						MSC_WG_RQST_REG_OPE.OPE_REF.value(), wgRqstR.rqst_fr_wg_cd(),
						wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();

				// 依頼先
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_to_wg_cd(), wgRqstR.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.INST_CAN_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						false, false, false, MSC_WG_RQST_ADJST_OPE.OPE_REF.value(),
						wgRqstR.rqst_fr_wg_cd(), wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();
			}
			
			// 実績登録
			for(MST_WG_RQST_R wgRqstR : _push3L.groupBy(MST_WG_RQST_R.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd, MST_WG_RQST_R.$rqst_dt)) {
				MAM_WG_R frWgR = wgL.getFirst(wgKey, wgRqstR.rqst_fr_wg_cd());
				MAM_WG_R toWgR = wgL.getFirst(wgKey, wgRqstR.rqst_to_wg_cd());
				
				MCMessage message = new MCMessage(MSBAL0013, wgRqstR.rqst_fr_wg_cd(), frWgR.wg_nm(), wgRqstR.rqst_to_wg_cd(), toWgR.wg_nm());
				// 依頼元
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST_PRMS);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_fr_wg_cd(), wgRqstR.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.ACT_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, false, true, true, false,
						MSC_WG_RQST_REG_OPE.OPE_REF.value(), wgRqstR.rqst_fr_wg_cd(),
						wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();

				// 依頼先
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_to_wg_cd(), wgRqstR.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.ACT_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						false, true, false, MSC_WG_RQST_ADJST_OPE.OPE_REF.value(),
						wgRqstR.rqst_fr_wg_cd(), wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();
			}
			
			// 実績取消
			for(MST_WG_RQST_R wgRqstR : _push4L.groupBy(MST_WG_RQST_R.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd, MST_WG_RQST_R.$rqst_dt)) {
				MAM_WG_R frWgR = wgL.getFirst(wgKey, wgRqstR.rqst_fr_wg_cd());
				MAM_WG_R toWgR = wgL.getFirst(wgKey, wgRqstR.rqst_to_wg_cd());
				
				MCMessage message = new MCMessage(MSBAL0015, wgRqstR.rqst_fr_wg_cd(), frWgR.wg_nm(), wgRqstR.rqst_to_wg_cd(), toWgR.wg_nm());
				// 依頼元
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST_PRMS);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_fr_wg_cd(), wgRqstR.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.ACT_CAN_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, true, false, true, false,
						MSC_WG_RQST_REG_OPE.OPE_REF.value(), wgRqstR.rqst_fr_wg_cd(),
						wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();

				// 依頼先
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_to_wg_cd(), wgRqstR.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.ACT_CAN_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, false, false, MSC_WG_RQST_ADJST_OPE.OPE_REF.value(),
						wgRqstR.rqst_fr_wg_cd(), wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();
			}

		}
	}
	
	/**
	 * WgRqst_Upd04オペレーション.<p>
	 * ＜ＷＧ間依頼の再調整依頼＞
	 */
	public class WgRqst_Upd04 extends MSBAL_WgRqstService_MC_A.WgRqst_Upd04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// ＷＧ間依頼の関連項目を更新
			updWgRqst();
			
			// プッシュ通知を行う
			pushSendMessage();
		}
		
		/**
		 * ＷＧ間依頼情報の関連項目を更新する。
		 */
		protected void updWgRqst() {
			MSBDL_PoSchdRegService.PoSchd_Upd04 poSchdUpd04 = MSBDL_PoSchdRegService.crtPoSchd_Upd04();
			MSBEL_XfrSchdService.XfrSchd_Upd03 xfrSchdUpd03 = MSBEL_XfrSchdService.crtXfrSchd_Upd03();
			MSBBL_SloStsRegService.SloSts_Ins01 sloStsIns01 = MSBBL_SloStsRegService.crtSloSts_Ins01();

			
			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			dbSelectKey("MSBAL5100_MST_WG_RQST_S13", wgRqstL,
					MCQueryApiBuilder.create(MST_WG_RQST_R.create("T")), up0());
			MCIndexKey key1 = wgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_no);
			
			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MST_WG_RQST_PRMS_R t2 = MST_WG_RQST_PRMS_R.create("T");
			MCQueryApiBuilder wgRqstPrmsL_bldr2 = MCQueryApiBuilder.create(t2);
			wgRqstPrmsL_bldr2.setWhere(t2.wg_rqst_no.eq(bind("wg_rqst_no")));
			dbSelect("MSBAL5100_MST_WG_RQST_PRMS_S14", wgRqstPrmsL, wgRqstPrmsL_bldr2, up0());
			
			MCIndexKey key2 = wgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no, MST_WG_RQST_PRMS_R.$fix_flg);

			MCList<MST_WG_RQST_R> updWgRqstL1 = MCList.create(MST_WG_RQST_R.class);
			MCList<MST_WG_RQST_R> updWgRqstL2 = MCList.create(MST_WG_RQST_R.class);
			for(WgRqst_Upd04_DtlR r : up0()) {

				MST_WG_RQST_R wgRqstR = wgRqstL.getFirst(key1, r.wg_rqst_no());
				if(isNull(wgRqstR)) {
					continue;
				}
				MST_WG_RQST_R updWgRqstR = MST_WG_RQST_R.create();
				updWgRqstR.re_rqst_flg(r.re_rqst_flg());
				updWgRqstR.re_rqst_dt(r.re_rqst_dt());
				updWgRqstR.wg_re_rqst_cnt_rmrks(r.wg_re_rqst_cnt_rmrks());
				updWgRqstR.prms_uncn_flg(r.prms_uncn_flg());
				updWgRqstR.dlv_inst_rcpt_flg(r.dlv_inst_rcpt_flg());
				updWgRqstR.wg_rqst_no(r.wg_rqst_no());
				// 再調整依頼、再調整依頼日、再調整依頼備考のいずれかが変更された場合
				if (!isSame(wgRqstR.re_rqst_flg(), r.re_rqst_flg()) ||
						!isSame(wgRqstR.re_rqst_dt(), r.re_rqst_dt()) ||
						!isSame(wgRqstR.wg_re_rqst_cnt_rmrks(), r.wg_re_rqst_cnt_rmrks())) {
					updWgRqstR.rqst_crrct_flg(true);
					updWgRqstR.rqst_crrct_dt(getToday());
				}
				else {
					updWgRqstR.rqst_crrct_flg(wgRqstR.rqst_crrct_flg());
					updWgRqstR.rqst_crrct_dt(wgRqstR.rqst_crrct_dt());
				}
				// 再調整依頼（オフ→オン）の場合
				if(!wgRqstR.re_rqst_flg() && r.re_rqst_flg()) {
					updWgRqstR.re_prms_ntc_flg(false);
					updWgRqstR.re_prms_dt(null);
					updWgRqstL2.add(updWgRqstR);
				}
				else {
					updWgRqstL1.add(updWgRqstR);
				}

				// 再調整依頼の場合は、発注予定、移動・移送予定の依頼元訂正ＦＬＧをオンにする。
				if(r.re_rqst_flg()) {
					if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
						for(MST_WG_RQST_PRMS_R wgRqstPrmsR : wgRqstPrmsL.subList(key2, r.wg_rqst_no(), true)) {
							if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ())) {
								// 発注予定登録サービスの依頼元訂正ＦＬＧ更新用の電文定義
								PoSchd_Upd04_DtlR poSchdUpd04DtlR = PoSchd_Upd04_DtlR.create();
								poSchdUpd04DtlR.setAttributes(r);
								poSchdUpd04DtlR.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.RQST.value());
								poSchdUpd04DtlR.po_schd_src_no(wgRqstPrmsR.wg_rqst_prms_no());
								poSchdUpd04DtlR.rqst_crrct_flg(true);
								poSchdUpd04DtlR.rqst_can_flg(false);
								poSchdUpd04.up0().add(poSchdUpd04DtlR);
							}
							else if(MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
								// 移動・移送予定サービスの依頼元訂正ＦＬＧ更新を実行
								XfrSchdMod_DtlR xfrSchdModDtlR = XfrSchdMod_DtlR.create();
								xfrSchdModDtlR.setAttributes(r);
								xfrSchdModDtlR.xfr_src_typ(MSC_XFR_SRC_TYP.WG_RQST.value());
								xfrSchdModDtlR.xfr_src_no(wgRqstPrmsR.wg_rqst_prms_no());
								xfrSchdModDtlR.rqst_mod_flg(true);
								xfrSchdModDtlR.rqst_can_flg(false);
								xfrSchdUpd03.up0().add(xfrSchdModDtlR);
							}
						}
						if(MSC_WG_RQST_SRC_TYP.isSLO(wgRqstR.wg_rqst_src_typ())) {
							// 受注状況更新サービスの上り電文を設定
							SloSts_DtlR slsStsDtlR = SloSts_DtlR.create();
							slsStsDtlR.setAttributes(r);
							slsStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RE_RQST.value());
							slsStsDtlR.slo_d_no(wgRqstR.slo_d_no());
							slsStsDtlR.wg_rqst_no(wgRqstR.wg_rqst_no());
							sloStsIns01.up0().add(slsStsDtlR);
						}
					}
					else {
						// 出荷依頼の場合
						if(MSC_WG_RQST_SRC_TYP.isSHIP(wgRqstR.wg_rqst_src_typ())) {
							// 受注状況更新サービスの上り電文を設定
							SloSts_DtlR slsStsDtlR = SloSts_DtlR.create();
							slsStsDtlR.setAttributes(r);
							slsStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_RE_RQST.value());
							slsStsDtlR.slo_d_no(wgRqstR.slo_d_no());
							slsStsDtlR.wg_rqst_no(wgRqstR.wg_rqst_no());
							sloStsIns01.up0().add(slsStsDtlR);
						}
					}
				}
				// 再調整依頼ＦＬＧがオフの場合
				else {
					MST_WG_RQST_R chkWgRqstR = wgRqstL.getFirst(key1, r.wg_rqst_no());
					if(isNull(chkWgRqstR)) {
						continue;
					}
					// 前回再調整依頼の場合
					if(chkWgRqstR.re_rqst_flg()) {
						if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ()) || MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
							for(MST_WG_RQST_PRMS_R wgRqstPrmsR : wgRqstPrmsL.subList(key2, r.wg_rqst_no(), true)) {
								if(MSC_WG_RQST_TYP.isPURC(wgRqstR.wg_rqst_typ())) {
									// 発注予定登録サービスの依頼元訂正ＦＬＧ更新用の電文定義
									PoSchd_Upd04_DtlR poSchdUpd04DtlR = PoSchd_Upd04_DtlR.create();
									poSchdUpd04DtlR.setAttributes(r);
									poSchdUpd04DtlR.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.RQST.value());
									poSchdUpd04DtlR.po_schd_src_no(wgRqstPrmsR.wg_rqst_prms_no());
									poSchdUpd04DtlR.rqst_crrct_flg(false);
									poSchdUpd04DtlR.rqst_can_flg(false);
									poSchdUpd04.up0().add(poSchdUpd04DtlR);
								}
								else if(MSC_WG_RQST_TYP.isXFR(wgRqstR.wg_rqst_typ())) {
									// 移動・移送予定サービスの依頼元訂正ＦＬＧ更新を実行
									XfrSchdMod_DtlR xfrSchdModDtlR = XfrSchdMod_DtlR.create();
									xfrSchdModDtlR.setAttributes(r);
									xfrSchdModDtlR.xfr_src_typ(MSC_XFR_SRC_TYP.WG_RQST.value());
									xfrSchdModDtlR.xfr_src_no(wgRqstPrmsR.wg_rqst_prms_no());
									xfrSchdModDtlR.rqst_mod_flg(false);
									xfrSchdModDtlR.rqst_can_flg(false);
									xfrSchdUpd03.up0().add(xfrSchdModDtlR);
								}
							}
							
							if(MSC_WG_RQST_SRC_TYP.isSLO(wgRqstR.wg_rqst_src_typ())) {
								// 受注状況更新サービスの上り電文を設定
								SloSts_DtlR slsStsDtlR = SloSts_DtlR.create();
								slsStsDtlR.setAttributes(r);
								slsStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.DMND_RE_RQST_CAN.value());
								slsStsDtlR.slo_d_no(wgRqstR.slo_d_no());
								slsStsDtlR.wg_rqst_no(wgRqstR.wg_rqst_no());
								sloStsIns01.up0().add(slsStsDtlR);
							}
						}
						else {
							// 出荷依頼の場合
							if(MSC_WG_RQST_SRC_TYP.isSHIP(wgRqstR.wg_rqst_src_typ())) {
								// 受注状況更新サービスの上り電文を設定
								SloSts_DtlR slsStsDtlR = SloSts_DtlR.create();
								slsStsDtlR.setAttributes(r);
								slsStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_RE_RQST_CAN.value());
								slsStsDtlR.slo_d_no(wgRqstR.slo_d_no());
								slsStsDtlR.wg_rqst_no(wgRqstR.wg_rqst_no());
								sloStsIns01.up0().add(slsStsDtlR);
							}
						}
					}
				}
			}
			
		
			if(!updWgRqstL1.isEmpty()) {
				MST_WG_RQST_R t10 = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder updWgRqstL1_bldr10 = MCQueryApiBuilder.create(t10);
				updWgRqstL1_bldr10.setSet(t10.re_rqst_flg);
				updWgRqstL1_bldr10.addSet(t10.re_rqst_dt);
				updWgRqstL1_bldr10.addSet(t10.wg_re_rqst_cnt_rmrks);
				updWgRqstL1_bldr10.addSet(t10.prms_uncn_flg);
				updWgRqstL1_bldr10.addSet(t10.dlv_inst_rcpt_flg);
				updWgRqstL1_bldr10.addSet(t10.rqst_crrct_flg);
				updWgRqstL1_bldr10.addSet(t10.rqst_crrct_dt);
				dbUpdateKey("MSBAL5100_MST_WG_RQST_U11", updWgRqstL1, updWgRqstL1_bldr10);
			}
			
			if(!updWgRqstL2.isEmpty()) {
				MST_WG_RQST_R t11 = MST_WG_RQST_R.create("T");
				MCQueryApiBuilder updWgRqstL2_bldr11 = MCQueryApiBuilder.create(t11);
				updWgRqstL2_bldr11.setSet(t11.re_rqst_flg);
				updWgRqstL2_bldr11.addSet(t11.re_rqst_dt);
				updWgRqstL2_bldr11.addSet(t11.wg_re_rqst_cnt_rmrks);
				updWgRqstL2_bldr11.addSet(t11.prms_uncn_flg);
				updWgRqstL2_bldr11.addSet(t11.dlv_inst_rcpt_flg);
				updWgRqstL2_bldr11.addSet(t11.rqst_crrct_flg);
				updWgRqstL2_bldr11.addSet(t11.rqst_crrct_dt);
				updWgRqstL2_bldr11.addSet(t11.re_prms_ntc_flg);
				updWgRqstL2_bldr11.addSet(t11.re_prms_dt);
				dbUpdateKey("MSBAL5100_MST_WG_RQST_U12", updWgRqstL2, updWgRqstL2_bldr11);
			}

			// 発注予定登録サービスの依頼元訂正ＦＬＧ更新を実行
			if(!poSchdUpd04.up0().isEmpty()) {
				poSchdUpd04.exec();
			}

			// 移動・移送予定サービスの依頼元訂正ＦＬＧ更新を実行
			if(!xfrSchdUpd03.up0().isEmpty()) {
				xfrSchdUpd03.exec();
			}
			
			// 受注状況更新サービスを実行する。
			if(!sloStsIns01.up0().isEmpty()) {
				sloStsIns01.exec();
			}
		}
		
		/**
		 * 依頼が訂正された場合は、ポップアップ通知を行う。
		 */
		protected void pushSendMessage() {
			MAUCL_PushNtcMgr mgr;
			MAUCL_PushNtcInfo info;

			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			dbSelectKey("MSBAL5100_MST_WG_RQST_S14", wgRqstL,
					MCQueryApiBuilder.create(MST_WG_RQST_R.create("T")),
					up0().subList(WgRqst_Upd04_DtlR.$re_rqst_flg, true));

			MCList<MAM_WG_R> wgL = MCList.create(MAM_WG_R.class);
			
			MCList<MAM_WG_R> tmpL = MCList.create(MAM_WG_R.class);
			for(MST_WG_RQST_R dtlR : wgRqstL) {
				MAM_WG_R wgR = MAM_WG_R.create();
				wgR.wg_cd(dtlR.rqst_fr_wg_cd());
				tmpL.add(wgR);
				
				wgR = MAM_WG_R.create();
				wgR.wg_cd(dtlR.rqst_to_wg_cd());
				tmpL.add(wgR);
			}
			
			tmpL.sort(MAM_WG_R.$wg_cd);
			MAM_WG_R t2 = MAM_WG_R.create("T");
			MCQueryApiBuilder wgL_bldr2 = MCQueryApiBuilder.create(t2);
			wgL_bldr2.setSelect(t2.wg_cd);
			wgL_bldr2.addSelect(t2.wg_nm);
			dbSelectKey("MSBAL5100_MAM_WG_S04", wgL, wgL_bldr2, tmpL.groupBy(MAM_WG_R.$wg_cd));
			MCIndexKey wgKey = wgL.createIndex(MAM_WG_R.$wg_cd);
			
			for(MST_WG_RQST_R wgRqstR : wgRqstL.groupBy(MST_WG_RQST_R.$rqst_fr_wg_cd, MST_WG_RQST_R.$rqst_to_wg_cd, MST_WG_RQST_R.$rqst_dt)) {
				MAM_WG_R frWgR = wgL.getFirst(wgKey, wgRqstR.rqst_fr_wg_cd());
				MAM_WG_R toWgR = wgL.getFirst(wgKey, wgRqstR.rqst_to_wg_cd());
				
				MCMessage message = new MCMessage(MSBAL0008, wgRqstR.rqst_fr_wg_cd(), frWgR.wg_nm(), wgRqstR.rqst_to_wg_cd(), toWgR.wg_nm());
				// 依頼元
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST_PRMS);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_fr_wg_cd(), wgRqstR.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.RQST_CRRCT_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, true, false, true, false,
						MSC_WG_RQST_REG_OPE.OPE_REF.value(), wgRqstR.rqst_fr_wg_cd(),
						wgRqstR.rqst_to_wg_cd());

				// プッシュ通知対象を登録します。
				mgr.exec();

				// 依頼先
				// プッシュ通知対象登録用のインスタンスを作成します。
				mgr = MAUCL_PushNtcMgr.create();

				// 詳細情報設定用のインスタンスを作成します。
				info = mgr.createInfo(MAC_PUSH_NTC_TYP.WG_RQST);
				// 通知するメッセージを設定
				info.setMsg(message);
				
				// 通知先を設定
				info.addWg(wgRqstR.rqst_to_wg_cd(), wgRqstR.rqst_dt());

				// 通知メッセージから画面に遷移する際に連携する値を設定
				info.addScrBind(MSC_WG_RQST_NTC_DAY_TYP.RQST_CRRCT_DT.value(),
						toYMDString(getToday()), toYMDString(getToday()), false, false,
						true, true, false, MSC_WG_RQST_ADJST_OPE.OPE_REF.value(),
						wgRqstR.rqst_fr_wg_cd(), wgRqstR.rqst_to_wg_cd());
				
				// プッシュ通知対象を登録します。
				mgr.exec();
			}
		}
	}
	
	/**
	 * WgRqst_Upd05オペレーション.<p>
	 *
	 * 出荷依頼の登録・訂正・取消<br>
	 */
	public class WgRqst_Upd05 extends MSBAL_WgRqstService_MC_A.WgRqst_Upd05 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			crtSloDKey();
			callWgRqstUpd01();
		}

		/**
		 * 上り電文を元に受注明細のワークテーブルを登録する
		 */
		protected void crtSloDKey() {
			MCList<MST_SLO_D_R> wrkSloDL = MCList.create(MST_SLO_D_R.class);
			for (WgRqst_Upd05_DtlR r : up0()) {
				MST_SLO_D_R sloDR = MST_SLO_D_R.create();
				sloDR.slo_d_no(r.slo_d_no());
				wrkSloDL.add(sloDR);
			}
			MCQueryApiBuilder wrkSloDL_bldr1 = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			dbWkDelete("MSBAL5100_MSW_SLO_D_D01", wrkSloDL_bldr1.getBaseDbc());
			dbWkInsert("MSBAL5100_MSW_SLO_D_I01", wrkSloDL, wrkSloDL_bldr1.getBaseDbc());
		}

		/**
		 * 出荷予定を取得しＷＧ間依頼(出荷依頼)を作成する
		 */
		protected void callWgRqstUpd01() {
			MSBAL_WgRqstService.WgRqst_Chk01 wgRqstChk01 = MSBAL_WgRqstService.crtWgRqst_Chk01();
			MSBAL_WgRqstService.WgRqst_Upd01 wgRqstUpd01 = MSBAL_WgRqstService.crtWgRqst_Upd01();
			
			// 受注ヘッダより依頼元ＷＧを取得
			MCList<MST_SLO_D_R> sloDL = getSloDL();
			MCIndexKey sloDKey = sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			
			// 出荷進捗経由で出荷予定を取得
			MCList<MST_SHIP_SCHD_R> shipSchdL = getShipSchdL();
			MCIndexKey shipSchdKey = shipSchdL.createIndex("SLO_D_NO");
			MCIndexKey shipSchdKey2 = shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			
			// 受注ＮＯより出荷依頼であるＷＧ間依頼を取得する
			MCList<MST_WG_RQST_R> wgRqstL = getWgRqstL();
			MCIndexKey wgRqstKey = wgRqstL.createIndex(MST_WG_RQST_R.$slo_d_no);
			MCIndexKey wgRqstKey2 = wgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_src_no);
			
			for (WgRqst_Upd05_DtlR r : up0()) {
				MST_SLO_D_R tgtSloDR = sloDL.getFirst(sloDKey, r.slo_d_no());
				MCList<MST_SHIP_SCHD_R> tgtShipSchdL = shipSchdL.subList(shipSchdKey, r.slo_d_no());
				// 出荷予定が取得できる場合は出荷予定毎にＷＧ間依頼を登録・更新
				if(!tgtShipSchdL.isEmpty()) {
					MCList<MST_WG_RQST_R> tgtWgRqstL = wgRqstL.subList(wgRqstKey, r.slo_d_no());
					if(!tgtWgRqstL.isEmpty()) {
						// ＷＧ間依頼に対する作成元の出荷予定がない場合は削除する
						for (MST_WG_RQST_R tgtWgRqstR : tgtWgRqstL) {
							MST_SHIP_SCHD_R tgtShipSchdR = shipSchdL.getFirst(shipSchdKey2, tgtWgRqstR.wg_rqst_src_no());
							if (isNull(tgtShipSchdR)) {
								WgRqst_Upd01_DtlR wgRqstUpd01DtlR = WgRqst_Upd01_DtlR.create();
								crtDelWgRqstUpd01DtlR(wgRqstUpd01DtlR, tgtSloDR, tgtWgRqstR);
								
								wgRqstUpd01.up0().add(wgRqstUpd01DtlR);
							}
						}
					}

					for(MST_SHIP_SCHD_R tgtShipSchdR : tgtShipSchdL) {
						if (tgtShipSchdR.cmpl_flg()) {
							continue;
						}
						MST_WG_RQST_R tgtWgRqstR = wgRqstL.getFirst(wgRqstKey2, tgtShipSchdR.ship_schd_no());

						// 変更がない場合は対象外
						if (!isChange(tgtWgRqstR, tgtShipSchdR, tgtSloDR)) {
							continue;
						}
						// 新規で同一ＷＧの場合はＷＧ間依頼の対象外
						if(isNull(tgtWgRqstR) && isSame(tgtSloDR.getStringNE("WG_CD"), tgtShipSchdR.wg_cd())) {
							continue;
						}

						WgRqst_Upd01_DtlR wgRqstUpd01DtlR = WgRqst_Upd01_DtlR.create();
						// 出荷予定ＮＯに紐付くＷＧ間依頼が取得できる場合は更新、取得できない場合は新規
						if (!isNull(tgtWgRqstR)) {
							// 同一ＷＧの場合は削除
							if(isSame(tgtSloDR.getStringNE("WG_CD"), tgtShipSchdR.wg_cd())) {
								crtDelWgRqstUpd01DtlR(wgRqstUpd01DtlR, tgtSloDR, tgtWgRqstR);
							}
							else {
								// 依頼先ＷＧが変わる場合は削除・新規で連携する
								if (!isSame(tgtWgRqstR.rqst_to_wg_cd(), tgtShipSchdR.wg_cd())) {
									crtDelWgRqstUpd01DtlR(wgRqstUpd01DtlR, tgtSloDR, tgtWgRqstR);
									wgRqstUpd01.up0().add(wgRqstUpd01DtlR);
									wgRqstUpd01DtlR = WgRqst_Upd01_DtlR.create();
									crtInsWgRqstUpd01DtlR(wgRqstUpd01DtlR, tgtShipSchdR, tgtSloDR);
								}
								else {
									crtUpdWgRqstUpd01DtlR(wgRqstUpd01DtlR, tgtShipSchdR, tgtSloDR, tgtWgRqstR);
								}
							}
						}
						else {
							crtInsWgRqstUpd01DtlR(wgRqstUpd01DtlR, tgtShipSchdR, tgtSloDR);
						}
						wgRqstUpd01DtlR.auto_prms_tgt_flg(r.auto_prms_flg());
						wgRqstUpd01.up0().add(wgRqstUpd01DtlR);
					}					
				}
				// 受注明細に紐付く出荷予定が取得できない場合
				else {
					// ＷＧ間依頼が取得できる場合は削除
					MCList<MST_WG_RQST_R> tgtWgRqstL = wgRqstL.subList(wgRqstKey, r.slo_d_no());
					if(!tgtWgRqstL.isEmpty()) {
						for (MST_WG_RQST_R tgtWgRqstR : tgtWgRqstL) {
							WgRqst_Upd01_DtlR wgRqstUpd01DtlR = WgRqst_Upd01_DtlR.create();
							crtDelWgRqstUpd01DtlR(wgRqstUpd01DtlR, tgtSloDR, tgtWgRqstR);
							
							wgRqstUpd01.up0().add(wgRqstUpd01DtlR);
						}
					}
				}
			}
			
			// 当サービスのＷＧ間依頼更新を実行
			if (!wgRqstUpd01.up0().isEmpty()) {
				String[] cols = new String[] {
						WgRqst_Chk01_DtlR.$wg_rqst_typ, WgRqst_Chk01_DtlR.$wg_rqst_no,
						WgRqst_Chk01_DtlR.$wg_rqst_src_typ, WgRqst_Chk01_DtlR.$wg_rqst_src_no
				};
				MCList<WgRqst_Upd01_DtlR> wgRqstUpd01L = MCList.create(WgRqst_Upd01_DtlR.class);
				MCIndexKey key = wgRqstUpd01.up0().createIndex(WgRqst_Upd01_DtlR.$data_crud_typ);
				MCList<WgRqst_Upd01_DtlR> delL = wgRqstUpd01.up0().subList(key, MAC_DATA_CRUD_TYP.DEL.value());
				MCList<WgRqst_Upd01_DtlR> insL = wgRqstUpd01.up0().subList(key, MAC_DATA_CRUD_TYP.CRT.value());
				MCList<WgRqst_Upd01_DtlR> updL = wgRqstUpd01.up0().subList(key, MAC_DATA_CRUD_TYP.UPD.value());
				delL.sort(cols);
				insL.sort(cols);
				updL.sort(cols);
				wgRqstUpd01L.addAll(delL);
				wgRqstUpd01L.addAll(updL);
				wgRqstUpd01L.addAll(insL);
				setPegNo(wgRqstUpd01L);
				
				// キャッシュなどを行うために当サービスのチェックを行う
				addAll(wgRqstChk01.up0(), wgRqstUpd01.up0(), createMap_WgRqst_Chk01_DtlR_WgRqst_Upd01_DtlR());
				wgRqstChk01.up0().sort(WgRqst_Chk01_DtlR.$peg_no);
				wgRqstUpd01.up0().sort(WgRqst_Chk01_DtlR.$peg_no);
				wgRqstChk01.exec();
				wgRqstUpd01.exec();
			}
		}
		
		/**
		 * 受注明細、受注ヘッダの情報を取得する
		 * @return
		 */
		protected MCList<MST_SLO_D_R> getSloDL() {
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
			MSW_SLO_D_KEY_R w1 = MSW_SLO_D_KEY_R.create("W1");
			MST_SLO_R t2 = MST_SLO_R.create("T2");
			MAM_DPT_R m1 = MAM_DPT_R.create("M1");
			sloDL_bldr.setSelect(t2.slo_no,t.slo_d_no,t2.sls_dpt_cd,t2.sls_usr_cd,m1.wg_cd,t2.slo_dt,t.dlv_rqst_tm,t2.cst_cd,t.dlv_cd,t.dlv_sundry_flg,t.dlv_nm,t.dlv_cntct_dpt,t.dlv_cntct_psn,t.dlv_zip_cd,t.dlv_addr1,t.dlv_addr2,t.dlv_addr3,t.dlv_addr4,t.dlv_tel,t.dlv_fax,t.tdlv_cd,t.tdlv_sundry_flg,t.tdlv_nm,t.tdlv_cntct_dpt,t.tdlv_cntct_psn,t.tdlv_zip_cd,t.tdlv_addr1,t.tdlv_addr2,t.tdlv_addr3,t.tdlv_addr4,t.tdlv_tel,t.tdlv_fax);
			sloDL_bldr.addInnerJoin(w1, bracket( w1.slo_d_no.eq(t.slo_d_no)));
			sloDL_bldr.addInnerJoin(t2, bracket( t2.slo_no.eq(t.slo_no)));
			sloDL_bldr.addInnerJoin(m1, bracket( m1.dpt_cd.eq(t2.sls_dpt_cd)
					.and(t2.slo_dt.between(m1.st_dt, m1.end_dt))));
			dbSelect("MSBAL5100_MST_SLO_D_S01", sloDL, sloDL_bldr);

			return sloDL;
		}
		
		/**
		 * 出荷予定の情報を取得する
		 * @return
		 */
		protected MCList<MST_SHIP_SCHD_R> getShipSchdL() {
			MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
			MSW_SLO_D_KEY_R w1 = MSW_SLO_D_KEY_R.create("W1");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_ITM_LG_GRP_R m2 = MAM_ITM_LG_GRP_R.create("M2");
			MAM_LOC_R m3 = MAM_LOC_R.create("M3");
			MAM_LOC_R m4 = MAM_LOC_R.create("M4");
			shipSchdL_bldr.setSelect(t.ship_schd_no,t2.slo_d_no,coalesce( t.pd_inst_dlv_tm, t2.dlv_rqst_tm, t.dlv_schd_tm).as("pd_inst_dlv_tm"),t.ship_fr_lg_grp_cd,t.wg_cd,t.itm_cd,t.itm_sub1,t.itm_sub2,t.itm_sub3,t.itm_nm,t.sno1,t.sno1_null_flg,t.sno2,t.sno2_null_flg,t.sno3,t.sno3_null_flg,t.sno4,t.sno4_null_flg,t.trd_unit_qty,t.trd_unit_cd,t.base_unit_qty,t.base_unit_cd,t.ver_no,t.gd_cd,t.vld_dt_fr,t.vld_dt_to,coalesce( t2.loc_cd, m3.loc_cd, m1.loc_cd).as("loc_cd"),t.ship_cnt_rmrks,t2.str_ln_cd,t.ship_rqst_tm,t.lot_no,t.sublot_no,t.cmpl_flg,t.dlv_inst_rcpt_no,t2.io_schd_pr_no,t.abort_flg,t.ship_inst_qty,t.ship_act_qty,t2.alloc_grp_cd,coalesce( m4.wg_cd, m3.wg_cd, m1.wg_cd).as("loc_wg_cd"));
			shipSchdL_bldr.addInnerJoin(t2, bracket( t2.ship_pr_no.eq(t.ship_pr_no)));
			shipSchdL_bldr.addInnerJoin(w1, bracket( w1.slo_d_no.eq(t2.slo_d_no)));
			shipSchdL_bldr.addLeftOuterJoin(m1, bracket( m1.lg_grp_cd.eq(t.ship_fr_lg_grp_cd)
					.and(m1.alloc_grp_cd.eq(t2.alloc_grp_cd))
					.and(m1.lg_def_flg.eq(value(true)))));
			shipSchdL_bldr.addLeftOuterJoin(m2, bracket( m2.itm_cd.eq(t.itm_cd)
					.and(m2.itm_sub1.eq(t.itm_sub1))
					.and(m2.itm_sub2.eq(t.itm_sub2))
					.and(m2.itm_sub3.eq(t.itm_sub3))
					.and(m2.lg_grp_cd.eq(t.ship_fr_lg_grp_cd))));
			shipSchdL_bldr.addLeftOuterJoin(m3, bracket( m3.loc_cd.eq(m2.lg_def_loc_cd)
					.and(m3.alloc_grp_cd.eq(t2.alloc_grp_cd))));
			shipSchdL_bldr.addLeftOuterJoin(m4, bracket( m4.loc_cd.eq(t2.loc_cd)));
			shipSchdL_bldr.setWhere(bracket( t.abort_flg.eq(value(false))
					.or(t.ship_inst_qty.gt(value(0)))
					.or(t.ship_act_qty.gt(value(0)))));
			shipSchdL_bldr.addWhereWithAnd(t2.purc_ddlv_flg.eq(value(false)));
			shipSchdL_bldr.addWhereWithAnd(t2.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NO_PICK.value())));
			dbSelect("MSBAL5100_MST_SHIP_SCHD_S02", shipSchdL, shipSchdL_bldr);
			
			for(MST_SHIP_SCHD_R shipSchdR : shipSchdL) {
				if (isNull(shipSchdR.getString("LOC_CD"))) {
					setLoc(shipSchdR);
				}
			}
			return shipSchdL;
		}
		protected FXUCL_MCDbcCacheCW<MAM_LOC_R> _locL = null;
		protected void setLoc(MST_SHIP_SCHD_R shipSchdR) {
			if (_locL == null) {
				MAM_LOC_R t = MAM_LOC_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.addMin(t.loc_cd, MAM_LOC_R.$loc_cd);
				dbc_bldr.addWhereWithAnd(t.lg_grp_cd.eq(bind("b1")));
				dbc_bldr.addWhereWithAnd(t.alloc_grp_cd.eq(bind("b2")));
				dbc_bldr.addWhereWithAnd(t.sppl_cd.isNull());
				_locL = new FXUCL_MCDbcCacheCW<MAM_LOC_R>(dbc_bldr);
			}
			shipSchdR.setString("LOC_CD", _locL.get(shipSchdR.ship_fr_lg_grp_cd(), shipSchdR.getString("ALLOC_GRP_CD")).loc_cd());
		}

		/**
		 * ＷＧ間依頼(出荷依頼)を取得する
		 * @return
		 */
		protected MCList<MST_WG_RQST_R> getWgRqstL() {
			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder wgRqstL_bldr = MCQueryApiBuilder.create(t);
			MSW_SLO_D_KEY_R w1 = MSW_SLO_D_KEY_R.create("W1");
			wgRqstL_bldr.setSelectAll();
			wgRqstL_bldr.addInnerJoin(w1, bracket( w1.slo_d_no.eq(t.slo_d_no)));
			wgRqstL_bldr.setWhere(t.wg_rqst_typ.eq(value(MSC_WG_RQST_TYP.SHIP.value())));
			wgRqstL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBAL5100_MST_WG_RQST_S15", wgRqstL, wgRqstL_bldr);
			
			return wgRqstL;
		}
		
		/**
		 * ＷＧ間依頼に関する項目に変更があったかチェックする
		 * @param tgtWgRqstR
		 * @param tgtShipSchdR
		 * @param tgtSloDR
		 * @return 変更があった場合はtrueを返す
		 */
		protected boolean isChange(MST_WG_RQST_R tgtWgRqstR, MST_SHIP_SCHD_R tgtShipSchdR, MST_SLO_D_R tgtSloDR) {
			// 新規の場合
			if (isNull(tgtWgRqstR)) {
				return true;
			}
			// 出荷依頼に関する項目に変更があるかチェック
			if(!isSame(tgtWgRqstR.rqst_dt(), tgtSloDR.getDateNE("SLO_DT"))
					|| !isSame(tgtWgRqstR.rqst_fr_wg_cd(), tgtSloDR.getStringNE("WG_CD"))
					|| !isSame(tgtWgRqstR.rqst_fr_dpt_cd(), tgtSloDR.getStringNE("SLS_DPT_CD"))
					|| !isSame(tgtWgRqstR.rqst_fr_usr_cd(), tgtSloDR.getStringNE("SLS_USR_CD"))
					|| !isSame(tgtWgRqstR.gr_rqst_tm(), tgtShipSchdR.pd_inst_dlv_tm())
					|| !isSame(tgtWgRqstR.rqst_to_wg_cd(), tgtShipSchdR.wg_cd())
					|| !isSame(tgtWgRqstR.gi_loc_wg_cd(), tgtShipSchdR.getStringNE("LOC_WG_CD"))
					|| !isSame(tgtWgRqstR.gi_lg_grp_cd(), tgtShipSchdR.ship_fr_lg_grp_cd())
					|| !isSame(tgtWgRqstR.gi_loc_cd(), nvl(tgtShipSchdR.getStringNE("LOC_CD"), MAC_STR.NULL_VAL.value()))
					|| !isSame(tgtWgRqstR.gi_str_ln_cd(), nvl(tgtShipSchdR.getStringNE("STR_LN_CD"), MAC_STR.NULL_VAL.value()))
					|| !isSame(tgtWgRqstR.gi_rqst_tm(), tgtShipSchdR.ship_rqst_tm())
					|| !isSame(tgtWgRqstR.itm_cd(), tgtShipSchdR.itm_cd())
					|| !isSame(tgtWgRqstR.itm_sub1(), tgtShipSchdR.itm_sub1())
					|| !isSame(tgtWgRqstR.itm_sub2(), tgtShipSchdR.itm_sub2())
					|| !isSame(tgtWgRqstR.itm_sub3(), tgtShipSchdR.itm_sub3())
					|| !isSame(tgtWgRqstR.itm_nm(), tgtShipSchdR.itm_nm())
					|| !isSame(nvl(tgtWgRqstR.lot_no(), MAC_STR.NULL_VAL.value()), nvl(tgtShipSchdR.lot_no(), MAC_STR.NULL_VAL.value()))
					|| !isSame(nvl(tgtWgRqstR.sublot_no(), MAC_STR.NULL_VAL.value()), nvl(tgtShipSchdR.sublot_no(), MAC_STR.NULL_VAL.value()))
					|| !isSame(tgtWgRqstR.sno1(), tgtShipSchdR.sno1())
					|| !isSame(tgtWgRqstR.sno1_null_flg(), tgtShipSchdR.sno1_null_flg())
					|| !isSame(tgtWgRqstR.sno2(), tgtShipSchdR.sno2())
					|| !isSame(tgtWgRqstR.sno2_null_flg(), tgtShipSchdR.sno2_null_flg())
					|| !isSame(tgtWgRqstR.sno3(), tgtShipSchdR.sno3())
					|| !isSame(tgtWgRqstR.sno3_null_flg(), tgtShipSchdR.sno3_null_flg())
					|| !isSame(tgtWgRqstR.sno4(), tgtShipSchdR.sno4())
					|| !isSame(tgtWgRqstR.sno4_null_flg(), tgtShipSchdR.sno4_null_flg())
					|| !isSame(tgtWgRqstR.ver_no(), tgtShipSchdR.ver_no())
					|| !isSame(tgtWgRqstR.gd_cd(), tgtShipSchdR.gd_cd())
					|| !isSame(tgtWgRqstR.vld_dt_fr(), tgtShipSchdR.vld_dt_fr())
					|| !isSame(tgtWgRqstR.vld_dt_to(), tgtShipSchdR.vld_dt_to())
					|| !isSame(tgtWgRqstR.trd_unit_qty(), tgtShipSchdR.trd_unit_qty())
					|| !isSame(tgtWgRqstR.trd_unit_cd(), tgtShipSchdR.trd_unit_cd())
					|| !isSame(tgtWgRqstR.base_unit_qty(), tgtShipSchdR.base_unit_qty())
					|| !isSame(tgtWgRqstR.base_unit_cd(), tgtShipSchdR.base_unit_cd())
					|| !isSame(tgtWgRqstR.dlv_cd(), tgtSloDR.dlv_cd())
					|| !isSame(tgtWgRqstR.dlv_sundry_flg(), tgtSloDR.dlv_sundry_flg())
					|| !isSame(tgtWgRqstR.dlv_nm(), tgtSloDR.dlv_nm())
					|| !isSame(tgtWgRqstR.dlv_cntct_dpt(), tgtSloDR.dlv_cntct_dpt())
					|| !isSame(tgtWgRqstR.dlv_cntct_psn(), tgtSloDR.dlv_cntct_psn())
					|| !isSame(tgtWgRqstR.dlv_zip_cd(), tgtSloDR.dlv_zip_cd())
					|| !isSame(tgtWgRqstR.dlv_addr1(), tgtSloDR.dlv_addr1())
					|| !isSame(tgtWgRqstR.dlv_addr2(), tgtSloDR.dlv_addr2())
					|| !isSame(tgtWgRqstR.dlv_addr3(), tgtSloDR.dlv_addr3())
					|| !isSame(tgtWgRqstR.dlv_addr4(), tgtSloDR.dlv_addr4())
					|| !isSame(tgtWgRqstR.dlv_tel(), tgtSloDR.dlv_tel())
					|| !isSame(tgtWgRqstR.dlv_fax(), tgtSloDR.dlv_fax())
					|| !isSame(tgtWgRqstR.tdlv_cd(), tgtSloDR.tdlv_cd())
					|| !isSame(tgtWgRqstR.tdlv_sundry_flg(), tgtSloDR.tdlv_sundry_flg())
					|| !isSame(tgtWgRqstR.tdlv_nm(), tgtSloDR.tdlv_nm())
					|| !isSame(tgtWgRqstR.tdlv_zip_cd(), tgtSloDR.tdlv_zip_cd())
					|| !isSame(tgtWgRqstR.tdlv_addr1(), tgtSloDR.tdlv_addr1())
					|| !isSame(tgtWgRqstR.tdlv_addr2(), tgtSloDR.tdlv_addr2())
					|| !isSame(tgtWgRqstR.tdlv_addr3(), tgtSloDR.tdlv_addr3())
					|| !isSame(tgtWgRqstR.tdlv_addr4(), tgtSloDR.tdlv_addr4())
					|| !isSame(tgtWgRqstR.tdlv_cntct_dpt(), tgtSloDR.tdlv_cntct_dpt())
					|| !isSame(tgtWgRqstR.tdlv_cntct_psn(), tgtSloDR.tdlv_cntct_psn())
					|| !isSame(tgtWgRqstR.tdlv_tel(), tgtSloDR.tdlv_tel())
					|| !isSame(tgtWgRqstR.tdlv_fax(), tgtSloDR.tdlv_fax())
					|| !isSame(tgtWgRqstR.wg_rqst_cnt_rmrks(), tgtShipSchdR.ship_cnt_rmrks())
			) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * ＷＧ間依頼の新規登録用に項目設定を行う
		 * @param wgRqstUpd01DtlR
		 * @param tgtShipSchdR
		 * @param tgtSloDR
		 */
		protected void crtInsWgRqstUpd01DtlR(WgRqst_Upd01_DtlR wgRqstUpd01DtlR, MST_SHIP_SCHD_R tgtShipSchdR, MST_SLO_D_R tgtSloDR) {
			wgRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			wgRqstUpd01DtlR.wg_rqst_typ(MAC_WG_RQST_TYP.SHIP.value());
			wgRqstUpd01DtlR.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.SHIP.value());
			wgRqstUpd01DtlR.wg_rqst_src_no(tgtShipSchdR.ship_schd_no());
			wgRqstUpd01DtlR.cst_cd(tgtSloDR.getStringNE("CST_CD"));
			wgRqstUpd01DtlR.slo_no(tgtSloDR.slo_no());
			wgRqstUpd01DtlR.slo_d_no(tgtSloDR.slo_d_no());
			wgRqstUpd01DtlR.dlv_cd(tgtSloDR.dlv_cd());
			wgRqstUpd01DtlR.dlv_sundry_flg(tgtSloDR.dlv_sundry_flg());
			wgRqstUpd01DtlR.dlv_nm(tgtSloDR.dlv_nm());
			wgRqstUpd01DtlR.dlv_cntct_dpt(tgtSloDR.dlv_cntct_dpt());
			wgRqstUpd01DtlR.dlv_cntct_psn(tgtSloDR.dlv_cntct_psn());
			wgRqstUpd01DtlR.dlv_zip_cd(tgtSloDR.dlv_zip_cd());
			wgRqstUpd01DtlR.dlv_addr1(tgtSloDR.dlv_addr1());
			wgRqstUpd01DtlR.dlv_addr2(tgtSloDR.dlv_addr2());
			wgRqstUpd01DtlR.dlv_addr3(tgtSloDR.dlv_addr3());
			wgRqstUpd01DtlR.dlv_addr4(tgtSloDR.dlv_addr4());
			wgRqstUpd01DtlR.dlv_tel(tgtSloDR.dlv_tel());
			wgRqstUpd01DtlR.dlv_fax(tgtSloDR.dlv_fax());
			wgRqstUpd01DtlR.tdlv_cd(tgtSloDR.tdlv_cd());
			wgRqstUpd01DtlR.tdlv_sundry_flg(tgtSloDR.tdlv_sundry_flg());
			wgRqstUpd01DtlR.tdlv_nm(tgtSloDR.tdlv_nm());
			wgRqstUpd01DtlR.tdlv_zip_cd(tgtSloDR.tdlv_zip_cd());
			wgRqstUpd01DtlR.tdlv_addr1(tgtSloDR.tdlv_addr1());
			wgRqstUpd01DtlR.tdlv_addr2(tgtSloDR.tdlv_addr2());
			wgRqstUpd01DtlR.tdlv_addr3(tgtSloDR.tdlv_addr3());
			wgRqstUpd01DtlR.tdlv_addr4(tgtSloDR.tdlv_addr4());
			wgRqstUpd01DtlR.tdlv_cntct_dpt(tgtSloDR.tdlv_cntct_dpt());
			wgRqstUpd01DtlR.tdlv_cntct_psn(tgtSloDR.tdlv_cntct_psn());
			wgRqstUpd01DtlR.tdlv_tel(tgtSloDR.tdlv_tel());
			wgRqstUpd01DtlR.tdlv_fax(tgtSloDR.tdlv_fax());
			wgRqstUpd01DtlR.rqst_dt(tgtSloDR.getDate("SLO_DT"));
			wgRqstUpd01DtlR.rqst_fr_wg_cd(tgtSloDR.getStringNE("WG_CD"));
			wgRqstUpd01DtlR.rqst_fr_dpt_cd(tgtSloDR.getStringNE("SLS_DPT_CD"));
			wgRqstUpd01DtlR.rqst_fr_usr_cd(tgtSloDR.getStringNE("SLS_USR_CD"));
			wgRqstUpd01DtlR.gr_rqst_tm(tgtShipSchdR.pd_inst_dlv_tm());
			wgRqstUpd01DtlR.gi_loc_cd(tgtShipSchdR.getStringNE("LOC_CD"));
			wgRqstUpd01DtlR.gi_str_ln_cd(tgtShipSchdR.getStringNE("STR_LN_CD"));
			wgRqstUpd01DtlR.gi_loc_wg_cd(tgtShipSchdR.getStringNE("LOC_WG_CD"));
			wgRqstUpd01DtlR.gi_lg_grp_cd(tgtShipSchdR.ship_fr_lg_grp_cd());
			wgRqstUpd01DtlR.gi_rqst_tm(tgtShipSchdR.ship_rqst_tm());
			wgRqstUpd01DtlR.rqst_to_wg_cd(tgtShipSchdR.wg_cd());
			wgRqstUpd01DtlR.itm_cd(tgtShipSchdR.itm_cd());
			wgRqstUpd01DtlR.itm_sub1(tgtShipSchdR.itm_sub1());
			wgRqstUpd01DtlR.itm_sub2(tgtShipSchdR.itm_sub2());
			wgRqstUpd01DtlR.itm_sub3(tgtShipSchdR.itm_sub3());
			wgRqstUpd01DtlR.itm_nm(tgtShipSchdR.itm_nm());
			wgRqstUpd01DtlR.sno1(tgtShipSchdR.sno1());
			wgRqstUpd01DtlR.sno1_null_flg(tgtShipSchdR.sno1_null_flg());
			wgRqstUpd01DtlR.sno2(tgtShipSchdR.sno2());
			wgRqstUpd01DtlR.sno2_null_flg(tgtShipSchdR.sno2_null_flg());
			wgRqstUpd01DtlR.sno3(tgtShipSchdR.sno3());
			wgRqstUpd01DtlR.sno3_null_flg(tgtShipSchdR.sno3_null_flg());
			wgRqstUpd01DtlR.sno4(tgtShipSchdR.sno4());
			wgRqstUpd01DtlR.sno4_null_flg(tgtShipSchdR.sno4_null_flg());
			wgRqstUpd01DtlR.ver_no(tgtShipSchdR.ver_no());
			wgRqstUpd01DtlR.lot_no(tgtShipSchdR.lot_no());
			wgRqstUpd01DtlR.sublot_no(tgtShipSchdR.sublot_no());
			wgRqstUpd01DtlR.vld_dt_fr(tgtShipSchdR.vld_dt_fr());
			wgRqstUpd01DtlR.vld_dt_to(tgtShipSchdR.vld_dt_to());
			wgRqstUpd01DtlR.trd_unit_qty(tgtShipSchdR.trd_unit_qty());
			wgRqstUpd01DtlR.trd_unit_cd(tgtShipSchdR.trd_unit_cd());
			wgRqstUpd01DtlR.base_unit_qty(tgtShipSchdR.base_unit_qty());
			wgRqstUpd01DtlR.base_unit_cd(tgtShipSchdR.base_unit_cd());
			wgRqstUpd01DtlR.gd_cd(tgtShipSchdR.gd_cd());
			wgRqstUpd01DtlR.io_schd_pr_no(tgtShipSchdR.getStringNE("IO_SCHD_PR_NO"));
			wgRqstUpd01DtlR.wg_rqst_cnt_rmrks(tgtShipSchdR.ship_cnt_rmrks());
			if (!isNull(tgtShipSchdR.dlv_inst_rcpt_no())) {
				wgRqstUpd01DtlR.dlv_inst_rcpt_flg(true);
			}
		}
		
		/**
		 * ＷＧ間依頼の更新用に項目設定を行う
		 * @param wgRqstUpd01DtlR
		 * @param tgtShipSchdR
		 * @param tgtSloDR
		 */
		protected void crtUpdWgRqstUpd01DtlR(WgRqst_Upd01_DtlR wgRqstUpd01DtlR, MST_SHIP_SCHD_R tgtShipSchdR, MST_SLO_D_R tgtSloDR, MST_WG_RQST_R tgtWgRqstR) {
			wgRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			wgRqstUpd01DtlR.wg_rqst_no(tgtWgRqstR.wg_rqst_no());
			wgRqstUpd01DtlR.wg_rqst_typ(MAC_WG_RQST_TYP.SHIP.value());
			wgRqstUpd01DtlR.wg_rqst_src_typ(tgtWgRqstR.wg_rqst_src_typ());
			wgRqstUpd01DtlR.wg_rqst_src_no(tgtShipSchdR.ship_schd_no());
			wgRqstUpd01DtlR.cst_cd(tgtSloDR.getStringNE("CST_CD"));
			wgRqstUpd01DtlR.slo_no(tgtSloDR.slo_no());
			wgRqstUpd01DtlR.slo_d_no(tgtSloDR.slo_d_no());
			wgRqstUpd01DtlR.dlv_cd(tgtSloDR.dlv_cd());
			wgRqstUpd01DtlR.dlv_sundry_flg(tgtSloDR.dlv_sundry_flg());
			wgRqstUpd01DtlR.dlv_nm(tgtSloDR.dlv_nm());
			wgRqstUpd01DtlR.dlv_cntct_dpt(tgtSloDR.dlv_cntct_dpt());
			wgRqstUpd01DtlR.dlv_cntct_psn(tgtSloDR.dlv_cntct_psn());
			wgRqstUpd01DtlR.dlv_zip_cd(tgtSloDR.dlv_zip_cd());
			wgRqstUpd01DtlR.dlv_addr1(tgtSloDR.dlv_addr1());
			wgRqstUpd01DtlR.dlv_addr2(tgtSloDR.dlv_addr2());
			wgRqstUpd01DtlR.dlv_addr3(tgtSloDR.dlv_addr3());
			wgRqstUpd01DtlR.dlv_addr4(tgtSloDR.dlv_addr4());
			wgRqstUpd01DtlR.dlv_tel(tgtSloDR.dlv_tel());
			wgRqstUpd01DtlR.dlv_fax(tgtSloDR.dlv_fax());
			wgRqstUpd01DtlR.tdlv_cd(tgtSloDR.tdlv_cd());
			wgRqstUpd01DtlR.tdlv_sundry_flg(tgtSloDR.tdlv_sundry_flg());
			wgRqstUpd01DtlR.tdlv_nm(tgtSloDR.tdlv_nm());
			wgRqstUpd01DtlR.tdlv_zip_cd(tgtSloDR.tdlv_zip_cd());
			wgRqstUpd01DtlR.tdlv_addr1(tgtSloDR.tdlv_addr1());
			wgRqstUpd01DtlR.tdlv_addr2(tgtSloDR.tdlv_addr2());
			wgRqstUpd01DtlR.tdlv_addr3(tgtSloDR.tdlv_addr3());
			wgRqstUpd01DtlR.tdlv_addr4(tgtSloDR.tdlv_addr4());
			wgRqstUpd01DtlR.tdlv_cntct_dpt(tgtSloDR.tdlv_cntct_dpt());
			wgRqstUpd01DtlR.tdlv_cntct_psn(tgtSloDR.tdlv_cntct_psn());
			wgRqstUpd01DtlR.tdlv_tel(tgtSloDR.tdlv_tel());
			wgRqstUpd01DtlR.tdlv_fax(tgtSloDR.tdlv_fax());
			wgRqstUpd01DtlR.rqst_dt(tgtSloDR.getDate("SLO_DT"));
			wgRqstUpd01DtlR.rqst_fr_wg_cd(tgtSloDR.getStringNE("WG_CD"));
			wgRqstUpd01DtlR.rqst_fr_dpt_cd(tgtSloDR.getStringNE("SLS_DPT_CD"));
			wgRqstUpd01DtlR.rqst_fr_usr_cd(tgtSloDR.getStringNE("SLS_USR_CD"));
			wgRqstUpd01DtlR.gr_rqst_tm(tgtShipSchdR.pd_inst_dlv_tm());
			wgRqstUpd01DtlR.gi_loc_cd(tgtShipSchdR.getStringNE("LOC_CD"));
			wgRqstUpd01DtlR.gi_str_ln_cd(tgtShipSchdR.getStringNE("STR_LN_CD"));
			wgRqstUpd01DtlR.gi_loc_wg_cd(tgtShipSchdR.getStringNE("LOC_WG_CD"));
			wgRqstUpd01DtlR.gi_lg_grp_cd(tgtShipSchdR.ship_fr_lg_grp_cd());
			wgRqstUpd01DtlR.gi_rqst_tm(tgtShipSchdR.ship_rqst_tm());
			wgRqstUpd01DtlR.rqst_to_wg_cd(tgtShipSchdR.wg_cd());
			wgRqstUpd01DtlR.itm_cd(tgtShipSchdR.itm_cd());
			wgRqstUpd01DtlR.itm_sub1(tgtShipSchdR.itm_sub1());
			wgRqstUpd01DtlR.itm_sub2(tgtShipSchdR.itm_sub2());
			wgRqstUpd01DtlR.itm_sub3(tgtShipSchdR.itm_sub3());
			wgRqstUpd01DtlR.itm_nm(tgtShipSchdR.itm_nm());
			wgRqstUpd01DtlR.sno1(tgtShipSchdR.sno1());
			wgRqstUpd01DtlR.sno1_null_flg(tgtShipSchdR.sno1_null_flg());
			wgRqstUpd01DtlR.sno2(tgtShipSchdR.sno2());
			wgRqstUpd01DtlR.sno2_null_flg(tgtShipSchdR.sno2_null_flg());
			wgRqstUpd01DtlR.sno3(tgtShipSchdR.sno3());
			wgRqstUpd01DtlR.sno3_null_flg(tgtShipSchdR.sno3_null_flg());
			wgRqstUpd01DtlR.sno4(tgtShipSchdR.sno4());
			wgRqstUpd01DtlR.sno4_null_flg(tgtShipSchdR.sno4_null_flg());
			wgRqstUpd01DtlR.lot_no(tgtShipSchdR.lot_no());
			wgRqstUpd01DtlR.sublot_no(tgtShipSchdR.sublot_no());
			wgRqstUpd01DtlR.ver_no(tgtShipSchdR.ver_no());
			wgRqstUpd01DtlR.gd_cd(tgtShipSchdR.gd_cd());
			wgRqstUpd01DtlR.vld_dt_fr(tgtShipSchdR.vld_dt_fr());
			wgRqstUpd01DtlR.vld_dt_to(tgtShipSchdR.vld_dt_to());
			wgRqstUpd01DtlR.trd_unit_qty(tgtShipSchdR.trd_unit_qty());
			wgRqstUpd01DtlR.trd_unit_cd(tgtShipSchdR.trd_unit_cd());
			wgRqstUpd01DtlR.base_unit_qty(tgtShipSchdR.base_unit_qty());
			wgRqstUpd01DtlR.base_unit_cd(tgtShipSchdR.base_unit_cd());
			wgRqstUpd01DtlR.wg_rqst_cnt_rmrks(tgtShipSchdR.ship_cnt_rmrks());
			if (!isNull(tgtShipSchdR.dlv_inst_rcpt_no())) {
				wgRqstUpd01DtlR.dlv_inst_rcpt_flg(true);
			}
			wgRqstUpd01DtlR.prms_uncn_flg(tgtWgRqstR.prms_uncn_flg());
		}
		
		/**
		 * ＷＧ間依頼の削除用に項目設定を行う
		 * @param wgRqstUpd01DtlR
		 * @param tgtSloDR
		 * @param tgtWgRqstR
		 */
		protected void crtDelWgRqstUpd01DtlR(WgRqst_Upd01_DtlR wgRqstUpd01DtlR, MST_SLO_D_R tgtSloDR, MST_WG_RQST_R tgtWgRqstR) {
			wgRqstUpd01DtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			wgRqstUpd01DtlR.wg_rqst_no(tgtWgRqstR.wg_rqst_no());
			wgRqstUpd01DtlR.wg_rqst_typ(MAC_WG_RQST_TYP.SHIP.value());
			wgRqstUpd01DtlR.wg_rqst_src_typ(tgtWgRqstR.wg_rqst_src_typ());
			wgRqstUpd01DtlR.wg_rqst_src_no(tgtWgRqstR.wg_rqst_src_no());
			wgRqstUpd01DtlR.slo_d_no(tgtSloDR.slo_d_no());
			wgRqstUpd01DtlR.rqst_dt(tgtSloDR.getDate("SLO_DT"));
			wgRqstUpd01DtlR.rqst_fr_wg_cd(tgtWgRqstR.rqst_fr_wg_cd());
			wgRqstUpd01DtlR.rqst_to_wg_cd(tgtWgRqstR.rqst_to_wg_cd());
		}
		
		protected Map_WgRqst_Chk01_DtlR_WgRqst_Upd01_DtlR<WgRqst_Chk01_DtlR,WgRqst_Upd01_DtlR> _map_WgRqst_Chk01_DtlR_WgRqst_Upd01_DtlR = null;
		protected Map_WgRqst_Chk01_DtlR_WgRqst_Upd01_DtlR<WgRqst_Chk01_DtlR,WgRqst_Upd01_DtlR> createMap_WgRqst_Chk01_DtlR_WgRqst_Upd01_DtlR() {
			if (_map_WgRqst_Chk01_DtlR_WgRqst_Upd01_DtlR == null) {
				_map_WgRqst_Chk01_DtlR_WgRqst_Upd01_DtlR = new Map_WgRqst_Chk01_DtlR_WgRqst_Upd01_DtlR<WgRqst_Chk01_DtlR, WgRqst_Upd01_DtlR>();
			}
			return _map_WgRqst_Chk01_DtlR_WgRqst_Upd01_DtlR;
		}

		public class Map_WgRqst_Chk01_DtlR_WgRqst_Upd01_DtlR<D extends WgRqst_Chk01_DtlR, S extends WgRqst_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Chk01_DtlR.$data_crud_typ, WgRqst_Upd01_DtlR.$data_crud_typ);
				addColumnPathMap(WgRqst_Chk01_DtlR.$peg_no, WgRqst_Upd01_DtlR.$peg_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$wg_rqst, WgRqst_Upd01_DtlR.$wg_rqst);
				addColumnPathMap(WgRqst_Chk01_DtlR.$cst_cd, WgRqst_Upd01_DtlR.$cst_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.screen_crct_flg(false);
			}
		}
	}

	/**
	 * 発注予定が次処理済か判定する
	 * @param poSchdR　対象の発注予定
	 * @return
	 */
	protected boolean isNextOprPoSchd(MST_PO_SCHD_R poSchdR) {
		if (!isNull(poSchdR) && (poSchdR.po_flg() || poSchdR.rqst_upd_stop_flg()
				|| poSchdR.can_flg() || poSchdR.abort_flg()
				|| !isNull(poSchdR.getStringNE("ITM_MFG_INST_NO")))) {
			
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
	
	protected MCList<MST_ITM_ORDER_R> getItmOrdL(MCList<MST_WG_RQST_R> dtlL) {
		MCList<MST_ITM_ORDER_R> itmOrdL = MCList.create(MST_ITM_ORDER_R.class);
		if(!isNull(dtlL) && !dtlL.isEmpty()) {
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(t);
			dbSelectKey("MSBAL5100_MST_ITM_ORDER_S01", itmOrdL, itmOrdL_bldr, dtlL.groupBy(MST_WG_RQST_R.$itm_ord_no));
		}
		return itmOrdL;
	}
	protected boolean isCmplSchdDtByOrd(MST_WG_RQST_R wgRqst, String wgRqstDataCrudTyp, MST_ITM_ORDER_R itmOrdR) {
		// WG間依頼に対して、オーダから予定日を補完するかチェックする
		// オーダ登録時から入庫日と発注先に変更がない場合、日付計算せずにオーダ登録時の予定日を設定する
		if (!MSC_WG_RQST_TYP.isPURC(wgRqst.wg_rqst_typ())
				|| !MSC_WG_RQST_SRC_TYP.isORD(wgRqst.wg_rqst_src_typ())) {
			return false;
		}
		if (MAC_DATA_CRUD_TYP.isCRT(wgRqstDataCrudTyp)) {
			// オーダ確定時にＷＧ間依頼が新規作成されるとき
			return true;
		}
		if (!isNull(itmOrdR)
				&& isSame(itmOrdR.strg_schd_dt(), wgRqst.gr_rqst_tm())) {
			if(!isNullOrNullVal(wgRqst.mfg_loc_cd()) //外注
					&& isSame(itmOrdR.mfg_loc_cd(), wgRqst.mfg_loc_cd())
					&& isSame(itmOrdR.bom_ptn(), wgRqst.bom_ptn())) {
				return true;
			}
			if(isNullOrNullVal(wgRqst.mfg_loc_cd()) // 外注以外
					&& isSame(itmOrdR.sppl_cd(), wgRqst.sppl_cd())
					&& isSame(itmOrdR.maker_cd(), wgRqst.maker_cd())) {
				return true;
			}
		}
		return false;
	}
	protected boolean isCmplSchdDtByOrd(MST_WG_RQST_R wgRqst, MCRow wgRqstPrms, MST_ITM_ORDER_R itmOrdR) {
		// WG間依頼回答に対して、オーダから予定日を補完するかチェックする
		// オーダ登録時から入庫日と発注先に変更がない場合、日付計算せずにオーダ登録時の予定日を設定する
		if (!MSC_WG_RQST_TYP.isPURC(wgRqst.wg_rqst_typ())
				|| !MSC_WG_RQST_SRC_TYP.isORD(wgRqst.wg_rqst_src_typ())
				|| isNull(itmOrdR) ) {
			return false;
		}
		if (isSame(itmOrdR.strg_schd_dt(), wgRqstPrms.getDateNE("gr_schd_tm"))) {
			if(!isNullOrNullVal(wgRqstPrms.getStringNE("mfg_loc_cd")) //外注
					&& isSame(itmOrdR.mfg_loc_cd(), wgRqstPrms.getStringNE("mfg_loc_cd"))
					&& isSame(itmOrdR.bom_ptn(), wgRqstPrms.getStringNE("bom_ptn"))) {
				return true;
			}
			if(isNullOrNullVal(wgRqstPrms.getStringNE("mfg_loc_cd")) // 外注以外
					&& isSame(itmOrdR.sppl_cd(), wgRqstPrms.getStringNE("sppl_cd"))
					&& isSame(itmOrdR.maker_cd(), wgRqstPrms.getStringNE("maker_cd"))) {
				return true;
			}
		}
		return false;
	}
	protected void cmplSchdDtByOrd(MCRow dstR, MST_ITM_ORDER_R itmOrdR) {
		if (!isNull(itmOrdR)) {
			dstR.setDateNE("po_schd_dt", itmOrdR.po_schd_dt());
			dstR.setDateNE("mfg_st_schd_dt", itmOrdR.mfg_st_schd_dt());
			dstR.setDateNE("mfg_end_schd_dt", itmOrdR.mfg_end_schd_dt());
			dstR.setDateNE("strg_schd_dt", itmOrdR.strg_schd_dt());
			dstR.setDateNE("accpt_schd_dt", itmOrdR.accpt_schd_dt());
			dstR.setDateNE("insp_st_schd_dt", itmOrdR.insp_st_schd_dt());
			dstR.setDateNE("insp_end_schd_dt", itmOrdR.insp_end_schd_dt());
			dstR.setDateNE("avl_schd_dt", itmOrdR.avl_schd_dt());
		}
	}
	
	protected static final Class<MSBAL_WgRqstService> CLAZZ = MSBAL_WgRqstService.class;
	
	// 一時的に発番する発注予定用の紐付けＮＯをキャッシュする
	protected Map<MCNumber, MCNumber> _pegNoMapForPoSchd;
	public static Map<MCNumber, MCNumber> getPegNoMapForPoSchd() {
		MSBAL_WgRqstService wgRqstService = object(CLAZZ);
		if(wgRqstService._pegNoMapForPoSchd == null) {
			wgRqstService._pegNoMapForPoSchd = new HashMap<>();
		}
		return wgRqstService._pegNoMapForPoSchd;
	}
	// 一時的に発番する移動・移送予定用の紐付けＮＯをキャッシュする
	protected Map<MCNumber, MCNumber> _pegNoMapForXfrSchd;
	public static Map<MCNumber, MCNumber> getPegNoMapForXfrSchd() {
		MSBAL_WgRqstService wgRqstService = object(CLAZZ);
		if(wgRqstService._pegNoMapForXfrSchd == null) {
			wgRqstService._pegNoMapForXfrSchd = new HashMap<>();
		}
		return wgRqstService._pegNoMapForXfrSchd;
	}
	// ＷＧ間依頼回答ＮＯと一時的に発番する紐付けＮＯをキャッシュする
	protected Map<String, MCNumber> _pegNoMapByWgRqstPrmsNo;
	public static Map<String, MCNumber> getPegNoMapByWgRqstPrmsNo() {
		MSBAL_WgRqstService wgRqstService = object(CLAZZ);
		if(wgRqstService._pegNoMapByWgRqstPrmsNo == null) {
			wgRqstService._pegNoMapByWgRqstPrmsNo = new HashMap<>();
		}
		return wgRqstService._pegNoMapByWgRqstPrmsNo;
	}
	
	// ＷＧ間依頼をキャッシュする。
	protected MCList<MST_WG_RQST_R> _wgRqstL = null;
	protected MCIndexKey _wgRqstKey = null;

	// 品目マスタをキャッシュする。
	protected MCList<MAM_ITM_R> _itmL = null;
	protected MCIndexKey _itmKey = null;	

	// ＷＧ間依頼制御マスタをキャッシュする。
	protected MCList<MAM_WG_RQST_CTL_R> _wgRqstCtlL = null;
	protected MCIndexKey _wgRqstCtlKey = null;

	/**
	 * ＷＧ間依頼トランをキャッシュする
	 * 
	 * @param dtlL　ＷＧ間依頼情報
	 */
	protected static void cacheWgRqst(MCList<WgRqst_Chk01_DtlR> dtlL) {
		object(CLAZZ)._cacheWgRqst(dtlL);
	}

	/**
	 * ＷＧ間依頼のキャッシュ、ロック、値の補完
	 */
	protected void _cacheWgRqst(MCList<WgRqst_Chk01_DtlR> dtlL) {
		_wgRqstL = MCList.create(MST_WG_RQST_R.class);
		MCList<WgRqst_Chk01_DtlR> bindL = MCList.create(WgRqst_Chk01_DtlR.class);
		for(WgRqst_Chk01_DtlR r : dtlL) {
			if(!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				bindL.add(r);
			}
		}
		
		if(!bindL.isEmpty()) {
			bindL.sort(WgRqst_Chk01_DtlR.$wg_rqst_no);
			// 最新のＷＧ間依頼を抽出
			MST_WG_RQST_R t = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder wgRqstL_bldr = MCQueryApiBuilder.create(t);
			wgRqstL_bldr.setWhere(t.wg_rqst_typ.eq(bind("wg_rqst_typ")));
			wgRqstL_bldr.addWhereWithAnd(t.wg_rqst_src_typ.eq(bind("wg_rqst_src_typ")));
			wgRqstL_bldr.addWhereWithAnd(t.wg_rqst_src_no.eq(bind("wg_rqst_src_no")));
			wgRqstL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			wgRqstL_bldr.setOrderByAsc(wgRqstL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBAL5100_MST_WG_RQST_S16", _wgRqstL, wgRqstL_bldr, bindL);
			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.ASC, MST_WG_RQST_R.$wg_rqst_typ);
			sp.add(SortType.ASC, MST_WG_RQST_R.$wg_rqst_src_typ);
			sp.add(SortType.ASC, MST_WG_RQST_R.$wg_rqst_src_no);
			sp.add(SortType.DESC, MST_WG_RQST_R.$wg_rqst_no);
			_wgRqstL.sort(sp);
		}
		_wgRqstKey = _wgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_typ, MST_WG_RQST_R.$wg_rqst_src_typ, MST_WG_RQST_R.$wg_rqst_src_no);
	}
	/**
	 * キャッシュからＷＧ間依頼を取得する
	 * @param r
	 * @param dataCrudTyp
	 * @return　MST_WG_RQST_R
	 */
	protected static MST_WG_RQST_R getWgRqstR(MST_WG_RQST_R r, String dataCrudTyp) {
		if (MAC_DATA_CRUD_TYP.isCRT(dataCrudTyp)) {
			return null;
		}
		return object(CLAZZ)._getWgRqstR(r);
	}
	protected MST_WG_RQST_R _getWgRqstR(MST_WG_RQST_R r) {
		if(_wgRqstL == null) {
			_wgRqstL = MCList.create(MST_WG_RQST_R.class);
			_wgRqstKey = _wgRqstL.createIndex(MST_WG_RQST_R.$wg_rqst_typ, MST_WG_RQST_R.$wg_rqst_src_typ, MST_WG_RQST_R.$wg_rqst_src_no);
		}
		return _wgRqstL.getFirst(_wgRqstKey, r.wg_rqst_typ(), r.wg_rqst_src_typ(), r.wg_rqst_src_no());
	}

	/**
	 * 品目マスタをキャッシュする
	 * 
	 * @param dtlL　ＷＧ間依頼情報
	 */
	protected static void cacheItm(MCList<WgRqst_Chk01_DtlR> dtlL) {
		object(CLAZZ)._cacheItm(dtlL);
	}

	/**
	 * 品目マスタのキャッシュ
	 */
	protected void _cacheItm(MCList<WgRqst_Chk01_DtlR> dtlL) {
		_itmL = MCList.create(MAM_ITM_R.class);
		
		if(!dtlL.isEmpty()) {
			dtlL.sort(WgRqst_Chk01_DtlR.$itm_cd, WgRqst_Chk01_DtlR.$itm_sub1, WgRqst_Chk01_DtlR.$itm_sub2, WgRqst_Chk01_DtlR.$itm_sub3);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setSelect(t.itm_cd);
			itmL_bldr.addSelect(t.itm_sub1);
			itmL_bldr.addSelect(t.itm_sub2);
			itmL_bldr.addSelect(t.itm_sub3);
			itmL_bldr.addSelect(t.itm_nm);
			itmL_bldr.addSelect(t.asset_mng_typ);
			itmL_bldr.addSelect(t.sundry_itm_flg);
			itmL_bldr.addSelect(t.lot_mng_typ);
			itmL_bldr.addSelect(t.sublot_mng_typ);
			dbSelectKey("MSBAL5100_MAM_ITM_S01", _itmL, itmL_bldr, dtlL);
		}
		_itmKey = _itmL.createIndex(MST_WG_RQST_R.$itm_cd, MST_WG_RQST_R.$itm_sub1, MST_WG_RQST_R.$itm_sub2, MST_WG_RQST_R.$itm_sub3);
	}
	
	/**
	 * キャッシュから品目マスタを取得する
	 * @param r
	 * @return　MAM_ITM_R
	 */
	protected static MAM_ITM_R getItmR(MST_WG_RQST_R r) {
		return object(CLAZZ)._getItmR(r);
	}
	protected MAM_ITM_R _getItmR(MST_WG_RQST_R r) {
		if(_itmL == null) {
			_itmL = MCList.create(MAM_ITM_R.class);
			_itmKey = _itmL.createIndex(MST_WG_RQST_R.$itm_cd, MST_WG_RQST_R.$itm_sub1, MST_WG_RQST_R.$itm_sub2, MST_WG_RQST_R.$itm_sub3);
		}
		return _itmL.getFirst(_itmKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
	}

	protected Map<List<Comparable<?>>, MCList<MAVM_ITM_UNIT_R>> _itmUnitCache = null;
	
	/**
	 * キャッシュ作成（品目単位マスタ）
	 * @param dtlL
	 */
	protected void createItmUnitCache(MCList<MST_WG_RQST_R> dtlL) {
		_itmUnitCache = new LinkedHashMap<List<Comparable<?>>, MCList<MAVM_ITM_UNIT_R>>();
		MCList<MST_WG_RQST_R> bindL = dtlL.groupBy(MST_WG_RQST_R.$itm_cd, MST_WG_RQST_R.$itm_sub1, MST_WG_RQST_R.$itm_sub2, MST_WG_RQST_R.$itm_sub3);
		MCList<MAVM_ITM_UNIT_R> dbc = MCList.create(MAVM_ITM_UNIT_R.class);
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
		dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBAL5100_MAVM_ITM_UNIT_S01", dbc, dbc_bldr, bindL);

		MCIndexKey idxkey = dbc.createIndex(MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3);
		
		for (MAVM_ITM_UNIT_R r : dbc) {
			String[] keyArr = new String[] { r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3() };
			MCList<MAVM_ITM_UNIT_R> val = MCList.create(MAVM_ITM_UNIT_R.class);
			val = dbc.subList(idxkey, keyArr);
			_itmUnitCache.put(toMapKey(keyArr), val);
		}
	}
	
	/**
	 * キャッシュ取得（品目単位マスタ）
	 * @param dtlR
	 * @return
	 */
	protected MCList<MAVM_ITM_UNIT_R> getItmUnitCache(MST_WG_RQST_R dtlR){
		return _itmUnitCache.get(toMapKey(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()));
	}
	
	protected Map<String, MAM_LOC_R> _LcoCacheForGrLoc = null;
	
	/**
	 * キャッシュ作成（場所マスタ）
	 * @param dtlL
	 */
	protected void createLocCacheForGrLoc(MCList<?> dtlL) {
		_LcoCacheForGrLoc = new LinkedHashMap<String, MAM_LOC_R>();
		MCList<?> bindL = dtlL.groupBy("gr_loc_cd");
		MCList<MAM_LOC_R> dbc = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setWhere(t.loc_cd.eq(bind("gr_loc_cd")));
		dbSelect("MSBAL5100_MAM_LOC_S03", dbc, dbc_bldr, bindL);

		MCIndexKey idxkey = dbc.createIndex(MAM_LOC_R.$loc_cd);
		
		for (MAM_LOC_R r : dbc) {
			MAM_LOC_R val = dbc.getFirst(idxkey, r.loc_cd());
			_LcoCacheForGrLoc.put(r.loc_cd(), val);
		}
	}
	
	/**
	 * キャッシュ取得（場所マスタ）
	 * @param grLocCd
	 * @return
	 */
	protected MAM_LOC_R getLocCacheForGrLoc(String grLocCd){
		return _LcoCacheForGrLoc.get(grLocCd);
	}
	
	/**
	 * ＷＧ間依頼制御マスタをキャッシュする
	 * 
	 * @param dtlL　ＷＧ間依頼情報
	 */
	protected static void cacheWgRqstCtl(MCList<WgRqst_Chk01_DtlR> dtlL) {
		object(CLAZZ)._cacheWgRqstCtl(dtlL);
	}

	/**
	 * ＷＧ間依頼制御マスタのキャッシュ
	 */
	protected void _cacheWgRqstCtl(MCList<WgRqst_Chk01_DtlR> dtlL) {
		_wgRqstCtlL = MCList.create(MAM_WG_RQST_CTL_R.class);

		MCList<MAM_WG_RQST_CTL_R> bindWgRqstCtlL = MCList.create(MAM_WG_RQST_CTL_R.class);
		
		for (WgRqst_Chk01_DtlR r : dtlL.groupBy(WgRqst_Chk01_DtlR.$rqst_fr_wg_cd,
				WgRqst_Chk01_DtlR.$rqst_to_wg_cd, WgRqst_Chk01_DtlR.$wg_rqst_typ,
				WgRqst_Chk01_DtlR.$rqst_fr_dpt_cd, WgRqst_Chk01_DtlR.$cst_cd,
				WgRqst_Chk01_DtlR.$itm_cd, WgRqst_Chk01_DtlR.$itm_sub1,
				WgRqst_Chk01_DtlR.$itm_sub2, WgRqst_Chk01_DtlR.$itm_sub3)) {

			MAM_WG_RQST_CTL_R wgRqstCtlR = MAM_WG_RQST_CTL_R.create();
			
			// 依頼元部門、得意先、品目一致
			wgRqstCtlR.to_wg_cd(r.rqst_to_wg_cd());
			wgRqstCtlR.fr_wg_cd(r.rqst_fr_wg_cd());
			wgRqstCtlR.wg_rqst_typ(r.wg_rqst_typ());
			wgRqstCtlR.fr_dpt_cd(r.rqst_fr_dpt_cd());
			wgRqstCtlR.cst_cd(r.cst_cd());
			wgRqstCtlR.itm_cd(r.itm_cd());
			wgRqstCtlR.itm_sub1(r.itm_sub1());
			wgRqstCtlR.itm_sub2(r.itm_sub2());
			wgRqstCtlR.itm_sub3(r.itm_sub3());
			bindWgRqstCtlL.add(wgRqstCtlR);
			
			// 得意先、品目一致
			wgRqstCtlR = wgRqstCtlR.clone();
			wgRqstCtlR.fr_dpt_cd(MAC_STR.NULL_VAL.value());
			bindWgRqstCtlL.add(wgRqstCtlR);
			
			// 依頼元部門、品目一致
			wgRqstCtlR = wgRqstCtlR.clone();
			wgRqstCtlR.fr_dpt_cd(r.rqst_fr_dpt_cd());
			wgRqstCtlR.cst_cd(MAC_STR.NULL_VAL.value());
			bindWgRqstCtlL.add(wgRqstCtlR);
			
			// 品目一致
			wgRqstCtlR = wgRqstCtlR.clone();
			wgRqstCtlR.fr_dpt_cd(MAC_STR.NULL_VAL.value());
			bindWgRqstCtlL.add(wgRqstCtlR);
			
			// 依頼元部門、得意先一致
			wgRqstCtlR = wgRqstCtlR.clone();
			wgRqstCtlR.fr_dpt_cd(r.rqst_fr_dpt_cd());
			wgRqstCtlR.cst_cd(r.cst_cd());
			wgRqstCtlR.itm_cd(MAC_STR.NULL_VAL.value());
			wgRqstCtlR.itm_sub1(MAC_STR.NULL_VAL.value());
			wgRqstCtlR.itm_sub2(MAC_STR.NULL_VAL.value());
			wgRqstCtlR.itm_sub3(MAC_STR.NULL_VAL.value());
			bindWgRqstCtlL.add(wgRqstCtlR);
			
			// 得意先一致
			wgRqstCtlR = wgRqstCtlR.clone();
			wgRqstCtlR.fr_dpt_cd(MAC_STR.NULL_VAL.value());
			bindWgRqstCtlL.add(wgRqstCtlR);
			
			// 依頼元部門一致
			wgRqstCtlR = wgRqstCtlR.clone();
			wgRqstCtlR.fr_dpt_cd(r.rqst_fr_dpt_cd());
			wgRqstCtlR.cst_cd(MAC_STR.NULL_VAL.value());
			bindWgRqstCtlL.add(wgRqstCtlR);
			
			// 依頼元部門、得意先、品目が未設定
			wgRqstCtlR = wgRqstCtlR.clone();
			wgRqstCtlR.fr_dpt_cd(MAC_STR.NULL_VAL.value());
			wgRqstCtlR.cst_cd(MAC_STR.NULL_VAL.value());
			bindWgRqstCtlL.add(wgRqstCtlR);
		}
		
		bindWgRqstCtlL = bindWgRqstCtlL.groupBy(getWgRqstCtlGroupByKey());
		
		if(!bindWgRqstCtlL.isEmpty()) {
			// ＷＧ間依頼制御マスタを取得
			MAM_WG_RQST_CTL_R t = MAM_WG_RQST_CTL_R.create("T");
			MCQueryApiBuilder wgRqstCtlL_bldr = MCQueryApiBuilder.create(t);
			wgRqstCtlL_bldr.setSelect(t.to_wg_cd);
			wgRqstCtlL_bldr.addSelect(t.fr_wg_cd);
			wgRqstCtlL_bldr.addSelect(t.wg_rqst_typ);
			wgRqstCtlL_bldr.addSelect(t.fr_dpt_cd);
			wgRqstCtlL_bldr.addSelect(t.cst_cd);
			wgRqstCtlL_bldr.addSelect(t.itm_cd);
			wgRqstCtlL_bldr.addSelect(t.itm_sub1);
			wgRqstCtlL_bldr.addSelect(t.itm_sub2);
			wgRqstCtlL_bldr.addSelect(t.itm_sub3);
			wgRqstCtlL_bldr.addSelect(t.auto_prms_flg);
			dbSelectKey("MSBAL5100_MAM_WG_RQST_CTL_S01", _wgRqstCtlL, wgRqstCtlL_bldr, bindWgRqstCtlL);
		}
		
		_wgRqstCtlKey = _wgRqstCtlL.createIndex(getWgRqstCtlGroupByKey());
	}
	
	/**
	 * ＷＧ間依頼制御マスタのキー項目を返す
	 * @return
	 */
	protected String[] getWgRqstCtlGroupByKey() {
		return new String[] {
				MAM_WG_RQST_CTL_R.$to_wg_cd, MAM_WG_RQST_CTL_R.$fr_wg_cd,
				MAM_WG_RQST_CTL_R.$wg_rqst_typ, MAM_WG_RQST_CTL_R.$fr_dpt_cd,
				MAM_WG_RQST_CTL_R.$cst_cd, MAM_WG_RQST_CTL_R.$itm_cd,
				MAM_WG_RQST_CTL_R.$itm_sub1, MAM_WG_RQST_CTL_R.$itm_sub2,
				MAM_WG_RQST_CTL_R.$itm_sub3
		};
	}
	
	/**
	 * キャッシュからＷＧ間依頼制御マスタを参照し自動回答ＦＬＧを取得する
	 * @param r
	 * @return　boolean
	 */
	protected static boolean getWgRqstCtlR(String rqst_to_wg_cd, String rqst_fr_wg_cd, String wg_rqst_typ, String rqst_fr_dpt_cd, String cst_cd, String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3) {
		return object(CLAZZ)._getWgRqstCtlR(rqst_to_wg_cd, rqst_fr_wg_cd, wg_rqst_typ,
				rqst_fr_dpt_cd, cst_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3);
	}

	protected boolean _getWgRqstCtlR(String rqst_to_wg_cd, String rqst_fr_wg_cd, String wg_rqst_typ, String rqst_fr_dpt_cd, String cst_cd, String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3) {		
		if(_wgRqstCtlL == null) {
			_wgRqstCtlL = MCList.create(MAM_WG_RQST_CTL_R.class);
			_wgRqstCtlKey = _wgRqstCtlL.createIndex(getWgRqstCtlGroupByKey());
		}
		// 依頼元部門、得意先、品目一致
		MAM_WG_RQST_CTL_R wgRqstCtlR = _wgRqstCtlL.getFirst(_wgRqstCtlKey,
				rqst_to_wg_cd, rqst_fr_wg_cd, wg_rqst_typ,
				rqst_fr_dpt_cd, cst_cd, itm_cd, itm_sub1,
				itm_sub2, itm_sub3);
		
		if(!isNull(wgRqstCtlR)) {
			return wgRqstCtlR.auto_prms_flg();
		}

		// 得意先、品目一致
		wgRqstCtlR = _wgRqstCtlL.getFirst(_wgRqstCtlKey,
				rqst_to_wg_cd, rqst_fr_wg_cd, wg_rqst_typ,
				MAC_STR.NULL_VAL.value(), cst_cd, itm_cd, itm_sub1,
				itm_sub2, itm_sub3);
		
		if(!isNull(wgRqstCtlR)) {
			return wgRqstCtlR.auto_prms_flg();
		}

		// 依頼元部門、品目一致
		wgRqstCtlR = _wgRqstCtlL.getFirst(_wgRqstCtlKey,
				rqst_to_wg_cd, rqst_fr_wg_cd, wg_rqst_typ,
				rqst_fr_dpt_cd, MAC_STR.NULL_VAL.value(), itm_cd, itm_sub1,
				itm_sub2, itm_sub3);
		
		if(!isNull(wgRqstCtlR)) {
			return wgRqstCtlR.auto_prms_flg();
		}
		
		// 品目一致
		wgRqstCtlR = _wgRqstCtlL.getFirst(_wgRqstCtlKey,
				rqst_to_wg_cd, rqst_fr_wg_cd, wg_rqst_typ,
				MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), itm_cd, itm_sub1,
				itm_sub2, itm_sub3);
		
		if(!isNull(wgRqstCtlR)) {
			return wgRqstCtlR.auto_prms_flg();
		}

		// 依頼元部門、得意先一致
		wgRqstCtlR = _wgRqstCtlL.getFirst(_wgRqstCtlKey,
				rqst_to_wg_cd, rqst_fr_wg_cd, wg_rqst_typ,
				rqst_fr_dpt_cd, cst_cd, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
				MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
		
		if(!isNull(wgRqstCtlR)) {
			return wgRqstCtlR.auto_prms_flg();
		}
		
		// 得意先一致
		wgRqstCtlR = _wgRqstCtlL.getFirst(_wgRqstCtlKey,
				rqst_to_wg_cd, rqst_fr_wg_cd, wg_rqst_typ,
				MAC_STR.NULL_VAL.value(), cst_cd, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
				MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
		
		if(!isNull(wgRqstCtlR)) {
			return wgRqstCtlR.auto_prms_flg();
		}
		
		// 依頼元部門一致
		wgRqstCtlR = _wgRqstCtlL.getFirst(_wgRqstCtlKey,
				rqst_to_wg_cd, rqst_fr_wg_cd, wg_rqst_typ,
				rqst_fr_dpt_cd, MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
				MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
		
		if(!isNull(wgRqstCtlR)) {
			return wgRqstCtlR.auto_prms_flg();
		}
		
		// 依頼元部門、得意先、品目が未設定
		wgRqstCtlR = _wgRqstCtlL.getFirst(_wgRqstCtlKey,
				rqst_to_wg_cd, rqst_fr_wg_cd, wg_rqst_typ,
				MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
				MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
		
		if(!isNull(wgRqstCtlR)) {
			return wgRqstCtlR.auto_prms_flg();
		}
		
		// ＷＧ間依頼制御マスタが取得できない場合、自動回答扱い
		return true;
	}
	
	/**
	 * 配列をMapのキーに変換する
	 */
	protected List<Comparable<?>> toMapKey(Comparable<?>... in) {
		List<Comparable<?>> ret = new ArrayList<Comparable<?>>();
		if (in == null) {
			return ret;
		}
		for (Comparable<?> c : in) {
			ret.add(c);
		}
		return ret;
	}
	
	/**
	 * 自動回答できるかどうか
	 */
	protected boolean cannotAutoPrms(String wg_rqst_sts_typ, String wg_rqst_typ, boolean man_prms_flg) {
		return MSC_WG_RQST_STS_TYP.isCMPL(wg_rqst_sts_typ)
				|| (!MSC_WG_RQST_TYP.isSHIP(wg_rqst_typ) && (MSC_WG_RQST_STS_TYP.isINST(wg_rqst_sts_typ) || MSC_WG_RQST_STS_TYP.isPART_INST(wg_rqst_sts_typ)))
				|| (!MSC_WG_RQST_TYP.isSHIP(wg_rqst_typ) && man_prms_flg);
	}

	/**
	 * オーダ登録サービス予定日計算用のマスタ参照日付を取得
	 * 
	 * @param dtlR 処理対象行
	 * @return マスタ参照日付
	 */
	protected MCDate getMasterDate(MCRow dtlR) {
		if (isSame(_sysParm, "1")) {
			if (!MSC_WG_RQST_TYP.isPURC(dtlR.getString("wg_rqst_typ"))) {
				return dtlR.getDate("gr_rqst_tm");
			}
			else if (!isNull(dtlR.getDateNE("avl_schd_dt"))) {
				return dtlR.getDate("avl_schd_dt");
			}
		}
		PurcUtil_Srch01_DtlR rslt = null;
		setSloDInfo(dtlR);

		// 購買
		MAM_LOC_R locR = getLoc(dtlR.getString("gr_loc_cd"));
		// 購買ユーティリティで算出した日付
		rslt = callPurcUtilSrch01(dtlR, locR);
		if (isSame(_sysParm, "1")) {
			return rslt.rqst_dlv_rqst_dt();
		}
		else {
			return rslt.po_schd_dt();
		}
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
			MST_SLO_D_R sloDR = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDR_bldr = MCQueryApiBuilder.create(sloDR);
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			sloDR_bldr.setSelect(sloDR.tdlv_cd);
			sloDR_bldr.addSelect(sloDR.tdlv_lg_grp_cd);
			sloDR_bldr.addSelect(sloDR.dlv_cd);
			sloDR_bldr.addSelect(sloDR.dlv_lg_grp_cd);
			sloDR_bldr.addSelect(sloDR.base_unit_qty);
			sloDR_bldr.addSelect(sloDR.ship_term_cd);
			sloDR_bldr.addSelect(sloDR.proc_typ);
			sloDR_bldr.addSelect(m1.dlv_cal_cd.as("slod_dlv_cal_cd"));
			sloDR_bldr.setWhere(sloDR.slo_d_no.eq(bind("slo_d_no")));
			sloDR_bldr.addLeftOuterJoin(m1, bracket( m1.bp_cd.eq(sloDR.dlv_cd)));
			dbSelect("MSBAL5100_MST_SLO_D_S02", sloDR, sloDR_bldr, dtlR);

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
	 * @return (移送ＬＴ)×-1
	 */
	protected MCNumber getDiffLT(MCRow dtlR) {
		// 物流制御マスタより移動ＬＴを取得
		MAM_LG_CTL_R lgCtlR = MAM_LG_CTL_R.create("T");
		MCQueryApiBuilder lgCtlR_bldr = MCQueryApiBuilder.create(lgCtlR);
		lgCtlR_bldr.setSelect(lgCtlR.xfr_lt);
		lgCtlR_bldr.setWhere(lgCtlR.fr_lg_grp_cd.eq(bind("1")), dtlR.getString("gi_lg_grp_cd"));
		lgCtlR_bldr.addWhereWithAnd(lgCtlR.to_lg_grp_cd.eq(bind("1")), dtlR.getString("gr_lg_grp_cd"));
		lgCtlR_bldr.addWhereWithAnd(lgCtlR.ship_term_cd.eq(bind("1")), nvl(dtlR.getString("slod_ship_term_cd"), MAC_STR.NULL_VAL.value()));
		dbSelect("MSBAL5100_MAM_LG_CTL_S01", lgCtlR, lgCtlR_bldr);
		return nvl(lgCtlR.xfr_lt(), MCNumber.ZERO).multiply(-1);
	}

	/**
	 * 購買共通ユーティリティ呼出
	 * 
	 * @param dtlR 処理対象明細行
	 * @param locR 納入場所
	 * @return 購買共通ユーティリティ取得結果
	 */
	protected PurcUtil_Srch01_DtlR callPurcUtilSrch01(MCRow dtlR, MAM_LOC_R locR) {
		MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
		PurcUtil_Srch01_DtlR purcSrchDtlR = PurcUtil_Srch01_DtlR.create();
		purcSrchDtlR.peg_no(dtlR.getNumber("peg_no"));
		purcSrchDtlR.dlv_rqst_dt(dtlR.getDateNE("gr_rqst_tm")); // WG間依頼から登録したとき
		purcSrchDtlR.rqst_dlv_rqst_dt(dtlR.getDateNE("avl_schd_dt")); //受注から登録したとき
		purcSrchDtlR.itm_cd(dtlR.getString("itm_cd"));
		purcSrchDtlR.itm_sub1(dtlR.getString("itm_sub1"));
		purcSrchDtlR.itm_sub2(dtlR.getString("itm_sub2"));
		purcSrchDtlR.itm_sub3(dtlR.getString("itm_sub3"));
		purcSrchDtlR.wg_cd(dtlR.getString("gr_loc_wg_cd"));
		purcSrchDtlR.in_to_loc_cd(dtlR.getString("gr_loc_cd"));
		purcSrchDtlR.prov_ddlv_flg(isNull(locR.sppl_cd()) ? false : true);
		purcSrchDtlR.site_cd(locR.site_cd());
		purcSrchDtlR.in_to_loc_cal_cd(locR.cal_cd());
		if (!isNullOrNullVal(dtlR.getString("mfg_loc_cd"))) {
			purcSrchDtlR.mfg_loc_cd(dtlR.getString("mfg_loc_cd"));
			purcSrchDtlR.bom_ptn(dtlR.getString("bom_ptn"));
		}
		purcSrchDtlR.sppl_cd(dtlR.getString("sppl_cd"));
		purcSrchDtlR.maker_cd(dtlR.getString("maker_cd"));
		MAM_BP_R spplR = getBp(dtlR.getString("sppl_cd"));
		purcSrchDtlR.sppl_cal_cd(spplR.sppl_cal_cd());
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
			_bpR = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")));
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
			_locR = new FXUCL_MCDbcCache<MAM_LOC_R>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")));
		}
		return _locR.get(locCd);
	}

	//FMCB CUSTOM END
}