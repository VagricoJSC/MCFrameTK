package mcframe.serverMSBE.MSBEL5210;

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
import mcframe.serverMSBE.MSBEL5210.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMSBE.MSBEL5200.MSBEL_XfrSchdService;
import mcframe.serverMSBE.MSBEL5200.XfrPr_DtlR;
import mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_AllocRsltR;
import mcframe.serverMSBE.MSBEL5200.XfrSchdChk02_DtlR;
import mcframe.serverMSBE.MSBEL5550.MSBEL_ShipRprtPrntService;
import mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt01_HdrR;
import mcframe.serverMSBE.MSBEL5550.ShipRprt_Prnt02_HdrR;
import mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_DtlR;
import mcframe.serverMSBE.MSBEL5550.ShipRprt_Upd01_HdrR;
import mcframe.serverMSBF.MSBFL5100.MSBFL_PlntAprvService;
import mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR;
import mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR;
import mcframe.serverMSBF.MSBFL5200.MSBFL_LotTraceService;
import mcframe.serverMSBF.MSBFL5210.*;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static mcframe.serverMSBE.MSBEL5210.Query.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.commonCore.container.MCRow.*;
import mcframe.serverMSLA.MSLAL6050.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMSBA.MSBAL5100.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBB.MSBBL6080.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_XfrInstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_XfrInstService_MC extends MSBEL_XfrInstService_MC_A{
	//FMCB CUSTOM START

	/**
	 * XfrInst_Chk01オペレーション.<p>
	 *
	 * 移動指図が更新可能かチェックする<br>
	 */
	public class XfrInst_Chk01 extends MSBEL_XfrInstService_MC_A.XfrInst_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initCache(up0());
			chkProgress(up0());
			chkXfrInst(up0());
			callXfrSchdChk02(up0());
			chkLotTrace(up0());
			callLotChk03(up0());
			chkPlntAprv(up0());
			setDown();
		}

		protected void chkProgress(MCList<XfrInstChk_HdrDtlR> upL) {
			for(XfrInstChk_HdrDtlR upR : upL) {
				if(isSchd(upR)
						&& !MSC_PR_STS_TYP.isNOT_INST(upR.pr_sts_typ())) {
					MCMessagePool.add(new MCMessage(upR, null, MSBEL0257, toDispGUIIndex(upR)));
					upR.err_flg(true);
				}

				MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().getFirst(upR.xfr_alloc_sts_no());
				if(allocR != null) {
					if(allocR.abort_flg()) {
						MCMessagePool.add(new MCMessage(upR, null, MSBEL0110, upR.xfr_alloc_sts_no(), toDispGUIIndex(upR)));
						upR.err_flg(true);
					}
				}
			}
		}
		protected void chkXfrInst(MCList<XfrInstChk_HdrDtlR> upL) {
			for(XfrInstChk_HdrDtlR upR : upL) {
				if (upR.immd_dlv_prnt_flg()) {
					if (MAC_TRD_PTN_TYP.isPROV_RTN(upR.trd_ptn_typ()))  {
						if (isNull(upR.base_ac_dt())) {
							MCMessagePool.add(new MCMessage(upR, null, MSBEL1105, toDispGUIIndex(upR)));
							upR.err_flg(true);
						}
					}
				}
			}
		}

		/**
		 * 予定ありの移動引当状況かどうか
		 * @param r
		 * @return
		 */
		protected boolean isSchd(XfrInstChk_HdrDtlR r) {
			return !isNull(r.xfr_alloc_sts_no())
						&& !isNull(r.old_xfr_alloc_sts_no());
		}
		protected void setDown() {
			down0().setAll(up0());
		}

	}
	/**
	 * XfrInst_Chk02オペレーション.<p>
	 *
	 * 移動指図が更新可能かチェックする<br>
	 */
	public class XfrInst_Chk02 extends MSBEL_XfrInstService_MC_A.XfrInst_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initCache(up0());
			chkXfrInst(up0());
			chkXfrActD();
			callXfrSchdChk02(up0());
			chkLotTrace(up0());
			callLotChk03(up0());
			chkPlntAprv(up0());
			chkSendIfForUpd(up0());
			setDown();
		}
		protected void chkXfrInst(MCList<XfrInstChk_HdrDtlR> upL) {
			for(XfrInstChk_HdrDtlR upR : upL) {
				if (upR.immd_dlv_prnt_flg()) {
					if (MAC_TRD_PTN_TYP.isPROV_RTN(upR.trd_ptn_typ()))  {
						if (isNull(upR.base_ac_dt())) {
							MCMessagePool.add(new MCMessage(upR, null, MSBEL1105, toDispGUIIndex(upR)));
							upR.err_flg(true);
						}
					}
				}
			}
		}
		protected void chkXfrActD() {
			MCList<MST_XFR_ACT_D_R> dbc = MCList.create(MST_XFR_ACT_D_R.class);
			MST_XFR_ACT_D_R t = MST_XFR_ACT_D_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addGroupBy(t.xfr_alloc_sts_no);
			dbc_bldr.addGroupFunc(countAll(), "cnt");
			dbc_bldr.setWhere(t.xfr_alloc_sts_no.eq(bind("xfr_alloc_sts_no")));
			dbSelect("MSBEL5210_MST_XFR_ACT_D_S01", dbc, dbc_bldr, up0());
			MCIndexKey key = dbc.createIndex(MST_XFR_ACT_D_R.$xfr_alloc_sts_no);
			for (XfrInstChk_HdrDtlR r : up0()) {
				if (!isNull(r.xfr_alloc_sts_no()) && MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_XFR_ACT_D_R dbcR = dbc.getFirst(key, r.xfr_alloc_sts_no());
					if (dbcR != null && dbcR.getNumber("cnt").gt(0)) {
						MCMessagePool.add(new MCMessage(r, null, MSBEL0343,
								r.xfr_alloc_sts_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
		}
		protected void chkSendIfForUpd(MCList<XfrInstChk_HdrDtlR> up0L) {
			MCList<XfrInstChk_HdrDtlR>
				chkTgtL = MCList.create(XfrInstChk_HdrDtlR.class),
				chgL = MCList.create(XfrInstChk_HdrDtlR.class),
				wmsL = MCList.create(XfrInstChk_HdrDtlR.class);
			for (XfrInstChk_HdrDtlR r : up0L) {
				MST_XFR_ALLOC_STS_R xfrAllocR = getXfrAllocCache().getFirst(r.xfr_alloc_sts_no());
				if (!isNull(xfrAllocR) && xfrAllocR.act_qty().isPositive()) {
					continue;
				}
				chkTgtL.add(r);

				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					// 前回送信済みで場所が変更された明細は、変更の前後で外部システムCDが異なる場合は送信対象とする
					if (xfrAllocR.wms_flg() && !isSame(r.gi_loc_cd(), xfrAllocR.gi_loc_cd())) {
						// 変更前
						XfrInstChk_HdrDtlR bfrR = r.clone();
						bfrR.xfr_alloc_sts_no(r.xfr_alloc_sts_no());
						bfrR.lg_grp_cd(xfrAllocR.lg_grp_cd());
						bfrR.gi_loc_cd(xfrAllocR.gi_loc_cd());
						chgL.add(bfrR);
						wmsL.add(bfrR);

						// 変更後
						XfrInstChk_HdrDtlR aftrR = bfrR.clone();
						aftrR.gi_loc_cd(r.gi_loc_cd());
						wmsL.add(aftrR);
					}
				}
			}
			if (!chgL.isEmpty()) {
				setWmsFlg(wmsL);

				MCIndexKey idx = wmsL.createIndex(XfrInstChk_HdrDtlR.$xfr_alloc_sts_no);
				for (XfrInstChk_HdrDtlR bfrR : chgL) {
					if (bfrR.wms_flg()) {
						MCList<XfrInstChk_HdrDtlR> l = wmsL.subList(idx, bfrR.xfr_alloc_sts_no());
						// 変更前の場所が送信対象であり、かつ変更前とで外部システムCDが異なる場合は
						// 変更前の外部システムCDに対して「削除」の送信IFを作成するので、送信後訂正不可チェックを行う
						String
							cd1 = l.get(0).getStringNE(SCMLinkUtil_Srch01_CndR.$ext_sys_cd),
							cd2 = l.get(1).getStringNE(SCMLinkUtil_Srch01_CndR.$ext_sys_cd);
						if (!isSame(cd1, cd2)) {
							chkTgtL.add(bfrR);
						}
					}
				}
			}

			chkSendIf(chkTgtL);
		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}
	/**
	 * XfrInst_Chk03オペレーション.<p>
	 *
	 * 移動指図が更新可能かチェックする<br>
	 */
	public class XfrInst_Chk03 extends MSBEL_XfrInstService_MC_A.XfrInst_Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initCache(up0());
			chkXfrAct();
			chkXfrAlloc();
			chkSendIfForDel(up0());
			setDown();
		}
		protected void chkXfrAct() {
			MCList<MST_XFR_ACT_R> dbc = MCList.create(MST_XFR_ACT_R.class);
			MST_XFR_ACT_R t = MST_XFR_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addGroupBy(t.xfr_inst_no);
			dbc_bldr.addGroupFunc(countAll(), "cnt");
			dbc_bldr.setWhere(t.xfr_inst_no.eq(bind("xfr_inst_no")));
			dbSelect("MSBEL5210_MST_XFR_ACT_S01", dbc, dbc_bldr, up0());
			MCIndexKey key = dbc.createIndex(MST_XFR_ACT_R.$xfr_inst_no);
			for (XfrInstChk_HdrDtlR r : up0()) {
				MST_XFR_ACT_R dbcR = dbc.getFirst(key, r.xfr_inst_no());
				if (dbcR != null && dbcR.getNumber("cnt").gt(0)) {
					MCMessagePool.add(new MCMessage(r, null, MSBEL0344, r.xfr_inst_no(),
							toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
		}

		protected void chkXfrAlloc() {
			MSBEL_XfrSchdService.XfrSchd_Chk02 op = MSBEL_XfrSchdService.crtXfrSchd_Chk02();
			MCList<XfrInstChk_HdrDtlR> noErrL = getChkList(up0());
			if(noErrL.isEmpty()) return;
			for(XfrInstChk_HdrDtlR upR : noErrL) {
				for(MST_XFR_ALLOC_STS_R allocR : getXfrAllocCache().getByXfrInstNum(upR.xfr_inst_no())) {
					XfrSchdChk02_DtlR r = op.up0().add();
					copy(r, upR, createMap_XfrSchdChk02_DtlR_XfrInstChk_HdrDtlR());
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					r.xas(allocR);
				}
			}
			op.up1().inst_flg(true);
			op.exec();
		}
		protected void chkSendIfForDel(MCList<XfrInstChk_HdrDtlR> up0L) {
			MCList<XfrInstChk_HdrDtlR> chkTgtL = MCList.create(XfrInstChk_HdrDtlR.class);
			for (XfrInstChk_HdrDtlR r : up0L) {
				boolean exist = false;
				for (MST_XFR_ALLOC_STS_R xfrAllocR : getXfrAllocCache().getByXfrInstNum(r.xfr_inst_no())) {
					if (xfrAllocR.act_qty().isPositive()) {
						// 実績が含まれている場合はチェックしない
						exist = true;
						break;
					}
				}
				if (!exist) {
					chkTgtL.add(r);
				}
			}
			chkSendIf(chkTgtL);
		}
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	// ********** 共通処理(check) **********
	protected void callXfrSchdChk02(MCList<XfrInstChk_HdrDtlR> subL) {
		MSBEL_XfrSchdService.XfrSchd_Chk02 op = MSBEL_XfrSchdService.crtXfrSchd_Chk02();
		addAll(op.up0(), subL, createMap_XfrSchdChk02_DtlR_XfrInstChk_HdrDtlR());
		op.up1().inst_flg(true);
		op.exec();
		copyErrFlg(subL, op.down0());
		
		initXfrSchdChk02AllocCache(op.down1());
	}

	protected void chkLotTrace(MCList<XfrInstChk_HdrDtlR> chkL) {
		MCList<XfrInstChk_HdrDtlR> noErrL = getChkList(chkL.subList(r -> isChkLotTraceR(r)));
		if(noErrL.isEmpty()) return;

		MSBFL_LotTraceService.LotTrace_Chk01 op = MSBFL_LotTraceService.crtLotTrace_Chk01();
		addAll(op.up0(), noErrL, createMap_LotTrace_Chk01_RsltR_XfrInstChk_HdrDtlR());
		op.exec();
		copyErrFlg(noErrL, op.down0());
	}

	/**
	 * ロット情報サービス.ロット存在チェック
	 */
	protected void callLotChk03(MCList<XfrInstChk_HdrDtlR> chkL) {
		MCList<XfrInstChk_HdrDtlR> noErrL = getChkList(chkL.subList(r -> isChkLotR(r)));
		if (noErrL.isEmpty()) return;

		MSBFL_LotService.Lot_Chk03 o = MSBFL_LotService.crtLot_Chk03();
		setAll(o.up0(), noErrL, createMap_Lot_Chk03_CndR_XfrInstChk_HdrDtlR());
		o.exec();
		copyErrFlg(noErrL, o.down0());
	}

	protected void chkPlntAprv(MCList<XfrInstChk_HdrDtlR> chkL) {
		MCList<XfrInstChk_HdrDtlR> noErrL = getChkList(chkL.subList(r -> isChkPlntAprvR(r)));
		if(noErrL.isEmpty()) return;

		MSBFL_PlntAprvService.PlntAprv_Chk02 op = MSBFL_PlntAprvService.crtPlntAprv_Chk02();
		addAll(op.up0(), noErrL, createMap_PlntAprv_Chk02_RsltR_XfrInstChk_HdrDtlR());
		op.exec();
		copyErrFlg(noErrL, op.down0());
	}

	protected boolean isChkLotTraceR(XfrInstChk_HdrDtlR chkR) {
		if (MAC_DATA_CRUD_TYP.isDEL(chkR.data_crud_typ())) {
			return false;
		}
		if (!chkR.alloc_flg()) {
			return false;
		}
		if (isNullOrNullVal(chkR.lot_no())) {
			return false;
		}
		if (isNull(chkR.sublot_no())) {
			return false;
		}

		MAM_LOC_R gi_loc = getGiLocCache().getEx(chkR.gi_loc_cd());
		MAM_LOC_R gr_loc = getGrLocCache().getEx(chkR.gr_loc_cd());

		if (!isNullAnd(gi_loc.sppl_cd(), gr_loc.sppl_cd())) {
			return false;
		}
		if (isSame(gi_loc.site_cd(), gr_loc.site_cd())) {
			return false;
		}
		return true;
	}

	protected boolean isChkLotR(XfrInstChk_HdrDtlR chkR) {
		if (MAC_DATA_CRUD_TYP.isDEL(chkR.data_crud_typ())) {
			return false;
		}
		if (isNullOrNullVal(chkR.lot_no())) {
			return false;
		}
		return true;
	}

	protected boolean isChkPlntAprvR(XfrInstChk_HdrDtlR chkR) {
		if (MAC_DATA_CRUD_TYP.isDEL(chkR.data_crud_typ())) {
			return false;
		}
		if (!chkR.alloc_flg()) {
			return false;
		}
		if (MAC_TRD_PTN_TYP.isXFR_RTN(chkR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPROV_RTN(chkR.trd_ptn_typ())) {
			return false;
		}

		MAM_LOC_R gi_loc = getGiLocCache().getEx(chkR.gi_loc_cd());
		MAM_LOC_R gr_loc = getGrLocCache().getEx(chkR.gr_loc_cd());

		if (MAC_LOC_MNG_TYP.isPRD(gi_loc.loc_mng_typ())) {
			if (!isSame(gi_loc.site_cd(), gr_loc.site_cd())
					|| MAC_LOC_MNG_TYP.isSLS(gr_loc.loc_mng_typ())) {
				return true;
			}
		}
		return false;
	}

	protected Map_LotTrace_Chk01_RsltR_XfrInstChk_HdrDtlR<LotTrace_Chk01_RsltR,XfrInstChk_HdrDtlR> createMap_LotTrace_Chk01_RsltR_XfrInstChk_HdrDtlR() {
		return new Map_LotTrace_Chk01_RsltR_XfrInstChk_HdrDtlR<LotTrace_Chk01_RsltR, XfrInstChk_HdrDtlR>();
	}

	public class Map_LotTrace_Chk01_RsltR_XfrInstChk_HdrDtlR<D extends LotTrace_Chk01_RsltR, S extends XfrInstChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MAM_LOC_R giLocCache = getGiLocCache().getEx(src.gi_loc_cd());
			dest.plnt_aprv_flg(false);
			dest.site_cd(giLocCache.site_cd());
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(LotTrace_Chk01_RsltR.$peg_no, XfrInstChk_HdrDtlR.$peg_no);
			addColumnPathMap(LotTrace_Chk01_RsltR.$skip_chk_ship_flg, XfrInstChk_HdrDtlR.$skip_chk_ship_flg);
			addColumnPathMap(LotTrace_Chk01_RsltR.$loc_cd, XfrInstChk_HdrDtlR.$gi_loc_cd);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_cd, XfrInstChk_HdrDtlR.$itm_cd);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub1, XfrInstChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub2, XfrInstChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub3, XfrInstChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(LotTrace_Chk01_RsltR.$lot_no, XfrInstChk_HdrDtlR.$lot_no);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sublot_no, XfrInstChk_HdrDtlR.$sublot_no);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno1, XfrInstChk_HdrDtlR.$alloc_sno1);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno2, XfrInstChk_HdrDtlR.$alloc_sno2);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno3, XfrInstChk_HdrDtlR.$alloc_sno3);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno4, XfrInstChk_HdrDtlR.$alloc_sno4);
		}
	}

	protected Map_Lot_Chk03_CndR_XfrInstChk_HdrDtlR<Lot_Chk03_CndR,XfrInstChk_HdrDtlR> createMap_Lot_Chk03_CndR_XfrInstChk_HdrDtlR() {
		return new Map_Lot_Chk03_CndR_XfrInstChk_HdrDtlR<Lot_Chk03_CndR, XfrInstChk_HdrDtlR>();
	}
	public class Map_Lot_Chk03_CndR_XfrInstChk_HdrDtlR<D extends Lot_Chk03_CndR, S extends XfrInstChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, XfrInstChk_HdrDtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, XfrInstChk_HdrDtlR.$itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, XfrInstChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, XfrInstChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, XfrInstChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, XfrInstChk_HdrDtlR.$lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, XfrInstChk_HdrDtlR.$sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$ver_no, XfrInstChk_HdrDtlR.$ver_no);
		}
	}

	protected Map_PlntAprv_Chk02_RsltR_XfrInstChk_HdrDtlR<PlntAprv_Chk02_RsltR,XfrInstChk_HdrDtlR> createMap_PlntAprv_Chk02_RsltR_XfrInstChk_HdrDtlR() {
		return new Map_PlntAprv_Chk02_RsltR_XfrInstChk_HdrDtlR<PlntAprv_Chk02_RsltR, XfrInstChk_HdrDtlR>();
	}

	public class Map_PlntAprv_Chk02_RsltR_XfrInstChk_HdrDtlR<D extends PlntAprv_Chk02_RsltR, S extends XfrInstChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PlntAprv_Chk02_RsltR.$peg_no, XfrInstChk_HdrDtlR.$peg_no);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_cd, XfrInstChk_HdrDtlR.$itm_cd);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_sub1, XfrInstChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_sub2, XfrInstChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_sub3, XfrInstChk_HdrDtlR.$itm_sub3);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$lot_no, XfrInstChk_HdrDtlR.$lot_no);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$sublot_no, XfrInstChk_HdrDtlR.$sublot_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.pre_inst_flg(false);
		}
	}

	protected Map_XfrSchdChk02_DtlR_XfrInstChk_HdrDtlR<XfrSchdChk02_DtlR,XfrInstChk_HdrDtlR> createMap_XfrSchdChk02_DtlR_XfrInstChk_HdrDtlR() {
		return new Map_XfrSchdChk02_DtlR_XfrInstChk_HdrDtlR<XfrSchdChk02_DtlR, XfrInstChk_HdrDtlR>();
	}

	public class Map_XfrSchdChk02_DtlR_XfrInstChk_HdrDtlR<D extends XfrSchdChk02_DtlR, S extends XfrInstChk_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrSchdChk02_DtlR.$peg_no, XfrInstChk_HdrDtlR.$peg_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$data_crud_typ, XfrInstChk_HdrDtlR.$data_crud_typ);
			addColumnPathMap(XfrSchdChk02_DtlR.$xfr_alloc_sts_no, XfrInstChk_HdrDtlR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$pr_sts_typ, XfrInstChk_HdrDtlR.$pr_sts_typ);
			addColumnPathMap(XfrSchdChk02_DtlR.$xfr_schd_no, XfrInstChk_HdrDtlR.$xfr_schd_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$xfr_inst_d_no, XfrInstChk_HdrDtlR.$xfr_inst_d_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$old_xfr_alloc_sts_no, XfrInstChk_HdrDtlR.$old_xfr_alloc_sts_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$trd_cd, XfrInstChk_HdrDtlR.$trd_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$trd_ptn_typ, XfrInstChk_HdrDtlR.$trd_ptn_typ);
			addColumnPathMap(XfrSchdChk02_DtlR.$wg_cd, XfrInstChk_HdrDtlR.$wg_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$lg_grp_cd, XfrInstChk_HdrDtlR.$lg_grp_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$gi_loc_cd, XfrInstChk_HdrDtlR.$gi_loc_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$gi_str_ln_cd, XfrInstChk_HdrDtlR.$gi_str_ln_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$gi_stk_arrv_bp_cd, XfrInstChk_HdrDtlR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$gr_loc_cd, XfrInstChk_HdrDtlR.$gr_loc_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$gr_str_ln_cd, XfrInstChk_HdrDtlR.$gr_str_ln_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$lot_no, XfrInstChk_HdrDtlR.$lot_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$sublot_no, XfrInstChk_HdrDtlR.$sublot_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno1, XfrInstChk_HdrDtlR.$sno1);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno1_null_flg, XfrInstChk_HdrDtlR.$sno1_null_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno2, XfrInstChk_HdrDtlR.$sno2);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno2_null_flg, XfrInstChk_HdrDtlR.$sno2_null_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno3, XfrInstChk_HdrDtlR.$sno3);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno3_null_flg, XfrInstChk_HdrDtlR.$sno3_null_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno4, XfrInstChk_HdrDtlR.$sno4);
			addColumnPathMap(XfrSchdChk02_DtlR.$sno4_null_flg, XfrInstChk_HdrDtlR.$sno4_null_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$alloc_sno1, XfrInstChk_HdrDtlR.$alloc_sno1);
			addColumnPathMap(XfrSchdChk02_DtlR.$alloc_sno2, XfrInstChk_HdrDtlR.$alloc_sno2);
			addColumnPathMap(XfrSchdChk02_DtlR.$alloc_sno3, XfrInstChk_HdrDtlR.$alloc_sno3);
			addColumnPathMap(XfrSchdChk02_DtlR.$alloc_sno4, XfrInstChk_HdrDtlR.$alloc_sno4);
			addColumnPathMap(XfrSchdChk02_DtlR.$ver_no, XfrInstChk_HdrDtlR.$ver_no);
			addColumnPathMap(XfrSchdChk02_DtlR.$gd_cd, XfrInstChk_HdrDtlR.$gd_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$quality_typ, XfrInstChk_HdrDtlR.$quality_typ);
			addColumnPathMap(XfrSchdChk02_DtlR.$stk_id_typ, XfrInstChk_HdrDtlR.$stk_id_typ);
			addColumnPathMap(XfrSchdChk02_DtlR.$stk_bp_cd, XfrInstChk_HdrDtlR.$stk_bp_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$trd_unit_cd, XfrInstChk_HdrDtlR.$trd_unit_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$trd_unit_qty, XfrInstChk_HdrDtlR.$trd_unit_qty);
			addColumnPathMap(XfrSchdChk02_DtlR.$base_unit_cd, XfrInstChk_HdrDtlR.$base_unit_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$base_unit_qty, XfrInstChk_HdrDtlR.$base_unit_qty);
			addColumnPathMap(XfrSchdChk02_DtlR.$xfr_schd_dt, XfrInstChk_HdrDtlR.$xfr_schd_dt);
			addColumnPathMap(XfrSchdChk02_DtlR.$alloc_flg, XfrInstChk_HdrDtlR.$alloc_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$abort_flg, XfrInstChk_HdrDtlR.$abort_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$not_lot_mix_flg, XfrInstChk_HdrDtlR.$not_lot_mix_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$not_sublot_mix_flg, XfrInstChk_HdrDtlR.$not_sublot_mix_flg);
			addColumnPathMap(XfrSchdChk02_DtlR.$vld_dt_fr, XfrInstChk_HdrDtlR.$vld_dt_fr);
			addColumnPathMap(XfrSchdChk02_DtlR.$prov_typ, XfrInstChk_HdrDtlR.$prov_typ);
			addColumnPathMap(XfrSchdChk02_DtlR.$prov_basis_typ, XfrInstChk_HdrDtlR.$prov_basis_typ);
			addColumnPathMap(XfrSchdChk02_DtlR.$ret_prov_typ, XfrInstChk_HdrDtlR.$ret_prov_typ);
			addColumnPathMap(XfrSchdChk02_DtlR.$ret_prov_basis_typ, XfrInstChk_HdrDtlR.$ret_prov_basis_typ);
			addColumnPathMap(XfrSchdChk02_DtlR.$itm_cd, XfrInstChk_HdrDtlR.$itm_cd);
			addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub1, XfrInstChk_HdrDtlR.$itm_sub1);
			addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub2, XfrInstChk_HdrDtlR.$itm_sub2);
			addColumnPathMap(XfrSchdChk02_DtlR.$itm_sub3, XfrInstChk_HdrDtlR.$itm_sub3);
		}
	}
	protected void chkSendIf(MCList<XfrInstChk_HdrDtlR> up0L) {

		// 指図内にWMSフラグがオンの明細があればチェックの対象とする
		MCList<XfrInstChk_HdrDtlR> chkL = MCList.create(XfrInstChk_HdrDtlR.class);
		MCIndexKey idx = up0L.createIndex(XfrInstChk_HdrDtlR.$xfr_inst_no, XfrInstChk_HdrDtlR.$wms_flg);
		for (XfrInstChk_HdrDtlR grpR : up0L.groupBy(XfrInstChk_HdrDtlR.$xfr_inst_no)) {
			XfrInstChk_HdrDtlR chkR = up0L.getFirst(idx, grpR.xfr_inst_no(), true);
			if (!isNull(chkR)) {
				chkL.add(chkR);
			}
		}
		if (chkL.isEmpty()) {
			return;
		}
		
		MCList<MST_XFR_INST_SEND_IF_R> sendOkL = MCList.create(MST_XFR_INST_SEND_IF_R.class);
		MST_XFR_INST_SEND_IF_R t = MST_XFR_INST_SEND_IF_R.create("T");
		MCQueryApiBuilder sendOkL_bldr = MCQueryApiBuilder.create(t);
		PFT_SDRV_IF_R t1 = PFT_SDRV_IF_R.create("T1");
		sendOkL_bldr.setSelect(t.xfr_inst_no);
		sendOkL_bldr.setDistinct();
		sendOkL_bldr.addInnerJoin(t1, bracket( t1.data_no.eq(t.data_no)));
		sendOkL_bldr.setWhere(t.xfr_inst_no.eq(bind("xfr_inst_no")));
		sendOkL_bldr.addConstWhereWithAnd(t1.not_send_upd_flg.eq(value(true))
				.and(t1.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.SEND_OK.value()))));
		dbSelect("MSBEL5210_MST_XFR_INST_SEND_IF_S01", sendOkL, sendOkL_bldr, chkL, null);
		MCIndexKey sendOkIdx = sendOkL.createIndex(MST_XFR_INST_SEND_IF_R.$xfr_inst_no);
		for (XfrInstChk_HdrDtlR r : chkL) {
			MST_XFR_INST_SEND_IF_R sendOkR = sendOkL.getFirst(sendOkIdx, r.xfr_inst_no());
			if (!isNull(sendOkR)) {
				MCMessagePool.add(new MCMessage(r, null, MSBEL1047, r.xfr_inst_no()));
				r.err_flg(true);
			}
		}
	}

	/**
	 * XfrInst_Ins01オペレーション.<p>
	 *
	 * 移動指図にデータを追加する。<br>
	 */
	public class XfrInst_Ins01 extends MSBEL_XfrInstService_MC_A.XfrInst_Ins01 {
		protected AggregatedHeader aggHeader;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			aggHeader = new AggregatedHeader(up0(), up1());
			xfrInstUpd(aggHeader._aggL);
			xfrInstDtl();
			callXfrSchdServiceUpd02(up0());
			doXfrSchdCache(getXfrInstDtl(up0()));
			callOrdRegSrv(getXfrInstDtl(up0()));
			callWgRqstSrv(getXfrInstDtl(up0()));
			callSloStsRegSrvIns(up0());
			printReport();
			callXfrInstSendIf();
			down0().setAll(up0());
		}

		protected void printReport() {
			MCList<XfrInst_HdrR> hdrL = getHeaderL(aggHeader._aggL);
			MCList<XfrInst_DtlR> dtlL = getDtlL(up0()).subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));

			callShipRprtServiceUpd01(hdrL, dtlL, up1());
			updateDlvNumber(dtlL);
			callShipRprtServicePrnt02(hdrL, up1());
			updatePrintFlg(hdrL);
		}

		protected void editUp() {
			doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, up0().subList(r -> isNull(r.io_schd_pr_no())).size());

			for(XfrInst_HdrDtlR upR : up0()) {
				// 常に補完する項目
				upR.pr_sts_typ(MSC_PR_STS_TYP.INST.value());

				// 登録時の打切は残数打切
				upR.inst_rem_abort_flg(upR.abort_flg());
				upR.abort_flg(false);

				// 条件によって補完する項目
				if(MAC_TRD_PTN_TYP.isPROV_RTN(upR.trd_ptn_typ())) {
					MAM_LOC_R giLocCache = getGiLocCache().getEx(upR.gi_loc_cd());
					upR.ret_sppl_cd(giLocCache.sppl_cd());
				}
				else {
					upR.ret_sppl_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.io_schd_pr_no())) {
					upR.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
				}
				if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					upR.inst_bndl_flg(true);
				}
			}
			// WMS対象フラグの設定
			setWmsFlg(up0());

			MCList<XfrInst_DtlR> dtlL = MCList.create(XfrInst_DtlR.class);
			for (XfrInst_HdrDtlR r :up0()) {
				dtlL.add(r.dtl());
			}
			MCList<XfrInst_HdrR> hdrL = MCList.create(XfrInst_HdrR.class);
			for (XfrInst_HdrDtlR r :up0()) {
				hdrL.add(r.hdr());
			}
			setXfrInstDtlNumber(hdrL, dtlL);
		}

		protected void xfrInstUpd(MCList<XfrInst_HdrDtlR> hdrL) {
			MCList<MST_XFR_INST_R> dbcL = MCList.create(MST_XFR_INST_R.class);
			hdrL.forEach(r -> dbcL.add(r.hdr().xih()));
			dbInsert("MSBEL5210_MST_XFR_INST_I01", dbcL,
					MCQueryApiBuilder.create(MST_XFR_INST_R.create("T")));
		}

		protected void xfrInstDtl() {
			MCList<MST_XFR_INST_D_R> dbcL = MCList.create(MST_XFR_INST_D_R.class);
			// まとめられたヘッダ情報から指図ＮＯを補完
			for (XfrInst_HdrDtlR upR : up0().subList(r -> !r.inst_bndl_src_flg())) {
				XfrInst_HdrDtlR aggHdrR = aggHeader.getHeader(upR);
				upR.dtl_xfr_inst_no(aggHdrR.dtl_xfr_inst_no());
				dbcL.add(upR.dtl().xid());
			}
			dbInsert("MSBEL5210_MST_XFR_INST_D_I01", dbcL,
					MCQueryApiBuilder.create(MST_XFR_INST_D_R.create("T")));
		}

		protected void callXfrSchdServiceUpd02(MCList<XfrInst_HdrDtlR> subL) {
			MSBEL_XfrSchdService.XfrSchd_Upd02 op = MSBEL_XfrSchdService.crtXfrSchd_Upd02();
			op.up1().inst_flg(true);
			MCList<MST_XFR_ALLOC_STS_R> dbc = MCList.create(MST_XFR_ALLOC_STS_R.class);
			MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addSelect(t.trd_d_rmrks);
			dbSelectKey("MSBEL5210_MST_XFR_ALLOC_STS_S01", dbc, dbc_bldr, subL);

			MCIndexKey idxkey = dbc.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
			for (XfrInst_HdrDtlR r : subL) {
				if (isNull(r.xfr_alloc_sts_no())) {
					continue;
				}
				MST_XFR_ALLOC_STS_R dbcR = dbc.getFirst(idxkey, r.xfr_alloc_sts_no());
				r.trd_d_rmrks(dbcR.trd_d_rmrks());
			}
			addAll(op.up0(), subL, createMap_XfrPr_DtlR_XfrInst_HdrDtlR());
			op.exec();
			if(!op.down0().isEmpty()) {
				copyByPegNo(up0(),
						new String[] {XfrInst_HdrDtlR.$xfr_alloc_sts_no,
								XfrInst_HdrDtlR.$gr_stk_arrv_bp_cd,
								XfrInst_HdrDtlR.$prov_schd_no,
								XfrInst_HdrDtlR.$prov_typ,
								XfrInst_HdrDtlR.$ret_prov_schd_no,
								XfrInst_HdrDtlR.$ret_prov_typ},
						op.down0(),
						new String[] {XfrPr_DtlR.$xfr_alloc_sts_no,
								XfrPr_DtlR.$gr_stk_arrv_bp_cd,
								XfrPr_DtlR.$prov_schd_no,
								XfrPr_DtlR.$prov_typ,
								XfrPr_DtlR.$ret_prov_schd_no,
								XfrPr_DtlR.$ret_prov_typ});
			}
		}
		protected void callXfrInstSendIf() {
			MCList<MST_XFR_ALLOC_STS_R> list = MCList.create(MST_XFR_ALLOC_STS_R.class);
			
			up0().forEach(row -> {
				MST_XFR_ALLOC_STS_R upR = list.add();
				upR.xfr_alloc_sts_no(row.xfr_alloc_sts_no());
				upR.wms_flg(row.wms_flg());
				upR.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.CRT.value());
			});
			callXfrInstSendIfUpd01(list);
		}

		protected class AggregatedHeader {
			protected String[] _aggCnd; 
			protected MCList<XfrInst_HdrDtlR> _aggL = MCList.create(XfrInst_HdrDtlR.class);
			protected MCIndexKey _aggIdx, _upIdx;

			protected AggregatedHeader(MCList<XfrInst_HdrDtlR> upL, XfrInst_AggCndR cndR) {
				_aggCnd= aggCnd(cndR.agg_gi_loc_flg());
				_upIdx = upL.createIndex(_aggCnd);

				initAggL(upL);
			}

			protected void initAggL(MCList<XfrInst_HdrDtlR> upL) {
				upL.groupBy(_aggCnd).forEach(
						r -> _aggL.add(upL.getFirst(_upIdx, r.toArray(_aggCnd)).clone()));
				_aggIdx = _aggL.createIndex(_aggCnd);

				setPegNumbers(upL);
				setXfrInstNumber();
			}

			protected void setPegNumbers(MCList<XfrInst_HdrDtlR> upL) {
				// まとめた先のリストに設定
				setPegNo(XfrInst_HdrDtlR.$hdr_peg_no, _aggL);

				// まとめ先のリストに設定した値をまとめ元のリストに展開する
				for(XfrInst_HdrDtlR aggR : _aggL) {
					for(XfrInst_HdrDtlR r : upL.subList(_upIdx, aggR.toArray(_aggCnd))) {
						r.hdr_peg_no(aggR.hdr_peg_no());
						r.dtl_hdr_peg_no(aggR.hdr_peg_no());
					}
				}
			}

			protected void setXfrInstNumber() {
				initGiLocCache(_aggL);
				initItmLgGrpLocCache(_aggL);
				initGiDefLocCache(_aggL);
				MCList<ElmArgsR> elmL = MCList.create(ElmArgsR.class);
				for(XfrInst_HdrDtlR mcR : _aggL) {
					ElmArgsR elmR = ElmArgsR.create();
					elmR.peg_no(mcR.peg_no());
					elmR.co_cd(getCo().co_cd());
					MAM_LOC_R locR = getGiLocCache().get(mcR.gi_loc_cd());
					if (!locR.isEmpty()) {
						elmR.wg_cd(locR.wg_cd());
					}
					else {
						MAM_ITM_LG_GRP_R itmLgGrpR = getItmLgGrpLocCache().get(mcR.itm_cd(), mcR.itm_sub1(), mcR.itm_sub2(), mcR.itm_sub3(), mcR.lg_grp_cd());
						MAM_LG_GRP_R lgGrpR = getGiDefLocCache().get(mcR.lg_grp_cd());
						elmR.wg_cd(!itmLgGrpR.isEmpty() ? itmLgGrpR.getStringNE("def_loc_wg_cd") 
										: !lgGrpR.isEmpty() ? lgGrpR.getStringNE("def_loc_wg_cd") : null);
					}
					elmR.dt(mcR.xfr_inst_dt());
					elmL.add(elmR);
				}
				setNum(MAC_NUM_BIZ_TYP.XFRINST, elmL);
				copyByPegNo(_aggL,
						new String[]{XfrInst_HdrDtlR.$xfr_inst_no, XfrInst_HdrDtlR.$dtl_xfr_inst_no},
						elmL,
						new String[]{ElmArgsR.$new_no, ElmArgsR.$new_no});
			}

			protected String[] aggCnd(boolean agg_gi_loc_flg) {
				ArrayList<String> cnd = new ArrayList<String>();
				cnd.add(XfrInst_HdrDtlR.$trd_cd);
				cnd.add(XfrInst_HdrDtlR.$xfr_schd_dt);
				cnd.add(XfrInst_HdrDtlR.$gr_loc_cd);
				cnd.add(XfrInst_HdrDtlR.$slo_no);
				cnd.add(XfrInst_HdrDtlR.$ret_sppl_cd);

				if(agg_gi_loc_flg) {
					cnd.add(XfrInst_HdrDtlR.$gi_loc_cd);
				}

				return cnd.toArray(new String[0]);
			}

			protected XfrInst_HdrDtlR getHeader(XfrInst_HdrDtlR dtlR) {
				return _aggL.getFirst(_aggIdx, dtlR.toArray(_aggCnd));
			}
		}
	}
	protected void callXfrInstSendIfUpd01(MCList<MST_XFR_ALLOC_STS_R> list) {
		//xfr_inst_noが設定された後に呼ばれることが前提
		//hdr_data_crud_typ -> data_crud_typの変換が行われていることが前提
		//XfrInstSendIf_Upd01の上り電文はList型

		MSLAL_XfrInstSendIfService.XfrInstSendIf_Upd01 o = MSLAL_XfrInstSendIfService.crtXfrInstSendIf_Upd01();
		list.forEach(row -> {
			if(row.wms_flg()) {
				copy(o.up0().add(), row, createMap_XfrInstSendIf_Upd01_DtlR_MST_XFR_ALLOC_STS_R());
			}
		});
		if(!o.up0().isEmpty()) {
			o.exec();
		}
	}

	protected Map_XfrInstSendIf_Upd01_DtlR_MST_XFR_ALLOC_STS_R<XfrInstSendIf_Upd01_DtlR,MST_XFR_ALLOC_STS_R> createMap_XfrInstSendIf_Upd01_DtlR_MST_XFR_ALLOC_STS_R() {
		return new Map_XfrInstSendIf_Upd01_DtlR_MST_XFR_ALLOC_STS_R<XfrInstSendIf_Upd01_DtlR, MST_XFR_ALLOC_STS_R>();
	}

	public class Map_XfrInstSendIf_Upd01_DtlR_MST_XFR_ALLOC_STS_R<D extends XfrInstSendIf_Upd01_DtlR, S extends MST_XFR_ALLOC_STS_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrInstSendIf_Upd01_DtlR.$xfr_alloc_sts_no, MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.data_crud_typ(src.getStringNE("data_crud_typ"));
		}
	}	

	/**
	 * WMS対象フラグを取得・設定する
	 * @param	dtlL	gi_loc_cd, lg_grp_cd, wms_flgを保持したリスト
	 */
	protected <E extends MCRow> void setWmsFlg(MCList<E> dtlL) {

		MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

		Map<MCNumber, E> map = new HashMap<>();
		MCNumber peg = MCNumber.ZERO;
		for (E dtlR : dtlL) {

			SCMLinkUtil_Srch01_CndR r = o.up0().add();
			r.peg_no(peg);
			r.if_proc_typ(MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.value());
			r.loc_cd(dtlR.getString("gi_loc_cd"));
			r.lg_grp_cd(dtlR.getString("lg_grp_cd"));
			r.master_dt(getToday());

			map.put(peg, dtlR);
			peg = peg.add(1);
		}
		if (!o.up0().isEmpty()) {
			o.exec();

			for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
				if (map.containsKey(r.peg_no())) {
					E dtlR = map.get(r.peg_no());
					dtlR.setBoolean("wms_flg", !isNull(r.ext_sys_cd()));
					dtlR.setStringNE(SCMLinkUtil_Srch01_CndR.$ext_sys_cd, r.ext_sys_cd());
				}
			}
		}
	}

	/**
	 * XfrInst_Ins02オペレーション.<p>
	 *
	 * 移動指図にデータを追加する。<br>
	 */
	public class XfrInst_Ins02 extends MSBEL_XfrInstService_MC_A.XfrInst_Ins02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();
			setXfrInstDtlNumber(getHdrList(up0()), up1());

			callXfrSchdServiceUpd02(up0(), up1());
			xfrInst();
			xfrInstDtl();
			doXfrSchdCache(up1());
			callOrdRegSrv(up1());
			callWgRqstSrv(up1());
			callSloStsRegSrvIns(up0(), up1());
			printReport();
			callXfrInstSendIf();
			setDown();
		}

		protected void printReport() {
			MCList<XfrInst_DtlR> updL = up1()
					.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));

			callShipRprtServiceUpd01(up0(), updL, up2());
			updateDlvNumber(updL);

			callShipRprtServicePrnt02(up0());
			updatePrintFlg(up0());
		}

		protected void callXfrInstSendIf() {
			MCList<MST_XFR_ALLOC_STS_R> list = MCList.create(MST_XFR_ALLOC_STS_R.class);
			up1().forEach(row -> {
				MST_XFR_ALLOC_STS_R upR = list.add();
				upR.xfr_alloc_sts_no(row.xfr_alloc_sts_no());
				upR.wms_flg(row.wms_flg());
				upR.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.CRT.value());
			});
			callXfrInstSendIfUpd01(list);
		}
		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}

		protected void xfrInst() {
			MCList<MST_XFR_INST_R> dbcL = MCList.create(MST_XFR_INST_R.class);
			dbcL.add(up0().xih());
			dbInsert("MSBEL5210_MST_XFR_INST_I02", dbcL,
					MCQueryApiBuilder.create(MST_XFR_INST_R.create("T")));
		}

		protected void xfrInstDtl() {
			MCList<MST_XFR_INST_D_R> dbcL = MCList.create(MST_XFR_INST_D_R.class);
			MCList<XfrInst_DtlR> crtL = up1().subList(XfrInst_DtlR.$inst_bndl_to_peg_no, null);

			MCIndexKey instDtlIdx = crtL.createIndex(XfrInst_DtlR.$xfr_inst_d_no);
			for (XfrInst_DtlR groupR : crtL.groupBy(XfrInst_DtlR.$xfr_inst_d_no)) {
				XfrInst_DtlR upR = crtL.getFirst(instDtlIdx, groupR.xfr_inst_d_no());
				dbcL.add(upR.xid());
			}
			dbInsert("MSBEL5210_MST_XFR_INST_D_I02", dbcL,
					MCQueryApiBuilder.create(MST_XFR_INST_D_R.create("T")));
		}

		protected void editUp() {
			editUp0();
			editUp1();
		}

		protected void editUp0() {
			ElmArgsR elmR = ElmArgsR.create();
			elmR.co_cd(getCo().co_cd());
			elmR.wg_cd(!getGiLoc(up1().get(0)).isEmpty() ? getGiLoc(up1().get(0)).wg_cd()
						: !getItmLgGrpLoc(up0(), up1().get(0)).isEmpty() ? getItmLgGrpLoc(up0(), up1().get(0)).getStringNE("def_loc_wg_cd")
								: getGiDefLoc(up0()).getStringNE("def_loc_wg_cd"));
			elmR.dt(up0().xfr_inst_dt());
			up0().xfr_inst_no(getNum(MAC_NUM_BIZ_TYP.XFRINST, elmR));
			up0().hdr_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			up0().hdr_peg_no(MCNumber.ZERO);
		}

		protected void editUp1() {
			MCList<XfrInst_DtlR> crtL = MCList.create(XfrInst_DtlR.class);
			MCList<XfrInst_DtlR> delL = MCList.create(XfrInst_DtlR.class);

			for(XfrInst_DtlR upR : up1()) {
				if(MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					delL.add(upR);
				}
				else {
					crtL.add(upR);
				}
			}

			editCrtUp(crtL);
			editDelUp(delL);
		}

		protected void editCrtUp(MCList<XfrInst_DtlR> crtL) {
			doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, crtL.subList(r -> isNull(r.io_schd_pr_no())).size());

			for(XfrInst_DtlR upR : crtL) {
				upR.hdr_peg_no(MCNumber.ZERO);

				if(isNull(upR.sno1())) {
					upR.sno1(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.sno2())) {
					upR.sno2(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.sno3())) {
					upR.sno3(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.sno4())) {
					upR.sno4(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.stk_bp_cd())) {
					upR.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.gi_str_ln_cd())) {
					upR.gi_str_ln_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.gr_str_ln_cd())) {
					upR.gr_str_ln_cd(MAC_STR.NULL_VAL.value());
				}

				// 登録時の打切は残数打切
				upR.inst_rem_abort_flg(upR.abort_flg());
				upR.abort_flg(false);

				// nullの場合に補完する項目
				if(isNull(upR.gd_cd())) {
					upR.gd_cd(getDefaultFeedStkGd().gd_cd());
				}
				if(isNull(upR.quality_typ())) {
					upR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				}
				if(isNull(upR.stk_id_typ())) {
					upR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
				if(isNull(upR.io_schd_pr_no())) {
					upR.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
				}
				if(isNull(upR.ship_inst_typ())) {
					upR.ship_inst_typ(MAC_SHIP_INST_TYP.PICK.value());
				}

				// 常に補完する項目
				upR.pr_sts_typ(MSC_PR_STS_TYP.INST.value());
				upR.xfr_inst_no(up0().xfr_inst_no());
			}
		}

		protected void editDelUp(MCList<XfrInst_DtlR> delL) {
			// 梱包提案のまとめ元
			for(XfrInst_DtlR delR : delL) {
				delR.inst_bndl_flg(true);
			}
		}
	}

	/**
	 * XfrInst_Upd01オペレーション.<p>
	 *
	 * 移動指図のデータを更新・削除する。<br>
	 */
	public class XfrInst_Upd01 extends MSBEL_XfrInstService_MC_A.XfrInst_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 移動一覧から移動指図の訂正は行わない。 
		}
	}

	/**
	 * XfrInst_Upd02オペレーション.<p>
	 *
	 * 移動指図のデータを更新・削除する。<br>
	 */
	public class XfrInst_Upd02 extends MSBEL_XfrInstService_MC_A.XfrInst_Upd02 {
		MCList<XfrInst_DtlR> _instDtl; // 指図明細テーブル更新対象 
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			initXfrAllocCache(up0());

			callXfrInstSendIf(MAC_DATA_CRUD_TYP.DEL.value());
			callXfrSchdServiceUpd02(up0(), up1());
			xfrInst();
			xfrInstDtl();
			doXfrSchdCache(up1());
			callOrdRegSrv(up1());
			callWgRqstSrv(up1());
			callSloStsRegSrvUpd(up0(), up1());
			printReport();

			callXfrInstSendIf(MAC_DATA_CRUD_TYP.UPD.value());
			setDown();
		}

		protected MCList<XfrInst_DtlR> setInstDtlL(MCList<XfrInst_DtlR> upL) {
			MCList<XfrInst_DtlR> instDtl = MCList.create(XfrInst_DtlR.class);

			for (MCList<XfrInst_DtlR> groupL : upL.groupList(XfrInst_DtlR.$xfr_inst_d_no)) {
				MCIndexKey idx = groupL.createIndex(XfrInst_DtlR.$data_crud_typ);
				XfrInst_DtlR upR = groupL.getFirst(idx, MAC_DATA_CRUD_TYP.UPD.value());
				if (isNull(upR)) {
					upR = groupL.get(0);
					if(isNull(upR.data_crud_typ())
							|| (!isNull(groupL.getFirst(idx, MAC_DATA_CRUD_TYP.DEL.value())) 
									&& !isNull(groupL.getFirst(idx, MAC_DATA_CRUD_TYP.CRT.value())))) {
						upR = upR.clone();
						upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
				}
				instDtl.add(upR);
			}

			return instDtl;
		}

		protected void callXfrInstSendIf(String dataCrudTyp) {
			MCList<MST_XFR_ALLOC_STS_R>
				list = MCList.create(MST_XFR_ALLOC_STS_R.class),
				chgL = MCList.create(MST_XFR_ALLOC_STS_R.class),
				wmsL = MCList.create(MST_XFR_ALLOC_STS_R.class);
			for(XfrInst_DtlR row :up1()) {
				if(MAC_DATA_CRUD_TYP.isDEL(dataCrudTyp)) {
					if(!MAC_DATA_CRUD_TYP.isDEL(row.data_crud_typ())) {
						if (MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ())) {
							MST_XFR_ALLOC_STS_R xfrAllocSts = getXfrAllocCache().getFirst(row.xfr_alloc_sts_no());
							// 前回送信済みで場所が変更された明細は、変更の前後で外部システムCDが異なる場合は送信対象とする
							if (xfrAllocSts.wms_flg() && !isSame(row.gi_loc_cd(), xfrAllocSts.gi_loc_cd())) {
								// 変更前
								MST_XFR_ALLOC_STS_R bfrR = chgL.add();
								bfrR.xfr_alloc_sts_no(row.xfr_alloc_sts_no());
								bfrR.lg_grp_cd(xfrAllocSts.lg_grp_cd());
								bfrR.gi_loc_cd(xfrAllocSts.gi_loc_cd());
								wmsL.add(bfrR);

								// 変更後
								MST_XFR_ALLOC_STS_R aftrR = bfrR.clone();
								aftrR.gi_loc_cd(row.gi_loc_cd());
								wmsL.add(aftrR);
							}
						}
						continue ;
					}
				}
				if(MAC_DATA_CRUD_TYP.isUPD(dataCrudTyp)) {
					if(!MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ()) && !MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ())) {
						continue ;
					}
					// 更新行は、打切ＦＬＧがオンのままの行は除く
					// 移動引当状況テーブルの打切ＦＬＧがオン、上り電文の打切ＦＬＧがオンの場合。改めて送る必要がないので除く
					if(MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ())) {
						if(row.abort_flg()) {
							MST_XFR_ALLOC_STS_R xfrAllocSts = getXfrAllocCache().getFirst(row.xfr_alloc_sts_no());
							if (xfrAllocSts.abort_flg()) {
								continue ;
							}
						}
					}
				}
				MST_XFR_ALLOC_STS_R upR = list.add();
				upR.xfr_alloc_sts_no(row.xfr_alloc_sts_no());
				upR.wms_flg(row.wms_flg());
				upR.addStringColumn("data_crud_typ", row.data_crud_typ());
			}
			if (!chgL.isEmpty()) {
				// SCM IF制御マスタの読み出し
				setWmsFlg(wmsL);

				MCIndexKey idx = wmsL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
				for (MST_XFR_ALLOC_STS_R bfrR : chgL) {
					if (bfrR.wms_flg()) {
						MCList<MST_XFR_ALLOC_STS_R> l = wmsL.subList(idx, bfrR.xfr_alloc_sts_no());
						// 変更前の場所が送信対象であり、かつ変更前とで外部システムCDが異なる場合は
						// 変更前の外部システムCDに対して「削除」の送信IFを作成する
						String
							cd1 = l.get(0).getStringNE(SCMLinkUtil_Srch01_CndR.$ext_sys_cd),
							cd2 = l.get(1).getStringNE(SCMLinkUtil_Srch01_CndR.$ext_sys_cd);
						if (!isSame(cd1, cd2)) {
							bfrR.setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.DEL.value());
							list.add(bfrR);
						}
					}
				}
			}
			callXfrInstSendIfUpd01(list);
		}
		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}

		protected void editUp() {
			MCList<XfrInst_DtlR> insL = MCList.create(XfrInst_DtlR.class); // 新規追加
			MCList<XfrInst_DtlR> dupL = MCList.create(XfrInst_DtlR.class); // 分割追加
			MCList<XfrInst_DtlR> updL = MCList.create(XfrInst_DtlR.class);
			MCList<XfrInst_DtlR> delL = MCList.create(XfrInst_DtlR.class);

			for (XfrInst_DtlR r : up1()) {
				r.hdr_peg_no(MCNumber.ZERO);
				if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
						&& isNull(r.old_xfr_alloc_sts_no())) {
					insL.add(r);
				}
				if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
						&& !isNull(r.old_xfr_alloc_sts_no())) {
					dupL.add(r);
				}
				else if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r);
				}
				else if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r);
				}
			}

			up0().hdr_data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			up0().hdr_peg_no(MCNumber.ZERO);
			editInsertUp(insL);
			editDupliUp(dupL);
			editUp(up1());
		}

		protected void editDupliUp(MCList<XfrInst_DtlR> dupL) {
			for(XfrInst_DtlR dupR : dupL) {
				dupR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dupR.pr_sts_typ(MSC_PR_STS_TYP.INST.value());
			}
		}

		protected void editUp(MCList<XfrInst_DtlR> upL) {
			for(XfrInst_DtlR upR : upL) {
				// 在庫関連
				if(isNull(upR.sno1())) {
					upR.sno1(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.sno2())) {
					upR.sno2(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.sno3())) {
					upR.sno3(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.sno4())) {
					upR.sno4(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.gd_cd())) {
					upR.gd_cd(getDefaultFeedStkGd().gd_cd());
				}
				if(isNull(upR.quality_typ())) {
					upR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				}
				if(isNull(upR.stk_id_typ())) {
					upR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
				if(isNull(upR.stk_bp_cd())) {
					upR.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
				if(isNull(upR.io_schd_pr_no())) {
					upR.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
				}
				if(isNull(upR.ship_inst_typ())) {
					upR.ship_inst_typ(MAC_SHIP_INST_TYP.PICK.value());
				}
			}
		}

		protected void editInsertUp(MCList<XfrInst_DtlR> insL) {
			setXfrInstDtlNumber(getHdrList(up0()), insL.subList(XfrInst_DtlR.$xfr_inst_d_no, null));
			for(XfrInst_DtlR r : insL) {
				r.pr_sts_typ(MSC_PR_STS_TYP.INST.value());
			}
		}

		protected void xfrInst() {
			MCList<MST_XFR_INST_R> dbcL = MCList.create(MST_XFR_INST_R.class);
			dbcL.add(up0().xih());
			
			MST_XFR_INST_R t = MST_XFR_INST_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.removeSet(t.dlv_prnt_flg, t.dlv_prnt_tm);
			dbUpdateKey("MSBEL5210_MST_XFR_INST_U01", dbcL, bldr);
		}

		protected void xfrInstDtl() {
			_instDtl = setInstDtlL(up1());

			MCList<MST_XFR_INST_D_R> insL = MCList.create(MST_XFR_INST_D_R.class);
			MCList<MST_XFR_INST_D_R> updL = MCList.create(MST_XFR_INST_D_R.class);
			MCList<MST_XFR_INST_D_R> delL = MCList.create(MST_XFR_INST_D_R.class);

			for(XfrInst_DtlR dtlR : _instDtl) {
				if(MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					insL.add(dtlR.xid());
				}
				else if(MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					updL.add(dtlR.xid());
				}
				else if(MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					delL.add(dtlR.xid());
				}
			}

			dbDeleteKey("MSBEL5210_MST_XFR_INST_D_D01", delL,
					MCQueryApiBuilder.create(MST_XFR_INST_D_R.create("T")));
			dbInsert("MSBEL5210_MST_XFR_INST_D_I03", insL,
					MCQueryApiBuilder.create(MST_XFR_INST_D_R.create("T")));
			dbUpdateKey("MSBEL5210_MST_XFR_INST_D_U01", updL,
					MCQueryApiBuilder.create(MST_XFR_INST_D_R.create("T")));
		}

		protected void printReport() {
			MCList<XfrInst_DtlR> updL = up1()
					.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
							&& !r.abort_flg());

			callShipRprtServiceUpd01(up0(), updL, up2());
			updateDlvNumber(up1().subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
			if (updL.isEmpty()) {
				return ;
			}

			callShipRprtServicePrnt02(up0());
			updatePrintFlg(up0());
		}
	}

	/**
	 * XfrInst_Del01オペレーション.<p>
	 *
	 * 移動指図のデータを削除する。<br>
	 * ヘッダ情報の一覧を上り電文として受けとる。
	 */
	public class XfrInst_Del01 extends MSBEL_XfrInstService_MC_A.XfrInst_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			delXfrInst();
		}

		protected void delXfrInst() {
			MCList<XfrInst_DtlR> xfrAllocL = getXfrAllocL(up0());
			MCIndexKey idx = xfrAllocL.createIndex(XfrInst_DtlR.$xfr_inst_no);
			// まとめた移動指図情報ごとにDel02を呼ぶ
			MSBEL_XfrInstService.XfrInst_Del02 op = MSBEL_XfrInstService.crtXfrInst_Del02();
			for(XfrInst_HdrDtlR r: up0().groupBy(XfrInst_HdrDtlR.$xfr_inst_no)) {
				copyall(op.up0(), r.hdr());
				op.up1().addAll(xfrAllocL.subList(idx, r.xfr_inst_no()));
				op.exec();
			}
			
			// 納品書は別で発行（まとめ発行）
			printReport(xfrAllocL, idx);
		}
		protected MCList<XfrInst_DtlR> getXfrAllocL(MCList<XfrInst_HdrDtlR> up0L) {
			MCList<MST_XFR_ALLOC_STS_R> xfrAllocStsRL = MCList.create(MST_XFR_ALLOC_STS_R.class);
			MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder xfrAllocStsRL_bldr = MCQueryApiBuilder.create(t);
			MST_XFR_INST_D_R t1 = MST_XFR_INST_D_R.create("T1");
			MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");

			xfrAllocStsRL_bldr.setSelect(t.gi_loc_cd);
			xfrAllocStsRL_bldr.addSelect(t.xfr_alloc_sts_no);
			xfrAllocStsRL_bldr.addSelect(t.dlv_slip_no, t.dlv_slip_seq, t2.slip_sts_typ);
			xfrAllocStsRL_bldr.addSelect(t.lg_grp_cd);
			xfrAllocStsRL_bldr.addSelect(t1.xfr_inst_no);
			xfrAllocStsRL_bldr.addInnerJoin(t1, bracket( t.xfr_inst_d_no.eq(t1.xfr_inst_d_no)));
			xfrAllocStsRL_bldr.addLeftOuterJoin(t2,
				bracket(t2.dlv_slip_no.eq(t.dlv_slip_no).and(t2.dlv_slip_seq.eq(t.dlv_slip_seq))));
			xfrAllocStsRL_bldr.setWhere(value(0).eq(value(0)));
			xfrAllocStsRL_bldr.addWhereWithCutOffAnd(t1.xfr_inst_no.eq(bind("xfr_inst_no")));
			dbSelect("MSBEL5210_MST_XFR_ALLOC_STS_S02", xfrAllocStsRL, xfrAllocStsRL_bldr,
					up0L.groupBy(XfrInst_HdrDtlR.$xfr_inst_no));

			setWmsFlg(xfrAllocStsRL);

			MCList<XfrInst_DtlR> retL = MCList.create(XfrInst_DtlR.class);
			for (MST_XFR_ALLOC_STS_R r : xfrAllocStsRL) {
				XfrInst_DtlR del02Dtl = retL.add(); 
				del02Dtl.xfr_alloc_sts_no(r.xfr_alloc_sts_no());
				del02Dtl.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				del02Dtl.wms_flg(r.wms_flg());
				del02Dtl.xfr_inst_no(r.getString("xfr_inst_no"));
				del02Dtl.dlv_slip_no(r.dlv_slip_no());
				del02Dtl.dlv_slip_seq(r.dlv_slip_seq());
				del02Dtl.setStringNE("slip_sts_typ", r.getStringNE("slip_sts_typ"));
			}
			return retL;
		}
		protected void printReport(MCList<XfrInst_DtlR> xfrAllocL, MCIndexKey idx) {
			MCList<ShipRprt_Prnt01_HdrR> up0L = MCList.create(ShipRprt_Prnt01_HdrR.class);
			for(MCList<XfrInst_HdrDtlR> gl : up0().groupList(XfrInst_HdrDtlR.$xfr_inst_no)) {
				XfrInst_HdrDtlR r = gl.get(0);
				if (!r.immd_dlv_prnt_flg()) {
					continue;
				}
				
				for (XfrInst_DtlR tgtR :
					xfrAllocL.subList(idx, r.xfr_inst_no())
					.distinctNE(XfrInst_DtlR.$dlv_slip_no, XfrInst_DtlR.$dlv_slip_seq)) {
					
					if (!MAC_SLIP_STS_TYP.isCRT(tgtR.getStringNE("slip_sts_typ"))) {
						// 実績引継ぎ済みは対象外
						continue;
					}
					ShipRprt_Prnt01_HdrR up0R = up0L.add();
					up0R.dlv_slip_no(tgtR.dlv_slip_no());
					up0R.dlv_slip_seq(tgtR.dlv_slip_seq().add(1));	// 取消伝票
					up0R.dlv_slip_prnt_flg(true);
					up0R.peg_no(r.peg_no());
					up0R.setAttributes(r);
				}
			}
			
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 op = crtShipRprtPrnt01(up0L);
			if (!op.up0().isEmpty()) {
				op.up1().bndl_prnt_flg(up1().bndl_prnt_flg());
				op.exec();
				copyErrFlg(up0(), op.down0(), XfrInst_HdrDtlR.$peg_no, ShipRprt_Prnt01_HdrR.$peg_no);
			}
		}
		protected MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 crtShipRprtPrnt01(MCList<ShipRprt_Prnt01_HdrR> up0L) {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 op = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
			
			// 発行対象となる取消伝票を取得
			MCList<ShipRprt_Prnt01_HdrR> canL = op.selectDlvSlipCanL(up0L, false);
			if (!isNull(canL)) {
				MCIndexKey idx = up0L.createIndex(ShipRprt_Prnt01_HdrR.$dlv_slip_no);
				for (ShipRprt_Prnt01_HdrR r : canL) {
					ShipRprt_Prnt01_HdrR  up0R = up0L.getFirst(idx, r.dlv_slip_no());
					if (!isNull(up0R)) {
						r.peg_no(up0R.peg_no());
						r.setAttributes(up0R);
					}
					op. up0().add(r);
				}
			}
			
			return op;
		}
	}

	/**
	 * XfrInst_Del02オペレーション.<p>
	 *
	 * 移動指図のデータを削除する。<br>
	 */
	public class XfrInst_Del02 extends MSBEL_XfrInstService_MC_A.XfrInst_Del02 {
		protected MCList<XfrInst_DtlR> _dtlL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			initXfrAllocCache(up0());
			callXfrInstSendIf();
			delXfrInst();
			xfrAlloc();
			doXfrSchdCache(getXfrSchdNo(up0()));
			callOrdRegSrv(getXfrSchdNo(up0()));
			callWgRqstSrv(getXfrSchdNo(up0()));
			callSloStsRegSrvDel(getXfrSchdNo(up0()));
			printReport();
		}

		protected void editUp() {
			up0().hdr_data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		}

		protected void printReport() {
			MCList<XfrInst_DtlR> dtlL = MCList.create(XfrInst_DtlR.class);
			callShipRprtServiceUpd01(up0(), dtlL, up2());
			callShipRprtServicePrnt02(up0());
		}

		protected void delXfrInst() {
			executeUpdate(MSBEL5210_MST_XFR_INST_D01(), up0());
			executeUpdate(MSBEL5210_MST_XFR_INST_D_D01(), up0());
		}

		protected void xfrAlloc() {
			MSBEL_XfrSchdService.XfrSchd_Upd02 op = MSBEL_XfrSchdService.crtXfrSchd_Upd02();
			op.up1().inst_flg(true);
			addAll(op.up0(), getXfrAllocCache().getByXfrInstNum(up0().xfr_inst_no()), createMap_XfrPr_DtlR_MST_XFR_ALLOC_STS_R());
			setPegNo(op.up0());
			op.exec();
		}

		protected Map_XfrPr_DtlR_MST_XFR_ALLOC_STS_R<XfrPr_DtlR,MST_XFR_ALLOC_STS_R> createMap_XfrPr_DtlR_MST_XFR_ALLOC_STS_R() {
			return new Map_XfrPr_DtlR_MST_XFR_ALLOC_STS_R<XfrPr_DtlR, MST_XFR_ALLOC_STS_R>();
		}

		public class Map_XfrPr_DtlR_MST_XFR_ALLOC_STS_R<D extends XfrPr_DtlR, S extends MST_XFR_ALLOC_STS_R> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 常にDELとして移動引当状況を再作成する
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				// 常に未指図になる
				dest.pr_sts_typ(MSC_PR_STS_TYP.NOT_INST.value());
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrPr_DtlR.$xfr_alloc_sts_no, MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
				addColumnPathMap(XfrPr_DtlR.$xfr_schd_no, MST_XFR_ALLOC_STS_R.$xfr_schd_no);
				addColumnPathMap(XfrPr_DtlR.$xfr_inst_d_no, MST_XFR_ALLOC_STS_R.$xfr_inst_d_no);
				addColumnPathMap(XfrPr_DtlR.$trd_cd, MST_XFR_ALLOC_STS_R.$trd_cd);
				addColumnPathMap(XfrPr_DtlR.$trd_ptn_typ, MST_XFR_ALLOC_STS_R.$trd_ptn_typ);
				addColumnPathMap(XfrPr_DtlR.$wg_cd, MST_XFR_ALLOC_STS_R.$wg_cd);
				addColumnPathMap(XfrPr_DtlR.$lg_grp_cd, MST_XFR_ALLOC_STS_R.$lg_grp_cd);
				addColumnPathMap(XfrPr_DtlR.$gi_loc_cd, MST_XFR_ALLOC_STS_R.$gi_loc_cd);
				addColumnPathMap(XfrPr_DtlR.$gi_str_ln_cd, MST_XFR_ALLOC_STS_R.$gi_str_ln_cd);
				addColumnPathMap(XfrPr_DtlR.$gi_stk_arrv_bp_cd, MST_XFR_ALLOC_STS_R.$gi_stk_arrv_bp_cd);
				addColumnPathMap(XfrPr_DtlR.$gr_loc_cd, MST_XFR_ALLOC_STS_R.$gr_loc_cd);
				addColumnPathMap(XfrPr_DtlR.$gr_str_ln_cd, MST_XFR_ALLOC_STS_R.$gr_str_ln_cd);
				addColumnPathMap(XfrPr_DtlR.$gr_stk_arrv_bp_cd, MST_XFR_ALLOC_STS_R.$gr_stk_arrv_bp_cd);
				addColumnPathMap(XfrPr_DtlR.$lot_no, MST_XFR_ALLOC_STS_R.$lot_no);
				addColumnPathMap(XfrPr_DtlR.$sublot_no, MST_XFR_ALLOC_STS_R.$sublot_no);
				addColumnPathMap(XfrPr_DtlR.$sno1, MST_XFR_ALLOC_STS_R.$sno1);
				addColumnPathMap(XfrPr_DtlR.$sno1_null_flg, MST_XFR_ALLOC_STS_R.$sno1_null_flg);
				addColumnPathMap(XfrPr_DtlR.$sno2, MST_XFR_ALLOC_STS_R.$sno2);
				addColumnPathMap(XfrPr_DtlR.$sno2_null_flg, MST_XFR_ALLOC_STS_R.$sno2_null_flg);
				addColumnPathMap(XfrPr_DtlR.$sno3, MST_XFR_ALLOC_STS_R.$sno3);
				addColumnPathMap(XfrPr_DtlR.$sno3_null_flg, MST_XFR_ALLOC_STS_R.$sno3_null_flg);
				addColumnPathMap(XfrPr_DtlR.$sno4, MST_XFR_ALLOC_STS_R.$sno4);
				addColumnPathMap(XfrPr_DtlR.$sno4_null_flg, MST_XFR_ALLOC_STS_R.$sno4_null_flg);
				addColumnPathMap(XfrPr_DtlR.$alloc_sno1, MST_XFR_ALLOC_STS_R.$alloc_sno1);
				addColumnPathMap(XfrPr_DtlR.$alloc_sno2, MST_XFR_ALLOC_STS_R.$alloc_sno2);
				addColumnPathMap(XfrPr_DtlR.$alloc_sno3, MST_XFR_ALLOC_STS_R.$alloc_sno3);
				addColumnPathMap(XfrPr_DtlR.$alloc_sno4, MST_XFR_ALLOC_STS_R.$alloc_sno4);
				addColumnPathMap(XfrPr_DtlR.$ver_no, MST_XFR_ALLOC_STS_R.$ver_no);
				addColumnPathMap(XfrPr_DtlR.$gd_cd, MST_XFR_ALLOC_STS_R.$gd_cd);
				addColumnPathMap(XfrPr_DtlR.$quality_typ, MST_XFR_ALLOC_STS_R.$quality_typ);
				addColumnPathMap(XfrPr_DtlR.$stk_insp_typ, MST_XFR_ALLOC_STS_R.$stk_insp_typ);
				addColumnPathMap(XfrPr_DtlR.$stk_id_typ, MST_XFR_ALLOC_STS_R.$stk_id_typ);
				addColumnPathMap(XfrPr_DtlR.$stk_bp_cd, MST_XFR_ALLOC_STS_R.$stk_bp_cd);
				addColumnPathMap(XfrPr_DtlR.$trd_unit_cd, MST_XFR_ALLOC_STS_R.$trd_unit_cd);
				addColumnPathMap(XfrPr_DtlR.$trd_unit_qty, MST_XFR_ALLOC_STS_R.$trd_unit_qty);
				addColumnPathMap(XfrPr_DtlR.$base_unit_cd, MST_XFR_ALLOC_STS_R.$base_unit_cd);
				addColumnPathMap(XfrPr_DtlR.$base_unit_qty, MST_XFR_ALLOC_STS_R.$base_unit_qty);
				addColumnPathMap(XfrPr_DtlR.$act_qty, MST_XFR_ALLOC_STS_R.$act_qty);
				addColumnPathMap(XfrPr_DtlR.$xfr_schd_dt, MST_XFR_ALLOC_STS_R.$xfr_schd_dt);
				addColumnPathMap(XfrPr_DtlR.$ship_inst_typ, MST_XFR_ALLOC_STS_R.$ship_inst_typ);
				addColumnPathMap(XfrPr_DtlR.$rsn_cd, MST_XFR_ALLOC_STS_R.$rsn_cd);
				addColumnPathMap(XfrPr_DtlR.$bd_dpt_cd, MST_XFR_ALLOC_STS_R.$bd_dpt_cd);
				addColumnPathMap(XfrPr_DtlR.$inst_bndl_flg, MST_XFR_ALLOC_STS_R.$inst_bndl_flg);
				addColumnPathMap(XfrPr_DtlR.$abort_flg, MST_XFR_ALLOC_STS_R.$abort_flg);
				addColumnPathMap(XfrPr_DtlR.$cmpl_flg, MST_XFR_ALLOC_STS_R.$cmpl_flg);
				addColumnPathMap(XfrPr_DtlR.$alloc_flg, MST_XFR_ALLOC_STS_R.$alloc_flg);
				addColumnPathMap(XfrPr_DtlR.$not_lot_mix_flg, MST_XFR_ALLOC_STS_R.$not_lot_mix_flg);
				addColumnPathMap(XfrPr_DtlR.$not_sublot_mix_flg, MST_XFR_ALLOC_STS_R.$not_sublot_mix_flg);
				addColumnPathMap(XfrPr_DtlR.$vld_dt_fr, MST_XFR_ALLOC_STS_R.$vld_dt_fr);
				addColumnPathMap(XfrPr_DtlR.$vld_dt_to, MST_XFR_ALLOC_STS_R.$vld_dt_to);
				addColumnPathMap(XfrPr_DtlR.$io_schd_pr_no, MST_XFR_ALLOC_STS_R.$io_schd_pr_no);
				addColumnPathMap(XfrPr_DtlR.$sub_char1, MST_XFR_ALLOC_STS_R.$sub_char1);
				addColumnPathMap(XfrPr_DtlR.$sub_char2, MST_XFR_ALLOC_STS_R.$sub_char2);
				addColumnPathMap(XfrPr_DtlR.$sub_char3, MST_XFR_ALLOC_STS_R.$sub_char3);
				addColumnPathMap(XfrPr_DtlR.$wms_flg, MST_XFR_ALLOC_STS_R.$wms_flg);
			}
		}
		protected void callXfrInstSendIf() {
			MCList<MST_XFR_ALLOC_STS_R> list = MCList.create(MST_XFR_ALLOC_STS_R.class);
			up1().forEach(row -> {
				MST_XFR_ALLOC_STS_R upR = list.add();
				upR.xfr_alloc_sts_no(row.xfr_alloc_sts_no());
				upR.wms_flg(row.wms_flg());
				upR.addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.DEL.value());
			});
			
			callXfrInstSendIfUpd01(list);
		}
	}

	protected Map_XfrPr_DtlR_XfrInst_HdrR<XfrPr_DtlR,XfrInst_HdrR> createMap_XfrPr_DtlR_XfrInst_HdrR() {
		return new Map_XfrPr_DtlR_XfrInst_HdrR<XfrPr_DtlR, XfrInst_HdrR>();
	}

	public class Map_XfrPr_DtlR_XfrInst_HdrR<D extends XfrPr_DtlR, S extends XfrInst_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrPr_DtlR.$trd_cd, XfrInst_HdrR.$trd_cd);
			addColumnPathMap(XfrPr_DtlR.$trd_ptn_typ, XfrInst_HdrR.$trd_ptn_typ);
			addColumnPathMap(XfrPr_DtlR.$wg_cd, XfrInst_HdrR.$wg_cd);
			addColumnPathMap(XfrPr_DtlR.$lg_grp_cd, XfrInst_HdrR.$lg_grp_cd);
			addColumnPathMap(XfrPr_DtlR.$gr_loc_cd, XfrInst_HdrR.$gr_loc_cd);
			addColumnPathMap(XfrPr_DtlR.$gr_stk_arrv_bp_cd, XfrInst_HdrR.$gr_stk_arrv_bp_cd);
			addColumnPathMap(XfrPr_DtlR.$xfr_schd_dt, XfrInst_HdrR.$xfr_schd_dt);
		}
	}

	protected Map_XfrPr_DtlR_XfrInst_DtlR<XfrPr_DtlR,XfrInst_DtlR> createMap_XfrPr_DtlR_XfrInst_DtlR() {
		return new Map_XfrPr_DtlR_XfrInst_DtlR<XfrPr_DtlR, XfrInst_DtlR>();
	}

	public class Map_XfrPr_DtlR_XfrInst_DtlR<D extends XfrPr_DtlR, S extends XfrInst_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrPr_DtlR.$peg_no, XfrInst_DtlR.$peg_no);
			addColumnPathMap(XfrPr_DtlR.$data_crud_typ, XfrInst_DtlR.$data_crud_typ);
			addColumnPathMap(XfrPr_DtlR.$xfr_alloc_sts_no, XfrInst_DtlR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrPr_DtlR.$pr_sts_typ, XfrInst_DtlR.$pr_sts_typ);
			addColumnPathMap(XfrPr_DtlR.$xfr_schd_no, XfrInst_DtlR.$xfr_schd_no);
			addColumnPathMap(XfrPr_DtlR.$xfr_inst_d_no, XfrInst_DtlR.$xfr_inst_d_no);
			addColumnPathMap(XfrPr_DtlR.$gi_loc_cd, XfrInst_DtlR.$gi_loc_cd);
			addColumnPathMap(XfrPr_DtlR.$gi_str_ln_cd, XfrInst_DtlR.$gi_str_ln_cd);
			addColumnPathMap(XfrPr_DtlR.$gi_stk_arrv_bp_cd, XfrInst_DtlR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrPr_DtlR.$gr_str_ln_cd, XfrInst_DtlR.$gr_str_ln_cd);
			addColumnPathMap(XfrPr_DtlR.$lot_no, XfrInst_DtlR.$lot_no);
			addColumnPathMap(XfrPr_DtlR.$sublot_no, XfrInst_DtlR.$sublot_no);
			addColumnPathMap(XfrPr_DtlR.$sno1, XfrInst_DtlR.$sno1);
			addColumnPathMap(XfrPr_DtlR.$sno1_null_flg, XfrInst_DtlR.$sno1_null_flg);
			addColumnPathMap(XfrPr_DtlR.$sno2, XfrInst_DtlR.$sno2);
			addColumnPathMap(XfrPr_DtlR.$sno2_null_flg, XfrInst_DtlR.$sno2_null_flg);
			addColumnPathMap(XfrPr_DtlR.$sno3, XfrInst_DtlR.$sno3);
			addColumnPathMap(XfrPr_DtlR.$sno3_null_flg, XfrInst_DtlR.$sno3_null_flg);
			addColumnPathMap(XfrPr_DtlR.$sno4, XfrInst_DtlR.$sno4);
			addColumnPathMap(XfrPr_DtlR.$sno4_null_flg, XfrInst_DtlR.$sno4_null_flg);
			addColumnPathMap(XfrPr_DtlR.$alloc_sno1, XfrInst_DtlR.$alloc_sno1);
			addColumnPathMap(XfrPr_DtlR.$alloc_sno2, XfrInst_DtlR.$alloc_sno2);
			addColumnPathMap(XfrPr_DtlR.$alloc_sno3, XfrInst_DtlR.$alloc_sno3);
			addColumnPathMap(XfrPr_DtlR.$alloc_sno4, XfrInst_DtlR.$alloc_sno4);
			addColumnPathMap(XfrPr_DtlR.$ver_no, XfrInst_DtlR.$ver_no);
			addColumnPathMap(XfrPr_DtlR.$gd_cd, XfrInst_DtlR.$gd_cd);
			addColumnPathMap(XfrPr_DtlR.$quality_typ, XfrInst_DtlR.$quality_typ);
			addColumnPathMap(XfrPr_DtlR.$stk_id_typ, XfrInst_DtlR.$stk_id_typ);
			addColumnPathMap(XfrPr_DtlR.$stk_bp_cd, XfrInst_DtlR.$stk_bp_cd);
			addColumnPathMap(XfrPr_DtlR.$trd_unit_cd, XfrInst_DtlR.$trd_unit_cd);
			addColumnPathMap(XfrPr_DtlR.$trd_unit_qty, XfrInst_DtlR.$trd_unit_qty);
			addColumnPathMap(XfrPr_DtlR.$base_unit_cd, XfrInst_DtlR.$base_unit_cd);
			addColumnPathMap(XfrPr_DtlR.$base_unit_qty, XfrInst_DtlR.$base_unit_qty);
			addColumnPathMap(XfrPr_DtlR.$ship_inst_typ, XfrInst_DtlR.$ship_inst_typ);
			addColumnPathMap(XfrPr_DtlR.$rsn_cd, XfrInst_DtlR.$rsn_cd);
			addColumnPathMap(XfrPr_DtlR.$bd_dpt_cd, XfrInst_DtlR.$bd_dpt_cd);
			addColumnPathMap(XfrPr_DtlR.$inst_bndl_flg, XfrInst_DtlR.$inst_bndl_flg);
			addColumnPathMap(XfrPr_DtlR.$abort_flg, XfrInst_DtlR.$abort_flg);
			addColumnPathMap(XfrPr_DtlR.$alloc_flg, XfrInst_DtlR.$alloc_flg);
			addColumnPathMap(XfrPr_DtlR.$not_lot_mix_flg, XfrInst_DtlR.$not_lot_mix_flg);
			addColumnPathMap(XfrPr_DtlR.$not_sublot_mix_flg, XfrInst_DtlR.$not_sublot_mix_flg);
			addColumnPathMap(XfrPr_DtlR.$vld_dt_fr, XfrInst_DtlR.$vld_dt_fr);
			addColumnPathMap(XfrPr_DtlR.$vld_dt_to, XfrInst_DtlR.$vld_dt_to);
			addColumnPathMap(XfrPr_DtlR.$io_schd_pr_no, XfrInst_DtlR.$io_schd_pr_no);
			addColumnPathMap(XfrPr_DtlR.$disp_seq, XfrInst_DtlR.$disp_seq);
			addColumnPathMap(XfrPr_DtlR.$trd_d_rmrks, XfrInst_DtlR.$trd_d_rmrks);
			addColumnPathMap(XfrPr_DtlR.$inst_d_rmrks, XfrInst_DtlR.$inst_d_rmrks);
			addColumnPathMap(XfrPr_DtlR.$intr_d_rmrks, XfrInst_DtlR.$intr_d_rmrks);
			addColumnPathMap(XfrPr_DtlR.$sub_char1, XfrInst_DtlR.$sub_char1);
			addColumnPathMap(XfrPr_DtlR.$sub_char2, XfrInst_DtlR.$sub_char2);
			addColumnPathMap(XfrPr_DtlR.$sub_char3, XfrInst_DtlR.$sub_char3);
			addColumnPathMap(XfrPr_DtlR.$itm_cd, XfrInst_DtlR.$itm_cd);
			addColumnPathMap(XfrPr_DtlR.$itm_sub1, XfrInst_DtlR.$itm_sub1);
			addColumnPathMap(XfrPr_DtlR.$itm_sub2, XfrInst_DtlR.$itm_sub2);
			addColumnPathMap(XfrPr_DtlR.$itm_sub3, XfrInst_DtlR.$itm_sub3);
			addColumnPathMap(XfrPr_DtlR.$cont_qty, XfrInst_DtlR.$cont_qty);
			addColumnPathMap(XfrPr_DtlR.$inst_rem_abort_flg, XfrInst_DtlR.$inst_rem_abort_flg);
			addColumnPathMap(XfrPr_DtlR.$alloc_flg, XfrInst_DtlR.$alloc_flg);
			addColumnPathMap(XfrPr_DtlR.$prov_typ, XfrInst_DtlR.$prov_typ);
			addColumnPathMap(XfrPr_DtlR.$prov_basis_typ, XfrInst_DtlR.$prov_basis_typ);
			addColumnPathMap(XfrPr_DtlR.$ret_prov_typ, XfrInst_DtlR.$ret_prov_typ);
			addColumnPathMap(XfrPr_DtlR.$ret_prov_basis_typ, XfrInst_DtlR.$ret_prov_basis_typ);
			addColumnPathMap(XfrPr_DtlR.$wms_flg, XfrInst_DtlR.$wms_flg);
		}
	}

	// ********** 帳票(report) **********
	protected void callShipRprtServiceUpd01(XfrInst_HdrR hdrR, MCList<XfrInst_DtlR> dtlL, XfrInst_CndR cndR) {
		MCList<XfrInst_HdrR> hdrL = MCList.create(XfrInst_HdrR.class);
		hdrR.hdr_peg_no(MCNumber.ZERO);
		dtlL.setValue(XfrInst_DtlR.$hdr_peg_no, MCNumber.ZERO);
		hdrL.add(hdrR);
		callShipRprtServiceUpd01(hdrL, dtlL, cndR);
	}

	protected void callShipRprtServiceUpd01(MCList<XfrInst_HdrR> hdrL, MCList<XfrInst_DtlR> dtlL, MCRow cndR) {
		MCList<XfrInst_HdrR> hdrClL = hdrL.clone();
		MCList<XfrInst_DtlR> dtlClL = dtlL.clone();
		MCList<XfrInst_HdrR> rptDelL = MCList.create(XfrInst_HdrR.class);

		MSBEL_ShipRprtPrntService.ShipRprt_Upd01 op = MSBEL_ShipRprtPrntService.crtShipRprt_Upd01();
		java.util.function.Function<MCList<XfrInst_HdrR>, Integer> pegNo = (lst) -> {
			MCNumber num = (MCNumber)lst.max(XfrInst_HdrR.$hdr_peg_no);
			return isNull(num) ? 0 : num.add(1).intValue();
		};
		bfrShipRprtServiceUpd01(hdrClL, dtlClL, rptDelL);
		setShipRprtServiceUpd01(hdrClL, dtlClL, pegNo.apply(rptDelL));
		addAll(op.up0(), rptDelL, createMap_ShipRprt_Upd01_HdrR_XfrInst_HdrR());
		addAll(op.up0(), hdrClL, createMap_ShipRprt_Upd01_HdrR_XfrInst_HdrR());
		addAll(op.up1(), dtlClL, createMap_ShipRprt_Upd01_DtlR_XfrInst_DtlR());
		op.up2().bndl_prnt_flg(cndR.getBoolean("bndl_prnt_flg"));
		op.exec();
		copyDown(hdrL, dtlL, op.down0());
	}

	protected void bfrShipRprtServiceUpd01(
		MCList<XfrInst_HdrR> hdrL, MCList<XfrInst_DtlR> dtlL, MCList<XfrInst_HdrR> rprtDelL) {
		
		// 更新前の納品書ＮＯを引き継ぐ
		for (XfrInst_DtlR r : dtlL) {
			MST_XFR_ALLOC_STS_R stsR = getXfrAllocCache().getFirst(r.xfr_alloc_sts_no());
			if (isNull(stsR)) {
				r.xas().act_qty(0);
			}
			else {
				r.dlv_slip_no(nullValToNull(stsR.dlv_slip_no()));
				r.dlv_slip_seq(stsR.dlv_slip_seq());
				r.dlv_slip_d_no(nullValToNull(stsR.dlv_slip_d_no()));
				r.xas().act_qty(stsR.act_qty());
			}
		}
		
		// 変更前の移動引当状況のリスト
		MCList<MST_XFR_ALLOC_STS_R> orgStsL = MCList.create(MST_XFR_ALLOC_STS_R.class);
		
		// 作成しなおす分
		MCList<XfrInst_DtlR> delDlvL = MCList.create(XfrInst_DtlR.class);
		MCIndexKey dtlIdx = dtlL.createIndex(XfrInst_DtlR.$hdr_peg_no);
		for (XfrInst_HdrR hdrR : hdrL) {
			
			MCList<XfrInst_DtlR>[] dlvGL =
				dtlL.subList(dtlIdx, hdrR.hdr_peg_no()).groupList(XfrInst_DtlR.$dlv_slip_no);
			List<MCList<XfrInst_DtlR>> remakeL = new ArrayList<>();
			
			boolean remake = false;
			for (MCList<XfrInst_DtlR> dlvL : dlvGL) {
				MCList<MST_XFR_ALLOC_STS_R> stsL = dlvL.innerRowList("xas", MST_XFR_ALLOC_STS_R.class);
				MCNumber min = (MCNumber)stsL.min(MST_XFR_ALLOC_STS_R.$act_qty);
				MCNumber max = (MCNumber)stsL.max(MST_XFR_ALLOC_STS_R.$act_qty);
				
				if (min.isZero() && max.isPositive()) {
					// 納品書ＮＯ内に移動前と移動済みが混在する場合、移動前分は納品書ＮＯをクリアする
					stsL.subList(r -> r.act_qty().isZero()).forEach(r -> {
						r.dlv_slip_no(null);
						r.dlv_slip_d_no(null);
					});
					// また指図内に納品書が複数存在する場合は、
					// 納品書に混在していた移動前分を含めて納品書を作成しなおす
					if (dlvGL.length > 1) {
						remake = true;
					}
				}
				else if (min.isZero() && max.isZero()) {
					// 移動前分はまとめて作成しなおす
					remakeL.add(dlvL);
				}
			}
			if (remake) {
				for (MCList<XfrInst_DtlR> l : remakeL) {
					// 作成しなおす納品書は削除する
					delDlvL.add(l.get(0).clone());
					l.forEach(r -> {
						r.dlv_slip_no(null);
						r.dlv_slip_d_no(null);
					});
				}
			}
			
			orgStsL.addAll(getXfrAllocCache().getByXfrInstNum(hdrR.xfr_inst_no()));
		}
		
		// 削除する分
		// 実績がある場合、納品書ＮＯごとにヘッダを分けるので行削除による考慮が必要
		// 移動指図ＮＯごとの場合、出荷帳票発行サービス内で考慮されるので呼出元は気にする必要がない
		MCIndexKey idx = dtlL.createIndex(XfrInst_DtlR.$dlv_slip_no);
		MCIndexKey instIdx = dtlL.createIndex(XfrInst_DtlR.$xfr_inst_no);
		for (MST_XFR_ALLOC_STS_R r: orgStsL.distinctNE(MST_XFR_ALLOC_STS_R.$dlv_slip_no)) {
			XfrInst_DtlR dtlR = dtlL.getFirst(idx, r.dlv_slip_no());
			if (isNull(dtlR)
				&& existAct(dtlL.subList(instIdx, r.getStringNE(MST_XFR_INST_D_R.$xfr_inst_no)))) {
				// 行削除によって不要になった納品書は削除する
				XfrInst_DtlR delR = XfrInst_DtlR.create();
				delR.xfr_inst_no(r.getStringNE(MST_XFR_INST_D_R.$xfr_inst_no));
				delR.dlv_slip_no(r.dlv_slip_no());
				delDlvL.add(delR);
			}
		}
		
		if (!delDlvL.isEmpty()) {
			int i = 0;
			MCIndexKey up0Idx = hdrL.createIndex(XfrInst_HdrR.$xfr_inst_no);
			// 作成しなおす納品書を削除する（発行済みの場合は取消の納品書が発行する）
			for (XfrInst_DtlR r : delDlvL.distinctNE(XfrInst_DtlR.$dlv_slip_no)) {
				XfrInst_HdrR up0R = hdrL.getFirst(up0Idx, r.xfr_inst_no());
				XfrInst_HdrR hdrR = rprtDelL.add();
				hdrR.hdr_peg_no(i++);
				hdrR.hdr_data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				hdrR.immd_dlv_prnt_flg(up0R.immd_dlv_prnt_flg());
				hdrR.setStringNE("dlv_slip_no", r.dlv_slip_no());
				hdrR.setAttributes(up0R);
			}
		}
	}
	protected void setShipRprtServiceUpd01(MCList<XfrInst_HdrR> hdrL, MCList<XfrInst_DtlR> dtlL, int peg_no) {
		MCList<XfrInst_HdrR> hdrClL = hdrL.shallowClone();
		hdrL.clear();
		MCList<XfrInst_DtlR> dtlClL = dtlL.shallowClone();
		dtlL.clear();

		MCIndexKey idx = dtlClL.createIndex(XfrInst_DtlR.$hdr_peg_no);
		for (XfrInst_HdrR hdrR : hdrClL) {
			MCList<XfrInst_DtlR> dtl = dtlClL.subList(idx, hdrR.hdr_peg_no());

			if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.hdr_data_crud_typ())) {
				for (MCList<XfrInst_DtlR> l : rprtGrpList(hdrR, dtl)) {
					if (existAct(l)) {
						continue;
					}
					XfrInst_HdrR r = hdrR.clone();
					r.hdr_peg_no(peg_no++);
					if (MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
						r.setStringNE("gi_loc_cd", l.get(0).gi_loc_cd());
					}
					if (existAct(dtl)) {
						r.setStringNE("dlv_slip_no", l.get(0).dlv_slip_no());
						if (isNull(r.getStringNE("dlv_slip_no"))) {
							r.hdr_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						}
					}
					l.setValue(XfrInst_DtlR.$hdr_peg_no, r.hdr_peg_no());
					hdrL.add(r);
					dtlL.addAll(l);
				}
			}
			else {
				hdrR.hdr_peg_no(peg_no++);
				dtl.setValue(XfrInst_DtlR.$hdr_peg_no, hdrR.hdr_peg_no());
				hdrL.add(hdrR);
				dtlL.addAll(dtl);
			}
		}
	}
	protected MCList<XfrInst_DtlR>[] rprtGrpList(XfrInst_HdrR hdrR, MCList<XfrInst_DtlR> dtlL) {
		// 指図内に実績が含まれる場合、納品書ＮＯごとに出荷帳票発行サービスを実行する（実績が含まれる納品書は更新しないので）
		// 指図内に実績が含まれない場合、移動指図ＮＯごとに出荷帳票発行サービスを実行する
		List<String> key = new ArrayList<>();
		
		// 支給返品の場合、出庫場所ごとにヘッダを分ける
		if (MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
			key.add(XfrInst_DtlR.$gi_loc_cd);
		}
		
		// 指図に実績が含まれる場合、納品書ＮＯごとにヘッダを分ける
		if (existAct(dtlL)) {
			key.add(XfrInst_DtlR.$dlv_slip_no);
		}
		
		return dtlL.groupList(key.toArray(new String[0]));
	}
	protected boolean existAct(MCList<XfrInst_DtlR> dtlL) {
		for (XfrInst_DtlR r : dtlL) {
			if (r.xas().act_qty().isPositive()) {
				return true;
			}
		}
		return false;
	}

	protected void copyDown(MCList<XfrInst_HdrR> hdrL, MCList<XfrInst_DtlR> dtlL, MCList<ShipRprt_Upd01_DtlR> downL) {
		MCIndexKey idx = downL.createIndex(ShipRprt_Upd01_DtlR.$dtl_uniq_no);
		MCIndexKey hdrIdx = hdrL.createIndex(XfrInst_HdrR.$hdr_peg_no);
		for (XfrInst_DtlR r :dtlL) {
			ShipRprt_Upd01_DtlR srR = downL.getFirst(idx, r.xfr_alloc_sts_no());
			if (isNull(srR)) {
				MST_XFR_ALLOC_STS_R stsR = getXfrAllocCache().getFirst(r.xfr_alloc_sts_no());
				srR = ShipRprt_Upd01_DtlR.create();
				srR.dlv_slip_no(stsR.dlv_slip_no());
				srR.dlv_slip_seq(stsR.dlv_slip_seq());
				srR.dlv_slip_d_no(stsR.dlv_slip_d_no());
			}
			r.dlv_slip_no(srR.dlv_slip_no());
			r.dlv_slip_d_no(srR.dlv_slip_d_no());
			r.dlv_slip_seq(srR.dlv_slip_seq());
			
			XfrInst_HdrR hdrR = hdrL.getFirst(hdrIdx, r.hdr_peg_no());
			hdrR.setBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg,
				hdrR.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg) || srR.upded_flg());
			if (hdrR.immd_dlv_prnt_flg()) {
				hdrR.setBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg,
					hdrR.getBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg) || srR.dlv_slip_prnted_flg());
			}
		}
	}

	protected void callShipRprtServicePrnt02(XfrInst_HdrR hdrR) {
		if(!hdrR.immd_dlv_prnt_flg()
				&& !hdrR.immd_inst_prnt_flg()
				&& !hdrR.immd_pick_prnt_flg()) {
			return;
		}
		MCList<XfrInst_HdrR> hdrL = MCList.create(XfrInst_HdrR.class);
		hdrL.add(hdrR);
		hdrR.hdr_peg_no(MCNumber.ZERO);

		MSBEL_ShipRprtPrntService.ShipRprt_Prnt02 op = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt02();
		addAll(op.up0(), hdrL, createMap_ShipRprt_Prnt02_HdrR_XfrInst_HdrR());
		op.exec();
		copyErrFlg(hdrL, op.down0(), XfrInst_HdrR.$hdr_peg_no, ShipRprt_Prnt02_HdrR.$peg_no);
	}

	protected void callShipRprtServicePrnt02(MCList<XfrInst_HdrR> hdrL, XfrInst_AggCndR cndR) {
		MSBEL_ShipRprtPrntService.ShipRprt_Prnt02 op = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt02();
		addAll(op.up0(), hdrL, createMap_ShipRprt_Prnt02_HdrR_XfrInst_HdrR());
		op.up1().bndl_prnt_flg(cndR.bndl_prnt_flg());
		op.up1().bndl_inst_prnt_flg(cndR.bndl_inst_prnt_flg());
		op.exec();
		copyErrFlg(hdrL, op.down0(), XfrInst_HdrR.$hdr_peg_no, ShipRprt_Prnt02_HdrR.$peg_no);
	}

	protected void updateDlvNumber(MCList<XfrInst_DtlR> dtlL) {
		MCList<MST_XFR_ALLOC_STS_R> xfrAllocL = MCList.create(MST_XFR_ALLOC_STS_R.class);
		for(XfrInst_DtlR dtlR : dtlL) {
			MST_XFR_ALLOC_STS_R xfrAllocR = MST_XFR_ALLOC_STS_R.create();
			xfrAllocR.xfr_alloc_sts_no(dtlR.xfr_alloc_sts_no());
			xfrAllocR.dlv_slip_no(nvl(dtlR.dlv_slip_no(), MAC_STR.NULL_VAL.value()));
			xfrAllocR.dlv_slip_seq(dtlR.dlv_slip_seq());
			xfrAllocR.dlv_slip_d_no(nvl(dtlR.dlv_slip_d_no(), MAC_STR.NULL_VAL.value()));
			xfrAllocL.add(xfrAllocR);
		}
		MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
		MCQueryApiBuilder xfrAllocL_bldr = MCQueryApiBuilder.create(t);
		xfrAllocL_bldr.setSet(xfrAllocL_bldr.getBaseDbc().getKeyColumn$());
		xfrAllocL_bldr.removeSet(xfrAllocL_bldr.getBaseDbc().getKeyColumn$());
		xfrAllocL_bldr.addSet(t.dlv_slip_no);
		xfrAllocL_bldr.addSet(t.dlv_slip_seq);
		xfrAllocL_bldr.addSet(t.dlv_slip_d_no);
		xfrAllocL_bldr.addWhereWithAnd(t.xfr_alloc_sts_no.eq(bind("xfr_alloc_sts_no")));
		dbUpdateKey("MSBEL5210_MST_XFR_ALLOC_STS_U01", xfrAllocL, xfrAllocL_bldr);
	}

	protected void updatePrintFlg(XfrInst_HdrR hdrR) {
		MST_XFR_INST_R instR = MST_XFR_INST_R.create("T");
		MCDate today = getToday();
		
		instR.xfr_inst_no(hdrR.xfr_inst_no());
		hdrR.inst_prnt_flg(hdrR.immd_inst_prnt_flg());
		instR.inst_prnt_flg(hdrR.immd_inst_prnt_flg());
		hdrR.pick_prnt_flg(hdrR.immd_pick_prnt_flg());
		instR.pick_prnt_flg(hdrR.immd_pick_prnt_flg());
		instR.inst_prnt_tm(today);
		instR.pick_prnt_tm(today);

		MCQueryApiBuilder instR_bldr = MCQueryApiBuilder.create(instR);
		instR_bldr.setSet(instR_bldr.getBaseDbc().getKeyColumn$());
		instR_bldr.removeSet(instR_bldr.getBaseDbc().getKeyColumn$());
		instR_bldr.addSet(instR.inst_prnt_flg, instR.inst_prnt_tm,
				instR.pick_prnt_flg, instR.pick_prnt_tm);
			
		// 発行済み
		if (hdrR.getBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg)) {
			hdrR.dlv_prnt_flg(true);
			instR.dlv_prnt_flg(true);
			instR.dlv_prnt_tm(today);
			instR_bldr.addSet(instR.dlv_prnt_flg, instR.dlv_prnt_tm);
		}
		// 未発行かつ登録対象
		else if (hdrR.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg)) {
			hdrR.dlv_prnt_flg(false);
			instR.dlv_prnt_flg(false);
			instR_bldr.addSet(instR.dlv_prnt_flg);
			// 発行日時は引き継ぐ
		}
		// 未発行かつ登録対象外
		else {
			// 更新前のと同じなので何もしない
		}

		dbUpdateKey("MSBEL5210_MST_XFR_INST_U02", instR, instR_bldr);
	}

	protected void updatePrintFlg(MCList<XfrInst_HdrR> hdrL) {
		MCList<MST_XFR_INST_R> instL = MCList.create(MST_XFR_INST_R.class);
		addAll(instL, hdrL, createMap_MST_XFR_INST_R_XfrInst_HdrR());

		MST_XFR_INST_R t = MST_XFR_INST_R.create("T");
		MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(t);
		instL_bldr.setSet(instL_bldr.getBaseDbc().getKeyColumn$());
		instL_bldr.removeSet(instL_bldr.getBaseDbc().getKeyColumn$());
		instL_bldr.addSetVL(t.inst_prnt_flg,
				cases().when(bindEx("inst_prnt_flg").eq(value(true)))
						.then(bindEx("inst_prnt_flg")).otherwise(t.inst_prnt_flg));
		instL_bldr.addSetVL(t.inst_prnt_tm,
				cases().when(bindEx("inst_prnt_flg").eq(value(true)))
						.then(bindEx("inst_prnt_tm")).otherwise(t.inst_prnt_tm));
		instL_bldr.addSetVL(t.pick_prnt_flg,
				cases().when(bindEx("pick_prnt_flg").eq(value(true)))
						.then(bindEx("pick_prnt_flg")).otherwise(t.pick_prnt_flg));
		instL_bldr.addSetVL(t.pick_prnt_tm,
				cases().when(bindEx("pick_prnt_flg").eq(value(true)))
						.then(bindEx("pick_prnt_tm")).otherwise(t.pick_prnt_tm));
		instL_bldr.addSetVL(t.dlv_prnt_flg,
				cases().when(bindEx("dlv_prnt_flg").eq(value(true)))
						.then(bindEx("dlv_prnt_flg")).otherwise(t.dlv_prnt_flg));
		instL_bldr.addSetVL(t.dlv_prnt_tm,
				cases().when(bindEx("dlv_prnt_flg").eq(value(true)))
						.then(bindEx("dlv_prnt_tm")).otherwise(t.dlv_prnt_tm));
		dbUpdateKey("MSBEL5210_MST_XFR_INST_U03", instL, instL_bldr);
	}
	protected Map_MST_XFR_INST_R_XfrInst_HdrR<MST_XFR_INST_R,XfrInst_HdrR> createMap_MST_XFR_INST_R_XfrInst_HdrR() {
		return new Map_MST_XFR_INST_R_XfrInst_HdrR<MST_XFR_INST_R, XfrInst_HdrR>();
	}

	public class Map_MST_XFR_INST_R_XfrInst_HdrR<D extends MST_XFR_INST_R, S extends XfrInst_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MCDate today = getToday();
			if(dest.inst_prnt_flg()) {
				dest.inst_prnt_tm(today);
			}
			if(dest.pick_prnt_flg()) {
				dest.pick_prnt_tm(today);
			}
			if(dest.dlv_prnt_flg()) {
				dest.dlv_prnt_tm(today);
			}
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_XFR_INST_R.$xfr_inst_no, XfrInst_HdrR.$xfr_inst_no);
			addColumnPathMap(MST_XFR_INST_R.$inst_prnt_flg, XfrInst_HdrR.$immd_inst_prnt_flg);
			addColumnPathMap(MST_XFR_INST_R.$pick_prnt_flg, XfrInst_HdrR.$immd_pick_prnt_flg);
			addColumnPathMap(MST_XFR_INST_R.$dlv_prnt_flg, XfrInst_HdrR.$immd_dlv_prnt_flg);
		}
	}

	protected Map_XfrPr_DtlR_XfrInst_HdrDtlR<XfrPr_DtlR,XfrInst_HdrDtlR> createMap_XfrPr_DtlR_XfrInst_HdrDtlR() {
		return new Map_XfrPr_DtlR_XfrInst_HdrDtlR<XfrPr_DtlR, XfrInst_HdrDtlR>();
	}

	public class Map_XfrPr_DtlR_XfrInst_HdrDtlR<D extends XfrPr_DtlR, S extends XfrInst_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			// 条件によって定まる値
			if(src.inst_bndl_src_flg()) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value()); // まとめ元行
			}
			else if(src.inst_bndl_flg()) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); // まとめ先行
				dest.xfr_schd_no(MAC_STR.NULL_VAL.value());
			}
			else if(!isNull(src.old_xfr_alloc_sts_no())) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); // 分割追加行
			}
			else if(isNull(src.xfr_alloc_sts_no())) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); // 新規追加行
				dest.xfr_schd_no(MAC_STR.NULL_VAL.value());
			}
			else {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value()); // 予定あり行
			}
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrPr_DtlR.$peg_no, XfrInst_HdrDtlR.$peg_no);
			addColumnPathMap(XfrPr_DtlR.$data_crud_typ, XfrInst_HdrDtlR.$data_crud_typ);
			addColumnPathMap(XfrPr_DtlR.$xfr_alloc_sts_no, XfrInst_HdrDtlR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrPr_DtlR.$pr_sts_typ, XfrInst_HdrDtlR.$pr_sts_typ);
			addColumnPathMap(XfrPr_DtlR.$xfr_schd_no, XfrInst_HdrDtlR.$xfr_schd_no);
			addColumnPathMap(XfrPr_DtlR.$xfr_inst_d_no, XfrInst_HdrDtlR.$xfr_inst_d_no);
			addColumnPathMap(XfrPr_DtlR.$trd_cd, XfrInst_HdrDtlR.$trd_cd);
			addColumnPathMap(XfrPr_DtlR.$trd_ptn_typ, XfrInst_HdrDtlR.$trd_ptn_typ);
			addColumnPathMap(XfrPr_DtlR.$wg_cd, XfrInst_HdrDtlR.$wg_cd);
			addColumnPathMap(XfrPr_DtlR.$lg_grp_cd, XfrInst_HdrDtlR.$lg_grp_cd);
			addColumnPathMap(XfrPr_DtlR.$gi_loc_cd, XfrInst_HdrDtlR.$gi_loc_cd);
			addColumnPathMap(XfrPr_DtlR.$gi_str_ln_cd, XfrInst_HdrDtlR.$gi_str_ln_cd);
			addColumnPathMap(XfrPr_DtlR.$gi_stk_arrv_bp_cd, XfrInst_HdrDtlR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrPr_DtlR.$gr_loc_cd, XfrInst_HdrDtlR.$gr_loc_cd);
			addColumnPathMap(XfrPr_DtlR.$gr_str_ln_cd, XfrInst_HdrDtlR.$gr_str_ln_cd);
			addColumnPathMap(XfrPr_DtlR.$gr_stk_arrv_bp_cd, XfrInst_HdrDtlR.$gr_stk_arrv_bp_cd);
			addColumnPathMap(XfrPr_DtlR.$lot_no, XfrInst_HdrDtlR.$lot_no);
			addColumnPathMap(XfrPr_DtlR.$sublot_no, XfrInst_HdrDtlR.$sublot_no);
			addColumnPathMap(XfrPr_DtlR.$sno1, XfrInst_HdrDtlR.$sno1);
			addColumnPathMap(XfrPr_DtlR.$sno1_null_flg, XfrInst_HdrDtlR.$sno1_null_flg);
			addColumnPathMap(XfrPr_DtlR.$sno2, XfrInst_HdrDtlR.$sno2);
			addColumnPathMap(XfrPr_DtlR.$sno2_null_flg, XfrInst_HdrDtlR.$sno2_null_flg);
			addColumnPathMap(XfrPr_DtlR.$sno3, XfrInst_HdrDtlR.$sno3);
			addColumnPathMap(XfrPr_DtlR.$sno3_null_flg, XfrInst_HdrDtlR.$sno3_null_flg);
			addColumnPathMap(XfrPr_DtlR.$sno4, XfrInst_HdrDtlR.$sno4);
			addColumnPathMap(XfrPr_DtlR.$sno4_null_flg, XfrInst_HdrDtlR.$sno4_null_flg);
			addColumnPathMap(XfrPr_DtlR.$alloc_sno1, XfrInst_HdrDtlR.$alloc_sno1);
			addColumnPathMap(XfrPr_DtlR.$alloc_sno2, XfrInst_HdrDtlR.$alloc_sno2);
			addColumnPathMap(XfrPr_DtlR.$alloc_sno3, XfrInst_HdrDtlR.$alloc_sno3);
			addColumnPathMap(XfrPr_DtlR.$alloc_sno4, XfrInst_HdrDtlR.$alloc_sno4);
			addColumnPathMap(XfrPr_DtlR.$ver_no, XfrInst_HdrDtlR.$ver_no);
			addColumnPathMap(XfrPr_DtlR.$gd_cd, XfrInst_HdrDtlR.$gd_cd);
			addColumnPathMap(XfrPr_DtlR.$quality_typ, XfrInst_HdrDtlR.$quality_typ);
			addColumnPathMap(XfrPr_DtlR.$stk_id_typ, XfrInst_HdrDtlR.$stk_id_typ);
			addColumnPathMap(XfrPr_DtlR.$stk_bp_cd, XfrInst_HdrDtlR.$stk_bp_cd);
			addColumnPathMap(XfrPr_DtlR.$trd_unit_cd, XfrInst_HdrDtlR.$trd_unit_cd);
			addColumnPathMap(XfrPr_DtlR.$trd_unit_qty, XfrInst_HdrDtlR.$trd_unit_qty);
			addColumnPathMap(XfrPr_DtlR.$base_unit_cd, XfrInst_HdrDtlR.$base_unit_cd);
			addColumnPathMap(XfrPr_DtlR.$base_unit_qty, XfrInst_HdrDtlR.$base_unit_qty);
			addColumnPathMap(XfrPr_DtlR.$xfr_schd_dt, XfrInst_HdrDtlR.$xfr_schd_dt);
			addColumnPathMap(XfrPr_DtlR.$ship_inst_typ, XfrInst_HdrDtlR.$ship_inst_typ);
			addColumnPathMap(XfrPr_DtlR.$rsn_cd, XfrInst_HdrDtlR.$rsn_cd);
			addColumnPathMap(XfrPr_DtlR.$bd_dpt_cd, XfrInst_HdrDtlR.$bd_dpt_cd);
			addColumnPathMap(XfrPr_DtlR.$inst_bndl_flg, XfrInst_HdrDtlR.$inst_bndl_flg);
			addColumnPathMap(XfrPr_DtlR.$abort_flg, XfrInst_HdrDtlR.$abort_flg);
			addColumnPathMap(XfrPr_DtlR.$alloc_flg, XfrInst_HdrDtlR.$alloc_flg);
			addColumnPathMap(XfrPr_DtlR.$not_lot_mix_flg, XfrInst_HdrDtlR.$not_lot_mix_flg);
			addColumnPathMap(XfrPr_DtlR.$not_sublot_mix_flg, XfrInst_HdrDtlR.$not_sublot_mix_flg);
			addColumnPathMap(XfrPr_DtlR.$vld_dt_fr, XfrInst_HdrDtlR.$vld_dt_fr);
			addColumnPathMap(XfrPr_DtlR.$vld_dt_to, XfrInst_HdrDtlR.$vld_dt_to);
			addColumnPathMap(XfrPr_DtlR.$dlv_slip_no, XfrInst_HdrDtlR.$dlv_slip_no);
			addColumnPathMap(XfrPr_DtlR.$dlv_slip_d_no, XfrInst_HdrDtlR.$dlv_slip_d_no);
			addColumnPathMap(XfrPr_DtlR.$io_schd_pr_no, XfrInst_HdrDtlR.$io_schd_pr_no);
			addColumnPathMap(XfrPr_DtlR.$disp_seq, XfrInst_HdrDtlR.$disp_seq);
			addColumnPathMap(XfrPr_DtlR.$sub_char1, XfrInst_HdrDtlR.$sub_char1);
			addColumnPathMap(XfrPr_DtlR.$sub_char2, XfrInst_HdrDtlR.$sub_char2);
			addColumnPathMap(XfrPr_DtlR.$sub_char3, XfrInst_HdrDtlR.$sub_char3);
			addColumnPathMap(XfrPr_DtlR.$itm_cd, XfrInst_HdrDtlR.$itm_cd);
			addColumnPathMap(XfrPr_DtlR.$itm_sub1, XfrInst_HdrDtlR.$itm_sub1);
			addColumnPathMap(XfrPr_DtlR.$itm_sub2, XfrInst_HdrDtlR.$itm_sub2);
			addColumnPathMap(XfrPr_DtlR.$itm_sub3, XfrInst_HdrDtlR.$itm_sub3);
			addColumnPathMap(XfrPr_DtlR.$cont_qty, XfrInst_HdrDtlR.$cont_qty);
			addColumnPathMap(XfrPr_DtlR.$alloc_flg, XfrInst_HdrDtlR.$alloc_flg);
			addColumnPathMap(XfrPr_DtlR.$prov_typ, XfrInst_HdrDtlR.$prov_typ);
			addColumnPathMap(XfrPr_DtlR.$prov_basis_typ, XfrInst_HdrDtlR.$prov_basis_typ);
			addColumnPathMap(XfrPr_DtlR.$ret_prov_typ, XfrInst_HdrDtlR.$ret_prov_typ);
			addColumnPathMap(XfrPr_DtlR.$ret_prov_basis_typ, XfrInst_HdrDtlR.$ret_prov_basis_typ);
			addColumnPathMap(XfrPr_DtlR.$wms_flg, XfrInst_HdrDtlR.$wms_flg);
			addColumnPathMap(XfrPr_DtlR.$trd_d_rmrks, XfrInst_HdrDtlR.$trd_d_rmrks);
		}
	}

	protected Map_ShipRprt_Upd01_HdrR_XfrInst_HdrR<ShipRprt_Upd01_HdrR,XfrInst_HdrR> createMap_ShipRprt_Upd01_HdrR_XfrInst_HdrR() {
		return new Map_ShipRprt_Upd01_HdrR_XfrInst_HdrR<ShipRprt_Upd01_HdrR, XfrInst_HdrR>();
	}

	public class Map_ShipRprt_Upd01_HdrR_XfrInst_HdrR<D extends ShipRprt_Upd01_HdrR, S extends XfrInst_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trn_typ(MSC_TRN_TYP.XFR.value());

			if(!MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
				MAM_LOC_R grLocR = getGrLocCache().getEx(src.gr_loc_cd());
				if(MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.dpt_cd(grLocR.getString("sppl_cntct_dpt"));
					dest.usr_cd(grLocR.getString("sppl_cntct_psn"));
					dest.pri_prnt_flg(true);
					dest.bp_cd(grLocR.sppl_cd());
				}
				else if(MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) {
					MAM_LOC_R giLocR = getGiLocCache().getEx(src.getString("gi_loc_cd"));
					dest.xfr_loc_cd(giLocR.loc_cd());
					dest.pri_prnt_flg(true);
					dest.bp_cd(giLocR.sppl_cd());
				}
				else {
					dest.dpt_cd(src.inst_dpt_cd());
					dest.usr_cd(src.inst_usr_cd());
					dest.pri_prnt_flg(false);
				}
				dest.dlv_id_typ(MSC_DLV_ID_TYP.LOC.value());
				dest.dlv_id_nm(grLocR.loc_nm());
				dest.dlv_zip_cd(grLocR.zip_cd());
				dest.dlv_addr1(grLocR.addr1());
				dest.dlv_addr2(grLocR.addr2());
				dest.dlv_addr3(grLocR.addr3());
				dest.dlv_addr4(grLocR.addr4());
				dest.dlv_tel(grLocR.tel());
				dest.dlv_fax(grLocR.fax());
				dest.dlv_sundry_flg(false);
				dest.split_flg(true);
			}
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_HdrR.$hdr_peg_no, XfrInst_HdrR.$hdr_peg_no);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$data_crud_typ, XfrInst_HdrR.$hdr_data_crud_typ);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_inst_no, XfrInst_HdrR.$xfr_inst_no);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_tm, XfrInst_HdrR.$xfr_schd_dt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_tm, XfrInst_HdrR.$xfr_schd_dt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_cd, XfrInst_HdrR.$trd_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_ptn_typ, XfrInst_HdrR.$trd_ptn_typ);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_cd, XfrInst_HdrR.$gr_loc_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_fr_lg_grp_cd, XfrInst_HdrR.$lg_grp_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$wg_cd, XfrInst_HdrR.$wg_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_rmrks, XfrInst_HdrR.$trd_rmrks);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_no, "dlv_slip_no");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_prnt_flg, XfrInst_HdrR.$immd_dlv_prnt_flg);
		}
	}

	protected Map_ShipRprt_Upd01_DtlR_XfrInst_DtlR<ShipRprt_Upd01_DtlR,XfrInst_DtlR> createMap_ShipRprt_Upd01_DtlR_XfrInst_DtlR() {
		return new Map_ShipRprt_Upd01_DtlR_XfrInst_DtlR<ShipRprt_Upd01_DtlR, XfrInst_DtlR>();
	}

	public class Map_ShipRprt_Upd01_DtlR_XfrInst_DtlR<D extends ShipRprt_Upd01_DtlR, S extends XfrInst_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_DtlR.$hdr_peg_no, XfrInst_DtlR.$hdr_peg_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dtl_uniq_no, XfrInst_DtlR.$xfr_alloc_sts_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_no, XfrInst_DtlR.$dlv_slip_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_d_no, XfrInst_DtlR.$dlv_slip_d_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_cd, XfrInst_DtlR.$itm_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub1, XfrInst_DtlR.$itm_sub1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub2, XfrInst_DtlR.$itm_sub2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub3, XfrInst_DtlR.$itm_sub3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno1, XfrInst_DtlR.$sno1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno2, XfrInst_DtlR.$sno2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno3, XfrInst_DtlR.$sno3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno4, XfrInst_DtlR.$sno4);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$lot_no, XfrInst_DtlR.$lot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sublot_no, XfrInst_DtlR.$sublot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_qty, XfrInst_DtlR.$trd_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_cd, XfrInst_DtlR.$trd_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_qty, XfrInst_DtlR.$base_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_cd, XfrInst_DtlR.$base_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$rsn_cd, XfrInst_DtlR.$rsn_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$bd_dpt_cd, XfrInst_DtlR.$bd_dpt_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_d_rmrks, XfrInst_DtlR.$trd_d_rmrks);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_ac_dt, XfrInst_DtlR.$base_ac_dt);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char1, XfrInst_DtlR.$sub_char1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char2, XfrInst_DtlR.$sub_char2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char3, XfrInst_DtlR.$sub_char3);
		}
	}

	protected Map_ShipRprt_Upd01_DtlR_XfrInst_HdrDtlR<ShipRprt_Upd01_DtlR,XfrInst_HdrDtlR> createMap_ShipRprt_Upd01_DtlR_XfrInst_HdrDtlR() {
		return new Map_ShipRprt_Upd01_DtlR_XfrInst_HdrDtlR<ShipRprt_Upd01_DtlR, XfrInst_HdrDtlR>();
	}

	public class Map_ShipRprt_Upd01_DtlR_XfrInst_HdrDtlR<D extends ShipRprt_Upd01_DtlR, S extends XfrInst_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_DtlR.$hdr_peg_no, XfrInst_HdrDtlR.$hdr_peg_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dtl_uniq_no, XfrInst_HdrDtlR.$xfr_alloc_sts_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_cd, XfrInst_HdrDtlR.$itm_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub1, XfrInst_HdrDtlR.$itm_sub1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub2, XfrInst_HdrDtlR.$itm_sub2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub3, XfrInst_HdrDtlR.$itm_sub3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno1, XfrInst_HdrDtlR.$sno1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno2, XfrInst_HdrDtlR.$sno2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno3, XfrInst_HdrDtlR.$sno3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno4, XfrInst_HdrDtlR.$sno4);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$lot_no, XfrInst_HdrDtlR.$lot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sublot_no, XfrInst_HdrDtlR.$sublot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_qty, XfrInst_HdrDtlR.$trd_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_cd, XfrInst_HdrDtlR.$trd_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_qty, XfrInst_HdrDtlR.$base_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_cd, XfrInst_HdrDtlR.$base_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$rsn_cd, XfrInst_HdrDtlR.$rsn_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$bd_dpt_cd, XfrInst_HdrDtlR.$bd_dpt_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_d_rmrks, XfrInst_HdrDtlR.$trd_d_rmrks);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char1, XfrInst_HdrDtlR.$sub_char1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char2, XfrInst_HdrDtlR.$sub_char2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char3, XfrInst_HdrDtlR.$sub_char3);
		}
	}

	protected Map_ShipRprt_Prnt02_HdrR_XfrInst_HdrR<ShipRprt_Prnt02_HdrR,XfrInst_HdrR> createMap_ShipRprt_Prnt02_HdrR_XfrInst_HdrR() {
		return new Map_ShipRprt_Prnt02_HdrR_XfrInst_HdrR<ShipRprt_Prnt02_HdrR, XfrInst_HdrR>();
	}

	public class Map_ShipRprt_Prnt02_HdrR_XfrInst_HdrR<D extends ShipRprt_Prnt02_HdrR, S extends XfrInst_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trn_typ(MSC_TRN_TYP.XFR.value());
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$peg_no, XfrInst_HdrR.$hdr_peg_no);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$xfr_inst_no, XfrInst_HdrR.$xfr_inst_no);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$inst_prnt_flg, XfrInst_HdrR.$immd_inst_prnt_flg);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$pick_prnt_flg, XfrInst_HdrR.$immd_pick_prnt_flg);
		}
	}

	// ********** 共通処理(common) **********
	protected void callXfrSchdServiceUpd02(XfrInst_HdrR hdrR, MCList<XfrInst_DtlR> dtlL) {
		MSBEL_XfrSchdService.XfrSchd_Upd02 op = MSBEL_XfrSchdService.crtXfrSchd_Upd02();
		op.up1().inst_flg(true);
		op.up0().setAll(setAllocRsltL(hdrR,dtlL));
		op.exec();

		if(!op.down0().isEmpty()) {
			hdrR.gr_stk_arrv_bp_cd(op.down0().get(0).gr_stk_arrv_bp_cd());
			copyByPegNo(dtlL,
					new String[] {XfrInst_DtlR.$xfr_alloc_sts_no,
							XfrInst_DtlR.$prov_typ,
							XfrInst_DtlR.$prov_basis_typ,
							XfrInst_DtlR.$ret_prov_typ,
							XfrInst_DtlR.$ret_prov_basis_typ},
					op.down0(),
					new String[] {XfrPr_DtlR.$xfr_alloc_sts_no,
							XfrPr_DtlR.$prov_typ,
							XfrPr_DtlR.$prov_basis_typ,
							XfrPr_DtlR.$ret_prov_typ,
							XfrPr_DtlR.$ret_prov_basis_typ});
		}
	}
	/**
	 * 引当結果を上り電文に反映して返す
	 */
	protected MCList<XfrPr_DtlR> setAllocRsltL(XfrInst_HdrR hdrR, MCList<XfrInst_DtlR> dtlL) {
		//キャシュから引当結果取得
		MCList<XfrSchdChk02_AllocRsltR> allocResultL = getXfrSchdChk02AllocCache();
		MCIndexKey idxkey = allocResultL.createIndex(XfrSchdChk02_DtlR.$peg_no);
		
		// 場所引当オンの場合、引当結果から作成
		MCList<XfrSchdChk02_AllocRsltR> allocL = MCList.create(XfrSchdChk02_AllocRsltR.class);
		MCList<XfrPr_DtlR> l = MCList.create(XfrPr_DtlR.class);
		
		for (XfrInst_DtlR upR : dtlL) {
			XfrPr_DtlR xfrPrR = XfrPr_DtlR.create();
			copy(xfrPrR, hdrR, createMap_XfrPr_DtlR_XfrInst_HdrR());
			copy(xfrPrR, upR, createMap_XfrPr_DtlR_XfrInst_DtlR());
			
			// 場所引当オンの場合
			if (upR.alloc_flg()) {
				allocL = allocResultL.subList(idxkey, upR.peg_no());
				
				if (allocL.isEmpty()) {
					l.add(xfrPrR);
				}
				else {
					// 残数
					MCNumber remain_qty = upR.base_unit_qty();
					
					MAVM_ITM_UNIT_R trdItmUnitR = getItmUnitCache().getEx(
							upR.itm_cd(),
							upR.itm_sub1(),
							upR.itm_sub2(),
							upR.itm_sub3(),
							upR.trd_unit_cd());
					
					for (XfrSchdChk02_AllocRsltR rsltR : allocL) {
						// 引当できた分のレコード作成
						XfrPr_DtlR tmpR = xfrPrR.clone();
						tmpR.lot_no(rsltR.lot_no());
						tmpR.sublot_no(rsltR.sublot_no());
						tmpR.ver_no(rsltR.ver_no());
						
						// 荷姿単位での引当の場合
						if(isSame(upR.trd_unit_cd(), rsltR.pack_unit_cd())) {
							tmpR.trd_unit_qty(rsltR.pack_unit_qty());
						}
						// 基準単位での引当の場合
						else {
							MCNumber trdQty = rvrsBaseUnitConv(
									rsltR.base_unit_qty(),
									trdItmUnitR.conv_base_qty(),
									trdItmUnitR.conv_qty(),
									trdItmUnitR.dec_place(),
									trdItmUnitR.rnd_typ(),
									true);
							if(isNull(trdQty)) {
								tmpR.trd_unit_cd(rsltR.base_unit_cd());
								tmpR.trd_unit_qty(rsltR.base_unit_qty());
							}
							else {
								tmpR.trd_unit_qty(trdQty);
							}
						}
						tmpR.base_unit_qty(rsltR.base_unit_qty());
						tmpR.alloc_sno1(rsltR.sno1());
						tmpR.alloc_sno2(rsltR.sno2());
						tmpR.alloc_sno3(rsltR.sno3());
						tmpR.alloc_sno4(rsltR.sno4());
						
						// 残数
						remain_qty = remain_qty.subtract(rsltR.base_unit_qty());
						
						//残数がある場合は、データ更新区分を「追加」にする
						if (remain_qty.isPositive()) {
							tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							tmpR.xfr_alloc_sts_no(null);
						}
						
						l.add(tmpR);
					}
				}
			}
			else {
				l.add(xfrPrR);
			}
		}
		return l;
	}
	
	protected MCList<XfrInst_DtlR> getXfrInstDtl(MCList<XfrInst_HdrDtlR> up) {
		MCList<XfrInst_DtlR> list = MCList.create(XfrInst_DtlR.class);
		addAll(list, up, createMap_XfrInst_DtlR_XfrInst_HdrDtlR());
		return list;		
	}
	
	protected MCList<XfrInst_HdrR> getXfrInstHdr(MCList<XfrInst_HdrDtlR> up) {
		MCList<XfrInst_HdrR> list = MCList.create(XfrInst_HdrR.class);
		addAll(list, up, createMap_XfrInst_HdrR_XfrInst_HdrDtlR());
		return list;		
	}

	protected MCList<XfrInst_DtlR> getXfrSchdNo(XfrInst_HdrR hdr) {
		
		MCList<XfrInst_DtlR> list = MCList.create(XfrInst_DtlR.class);
		
		for (MST_XFR_ALLOC_STS_R  xfrAlloc : getXfrAllocCache().getByXfrInstNum(hdr.xfr_inst_no())) {
			XfrInst_DtlR row = XfrInst_DtlR.create();
			row.xfr_schd_no(xfrAlloc.xfr_schd_no());
			row.xfr_inst_no(hdr.xfr_inst_no());
			row.xfr_inst_d_no(xfrAlloc.xfr_inst_d_no());
			list.add(row);
		}
		return list;		
	}
	

	/**
	 * オーダ登録サービスを実行する
	 */
	protected void callOrdRegSrv(MCList<XfrInst_DtlR> up) {
		MSBCL_OrdRegService.Ord_Upd04 o = MSBCL_OrdRegService.crtOrd_Upd04();
		
		for (XfrInst_DtlR r : up) {
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
	protected void callWgRqstSrv(MCList<XfrInst_DtlR> up) {
		// ＷＧ間依頼のステータス更新
		MSBAL_WgRqstService.WgRqst_Upd03 o = MSBAL_WgRqstService.crtWgRqst_Upd03();
		
		for (XfrInst_DtlR r : up) {
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
	 * 受注状況更新サービスを実行する（新規登録時）
	 */
	protected void callSloStsRegSrvIns(XfrInst_HdrR up0, MCList<XfrInst_DtlR> up1) {
		MSBBL_SloStsRegService.SloSts_Ins01 o = MSBBL_SloStsRegService.crtSloSts_Ins01();
		MCList<SloSts_DtlR> slostsL = MCList.create(SloSts_DtlR.class);
		
		for (XfrInst_DtlR dtlR : up1) {
			if (!isNull(dtlR.xfr_schd_no())) {
				MST_XFR_SCHD_R xfrR = getXfrSchdR(dtlR.xfr_schd_no());
				
				if (isNull(xfrR) || isNull(xfrR.slo_d_no()) || xfrR.rqst_can_flg()) {
					continue;
				}
				SloSts_DtlR row = SloSts_DtlR.create();
				row.slo_d_no(xfrR.slo_d_no());
				row.slo_sts_typ(MSC_SLO_STS_TYP.XFR_INST.value());
				
				row.biz_tm(up0.xfr_inst_dt());
				row.unit_cd(dtlR.trd_unit_cd());
				row.qty(dtlR.trd_unit_qty());
				row.loc_cd(xfrR.gi_loc_cd());
				row.xfr_inst_no(dtlR.xfr_inst_no());
				row.xfr_inst_d_no(dtlR.xfr_inst_d_no());
				
				slostsL.add(row);
			}
		}

		if (!slostsL.isEmpty()) {
			o.up0().setAll(slostsL.groupBy(groupByForSloSts()));
			o.exec();
		}
	}
	
	protected void callSloStsRegSrvIns(MCList<XfrInst_HdrDtlR> up) {
		for(XfrInst_HdrR row : getXfrInstHdr(up).groupBy(groupByForHdrR())) {
			callSloStsRegSrvIns(row, getXfrInstDtl(up.subList("dtl.xid.xfr_inst_no", row.xfr_inst_no())));
		}
	}
	
	/**
	 * 受注状況更新サービスを実行する（更新時）
	 */
	protected void callSloStsRegSrvUpd(XfrInst_HdrR up0, MCList<XfrInst_DtlR> up1) {
		MSBBL_SloStsRegService.SloSts_Ins01 o = MSBBL_SloStsRegService.crtSloSts_Ins01();
		MCList<SloSts_DtlR> slostsL = MCList.create(SloSts_DtlR.class);
		MCIndexKey idxkey = up1.createIndex(XfrInst_DtlR.$xfr_inst_d_no, XfrInst_DtlR.$gi_loc_cd);
		
		for (XfrInst_DtlR dtlR : up1) {
			if (!isNull(dtlR.xfr_schd_no())) {
				MST_XFR_SCHD_R xfrR = getXfrSchdR(dtlR.xfr_schd_no());
				MST_XFR_ALLOC_STS_R allocR = getXfrAllocCache().getFirst(dtlR.xfr_alloc_sts_no());
				
				if (isNull(xfrR) || isNull(xfrR.slo_d_no()) || xfrR.rqst_can_flg()) {
					continue;
				}
				MCList<XfrInst_DtlR> subDtlL = up1.subList(idxkey, dtlR.xfr_inst_d_no(), dtlR.gi_loc_cd());
				SloSts_DtlR row = SloSts_DtlR.create();
				row.slo_d_no(xfrR.slo_d_no());
				// 行追加の場合は移動引当状況を取得できないため初めに確認する。
				if (isNull(allocR)) {
					if (!isNull(subDtlL.getFirst(XfrInst_DtlR.$data_crud_typ,
							MAC_DATA_CRUD_TYP.UPD.value()))) {					
						row.slo_sts_typ(MSC_SLO_STS_TYP.XFR_INST_UPD.value());
					}
					else {
						row.slo_sts_typ(MSC_SLO_STS_TYP.XFR_INST.value());
					}
					row.biz_tm(up0.xfr_inst_dt());
					row.unit_cd(dtlR.trd_unit_cd());
					row.qty(dtlR.trd_unit_qty());
				}
				else if (dtlR.abort_flg()) {
					row.slo_sts_typ(MSC_SLO_STS_TYP.XFR_INST_ABORT.value());
					row.unit_cd(dtlR.trd_unit_cd());
					row.qty(dtlR.trd_unit_qty());
				}
				else if (!dtlR.abort_flg() && allocR.abort_flg()) {
					row.slo_sts_typ(MSC_SLO_STS_TYP.XFR_INST_ABORT_CAN.value());
					row.unit_cd(dtlR.trd_unit_cd());
					row.qty(dtlR.trd_unit_qty());
				}
				else {
					if (isNull(subDtlL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())))) {
						row.slo_sts_typ(MSC_SLO_STS_TYP.XFR_INST_CAN.value());
					}
					else {
						row.slo_sts_typ(MSC_SLO_STS_TYP.XFR_INST_UPD.value());
						row.biz_tm(up0.xfr_inst_dt());
						row.unit_cd(dtlR.trd_unit_cd());
						if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							row.qty(MCNumber.ZERO);
						}
						else {
							row.qty(dtlR.trd_unit_qty());
						}
					}
				}
				row.loc_cd(dtlR.gi_loc_cd());
				row.xfr_inst_no(dtlR.xfr_inst_no());
				row.xfr_inst_d_no(dtlR.xfr_inst_d_no());
				
				slostsL.add(row);
			}
		}

		if (!slostsL.isEmpty()) {
			o.up0().setAll(slostsL.groupBy(groupByForSloSts()));
			o.exec();
		}
	}
	
	/**
	 * 受注状況更新サービスを実行する（削除時）
	 */
	protected void callSloStsRegSrvDel(MCList<XfrInst_DtlR> up1) {
		MSBBL_SloStsRegService.SloSts_Ins01 o = MSBBL_SloStsRegService.crtSloSts_Ins01();
		MCList<SloSts_DtlR> slostsL = MCList.create(SloSts_DtlR.class);
		
		for (XfrInst_DtlR dtlR : up1) {
			if (!MAC_STR.isNULL_VAL(dtlR.xfr_schd_no())) {
				MST_XFR_SCHD_R xfrR = getXfrSchdR(dtlR.xfr_schd_no());
				
				if (isNull(xfrR) || isNull(xfrR.slo_d_no()) || xfrR.rqst_can_flg()) {
					continue;
				}
				SloSts_DtlR row = SloSts_DtlR.create();
				row.slo_d_no(xfrR.slo_d_no());
				row.slo_sts_typ(MSC_SLO_STS_TYP.XFR_INST_CAN.value());
				
				row.loc_cd(xfrR.gi_loc_cd());
				row.xfr_inst_no(dtlR.xfr_inst_no());
				row.xfr_inst_d_no(dtlR.xfr_inst_d_no());
				
				slostsL.add(row);
			}
		}

		if (!slostsL.isEmpty()) {
			o.up0().setAll(slostsL.groupBy(groupByForSloSts()));
			o.exec();
		}
	}
	
	/**
	 * GroupByPolicy
	 */
	protected MCGroupByPolicy groupByForHdrR() {
		MCGroupByPolicy gp = new MCGroupByPolicy(XfrInst_HdrR.$xfr_inst_no);
		gp.max(XfrInst_HdrR.$xfr_inst_dt);
		return gp;
	}
	
	protected MCGroupByPolicy groupByForSloSts() {
		MCGroupByPolicy gp = new MCGroupByPolicy(
				SloSts_DtlR.$slo_d_no,
				SloSts_DtlR.$slo_sts_typ,
				SloSts_DtlR.$unit_cd,
				SloSts_DtlR.$loc_cd,
				SloSts_DtlR.$xfr_inst_no,
				SloSts_DtlR.$xfr_inst_d_no,
				SloSts_DtlR.$biz_tm
				);
		gp.sum(SloSts_DtlR.$qty);
		return gp;
	}
	
	/**
	 * ブロック分割のマッパー
	 */
	protected Map_XfrInst_DtlR_XfrInst_HdrDtlR<XfrInst_DtlR,XfrInst_HdrDtlR> createMap_XfrInst_DtlR_XfrInst_HdrDtlR() {
		return new Map_XfrInst_DtlR_XfrInst_HdrDtlR<XfrInst_DtlR, XfrInst_HdrDtlR>();
	}

	public class Map_XfrInst_DtlR_XfrInst_HdrDtlR<D extends XfrInst_DtlR, S extends XfrInst_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {	
			addColumnPathMap(XfrInst_DtlR.$peg_no, XfrInst_HdrDtlR.$peg_no);
			addColumnPathMap(XfrInst_DtlR.$hdr_peg_no, XfrInst_HdrDtlR.$hdr_peg_no);
			addColumnPathMap(XfrInst_DtlR.$xfr_schd_no, XfrInst_HdrDtlR.$xfr_schd_no);
			addColumnPathMap(XfrInst_DtlR.$trd_unit_cd, XfrInst_HdrDtlR.$trd_unit_cd);
			addColumnPathMap(XfrInst_DtlR.$trd_unit_qty, XfrInst_HdrDtlR.$trd_unit_qty);
			addColumnPathMap(XfrInst_DtlR.$gi_loc_cd, XfrInst_HdrDtlR.$gi_loc_cd);
			addColumnPathMap(XfrInst_DtlR.$xfr_inst_d_no, XfrInst_HdrDtlR.$xfr_inst_d_no);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.xfr_inst_no(src.dtl().xid().xfr_inst_no());
		}
	}
	
	protected Map_XfrInst_HdrR_XfrInst_HdrDtlR<XfrInst_HdrR,XfrInst_HdrDtlR> createMap_XfrInst_HdrR_XfrInst_HdrDtlR() {
		return new Map_XfrInst_HdrR_XfrInst_HdrDtlR<XfrInst_HdrR, XfrInst_HdrDtlR>();
	}

	public class Map_XfrInst_HdrR_XfrInst_HdrDtlR<D extends XfrInst_HdrR, S extends XfrInst_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrInst_HdrR.$hdr_peg_no, XfrInst_HdrDtlR.$hdr_peg_no);
			addColumnPathMap(XfrInst_HdrR.$xfr_inst_dt, XfrInst_HdrDtlR.$xfr_inst_dt);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.xfr_inst_no(src.dtl().xid().xfr_inst_no());
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

	// キャッシュ関連
	protected FXUCL_MCDbcCache<MST_XFR_SCHD_R> _cacheXfrSchdL = null;
	protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _giDefLocCache = null;
	protected FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R> _itmLgGrpLocCache = null;
	
	// 移動・移送予定のキャッシュ 
	protected void doXfrSchdCache(MCList<XfrInst_DtlR> up) {
		MCList<MST_XFR_SCHD_R> dbc = MCList.create(MST_XFR_SCHD_R.class);
		MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.xfr_src_no);
		dbc_bldr.addSelect(t.xfr_src_typ);
		dbc_bldr.addSelect(t.itm_ord_no);
		dbc_bldr.addSelect(t.trd_unit_cd);
		dbc_bldr.addSelect(t.trd_unit_qty);
		dbc_bldr.addSelect(t.gi_loc_cd);
		dbc_bldr.addSelect(t.slo_d_no);
		dbc_bldr.addSelect(t.rqst_can_flg);
		
		if (object(CLAZZ)._cacheXfrSchdL == null) {
			// 対象がなくてもキャッシュのインスタンスは作成するので、ひとまず空リストで作成する
			object(CLAZZ)._cacheXfrSchdL = new FXUCL_MCDbcCache<MST_XFR_SCHD_R>(dbc, dbc_bldr, -1,
					dbc, MST_XFR_SCHD_R.$xfr_schd_no);
		}

		MCList<XfrInst_DtlR> cndL = up.createInstance();
		for (XfrInst_DtlR r : up) {
			if (!isNull(r.xfr_schd_no())) {
				cndL.add(r);
			}
		}
		if (!cndL.isEmpty()) {
			dbSelectKey("MSBEL5210_MST_XFR_SCHD_S01", dbc, dbc_bldr, cndL);
			dbc.forEach(r -> { object(CLAZZ)._cacheXfrSchdL .putCache(r.toArray(MST_XFR_SCHD_R.$xfr_schd_no), r); });
		}
	}

	protected MST_XFR_SCHD_R getXfrSchdR(String xfrSchdNo) {
		return object(CLAZZ)._cacheXfrSchdL.get(xfrSchdNo);
	}
	
	// 場所マスタのデフォルト場所
	protected static void initGiDefLocCache(MCList<XfrInst_HdrDtlR> mcL) {
		object(CLAZZ)._initGiDefLocCache(mcL);
	}	

	protected void _initGiDefLocCache(MCList<XfrInst_HdrDtlR> mcL) {
		MCList<MAM_LG_GRP_R> dbcL = MCList.create(MAM_LG_GRP_R.class);
		MAM_LG_GRP_R t = MAM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R t2 = MAM_LOC_R.create("T2");
		dbcL.addStringColumn("def_loc_wg_cd");
		dbcL_bldr.setSelect(t2.wg_cd.as("def_loc_wg_cd"));
		dbcL_bldr.addInnerJoin(t2, bracket( t.lg_grp_cd.eq(t2.lg_grp_cd)
				.and(t2.lg_def_flg.eq(value(true)))));

		_giDefLocCache = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(dbcL, dbcL_bldr, mcL, XfrInst_HdrDtlR.$lg_grp_cd);
	}

	protected static FXUCL_MCDbcCache<MAM_LG_GRP_R> getGiDefLocCache() {
		return object(CLAZZ)._giDefLocCache;
	}
	
	protected MAM_LG_GRP_R getGiDefLoc(XfrInst_HdrR  hdrR) {
		MAM_LG_GRP_R dbc = MAM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
		MAM_LOC_R t2 = MAM_LOC_R.create("T2");
		dbc.addStringColumn("def_loc_wg_cd");
		dbc_bldr.setSelect(t2.wg_cd.as("def_loc_wg_cd"));
		dbc_bldr.addInnerJoin(t2, bracket( dbc.lg_grp_cd.eq(t2.lg_grp_cd)
				.and(t2.lg_def_flg.eq(value(true)))));
		dbSelectKey("MSBEL5210_MAM_LG_GRP_S01", dbc, dbc_bldr, hdrR);
		
		return dbc;
	}
	
	// 品目マスタ（物流Ｇ）のデフォルト場所
	protected static void initItmLgGrpLocCache(MCList<XfrInst_HdrDtlR> mcL) {
		object(CLAZZ)._initItmLgGrpLocCache(mcL);
	}	

	protected void _initItmLgGrpLocCache(MCList<XfrInst_HdrDtlR> mcL) {
		MCList<MAM_ITM_LG_GRP_R> dbcL = MCList.create(MAM_ITM_LG_GRP_R.class);
		dbcL.addStringColumn("def_loc_wg_cd");
		MAM_ITM_LG_GRP_R t = MAM_ITM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		MAM_LOC_R t2 = MAM_LOC_R.create("T2");
		dbcL_bldr.setSelect(t2.wg_cd.as("def_loc_wg_cd"));
		dbcL_bldr.addInnerJoin(t2, bracket( t.lg_def_loc_cd.eq(t2.loc_cd)));

		_itmLgGrpLocCache = new FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R>(dbcL, dbcL_bldr, mcL,
				XfrInst_HdrDtlR.$itm_cd, XfrInst_HdrDtlR.$itm_sub1,
				XfrInst_HdrDtlR.$itm_sub2, XfrInst_HdrDtlR.$itm_sub3,
				XfrInst_HdrDtlR.$lg_grp_cd);
	}

	protected static FXUCL_MCDbcCache<MAM_ITM_LG_GRP_R> getItmLgGrpLocCache() {
		return object(CLAZZ)._itmLgGrpLocCache;
	}
	
	protected MAM_ITM_LG_GRP_R getItmLgGrpLoc(XfrInst_HdrR  hdrR, XfrInst_DtlR dtlR) {
		MAM_ITM_LG_GRP_R dbc = MAM_ITM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
		MAM_LOC_R t2 = MAM_LOC_R.create("T2");
		dbc.addStringColumn("def_loc_wg_cd");
		dbc_bldr.setSelect(t2.wg_cd.as("def_loc_wg_cd"));
		dbc_bldr.addInnerJoin(t2, bracket( dbc.lg_def_loc_cd.eq(t2.loc_cd)));
		dbSelectKey("MSBEL5210_MAM_ITM_LG_GRP_S01", dbc, dbc_bldr, dtlR.itm_cd(), dtlR.itm_sub1(),
				dtlR.itm_sub2(), dtlR.itm_sub3(), hdrR.lg_grp_cd());

		return dbc;
	}
	
	// 出庫場所
	protected MAM_LOC_R getGiLoc(XfrInst_DtlR dtlR) {
		MAM_LOC_R dbc = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
		dbc_bldr.setSelect(dbc.wg_cd);
		dbSelectKey("MSBEL5210_MAM_LOC_S01", dbc, dbc_bldr, dtlR.gi_loc_cd());
		
		return dbc;
	}

	protected MCList<XfrInst_HdrR> getHdrList(XfrInst_HdrR hdrR) {
		MCList<XfrInst_HdrR> hdrL = MCList.create(XfrInst_HdrR.class);
		hdrL.add(hdrR);
		return hdrL;
	}

	/**
	 * ひと階層ずつ移動指図明細ＮＯを設定していく
	 */
	protected void setXfrInstDtlNumber(MCList<XfrInst_HdrR> up0L, MCList<XfrInst_DtlR> upL) {

		MCList<XfrInst_DtlR> nextL = MCList.create(XfrInst_DtlR.class);
		MCList<ElmArgsR> elmArgsL = MCList.create(ElmArgsR.create());
		MCList<XfrInst_DtlR> setNumL = createXfrInst_DtlL();
		MCIndexKey idx = up0L.createIndex(XfrInst_DtlR.$hdr_peg_no);
		int cnt = 0;
		
		for (XfrInst_DtlR up1L_sub :upL.subList(r -> isNull(r.inst_bndl_to_peg_no()))) {
			ElmArgsR elm = ElmArgsR.create();
			XfrInst_HdrR up0R = up0L.getFirst(idx, up1L_sub.hdr_peg_no());
			elm.co_cd(getCo().co_cd());
			elm.wg_cd(up0R.wg_cd());
			elm.dt(up0R.xfr_schd_dt().trunc(MCDateFieldType.DAY));
			elm.itm_cd(up1L_sub.itm_cd());
			elm.itm_sub1(up1L_sub.itm_sub1());
			elm.itm_sub2(up1L_sub.itm_sub2());
			elm.itm_sub3(up1L_sub.itm_sub3());
			elm.peg_no(cnt++);
			elmArgsL.add(elm);
			setNumL.add(up1L_sub);
		}
		if (!elmArgsL.isEmpty()) {
			setNum(MAC_NUM_BIZ_TYP.XFRINSTD, elmArgsL);
			for (int i=0; i<elmArgsL.size(); i++) {
				XfrInst_DtlR up0R = setNumL.get(i);
				up0R.xfr_inst_d_no(elmArgsL.get(i).new_no());
			}
		}
		
		for(XfrInst_DtlR r : upL) {
			// 分割先がない行を最初に設定する
			if(isNull(r.inst_bndl_to_peg_no())) {
				// 分割元になっている場合は保持しておく
				if(!isNull(r.inst_bndl_peg_no())) {
					getInstDtlPeg().put(r.inst_bndl_peg_no(), r.xfr_inst_d_no());
				}
			}
			else {
				nextL.add(r);
			}
		}
		if(!nextL.isEmpty()) {
			setXfrInstDtlNumberSub(nextL);
		}
	}

	protected void setXfrInstDtlNumberSub(MCList<XfrInst_DtlR> currentL) {
		MCList<XfrInst_DtlR> nextL = MCList.create(XfrInst_DtlR.class);

		for(XfrInst_DtlR r : currentL) {
			String num = getInstDtlPeg().get(r.inst_bndl_to_peg_no());
			if(!isNull(num)) {
				r.xfr_inst_d_no(num);
				// 分割元になっている場合は保持しておく
				if(!isNull(r.inst_bndl_peg_no())) {
					getInstDtlPeg().put(r.inst_bndl_peg_no(), num);
				}
			}
			else {
				nextL.add(r);
			}
		}
		if(!nextL.isEmpty()) {
			setXfrInstDtlNumberSub(nextL);
		}
	}

	protected Map<MCNumber, String> instDtlPeg;
	protected Map<MCNumber, String> getInstDtlPeg() {
		if(instDtlPeg == null) {
			instDtlPeg = new HashMap<MCNumber, String>();
		}
		return instDtlPeg;
	}

	/**
	 * ヘッダ明細行のリストからヘッダ行のリストを取り出す。
	 * @param hdrDtlL
	 * @return ヘッダ行のリスト
	 */
	protected MCList<XfrInst_HdrR> getHeaderL(MCList<XfrInst_HdrDtlR> hdrDtlL) {
		return hdrDtlL.innerRowList(XfrInst_HdrDtlR.$hdr, XfrInst_HdrR.class);
	}

	/**
	 * ヘッダ明細行のリストから明細行のリストを取り出す。
	 * @param hdrDtlL
	 * @return 明細行のリスト
	 */
	protected MCList<XfrInst_DtlR> getDtlL(MCList<XfrInst_HdrDtlR> hdrDtlL) {
		return hdrDtlL.innerRowList(XfrInst_HdrDtlR.$dtl, XfrInst_DtlR.class);
	}

	// ********** キャッシュ **********
	protected static final Class<MSBEL_XfrInstService> CLAZZ = MSBEL_XfrInstService.class;
	protected FXUCL_MCDbcCache<MAM_LOC_R> _giLocCache = null;
	protected FXUCL_MCDbcCache<MAM_LOC_R> _grLocCache = null;
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected MCList<XfrSchdChk02_AllocRsltR> _xfrSchdChk02AllocCache = MCList.create(XfrSchdChk02_AllocRsltR.class);
	protected XfrAllocCache _xfrAllocCache = null;

	protected void initCache(MCList<XfrInstChk_HdrDtlR> mcL) {
		initXfrAllocCache(mcL);
		initGiLocCache(mcL);
		initGrLocCache(mcL);
		initItmUnitCache(mcL);
	}

	// 出庫場所
	protected static void initGiLocCache(MCList<? extends MCRow> mcL) {
		object(CLAZZ)._initGiLocCache(mcL);
	}

	protected void _initGiLocCache(MCList<? extends MCRow> mcL) {
		MCRow tmpR = mcL.createRow();
		
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.wg_cd, t.lg_grp_cd, t.loc_cd, t.sppl_cd, t.loc_mng_typ, t.site_cd);
		if (tmpR instanceof XfrInstChk_HdrDtlR) {
			_giLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, mcL, XfrInstChk_HdrDtlR.$gi_loc_cd);
		}
		else if (tmpR instanceof XfrInst_HdrDtlR) {
			_giLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, mcL, XfrInst_HdrDtlR.$gi_loc_cd);
		}
	}

	protected static FXUCL_MCDbcCache<MAM_LOC_R> getGiLocCache() {
		return object(CLAZZ)._giLocCache;
	}

	// 入庫場所
	protected static void initGrLocCache(MCList<XfrInstChk_HdrDtlR> mcL) {
		object(CLAZZ)._initGrLocCache(mcL);
	}

	protected void _initGrLocCache(MCList<XfrInstChk_HdrDtlR> mcL) {
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.loc_cd, t.loc_nm, t.lg_grp_cd, t.wg_cd, t.sppl_cd,
				t.loc_mng_typ, t.site_cd,
				MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, bind("xfr_schd_dt"),
						value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value()), nullValue())
								.as("sppl_cntct_dpt"),
				MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, bind("xfr_schd_dt"),
						value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value()), nullValue())
								.as("sppl_cntct_psn"),
				MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, bind("xfr_schd_dt"),
						value(MAC_BP_ADDR_TYP.ZIP_CD.value()), nullValue()).as("zip_cd"),
				MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, bind("xfr_schd_dt"),
						value(MAC_BP_ADDR_TYP.ADDR1.value()), nullValue()).as("addr1"),
				MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, bind("xfr_schd_dt"),
						value(MAC_BP_ADDR_TYP.ADDR2.value()), nullValue()).as("addr2"),
				MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, bind("xfr_schd_dt"),
						value(MAC_BP_ADDR_TYP.ADDR3.value()), nullValue()).as("addr3"),
				MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, bind("xfr_schd_dt"),
						value(MAC_BP_ADDR_TYP.ADDR4.value()), nullValue()).as("addr4"),
				MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, bind("xfr_schd_dt"),
						value(MAC_BP_ADDR_TYP.TEL.value()), nullValue()).as("tel"),
				MAPA_LOC$F_GET_LOC_ADDR(t.loc_cd, bind("xfr_schd_dt"),
						value(MAC_BP_ADDR_TYP.FAX.value()), nullValue()).as("fax"));
		_grLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, mcL,
				XfrInstChk_HdrDtlR.$gr_loc_cd);
	}

	protected static FXUCL_MCDbcCache<MAM_LOC_R> getGrLocCache() {
		return object(CLAZZ)._grLocCache;
	}
	
	// 単位
	protected static void initItmUnitCache(MCList<XfrInstChk_HdrDtlR> bindL) {
		object(CLAZZ)._initItmUnitCache(bindL);
	}
	protected void _initItmUnitCache(MCList<XfrInstChk_HdrDtlR> bindL) {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(t);
		itmUnitL_bldr.setSelect(t.conv_base_qty, t.conv_qty, t.dec_place, t.rnd_typ);
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
				itmUnitL_bldr,
				bindL.subList(XfrInstChk_HdrDtlR.$alloc_flg, true),
				XfrInstChk_HdrDtlR.$itm_cd,
				XfrInstChk_HdrDtlR.$itm_sub1,
				XfrInstChk_HdrDtlR.$itm_sub2,
				XfrInstChk_HdrDtlR.$itm_sub3,
				XfrInstChk_HdrDtlR.$trd_unit_cd);
	}
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		if (object(CLAZZ)._itmUnitCache == null) {
			object(CLAZZ)._initItmUnitCache(MCList.create(XfrInstChk_HdrDtlR.class));
		}
		return object(CLAZZ)._itmUnitCache;
	}
	
	// 引当結果
	protected static void initXfrSchdChk02AllocCache(MCList<XfrSchdChk02_AllocRsltR> allocRslt) {
		object(CLAZZ)._initXfrSchdChk02AllocCache(allocRslt);
	}

	protected void _initXfrSchdChk02AllocCache(MCList<XfrSchdChk02_AllocRsltR> allocRslt) {
		_xfrSchdChk02AllocCache = allocRslt;
	}

	protected static MCList<XfrSchdChk02_AllocRsltR> getXfrSchdChk02AllocCache() {
		return object(CLAZZ)._xfrSchdChk02AllocCache;
	}

	// 移動引当状況トランのキャッシュ
	protected static void initXfrAllocCache(MCList<XfrInstChk_HdrDtlR> bindL) {
		object(CLAZZ)._initXfrAllocCache(bindL);
	}

	protected void _initXfrAllocCache(MCList<XfrInstChk_HdrDtlR> bindL) {
		_xfrAllocCache = new XfrAllocCache(bindL);
	}

	protected static void initXfrAllocCache(XfrInst_HdrR bindR) {
		object(CLAZZ)._initXfrAllocCache(bindR);
	}

	protected void _initXfrAllocCache(XfrInst_HdrR bindR) {
		_xfrAllocCache = new XfrAllocCache(bindR);
	}

	public class XfrAllocCache {
		protected MCIndexKey _xfrAllocCacheIdx;
		protected MCList<MST_XFR_ALLOC_STS_R> _xfrAllocCache = MCList.create(MST_XFR_ALLOC_STS_R.class);
		protected MST_XFR_ALLOC_STS_R _xfrAllocCache_t = MST_XFR_ALLOC_STS_R.create("T");
		protected MCQueryApiBuilder _xfrAllocCache_bldr = MCQueryApiBuilder.create(_xfrAllocCache_t);

		// 品目情報は本来移動・移送予定から取得すべきだが、予定から指図で品目は変更不可なので指図明細のものを使ってもよい
		protected XfrAllocCache(XfrInst_HdrR bindR) {
			MST_XFR_INST_D_R t2 = MST_XFR_INST_D_R.create("T2");
			_xfrAllocCache_bldr.setSelectAll();
			_xfrAllocCache_bldr.addSelect(t2.xfr_inst_no);
			_xfrAllocCache_bldr.addSelect(t2.itm_cd);
			_xfrAllocCache_bldr.addSelect(t2.itm_sub1);
			_xfrAllocCache_bldr.addSelect(t2.itm_sub2);
			_xfrAllocCache_bldr.addSelect(t2.itm_sub3);
			_xfrAllocCache_bldr.addInnerJoin(t2, _xfrAllocCache_t.xfr_inst_d_no.eq(t2.xfr_inst_d_no));
			_xfrAllocCache_bldr.addWhereWithAnd(t2.xfr_inst_no.eq(bind("xfr_inst_no")));
			dbSelect("MSBEL5210_MST_XFR_ALLOC_STS_S03", _xfrAllocCache, _xfrAllocCache_bldr, bindR);
			_xfrAllocCacheIdx = _xfrAllocCache.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
		}

		protected XfrAllocCache(MCList<XfrInstChk_HdrDtlR> bindL) {
			MST_XFR_INST_D_R t2 = MST_XFR_INST_D_R.create("T2");
			_xfrAllocCache_bldr.setSelectAll();
			_xfrAllocCache_bldr.addSelect(t2.xfr_inst_no);
			_xfrAllocCache_bldr.addSelect(t2.itm_cd);
			_xfrAllocCache_bldr.addSelect(t2.itm_sub1);
			_xfrAllocCache_bldr.addSelect(t2.itm_sub2);
			_xfrAllocCache_bldr.addSelect(t2.itm_sub3);
			_xfrAllocCache_bldr.addInnerJoin(t2, _xfrAllocCache_t.xfr_inst_d_no.eq(t2.xfr_inst_d_no));
			_xfrAllocCache_bldr.addWhereWithAnd(t2.xfr_inst_no.eq(bind("xfr_inst_no")));
			_xfrAllocCache_bldr.addWhereWithCutOffAnd(_xfrAllocCache_t.xfr_alloc_sts_no.eq(bind("xfr_alloc_sts_no")));
			dbSelect("MSBEL5210_MST_XFR_ALLOC_STS_S04", _xfrAllocCache, _xfrAllocCache_bldr, bindL);
			_xfrAllocCacheIdx = _xfrAllocCache.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
		}

		protected MCList<MST_XFR_ALLOC_STS_R> get() {
			return _xfrAllocCache;
		}
		protected MCList<MST_XFR_ALLOC_STS_R> getByXfrInstNum(String xfr_inst_no) {
			return _xfrAllocCache.subList("xfr_inst_no", xfr_inst_no);
		}
		protected MST_XFR_ALLOC_STS_R getFirst(String xfr_alloc_sts_no) {
			return _xfrAllocCache.getFirst(_xfrAllocCacheIdx, xfr_alloc_sts_no);
		}
	}

	protected static XfrAllocCache getXfrAllocCache() {
		return object(CLAZZ)._xfrAllocCache;
	}

	//FMCB CUSTOM END
}