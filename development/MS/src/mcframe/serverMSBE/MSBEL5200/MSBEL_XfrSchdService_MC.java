package mcframe.serverMSBE.MSBEL5200;

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
import mcframe.serverMSBE.MSBEL5200.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR;
import mcframe.serverMSBE.MSBEL5020.MSBEL_IoSchdService;
import mcframe.serverMSBE.MSBEL5040.MSBEL_AllocMngService;
import mcframe.serverMSBE.MSBEL5040.Srch_TgtR;
import mcframe.serverMSBE.MSBEL5040.Srch_RsltR;
import mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR;
import mcframe.serverMSBE.MSBEL5040.Srch_StkR;
import mcframe.serverMSBE.MSBEL5260.MSBEL_ProvSchdService;
import mcframe.serverMSBE.MSBEL5260.ProvSchd_DtlR;
import mcframe.serverMSBE.MSBEL5500.Alloc_RsltR;
import mcframe.serverMSBE.MSBEL5500.MSBEL_ShipSchdService;
import mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR;
import mcframe.serverMSBE.MSBEL5510.MSBEL_ShipSchdDtCalcService;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import mcframe.serverMSUC.MSUCL0010.*;

import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_DuplicateValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_AtLeastOneValidater;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.serverCore.resource.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import mcframe.serverMSBA.MSBAL5100.*;
import mcframe.serverMSBC.MSBCL5010.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.createDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.setCurrentDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.returnedCurrentDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_XfrSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_XfrSchdService_MC extends MSBEL_XfrSchdService_MC_A{
	//FMCB CUSTOM START
	
	protected static final String GR_LOC_CD_COL = "gr_loc_cd";
	protected static final String GI_DEF_LOC_CD_COL = "gi_def_loc_cd";
	protected static final String SHIP_SCHD_TM_COL = "ship_schd_tm";
	protected static final String DLV_SCHD_TM_COL = "dlv_schd_tm";
	protected static final String SHIP_WK_CD_COL = "ship_wk_cd";
	protected static final String WK_PEG_NO_COL = "wk_peg_no";
	protected static final String WK_RET_PEG_NO_COL = "wk_ret_peg_no";
	protected static final String SHIP_TO_LG_GRP_CD_COL = "ship_to_lg_grp_cd";
	protected String[] _xfrSchdRemoveSetCols = null;
	protected String[] _xfrAllocRemoveSetCols = null;
	
	/**
	 * XfrSchd_Upd01オペレーション.<p>
	 *
	 * 移動・移送予定にデータを登録する。移動・移送予定のデータを更新・削除する。<br>
	 */
	public class XfrSchd_Upd01 extends MSBEL_XfrSchdService_MC_A.XfrSchd_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			editUpShip();
			editUpProv();
			completionGrStkArrv();
			xfrSchdUpd();
			callXfrSchdServiceUpd02();
			callShipSchdServiceUpd01();
			setDown();
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected void editUpShip() {
			MCList<XfrSchd_DtlR> insUpdShipL = up0().subList(
					r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && isShipR(r));
			if (isNull(insUpdShipL)) {
				return ;
			}
			
			for(XfrSchd_DtlR upR : insUpdShipL) {
				editUpChk04AndUpd01ShipTo(upR.xs(), up1().screen_flg());
				editUpChk04AndUpd01ShipDt(upR.xs());
				editUpChk04AndUpd01ShipToAddr(upR.xs(), up1().screen_flg(), false);
			}
		}
		
		/**
		 * 支給関連項目を補完する。
		 */
		protected void editUpProv() {
			MCList<MST_XFR_SCHD_R> provL = MCList.create(MST_XFR_SCHD_R.class);
			for (XfrSchd_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || !isProvR(r)) {
					continue;
				}
				provL.add(r.xs());
			}

			callProvSchdServiceSprt01(provL, up1().screen_flg(),false);
		}

		/**
		 * 入庫在庫着荷先の補完を行う。
		 * 支給計上区分を補完後に行う必要がある。
		 */
		protected void completionGrStkArrv() {
			for(XfrSchd_DtlR upR : up0()) {
				if(MAC_TRD_PTN_TYP.isPROV(upR.trd_ptn_typ())
						&& !MAC_PROV_BASIS_TYP.isINPT(upR.prov_basis_typ())) {
					upR.gr_stk_arrv_bp_cd(grLocCache().getEx(upR.gr_loc_cd()).sppl_cd());
				}
				else {
					upR.gr_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}

		/**
		 * 移動・移送予定の更新を行う
		 */
		protected void xfrSchdUpd() {
			
			MCList<MST_XFR_SCHD_R> dbcInsert = MCList.create(MST_XFR_SCHD_R.class);
			MCList<MST_XFR_SCHD_R> dbcUpdate = MCList.create(MST_XFR_SCHD_R.class);
			MCList<MST_XFR_SCHD_R> dbcDelete = MCList.create(MST_XFR_SCHD_R.class);

			for(XfrSchd_DtlR up : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(up.data_crud_typ())) {
					dbcInsert.add(up.xs());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(up.data_crud_typ())) {
					dbcUpdate.add(up.xs());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(up.data_crud_typ())) {
					dbcDelete.add(up.xs());
				}
			}
			
			dbDeleteKey("MSBEL5200_MST_XFR_SCHD_D01", dbcDelete,
					MCQueryApiBuilder.create(MST_XFR_SCHD_R.create("T")));
			MCQueryApiBuilder dbcUpdate_bldr = MCQueryApiBuilder.create(MST_XFR_SCHD_R.create("T"));
			setSet(dbcUpdate, dbcUpdate_bldr);
			dbUpdateKey("MSBEL5200_MST_XFR_SCHD_U01", dbcUpdate, dbcUpdate_bldr);
			dbInsertEx("MSBEL5200_MST_XFR_SCHD_I01", dbcInsert,
					MCQueryApiBuilder.create(MST_XFR_SCHD_R.create("T")));
		}
		
		protected void setSet(MCList<MST_XFR_SCHD_R> updL, MCQueryApiBuilder updL_bldr) {
			updL_bldr.removeSet(getXfrSchdRemoveSetCols());
		}
		
		/**
		 * XfrSchd_Upd02(支給予定、受払予定、移動引当状況の更新処理)を呼ぶ。
		 */
		protected void callXfrSchdServiceUpd02() {
			MCList<XfrSchd_DtlR> xfrL = up0().subList(r->isXfrR(r));
			if(isNull(xfrL)) {
				return;
			}
			
			MSBEL_XfrSchdService.XfrSchd_Upd02 ope = MSBEL_XfrSchdService.crtXfrSchd_Upd02();
			
			// 引当可能数チェック相当のことを行っているので、こちらで引当済でのものをそのまま出荷引当状況にし、場所引当もオンとする
			MCIndexKey idxkey = up2().createIndex(XfrSchdChk04_DtlR.$peg_no);
			for (XfrSchd_DtlR upR : xfrL) {
				if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					XfrPr_DtlR tmpR = XfrPr_DtlR.create();
					copy(tmpR, upR, createMap_XfrPr_DtlR_XfrSchd_DtlR());
					ope.up0().add(tmpR);
				}
				else {
					if (upR.alloc_flg()) {
						MCList<XfrSchdChk04_DtlR> allocedL = up2().subList(idxkey, upR.peg_no());
						if (isNull(allocedL)) {
							XfrPr_DtlR tmpR = XfrPr_DtlR.create();
							copy(tmpR, upR, createMap_XfrPr_DtlR_XfrSchd_DtlR());
							ope.up0().add(tmpR);
						}
						else {
							int i = 0;
							for (XfrSchdChk04_DtlR allocedR : allocedL) {
								XfrPr_DtlR tmpR = XfrPr_DtlR.create();
								copy(tmpR, upR, createMap_XfrPr_DtlR_XfrSchd_DtlR());
								tmpR.lot_no(allocedR.lot_no());
								tmpR.sublot_no(allocedR.sublot_no());
								tmpR.ver_no(allocedR.ver_no());
								tmpR.alloc_sno1(allocedR.sno1());
								tmpR.alloc_sno2(allocedR.sno2());
								tmpR.alloc_sno3(allocedR.sno3());
								tmpR.alloc_sno4(allocedR.sno4());
								tmpR.trd_unit_cd(allocedR.trd_unit_cd());
								tmpR.trd_unit_qty(allocedR.trd_unit_qty());
								tmpR.base_unit_qty(allocedR.base_unit_qty());
								ope.up0().add(tmpR);
								if (i > 0) {
									tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								}
								i++;
							}
						}
					}
					else {
						XfrPr_DtlR tmpR = XfrPr_DtlR.create();
						copy(tmpR, upR, createMap_XfrPr_DtlR_XfrSchd_DtlR());
						ope.up0().add(tmpR);
					}
				}
				
			}
			
			ope.up1().schd_flg(true);
			ope.exec();
		}

		/**
		 * ShipSchd_Upd01（移送）の更新処理
		 */
		protected void callShipSchdServiceUpd01() {
			MCList<XfrSchd_DtlR> shipL = up0().subList(r->isShipR(r));
			if(shipL.isEmpty()) {
				return;
			}

			MSBEL_ShipSchdService.ShipSchd_Upd01 ope = MSBEL_ShipSchdService.crtShipSchd_Upd01();
			MCIndexKey idxkey = up2().createIndex(XfrSchdChk04_DtlR.$peg_no);
			
			initLgGrpCache(up0().groupBy(XfrSchd_DtlR.$gi_lg_grp_cd));
			for(XfrSchd_DtlR upR : shipL) {
				ShipPr_DtlR shipPrR = ShipPr_DtlR.create();
				copy(shipPrR, upR, createMap_ShipPr_DtlR_XfrSchd_DtlR());
				ope.up0().add(shipPrR);

				// 引当可能数チェック相当のことを行っているので、こちらで引当済でのものをそのまま出荷引当状況にし、場所引当もオンとする
				if (!MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ()) && upR.alloc_flg()) {
					MCList<XfrSchdChk04_DtlR> allocedL = up2().subList(idxkey, upR.peg_no());
					if (isNull(allocedL)) {
						Alloc_RsltR shipAlloc = Alloc_RsltR.create();
						copy(shipAlloc, upR, createMap_Alloc_RsltR_XfrSchd_DtlR());
						ope.up1().add(shipAlloc);
					}
					else {
						for (XfrSchdChk04_DtlR allocedR : allocedL) {
							XfrSchd_DtlR tmpR = upR.clone();
							tmpR.lot_no(allocedR.lot_no());
							tmpR.sublot_no(allocedR.sublot_no());
							tmpR.ver_no(allocedR.ver_no());
							tmpR.sno1(allocedR.sno1());
							tmpR.sno2(allocedR.sno2());
							tmpR.sno3(allocedR.sno3());
							tmpR.sno4(allocedR.sno4());
							tmpR.trd_unit_cd(allocedR.trd_unit_cd());
							tmpR.trd_unit_qty(allocedR.trd_unit_qty());
							tmpR.base_unit_qty(allocedR.base_unit_qty());
							Alloc_RsltR shipAlloc = Alloc_RsltR.create();
							copy(shipAlloc, tmpR, createMap_Alloc_RsltR_XfrSchd_DtlR());
							ope.up1().add(shipAlloc);
						}
					}
				}
			}
			ope.exec();
			
		}

		/**
		 * 上り電文の編集を行う。
		 */
		protected void editUp() {
			editDeleteUp(up0().subList(r->MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
			editUpdateUp(up0().subList(r->MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())));
			editDefLoc();
			editUpCmmn();
			editInsertUp(up0().subList(r->MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())));
		}
		
		protected void editDeleteUp(MCList<XfrSchd_DtlR> delL) {
			for(XfrSchd_DtlR r : delL) {
				MST_XFR_SCHD_R dbR = getXfrSchdCache().getFirst(r);
				r.xs(dbR);
			}
		}

		protected void editUpdateUp(MCList<XfrSchd_DtlR> updL) {
			for(XfrSchd_DtlR r : updL) {
				MST_XFR_SCHD_R schdR = getXfrSchdCache().getFirst(r).clone();
				editUpdateUpChk04AndUpd01(r.xs(), schdR);
			}
		}
		
		protected void editDefLoc() {
			initItmLgGrpLocCache(up0());
			for(XfrSchd_DtlR upR : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					continue;
				}
				if(!isNull(upR.gi_loc_cd())) {
					upR.gi_def_loc_cd(upR.gi_loc_cd());
				}
				else {
					MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpLocCache().get(upR.itm_cd(),
							upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(),
							upR.gi_lg_grp_cd());
					if (!itmLgGrpR.isEmpty()) {
						upR.gi_def_loc_cd(itmLgGrpR.lg_def_loc_cd());
					}
					else {
						MAM_LG_GRP_R lgGrpR = giDefLocCache().get(upR.gi_lg_grp_cd());
						if (!isNull(lgGrpR)) {
							upR.gi_def_loc_cd(lgGrpR.getStringNE("loc_cd"));
						}
					}
				}
			}
		}

		protected void editUpCmmn() {
			int i = 0;
			for(XfrSchd_DtlR upR : up0()) {
				i++;
				upR.wk_peg_no(i);
				i++;
				upR.wk_ret_peg_no(i);
				
				if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					continue;
				}
				editUpChk04AndUpd01(upR.xs(), up1().screen_flg(), false);
			}
		}
		

		protected void editInsertUp(MCList<XfrSchd_DtlR> insL) {
			if (isNull(insL)) {
				return ;
			}
			
			doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, insL.subList(r->isNull(r.io_schd_pr_no())).size());
			initGiDefLocCache(insL);
			initGiLocCache(insL);
			MCList<ElmArgsR> elmArgs = MCList.create(ElmArgsR.class);
			for(XfrSchd_DtlR up : insL) {
				ElmArgsR elm = ElmArgsR.create();
				elm.peg_no(up.wk_peg_no());
				elm.itm_cd(up.itm_cd());
				elm.itm_sub1(up.itm_sub1());
				elm.itm_sub2(up.itm_sub2());
				elm.itm_sub3(up.itm_sub3());
				elm.co_cd(getCo().co_cd());
				if(!isNull(up.gi_wg_cd())) {
					elm.wg_cd(up.gi_wg_cd());
				}
				else {
					MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpLocCache().get(up.itm_cd(),
							up.itm_sub1(), up.itm_sub2(), up.itm_sub3(),
							up.gi_lg_grp_cd());
					MAM_LG_GRP_R lgGrpR = giDefLocCache().get(up.gi_lg_grp_cd());
					elm.wg_cd(
							!itmLgGrpR.isEmpty() ? itmLgGrpR.getStringNE("def_loc_wg_cd")
									: !lgGrpR.isEmpty()
											? lgGrpR.getStringNE("def_loc_wg_cd")
											: null);
				}
				elm.trd_cd(up.trd_cd());
				elm.dt(nvl(up.gi_rqst_tm(), up.gr_rqst_tm()));
				elmArgs.add(elm);
			}
			setNum(MAC_NUM_BIZ_TYP.XFRSCHD, elmArgs);
			copyByPegNo(insL, elmArgs, XfrSchd_DtlR.$wk_peg_no, new String[] {
					XfrSchd_DtlR.$xfr_schd_no
			}, ElmArgsR.$peg_no, new String[] {
					ElmArgsR.$new_no
			});
			
			for(XfrSchd_DtlR up : insL) {
				if(isNull(up.io_schd_pr_no())) {
					 up.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
				}

				if (MSC_XFR_SRC_TYP.isINPT_RPL(up.xfr_src_typ())) {
					up.xfr_src_no(MAC_STR.NULL_VAL.value());
				}
				else if (MSC_XFR_SRC_TYP.isOP_RPL(up.xfr_src_typ())) {
					up.xfr_src_no(MAC_STR.NULL_VAL.value());
				}
				else if (MSC_XFR_SRC_TYP.isMNL(up.xfr_src_typ())) {
					up.xfr_src_no(up.xfr_schd_no());
				}
				else if (MSC_XFR_SRC_TYP.isSHIP_RPL(up.xfr_src_typ())) {
					up.xfr_src_no(MAC_STR.NULL_VAL.value());
				}
			}
		}

		protected Map_XfrPr_DtlR_XfrSchd_DtlR<XfrPr_DtlR,XfrSchd_DtlR> createMap_XfrPr_DtlR_XfrSchd_DtlR() {
			return new Map_XfrPr_DtlR_XfrSchd_DtlR<XfrPr_DtlR, XfrSchd_DtlR>();
		}

		public class Map_XfrPr_DtlR_XfrSchd_DtlR<D extends XfrPr_DtlR, S extends XfrSchd_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 場所引当フラグがオンの場合は引当手配ＮＯに手配ＮＯの値を引き継ぐ
				if(src.alloc_flg()) {
					if(!isNull(src.sno1())) {
						dest.alloc_sno1(src.sno1());
					}
					if(!isNull(src.sno2())) {
						dest.alloc_sno2(src.sno2());
					}
					if(!isNull(src.sno3())) {
						dest.alloc_sno3(src.sno3());
					}
					if(!isNull(src.sno4())) {
						dest.alloc_sno4(src.sno4());
					}
				}
				
				dest.xfr_schd_dt(nvl(src.gi_rqst_tm(), src.gr_rqst_tm()));
				dest.pr_sts_typ(MSC_PR_STS_TYP.NOT_INST.value());
					
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrPr_DtlR.$peg_no, XfrSchd_DtlR.$peg_no);
				addColumnPathMap(XfrPr_DtlR.$data_crud_typ, XfrSchd_DtlR.$data_crud_typ);
				addColumnPathMap(XfrPr_DtlR.$xfr_schd_no, XfrSchd_DtlR.$xfr_schd_no);
				addColumnPathMap(XfrPr_DtlR.$trd_cd, XfrSchd_DtlR.$trd_cd);
				addColumnPathMap(XfrPr_DtlR.$trd_ptn_typ, XfrSchd_DtlR.$trd_ptn_typ);
				addColumnPathMap(XfrPr_DtlR.$wg_cd, XfrSchd_DtlR.$gi_wg_cd);
				addColumnPathMap(XfrPr_DtlR.$lg_grp_cd, XfrSchd_DtlR.$gr_lg_grp_cd);
				addColumnPathMap(XfrPr_DtlR.$gi_loc_cd, XfrSchd_DtlR.$gi_loc_cd);
				addColumnPathMap(XfrPr_DtlR.$gi_str_ln_cd, XfrSchd_DtlR.$gi_str_ln_cd);
				addColumnPathMap(XfrPr_DtlR.$gi_stk_arrv_bp_cd, XfrSchd_DtlR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(XfrPr_DtlR.$gr_loc_cd, XfrSchd_DtlR.$gr_loc_cd);
				addColumnPathMap(XfrPr_DtlR.$gr_str_ln_cd, XfrSchd_DtlR.$gr_str_ln_cd);
				addColumnPathMap(XfrPr_DtlR.$gr_stk_arrv_bp_cd, XfrSchd_DtlR.$gr_stk_arrv_bp_cd);
				addColumnPathMap(XfrPr_DtlR.$lot_no, XfrSchd_DtlR.$lot_no);
				addColumnPathMap(XfrPr_DtlR.$sublot_no, XfrSchd_DtlR.$sublot_no);
				addColumnPathMap(XfrPr_DtlR.$sno1, XfrSchd_DtlR.$sno1);
				addColumnPathMap(XfrPr_DtlR.$sno1_null_flg, XfrSchd_DtlR.$sno1_null_flg);
				addColumnPathMap(XfrPr_DtlR.$sno2, XfrSchd_DtlR.$sno2);
				addColumnPathMap(XfrPr_DtlR.$sno2_null_flg, XfrSchd_DtlR.$sno2_null_flg);
				addColumnPathMap(XfrPr_DtlR.$sno3, XfrSchd_DtlR.$sno3);
				addColumnPathMap(XfrPr_DtlR.$sno3_null_flg, XfrSchd_DtlR.$sno3_null_flg);
				addColumnPathMap(XfrPr_DtlR.$sno4, XfrSchd_DtlR.$sno4);
				addColumnPathMap(XfrPr_DtlR.$sno4_null_flg, XfrSchd_DtlR.$sno4_null_flg);
				addColumnPathMap(XfrPr_DtlR.$ver_no, XfrSchd_DtlR.$ver_no);
				addColumnPathMap(XfrPr_DtlR.$gd_cd, XfrSchd_DtlR.$gd_cd);
				addColumnPathMap(XfrPr_DtlR.$quality_typ, XfrSchd_DtlR.$quality_typ);
				addColumnPathMap(XfrPr_DtlR.$stk_id_typ, XfrSchd_DtlR.$stk_id_typ);
				addColumnPathMap(XfrPr_DtlR.$stk_bp_cd, XfrSchd_DtlR.$stk_bp_cd);
				addColumnPathMap(XfrPr_DtlR.$trd_unit_cd, XfrSchd_DtlR.$trd_unit_cd);
				addColumnPathMap(XfrPr_DtlR.$trd_unit_qty, XfrSchd_DtlR.$trd_unit_qty);
				addColumnPathMap(XfrPr_DtlR.$base_unit_cd, XfrSchd_DtlR.$base_unit_cd);
				addColumnPathMap(XfrPr_DtlR.$base_unit_qty, XfrSchd_DtlR.$base_unit_qty);
				addColumnPathMap(XfrPr_DtlR.$ship_inst_typ, XfrSchd_DtlR.$ship_inst_typ);
				addColumnPathMap(XfrPr_DtlR.$rsn_cd, XfrSchd_DtlR.$rsn_cd);
				addColumnPathMap(XfrPr_DtlR.$bd_dpt_cd, XfrSchd_DtlR.$bd_dpt_cd);
				addColumnPathMap(XfrPr_DtlR.$alloc_flg, XfrSchd_DtlR.$alloc_flg);
				addColumnPathMap(XfrPr_DtlR.$not_lot_mix_flg, XfrSchd_DtlR.$not_lot_mix_flg);
				addColumnPathMap(XfrPr_DtlR.$not_sublot_mix_flg, XfrSchd_DtlR.$not_sublot_mix_flg);
				addColumnPathMap(XfrPr_DtlR.$vld_dt_fr, XfrSchd_DtlR.$vld_dt_fr);
				addColumnPathMap(XfrPr_DtlR.$vld_dt_to, XfrSchd_DtlR.$vld_dt_to);
				addColumnPathMap(XfrPr_DtlR.$io_schd_pr_no, XfrSchd_DtlR.$io_schd_pr_no);
				addColumnPathMap(XfrPr_DtlR.$sub_char1, XfrSchd_DtlR.$sub_char1);
				addColumnPathMap(XfrPr_DtlR.$sub_char2, XfrSchd_DtlR.$sub_char2);
				addColumnPathMap(XfrPr_DtlR.$sub_char3, XfrSchd_DtlR.$sub_char3);
				addColumnPathMap(XfrPr_DtlR.$itm_cd, XfrSchd_DtlR.$itm_cd);
				addColumnPathMap(XfrPr_DtlR.$itm_sub1, XfrSchd_DtlR.$itm_sub1);
				addColumnPathMap(XfrPr_DtlR.$itm_sub2, XfrSchd_DtlR.$itm_sub2);
				addColumnPathMap(XfrPr_DtlR.$itm_sub3, XfrSchd_DtlR.$itm_sub3);
				addColumnPathMap(XfrPr_DtlR.$prov_typ, XfrSchd_DtlR.$prov_typ);
				addColumnPathMap(XfrPr_DtlR.$prov_basis_typ, XfrSchd_DtlR.$prov_basis_typ);
				addColumnPathMap(XfrPr_DtlR.$xrate_inpt_flg, XfrSchd_DtlR.$xrate_inpt_flg);
				addColumnPathMap(XfrPr_DtlR.$xrate, XfrSchd_DtlR.$xrate);
				addColumnPathMap(XfrPr_DtlR.$ptax_xrate_inpt_flg, XfrSchd_DtlR.$ptax_xrate_inpt_flg);
				addColumnPathMap(XfrPr_DtlR.$ptax_xrate, XfrSchd_DtlR.$ptax_xrate);
				addColumnPathMap(XfrPr_DtlR.$trd_cur_cd, XfrSchd_DtlR.$trd_cur_cd);
				addColumnPathMap(XfrPr_DtlR.$tax_fix_flg, XfrSchd_DtlR.$tax_fix_flg);
				addColumnPathMap(XfrPr_DtlR.$tax_cd, XfrSchd_DtlR.$tax_cd);
				addColumnPathMap(XfrPr_DtlR.$trd_cur_upri, XfrSchd_DtlR.$trd_cur_upri);
				addColumnPathMap(XfrPr_DtlR.$trd_cur_amt, XfrSchd_DtlR.$trd_cur_amt);
				addColumnPathMap(XfrPr_DtlR.$trd_cur_tax_amt, XfrSchd_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(XfrPr_DtlR.$wtax_rate, XfrSchd_DtlR.$wtax_rate);
				addColumnPathMap(XfrPr_DtlR.$wtax_amt, XfrSchd_DtlR.$wtax_amt);
				addColumnPathMap(XfrPr_DtlR.$ret_prov_typ, XfrSchd_DtlR.$ret_prov_typ);
				addColumnPathMap(XfrPr_DtlR.$ret_prov_basis_typ, XfrSchd_DtlR.$ret_prov_basis_typ);
				addColumnPathMap(XfrPr_DtlR.$ret_xrate_inpt_flg, XfrSchd_DtlR.$ret_xrate_inpt_flg);
				addColumnPathMap(XfrPr_DtlR.$ret_xrate, XfrSchd_DtlR.$ret_xrate);
				addColumnPathMap(XfrPr_DtlR.$ret_ptax_xrate_inpt_flg, XfrSchd_DtlR.$ret_ptax_xrate_inpt_flg);
				addColumnPathMap(XfrPr_DtlR.$ret_ptax_xrate, XfrSchd_DtlR.$ret_ptax_xrate);
				addColumnPathMap(XfrPr_DtlR.$ret_trd_cur_cd, XfrSchd_DtlR.$ret_trd_cur_cd);
				addColumnPathMap(XfrPr_DtlR.$ret_tax_fix_flg, XfrSchd_DtlR.$ret_tax_fix_flg);
				addColumnPathMap(XfrPr_DtlR.$ret_tax_cd, XfrSchd_DtlR.$ret_tax_cd);
				addColumnPathMap(XfrPr_DtlR.$ret_trd_cur_upri, XfrSchd_DtlR.$ret_trd_cur_upri);
				addColumnPathMap(XfrPr_DtlR.$ret_trd_cur_amt, XfrSchd_DtlR.$ret_trd_cur_amt);
				addColumnPathMap(XfrPr_DtlR.$ret_trd_cur_tax_amt, XfrSchd_DtlR.$ret_trd_cur_tax_amt);
				addColumnPathMap(XfrPr_DtlR.$ret_wtax_rate, XfrSchd_DtlR.$ret_wtax_rate);
				addColumnPathMap(XfrPr_DtlR.$ret_wtax_amt, XfrSchd_DtlR.$ret_wtax_amt);
				addColumnPathMap(XfrPr_DtlR.$trd_d_rmrks, XfrSchd_DtlR.$trd_d_rmrks);
			}
		}

		protected Map_Alloc_RsltR_XfrSchd_DtlR<Alloc_RsltR,XfrSchd_DtlR> createMap_Alloc_RsltR_XfrSchd_DtlR() {
			return new Map_Alloc_RsltR_XfrSchd_DtlR<Alloc_RsltR, XfrSchd_DtlR>();
		}

		public class Map_Alloc_RsltR_XfrSchd_DtlR<D extends Alloc_RsltR, S extends XfrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.alloc_flg(true);
				
				MAM_ITM_R itmCacheR = itmCache().getEx(src.itm_cd(), src.itm_sub1(),
						src.itm_sub2(), src.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = itmUnitCache().getEx(src.itm_cd(),
						src.itm_sub1(), src.itm_sub2(), src.itm_sub3(),
						src.trd_unit_cd());
				if(itmCacheR.pack_alloc_flg() && itmUnitR.pack_flg()) {
					dest.pack_unit_cd(src.trd_unit_cd());
					dest.pack_unit_qty(src.trd_unit_qty());
				}

			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Alloc_RsltR.$peg_no, XfrSchd_DtlR.$peg_no);
				addColumnPathMap(Alloc_RsltR.$itm_cd, XfrSchd_DtlR.$itm_cd);
				addColumnPathMap(Alloc_RsltR.$itm_sub1, XfrSchd_DtlR.$itm_sub1);
				addColumnPathMap(Alloc_RsltR.$itm_sub2, XfrSchd_DtlR.$itm_sub2);
				addColumnPathMap(Alloc_RsltR.$itm_sub3, XfrSchd_DtlR.$itm_sub3);
				addColumnPathMap(Alloc_RsltR.$stk_loc_cd, XfrSchd_DtlR.$gi_loc_cd);
				addColumnPathMap(Alloc_RsltR.$stk_str_ln_cd, XfrSchd_DtlR.$gi_str_ln_cd);
				addColumnPathMap(Alloc_RsltR.$stk_lg_grp_cd, XfrSchd_DtlR.$gi_lg_grp_cd);
				addColumnPathMap(Alloc_RsltR.$quality_typ, XfrSchd_DtlR.$quality_typ);
				addColumnPathMap(Alloc_RsltR.$stk_id_typ, XfrSchd_DtlR.$stk_id_typ);
				addColumnPathMap(Alloc_RsltR.$stk_bp_cd, XfrSchd_DtlR.$stk_bp_cd);
				addColumnPathMap(Alloc_RsltR.$gd_cd, XfrSchd_DtlR.$gd_cd);
				addColumnPathMap(Alloc_RsltR.$lot_no, XfrSchd_DtlR.$lot_no);
				addColumnPathMap(Alloc_RsltR.$sublot_no, XfrSchd_DtlR.$sublot_no);
				addColumnPathMap(Alloc_RsltR.$ver_no, XfrSchd_DtlR.$ver_no);
				addColumnPathMap(Alloc_RsltR.$sno1, XfrSchd_DtlR.$sno1);
				addColumnPathMap(Alloc_RsltR.$sno2, XfrSchd_DtlR.$sno2);
				addColumnPathMap(Alloc_RsltR.$sno3, XfrSchd_DtlR.$sno3);
				addColumnPathMap(Alloc_RsltR.$sno4, XfrSchd_DtlR.$sno4);
				addColumnPathMap(Alloc_RsltR.$base_unit_cd, XfrSchd_DtlR.$base_unit_cd);
				addColumnPathMap(Alloc_RsltR.$base_unit_qty, XfrSchd_DtlR.$base_unit_qty);
				addColumnPathMap(Alloc_RsltR.$alloc_flg, XfrSchd_DtlR.$alloc_flg);
				addColumnPathMap(Alloc_RsltR.$vld_dt_fr, XfrSchd_DtlR.$vld_dt_fr);
				addColumnPathMap(Alloc_RsltR.$vld_dt_to, XfrSchd_DtlR.$vld_dt_to);
				addColumnPathMap(Alloc_RsltR.$stk_arrv_bp_cd, XfrSchd_DtlR.$gi_stk_arrv_bp_cd);
			}
		}

		protected Map_ShipPr_DtlR_XfrSchd_DtlR<ShipPr_DtlR,XfrSchd_DtlR> createMap_ShipPr_DtlR_XfrSchd_DtlR() {
			return new Map_ShipPr_DtlR_XfrSchd_DtlR<ShipPr_DtlR, XfrSchd_DtlR>();
		}

		public class Map_ShipPr_DtlR_XfrSchd_DtlR<D extends ShipPr_DtlR, S extends XfrSchd_DtlR> extends MCRowMapper<D,S> {
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				// 常に補完する定数
				dest.dlv_id_typ(MSC_SHIP_TO_ID_TYP.LOC.value());
				MAM_LOC_R grLocR = grLocCache().getEx(src.gr_loc_cd());
				dest.dlv_id_nm(grLocR.loc_nm());
				dest.alloc_typ(MAC_ALLOC_TYP.NON.value());
				
				// 条件によって補完する項目
				if(!MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					MSW_SHIP_SCHD_DT_CALC_R calcR = getShipDtCache().getFirstByPegNo(src.peg_no());
					if(!isNull(calcR)) {
						dest.ship_schd_tm(calcR.ship_schd_tm());
						dest.dlv_schd_tm(calcR.dlv_schd_tm());
					}
					else {
						dest.ship_schd_tm(src.ship_schd_tm());
						dest.dlv_schd_tm(src.dlv_schd_tm());
					}
					MAM_LOC_R grLocAddrR = getGrLocAddrCache().getFirst(src.gr_loc_cd(), src.dlv_schd_tm());
					dest.dlv_zip_cd(grLocAddrR.zip_cd());
					dest.dlv_addr1(grLocAddrR.addr1());
					dest.dlv_addr2(grLocAddrR.addr2());
					dest.dlv_addr3(grLocAddrR.addr3());
					dest.dlv_addr4(grLocAddrR.addr4());
					dest.dlv_tel(grLocAddrR.tel());
					dest.dlv_fax(grLocAddrR.fax());
					
					MAM_ITM_R itmR = itmCache().getEx(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3());
					dest.sundry_itm_flg(itmR.sundry_itm_flg());
					
					if (!src.ship_to_sundry_flg()) {
						// ファイル入力時の補完のため、名称のクリアはここで行う
						dest.ship_to_id_nm(null);
					}
				}
				if(!MAC_DATA_CRUD_TYP.isCRT(dest.data_crud_typ())) {
					dest.ship_pr_no(getXfrSchdCache().getFirst(src).getString("ship_pr_no"));
				}
				MAM_LG_GRP_R lgGrpR = lgGrpCache().getEx(src.gi_lg_grp_cd());
				if (!lgGrpR.isEmpty()) {
					dest.wg_cd(lgGrpR.wg_cd());
				}
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipPr_DtlR.$peg_no, XfrSchd_DtlR.$peg_no);
				addColumnPathMap(ShipPr_DtlR.$data_crud_typ, XfrSchd_DtlR.$data_crud_typ);
				addColumnPathMap(ShipPr_DtlR.$trd_cd, XfrSchd_DtlR.$trd_cd);
				addColumnPathMap(ShipPr_DtlR.$trd_ptn_typ, XfrSchd_DtlR.$trd_ptn_typ);
				addColumnPathMap(ShipPr_DtlR.$xfr_schd_no, XfrSchd_DtlR.$xfr_schd_no);
				addColumnPathMap(ShipPr_DtlR.$rqst_dpt_cd, XfrSchd_DtlR.$rqst_dpt_cd);
				addColumnPathMap(ShipPr_DtlR.$rqst_usr_cd, XfrSchd_DtlR.$rqst_usr_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_rqst_tm, XfrSchd_DtlR.$gi_rqst_tm);
				addColumnPathMap(ShipPr_DtlR.$dlv_rqst_tm, XfrSchd_DtlR.$gr_rqst_tm);
				addColumnPathMap(ShipPr_DtlR.$dlv_id_cd, XfrSchd_DtlR.$gr_loc_cd);
				addColumnPathMap(ShipPr_DtlR.$dlv_str_ln_cd, XfrSchd_DtlR.$gr_str_ln_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_to_id_typ, XfrSchd_DtlR.$ship_to_id_typ);
				addColumnPathMap(ShipPr_DtlR.$ship_to_id_cd, XfrSchd_DtlR.$ship_to_id_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_to_id_nm, XfrSchd_DtlR.$ship_to_id_nm);
				addColumnPathMap(ShipPr_DtlR.$ship_to_zip_cd, XfrSchd_DtlR.$ship_to_zip_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_to_addr1, XfrSchd_DtlR.$ship_to_addr1);
				addColumnPathMap(ShipPr_DtlR.$ship_to_addr2, XfrSchd_DtlR.$ship_to_addr2);
				addColumnPathMap(ShipPr_DtlR.$ship_to_addr3, XfrSchd_DtlR.$ship_to_addr3);
				addColumnPathMap(ShipPr_DtlR.$ship_to_addr4, XfrSchd_DtlR.$ship_to_addr4);
				addColumnPathMap(ShipPr_DtlR.$ship_to_tel, XfrSchd_DtlR.$ship_to_tel);
				addColumnPathMap(ShipPr_DtlR.$ship_to_fax, XfrSchd_DtlR.$ship_to_fax);
				addColumnPathMap(ShipPr_DtlR.$ship_to_cntct_dpt, XfrSchd_DtlR.$ship_to_cntct_dpt);
				addColumnPathMap(ShipPr_DtlR.$ship_to_cntct_psn, XfrSchd_DtlR.$ship_to_cntct_psn);
				addColumnPathMap(ShipPr_DtlR.$ship_to_sundry_flg, XfrSchd_DtlR.$ship_to_sundry_flg);
				addColumnPathMap(ShipPr_DtlR.$via_dlv_typ, XfrSchd_DtlR.$via_dlv_typ);
				addColumnPathMap(ShipPr_DtlR.$trd_unit_qty, XfrSchd_DtlR.$trd_unit_qty);
				addColumnPathMap(ShipPr_DtlR.$trd_unit_cd, XfrSchd_DtlR.$trd_unit_cd);
				addColumnPathMap(ShipPr_DtlR.$base_unit_qty, XfrSchd_DtlR.$base_unit_qty);
				addColumnPathMap(ShipPr_DtlR.$base_unit_cd, XfrSchd_DtlR.$base_unit_cd);
				addColumnPathMap(ShipPr_DtlR.$rsn_cd, XfrSchd_DtlR.$rsn_cd);
				addColumnPathMap(ShipPr_DtlR.$bd_dpt_cd, XfrSchd_DtlR.$bd_dpt_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_wk_cd, XfrSchdChk04_DtlR.$ship_wk_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_term_cd, XfrSchd_DtlR.$ship_term_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_inst_typ, XfrSchd_DtlR.$ship_inst_typ);
				addColumnPathMap(ShipPr_DtlR.$def_loc_cd, XfrSchd_DtlR.$gi_def_loc_cd);
				addColumnPathMap(ShipPr_DtlR.$loc_cd, XfrSchd_DtlR.$gi_loc_cd);
				addColumnPathMap(ShipPr_DtlR.$str_ln_cd, XfrSchd_DtlR.$gi_str_ln_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_cnt_rmrks, XfrSchd_DtlR.$ship_cnt_rmrks);
				addColumnPathMap(ShipPr_DtlR.$trd_d_rmrks, XfrSchd_DtlR.$trd_d_rmrks);
				addColumnPathMap(ShipPr_DtlR.$ship_lg_grp_cd, XfrSchd_DtlR.$gi_lg_grp_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_fr_lg_grp_cd, XfrSchd_DtlR.$gi_lg_grp_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_to_lg_grp_cd, XfrSchd_DtlR.$ship_to_lg_grp_cd);
				addColumnPathMap(ShipPr_DtlR.$itm_cd, XfrSchd_DtlR.$itm_cd);
				addColumnPathMap(ShipPr_DtlR.$itm_sub1, XfrSchd_DtlR.$itm_sub1);
				addColumnPathMap(ShipPr_DtlR.$itm_sub2, XfrSchd_DtlR.$itm_sub2);
				addColumnPathMap(ShipPr_DtlR.$itm_sub3, XfrSchd_DtlR.$itm_sub3);
				addColumnPathMap(ShipPr_DtlR.$sno1, XfrSchd_DtlR.$sno1);
				addColumnPathMap(ShipPr_DtlR.$sno1_null_flg, XfrSchd_DtlR.$sno1_null_flg);
				addColumnPathMap(ShipPr_DtlR.$sno2, XfrSchd_DtlR.$sno2);
				addColumnPathMap(ShipPr_DtlR.$sno2_null_flg, XfrSchd_DtlR.$sno2_null_flg);
				addColumnPathMap(ShipPr_DtlR.$sno3, XfrSchd_DtlR.$sno3);
				addColumnPathMap(ShipPr_DtlR.$sno3_null_flg, XfrSchd_DtlR.$sno3_null_flg);
				addColumnPathMap(ShipPr_DtlR.$sno4, XfrSchd_DtlR.$sno4);
				addColumnPathMap(ShipPr_DtlR.$sno4_null_flg, XfrSchd_DtlR.$sno4_null_flg);
				addColumnPathMap(ShipPr_DtlR.$lot_no, XfrSchd_DtlR.$lot_no);
				addColumnPathMap(ShipPr_DtlR.$sublot_no, XfrSchd_DtlR.$sublot_no);
				addColumnPathMap(ShipPr_DtlR.$ver_no, XfrSchd_DtlR.$ver_no);
				addColumnPathMap(ShipPr_DtlR.$stk_arrv_bp_cd, XfrSchd_DtlR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(ShipPr_DtlR.$gd_cd, XfrSchd_DtlR.$gd_cd);
				addColumnPathMap(ShipPr_DtlR.$quality_typ, XfrSchd_DtlR.$quality_typ);
				addColumnPathMap(ShipPr_DtlR.$stk_id_typ, XfrSchd_DtlR.$stk_id_typ);
				addColumnPathMap(ShipPr_DtlR.$stk_bp_cd, XfrSchd_DtlR.$stk_bp_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_block_flg, XfrSchd_DtlR.$ship_block_flg);
				addColumnPathMap(ShipPr_DtlR.$not_lot_mix_flg, XfrSchd_DtlR.$not_lot_mix_flg);
				addColumnPathMap(ShipPr_DtlR.$not_sublot_mix_flg, XfrSchd_DtlR.$not_sublot_mix_flg);
				addColumnPathMap(ShipPr_DtlR.$vld_dt_fr, XfrSchd_DtlR.$vld_dt_fr);
				addColumnPathMap(ShipPr_DtlR.$vld_dt_to, XfrSchd_DtlR.$vld_dt_to);
				addColumnPathMap(ShipPr_DtlR.$io_schd_pr_no, XfrSchd_DtlR.$io_schd_pr_no);
				addColumnPathMap(ShipPr_DtlR.$base_dlv_slip_no, XfrSchd_DtlR.$base_dlv_slip_no);
				addColumnPathMap(ShipPr_DtlR.$base_prov_act_no, XfrSchd_DtlR.$base_prov_act_no);
				addColumnPathMap(ShipPr_DtlR.$base_ac_dt, XfrSchd_DtlR.$base_ac_dt);
			}
		}
	}


	/**
	 * XfrSchd_Upd02オペレーション.<p>
	 *
	 * 移動引当状況にデータを登録する。移動引当状況のデータを更新・削除する。<br>
	 */
	public class XfrSchd_Upd02 extends MSBEL_XfrSchdService_MC_A.XfrSchd_Upd02 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up1().act_flg()) {
				actEditUp();
				actXfrAllocStsUpd();
				callIoSchdService(up0());
			}
			else if (up1().inst_flg()) {
				editUp(up0());
				editUpProv(up0());
				callProvSchdServiceUpd01(up0());
				completionGrStkArrv(up0());
				xfrAllocStsUpd(up0());
				callIoSchdService(up0());
				// 移動引当状況の不足および指図残数打切りのデータ補完
				remSchdAlloc();
			}
			else if (up1().schd_flg()) {
				initCache();
				MCList<XfrPr_DtlR> upL = editSchdUp(up0());
				editUp(upL);
				callProvSchdServiceUpd01(upL);
				completionGrStkArrv(upL);
				xfrAllocStsUpd(upL);
				callIoSchdService(upL);
			}
			else {
				initCache();
				editUp(up0());
				editUpProv(up0());
				callProvSchdServiceUpd01(up0());
				completionGrStkArrv(up0());
				xfrAllocStsUpd(up0());
				callIoSchdService(up0());
				doXfrSchdCache(up0());
				callOrdRegSrv(up0());
				callWgRqstSrv(up0());
			}

			setDown();
		}

		//////////////////////////////////////////////////////////////////
		// 実績固有処理ここから
		protected void actEditUp() {
			
			for(XfrPr_DtlR upR : up0()) {
				MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().getFirst(upR.xfr_alloc_sts_no()).clone();
				
				// 受払予定削除用項目
				upR.old_pr_sts_typ(allocR.pr_sts_typ());
				upR.old_trd_ptn_typ(allocR.trd_ptn_typ());
				
				// 更新対象項目
				allocR.pr_sts_typ(upR.pr_sts_typ());
				allocR.act_qty(upR.act_qty());
				allocR.abort_flg(upR.abort_flg());
				allocR.cmpl_flg(upR.abort_flg() || MSC_PR_STS_TYP.isCOMP(upR.pr_sts_typ()));
				
				upR.xas(allocR);
				
				upR.gi_def_loc_cd(upR.gi_loc_cd());
			}
			
			// 出庫デフォルト場所
			MCList<XfrPr_DtlR> defGiLocL = up0().subList(r->isNull(r.gi_loc_cd()));
			initItmLgGrpLocCache(defGiLocL);
			for(XfrPr_DtlR upR : defGiLocL) {
				MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpLocCache().get(upR.itm_cd(),
						upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(), upR.lg_grp_cd());
				MAM_LG_GRP_R lgGrpR = giDefLocCache().get(upR.lg_grp_cd());
				upR.gi_def_loc_cd(!itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd()
						: !lgGrpR.isEmpty() ? lgGrpR.getString("loc_cd") : null);
			}
			
		}
		
		protected void actXfrAllocStsUpd() {
			MCList<MST_XFR_ALLOC_STS_R> dbcUpdate = MCList.create(MST_XFR_ALLOC_STS_R.class);

			for (XfrPr_DtlR upR : up0()) {
				dbcUpdate.add(upR.xas());
			}

			MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder dbcUpdate_bldr = MCQueryApiBuilder.create(t);
			dbcUpdate_bldr.setSet(t.pr_sts_typ);
			dbcUpdate_bldr.addSet(t.act_qty);
			dbcUpdate_bldr.addSet(t.abort_flg);
			dbcUpdate_bldr.addSet(t.cmpl_flg);
			dbUpdateKey("MSBEL5200_MST_XFR_ALLOC_STS_U01", dbcUpdate, dbcUpdate_bldr);
			
		}

		// 実績固有処理ここまで
		//////////////////////////////////////////////////////////////////
		
		//////////////////////////////////////////////////////////////////
		// 指図固有処理ここから
		/**
		 * 移動引当状況の不足および指図残数打切りのデータ補完
		 */
		protected void remSchdAlloc() {
			if (up1().re_call_flg()) {
				return ;
			}
			
			// 移動指図登録時の移動引当状況データの保存
			insXfrAllocSv(up0());
			
			
			// 数量変更および残数打切に伴う移動引当状況の補完
			MCList<XfrPr_DtlR> remAbortInsL = MCList.create(XfrPr_DtlR.class);
			MCList<XfrPr_DtlR> remAllocNotBndlTgtL = MCList.create(XfrPr_DtlR.class);
			MCList<XfrPr_DtlR> remAllocBndlTgtL = MCList.create(XfrPr_DtlR.class);
			
			for (MCList<XfrPr_DtlR> grpL : up0().groupList(XfrPr_DtlR.$xfr_inst_d_no)) {
				XfrPr_DtlR baseR = grpL.get(0);
				if (!hasXfrSchd(baseR)) {
					// 移動移送予定に紐づく移動指図の場合のみ、移動引当状況の補完が必要な能性がある
					continue;
				}
				
				for(XfrPr_DtlR upR : grpL) {
					MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().getFirst(upR.xfr_alloc_sts_no());
					// 不足分のデータ補完
					if (upR.inst_bndl_flg()) {
						if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
							if(MSC_PR_STS_TYP.isINST(upR.old_pr_sts_typ())) {
								remAllocBndlTgtL.add(upR);
							}
						}
					}
					else {
						if (MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
							remAllocNotBndlTgtL.add(upR);
						}
						else if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
							if(MSC_PR_STS_TYP.isINST(upR.old_pr_sts_typ())) {
								remAllocNotBndlTgtL.add(upR);
							}
						}
						else if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
							// 指図済　⇒　指図済
							if (MSC_PR_STS_TYP.isINST(upR.pr_sts_typ())
									&& MSC_PR_STS_TYP.isINST(upR.old_pr_sts_typ())) {
								// 数量を減らした場合、その移動指図明細に紐づくデータとして補完をする
								if(upR.base_unit_qty().lt(allocR.base_unit_qty())) {
									XfrPr_DtlR tmpR = upR.clone();
									tmpR.base_unit_qty(allocR.base_unit_qty().subtract(upR.base_unit_qty()));
									remAllocNotBndlTgtL.add(tmpR);
								}
								// 数量を増やした場合、指図残数で追加したレコードの数量を減らす
								else if(upR.base_unit_qty().gt(allocR.base_unit_qty())) {
									XfrPr_DtlR tmpR = upR.clone();
									tmpR.base_unit_qty(0);
									remAllocNotBndlTgtL.add(tmpR);
								}
							}
							// 未指図　⇒　指図済
							else if (MSC_PR_STS_TYP.isINST(upR.pr_sts_typ())
									&& MSC_PR_STS_TYP.isNOT_INST(upR.old_pr_sts_typ())) {
								MCNumber remNum = MCNumber.ZERO;
								for (XfrPr_DtlR r : grpL) {
									if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
										remNum = remNum.add(r.base_unit_qty());
									}
								}
								// 指図残数あり
								if (remNum.lt(allocR.base_unit_qty())) {
									XfrPr_DtlR tmpR = upR.clone();
									tmpR.base_unit_qty(allocR.base_unit_qty().subtract(remNum));
									if (upR.inst_rem_abort_flg()) {
										tmpR.abort_flg(true);
										remAbortInsL.add(tmpR);
									}
									else {
										remAllocNotBndlTgtL.add(tmpR);
									}
								}
							}
						}
					}
					
				}
			}
			
			if (isNull(remAbortInsL) && isNull(remAllocNotBndlTgtL) && isNull(remAllocBndlTgtL)) {
				return ;
			}
			
			// 移動移送予定の取得
			MCList<XfrPr_DtlR> allSchdNoL = MCList.create(XfrPr_DtlR.class);
			allSchdNoL.addAll(remAbortInsL);
			allSchdNoL.addAll(remAllocNotBndlTgtL);
			
			// 移動指図時のまとめ元の移動引当状況（保存）の取得
			MCList<MST_XFR_ALLOC_STS_SV_R> bndlSvL = MCList.create(MST_XFR_ALLOC_STS_SV_R.class); // 指図前の保存対象
			MCList<XfrPr_DtlR> bndlInstDNoL = remAllocBndlTgtL.groupBy(XfrPr_DtlR.$xfr_inst_d_no);
			if (!isNull(bndlInstDNoL)) {
				MST_XFR_ALLOC_STS_SV_R bndlSvL_t = MST_XFR_ALLOC_STS_SV_R.create("T");
				MCQueryApiBuilder bndlSvL_bldr = MCQueryApiBuilder.create(bndlSvL_t);
				bndlSvL_bldr.removeSelect(removeSvSelectCols());
				bndlSvL_bldr.setWhere(bndlSvL_t.xfr_inst_d_no.eq(bind("xfr_inst_d_no"))
						.and(bndlSvL_t.inst_bndl_flg.eq(value(true))));
				dbSelect("MSBEL5200_MST_XFR_ALLOC_STS_SV_S01", bndlSvL, bndlSvL_bldr, bndlInstDNoL);
				
				for (MST_XFR_ALLOC_STS_SV_R r : bndlSvL) {
					XfrPr_DtlR tmpR = XfrPr_DtlR.create();
					tmpR.xfr_schd_no(r.xfr_schd_no());
					allSchdNoL.add(tmpR);
				}
			}
			allSchdNoL = allSchdNoL.groupBy(MST_XFR_ALLOC_STS_R.$xfr_schd_no);
			allSchdNoL.sort(MST_XFR_ALLOC_STS_R.$xfr_schd_no);
			MCList<MST_XFR_SCHD_R> schdL = getXfrSchdCache().subList(allSchdNoL);
			
			// 補完数量の算出
			MCList<MST_XFR_ALLOC_STS_SV_R> remAllSchdSvL = MCList.create(MST_XFR_ALLOC_STS_SV_R.class);
			if (!isNull(remAllocNotBndlTgtL) || !isNull(remAllocBndlTgtL)) {
				
				HashMap<String, MCNumber> remMap = new HashMap<>();
				for (MST_XFR_SCHD_R r : schdL) {
					remMap.put(r.xfr_schd_no(), r.base_unit_qty());
				}
				
				// 指図残数打切
				for (XfrPr_DtlR r : remAbortInsL) {
					// これから追加する分を減算する
					MCNumber remNum = remMap.get(r.xfr_schd_no());
					remMap.put(r.xfr_schd_no(), remNum.subtract(r.base_unit_qty()));
				}
				
				// 上り電文の移動指図明細（bndlInstDNoL）紐づき移動引当状況（まとめた）の取得：まとめ元の移動引当状況
				MCList<MST_XFR_ALLOC_STS_SV_R> remBndlSchdSvL = MCList.create(MST_XFR_ALLOC_STS_SV_R.class);
				if (!isNull(bndlInstDNoL)) {
					MCList<MST_XFR_ALLOC_STS_R> allocBndlL = MCList.create(MST_XFR_ALLOC_STS_R.class);
					MST_XFR_ALLOC_STS_R allocBndlL_t = MST_XFR_ALLOC_STS_R.create("T");
					MCQueryApiBuilder allocBndlL_bldr = MCQueryApiBuilder.create(allocBndlL_t);
					allocBndlL_bldr.setSelect(allocBndlL_t.xfr_inst_d_no);
					allocBndlL_bldr.setWhere(allocBndlL_t.xfr_inst_d_no.eq(bind("xfr_inst_d_no"))
							.and(allocBndlL_t.inst_bndl_flg.eq(value(true))));
					dbSelect("MSBEL5200_MST_XFR_ALLOC_STS_S01", allocBndlL, allocBndlL_bldr, bndlInstDNoL);
					
					MCIndexKey idxkey = allocBndlL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_inst_d_no);
					for (MST_XFR_ALLOC_STS_SV_R r : bndlSvL) {
						// 移動指図明細の取消に伴うまとめ元の移動引当状況の補完
						if (!allocBndlL.contains(idxkey, r.xfr_inst_d_no())) {
							remBndlSchdSvL.add(r);
						}
						// 指図済のまとめ元の減算
						else {
							MCNumber remNum = remMap.get(r.xfr_schd_no());
							remMap.put(r.xfr_schd_no(), remNum.subtract(r.base_unit_qty()));
						}
					}
				}
				
				// 上り電文の移動指図明細（bndlInstDNoL）紐づかない移動引当状況（まとめた）の取得：まとめ元の移動引当状況
				// まとめない場合の指図前データもここで取得する　＊　ＳＱＬ発行回数を減らすため
				MCList<MST_XFR_ALLOC_STS_SV_R> preInstSvL = MCList.create(MST_XFR_ALLOC_STS_SV_R.class);
				MST_XFR_ALLOC_STS_SV_R preInstSvL_t = MST_XFR_ALLOC_STS_SV_R.create("T");
				MCQueryApiBuilder preInstSvL_bldr = MCQueryApiBuilder.create(preInstSvL_t);
				preInstSvL_bldr.removeSelect(removeSvSelectCols());
				preInstSvL_bldr.setWhere(preInstSvL_t.xfr_schd_no.eq(bind("xfr_schd_no")));
				dbSelect("MSBEL5200_MST_XFR_ALLOC_STS_SV_S02", preInstSvL, preInstSvL_bldr, allSchdNoL);
				
				if (!isNull(bndlInstDNoL)) {
					MCIndexKey idxkeyInstDNo = bndlInstDNoL.createIndex(XfrPr_DtlR.$xfr_inst_d_no);
					for (MST_XFR_ALLOC_STS_SV_R r : preInstSvL) {
						// 指図済のまとめ元の減算
						if (r.inst_bndl_flg() && !bndlInstDNoL.contains(idxkeyInstDNo, r.xfr_inst_d_no())) {
							MCNumber remNum = remMap.get(r.xfr_schd_no());
							remMap.put(r.xfr_schd_no(), remNum.subtract(r.base_unit_qty()));
						}
					}
				}

				// 移動引当状況（まとめない）の取得
				MCList<XfrPr_DtlR> notBndlSchdNoL = MCList.create(XfrPr_DtlR.class);
				notBndlSchdNoL.addAll(remAllocNotBndlTgtL);
				notBndlSchdNoL.addAll(remAbortInsL);
				MCList<MST_XFR_ALLOC_STS_R> allocNotBndlL = MCList.create(MST_XFR_ALLOC_STS_R.class);
				if (!isNull(notBndlSchdNoL)) {
					MST_XFR_ALLOC_STS_R allocNotBndlL_t = MST_XFR_ALLOC_STS_R.create("T");
					MCQueryApiBuilder allocNotBndlL_bldr = MCQueryApiBuilder.create(allocNotBndlL_t);
					allocNotBndlL_bldr.setWhere(
							allocNotBndlL_t.xfr_schd_no.eq(bind("xfr_schd_no")));
					dbSelect("MSBEL5200_MST_XFR_ALLOC_STS_S02", allocNotBndlL, allocNotBndlL_bldr,
							notBndlSchdNoL.groupBy(XfrPr_DtlR.$xfr_schd_no));
					
					for (MST_XFR_ALLOC_STS_R r : allocNotBndlL) {
						MCNumber remNum = remMap.get(r.xfr_schd_no());
						remMap.put(r.xfr_schd_no(), remNum.subtract(r.base_unit_qty()));
					}
					
				}
				
				// 移動移送予定ＮＯごとに不足数量を案分し、補完レコードを作成する
				MCIndexKey idxkeyRemBndlSchdSvL = remBndlSchdSvL.createIndex(MST_XFR_ALLOC_STS_SV_R.$xfr_schd_no);
				MCIndexKey idxkeyRemAllocNotBndlTgtL = remAllocNotBndlTgtL.createIndex(XfrPr_DtlR.$xfr_schd_no);
				MCIndexKey idxkeyPreInstSvL = preInstSvL.createIndex(MST_XFR_ALLOC_STS_SV_R.$xfr_inst_d_no);
				MCIndexKey idxkeyAllocNotBndlL = allocNotBndlL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_schd_no);
				MCList<MST_XFR_ALLOC_STS_R> delAllocNotBndL = MCList.create(MST_XFR_ALLOC_STS_R.class);
				String[] grpKey = MCCollectionUtil.remove(MST_XFR_ALLOC_STS_SV_R.colnames(),
						new String[0], MST_XFR_ALLOC_STS_SV_R.$base_unit_qty,
						MST_XFR_ALLOC_STS_SV_R.$trd_unit_cd,
						MST_XFR_ALLOC_STS_SV_R.$trd_unit_qty,
						MST_XFR_ALLOC_STS_SV_R.$pr_sts_typ,
						MST_XFR_ALLOC_STS_SV_R.$xfr_alloc_sts_no,
						MST_XFR_ALLOC_STS_SV_R.$xfr_inst_d_no,
						MST_XFR_ALLOC_STS_SV_R.$inst_bndl_flg);
				grpKey = MCCollectionUtil.remove(grpKey, new String[0], removeSvSelectCols());
				for (XfrPr_DtlR schdNoR : allSchdNoL) {
					String xfrSchdNo = schdNoR.xfr_schd_no();
					MCNumber remNum = remMap.get(xfrSchdNo);
					MCList<MST_XFR_ALLOC_STS_SV_R> remSchdSvL = MCList.create(MST_XFR_ALLOC_STS_SV_R.class);
					// 優先１：移動指図明細まとめの取消
					for (MST_XFR_ALLOC_STS_SV_R r : remBndlSchdSvL.subList(idxkeyRemBndlSchdSvL, xfrSchdNo)) {
						if (!remNum.isPositive()) {
							break;
						}
						if (remNum.gt(r.base_unit_qty())) {
							remNum = remNum.subtract(r.base_unit_qty());
						}
						else {
							r.base_unit_qty(remNum);
							remNum = MCNumber.ZERO;
						}
						remSchdSvL.add(r);
					}
					// 優先２：移動指図明細まとめないの変更
					MCList<XfrPr_DtlR> tmpRemAllocNotBndlTgtL = remAllocNotBndlTgtL
							.subList(idxkeyRemAllocNotBndlTgtL, xfrSchdNo);
					tmpRemAllocNotBndlTgtL.sort(XfrPr_DtlR.$xfr_inst_d_no);
					for (XfrPr_DtlR r : tmpRemAllocNotBndlTgtL) {
						if (!remNum.isPositive()) {
							break;
						}
						MST_XFR_ALLOC_STS_SV_R svR = preInstSvL.getFirst(idxkeyPreInstSvL, r.xfr_inst_d_no());
						if (svR != null) {
							MST_XFR_ALLOC_STS_SV_R tmpR = svR.clone();
							if (remNum.gt(r.base_unit_qty())) {
								tmpR.base_unit_qty(r.base_unit_qty());
								remNum = remNum.subtract(r.base_unit_qty());
							}
							else {
								tmpR.base_unit_qty(remNum);
								remNum = MCNumber.ZERO;
							}
							remSchdSvL.add(tmpR);
						}
					}
					
					// 登録済の取消可能な移動引当状況のまとめ（DEL+ADD）
					MCList<MST_XFR_ALLOC_STS_R> deletableAllocNotBndL = allocNotBndlL
							.subList(idxkeyAllocNotBndlL, xfrSchdNo);
					deletableAllocNotBndL = deletableAllocNotBndL.subList(r->isDeletableAlloc(r));
					if (!isNull(deletableAllocNotBndL)) {
						deletableAllocNotBndL.sort(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
						// 移動移送予定の数量に対して、移動引当状況の数量が過剰になった場合、移動引当状況の数量を減少する
						if (remNum.isNegative()) {
							for (MST_XFR_ALLOC_STS_R r : deletableAllocNotBndL) {
								if (!remNum.isNegative()) {
									break;
								}
								delAllocNotBndL.add(r);
								if (r.base_unit_qty().add(remNum).isPositive()) {
									MST_XFR_ALLOC_STS_SV_R tmpR = MST_XFR_ALLOC_STS_SV_R.create();
									tmpR.setValuesByName(r);
									tmpR.base_unit_qty(r.base_unit_qty().add(remNum));
									remNum = MCNumber.ZERO;
									remSchdSvL.add(tmpR);
								}
								else {
									remNum = remNum.add(r.base_unit_qty());
								}
							}
						}
						// 追加対象の移動引当状況のレコードと同じ条件のものが登録済であれば、登録済の移動引当状況を削除してまとめる
						else if (!isNull(remSchdSvL)){
							for (MST_XFR_ALLOC_STS_R r : deletableAllocNotBndL) {
								MST_XFR_ALLOC_STS_SV_R tmpR = remSchdSvL.getFirst(grpKey, r.toArray(grpKey));
								if (tmpR != null) {
									delAllocNotBndL.add(r);
									tmpR.base_unit_qty(tmpR.base_unit_qty().add(r.base_unit_qty()));
								}
							}
						}
					}
					
					// 全く同じ補完データはまとめる
					MCGroupByPolicy gp = new MCGroupByPolicy();
					gp.addKey(grpKey);
					gp.sum(MST_XFR_ALLOC_STS_SV_R.$base_unit_qty);
					remSchdSvL = remSchdSvL.groupBy(gp);
					remAllSchdSvL.addAll(remSchdSvL);
				}
				
				// 上り電文以外の登録済の移動引当状況の削除、受払予定の削除、支給予定の削除
				if(!isNull(delAllocNotBndL)) {
					MCList<XfrPr_DtlR> delL = MCList.create(XfrPr_DtlR.class);
					for(MST_XFR_ALLOC_STS_R allocR : delAllocNotBndL) {
						XfrPr_DtlR prR = XfrPr_DtlR.create();
						prR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						prR.xas(allocR);
						prR.old_pr_sts_typ(allocR.pr_sts_typ());
						prR.old_trd_ptn_typ(allocR.trd_ptn_typ());
						delL.add(prR);
					}

					// 支給予定の削除
					callProvSchdServiceUpd01(delL);

					// 受払予定の削除
					delIoSchd(delL);

					// 移動引当状況の削除
					dbDeleteKey("MSBEL5200_MST_XFR_ALLOC_STS_D01", delAllocNotBndL,
							MCQueryApiBuilder.create(MST_XFR_ALLOC_STS_R.create("T")));
				}

			}
			
			
			// 移動引当状況の登録サービスの呼出
			MCList<XfrPr_DtlR> answerL = MCList.create(XfrPr_DtlR.class);
			answerL.addAll(remAbortInsL);
			for (MST_XFR_ALLOC_STS_SV_R r : remAllSchdSvL) {
				XfrPr_DtlR tmpR = XfrPr_DtlR.create();
				tmpR.xas().setValuesByName(r);
				answerL.add(tmpR);
			}
			
			MCIndexKey idxkeySchdL = schdL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);
			for (XfrPr_DtlR r : answerL) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				r.xfr_alloc_sts_no(null);
				r.xfr_inst_d_no(MAC_STR.NULL_VAL.value());
				r.inst_bndl_flg(false);
				r.pr_sts_typ(MSC_PR_STS_TYP.NOT_INST.value());
				r.wms_flg(false);
				
				// 移動引当状況にない項目を、移動移送予定から補完
				MST_XFR_SCHD_R schdR = schdL.getFirst(idxkeySchdL, r.xfr_schd_no());
				r.itm_cd(schdR.itm_cd());
				r.itm_sub1(schdR.itm_sub1());
				r.itm_sub2(schdR.itm_sub2());
				r.itm_sub3(schdR.itm_sub3());
				r.trd_unit_cd(schdR.trd_unit_cd());
				r.prov_typ(schdR.prov_typ());
				r.prov_basis_typ(schdR.prov_basis_typ());
				r.xrate_inpt_flg(schdR.xrate_inpt_flg());
				r.xrate(schdR.xrate());
				r.ptax_xrate_inpt_flg(schdR.ptax_xrate_inpt_flg());
				r.ptax_xrate(schdR.ptax_xrate());
				r.trd_cur_cd(schdR.trd_cur_cd());
				r.tax_fix_flg(schdR.tax_fix_flg());
				r.tax_cd(schdR.tax_cd());
				r.trd_cur_upri(schdR.trd_cur_upri());
				r.wtax_rate(schdR.wtax_rate());
				r.ret_prov_typ(schdR.ret_prov_typ());
				r.ret_prov_basis_typ(schdR.ret_prov_basis_typ());
				r.ret_xrate_inpt_flg(schdR.ret_xrate_inpt_flg());
				r.ret_xrate(schdR.ret_xrate());
				r.ret_ptax_xrate_inpt_flg(schdR.ret_ptax_xrate_inpt_flg());
				r.ret_ptax_xrate(schdR.ret_ptax_xrate());
				r.ret_trd_cur_cd(schdR.ret_trd_cur_cd());
				r.ret_tax_fix_flg(schdR.ret_tax_fix_flg());
				r.ret_tax_cd(schdR.ret_tax_cd());
				r.ret_trd_cur_upri(schdR.ret_trd_cur_upri());
				r.ret_wtax_rate(schdR.ret_wtax_rate());
				r.trd_d_rmrks(schdR.trd_d_rmrks());
			}
			// 取引単位への変換
			initItmUnitCache(answerL);
			for (XfrPr_DtlR r : answerL) {
				MCNumber trdUnitQty = null;
				MAVM_ITM_UNIT_R unitR = getItmTrdUnitR(r);
				if (!isNull(unitR)) {
					trdUnitQty = rvrsBaseUnitConv(r.base_unit_qty(),
							unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(),
							unitR.rnd_typ(), true);

				}
				if (isNull(trdUnitQty)) {
					r.trd_unit_cd(r.base_unit_cd());
					r.trd_unit_qty(r.base_unit_qty());
				}
				else {
					r.trd_unit_qty(trdUnitQty);
				}
			}

			callXfrSchd_ChkAndUpd02(answerL);
			
			// 移動引当状況に移動指図明細ＮＯが存在しない移動引当状況（保存）データの削除
			delXfrAllocSv(up0());
		}
		
		protected String[] removeSvSelectCols() {
			return new String[] {
					MST_XFR_ALLOC_STS_SV_R.$ins_func_id,
					MST_XFR_ALLOC_STS_SV_R.$ins_usr_id,
					MST_XFR_ALLOC_STS_SV_R.$ins_usr_nm, MST_XFR_ALLOC_STS_SV_R.$ins_ts,
					MST_XFR_ALLOC_STS_SV_R.$upd_func_id,
					MST_XFR_ALLOC_STS_SV_R.$upd_usr_id,
					MST_XFR_ALLOC_STS_SV_R.$upd_usr_nm, MST_XFR_ALLOC_STS_SV_R.$upd_ts,
					MST_XFR_ALLOC_STS_SV_R.$upd_cntr,
					MST_XFR_ALLOC_STS_SV_R.$upd_srv_req_no
			};
		}
		
		/**
		 * 移動移送予定に紐づく移動引当状況か否か
		 * @return true：予定に紐づく
		 */
		protected boolean hasXfrSchd(XfrPr_DtlR r) {
			return r.inst_bndl_flg() || !isNullOrNullVal(r.xfr_schd_no());
		}
		
		/**
		 * 取消可能な移動引当状況か否か：移動引当状況のまとめ時の判断
		 */
		protected boolean isDeletableAlloc(MST_XFR_ALLOC_STS_R r) {
			return !r.abort_flg() && !r.fix_flg()
					&& MSC_PR_STS_TYP.isNOT_INST(r.pr_sts_typ());
		}
		
		protected void callXfrSchd_ChkAndUpd02(MCList<XfrPr_DtlR> answerL) {
			callXfrSchd_Chk02(answerL);
			callXfrSchd_Upd02(answerL);
		}
		
		protected void callXfrSchd_Chk02(MCList<XfrPr_DtlR> complL) {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			MSBEL_XfrSchdService.XfrSchd_Chk02 op = MSBEL_XfrSchdService.crtXfrSchd_Chk02();
			addAll(op.up0(), complL, createMap_XfrSchdChk02_DtlR_XfrPr_DtlR());
			op.up1().inst_flg(true);
			op.up1().re_call_flg(true);
			op.exec();
			
			// エラー発生時は、例外をスローする
			if (op.down0().getFirst(XfrSchdChk02_DtlR.$err_flg, true) != null) {
				MCAppException ex = new MCAppException(msgUpdErr());
				ex.addCauseMessageList(MCMessagePool.getMessageList());
				MCMessagePool.clear();
				MCMessagePool.addAll(msgL);
				throw ex;
			}
			MCMessagePool.clear();
			MCMessagePool.addAll(msgL);
		}

		protected void callXfrSchd_Upd02(MCList<XfrPr_DtlR> complL) {
			MSBEL_XfrSchdService.XfrSchd_Upd02 op = MSBEL_XfrSchdService.crtXfrSchd_Upd02();
			op.up0().setAll(complL);
			op.up1().inst_flg(true);
			op.up1().re_call_flg(true);
			setPegNo(op.up0());
			op.exec();
		}

		/**
		 * 移動指図登録時の移動引当状況データの保存
		 */
		protected void insXfrAllocSv(MCList<XfrPr_DtlR> upL) {
			MCList<MST_XFR_ALLOC_STS_SV_R> svL = MCList.create(MST_XFR_ALLOC_STS_SV_R.class); // 指図前の保存対象

			for (XfrPr_DtlR upR : upL) {
				if (!hasXfrSchd(upR)) {
					continue;
				}
				// 未指図⇒指図済　：　指図前の移動引当状況を保存
				if (MSC_PR_STS_TYP.isNOT_INST(upR.old_pr_sts_typ())) {
					boolean isSvFlg = false;
					if (upR.inst_bndl_flg()) {
						if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
							isSvFlg = true;
						}
					}
					else {
						if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
							isSvFlg = true;
						}
					}
					if (isSvFlg) {
						MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().getFirst(upR.xfr_alloc_sts_no());
						MST_XFR_ALLOC_STS_SV_R tmpR = MST_XFR_ALLOC_STS_SV_R.create();
						tmpR.setValuesByName(allocR);
						tmpR.inst_bndl_flg(upR.inst_bndl_flg());
						tmpR.xfr_inst_d_no(upR.xfr_inst_d_no());
						svL.add(tmpR);
					}
				}
			}
			
			if (!isNull(svL)) {
				dbInsertEx("MSBEL5200_MST_XFR_ALLOC_STS_SV_I01", svL,
						MCQueryApiBuilder.create(MST_XFR_ALLOC_STS_SV_R.create("T")));
			}
		}
		
		/**
		 * 移動引当状況に移動指図明細ＮＯが存在しない移動引当状況（保存）データの削除
		 */
		protected void delXfrAllocSv(MCList<XfrPr_DtlR> upL) {
			MCList<MST_XFR_ALLOC_STS_SV_R> delSvL = MCList.create(MST_XFR_ALLOC_STS_SV_R.class); // 指図前の保存対象
			for (XfrPr_DtlR upR : upL) {
				if (!hasXfrSchd(upR)) {
					continue;
				}
				// 移動指図明細削除時
				if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					if(MSC_PR_STS_TYP.isINST(upR.old_pr_sts_typ())) {
						// 指図前の移動引当状況（保存）を削除する候補
						MST_XFR_ALLOC_STS_SV_R tmpR = MST_XFR_ALLOC_STS_SV_R.create();
						tmpR.xfr_inst_d_no(upR.xfr_inst_d_no());
						delSvL.add(tmpR);
					}
				}
			}
			
			if (!isNull(delSvL)) {
				MCList<MST_XFR_INST_D_R> delInstDNoL = MCList.create(MST_XFR_INST_D_R.class);	
				HashSet<String> delInstDNoSet = new HashSet<String>();
				for (MST_XFR_ALLOC_STS_SV_R r : delSvL) {
					if (!delInstDNoSet.contains(r.xfr_inst_d_no())) {
						delInstDNoSet.add(r.xfr_inst_d_no());
						MST_XFR_INST_D_R tmpR = MST_XFR_INST_D_R.create();
						tmpR.xfr_inst_d_no(r.xfr_inst_d_no());
						delInstDNoL.add(tmpR);
					}
				}
				
				MCQueryApiBuilder delInstDNoL_bldr = MCQueryApiBuilder.create(MST_XFR_INST_D_R.create("T"));
				dbWkDelete("MSBEL5200_MSW_XFR_INST_D_D01", delInstDNoL_bldr.getBaseDbc());
				dbWkInsert("MSBEL5200_MSW_XFR_INST_D_I01", delInstDNoL, delInstDNoL_bldr.getBaseDbc());
				execdel_MST_XFR_ALLOC_STS_SV_D01_sql();

				dbWkDelete("MSBEL5200_MSW_XFR_INST_D_D02", delInstDNoL_bldr.getBaseDbc());
			}
		}

		// 指図固有処理ここまで
		//////////////////////////////////////////////////////////////////		
		
		protected void initCache() {
			// Upd02固有のキャッシュ
			initItmUnitCache(up0());
		}

		/**
		 * 入庫在庫着荷先の補完を行う。
		 * 支給計上区分を補完後に行う必要がある。
		 */
		protected void completionGrStkArrv(MCList<XfrPr_DtlR> upL) {
			for(XfrPr_DtlR upR : upL) {
				if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					continue;
				}
				if(MAC_TRD_PTN_TYP.isPROV(upR.trd_ptn_typ())
						&& !MAC_PROV_BASIS_TYP.isINPT(upR.prov_basis_typ())) {
					upR.gr_stk_arrv_bp_cd(grLocCache().getEx(upR.gr_loc_cd()).sppl_cd());
				}
				else {
					upR.gr_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}

		/**
		 * 上り電文を編集する。
		 */
		protected void editUp(MCList<XfrPr_DtlR> upL) {
			editDeleteUp(upL.subList(r-> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
			editUpdateUp(upL.subList(r-> MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())));
			editInsertUp(upL.subList(r-> MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())));
			editUpCmmn(upL);
		}

		protected void editDeleteUp(MCList<XfrPr_DtlR> upL) {
			for(XfrPr_DtlR upR : upL) {
				MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().getFirst(upR.xfr_alloc_sts_no()).clone();
				
				// 上り電文の内容で補完する項目
				allocR.xfr_inst_d_no(upR.xfr_inst_d_no());
				allocR.inst_bndl_flg(upR.inst_bndl_flg());
				
				// 受払予定削除用項目
				upR.old_pr_sts_typ(allocR.pr_sts_typ());
				upR.old_trd_ptn_typ(allocR.trd_ptn_typ());
				
				upR.xas(allocR); 
			}
		}

		protected void editUpdateUp(MCList<XfrPr_DtlR> upL) {
			for(XfrPr_DtlR upR : upL) {
				MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().getFirst(upR.xfr_alloc_sts_no()).clone();

				// 受払予定削除用項目
				upR.old_pr_sts_typ(allocR.pr_sts_typ());
				upR.old_trd_ptn_typ(allocR.trd_ptn_typ());
				
				allocR.alloc_flg(upR.alloc_flg());
				allocR.abort_flg(upR.abort_flg());
				allocR.disp_seq(upR.disp_seq());
				allocR.wms_flg(upR.wms_flg());
				if (upR.abort_flg()
						|| MSC_PR_STS_TYP.isINST(allocR.pr_sts_typ()) && !up1().inst_flg()
						|| MSC_PR_STS_TYP.isPART_COMP(allocR.pr_sts_typ())
						|| MSC_PR_STS_TYP.isCOMP(allocR.pr_sts_typ())) {
					upR.xas(allocR);
				}
				else {
					editUpdateUpChk02AndUpd02(upR.xas(), allocR);
				}
				
			}
		}
		
		
		protected void editInsertUp(MCList<XfrPr_DtlR> upL) {
			doSeqCache(MSC_NUM_SYS_TYP.XFRALOCS, upL.size());
			
			for(XfrPr_DtlR upR : upL) {
				upR.xfr_alloc_sts_no(getStrSeq(MSC_NUM_SYS_TYP.XFRALOCS));
			}
		}

		protected void editUpCmmn(MCList<XfrPr_DtlR> upL) {
			int i = 0;
			for(XfrPr_DtlR upR : upL) {
				i++;
				upR.wk_peg_no(i);
				i++;
				upR.wk_ret_peg_no(i);
				
				if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					continue;
				}
				
				editUpChk02AndUpd02(upR);
			}
		}
		
		/**
		 * 支給予定情報のデータ補完／移動一覧と移動指図
		 */
		protected void editUpProv(MCList<XfrPr_DtlR> upL) {
			MCList<XfrPr_DtlR> subL = up0().subList(r-> isProvR(r));
			if (isNull(subL)) {
				return ;
			}
			
			MCList<XfrPr_DtlR> notSchdL = MCList.create(XfrPr_DtlR.class);
			for (XfrPr_DtlR r : subL) {
				// 移動指図時の計画外追加・まとめ
				if (isNullOrNullVal(r.xfr_schd_no())) {
					// マスタ値で補完
					notSchdL.add(r);
				}
				// 移動一覧、予定紐づきの指図
				else {
					MST_XFR_SCHD_R schdR = getXfrSchdCache().getFirst(r);
					if (schdR == null) {
						continue;
					}
					r.prov_typ(schdR.prov_typ());
					r.prov_basis_typ(schdR.prov_basis_typ());
					r.xrate(schdR.xrate());
					r.ptax_xrate(schdR.ptax_xrate());
					r.trd_cur_cd(schdR.trd_cur_cd());
					r.tax_cd(schdR.tax_cd());
					r.trd_cur_upri(schdR.trd_cur_upri());
					r.xrate_inpt_flg(schdR.xrate_inpt_flg());
					r.ptax_xrate_inpt_flg(schdR.ptax_xrate_inpt_flg());
					r.tax_fix_flg(schdR.tax_fix_flg());
					r.wtax_rate(schdR.wtax_rate());
					r.wtax_amt(schdR.wtax_amt());
					r.ret_prov_typ(schdR.ret_prov_typ());
					r.ret_prov_basis_typ(schdR.ret_prov_basis_typ());
					r.ret_xrate(schdR.ret_xrate());
					r.ret_ptax_xrate(schdR.ret_ptax_xrate());
					r.ret_trd_cur_cd(schdR.ret_trd_cur_cd());
					r.ret_tax_cd(schdR.ret_tax_cd());
					r.ret_trd_cur_upri(schdR.ret_trd_cur_upri());
					r.ret_xrate_inpt_flg(schdR.ret_xrate_inpt_flg());
					r.ret_ptax_xrate_inpt_flg(schdR.ret_ptax_xrate_inpt_flg());
					r.ret_tax_fix_flg(schdR.ret_tax_fix_flg());
					r.ret_wtax_rate(schdR.ret_wtax_rate());
					r.ret_wtax_amt(schdR.ret_wtax_amt());
				}
			}
			
			MCList<XfrPr_DtlR> updInsL = notSchdL.subList(r->!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (isNull(updInsL)) {
				return ;
			}
			MCList<MST_XFR_SCHD_R> provL = MCList.create(MST_XFR_SCHD_R.class);
			for (XfrPr_DtlR r : updInsL) {
				MST_XFR_SCHD_R xs = r.xs();
				xs.itm_cd(r.itm_cd());
				xs.itm_sub1(r.itm_sub1());
				xs.itm_sub2(r.itm_sub2());
				xs.itm_sub3(r.itm_sub3());
				xs.prov_typ(r.prov_typ());
				xs.prov_basis_typ(r.prov_basis_typ());
				xs.ret_prov_typ(r.ret_prov_typ());
				xs.ret_prov_basis_typ(r.ret_prov_basis_typ());
				xs.gr_rqst_tm(r.xfr_schd_dt());
				xs.stk_id_typ(r.stk_id_typ());
				xs.gi_stk_arrv_bp_cd(r.gi_stk_arrv_bp_cd());
				xs.base_unit_qty(r.base_unit_qty());
				provL.add(xs);
			}
			
			callProvSchdServiceSprt01(provL, false,false);
		}
		
		protected MCList<XfrPr_DtlR> editSchdUp(MCList<XfrPr_DtlR> upL) {
			MCList<XfrPr_DtlR> editL = MCList.create(XfrPr_DtlR.class);
			
			for (XfrPr_DtlR r : upL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MCList<MST_XFR_ALLOC_STS_R> subL = getXfrAllocCache().subListAlloc(r.xfr_schd_no());
					for (MST_XFR_ALLOC_STS_R subR : subL) {
						XfrPr_DtlR tmpR = r.clone();
						tmpR.xas(subR);
						editL.add(tmpR);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					MCList<MST_XFR_ALLOC_STS_R> subL = getXfrAllocCache().subListAlloc(r.xfr_schd_no());
					for (MST_XFR_ALLOC_STS_R subR : subL) {
						XfrPr_DtlR tmpR = r.clone();
						tmpR.xas(subR);
						tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						editL.add(tmpR);
					}
					XfrPr_DtlR tmpR = r.clone();
					tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					editL.add(tmpR);
				}
				else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					editL.add(r);
				}
			}
			
			return editL;
		}
		
		/**
		 * 支給予定を登録する。
		 */
		protected void callProvSchdServiceUpd01(MCList<XfrPr_DtlR> upL) {
			MCList<XfrPr_DtlR> subL = upL.subList(r->isProvR(r));
			if(subL.isEmpty()) {
				return;
			}
			
			MCList<XfrPr_DtlR> provL = MCList.create(XfrPr_DtlR.class);
			MCList<XfrPr_DtlR> retProvL = MCList.create(XfrPr_DtlR.class);
			
			for(XfrPr_DtlR r : subL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					if (!isNull(r.prov_typ())) {
						provL.add(r);
					}
					if (!isNull(r.ret_prov_typ())) {
						retProvL.add(r);
					}
				}
				else {
					
					MAM_LOC_R grLoc = grLocCache().getEx(r.gr_loc_cd());
					MAM_LOC_R giLoc = giLocCache().getEx(r.gi_def_loc_cd());
					
					if(isProv(giLoc.sppl_cd(), grLoc.sppl_cd())) {
						provL.add(r);
						if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							XfrPr_DtlR tmpR = r.clone();
							tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							retProvL.add(tmpR);
						}
					}
					else if(isProvRtn(giLoc.sppl_cd(), grLoc.sppl_cd())) {
						retProvL.add(r);
					}
					else if(isProvDD(giLoc.sppl_cd(), grLoc.sppl_cd())) {
						provL.add(r);
						XfrPr_DtlR tmpR = r.clone();
						tmpR.trd_cd(null);	// 返品の取引CDは支給予定SV内で取得する
						retProvL.add(tmpR);
					}
					else {
						if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
							XfrPr_DtlR tmpR = r.clone();
							tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							provL.add(tmpR);
							retProvL.add(tmpR);
						}
					}
				}
			}
			
			if (isNull(provL) && isNull(retProvL)) {
				return ;
			}
			
			MSBEL_ProvSchdService.ProvSchd_Upd01 ope = MSBEL_ProvSchdService.crtProvSchd_Upd01();
			addAll(ope.up0(), provL, createMap_ProvSchd_DtlR_XfrPr_DtlR());
			addAll(ope.up0(), retProvL, createMap_RetProvSchd_DtlR_XfrPr_DtlR());
			ope.exec();
			copyProv(subL, ope.down0());
			copyRetProv(subL, ope.down0());
			
		}

		protected void copyProv(MCList<XfrPr_DtlR> subL, MCList<ProvSchd_DtlR> downL) {
			String[] destCols = new String[] {
					XfrPr_DtlR.$prov_schd_no
			};
			String[] srcCols = new String [] {
					ProvSchd_DtlR.$prov_schd_no
			};
			copyByPegNo(subL, downL, XfrSchd_DtlR.$wk_peg_no, destCols, ProvSchd_DtlR.$peg_no, srcCols);
		}

		protected void copyRetProv(MCList<XfrPr_DtlR> subL, MCList<ProvSchd_DtlR> downL) {
			String[] destCols = new String[] {
					XfrPr_DtlR.$ret_prov_schd_no
			};
			String[] srcCols = new String [] {
					ProvSchd_DtlR.$prov_schd_no
			};
			copyByPegNo(subL, downL, XfrPr_DtlR.$wk_ret_peg_no, destCols, ProvSchd_DtlR.$peg_no, srcCols);
		}

		protected Map_ProvSchd_DtlR_XfrPr_DtlR<ProvSchd_DtlR,XfrPr_DtlR> createMap_ProvSchd_DtlR_XfrPr_DtlR() {
			return new Map_ProvSchd_DtlR_XfrPr_DtlR<ProvSchd_DtlR, XfrPr_DtlR>();
		}

		public class Map_ProvSchd_DtlR_XfrPr_DtlR<D extends ProvSchd_DtlR, S extends XfrPr_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.XFR.value());
				dest.prov_src_schd_no2(MAC_STR.NULL_VAL.value());
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());
				if (!MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
					dest.prsppl_cd(grLocCache().getEx(src.gr_loc_cd()).sppl_cd());
				}
				if (!isNull(src.xfr_schd_no())) {
					dest.not_completion_flg(true);
				}
				if (up1().inst_flg()) {
					if (!src.tax_fix_flg()) {
						dest.tax_cd(null);
					}
					if (!src.xrate_inpt_flg()) {
						dest.xrate(null);
					}
					if (!src.ptax_xrate_inpt_flg()) {
						dest.ptax_xrate(null);
					}
				}
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvSchd_DtlR.$peg_no, XfrPr_DtlR.$wk_peg_no);
				addColumnPathMap(ProvSchd_DtlR.$data_crud_typ, XfrPr_DtlR.$data_crud_typ);
				addColumnPathMap(ProvSchd_DtlR.$prov_src_schd_no1, XfrPr_DtlR.$xfr_alloc_sts_no);
				addColumnPathMap(ProvSchd_DtlR.$trd_cd, XfrPr_DtlR.$trd_cd);
				addColumnPathMap(ProvSchd_DtlR.$xfr_rsn_cd, XfrPr_DtlR.$rsn_cd);
				addColumnPathMap(ProvSchd_DtlR.$base_unit_cd, XfrPr_DtlR.$base_unit_cd);
				addColumnPathMap(ProvSchd_DtlR.$base_unit_qty, XfrPr_DtlR.$base_unit_qty);
				addColumnPathMap(ProvSchd_DtlR.$accpt_schd_dt, XfrPr_DtlR.$xfr_schd_dt);
				addColumnPathMap(ProvSchd_DtlR.$wg_cd, XfrPr_DtlR.$wg_cd);
				addColumnPathMap(ProvSchd_DtlR.$prov_typ, XfrPr_DtlR.$prov_typ);
				addColumnPathMap(ProvSchd_DtlR.$prov_basis_typ, XfrPr_DtlR.$prov_basis_typ);
				addColumnPathMap(ProvSchd_DtlR.$xrate_inpt_flg, XfrPr_DtlR.$xrate_inpt_flg);
				addColumnPathMap(ProvSchd_DtlR.$xrate, XfrPr_DtlR.$xrate);
				addColumnPathMap(ProvSchd_DtlR.$ptax_xrate_inpt_flg, XfrPr_DtlR.$ptax_xrate_inpt_flg);
				addColumnPathMap(ProvSchd_DtlR.$ptax_xrate, XfrPr_DtlR.$ptax_xrate);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_cd, XfrPr_DtlR.$trd_cur_cd);
				addColumnPathMap(ProvSchd_DtlR.$tax_fix_flg, XfrPr_DtlR.$tax_fix_flg);
				addColumnPathMap(ProvSchd_DtlR.$tax_cd, XfrPr_DtlR.$tax_cd);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_upri, XfrPr_DtlR.$trd_cur_upri);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_amt, XfrPr_DtlR.$trd_cur_amt);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_tax_amt, XfrPr_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(ProvSchd_DtlR.$wtax_rate, XfrPr_DtlR.$wtax_rate);
				addColumnPathMap(ProvSchd_DtlR.$wtax_amt, XfrPr_DtlR.$wtax_amt);
				addColumnPathMap(ProvSchd_DtlR.$sub_char1, XfrPr_DtlR.$sub_char1);
				addColumnPathMap(ProvSchd_DtlR.$sub_char2, XfrPr_DtlR.$sub_char2);
				addColumnPathMap(ProvSchd_DtlR.$sub_char3, XfrPr_DtlR.$sub_char3);
				addColumnPathMap(ProvSchd_DtlR.$itm_cd, XfrPr_DtlR.$itm_cd);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub1, XfrPr_DtlR.$itm_sub1);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub2, XfrPr_DtlR.$itm_sub2);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub3, XfrPr_DtlR.$itm_sub3);
				addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, XfrPr_DtlR.$stk_id_typ);
				addColumnPathMap(ProvSchd_DtlR.$stk_arrv_bp_cd, XfrPr_DtlR.$gi_stk_arrv_bp_cd);
			}
		}

		protected Map_RetProvSchd_DtlR_XfrPr_DtlR<ProvSchd_DtlR,XfrPr_DtlR> createMap_RetProvSchd_DtlR_XfrPr_DtlR() {
			return new Map_RetProvSchd_DtlR_XfrPr_DtlR<ProvSchd_DtlR, XfrPr_DtlR>();
		}

		public class Map_RetProvSchd_DtlR_XfrPr_DtlR<D extends ProvSchd_DtlR, S extends XfrPr_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.XFR.value());
				dest.prov_src_schd_no2(MAC_STR.NULL_VAL.value());
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());
				if (!MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
					dest.prsppl_cd(giLocCache().getEx(src.gi_def_loc_cd()).sppl_cd());
				}
				if (!isNull(src.xfr_schd_no())) {
					dest.not_completion_flg(true);
				}
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvSchd_DtlR.$peg_no, XfrPr_DtlR.$wk_ret_peg_no);
				addColumnPathMap(ProvSchd_DtlR.$data_crud_typ, XfrPr_DtlR.$data_crud_typ);
				addColumnPathMap(ProvSchd_DtlR.$prov_src_schd_no1, XfrPr_DtlR.$xfr_alloc_sts_no);
				addColumnPathMap(ProvSchd_DtlR.$trd_cd, XfrPr_DtlR.$trd_cd);
				addColumnPathMap(ProvSchd_DtlR.$xfr_rsn_cd, XfrPr_DtlR.$rsn_cd);
				addColumnPathMap(ProvSchd_DtlR.$base_unit_cd, XfrPr_DtlR.$base_unit_cd);
				addColumnPathMap(ProvSchd_DtlR.$base_unit_qty, XfrPr_DtlR.$base_unit_qty);
				addColumnPathMap(ProvSchd_DtlR.$accpt_schd_dt, XfrPr_DtlR.$xfr_schd_dt);
				addColumnPathMap(ProvSchd_DtlR.$wg_cd, XfrPr_DtlR.$wg_cd);
				addColumnPathMap(ProvSchd_DtlR.$prov_typ, XfrPr_DtlR.$ret_prov_typ);
				addColumnPathMap(ProvSchd_DtlR.$prov_basis_typ, XfrPr_DtlR.$ret_prov_basis_typ);
				addColumnPathMap(ProvSchd_DtlR.$xrate_inpt_flg, XfrPr_DtlR.$ret_xrate_inpt_flg);
				addColumnPathMap(ProvSchd_DtlR.$xrate, XfrPr_DtlR.$ret_xrate);
				addColumnPathMap(ProvSchd_DtlR.$ptax_xrate_inpt_flg, XfrPr_DtlR.$ret_ptax_xrate_inpt_flg);
				addColumnPathMap(ProvSchd_DtlR.$ptax_xrate, XfrPr_DtlR.$ret_ptax_xrate);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_cd, XfrPr_DtlR.$ret_trd_cur_cd);
				addColumnPathMap(ProvSchd_DtlR.$tax_fix_flg, XfrPr_DtlR.$ret_tax_fix_flg);
				addColumnPathMap(ProvSchd_DtlR.$tax_cd, XfrPr_DtlR.$ret_tax_cd);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_upri, XfrPr_DtlR.$ret_trd_cur_upri);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_amt, XfrPr_DtlR.$ret_trd_cur_amt);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_tax_amt, XfrPr_DtlR.$ret_trd_cur_tax_amt);
				addColumnPathMap(ProvSchd_DtlR.$wtax_rate, XfrPr_DtlR.$ret_wtax_rate);
				addColumnPathMap(ProvSchd_DtlR.$wtax_amt, XfrPr_DtlR.$ret_wtax_amt);
				addColumnPathMap(ProvSchd_DtlR.$sub_char1, XfrPr_DtlR.$sub_char1);
				addColumnPathMap(ProvSchd_DtlR.$sub_char2, XfrPr_DtlR.$sub_char2);
				addColumnPathMap(ProvSchd_DtlR.$sub_char3, XfrPr_DtlR.$sub_char3);
				addColumnPathMap(ProvSchd_DtlR.$itm_cd, XfrPr_DtlR.$itm_cd);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub1, XfrPr_DtlR.$itm_sub1);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub2, XfrPr_DtlR.$itm_sub2);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub3, XfrPr_DtlR.$itm_sub3);
				addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, XfrPr_DtlR.$stk_id_typ);
				addColumnPathMap(ProvSchd_DtlR.$stk_arrv_bp_cd, XfrPr_DtlR.$gi_stk_arrv_bp_cd);
			}
		}

		/**
		 *  受払予定を削除して作り直す。
		 */
		protected void callIoSchdService(MCList<XfrPr_DtlR> upL) {
			if(isNull(upL)) {
				return;
			}
			
			delIoSchd(upL);
			insIoSchd(upL);
		}

		protected void delIoSchd(MCList<XfrPr_DtlR> upL) {
			MCList<MSW_IO_SCHD_DEL_R> delL = MCList.create(MSW_IO_SCHD_DEL_R.class);
			for(XfrPr_DtlR upR : upL) {
				if (!MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
					MSW_IO_SCHD_DEL_R r = MSW_IO_SCHD_DEL_R.create();
					r.io_schd_typ(getIoSchdTypForMove(upR.old_trd_ptn_typ()));
					r.io_schd_sts_typ(getIoSchdStsTyp(upR.old_pr_sts_typ(), upR.xfr_inst_d_no()));
					r.io_schd_no(upR.xfr_alloc_sts_no());
					delL.add(r);
				}
			}
			if (isNull(delL)) {
				return ;
			}
			MSBEL_IoSchdService.IoSchd_Del01 op = MSBEL_IoSchdService.crtIoSchd_Del01();
			op.up0().setAll(delL);
			op.exec();
		}
		
		protected String getIoSchdStsTyp(String prStsTyp, String xfrInstDNo) {
			if (MSC_PR_STS_TYP.isNOT_INST(prStsTyp)) {
				return MSC_IO_SCHD_STS_TYP.SCHD.value();
			}
			else if (MSC_PR_STS_TYP.isINST(prStsTyp)) {
				return MSC_IO_SCHD_STS_TYP.ORD.value();
			}
			else if (MSC_PR_STS_TYP.isPART_COMP(prStsTyp)) {
				if (isNull(xfrInstDNo)) {
					// 移動指図なし（移動指図スキップの場合）
					return MSC_IO_SCHD_STS_TYP.SCHD.value();
				}
				else {
					// 移動指図あり
					return MSC_IO_SCHD_STS_TYP.ORD.value();
				}
			}
			return null;
		}

		protected void insIoSchd(MCList<XfrPr_DtlR> upL) {
			MCList<XfrPr_DtlR> insL = upL.subList(r -> isInsIoSchd(r));
			if (isNull(insL)) {
				return ;
			}
			
			MSBEL_IoSchdService.IoSchd_Ins01 ope = MSBEL_IoSchdService.crtIoSchd_Ins01();
			addAll(ope.up0(), insL, createMap_IoSchd_Ins01_DtlR_XfrPr_DtlR());
			ope.exec();
		}
		
		protected boolean isInsIoSchd(XfrPr_DtlR r) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				return false;
			}
			if (r.cmpl_flg()) {
				return false;
			}
			if (r.abort_flg()) {
				return false;
			}
			if (r.base_unit_qty().lte(r.act_qty())) {
				return false;
			}
			return true;
		}

		protected void xfrAllocStsUpd(MCList<XfrPr_DtlR> upL) {
			MCList<MST_XFR_ALLOC_STS_R> dbcInsert = MCList.create(MST_XFR_ALLOC_STS_R.class);
			MCList<MST_XFR_ALLOC_STS_R> dbcUpdate = MCList.create(MST_XFR_ALLOC_STS_R.class);
			MCList<MST_XFR_ALLOC_STS_R> dbcDelete = MCList.create(MST_XFR_ALLOC_STS_R.class);
			
			for(XfrPr_DtlR up : upL) {
				if (MAC_DATA_CRUD_TYP.isCRT(up.data_crud_typ())) {
					dbcInsert.add(up.xas());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(up.data_crud_typ())) {
					dbcUpdate.add(up.xas());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(up.data_crud_typ())) {
					dbcDelete.add(up.xas());
				}
			}
			
			dbDeleteKey("MSBEL5200_MST_XFR_ALLOC_STS_D02", dbcDelete,
					MCQueryApiBuilder.create(MST_XFR_ALLOC_STS_R.create("T")));
			MCQueryApiBuilder dbcUpdate_bldr = MCQueryApiBuilder.create(MST_XFR_ALLOC_STS_R.create("T"));
			setSet(dbcUpdate, dbcUpdate_bldr);
			dbUpdateKey("MSBEL5200_MST_XFR_ALLOC_STS_U02", dbcUpdate, dbcUpdate_bldr);
			dbInsertEx("MSBEL5200_MST_XFR_ALLOC_STS_I01", dbcInsert,
					MCQueryApiBuilder.create(MST_XFR_ALLOC_STS_R.create("T")));
		}

		protected void setSet(MCList<MST_XFR_ALLOC_STS_R> updL, MCQueryApiBuilder updL_bldr) {
			updL_bldr.removeSet(getXfrAllocRemoveSetCols());
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_XfrSchdChk02_DtlR_XfrPr_DtlR<XfrSchdChk02_DtlR,XfrPr_DtlR> createMap_XfrSchdChk02_DtlR_XfrPr_DtlR() {
			return new Map_XfrSchdChk02_DtlR_XfrPr_DtlR<XfrSchdChk02_DtlR, XfrPr_DtlR>();
		}

		public class Map_XfrSchdChk02_DtlR_XfrPr_DtlR<D extends XfrSchdChk02_DtlR, S extends XfrPr_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk02_DtlR.$peg_no, XfrPr_DtlR.$peg_no);
				addColumnPathMap(XfrSchdChk02_DtlR.$data_crud_typ, XfrPr_DtlR.$data_crud_typ);
				addColumnPathMap(XfrSchdChk02_DtlR.$xas, XfrPr_DtlR.$xas);
				addColumnPathMap(XfrSchdChk02_DtlR.$prov_typ, XfrPr_DtlR.$prov_typ);
				addColumnPathMap(XfrSchdChk02_DtlR.$prov_basis_typ, XfrPr_DtlR.$prov_basis_typ);
				addColumnPathMap(XfrSchdChk02_DtlR.$xrate, XfrPr_DtlR.$xrate);
				addColumnPathMap(XfrSchdChk02_DtlR.$ptax_xrate, XfrPr_DtlR.$ptax_xrate);
				addColumnPathMap(XfrSchdChk02_DtlR.$trd_cur_cd, XfrPr_DtlR.$trd_cur_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$tax_cd, XfrPr_DtlR.$tax_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$trd_cur_upri, XfrPr_DtlR.$trd_cur_upri);
				addColumnPathMap(XfrSchdChk02_DtlR.$ret_prov_typ, XfrPr_DtlR.$ret_prov_typ);
				addColumnPathMap(XfrSchdChk02_DtlR.$ret_prov_basis_typ, XfrPr_DtlR.$ret_prov_basis_typ);
				addColumnPathMap(XfrSchdChk02_DtlR.$ret_xrate, XfrPr_DtlR.$ret_xrate);
				addColumnPathMap(XfrSchdChk02_DtlR.$ret_ptax_xrate, XfrPr_DtlR.$ret_ptax_xrate);
				addColumnPathMap(XfrSchdChk02_DtlR.$ret_trd_cur_cd, XfrPr_DtlR.$ret_trd_cur_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$ret_tax_cd, XfrPr_DtlR.$ret_tax_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$ret_trd_cur_upri, XfrPr_DtlR.$ret_trd_cur_upri);
				addColumnPathMap(XfrSchdChk02_DtlR.$itm_cd, XfrPr_DtlR.$itm_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub1, XfrPr_DtlR.$itm_sub1);
				addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub2, XfrPr_DtlR.$itm_sub2);
				addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub3, XfrPr_DtlR.$itm_sub3);
			}
		}

		protected Map_IoSchd_Ins01_DtlR_XfrPr_DtlR<IoSchd_Ins01_DtlR,XfrPr_DtlR> createMap_IoSchd_Ins01_DtlR_XfrPr_DtlR() {
			return new Map_IoSchd_Ins01_DtlR_XfrPr_DtlR<IoSchd_Ins01_DtlR, XfrPr_DtlR>();
		}

		public class Map_IoSchd_Ins01_DtlR_XfrPr_DtlR<D extends IoSchd_Ins01_DtlR, S extends XfrPr_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.io_schd_typ(getIoSchdTypForMove(src.trd_ptn_typ()));
				dest.io_schd_sts_typ(getIoSchdStsTyp(src.pr_sts_typ(), src.xfr_inst_d_no()));

				// 出庫場所未定の場合はデフォルト場所で受払予定を作る
				if(isNull(dest.loc_cd())) {
					dest.loc_cd(src.gi_def_loc_cd());
				}

				// 移動実績の場合は数量を上書く
				if (MCNumber.ZERO.lt(src.act_qty())) {
					dest.base_unit_qty(src.base_unit_qty().subtract(src.act_qty()));
				}
				
				dest.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());
				if (!isNullOrNullVal(src.xfr_schd_no())) {
					dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.XFR_SCHD_NO.value());
					dest.io_schd_sub_no1(src.xfr_schd_no());
				}
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_no, XfrPr_DtlR.$xfr_alloc_sts_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_pr_no, XfrPr_DtlR.$io_schd_pr_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, XfrPr_DtlR.$xfr_schd_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$accpt_schd_dt, XfrPr_DtlR.$xfr_schd_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, XfrPr_DtlR.$itm_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, XfrPr_DtlR.$itm_sub1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, XfrPr_DtlR.$itm_sub2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, XfrPr_DtlR.$itm_sub3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, XfrPr_DtlR.$ver_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, XfrPr_DtlR.$gi_loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$str_ln_cd, XfrPr_DtlR.$gi_str_ln_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$stk_arrv_bp_cd, XfrPr_DtlR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$lot_no, XfrPr_DtlR.$lot_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sublot_no, XfrPr_DtlR.$sublot_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, XfrPr_DtlR.$alloc_sno1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1_null_flg, XfrPr_DtlR.$sno1_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, XfrPr_DtlR.$alloc_sno2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2_null_flg, XfrPr_DtlR.$sno2_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, XfrPr_DtlR.$alloc_sno3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3_null_flg, XfrPr_DtlR.$sno3_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, XfrPr_DtlR.$alloc_sno4);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4_null_flg, XfrPr_DtlR.$sno4_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, XfrPr_DtlR.$trd_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, XfrPr_DtlR.$trd_unit_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, XfrPr_DtlR.$base_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, XfrPr_DtlR.$base_unit_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$gd_cd, XfrPr_DtlR.$gd_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$quality_typ, XfrPr_DtlR.$quality_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$stk_insp_typ, XfrPr_DtlR.$stk_insp_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$stk_id_typ, XfrPr_DtlR.$stk_id_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$stk_bp_cd, XfrPr_DtlR.$stk_bp_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alloc_flg, XfrPr_DtlR.$alloc_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_fr, XfrPr_DtlR.$vld_dt_fr);
				addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_to, XfrPr_DtlR.$vld_dt_to);
				addColumnPathMap(IoSchd_Ins01_DtlR.$gr_loc_cd, XfrPr_DtlR.$gr_loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$gr_str_ln_cd, XfrPr_DtlR.$gr_str_ln_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$prov_typ, XfrPr_DtlR.$prov_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$prov_basis_typ, XfrPr_DtlR.$prov_basis_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$rsn_cd, XfrPr_DtlR.$rsn_cd);
			}
		}

		// 取引単位に対する品目単位マスタのキャッシュ
		protected void initItmUnitCache(MCList<XfrPr_DtlR> bindL) {
			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(t);
			itmUnitL_bldr.setSelect(t.conv_base_qty, t.conv_qty, t.dec_place, t.rnd_typ,
					t.pack_flg // 荷姿フラグ
			);
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL_bldr, bindL,
					XfrPr_DtlR.$itm_cd, XfrPr_DtlR.$itm_sub1, XfrPr_DtlR.$itm_sub2,
					XfrPr_DtlR.$itm_sub3, XfrPr_DtlR.$trd_unit_cd);
		}
		
		protected MAVM_ITM_UNIT_R getItmTrdUnitR(XfrPr_DtlR r) {
			return _itmUnitCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
		}
		/**
		 * オーダ登録サービスを実行する
		 */
		protected void callOrdRegSrv(MCList<XfrPr_DtlR> up) {
			MSBCL_OrdRegService.Ord_Upd04 o = MSBCL_OrdRegService.crtOrd_Upd04();
			
			for (XfrPr_DtlR r : up) {
				if (!isNull(r.xfr_schd_no())) {
					MST_XFR_SCHD_R xfrR = getXfrSchdR(r.xfr_schd_no());
					if (isNull(xfrR)
							|| isNull(xfrR.itm_ord_no())) {
							continue;
					}
					copy(o.up0().add(), xfrR , createMap_Ord_Upd04_DtlR_MST_XFR_SCHD_R());
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		/**
		 * ＷＧ間依頼サービスを実行する（ステータス更新）
		 */
		protected void callWgRqstSrv(MCList<XfrPr_DtlR> up) {
			// ＷＧ間依頼のステータス更新
			MSBAL_WgRqstService.WgRqst_Upd03 o = MSBAL_WgRqstService.crtWgRqst_Upd03();
			
			for (XfrPr_DtlR r : up) {
				if (!isNull(r.xfr_schd_no())) {
					MST_XFR_SCHD_R xfrR = getXfrSchdR(r.xfr_schd_no());
					
					if (!MSC_XFR_SRC_TYP.isWG_RQST(xfrR.xfr_src_typ())) {
						continue;
					}
					copy( o.up0().add(), xfrR , createMap_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R());
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		/**
		 * オーダ登録サービス用のマッパー
		 */
		protected Map_Ord_Upd04_DtlR_MST_XFR_SCHD_R<Ord_Upd04_DtlR,MST_XFR_SCHD_R> createMap_Ord_Upd04_DtlR_MST_XFR_SCHD_R() {
			return new Map_Ord_Upd04_DtlR_MST_XFR_SCHD_R<Ord_Upd04_DtlR, MST_XFR_SCHD_R>();
		}

		public class Map_Ord_Upd04_DtlR_MST_XFR_SCHD_R<D extends Ord_Upd04_DtlR, S extends MST_XFR_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd04_DtlR.$itm_ord_no, MST_XFR_SCHD_R.$itm_ord_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				dest.itm_ord_typ(MSC_ITM_ORD_TYP.XFR.value());
			}
		}

		/**
		 * ＷＧ間依頼サービス用のマッパー
		 */
		protected Map_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R<WgRqst_Upd03_DtlR, MST_XFR_SCHD_R> createMap_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R() {
			return new Map_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R<WgRqst_Upd03_DtlR, MST_XFR_SCHD_R>();
		}

		public class Map_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R<D extends WgRqst_Upd03_DtlR, S extends MST_XFR_SCHD_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Upd03_DtlR.$wg_rqst_prms_no, MST_XFR_SCHD_R.$xfr_src_no);

			}
		}
	}


	/**
	 * XfrSchd_Upd03オペレーション.<p>
	 *
	 * 移動・移送予定の依頼元訂正ＦＬＧを更新する。<br>
	 */
	public class XfrSchd_Upd03 extends MSBEL_XfrSchdService_MC_A.XfrSchd_Upd03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 前提条件：移動移送予定情報のロックはこのサービスを呼び出す前に行っていること
			
			MCList<XfrSchdMod_DtlR> schdNoL = MCList.create(XfrSchdMod_DtlR.class);
			MCList<XfrSchdMod_DtlR> srcNoL = MCList.create(XfrSchdMod_DtlR.class);
			for (XfrSchdMod_DtlR r : up0()) {
				if (!isNull(r.xfr_schd_no())) {
					schdNoL.add(r);
				}
				else if (!isNullOr(r.xfr_src_no(), r.xfr_src_typ())) {
					srcNoL.add(r);
				}
			}
			
			if (!isNull(schdNoL)) {
				execBatch_MST_XFR_SCHD_U01_sql(schdNoL);
			}
			if (!isNull(srcNoL)) {
				execBatch_MST_XFR_SCHD_U02_sql(srcNoL);
			}
			
		}
	}


	/**
	 * XfrSchd_Chk02オペレーション.<p>
	 *
	 * 更新対象の移動引当状況の進捗をチェックする。<br>
	 */
	public class XfrSchd_Chk02 extends MSBEL_XfrSchdService_MC_A.XfrSchd_Chk02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up1().act_flg()) {
				initXfrAllocCache(up0(), false);
				actEditUp();
				chkDefLoc();
				chkProgressAct();
			}
			else if (up1().inst_flg()) {
				if (up1().re_call_flg()) {
					editUp();
					editUpProv();
					chkDefLoc();
					chkAllocSts();
					callProvSchdServiceChk01(up0());
				}
				else {
					initXfrSchdCache(up0());
					initXfrAllocCache(up0(), false);
					editUp();
					editUpProv();
					chkDefLoc();
					chkAllocSts();
					chkProgressInst();
					callProvSchdServiceChk01(up0());
					chkItmAlloc();
				}
			}
			else if (up1().schd_flg()) {
				initXfrAllocCache(up0(), true);
				// 移動移送予定とマスタのキャッシュは、Chk04で行う
				// 支給予定サービスの呼出は、chk04で行う
				chkProgressSchd();
			}
			else {
				initXfrSchdCache(up0());
				initXfrAllocCache(up0(), false);
				editUp();
				editUpProv();
				chkDefLoc();
				chkAllocSts();
				if(!up1().alloc_off_flg()) {
					chkReItmAlloc();
				}
				callProvSchdServiceChk01(up0());
			}

			setDown();
		}

		protected void editUp() {
			// トランによる補完
			editDeleteUp(up0().subList(r->MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
			editUpdateUp(up0().subList(r->MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())));

			// マスタのキャッシュ
			initCache();
			
			// マスタによる補完
			editUpCmmn(up0());
		}

		protected void editUpCmmn(MCList<XfrSchdChk02_DtlR> upL) {
			int i = 0;
			for (XfrSchdChk02_DtlR upR : upL) {
				i++;
				upR.wk_peg_no(i);
				i++;
				upR.wk_ret_peg_no(i);
				
				if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					continue;
				}
				
				editUpChk02AndUpd02(upR);
			}
		}

		protected void editDeleteUp(MCList<XfrSchdChk02_DtlR> delL) {
			for(XfrSchdChk02_DtlR delR : delL) {
				MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().getFirst(delR.xfr_alloc_sts_no());
				if (allocR == null) {
					delR.err_flg(true);
				}
				else {
					delR.xas(allocR);
				}
			}
		}

		protected void editUpdateUp(MCList<XfrSchdChk02_DtlR> updL) {
			for(XfrSchdChk02_DtlR upR : updL) {
				MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().getFirst(upR.xfr_alloc_sts_no()).clone();
				if (allocR == null) {
					upR.err_flg(true);
				}
				else {
					allocR.abort_flg(upR.abort_flg());
					if (upR.abort_flg()
							|| MSC_PR_STS_TYP.isINST(allocR.pr_sts_typ()) && !up1().inst_flg()
							|| MSC_PR_STS_TYP.isPART_COMP(allocR.pr_sts_typ())
							|| MSC_PR_STS_TYP.isCOMP(allocR.pr_sts_typ())) {
						upR.xas(allocR);
					}
					else {
						editUpdateUpChk02AndUpd02(upR.xas(), allocR);
					}
				}
			}
		}

		/**
		 * 支給予定情報のデータ補完／移動一覧と移動指図
		 */
		protected void editUpProv() {
			for (XfrSchdChk02_DtlR r : up0()) {
				// 移動指図時の計画外追加・まとめ
				if (isNullOrNullVal(r.xfr_schd_no())) {
					// 何もなし:マスタ値で補完
				}
				// 移動一覧、予定紐づきの指図
				else {
					MST_XFR_SCHD_R schdR = getXfrSchdCache().getFirst(r);
					if (schdR == null) {
						r.err_flg(true);
						continue;
					}
					r.prov_typ(schdR.prov_typ());
					r.prov_basis_typ(schdR.prov_basis_typ());
					r.xrate(schdR.xrate());
					r.ptax_xrate(schdR.ptax_xrate());
					r.trd_cur_cd(schdR.trd_cur_cd());
					r.tax_cd(schdR.tax_cd());
					r.trd_cur_upri(schdR.trd_cur_upri());
					r.ret_prov_typ(schdR.ret_prov_typ());
					r.ret_prov_basis_typ(schdR.ret_prov_basis_typ());
					r.ret_xrate(schdR.ret_xrate());
					r.ret_ptax_xrate(schdR.ret_ptax_xrate());
					r.ret_trd_cur_cd(schdR.ret_trd_cur_cd());
					r.ret_tax_cd(schdR.ret_tax_cd());
					r.ret_trd_cur_upri(schdR.ret_trd_cur_upri());
				}
			}
		}
		
		protected void actEditUp() {
			for(XfrSchdChk02_DtlR upR : up0()) {
				MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().getFirst(upR.xfr_alloc_sts_no());
				if (allocR == null) {
					upR.err_flg(true);
				}
				else {
					upR.gi_loc_cd(allocR.gi_loc_cd());
					upR.lg_grp_cd(allocR.lg_grp_cd());
				}
			}
			
			MCList<XfrSchdChk02_DtlR> defGiLocL = up0().subList(r->!r.err_flg() && isNull(r.gi_loc_cd()));
			initItmLgGrpLocCache(defGiLocL);
			initGiDefLocCache(defGiLocL);
			for (XfrSchdChk02_DtlR upR : defGiLocL) {
				MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpLocCache().get(upR.itm_cd(),
						upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(), upR.lg_grp_cd());
				MAM_LG_GRP_R lgGrpR = giDefLocCache().get(upR.lg_grp_cd());
				upR.gi_def_loc_cd(!itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd()
						: !lgGrpR.isEmpty() ? lgGrpR.getString("loc_cd") : null);
			}
		}
		
		protected void chkProgressSchd() {
			for (XfrSchdChk02_DtlR r : up0()) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					boolean errFlg = false;
					boolean actFlg = false;
					MCList<MST_XFR_ALLOC_STS_SV_R> subSvL = getXfrAllocCache()
							.subListAllocSv(r.xfr_schd_no());
					if (!isNull(subSvL)) {
						errFlg = true;
					}
					else {
						MCList<MST_XFR_ALLOC_STS_R> subL = getXfrAllocCache().subListAlloc(r.xfr_schd_no());
						for (MST_XFR_ALLOC_STS_R subR : subL) {
							if (!MSC_PR_STS_TYP.isNOT_INST(subR.pr_sts_typ())
									|| subR.fix_flg() || subR.abort_flg()) {
								errFlg = true;
								if (subR.cmpl_flg() || MSC_PR_STS_TYP.isPART_COMP(subR.pr_sts_typ())) {
									actFlg = true;
								}
								break;
							}
						}
					}
					if (errFlg) {
						MCMessagePool.add(new MCMessage(r, null, MSBEL0256,
								r.xfr_schd_no(), toDispGUIIndex(r)));
						r.err_flg(true);
						r.addBooleanColumn("xfr_inst_flg", true);
						r.addBooleanColumn("xfr_act_flg", actFlg);
					}
				}
			}
		}

		protected void chkProgressAct() {
			for (XfrSchdChk02_DtlR r : up0()) {
				MST_XFR_ALLOC_STS_R oldR = getXfrAllocCache().getFirst(r.xfr_alloc_sts_no());
				if (oldR == null) {
					r.err_flg(true);
				}
				else {
					if (MAC_SHIP_INST_TYP.isPICK(oldR.ship_inst_typ())) {
						if (MSC_PR_STS_TYP.isNOT_INST(oldR.pr_sts_typ())) {
							MCMessagePool.add(new MCMessage(r, null, MSBEL0262,
									r.xfr_alloc_sts_no(), toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
				}
			}
			
		}
		
		protected void chkProgressInst() {
			
			for (XfrSchdChk02_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) && isNull(r.old_xfr_alloc_sts_no())) {
					continue;
				}
				MST_XFR_ALLOC_STS_R oldR = getXfrAllocCache()
						.getFirst(nvl(r.old_xfr_alloc_sts_no(), r.xfr_alloc_sts_no()));
				if (oldR == null) {
					r.err_flg(true);
				}
				else {
					if (MAC_SHIP_INST_TYP.isPICK(oldR.ship_inst_typ())) {
						if (MSC_PR_STS_TYP.isNOT_INST(oldR.pr_sts_typ()) && oldR.abort_flg()) {
							MCMessagePool.add(new MCMessage(r, null, MSBEL0259,
									oldR.xfr_alloc_sts_no(), toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
					else {
						MCMessagePool.add(new MCMessage(r, null, MSBEL0260,
								oldR.xfr_alloc_sts_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
			
		}
		
		protected void chkDefLoc() {
			for (XfrSchdChk02_DtlR r : up0()) {
				if (r.err_flg()) {
					continue;
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					if (isNullAnd(r.gi_loc_cd(), r.gi_def_loc_cd())) {
						MCMessagePool.add(new MCMessage(r, null, MSBEL0268, r.lg_grp_cd(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
		}

		protected void chkAllocSts() {
			MCMessageList msgL = new MCMessageList();
			for (XfrSchdChk02_DtlR r : up0()) {
				if (r.err_flg()) {
					continue;
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					msgL.addAll(check(r, XfrSchdChk02_DtlR.$gr_loc_cd, new FXUCL_RequiredValidater()));
					if (isSame(r.gi_loc_cd(), r.gr_loc_cd()) && isSame(r.gi_str_ln_cd(), r.gr_str_ln_cd())) {
						msgL.add(new MCMessage(r, XfrSchdChk02_DtlR.$gi_loc_cd, MSBEL0254, toDispGUIIndex(r)));
					}
					
					if (!msgL.isEmpty()) {
						continue;
					}
					
					MAM_LOC_R grLocR = grLocCache().get(r.gr_loc_cd());
					MAM_LOC_R giLocR = giLocCache().get(r.gi_def_loc_cd());
					if (!isSame(giLocR.lg_grp_cd(), grLocR.lg_grp_cd())) {
						msgL.add(new MCMessage(r, XfrSchdChk02_DtlR.$gi_loc_cd, MSBEL0269, 
								giLocR.lg_grp_cd(), grLocR.lg_grp_cd(), toDispGUIIndex(r)));
					}
				}
			}
			MCMessagePool.addAll(msgL);
		}
		
		protected void initCache() {
			// Chk04と共通のキャッシュ
			initTrdCdCache();
			initGiDefLocCache(up0());
			initDefLoc();
			initGiLocCache(up0());
			initGrLocCache(up0());
			initItmCache(up0());
			initTrdCache(up0());
		}

		protected void initDefLoc() {
			initItmLgGrpLocCache(up0());
			for(XfrSchdChk02_DtlR upR : up0()) {
				if(!isNull(upR.gi_loc_cd())) {
					upR.gi_def_loc_cd(upR.gi_loc_cd());
				}
				else {
					MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpLocCache().get(upR.itm_cd(),
							upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(),
							upR.lg_grp_cd());
					MAM_LG_GRP_R lgGrpR = giDefLocCache().get(upR.lg_grp_cd());
					upR.gi_def_loc_cd(!itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd()
							: !lgGrpR.isEmpty() ? lgGrpR.getString("loc_cd") : null);
				}
			}
		}

		/**
		 * 支給予定の更新前チェック
		 */
		protected void callProvSchdServiceChk01(MCList<XfrSchdChk02_DtlR> subL) {
			subL = subL.subList(r->isProvR(r));
			if(subL.isEmpty()) {
				return;
			}

			MCList<XfrSchdChk02_DtlR> provL = MCList.create(XfrSchdChk02_DtlR.class);
			MCList<XfrSchdChk02_DtlR> retProvL = MCList.create(XfrSchdChk02_DtlR.class);

			for(XfrSchdChk02_DtlR subR : subL) {
				MAM_LOC_R grLoc = grLocCache().getEx(subR.gr_loc_cd());
				if (isNull(subR.gi_def_loc_cd())) {
					continue;
				}
				MAM_LOC_R giLoc = giLocCache().getEx(subR.gi_def_loc_cd());

				if(isProv(giLoc.sppl_cd(), grLoc.sppl_cd())) {
					provL.add(subR);
				}
				else if(isProvRtn(giLoc.sppl_cd(), grLoc.sppl_cd())) {
					retProvL.add(subR);
				}
				else if(isProvDD(giLoc.sppl_cd(), grLoc.sppl_cd())) {
					provL.add(subR);
					XfrSchdChk02_DtlR tmpR = subR.clone();
					tmpR.trd_cd(null);	// 返品の取引CDは支給予定SV内で取得する
					retProvL.add(tmpR);
				}
			}
			if (isNull(provL) && isNull(retProvL)) {
				return ;
			}
			
			MSBEL_ProvSchdService.ProvSchd_Chk01 ope = MSBEL_ProvSchdService.crtProvSchd_Chk01();
			addAll(ope.up0(), provL, createMap_ProvSchd_DtlR_XfrSchdChk02_DtlR());
			addAll(ope.up0(), retProvL, createMap_RetProvSchd_DtlR_XfrSchdChk02_DtlR());
			ope.exec();
			copyErrFlg(subL, ope.down0(), XfrSchdChk02_DtlR.$wk_peg_no, ProvSchd_DtlR.$peg_no);
			copyErrFlg(subL, ope.down0(), XfrSchdChk02_DtlR.$wk_ret_peg_no, ProvSchd_DtlR.$peg_no);
			
		}

		protected Map_ProvSchd_DtlR_XfrSchdChk02_DtlR<ProvSchd_DtlR,XfrSchdChk02_DtlR> createMap_ProvSchd_DtlR_XfrSchdChk02_DtlR() {
			return new Map_ProvSchd_DtlR_XfrSchdChk02_DtlR<ProvSchd_DtlR, XfrSchdChk02_DtlR>();
		}

		public class Map_ProvSchd_DtlR_XfrSchdChk02_DtlR<D extends ProvSchd_DtlR, S extends XfrSchdChk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());

				MAM_LOC_R grLocCache = grLocCache().getEx(src.gr_loc_cd());
				dest.prsppl_cd(grLocCache.sppl_cd());
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvSchd_DtlR.$peg_no, XfrSchdChk02_DtlR.$wk_peg_no);
				addColumnPathMap(ProvSchd_DtlR.$data_crud_typ, XfrSchdChk02_DtlR.$data_crud_typ);
				addColumnPathMap(ProvSchd_DtlR.$trd_cd, XfrSchdChk02_DtlR.$trd_cd);
				addColumnPathMap(ProvSchd_DtlR.$wg_cd, XfrSchdChk02_DtlR.$wg_cd);
				addColumnPathMap(ProvSchd_DtlR.$accpt_schd_dt, XfrSchdChk02_DtlR.$xfr_schd_dt);
				addColumnPathMap(ProvSchd_DtlR.$prov_typ, XfrSchdChk02_DtlR.$prov_typ);
				addColumnPathMap(ProvSchd_DtlR.$prov_basis_typ, XfrSchdChk02_DtlR.$prov_basis_typ);
				addColumnPathMap(ProvSchd_DtlR.$xrate, XfrSchdChk02_DtlR.$xrate);
				addColumnPathMap(ProvSchd_DtlR.$ptax_xrate, XfrSchdChk02_DtlR.$ptax_xrate);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_cd, XfrSchdChk02_DtlR.$trd_cur_cd);
				addColumnPathMap(ProvSchd_DtlR.$tax_cd, XfrSchdChk02_DtlR.$tax_cd);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_upri, XfrSchdChk02_DtlR.$trd_cur_upri);
				addColumnPathMap(ProvSchd_DtlR.$itm_cd, XfrSchdChk02_DtlR.$itm_cd);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub1, XfrSchdChk02_DtlR.$itm_sub1);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub2, XfrSchdChk02_DtlR.$itm_sub2);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub3, XfrSchdChk02_DtlR.$itm_sub3);
				addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, XfrSchdChk02_DtlR.$stk_id_typ);
				addColumnPathMap(ProvSchd_DtlR.$stk_arrv_bp_cd, XfrSchdChk02_DtlR.$gi_stk_arrv_bp_cd);
			}
		}

		protected Map_RetProvSchd_DtlR_XfrSchdChk02_DtlR<ProvSchd_DtlR,XfrSchdChk02_DtlR> createMap_RetProvSchd_DtlR_XfrSchdChk02_DtlR() {
			return new Map_RetProvSchd_DtlR_XfrSchdChk02_DtlR<ProvSchd_DtlR, XfrSchdChk02_DtlR>();
		}

		public class Map_RetProvSchd_DtlR_XfrSchdChk02_DtlR<D extends ProvSchd_DtlR, S extends XfrSchdChk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());

				MAM_LOC_R giLocCache = giLocCache().getEx(src.gi_def_loc_cd());
				dest.prsppl_cd(giLocCache.sppl_cd());
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvSchd_DtlR.$peg_no, XfrSchdChk02_DtlR.$wk_ret_peg_no);
				addColumnPathMap(ProvSchd_DtlR.$data_crud_typ, XfrSchdChk02_DtlR.$data_crud_typ);
				addColumnPathMap(ProvSchd_DtlR.$trd_cd, XfrSchdChk02_DtlR.$trd_cd);
				addColumnPathMap(ProvSchd_DtlR.$wg_cd, XfrSchdChk02_DtlR.$wg_cd);
				addColumnPathMap(ProvSchd_DtlR.$accpt_schd_dt, XfrSchdChk02_DtlR.$xfr_schd_dt);
				addColumnPathMap(ProvSchd_DtlR.$prov_typ, XfrSchdChk02_DtlR.$ret_prov_typ);
				addColumnPathMap(ProvSchd_DtlR.$prov_basis_typ, XfrSchdChk02_DtlR.$ret_prov_basis_typ);
				addColumnPathMap(ProvSchd_DtlR.$xrate, XfrSchdChk02_DtlR.$ret_xrate);
				addColumnPathMap(ProvSchd_DtlR.$ptax_xrate, XfrSchdChk02_DtlR.$ret_ptax_xrate);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_cd, XfrSchdChk02_DtlR.$ret_trd_cur_cd);
				addColumnPathMap(ProvSchd_DtlR.$tax_cd, XfrSchdChk02_DtlR.$ret_tax_cd);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_upri, XfrSchdChk02_DtlR.$ret_trd_cur_upri);
				addColumnPathMap(ProvSchd_DtlR.$itm_cd, XfrSchdChk02_DtlR.$itm_cd);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub1, XfrSchdChk02_DtlR.$itm_sub1);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub2, XfrSchdChk02_DtlR.$itm_sub2);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub3, XfrSchdChk02_DtlR.$itm_sub3);
				addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, XfrSchdChk02_DtlR.$stk_id_typ);
				addColumnPathMap(ProvSchd_DtlR.$stk_arrv_bp_cd, XfrSchdChk02_DtlR.$gi_stk_arrv_bp_cd);
			}
		}

		protected MCList<Srch_TgtR> setStkAlloc(MCList<XfrSchdChk02_DtlR> tgtL) {
			MCList<Srch_TgtR> alcL = MCList.create(Srch_TgtR.create());

			for (XfrSchdChk02_DtlR dtlR : tgtL) {
				
				MST_XFR_ALLOC_STS_R xfrAlloc = getXfrAllocCache().getFirst(dtlR.xfr_alloc_sts_no());
				
				Srch_TgtR alcR = Srch_TgtR.create();
				copy(alcR, dtlR, createMap_Srch_TgtR_XfrSchdChk02_DtlR());
				
				if (isNull(xfrAlloc)) {
					alcL.add(alcR);
					continue;
				}
				
				// 変更前数量＜変更後数量の場合の設定
				if (dtlR.base_unit_qty().gt(xfrAlloc.base_unit_qty())) {
					alcR.base_unit_qty(xfrAlloc.base_unit_qty());
					if (xfrAlloc.alloc_flg()) {
						alcR.except_alloc_wait_flg(true);
					} else {
						alcR.except_alloc_wait_flg(false);
					}
					
					MAVM_ITM_UNIT_R itmUnit = itmUnitCache().get(
							dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
					
					if (itmUnit.pack_flg()) {
						alcR.pack_unit_qty(rvrsBaseUnitConv(alcR.base_unit_qty(), itmUnit.conv_base_qty(), itmUnit.conv_qty(),
								itmUnit.dec_place(), itmUnit.rnd_typ()));
					}
					
					Srch_TgtR alcWaitR = alcR.clone();
					alcWaitR.base_unit_qty(dtlR.base_unit_qty().subtract(xfrAlloc.base_unit_qty()));
					alcWaitR.except_alloc_wait_flg(false);
					
					if (itmUnit.pack_flg()) {
						alcWaitR.pack_unit_qty(rvrsBaseUnitConv(alcWaitR.base_unit_qty(), itmUnit.conv_base_qty(), itmUnit.conv_qty(),
								itmUnit.dec_place(), itmUnit.rnd_typ()));
					}
					alcL.add(alcWaitR);
				} else {
					// 変更前数量＞＝変更後数量の場合の設定
					if (xfrAlloc.alloc_flg()) {
						alcR.except_alloc_wait_flg(true);
					} else {
						alcR.except_alloc_wait_flg(false);
					}
				}
				alcL.add(alcR);
			}
			return alcL;
		}
		
		/**
		 * 移動指図時の引当可能数チェック
		 */
		protected void chkItmAlloc() {
			
			MCList<XfrSchdChk02_DtlR> notErrL = MCList.create(XfrSchdChk02_DtlR.class);
			MCList<XfrSchdChk02_DtlR> allocL = MCList.create(XfrSchdChk02_DtlR.class);
			for (XfrSchdChk02_DtlR r : up0()) {
				if (r.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					notErrL.add(r);
				}
				else {
					if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						MST_XFR_ALLOC_STS_R stsR = getXfrAllocCache().getFirst(r.xfr_alloc_sts_no());
						if (MSC_PR_STS_TYP.isCOMP(stsR.pr_sts_typ())
								|| MSC_PR_STS_TYP.isPART_COMP(stsR.pr_sts_typ())) {
							continue;
						}
					}

					if (r.alloc_flg() && !r.abort_flg()) {
						MCMessageList msgL = new MCMessageList();
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$gi_loc_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$gi_str_ln_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$gi_stk_arrv_bp_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$alloc_sno1, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$alloc_sno2, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$alloc_sno3, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$alloc_sno4, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$trd_unit_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$trd_unit_qty, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$base_unit_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$base_unit_qty, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$gd_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$quality_typ, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, XfrSchdChk02_DtlR.$stk_id_typ, new FXUCL_RequiredValidater()));
						if (!msgL.isEmpty()) {
							r.err_flg(true);
							MCMessagePool.addAll(msgL);
							continue;
						}
						allocL.add(r);
						notErrL.add(r);
					}
					else {
						notErrL.add(r);
					}
				}
				
			}
			if (isNull(allocL)) {
				return ;
			}
			cmpNotLotFixFlg(allocL);
			
			initItmCache(allocL);
			initItmUnitCache(allocL);
			MCList<XfrSchdChk02_DtlR> itmLocL = allocL.groupBy(
					XfrSchdChk02_DtlR.$itm_cd, XfrSchdChk02_DtlR.$itm_sub1,
					XfrSchdChk02_DtlR.$itm_sub2, XfrSchdChk02_DtlR.$itm_sub3,
					XfrSchdChk02_DtlR.$gi_loc_cd);
			
			MSBEL_AllocMngService.Alloc_Lock_Upd01 lockOpe = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			addAll(lockOpe.up0(), itmLocL, createMap_MSW_ALLOC_LOC_MAP_R_XfrSchdChk02_DtlR());
			lockOpe.exec();
			
			MSBEL_AllocMngService.Alloc_Srch01 allocOpe = MSBEL_AllocMngService.crtAlloc_Srch01();
			allocOpe.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			allocOpe.up0().dtl_flg(true);
			allocOpe.up1().addAll(setStkAlloc(allocL));

			// 自分自身の受払予定（出庫予定）を引当管理サービスに渡す
			for(XfrSchdChk02_DtlR r : notErrL) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					MST_XFR_SCHD_R xSchdR = getXfrSchdCache().getFirst(r);
					if (!isNull(xSchdR) && !isNull(xSchdR.inpt_schd_no()) && !xSchdR.rqst_can_flg() && !r.alloc_flg()) {
						// 投入に紐づく、かつ場所引当ＦＬＧがオフのときは、up3に追加しない
						continue;
					}
					MST_XFR_ALLOC_STS_R oldR = getXfrAllocCache().getFirst(r.xfr_alloc_sts_no());
					Srch_Io_SchdR ioSchdR = Srch_Io_SchdR.create();
					ioSchdR.io_schd_typ(getIoSchdTypForMove(oldR.trd_ptn_typ()));
					ioSchdR.io_schd_sts_typ(getIoSchdStsTyp(oldR.pr_sts_typ()));
					ioSchdR.io_schd_no(r.xfr_alloc_sts_no());
					allocOpe.up3().add(ioSchdR);
				}
			}
			// 総量引当によって作成された出庫予定は引当管理サービス内では存在しない受払予定として扱うよう連携する
			MCList<MST_IO_SCHD_R> ioSchdL = MCList.create(MST_IO_SCHD_R.class);
			getDelTgtIoSchd(ioSchdL, allocL);
			
			addAll(allocOpe.up3(), ioSchdL, createMap_Srch_Io_SchdR_MST_IO_SCHD_R());
			
			// 投入予定と紐づく移動予定に対して再引当ができるよう、上り電文を編集する
			MCList<Srch_StkR> srchStkL = MCList.create(Srch_StkR.class);
			editAllocSrch01Up2(srchStkL, allocL);
			allocOpe.up2().addAll(srchStkL);
			
			MCSortPolicy sp = new MCSortPolicy();
			// 出庫日が直近のものに対して優先して引当するために、日付でソートする
			sp.add(MCList.SortType.ASC, Srch_TgtR.$gi_schd_dt);
			allocOpe.up1().sort(sp);

			allocOpe.exec();

			MCIndexKey idxkey = allocOpe.down0().createIndex(Srch_RsltR.$peg_no);
			MCIndexKey grpIdxKey = allocL.createIndex(
					XfrSchdChk02_DtlR.$gi_def_loc_cd, XfrSchdChk02_DtlR.$itm_cd,
					XfrSchdChk02_DtlR.$itm_sub1, XfrSchdChk02_DtlR.$itm_sub2, XfrSchdChk02_DtlR.$itm_sub3,
					XfrSchdChk02_DtlR.$gi_str_ln_cd, XfrSchdChk02_DtlR.$gi_stk_arrv_bp_cd,
					XfrSchdChk02_DtlR.$quality_typ, XfrSchdChk02_DtlR.$gd_cd,
					XfrSchdChk02_DtlR.$stk_id_typ, XfrSchdChk02_DtlR.$stk_bp_cd);
			for (XfrSchdChk02_DtlR r : allocL) {
				if (r.err_flg()) {
					continue;
				}
				MCList<Srch_RsltR> subL = allocOpe.down0().subList(idxkey, r.peg_no());
				MCNumber sumQty = nvl(subL.sum(Srch_RsltR.$base_unit_qty), MCNumber.ZERO);
				if (sumQty.lt(r.base_unit_qty())) {
					MCMessagePool.add(new MCMessage(r, null, MSBEL0197, toDispGUIIndex(r)));
					r.err_flg(true);
					MAM_ITM_R itmr = itmCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					MAVM_ITM_UNIT_R itmUnitR = itmUnitCache().get(r.itm_cd(),
							r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
					// 同じ出庫場所、品目の出庫予定もエラーとする
					for (XfrSchdChk02_DtlR rr : allocL.subList(grpIdxKey, r.toArray(grpIdxKey.getKeys()))) {
						if (rr != r
								&& (isNullOrNullVal(r.lot_no())
										|| isNullOrNullVal(rr.lot_no())
										|| r.lot_no().equals(rr.lot_no())
												&& r.sublot_no().equals(rr.sublot_no()))
								&& (r.sno1_null_flg() && isNullOrNullVal(rr.sno1())
										|| isNullOrNullVal(r.sno1()) && rr.sno1_null_flg()
										|| r.sno1().equals(rr.sno1()))
								&& (r.sno2_null_flg() && isNullOrNullVal(rr.sno2())
										|| isNullOrNullVal(r.sno2()) && rr.sno2_null_flg()
										|| r.sno2().equals(rr.sno2()))
								&& (r.sno3_null_flg() && isNullOrNullVal(rr.sno3())
										|| isNullOrNullVal(r.sno3()) && rr.sno3_null_flg()
										|| r.sno3().equals(rr.sno3()))
								&& (r.sno4_null_flg() && isNullOrNullVal(rr.sno4())
										|| isNullOrNullVal(r.sno4()) && rr.sno4_null_flg()
										|| r.sno4().equals(rr.sno4()))) {
							MAVM_ITM_UNIT_R itmUnitRr = itmUnitCache().get(rr.itm_cd(),
									rr.itm_sub1(), rr.itm_sub2(), rr.itm_sub3(),
									rr.trd_unit_cd());
							if(itmr.pack_alloc_flg()) {
								String unit_cd_r = itmUnitR.pack_flg() ? r.trd_unit_cd() : r.base_unit_cd();
								String unit_cd_rr = itmUnitRr.pack_flg() ? rr.trd_unit_cd() : rr.base_unit_cd();
								if(unit_cd_r.equals(unit_cd_rr)) {
									MCMessagePool.add(new MCMessage(rr, null, MSBEL0197, toDispGUIIndex(rr)));
									rr.err_flg(true);
								}
							}
							else {
								MCMessagePool.add(new MCMessage(rr, null, MSBEL0197, toDispGUIIndex(rr)));
								rr.err_flg(true);
							}
						}
					}
				}
				else {
					MCGroupByPolicy policy = new MCGroupByPolicy(
							Srch_RsltR.$peg_no,
							Srch_RsltR.$lot_no,
							Srch_RsltR.$sublot_no,
							Srch_RsltR.$ver_no,
							Srch_RsltR.$sno1,
							Srch_RsltR.$sno2,
							Srch_RsltR.$sno3,
							Srch_RsltR.$sno4,
							Srch_RsltR.$pack_unit_cd,
							Srch_RsltR.$base_unit_cd
							);
					policy.sum(
							Srch_RsltR.$pack_unit_qty,
							Srch_RsltR.$base_unit_qty);
					MCList<Srch_RsltR> stkL = subL.groupBy(policy);
					
					for (Srch_RsltR stkR : stkL) {
						XfrSchdChk02_AllocRsltR tmpR = XfrSchdChk02_AllocRsltR.create();
						tmpR.peg_no(stkR.peg_no());
						tmpR.lot_no(stkR.lot_no());
						tmpR.sublot_no(stkR.sublot_no());
						tmpR.ver_no(stkR.ver_no());
						tmpR.sno1(stkR.sno1());
						tmpR.sno2(stkR.sno2());
						tmpR.sno3(stkR.sno3());
						tmpR.sno4(stkR.sno4());
						tmpR.pack_unit_cd(stkR.pack_unit_cd());
						tmpR.pack_unit_qty(stkR.pack_unit_qty());
						tmpR.base_unit_cd(stkR.base_unit_cd());
						tmpR.base_unit_qty(stkR.base_unit_qty());
						
						down1().add(tmpR);
					}
				}
			}

		}
		
		/**
		 * 移動指図時の再引当時（引当ボタン押下、訂正）の引当可能数チェック
		 */
		protected void chkReItmAlloc() {

			MCList<XfrSchdChk02_DtlR> allocL = MCList.create(XfrSchdChk02_DtlR.class);
			MCList<XfrSchdChk02_DtlR> notErrL = MCList.create(XfrSchdChk02_DtlR.class);
			for (XfrSchdChk02_DtlR r : up0()) {
				if (r.alloc_flg() && !r.abort_flg()) {
					MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().getFirst(r.old_xfr_alloc_sts_no());
					if (allocR.alloc_flg()) {
						r.setBooleanNE("except_alloc_wait_flg", true);
					}
					allocL.add(r);
					notErrL.add(r);
				} 
				else {
					notErrL.add(r);
				}
			}
			if (isNull(allocL)) {
				return ;
			}
			cmpNotLotFixFlg(allocL);

			initItmCache(allocL);
			initItmUnitCache(allocL);

			MSBEL_AllocMngService.Alloc_Srch01 allocOpe = MSBEL_AllocMngService.crtAlloc_Srch01();
			allocOpe.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			allocOpe.up0().dtl_flg(true);
			addAll(allocOpe.up1(), allocL, createMap_Srch_TgtR_XfrSchdChk02_DtlR());

			// 自分自身の受払予定（出庫予定）を引当管理サービスに渡す
			for (XfrSchdChk02_DtlR r : notErrL) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					MST_XFR_ALLOC_STS_R oldR = getXfrAllocCache().getFirst(r.xfr_alloc_sts_no());
					Srch_Io_SchdR ioSchdR = Srch_Io_SchdR.create();
					ioSchdR.io_schd_typ(getIoSchdTypForMove(oldR.trd_ptn_typ()));
					ioSchdR.io_schd_sts_typ(getIoSchdStsTyp(oldR.pr_sts_typ()));
					ioSchdR.io_schd_no(r.xfr_alloc_sts_no());
					allocOpe.up3().add(ioSchdR);
				}
			}
			// 総量引当によって作成された出庫予定は引当管理サービス内では存在しない受払予定として扱うよう連携する
			MCList<MST_IO_SCHD_R> ioSchdL = MCList.create(MST_IO_SCHD_R.class);
			getDelTgtIoSchd(ioSchdL, allocL);
			
			addAll(allocOpe.up3(), ioSchdL, createMap_Srch_Io_SchdR_MST_IO_SCHD_R());
			
			// 投入予定と紐づく移動予定に対して再引当ができるよう、上り電文を編集する
			MCList<Srch_StkR> srchStkL = MCList.create(Srch_StkR.class);
			editAllocSrch01Up2(srchStkL, allocL);
			allocOpe.up2().addAll(srchStkL);
			
			MCSortPolicy sp = new MCSortPolicy();
			// 出庫日が直近のものに対して優先して引当するために、日付でソートする
			sp.add(MCList.SortType.ASC, Srch_TgtR.$gi_schd_dt);
			allocOpe.up1().sort(sp);

			allocOpe.exec();

			MCGroupByPolicy grpKey = new MCGroupByPolicy();
			grpKey.addKey(Srch_RsltR.$peg_no);
			grpKey.addKey(Srch_RsltR.$lot_no);
			grpKey.addKey(Srch_RsltR.$sublot_no);
			grpKey.addKey(Srch_RsltR.$ver_no);
			grpKey.addKey(Srch_RsltR.$sno1);
			grpKey.addKey(Srch_RsltR.$sno2);
			grpKey.addKey(Srch_RsltR.$sno3);
			grpKey.addKey(Srch_RsltR.$sno4);
			grpKey.sum(Srch_RsltR.$pack_unit_qty, Srch_RsltR.$base_unit_qty);
			MCIndexKey idxkey = allocOpe.down0().createIndex(Srch_RsltR.$peg_no);
			MCIndexKey grpIdxKey = allocL.createIndex(
					XfrSchdChk02_DtlR.$gi_def_loc_cd, XfrSchdChk02_DtlR.$itm_cd,
					XfrSchdChk02_DtlR.$itm_sub1, XfrSchdChk02_DtlR.$itm_sub2, XfrSchdChk02_DtlR.$itm_sub3,
					XfrSchdChk02_DtlR.$gi_str_ln_cd, XfrSchdChk02_DtlR.$gi_stk_arrv_bp_cd,
					XfrSchdChk02_DtlR.$quality_typ, XfrSchdChk02_DtlR.$gd_cd,
					XfrSchdChk02_DtlR.$stk_id_typ, XfrSchdChk02_DtlR.$stk_bp_cd);
			for (XfrSchdChk02_DtlR r : allocL) {
				if (r.err_flg()) {
					continue;
				}
				MCList<Srch_RsltR> subL = allocOpe.down0().subList(idxkey, r.peg_no());
				MCNumber sumQty = nvl(subL.sum(Srch_RsltR.$base_unit_qty), MCNumber.ZERO);
				if (sumQty.lt(r.base_unit_qty())) {
					MCMessagePool.add(new MCMessage(r, null, MSBEL0197, toDispGUIIndex(r)));
					r.err_flg(true);
					MAM_ITM_R itmr = itmCache().get(r.itm_cd(), r.itm_sub1(),
							r.itm_sub2(), r.itm_sub3());
					MAVM_ITM_UNIT_R itmUnitR = itmUnitCache().get(r.itm_cd(),
							r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
					// 同じ出庫場所、品目の出庫予定もエラーとする 
					for (XfrSchdChk02_DtlR rr : allocL.subList(grpIdxKey, r.toArray(grpIdxKey.getKeys()))) {
						if (rr != r
								&& (isNullOrNullVal(r.lot_no())
										|| isNullOrNullVal(rr.lot_no())
										|| r.lot_no().equals(rr.lot_no())
												&& r.sublot_no().equals(rr.sublot_no()))
								&& (r.sno1_null_flg() && isNullOrNullVal(rr.sno1())
										|| isNullOrNullVal(r.sno1()) && rr.sno1_null_flg()
										|| r.sno1().equals(rr.sno1()))
								&& (r.sno2_null_flg() && isNullOrNullVal(rr.sno2())
										|| isNullOrNullVal(r.sno2()) && rr.sno2_null_flg()
										|| r.sno2().equals(rr.sno2()))
								&& (r.sno3_null_flg() && isNullOrNullVal(rr.sno3())
										|| isNullOrNullVal(r.sno3()) && rr.sno3_null_flg()
										|| r.sno3().equals(rr.sno3()))
								&& (r.sno4_null_flg() && isNullOrNullVal(rr.sno4())
										|| isNullOrNullVal(r.sno4()) && rr.sno4_null_flg()
										|| r.sno4().equals(rr.sno4()))) {
							MAVM_ITM_UNIT_R itmUnitRr = itmUnitCache().get(rr.itm_cd(),
									rr.itm_sub1(), rr.itm_sub2(), rr.itm_sub3(),
									rr.trd_unit_cd());
							if(itmr.pack_alloc_flg()) {
								String unit_cd_r = itmUnitR.pack_flg() ? r.trd_unit_cd() : r.base_unit_cd();
								String unit_cd_rr = itmUnitRr.pack_flg() ? rr.trd_unit_cd() : rr.base_unit_cd();
								if(unit_cd_r.equals(unit_cd_rr)) {
									MCMessagePool.add(new MCMessage(rr, null, MSBEL0197, toDispGUIIndex(rr)));
									rr.err_flg(true);
								}
							}
							else {
								MCMessagePool.add(new MCMessage(rr, null, MSBEL0197, toDispGUIIndex(rr)));
								rr.err_flg(true);
							}
						}
					}
				}
			}
		}
		
		protected void cmpNotLotFixFlg(MCList<XfrSchdChk02_DtlR> allocL) {
			allocL.addBooleanColumn("not_lot_fix_flg", true);
			boolean mfgAllocNotLotFixFlg = isSame(getSysParm("MFG_ALLOC_NOT_LOT_FIX_FLG"), "1");
			boolean sloAllocNotLotFixFlg = isSame(getSysParm("SLO_ALLOC_NOT_LOT_FIX_FLG"), "1");
			for (XfrSchdChk02_DtlR allocR : allocL) {
				if (!isNullOrNullVal(allocR.lot_no()) || !isNullOrNullVal(allocR.sublot_no())) {
					allocR.setBooleanNE("not_lot_fix_flg", false);
				}
				else if (allocR.not_lot_mix_flg() || allocR.not_sublot_mix_flg()) {
					MST_XFR_SCHD_R xfrSchdR = getXfrSchdCache().getFirst(allocR);
					if (!mfgAllocNotLotFixFlg && isSrcInpt(xfrSchdR)) {
						allocR.setBooleanNE("not_lot_fix_flg", false);
					}
					else if (!sloAllocNotLotFixFlg && isSrcSlo(xfrSchdR)) {
						allocR.setBooleanNE("not_lot_fix_flg", false);
					}
				}
			}
		}
		
		protected void delIoSchd(MCList<XfrSchdChk02_DtlR> notErrL) {
			if (isNull(notErrL)) {
				return ;
			}
			
			MCList<MSW_IO_SCHD_DEL_R> delL = MCList.create(MSW_IO_SCHD_DEL_R.class);
			for(XfrSchdChk02_DtlR r : notErrL) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					MST_XFR_ALLOC_STS_R oldR = getXfrAllocCache().getFirst(r.xfr_alloc_sts_no());
					MSW_IO_SCHD_DEL_R tmpR = MSW_IO_SCHD_DEL_R.create();
					tmpR.io_schd_typ(getIoSchdTypForMove(oldR.trd_ptn_typ()));
					tmpR.io_schd_sts_typ(getIoSchdStsTyp(oldR.pr_sts_typ()));
					tmpR.io_schd_no(r.xfr_alloc_sts_no());
					delL.add(tmpR);
				}
			}
			if (isNull(delL)) {
				return ;
			}
			MSBEL_IoSchdService.IoSchd_Del01 op = MSBEL_IoSchdService.crtIoSchd_Del01();
			op.up0().setAll(delL);
			op.exec();
			
		}
		
		protected String getIoSchdStsTyp(String prStsTyp) {
			if (MSC_PR_STS_TYP.isNOT_INST(prStsTyp)) {
				return MSC_IO_SCHD_STS_TYP.SCHD.value();
			}
			else if (MSC_PR_STS_TYP.isINST(prStsTyp)) {
				return MSC_IO_SCHD_STS_TYP.ORD.value();
			}
			return null;
		}

		protected Map_MSW_ALLOC_LOC_MAP_R_XfrSchdChk02_DtlR<MSW_ALLOC_LOC_MAP_R, XfrSchdChk02_DtlR> createMap_MSW_ALLOC_LOC_MAP_R_XfrSchdChk02_DtlR() {
			return new Map_MSW_ALLOC_LOC_MAP_R_XfrSchdChk02_DtlR<MSW_ALLOC_LOC_MAP_R, XfrSchdChk02_DtlR>();
		}

		public class Map_MSW_ALLOC_LOC_MAP_R_XfrSchdChk02_DtlR<D extends MSW_ALLOC_LOC_MAP_R, S extends XfrSchdChk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, XfrSchdChk02_DtlR.$itm_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, XfrSchdChk02_DtlR.$itm_sub1);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, XfrSchdChk02_DtlR.$itm_sub2);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, XfrSchdChk02_DtlR.$itm_sub3);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_loc_cd, XfrSchdChk02_DtlR.$gi_loc_cd);
			}
		}
		
		protected Map_Srch_TgtR_XfrSchdChk02_DtlR<Srch_TgtR,XfrSchdChk02_DtlR> createMap_Srch_TgtR_XfrSchdChk02_DtlR() {
			return new Map_Srch_TgtR_XfrSchdChk02_DtlR<Srch_TgtR, XfrSchdChk02_DtlR>();
		}
		
		public class Map_Srch_TgtR_XfrSchdChk02_DtlR<D extends Srch_TgtR, S extends XfrSchdChk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				MAM_ITM_R itmDbc = itmCache().get(src.itm_cd(), src.itm_sub1(),
						src.itm_sub2(), src.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitDbc = itmUnitCache().get(src.itm_cd(),
						src.itm_sub1(), src.itm_sub2(), src.itm_sub3(),
						src.trd_unit_cd());
				if (itmDbc.pack_alloc_flg() && itmUnitDbc.pack_flg()) {
					dest.pack_unit_cd(src.trd_unit_cd());
					dest.pack_unit_qty(src.trd_unit_qty());
				}
				
				dest.not_lot_fix_flg(src.getBooleanNE("not_lot_fix_flg"));
				if (src.getBooleanNE("except_alloc_wait_flg")) {
					dest.except_alloc_wait_flg(true);
				}
				dest.gi_schd_dt(src.xfr_schd_dt());
				dest.io_schd_typ(getIoSchdTypForMove(src.trd_ptn_typ()));
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_TgtR.$peg_no, XfrSchdChk02_DtlR.$peg_no);
				addColumnPathMap(Srch_TgtR.$itm_cd, XfrSchdChk02_DtlR.$itm_cd);
				addColumnPathMap(Srch_TgtR.$itm_sub1, XfrSchdChk02_DtlR.$itm_sub1);
				addColumnPathMap(Srch_TgtR.$itm_sub2, XfrSchdChk02_DtlR.$itm_sub2);
				addColumnPathMap(Srch_TgtR.$itm_sub3, XfrSchdChk02_DtlR.$itm_sub3);
				addColumnPathMap(Srch_TgtR.$ver_no, XfrSchdChk02_DtlR.$ver_no);
				addColumnPathMap(Srch_TgtR.$gi_loc_cd, XfrSchdChk02_DtlR.$gi_loc_cd);
				addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, XfrSchdChk02_DtlR.$gi_str_ln_cd);
				addColumnPathMap(Srch_TgtR.$gi_stk_arrv_bp_cd, XfrSchdChk02_DtlR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(Srch_TgtR.$gr_loc_cd, XfrSchdChk02_DtlR.$gr_loc_cd);
				addColumnPathMap(Srch_TgtR.$gr_str_ln_cd, XfrSchdChk02_DtlR.$gr_str_ln_cd);
				addColumnPathMap(Srch_TgtR.$quality_typ, XfrSchdChk02_DtlR.$quality_typ);
				addColumnPathMap(Srch_TgtR.$stk_id_typ, XfrSchdChk02_DtlR.$stk_id_typ);
				addColumnPathMap(Srch_TgtR.$stk_bp_cd, XfrSchdChk02_DtlR.$stk_bp_cd);
				addColumnPathMap(Srch_TgtR.$gd_cd, XfrSchdChk02_DtlR.$gd_cd);
				addColumnPathMap(Srch_TgtR.$lot_no, XfrSchdChk02_DtlR.$lot_no);
				addColumnPathMap(Srch_TgtR.$sublot_no, XfrSchdChk02_DtlR.$sublot_no);
				addColumnPathMap(Srch_TgtR.$sno1, XfrSchdChk02_DtlR.$alloc_sno1);
				addColumnPathMap(Srch_TgtR.$sno2, XfrSchdChk02_DtlR.$alloc_sno2);
				addColumnPathMap(Srch_TgtR.$sno3, XfrSchdChk02_DtlR.$alloc_sno3);
				addColumnPathMap(Srch_TgtR.$sno4, XfrSchdChk02_DtlR.$alloc_sno4);
				addColumnPathMap(Srch_TgtR.$base_unit_cd, XfrSchdChk02_DtlR.$base_unit_cd);
				addColumnPathMap(Srch_TgtR.$base_unit_qty, XfrSchdChk02_DtlR.$base_unit_qty);
				addColumnPathMap(Srch_TgtR.$not_lot_mix_flg, XfrSchdChk02_DtlR.$not_lot_mix_flg);
				addColumnPathMap(Srch_TgtR.$not_sublot_mix_flg, XfrSchdChk02_DtlR.$not_sublot_mix_flg);
				addColumnPathMap(Srch_TgtR.$vld_dt_fr, XfrSchdChk02_DtlR.$vld_dt_fr);
				addColumnPathMap(Srch_TgtR.$vld_dt_to, XfrSchdChk02_DtlR.$vld_dt_to);
				addColumnPathMap(Srch_TgtR.$sno1_null_flg, XfrSchdChk02_DtlR.$sno1_null_flg);
				addColumnPathMap(Srch_TgtR.$sno2_null_flg, XfrSchdChk02_DtlR.$sno2_null_flg);
				addColumnPathMap(Srch_TgtR.$sno3_null_flg, XfrSchdChk02_DtlR.$sno3_null_flg);
				addColumnPathMap(Srch_TgtR.$sno4_null_flg, XfrSchdChk02_DtlR.$sno4_null_flg);
				addColumnPathMap(Srch_TgtR.$gi_lg_grp_cd, XfrSchdChk02_DtlR.$lg_grp_cd);
			}
		}
		/**
		 * 対象の品目、物流Gで総量引当している出庫予定を取得する
		 * @param ioSchdL
		 * @param allocL
		 */
		protected void getDelTgtIoSchd(MCList<MST_IO_SCHD_R> ioSchdL,
				MCList<XfrSchdChk02_DtlR> allocL) {
			MCList<XfrSchdChk02_DtlR> grpL = allocL.groupBy(XfrSchdChk02_DtlR.$itm_cd,
					XfrSchdChk02_DtlR.$itm_sub1, XfrSchdChk02_DtlR.$itm_sub2,
					XfrSchdChk02_DtlR.$itm_sub3, XfrSchdChk02_DtlR.$lg_grp_cd);

			MST_IO_SCHD_R t = MST_IO_SCHD_R.create("T");
			MCQueryApiBuilder ioSchdL_bldr = MCQueryApiBuilder.create(t);
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			ioSchdL_bldr.setSelect(t.io_schd_no, t.io_schd_typ, t.io_schd_sts_typ);
			ioSchdL_bldr.addInnerJoin(m1, bracket(m1.loc_cd.eq(t.loc_cd)));
			ioSchdL_bldr.setWhere(m1.lg_grp_cd.eq(bind("lg_grp_cd")));
			ioSchdL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			ioSchdL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			ioSchdL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			ioSchdL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			ioSchdL_bldr.addWhereWithAnd(t.alloc_scope_typ.eq(value(MAC_ALLOC_SCOPE_TYP.ALLOC_GRP.value())));
			dbSelect("MSBEL5200_MST_IO_SCHD_S01", ioSchdL, ioSchdL_bldr, grpL);
		}
		
		protected Map_Srch_Io_SchdR_MST_IO_SCHD_R<Srch_Io_SchdR,MST_IO_SCHD_R> createMap_Srch_Io_SchdR_MST_IO_SCHD_R() {
			return new Map_Srch_Io_SchdR_MST_IO_SCHD_R<Srch_Io_SchdR, MST_IO_SCHD_R>();
		}
		
		public class Map_Srch_Io_SchdR_MST_IO_SCHD_R<D extends Srch_Io_SchdR, S extends MST_IO_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_Io_SchdR.$io_schd_typ, MST_IO_SCHD_R.$io_schd_typ);
				addColumnPathMap(Srch_Io_SchdR.$io_schd_sts_typ, MST_IO_SCHD_R.$io_schd_sts_typ);
				addColumnPathMap(Srch_Io_SchdR.$io_schd_no, MST_IO_SCHD_R.$io_schd_no);
			}
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}


	/**
	 * XfrSchd_Chk04オペレーション.<p>
	 *
	 * 更新対象の移動・移送予定の進捗をチェックする。配送先が定まるかをチェックする。<br>
	 */
	public class XfrSchd_Chk04 extends MSBEL_XfrSchdService_MC_A.XfrSchd_Chk04 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initXfrSchdCache(up0());
			editUp();
			editUpShip();
			chkXfrSchd();
			chkProvSchd();
			editUpProv();
			chkXfrAlloc();
			chkShipSchd();
			chkItmAlloc();
			setDown();
		}

		protected void setDown() {
			down0().setAll(up0());
		}


		protected void initCache() {
			initTrdCdCache();
			initGiDefLocCache(up0());
			initDefLoc();
			initGiLocCache(up0());
			initGrLocCache(up0());
			initItmCache(up0());
			initItmUnitCache(up0());
			initTrdCache(up0());
			initSloDCache(up0());
		}

		protected void initDefLoc() {
			initItmLgGrpLocCache(up0());
			for(XfrSchdChk04_DtlR upR : up0()) {
				if(!isNull(upR.gi_loc_cd())) {
					upR.gi_def_loc_cd(upR.gi_loc_cd());
				}
				else {
					MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpLocCache().get(upR.itm_cd(),
							upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(),
							upR.gi_lg_grp_cd());
					MAM_LG_GRP_R lgGrpR = giDefLocCache().get(upR.gi_lg_grp_cd());
					upR.gi_def_loc_cd(!itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd()
							: !lgGrpR.isEmpty() ? lgGrpR.getString("loc_cd") : null);
				}
			}
		}

		protected void editUp() {
			editDeleteUp(up0().subList(r->MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
			editUpdateUp(up0().subList(r->MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())));
			initCache();
			editUpCmmn();
		}

		protected void editDeleteUp(MCList<XfrSchdChk04_DtlR> delL) {
			for(XfrSchdChk04_DtlR delR : delL) {
				MST_XFR_SCHD_R schdR = getXfrSchdCache().getFirst(delR);
				if (schdR == null) {
					delR.err_flg(true);
				}
				else {
					delR.xs(schdR);
				}
			}
		}

		protected void editUpdateUp(MCList<XfrSchdChk04_DtlR> updL) {
			for(XfrSchdChk04_DtlR updR : updL) {
				MST_XFR_SCHD_R schdR = getXfrSchdCache().getFirst(updR);
				if (schdR == null) {
					updR.err_flg(true);
				}
				else {
					editUpdateUpChk04AndUpd01(updR.xs(), schdR);
				}
			}
		}

		protected void editUpCmmn() {
			int i = 0;
			for(XfrSchdChk04_DtlR upR : up0()) {
				i++;
				upR.wk_peg_no(i);
				i++;
				upR.wk_ret_peg_no(i);
				
				if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					continue;
				}
				
				editUpChk04AndUpd01(upR.xs(), up1().screen_flg(), up1().file_imp_flg());
			}
		}
		
		protected void editUpShip() {
			MCList<XfrSchdChk04_DtlR> insUpdShipL = up0().subList(r -> !r.err_flg()
					&& isShipR(r) && !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (isNull(insUpdShipL)) {
				return ;
			}
			
			initLgCtlCache(insUpdShipL);
			for(XfrSchdChk04_DtlR upR : insUpdShipL) {
				editUpChk04AndUpd01ShipTo(upR.xs(), up1().screen_flg());
			}
			
			
			insUpdShipL = insUpdShipL.subList(r->!r.err_flg());
			initShipDtCache(insUpdShipL, up1());
			for(XfrSchdChk04_DtlR upR : insUpdShipL) {
				editUpChk04AndUpd01ShipDt(upR.xs());
				if (isNullOr(upR.ship_schd_tm(), upR.dlv_schd_tm())) {
					// 物流制御マスタが存在しない場合
					upR.err_flg(true);
				}
			}
			
			
			insUpdShipL = insUpdShipL.subList(r->!r.err_flg());
			initTdlvCache(insUpdShipL);
			initGrLocAddrCache(insUpdShipL);
			for(XfrSchdChk04_DtlR upR : insUpdShipL) {
				editUpChk04AndUpd01ShipToAddr(upR.xs(), up1().screen_flg(), up1().file_imp_flg());
			}
			
			
		}
		
		protected void chkXfrSchd() {
			for (XfrSchdChk04_DtlR r : up0()) {
				MCMessageList msgL = new MCMessageList();
				msgL.addAll(check(r, XfrSchdChk04_DtlR.$peg_no, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, XfrSchdChk04_DtlR.$data_crud_typ, new FXUCL_RequiredValidater()));
				
				// 削除のみ
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					msgL.addAll(check(r, new String[] {
							XfrSchdChk04_DtlR.$xfr_schd_no, XfrSchdChk04_DtlR.$xfr_src_no
					}, new FXUCL_AtLeastOneValidater()));
				}
				else {
					// 新規更新のみ
					if (isNullOr(r.trd_cd(), r.trd_ptn_typ())) {
						// マスタで自動補完できなかったケース
						msgL.add(new MCMessage(r, XfrSchdChk04_DtlR.$trd_cd, MSBEL0252,
								r.trd_ptn_typ(), toDispGUIIndex(r)));
					}
					msgL.addAll(check(r, XfrSchdChk04_DtlR.$itm_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, XfrSchdChk04_DtlR.$itm_sub1, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, XfrSchdChk04_DtlR.$itm_sub2, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, XfrSchdChk04_DtlR.$itm_sub3, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, XfrSchdChk04_DtlR.$gr_loc_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, new String[] {
							XfrSchdChk04_DtlR.$gi_loc_cd, XfrSchdChk04_DtlR.$gi_lg_grp_cd
					}, new FXUCL_AtLeastOneValidater()));
					msgL.addAll(check(r, new String[] {
							XfrSchdChk04_DtlR.$gi_rqst_tm, XfrSchdChk04_DtlR.$gr_rqst_tm
					}, new FXUCL_AtLeastOneValidater()));
					if (isNullOr(r.gi_lg_grp_cd(), r.gr_lg_grp_cd())) {
						r.err_flg(true); // マスタが無効なケース
					}
					if (isSame(r.gi_loc_cd(), r.gr_loc_cd()) && isSame(r.gi_str_ln_cd(), r.gr_str_ln_cd())) {
						msgL.add(new MCMessage(r, XfrSchdChk04_DtlR.$gi_loc_cd, MSBEL0254, toDispGUIIndex(r)));
					}
					if (isNullAnd(r.gi_loc_cd(), r.gi_def_loc_cd())) {
						msgL.add(new MCMessage(r, XfrSchdChk04_DtlR.$gi_loc_cd, MSBEL0268, r.gi_lg_grp_cd(), toDispGUIIndex(r)));
					}
					
					
					if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
						msgL.addAll(check(r, XfrSchdChk04_DtlR.$gi_loc_cd, new FXUCL_RequiredValidater()));
					}
					
					MAM_ITM_R itmCacheR = itmCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					if (MAC_STK_MNG_TYP.isMNG(itmCacheR.stk_mng_typ())) {
						if (MAC_ASSET_MNG_TYP.isNOT_MNG(itmCacheR.asset_mng_typ())) {
							if (MAC_PROV_TYP.isONR_PROV(r.prov_typ()) || MAC_PROV_TYP.isONR_PROV(r.ret_prov_typ())) {
								msgL.add(new MCMessage(r, XfrSchdChk04_DtlR.$itm_cd, MSBEL0251,
										toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
							}
						}
					}
					else {
						msgL.add(new MCMessage(r, XfrSchdChk04_DtlR.$itm_cd, MSBEL0250,
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
					}

					
					// 更新のみ
					if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						msgL.addAll(check(r, XfrSchdChk04_DtlR.$xfr_schd_no, new FXUCL_RequiredValidater()));
						
						MST_XFR_SCHD_R oldR = getXfrSchdCache().getFirst(r);
						if (isXfrR(oldR) && isShipR(r) || isXfrR(r) && isShipR(oldR)) {
							msgL.add(new MCMessage(r, null, MSBEL0255, toDispGUIIndex(r)));
						}
						if (!isSame(r.trd_ptn_typ(), oldR.trd_ptn_typ())) {
							msgL.add(new MCMessage(r, XfrSchdChk04_DtlR.$trd_cd, MSBEL0263, toDispGUIIndex(r)));
						}
					}
					
				}
				if (!msgL.isEmpty()) {
					r.err_flg(true);
					MCMessagePool.addAll(msgL);
				}
				
			}
			
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(
					check(up0().subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())),
							XfrSchdChk04_DtlR.$peg_no, new FXUCL_DuplicateValidater()));
			if (!msgL.isEmpty()) {
				for (XfrSchdChk04_DtlR r : up0()) {
					r.err_flg(true);
				}
				MCMessagePool.addAll(msgL);
			}
			
		}
		
		protected void chkXfrAlloc() {
			MCList<XfrSchdChk04_DtlR> xfrL = up0().subList(r->!r.err_flg() && isXfrR(r));
			if (isNull(xfrL)) {
				return ;
			}
			
			MSBEL_XfrSchdService.XfrSchd_Chk02 ope = MSBEL_XfrSchdService.crtXfrSchd_Chk02();

			for (XfrSchdChk04_DtlR upR : xfrL) {
				XfrSchdChk02_DtlR r = XfrSchdChk02_DtlR.create();
				copy(r, upR, createMap_XfrSchdChk02_DtlR_XfrSchdChk04_DtlR());
				ope.up1().schd_flg(true);
				ope.up0().add(r);
			}
			ope.exec();
			copyErrFlg(xfrL, ope.down0());
			ope.down0().addBooleanColumn("xfr_inst_flg");
			ope.down0().addBooleanColumn("xfr_act_flg");
			String[] destCols = {XfrSchdChk04_DtlR.$inst_flg, XfrSchdChk04_DtlR.$act_flg};
			String[] srcCols = {"xfr_inst_flg", "xfr_act_flg"};
			copyByPegNo(xfrL, destCols, ope.down0(), srcCols);
		}

		protected void chkShipSchd() {
			MCList<XfrSchdChk04_DtlR> shipL = up0().subList(r->!r.err_flg() && isShipR(r));
			if (isNull(shipL)) {
				return ;
			}
			
			MSBEL_ShipSchdService.ShipSchd_Chk01 shipOpe = MSBEL_ShipSchdService.crtShipSchd_Chk01();
			for(XfrSchdChk04_DtlR upR : shipL) {
				ShipPr_DtlR shipPrR = ShipPr_DtlR.create();
				copy(shipPrR, upR, createMap_ShipPr_DtlR_XfrSchdChk04_DtlR());

				if(!MAC_DATA_CRUD_TYP.isCRT(shipPrR.data_crud_typ())) {
					shipPrR.ship_pr_no(getXfrSchdCache().getFirst(upR).getString("ship_pr_no"));
				}

				shipOpe.up0().add(shipPrR);
			}
			shipOpe.exec();
			copyErrFlg(shipL, shipOpe.down0());
			String[] destCols = {XfrSchdChk04_DtlR.$inst_flg, XfrSchdChk04_DtlR.$act_flg};
			String[] srcCols = {ShipPr_DtlR.$ship_inst_flg, ShipPr_DtlR.$ship_act_flg};
			copyByPegNo(shipL, destCols, shipOpe.down0(), srcCols);
		}

		/**
		 * 支給予定の更新前チェック
		 */
		protected void chkProvSchd() {
			MCList<XfrSchdChk04_DtlR> subL = up0().subList(r->!r.err_flg() && isProvR(r));
			if(isNull(subL)) {
				return;
			}

			MCList<XfrSchdChk04_DtlR> provL = MCList.create(XfrSchdChk04_DtlR.class);
			MCList<XfrSchdChk04_DtlR> retProvL = MCList.create(XfrSchdChk04_DtlR.class);

			for(XfrSchdChk04_DtlR subR : subL) {
				if (MAC_DATA_CRUD_TYP.isDEL(subR.data_crud_typ())) {
					continue;
				}
				
				MAM_LOC_R grLoc = grLocCache().getEx(subR.gr_loc_cd());
				MAM_LOC_R giLoc = giLocCache().getEx(subR.gi_def_loc_cd());

				if(isProv(giLoc.sppl_cd(), grLoc.sppl_cd())) {
					provL.add(subR);
				}
				else if(isProvRtn(giLoc.sppl_cd(), grLoc.sppl_cd())) {
					retProvL.add(subR);
				}
				else if(isProvDD(giLoc.sppl_cd(), grLoc.sppl_cd())) {
					provL.add(subR);
					XfrSchdChk04_DtlR tmpR = subR.clone();
					tmpR.trd_cd(null);	// 返品の取引CDは支給予定SV内で取得する
					retProvL.add(tmpR);
				}
			}
			
			if (isNull(provL) && isNull(retProvL)) {
				return ;
			}
			
			MSBEL_ProvSchdService.ProvSchd_Chk01 ope = MSBEL_ProvSchdService.crtProvSchd_Chk01();
			addAll(ope.up0(), provL, createMap_ProvSchd_DtlR_XfrSchdChk04_DtlR());
			addAll(ope.up0(), retProvL, createMap_RetProvSchd_DtlR_XfrSchdChk04_DtlR());
			ope.exec();
			copyErrFlg(subL, ope.down0(), XfrSchdChk04_DtlR.$wk_peg_no, ProvSchd_DtlR.$peg_no);
			copyErrFlg(subL, ope.down0(), XfrSchdChk04_DtlR.$wk_ret_peg_no, ProvSchd_DtlR.$peg_no);
			
		}

		
		protected void editUpProv() {
			if (!up1().screen_flg()) {
				return ;
			}
			
			MCList<MST_XFR_SCHD_R> provL = MCList.create(MST_XFR_SCHD_R.class);
			for (XfrSchdChk04_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || !isProvR(r) || r.err_flg()) {
					continue;
				}
				provL.add(r.xs());
			}
			
			callProvSchdServiceSprt01(provL, up1().screen_flg(),up1().file_imp_flg());
		}
		
		protected MCList<MST_SHIP_ALLOC_STS_R> getShipAlloc(MCList<XfrSchdChk04_DtlR> tgtL) {
			MCList<XfrSchdChk04_DtlR> cndL = tgtL.createInstance();
			for (XfrSchdChk04_DtlR r : tgtL) {
				if (!isNull(r.xfr_schd_no())) {
					cndL.add(r);
				}
			}
			
			MCList<MST_SHIP_ALLOC_STS_R> srchStkL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_PR_R shipPr = MST_SHIP_PR_R.create("SHIP_PR");
			MST_SHIP_SCHD_R shipSchd = MST_SHIP_SCHD_R.create("SHIP_SCHD");
			MST_SHIP_ALLOC_STS_R shipAlloc = MST_SHIP_ALLOC_STS_R.create("SHIP_ALLOC");
			MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(shipPr);
			
			xfrSchdL_bldr.setSelect(shipPr.xfr_schd_no, shipAlloc.alloc_flg, shipAlloc.base_unit_qty);
			xfrSchdL_bldr.addInnerJoin(shipSchd, bracket(shipPr.ship_pr_no.eq(shipSchd.ship_pr_no)));
			xfrSchdL_bldr.addInnerJoin(shipAlloc, bracket(shipSchd.ship_schd_no.eq(shipAlloc.ship_schd_no)));
			xfrSchdL_bldr.setWhere(shipPr.xfr_schd_no.eq(bind("xfr_schd_no")));
			dbSelect("MSBEL5200_MST_XFR_SCHD_S05", srchStkL, xfrSchdL_bldr, cndL);
			
			return srchStkL;
		}
		
		protected MCList<Srch_TgtR> setStkAlloc(MCList<XfrSchdChk04_DtlR> tgtL) {
			MCList<Srch_TgtR> alcL = MCList.create(Srch_TgtR.create());
			MCList<MST_XFR_ALLOC_STS_R> xfrAllocL = null;
			MCNumber sumAllocQty = null;
			
			MCList<MST_SHIP_ALLOC_STS_R> shipAllocCacheL = getShipAlloc(tgtL);
			MCIndexKey shipAllocIdxKey = shipAllocCacheL.createIndex(MST_SHIP_PR_R.$xfr_schd_no, MST_SHIP_ALLOC_STS_R.$alloc_flg);
			MCList<MST_SHIP_ALLOC_STS_R> shipAllocL = null;
			
			for (XfrSchdChk04_DtlR dtlR : tgtL) {
				Srch_TgtR alcR = Srch_TgtR.create();
				copy(alcR, dtlR, createMap_Srch_TgtR_XfrSchdChk04_DtlR());
				
				if (isSame(dtlR.gi_lg_grp_cd(), dtlR.gr_lg_grp_cd())) {
					// 移動の場合は移動引当状況を取得
					xfrAllocL = getXfrAllocCache().subListAllocFlgIdx(dtlR.xs().xfr_schd_no(), true);
					if (isNull(xfrAllocL)) {
						alcL.add(alcR);
						continue;
					}
					sumAllocQty = xfrAllocL.sum(MST_XFR_ALLOC_STS_R.$base_unit_qty);
				} else {
					// 移送の場合は出荷引当状況を取得
					shipAllocL = shipAllocCacheL.subList(shipAllocIdxKey, dtlR.xs().xfr_schd_no(), true);
					if (isNull(shipAllocL)) {
						alcL.add(alcR);
						continue;
					}
					sumAllocQty = shipAllocL.sum(MST_SHIP_ALLOC_STS_R.$base_unit_qty);
				}
				
				if (dtlR.base_unit_qty().gt(sumAllocQty)) {
					// 一部引当のとき
					MAVM_ITM_UNIT_R itmUnit = itmUnitCache().get(
							dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
					alcR.base_unit_qty(sumAllocQty);
					if (itmUnit.pack_flg()) {
						alcR.pack_unit_qty(rvrsBaseUnitConv(alcR.base_unit_qty(), itmUnit.conv_base_qty(), itmUnit.conv_qty(),
								itmUnit.dec_place(), itmUnit.rnd_typ()));
					}
					alcR.except_alloc_wait_flg(true);
					
					Srch_TgtR alcWaitR = alcR.clone();
					alcWaitR.base_unit_qty(dtlR.base_unit_qty().subtract(sumAllocQty));
					if (itmUnit.pack_flg()) {
						alcWaitR.pack_unit_qty(rvrsBaseUnitConv(alcWaitR.base_unit_qty(), itmUnit.conv_base_qty(), itmUnit.conv_qty(),
								itmUnit.dec_place(), itmUnit.rnd_typ()));
					}
					alcWaitR.except_alloc_wait_flg(false);
					alcL.add(alcWaitR);
				} else {
					// 全数引当済みのとき
					alcR.except_alloc_wait_flg(true);
				}
				alcL.add(alcR);
			}
			return alcL;
		}
		
		/**
		 * 引当可能数チェック
		 */
		protected void chkItmAlloc() {
			if (!up1().alloc_check_exec_flg() || !up1().screen_flg()) {
				return ;
			}
			MCList<XfrSchdChk04_DtlR> notErrL = up0().subList(r->!r.err_flg());
			MCList<XfrSchdChk04_DtlR> allocL = 
					notErrL.subList(r->r.alloc_flg() && !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (isNull(allocL)) {
				return ;
			}
			cmpNotLotFixFlg(allocL);
			
			MCList<XfrSchdChk04_DtlR> itmLocL = allocL.groupBy(
					XfrSchdChk04_DtlR.$itm_cd, XfrSchdChk04_DtlR.$itm_sub1,
					XfrSchdChk04_DtlR.$itm_sub2, XfrSchdChk04_DtlR.$itm_sub3,
					XfrSchdChk04_DtlR.$gi_def_loc_cd);
			
			MSBEL_AllocMngService.Alloc_Lock_Upd01 lockOpe = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			addAll(lockOpe.up0(), itmLocL, createMap_MSW_ALLOC_LOC_MAP_R_XfrSchdChk04_DtlR());
			lockOpe.exec();
			
			MSBEL_AllocMngService.Alloc_Srch01 allocOpe = MSBEL_AllocMngService.crtAlloc_Srch01();
			allocOpe.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			allocOpe.up0().dtl_flg(true);
			allocOpe.up1().addAll(setStkAlloc(allocL));

			for (XfrSchdChk04_DtlR r : notErrL) {
				if (!isNull(r.xfr_schd_no())) {
					if (!isNull(r.xs().inpt_schd_no()) && !r.xs().rqst_can_flg() && !r.alloc_flg()) {
						// 投入に紐づく、かつ場所引当ＦＬＧがオフのときは、up4に追加しない
						continue;
					}
					MSW_IO_SCHD_DEL_R tmpR = MSW_IO_SCHD_DEL_R.create();
					tmpR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.XFR_SCHD_NO.value());
					tmpR.io_schd_sub_no1(r.xfr_schd_no());
					allocOpe.up4().add(tmpR);
				}
			}
			// 総量引当によって作成された出庫予定は引当管理サービス内では存在しない受払予定として扱うよう連携する
			MCList<MST_IO_SCHD_R> ioSchdL = MCList.create(MST_IO_SCHD_R.class);
			getDelTgtIoSchd(ioSchdL, allocL);
			
			addAll(allocOpe.up4(), ioSchdL, createMap_MSW_IO_SCHD_DEL_R_MST_IO_SCHD_R());
			
			// 投入予定と紐づく移動予定に対して再引当ができるよう、上り電文を編集する
			MCList<Srch_StkR> srchStkL = MCList.create(Srch_StkR.class);
			editAllocSrch01Up2(srchStkL, allocL);
			allocOpe.up2().addAll(srchStkL);
			
			MCSortPolicy sp = new MCSortPolicy();
			// 出庫日が直近のものに対して優先して引当するために、日付でソートする
			sp.add(MCList.SortType.ASC, Srch_TgtR.$gi_schd_dt);
			allocOpe.up1().sort(sp);
			
			allocOpe.exec();

			MCGroupByPolicy grpKey = new MCGroupByPolicy();
			grpKey.addKey(Srch_RsltR.$peg_no);
			grpKey.addKey(Srch_RsltR.$lot_no);
			grpKey.addKey(Srch_RsltR.$sublot_no);
			grpKey.addKey(Srch_RsltR.$ver_no);
			grpKey.addKey(Srch_RsltR.$sno1);
			grpKey.addKey(Srch_RsltR.$sno2);
			grpKey.addKey(Srch_RsltR.$sno3);
			grpKey.addKey(Srch_RsltR.$sno4);
			grpKey.sum(Srch_RsltR.$pack_unit_qty, Srch_RsltR.$base_unit_qty);
			MCIndexKey idxkey = allocOpe.down0().createIndex(Srch_RsltR.$peg_no);
			MCIndexKey grpIdxKey = allocL.createIndex(
					XfrSchdChk04_DtlR.$gi_def_loc_cd, XfrSchdChk04_DtlR.$itm_cd,
					XfrSchdChk04_DtlR.$itm_sub1, XfrSchdChk04_DtlR.$itm_sub2, XfrSchdChk04_DtlR.$itm_sub3,
					XfrSchdChk04_DtlR.$gi_str_ln_cd, XfrSchdChk04_DtlR.$gi_stk_arrv_bp_cd,
					XfrSchdChk04_DtlR.$quality_typ, XfrSchdChk04_DtlR.$gd_cd,
					XfrSchdChk04_DtlR.$stk_id_typ, XfrSchdChk04_DtlR.$stk_bp_cd);
			for (XfrSchdChk04_DtlR r : allocL) {
				if (r.err_flg()) {
					continue;
				}
				MCList<Srch_RsltR> subL = allocOpe.down0().subList(idxkey, r.peg_no());
				MCNumber sumQty = nvl(subL.sum(Srch_RsltR.$base_unit_qty), MCNumber.ZERO);
				if (sumQty.lt(r.base_unit_qty())) {
					MCMessagePool.add(new MCMessage(r, null, MSBEL0197, toDispGUIIndex(r)));
					r.err_flg(true);
					MAM_ITM_R itmr = itmCache().get(r.itm_cd(), r.itm_sub1(),
							r.itm_sub2(), r.itm_sub3());
					MAVM_ITM_UNIT_R itmUnitR = itmUnitCache().get(r.itm_cd(),
							r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
					// 同じ出庫場所、品目の出庫予定もエラーとする
					for (XfrSchdChk04_DtlR rr : allocL.subList(grpIdxKey, r.toArray(grpIdxKey.getKeys()))) {
						if (rr != r
								&& (isNullOrNullVal(r.lot_no())
										|| isNullOrNullVal(rr.lot_no())
										|| r.lot_no().equals(rr.lot_no())
												&& r.sublot_no().equals(rr.sublot_no()))
								&& (r.sno1_null_flg() && isNullOrNullVal(rr.sno1())
										|| isNullOrNullVal(r.sno1()) && rr.sno1_null_flg()
										|| r.sno1().equals(rr.sno1()))
								&& (r.sno2_null_flg() && isNullOrNullVal(rr.sno2())
										|| isNullOrNullVal(r.sno2()) && rr.sno2_null_flg()
										|| r.sno2().equals(rr.sno2()))
								&& (r.sno3_null_flg() && isNullOrNullVal(rr.sno3())
										|| isNullOrNullVal(r.sno3()) && rr.sno3_null_flg()
										|| r.sno3().equals(rr.sno3()))
								&& (r.sno4_null_flg() && isNullOrNullVal(rr.sno4())
										|| isNullOrNullVal(r.sno4()) && rr.sno4_null_flg()
										|| r.sno4().equals(rr.sno4()))) {
							MAVM_ITM_UNIT_R itmUnitRr = itmUnitCache().get(rr.itm_cd(),
									rr.itm_sub1(), rr.itm_sub2(), rr.itm_sub3(),
									rr.trd_unit_cd());
							if(itmr.pack_alloc_flg()) {
								String unit_cd_r = itmUnitR.pack_flg() ? r.trd_unit_cd() : r.base_unit_cd();
								String unit_cd_rr = itmUnitRr.pack_flg() ? rr.trd_unit_cd() : rr.base_unit_cd();
								if(unit_cd_r.equals(unit_cd_rr)) {
									MCMessagePool.add(new MCMessage(rr, null, MSBEL0197, toDispGUIIndex(rr)));
									rr.err_flg(true);
								}
							}
							else {
								MCMessagePool.add(new MCMessage(rr, null, MSBEL0197, toDispGUIIndex(rr)));
								rr.err_flg(true);
							}
						}
					}
				}
				else {
					if (!isNullOrNullVal(r.lot_no()) || !isNullOrNullVal(r.sublot_no())) {
						for (Srch_RsltR subR : subL) {
							subR.lot_no(r.lot_no());
							subR.sublot_no(r.sublot_no());
						}
					}
					MCList<Srch_RsltR> stkL = subL.groupBy(grpKey);
					for (Srch_RsltR stkR : stkL) {
						XfrSchdChk04_DtlR tmpR = XfrSchdChk04_DtlR.create();
						tmpR.peg_no(stkR.peg_no());
						tmpR.lot_no(stkR.lot_no());
						tmpR.sublot_no(stkR.sublot_no());
						tmpR.ver_no(stkR.ver_no());
						tmpR.sno1(stkR.sno1());
						tmpR.sno2(stkR.sno2());
						tmpR.sno3(stkR.sno3());
						tmpR.sno4(stkR.sno4());
						tmpR.base_unit_qty(stkR.base_unit_qty());
						
						MAM_ITM_R itmDbc = itmCache().get(r.itm_cd(), r.itm_sub1(),
								r.itm_sub2(), r.itm_sub3());
						MAVM_ITM_UNIT_R itmUnitDbc = itmUnitCache().get(r.itm_cd(),
								r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
								r.trd_unit_cd());
						if (itmDbc.pack_alloc_flg() && itmUnitDbc.pack_flg()) {
							tmpR.trd_unit_cd(r.trd_unit_cd());
							tmpR.trd_unit_qty(stkR.pack_unit_qty());
						}
						else {
							MCNumber trdUnitQty = null;
							MAVM_ITM_UNIT_R unitR = itmUnitCache().get(r.itm_cd(),
									r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
									r.trd_unit_cd());
							if (!isNull(unitR)) {
								trdUnitQty = rvrsBaseUnitConv(tmpR.base_unit_qty(),
										unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(),
										unitR.rnd_typ(), true);

							}
							if (isNull(trdUnitQty)) {
								tmpR.trd_unit_cd(r.base_unit_cd());
								tmpR.trd_unit_qty(r.base_unit_qty());
							}
							else {
								tmpR.trd_unit_cd(r.trd_unit_cd());
								tmpR.trd_unit_qty(trdUnitQty);
							}
						}

						down1().add(tmpR);
					}
				}
			}
		}
		
		protected void cmpNotLotFixFlg(MCList<XfrSchdChk04_DtlR> allocL) {
			allocL.addBooleanColumn("not_lot_fix_flg", true);
			boolean mfgAllocNotLotFixFlg = isSame(getSysParm("MFG_ALLOC_NOT_LOT_FIX_FLG"), "1");
			boolean sloAllocNotLotFixFlg = isSame(getSysParm("SLO_ALLOC_NOT_LOT_FIX_FLG"), "1");
			for (XfrSchdChk04_DtlR allocR : allocL) {
				if (!isNullOrNullVal(allocR.lot_no()) || !isNullOrNullVal(allocR.sublot_no())) {
					allocR.setBooleanNE("not_lot_fix_flg", false);
				}
				else if (allocR.not_lot_mix_flg() || allocR.not_sublot_mix_flg()) {
					MST_XFR_SCHD_R xfrSchdR = allocR.xs();
					if (!mfgAllocNotLotFixFlg && isSrcInpt(xfrSchdR)) {
						allocR.setBooleanNE("not_lot_fix_flg", false);
					}
					else if (!sloAllocNotLotFixFlg && isSrcSlo(xfrSchdR)) {
						allocR.setBooleanNE("not_lot_fix_flg", false);
					}
				}
			}
		}
		
		protected void delIoSchd(MCList<XfrSchdChk04_DtlR> notErrL) {
			MCList<MSW_IO_SCHD_DEL_R> delL = MCList.create(MSW_IO_SCHD_DEL_R.class);
			for (XfrSchdChk04_DtlR r : notErrL) {
				if (!isNull(r.xfr_schd_no())) {
					MSW_IO_SCHD_DEL_R tmpR = MSW_IO_SCHD_DEL_R.create();
					tmpR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.XFR_SCHD_NO.value());
					tmpR.io_schd_sub_no1(r.xfr_schd_no());
					delL.add(tmpR);
				}
			}
			if (isNull(delL)) {
				return ;
			}
			
			MSBEL_IoSchdService.IoSchd_Del02 ope = MSBEL_IoSchdService.crtIoSchd_Del02();
			ope.up0().setAll(delL);
			ope.exec();

		}
		
		protected Map_MSW_ALLOC_LOC_MAP_R_XfrSchdChk04_DtlR<MSW_ALLOC_LOC_MAP_R,XfrSchdChk04_DtlR> createMap_MSW_ALLOC_LOC_MAP_R_XfrSchdChk04_DtlR() {
			return new Map_MSW_ALLOC_LOC_MAP_R_XfrSchdChk04_DtlR<MSW_ALLOC_LOC_MAP_R, XfrSchdChk04_DtlR>();
		}

		public class Map_MSW_ALLOC_LOC_MAP_R_XfrSchdChk04_DtlR<D extends MSW_ALLOC_LOC_MAP_R, S extends XfrSchdChk04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, XfrSchdChk04_DtlR.$itm_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, XfrSchdChk04_DtlR.$itm_sub1);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, XfrSchdChk04_DtlR.$itm_sub2);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, XfrSchdChk04_DtlR.$itm_sub3);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_loc_cd, XfrSchdChk04_DtlR.$gi_def_loc_cd);
			}
		}
		
		protected Map_Srch_TgtR_XfrSchdChk04_DtlR<Srch_TgtR,XfrSchdChk04_DtlR> createMap_Srch_TgtR_XfrSchdChk04_DtlR() {
			return new Map_Srch_TgtR_XfrSchdChk04_DtlR<Srch_TgtR, XfrSchdChk04_DtlR>();
		}
		
		public class Map_Srch_TgtR_XfrSchdChk04_DtlR<D extends Srch_TgtR, S extends XfrSchdChk04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				MAM_ITM_R itmDbc = itmCache().get(src.itm_cd(), src.itm_sub1(),
						src.itm_sub2(), src.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitDbc = itmUnitCache().get(src.itm_cd(),
						src.itm_sub1(), src.itm_sub2(), src.itm_sub3(),
						src.trd_unit_cd());
				if (itmDbc.pack_alloc_flg() && itmUnitDbc.pack_flg()) {
					dest.pack_unit_cd(src.trd_unit_cd());
					dest.pack_unit_qty(src.trd_unit_qty());
				}
				
				dest.not_lot_fix_flg(src.getBooleanNE("not_lot_fix_flg"));
				
				if (isXfrR(src)) {
					dest.gi_schd_dt(nvl(src.gi_rqst_tm(), src.gr_rqst_tm()));
					dest.gr_schd_dt(dest.gi_schd_dt());
				}
				else {
					dest.gi_schd_dt(src.ship_schd_tm());
					dest.gr_schd_dt(src.dlv_schd_tm());
				}
				
				dest.io_schd_typ(getIoSchdTypForMove(src.trd_ptn_typ()));
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_TgtR.$peg_no, XfrSchdChk04_DtlR.$peg_no);
				addColumnPathMap(Srch_TgtR.$itm_cd, XfrSchdChk04_DtlR.$itm_cd);
				addColumnPathMap(Srch_TgtR.$itm_sub1, XfrSchdChk04_DtlR.$itm_sub1);
				addColumnPathMap(Srch_TgtR.$itm_sub2, XfrSchdChk04_DtlR.$itm_sub2);
				addColumnPathMap(Srch_TgtR.$itm_sub3, XfrSchdChk04_DtlR.$itm_sub3);
				addColumnPathMap(Srch_TgtR.$ver_no, XfrSchdChk04_DtlR.$ver_no);
				addColumnPathMap(Srch_TgtR.$gi_lg_grp_cd, XfrSchdChk04_DtlR.$gi_lg_grp_cd);
				addColumnPathMap(Srch_TgtR.$gi_loc_cd, XfrSchdChk04_DtlR.$gi_def_loc_cd);
				addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, XfrSchdChk04_DtlR.$gi_str_ln_cd);
				addColumnPathMap(Srch_TgtR.$gi_stk_arrv_bp_cd, XfrSchdChk04_DtlR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(Srch_TgtR.$gr_loc_cd, XfrSchdChk04_DtlR.$gr_loc_cd);
				addColumnPathMap(Srch_TgtR.$gr_str_ln_cd, XfrSchdChk04_DtlR.$gr_str_ln_cd);
				addColumnPathMap(Srch_TgtR.$quality_typ, XfrSchdChk04_DtlR.$quality_typ);
				addColumnPathMap(Srch_TgtR.$stk_id_typ, XfrSchdChk04_DtlR.$stk_id_typ);
				addColumnPathMap(Srch_TgtR.$stk_bp_cd, XfrSchdChk04_DtlR.$stk_bp_cd);
				addColumnPathMap(Srch_TgtR.$gd_cd, XfrSchdChk04_DtlR.$gd_cd);
				addColumnPathMap(Srch_TgtR.$lot_no, XfrSchdChk04_DtlR.$lot_no);
				addColumnPathMap(Srch_TgtR.$sublot_no, XfrSchdChk04_DtlR.$sublot_no);
				addColumnPathMap(Srch_TgtR.$sno1, XfrSchdChk04_DtlR.$sno1);
				addColumnPathMap(Srch_TgtR.$sno1_null_flg, XfrSchdChk04_DtlR.$sno1_null_flg);
				addColumnPathMap(Srch_TgtR.$sno2, XfrSchdChk04_DtlR.$sno2);
				addColumnPathMap(Srch_TgtR.$sno2_null_flg, XfrSchdChk04_DtlR.$sno2_null_flg);
				addColumnPathMap(Srch_TgtR.$sno3, XfrSchdChk04_DtlR.$sno3);
				addColumnPathMap(Srch_TgtR.$sno3_null_flg, XfrSchdChk04_DtlR.$sno3_null_flg);
				addColumnPathMap(Srch_TgtR.$sno4, XfrSchdChk04_DtlR.$sno4);
				addColumnPathMap(Srch_TgtR.$sno4_null_flg, XfrSchdChk04_DtlR.$sno4_null_flg);
				addColumnPathMap(Srch_TgtR.$base_unit_cd, XfrSchdChk04_DtlR.$base_unit_cd);
				addColumnPathMap(Srch_TgtR.$base_unit_qty, XfrSchdChk04_DtlR.$base_unit_qty);
				addColumnPathMap(Srch_TgtR.$not_lot_mix_flg, XfrSchdChk04_DtlR.$not_lot_mix_flg);
				addColumnPathMap(Srch_TgtR.$not_sublot_mix_flg, XfrSchdChk04_DtlR.$not_sublot_mix_flg);
				addColumnPathMap(Srch_TgtR.$vld_dt_fr, XfrSchdChk04_DtlR.$vld_dt_fr);
				addColumnPathMap(Srch_TgtR.$vld_dt_to, XfrSchdChk04_DtlR.$vld_dt_to);
				addColumnPathMap(Srch_TgtR.$ship_term_cd, XfrSchdChk04_DtlR.$ship_term_cd);
			}
		}
		/**
		 * 対象の品目、物流Gで総量引当している出庫予定を取得する
		 * @param ioSchdL
		 * @param allocL
		 */
		protected void getDelTgtIoSchd(MCList<MST_IO_SCHD_R> ioSchdL,
				MCList<XfrSchdChk04_DtlR> allocL) {
			// 移送が対象の場合は総量引当による出庫予定を除外しない
			MCList<XfrSchdChk04_DtlR> allocShipL = allocL.subList(r -> isShipR(r));
			if (!allocShipL.isEmpty()) {
				return;
			}
			MCList<XfrSchdChk04_DtlR> grpL = allocL.groupBy(XfrSchdChk04_DtlR.$itm_cd,
					XfrSchdChk04_DtlR.$itm_sub1, XfrSchdChk04_DtlR.$itm_sub2,
					XfrSchdChk04_DtlR.$itm_sub3, XfrSchdChk04_DtlR.$gi_lg_grp_cd);

			MST_IO_SCHD_R t = MST_IO_SCHD_R.create("T");
			MCQueryApiBuilder ioSchdL_bldr = MCQueryApiBuilder.create(t);
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			ioSchdL_bldr.setSelect(t.io_schd_sub_typ1, t.io_schd_sub_no1,
					t.io_schd_sub_typ2, t.io_schd_sub_no2, t.io_schd_sub_typ3,
					t.io_schd_sub_no3);
			ioSchdL_bldr.addInnerJoin(m1, bracket(m1.loc_cd.eq(t.loc_cd)));
			ioSchdL_bldr.setWhere(m1.lg_grp_cd.eq(bind("gi_lg_grp_cd")));
			ioSchdL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			ioSchdL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			ioSchdL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			ioSchdL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			ioSchdL_bldr.addWhereWithAnd(t.alloc_scope_typ.eq(value(MAC_ALLOC_SCOPE_TYP.ALLOC_GRP.value())));
			dbSelect("MSBEL5200_MST_IO_SCHD_S02", ioSchdL, ioSchdL_bldr, grpL);
		}
		
		protected Map_MSW_IO_SCHD_DEL_R_MST_IO_SCHD_R<MSW_IO_SCHD_DEL_R,MST_IO_SCHD_R> createMap_MSW_IO_SCHD_DEL_R_MST_IO_SCHD_R() {
			return new Map_MSW_IO_SCHD_DEL_R_MST_IO_SCHD_R<MSW_IO_SCHD_DEL_R, MST_IO_SCHD_R>();
		}
		
		public class Map_MSW_IO_SCHD_DEL_R_MST_IO_SCHD_R<D extends MSW_IO_SCHD_DEL_R, S extends MST_IO_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_sub_typ1, MST_IO_SCHD_R.$io_schd_sub_typ1);
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_sub_no1, MST_IO_SCHD_R.$io_schd_sub_no1);
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_sub_typ2, MST_IO_SCHD_R.$io_schd_sub_typ2);
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_sub_no2, MST_IO_SCHD_R.$io_schd_sub_no2);
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_sub_typ3, MST_IO_SCHD_R.$io_schd_sub_typ3);
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_sub_no3, MST_IO_SCHD_R.$io_schd_sub_no3);
			}
		}
		
		protected Map_ProvSchd_DtlR_XfrSchdChk04_DtlR<ProvSchd_DtlR,XfrSchdChk04_DtlR> createMap_ProvSchd_DtlR_XfrSchdChk04_DtlR() {
			return new Map_ProvSchd_DtlR_XfrSchdChk04_DtlR<ProvSchd_DtlR, XfrSchdChk04_DtlR>();
		}

		public class Map_ProvSchd_DtlR_XfrSchdChk04_DtlR<D extends ProvSchd_DtlR, S extends XfrSchdChk04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());

				MAM_LOC_R grLocCache = grLocCache().getEx(src.gr_loc_cd());
				dest.wg_cd(grLocCache.wg_cd());
				dest.prsppl_cd(grLocCache.sppl_cd());
				
				// 検収予定日
				if (isXfrR(src)) {
					// 移動
					dest.accpt_schd_dt(nvl(src.gi_rqst_tm(), src.gr_rqst_tm()));
				}
				else {
					MSW_SHIP_SCHD_DT_CALC_R calcR = getShipDtCache().getFirstByPegNo(src.peg_no());
					// 移送
					if (MAC_PROV_RCV_TYP.isNOT_ARR(grLocCache.getStringNE("prov_rcv_typ"))) {
						// 出荷基準の時は出荷予定日
						if(!isNull(calcR)) {
							dest.accpt_schd_dt(calcR.ship_schd_tm());
						}
						else {
							dest.accpt_schd_dt(src.ship_schd_tm());
						}
					}
					else {
						// 着荷基準の時は納品予定日
						if(!isNull(calcR)) {
							if (MAC_VIA_DLV_TYP.isVIA(src.via_dlv_typ())) {
								MAM_LG_CTL_R lgCtlGiTdlvR = getLgCtlCache().getGiGr(
										src.gi_lg_grp_cd(), src.gr_lg_grp_cd(),
										src.ship_term_cd());
								if(!isNull(lgCtlGiTdlvR)) {
									MCDate dt = calcR.ship_schd_tm().addDay(lgCtlGiTdlvR.xfr_lt());
									if (dt.ltDate(calcR.dlv_schd_tm())) {
										dest.accpt_schd_dt(calcR.dlv_schd_tm());
									}
									else {
										dest.accpt_schd_dt(dt);
									}
								}
								else {
									dest.accpt_schd_dt(calcR.dlv_schd_tm());
								}
							}
							else {
								dest.accpt_schd_dt(calcR.dlv_schd_tm());
							}
						}
						else {
							if (MAC_VIA_DLV_TYP.isVIA(src.via_dlv_typ())) {
								MAM_LG_CTL_R lgCtlGiTdlvR = getLgCtlCache().getGiGr(
										src.gi_lg_grp_cd(), src.gr_lg_grp_cd(),
										src.ship_term_cd());
								if(!isNull(lgCtlGiTdlvR)) {
									MCDate dt = src.ship_schd_tm().addDay(lgCtlGiTdlvR.xfr_lt());
									if (dt.ltDate(src.dlv_schd_tm())) {
										dest.accpt_schd_dt(src.dlv_schd_tm());
									}
									else {
										dest.accpt_schd_dt(dt);
									}
								}
								else {
									dest.accpt_schd_dt(src.dlv_schd_tm());
								}
							}
							else {
								dest.accpt_schd_dt(src.dlv_schd_tm());
							}
						}
					}
				}
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvSchd_DtlR.$peg_no, XfrSchdChk04_DtlR.$wk_peg_no);
				addColumnPathMap(ProvSchd_DtlR.$data_crud_typ, XfrSchdChk04_DtlR.$data_crud_typ);
				addColumnPathMap(ProvSchd_DtlR.$trd_cd, XfrSchdChk04_DtlR.$trd_cd);
				addColumnPathMap(ProvSchd_DtlR.$prov_typ, XfrSchdChk04_DtlR.$prov_typ);
				addColumnPathMap(ProvSchd_DtlR.$prov_basis_typ, XfrSchdChk04_DtlR.$prov_basis_typ);
				addColumnPathMap(ProvSchd_DtlR.$xrate, XfrSchdChk04_DtlR.$xrate);
				addColumnPathMap(ProvSchd_DtlR.$ptax_xrate, XfrSchdChk04_DtlR.$ptax_xrate);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_cd, XfrSchdChk04_DtlR.$trd_cur_cd);
				addColumnPathMap(ProvSchd_DtlR.$tax_cd, XfrSchdChk04_DtlR.$tax_cd);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_upri, XfrSchdChk04_DtlR.$trd_cur_upri);
				addColumnPathMap(ProvSchd_DtlR.$itm_cd, XfrSchdChk04_DtlR.$itm_cd);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub1, XfrSchdChk04_DtlR.$itm_sub1);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub2, XfrSchdChk04_DtlR.$itm_sub2);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub3, XfrSchdChk04_DtlR.$itm_sub3);
				addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, XfrSchdChk04_DtlR.$stk_id_typ);
				addColumnPathMap(ProvSchd_DtlR.$stk_arrv_bp_cd, XfrSchdChk04_DtlR.$gi_stk_arrv_bp_cd);
			}
		}

		protected Map_RetProvSchd_DtlR_XfrSchdChk04_DtlR<ProvSchd_DtlR,XfrSchdChk04_DtlR> createMap_RetProvSchd_DtlR_XfrSchdChk04_DtlR() {
			return new Map_RetProvSchd_DtlR_XfrSchdChk04_DtlR<ProvSchd_DtlR, XfrSchdChk04_DtlR>();
		}

		public class Map_RetProvSchd_DtlR_XfrSchdChk04_DtlR<D extends ProvSchd_DtlR, S extends XfrSchdChk04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());

				MAM_LOC_R giLocCache = giLocCache().getEx(src.gi_def_loc_cd());
				dest.wg_cd(giLocCache.wg_cd());
				dest.prsppl_cd(giLocCache.sppl_cd());
				
				// 検収予定日
				if (isXfrR(src)) {
					// 移動
					dest.accpt_schd_dt(nvl(src.gi_rqst_tm(), src.gr_rqst_tm()));
				}
				else {
					// 移送
					// 支給返品の検収予定日は出荷基準
					MSW_SHIP_SCHD_DT_CALC_R calcR = getShipDtCache().getFirstByPegNo(src.peg_no());
					if(!isNull(calcR)) {
						dest.accpt_schd_dt(calcR.ship_schd_tm());
					}
					else {
						dest.accpt_schd_dt(src.ship_schd_tm());
					}
				}
				
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvSchd_DtlR.$peg_no, XfrSchdChk04_DtlR.$wk_ret_peg_no);
				addColumnPathMap(ProvSchd_DtlR.$data_crud_typ, XfrSchdChk04_DtlR.$data_crud_typ);
				addColumnPathMap(ProvSchd_DtlR.$trd_cd, XfrSchdChk04_DtlR.$trd_cd);
				addColumnPathMap(ProvSchd_DtlR.$prov_typ, XfrSchdChk04_DtlR.$ret_prov_typ);
				addColumnPathMap(ProvSchd_DtlR.$prov_basis_typ, XfrSchdChk04_DtlR.$ret_prov_basis_typ);
				addColumnPathMap(ProvSchd_DtlR.$xrate, XfrSchdChk04_DtlR.$ret_xrate);
				addColumnPathMap(ProvSchd_DtlR.$ptax_xrate, XfrSchdChk04_DtlR.$ret_ptax_xrate);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_cd, XfrSchdChk04_DtlR.$ret_trd_cur_cd);
				addColumnPathMap(ProvSchd_DtlR.$tax_cd, XfrSchdChk04_DtlR.$ret_tax_cd);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_upri, XfrSchdChk04_DtlR.$ret_trd_cur_upri);
				addColumnPathMap(ProvSchd_DtlR.$itm_cd, XfrSchdChk04_DtlR.$itm_cd);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub1, XfrSchdChk04_DtlR.$itm_sub1);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub2, XfrSchdChk04_DtlR.$itm_sub2);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub3, XfrSchdChk04_DtlR.$itm_sub3);
				addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, XfrSchdChk04_DtlR.$stk_id_typ);
				addColumnPathMap(ProvSchd_DtlR.$stk_arrv_bp_cd, XfrSchdChk04_DtlR.$gi_stk_arrv_bp_cd);
			}
		}

		protected Map_XfrSchdChk02_DtlR_XfrSchdChk04_DtlR<XfrSchdChk02_DtlR,XfrSchdChk04_DtlR> createMap_XfrSchdChk02_DtlR_XfrSchdChk04_DtlR() {
			return new Map_XfrSchdChk02_DtlR_XfrSchdChk04_DtlR<XfrSchdChk02_DtlR, XfrSchdChk04_DtlR>();
		}

		public class Map_XfrSchdChk02_DtlR_XfrSchdChk04_DtlR<D extends XfrSchdChk02_DtlR, S extends XfrSchdChk04_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk02_DtlR.$peg_no, XfrSchdChk04_DtlR.$peg_no);
				addColumnPathMap(XfrSchdChk02_DtlR.$data_crud_typ, XfrSchdChk04_DtlR.$data_crud_typ);
				addColumnPathMap(XfrSchdChk02_DtlR.$xfr_schd_no, XfrSchdChk04_DtlR.$xfr_schd_no);
				addColumnPathMap(XfrSchdChk02_DtlR.$trd_ptn_typ, XfrSchdChk04_DtlR.$trd_ptn_typ);
				addColumnPathMap(XfrSchdChk02_DtlR.$trd_cd, XfrSchdChk04_DtlR.$trd_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$lg_grp_cd, XfrSchdChk04_DtlR.$gr_lg_grp_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$gi_loc_cd, XfrSchdChk04_DtlR.$gi_loc_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$gr_loc_cd, XfrSchdChk04_DtlR.$gr_loc_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$prov_typ, XfrSchdChk04_DtlR.$prov_typ);
				addColumnPathMap(XfrSchdChk02_DtlR.$prov_basis_typ, XfrSchdChk04_DtlR.$prov_basis_typ);
				addColumnPathMap(XfrSchdChk02_DtlR.$xrate, XfrSchdChk04_DtlR.$xrate);
				addColumnPathMap(XfrSchdChk02_DtlR.$ptax_xrate, XfrSchdChk04_DtlR.$ptax_xrate);
				addColumnPathMap(XfrSchdChk02_DtlR.$trd_cur_cd, XfrSchdChk04_DtlR.$trd_cur_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$tax_cd, XfrSchdChk04_DtlR.$tax_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$ret_prov_typ, XfrSchdChk04_DtlR.$ret_prov_typ);
				addColumnPathMap(XfrSchdChk02_DtlR.$ret_prov_basis_typ, XfrSchdChk04_DtlR.$ret_prov_basis_typ);
				addColumnPathMap(XfrSchdChk02_DtlR.$ret_xrate, XfrSchdChk04_DtlR.$ret_xrate);
				addColumnPathMap(XfrSchdChk02_DtlR.$ret_ptax_xrate, XfrSchdChk04_DtlR.$ret_ptax_xrate);
				addColumnPathMap(XfrSchdChk02_DtlR.$ret_tax_cd, XfrSchdChk04_DtlR.$ret_tax_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$itm_cd, XfrSchdChk04_DtlR.$itm_cd);
				addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub1, XfrSchdChk04_DtlR.$itm_sub1);
				addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub2, XfrSchdChk04_DtlR.$itm_sub2);
				addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub3, XfrSchdChk04_DtlR.$itm_sub3);
				addColumnPathMap(XfrSchdChk02_DtlR.$gi_def_loc_cd, XfrSchdChk04_DtlR.$gi_def_loc_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.xfr_schd_dt(nvl(src.gi_rqst_tm(), src.gr_rqst_tm()).trunc(MCDateFieldType.DAY));
			}
		}

		protected Map_ShipPr_DtlR_XfrSchdChk04_DtlR<ShipPr_DtlR,XfrSchdChk04_DtlR> createMap_ShipPr_DtlR_XfrSchdChk04_DtlR() {
			return new Map_ShipPr_DtlR_XfrSchdChk04_DtlR<ShipPr_DtlR, XfrSchdChk04_DtlR>();
		}

		public class Map_ShipPr_DtlR_XfrSchdChk04_DtlR<D extends ShipPr_DtlR, S extends XfrSchdChk04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.dlv_id_typ(MSC_SHIP_TO_ID_TYP.LOC.value());
				dest.dlv_id_cd(src.gr_loc_cd());
				dest.gd_cd(src.gd_cd());
				dest.quality_typ(src.quality_typ());

				// 条件付きの設定
				if(MAC_TRD_PTN_TYP.isPROV(dest.trd_ptn_typ())) {
					dest.loc_cd(src.gr_loc_cd());
				}
				else if(MAC_TRD_PTN_TYP.isPROV_RTN(dest.trd_ptn_typ())) {
					dest.loc_cd(src.gi_def_loc_cd());
				}

			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipPr_DtlR.$peg_no, XfrSchdChk04_DtlR.$peg_no);
				addColumnPathMap(ShipPr_DtlR.$data_crud_typ, XfrSchdChk04_DtlR.$data_crud_typ);
				addColumnPathMap(ShipPr_DtlR.$trd_cd, XfrSchdChk04_DtlR.$trd_cd);
				addColumnPathMap(ShipPr_DtlR.$trd_ptn_typ, XfrSchdChk04_DtlR.$trd_ptn_typ);
				addColumnPathMap(ShipPr_DtlR.$xfr_schd_no, XfrSchdChk04_DtlR.$xfr_schd_no);
				
				addColumnPathMap(ShipPr_DtlR.$ship_to_lg_grp_cd, XfrSchdChk04_DtlR.$ship_to_lg_grp_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_fr_lg_grp_cd, XfrSchdChk04_DtlR.$gi_lg_grp_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_to_id_typ, XfrSchdChk04_DtlR.$ship_to_id_typ);
				addColumnPathMap(ShipPr_DtlR.$ship_to_id_cd, XfrSchdChk04_DtlR.$ship_to_id_cd);
				addColumnPathMap(ShipPr_DtlR.$trd_unit_qty, XfrSchdChk04_DtlR.$trd_unit_qty);
				addColumnPathMap(ShipPr_DtlR.$trd_unit_cd, XfrSchdChk04_DtlR.$trd_unit_cd);
				addColumnPathMap(ShipPr_DtlR.$base_unit_qty, XfrSchdChk04_DtlR.$base_unit_qty);
				addColumnPathMap(ShipPr_DtlR.$base_unit_cd, XfrSchdChk04_DtlR.$base_unit_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_wk_cd, XfrSchdChk04_DtlR.$ship_wk_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_term_cd, XfrSchdChk04_DtlR.$ship_term_cd);
				addColumnPathMap(ShipPr_DtlR.$ship_inst_typ, XfrSchdChk04_DtlR.$ship_inst_typ);

				addColumnPathMap(ShipPr_DtlR.$itm_cd, XfrSchdChk04_DtlR.$itm_cd);
				addColumnPathMap(ShipPr_DtlR.$itm_sub1, XfrSchdChk04_DtlR.$itm_sub1);
				addColumnPathMap(ShipPr_DtlR.$itm_sub2, XfrSchdChk04_DtlR.$itm_sub2);
				addColumnPathMap(ShipPr_DtlR.$itm_sub3, XfrSchdChk04_DtlR.$itm_sub3);
				addColumnPathMap(ShipPr_DtlR.$itm_sub3, XfrSchdChk04_DtlR.$itm_sub3);
				addColumnPathMap(ShipPr_DtlR.$sno1, XfrSchdChk04_DtlR.$sno1);
				addColumnPathMap(ShipPr_DtlR.$sno1_null_flg, XfrSchdChk04_DtlR.$sno1_null_flg);
				addColumnPathMap(ShipPr_DtlR.$sno2, XfrSchdChk04_DtlR.$sno2);
				addColumnPathMap(ShipPr_DtlR.$sno2_null_flg, XfrSchdChk04_DtlR.$sno2_null_flg);
				addColumnPathMap(ShipPr_DtlR.$sno3, XfrSchdChk04_DtlR.$sno3);
				addColumnPathMap(ShipPr_DtlR.$sno3_null_flg, XfrSchdChk04_DtlR.$sno3_null_flg);
				addColumnPathMap(ShipPr_DtlR.$sno4, XfrSchdChk04_DtlR.$sno4);
				addColumnPathMap(ShipPr_DtlR.$sno4_null_flg, XfrSchdChk04_DtlR.$sno4_null_flg);
				addColumnPathMap(ShipPr_DtlR.$lot_no, XfrSchdChk04_DtlR.$lot_no);
				addColumnPathMap(ShipPr_DtlR.$sublot_no, XfrSchdChk04_DtlR.$sublot_no);
				addColumnPathMap(ShipPr_DtlR.$ver_no, XfrSchdChk04_DtlR.$ver_no);
				addColumnPathMap(ShipPr_DtlR.$stk_arrv_bp_cd, XfrSchdChk04_DtlR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(ShipPr_DtlR.$stk_id_typ, XfrSchdChk04_DtlR.$stk_id_typ);
				addColumnPathMap(ShipPr_DtlR.$stk_bp_cd, XfrSchdChk04_DtlR.$stk_bp_cd);
				
			}
		}

		protected Map_XfrSchdEx_DtlR_XfrSchdChk04_DtlR<XfrSchdEx_DtlR,XfrSchdChk04_DtlR> createMap_XfrSchdEx_DtlR_XfrSchdChk04_DtlR() {
			return new Map_XfrSchdEx_DtlR_XfrSchdChk04_DtlR<XfrSchdEx_DtlR, XfrSchdChk04_DtlR>();
		}

		public class Map_XfrSchdEx_DtlR_XfrSchdChk04_DtlR<D extends XfrSchdEx_DtlR, S extends XfrSchdChk04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdEx_DtlR.$peg_no, XfrSchdChk04_DtlR.$peg_no);
				addColumnPathMap(XfrSchdEx_DtlR.$gi_lg_grp_cd, XfrSchdChk04_DtlR.$gi_lg_grp_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$gr_lg_grp_cd, XfrSchdChk04_DtlR.$gr_lg_grp_cd);
				addColumnPathMap(XfrSchdEx_DtlR.$ship_term_cd, XfrSchdChk04_DtlR.$ship_term_cd);
			}
		}
	}

	//////////////////////////////////////////////////////////////////////
	// Chk04とUpd01共通 //
	////////////////////
	// 更新行のデータ補完処理  ＊　削除行除く
	protected void editUpdateUpChk04AndUpd01(MST_XFR_SCHD_R xs, MST_XFR_SCHD_R dbR) {
		for (String col : getXfrSchdRemoveSetCols()) {
			xs.setValue(col, dbR.getValue(col));
		}
		if (MSC_XFR_SRC_TYP.isINPT(xs.xfr_src_typ())
				|| MSC_XFR_SRC_TYP.isINPT_RPL(xs.xfr_src_typ())
				|| MSC_XFR_SRC_TYP.isSHIP_RPL(xs.xfr_src_typ())) {
			xs.not_lot_mix_flg(dbR.not_lot_mix_flg());
			xs.not_sublot_mix_flg(dbR.not_sublot_mix_flg());
		}
	}

	public void execdel_MST_XFR_ALLOC_STS_SV_D01_sql() {
		MST_XFR_ALLOC_STS_SV_R S0T = MST_XFR_ALLOC_STS_SV_R.create("T");
		MSW_XFR_INST_D_KEY_R S1W1 = MSW_XFR_INST_D_KEY_R.create("W1");
		MST_XFR_ALLOC_STS_R S2W2 = MST_XFR_ALLOC_STS_R.create("W2");

		MCDelete q = sql("MSBEL5200_MST_XFR_ALLOC_STS_SV_D01")
				.delete(S0T)
				.where(value(0).eq(value(0))
						.and(exists(subQuery().select(value("X")).from(S1W1)
								.where(S1W1.xfr_inst_d_no.eq(S0T.xfr_inst_d_no))))
						.and(notExists(subQuery().select(value("X")).from(S2W2)
								.where(S2W2.xfr_inst_d_no.eq(S0T.xfr_inst_d_no)))));
		q.executeUpdate();
	}

	public void execBatch_MST_XFR_SCHD_U01_sql(MCList<XfrSchdMod_DtlR> schdNoL) {
		MST_XFR_SCHD_R S0 = MST_XFR_SCHD_R.create();
		MCUpdate q = sql("MSBEL5200_MST_XFR_SCHD_U02")
			.update(S0)
			.set(S0.rqst_mod_flg).eq(bind("rqst_mod_flg"))
			.set(S0.rqst_can_flg).eq(bind("rqst_can_flg"))
			.where(
				value(0).eq(value(0))
				.and(S0.xfr_schd_no.eq(bind("xfr_schd_no")))
			);
		q.executeBatchUpdate(schdNoL);
	}
	
	public void execBatch_MST_XFR_SCHD_U02_sql(MCList<XfrSchdMod_DtlR> srcNoL) {
		MST_XFR_SCHD_R S0 = MST_XFR_SCHD_R.create();
		MCUpdate q = sql("MSBEL5200_MST_XFR_SCHD_U03")
			.update(S0)
			.set(S0.rqst_mod_flg).eq(bind("rqst_mod_flg"))
			.set(S0.rqst_can_flg).eq(bind("rqst_can_flg"))
			.where(
				value(0).eq(value(0))
				.and(S0.xfr_src_typ.eq(bind("xfr_src_typ")))
				.and(S0.xfr_src_no.eq(bind("xfr_src_no")))
				.and(S0.rqst_can_flg.eq(value(false)))
			);
		q.executeBatchUpdate(srcNoL);;
	}

	protected String[] getXfrSchdRemoveSetCols() {
		if (_xfrSchdRemoveSetCols == null) {
			ArrayList<String> l = new ArrayList<>();
			l.add(MST_XFR_SCHD_R.$xfr_src_typ);
			l.add(MST_XFR_SCHD_R.$xfr_src_no);
			l.add(MST_XFR_SCHD_R.$itm_ord_no);
			l.add(MST_XFR_SCHD_R.$mfg_inst_no);
			l.add(MST_XFR_SCHD_R.$oper_inst_no);
			l.add(MST_XFR_SCHD_R.$inpt_schd_no);
			l.add(MST_XFR_SCHD_R.$slo_no);
			l.add(MST_XFR_SCHD_R.$slo_d_no);
			l.add(MST_XFR_SCHD_R.$io_schd_pr_no);
			l.add(MST_XFR_SCHD_R.$vld_dt_fr);
			l.add(MST_XFR_SCHD_R.$vld_dt_to);
			l.add(MST_XFR_SCHD_R.$rqst_cnt_rmrks);
			_xfrSchdRemoveSetCols = l.toArray(new String[]{});
		}
		return _xfrSchdRemoveSetCols;
	}
	
	protected void editUpChk04AndUpd01(MST_XFR_SCHD_R xs, boolean screen_flg, boolean file_imp_flg) {
		MCRow upR = xs.getParentRow();
		
		//// 移動移送共通 ////
		// 取引関連
		if(isNull(xs.trd_ptn_typ())) {
			xs.trd_ptn_typ(getTrdPtnTyp(xs.gi_loc_cd(), xs.gr_loc_cd()));
			MAM_TRD_R trdR = getTrdCdCache().get(xs.trd_ptn_typ()); 
			if (!isNull(trdR)) {
				xs.trd_cd(trdR.trd_cd());
			}
		}
		
		// 出庫場所関連
		MAM_LOC_R giLocR = giLocCache().get(upR.getString(GI_DEF_LOC_CD_COL));
		if(isNull(xs.gi_wg_cd())) {
			xs.gi_wg_cd(giLocR.wg_cd());
		}
		if(isNull(xs.gi_lg_grp_cd())) {
			xs.gi_lg_grp_cd(giLocR.lg_grp_cd());
		}
		if(isNull(xs.gi_loc_cd())) {
			xs.gi_str_ln_cd(null);
		}
		else if(isNull(xs.gi_str_ln_cd())) {
			xs.gi_str_ln_cd(MAC_STR.NULL_VAL.value());
		}
		
		// 入庫場所関連
		MAM_LOC_R grLocR = grLocCache().get(xs.gr_loc_cd());
		if(isNull(xs.gr_wg_cd())) {
			xs.gr_wg_cd(grLocR.wg_cd());
		}
		if(isNull(xs.gr_lg_grp_cd())) {
			xs.gr_lg_grp_cd(grLocR.lg_grp_cd());
		}
		if(isNull(xs.gr_str_ln_cd())) {
			xs.gr_str_ln_cd(MAC_STR.NULL_VAL.value());
		}
		
		// 在庫関連
		if(isNull(xs.sno1())) {
			xs.sno1(MAC_STR.NULL_VAL.value());
		}
		if(isNull(xs.sno2())) {
			xs.sno2(MAC_STR.NULL_VAL.value());
		}
		if(isNull(xs.sno3())) {
			xs.sno3(MAC_STR.NULL_VAL.value());
		}
		if(isNull(xs.sno4())) {
			xs.sno4(MAC_STR.NULL_VAL.value());
		}
		if(isNull(xs.gd_cd())) {
			xs.gd_cd(getDefaultFeedStkGd().gd_cd());
		}
		if(isNull(xs.quality_typ())) {
			xs.quality_typ(MAC_QUALITY_TYP.GOOD.value());
		}
		if(isNull(xs.stk_id_typ())) {
			xs.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
		}
		if (MSC_STK_ID_TYP.isCOSTK(xs.stk_id_typ())) {
			xs.stk_bp_cd(MAC_STR.NULL_VAL.value());
		}
		else if (MSC_STK_ID_TYP.isONR_PROV(xs.stk_id_typ())) {
			xs.stk_bp_cd(giLocR.sppl_cd());
		}
		
		// 出庫在庫着荷先
		if (isNull(giLocR.sppl_cd())) {
			xs.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
		}
		else {
			if (MSC_STK_ID_TYP.isCOSTK(xs.stk_id_typ())
					|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(xs.stk_id_typ())
					|| MSC_STK_ID_TYP.isACCPT_DFCT(xs.stk_id_typ())
					|| MSC_STK_ID_TYP.isNCV_RCV(xs.stk_id_typ())
					|| MSC_STK_ID_TYP.isONR_PROV(xs.stk_id_typ())
					) {
				if (isNullOrNullVal(xs.gi_stk_arrv_bp_cd())) {
					xs.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
				else {
					xs.gi_stk_arrv_bp_cd(giLocR.sppl_cd());
				}
			}
			else {
				xs.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			}
		}
		
		// 支給返品関連
		if (isProvRtn(giLocR.sppl_cd(), grLocR.sppl_cd())
				|| isProvDD(giLocR.sppl_cd(), grLocR.sppl_cd())) {
			if (MSC_STK_ID_TYP.isONR_PROV(xs.stk_id_typ())) {
				xs.ret_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
				xs.ret_prov_basis_typ(MAC_PROV_BASIS_TYP.GI.value());
			}
			else if (MSC_STK_ID_TYP.isCOSTK(xs.stk_id_typ())) {
				if (MAC_STR.isNULL_VAL(xs.gi_stk_arrv_bp_cd())) {
					xs.ret_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
					xs.ret_prov_basis_typ(MAC_PROV_BASIS_TYP.INPT.value());
				}
				else {
					xs.ret_prov_typ(MAC_PROV_TYP.FFR_PROV.value());
				}
			}
			else {
				xs.ret_prov_typ(MAC_PROV_TYP.FFR_PROV.value());
			}
		}
		if (!MAC_PROV_TYP.isONR_PROV(xs.ret_prov_typ())) {
			xs.ret_prov_basis_typ(null);
		}
		if (!MAC_PROV_BASIS_TYP.isGI(xs.ret_prov_basis_typ())) {
			xs.ret_xrate_inpt_flg(false);
			xs.ret_xrate(null);
			xs.ret_ptax_xrate_inpt_flg(false);
			xs.ret_ptax_xrate(null);
			xs.ret_trd_cur_cd(null);
			xs.ret_tax_fix_flg(false);
			xs.ret_tax_cd(null);
			xs.ret_trd_cur_upri(null);
			xs.ret_trd_cur_amt(null);
			xs.ret_trd_cur_tax_amt(null);
			xs.ret_wtax_rate(null);
			xs.ret_wtax_amt(null);
		}
		
		// その他
		if (isNullOr(xs.trd_unit_cd(), xs.trd_unit_qty())) {
			xs.trd_unit_cd(xs.base_unit_cd());
			xs.trd_unit_qty(xs.base_unit_qty());
		}
		if(isNull(xs.rcpt_dt())) {
			xs.rcpt_dt(getToday());
		}
		if(isNull(xs.rsn_cd())) {
			xs.bd_dpt_cd(null);
		}
		MAM_ITM_R itmCacheR = itmCache().get(xs.itm_cd(), xs.itm_sub1(), xs.itm_sub2(), xs.itm_sub3());
		if(isNull(xs.ship_inst_typ())) {
			if (!file_imp_flg || doComplInputFileValue("ship_inst_typ")) {
				xs.ship_inst_typ(getShipInstTyp(itmCacheR));
			}
		}
		if (!isNull(xs.slo_d_no())) {
			MST_SLO_D_R sloDR = sloDCache().get(xs.slo_d_no());
			xs.not_lot_mix_flg(sloDR.not_lot_mix_flg());
			xs.not_sublot_mix_flg(sloDR.not_sublot_mix_flg());
		}
		if (MAC_LOT_MNG_TYP.isNOT_MNG(itmCacheR.lot_mng_typ())) {
			xs.not_lot_mix_flg(false);
		}
		if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmCacheR.sublot_mng_typ())) {
			xs.not_sublot_mix_flg(false);
		}
		
		//// 移動移送個別 ////
		// 移動
		if(isSame(xs.gi_lg_grp_cd(), xs.gr_lg_grp_cd())) {
			if (!isNullOr(xs.gi_rqst_tm(), xs.gr_rqst_tm())) {
				xs.gi_rqst_tm(null);
			}
			
			xs.ship_block_flg(false);
			xs.ship_term_cd(null);
			xs.ship_to_id_typ(null);
			xs.ship_to_id_cd(null);
			xs.ship_to_id_nm(null);
			xs.ship_to_zip_cd(null);
			xs.ship_to_addr1(null);
			xs.ship_to_addr2(null);
			xs.ship_to_addr3(null);
			xs.ship_to_addr4(null);
			xs.ship_to_tel(null);
			xs.ship_to_fax(null);
			xs.ship_to_cntct_dpt(null);
			xs.ship_to_cntct_psn(null);
			xs.ship_to_sundry_flg(false);
			xs.via_dlv_typ(null);
		}
		// 移送
		else {
			if((!screen_flg || file_imp_flg) && isNull(xs.ship_term_cd())) {	
				xs.ship_term_cd(itmCacheR.ship_term_cd());
			}
			// インボイス取引かどうかに関連する項目は日付計算後に行う
		}

	}
	
	protected void editUpChk04AndUpd01ShipTo(MST_XFR_SCHD_R xs, boolean scree_flg) {
		MCRow upR = xs.getParentRow();
		XfrSchdEx_DtlR xfrExR = getXfrSchdEx(upR, xs.gi_lg_grp_cd(), xs.gr_lg_grp_cd(), xs.ship_term_cd(), xs.ship_to_id_cd(), xs.via_dlv_typ(), xs.trd_ptn_typ());
		if (xfrExR.err_flg()) {
			upR.setBoolean(ERR_FLG_COL, true);
			return ;
		}
		if(isNull(xs.ship_to_id_typ())) {
			xs.ship_to_id_typ(xfrExR.ship_to_id_typ());
		}
		if(MSC_SHIP_TO_ID_TYP.isLOC(xs.ship_to_id_typ())) {
			xs.ship_to_id_cd(xs.gr_loc_cd());
			xs.ship_to_cntct_dpt(null);
			xs.ship_to_cntct_psn(null);
			xs.ship_to_sundry_flg(false);
			xs.via_dlv_typ(null);
			upR.setString(SHIP_TO_LG_GRP_CD_COL, xs.gr_lg_grp_cd());
		}
		else if(MSC_SHIP_TO_ID_TYP.isTDLV(xs.ship_to_id_typ())) {
			if(isNull(xs.ship_to_id_cd())) {
				xs.ship_to_id_cd(xfrExR.tdlv_cd());
				xs.via_dlv_typ(xfrExR.via_dlv_typ());
				upR.setString(SHIP_TO_LG_GRP_CD_COL, xfrExR.ship_to_lg_grp_cd());
			}
			else {
				upR.setString(SHIP_TO_LG_GRP_CD_COL, xfrExR.ship_to_lg_grp_cd());
			}
		}
		
	}
	
	protected void editUpChk04AndUpd01ShipDt(MST_XFR_SCHD_R xs) {
		MCRow upR = xs.getParentRow();
		MSW_SHIP_SCHD_DT_CALC_R calcR = getShipDtCache().getFirstByPegNo(upR.getNumber("peg_no"));
		upR.setDate(SHIP_SCHD_TM_COL, nvl(xs.gi_rqst_tm(), calcR.ship_schd_tm()));
		upR.setDate(DLV_SCHD_TM_COL, nvl(xs.gr_rqst_tm(), calcR.dlv_schd_tm()));
		upR.setString(SHIP_WK_CD_COL, calcR.ship_wk_cd());
	}
	
	protected void editUpChk04AndUpd01ShipToAddr(MST_XFR_SCHD_R xs, boolean sundrySkipFlg, boolean file_imp_flg) {
		if(isNull(xs.ship_to_id_cd())) {
			return ;
		}
		
		MCRow upR = xs.getParentRow();
		if (MSC_SHIP_TO_ID_TYP.isTDLV(xs.ship_to_id_typ())) {
			MAM_BP_R addrR = getTlvdCache().getFirst(xs.ship_to_id_cd(), upR.getDate(DLV_SCHD_TM_COL));
			xs.ship_to_sundry_flg(addrR.dlv_sundry_flg());
			
			if (!xs.ship_to_sundry_flg() || !sundrySkipFlg) {
				xs.ship_to_id_nm(addrR.bp_nm());
				xs.ship_to_zip_cd(addrR.getString("zip_cd"));
				xs.ship_to_addr1(addrR.getString("addr1"));
				xs.ship_to_addr2(addrR.getString("addr2"));
				xs.ship_to_addr3(addrR.getString("addr3"));
				xs.ship_to_addr4(addrR.getString("addr4"));
				xs.ship_to_tel(addrR.getString("tel"));
				xs.ship_to_fax(addrR.getString("fax"));
				xs.ship_to_cntct_dpt(addrR.getString("dlv_cntct_dpt"));
				xs.ship_to_cntct_psn(addrR.getString("dlv_cntct_psn"));
			}
			else if(file_imp_flg) {
				if (isNullAnd(xs.ship_to_zip_cd(), xs.ship_to_addr1(), xs.ship_to_addr2(),
						xs.ship_to_addr3(), xs.ship_to_addr4())) {
					xs.ship_to_id_nm(addrR.bp_nm());
					xs.ship_to_zip_cd(addrR.getString("zip_cd"));
					xs.ship_to_addr1(addrR.getString("addr1"));
					xs.ship_to_addr2(addrR.getString("addr2"));
					xs.ship_to_addr3(addrR.getString("addr3"));
					xs.ship_to_addr4(addrR.getString("addr4"));
				}
				if (isNull(xs.ship_to_tel())) {
					xs.ship_to_tel(addrR.getString("tel"));
				}
				if(isNull(xs.ship_to_fax())) {
					xs.ship_to_fax(addrR.getString("fax"));
				}
				if(isNull(xs.ship_to_cntct_dpt())) {
					xs.ship_to_cntct_dpt(addrR.getString("dlv_cntct_dpt"));
				}
				if(isNull(xs.ship_to_cntct_psn())) {
					xs.ship_to_cntct_psn(addrR.getString("dlv_cntct_psn"));
				}
			}
		}
		else if (MSC_SHIP_TO_ID_TYP.isLOC(xs.ship_to_id_typ())) {
			MAM_LOC_R grLocAddrR = getGrLocAddrCache().getFirst(xs.gr_loc_cd(),
					upR.getDate(DLV_SCHD_TM_COL));
			xs.ship_to_zip_cd(grLocAddrR.zip_cd());
			xs.ship_to_addr1(grLocAddrR.addr1());
			xs.ship_to_addr2(grLocAddrR.addr2());
			xs.ship_to_addr3(grLocAddrR.addr3());
			xs.ship_to_addr4(grLocAddrR.addr4());
			xs.ship_to_tel(grLocAddrR.tel());
			xs.ship_to_fax(grLocAddrR.fax());
		}
		
	}
	
	protected void editUpdateUpChk02AndUpd02(MST_XFR_ALLOC_STS_R xs, MST_XFR_ALLOC_STS_R dbR) {
		for (String col : getXfrAllocRemoveSetCols()) {
			xs.setValue(col, dbR.getValue(col));
		}
	}
	
	protected String[] getXfrAllocRemoveSetCols() {
		if (_xfrAllocRemoveSetCols == null) {
			ArrayList<String> l = new ArrayList<>();
			l.add(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
			l.add(MST_XFR_ALLOC_STS_R.$trd_cd);
			l.add(MST_XFR_ALLOC_STS_R.$trd_ptn_typ);
			l.add(MST_XFR_ALLOC_STS_R.$ship_inst_typ);
			l.add(MST_XFR_ALLOC_STS_R.$vld_dt_fr);
			l.add(MST_XFR_ALLOC_STS_R.$vld_dt_to);
			l.add(MST_XFR_ALLOC_STS_R.$io_schd_pr_no);
			_xfrAllocRemoveSetCols = l.toArray(new String[]{});
		}
		return _xfrAllocRemoveSetCols;
	}

	protected void editUpChk02AndUpd02(XfrPr_DtlR dtl) {
		MST_XFR_ALLOC_STS_R xas = dtl.xas();
		MCRow upR = xas.getParentRow();
		String gi_def_loc_cd = upR.getString(GI_DEF_LOC_CD_COL);
		
		if(isNull(gi_def_loc_cd)) {
			if(!isNull(xas.gi_loc_cd())) {
				gi_def_loc_cd = xas.gi_loc_cd();
			}
			else {
				MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpLocCache().get(dtl.itm_cd(),
						dtl.itm_sub1(), dtl.itm_sub2(), dtl.itm_sub3(), dtl.lg_grp_cd());
				MAM_LG_GRP_R lgGrpR = giDefLocCache().get(dtl.lg_grp_cd());
				gi_def_loc_cd = !itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd()
						: !lgGrpR.isEmpty() ? lgGrpR.getString("loc_cd") : null;
			}
			upR.setString(GI_DEF_LOC_CD_COL, gi_def_loc_cd);
		}
		
		if (isNull(xas.lg_grp_cd())) {
			xas.lg_grp_cd(grLocCache().get(xas.gr_loc_cd()).lg_grp_cd());
		}
		if (!isNull(xas.gi_loc_cd())) {
			xas.wg_cd(giLocCache().get(xas.gi_loc_cd()).wg_cd());
		}
		else {
			MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpLocCache().get(dtl.itm_cd(),
					dtl.itm_sub1(), dtl.itm_sub2(), dtl.itm_sub3(), dtl.lg_grp_cd());
			MAM_LG_GRP_R lgGrpR = giDefLocCache().get(dtl.lg_grp_cd());
			xas.wg_cd(!itmLgGrpR.isEmpty() ? itmLgGrpR.getStringNE("def_loc_wg_cd")
					: !lgGrpR.isEmpty() ? lgGrpR.getString("def_loc_wg_cd") : null);
		}
		
		editUpChk02AndUpd02(xas);
	}
	protected void editUpChk02AndUpd02(XfrSchdChk02_DtlR dtl) {
		MST_XFR_ALLOC_STS_R xas = dtl.xas();
		MCRow upR = xas.getParentRow();
		String gi_def_loc_cd = upR.getString(GI_DEF_LOC_CD_COL);
		
		if(isNull(gi_def_loc_cd)) {
			if(!isNull(xas.gi_loc_cd())) {
				gi_def_loc_cd = xas.gi_loc_cd();
			}
			else {
				MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpLocCache().get(dtl.itm_cd(),
						dtl.itm_sub1(), dtl.itm_sub2(), dtl.itm_sub3(), dtl.lg_grp_cd());
				MAM_LG_GRP_R lgGrpR = giDefLocCache().get(dtl.lg_grp_cd());
				gi_def_loc_cd = !itmLgGrpR.isEmpty() ? itmLgGrpR.lg_def_loc_cd()
						: !lgGrpR.isEmpty() ? lgGrpR.getString("loc_cd") : null;
			}
			upR.setString(GI_DEF_LOC_CD_COL, gi_def_loc_cd);
		}
		
		if (isNull(xas.lg_grp_cd())) {
			xas.lg_grp_cd(grLocCache().get(xas.gr_loc_cd()).lg_grp_cd());
		}
		if (isNull(xas.wg_cd())) {
			if (isNull(xas.gi_loc_cd())) {
				xas.wg_cd(giLocCache().get(xas.gi_loc_cd()).wg_cd());
			}
			else {
				MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpLocCache().get(dtl.itm_cd(),
						dtl.itm_sub1(), dtl.itm_sub2(), dtl.itm_sub3(), dtl.lg_grp_cd());
				MAM_LG_GRP_R lgGrpR = giDefLocCache().get(dtl.lg_grp_cd());

				xas.wg_cd(!itmLgGrpR.isEmpty() ? itmLgGrpR.getStringNE("def_loc_wg_cd")
						: !lgGrpR.isEmpty() ? lgGrpR.getString("def_loc_wg_cd") : null);
			}
		}
		
		editUpChk02AndUpd02(xas);
	}
	protected void editUpChk02AndUpd02(MST_XFR_ALLOC_STS_R xas) {
				
		if(isNull(xas.xfr_schd_no())) {
			xas.xfr_schd_no(MAC_STR.NULL_VAL.value());
		}
		if (isNull(xas.gi_loc_cd())) {
			xas.gi_str_ln_cd(null);
		}
		if(isNull(xas.sno1())) {
			xas.sno1(MAC_STR.NULL_VAL.value());
		}
		if(isNull(xas.sno2())) {
			xas.sno2(MAC_STR.NULL_VAL.value());
		}
		if(isNull(xas.sno3())) {
			xas.sno3(MAC_STR.NULL_VAL.value());
		}
		if(isNull(xas.sno4())) {
			xas.sno4(MAC_STR.NULL_VAL.value());
		}	
		if(isNull(xas.alloc_sno1())) { 
			xas.alloc_sno1(xas.sno1());
		}
		if(isNull(xas.alloc_sno2())) { 
			xas.alloc_sno2(xas.sno2());
		}
		if(isNull(xas.alloc_sno3())) { 
			xas.alloc_sno3(xas.sno3());
		}
		if(isNull(xas.alloc_sno4())) { 
			xas.alloc_sno4(xas.sno4());
		}
		
		if (!isNull(xas.xfr_schd_dt())) {
			xas.xfr_schd_dt(xas.xfr_schd_dt().trunc(MCDateFieldType.DAY));
		}
		
		xas.cmpl_flg(xas.abort_flg() || MSC_PR_STS_TYP.isCOMP(xas.pr_sts_typ()));
		xas.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
		
		if (MSC_PR_STS_TYP.isNOT_INST(xas.pr_sts_typ())) {
			xas.xfr_inst_d_no(MAC_STR.NULL_VAL.value());
			xas.dlv_slip_no(MAC_STR.NULL_VAL.value());
			xas.dlv_slip_d_no(MAC_STR.NULL_VAL.value());
			xas.disp_seq(null);
			xas.inst_d_rmrks(null);
			xas.intr_d_rmrks(null);
		}
		else {
			if(isNull(xas.dlv_slip_no())) {
				xas.dlv_slip_no(MAC_STR.NULL_VAL.value());
			}
			if(isNull(xas.dlv_slip_d_no())) {
				xas.dlv_slip_d_no(MAC_STR.NULL_VAL.value());
			}
		}
		if(MSC_PR_STS_TYP.isNOT_INST(xas.pr_sts_typ()) || MSC_PR_STS_TYP.isINST(xas.pr_sts_typ())) {
			xas.act_qty(MCNumber.ZERO);
		}
	}
	
	
	protected void callProvSchdServiceSprt01(MCList<MST_XFR_SCHD_R> upL,
			boolean screen_flg, boolean file_imp_flg) {
		if (isNull(upL)) {
			return;
		}
		
		MCList<MST_XFR_SCHD_R> provL = MCList.create(MST_XFR_SCHD_R.class);
		MCList<MST_XFR_SCHD_R> retProvL = MCList.create(MST_XFR_SCHD_R.class);
		
		for(MST_XFR_SCHD_R r : upL) {
			MCRow pRow = r.getParentRow();
			
			MAM_LOC_R grLoc = grLocCache().getEx(pRow.getString(GR_LOC_CD_COL));
			MAM_LOC_R giLoc = giLocCache().getEx(pRow.getString(GI_DEF_LOC_CD_COL));

			if(isProv(giLoc.sppl_cd(), grLoc.sppl_cd())) {
				provL.add(r);
			}
			else if(isProvRtn(giLoc.sppl_cd(), grLoc.sppl_cd())) {
				retProvL.add(r);
			}
			else if(isProvDD(giLoc.sppl_cd(), grLoc.sppl_cd())) {
				provL.add(r);
				retProvL.add(r);
			}
		}
		
		if (isNull(provL) && isNull(retProvL)) {
			return ;
		}

		MSBEL_ProvSchdService.ProvSchd_Sprt01 ope = MSBEL_ProvSchdService
				.crtProvSchd_Sprt01();
		Map_ProvSchd_DtlR_MST_XFR_SCHD_R<ProvSchd_DtlR, MST_XFR_SCHD_R> map = createMap_ProvSchd_DtlR_MST_XFR_SCHD_R();
		Map_RetProvSchd_DtlR_MST_XFR_SCHD_R<ProvSchd_DtlR, MST_XFR_SCHD_R> rmap = createMap_RetProvSchd_DtlR_MST_XFR_SCHD_R();
		map.setWith(screen_flg, file_imp_flg);
		rmap.setWith(screen_flg,file_imp_flg);
		addAll(ope.up0(), provL, map);
		addAll(ope.up0(), retProvL, rmap);
		ope.exec();
		copyProv(provL, ope.down0());
		copyRetProv(retProvL, ope.down0());
	}
	
	protected Map_ProvSchd_DtlR_MST_XFR_SCHD_R<ProvSchd_DtlR,MST_XFR_SCHD_R> createMap_ProvSchd_DtlR_MST_XFR_SCHD_R() {
		return new Map_ProvSchd_DtlR_MST_XFR_SCHD_R<ProvSchd_DtlR, MST_XFR_SCHD_R>();
	}

	public class Map_ProvSchd_DtlR_MST_XFR_SCHD_R<D extends ProvSchd_DtlR, S extends MST_XFR_SCHD_R> extends MCRowMapper<D,S>{
		protected boolean _screen_flg;
		protected boolean _file_imp_flg;
		protected void setWith(boolean _screen_flg,boolean _file_imp_flg) {
			this._screen_flg = _screen_flg;
			this._file_imp_flg = _file_imp_flg;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProvSchd_DtlR.$base_unit_qty, MST_XFR_SCHD_R.$base_unit_qty);
			addColumnPathMap(ProvSchd_DtlR.$prov_typ, MST_XFR_SCHD_R.$prov_typ);
			addColumnPathMap(ProvSchd_DtlR.$prov_basis_typ, MST_XFR_SCHD_R.$prov_basis_typ);
			addColumnPathMap(ProvSchd_DtlR.$xrate, MST_XFR_SCHD_R.$xrate);
			addColumnPathMap(ProvSchd_DtlR.$ptax_xrate, MST_XFR_SCHD_R.$ptax_xrate);
			addColumnPathMap(ProvSchd_DtlR.$trd_cur_cd, MST_XFR_SCHD_R.$trd_cur_cd);
			addColumnPathMap(ProvSchd_DtlR.$tax_cd, MST_XFR_SCHD_R.$tax_cd);
			addColumnPathMap(ProvSchd_DtlR.$trd_cur_upri, MST_XFR_SCHD_R.$trd_cur_upri);
			addColumnPathMap(ProvSchd_DtlR.$trd_cur_amt, MST_XFR_SCHD_R.$trd_cur_amt);
			addColumnPathMap(ProvSchd_DtlR.$trd_cur_tax_amt, MST_XFR_SCHD_R.$trd_cur_tax_amt);
			addColumnPathMap(ProvSchd_DtlR.$wtax_rate, MST_XFR_SCHD_R.$wtax_rate);
			addColumnPathMap(ProvSchd_DtlR.$wtax_amt, MST_XFR_SCHD_R.$wtax_amt);
			addColumnPathMap(ProvSchd_DtlR.$itm_cd, MST_XFR_SCHD_R.$itm_cd);
			addColumnPathMap(ProvSchd_DtlR.$itm_sub1, MST_XFR_SCHD_R.$itm_sub1);
			addColumnPathMap(ProvSchd_DtlR.$itm_sub2, MST_XFR_SCHD_R.$itm_sub2);
			addColumnPathMap(ProvSchd_DtlR.$itm_sub3, MST_XFR_SCHD_R.$itm_sub3);
			addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, MST_XFR_SCHD_R.$stk_id_typ);
			addColumnPathMap(ProvSchd_DtlR.$stk_arrv_bp_cd, MST_XFR_SCHD_R.$gi_stk_arrv_bp_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());
			
			MCRow pRow = src.getParentRow();
			dest.peg_no(pRow.getNumber(WK_PEG_NO_COL));
			MAM_LOC_R grLocCache = grLocCache().getEx(pRow.getString(GR_LOC_CD_COL));
			dest.wg_cd(grLocCache.wg_cd());
			dest.prsppl_cd(grLocCache.sppl_cd());
			if(isNull(src.ship_to_id_typ())) {
				// 移動の場合
				dest.accpt_schd_dt(nvl(src.gi_rqst_tm(), src.gr_rqst_tm()));
			}
			else {
				MSW_SHIP_SCHD_DT_CALC_R calcR = getShipDtCache().getFirstByPegNo(pRow.getNumber("peg_no"));
				if (MAC_PROV_RCV_TYP.isNOT_ARR(grLocCache.getStringNE("prov_rcv_typ"))) {
					// 出荷基準の時は出荷予定日
					if(!isNull(calcR)) {
						dest.accpt_schd_dt(calcR.ship_schd_tm());
					}
					else {
						dest.accpt_schd_dt(pRow.getDate(SHIP_SCHD_TM_COL));
					}
				}
				else {
					// 着荷基準の時は納品予定日
					if(!isNull(calcR)) {
						if (MAC_VIA_DLV_TYP.isVIA(src.via_dlv_typ())) {
							MAM_LG_CTL_R lgCtlGiTdlvR = getLgCtlCache().getGiGr(
									src.gi_lg_grp_cd(), src.gr_lg_grp_cd(),
									src.ship_term_cd());
							if(!isNull(lgCtlGiTdlvR)) {
								MCDate dt = calcR.ship_schd_tm().addDay(lgCtlGiTdlvR.xfr_lt());
								if (dt.ltDate(calcR.dlv_schd_tm())) {
									dest.accpt_schd_dt(calcR.dlv_schd_tm());
								}
								else {
									dest.accpt_schd_dt(dt);
								}
							}
							else {
								dest.accpt_schd_dt(calcR.dlv_schd_tm());
							}
						}
						else {
							dest.accpt_schd_dt(calcR.dlv_schd_tm());
						}
					}
					else {
						if (MAC_VIA_DLV_TYP.isVIA(src.via_dlv_typ())) {
							MAM_LG_CTL_R lgCtlGiTdlvR = getLgCtlCache().getGiGr(
									src.gi_lg_grp_cd(), src.gr_lg_grp_cd(),
									src.ship_term_cd());
							if(!isNull(lgCtlGiTdlvR)) {
								MCDate dt = pRow.getDate(SHIP_SCHD_TM_COL).addDay(lgCtlGiTdlvR.xfr_lt());
								if (dt.ltDate(pRow.getDate(DLV_SCHD_TM_COL))) {
									dest.accpt_schd_dt(pRow.getDate(DLV_SCHD_TM_COL));
								}
								else {
									dest.accpt_schd_dt(dt);
								}
							}
							else {
								dest.accpt_schd_dt(pRow.getDate(DLV_SCHD_TM_COL));
							}
						}
						else {
							dest.accpt_schd_dt(pRow.getDate(DLV_SCHD_TM_COL));
						}
					}
				}
			}
			if(_file_imp_flg) {
				dest.not_completion_flg(false);
			}
			else if (!isNull(src.xfr_schd_no()) || _screen_flg) {
				dest.not_completion_flg(true);
			}
		}
	}
	
	
	protected Map_RetProvSchd_DtlR_MST_XFR_SCHD_R<ProvSchd_DtlR,MST_XFR_SCHD_R> createMap_RetProvSchd_DtlR_MST_XFR_SCHD_R() {
		return new Map_RetProvSchd_DtlR_MST_XFR_SCHD_R<ProvSchd_DtlR, MST_XFR_SCHD_R>();
	}

	public class Map_RetProvSchd_DtlR_MST_XFR_SCHD_R<D extends ProvSchd_DtlR, S extends MST_XFR_SCHD_R> extends MCRowMapper<D,S>{
		protected boolean _screen_flg;
		protected boolean _file_imp_flg;
		protected void setWith(boolean _screen_flg,boolean _file_imp_flg) {
			this._screen_flg = _screen_flg;
			this._file_imp_flg = _file_imp_flg;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProvSchd_DtlR.$base_unit_qty, MST_XFR_SCHD_R.$base_unit_qty);
			addColumnPathMap(ProvSchd_DtlR.$prov_typ, MST_XFR_SCHD_R.$ret_prov_typ);
			addColumnPathMap(ProvSchd_DtlR.$prov_basis_typ, MST_XFR_SCHD_R.$ret_prov_basis_typ);
			addColumnPathMap(ProvSchd_DtlR.$xrate, MST_XFR_SCHD_R.$ret_xrate);
			addColumnPathMap(ProvSchd_DtlR.$ptax_xrate, MST_XFR_SCHD_R.$ret_ptax_xrate);
			addColumnPathMap(ProvSchd_DtlR.$trd_cur_cd, MST_XFR_SCHD_R.$ret_trd_cur_cd);
			addColumnPathMap(ProvSchd_DtlR.$tax_cd, MST_XFR_SCHD_R.$ret_tax_cd);
			addColumnPathMap(ProvSchd_DtlR.$trd_cur_upri, MST_XFR_SCHD_R.$ret_trd_cur_upri);
			addColumnPathMap(ProvSchd_DtlR.$trd_cur_amt, MST_XFR_SCHD_R.$ret_trd_cur_amt);
			addColumnPathMap(ProvSchd_DtlR.$trd_cur_tax_amt, MST_XFR_SCHD_R.$ret_trd_cur_tax_amt);
			addColumnPathMap(ProvSchd_DtlR.$wtax_rate, MST_XFR_SCHD_R.$ret_wtax_rate);
			addColumnPathMap(ProvSchd_DtlR.$wtax_amt, MST_XFR_SCHD_R.$ret_wtax_amt);
			addColumnPathMap(ProvSchd_DtlR.$itm_cd, MST_XFR_SCHD_R.$itm_cd);
			addColumnPathMap(ProvSchd_DtlR.$itm_sub1, MST_XFR_SCHD_R.$itm_sub1);
			addColumnPathMap(ProvSchd_DtlR.$itm_sub2, MST_XFR_SCHD_R.$itm_sub2);
			addColumnPathMap(ProvSchd_DtlR.$itm_sub3, MST_XFR_SCHD_R.$itm_sub3);
			addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, MST_XFR_SCHD_R.$stk_id_typ);
			addColumnPathMap(ProvSchd_DtlR.$stk_arrv_bp_cd, MST_XFR_SCHD_R.$gi_stk_arrv_bp_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());
			
			MCRow pRow = src.getParentRow();
			dest.peg_no(pRow.getNumber(WK_RET_PEG_NO_COL));
			MAM_LOC_R giLocCache = giLocCache().getEx(pRow.getString(GI_DEF_LOC_CD_COL));
			dest.wg_cd(giLocCache.wg_cd());
			dest.prsppl_cd(giLocCache.sppl_cd());
			if(isNull(src.ship_to_id_typ())) {
				// 移動の場合
				dest.accpt_schd_dt(nvl(src.gi_rqst_tm(), src.gr_rqst_tm()));
			}
			else {
				// 出荷基準の時は出荷予定日
				dest.accpt_schd_dt(pRow.getDate(SHIP_SCHD_TM_COL).trunc(MCDateFieldType.DAY));
			}
			if(_file_imp_flg) {
				dest.not_completion_flg(false);
			}
			else if (!isNull(src.xfr_schd_no()) || _screen_flg) {
				dest.not_completion_flg(true);
			}
		}
	}

	protected void copyProv(MCList<MST_XFR_SCHD_R> provL, MCList<ProvSchd_DtlR> downL) {
		MCIndexKey idx = downL.createIndex(ProvSchd_DtlR.$peg_no);
		for (MST_XFR_SCHD_R r : provL) {
			MCRow pRow = r.getParentRow();
			ProvSchd_DtlR x = downL.getFirst(idx, pRow.getNumber(WK_PEG_NO_COL));
			if (x != null) {
				r.prov_typ(x.prov_typ());
				r.prov_basis_typ(x.prov_basis_typ());
				r.xrate(x.xrate());
				r.ptax_xrate(x.ptax_xrate());
				r.trd_cur_cd(x.trd_cur_cd());
				r.tax_cd(x.tax_cd());
				r.trd_cur_upri(x.trd_cur_upri());
				r.trd_cur_amt(x.trd_cur_amt());
				r.trd_cur_tax_amt(x.trd_cur_tax_amt());
				r.wtax_rate(x.wtax_rate());
				r.wtax_amt(x.wtax_amt());
			}
		}
	}

	protected void copyRetProv(MCList<MST_XFR_SCHD_R> retProvL, MCList<ProvSchd_DtlR> downL) {
		MCIndexKey idx = downL.createIndex(ProvSchd_DtlR.$peg_no);
		for (MST_XFR_SCHD_R r : retProvL) {
			MCRow pRow = r.getParentRow();
			ProvSchd_DtlR x = downL.getFirst(idx, pRow.getNumber(WK_RET_PEG_NO_COL));
			if (x != null) {
				r.ret_prov_typ(x.prov_typ());
				r.ret_prov_basis_typ(x.prov_basis_typ());
				r.ret_xrate(x.xrate());
				r.ret_ptax_xrate(x.ptax_xrate());
				r.ret_trd_cur_cd(x.trd_cur_cd());
				r.ret_tax_cd(x.tax_cd());
				r.ret_trd_cur_upri(x.trd_cur_upri());
				r.ret_trd_cur_amt(x.trd_cur_amt());
				r.ret_trd_cur_tax_amt(x.trd_cur_tax_amt());
				r.ret_wtax_rate(x.wtax_rate());
				r.ret_wtax_amt(x.wtax_amt());
			}
		}
	}
	
	//////////////////////////////////////////////////////////////////////

	/**
	 * 投入予定と紐づく移動予定に対して再引当ができるよう、上り電文を編集する
	 * @param allocL
	 */
	protected void editAllocSrch01Up2(MCList<Srch_StkR> srchStkL, MCList<?> allocL) {

		MST_XFR_SCHD_R t1 = MST_XFR_SCHD_R.create("T1");
		MST_XFR_ALLOC_STS_R t2 = MST_XFR_ALLOC_STS_R.create("T2");
		MST_INPT_SCHD_R t3 = MST_INPT_SCHD_R.create("T3");
		MST_INPT_ALLOC_STS_R t4 = MST_INPT_ALLOC_STS_R.create("T4");
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(t1);
		
		xfrSchdL_bldr.setSelect(
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t3.inpt_loc_cd.as(Srch_StkR.$loc_cd),
				t3.inpt_str_ln_cd.as(Srch_StkR.$str_ln_cd),
				t4.stk_arrv_bp_cd,
				nvl(t3.lot_no, value(MAC_STR.NULL_VAL.value())).as(Srch_StkR.$lot_no),
				nvl(t3.sublot_no, value(MAC_STR.NULL_VAL.value())).as(Srch_StkR.$sublot_no),
				t1.sno1,
				t1.sno2,
				t1.sno3,
				t1.sno4,
				t3.base_unit_cd.as(Srch_StkR.$pack_unit_cd),
				t3.gd_cd,
				value(MSC_IN_XFR_TYP.IN_LOC.value()).as(Srch_StkR.$in_xfr_typ),
				value(MAC_QUALITY_TYP.GOOD.value()).as(Srch_StkR.$quality_typ),
				value(MSC_STK_INSP_TYP.FIN.value()).as(Srch_StkR.$stk_insp_typ),
				t4.stk_id_typ,
				t4.stk_bp_cd,
				t4.base_unit_qty.as(Srch_StkR.$pack_unit_qty),
				t4.base_unit_qty.as(Srch_StkR.$base_unit_qty),
				
				// ユーティリティ用の情報
				t1.gi_loc_cd,
				t1.gi_str_ln_cd,
				t1.gi_stk_arrv_bp_cd,
				t1.stk_id_typ,
				t1.stk_bp_cd,
				t3.schd_tm
				);
		xfrSchdL_bldr.addInnerJoin(t2, bracket(t2.xfr_schd_no.eq(t1.xfr_schd_no)));
		xfrSchdL_bldr.addInnerJoin(t3, bracket(t3.inpt_schd_no.eq(t1.inpt_schd_no)));
		xfrSchdL_bldr.addInnerJoin(t4, bracket(t4.inpt_alloc_sts_no.eq(t1.xfr_src_no)));
		xfrSchdL_bldr.addInnerJoin(m1, bracket(m1.loc_cd.eq(t3.inpt_loc_cd)));
		xfrSchdL_bldr.setWhere(t1.xfr_schd_no.eq(bind("xfr_schd_no")));
		xfrSchdL_bldr.addWhereWithAnd(t2.alloc_flg.eq(value(false)));
		xfrSchdL_bldr.addWhereWithAnd(t1.rqst_can_flg.eq(value(false)));
		
		dbSelect("MSBEL5200_MST_XFR_SCHD_S04", srchStkL, xfrSchdL_bldr, allocL);
		
		// ユーティリティを呼び出して資産区分を設定する
		if (!srchStkL.isEmpty()) {
			srchStkL.addNumberColumn("peg_no");
			setPegNo(srchStkL);
			
			MCList<GiGr_LocR> giGrL = MCList.create(GiGr_LocR.class);
			setAll(giGrL, srchStkL, createMap_GiGr_LocR_Srch_StkR());
			MSUCL_GiGrLocUtil.setLocInfo(giGrL);
			MCIndexKey giGrKey = giGrL.createIndex(GiGr_LocR.$peg_no);
			
			for (Srch_StkR srchStkR : srchStkL) {
				GiGr_LocR giGrR = giGrL.getFirst(giGrKey, srchStkR.getNumber("peg_no"));
				srchStkR.asst_typ(giGrR.gr_asst_typ());
			}
		}
	}
	
	protected Map_GiGr_LocR_Srch_StkR<GiGr_LocR, Srch_StkR> createMap_GiGr_LocR_Srch_StkR() {
		return new Map_GiGr_LocR_Srch_StkR<GiGr_LocR, Srch_StkR>();
	}

	public class Map_GiGr_LocR_Srch_StkR<D extends GiGr_LocR, S extends Srch_StkR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(GiGr_LocR.$peg_no, "peg_no");
			addColumnPathMap(GiGr_LocR.$itm_cd, Srch_StkR.$itm_cd);
			addColumnPathMap(GiGr_LocR.$itm_sub1, Srch_StkR.$itm_sub1);
			addColumnPathMap(GiGr_LocR.$itm_sub2, Srch_StkR.$itm_sub2);
			addColumnPathMap(GiGr_LocR.$itm_sub3, Srch_StkR.$itm_sub3);
			addColumnPathMap(GiGr_LocR.$gi_loc_cd, "gi_loc_cd");
			addColumnPathMap(GiGr_LocR.$gi_str_ln_cd, "gi_str_ln_cd");
			addColumnPathMap(GiGr_LocR.$gi_stk_arrv_bp_cd, "gi_stk_arrv_bp_cd");
			addColumnPathMap(GiGr_LocR.$gi_stk_id_typ, "stk_id_typ");
			addColumnPathMap(GiGr_LocR.$gi_stk_bp_cd, "stk_bp_cd");
			addColumnPathMap(GiGr_LocR.$gr_loc_cd, Srch_StkR.$loc_cd);
			addColumnPathMap(GiGr_LocR.$gr_str_ln_cd, Srch_StkR.$str_ln_cd);
			addColumnPathMap(GiGr_LocR.$gr_schd_dt, "schd_tm");
		}
	}
	
	// 取引パタン区分の補完
	protected String getTrdPtnTyp(String giLoc, String grLoc) {
		return getTrdPtnTypBySppl(
				giLocCache().get(giLoc).sppl_cd(),
				grLocCache().get(grLoc).sppl_cd());
	}

	protected String getTrdPtnTypBySppl(String gi_sppl_cd, String gr_sppl_cd) {
		if(!isNull(gr_sppl_cd)) {
			return MAC_TRD_PTN_TYP.PROV.value();
		}
		else if (!isNull(gi_sppl_cd)) {
			return MAC_TRD_PTN_TYP.PROV_RTN.value();
		}
		return MAC_TRD_PTN_TYP.XFR.value();
	}
	
	// 移動・移送の判定
	protected boolean isXfrR(MCRow r) {
		return isSame(r.getString("gi_lg_grp_cd"), r.getString("gr_lg_grp_cd"));
	}
	
	protected boolean isShipR(MCRow r) {
		return !isSame(r.getString("gi_lg_grp_cd"), r.getString("gr_lg_grp_cd"));
	}

	protected boolean isProvR(MCRow r) {
		String trdPtnTyp = r.getString("trd_ptn_typ");
		if (MAC_TRD_PTN_TYP.isPROV(trdPtnTyp) || MAC_TRD_PTN_TYP.isPROV_RTN(trdPtnTyp)) {
			return true;
		}
		return false;
	}

	// 支給かどうかの判定
	protected boolean isProv(String gi_sppl_cd, String gr_sppl_cd) {
		return isNull(gi_sppl_cd) && !isNull(gr_sppl_cd);
	}

	protected boolean isProvRtn(String gi_sppl_cd, String gr_sppl_cd) {
		return isNull(gr_sppl_cd) && !isNull(gi_sppl_cd);
	}

	protected boolean isProvDD(String gi_sppl_cd, String gr_sppl_cd) {
		return !isNull(gi_sppl_cd)
				&& !isNull(gr_sppl_cd)
				&& !isSame(gi_sppl_cd, gr_sppl_cd);
	}

	// 移動・移送作成元が投入かどうかの判定 ロット混在不可フラグの引継元の判定に使用する
	protected boolean isSrcInpt(MST_XFR_SCHD_R xfrSchdR) {
		return MSC_XFR_SRC_TYP.isINPT(xfrSchdR.xfr_src_typ()) || MSC_XFR_SRC_TYP.isINPT_RPL(xfrSchdR.xfr_src_typ());
	}

	protected boolean isSrcSlo(MST_XFR_SCHD_R xfrSchdR) {
		return !isNull(xfrSchdR.slo_d_no()) || MSC_XFR_SRC_TYP.isSHIP_RPL(xfrSchdR.xfr_src_typ());
	}
	
	//////////////////////////////////////////////////////////////////////
	// キャッシュ関連
	protected static final Class<MSBEL_XfrSchdService> CLAZZ = MSBEL_XfrSchdService.class;
	protected FXUCL_MCDbcCache<MST_SLO_D_R> _sloDCache = null;
	protected FXUCL_MCDbcCache<MAM_LOC_R> _giLocCache = null;
	protected FXUCL_MCDbcCache<MAM_LOC_R> _grLocCache = null;
	protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _giDefLocCache = null;
	protected FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R> _itmLgGrpLocCache = null;
	protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _lgGrpCache = null;
	protected FXUCL_MCDbcCache<MST_XFR_SCHD_R> _cacheXfrSchdL = null;
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected FXUCL_MCDbcCache<MAM_TRD_R> _trdCache = null;
	protected TrdCdCache _trdCdCache = null;
	protected XfrSchdCache _xfrSchdCache = null;
	protected XfrAllocCache _xfrAllocCache = null;
	protected LgCtlCache _lgCtlCache = null;
	protected XfrExCache _xfrExCache = null;
	protected ShipDtCache _shipDtCache = null;
	protected TdlvCache _tdlvCache = null;
	protected GrLocAddrCache _grLocAddrCache = null;

	// 受注明細
	protected static void initSloDCache(MCList<XfrSchdChk04_DtlR>  mcL) {
		object(CLAZZ)._initSloDCache(mcL);
	}

	protected void _initSloDCache(MCList<XfrSchdChk04_DtlR>  mcL) {
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.not_lot_mix_flg);
		dbcL_bldr.addSelect(t.not_sublot_mix_flg);
		_sloDCache = new FXUCL_MCDbcCache<MST_SLO_D_R>(dbcL_bldr, mcL.groupBy(XfrSchd_DtlR.$slo_d_no), XfrSchd_DtlR.$slo_d_no);
	}

	protected static FXUCL_MCDbcCache<MST_SLO_D_R> sloDCache() {
		return object(CLAZZ)._sloDCache;
	}

	// 出庫場所
	protected static void initGiLocCache(MCList<? extends MCRow> mcL) {
		object(CLAZZ)._initGiLocCache(mcL);
	}

	protected void _initGiLocCache(MCList<? extends MCRow> mcL) {
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.loc_cd);
		dbcL_bldr.addSelect(t.wg_cd);
		dbcL_bldr.addSelect(t.lg_grp_cd);
		dbcL_bldr.addSelect(t.sppl_cd);
		_giLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, mcL, "gi_def_loc_cd");
	}

	protected static FXUCL_MCDbcCache<MAM_LOC_R> giLocCache() {
		return object(CLAZZ)._giLocCache;
	}

	// 入庫場所
	protected static void initGrLocCache(MCList<? extends MCRow> mcL) {
		object(CLAZZ)._initGrLocCache(mcL);
	}

	protected void _initGrLocCache(MCList<? extends MCRow> mcL) {

		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAM_BP_R m1 = MAM_BP_R.create("M1");
		dbcL_bldr.setSelect(t.loc_cd);
		dbcL_bldr.addSelect(t.loc_nm);
		dbcL_bldr.addSelect(t.wg_cd);
		dbcL_bldr.addSelect(t.lg_grp_cd);
		dbcL_bldr.addSelect(t.sppl_cd);
		dbcL_bldr.addSelect(m1.prov_rcv_typ);
		dbcL_bldr.addLeftOuterJoin(m1, bracket(t.sppl_cd.eq(m1.bp_cd)));
		_grLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, mcL, "gr_loc_cd");
	}

	protected static FXUCL_MCDbcCache<MAM_LOC_R> grLocCache() {
		return object(CLAZZ)._grLocCache;
	}

	// 入庫場所：住所関連項目
	public static void initGrLocAddrCache(MCList<XfrSchdChk04_DtlR> mcL) {
		object(CLAZZ)._initGrLocAddrCache(mcL);
	}

	protected void _initGrLocAddrCache(MCList<XfrSchdChk04_DtlR> mcL) {
		_grLocAddrCache = new GrLocAddrCache(mcL.subList(r->isShipR(r)));
	}

	public static GrLocAddrCache getGrLocAddrCache() {
		return object(CLAZZ)._grLocAddrCache;
	}

	public class GrLocAddrCache {
		protected MCIndexKey _grLocAddrIdx;
		protected MCList<MAM_LOC_R> _grLocAddrL;
		public GrLocAddrCache(MCList<XfrSchdChk04_DtlR> mcL) {

			_grLocAddrL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R grLocAddrL_t = MAM_LOC_R.create("T");
			MCQueryApiBuilder grLocAddrL_bldr = MCQueryApiBuilder.create(grLocAddrL_t);
			MAW_LOC_SUB_KEY_R w = MAW_LOC_SUB_KEY_R.create("W");
			
			grLocAddrL_bldr.setSelect(grLocAddrL_t.loc_cd);
			grLocAddrL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(w.loc_cd, w.st_dt,
					value(MAC_LOC_ADDR_TYP.ZIP_CD.value()), nullValue()).as("zip_cd"));
			grLocAddrL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(w.loc_cd, w.st_dt,
					value(MAC_LOC_ADDR_TYP.ADDR1.value()), nullValue()).as("addr1"));
			grLocAddrL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(w.loc_cd, w.st_dt,
					value(MAC_LOC_ADDR_TYP.ADDR2.value()), nullValue()).as("addr2"));
			grLocAddrL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(w.loc_cd, w.st_dt,
					value(MAC_LOC_ADDR_TYP.ADDR3.value()), nullValue()).as("addr3"));
			grLocAddrL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(w.loc_cd, w.st_dt,
					value(MAC_LOC_ADDR_TYP.ADDR4.value()), nullValue()).as("addr4"));
			grLocAddrL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(w.loc_cd, w.st_dt,
					value(MAC_LOC_ADDR_TYP.TEL.value()), nullValue()).as("tel"));
			grLocAddrL_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(w.loc_cd, w.st_dt,
					value(MAC_LOC_ADDR_TYP.FAX.value()), nullValue()).as("fax"));
			grLocAddrL_bldr.addSelect(w.st_dt);
			grLocAddrL_bldr.addInnerJoin(w, bracket(w.loc_cd.eq(grLocAddrL_t.loc_cd)));
			
			
			MCList<MAM_LOC_SUB_R> bindL = MCList.create(MAM_LOC_SUB_R.class);
			for (XfrSchdChk04_DtlR r : mcL) {
				MAM_LOC_SUB_R tmpR = MAM_LOC_SUB_R.create();
				tmpR.loc_cd(r.gr_loc_cd());
				tmpR.st_dt(r.dlv_schd_tm().trunc(MCDateFieldType.DAY));
				bindL.add(tmpR);
			}
			bindL = bindL.groupBy(MAM_LOC_SUB_R.$loc_cd, MAM_LOC_SUB_R.$st_dt);
			if (!isNull(bindL)) {
				MCQueryApiBuilder bindL_bldr = MCQueryApiBuilder.create(MAM_LOC_SUB_R.create("T"));
				dbWkDelete("MSBEL5200_MAW_LOC_SUB_D01", bindL_bldr.getBaseDbc());
				dbWkInsert("MSBEL5200_MAW_LOC_SUB_I01", bindL, bindL_bldr.getBaseDbc());
				dbSelect("MSBEL5200_MAM_LOC_S01", _grLocAddrL, grLocAddrL_bldr);
			}
			
			_grLocAddrIdx = _grLocAddrL.createIndex(MAM_LOC_R.$loc_cd, "st_dt");
		}
	
		protected MAM_LOC_R getFirst(String gr_loc_cd, MCDate dlv_schd_tm) {
			return _grLocAddrL.getFirst(_grLocAddrIdx, gr_loc_cd, dlv_schd_tm.trunc(MCDateFieldType.DAY));
		}
	}

	// 出庫物流場所グループに対するデフォルト場所
	protected static void initGiDefLocCache(MCList<? extends MCRow> mcL) {
		object(CLAZZ)._initGiDefLocCache(mcL);
	}	

	protected void _initGiDefLocCache(MCList<? extends MCRow> mcL) {

		MCList<MAM_LG_GRP_R> dbcL = MCList.create(MAM_LG_GRP_R.class);
		MAM_LG_GRP_R t = MAM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R t2 = MAM_LOC_R.create("T2");
		dbcL.addStringColumn("loc_cd");
		dbcL_bldr.setSelect(t.lg_grp_cd);
		dbcL_bldr.addSelect(t2.loc_cd.as("loc_cd"));
		dbcL.addStringColumn("def_loc_wg_cd");
		dbcL_bldr.addSelect(t2.wg_cd.as("def_loc_wg_cd"));
		dbcL_bldr.addInnerJoin(t2, bracket( t.lg_grp_cd.eq(t2.lg_grp_cd) 
										.and(t2.lg_def_flg.eq(value(true)))));

		MCRow tmpR = mcL.createRow();
		if (tmpR instanceof XfrPr_DtlR) {
			_giDefLocCache = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(dbcL, dbcL_bldr, mcL, XfrPr_DtlR.$lg_grp_cd);
		}
		else if (tmpR instanceof XfrSchdChk02_DtlR) {
			_giDefLocCache = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(dbcL, dbcL_bldr, mcL, XfrSchdChk02_DtlR.$lg_grp_cd);
		}
		else if (tmpR instanceof XfrSchdChk04_DtlR) {
			_giDefLocCache = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(dbcL, dbcL_bldr, mcL, XfrSchdChk04_DtlR.$gi_lg_grp_cd);
		}
	}

	protected static FXUCL_MCDbcCache<MAM_LG_GRP_R> giDefLocCache() {
		return object(CLAZZ)._giDefLocCache;
	}
	// 物流場所グループ
	protected static void initLgGrpCache(MCList<XfrSchd_DtlR> mcL) {
		object(CLAZZ)._initLgGrpCache(mcL);
	}	

	protected void _initLgGrpCache(MCList<XfrSchd_DtlR> mcL) {
		MAM_LG_GRP_R t = MAM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.wg_cd);
		_lgGrpCache = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(dbcL_bldr, mcL, XfrSchd_DtlR.$gi_lg_grp_cd);
	}

	protected static FXUCL_MCDbcCache<MAM_LG_GRP_R> lgGrpCache() {
		return object(CLAZZ)._lgGrpCache;
	}
	
	
	// 品目、出庫物流場所グループに対するデフォルト場所
	protected static void initItmLgGrpLocCache(MCList<? extends MCRow> mcL) {
		object(CLAZZ)._initItmLgGrpLocCache(mcL);
	}	

	protected void _initItmLgGrpLocCache(MCList<? extends MCRow> mcL) {

		MCList<MAM_ITM_LG_GRP_R> dbcL = MCList.create(MAM_ITM_LG_GRP_R.class);
		MAM_ITM_LG_GRP_R t = MAM_ITM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R t2 = MAM_LOC_R.create("T2");
		dbcL.addStringColumn("def_loc_wg_cd");
		dbcL_bldr.setSelect(t.lg_def_loc_cd);
		dbcL_bldr.addSelect(t2.wg_cd.as("def_loc_wg_cd"));
		dbcL_bldr.addInnerJoin(t2, bracket( t.lg_def_loc_cd.eq(t2.loc_cd)));

		MCRow tmpR = mcL.createRow();
		if (tmpR instanceof XfrPr_DtlR) {
			_itmLgGrpLocCache = new FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R>(dbcL, dbcL_bldr,
					mcL, XfrPr_DtlR.$itm_cd, XfrPr_DtlR.$itm_sub1, XfrPr_DtlR.$itm_sub2,
					XfrPr_DtlR.$itm_sub3, XfrPr_DtlR.$lg_grp_cd);
		}
		else if (tmpR instanceof XfrSchdChk02_DtlR) {
			_itmLgGrpLocCache = new FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R>(dbcL, dbcL_bldr,
					mcL, XfrSchdChk02_DtlR.$itm_cd, XfrSchdChk02_DtlR.$itm_sub1,
					XfrSchdChk02_DtlR.$itm_sub2, XfrSchdChk02_DtlR.$itm_sub3,
					XfrSchdChk02_DtlR.$lg_grp_cd);
		}
		else if (tmpR instanceof XfrSchdChk04_DtlR) {
			_itmLgGrpLocCache = new FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R>(dbcL, dbcL_bldr,
					mcL, XfrSchdChk04_DtlR.$itm_cd, XfrSchdChk04_DtlR.$itm_sub1,
					XfrSchdChk04_DtlR.$itm_sub2, XfrSchdChk04_DtlR.$itm_sub3,
					XfrSchdChk04_DtlR.$gi_lg_grp_cd);
		}
	}

	protected static FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R> itmLgGrpLocCache() {
		return object(CLAZZ)._itmLgGrpLocCache;
	}
	
	// 移動・移送予定のキャッシュ 
	protected void doXfrSchdCache(MCList<XfrPr_DtlR> up) {
		MCList<MST_XFR_SCHD_R> dbc = MCList.create(MST_XFR_SCHD_R.class);
		MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.xfr_src_no);
		dbc_bldr.addSelect(t.xfr_src_typ);
		dbc_bldr.addSelect(t.itm_ord_no);
		dbc_bldr.addSelect(t.slo_d_no);
		dbc_bldr.addSelect(t.rqst_can_flg);

		if (object(CLAZZ)._cacheXfrSchdL == null) {
			// 対象がなくてもキャッシュのインスタンスは作成するので、ひとまず空リストで作成する
			object(CLAZZ)._cacheXfrSchdL = new FXUCL_MCDbcCache<MST_XFR_SCHD_R>(dbc, dbc_bldr,
					-1, dbc, MST_XFR_SCHD_R.$xfr_schd_no);
		}

		MCList<XfrPr_DtlR> cndL = up.createInstance();
		for (XfrPr_DtlR r : up) {
			if (!isNull(r.xfr_schd_no())) {
				cndL.add(r);
			}
		}
		if (!cndL.isEmpty()) {
			dbSelectKey("MSBEL5200_MST_XFR_SCHD_S01", dbc, dbc_bldr, cndL);
			dbc.forEach(r -> {
				object(CLAZZ)._cacheXfrSchdL
						.putCache(r.toArray(MST_XFR_SCHD_R.$xfr_schd_no), r);
			});
		}
	}

	protected MST_XFR_SCHD_R getXfrSchdR(String xfrSchdNo) {
		return object(CLAZZ)._cacheXfrSchdL.get(xfrSchdNo);
	}

	// 品目
	protected static void initItmCache(MCList<? extends MCRow> mcL) {
		object(CLAZZ)._initItmCache(mcL);
	}

	protected void _initItmCache(MCList<? extends MCRow> mcL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.itm_cd);
		dbc_bldr.addSelect(t.stk_mng_typ);
		dbc_bldr.addSelect(t.asset_mng_typ);
		dbc_bldr.addSelect(t.ship_inst_typ);
		dbc_bldr.addSelect(t.ship_term_cd);
		dbc_bldr.addSelect(t.pack_alloc_flg);
		dbc_bldr.addSelect(t.sundry_itm_flg);
		dbc_bldr.addSelect(t.lot_mng_typ);
		dbc_bldr.addSelect(t.sublot_mng_typ);
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, mcL, "itm_cd", "itm_sub1",
				"itm_sub2", "itm_sub3");
	}

	protected static FXUCL_MCDbcCache<MAM_ITM_R> itmCache() {
		return object(CLAZZ)._itmCache;
	}

	protected String getShipInstTyp(MAM_ITM_R itmCacheR) {
		if (itmCacheR != null && MAC_SHIP_INST_TYP.isNON(itmCacheR.ship_inst_typ())) {
			return MAC_SHIP_INST_TYP.NON.value();
		}
		return MAC_SHIP_INST_TYP.PICK.value();
	}

	// 品目単位
	protected static void initItmUnitCache(MCList<? extends MCRow> mcL) {
		object(CLAZZ)._initItmUnitCache(mcL);
	}
	
	protected void _initItmUnitCache(MCList<? extends MCRow> mcL) {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.itm_cd);
		dbc_bldr.addSelect(t.pack_flg);
		dbc_bldr.addSelect(t.conv_base_qty);
		dbc_bldr.addSelect(t.conv_qty);
		dbc_bldr.addSelect(t.dec_place);
		dbc_bldr.addSelect(t.rnd_typ);
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc_bldr, mcL, "itm_cd",
				"itm_sub1", "itm_sub2", "itm_sub3", "trd_unit_cd");
	}
	
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> itmUnitCache() {
		return object(CLAZZ)._itmUnitCache;
	}
	
	// 取引マスタ
	public static void initTrdCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initTrdCache(bindL);
	}

	protected void _initTrdCache(MCList<? extends MCRow> bindL) {
		MAM_TRD_R t = MAM_TRD_R.create("T");
		MCQueryApiBuilder trdL_bldr = MCQueryApiBuilder.create(t);
		trdL_bldr.setSelect(t.trd_cd, t.trd_ptn_typ);
		_trdCache = new FXUCL_MCDbcCache<MAM_TRD_R>(trdL_bldr, bindL, "trd_cd");
	}

	protected static FXUCL_MCDbcCache<MAM_TRD_R> trdCache() {
		return object(CLAZZ)._trdCache;
	}


	// 取引マスタ (取引ＣＤの取得) 「取引パタン区分」「自動時採用フラグ=1」
	public static void initTrdCdCache() {
		object(CLAZZ)._initTrdCdCache();
	}

	protected void _initTrdCdCache() {
		_trdCdCache = new TrdCdCache();
	}

	public static TrdCdCache getTrdCdCache() {
		return object(CLAZZ)._trdCdCache;
	}

	public class TrdCdCache {
		protected MCIndexKey _trdCdIdx;
		protected MCList<MAM_TRD_R> _trdCdL;
		protected TrdCdCache() {
			MCList<MAM_TRD_R> dbcL = MCList.create(MAM_TRD_R.class);
			MAM_TRD_R t = MAM_TRD_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.trd_ptn_typ, t.trd_cd);
			dbcL_bldr.addWhereWithAnd(t.auto_adopt_flg.eq(value(true)));
			dbSelect("MSBEL5200_MAM_TRD_S01", dbcL, dbcL_bldr);
			_trdCdL = dbcL;
			_trdCdIdx = dbcL.createIndex(MAM_TRD_R.$trd_ptn_typ);
		}
	
		public MAM_TRD_R get(String trd_ptn_typ) {
			return _trdCdL.getFirst(_trdCdIdx, trd_ptn_typ);
		}
	}

	// 取引先マスタ：配送先
	public static void initTdlvCache(MCList<XfrSchdChk04_DtlR> mcL) {
		object(CLAZZ)._initTdlvCache(mcL.subList(r->MSC_SHIP_TO_ID_TYP.isTDLV(r.ship_to_id_typ())));
	}

	protected void _initTdlvCache(MCList<XfrSchdChk04_DtlR> mcL) {
		_tdlvCache = new TdlvCache(mcL);
	}

	protected static TdlvCache getTlvdCache() {
		return object(CLAZZ)._tdlvCache;
	}
	
	public class TdlvCache {
		protected MCList<MAM_BP_R> _tdlvDbcL;
		protected MCIndexKey _tdlvDbcIdx = null;
		public TdlvCache(MCList<XfrSchdChk04_DtlR> mcL) {
			
			_tdlvDbcL = MCList.create(MAM_BP_R.class);
			MAM_BP_R tdlvDbcL_t = MAM_BP_R.create("T");
			MCQueryApiBuilder tdlvDbcL_bldr = MCQueryApiBuilder.create(tdlvDbcL_t);
			MAW_BP_SUB_KEY_R w = MAW_BP_SUB_KEY_R.create("W");
			
			tdlvDbcL_bldr.setSelect(tdlvDbcL_t.bp_cd);
			tdlvDbcL_bldr.addSelect(tdlvDbcL_t.bp_nm);
			tdlvDbcL_bldr.addSelect(tdlvDbcL_t.dlv_sundry_flg);
			tdlvDbcL_bldr.addSelect(tdlvDbcL_t.lg_grp_cd);
			tdlvDbcL_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(w.bp_cd, w.st_dt,
					value(MAC_BP_ADDR_TYP.ZIP_CD.value())).as("zip_cd"));
			tdlvDbcL_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(w.bp_cd, w.st_dt,
					value(MAC_BP_ADDR_TYP.ADDR1.value())).as("addr1"));
			tdlvDbcL_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(w.bp_cd, w.st_dt,
					value(MAC_BP_ADDR_TYP.ADDR2.value())).as("addr2"));
			tdlvDbcL_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(w.bp_cd, w.st_dt,
					value(MAC_BP_ADDR_TYP.ADDR3.value())).as("addr3"));
			tdlvDbcL_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(w.bp_cd, w.st_dt,
					value(MAC_BP_ADDR_TYP.ADDR4.value())).as("addr4"));
			tdlvDbcL_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(w.bp_cd, w.st_dt,
					value(MAC_BP_ADDR_TYP.TEL.value())).as("tel"));
			tdlvDbcL_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(w.bp_cd, w.st_dt,
					value(MAC_BP_ADDR_TYP.FAX.value())).as("fax"));
			tdlvDbcL_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(w.bp_cd, w.st_dt,
					value(MAC_BP_ADDR_TYP.DLV_CNTCT_DPT.value())).as("dlv_cntct_dpt"));
			tdlvDbcL_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(w.bp_cd, w.st_dt,
					value(MAC_BP_ADDR_TYP.DLV_CNTCT_PSN.value())).as("dlv_cntct_psn"));
			tdlvDbcL_bldr.addSelect(w.st_dt);
			tdlvDbcL_bldr.addInnerJoin(w, bracket(w.bp_cd.eq(tdlvDbcL_t.bp_cd)));
			
			MCList<MAM_BP_SUB_R> bindL = MCList.create(MAM_BP_SUB_R.class);
			for (XfrSchdChk04_DtlR r : mcL) {
				MAM_BP_SUB_R tmpR = MAM_BP_SUB_R.create();
				tmpR.bp_cd(r.ship_to_id_cd());
				tmpR.st_dt(r.dlv_schd_tm().trunc(MCDateFieldType.DAY));
				bindL.add(tmpR);
			}
			bindL = bindL.groupBy(MAM_BP_SUB_R.$bp_cd, MAM_BP_SUB_R.$st_dt);
			if (!isNull(bindL)) {
				MCQueryApiBuilder bindL_bldr = MCQueryApiBuilder.create(MAM_BP_SUB_R.create("T"));
				dbWkDelete("MSBEL5200_MAW_BP_SUB_D01", bindL_bldr.getBaseDbc());
				dbWkInsert("MSBEL5200_MAW_BP_SUB_I01", bindL, bindL_bldr.getBaseDbc());
				dbSelect("MSBEL5200_MAM_BP_S01", _tdlvDbcL, tdlvDbcL_bldr);
			}
			
			_tdlvDbcIdx = _tdlvDbcL.createIndex(MAM_BP_R.$bp_cd, "st_dt");
		}

		protected MAM_BP_R getFirst(String tdlv_cd, MCDate dlv_rqst_tm) {
			return _tdlvDbcL.getFirst(_tdlvDbcIdx, tdlv_cd, dlv_rqst_tm.trunc(MCDateFieldType.DAY));
		}
	}

	// 移動・移送予定をロックしてキャッシュする
	protected static void initXfrSchdCache(MCList<? extends MCRow> mcL) {
		object(CLAZZ)._initXfrSchdCache(
				mcL.subList(r -> !MAC_DATA_CRUD_TYP.isCRT(r.getString("data_crud_typ"))));
	}

	protected void _initXfrSchdCache(MCList<? extends MCRow> mcL) {
		_xfrSchdCache = new XfrSchdCache(mcL);
	}

	protected static XfrSchdCache getXfrSchdCache() {
		return object(CLAZZ)._xfrSchdCache;
	}

	/**
	 * 移動移送予定のレコードをロックしてキャッシュする
	 * 「移動・移送予定ＮＯ」
	 * 「移動・移送元区分、移動・移送元ＮＯの組」
	 * 更新対象のレコードをキャッシュする
	 *
	 */
	protected class XfrSchdCache {
		protected MCList<MST_XFR_SCHD_R> _xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
		protected MCIndexKey _xfrSchdIdx;
		protected MCIndexKey _xfrSrcIdx;
		
		protected <T extends MCRow> XfrSchdCache(MCList<T> bindL) {
			MCList<XfrSchdChk04_DtlR> schdNoL = MCList.create(XfrSchdChk04_DtlR.class);
			MCList<XfrSchdChk04_DtlR> srcNoL = MCList.create(XfrSchdChk04_DtlR.class);
			MCList<MST_XFR_ALLOC_STS_SV_R> instDNoL = MCList.create(MST_XFR_ALLOC_STS_SV_R.class);
			for (T row : bindL) {
				if (row instanceof XfrSchdChk04_DtlR) {
					XfrSchdChk04_DtlR r = (XfrSchdChk04_DtlR)row;
					if (!isNull(r.xfr_schd_no())) {
						// 移動移送予定画面、製造などから呼出された場合
						schdNoL.add(r);
					}
					else if (!isNullOr(r.xfr_src_no(), r.xfr_src_typ())){
						// ＷＧ間依頼から呼出された場合
						srcNoL.add(r);
					}
				}
				else if (row instanceof XfrSchdChk02_DtlR) {
					XfrSchdChk02_DtlR r = (XfrSchdChk02_DtlR)row;
					// 移動一覧、移動指図から呼出された場合
					if (isNullOrNullVal(r.xfr_schd_no())) {
						// 指図まとめ、指図取消
						if (!isNullOrNullVal(r.xfr_inst_d_no())) {
							MST_XFR_ALLOC_STS_SV_R tmpR = MST_XFR_ALLOC_STS_SV_R.create();
							tmpR.xfr_inst_d_no(r.xfr_inst_d_no());
							instDNoL.add(tmpR);
						}
					}
					else {
						// 予定紐づき
						XfrSchdChk04_DtlR tmpR = XfrSchdChk04_DtlR.create();
						tmpR.xfr_schd_no(r.xfr_schd_no());
						schdNoL.add(tmpR);
					}
				}
			}
			
			if (!isNull(instDNoL)) {
				instDNoL = instDNoL.groupBy(MST_XFR_ALLOC_STS_SV_R.$xfr_inst_d_no);
				MST_XFR_ALLOC_STS_SV_R t = MST_XFR_ALLOC_STS_SV_R.create("T");
				MCQueryApiBuilder instDNoL_bldr = MCQueryApiBuilder.create(t);
				instDNoL_bldr.setSelect(t.xfr_schd_no);
				instDNoL_bldr.setWhere(t.xfr_inst_d_no.eq(bind("xfr_inst_d_no")));
				dbSelect("MSBEL5200_MST_XFR_ALLOC_STS_SV_S03", instDNoL, instDNoL_bldr, instDNoL);
				for (MST_XFR_ALLOC_STS_SV_R r : instDNoL) {
					XfrSchdChk04_DtlR tmpR = XfrSchdChk04_DtlR.create();
					tmpR.xfr_schd_no(r.xfr_schd_no());
					schdNoL.add(tmpR);
				}
			}

			MST_XFR_SCHD_R xfrSchdL_t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(xfrSchdL_t);
			MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
			MSW_XFR_SCHD_KEY_R w = MSW_XFR_SCHD_KEY_R.create("W");
			
			xfrSchdL_bldr.addSelect(t2.ship_pr_no);
			xfrSchdL_bldr.addLeftOuterJoin(t2, bracket(xfrSchdL_t.xfr_schd_no.eq(t2.xfr_schd_no)));
			xfrSchdL_bldr.addLockTable(xfrSchdL_t.xfr_schd_no);
			if (!isNull(schdNoL)) {
				schdNoL = schdNoL.groupBy(XfrSchdChk04_DtlR.$xfr_schd_no);
				schdNoL.sort(XfrSchdChk04_DtlR.$xfr_schd_no);
				xfrSchdL_bldr.setOrderByAsc(xfrSchdL_bldr.getBaseDbc().getKeyColumn$());
				dbSelectKeyForUpdate("MSBEL5200_MST_XFR_SCHD_S02", _xfrSchdL, xfrSchdL_bldr, schdNoL);
			}
			else if (!isNull(srcNoL)) {
				insXfrSchdWk(srcNoL);
				xfrSchdL_bldr.addInnerJoin(w, bracket(xfrSchdL_t.xfr_schd_no.eq(w.xfr_schd_no)));
				xfrSchdL_bldr.setOrderByAsc(xfrSchdL_bldr.getBaseDbc().getKeyColumn$());
				dbSelectForUpdate("MSBEL5200_MST_XFR_SCHD_S03", _xfrSchdL, xfrSchdL_bldr);
			}
			
			_xfrSchdIdx = _xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);
			_xfrSrcIdx = _xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_src_no, MST_XFR_SCHD_R.$xfr_src_typ);
		}

		protected void insXfrSchdWk(MCList<XfrSchdChk04_DtlR> srcNoL) {
			MSW_XFR_SCHD_KEY_R delS0 = MSW_XFR_SCHD_KEY_R.create();
			execDbWkDelete("MSBEL5200_MSW_XFR_SCHD_KEY_D01", delS0);
			
			MSW_XFR_SCHD_KEY_R insS0 = MSW_XFR_SCHD_KEY_R.create();
			MST_XFR_SCHD_R S1 = MST_XFR_SCHD_R.create();
			MCInsert q2 = sql("MSBEL5200_MSW_XFR_SCHD_KEY_I01")
				.insert(insS0)
				.columns(insS0.xfr_schd_no)
				.query(
						subQuery()
						.select(S1.xfr_schd_no)
						.from(S1)
						.where(
							S1.xfr_src_no.eq(bind("xfr_src_no"))
							.and(S1.xfr_src_typ.eq(bind("xfr_src_typ")))
							.and(S1.rqst_can_flg.eq(value(false)))
						)
					);
			q2.executeBatchUpdate(srcNoL);
		}

		protected MST_XFR_SCHD_R getFirst(XfrSchd_DtlR upR) {
			if(!isNull(upR.xfr_schd_no())) {
				return _xfrSchdL.getFirst(_xfrSchdIdx, upR.xfr_schd_no());
			}
			else if (!isNullOr(upR.xfr_src_no(), upR.xfr_src_typ())){
				return _xfrSchdL.getFirst(_xfrSrcIdx, upR.xfr_src_no(), upR.xfr_src_typ());
			}
			return null;
		}

		protected MST_XFR_SCHD_R getFirst(XfrSchdChk04_DtlR upR) {
			if(!isNull(upR.xfr_schd_no())) {
				return _xfrSchdL.getFirst(_xfrSchdIdx, upR.xfr_schd_no());
			}
			else if (!isNullOr(upR.xfr_src_no(), upR.xfr_src_typ())){
				MCList<MST_XFR_SCHD_R> subL = _xfrSchdL.subList(_xfrSrcIdx,
						upR.xfr_src_no(), upR.xfr_src_typ());
				if (isNull(subL)) {
					return null;
				}
				else if (subL.size() == 1) {
					return subL.get(0);
				}
				else {
					MCMessagePool.add(new MCMessage(upR, null, MSBEL0265, 1, subL.size(),
							getTableLabel(subL.createRow()),
							toStringWithMsgLabel(upR, XfrSchdChk04_DtlR.$xfr_src_no, XfrSchdChk04_DtlR.$xfr_src_typ),
							toDispGUIIndex(upR)));
					upR.err_flg(true);
				}
			}
			return null;
		}
		
		protected MST_XFR_SCHD_R getFirst(XfrSchdChk02_DtlR upR) {
			return _xfrSchdL.getFirst(_xfrSchdIdx, upR.xfr_schd_no());
		}
		
		protected MST_XFR_SCHD_R getFirst(XfrPr_DtlR upR) {
			return _xfrSchdL.getFirst(_xfrSchdIdx, upR.xfr_schd_no());
		}
		
		protected MCList<MST_XFR_SCHD_R> subList(MCList<XfrPr_DtlR> distinctL) {
			MCList<MST_XFR_SCHD_R> subL = MCList.create(MST_XFR_SCHD_R.class);
			for (XfrPr_DtlR r : distinctL) {
				if (!isNullOrNullVal(r.xfr_schd_no())) {
					MST_XFR_SCHD_R schdR = getFirst(r);
					if (schdR != null) {
						subL.add(schdR);
					}
				}
			}
			return subL;
		}
		
	}
	
	// 移動引当状況をロックしてキャッシュする
	protected static void initXfrAllocCache(MCList<XfrSchdChk02_DtlR> mcL, boolean schd_flg) {
		object(CLAZZ)._initXfrAllocCache(mcL, schd_flg);
	}

	protected void _initXfrAllocCache(MCList<XfrSchdChk02_DtlR> mcL, boolean schd_flg) {
		_xfrAllocCache = new XfrAllocCache(mcL, schd_flg);
	}

	protected static XfrAllocCache getXfrAllocCache() {
		return object(CLAZZ)._xfrAllocCache;
	}
	
	public class XfrAllocCache {
		protected MCList<MST_XFR_ALLOC_STS_R> _xfrAllocL;
		protected MCList<MST_XFR_ALLOC_STS_SV_R> _xfrAllocSvL;
		protected MCIndexKey _xfrAllocIdx;
		protected MCIndexKey _xfrAllocFlgIdx;
		protected MCIndexKey _xfrSchdIdx;
		protected MCIndexKey _xfrAllocSvIdx;
		public XfrAllocCache(MCList<XfrSchdChk02_DtlR> mcL, boolean schd_flg) {
			_xfrAllocL = MCList.create(MST_XFR_ALLOC_STS_R.class);
			_xfrAllocSvL = MCList.create(MST_XFR_ALLOC_STS_SV_R.class);
			
			MST_XFR_ALLOC_STS_R xfrAllocL_t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder xfrAllocL_bldr = MCQueryApiBuilder.create(xfrAllocL_t);
			if (schd_flg) {
				MCList<MST_XFR_SCHD_R> tmpL = MCList.create(MST_XFR_SCHD_R.class);
				for (XfrSchdChk02_DtlR r : mcL) {
					if (!isNullOrNullVal(r.xfr_schd_no())) {
						MST_XFR_SCHD_R tmpR = MST_XFR_SCHD_R.create();
						tmpR.xfr_schd_no(r.xfr_schd_no());
						tmpL.add(tmpR);
					}
				}
				tmpL = tmpL.groupBy(MST_XFR_SCHD_R.$xfr_schd_no);
				if (!isNull(tmpL)) {
					MCQueryApiBuilder tmpL_bldr = MCQueryApiBuilder.create(MST_XFR_SCHD_R.create("T"));
					MSW_XFR_SCHD_KEY_R w = MSW_XFR_SCHD_KEY_R.create("W");
					
					dbWkDelete("MSBEL5200_MSW_XFR_SCHD_D01", tmpL_bldr.getBaseDbc());
					dbWkInsert("MSBEL5200_MSW_XFR_SCHD_I01", tmpL, tmpL_bldr.getBaseDbc());
					xfrAllocL_bldr.addInnerJoin(w, bracket( w.xfr_schd_no.eq(xfrAllocL_t.xfr_schd_no)));
					xfrAllocL_bldr.setOrderByAsc(xfrAllocL_bldr.getBaseDbc().getKeyColumn$());
					dbSelectForUpdate("MSBEL5200_MST_XFR_ALLOC_STS_S03", _xfrAllocL, xfrAllocL_bldr);
					MST_XFR_ALLOC_STS_SV_R xfrAllocSvL_t = MST_XFR_ALLOC_STS_SV_R.create("T");
					MCQueryApiBuilder xfrAllocSvL_bldr = MCQueryApiBuilder.create(xfrAllocSvL_t);
					xfrAllocSvL_bldr.addWhereWithAnd(xfrAllocSvL_t.inst_bndl_flg.eq(value(true)));
					xfrAllocSvL_bldr.addInnerJoin(w, bracket( w.xfr_schd_no.eq(xfrAllocSvL_t.xfr_schd_no)));
					xfrAllocSvL_bldr.setOrderByAsc(xfrAllocSvL_bldr.getBaseDbc().getKeyColumn$());
					dbSelect("MSBEL5200_MST_XFR_ALLOC_STS_SV_S04", _xfrAllocSvL, xfrAllocSvL_bldr);
				}
				_xfrSchdIdx = _xfrAllocL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_schd_no);
				_xfrAllocSvIdx = _xfrAllocSvL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_schd_no);
				_xfrAllocFlgIdx = _xfrAllocL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_schd_no, MST_XFR_ALLOC_STS_R.$alloc_flg);
			}
			else {
				MCList<XfrSchdChk02_DtlR> tmpL = mcL
						.subList(r -> !isNull(r.xfr_alloc_sts_no()))
						.groupBy(XfrSchdChk02_DtlR.$xfr_alloc_sts_no);
				tmpL.sort(XfrSchdChk02_DtlR.$xfr_alloc_sts_no);
				xfrAllocL_bldr.setOrderByAsc(xfrAllocL_bldr.getBaseDbc().getKeyColumn$());
				dbSelectKeyForUpdate("MSBEL5200_MST_XFR_ALLOC_STS_S04", _xfrAllocL, xfrAllocL_bldr, tmpL);
			}
			
			_xfrAllocIdx = _xfrAllocL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
		}

		protected MST_XFR_ALLOC_STS_R getFirst(String xfr_alloc_sts_no) {
			return _xfrAllocL.getFirst(_xfrAllocIdx, xfr_alloc_sts_no);
		}
		
		protected MCList<MST_XFR_ALLOC_STS_R> subListAlloc(String xfr_schd_no) {
			return _xfrAllocL.subList(_xfrSchdIdx, xfr_schd_no);
		}
		
		protected MCList<MST_XFR_ALLOC_STS_R> subListAllocFlgIdx(String xfr_schd_no, boolean alloc_flg) {
			return _xfrAllocL.subList(_xfrAllocFlgIdx, xfr_schd_no, alloc_flg);
		}
		
		protected MCList<MST_XFR_ALLOC_STS_SV_R> subListAllocSv(String xfr_schd_no) {
			return _xfrAllocSvL.subList(_xfrAllocSvIdx, xfr_schd_no);
		}
		
	}

	// 物流制御マスタ「出荷元物流グループＣＤ」「出荷先物流グループＣＤ」「 出荷条件ＣＤ」
	protected static void initLgCtlCache(MCList<XfrSchdChk04_DtlR> mcL) {
		object(CLAZZ)._initLgCtlCache(mcL.subList(r->!isSame(r.gi_lg_grp_cd(), r.gr_lg_grp_cd())));
	}

	protected void _initLgCtlCache(MCList<XfrSchdChk04_DtlR> mcL) {
		MCList<XfrSchdEx_DtlR> xfrExL = MCList.create(XfrSchdEx_DtlR.class);
		for(XfrSchdChk04_DtlR mcR : mcL) {
			XfrSchdEx_DtlR exR = XfrSchdEx_DtlR.create();
			exR.gi_lg_grp_cd(mcR.gi_lg_grp_cd());
			exR.gr_lg_grp_cd(mcR.gr_lg_grp_cd());
			exR.ship_term_cd(mcR.ship_term_cd());
			exR.ship_to_id_typ(mcR.ship_to_id_typ());
			exR.ship_to_id_cd(mcR.ship_to_id_cd());
			exR.trd_ptn_typ(mcR.trd_ptn_typ());
			xfrExL.add(exR);
		}
		_lgCtlCache = new LgCtlCache(xfrExL);
	}

	protected static LgCtlCache getLgCtlCache() {
		return object(CLAZZ)._lgCtlCache;
	}

	public class LgCtlCache {
		protected MCIndexKey _lgCtlIdx;
		
		protected MCList<MAM_LG_CTL_R> _lgCtlCache;
		
		protected MCIndexKey _tdlvIdx;
		
		protected MCList<MAM_BP_R> _tdlvCache;
		
		protected MCIndexKey _tdlvLgCtlIdx;
		
		protected MCList<MAM_LG_CTL_R> _tdlvLgCtlCache;
		
		protected LgCtlCache(MCList<XfrSchdEx_DtlR> mcL) {
			setLgCtlCache(mcL);
			setTdlvCache(mcL);
			setTdlvLgCtlCache(mcL.subList(r-> MSC_SHIP_TO_ID_TYP.isTDLV(r.ship_to_id_typ())));
		}
		
		protected void setLgCtlCache(MCList<XfrSchdEx_DtlR> mcL) {
			_lgCtlCache = MCList.create(MAM_LG_CTL_R.class);
			MAM_LG_CTL_R lgCtlCache_t = MAM_LG_CTL_R.create("T");
			MCQueryApiBuilder lgCtlCache_bldr = MCQueryApiBuilder.create(lgCtlCache_t);
			lgCtlCache_bldr.setSelect(lgCtlCache_t.fr_lg_grp_cd);
			lgCtlCache_bldr.addSelect(lgCtlCache_t.to_lg_grp_cd);
			lgCtlCache_bldr.addSelect(lgCtlCache_t.ship_term_cd);
			lgCtlCache_bldr.addSelect(lgCtlCache_t.xfr_lt);
			lgCtlCache_bldr.addSelect(lgCtlCache_t.iv_trd_flg);
			lgCtlCache_bldr.addSelect(lgCtlCache_t.def_tdlv_cd);
			lgCtlCache_bldr.addWhereWithAnd(lgCtlCache_t.fr_lg_grp_cd.eq(bind("gi_lg_grp_cd")));
			lgCtlCache_bldr.addWhereWithAnd(lgCtlCache_t.to_lg_grp_cd.eq(bind("gr_lg_grp_cd")));
			lgCtlCache_bldr.addWhereWithAnd(lgCtlCache_t.ship_term_cd.eq(bind("ship_term_cd")));
			
			MCList<XfrSchdEx_DtlR> bindL  = mcL.groupBy(
					XfrSchdEx_DtlR.$gi_lg_grp_cd,
					XfrSchdEx_DtlR.$gr_lg_grp_cd);
			for (XfrSchdEx_DtlR r : bindL) {
				r.ship_term_cd(MAC_STR.NULL_VAL.value());
			}
			for (XfrSchdEx_DtlR r : mcL) {
				if (!isNull(r.ship_term_cd())) {
					bindL.add(r);
				}
			}
			bindL = bindL.groupBy(
					XfrSchdEx_DtlR.$gi_lg_grp_cd,
					XfrSchdEx_DtlR.$gr_lg_grp_cd,
					XfrSchdEx_DtlR.$ship_term_cd
					);
			
			if (!isNull(bindL)) {
				dbSelect("MSBEL5200_MAM_LG_CTL_S01", _lgCtlCache, lgCtlCache_bldr, bindL);
			}
			_lgCtlIdx = _lgCtlCache.createIndex(MAM_LG_CTL_R.$fr_lg_grp_cd,
					MAM_LG_CTL_R.$to_lg_grp_cd, MAM_LG_CTL_R.$ship_term_cd);
		}
		
		protected void setTdlvCache(MCList<XfrSchdEx_DtlR> mcL) {
			_tdlvCache = MCList.create(MAM_BP_R.class);
			MAM_BP_R tdlvCache_t = MAM_BP_R.create("T");
			MCQueryApiBuilder tdlvCache_bldr = MCQueryApiBuilder.create(tdlvCache_t);
			tdlvCache_bldr.setSelect(tdlvCache_t.bp_cd);
			tdlvCache_bldr.addSelect(tdlvCache_t.lg_grp_cd);
			tdlvCache_bldr.addSelect(tdlvCache_t.via_dlv_typ);
			tdlvCache_bldr.addSelect(tdlvCache_t.tdlv_flg);
			tdlvCache_bldr.addWhereWithAnd(tdlvCache_t.bp_cd.eq(bind("ship_to_id_cd")));
			
			MCList<XfrSchdEx_DtlR> bindL = MCList.create(XfrSchdEx_DtlR.class);
			for (XfrSchdEx_DtlR r : mcL) {
				MAM_LG_CTL_R lgCtlR = getGiGr(r.gi_lg_grp_cd(), r.gr_lg_grp_cd(), r.ship_term_cd());
				if (lgCtlR == null
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					continue;
				}
				if (lgCtlR.iv_trd_flg()) {
					if (isNull(r.ship_to_id_cd())) {
						r.ship_to_id_cd(lgCtlR.def_tdlv_cd());
					}
					if (!isNull(r.ship_to_id_cd())) {
						bindL.add(r);
					}
					r.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value());
				}
			}
			bindL = bindL.groupBy(XfrSchdEx_DtlR.$ship_to_id_cd);
			
			if (!isNull(bindL)) {
				dbSelect("MSBEL5200_MAM_BP_S02", _tdlvCache, tdlvCache_bldr, bindL);
			}
			_tdlvIdx = _tdlvCache.createIndex(MAM_BP_R.$bp_cd);
		}
		
		protected void setTdlvLgCtlCache(MCList<XfrSchdEx_DtlR> mcL) {
			_tdlvLgCtlCache = MCList.create(MAM_LG_CTL_R.class);
			MAM_LG_CTL_R tdlvLgCtlCache_t = MAM_LG_CTL_R.create("T");
			MCQueryApiBuilder tdlvLgCtlCache_bldr = MCQueryApiBuilder.create(tdlvLgCtlCache_t);
			tdlvLgCtlCache_bldr.setSelect(tdlvLgCtlCache_t.fr_lg_grp_cd);
			tdlvLgCtlCache_bldr.addSelect(tdlvLgCtlCache_t.to_lg_grp_cd);
			tdlvLgCtlCache_bldr.addSelect(tdlvLgCtlCache_t.ship_term_cd);
			tdlvLgCtlCache_bldr.addSelect(tdlvLgCtlCache_t.xfr_lt);
			tdlvLgCtlCache_bldr.addSelect(tdlvLgCtlCache_t.iv_trd_flg);
			tdlvLgCtlCache_bldr.addSelect(tdlvLgCtlCache_t.def_tdlv_cd);
			tdlvLgCtlCache_bldr.addWhereWithAnd(tdlvLgCtlCache_t.fr_lg_grp_cd.eq(bind("gi_lg_grp_cd")));
			tdlvLgCtlCache_bldr.addWhereWithAnd(tdlvLgCtlCache_t.to_lg_grp_cd.eq(bind("ship_to_lg_grp_cd")));
			tdlvLgCtlCache_bldr.addWhereWithAnd(tdlvLgCtlCache_t.ship_term_cd.eq(bind("ship_term_cd")));
			
			for (XfrSchdEx_DtlR r : mcL) {
				MAM_BP_R bpR = getTdlv(r.ship_to_id_cd());
				if (bpR != null) {
					r.ship_to_lg_grp_cd(bpR.lg_grp_cd());
				}
			}
			
			MCList<XfrSchdEx_DtlR> bindL  = mcL.groupBy(
					XfrSchdEx_DtlR.$gi_lg_grp_cd,
					XfrSchdEx_DtlR.$ship_to_lg_grp_cd);
			for (XfrSchdEx_DtlR r : bindL) {
				r.ship_term_cd(MAC_STR.NULL_VAL.value());
			}
			for (XfrSchdEx_DtlR r : mcL) {
				if (!isNull(r.ship_term_cd())) {
					bindL.add(r);
				}
			}
			bindL = bindL.groupBy(
					XfrSchdEx_DtlR.$gi_lg_grp_cd,
					XfrSchdEx_DtlR.$ship_to_lg_grp_cd,
					XfrSchdEx_DtlR.$ship_term_cd
					);
			
			if (!isNull(bindL)) {
				dbSelect("MSBEL5200_MAM_LG_CTL_S02", _tdlvLgCtlCache, tdlvLgCtlCache_bldr, bindL);
			}
			_tdlvLgCtlIdx = _tdlvLgCtlCache.createIndex(MAM_LG_CTL_R.$fr_lg_grp_cd,
					MAM_LG_CTL_R.$to_lg_grp_cd, MAM_LG_CTL_R.$ship_term_cd);
		}
		
		protected MAM_LG_CTL_R getGiGr(String gi_lg_grp_cd, String gr_lg_grp_cd, String ship_term_cd) {
			MAM_LG_CTL_R lgCtlR = null;
	
			lgCtlR = _lgCtlCache.getFirst(_lgCtlIdx, gi_lg_grp_cd, gr_lg_grp_cd,
					nvl(ship_term_cd, MAC_STR.NULL_VAL.value()));
			if (isNull(lgCtlR) && !isNull(ship_term_cd)) {
				lgCtlR = _lgCtlCache.getFirst(_lgCtlIdx, gi_lg_grp_cd, gr_lg_grp_cd,
						MAC_STR.NULL_VAL.value());
			}
			return lgCtlR;
		}
		
		protected MAM_BP_R getTdlv(String bp_cd) {
			return _tdlvCache.getFirst(_tdlvIdx, bp_cd);
		}
		
		protected MAM_LG_CTL_R getGiTdlv(
				String gi_lg_grp_cd,
				String ship_to_lg_grp_cd,
				String ship_term_cd) {
			MAM_LG_CTL_R lgCtlR = null;

			lgCtlR = _tdlvLgCtlCache.getFirst(_tdlvLgCtlIdx, gi_lg_grp_cd,
					ship_to_lg_grp_cd, nvl(ship_term_cd, MAC_STR.NULL_VAL.value()));
			if (isNull(lgCtlR) && !isNull(ship_term_cd)) {
				lgCtlR = _tdlvLgCtlCache.getFirst(_tdlvLgCtlIdx, gi_lg_grp_cd,
						ship_to_lg_grp_cd, MAC_STR.NULL_VAL.value());
			}
			return lgCtlR;
		}
	}


	// 出荷予定日時、納品予定日時のキャッシュ
	protected static void initShipDtCache(MCList<XfrSchdChk04_DtlR> mcL, XfrSchdChk04_CtrlR ctrlR) {
		object(CLAZZ)._initShipDtCache(mcL, ctrlR);
	}

	protected void _initShipDtCache(MCList<XfrSchdChk04_DtlR> mcL, XfrSchdChk04_CtrlR ctrlR) {
		_shipDtCache = new ShipDtCache(mcL, ctrlR);
	}

	protected static ShipDtCache getShipDtCache() {
		return object(CLAZZ)._shipDtCache;
	}

	public class ShipDtCache {
		MCList<MSW_SHIP_SCHD_DT_CALC_R> _shipDtL = MCList.create(MSW_SHIP_SCHD_DT_CALC_R.class); 
		MCIndexKey _shipDtIdx = null;
		protected ShipDtCache(MCList<XfrSchdChk04_DtlR> bindL, XfrSchdChk04_CtrlR ctrlR) {
			MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 op = MSBEL_ShipSchdDtCalcService
					.crtShipSchdDt_Srch01();
			Map_MSW_SHIP_SCHD_DT_CALC_R_XfrSchdChk04_DtlR<MSW_SHIP_SCHD_DT_CALC_R, XfrSchdChk04_DtlR> map = createMap_MSW_SHIP_SCHD_DT_CALC_R_XfrSchdChk04_DtlR();
			map.setWith(ctrlR);
			addAll(op.up0(), bindL, map);
			op.exec();
			_shipDtL = op.down0();
			_shipDtIdx = _shipDtL.createIndex(MSW_SHIP_SCHD_DT_CALC_R.$peg_no);
		}

		protected MSW_SHIP_SCHD_DT_CALC_R getFirstByPegNo(MCNumber peg_no) {
			return _shipDtL.getFirst(_shipDtIdx, peg_no);
		}

		protected MCList<MSW_SHIP_SCHD_DT_CALC_R> getCache() {
			return _shipDtL;
		}

	}

	protected Map_MSW_SHIP_SCHD_DT_CALC_R_XfrSchdChk04_DtlR<MSW_SHIP_SCHD_DT_CALC_R,XfrSchdChk04_DtlR> createMap_MSW_SHIP_SCHD_DT_CALC_R_XfrSchdChk04_DtlR() {
		return new Map_MSW_SHIP_SCHD_DT_CALC_R_XfrSchdChk04_DtlR<MSW_SHIP_SCHD_DT_CALC_R, XfrSchdChk04_DtlR>();
	}

	public class Map_MSW_SHIP_SCHD_DT_CALC_R_XfrSchdChk04_DtlR<D extends MSW_SHIP_SCHD_DT_CALC_R, S extends XfrSchdChk04_DtlR> extends MCRowMapper<D,S>{
		protected XfrSchdChk04_CtrlR _xfrSchdChk04Ctrl;
		protected void setWith(XfrSchdChk04_CtrlR _xfrSchdChk04Ctrl) {
			this._xfrSchdChk04Ctrl = _xfrSchdChk04Ctrl;
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			// 運用日付によるスライドを避けるため締時間チェック、出荷日チェックはオフ、基準日には過去日付を設定する
			dest.cl_time_chk_flg(false);
			dest.ship_dt_chk_flg(false);
			dest.ship_cal_cd_chk_flg(false);
			dest.early_ship_dt_add_days_chk_flg(false);
			if (MAC_VIA_DLV_TYP.isVIA(src.via_dlv_typ())) {
				dest.dlv_rqst_tm(null);
				dest.ship_to_lg_grp_cd(src.ship_to_lg_grp_cd());
				dest.ship_rqst_tm(nvl(src.gi_rqst_tm(), getToday()));

				if (MSC_XFR_SRC_TYP.isITM_ORD(src.xfr_src_typ())) {
					// 配送先経由する場合に、配送先までのLTが納品先までのLTより長く、
					// 入庫希望日－配送先LTが出庫希望日より前になる場合は出荷希望日を置き換える
					MAM_LG_CTL_R dLgCtlR = getLgCtlCache().getGiGr(src.gi_lg_grp_cd(),
							src.gr_lg_grp_cd(), src.ship_term_cd());
					MAM_LG_CTL_R tLgCtlR = getLgCtlCache().getGiTdlv(src.gi_lg_grp_cd(),
							src.ship_to_lg_grp_cd(), src.ship_term_cd());
					MCNumber dLt = isNull(dLgCtlR) ? MCNumber.ZERO : nvl(dLgCtlR.xfr_lt(), MCNumber.ZERO);
					MCNumber tLt = isNull(tLgCtlR) ? MCNumber.ZERO : nvl(tLgCtlR.xfr_lt(), MCNumber.ZERO);
					if (tLt.gt(dLt)) {
						MCDate dt = src.gr_rqst_tm().trunc(MCDateFieldType.DAY).addDay(tLt.negate());
						if (dt.lt(nvl(src.gi_rqst_tm(), getToday()))) {
							dest.ship_rqst_tm(dt);
						}
					}
				}
			}
			else {
				dest.dlv_rqst_tm(src.gr_rqst_tm());
				dest.ship_to_lg_grp_cd(src.gr_lg_grp_cd());
				dest.ship_rqst_tm(src.gi_rqst_tm());
			}
			// 画面から実行した場合は受付日を基準日とする
			if (_xfrSchdChk04Ctrl.screen_flg()) {
				dest.base_dt(src.rcpt_dt());
			}
			else {
				dest.base_dt(MCDate.valueOf(new Date(Integer.MIN_VALUE)));
			}
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$peg_no, XfrSchdChk04_DtlR.$peg_no);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_typ, XfrSchdChk04_DtlR.$ship_to_id_typ);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_cd, XfrSchdChk04_DtlR.$ship_to_id_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_fr_lg_grp_cd, XfrSchdChk04_DtlR.$gi_lg_grp_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_term_cd, XfrSchdChk04_DtlR.$ship_term_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_inst_typ, XfrSchdChk04_DtlR.$ship_inst_typ);
		}
	}
	
	protected XfrSchdEx_DtlR getXfrSchdEx(MCRow causeRow, String gi_lg_grp_cd,
			String gr_lg_grp_cd, String ship_term_cd, String ship_to_id_cd, String via_dlv_typ, String trd_ptn_typ) {
		XfrSchdEx_DtlR row = XfrSchdEx_DtlR.create();
		if(isSame(gi_lg_grp_cd, gr_lg_grp_cd)) {
			row.gi_lg_grp_cd(gi_lg_grp_cd);
			row.gr_lg_grp_cd(gr_lg_grp_cd);
			row.ship_term_cd(ship_term_cd);
			row.iv_trd_flg(false);
			row.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.LOC.value());
			row.ship_to_lg_grp_cd(gr_lg_grp_cd);
			
			return row;
		}
		MAM_LG_CTL_R lgCtlGiGrR = getLgCtlCache().getGiGr(gi_lg_grp_cd, gr_lg_grp_cd, ship_term_cd);
		if(isNull(lgCtlGiGrR)) {
			// 物流制御マスタが設定されていない
			MCMessagePool.add(new MCMessage(
					causeRow, null, MSBEL0180,
					gi_lg_grp_cd,
					gr_lg_grp_cd,
					ship_term_cd,
					toDispGUIIndex(causeRow)));
			row.err_flg(true);
			return row;
		}

		row.gi_lg_grp_cd(gi_lg_grp_cd);
		row.gr_lg_grp_cd(gr_lg_grp_cd);
		row.ship_term_cd(ship_term_cd);
		row.iv_trd_flg(!MAC_TRD_PTN_TYP.isPROV_RTN(trd_ptn_typ) && lgCtlGiGrR.iv_trd_flg());

		// インボイス取引である
		if(row.iv_trd_flg()) {
			row.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value());
			if (isNull(ship_to_id_cd)) {
				row.tdlv_cd(lgCtlGiGrR.def_tdlv_cd());
			}
			else {
				row.tdlv_cd(ship_to_id_cd);
			}
			MAM_BP_R bpR = getLgCtlCache().getTdlv(row.tdlv_cd());
			if (isNull(bpR)) {
				MCMessagePool.addAll(getRecordNotFoundMsg("MA", "MAM_BP", new String[] {
						MAM_BP_R.$bp_cd
				}, new String[] {
						row.tdlv_cd()}, causeRow));
				row.err_flg(true);
				return row;
			}
			if (!bpR.tdlv_flg()) {
				String keyInfo = toStringWithMsgLabel(causeRow, XfrSchdChk04_DtlR.$ship_to_id_cd);
				keyInfo = MCStringUtil.join(MCStringUtil.LF_CODE, keyInfo, toDispGUIIndex(causeRow));
				MCMessagePool.add(new MCMessage(causeRow, null, MAUAL0261, keyInfo));
				row.err_flg(true);
				return row;
			}
			row.ship_to_lg_grp_cd(bpR.lg_grp_cd());
			if (isNull(via_dlv_typ)) {
				row.via_dlv_typ(bpR.via_dlv_typ());
			}
			else {
				row.via_dlv_typ(via_dlv_typ);
			}

			if (MAC_VIA_DLV_TYP.isVIA(row.via_dlv_typ())) {
				MAM_LG_CTL_R lgCtlGiTdlvR = getLgCtlCache().getGiTdlv(gi_lg_grp_cd,
						row.ship_to_lg_grp_cd(), ship_term_cd);
				if(isNull(lgCtlGiTdlvR)) {
					// 物流制御マスタが設定されていない
					MCMessagePool.add(new MCMessage(
							causeRow, null, MSBEL0180,
							gi_lg_grp_cd,
							row.ship_to_lg_grp_cd(),
							ship_term_cd,
							toDispGUIIndex(causeRow)));
					row.err_flg(true);
					return row;
				}
			}
		}
		// インボイス取引でない
		else {
			row.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.LOC.value());
			row.ship_to_lg_grp_cd(gr_lg_grp_cd);
		}
		
		return row;
	}

	public class XfrExCache {
		protected MCList<XfrSchdEx_DtlR> _xfrExCache = null;

		public XfrExCache(MCList<XfrSchdEx_DtlR> mcL) {
			LgCtlCache lgCtlCache = crtLgCtlCache(mcL);
			for(XfrSchdEx_DtlR mcR : mcL) {
				if(isSame(mcR.gi_lg_grp_cd(), mcR.gr_lg_grp_cd())) {
					mcR.iv_trd_flg(false);
					mcR.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.LOC.value());
					continue;
				}
				MAM_LG_CTL_R lgCtlGiGrR = lgCtlCache.getGiGr(mcR.gi_lg_grp_cd(), mcR.gr_lg_grp_cd(), mcR.ship_term_cd());
				if(isNull(lgCtlGiGrR)) {
					// 物流制御マスタが設定されていない
					MCMessagePool.add(new MCMessage(
							mcR, null, MSBEL0180,
							mcR.gi_lg_grp_cd(),
							mcR.gr_lg_grp_cd(),
							mcR.ship_term_cd(),
							toDispGUIIndex(mcR)));
					mcR.err_flg(true);
					continue;
				}

				mcR.iv_trd_flg(!MAC_TRD_PTN_TYP.isPROV_RTN(mcR.trd_ptn_typ()) && lgCtlGiGrR.iv_trd_flg());
				
				// インボイス取引である
				if(mcR.iv_trd_flg()) {
					mcR.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value());
					mcR.tdlv_cd(lgCtlGiGrR.def_tdlv_cd());
					MAM_BP_R bpR = lgCtlCache.getTdlv(mcR.tdlv_cd());
					if (bpR != null) {
						mcR.via_dlv_typ(bpR.via_dlv_typ());
						mcR.ship_to_lg_grp_cd(bpR.lg_grp_cd());
					}
					if (MAC_VIA_DLV_TYP.isVIA(mcR.via_dlv_typ())) {
						MAM_LG_CTL_R lgCtlGiTdlvR = lgCtlCache.getGiTdlv(
								lgCtlGiGrR.fr_lg_grp_cd(), mcR.ship_to_lg_grp_cd(),
								mcR.ship_term_cd());
						if(isNull(lgCtlGiTdlvR)) {
							// 物流制御マスタが設定されていない
							MCMessagePool.add(new MCMessage(
									mcR, null, MSBEL0180,
									lgCtlGiGrR.fr_lg_grp_cd(),
									mcR.ship_to_lg_grp_cd(),
									mcR.ship_term_cd(),
									toDispGUIIndex(mcR)));
							mcR.err_flg(true);
							continue;
						}
						if (!isNull(mcR.gi_schd_dt())) {
							// 輸出完了予定日の算出ではカレンダを見ない
							mcR.ex_cmpl_schd_dt(mcR.gi_schd_dt().addDay(lgCtlGiTdlvR.xfr_lt()));
						}
					}
					else {
						mcR.ex_cmpl_schd_dt(mcR.gi_schd_dt());
					}
				}
				// インボイス取引でない
				else {
					mcR.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.LOC.value());
				}
			}
			
			_xfrExCache = mcL;
		}
		
		protected LgCtlCache crtLgCtlCache(MCList<XfrSchdEx_DtlR> mcL) {
			return new LgCtlCache(mcL);
		}
		
		protected MCList<XfrSchdEx_DtlR> get() {
			return _xfrExCache;
		}
	}

	/**
	 * XfrSchd_Sprt01オペレーション.<p>
	 *
	 * 輸出の場合に配送先や輸出完了予定日を計算する。<br>
	 */
	public class XfrSchd_Sprt01 extends MSBEL_XfrSchdService_MC_A.XfrSchd_Sprt01 {
		protected FXUCL_MCDbcCache<MAM_LOC_R> _giLocCache = null;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _grLocCache = null;
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initCache();
			editUp();

			setExInfo();
			setAddlInfo();

			down0().setAll(up0());
		}

		protected void initCache() {
			initGiLocCache(up0());
			initGrLocCache(up0());
			initItmCache(up0().subList(r->isNull(r.ship_term_cd()) && !isNull(r.itm_cd())));
		}

		protected void editUp() {
			for(XfrSchdEx_DtlR upR : up0()) {
				if (!isNull(upR.gi_loc_cd())) {
					MAM_LOC_R giLocCacheR = _giLocCache.get(upR.gi_loc_cd());
					upR.gi_lg_grp_cd(giLocCacheR.lg_grp_cd());
				}
				if (!isNull(upR.gr_loc_cd())) {
					MAM_LOC_R grLocCacheR = _grLocCache.get(upR.gr_loc_cd());
					upR.gr_lg_grp_cd(grLocCacheR.lg_grp_cd());
				}
				if(isNullOrNullVal(upR.ship_term_cd()) && !isNull(upR.itm_cd())) {
					MAM_ITM_R itmCacheR = _itmCache.get(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
					upR.ship_term_cd(itmCacheR.ship_term_cd());
				}
				if (isNullOr(upR.gi_lg_grp_cd(), upR.gr_lg_grp_cd())) {
					upR.err_flg(true);
				}
				else {
					upR.trd_ptn_typ(getTrdPtnTypBySppl(
							_giLocCache.get(upR.gi_loc_cd()).sppl_cd(),
							_grLocCache.get(upR.gr_loc_cd()).sppl_cd()));
				}
			}
		}

		protected void setExInfo() {
			MCList<XfrSchdEx_DtlR> notErrL = up0().subList(r-> !r.err_flg());
			XfrExCache xfrExCache = new XfrExCache(notErrL);
			String[] cols = new String[] {
					 XfrSchdEx_DtlR.$iv_trd_flg
					,XfrSchdEx_DtlR.$ship_to_id_typ
					,XfrSchdEx_DtlR.$ex_cmpl_schd_dt
					,XfrSchdEx_DtlR.$tdlv_cd
					,XfrSchdEx_DtlR.$via_dlv_typ
					,XfrSchdEx_DtlR.$err_flg
				};
			copyByPegNo(notErrL, cols, xfrExCache.get(), cols);
		}

		protected void setAddlInfo() {
			MCList<XfrSchdEx_DtlR> provRetL = MCList.create(XfrSchdEx_DtlR.class);

			for(XfrSchdEx_DtlR upR : up0()) {
				if (isNullOr(upR.gi_loc_cd(), upR.gr_loc_cd())) {
					continue;
				}

				upR.io_schd_typ(
					getIoSchdTypForShip(
						upR.trd_ptn_typ(), null, false, MAC_VIA_DLV_TYP.isVIA(upR.via_dlv_typ())));
				if (isSame(upR.gi_lg_grp_cd(), upR.gr_lg_grp_cd())) {
					if (MSC_IO_SCHD_TYP.isXFR_GI(upR.io_schd_typ())) {
						upR.io_schd_typ(MSC_IO_SCHD_TYP.MOVE_GI.value());
					}
					else if (MSC_IO_SCHD_TYP.isXFR_RTN_GI(upR.io_schd_typ())) {
						upR.io_schd_typ(MSC_IO_SCHD_TYP.MOVE_RTN_GI.value());
					}
					else if (MSC_IO_SCHD_TYP.isXFR_GI_PROV(upR.io_schd_typ())) {
						upR.io_schd_typ(MSC_IO_SCHD_TYP.MOVE_GI_PROV.value());
					}
					else if (MSC_IO_SCHD_TYP.isXFR_RTN_GI_PROV(upR.io_schd_typ())) {
						upR.io_schd_typ(MSC_IO_SCHD_TYP.MOVE_RTN_GI_PROV.value());
					}
				}

				if(!MAC_TRD_PTN_TYP.isPROV_RTN(upR.trd_ptn_typ())) {
					upR.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
				else {
					provRetL.add(upR);
				}
			}
			// 支給返品のときのみ出庫在庫着荷先を個別に判定する必要がある
			if(!isNull(provRetL)) {
				setStkArrv(provRetL);
			}
		}

		protected void setStkArrv(MCList<XfrSchdEx_DtlR> provRetL) {
			// 支給先の支給計上区分に応じて在庫着荷先の値を設定する
			provRetL.addStringColumn("sppl_cd");
			for(XfrSchdEx_DtlR mcR : provRetL) {
				mcR.setString("sppl_cd", _giLocCache.get(mcR.gi_loc_cd()).sppl_cd());
			}

			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			bpL_bldr.setSelect(t.bp_cd, t.prov_basis_typ);
			bpL_bldr.addWhereWithAnd(t.bp_cd.eq(bind("sppl_cd")));
			dbSelect("MSBEL5200_MAM_BP_S03", bpL, bpL_bldr, provRetL.groupBy("sppl_cd"));
			MCIndexKey bpIdx = bpL.createIndex(MAM_BP_R.$bp_cd);

			// 在庫着荷先を設定する
			for(XfrSchdEx_DtlR mcR : provRetL) {
				String sppl_cd = mcR.getString("sppl_cd");
				MAM_BP_R bpR = bpL.getFirst(bpIdx, sppl_cd);

				// 使用基準ならNULL文字
				if(MAC_PROV_BASIS_TYP.isINPT(bpR.prov_basis_typ())) {
					mcR.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
				// 使用基準以外なら支給先
				else {
					mcR.gi_stk_arrv_bp_cd(sppl_cd);
				}
			}
		}

		protected void initGiLocCache(MCList<XfrSchdEx_DtlR> mcL) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.loc_cd);
			dbcL_bldr.addSelect(t.lg_grp_cd);
			dbcL_bldr.addSelect(t.sppl_cd);
			_giLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, mcL, XfrSchdEx_DtlR.$gi_loc_cd);
		}

		protected void initGrLocCache(MCList<XfrSchdEx_DtlR> mcL) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.loc_cd);
			dbcL_bldr.addSelect(t.lg_grp_cd);
			dbcL_bldr.addSelect(t.sppl_cd);
			_grLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, mcL, XfrSchdEx_DtlR.$gr_loc_cd);
		}

		protected void initItmCache(MCList<XfrSchdEx_DtlR> mcL) {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.itm_cd);
			dbc_bldr.addSelect(t.ship_term_cd);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, mcL,
					XfrSchdEx_DtlR.$itm_cd, XfrSchdEx_DtlR.$itm_sub1,
					XfrSchdEx_DtlR.$itm_sub2, XfrSchdEx_DtlR.$itm_sub3);
		}
	}

	//FMCB CUSTOM END
}