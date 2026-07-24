package mcframe.serverMSBE.MSBEL5530;

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
import mcframe.serverMAUC.MAUCL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5530.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5510.*;
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMBBA.MBBAL5010.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverMSBE.MSBEL5520.*;
import mcframe.serverMSBF.MSBFL5100.*;
import mcframe.serverMSBF.MSBFL5110.*;
import mcframe.serverMSBF.MSBFL5200.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBE.MSBEL5730.*;
import static mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.serverMSLA.MSLAL6010.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import mcframe.serverMSBG.MSBGL5080.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipInstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipInstService_MC extends MSBEL_ShipInstService_MC_A{
	//FMCB CUSTOM START
	protected static final Class<MSBEL_ShipInstService> CLAZZ = MSBEL_ShipInstService.class;

	// キャッシュ
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected void _initItmUnitCache(MCList<?> dtlL) {
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbcL_bldr, dtlL,
				MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
	}
	protected static void initItmUnitCache(MCList<?> dtlL) {
		object(CLAZZ)._initItmUnitCache(dtlL);
	}
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		if (object(CLAZZ)._itmUnitCache == null) {
			initItmUnitCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmUnitCache;
	}
	protected static MAVM_ITM_UNIT_R getItmUnit(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String unit_cd) {
		return getItmUnitCache().get(itm_cd, itm_sub1, itm_sub2, itm_sub3, unit_cd);
	}

	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	protected void _initLocCache(MCList<?> dtlL) {
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL,
				MAM_LOC_R.$loc_cd);
	}
	protected static void initLocCache(MCList<?> dtlL) {
		object(CLAZZ)._initLocCache(dtlL);
	}
	protected static FXUCL_MCDbcCache<MAM_LOC_R> getLocCache() {
		if (object(CLAZZ)._locCache == null) {
			initLocCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._locCache;
	}
	protected static MAM_LOC_R getLoc(String loc_cd) {
		return getLocCache().get(loc_cd);
	}

	/** 取引先禁止マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_BP_STOP_R> _bpStpCache = null;
	/**
	 * 取引先禁止マスタをキャッシュする
	 * @param HdrL ヘッダチェック上り電文リスト
	 */
	protected static void initBpStpCache(MCList<?> dtlL) {	
		object(CLAZZ)._initBpStpCache(dtlL);
	}
	protected void _initBpStpCache(MCList<?> dtlL) {
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MAM_BP_STOP_R.create("T"));
		_bpStpCache = new FXUCL_MCDbcCache<MAM_BP_STOP_R>(dbcL_bldr, dtlL, "cst_cd");
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
	protected static void initStopItmCache(MCList<ShipInst_Chk01_DtlR> dtlL) {
		object(CLAZZ)._initStopItmCache(dtlL);
	}
	protected void _initStopItmCache(MCList<ShipInst_Chk01_DtlR> dtlL) {
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MAM_ITM_STOP_R.create("T"));
		_itmStopCache = new FXUCL_MCDbcCache<MAM_ITM_STOP_R>(dbcL_bldr, dtlL, ShipInst_Chk01_DtlR.$itm_cd,
				ShipInst_Chk01_DtlR.$itm_sub1, ShipInst_Chk01_DtlR.$itm_sub2, ShipInst_Chk01_DtlR.$itm_sub3);
	}
	/**
	 * 品目禁止マスタキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MAM_ITM_STOP_R> getItmStopCache() {
		return object(CLAZZ)._itmStopCache;
	}

	/** 引当禁止マスタキャッシュ */
	protected FXUCL_MCDbcCache<MST_ALLOC_STOP_LOT_R> _allocStopCache = null;
	/**
	 * 引当禁止マスタをキャッシュする
	 * @param dtlL 明細チェック上り電文リスト
	 */
	protected static void initStopAllocCache(MCList<ShipInst_Chk01_DtlR> dtlL) {
		object(CLAZZ)._initStopAllocCache(dtlL);
	}
	protected void _initStopAllocCache(MCList<ShipInst_Chk01_DtlR> dtlL) {
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_ALLOC_STOP_LOT_R.create("T"));
		_allocStopCache = new FXUCL_MCDbcCache<MST_ALLOC_STOP_LOT_R>(dbcL_bldr, dtlL, ShipInst_Chk01_DtlR.$itm_cd,
				ShipInst_Chk01_DtlR.$itm_sub1, ShipInst_Chk01_DtlR.$itm_sub2, ShipInst_Chk01_DtlR.$itm_sub3,
				ShipInst_Chk01_DtlR.$lot_no, ShipInst_Chk01_DtlR.$sublot_no);
	}
	/**
	 * 引当禁止マスタキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MST_ALLOC_STOP_LOT_R> getAllocStopCache() {
		return object(CLAZZ)._allocStopCache;
	}
	/** 品目マスタキャッシュ */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	/**
	 * 品目マスタをキャッシュする
	 * @param dtlL 明細チェック上り電文リスト
	 */
	protected static void initItmCache(MCList<ShipInst_Chk01_DtlR> dtlL) {
		object(CLAZZ)._initItmCache(dtlL);
	}
	protected void _initItmCache(MCList<ShipInst_Chk01_DtlR> dtlL) {
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbcL_bldr, dtlL, ShipInst_Chk01_DtlR.$itm_cd,
				ShipInst_Chk01_DtlR.$itm_sub1, ShipInst_Chk01_DtlR.$itm_sub2, ShipInst_Chk01_DtlR.$itm_sub3);
	}
	/**
	 * 品目マスタキャッシュからデータを取得する
	 * @return キャッシュのデータ
	 */
	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		return object(CLAZZ)._itmCache;
	}

	/**
	 * 輸出規制マスタキャッシュ
	 */
	protected MCList<MAM_EX_CTRL_R> _exCtrl = null;
	protected MCIndexKey _idxExCtrl = null;

	protected MCList<Srch_RsltR> _allocRsltL = null;
	protected MCList<MSW_IO_SCHD_DEL_R> _allocIoSchdL = MCList.create(MSW_IO_SCHD_DEL_R.class); 
	protected MCList<MSW_SHIP_SCHD_DT_CALC_R> _calcRsltL = MCList.create(MSW_SHIP_SCHD_DT_CALC_R.class);
	protected static final String _tmp_valid_dt_fr = "tmp_valid_dt_fr";
	protected static final String _tmp_valid_dt_fr_grp = "tmp_valid_dt_fr_grp";
	protected static final String _tmp_valid_dt_to = "tmp_valid_dt_to";
	protected MCList<MST_SHIP_ALLOC_STS_R>
			_orgStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class),
			_stsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
	protected MST_SHIP_ALLOC_STS_R _stsL_t = MST_SHIP_ALLOC_STS_R.create("T");
	protected MCQueryApiBuilder _stsL_bldr = MCQueryApiBuilder.create(_stsL_t);
	protected MCList<ShipInst_Chk01_DtlR> _notInstL = MCList.create(ShipInst_Chk01_DtlR.class);
	protected static final String _org_ship_alloc_sts_no = "org_ship_alloc_sts_no";
	protected static final String _tmp_dlv_id_typ = "tmp_dlv_id_typ";
	protected static final String _tmp_dlv_id_cd = "tmp_dlv_id_cd";
	/**
	 * ShipInst_Chk01オペレーション.<p>
	 *
	 * 出荷指図登録オペレーション実施前に事前チェックを行います。<br>
	 */
	public class ShipInst_Chk01 extends MSBEL_ShipInstService_MC_A.ShipInst_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();

			// 前処理
			preProc();

			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(chk());

			// 引当関連処理
			msgL.addAll(chkAllocMain());

			MCList<ShipInst_Chk01_DtlR> tgtL = MCList.create(ShipInst_Chk01_DtlR.class);
			if (up0().get(0).is_src_shipinst_list_flg()) {
				tgtL = up1().subList(r -> r.alloc_tgt_flg() && r.alloc_flg() || !r.alloc_tgt_flg());
			}
			else {
				tgtL = up1();
			}
			// 品揃え
			msgL.addAll(chkSet(up0(), tgtL, up2()));
			msgL.addAll(chkItm(up1()));
			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void preProc() {
			initItmCache(up1());
			preProc_Ins(up0(), up1(), up2());
			initBpStpCache(up2());
			initStopItmCache(up1());
			initStopAllocCache(up1());

			lockLoc();
			setAllocIoSchd();

			calcDlvDt(up0(), up1(), up2());
		}

		/**
		 * チェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());

			msgL.addAll(chkShip(up0(), noErrL, up2()));
			msgL.addAll(chkShipInst(up0(), noErrL));
			
			chkAprv();
			chkPlntShip();
			chkRelease();
			chkLot();
			chkLotInv();
			chkLotVer();
			chkShipSchd();

			return msgL;
		}

		/**
		 * 承認チェック
		 */
		protected void chkAprv() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			chkAprvChk02(noErrL, up2());
		}

		/**
		 * 工場出荷可能チェック
		 */
		protected void chkPlntShip() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			chkPlntShipCmn(up0(), noErrL, up2());
		}

		/**
		 * 市場出荷可能チェック
		 */
		protected void chkRelease() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			chkReleaseCmn(noErrL, up2());
		}

		/**
		 * 出荷時構成チェック
		 */
		protected void chkLot() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			chkLotCmn(up0(), noErrL);
		}

		/**
		 * ロット逆転チェック
		 */
		protected void chkLotInv() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			chkLotInvCmn(up0(), noErrL, up2());
		}

		/**
		 * ロット存在チェック
		 */
		protected void chkLotVer() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			chkLotVerCmn(noErrL);
		}

		/**
		 * 出荷予定更新前チェック
		 */
		protected void chkShipSchd() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			if (noErrL.isEmpty()) return;
			
			MSBEL_ShipSchdService.ShipSchd_Chk02 o = MSBEL_ShipSchdService.crtShipSchd_Chk02();

			// up0
			o.up0().setAll(setCnd_ShipSchd_ShipSchd_DtlR_Ins(up0(), noErrL, up2()));

			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(up1(), o.down0(), ShipInst_Chk01_DtlR.$tmp_inst_d_no, ShipSchd_DtlR.$peg_no);
			}
		}

		/**
		 * 出荷場所のロック
		 */
		protected void lockLoc() {
			MSBEL_AllocMngService.Alloc_Lock_Upd01 o = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			MCList<ShipInst_Chk01_DtlR> l = up1().subList(r -> isAlloc(r, up2()));
			for (ShipInst_Chk01_DtlR r : l) {
				MSW_ALLOC_LOC_MAP_R cndR = MSW_ALLOC_LOC_MAP_R.create();
				copy(cndR, r, createMap_MSW_ALLOC_LOC_MAP_R_ShipInst_Chk01_DtlR());
				o.up0().add(cndR);
			}
			o.exec();
		}

		/**
		 * 引当関連処理
		 */
		protected MCMessageList chkAllocMain() {
			MCMessageList msgL = new MCMessageList();
			// 前処理
			MCList<ShipInst_Chk01_DtlR> allocL = MCList.create(ShipInst_Chk01_DtlR.class);
			allocL.setAll(preAlloc());

			// 在庫引当処理
			allocStk(allocL, up0(), up2());
			
			if (up0().get(0).is_src_shipinst_list_flg()) {
				// 引当不足の明細と、同じ引当の単位の品目の明細も引当不足とする
				chkUnallocInOtherTgt(allocL);
			}
			
			msgL.addAll(chkNotLotMix(up1(), allocL, up2()));
			return msgL;
		}

		/**
		 * 引当前処理
		 */
		protected MCList<ShipInst_Chk01_DtlR> preAlloc() {
			// 引当対象外、およびロット未提案の出荷予定を引当処理の対象から除外する
			MCList<ShipInst_Chk01_DtlR> allocL = up1().subList(r -> isAlloc(r, up2()));
			// ソート
			up2().sort(ShipSchd_Chk01_DtlR.$tmp_inst_d_no, ShipSchd_Chk01_DtlR.$ship_pr_no, ShipSchd_Chk01_DtlR.$ship_schd_no);
			MCIndexKey idx = up2().createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);
			for (ShipInst_Chk01_DtlR allocR : allocL) {
				ShipSchd_Chk01_DtlR up2R = up2().getFirst(idx, allocR.tmp_inst_d_no());
				if (!isNull(up2R)) {
					allocR.addStringColumn("ship_pr_no", up2R.ship_pr_no());
					allocR.addStringColumn("ship_schd_no", up2R.ship_schd_no());
					allocR.addStringColumn("slo_d_no", up2R.sp().slo_d_no());
				}
			}
			allocL.sort("ship_pr_no", "ship_schd_no");
			return allocL;
		}
		
		protected void chkUnallocInOtherTgt(MCList<ShipInst_Chk01_DtlR> allocL) {
			MCIndexKey grpIdx = allocL.createIndex(
					ShipInst_Chk01_DtlR.$ship_lg_grp_cd, ShipInst_Chk01_DtlR.$itm_cd,
					ShipInst_Chk01_DtlR.$itm_sub1, ShipInst_Chk01_DtlR.$itm_sub2, ShipInst_Chk01_DtlR.$itm_sub3, ShipInst_Chk01_DtlR.$alloc_tgt_flg,
					ShipInst_Chk01_DtlR.$alloc_str_ln_cd, ShipInst_Chk01_DtlR.$stk_arrv_bp_cd,
					ShipInst_Chk01_DtlR.$quality_typ, ShipInst_Chk01_DtlR.$gd_cd,
					ShipInst_Chk01_DtlR.$stk_id_typ, ShipInst_Chk01_DtlR.$stk_bp_cd);
			for (ShipInst_Chk01_DtlR r : allocL.subList(r -> !r.alloc_flg())) {
				MAM_ITM_R itmr = getItmCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = getItmUnit(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
				
				// 引当不足の明細と、同じ引当の単位の品目の明細も引当不足とする
				for (ShipInst_Chk01_DtlR rr : allocL.subList(grpIdx, r.toArray(grpIdx.getKeys())).subList(rr -> rr.alloc_flg())) {
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
						MAVM_ITM_UNIT_R itmUnitRr = getItmUnit(rr.itm_cd(), rr.itm_sub1(), rr.itm_sub2(), rr.itm_sub3(), rr.trd_unit_cd());
						if(itmr.pack_alloc_flg()) {
							String unit_cd_r = itmUnitR.pack_flg() ? r.trd_unit_cd() : r.base_unit_cd();
							String unit_cd_rr = itmUnitRr.pack_flg() ? rr.trd_unit_cd() : rr.base_unit_cd();
							if(unit_cd_r.equals(unit_cd_rr)) {
								rr.alloc_flg(false);
							}
						}
						else {
							rr.alloc_flg(false);
						}
					}
				}
			}
		}

		/**
		 * 受払予定の取得
		 */
		protected void setAllocIoSchd() {

			MCIndexKey stsIdx = _orgStsL.createIndex("ship_schd_no");
			MCIndexKey up1Idx = up1().createIndex(ShipInst_Chk01_DtlR.$tmp_inst_d_no);

			_allocIoSchdL = MCList.create(MSW_IO_SCHD_DEL_R.class);
			for (MCList<ShipSchd_Chk01_DtlR> up2L : up2().groupList(ShipSchd_Chk01_DtlR.$tmp_inst_d_no)) {
				ShipInst_Chk01_DtlR up1R = up1().getFirst(up1Idx, up2L.get(0).tmp_inst_d_no());
				if (isAlloc(up1R, up2L)) {
					String io_schd_typ = getIoSchdTyp(up1R, up2L);
					String io_schd_sts_typ = getIoSchdStsTyp(up1R, up2L);
					for (ShipSchd_Chk01_DtlR up2R : up2L) {
						MCList<MST_SHIP_ALLOC_STS_R> stsL = _orgStsL.subList(stsIdx, up2R.ship_schd_no());
						for (MST_SHIP_ALLOC_STS_R stsR : stsL) {
							MSW_IO_SCHD_DEL_R bindR = MSW_IO_SCHD_DEL_R.create();
							bindR.io_schd_typ(io_schd_typ);
							bindR.io_schd_sts_typ(io_schd_sts_typ);
							bindR.io_schd_no(stsR.ship_alloc_sts_no());
							_allocIoSchdL.add(bindR);
						}
					}
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}

	/**
	 * ShipInst_Chk02オペレーション.<p>
	 *
	 * 出荷指図更新オペレーション実施前に事前チェックを行います。<br>
	 */
	public class ShipInst_Chk02 extends MSBEL_ShipInstService_MC_A.ShipInst_Chk02 {
		protected MCList<ShipSchd_Chk01_DtlR> _up2L = MCList.create(ShipSchd_Chk01_DtlR.class);
		protected MCList<MST_SHIP_INST_D_R> _instdL = MCList.create(MST_SHIP_INST_D_R.class);
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();

			// 前処理
			preProc();

			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(chk());

			// 引当関連処理
			msgL.addAll(chkAllocMain());
			
			// 品揃え
			msgL.addAll(chkSet(up0(), up1(), _up2L));
			
			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void preProc() {
			preProc_Upd(up0(), up1(), _up2L, _instdL);
			initBpStpCache(_up2L);
			initStopItmCache(up1());
			initStopAllocCache(up1());

			lockLoc();
			setAllocIoSchd();

			calcDlvDt(up0(), up1(), _up2L);
		}

		/**
		 * チェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());

			msgL.addAll(chkShip(up0(), noErrL, _up2L));
			msgL.addAll(chkShipDel(noErrL));
			msgL.addAll(chkShipInst(up0(), noErrL));
			
			chkAprv();
			chkPlntShip();
			chkRelease();
			chkLot();
			chkLotInv();
			chkLotVer();
			chkShipSchd();

			return msgL;
		}
		/**
		 * 出荷指図削除前チェック
		 */
		protected MCMessageList chkShipDel(MCList<ShipInst_Chk01_DtlR> noErrL) {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_SHIP_INST_D_R> instdL = MCList.create(MST_SHIP_INST_D_R.class);
			MST_SHIP_INST_D_R t = MST_SHIP_INST_D_R.create("T");
			MCQueryApiBuilder instdL_bldr = MCQueryApiBuilder.create(t);
			instdL_bldr.addWhereWithAnd(t.ship_inst_no.eq(bind("ship_inst_no")));
			dbSelect("MSBEL5530_MST_SHIP_INST_D_S01", instdL, instdL_bldr, up0());
			MCIndexKey instdIdx = instdL.createIndex("ship_inst_d_no", "abort_flg");
			for (ShipInst_Chk01_DtlR r : noErrL) {
				if (r.isStatusDelete() && instdL.contains(instdIdx, r.ship_inst_d_no(), true)) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL0339, toDispGUIIndex(r)));
				}
			}
			return msgL;
		}

		/**
		 * 承認チェック
		 */
		protected void chkAprv() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			chkAprvChk03(noErrL, _up2L);
		}

		/**
		 * 工場出荷可能チェック
		 */
		protected void chkPlntShip() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			chkPlntShipCmn(up0(), noErrL, _up2L);
		}

		/**
		 * 市場出荷可能チェック
		 */
		protected void chkRelease() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			chkReleaseCmn(noErrL, _up2L);
		}

		/**
		 * 出荷時構成チェック
		 */
		protected void chkLot() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			chkLotCmn(up0(), noErrL);
		}

		/**
		 * ロット逆転チェック
		 */
		protected void chkLotInv() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			chkLotInvCmn(up0(), noErrL, _up2L);
		}

		/**
		 * ロット存在チェック
		 */
		protected void chkLotVer() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			chkLotVerCmn(noErrL);
		}

		/**
		 * 出荷予定更新前チェック
		 */
		protected void chkShipSchd() {
			MCList<ShipInst_Chk01_DtlR> noErrL = getChkList(up1());
			if (noErrL.isEmpty()) return;

			MSBEL_ShipSchdService.ShipSchd_Chk02 o = MSBEL_ShipSchdService.crtShipSchd_Chk02();

			// up0
			o.up0().setAll(setCnd_ShipSchd_ShipSchd_DtlR_Upd(up0(), noErrL, _up2L));

			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(up1(), o.down0(), ShipInst_Chk01_DtlR.$tmp_inst_d_no, ShipSchd_DtlR.$peg_no);
			}
		}

		/**
		 * 出荷場所のロック
		 */
		protected void lockLoc() {
			MSBEL_AllocMngService.Alloc_Lock_Upd01 o = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			MCList<ShipInst_Chk01_DtlR> l = up1().subList(r -> isAlloc(r, _up2L));
			for (ShipInst_Chk01_DtlR r : l) {
				MSW_ALLOC_LOC_MAP_R cndR = MSW_ALLOC_LOC_MAP_R.create();
				copy(cndR, r, createMap_MSW_ALLOC_LOC_MAP_R_ShipInst_Chk01_DtlR());
				o.up0().add(cndR);
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * 受払予定を取得
		 */
		protected void setAllocIoSchd() {

			MCIndexKey stsIdx = _orgStsL.createIndex("ship_inst_d_no");
			MCIndexKey up2Idx = _up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);

			_allocIoSchdL = MCList.create(MSW_IO_SCHD_DEL_R.class);
			for (ShipInst_Chk01_DtlR up1R : up1()) {
				MCList<ShipSchd_Chk01_DtlR> up2L = _up2L.subList(up2Idx, up1R.tmp_inst_d_no());

				if (isAlloc(up1R, up2L)) {
					String io_schd_typ = getIoSchdTyp(up1R, up2L);
					String io_schd_sts_typ = getIoSchdStsTyp(up1R, up2L);
					MCList<MST_SHIP_ALLOC_STS_R> stsL = _orgStsL.subList(stsIdx, up1R.ship_inst_d_no());
					for (MST_SHIP_ALLOC_STS_R stsR : stsL) {
						MSW_IO_SCHD_DEL_R bindR = MSW_IO_SCHD_DEL_R.create();
						bindR.io_schd_typ(io_schd_typ);
						bindR.io_schd_sts_typ(io_schd_sts_typ);
						bindR.io_schd_no(stsR.ship_alloc_sts_no());
						_allocIoSchdL.add(bindR);
					}
				}
			}
		}

		/**
		 * 引当関連処理
		 */
		protected MCMessageList chkAllocMain() {
			MCMessageList msgL = new MCMessageList();
			// 前処理
			MCList<ShipInst_Chk01_DtlR> allocL = MCList.create(ShipInst_Chk01_DtlR.class);
			allocL.setAll(preAlloc());

			// 在庫引当処理
			allocStk(allocL, up0(), _up2L);
			
			msgL.addAll(chkNotLotMix(up1(), allocL, _up2L));
			return msgL;
		}

		/**
		 * 引当前処理
		 */
		protected MCList<ShipInst_Chk01_DtlR> preAlloc() {
			// 引当対象外、およびロット未提案の出荷予定を引当処理の対象から除外する
			MCList<ShipInst_Chk01_DtlR> allocL = up1().subList(r -> isAlloc(r, _up2L));

			MCIndexKey idx = _up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);
			for (ShipInst_Chk01_DtlR allocR : allocL) {
				ShipSchd_Chk01_DtlR up2R = _up2L.getFirst(idx, allocR.tmp_inst_d_no());
				if (!isNull(up2R)) {
					allocR.addStringColumn("ship_pr_no", up2R.ship_pr_no());
					allocR.addStringColumn("ship_schd_no", up2R.ship_schd_no());
					allocR.addStringColumn("slo_d_no", up2R.sp().slo_d_no());
				}
			}
			allocL.sort("ship_pr_no", "ship_schd_no");
			return allocL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
	}
	
	/**
	 * ShipInst_Chk03オペレーション.<p>
	 *
	 * 出荷指図削除オペレーション実施前に事前チェックを行います。<br>
	 */
	public class ShipInst_Chk03 extends MSBEL_ShipInstService_MC_A.ShipInst_Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(chk());
			
			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}

		/**
		 * チェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(chkShipDel());
			msgL.addAll(chkIv());

			chkAprv();
			chkShipSchd();

			return msgL;
		}

		/**
		 * 出荷指図削除前チェック
		 */
		protected MCMessageList chkShipDel() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_SHIP_INST_D_R> instdL = MCList.create(MST_SHIP_INST_D_R.class);
			MST_SHIP_INST_D_R t = MST_SHIP_INST_D_R.create("T");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MCQueryApiBuilder instdL_bldr = MCQueryApiBuilder.create(t);
			instdL_bldr.addWhereWithAnd(t.ship_inst_no.eq(bind("ship_inst_no")));
			instdL_bldr.addLeftOuterJoin(m1, bracket(t.itm_cd.eq(m1.itm_cd)
					.and(t.itm_sub1.eq(m1.itm_sub1))
					.and(t.itm_sub2.eq(m1.itm_sub2))
					.and(t.itm_sub3.eq(m1.itm_sub3))));
			instdL_bldr.addSelect(nvl(m1.del_flg, value(true)).as("del_flg"));
			instdL.addBooleanColumn("del_flg");
			dbSelect("MSBEL5530_MST_SHIP_INST_D_S02", instdL, instdL_bldr, up0());
			MCIndexKey instdIdx = instdL.createIndex("ship_inst_no", "abort_flg");
			MCList<ShipInst_Chk03_HdrR> chkL = MCList.create(ShipInst_Chk03_HdrR.class);
			MCIndexKey idx = up1().createIndex(ShipInst_Chk03_DtlR.$ship_inst_no, ShipInst_Chk03_DtlR.$wms_flg);
			MCIndexKey instIdx = instdL.createIndex("ship_inst_no");
			
			// 受注
			MCList<MST_SLO_D_R> slodL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R slodL_t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder slodL_bldr = MCQueryApiBuilder.create(slodL_t);
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
			MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
			MST_SHIP_INST_D_R t3 = MST_SHIP_INST_D_R.create("T3");
			slodL.addStringColumn("ship_inst_no");
			slodL_bldr.setDistinct();
			slodL_bldr.addSelect(t3.ship_inst_no);
			slodL_bldr.addInnerJoin(t1, bracket(t1.slo_d_no.eq(slodL_t.slo_d_no)));
			slodL_bldr.addInnerJoin(t2, bracket(t2.ship_pr_no.eq(t1.ship_pr_no)));
			slodL_bldr.addInnerJoin(t3, bracket(t3.ship_inst_d_no.eq(t2.ship_inst_d_no)));
			slodL_bldr.addWhereWithAnd(t3.ship_inst_no.eq(bind("ship_inst_no")));
			dbSelect("MSBEL5530_MST_SLO_D_S05", slodL, slodL_bldr, up0());
			MCIndexKey slodIdx = slodL.createIndex("ship_inst_no");
			for (ShipInst_Chk03_HdrR up0R : up0()) {
				if (instdL.contains(instdIdx, up0R.ship_inst_no(), true)) {
					up0R.err_flg(true);
					msgL.add(new MCMessage(up0R, null, MSBEL0284, toDispGUIIndex(up0R)));
				}
				if (!isNull(up1().getFirst(idx, up0R.ship_inst_no(), true))) {
					boolean exist = false;
					for (MST_SHIP_INST_D_R r : instdL.subList(instIdx, up0R.ship_inst_no())) {
						if (r.ship_act_qty().isPositive()) {
							// 実績が含まれている場合はチェックしない
							exist = true;
							break;
						}
					}
					if (!exist) {
						chkL.add(up0R);
					}
				}
				for (MST_SHIP_INST_D_R r : instdL.subList(instIdx, up0R.ship_inst_no())) {
					if (r.getBooleanNE("del_flg")) {
						msgL.add(new MCMessage(up0R, null, MAUAL0189,
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(up0R)));
					}
				}
				// 受注打切済みチェック
				MST_SLO_D_R slodR = slodL.getFirst(slodIdx, up0R.ship_inst_no());
				if (!isNull(slodR)) {
					if (slodR.abort_flg()) {
						msgL.add(new MCMessage(up0R, null, MSBEL1102, toDispGUIIndex(up0R)));
					}
				}
			}
			// 送信後訂正不可
			msgL.addAll(chkSendIf(chkL));
			return msgL;
		}

		/**
		 * 承認チェック
		 */
		protected void chkAprv() {

			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MST_SLO_R t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(t);
			MST_SLO_D_R t1 = MST_SLO_D_R.create("T1");
			MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
			MST_SHIP_SCHD_R t3 = MST_SHIP_SCHD_R.create("T3");
			MST_SHIP_INST_D_R t4 = MST_SHIP_INST_D_R.create("T4");
			sloL.addStringColumn("ship_inst_no");
			sloL_bldr.setDistinct();
			sloL_bldr.setSelect(t.slo_no, t.aprv_flg, t.aprv_no);
			sloL_bldr.addSelect(t4.ship_inst_no);
			sloL_bldr.addInnerJoin(t1, bracket(t1.slo_no.eq(t.slo_no)));
			sloL_bldr.addInnerJoin(t2, bracket(t2.slo_d_no.eq(t1.slo_d_no)));
			sloL_bldr.addInnerJoin(t3, bracket(t3.ship_pr_no.eq(t2.ship_pr_no)));
			sloL_bldr.addInnerJoin(t4, bracket(t4.ship_inst_d_no.eq(t3.ship_inst_d_no)));
			sloL_bldr.setWhere(t4.ship_inst_no.eq(bind("ship_inst_no")));
			sloL_bldr.addWhereWithAnd(t.aprv_flg.eq(value(true)));
			if (dbSelect("MSBEL5530_MST_SLO_S01", sloL, sloL_bldr, up0()) <= 0) {
				return;
			}
			MCIndexKey sloIdx = sloL.createIndex("aprv_no");

			MBBAL_AprvService.Aprv_Chk03 o = MBBAL_AprvService.crtAprv_Chk03();
			for (MST_SLO_R r : sloL) {
				Aprv_Chk02_Rslt1R aprvR = o.up0().add();
				aprvR.aprv_no(r.aprv_no());
			}
			if (!o.up0().isEmpty()) {
				o.exec();
				
				MCList<Aprv_Chk02_Rslt1R> errL = o.down0().subList(Aprv_Chk02_Rslt1R.$err_flg, true);
				if (!errL.isEmpty()) {
					MCIndexKey up0Idx = up0().createIndex(ShipInst_Chk03_HdrR.$ship_inst_no);
					for (Aprv_Chk02_Rslt1R errR : errL) {
						MCList<MST_SLO_R> errsloL = sloL.subList(sloIdx, errR.aprv_no());
						for (MST_SLO_R errsloR : errsloL) {
							ShipInst_Chk03_HdrR up0R = up0().getFirst(up0Idx, errsloR.getStringNE("ship_inst_no"));
							up0R.err_flg(true);
						}
					}
				}
			}
		}

		/**
		 * 出荷予定更新前チェック
		 */
		protected void chkShipSchd() {
			MSBEL_ShipSchdService.ShipSchd_Chk02 o = MSBEL_ShipSchdService.crtShipSchd_Chk02();
			MCList<MST_SHIP_SCHD_R> schdL = setCnd_ShipSchd_ShipSchd_DtlR_Del_pre(up0());
			MCList<ShipSchd_DtlR> up = setCnd_ShipSchd_ShipSchd_DtlR_Del(schdL);
			// up0
			o.up0().setAll(up);

			if (!o.up0().isEmpty()) {
				o.exec();

				MCList<ShipSchd_DtlR> errL = o.down0().subList(ShipSchd_DtlR.$err_flg, true);
				if (!errL.isEmpty()) {
					MCIndexKey up0Idx = up0().createIndex(ShipInst_Chk03_HdrR.$ship_inst_no);
					MCIndexKey upIdx = up.createIndex("peg_no");
					MCIndexKey schdIdx = schdL.createIndex("ship_schd_no");
					for (ShipSchd_DtlR errR : errL) {
						MCList<ShipSchd_DtlR> errupL = up.subList(upIdx, errR.peg_no());
						for (ShipSchd_DtlR errupR : errupL) {
							MST_SHIP_SCHD_R schdR = schdL.getFirst(schdIdx, errupR.ship_schd_no());
							ShipInst_Chk03_HdrR up0R = up0().getFirst(up0Idx, schdR.getStringNE("ship_inst_no"));
							up0R.err_flg(true);
						}
					}
				}
			}
		}
		/**
		 * インボイスに関連するチェックを行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkIv() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<ShipInst_Chk03_HdrR> noErrL = getChkList(up0());
			if (!noErrL.isEmpty()) {
			
				MCList<MST_IV_SHIP_INST_MAP_R> fixIvShipInstMapL = getFixIvShipInstMapL();
				MCIndexKey fixIvShipInstMapIdxkey = fixIvShipInstMapL.createIndex(MST_IV_SHIP_INST_MAP_R.$ship_alloc_sts_no);
				
				if (!fixIvShipInstMapL.isEmpty()) {
					MCIndexKey dtlIdxkey = up1().createIndex(ShipInst_Chk03_DtlR.$ship_inst_no);
					
					for (ShipInst_Chk03_HdrR hdrR : noErrL) {
						for (ShipInst_Chk03_DtlR dtlR : up1().subList(dtlIdxkey, hdrR.ship_inst_no())) {
							
							MST_IV_SHIP_INST_MAP_R ivShipInstMapR = fixIvShipInstMapL.getFirst(fixIvShipInstMapIdxkey, dtlR.ship_alloc_sts_no());
							if (!isNull(ivShipInstMapR)) {
								hdrR.err_flg(true);
								msgL.add(new MCMessage(dtlR, null, MSBEL1116, ivShipInstMapR.ship_inst_d_no(), dtlR.ship_alloc_sts_no(),  toDispGUIIndex(dtlR)));
							}
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 確定フラグがオンのインボイス出荷指図マップを取得する。
		 * @return 確定フラグがオンのインボイス出荷指図マップリスト
		 */
		protected MCList<MST_IV_SHIP_INST_MAP_R> getFixIvShipInstMapL() {
			
			MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = MCList.create(MST_IV_SHIP_INST_MAP_R.class);
			
			MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
			
			MCQueryApiBuilder ivShipInstMap_bldr = MCQueryApiBuilder.create(ivShipInstMap);
			ivShipInstMap_bldr.setWhere(ivShipInstMap.ship_alloc_sts_no.eq(bind(ShipInst_Chk03_DtlR.$ship_alloc_sts_no)));
			ivShipInstMap_bldr.addWhereWithAnd(ivShipInstMap.fix_flg.eq(value(true)));
			
			dbSelect("MSBEL5530_MST_IV_SHIP_INST_MAP_S01", ivShipInstMapL, ivShipInstMap_bldr, up1());
			
			return ivShipInstMapL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * 出荷予定日計算サービス呼び出し
	 */
	protected MCList<MSW_SHIP_SCHD_DT_CALC_R> callShipSchdDtSrch01(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> up1L, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 o = MSBEL_ShipSchdDtCalcService.crtShipSchdDt_Srch01();
		MCList<MST_SLO_D_R> slodL = MCList.create(MST_SLO_D_R.class);
		MCList<MST_SLO_D_R> bindL = MCList.create(MST_SLO_D_R.class);

		for (ShipSchd_Chk01_DtlR r : up2L) {
			MST_SLO_D_R bindR = MST_SLO_D_R.create();
			bindR.slo_d_no(r.sp().slo_d_no());
			bindL.add(bindR);
		}
		MCQueryApiBuilder slodL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
		dbSelectKey("MSBEL5530_MST_SLO_D_S01", slodL, slodL_bldr, bindL);
		MCIndexKey slodIdx = slodL.createIndex(MST_SLO_D_R.$slo_d_no);
		MCIndexKey up2Idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);

		for (ShipInst_Chk01_DtlR up1R : up1L) {
			MSW_SHIP_SCHD_DT_CALC_R r = MSW_SHIP_SCHD_DT_CALC_R.create();
			ShipInst_Chk01_HdrR up0R = getHdrR(up0L, up1R.hdr_dtl_peg());

			copy(r, up0R, createMap_MSW_SHIP_SCHD_DT_CALC_R_ShipInst_Chk01_HdrR());
			r.peg_no(up1R.peg_no());
			ShipSchd_Chk01_DtlR up2R = up2L.getFirst(up2Idx, up1R.tmp_inst_d_no());
			MST_SLO_D_R slodR = slodL.getFirst(slodIdx, up2R.sp().slo_d_no());
			if (!isNull(slodR)) {
				r.dlv_day_week_typ(nvl(up2R.ss().dlv_day_week_typ(), slodR.dlv_day_week_typ()));
			}
			r.ship_rqst_tm(up0R.ship_schd_tm());
			r.dlv_rqst_tm(up0R.dlv_schd_tm());
			r.base_dt(getToday());
			r.ship_inst_typ(up2R.sp().ship_inst_typ());
			
			if (!isNull(slodR)) {
				r.cl_time_chk_flg(true);
				r.ship_dt_chk_flg(true);
				r.ship_cal_cd_chk_flg(true);
				r.early_ship_dt_add_days_chk_flg(true);
			}
			else {
				r.cl_time_chk_flg(false);
				r.ship_dt_chk_flg(false);
				r.ship_cal_cd_chk_flg(false);
				r.early_ship_dt_add_days_chk_flg(false);
			}

			o.up0().add(r);
		}
		o.exec();
		
		return o.down0();
	}

	/**
	 * 支給返品時の支給計上日（基）が入力チェック
	 */
	protected MCMessageList chkShipInst(MCList<ShipInst_Chk01_HdrR> hdrL, MCList<ShipInst_Chk01_DtlR> noErrL) {
		MCMessageList msgL = new MCMessageList();

		MCList<ShipInst_Chk01_HdrR> errHdrL = MCList.create(ShipInst_Chk01_HdrR.class);
		for (ShipInst_Chk01_DtlR DtlR : noErrL) {
			ShipInst_Chk01_HdrR hdrR = getHdrR(hdrL, DtlR.hdr_dtl_peg());
			if (hdrR.dlv_prnt_flg()) {
				if (MAC_TRD_PTN_TYP.isPROV_RTN(DtlR.trd_ptn_typ())) {
					if (isNull(DtlR.base_ac_dt())) {
						DtlR.err_flg(true);
						errHdrL.add(hdrR);
					}
				}
			}
		}

		for (ShipInst_Chk01_HdrR hdrR : errHdrL.distinctNE(ShipInst_Chk01_HdrR.$hdr_dtl_peg)) {
			msgL.add(new MCMessage(hdrR, null, MSBEL1105, toDispGUIIndex(hdrR)));
			
		}

		return msgL;
	}
	
	/**
	 * 承認チェック対象かどうか
	 */
	protected boolean isAprv(ShipInst_Chk01_DtlR up1R, ShipSchd_Chk01_DtlR up2R) {
		if (MAC_TRD_PTN_TYP.isSLS(up1R.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSHIP(up1R.trd_ptn_typ())) {
			return up2R.sp().getBoolean("aprv_flg");
		}
		return false;
	}

	/**
	 * 承認次処理済み処理チェック（Chk01用）
	 */
	protected void chkAprvChk02(MCList<ShipInst_Chk01_DtlR> noErrL, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MBBAL_AprvService.Aprv_Chk02 o = MBBAL_AprvService.crtAprv_Chk02();

		MCIndexKey idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);
		for (ShipInst_Chk01_DtlR up1R : noErrL) {
			ShipSchd_Chk01_DtlR up2R = up2L.getFirst(idx, up1R.tmp_inst_d_no());
			if (isAprv(up1R, up2R)) {
				copy(o.up0().add(), up1R, up2R, createMap_Aprv_Chk02_Rslt1R_ShipInst_Chk01_DtlR());
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			copyErrFlg(noErrL, o.down0());
		}
	}

	/**
	 * 承認次処理済み解除処理チェック（Chk02用）
	 */
	protected void chkAprvChk03(MCList<ShipInst_Chk01_DtlR> noErrL, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MBBAL_AprvService.Aprv_Chk03 o = MBBAL_AprvService.crtAprv_Chk03();

		MCIndexKey idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);
		for (ShipInst_Chk01_DtlR up1R : noErrL) {
			ShipSchd_Chk01_DtlR up2R = up2L.getFirst(idx, up1R.tmp_inst_d_no());
			if (isAprv(up1R, up2R)) {
				copy(o.up0().add(), up1R, up2R, createMap_Aprv_Chk02_Rslt1R_ShipInst_Chk01_DtlR());
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			copyErrFlg(noErrL, o.down0());
		}
	}

	/**
	 * 工場出荷可能チェック
	 */
	protected void chkPlntShipCmn(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> noErrL, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MSBFL_PlntAprvService.PlntAprv_Chk02 o = MSBFL_PlntAprvService.crtPlntAprv_Chk02();

		for (ShipInst_Chk01_DtlR up1R : noErrL) {
			ShipInst_Chk01_HdrR up0R = getHdrR(up0L, up1R.hdr_dtl_peg());
			if (isChkPlntShip(up0R, up1R, up2L)) {
				PlntAprv_Chk02_RsltR r = PlntAprv_Chk02_RsltR.create();
				copy(r, up1R, createMap_PlntAprv_Chk02_RsltR_ShipInst_Chk01_DtlR());
				o.up0().add(r);
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			copyErrFlg(noErrL, o.down0());
		}
	}
	
	/**
	 * 工場出荷可能チェック対象かどうか
	 */
	protected boolean isChkPlntShip(ShipInst_Chk01_HdrR up0R, ShipInst_Chk01_DtlR up1R, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MAM_LOC_R loc_fr, loc_to;
		if (!isNull(up1R.alloc_loc_cd())) {
			loc_fr = getLoc(up1R.alloc_loc_cd());
		}
		else {
			return false;
		}
		if (MAC_LOC_MNG_TYP.isPRD(loc_fr.loc_mng_typ())) {
			if (MAC_TRD_PTN_TYP.isSLS(up1R.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(up1R.trd_ptn_typ())) {
				return true;
			}
			else if (MAC_TRD_PTN_TYP.isXFR(up1R.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(up1R.trd_ptn_typ())) {
				MCList<ShipSchd_Chk01_DtlR> l = up2L.subList(ShipSchd_Chk01_DtlR.$tmp_inst_d_no, up1R.tmp_inst_d_no());
				// 輸出ならチェック対象
				for (ShipSchd_Chk01_DtlR up2R : l) {
					if (isEx(up2R)) {
						return true;
					}
				}
				if (MSC_SHIP_TO_ID_TYP.isLOC(up0R.ship_to_id_typ())) {
					loc_to = getLoc(up0R.ship_to_id_cd());
					if (!isSame(loc_fr.site_cd(), loc_to.site_cd())
							|| MAC_LOC_MNG_TYP.isSLS(loc_to.loc_mng_typ())) {
						return true;
					}
				}
			}
		}
		return false;
	}
	/**
	 * 市場出荷可能チェック
	 */
	protected void chkReleaseCmn(MCList<ShipInst_Chk01_DtlR> noErrL, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MSBFL_MrktJudgService.MrktJudg_Chk02 o = MSBFL_MrktJudgService.crtMrktJudg_Chk02();
		MCIndexKey up2Idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);
		for (ShipInst_Chk01_DtlR up1R : noErrL) {
			if ((MAC_TRD_PTN_TYP.isSLS(up1R.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(up1R.trd_ptn_typ())) && !isPurcDDlv(up1R, up2L, up2Idx)) {
				MrktJudg_Chk02_RsltR r = MrktJudg_Chk02_RsltR.create();
				copy(r, up1R, createMap_MrktJudg_Chk02_RsltR_ShipInst_Chk01_DtlR());
				o.up0().add(r);
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			copyErrFlg(noErrL, o.down0());
		}
	}
	/**
	 * 仕入直送かどうか
	 */
	protected boolean isPurcDDlv(ShipInst_Chk01_DtlR up1R, MCList<ShipSchd_Chk01_DtlR> up2L, MCIndexKey up2Idx) {
		ShipSchd_Chk01_DtlR up2R = up2L.getFirst(up2Idx, up1R.tmp_inst_d_no());
		return up2R.sp().purc_ddlv_flg();
	}
	/**
	 * 出荷時構成チェック
	 */
	protected void chkLotCmn(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> noErrL) {
		MSBFL_LotTraceService.LotTrace_Chk01 o = MSBFL_LotTraceService.crtLotTrace_Chk01();
		for (ShipInst_Chk01_DtlR up1R : noErrL) {
			ShipInst_Chk01_HdrR up0R = getHdrR(up0L, up1R.hdr_dtl_peg());
			if (isChkLot(up0R, up1R)) {
				LotTrace_Chk01_RsltR r = LotTrace_Chk01_RsltR.create();
				copy(r, up1R, createMap_LotTrace_Chk01_RsltR_ShipInst_Chk01_DtlR());
				o.up0().add(r);
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			copyErrFlg(noErrL, o.down0());
		}
	}
	/**
	 * 出荷時構成チェック対象かどうか
	 */
	protected boolean isChkLot(ShipInst_Chk01_HdrR up0R, ShipInst_Chk01_DtlR up1R) {
		if (!MAC_TRD_PTN_TYP.isPROV(up1R.trd_ptn_typ()) &&
				!MAC_TRD_PTN_TYP.isPROV_RTN(up1R.trd_ptn_typ()) &&
				!isNull(up1R.alloc_loc_cd()) &&
				!isNull(up1R.alloc_lot_no()) &&
				!isNull(up1R.alloc_sublot_no()) &&
				!up1R.skip_chk_ship_flg()) {
				
			if (MAC_TRD_PTN_TYP.isSLS(up1R.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(up1R.trd_ptn_typ())) {
				return true;
			}
			else {
				MAM_LOC_R
					loc_fr = getLoc(up1R.alloc_loc_cd()),
					loc_to = getLoc(up0R.ship_to_id_cd());
				if (!isSame(loc_fr.site_cd(), loc_to.site_cd())) {
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * ロット逆転チェック
	 */
	protected void chkLotInvCmn(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> noErrL, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MSBEL_ShipLotChkService.ShipLotChk_Chk01 o = MSBEL_ShipLotChkService.crtShipLotChk_Chk01();
		// チェックは削除行以外
		MCList<ShipInst_Chk01_DtlR> chkL = noErrL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
		MCIndexKey up2Idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);
		for (ShipInst_Chk01_DtlR up1R : chkL) {
			ShipInst_Chk01_HdrR up0R = getHdrR(up0L, up1R.hdr_dtl_peg());
			if ((MAC_TRD_PTN_TYP.isSLS(up1R.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(up1R.trd_ptn_typ()))
					&& !up0R.lot_chk_off_flg()
					&& !isNullOrNullVal(up1R.alloc_lot_no())) {
				ShipLot_DtlR r = ShipLot_DtlR.create();
				copy(r, up1R, createMap_ShipLot_DtlR_ShipInst_Chk01_DtlR());

				ShipSchd_Chk01_DtlR up2R = up2L.getFirst(up2Idx, up1R.tmp_inst_d_no());
				r.cst_cd(up2R.sp().cst_cd());
				r.dlv_cd(nvl(up2R.ss().dlv_cd(), up2R.sp().dlv_id_cd()));
				r.base_dt(up0R.dlv_schd_tm().trunc(MCDateFieldType.DAY));
				if (MAC_DATA_CRUD_TYP.isCRT(up1R.data_crud_typ())) {
					r.ship_schd_no(up2R.ship_schd_no());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(up1R.data_crud_typ())) {
					r.ship_inst_d_no(up1R.ship_inst_d_no());
				}
				else if (isNull(up1R.data_crud_typ()) && MAC_DATA_CRUD_TYP.isUPD(up0R.data_crud_typ())) {
					r.ship_inst_d_no(up1R.ship_inst_d_no());
				}
				o.up0().add(r);
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
			copyErrFlg(noErrL, o.down0());
		}
	}

	protected void chkLotVerCmn(MCList<ShipInst_Chk01_DtlR> noErrL) {
		MCList<ShipInst_Chk01_DtlR> chkL = noErrL.subList(r -> isChkLotR(r));
		if (chkL.isEmpty()) return;

		MSBFL_LotService.Lot_Chk03 o = MSBFL_LotService.crtLot_Chk03();
		setAll(o.up0(), chkL, createMap_Lot_Chk03_CndR_ShipInst_Chk01_DtlR());
		o.exec();
		copyErrFlg(chkL, o.down0());
	}
	protected boolean isChkLotR(ShipInst_Chk01_DtlR chkR) {
		if (MAC_DATA_CRUD_TYP.isDEL(chkR.data_crud_typ())) {
			return false;
		}
		if (isNullOrNullVal(chkR.lot_no())) {
			return false;
		}
		return true;
	}
	protected boolean isUpdTgt(ShipInst_Chk01_DtlR dtlR, MST_SHIP_INST_D_R instR) {
		if (!isSame(dtlR.base_unit_qty(), instR.base_unit_qty()) || dtlR.abort_flg()) {
			return true;
		}
		return false;
	}

	/**
	 * 出荷指図可能チェック
	 */
	protected MCMessageList chkShip(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> noErrL, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCMessageList msgL = new MCMessageList();
		
		MCList<MCRow> iv_bindL = MCList.create(MCRow.class);
		MCList<MCRow> slo_bindL = MCList.create(MCRow.class);
		MCList<MCRow> instBindL = MCList.create(MCRow.class);
		for (ShipSchd_Chk01_DtlR r : up2L) {
			MCRow iv_bindR = MCRow.create();
			iv_bindR.addStringColumn("ship_schd_no", r.ship_schd_no());
			iv_bindL.add(iv_bindR);
			
			if (!isNull(r.sp().slo_d_no())) {
				MCRow slo_bindR = MCRow.create();
				slo_bindR.addStringColumn("slo_d_no", r.sp().slo_d_no());
				slo_bindL.add(slo_bindR);
			}
			
			if (!isNull(r.ss().ship_inst_d_no())) {
				MCRow instBindR = MCRow.create();
				instBindR.addStringColumn("ship_inst_d_no", r.ss().ship_inst_d_no());
				instBindL.add(instBindR);
			}
		}
		// インボイス
		MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
		MST_IV_R ivL_t = MST_IV_R.create("T");
		MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(ivL_t);
		MST_IV_D_R t9 = MST_IV_D_R.create("T9");
		MST_IV_MAP_R t8 = MST_IV_MAP_R.create("T8");
		ivL.addStringColumn("ship_schd_no");
		ivL_bldr.setDistinct();
		ivL_bldr.setSelect(ivL_t.iv_no, ivL_t.iv_ship_flg, t8.ship_schd_no);
		ivL_bldr.addInnerJoin(t9, bracket(t9.iv_mng_no.eq(ivL_t.iv_mng_no)));
		ivL_bldr.addInnerJoin(t8, bracket(t8.iv_d_no.eq(t9.iv_d_no)));
		ivL_bldr.addWhereWithAnd(t8.ship_schd_no.eq(bind("ship_schd_no")));
		dbSelect("MSBEL5530_MST_IV_S01", ivL, ivL_bldr, iv_bindL);
		MCIndexKey ivIdx = ivL.createIndex("ship_schd_no");
		
		// 受注
		MCList<MST_SLO_D_R> slodL = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R slodL_t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder slodL_bldr = MCQueryApiBuilder.create(slodL_t);
		MST_SLO_R t1 = MST_SLO_R.create("T1");
		slodL_bldr.addSelect(t1.iv_no);
		slodL_bldr.addInnerJoin(t1, bracket(slodL_t.slo_no.eq(t1.slo_no)));
		slodL_bldr.addWhereWithAnd(slodL_t.slo_d_no.eq(bind("slo_d_no")));
		dbSelect("MSBEL5530_MST_SLO_D_S02", slodL, slodL_bldr, slo_bindL);
		MCIndexKey slodIdx = slodL.createIndex(MST_SLO_D_R.$slo_d_no);
		MCIndexKey up2Idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);
		
		
		// 出荷指図
		MCList<MST_SHIP_INST_D_R> instdL = MCList.create(MST_SHIP_INST_D_R.class);
		MCQueryApiBuilder instdL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_D_R.create("T"));
		dbSelectKey("MSBEL5530_MST_SHIP_INST_D_S06", instdL, instdL_bldr, instBindL);
		MCIndexKey instdIdx = instdL.createIndex(MST_SHIP_INST_D_R.$ship_inst_d_no);

		//輸出規制マスタ情報を取得する
		getExCtrL(up2L);

		for (ShipInst_Chk01_DtlR r : noErrL) {
			ShipInst_Chk01_HdrR up0R = getHdrR(up0L, r.hdr_dtl_peg());
			// 出荷指図日(日時をカット)
			MCDate shipInstDt = up0R.ship_inst_tm().trunc(MCDateFieldType.DAY);
			
			MCList<ShipSchd_Chk01_DtlR> l = up2L.subList(up2Idx, r.tmp_inst_d_no());
			for (ShipSchd_Chk01_DtlR ssR : l) {
				if (ssR.ss().ship_block_flg()) {
					// 出荷留め
					msgL.add(new MCMessage(r, null, MSBEL0236, ssR.ship_schd_no(), toDispGUIIndex(r)));
				}
				if (!ssR.ss().ship_abl_flg()) {
					// 出荷判定
					msgL.add(new MCMessage(r, null, MSBEL0237, ssR.ship_schd_no(), toDispGUIIndex(r)));
				}

				// 取引先・禁止チェック(得意先)
				if (!isNull(ssR.sp().slo_d_no())) {
					MAM_BP_STOP_R bpStopRow = getBpStpCache().get(ssR.sp().cst_cd());
					if (!isNull(bpStopRow.bp_cd())) {
						if (shipInstDt.gte(bpStopRow.ship_inst_stop_dt())){
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBEL0243, 
									ssR.sp().cst_cd(), toYMDString(shipInstDt),
										toYMDString(bpStopRow.ship_inst_stop_dt()), toDispGUIIndex(r)));
						}
					}
				}
				// 取引先・禁止チェック(支給先)
				else if (!isNull(ssR.sp().xfr_schd_no())) {
					MAM_LOC_R locR = getLoc(ssR.sp().dlv_id_cd());
					if (!isNull(locR.sppl_cd())) {
						MAM_BP_STOP_R bpStopRow = getBpStpCache().get(locR.sppl_cd());
						if (!isNull(bpStopRow.bp_cd())) {
							if (shipInstDt.gte(bpStopRow.xfr_stop_dt())){
								r.err_flg(true);
								msgL.add(new MCMessage(r, null, MSBEL0319, 
										locR.sppl_cd(), toYMDString(shipInstDt),
											toYMDString(bpStopRow.xfr_stop_dt()), toDispGUIIndex(r)));
							}
						}
					}
				} 
				
				// 預りチェック
				MST_SLO_D_R slodR = slodL.getFirst(slodIdx, ssR.sp().slo_d_no());
				if (!isNull(slodR)) {
					// 預り売上で売上が登録されていない（在庫識別区分が預りになっていない）
					if (slodR.sls_cststk_flg()) {
						if (!MSC_STK_ID_TYP.isCSTSTK(ssR.ss().stk_id_typ())) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBEL0283, ssR.sp().slo_d_no(), toDispGUIIndex(r)));
						}
					}
				}
				
				// インボイス取引で配送先経由しない場合は、インボイス単位出荷でインボイス登録が行われていること
				boolean iv_flg = !isNull(slodR) ? ssR.cst_iv_flg() : ssR.iv_trd_flg(); 
				if (iv_flg) {
					if (!MAC_VIA_DLV_TYP.isVIA(nvl(ssR.ss().via_dlv_typ(), ssR.sp().via_dlv_typ()))
							&& !MAC_TRD_PTN_TYP.isSLS(ssR.sp().trd_ptn_typ()) && !MAC_TRD_PTN_TYP.isSHIP(ssR.sp().trd_ptn_typ())) {
						MST_IV_R ivR = ivL.getFirst(ivIdx, ssR.ship_schd_no());
						if (isNull(ivR)) {
							msgL.add(new MCMessage(r, null, MSBEL0285, toDispGUIIndex(r)));
						}
						else if (!ivR.iv_ship_flg()) {
							msgL.add(new MCMessage(r, null, MSBEL0286, toDispGUIIndex(r)));
						}
					}
					// インボイスNO指定ではないが、インボイス単位出荷のインボイスが含まれている
					if (isNull(up0R.iv_no())) {
						MST_IV_R ivR = ivL.getFirst(ivIdx, ssR.ship_schd_no());
						if (!isNull(ivR) && ivR.iv_ship_flg()) {
							msgL.add(new MCMessage(r, null, MSBEL0207, ssR.ship_schd_no(), ivR.iv_no(), toDispGUIIndex(r)));
						}
					}
					
				}
				
				// 受注時にインボイスＮＯが指定されている場合は、インボイス登録が行われていること
				if (ssR.cst_iv_flg() && !isNull(slodR.getString("iv_no"))) {
					MST_IV_R ivR = ivL.getFirst(ivIdx, ssR.ship_schd_no());
					if (isNull(ivR)) {
						msgL.add(new MCMessage(r, null, MSBEL0205, slodR.getString("iv_no"), toDispGUIIndex(r)));
					}
				}
				// 受注打切済みチェック
				if (!isNull(slodR)) {
					if (MAC_DATA_CRUD_TYP.isUPD(up0R.data_crud_typ())) {
						MST_SHIP_INST_D_R instR = instdL.getFirst(instdIdx, r.ship_inst_d_no());
						if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && isUpdTgt(r, instR))) {	
							if (slodR.abort_flg()) {
								msgL.add(new MCMessage(r, null, MSBEL1102, toDispGUIIndex(r)));
							}
						}
					}
				}
			}
			// 品目・禁止チェック
			MAM_ITM_STOP_R itmStopRow = getItmStopCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (!isNull(itmStopRow.itm_cd())) {
				if (shipInstDt.gte(itmStopRow.ship_inst_stop_dt())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBEL0244,
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						toYMDString(shipInstDt), toYMDString(itmStopRow.ship_inst_stop_dt()),
						toDispGUIIndex(r)));
				}
			}
			// 輸出規制チェック
			ShipSchd_Chk01_DtlR ssR = l.get(0);
			boolean iv_flg = !isNull(ssR.sp().slo_d_no()) ? ssR.cst_iv_flg() : ssR.iv_trd_flg(); 
			if (iv_flg && chkExCtrl(up0R, ssR)) {
				r.err_flg(true);
				msgL.add(new MCMessage(
					r, null, MSBEL0018,
					toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
					ssR.dlv_cntry_cd(), toDispGUIIndex(r)));
			}
			// 引当禁止チェック
			if (!isNull(r.lot_no())) {
				MST_ALLOC_STOP_LOT_R stopR = getAllocStopCache().get(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no(), r.sublot_no());
				// 禁止日≦出荷指図日＜解除日
				if (!isNull(stopR) && !isNull(stopR.stop_dt())
					&& stopR.stop_dt().lte(shipInstDt)) {
					if (isNull(stopR.rel_dt()) || shipInstDt.lt(stopR.rel_dt())) {
						r.err_flg(true);
						msgL.add(new MCMessage(
							r, null, MSBEL0019,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.lot_no(),
							r.sublot_no(), toDispGUIIndex(r)));
					}
				}
			}
		}
		

		msgL.addAll(chkShipInstTyp(up0L, noErrL, up2L));
		// インボイス単位出荷
		msgL.addAll(chkIvShip(up0L, noErrL, up2L));

		return msgL;
	}

	protected void getExCtrL(MCList<ShipSchd_Chk01_DtlR> up2L) {

		MCList<MAM_EX_CTRL_R> bindL = MCList.create(MAM_EX_CTRL_R.class);

		for (ShipSchd_Chk01_DtlR dtlR : up2L) {
			if(!isNull(dtlR.hs_cd()) && !isNull(dtlR.dlv_cntry_cd())) {
				MAM_EX_CTRL_R r = MAM_EX_CTRL_R.create();
				r.hs_cd(dtlR.hs_cd());
				r.cntry_cd(dtlR.dlv_cntry_cd());

				bindL.add(r);
			}
		}
		
		_exCtrl = MCList.create(MAM_EX_CTRL_R.class);
		
		if(!bindL.isEmpty()) {
			MCQueryApiBuilder exCtrl_bldr = MCQueryApiBuilder.create(MAM_EX_CTRL_R.create("T"));
			dbSelectColumn("MSBEL5530_MAM_EX_CTRL_S01", _exCtrl, exCtrl_bldr, new String[] {MAM_EX_CTRL_R.$hs_cd, MAM_EX_CTRL_R.$cntry_cd}, bindL, new String[] {MAM_EX_CTRL_R.$hs_cd, MAM_EX_CTRL_R.$cntry_cd});
		}
		
		_idxExCtrl = _exCtrl.createIndex(MAM_EX_CTRL_R.$hs_cd, MAM_EX_CTRL_R.$cntry_cd);
	}

	/**
	 * 指定された品目は輸出規制かどうか。
	 */
	protected boolean chkExCtrl(ShipInst_Chk01_HdrR hdrR, ShipSchd_Chk01_DtlR ssR) {

		if (isNull(ssR.hs_cd()) || isNull(ssR.dlv_cntry_cd())) {
			return false;
		}

		boolean exCtrFlg = false;
		MCDate shipInstDt = hdrR.ship_inst_tm().trunc(MCDateFieldType.DAY);

		for (MAM_EX_CTRL_R exCtrR : _exCtrl.subList(_idxExCtrl, ssR.hs_cd(), ssR.dlv_cntry_cd())) {
			
			if (exCtrR.st_dt().lte(shipInstDt) && exCtrR.end_dt().gte(shipInstDt)) {
				
				exCtrFlg = true;
				break;
			}
		}
		
		return exCtrFlg;
	}

	/**
	 * 品揃えチェック
	 */
	protected MCMessageList chkSet(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> noErrL, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCMessageList msgL = new MCMessageList();

		MCList<MST_SLO_D_R> slodAllL = MCList.create(MST_SLO_D_R.class);
		MCIndexKey up2Idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);

		// 出荷予定ＮＯのリストと受注明細ＮＯのリストを作成する
		for (ShipInst_Chk01_DtlR r : noErrL) {
			for (ShipSchd_Chk01_DtlR up2R : up2L.subList(up2Idx, r.tmp_inst_d_no())) {
				if ( !(MSC_SHIP_ASSORT_TYP.isAST(up2R.sp().getString("assort_typ"))
					|| !isNull(up2R.sp().getString("set_itm_grp_no"))) ) {
					continue;
				}
				if (!isNull(up2R.sp().slo_d_no())) {
					slodAllL.add().slo_d_no(up2R.sp().slo_d_no());
				}
			}
		}
		if (!slodAllL.isEmpty()) {
			MCQueryApiBuilder slodAllL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			dbSelectKey("MSBEL5530_MST_SLO_D_S03", slodAllL, slodAllL_bldr, slodAllL.groupBy(MST_SLO_D_R.$slo_d_no));
		}
		else {
			return msgL;
		}

		// 出荷対象の受注の明細全てを取得
		MCList<MST_SLO_R> sloAllL = MCList.create(MST_SLO_R.class);
		MST_SLO_R sloAllL_t = MST_SLO_R.create("T");
		MCQueryApiBuilder sloAllL_bldr = MCQueryApiBuilder.create(sloAllL_t);
		MST_SLO_D_R t1 = MST_SLO_D_R.create("T1");
		MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R t3 = MST_SLO_D_R.create("T3");
		MST_SHIP_PR_R t4 = MST_SHIP_PR_R.create("T4");
		MST_SHIP_SCHD_R t5 = MST_SHIP_SCHD_R.create("T5");
		sloAllL.addNumberColumn("set_itm_grp_no");
		sloAllL_bldr.setDistinct();
		sloAllL_bldr.setSelect(sloAllL_t.slo_no, sloAllL_t.iv_no, sloAllL_t.assort_typ,
				t3.slo_d_no, t3.ship_inst_typ, t3.set_itm_grp_no, t5.ship_schd_no,
				t5.base_unit_qty);
		sloAllL_bldr.addInnerJoin(t1, bracket(t1.slo_no.eq(sloAllL_t.slo_no)));
		sloAllL_bldr.addInnerJoin(t2, bracket(t2.slo_d_no.eq(t1.slo_d_no)));
		sloAllL_bldr.addInnerJoin(t3, bracket(t3.slo_no.eq(sloAllL_t.slo_no)));
		sloAllL_bldr.addInnerJoin(t4, bracket(t4.slo_d_no.eq(t3.slo_d_no)
				.and(t4.ship_to_id_typ.eq(t2.ship_to_id_typ))
				.and(t4.ship_to_id_cd.eq(t2.ship_to_id_cd))
				.and(t4.ship_to_id_nm.eq(t2.ship_to_id_nm).or(t4.ship_to_id_nm.isNull())
						.and(t2.ship_to_id_nm.isNull()))
				.and(t4.ship_to_zip_cd.eq(t2.ship_to_zip_cd)
						.or(t4.ship_to_zip_cd.isNull())
						.and(t2.ship_to_zip_cd.isNull()))
				.and(t4.ship_to_addr1.eq(t2.ship_to_addr1).or(t4.ship_to_addr1.isNull())
						.and(t2.ship_to_addr1.isNull()))
				.and(t4.ship_to_addr2.eq(t2.ship_to_addr2).or(t4.ship_to_addr2.isNull())
						.and(t2.ship_to_addr2.isNull()))
				.and(t4.ship_to_addr3.eq(t2.ship_to_addr3).or(t4.ship_to_addr3.isNull())
						.and(t2.ship_to_addr3.isNull()))
				.and(t4.ship_to_addr4.eq(t2.ship_to_addr4).or(t4.ship_to_addr4.isNull())
						.and(t2.ship_to_addr4.isNull()))
				.and(t4.ship_to_cntct_dpt.eq(t2.ship_to_cntct_dpt)
						.or(t4.ship_to_cntct_dpt.isNull())
						.and(t2.ship_to_cntct_dpt.isNull()))
				.and(t4.ship_to_cntct_psn.eq(t2.ship_to_cntct_psn)
						.or(t4.ship_to_cntct_psn.isNull())
						.and(t2.ship_to_cntct_psn.isNull()))
				.and(t4.ship_to_tel.eq(t2.ship_to_tel).or(t4.ship_to_tel.isNull())
						.and(t2.ship_to_tel.isNull()))
				.and(t4.ship_to_fax.eq(t2.ship_to_fax).or(t4.ship_to_fax.isNull())
						.and(t2.ship_to_fax.isNull()))
				.and(t4.via_dlv_typ.eq(t2.via_dlv_typ).or(t4.via_dlv_typ.isNull())
						.and(t2.via_dlv_typ.isNull()))
				.and(t4.ship_to_lg_grp_cd.eq(t2.ship_to_lg_grp_cd)
						.or(t4.ship_to_lg_grp_cd.isNull())
						.and(t2.ship_to_lg_grp_cd.isNull()))));
		sloAllL_bldr.addInnerJoin(t5, bracket(t5.ship_pr_no.eq(t4.ship_pr_no)));
		sloAllL_bldr.setWhere(t1.slo_d_no.eq(bind("slo_d_no")));
		sloAllL_bldr.addConstWhereWithAnd(t3.can_flg.eq(value(false))
				.and(t3.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NON.value())))
				.and(t5.abort_flg.eq(value(false))));
		dbSelect("MSBEL5530_MST_SLO_S02", sloAllL, sloAllL_bldr, slodAllL.groupBy("slo_d_no"),
				null);

		MCIndexKey slodAllIdx = slodAllL.createIndex(MST_SLO_D_R.$slo_d_no);
		
		// ヘッダごとの処理
		MCList<MST_SLO_D_R> slodL = MCList.create(MST_SLO_D_R.class);
		MCList<ShipSchd_Chk01_DtlR> up2L_tmp = up2L.createInstance();
		
		for (ShipInst_Chk01_HdrR up0R : up0L) {
			MCList<ShipInst_Chk01_DtlR> noErrL_sub = noErrL.subList(ShipInst_Chk01_DtlR.$hdr_dtl_peg, up0R.hdr_dtl_peg());
			MCList<ShipSchd_Chk01_DtlR> up2L_sub = up2L.subList(ShipSchd_Chk01_DtlR.$hdr_dtl_peg, up0R.hdr_dtl_peg());

			MCIndexKey up1SubIdx = noErrL_sub.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);

			slodL.init();
			up2L_tmp.init();

			// 出荷予定ＮＯのリストと受注明細ＮＯのリストを作成する
			for (ShipInst_Chk01_DtlR r : noErrL_sub) {
				for (ShipSchd_Chk01_DtlR up2R : up2L_sub.subList(ShipSchd_Chk01_DtlR.$tmp_inst_d_no, r.tmp_inst_d_no())) {
					if ( !(MSC_SHIP_ASSORT_TYP.isAST(up2R.sp().getString("assort_typ"))
							|| !isNull(up2R.sp().getString("set_itm_grp_no"))) ) {
						continue;
					}
					up2L_tmp.add(up2R);
					if (!isNull(up2R.sp().slo_d_no())) {
						slodL.add(slodAllL.getFirst(slodAllIdx, up2R.sp().slo_d_no()));
					}
				}
			}
			if (slodL.isEmpty()) {
				continue;
			}

			MCIndexKey up2tmpIdx = up2L_tmp.createIndex("ship_schd_no");

			// 出荷対象の受注の明細全てを取得
			MCIndexKey slodIdx = slodL.createIndex(MST_SLO_D_R.$slo_no);
			MCList<MST_SLO_R> sloL = sloAllL.subList(r -> slodL.contains(slodIdx, r.slo_no()));

			for (MCList<MST_SLO_R> lst : sloL.groupList("slo_no")) {
				MST_SLO_R sloR = lst.get(0);
				// 品揃えすべき受注明細のリストを作成
				java.util.ArrayList<MCList<MST_SLO_R>> arr = new java.util.ArrayList<>();
				if (MSC_SHIP_ASSORT_TYP.isAST(sloR.assort_typ())) {
					arr.add(lst);
				}
				else {
					for (MCList<MST_SLO_R> grpL : lst.groupList("set_itm_grp_no")) {
						MCList<MST_SLO_D_R> tmpslodL = slodL.subList(slodIdx, sloR.slo_no());
						if (!isNull(grpL.get(0).getNumber("set_itm_grp_no")) &&
								!isNull(tmpslodL.getFirst("set_itm_grp_no", grpL.get(0).getNumber("set_itm_grp_no")))) {
							arr.add(grpL);
						}
					}
				}
				// リストの受注明細が出荷対象に含まれているか
				for (MCList<MST_SLO_R> grpL : arr) {
					for (MST_SLO_R r : grpL) {
						ShipSchd_Chk01_DtlR up2R = up2L_tmp.getFirst(up2tmpIdx, r.getString("ship_schd_no"));
						if (isNull(up2R)) {
							// 出荷対象になっていない
							msgL.add(new MCMessage(up0R, null, MSBEL0238,
									sloR.slo_no(), sloR.assort_typ(),
									r.getNumber("set_itm_grp_no"), r.getString("ship_schd_no"), toDispGUIIndex(up0R)));
						}
						else {
							MCList<ShipInst_Chk01_DtlR> upL = noErrL_sub.subList(up1SubIdx, up2R.tmp_inst_d_no());
							if (upL.isEmpty()) continue;
							
							// 行ステータスが削除ではない場合の
							// 出荷する数量の基準単位数量を算出する
							MCNumber baseQty = MCNumber.ZERO;
							for(ShipInst_Chk01_DtlR upR : upL) {
								if (!upR.isStatusDelete()) {
									baseQty = baseQty.add(upR.alloc_base_unit_qty());
								}
							}
							
							// 出荷対象（上り電文に含まれている）だが、一部出荷もエラーにする
							if (!upL.get(0).abort_flg()
									&& baseQty.lt(r.getNumber("base_unit_qty"))) {
								msgL.add(new MCMessage(up0R, null, MSBEL0239,
										sloR.slo_no(), sloR.assort_typ(),
										r.getNumber("set_itm_grp_no"), r.getString("ship_schd_no"),
										baseQty, r.getNumber("base_unit_qty"), toDispGUIIndex(up0R)));
							}
						}
					}
				}
			}
		}
		
		return msgL;
	}

	/**
	 * インボイス単位出荷チェック
	 */
	protected MCMessageList chkIvShip(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> noErrL, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCMessageList msgL = new MCMessageList();

		MCList<ShipSchd_Chk01_DtlR> up2L_tmp = up2L.createInstance();
		MCIndexKey up2Idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);

		// 出荷予定ＮＯのリストを作成する
		for (ShipInst_Chk01_DtlR r : noErrL) {
			if(r.isStatusDelete()) {
				continue;
			}
			up2L_tmp.addAll(up2L.subList(up2Idx, r.tmp_inst_d_no()));
		}
		if (up2L_tmp.isEmpty()) {
			return msgL;
		}

		// 同時に出荷すべき出荷予定ＮＯのリスト
		MCList<MST_IV_MAP_R> ivL = MCList.create(MST_IV_MAP_R.class);
		MST_IV_MAP_R t = MST_IV_MAP_R.create("T");
		MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(t);
		MST_IV_D_R t1 = MST_IV_D_R.create("T1");
		MST_IV_R t2 = MST_IV_R.create("T2");
		MST_IV_D_R t3 = MST_IV_D_R.create("T3");
		MST_IV_MAP_R t4 = MST_IV_MAP_R.create("T4");
		ivL_bldr.setDistinct();
		ivL_bldr.addInnerJoin(t1, bracket( t1.iv_d_no.eq(t.iv_d_no)));
		ivL_bldr.addInnerJoin(t2, bracket( t2.iv_mng_no.eq(t1.iv_mng_no)));
		ivL_bldr.addInnerJoin(t3, bracket( t3.iv_mng_no.eq(t2.iv_mng_no)));
		ivL_bldr.addInnerJoin(t4, bracket( t4.iv_d_no.eq(t3.iv_d_no)));
		ivL_bldr.addWhereWithAnd(t4.ship_schd_no.eq(bind("ship_schd_no")));
		ivL_bldr.addWhereWithAnd(t2.iv_ship_flg.eq(value(true)));
		ivL_bldr.addSelect(t2.iv_mng_no);
		dbSelect("MSBEL5530_MST_IV_MAP_S01", ivL, ivL_bldr, up2L_tmp);
		
		if (ivL.isEmpty()) return msgL;


		for (MCList<ShipSchd_Chk01_DtlR> regL : up2L_tmp.groupList(ShipSchd_Chk01_DtlR.$hdr_dtl_peg)) {
			MCList<MST_IV_MAP_R> notRegL = getShipNotReg(ivL, regL);
			ShipInst_Chk01_HdrR up0R = getHdrR(up0L, regL.get(0).hdr_dtl_peg());
			for(MST_IV_MAP_R notRegR : notRegL) {
				msgL.add(new MCMessage(up0R, null, MSBEL0290, notRegR.ship_schd_no(), toDispGUIIndex(up0R)));
			}
		}
		return msgL;
	}
	/**
	 * 品目チェック
	 */
	protected MCMessageList chkItm(MCList<ShipInst_Chk01_DtlR> up1L) {
		MCMessageList msgL = new MCMessageList();
		for (ShipInst_Chk01_DtlR up1R : up1L) {
			MAM_ITM_R itmR = getItmCache().get(up1R.itm_cd(), up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3());
			if (itmR.isEmpty()) {
				up1R.err_flg(true);
				msgL.add(new MCMessage(up1R, null, MAUAL0189,
						toDispItm(up1R.itm_cd(), up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3()), toDispGUIIndex(up1R)));
			}
		}
		return msgL;
	}
	/**
	 * 指図区分の組合せチェック
	 */
	protected MCMessageList chkShipInstTyp(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> noErrL, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCMessageList msgL = new MCMessageList();

		int noPicking = 0;
		int others = 0;
		MCIndexKey noErrIdx = noErrL.createIndex(ShipInst_Chk01_DtlR.$hdr_dtl_peg);
		MCIndexKey up2Idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);
		for (ShipInst_Chk01_HdrR up0R : up0L) {
			MCList<ShipInst_Chk01_DtlR> noErrL_sub = noErrL.subList(noErrIdx, up0R.hdr_dtl_peg());

			for (ShipInst_Chk01_DtlR r : noErrL_sub) {
				//削除、打切りのレコードを除外する。
				if(r.isStatusDelete() || (r.isStatusModify() && r.abort_flg())) {
					continue;
				}

				for (ShipSchd_Chk01_DtlR up2R : up2L.subList(up2Idx, r.tmp_inst_d_no())) {
					if (MAC_SHIP_INST_TYP.isNO_PICK(up2R.sp().ship_inst_typ())){
						noPicking++;
					}
					else if (MAC_SHIP_INST_TYP.isPICK(up2R.sp().ship_inst_typ())){
						others++;
					}
				}
			}

			if (others == 0 && noPicking > 0){
				MCMessage msg = new MCMessage(up0R, null, MSBEL1065);
				msgL.add(msg);
			}
		}

		return msgL;
	}
	/**
	 * 同一インボイスＮＯに対して、含めていない出荷予定を取得
	 */
	protected MCList<MST_IV_MAP_R> getShipNotReg(MCList<MST_IV_MAP_R> ivL, MCList<ShipSchd_Chk01_DtlR> regL) {
		List<String> regShipL = regL.getString(ShipSchd_Chk01_DtlR.$ship_schd_no);
		List<String> mngNoL = new ArrayList<String>();
		MCList<MST_IV_MAP_R> retL = MCList.create(MST_IV_MAP_R.class);
		
		for(MST_IV_MAP_R r : ivL) {
			if(regShipL.contains(r.ship_schd_no()) && !mngNoL.contains(r.getString(MST_IV_R.$iv_mng_no))) {
				mngNoL.add(r.getString(MST_IV_R.$iv_mng_no));
			}
		}
		
		for(MST_IV_MAP_R r : ivL) {
			if(mngNoL.contains(r.getString(MST_IV_R.$iv_mng_no)) && !regShipL.contains(r.ship_schd_no())) {
				retL.add(r);
			}
		}
		
		return retL;
	}

	/**
	 * ShipInst_Ins01オペレーション.<p>
	 *
	 * 出荷指図を登録します。<br>
	 */
	public class ShipInst_Ins01 extends MSBEL_ShipInstService_MC_A.ShipInst_Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 前処理
			preProc_Ins(up0(), up1(), up2());

			// 出荷指図登録
			insShipInst();

			// 出荷引当状況取得
			getShipAllocSts(up1());
			callIvRegSrv(up1());
			
			// 納品伝票出力
			prntDlvSlip(up0(), up3());
			
			setUp1();
			
			// 取引パタン別データ更新
			procByTrnPtn();
			sendShipInstIf();

			// 「改訂履歴データ更新リスト」テーブルにデータを登録
			callRevDataIns01();
			
			setDown();
		}

		/**
		 * 出荷進捗ＮＯ・出荷予定ＮＯ取得用
		 */
		protected ShipSchd_Chk01_DtlR getUp2R(ShipInst_Chk01_DtlR up1R) {
			ShipSchd_Chk01_DtlR up2R = up2().getFirst(ShipSchd_Chk01_DtlR.$tmp_inst_d_no, up1R.tmp_inst_d_no());
			return up2R;
		}
		
		/**
		 * 出荷指図登録
		 */
		protected void insShipInst() {
			// 出荷指図データベース登録
			insMST_SHIP_INST();

			// 引当状況保存
			updAllocStsSv();

			// 出荷予定更新
			updShipSchd();
		}

		/**
		 * 出荷指図データベース登録
		 */
		protected void insMST_SHIP_INST() {
			MCList<MST_SHIP_INST_R> hdrL = MCList.create(MST_SHIP_INST_R.class);
			MCList<MST_SHIP_INST_D_R> dtlL = MCList.create(MST_SHIP_INST_D_R.class);
			
			// ヘッダ
			// 発番
			setShipInstNo();

			addAll(hdrL, up0(), createMap_MST_SHIP_INST_R_ShipInst_Chk01_HdrR());
			// 固定値
			hdrL.setNumber(MST_SHIP_INST_R.$ship_inst_rev, MCNumber.ONE);
			hdrL.setBoolean(MST_SHIP_INST_R.$can_flg, false);

			up1().sort(ShipInst_Chk01_DtlR.$tmp_inst_d_no);

			MCList<ShipInst_Chk01_DtlR>[] gL = up1().groupList(ShipInst_Chk01_DtlR.$tmp_inst_d_no);
			// 明細
			// 発番
			setShipInstDNo();
			for (MCList<ShipInst_Chk01_DtlR> up1L_sub : gL) {
				ShipInst_Chk01_DtlR repR = up1L_sub.get(0);
				ShipInst_Chk01_HdrR up0R = getHdrR(up0(), repR.hdr_dtl_peg());
				up1L_sub.setString(ShipInst_Chk01_DtlR.$ship_inst_no, up0R.ship_inst_no());
				if (isNull(repR.ship_lg_grp_cd())) {
					repR.ship_lg_grp_cd(up0R.ship_fr_lg_grp_cd());
				}

				MST_SHIP_INST_D_R dtlR = MST_SHIP_INST_D_R.create();
				copy(dtlR, repR, createMap_MST_SHIP_INST_D_R_ShipInst_Chk01_DtlR());

				// 取引単位数量にも基準単位を入れる
				MCNumber base_unit_qty = up1L_sub.sum(ShipInst_Chk01_DtlR.$alloc_base_unit_qty);
				dtlR.base_unit_qty(base_unit_qty);
				dtlR.trd_unit_qty(base_unit_qty);
				dtlR.trd_unit_cd(dtlR.base_unit_cd());
				// 固定値
				dtlR.ship_act_qty(MCNumber.ZERO);
				dtlR.abort_qty(MCNumber.ZERO);
				dtlR.abort_flg(false);
				dtlR.can_flg(false);

				dtlL.add(dtlR);
			}
			setDispSeq(dtlL);
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			MCQueryApiBuilder dtlL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_D_R.create("T"));
			dbInsertEx("MSBEL5530_MST_SHIP_INST_I01", hdrL, hdrL_bldr);
			dbInsertEx("MSBEL5530_MST_SHIP_INST_D_I01", dtlL, dtlL_bldr);
		}

		/**
		 * 出荷指図ＮＯ発番
		 */
		protected void setShipInstNo() {
			MCList<ShipInst_Chk01_HdrR> setNumL = createShipInst_Chk01_HdrL();
			MCList<ElmArgsR> elmArgsL = MCList.create(ElmArgsR.create());

			for (ShipInst_Chk01_HdrR up0R : up0()) {
				ElmArgsR elm = ElmArgsR.create();
				elm.co_cd(getCo().co_cd());
				elm.wg_cd(up0R.wg_cd());
				elm.dt(up0R.ship_schd_tm().trunc(MCDateFieldType.DAY));
				elm.peg_no(up0R.hdr_dtl_peg());
				elmArgsL.add(elm);
				setNumL.add(up0R);
			}
			if (!elmArgsL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.SHIPINST, elmArgsL);
				for (int i=0; i<elmArgsL.size(); i++) {
					ShipInst_Chk01_HdrR up0R = setNumL.get(i);
					up0R.ship_inst_no(elmArgsL.get(i).new_no());
				}
			}
		}

		/**
		 * 出荷指図明細ＮＯ発番
		 */
		protected void setShipInstDNo() {
			MCList<ShipInst_Chk01_DtlR> setNumL = createShipInst_Chk01_DtlL();
			MCList<ElmArgsR> elmArgsL = MCList.create(ElmArgsR.create());
			MCList<ShipInst_Chk01_DtlR>[] gL = up1().groupList(ShipInst_Chk01_DtlR.$tmp_inst_d_no);
			for (MCList<ShipInst_Chk01_DtlR> up1L_sub : gL) {
				ShipInst_Chk01_DtlR repR = up1L_sub.get(0);
				ShipInst_Chk01_HdrR up0R = getHdrR(up0(), repR.hdr_dtl_peg());
				ElmArgsR elm = ElmArgsR.create();
				elm.co_cd(getCo().co_cd());
				elm.wg_cd(up0R.wg_cd());
				elm.dt(up0R.ship_schd_tm().trunc(MCDateFieldType.DAY));
				elm.peg_no(up1L_sub.get(0).tmp_inst_d_no());
				elm.itm_cd(up1L_sub.get(0).itm_cd());
				elm.itm_sub1(up1L_sub.get(0).itm_sub1());
				elm.itm_sub2(up1L_sub.get(0).itm_sub2());
				elm.itm_sub3(up1L_sub.get(0).itm_sub3());
				elmArgsL.add(elm);
				setNumL.addAll(up1L_sub);
			}
			if (!elmArgsL.isEmpty()) {
				MCIndexKey idx = elmArgsL.createIndex("peg_no");
				setNum(MAC_NUM_BIZ_TYP.SHIPINSTD, elmArgsL);
				for (ShipInst_Chk01_DtlR up1R : up1()) {
					up1R.ship_inst_d_no(elmArgsL.getFirst(idx, up1R.tmp_inst_d_no()).new_no());
				}
			}
		}

		/**
		 * 引当状況保存
		 */
		protected void updAllocStsSv() {

			// 指図前の引当状況
			MCList<MST_SHIP_ALLOC_STS_R> dbc = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t1 = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder dbc_bldr1 = MCQueryApiBuilder.create(t1);
			dbc_bldr1.setWhere(t1.ship_schd_no.eq(bind("ship_schd_no")));
			dbc_bldr1.addConstWhereWithAnd(t1.ship_inst_no.isNull());
			dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_S01", dbc, dbc_bldr1, up2(), null);

			MCIndexKey idx = dbc.createIndex(MST_SHIP_ALLOC_STS_R.$ship_schd_no);
			MCJoinKey<MCList<ShipInst_Chk01_DtlR>>
				jk = up2().join(ShipSchd_Chk01_DtlR.$tmp_inst_d_no, up1(), ShipInst_Chk01_DtlR.$tmp_inst_d_no);

			// 指図との対応関係を設定
			for (ShipSchd_Chk01_DtlR r : up2()) {
				ShipInst_Chk01_DtlR dtlR = r.getJoinedRow(jk);
				
				for (MST_SHIP_ALLOC_STS_R allocR : dbc.subList(idx, r.ship_schd_no())) {
					allocR.ship_inst_no(dtlR.ship_inst_no());
					allocR.ship_inst_d_no(dtlR.ship_inst_d_no());
				}
			}

			// 指図前の引当状況を保存
			MCQueryApiBuilder dbc_bldr2 = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_SV_R.create("T"));
			dbInsert("MSBEL5530_MST_SHIP_ALLOC_STS_SV_I01", dbc, dbc_bldr2);
		}

		/**
		 * 出荷予定更新
		 */
		protected void updShipSchd() {
			MSBEL_ShipSchdService.ShipSchd_Upd02 o = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			// up0
			o.up0().lot_chk_flg(true);

			// up1
			o.up1().setAll(setCnd_ShipSchd_ShipSchd_DtlR_Ins(up0(), up1(), up2()));
			// インボイス取引かつ一部指図した場合、インボイスマップを更新する必要がある。
			// 未引当の場合、未指図リストが初期化されるので、保持する
			MCList<ShipInst_Chk01_DtlR> notInstL = _notInstL.clone();
			setAllocRslt_uninst(up0(), up1(), up2());
			
			// up2
			o.up2().setAll(setCnd_ShipSchd_Alloc_RsltR(up1(), o.up1()));
			if (!_notInstL.isEmpty()) {
				o.up2().addAll(setCnd_ShipSchd_Alloc_RsltR(_notInstL, o.up1()));
			}

			o.exec();
			if (!_notInstL.isEmpty()) {
				notInstL = _notInstL;
			}
			if (!notInstL.isEmpty()) {
				callIvRegServiceUpd05(o, up1(), notInstL, _orgStsL);
			}
		}
		
		MCList<ShipInst_Chk01_DtlR> _sloStsL = createShipInst_Chk01_DtlL();

		/**
		 * 電文設定
		 */
		protected void setUp1() {
			MCIndexKey stsIdx = _stsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_inst_d_no);
			MCList<ShipInst_Chk01_DtlR>[] gL = up1().groupList(ShipInst_Chk01_DtlR.$ship_inst_d_no);
			for (MCList<ShipInst_Chk01_DtlR> l : gL) {
				MCList<MST_SHIP_ALLOC_STS_R> sl = _stsL.subList(stsIdx, l.get(0).ship_inst_d_no());
				for (int i = 0 ; i < sl.size() ; i++) {
					ShipInst_Chk01_DtlR r;
					if (i > l.size() -1) {
						r = l.get(0).clone();
						l.add(r);
					}
					else {
						r = l.get(i);
					}
					MST_SHIP_ALLOC_STS_R sr = sl.get(i);
					
					copy(r, sr, createMap_ShipInst_Chk01_DtlR_MST_SHIP_ALLOC_STS_R());
					
					_sloStsL.add(r);
				}
			}
		}

		/**
		 * 取引パタン別データ更新
		 */
		protected void procByTrnPtn() {
			// 売上
			procForSales();
		}

		/**
		 * 取引パタン：売上の処理
		 */
		protected void procForSales() {
			// インボイス
			MCList<MST_IV_R> ivALlL = MCList.create(MST_IV_R.class);
			MST_IV_R ivALlL_t = MST_IV_R.create("T");
			MCQueryApiBuilder ivALlL_bldr = MCQueryApiBuilder.create(ivALlL_t);
			ivALlL_bldr.addWhereWithAnd(ivALlL_t.iv_no.eq(bind("iv_no")));
			dbSelect("MSBEL5530_MST_IV_S02", ivALlL, ivALlL_bldr, up0());
			MCIndexKey ivAllIdx = ivALlL.createIndex("iv_no");

			MCList<MST_IV_MAP_R> mapAllL = MCList.create(MST_IV_MAP_R.class);
			MST_IV_MAP_R mapAllL_t = MST_IV_MAP_R.create("T");
			MCQueryApiBuilder mapAllL_bldr = MCQueryApiBuilder.create(mapAllL_t);
			MST_IV_D_R t2 = MST_IV_D_R.create("T2");
			MST_IV_R t3 = MST_IV_R.create("T3");
			mapAllL_bldr.addSelect(t3.iv_no);
			mapAllL_bldr.addLeftOuterJoin(t2,
					bracket(t2.iv_d_no.eq(mapAllL_t.iv_d_no)));
			mapAllL_bldr.addLeftOuterJoin(t3,
					bracket(t3.iv_mng_no.eq(t2.iv_mng_no)));
			mapAllL_bldr.addWhereWithAnd(mapAllL_t.ship_schd_no.eq(bind("ship_schd_no")));
			dbSelect("MSBEL5530_MST_IV_MAP_S02", mapAllL, mapAllL_bldr, up2());
			MCIndexKey mapAllIdx = mapAllL.createIndex("ship_schd_no");
			MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = getIvShipInstMap(up0());
			MCIndexKey ivShipInstMapIdxKey = ivShipInstMapL.createIndex(MST_IV_SHIP_INST_MAP_R.$ship_alloc_sts_no, MST_IV_SHIP_INST_MAP_R.$ship_inst_fix_flg);

			// 移動・移送予定
			MCList<MST_XFR_SCHD_R> xfrAllL = MCList.create(MST_XFR_SCHD_R.class);
			MST_XFR_SCHD_R xfrAllL_t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder xfrAllL_bldr = MCQueryApiBuilder.create(xfrAllL_t);
			MST_SHIP_PR_R p = MST_SHIP_PR_R.create("P");
			xfrAllL.addStringColumn("ship_pr_no");
			xfrAllL_bldr.addSelect(p.ship_pr_no);
			xfrAllL_bldr.addInnerJoin(p,
					bracket(xfrAllL_t.xfr_schd_no.eq(p.xfr_schd_no)));
			xfrAllL_bldr.addWhereWithAnd(p.ship_pr_no.eq(bind("ship_pr_no")));
			dbSelect("MSBEL5530_MST_XFR_SCHD_S01", xfrAllL, xfrAllL_bldr, up2());
			MCIndexKey xfrAllIdx = xfrAllL.createIndex("xfr_schd_no");
			
			
			MSBBL_SloStsRegService.SloSts_Ins01 o1 = MSBBL_SloStsRegService.crtSloSts_Ins01();
			MCList<SloSts_DtlR> slostsL = MCList.create(SloSts_DtlR.class);
			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MCList<SloSts_DtlR> bindL = MCList.create(SloSts_DtlR.class);
			
			MCIndexKey dtlIdx = _sloStsL.createIndex(ShipInst_Chk01_DtlR.$hdr_dtl_peg);
			for (ShipInst_Chk01_HdrR up0R : up0()) {
				// インボイス
				boolean iv_ship_flg = false;
				MST_IV_R ivR = ivALlL.getFirst(ivAllIdx, up0R.iv_no());
				if (!isNull(ivR)) {
					iv_ship_flg = ivR.iv_ship_flg();
				}

				for (ShipInst_Chk01_DtlR up1R : _sloStsL.subList(dtlIdx, up0R.hdr_dtl_peg())) {
					if (MAC_TRD_PTN_TYP.isSLS(up1R.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(up1R.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isXFR(up1R.trd_ptn_typ())) {
						SloSts_DtlR slostsR = SloSts_DtlR.create();
						ShipSchd_Chk01_DtlR prR = getUp2R(up1R);

						if (MAC_TRD_PTN_TYP.isSLS(up1R.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(up1R.trd_ptn_typ())) {
							slostsR.slo_d_no(prR.sp().slo_d_no());
							slostsR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_INST.value());

							// 承認用に取っておく
							bindL.add(slostsR);
						}
						else if (MAC_TRD_PTN_TYP.isXFR(up1R.trd_ptn_typ())) {
							MST_XFR_SCHD_R xfrR = xfrAllL.getFirst(xfrAllIdx, prR.sp().xfr_schd_no());
							if (isNull(xfrR) || isNull(xfrR.slo_d_no()) || xfrR.rqst_can_flg()) {
								continue;
							}
							slostsR.slo_d_no(xfrR.slo_d_no());
							slostsR.slo_sts_typ(MSC_SLO_STS_TYP.PLNT_SHIP_INST.value());
						}
						slostsR.unit_cd(up1R.alloc_ent_unit_cd());
						slostsR.qty(up1R.alloc_ent_unit_qty());
						slostsR.ship_lg_grp_cd(up0R.ship_fr_lg_grp_cd());

						if (iv_ship_flg) {
							MST_IV_MAP_R mapR = mapAllL.getFirst(mapAllIdx, prR.getStringNE("ship_schd_no"));
							if (MAC_SHIP_INST_TYP.isNO_PICK(prR.sp().ship_inst_typ())) {
								slostsR.iv_no(isNull(mapR) ? null : mapR.getStringNE("iv_no"));
								slostsR.iv_d_no(isNull(mapR) ? null : mapR.iv_d_no());
							}
							else {
								slostsR.iv_no(up0R.iv_no());
								slostsR.iv_d_no(mapR.iv_d_no());
							}
							slostsR.dlv_slip_no(null);
							slostsR.dlv_slip_d_no(null);
						}
						else {
							slostsR.iv_no(null);
							slostsR.iv_d_no(null);
							slostsR.dlv_slip_no(up1R.dlv_slip_no());
							slostsR.dlv_slip_d_no(up1R.dlv_slip_d_no());
						}
						slostsR.biz_tm(up0R.ship_inst_tm());
						slostsR.ship_inst_no(up1R.ship_inst_no());
						
						MCList<MST_IV_SHIP_INST_MAP_R> subIvShipInstMapL = ivShipInstMapL.subList(ivShipInstMapIdxKey, up1R.ship_alloc_sts_no(), true);
						if (!subIvShipInstMapL.isEmpty()) {
							
							MAVM_ITM_UNIT_R unitR = getItmUnit(up1R.itm_cd(), up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3(), up1R.alloc_ent_unit_cd());
							MCNumber ivQtySum = subIvShipInstMapL.sum(MST_IV_SHIP_INST_MAP_R.$base_unit_qty);
							
							if (up1R.alloc_base_unit_qty().gt(ivQtySum)) {
								slostsR.qty(rvrsBaseUnitConv(up1R.alloc_base_unit_qty().subtract(ivQtySum), unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ()));
								slostsL.add(slostsR);
							}
							for (MST_IV_SHIP_INST_MAP_R ivShipInstMapR : subIvShipInstMapL) {
								SloSts_DtlR  ivSlostsR = slostsR.clone();
								ivSlostsR.iv_no(ivShipInstMapR.getStringNE(MST_IV_R.$iv_no));
								ivSlostsR.iv_d_no(ivShipInstMapR.iv_d_no());
								ivSlostsR.dlv_slip_no(null);
								ivSlostsR.dlv_slip_d_no(null);
								ivSlostsR.qty(rvrsBaseUnitConv(ivShipInstMapR.base_unit_qty(), unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ()));
								slostsL.add(ivSlostsR);
							}
						}
						else {
							slostsL.add(slostsR);
						}
					}
				}
			}
			if (!slostsL.isEmpty()) {
				o1.up0().setAll(slostsL.groupBy(groupByForSloSts()));
				o1.exec();
			}
			
			// 承認
			MST_SLO_R sloL_t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(sloL_t);
			MST_SLO_D_R d = MST_SLO_D_R.create("D");
			sloL_bldr.setSelect(sloL_t.aprv_no);
			sloL_bldr.addInnerJoin(d, bracket(sloL_t.slo_no.eq(d.slo_no)));
			sloL_bldr.addWhereWithAnd(d.slo_d_no.eq(bind("slo_d_no")));
			sloL_bldr.addWhereWithAnd(sloL_t.aprv_flg.eq(value(true)));
			dbSelect("MSBEL5530_MST_SLO_S03", sloL, sloL_bldr, bindL);
			
			if (!sloL.isEmpty()) {
				sloL.setAll(sloL.groupBy(MST_SLO_R.$aprv_no));
				MBBAL_AprvService.Aprv_Upd02 o2 = MBBAL_AprvService.crtAprv_Upd02();
				for (MST_SLO_R sloR : sloL) {
					Aprv_Chk02_Rslt1R r = Aprv_Chk02_Rslt1R.create();
					r.aprv_no(sloR.aprv_no());
					o2.up0().add(r);
				}
				o2.exec();
			}
			// 与信更新
			updCred();
		}
		/**
		 * 与信更新
		 */
		protected void updCred() {
			_credL.init();

			// 与信更新対象を取得
			MCList<MST_DLV_SLIP_D_R> tgtL = getCredTgtL(up0());

			for (MST_DLV_SLIP_D_R tgtR : tgtL) {
				// 与信更新対象を取得
				Cred_Upd01_CndR credR = _credL.get(tgtR.getString("cst_cd"), tgtR.getString("trd_cur_cd"));

				MCNumber sloAmt, sloTaxAmt;
				if (tgtR.getBooleanNE(MAM_BP_R.$cst_iv_flg)) {
					// インボイス取引の場合、過剰出荷指図した場合のみ与信を更新する。
					MCNumber shipInstQty = nvl(tgtR.getNumberNE("ship_inst_qty"), MCNumber.ZERO);
					MCNumber shipSchdQty = nvl(tgtR.getNumber("ship_schd_qty"), MCNumber.ZERO);
					
					MCNumber credQty = shipInstQty.subtract(shipSchdQty);
					if (credQty.isPositive()) {
						int scale = tgtR.getMeta(MST_DLV_SLIP_D_R.$trd_cur_amt).scale();
						MCNumber d = credQty.divide(tgtR.slo_qty(), scale, MCNumber.MODE_DOWN);

						int decPlace = tgtR.getNumber("amt_dec_place").intValue();
						MCNumber amt = tgtR.getNumber("slo_trd_cur_amt").multiply(d).setScale(
								decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_amt_rnd_typ")));
						MCNumber taxAmt = tgtR.getNumber("slo_trd_cur_tax_amt").multiply(d).setScale(
								decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_tax_rnd_typ")));
						
						credR.amt(credR.amt().add(amt.add(taxAmt)));
					}
				}
				else {
					if (tgtR.getNumber("ship_schd_qty").eq(tgtR.slo_qty())) {
						sloAmt = tgtR.getNumber("slo_trd_cur_amt");
						sloTaxAmt = tgtR.getNumber("slo_trd_cur_tax_amt");
					}
					else {
						// 受注数に対する予定数(＋打切数)の割合から金額を求める。小数部有効桁数は金額に合わせる
						int scale = tgtR.getMeta(MST_DLV_SLIP_D_R.$trd_cur_amt).scale();
						MCNumber n = tgtR.getNumber("ship_schd_qty").add(tgtR.getNumber("abort_qty"));
						MCNumber d = n.divide(tgtR.slo_qty(), scale, MCNumber.MODE_DOWN);

						int decPlace = tgtR.getNumber("amt_dec_place").intValue();
						sloAmt = tgtR.getNumber("slo_trd_cur_amt").multiply(d).setScale(
								decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_amt_rnd_typ")));
						sloTaxAmt = tgtR.getNumber("slo_trd_cur_tax_amt").multiply(d).setScale(
								decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_tax_rnd_typ")));
					}
					MCNumber
						amt = tgtR.trd_cur_amt().subtract(sloAmt),
						taxAmt = tgtR.trd_cur_tax_amt().subtract(sloTaxAmt);
					credR.amt(credR.amt().add(amt.add(taxAmt)));
				}
			}

			// 与信更新サービス
			callCredUpd();
		}
		/**
		 * 出荷指図ＩＦ送信
		 */
		protected void sendShipInstIf() {
			MCList<ShipInst_Chk01_DtlR> sendL = MCList.create(ShipInst_Chk01_DtlR.class);
			for (ShipInst_Chk01_DtlR r : up1()) {
				if (r.wms_flg()) {
					r = r.clone();
					r.ship_alloc_sts_no(r.getStringNE(_org_ship_alloc_sts_no));
					sendL.add(r);
				}
			}
			callShipInstSendIf(sendL);
		}
		
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void callRevDataIns01() {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (ShipInst_Chk01_HdrR hdrR : up0()) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(hdrR.ship_inst_no());
				opeR.rev_no(MCNumber.ONE);
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_INST.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
	}

	/**
	 * ShipInst_Upd01オペレーション.<p>
	 *
	 * 出荷指図NOの単位で出荷指図を訂正する。<br>
	 */
	public class ShipInst_Upd01 extends MSBEL_ShipInstService_MC_A.ShipInst_Upd01 {
		protected MCList<ShipSchd_Chk01_DtlR> _up2L = MCList.create(ShipSchd_Chk01_DtlR.class);
		protected MCList<MST_SHIP_INST_D_R> _instdL = MCList.create(MST_SHIP_INST_D_R.class);

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 前処理
			preProc_Upd(up0(), up1(), _up2L, _instdL);
			// 与信更新
			updCred(true);

			// 出荷指図更新
			updShipInst();

			// 出荷引当状況取得
			getShipAllocSts(up1());
			
			callIvRegSrv(up1());
			
			// 納品伝票出力
			prntDlvSlip(up0(), up2());
			
			setUp1();
			
			// 取引パタン別データ更新
			procByTrnPtn();	
			sendShipInstIf();
			
			// 「改訂履歴データ更新リスト」テーブルにデータを登録
			preCallRevDataIns01();
			
			setDown();
		}

		/**
		 * 出荷進捗ＮＯ・出荷予定ＮＯ取得用
		 */
		protected ShipSchd_Chk01_DtlR getUp2R(ShipInst_Chk01_DtlR up1R) {
			ShipSchd_Chk01_DtlR up2R = _up2L.getFirst(ShipSchd_Chk01_DtlR.$tmp_inst_d_no, up1R.tmp_inst_d_no());
			return up2R;
		}

		/**
		 * 出荷指図更新
		 */
		protected void updShipInst() {
			// 出荷指図データベース更新
			updMST_SHIP_INST();
			// 出荷予定更新
			updShipSchd();
			// 出荷引当状況(表示順)更新
			updShipAllocSts();
		}

		/**
		 * 出荷指図データベース更新
		 */
		protected void updMST_SHIP_INST() {
			MCList<MST_SHIP_INST_D_R> dtlL = MCList.create(MST_SHIP_INST_D_R.class);
			MCList<MST_SHIP_INST_D_R> abtL = MCList.create(MST_SHIP_INST_D_R.class);
			MCList<MST_SHIP_INST_D_R> delL = MCList.create(MST_SHIP_INST_D_R.class);
			
			// ヘッダ
			for (ShipInst_Chk01_HdrR up0R : up0()) {
				MST_SHIP_INST_R hdrR = MST_SHIP_INST_R.create();
				MST_SHIP_INST_R hdrR_t = MST_SHIP_INST_R.create("T");
				MCQueryApiBuilder hdrR_bldr = MCQueryApiBuilder.create(hdrR_t);
				copy(hdrR, up0R, createMap_MST_SHIP_INST_R_ShipInst_Chk01_HdrR());

				hdrR_bldr.setSet(hdrR_t.ship_schd_tm, hdrR_t.dlv_schd_tm,
						hdrR_t.inst_dpt_cd, hdrR_t.inst_usr_cd, hdrR_t.ship_inst_tm,
						hdrR_t.intr_rmrks, hdrR_t.inst_rmrks, hdrR_t.sub_char1,
						hdrR_t.sub_char2, hdrR_t.sub_char3);
				hdrR_bldr.addSetVL(hdrR_t.ship_inst_rev, hdrR_t.ship_inst_rev.add(value(1)));
				if (up0R.ship_prnt_flg()) {
					hdrR_bldr.addSet(hdrR_t.ship_inst_prnt_flg, hdrR_t.ship_inst_prnt_tm);
				} else {
					hdrR_bldr.addSet(hdrR_t.ship_inst_prnt_flg);
				}
				if (up0R.pck_prnt_flg()) {
					hdrR_bldr.addSet(hdrR_t.pick_prnt_flg, hdrR_t.pick_prnt_tm);
				} else {
					hdrR_bldr.addSet(hdrR_t.pick_prnt_flg);
				}
				
				dbUpdateKey("MSBEL5530_MST_SHIP_INST_U01", hdrR, hdrR_bldr);
			}

			// 明細
			MCList<ShipInst_Chk01_DtlR>[] gL = up1().groupList(ShipInst_Chk01_DtlR.$ship_inst_d_no);
			for (MCList<ShipInst_Chk01_DtlR> up1L_sub : gL) {
				if (up1L_sub.equals(
						up1L_sub.subList(ShipInst_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value()))) {
					// 同一出荷指図明細ＮＯすべて削除の場合
					MST_SHIP_INST_D_R delR = MST_SHIP_INST_D_R.create();
					delR.ship_inst_d_no(up1L_sub.get(0).ship_inst_d_no());
					delR.can_flg(true);
					delL.add(delR);
				}
				else {
					// それ以外
					MST_SHIP_INST_D_R dtlR = MST_SHIP_INST_D_R.create();
					ShipInst_Chk01_DtlR repR = ShipInst_Chk01_DtlR.create();

					MCNumber base_unit_qty = MCNumber.ZERO;
					for (ShipInst_Chk01_DtlR up1R : up1L_sub) {
						if (MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ())) {
							// 何もしない
						}
						else {
							repR = up1R;
							base_unit_qty = base_unit_qty.add(up1R.alloc_base_unit_qty());
						}
					}
					copy(dtlR, repR, createMap_MST_SHIP_INST_D_R_ShipInst_Chk01_DtlR());

					// 取引単位数量にも基準単位を入れる
					dtlR.base_unit_qty(base_unit_qty);
					dtlR.trd_unit_qty(base_unit_qty);
					dtlR.trd_unit_cd(dtlR.base_unit_cd());
					// 固定値
					if (repR.abort_flg()) {
						dtlR.abort_flg(true);
						abtL.add(dtlR);
					}
					else {
						dtlR.abort_qty(MCNumber.ZERO);
						dtlR.abort_flg(false);
						dtlL.add(dtlR);
					}
				}
			}

			MCList<MST_SHIP_INST_D_R> tmpL = MCList.create(MST_SHIP_INST_D_R.class);
			tmpL.addAll(dtlL);
			tmpL.addAll(abtL);
			setDispSeq(tmpL);
			
			
			if (!dtlL.isEmpty()) {
				MST_SHIP_INST_D_R dtlL_t = MST_SHIP_INST_D_R.create("T");
				MCQueryApiBuilder dtlL_bldr = MCQueryApiBuilder.create(dtlL_t);
				dtlL_bldr.setSet(dtlL_t.disp_seq, dtlL_t.trd_unit_cd, dtlL_t.trd_unit_qty,
						dtlL_t.base_unit_cd, dtlL_t.base_unit_qty, dtlL_t.abort_qty,
						dtlL_t.base_dlv_slip_no, dtlL_t.base_prov_act_no, dtlL_t.base_ac_dt,
						dtlL_t.abort_flg, dtlL_t.trd_rmrks, dtlL_t.trd_d_rmrks,
						dtlL_t.intr_d_rmrks, dtlL_t.inst_d_rmrks, dtlL_t.sub_char1,
						dtlL_t.sub_char2, dtlL_t.sub_char3);
				dbUpdateKey("MSBEL5530_MST_SHIP_INST_D_U01", dtlL, dtlL_bldr);
			}
			if (!abtL.isEmpty()) {
				MST_SHIP_INST_D_R abtL_t = MST_SHIP_INST_D_R.create("T");
				MCQueryApiBuilder abtL_bldr = MCQueryApiBuilder.create(abtL_t);
				abtL_bldr.setSet(abtL_t.disp_seq, abtL_t.abort_flg, abtL_t.intr_d_rmrks,
						abtL_t.inst_d_rmrks, abtL_t.sub_char1, abtL_t.sub_char2,
						abtL_t.sub_char3);
				abtL_bldr.addSetVL(abtL_t.abort_qty,
						abtL_t.base_unit_qty.subtract(abtL_t.ship_act_qty));
				dbUpdateKey("MSBEL5530_MST_SHIP_INST_D_U02", abtL, abtL_bldr);
			}
			if (!delL.isEmpty()) {
				MST_SHIP_INST_D_R delL_t = MST_SHIP_INST_D_R.create("T");
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(delL_t);
				delL_bldr.setSet(delL_t.can_flg);
				dbUpdateKey("MSBEL5530_MST_SHIP_INST_D_U03", delL, delL_bldr);
			}
		}

		/**
		 * 出荷予定更新
		 */
		protected void updShipSchd() {
			MSBEL_ShipSchdService.ShipSchd_Upd02 o = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			// up0
			o.up0().lot_chk_flg(true);

			// up1
			o.up1().setAll(setCnd_ShipSchd_ShipSchd_DtlR_Upd(up0(), up1(), _up2L));
			setAllocRslt_uninst(up0(), up1(), _up2L);

			// up2
			o.up2().setAll(setCnd_ShipSchd_Alloc_RsltR(up1(), o.up1()));
			if (!_notInstL.isEmpty()) {
				o.up2().addAll(setCnd_ShipSchd_Alloc_RsltR(_notInstL, o.up1()));
			}
			
			// up3
			up1().subList(r1 -> MAC_DATA_CRUD_TYP.isDEL(r1.data_crud_typ()))
				.forEach(r2 -> {
					o.up3().add().ship_alloc_sts_no(r2.getStringNE(_org_ship_alloc_sts_no));
				});

			o.exec();
			if (!_notInstL.isEmpty()) {
				callIvRegServiceUpd05(o, up1(), _notInstL, _orgStsL);
			}
		}

		/**
		 * 出荷引当状況(表示順)更新
		 */
		protected void updShipAllocSts() {
			// 出荷引当状況の表示順は出荷予定SVで設定しているが
			// 出荷指図更新時、かつ更新対象外の行は出荷予定SVに渡らないため更新されないので独自に更新する

			MCList<MST_SHIP_ALLOC_STS_R> stsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder stsL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_INST_D_R t1 = MST_SHIP_INST_D_R.create("T1");
			stsL_bldr.setSelect(t.ship_alloc_sts_no, t.disp_seq,
					t1.disp_seq.as("d_disp_seq"));
			stsL_bldr.addInnerJoin(t1, bracket(t1.ship_inst_d_no.eq(t.ship_inst_d_no)
					.and(t1.can_flg.eq(value(false)))));
			stsL_bldr.setWhere(t.ship_inst_d_no.eq(bind("ship_inst_d_no")));
			stsL_bldr.setOrderByAsc(t1.disp_seq, t.disp_seq);
			dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_S02", stsL, stsL_bldr,
					up1().groupBy(ShipInst_Chk01_DtlR.$ship_inst_d_no));

			int seq = 1;
			for (MST_SHIP_ALLOC_STS_R stsR : stsL) {
				stsR.disp_seq(seq++);
			}
			stsL_bldr.setSet(t.disp_seq);
			dbUpdateKey("MSBEL5530_MST_SHIP_ALLOC_STS_U01", stsL, stsL_bldr);
		}

		MCList<ShipInst_Chk01_DtlR> _sloStsL = createShipInst_Chk01_DtlL();
		
		/**
		 * 電文設定
		 */
		protected void setUp1() {
			MCIndexKey stsIdx = _stsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_inst_d_no);
			MCList<ShipInst_Chk01_DtlR>[] gL = up1().groupList(ShipInst_Chk01_DtlR.$ship_inst_d_no);
			for (MCList<ShipInst_Chk01_DtlR> l : gL) {
				MCList<MST_SHIP_ALLOC_STS_R> sl = _stsL.subList(stsIdx, l.get(0).ship_inst_d_no());
				if (sl.isEmpty()) {
					_sloStsL.add(l.get(0).clone());
				}
				for (int i = 0 ; i < sl.size() ; i++) {
					ShipInst_Chk01_DtlR r;
					if (i > l.size() -1) {
						r = l.get(0).clone();
						l.add(r);
					}
					else {
						r = l.get(i);
					}
					MST_SHIP_ALLOC_STS_R sr = sl.get(i);
					
					copy(r, sr, createMap_ShipInst_Chk01_DtlR_MST_SHIP_ALLOC_STS_R());
					
					_sloStsL.add(r);
				}
			}
		}

		/**
		 * 取引パタン別データ更新
		 */
		protected void procByTrnPtn() {
			// 売上
			procForSales();
		}

		/**
		 * 取引パタン：売上の処理
		 */
		protected void procForSales() {
			// インボイス
			MCList<MST_IV_R> ivAllL = MCList.create(MST_IV_R.class);
			MST_IV_R ivAllL_t = MST_IV_R.create("T");
			MCQueryApiBuilder ivAllL_bldr = MCQueryApiBuilder.create(ivAllL_t);
			ivAllL_bldr.addWhereWithAnd(ivAllL_t.iv_no.eq(bind("iv_no")));
			dbSelect("MSBEL5530_MST_IV_S03", ivAllL, ivAllL_bldr, up0());
			MCIndexKey ivAllIdx = ivAllL.createIndex("iv_no");

			MCList<MST_IV_MAP_R> mapAllL = MCList.create(MST_IV_MAP_R.class);
			MST_IV_MAP_R mapAllL_t = MST_IV_MAP_R.create("T");
			MCQueryApiBuilder mapAllL_bldr = MCQueryApiBuilder.create(mapAllL_t);
			MST_IV_D_R t2 = MST_IV_D_R.create("T2");
			MST_IV_R t3 = MST_IV_R.create("T3");
			mapAllL_bldr.addSelect(t3.iv_no);
			mapAllL_bldr.addLeftOuterJoin(t2,
					bracket(t2.iv_d_no.eq(mapAllL_t.iv_d_no)));
			mapAllL_bldr.addLeftOuterJoin(t3,
					bracket(t3.iv_mng_no.eq(t2.iv_mng_no)));
			mapAllL_bldr.addWhereWithAnd(mapAllL_t.ship_schd_no.eq(bind("ship_schd_no")));
			dbSelect("MSBEL5530_MST_IV_MAP_S03", mapAllL, mapAllL_bldr, _up2L);
			MCIndexKey mapAllIdx = mapAllL.createIndex("ship_schd_no");
			MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = getIvShipInstMap(up0());
			MCIndexKey ivShipInstMapIdxKey = ivShipInstMapL.createIndex(MST_IV_SHIP_INST_MAP_R.$ship_alloc_sts_no, MST_IV_SHIP_INST_MAP_R.$ship_inst_fix_flg);

			// 移動・移送予定
			MCList<MST_XFR_SCHD_R> xfrAllL = MCList.create(MST_XFR_SCHD_R.class);
			MST_XFR_SCHD_R xfrAllL_t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder xfrAllL_bldr = MCQueryApiBuilder.create(xfrAllL_t);
			MST_SHIP_PR_R p = MST_SHIP_PR_R.create("P");
			xfrAllL.addStringColumn("ship_pr_no");
			xfrAllL_bldr.addSelect(p.ship_pr_no);
			xfrAllL_bldr.addInnerJoin(p, bracket(xfrAllL_t.xfr_schd_no.eq(p.xfr_schd_no)));
			xfrAllL_bldr.addWhereWithAnd(p.ship_pr_no.eq(bind("ship_pr_no")));
			dbSelect("MSBEL5530_MST_XFR_SCHD_S02", xfrAllL, xfrAllL_bldr, _up2L);
			MCIndexKey xfrAllIdx = xfrAllL.createIndex("xfr_schd_no");


			MSBBL_SloStsRegService.SloSts_Ins01 o1 = MSBBL_SloStsRegService.crtSloSts_Ins01();
			MCList<SloSts_DtlR> slostsL = MCList.create(SloSts_DtlR.class);
			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MCList<SloSts_DtlR> bindL = MCList.create(SloSts_DtlR.class);
			MCIndexKey instdIdx = _instdL.createIndex(MST_SHIP_INST_D_R.$ship_inst_d_no);

			MCIndexKey dtlIdx = _sloStsL.createIndex(ShipInst_Chk01_DtlR.$ship_inst_no);
			for (ShipInst_Chk01_HdrR up0R : up0()) {
				// インボイス
				boolean iv_ship_flg = false;
				MST_IV_R ivR = ivAllL.getFirst(ivAllIdx, up0R.iv_no());
				if (!isNull(ivR)) {
					iv_ship_flg = ivR.iv_ship_flg();
				}

				for (ShipInst_Chk01_DtlR up1R : _sloStsL.subList(dtlIdx, up0R.ship_inst_no())) {
					if (MAC_TRD_PTN_TYP.isSLS(up1R.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(up1R.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isXFR(up1R.trd_ptn_typ())) {
						SloSts_DtlR slostsR = SloSts_DtlR.create();
						ShipSchd_Chk01_DtlR prR = getUp2R(up1R);
						MST_SHIP_INST_D_R instR = _instdL.getFirst(instdIdx, up1R.ship_inst_d_no());

						if (MAC_TRD_PTN_TYP.isSLS(up1R.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(up1R.trd_ptn_typ())) {
							slostsR.slo_d_no(prR.sp().slo_d_no());
							if (up1R.abort_flg() && instR.ship_act_qty().isZero()) {
								slostsR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_INST_ABORT.value());
							}
							else if (!up1R.abort_flg() && instR.abort_flg() && instR.ship_act_qty().isZero()) {
								slostsR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_INST_ABORT_CAN.value());
							}
							else if (MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ())) {
								slostsR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_INST_CAN.value());
							}
							else {
								slostsR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_INST_UPD.value());
							}

							// 承認用に取っておく
							bindL.add(slostsR);
						}
						else if (MAC_TRD_PTN_TYP.isXFR(up1R.trd_ptn_typ())) {
							MST_XFR_SCHD_R xfrR = xfrAllL.getFirst(xfrAllIdx, prR.sp().xfr_schd_no());
							if (isNull(xfrR) || isNull(xfrR.slo_d_no()) || xfrR.rqst_can_flg()) {
								continue;
							}
							slostsR.slo_d_no(xfrR.slo_d_no());
							if (up1R.abort_flg() && instR.ship_act_qty().isZero()) {
								slostsR.slo_sts_typ(MSC_SLO_STS_TYP.PLNT_SHIP_INST_ABORT.value());
							}
							else if (!up1R.abort_flg() && instR.abort_flg() && instR.ship_act_qty().isZero()) {
								slostsR.slo_sts_typ(MSC_SLO_STS_TYP.PLNT_SHIP_INST_ABORT_CAN.value());
							}
							else if (MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ())) {
								slostsR.slo_sts_typ(MSC_SLO_STS_TYP.PLNT_SHIP_INST_CAN.value());
							}
							else {
								slostsR.slo_sts_typ(MSC_SLO_STS_TYP.PLNT_SHIP_INST_UPD.value());
							}
						}
						slostsR.unit_cd(up1R.alloc_ent_unit_cd());
						slostsR.qty(up1R.alloc_ent_unit_qty());
						slostsR.ship_lg_grp_cd(up0R.ship_fr_lg_grp_cd());

						if (iv_ship_flg) {
							MST_IV_MAP_R mapR = mapAllL.getFirst(mapAllIdx, prR.getStringNE("ship_schd_no"));
							if (MAC_SHIP_INST_TYP.isNO_PICK(prR.sp().ship_inst_typ())) {
								slostsR.iv_no(isNull(mapR) ? null : mapR.getStringNE("iv_no"));
								slostsR.iv_d_no(isNull(mapR) ? null : mapR.iv_d_no());
							}
							else {
								slostsR.iv_no(up0R.iv_no());
								slostsR.iv_d_no(mapR.iv_d_no());
							}
							slostsR.dlv_slip_no(null);
							slostsR.dlv_slip_d_no(null);
						}
						else {
							slostsR.iv_no(null);
							slostsR.iv_d_no(null);
							slostsR.dlv_slip_no(up1R.dlv_slip_no());
							slostsR.dlv_slip_d_no(up1R.dlv_slip_d_no());
						}
						slostsR.biz_tm(up0R.ship_inst_tm());
						slostsR.ship_inst_no(up1R.ship_inst_no());
						
						MCList<MST_IV_SHIP_INST_MAP_R> subIvShipInstMapL = ivShipInstMapL.subList(ivShipInstMapIdxKey, up1R.ship_alloc_sts_no(), true);
						if (!subIvShipInstMapL.isEmpty()) {
							
							MAVM_ITM_UNIT_R unitR = getItmUnit(up1R.itm_cd(), up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3(), up1R.alloc_ent_unit_cd());
							MCNumber ivQtySum = subIvShipInstMapL.sum(MST_IV_SHIP_INST_MAP_R.$base_unit_qty);
							
							if (up1R.alloc_base_unit_qty().gt(ivQtySum)) {
								slostsR.qty(rvrsBaseUnitConv(up1R.alloc_base_unit_qty().subtract(ivQtySum), unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ()));
								slostsL.add(slostsR);
							}
							for (MST_IV_SHIP_INST_MAP_R ivShipInstMapR : subIvShipInstMapL) {
								SloSts_DtlR  ivSlostsR = slostsR.clone();
								ivSlostsR.iv_no(ivShipInstMapR.getStringNE(MST_IV_R.$iv_no));
								ivSlostsR.iv_d_no(ivShipInstMapR.iv_d_no());
								ivSlostsR.dlv_slip_no(null);
								ivSlostsR.dlv_slip_d_no(null);
								ivSlostsR.qty(rvrsBaseUnitConv(ivShipInstMapR.base_unit_qty(), unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ()));
								slostsL.add(ivSlostsR);
							}
						}
						else {
							slostsL.add(slostsR);
						}
					}
				}
			}
			if (!slostsL.isEmpty()) {
				o1.up0().setAll(slostsL.groupBy(groupByForSloSts()));
				o1.exec();
			}

			// 承認
			MST_SLO_R sloL_t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(sloL_t);
			MST_SLO_D_R d = MST_SLO_D_R.create("D");
			sloL_bldr.setSelect(sloL_t.aprv_no, sloL_t.slo_no);
			sloL_bldr.addInnerJoin(d, bracket(sloL_t.slo_no.eq(d.slo_no)));
			sloL_bldr.addWhereWithAnd(d.slo_d_no.eq(bind("slo_d_no")));
			sloL_bldr.addWhereWithAnd(sloL_t.aprv_flg.eq(value(true)));
			dbSelect("MSBEL5530_MST_SLO_S04", sloL, sloL_bldr, bindL);

			if (!sloL.isEmpty()) {
				sloL.setAll(sloL.groupBy(MST_SLO_R.$aprv_no, MST_SLO_R.$slo_no));
				MBBAL_AprvService.Aprv_Upd03 o2 = MBBAL_AprvService.crtAprv_Upd03();
				for (MST_SLO_R sloR : sloL) {
					if (!isSloNextOper(sloR.slo_no())) {
						Aprv_Chk02_Rslt1R r = Aprv_Chk02_Rslt1R.create();
						r.aprv_no(sloR.aprv_no());
						o2.up0().add(r);
					}
				}
				if (!o2.up0().isEmpty()) {
					o2.exec();
				}
			}
			// 与信更新
			updCred(false);
		}
		/**
		 * 出荷指図ＩＦ送信
		 */
		protected void sendShipInstIf() {
			MCList<ShipInst_Chk01_DtlR> sendL = getSendIfL(up1(), _up2L);

			// 送信後訂正不可
			MCMessageList msgL = new MCMessageList();

			MCIndexKey idx = _orgStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
			MCList<ShipInst_Chk01_DtlR> chkL = MCList.create(ShipInst_Chk01_DtlR.class);
			for (ShipInst_Chk01_DtlR r : sendL) {
				MST_SHIP_ALLOC_STS_R stsR = _orgStsL.getFirst(idx, r.ship_alloc_sts_no());
				if (isNull(stsR) || !stsR.ship_act_qty().isPositive()) {
					chkL.add(r);
				}
			}
			msgL.addAll(chkSendIf(chkL));
			if (!msgL.isEmpty()) {
				// 更新は複数ヘッダを扱うことがないので1件目のメッセージのみ利用
				throw new MCAppException(msgL.get(0));
			}

			callShipInstSendIf(sendL);
		}
		/**
		 * 打切解除の出荷予定を退避するリスト
		 */
		protected Set<String> _abortL = new HashSet<>();

		/**
		 * 更新前の与信更新対象を退避するリスト
		 */
		protected Map<String, MST_DLV_SLIP_D_R> _updBfrL = new HashMap<>();

		/**
		 * 与信更新
		 */
		protected void updCred(boolean isUpdBfr) {

			if (isUpdBfr) {
				_credL.init();
				_abortL.clear();
				_updBfrL.clear();
			}

			// 与信更新対象を取得
			MCList<MST_DLV_SLIP_D_R> tgtL = getCredTgtL(up0());

			for (MST_DLV_SLIP_D_R tgtR : tgtL) {
				// 与信更新対象を取得
				Cred_Upd01_CndR credR = _credL.get(tgtR.getString("cst_cd"), tgtR.getString("trd_cur_cd"));

				MCNumber amt, taxAmt;
				if (tgtR.getNumber("ship_act_qty").isPositive()) {
					if (isUpdBfr) {
						_updBfrL.put(tgtR.getString("ship_schd_no"), tgtR);

						if (tgtR.getNumber("abort_qty").isPositive()) {
							// 打切 or 打切解除の出荷予定
							// 打切解除の場合、更新後だと打切数＝０となるので、ここで打切対象として退避しておく
							_abortL.add(tgtR.getString("ship_schd_no"));
						}
						// 更新前では何もしない
						continue;
					}
					else if (tgtR.getNumber("abort_qty").isPositive() || _abortL.contains(tgtR.getString("ship_schd_no"))) {
						// 打切は－、打切解除は＋
						int sign = tgtR.getNumber("abort_qty").isPositive() ? -1 : 1;
						MCNumber abortQty = tgtR.getNumber("ship_inst_qty").subtract(tgtR.getNumber("ship_act_qty"));
	
						// 指図数に対する打切数の割合に使用する小数部有効桁数は金額に合わせる
						int scale = tgtR.getMeta(MST_DLV_SLIP_D_R.$trd_cur_amt).scale();
						MCNumber d = abortQty.divide(tgtR.getNumber("ship_inst_qty"), scale, MCNumber.MODE_DOWN);

						if (tgtR.getNumber("abort_qty").isPositive()) {
							// 打切の場合は更新前の金額から計算する
							MST_DLV_SLIP_D_R bfrR = _updBfrL.get(tgtR.getString("ship_schd_no"));
							if (bfrR.getNumber("abort_qty").isPositive()) {
								// 打切⇒打切の更新は金額が変わらないので何もしない
								continue;
							}
							amt = bfrR.trd_cur_amt();
							taxAmt = bfrR.trd_cur_tax_amt();
						}
						else {
							// 打切解除の場合は更新後の金額から計算
							amt = tgtR.trd_cur_amt();
							taxAmt = tgtR.trd_cur_tax_amt();
						}

						int decPlace = tgtR.getNumber("amt_dec_place").intValue();
						amt = amt.multiply(d).setScale(decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_amt_rnd_typ")));
						taxAmt = taxAmt.multiply(d).setScale(decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_tax_rnd_typ")));
	
						amt = amt.multiply(sign);
						taxAmt = taxAmt.multiply(sign);

						credR.amt(credR.amt().add(amt.add(taxAmt)));
					}
				}
				else {
					if (tgtR.getBooleanNE(MAM_BP_R.$cst_iv_flg)) {
						// 訂正前は－、訂正後は＋
						int sign = isUpdBfr ? -1 : 1;
						
						// インボイス取引の場合、過剰出荷指図した場合のみ与信を更新する。
						MCNumber shipInstQty = nvl(tgtR.getNumberNE("ship_inst_qty"), MCNumber.ZERO);
						MCNumber shipSchdQty = nvl(tgtR.getNumber("ship_schd_qty"), MCNumber.ZERO);
						
						MCNumber credQty = shipInstQty.subtract(shipSchdQty);
						if (credQty.isPositive()) {
							int scale = tgtR.getMeta(MST_DLV_SLIP_D_R.$trd_cur_amt).scale();
							MCNumber d = credQty.multiply(sign).divide(tgtR.slo_qty(), scale, MCNumber.MODE_DOWN);

							int decPlace = tgtR.getNumber("amt_dec_place").intValue();
							amt = tgtR.getNumber("slo_trd_cur_amt").multiply(d).setScale(
									decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_amt_rnd_typ")));
							taxAmt = tgtR.getNumber("slo_trd_cur_tax_amt").multiply(d).setScale(
									decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_tax_rnd_typ")));
							
							credR.amt(credR.amt().add(amt.add(taxAmt)));
						}
					}
					else {
						// 訂正前は－、訂正後は＋
						int sign = isUpdBfr ? -1 : 1;
						amt = tgtR.trd_cur_amt().multiply(sign);
						taxAmt = tgtR.trd_cur_tax_amt().multiply(sign);

						MCNumber sloAmt, sloTaxAmt;
						if (tgtR.getNumber("ship_schd_qty").eq(tgtR.slo_qty())) {
							sloAmt = tgtR.getNumber("slo_trd_cur_amt");
							sloTaxAmt = tgtR.getNumber("slo_trd_cur_tax_amt");
						}
						else {
							// 受注数に対する予定数の割合から金額を求める。小数部有効桁数は金額に合わせる
							int scale = tgtR.getMeta(MST_DLV_SLIP_D_R.$trd_cur_amt).scale();
							MCNumber d = tgtR.getNumber("ship_schd_qty").divide(tgtR.slo_qty(), scale, MCNumber.MODE_DOWN);
		
							int decPlace = tgtR.getNumber("amt_dec_place").intValue();
							sloAmt = tgtR.getNumber("slo_trd_cur_amt").multiply(d).setScale(
									decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_amt_rnd_typ")));
							sloTaxAmt = tgtR.getNumber("slo_trd_cur_tax_amt").multiply(d).setScale(
									decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_tax_rnd_typ")));
						}

						// 受注金額分を加味する
						// 訂正前は＋、訂正後は－
						amt = amt.add(sloAmt.multiply(sign * -1));
						taxAmt = taxAmt.add(sloTaxAmt.multiply(sign * -1));

						credR.amt(credR.amt().add(amt.add(taxAmt)));
					}
				}
			}

			// 与信更新サービス
			if (!isUpdBfr) {
				callCredUpd();
			}
		}
		
		
		protected void preCallRevDataIns01() {
			MCList<MST_SHIP_INST_R> hdrL = MCList.create(MST_SHIP_INST_R.class);
			
			for (ShipInst_Chk01_HdrR up0R : up0()) {
				MST_SHIP_INST_R hdrR = MST_SHIP_INST_R.create();
				hdrR.ship_inst_no(up0R.ship_inst_no());
				hdrL.add(hdrR);
			}
			callRevDataIns01(hdrL);
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
	}
	
	/**
	 * ShipInst_Upd02オペレーション.<p>
	 *
	 * 出荷実績明細NO単位で打切および出荷実績数を更新する。<br>
	 */
	public class ShipInst_Upd02 extends MSBEL_ShipInstService_MC_A.ShipInst_Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 出荷指図更新
			updShipInst();
			
			callRevDataIns01ForUpd02(up0());
			
			setDown();
		}
		
		/**
		 * 出荷指図更新
		 */
		protected void updShipInst() {
			MCList<MST_SHIP_INST_D_R> abtL = MCList.create(MST_SHIP_INST_D_R.class);
			MCNumber ship_act_qty;
			
			// 出荷引当状況から出荷実績数量を求める
			MCList<MST_SHIP_ALLOC_STS_R> stsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R stsL_t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder stsL_bldr = MCQueryApiBuilder.create(stsL_t);
			stsL_bldr.addWhereWithAnd(stsL_t.ship_inst_d_no.eq(bind("ship_inst_d_no")));
			dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_S03", stsL, stsL_bldr, up0());
			
			MCGroupByPolicy gp = new MCGroupByPolicy(MST_SHIP_ALLOC_STS_R.$ship_inst_d_no);
			gp.sum(MST_SHIP_ALLOC_STS_R.$ship_act_qty);

			MCList<MST_SHIP_ALLOC_STS_R> sumL = stsL.groupBy(gp);

			for (ShipInst_Upd02_DtlR up0R : up0()) {
				// 出荷実績数量
				MST_SHIP_ALLOC_STS_R stsR = sumL.getFirst(MST_SHIP_ALLOC_STS_R.$ship_inst_d_no, up0R.ship_inst_d_no());
				if (isNull(stsR)) {
					ship_act_qty = MCNumber.ZERO;
				}
				else {
					ship_act_qty = stsR.ship_act_qty();
				}
				// 打切数量
				MST_SHIP_INST_D_R abtR = MST_SHIP_INST_D_R.create();
				abtR.ship_inst_d_no(up0R.ship_inst_d_no());
				abtR.ship_act_qty(ship_act_qty);
				abtR.abort_flg(up0R.abort_flg());
				abtL.add(abtR);
			}
			// 出荷指図データベース更新
			MST_SHIP_INST_D_R abtL_t = MST_SHIP_INST_D_R.create("T");
			MCQueryApiBuilder abtL_bldr = MCQueryApiBuilder.create(abtL_t);
			abtL_bldr.setSet(abtL_t.ship_act_qty, abtL_t.abort_flg);
			abtL_bldr.addSetVL(abtL_t.abort_qty, decode(bindEx("abort_flg"), value(true),
					abtL_t.base_unit_qty.subtract(bindEx("ship_act_qty")), value(0)));
			dbUpdateKey("MSBEL5530_MST_SHIP_INST_D_U04", abtL, abtL_bldr);
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * ShipInst_Del01オペレーション.<p>
	 *
	 * 出荷指図NOの単位で出荷指図を取消する。<br>
	 */
	public class ShipInst_Del01 extends MSBEL_ShipInstService_MC_A.ShipInst_Del01 {
		protected MCList<SloSts_DtlR> _slostsL = MCList.create(SloSts_DtlR.class);
		protected MCList<SloSts_DtlR> _bindL = MCList.create(SloSts_DtlR.class);
		protected MCList<MST_IV_SHIP_INST_MAP_R> _ivShipInstMapL = null;
		protected MCIndexKey _ivShipInstMapIdxKey = null;

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 取引パタン別データ更新前処理
			preprocByTrnPtn();
			// 与信更新
			updCred();
			// 納品伝票削除
			delDlvSlip();
			sendShipInstIf();
			// 出荷指図削除
			delShipInst();
			callIvRegSrv(up1());
			// 取引パタン別データ更新
			procByTrnPtn();
			// 「改訂履歴データ更新リスト」テーブルにデータを登録
			preCallRevDataIns01();
			
			setDown();
		}
		
		/**
		 * インボイス登録サービスを実行する。
		 */
		protected void callIvRegSrv(MCList<ShipInst_Chk03_DtlR> dtlL) {
			
			if (_ivShipInstMapL.isEmpty()) {
				return;
			}
			
			MSBEL_IvRegService.Iv_Upd02 ope = MSBEL_IvRegService.crtIv_Upd02();
			for (MST_IV_SHIP_INST_MAP_R mapR : _ivShipInstMapL.distinctNE(MST_IV_SHIP_INST_MAP_R.$ship_inst_d_no)) {
				Iv_Upd02_Ctrl2R upR = Iv_Upd02_Ctrl2R.create();
				upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				upR.ship_inst_d_no(mapR.ship_inst_d_no());
				ope.up1().add(upR);
			}
				
			if (!ope.up1().isEmpty()) {
				ope.up0().ship_inst_reg_flg(true);
				ope.exec();
			}
		}
		
		/**
		 * 出荷指図削除
		 */
		protected void delShipInst() {
			// 出荷指図データベース削除
			delMST_SHIP_INST();
			// 出荷予定更新
			updShipSchd();
		}

		/**
		 * 出荷指図データベース削除
		 */
		protected void delMST_SHIP_INST() {
			// ヘッダ
			MST_SHIP_INST_R S1 = MST_SHIP_INST_R.create();
			MCUpdate q1 = sql("MSBEL5530_MST_SHIP_INST_U02")
					.update(S1)
					.set(S1.can_flg).eq(value(true))
					.where(
						S1.ship_inst_no.eq(bind("ship_inst_no"))
					);
			q1.executeBatchUpdate(up0());
			// 明細
			MST_SHIP_INST_D_R S2 = MST_SHIP_INST_D_R.create();
			MCUpdate q2 = sql("MSBEL5530_MST_SHIP_INST_D_U05")
				.update(S2)
				.set(S2.can_flg).eq(value(true))
				.where(
					S2.ship_inst_no.eq(bind("ship_inst_no"))
				);
			q2.executeBatchUpdate(up0());
		}

		/**
		 * 出荷予定更新
		 */
		protected void updShipSchd() {
			MSBEL_ShipSchdService.ShipSchd_Upd02 o = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			// up0
			o.up0().lot_chk_flg(true);

			MST_SHIP_INST_D_R d = MST_SHIP_INST_D_R.create("D");
			// up1
			MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R schdL_t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(schdL_t);
			schdL_bldr.addInnerJoin(d, bracket(schdL_t.ship_inst_d_no.eq(d.ship_inst_d_no)));
			schdL_bldr.addWhereWithAnd(d.ship_inst_no.eq(bind("ship_inst_no")));
			dbSelect("MSBEL5530_MST_SHIP_SCHD_S01", schdL, schdL_bldr, up0());

			o.up1().setAll(setCnd_ShipSchd_ShipSchd_DtlR_Del(schdL));

			// up2
			MCList<MST_SHIP_ALLOC_STS_SV_R> stsL = MCList.create(MST_SHIP_ALLOC_STS_SV_R.class);
			MST_SHIP_ALLOC_STS_SV_R stsL_t = MST_SHIP_ALLOC_STS_SV_R.create("T");
			MCQueryApiBuilder stsL_bldr = MCQueryApiBuilder.create(stsL_t);
			MST_SHIP_SCHD_R s = MST_SHIP_SCHD_R.create("S");
			stsL_bldr.addInnerJoin(s, bracket(stsL_t.ship_schd_no.eq(s.ship_schd_no)));
			stsL_bldr.addInnerJoin(d, bracket(s.ship_inst_d_no.eq(d.ship_inst_d_no)));
			stsL_bldr.addWhereWithAnd(d.ship_inst_no.eq(bind("ship_inst_no")));
			stsL_bldr.addConstWhereWithAnd(stsL_t.ship_inst_no.isNotNull());
			dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_SV_S01", stsL, stsL_bldr, up0(), null);

			o.up2().setAll(setCnd_ShipSchd_Alloc_RsltR_Del(stsL, o.up1(), stsL_bldr));

			o.exec();
		}

		/**
		 * 納品伝票削除
		 */
		protected void delDlvSlip() {
			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Upd01();
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setDistinct();
			bldr.setSelect(t.ship_inst_no, t.dlv_slip_no);
			bldr.setWhere(t.ship_inst_no.eq(bind("ship_inst_no")));
			
			MCList<MST_SHIP_ALLOC_STS_R> rsltL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_S11", rsltL, bldr, up0());
			
			int pegNo = 0;
			MCIndexKey idx = up0().createIndex(ShipInst_Chk03_HdrR.$ship_inst_no);
			for (MST_SHIP_ALLOC_STS_R r : rsltL) {
				ShipInst_Chk03_HdrR up0R = up0().getFirst(idx, r.ship_inst_no());
				ShipRprt_Upd01_HdrR hdrR = o.up0().add();
				hdrR.hdr_peg_no(pegNo++);
				hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				hdrR.dlv_slip_prnt_flg(up0R.dlv_prnt_flg());
				hdrR.dlv_slip_no(r.dlv_slip_no());
				hdrR.setAttributes(up0R);
			}
			o.up2().bndl_prnt_flg(up2().bndl_prnt_flg());
			o.exec();
		}

		/**
		 * 取引パタン別データ更新前処理
		 */
		protected void preprocByTrnPtn() {
			// 売上
			preprocForSales();
		}

		/**
		 * 取引パタン別データ更新
		 */
		protected void procByTrnPtn() {
			// 売上
			procForSales();
		}

		/**
		 * 取引パタン：売上の前処理
		 */
		protected void preprocForSales() {
			
			// 指図ヘッダ
			MCList<MST_SHIP_INST_R> hdrL = MCList.create(MST_SHIP_INST_R.class);
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			dbSelectKey("MSBEL5530_MST_SHIP_INST_S01", hdrL, hdrL_bldr, up0());
			MCIndexKey hdrIdx = hdrL.createIndex(MST_SHIP_INST_R.$ship_inst_no);
			
			// 指図明細
			MCList<MST_SHIP_INST_D_R> dtlAllL = MCList.create(MST_SHIP_INST_D_R.class);
			MST_SHIP_INST_D_R dtlAllL_t = MST_SHIP_INST_D_R.create("T");
			MCQueryApiBuilder dtlAllL_bldr = MCQueryApiBuilder.create(dtlAllL_t);
			dtlAllL_bldr.setWhere(dtlAllL_t.ship_inst_no.eq(bind("ship_inst_no")));
			dbSelect("MSBEL5530_MST_SHIP_INST_D_S03", dtlAllL, dtlAllL_bldr, up0());
			MCIndexKey dtlAllIdx = dtlAllL.createIndex(MST_SHIP_INST_D_R.$ship_inst_no);

			MST_SHIP_INST_D_R d = MST_SHIP_INST_D_R.create("D");
			// 出荷進捗
			MCList<MST_SHIP_PR_R> prAllL = MCList.create(MST_SHIP_PR_R.class);
			MST_SHIP_PR_R prAllL_t = MST_SHIP_PR_R.create("T");
			MCQueryApiBuilder prAllL_bldr = MCQueryApiBuilder.create(prAllL_t);
			MST_SHIP_SCHD_R s1 = MST_SHIP_SCHD_R.create("S");
			prAllL.addStringColumn("ship_inst_no");
			prAllL_bldr.addSelect(d.ship_inst_d_no, s1.ship_schd_no, d.ship_inst_no);
			prAllL_bldr.addInnerJoin(s1, bracket(prAllL_t.ship_pr_no.eq(s1.ship_pr_no)));
			prAllL_bldr.addInnerJoin(d, bracket(s1.ship_inst_d_no.eq(d.ship_inst_d_no)));
			prAllL_bldr.addWhereWithAnd(d.ship_inst_no.eq(bind("ship_inst_no")));
			dbSelect("MSBEL5530_MST_SHIP_PR_S01", prAllL, prAllL_bldr, up0());
			MCIndexKey prAllIdx = prAllL.createIndex("ship_inst_no");
			
			// 出荷引当状況
			MCList<MST_SHIP_ALLOC_STS_R> stsAllL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R stsAllL_t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder stsAllL_bldr = MCQueryApiBuilder.create(stsAllL_t);
			stsAllL_bldr.addSelect(d.ship_inst_no);
			stsAllL_bldr.addInnerJoin(d, bracket(stsAllL_t.ship_inst_d_no.eq(d.ship_inst_d_no)));
			stsAllL_bldr.addWhereWithAnd(d.ship_inst_no.eq(bind("ship_inst_no")));
			dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_S04", stsAllL, stsAllL_bldr, up0());
			MCIndexKey stsAllIdx = stsAllL.createIndex("ship_inst_no");

			// 納品書明細
			MCList<MST_DLV_SLIP_D_R> dlvAllL = MCList.create(MST_DLV_SLIP_D_R.class);
			MST_DLV_SLIP_D_R dlvAllL_t = MST_DLV_SLIP_D_R.create("T");
			MCQueryApiBuilder dlvAllL_bldr = MCQueryApiBuilder.create(dlvAllL_t);
			MST_SHIP_ALLOC_STS_R s2 = MST_SHIP_ALLOC_STS_R.create("S");
			dlvAllL.addStringColumn("ship_inst_no");
			dlvAllL_bldr.addSelect(d.ship_inst_no);
			dlvAllL_bldr.addInnerJoin(s2, bracket(dlvAllL_t.dlv_slip_d_no.eq(s2.dlv_slip_d_no)));
			dlvAllL_bldr.addInnerJoin(d, bracket(s2.ship_inst_d_no.eq(d.ship_inst_d_no)));
			dlvAllL_bldr.addWhereWithAnd(d.ship_inst_no.eq(bind("ship_inst_no")));
			dbSelect("MSBEL5530_MST_DLV_SLIP_D_S01", dlvAllL, dlvAllL_bldr, up0());
			MCIndexKey dlvAllIdx = dlvAllL.createIndex("ship_inst_no");
			
			// インボイス
			MCList<MST_IV_R> ivAllL = MCList.create(MST_IV_R.class);
			MST_IV_R ivAllL_t = MST_IV_R.create("T");
			MCQueryApiBuilder ivAllL_bldr = MCQueryApiBuilder.create(ivAllL_t);
			ivAllL_bldr.addWhereWithAnd(ivAllL_t.iv_no.eq(bind("iv_no")));
			dbSelect("MSBEL5530_MST_IV_S04", ivAllL, ivAllL_bldr, hdrL);
			MCIndexKey ivAllIdx = ivAllL.createIndex("iv_no"); 

			MCList<MST_IV_MAP_R> mapAllL = MCList.create(MST_IV_MAP_R.class);
			MST_IV_MAP_R mapAllL_t = MST_IV_MAP_R.create("T");
			MCQueryApiBuilder mapAllL_bldr = MCQueryApiBuilder.create(mapAllL_t);
			MST_IV_D_R t2 = MST_IV_D_R.create("T2");
			MST_IV_R t3 = MST_IV_R.create("T3");
			mapAllL_bldr.addSelect(t3.iv_no);
			mapAllL_bldr.addLeftOuterJoin(t2,
					bracket(t2.iv_d_no.eq(mapAllL_t.iv_d_no)));
			mapAllL_bldr.addLeftOuterJoin(t3,
					bracket(t3.iv_mng_no.eq(t2.iv_mng_no)));
			mapAllL_bldr.addWhereWithAnd(mapAllL_t.ship_schd_no.eq(bind("ship_schd_no")));
			dbSelect("MSBEL5530_MST_IV_MAP_S04", mapAllL, mapAllL_bldr, prAllL);
			MCIndexKey mapAllIdx = mapAllL.createIndex("ship_schd_no");
			_ivShipInstMapL = getIvShipInstMap(up0());
			_ivShipInstMapIdxKey = _ivShipInstMapL.createIndex(MST_IV_SHIP_INST_MAP_R.$ship_alloc_sts_no, MST_IV_SHIP_INST_MAP_R.$ship_inst_fix_flg);

			// 移動・移送予定
			MCList<MST_XFR_SCHD_R> xfrAllL = MCList.create(MST_XFR_SCHD_R.class);
			MST_XFR_SCHD_R xfrAllL_t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder xfrAllL_bldr = MCQueryApiBuilder.create(xfrAllL_t);
			MST_SHIP_PR_R p = MST_SHIP_PR_R.create("P");
			xfrAllL.addStringColumn("ship_pr_no");
			xfrAllL_bldr.addSelect(p.ship_pr_no);
			xfrAllL_bldr.addInnerJoin(p, bracket(xfrAllL_t.xfr_schd_no.eq(p.xfr_schd_no)));
			xfrAllL_bldr.addWhereWithAnd(p.ship_pr_no.eq(bind("ship_pr_no")));
			dbSelect("MSBEL5530_MST_XFR_SCHD_S03", xfrAllL, xfrAllL_bldr, prAllL);
			MCIndexKey xfrAllIdx = xfrAllL.createIndex("xfr_schd_no");
			
			
			for (ShipInst_Chk03_HdrR up0R : up0()) {

				// 指図ヘッダ
				MST_SHIP_INST_R hdrR = MST_SHIP_INST_R.create();
				hdrR = hdrL.getFirst(hdrIdx, up0R.ship_inst_no());

				// 指図明細
				MCList<MST_SHIP_INST_D_R> dtlL = MCList.create(MST_SHIP_INST_D_R.class);
				dtlL = dtlAllL.subList(dtlAllIdx, up0R.ship_inst_no());

				// 出荷進捗
				MCList<MST_SHIP_PR_R> prL = MCList.create(MST_SHIP_PR_R.class);
				prL = prAllL.subList(prAllIdx, up0R.ship_inst_no());

				// 出荷引当状況
				MCList<MST_SHIP_ALLOC_STS_R> stsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
				stsL = stsAllL.subList(stsAllIdx, up0R.ship_inst_no());

				// 納品書明細
				MCList<MST_DLV_SLIP_D_R> dlvL = MCList.create(MST_DLV_SLIP_D_R.class);
				dlvL = dlvAllL.subList(dlvAllIdx, up0R.ship_inst_no());

				// インボイス
				boolean iv_ship_flg = false;
				MST_IV_R ivR = ivAllL.getFirst(ivAllIdx, hdrR.iv_no());
				if (!isNull(ivR)) {
					iv_ship_flg = ivR.iv_ship_flg();
				}

				for (MST_SHIP_ALLOC_STS_R stsR : stsL) {
					MST_SHIP_INST_D_R instR = dtlL.getFirst(MST_SHIP_INST_D_R.$ship_inst_d_no, stsR.ship_inst_d_no());
					if (MAC_TRD_PTN_TYP.isSLS(instR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(instR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isXFR(instR.trd_ptn_typ())) {
						SloSts_DtlR slostsR = SloSts_DtlR.create();
						MST_SHIP_PR_R prR = prL.getFirst("ship_inst_d_no", instR.ship_inst_d_no());

						if (MAC_TRD_PTN_TYP.isSLS(instR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(instR.trd_ptn_typ())) {
							slostsR.slo_d_no(prR.slo_d_no());
							slostsR.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_INST_CAN.value());

							// 承認用に取っておく
							_bindL.add(slostsR);
						}
						else if (MAC_TRD_PTN_TYP.isXFR(instR.trd_ptn_typ())) {
							MST_XFR_SCHD_R xfrR = xfrAllL.getFirst(xfrAllIdx, prR.xfr_schd_no());
							if (isNull(xfrR) || isNull(xfrR.slo_d_no()) || xfrR.rqst_can_flg()) {
								continue;
							}
							slostsR.slo_d_no(xfrR.slo_d_no());
							slostsR.slo_sts_typ(MSC_SLO_STS_TYP.PLNT_SHIP_INST_CAN.value());
						}

						slostsR.unit_cd(stsR.ent_unit_cd());
						slostsR.qty(stsR.ent_unit_qty());
						slostsR.ship_lg_grp_cd(hdrR.ship_fr_lg_grp_cd());

						if (iv_ship_flg) {
							MST_IV_MAP_R mapR = mapAllL.getFirst(mapAllIdx, prR.getStringNE("ship_schd_no"));
							if (MAC_SHIP_INST_TYP.isNO_PICK(prR.ship_inst_typ())) {
								slostsR.iv_no(isNull(mapR) ? null : mapR.getStringNE("iv_no"));
								slostsR.iv_d_no(isNull(mapR) ? null : mapR.iv_d_no());
							}
							else {
								slostsR.iv_no(hdrR.iv_no());
								slostsR.iv_d_no(mapR.iv_d_no());
							}
							slostsR.dlv_slip_no(null);
							slostsR.dlv_slip_d_no(null);
						}
						else {
							slostsR.iv_no(null);
							slostsR.iv_d_no(null);
							slostsR.dlv_slip_no(dlvL.getFirst(MST_DLV_SLIP_D_R.$dlv_slip_d_no, stsR.dlv_slip_d_no()).dlv_slip_no());
							slostsR.dlv_slip_d_no(stsR.dlv_slip_d_no());
						}
						slostsR.biz_tm(hdrR.ship_inst_tm());
						slostsR.ship_inst_no(instR.ship_inst_no());
						
						MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = _ivShipInstMapL.subList(_ivShipInstMapIdxKey, stsR.ship_alloc_sts_no(), true);
						if (!ivShipInstMapL.isEmpty()) {
							
							MAVM_ITM_UNIT_R unitR = getItmUnit(instR.itm_cd(), instR.itm_sub1(), instR.itm_sub2(), instR.itm_sub3(), stsR.ent_unit_cd());
							MCNumber ivQtySum = ivShipInstMapL.sum(MST_IV_SHIP_INST_MAP_R.$base_unit_qty);
							
							if (stsR.base_unit_qty().gt(ivQtySum)) {
								slostsR.qty(rvrsBaseUnitConv(stsR.base_unit_qty().subtract(ivQtySum), unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ()));
								_slostsL.add(slostsR);
							}
							for (MST_IV_SHIP_INST_MAP_R ivShipInstMapR : ivShipInstMapL) {
								SloSts_DtlR  ivSlostsR = slostsR.clone();
								ivSlostsR.iv_no(ivShipInstMapR.getStringNE(MST_IV_R.$iv_no));
								ivSlostsR.iv_d_no(ivShipInstMapR.iv_d_no());
								ivSlostsR.dlv_slip_no(null);
								ivSlostsR.dlv_slip_d_no(null);
								ivSlostsR.qty(rvrsBaseUnitConv(ivShipInstMapR.base_unit_qty(), unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ()));
								_slostsL.add(ivSlostsR);
							}
						}
						else {
							_slostsL.add(slostsR);
						}
					}
				}

			}
		}

		/**
		 * 取引パタン：売上の処理
		 */
		protected void procForSales() {
			MSBBL_SloStsRegService.SloSts_Ins01 o1 = MSBBL_SloStsRegService.crtSloSts_Ins01();
			if (!_slostsL.isEmpty()) {
				o1.up0().setAll(_slostsL.groupBy(groupByForSloSts()));
				o1.exec();
			}
			
			// 承認
			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MST_SLO_R t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(t);
			MST_SLO_D_R d = MST_SLO_D_R.create("D");
			sloL_bldr.setSelect(t.aprv_no);
			sloL_bldr.addSelect(t.slo_no);
			sloL_bldr.addInnerJoin(d, bracket(t.slo_no.eq(d.slo_no)));
			sloL_bldr.addWhereWithAnd(d.slo_d_no.eq(bind("slo_d_no")));
			sloL_bldr.addWhereWithAnd(t.aprv_flg.eq(value(true)));
			dbSelect("MSBEL5530_MST_SLO_S05", sloL, sloL_bldr, _bindL);
			
			if (!sloL.isEmpty()) {
				sloL.setAll(sloL.groupBy(MST_SLO_R.$aprv_no, MST_SLO_R.$slo_no));
				MBBAL_AprvService.Aprv_Upd03 o2 = MBBAL_AprvService.crtAprv_Upd03();
				for (MST_SLO_R sloR : sloL) {
					if (!isSloNextOper(sloR.slo_no())) {
						Aprv_Chk02_Rslt1R r = Aprv_Chk02_Rslt1R.create();
						r.aprv_no(sloR.aprv_no());
						o2.up0().add(r);
					}
				}
				if (!o2.up0().isEmpty()) {
					o2.exec();
				}
			}
		}
		/**
		 * 出荷指図ＩＦ送信
		 */
		protected void sendShipInstIf() {
			MCList<ShipInst_Chk01_DtlR> sendL = MCList.create(ShipInst_Chk01_DtlR.class);
			for (ShipInst_Chk03_DtlR r : up1()) {
				if (r.wms_flg()) {
					ShipInst_Chk01_DtlR sendR = sendL.add();
					sendR.ship_inst_no(r.ship_inst_no());
					sendR.ship_alloc_sts_no(r.ship_alloc_sts_no());
					sendR.wms_flg(r.wms_flg());
					sendR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
			if (!sendL.isEmpty()) {
				callShipInstSendIf(sendL);
			}
		}
		/**
		 * 与信更新
		 */
		protected void updCred() {
			_credL.init();

			// 与信更新対象を取得
			MCList<MST_DLV_SLIP_D_R> tgtL = getCredTgtL(up0());

			for (MST_DLV_SLIP_D_R tgtR : tgtL) {
				// 与信更新対象を取得
				Cred_Upd01_CndR credR = _credL.get(tgtR.getString("cst_cd"), tgtR.getString("trd_cur_cd"));

				MCNumber sloAmt, sloTaxAmt;
				if (tgtR.getBooleanNE(MAM_BP_R.$cst_iv_flg)) {
					// インボイス取引の場合、過剰出荷指図した場合のみ与信を更新する。
					MCNumber shipInstQty = nvl(tgtR.getNumberNE("ship_inst_qty"), MCNumber.ZERO);
					MCNumber shipSchdQty = nvl(tgtR.getNumber("ship_schd_qty"), MCNumber.ZERO);
					
					MCNumber credQty = shipInstQty.subtract(shipSchdQty);
					if (credQty.isPositive()) {
						int scale = tgtR.getMeta(MST_DLV_SLIP_D_R.$trd_cur_amt).scale();
						MCNumber d = credQty.multiply(-1).divide(tgtR.slo_qty(), scale, MCNumber.MODE_DOWN);

						int decPlace = tgtR.getNumber("amt_dec_place").intValue();
						MCNumber amt = tgtR.getNumber("slo_trd_cur_amt").multiply(d).setScale(
								decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_amt_rnd_typ")));
						MCNumber taxAmt = tgtR.getNumber("slo_trd_cur_tax_amt").multiply(d).setScale(
								decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_tax_rnd_typ")));
						
						credR.amt(credR.amt().add(amt.add(taxAmt)));
					}
				}
				else {
					if (tgtR.getNumber("ship_schd_qty").eq(tgtR.slo_qty())) {
						sloAmt = tgtR.getNumber("slo_trd_cur_amt");
						sloTaxAmt = tgtR.getNumber("slo_trd_cur_tax_amt");
					}
					else {
						// 受注数に対する予定数の割合から金額を求める。小数部有効桁数は金額に合わせる
						int scale = tgtR.getMeta(MST_DLV_SLIP_D_R.$trd_cur_amt).scale();
						MCNumber d = tgtR.getNumber("ship_schd_qty").divide(tgtR.slo_qty(), scale, MCNumber.MODE_DOWN);

						int decPlace = tgtR.getNumber("amt_dec_place").intValue();
						sloAmt = tgtR.getNumber("slo_trd_cur_amt").multiply(d).setScale(
								decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_amt_rnd_typ")));
						sloTaxAmt = tgtR.getNumber("slo_trd_cur_tax_amt").multiply(d).setScale(
								decPlace, MAC_RND_TYP.toMC(tgtR.getString("sls_tax_rnd_typ")));
					}
					MCNumber
						amt = sloAmt.subtract(tgtR.trd_cur_amt()),
						taxAmt = sloTaxAmt.subtract(tgtR.trd_cur_tax_amt());
					credR.amt(credR.amt().add(amt.add(taxAmt)));
				}
			}

			// 与信更新サービス
			callCredUpd();
		}
		
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void preCallRevDataIns01() {
			MCList<MST_SHIP_INST_R> hdrL = MCList.create(MST_SHIP_INST_R.class);
			
			for (ShipInst_Chk03_HdrR up0R : up0()) {
				MST_SHIP_INST_R hdrR = MST_SHIP_INST_R.create();
				hdrR.ship_inst_no(up0R.ship_inst_no());
				hdrL.add(hdrR);
			}
			callRevDataIns01(hdrL);
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * 一部指図を登録した場合、インボイス登録サービスを実行し、分割した出荷予定をインボイスマップに反映する。
	 * @param shipSchdUpd02Ope 出荷予定サービスの更新（出荷予定）オペレーション
	 * @param instDtlL 出荷指図明細リスト
	 * @param notInstL 未指図のリスト
	 * @param orgStsL 出荷引当状況リスト
	 */
	protected void callIvRegServiceUpd05(MSBEL_ShipSchdService.ShipSchd_Upd02 shipSchdUpd02Ope, MCList<ShipInst_Chk01_DtlR> instDtlL, MCList<ShipInst_Chk01_DtlR> notInstL, MCList<MST_SHIP_ALLOC_STS_R> orgStsL) {
		
		MSBEL_IvRegService.Iv_Upd05 ope = MSBEL_IvRegService.crtIv_Upd05();
		
		for (ShipInst_Chk01_DtlR dtlR : notInstL) {
			
			ope.up0().clear();
			ope.up1().clear();
			ShipSchd_DtlR shipSchdR = shipSchdUpd02Ope.up1().getFirst(ShipSchd_DtlR.$peg_no, dtlR.tmp_inst_d_no());
			if (isNull(shipSchdR) || isNull(shipSchdR.iv_schd_qty()) || !shipSchdR.iv_schd_qty().isPositive()) {
				continue;
			}
			
			ShipSchd_DtlR downShipSchdR = shipSchdUpd02Ope.down0().getFirst(ShipSchd_DtlR.$peg_no, dtlR.tmp_inst_d_no());
			MST_SHIP_ALLOC_STS_R orgStsR = orgStsL.getFirst(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no, dtlR.getStringNE(_org_ship_alloc_sts_no));
			if (!isNull(downShipSchdR) && !isNull(orgStsR)) {
				
				ShipSchd_DtlR orgShipSchdR = shipSchdUpd02Ope.up1().getFirst(ShipSchd_DtlR.$ship_schd_no, orgStsR.ship_schd_no());
				if(!isNull(orgShipSchdR)) {
					Iv_Upd05_Ctrl1R updR = Iv_Upd05_Ctrl1R.create();
					updR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					updR.ship_schd_no(orgShipSchdR.ship_schd_no());
					updR.base_unit_qty(orgShipSchdR.base_unit_qty());
					
					ope.up0().add(updR);
					
					Iv_Upd05_Ctrl1R splitR = Iv_Upd05_Ctrl1R.create();
					splitR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					splitR.ship_schd_no(downShipSchdR.ship_schd_no());
					splitR.base_unit_qty(shipSchdR.base_unit_qty());
					splitR.org_ship_schd_no(orgShipSchdR.ship_schd_no());
					
					ope.up0().add(splitR);
					
					MCList<ShipInst_Chk01_DtlR>  subL = instDtlL.subList(r-> (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()))
							&& isSame(r.sas().ship_schd_no(), orgShipSchdR.ship_schd_no()));
					
					for (MCList<ShipInst_Chk01_DtlR> ivInstDL : subL.groupList(ShipInst_Chk01_DtlR.$iv_d_no)) {
							
						ShipInst_Chk01_DtlR ivInstDR = ivInstDL.get(0);
						if (!isNull(ivInstDR.iv_d_no())) {
							Iv_Upd05_Ctrl2R ctrl2R = Iv_Upd05_Ctrl2R.create();
							ctrl2R.iv_d_no(ivInstDR.iv_d_no());
							ctrl2R.ship_schd_no(orgShipSchdR.ship_schd_no());
							ctrl2R.base_unit_qty(ivInstDL.sum(ShipInst_Chk01_DtlR.$base_unit_qty));
							ope.up1().add(ctrl2R);
						}
					}
				}
			}
				
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
	}
	
	/**
	 * ヘッダ明細紐付を使用してヘッダを取得する
	 */
	protected ShipInst_Chk01_HdrR getHdrR(MCList<ShipInst_Chk01_HdrR> up0L, MCNumber hdr_dtl_peg) {
		return up0L.getFirst(ShipInst_Chk01_HdrR.$hdr_dtl_peg, hdr_dtl_peg);
	}

	/**
	 * 前処理（Chk01、Ins01用）
	 */
	protected void preProc_Ins(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> up1L, MCList<ShipSchd_Chk01_DtlR> up2L) {
		// 変数初期化
		_notInstL.init();

		setShipNotMngLotNo(up1L);

		// 出荷進捗
		MCList<MST_SHIP_PR_R> shipPrL = getShipPr(up2L);
		MCIndexKey prIdx = shipPrL.createIndex(MST_SHIP_PR_R.$ship_pr_no);

		// 出荷予定
		MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
		MST_SHIP_SCHD_R shipSchdL_t = MST_SHIP_SCHD_R.create("T");
		MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(shipSchdL_t);
		MAM_ITM_R m1 = MAM_ITM_R.create("M1");
		shipSchdL.addStringColumn("hs_cd");
		shipSchdL_bldr.addSelect(m1.hs_cd);
		shipSchdL_bldr.addLeftOuterJoin(m1,
				bracket(m1.itm_cd.eq(shipSchdL_t.itm_cd)
						.and(m1.itm_sub1.eq(shipSchdL_t.itm_sub1))
						.and(m1.itm_sub2.eq(shipSchdL_t.itm_sub2))
						.and(m1.itm_sub3.eq(shipSchdL_t.itm_sub3))));
		dbSelectKey("MSBEL5530_MST_SHIP_SCHD_S02", shipSchdL, shipSchdL_bldr, up2L);
		MCIndexKey schdIdx = shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
		
		for (ShipSchd_Chk01_DtlR up2R : up2L) {
			MST_SHIP_PR_R spR = shipPrL.getFirst(prIdx, up2R.ship_pr_no());
			up2R.sp(spR);
			up2R.dlv_lg_grp_cd(spR.getString("dlv_lg_grp_cd"));
			up2R.dlv_cntry_cd(spR.getString("dlv_cntry_cd"));
			MST_SHIP_SCHD_R ssR = shipSchdL.getFirst(schdIdx, up2R.ship_schd_no());
			up2R.ss(ssR);
			up2R.hs_cd(ssR.getString("hs_cd"));
		}

		// 得意先
		MCList<MAM_BP_R> bpL = getBp(up2L);
		MCIndexKey bpIdx = bpL.createIndex(MAM_BP_R.$bp_cd);

		// インボイス取引
		MCList<MAM_LG_CTL_R> lgctlL = getLgCtl(up0L, up2L);
		MCIndexKey lgIdx = lgctlL.createIndex("ship_pr_no");

		for (ShipSchd_Chk01_DtlR up2R : up2L) {
			MAM_BP_R bpR = bpL.getFirst(bpIdx, up2R.cst_cd());
			boolean cst_iv_flg = false;
			if (!isNull(bpR)) {
				cst_iv_flg = bpR.cst_iv_flg();
			}
			up2R.cst_iv_flg(cst_iv_flg);

			// 支給返品はインボイス取引対象外
			MAM_LG_CTL_R lgR = lgctlL.getFirst(lgIdx, up2R.ship_pr_no());
			boolean iv_trd_flg = MAC_TRD_PTN_TYP.isPROV_RTN(up2R.sp().trd_ptn_typ()) || isNull(lgR) ? false : lgR.iv_trd_flg();
			up2R.iv_trd_flg(iv_trd_flg);
		}
		
		// 出荷引当状況
		_orgStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		MST_SHIP_ALLOC_STS_R orgStsL_t = MST_SHIP_ALLOC_STS_R.create("T");
		MCQueryApiBuilder orgStsL_bldr = MCQueryApiBuilder.create(orgStsL_t);
		orgStsL_bldr.setWhere(orgStsL_t.ship_schd_no.eq(bind("ship_schd_no")));
		dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_S05", _orgStsL, orgStsL_bldr, up2L);
		MCIndexKey
			up0Idx = up0L.createIndex(ShipInst_Chk01_HdrR.$hdr_dtl_peg),
			up2Idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no),
			stsIdx = _orgStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_schd_no);
		for (ShipInst_Chk01_DtlR up1R : up1L) {
			ShipInst_Chk01_HdrR up0R = up0L.getFirst(up0Idx, up1R.hdr_dtl_peg());
			up1R.ship_schd_tm(up0R.ship_schd_tm());	// 引当時の並び順に使用
			up1R.setDateNE("dlv_schd_tm", up0R.dlv_schd_tm());	// 引当時の並び順に使用
			// 変更前の出荷引当状況NOを退避（以降で上書きされることがあるため）
			up1R.setStringNE(_org_ship_alloc_sts_no, up1R.ship_alloc_sts_no());
			ShipSchd_Chk01_DtlR up2 = up2L.getFirst(up2Idx, up1R.tmp_inst_d_no());
			up1R.setStringNE(_tmp_dlv_id_typ, up2.sp().dlv_id_typ());
			up1R.setStringNE(_tmp_dlv_id_cd, up2.sp().dlv_id_cd());
		
			MST_SHIP_ALLOC_STS_R stsR = null;
			MCList<MST_SHIP_ALLOC_STS_R> stsL = null;
			for (ShipSchd_Chk01_DtlR up2R : up2L.subList(up2Idx, up1R.tmp_inst_d_no())) {
				stsL = _orgStsL.subList(stsIdx, up2R.ship_schd_no());
				stsL.sort("ship_alloc_sts_no");
				for (MST_SHIP_ALLOC_STS_R r : stsL) {
					if (stsR == null && r.alloc_flg() && !r.getBooleanNE("_used_flg")) {
						r.setBooleanNE("_used_flg", true);
						// 仮指図明細に紐付く引当状況は、引当済みを優先に設定する
						// （引当済みの仮指図明細を優先に引当するため）
						stsR = r;
					}
				}
			}
			if (stsR != null) {
				up1R.sas(stsR);
			}
			else if (!isNull(stsL)) {
				up1R.sas(stsL.get(0));
			}
			// 引当対象、まとめ、単票から指図(場所引当オフ)のいずれかの場合、引当は維持しない
			if (up1R.alloc_tgt_flg()
				|| up1R.inst_bndl_flg()
				|| !up0R.is_src_shipinst_list_flg()) {
				up1R.alloc_flg(false);
			}
		}
	}

	/**
	 * 前処理（Chk02、Upd01用）
	 */
	protected void preProc_Upd(MCList<ShipInst_Chk01_HdrR> up0L,
			MCList<ShipInst_Chk01_DtlR> up1L, MCList<ShipSchd_Chk01_DtlR> up2L,
			MCList<MST_SHIP_INST_D_R> instdL) {
		// 変数初期化
		_notInstL.init();

		// 仮ＮＯセット
		MCList<ShipInst_Chk01_DtlR> up1L_tmp = up1L.shallowClone();
		up1L_tmp.sort(ShipInst_Chk01_DtlR.$ship_inst_d_no, ShipInst_Chk01_DtlR.$disp_seq);
		int tmp_inst_d_no = 0;
		String ship_inst_d_no = null;
		for (ShipInst_Chk01_DtlR up1R : up1L_tmp) {
			if (isSame(up1R.ship_inst_d_no(), ship_inst_d_no)) {
				up1R.tmp_inst_d_no(tmp_inst_d_no);
			}
			else {
				up1R.tmp_inst_d_no(++tmp_inst_d_no);
			}
			ship_inst_d_no = up1R.ship_inst_d_no();
		}

		initItmCache(up1L_tmp);
		setShipNotMngLotNo(up1L_tmp);

		// 出荷予定
		MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
		MST_SHIP_SCHD_R shipSchdL_t = MST_SHIP_SCHD_R.create("T");
		MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(shipSchdL_t);
		MAM_ITM_R m1 = MAM_ITM_R.create("M1");
		shipSchdL.addStringColumn("hs_cd");
		shipSchdL_bldr.addSelect(m1.hs_cd);
		shipSchdL_bldr.addLeftOuterJoin(m1,
				bracket(m1.itm_cd.eq(shipSchdL_t.itm_cd)
						.and(m1.itm_sub1.eq(shipSchdL_t.itm_sub1))
						.and(m1.itm_sub2.eq(shipSchdL_t.itm_sub2))
						.and(m1.itm_sub3.eq(shipSchdL_t.itm_sub3))));
		shipSchdL_bldr.setWhere(shipSchdL_t.ship_inst_d_no.eq(bind("ship_inst_d_no")));
		shipSchdL_bldr.setOrderByAsc(shipSchdL_t.ship_pr_no, shipSchdL_t.ship_schd_no);
		dbSelect("MSBEL5530_MST_SHIP_SCHD_S03", shipSchdL, shipSchdL_bldr, up1L);
		MCIndexKey schdIdx = shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_inst_d_no);

		for (ShipInst_Chk01_DtlR up1R : up1L.groupBy(ShipInst_Chk01_DtlR.$tmp_inst_d_no, ShipInst_Chk01_DtlR.$ship_inst_d_no, ShipInst_Chk01_DtlR.$hdr_dtl_peg)) {
			MCList<MST_SHIP_SCHD_R> l = shipSchdL.subList(schdIdx, up1R.ship_inst_d_no());
			for (MST_SHIP_SCHD_R ssR : l) {
				ShipSchd_Chk01_DtlR up2R = ShipSchd_Chk01_DtlR.create();
				up2R.tmp_inst_d_no(up1R.tmp_inst_d_no());
				up2R.ss(ssR);
				up2R.hs_cd(ssR.getString("hs_cd"));
				up2R.ship_pr_no(ssR.ship_pr_no());
				up2R.hdr_dtl_peg(up1R.hdr_dtl_peg());
				up2L.add(up2R);
			}
		}

		// 出荷進捗
		MCList<MST_SHIP_PR_R> shipPrL = getShipPr(up2L);
		MCIndexKey prIdx = shipPrL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
		
		for (ShipSchd_Chk01_DtlR up2R : up2L) {
			MST_SHIP_PR_R spR = shipPrL.getFirst(prIdx, up2R.ship_pr_no());
			up2R.sp(spR);
			up2R.dlv_lg_grp_cd(spR.getString("dlv_lg_grp_cd"));
			up2R.dlv_cntry_cd(spR.getString("dlv_cntry_cd"));
		}
		
		// 指図明細
		MCQueryApiBuilder instdL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_D_R.create("T"));
		dbSelectKey("MSBEL5530_MST_SHIP_INST_D_S04", instdL, instdL_bldr, up1L);

		// 得意先
		MCList<MAM_BP_R> bpL = getBp(up2L);
		MCIndexKey bpIdx = bpL.createIndex(MAM_BP_R.$bp_cd);

		// インボイス取引
		MCList<MAM_LG_CTL_R> lgctlL = getLgCtl(up0L, up2L);
		MCIndexKey lgIdx = lgctlL.createIndex("ship_pr_no");

		for (ShipSchd_Chk01_DtlR up2R : up2L) {
			MAM_BP_R bpR = bpL.getFirst(bpIdx, up2R.cst_cd());
			boolean cst_iv_flg = false;
			if (!isNull(bpR)) {
				cst_iv_flg = bpR.cst_iv_flg();
			}
			up2R.cst_iv_flg(cst_iv_flg);

			// 支給返品はインボイス取引対象外
			MAM_LG_CTL_R lgR = lgctlL.getFirst(lgIdx, up2R.ship_pr_no());
			boolean iv_trd_flg = MAC_TRD_PTN_TYP.isPROV_RTN(up2R.sp().trd_ptn_typ()) || isNull(lgR) ? false : lgR.iv_trd_flg();
			up2R.iv_trd_flg(iv_trd_flg);
		}
		
		// 出荷引当状況
		_orgStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		MST_SHIP_ALLOC_STS_R orgStsL_t = MST_SHIP_ALLOC_STS_R.create("T");
		MCQueryApiBuilder orgStsL_bldr = MCQueryApiBuilder.create(orgStsL_t);
		orgStsL_bldr.setWhere(orgStsL_t.ship_inst_d_no.eq(bind("ship_inst_d_no")));
		dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_S06", _orgStsL, orgStsL_bldr, up1L);
		MCIndexKey
			up0Idx = up0L.createIndex(ShipInst_Chk01_HdrR.$hdr_dtl_peg),
			stsIdx = _orgStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_inst_d_no, MST_SHIP_ALLOC_STS_R.$alloc_flg);
		MCIndexKey up2Idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);
		for (ShipInst_Chk01_DtlR up1R : up1L) {
			ShipInst_Chk01_HdrR up0R = up0L.getFirst(up0Idx, up1R.hdr_dtl_peg());
			up1R.ship_schd_tm(up0R.ship_inst_tm());	// 引当時の並び順に使用
			up1R.setDateNE("dlv_schd_tm", up0R.dlv_schd_tm());	// 引当時の並び順に使用
			// 変更前の出荷引当状況NOを退避（以降で上書きされることがあるため）
			up1R.setStringNE(_org_ship_alloc_sts_no, up1R.ship_alloc_sts_no());
			ShipSchd_Chk01_DtlR up2 = up2L.getFirst(up2Idx, up1R.tmp_inst_d_no());
			up1R.setStringNE(_tmp_dlv_id_typ, up2.sp().dlv_id_typ());
			up1R.setStringNE(_tmp_dlv_id_cd, up2.sp().dlv_id_cd());

			MST_SHIP_ALLOC_STS_R stsR = _orgStsL.getFirst(stsIdx, up1R.ship_inst_d_no(), true);
			if (isNull(stsR)) {
				stsR = _orgStsL.getFirst(stsIdx, up1R.ship_inst_d_no(), false);
			}
			up1R.sas(stsR);	// 引当済みを優先して設定

			// 引当対象、まとめ、単票から指図(場所引当オフ)のいずれかの場合、引当は維持しない
			if (up1R.alloc_tgt_flg()
				|| up1R.inst_bndl_flg()
				|| !up0R.is_src_shipinst_list_flg()) {
				up1R.alloc_flg(false);
			}
		}
	}

	/**
	 * ロット・サブロット管理しない品目はＮＵＬＬ文字を設定する
	 */
	protected void setShipNotMngLotNo(MCList<ShipInst_Chk01_DtlR> up1L) {
		for (ShipInst_Chk01_DtlR up1R : up1L) {
			MAM_ITM_R itmR = getItmCache().get(up1R.itm_cd(), up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3());
			if (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
				up1R.lot_no(MAC_STR.NULL_VAL.value());
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
				up1R.sublot_no(MAC_STR.NULL_VAL.value());
			}
		}
	}
	protected MCList<MST_SHIP_PR_R> getShipPr(MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
		MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
		MCQueryApiBuilder shipPrL_bldr = MCQueryApiBuilder.create(t);
		MCList<MST_SHIP_PR_R> wkL = MCList.create(MST_SHIP_PR_R.class);
		for (ShipSchd_Chk01_DtlR up2R : up2L) {
			MST_SHIP_PR_R wkR = MST_SHIP_PR_R.create();
			wkR.ship_pr_no(up2R.ship_pr_no());
			wkL.add(wkR);
		}
		dbWkDelete("MSBEL5530_MSW_SHIP_PR_D03", shipPrL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5530_MSW_SHIP_PR_I03", wkL, shipPrL_bldr.getBaseDbc());
		
		MSW_SHIP_PR_KEY_R w = MSW_SHIP_PR_KEY_R.create("W");
		MST_SLO_D_R t1 = MST_SLO_D_R.create("T1");
		MST_SLO_R t2 = MST_SLO_R.create("T2");
		MSVM_DLV_ID_R t3 = MSVM_DLV_ID_R.create("T3");
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		shipPrL.addStringColumn("set_itm_grp_no");
		shipPrL.addStringColumn("assort_typ");
		shipPrL.addBooleanColumn("aprv_flg");
		shipPrL.addStringColumn("aprv_no");
		shipPrL.addStringColumn("dlv_lg_grp_cd");
		shipPrL.addStringColumn("dlv_cntry_cd");
		shipPrL_bldr.addSelect(t1.set_itm_grp_no, t2.assort_typ, t2.aprv_flg, t2.aprv_no);
		shipPrL_bldr.addSelect(t3.lg_grp_cd.as("dlv_lg_grp_cd"));
		shipPrL_bldr.addSelect(decode(t.dlv_id_typ, value(MSC_DLV_ID_TYP.LOC.value()),
				m1.cntry_cd, t3.cntry_cd).as("dlv_cntry_cd"));
		shipPrL_bldr.addInnerJoin(w, bracket(t.ship_pr_no.eq(w.ship_pr_no)));
		shipPrL_bldr.addLeftOuterJoin(t1, bracket(t.slo_d_no.eq(t1.slo_d_no)));
		shipPrL_bldr.addLeftOuterJoin(t2, bracket(t1.slo_no.eq(t2.slo_no)
				.and(t2.can_flg.eq(value(false)))));
		shipPrL_bldr.addLeftOuterJoin(t3, bracket(t.dlv_id_typ.eq(t3.dlv_id_typ)
				.and(t.dlv_id_cd.eq(t3.dlv_id_cd))));
		shipPrL_bldr.addLeftOuterJoin(m1, bracket(m1.loc_cd.eq(t.dlv_id_cd)));
		dbSelect("MSBEL5530_MST_SHIP_PR_S02", shipPrL, shipPrL_bldr);
		return shipPrL;
	}
	protected MCList<MST_SHIP_PR_R> getShipPr2(MCList<MST_SHIP_SCHD_R> bindL) {
		MCList<MST_SHIP_PR_R> dbc = MCList.create(MST_SHIP_PR_R.class);
		MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MSW_SHIP_PR_KEY_R w = MSW_SHIP_PR_KEY_R.create("W");
		dbWkDelete("MSBEL5530_MSW_SHIP_PR_D01", dbc_bldr.getBaseDbc());
		for (MST_SHIP_SCHD_R r : bindL) {
			MST_SHIP_PR_R shipPrR = MST_SHIP_PR_R.create();
			shipPrR.ship_pr_no(r.ship_pr_no());
			dbc.add(shipPrR);
		}
		
		dbWkInsert("MSBEL5530_MSW_SHIP_PR_I01", dbc, dbc_bldr.getBaseDbc());
		dbc_bldr.addInnerJoin(w, bracket(w.ship_pr_no.eq(t.ship_pr_no)));
		dbSelect("MSBEL5530_MST_SHIP_PR_S03", dbc, dbc_bldr);
		return dbc;
	}
	protected MCList<MAM_BP_R> getBp(MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCList<MCRow> bp_bindL = MCList.create(MCRow.class);
		for (ShipSchd_Chk01_DtlR up2R : up2L) {
			if (!isNull(up2R.cst_cd())) {
				MCRow bp_bindR = MCRow.create();
				bp_bindR.addStringColumn("bp_cd", up2R.cst_cd());
				bp_bindL.add(bp_bindR);
			}
		}
		
		// 得意先
		MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
		MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
		dbSelectKey("MSBEL5530_MAM_BP_S01", bpL, bpL_bldr, bp_bindL);
		return bpL;
	}
	protected MCList<MAM_LG_CTL_R> getLgCtl(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCList<MAM_LG_CTL_R> resltlL = MCList.create(MAM_LG_CTL_R.class);
		resltlL.addStringColumn("ship_pr_no");
		
		for (MCList<ShipInst_Chk01_HdrR> grpUp0L : up0L.groupList(ShipInst_Chk01_HdrR.$ship_fr_lg_grp_cd)) {
			
			MCList<MST_SHIP_PR_R> wk_dbc = MCList.create(MST_SHIP_PR_R.class);
			MST_SHIP_PR_R wk_t = MST_SHIP_PR_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(wk_t);
			MSW_SHIP_PR_KEY_R w = MSW_SHIP_PR_KEY_R.create("W");
			dbWkDelete("MSBEL5530_MSW_SHIP_PR_D02", dbc_bldr.getBaseDbc());
			
			for (ShipInst_Chk01_HdrR up0R : grpUp0L) {
				
				MCList<ShipSchd_Chk01_DtlR> up2L_tmp = up2L.subList(ShipSchd_Chk01_DtlR.$hdr_dtl_peg, up0R.hdr_dtl_peg());

				for (ShipSchd_Chk01_DtlR up2R : up2L_tmp) {
					
					MST_SHIP_PR_R shipPrR = MST_SHIP_PR_R.create();
					shipPrR.ship_pr_no(up2R.ship_pr_no());
					wk_dbc.add(shipPrR);
				}
			}
			
			dbWkInsert("MSBEL5530_MSW_SHIP_PR_I02", wk_dbc, dbc_bldr.getBaseDbc());
			
			// インボイス取引
			MCList<MAM_LG_CTL_R> lgctlL = MCList.create(MAM_LG_CTL_R.class);
			MAM_LG_CTL_R t = MAM_LG_CTL_R.create("T");
			MCQueryApiBuilder lgctlL_bldr = MCQueryApiBuilder.create(t);
			MSVM_DLV_ID_R m31 = MSVM_DLV_ID_R.create("M31");
			MST_SHIP_PR_R sp = MST_SHIP_PR_R.create("SP");
			lgctlL.addStringColumn("ship_pr_no");
			lgctlL_bldr.addSelect(sp.ship_pr_no);
			lgctlL_bldr.addInnerJoin(m31, bracket(m31.lg_grp_cd.eq(t.to_lg_grp_cd)));
			lgctlL_bldr.addInnerJoin(sp, bracket(sp.dlv_id_typ.eq(m31.dlv_id_typ)
					.and(sp.dlv_id_cd.eq(m31.dlv_id_cd))));
			lgctlL_bldr.addWhereWithAnd(t.fr_lg_grp_cd.eq(bind("ship_fr_lg_grp_cd")));
			lgctlL_bldr.addInnerJoin(w, bracket(w.ship_pr_no.eq(sp.ship_pr_no)));
			
			dbSelect("MSBEL5530_MAM_LG_CTL_S01", lgctlL, lgctlL_bldr, grpUp0L.get(0));
			
			resltlL.addAll(lgctlL);
		}
		
		return resltlL;
	}
	
	/**
	 * 納品予定日計算
	 */
	protected void calcDlvDt(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> up1L, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCList<ShipInst_Chk01_HdrR> up0L_tmp = up0L.createInstance();
		MCList<ShipInst_Chk01_DtlR> up1L_tmp = up1L.createInstance();
		MCList<ShipSchd_Chk01_DtlR> up2L_tmp = up2L.createInstance();

		MCList<MST_SHIP_INST_R> instL = MCList.create(MST_SHIP_INST_R.class);
		MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
		dbSelectKey("MSBEL5530_MST_SHIP_INST_S02", instL, instL_bldr, up0L);
		
		MCIndexKey up1Idx = up1L.createIndex(ShipInst_Chk01_DtlR.$hdr_dtl_peg);
		MCIndexKey up2Idx = up2L.createIndex(ShipInst_Chk01_DtlR.$hdr_dtl_peg);
		
		for (ShipInst_Chk01_HdrR up0R : up0L) {
			if (!isNull(up0R.ship_schd_tm()) && !isNull(up0R.dlv_schd_tm())) continue;

			// 出荷予定日または納品予定日のいずれか一方が未設定なら日付を計算する
			up0L_tmp.add(up0R);
			up1L_tmp.addAll(up1L.subList(up1Idx, up0R.hdr_dtl_peg()));
			up2L_tmp.addAll(up2L.subList(up2Idx, up0R.hdr_dtl_peg()));
		}
		// 最大を採用する
		_calcRsltL.setAll(callShipSchdDtSrch01(up0L_tmp, up1L_tmp, up2L_tmp));
		
		for (ShipInst_Chk01_HdrR up0R : up0L_tmp) {
			MCDate min_ship_schd_dt = null;
			MCDate max_dlv_schd_dt = null;
			MCList<ShipInst_Chk01_DtlR> up1L_dtl = up1L_tmp.subList("hdr_dtl_peg", up0R.hdr_dtl_peg());
			for (ShipInst_Chk01_DtlR r : up1L_dtl) {
				MSW_SHIP_SCHD_DT_CALC_R rsltR = _calcRsltL.getFirst("peg_no", r.peg_no());
				if (isNull(min_ship_schd_dt) || (!isNull(rsltR.ship_schd_tm()) && min_ship_schd_dt.gt(rsltR.ship_schd_tm()))) {
					min_ship_schd_dt = rsltR.ship_schd_tm();
				}
				if (isNull(max_dlv_schd_dt) || (!isNull(rsltR.dlv_schd_tm()) && rsltR.dlv_schd_tm().gt(max_dlv_schd_dt))) {
					max_dlv_schd_dt = rsltR.dlv_schd_tm();
				}
			}
			up0R.ship_schd_tm(min_ship_schd_dt);
			up0R.dlv_schd_tm(max_dlv_schd_dt);
			up1L_dtl.setDateNE(ShipInst_Chk01_DtlR.$ship_schd_tm, min_ship_schd_dt);
			up1L_dtl.addDateColumn("dlv_schd_tm", max_dlv_schd_dt);
		}
	}

	/**
	 * 引当対象かどうか
	 */
	protected boolean isAlloc(ShipInst_Chk01_DtlR up1R, MCList<ShipSchd_Chk01_DtlR> up2L) {
		if (!up1R.alloc_tgt_flg()) return false;
//		if (isNull(r.alloc_lot_no())) return false;
		if (MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ()) || isNull(up1R.data_crud_typ())) return false;
		if (!isNull(up1R.ship_inst_d_no()) && up1R.abort_flg()) return false;
		if (up1R.err_flg()) return false;
		ShipSchd_Chk01_DtlR up2R = up2L.getFirst(ShipSchd_Chk01_DtlR.$tmp_inst_d_no, up1R.tmp_inst_d_no());
		if (!MAC_SHIP_INST_TYP.isPICK(up2R.sp().ship_inst_typ())) return false;
		if (!isNull(up1R.ship_inst_d_no()) && !up1R.abort_flg() && up2R.ss().abort_flg())	return false;
		return true;
	}

	/**
	 * 在庫引当処理
	 */
	protected void allocStk(MCList<ShipInst_Chk01_DtlR> allocL, MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipSchd_Chk01_DtlR> up2L) {
		object(CLAZZ)._allocRsltL = MCList.create(Srch_RsltR.class);

		MCList<Srch_RsltR> l = allocStk_sub(allocL, up0L, up2L);
		if (!isNull(l)) {
			object(CLAZZ)._allocRsltL.setAll(l);
		}
		chkAlloc(allocL);
	}

	/**
	 * 在庫引当処理
	 */
	protected MCList<Srch_RsltR> allocStk_sub(MCList<ShipInst_Chk01_DtlR> list, MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipSchd_Chk01_DtlR> up2L) {
		// 引当済み、出庫日が直近のものに対して優先して引当する
		MCList<ShipInst_Chk01_DtlR> allocL = list.shallowClone();
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.DESC, ShipInst_Chk01_DtlR.$sas_alloc_flg);
		setAllocSrch01SortValue(allocL);
		sp.add(SortType.DESC, "sublot_exists_flg");
		sp.add(SortType.DESC, "lot_exists_flg");
		sp.add(SortType.ASC, ShipInst_Chk01_DtlR.$ship_schd_tm);
		sp.add(SortType.ASC, "dlv_schd_tm");
		sp.add(SortType.ASC, ShipInst_Chk01_DtlR.$alloc_scope_typ);
		allocL.sort(sp);

		MSBEL_AllocMngService.Alloc_Srch01 o = MSBEL_AllocMngService.crtAlloc_Srch01();

		o.up0().stk_flg(false);
		o.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
		o.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
		o.up0().except_alloc_wait_flg(true);
		o.up0().nm_srch_flg(false);
		if (!isNull(up0L.getFirst(ShipInst_Chk01_HdrR.$lot_chk_off_flg, true))) {			
			o.setLotChkFlg(true);
		}
		
		// 有効期限をセットしておく
		shipLotChk(allocL, up0L, up2L);

		getCstCd(allocL);
		
		cmpLotNoneFlg(allocL);

		for (ShipInst_Chk01_DtlR allocR : allocL) {
			Srch_TgtR cndR = Srch_TgtR.create();
			ShipInst_Chk01_HdrR hdrR = getHdrR(up0L, allocR.hdr_dtl_peg());
			setCnd_Alloc_Srch_TgtR(cndR, allocR, hdrR, up2L);
			o.up1().add(cndR);
		}
		for (MSW_IO_SCHD_DEL_R r : _allocIoSchdL) {
			Srch_Io_SchdR ioR = Srch_Io_SchdR.create();
			ioR.io_schd_typ(r.io_schd_typ());
			ioR.io_schd_sts_typ(r.io_schd_sts_typ());
			ioR.io_schd_no(r.io_schd_no());
			o.up3().add(ioR);
		}

		if (!o.up1().isEmpty()) {
			o.exec();
			return o.down0();
		}
		else {
			return null;
		}
	}
	/**
	 * 引当サービスに送る電文のソートに使用する項目を設定する。
	 * @param allocL
	 */
	protected void setAllocSrch01SortValue(MCList<ShipInst_Chk01_DtlR> allocL) {
		allocL.addBooleanColumn("lot_exists_flg");
		allocL.addBooleanColumn("sublot_exists_flg");
		for(ShipInst_Chk01_DtlR allocR : allocL) {
			allocR.setBooleanNE("lot_exists_flg", !isNull(allocR.alloc_lot_no()));
			allocR.setBooleanNE("sublot_exists_flg", !isNull(allocR.alloc_sublot_no()));
		}
	}
	/**
	 * 得意先を設定する。
	 * @param allocL
	 */
	protected void getCstCd(MCList<ShipInst_Chk01_DtlR> allocL) {
		
		MCList<MST_SLO_R> dbcL = MCList.create(MST_SLO_R.class);
		
		MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
		MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
		MST_SLO_R t3 = MST_SLO_R.create("T3");
		
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
		bldr.setSelect(t1.ship_pr_no, t3.cst_cd);
		bldr.addInnerJoin(t2, t2.slo_d_no.eq(t1.slo_d_no));
		bldr.addInnerJoin(t3, t3.slo_no.eq(t2.slo_no));
		bldr.setWhere(t1.ship_pr_no.eq(bind("ship_pr_no")));
		
		dbSelect("MSBEL5530_MST_SLO_S06", dbcL, bldr, allocL);
		
		allocL.addStringColumn("cst_cd");
		
		MCIndexKey Idx = dbcL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
		for (ShipInst_Chk01_DtlR allocR : allocL) {
			MST_SLO_R dbcR = dbcL.getFirst(Idx, allocR.getStringNE("ship_pr_no"));
			if (!isNull(dbcR)) {
				allocR.setStringNE("cst_cd", dbcR.cst_cd());
			}
		}
	}
	
	protected void cmpLotNoneFlg(MCList<ShipInst_Chk01_DtlR> allocL) {
		MCList<ShipInst_Chk01_DtlR> notLotMixL = allocL.subList(r -> (r.not_lot_mix_flg() || r.not_sublot_mix_flg()) && r.lot_none_flg());
		if (isNull(notLotMixL)) {
			return;
		}
		
		boolean mfgAllocNotLotFixFlg = isSame(getSysParm("MFG_ALLOC_NOT_LOT_FIX_FLG"), "1");
		boolean sloAllocNotLotFixFlg = isSame(getSysParm("SLO_ALLOC_NOT_LOT_FIX_FLG"), "1");
		
		MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
		MST_SHIP_PR_R shipPr = MST_SHIP_PR_R.create("SHIP_PR");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(shipPr);
		MST_XFR_SCHD_R xfrSchd = MST_XFR_SCHD_R.create("XFR_SCHD");
		xfrSchdL.addStringColumn(MST_SHIP_PR_R.$ship_pr_no);
		dbc_bldr.setSelect(shipPr.ship_pr_no,
				xfrSchd.xfr_src_typ,
				xfrSchd.slo_d_no);
		dbc_bldr.addInnerJoin(xfrSchd, bracket(xfrSchd.xfr_schd_no.eq(shipPr.xfr_schd_no)));
		dbSelectKey("MSBEL5530_MST_SHIP_PR_S04",
				xfrSchdL, dbc_bldr, notLotMixL.groupByNE("ship_pr_no"));
		
		MCIndexKey xfrSchdIdx = xfrSchdL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
		for (ShipInst_Chk01_DtlR allocR : notLotMixL) {
			MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(xfrSchdIdx, allocR.getStringNE("ship_pr_no"));
			if (isNull(xfrSchdR)) {
				continue;
			}
			if (!mfgAllocNotLotFixFlg && isSrcInpt(xfrSchdR)) {
				allocR.lot_none_flg(false);
			}
			else if (!sloAllocNotLotFixFlg && isSrcSlo(xfrSchdR)) {
				allocR.lot_none_flg(false);
			}
		}
	}
	protected boolean isSrcInpt(MST_XFR_SCHD_R xfrSchdR) {
		return MSC_XFR_SRC_TYP.isINPT(xfrSchdR.xfr_src_typ()) || MSC_XFR_SRC_TYP.isINPT_RPL(xfrSchdR.xfr_src_typ());
	}
	protected boolean isSrcSlo(MST_XFR_SCHD_R xfrSchdR) {
		return !isNull(xfrSchdR.slo_d_no()) || MSC_XFR_SRC_TYP.isSHIP_RPL(xfrSchdR.xfr_src_typ());
	}

	/**
	 * 全数引当できたかチェックする
	 */
	protected void chkAlloc(MCList<ShipInst_Chk01_DtlR> allocL) {
		MCIndexKey key = object(CLAZZ)._allocRsltL.createIndex(Srch_RsltR.$peg_no);
		for(ShipInst_Chk01_DtlR allocR : allocL) {
			MCList<Srch_RsltR> tmpAllocRsltL = object(CLAZZ)._allocRsltL.subList(key, allocR.peg_no());
			if(!isNull(tmpAllocRsltL)) {
				MCNumber allocSum = tmpAllocRsltL.sum(Srch_RsltR.$base_unit_qty);
				if (allocR.alloc_base_unit_qty().eq(allocSum)) {
					allocR.alloc_flg(true);	//引当できた
				}
			}
		}
	}

	/**
	 * ロット・サブロット混在不可チェック
	 */
	protected MCMessageList chkNotLotMix(MCList<ShipInst_Chk01_DtlR> up1L,
			MCList<ShipInst_Chk01_DtlR> notAllocL,
			MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCMessageList msgL = new MCMessageList();
		MCList<Srch_RsltR> rsltL = MCList.create(Srch_RsltR.class);
		
		notAllocL = notAllocL.subList(notAllocL.createIndex(ShipInst_Chk01_DtlR.$err_flg, ShipInst_Chk01_DtlR.$alloc_flg), false, true);
		
		// 同一受注明細、出荷予定の同一品目でロット・サブロットの混在をチェックするためのindexKey
		MCIndexKey lotMixIdxKey = notAllocL.createIndex(
				"slo_d_no",
				"ship_schd_no",
				ShipInst_Chk01_DtlR.$itm_cd,
				ShipInst_Chk01_DtlR.$itm_sub1,
				ShipInst_Chk01_DtlR.$itm_sub2,
				ShipInst_Chk01_DtlR.$itm_sub3);
		
		MCIndexKey idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);
		MCIndexKey alllocidx = object(CLAZZ)._allocRsltL.createIndex(Srch_RsltR.$peg_no);
		
		for (ShipInst_Chk01_DtlR r : up1L) {
			String dispItm = toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			String dispGUIIndex = toDispGUIIndex(r);
			
			ShipSchd_Chk01_DtlR up2R = up2L.getFirst(idx, r.tmp_inst_d_no());
			
			if (isShipLotChk(r.trd_ptn_typ()) && !isNull(up2R)) {
				MCList<ShipInst_Chk01_DtlR> subL = notAllocL.subList(
						lotMixIdxKey, up2R.sp().slo_d_no(), up2R.ship_schd_no(), r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3());
				MAM_ITM_R itmR = getItmCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				// ロット、サブロット混在（同一受注明細ＮＯ、出荷予定ＮＯ単位の同一品目）
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
					if (r.not_lot_mix_flg()) {
						for (ShipInst_Chk01_DtlR subR : subL) {
							rsltL.init();
							rsltL = object(CLAZZ)._allocRsltL.subList(alllocidx, subR.peg_no());
							
							boolean loterr = false;
							for (Srch_RsltR rsltR : rsltL) {
								if (isNullOr(r.lot_no(), rsltR.lot_no())) {
									continue;
								}
								if (!isSame(r.lot_no(), rsltR.lot_no())) {
									msgL.add(new MCMessage(r, null, MSBEL1201, dispItm, dispGUIIndex));
									r.err_flg(true);
									loterr = true;
									break;
								}
							}
							if (loterr) {
								break;
							}
						}
					}
					if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ()) && r.not_sublot_mix_flg()) {
						for (ShipInst_Chk01_DtlR subR : subL) {
							rsltL.init();
							rsltL = object(CLAZZ)._allocRsltL.subList(alllocidx, subR.peg_no());
							
							boolean subloterr = false;
							for (Srch_RsltR rsltR : rsltL) {
								if (isNullOr(r.lot_no(), subR.lot_no(), r.sublot_no(), rsltR.sublot_no())) {
									continue;
								}
								if (isSame(r.lot_no(), rsltR.lot_no())
										&& !isSame(r.sublot_no(), rsltR.sublot_no())) {
									msgL.add(new MCMessage(r, null, MSBEL1202, dispItm, dispGUIIndex));
									r.err_flg(true);
									subloterr = true;
									break;
								}
							}
							if (subloterr) {
								break;
							}
						}
					}
				}
			}
		}

		return msgL;
	}

	/**
	 * 未指図分の出荷予定について、引当状態を維持するための引当処理
	 */
	protected void setAllocRslt_uninst(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> up1L, MCList<ShipSchd_Chk01_DtlR> up2L) {
		if (_notInstL.isEmpty()) return;
		
		// 一部指図した未指図分の出荷引当状況を取得する
		MCList<MST_SHIP_ALLOC_STS_R> stsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		MCQueryApiBuilder stsL_bldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_R.create("T"));
		dbSelectKey("MSBEL5530_MST_SHIP_ALLOC_STS_S07", stsL, stsL_bldr, _notInstL);
		if (stsL.isEmpty()) return;

		MCList<ShipInst_Chk01_DtlR> allocL = MCList.create(ShipInst_Chk01_DtlR.class);
		MCList<ShipInst_Chk01_DtlR>[] gl = _notInstL.groupList(ShipInst_Chk01_DtlR.$tmp_inst_d_no);
		for (MCList<ShipInst_Chk01_DtlR> up1L_sub : gl) {
			// 未指図分の数量を求める
			MCNumber inst_qty = up1L_sub.sum(ShipInst_Chk01_DtlR.$alloc_base_unit_qty);
			MCList<MST_SHIP_ALLOC_STS_R> stsL_sub =
					stsL.subList(r -> !isNull(up1L_sub.getFirst(ShipInst_Chk01_DtlR.$ship_alloc_sts_no, r.ship_alloc_sts_no())));
			MCNumber schd_qty = stsL_sub.sum(MST_SHIP_ALLOC_STS_R.$base_unit_qty);
			MCNumber uninst_qty = schd_qty.subtract(inst_qty);

			// 引当済みの場合のみ引当状態を維持する
			for (ShipInst_Chk01_DtlR up1R : up1L_sub) {
				if (!uninst_qty.isPositive()) break;

				MST_SHIP_ALLOC_STS_R stsR = stsL_sub.getFirst(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no, up1R.ship_alloc_sts_no());
				if (stsR.alloc_flg()) {
					MCNumber diff = stsR.base_unit_qty().subtract(up1R.alloc_base_unit_qty());
					if (diff.isPositive()) {
						MCNumber alloc_qty = diff.gt(uninst_qty) ? uninst_qty : diff;
						uninst_qty = uninst_qty.subtract(alloc_qty);

						ShipInst_Chk01_DtlR allocR = up1R.clone();
						allocR.alloc_flg(true);
						allocR.alloc_base_unit_qty(alloc_qty);
						// （出荷予定の）取引単位に変換
						MAVM_ITM_UNIT_R itmUnitR = getItmUnit(allocR.itm_cd(), allocR.itm_sub1(), allocR.itm_sub2(), allocR.itm_sub3(), allocR.trd_unit_cd());
						MCNumber alloc_qty_t = rvrsBaseUnitConv(alloc_qty, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(), itmUnitR.rnd_typ());
						MAVM_ITM_UNIT_R itmBaseUnitR = getItmUnit(allocR.itm_cd(), allocR.itm_sub1(), allocR.itm_sub2(), allocR.itm_sub3(), allocR.base_unit_cd());
						MCNumber alloc_qty_b = convToBaseUnit(alloc_qty_t, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
						if(isSame(alloc_qty_b, alloc_qty)) {
							allocR.alloc_ent_unit_cd(allocR.trd_unit_cd());
							allocR.alloc_ent_unit_qty(alloc_qty_t);
						}
						else {
							allocR.alloc_ent_unit_cd(allocR.base_unit_cd());
							allocR.alloc_ent_unit_qty(alloc_qty);
						}
						// 荷姿単位に変換
						itmUnitR = getItmUnit(allocR.itm_cd(), allocR.itm_sub1(), allocR.itm_sub2(), allocR.itm_sub3(), allocR.pack_unit_cd());
						MCNumber alloc_qty_p = rvrsBaseUnitConv(alloc_qty, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(), itmUnitR.rnd_typ());
						alloc_qty_b = convToBaseUnit(alloc_qty_p, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
						if(isSame(alloc_qty_b, alloc_qty)) {
							allocR.pack_unit_qty(alloc_qty_p);
						}
						else {
							// 荷姿単位に変換できない場合は、引当を維持しない
							continue;
						}

						allocR.lot_no(stsR.lot_no());
						allocR.sublot_no(stsR.sublot_no());
						allocR.ver_no(stsR.ver_no());
						allocR.ship_loc_cd(stsR.ship_loc_cd());
						allocR.ship_str_ln_cd(stsR.ship_str_ln_cd());
						allocR.sno1(stsR.sno1());
						allocR.sno2(stsR.sno2());
						allocR.sno3(stsR.sno3());
						allocR.sno4(stsR.sno4());
						allocR.alloc_lot_no(stsR.lot_no());
						allocR.alloc_sublot_no(stsR.sublot_no());
						allocR.alloc_ver_no(stsR.ver_no());
						allocR.alloc_loc_cd(stsR.ship_loc_cd());
						allocR.alloc_str_ln_cd(stsR.ship_str_ln_cd());
						allocR.alloc_sno1(stsR.sno1());
						allocR.alloc_sno2(stsR.sno2());
						allocR.alloc_sno3(stsR.sno3());
						allocR.alloc_sno4(stsR.sno4());
						allocL.add(allocR);
					}
				}
			}
		}
		if (allocL.isEmpty()) {
			_notInstL.init();
			return;
		}

		MCNumber peg_no_new = (MCNumber) up1L.max(ShipInst_Chk01_DtlR.$peg_no);
		for (ShipInst_Chk01_DtlR allocR : allocL) {
			peg_no_new = peg_no_new.add(MCNumber.ONE);
			allocR.peg_no(peg_no_new);
		}

		_notInstL.setAll(allocL);
	}

	/**
	 * 在庫引当サービス電文設定
	 */
	protected void setCnd_Alloc_Srch_TgtR(Srch_TgtR cndR, ShipInst_Chk01_DtlR dtlR, ShipInst_Chk01_HdrR hdrR, MCList<ShipSchd_Chk01_DtlR> up2L) {
		cndR.peg_no(dtlR.peg_no());
		cndR.inpt_schd_dt(null);
		cndR.gi_schd_dt(null);

		MSW_SHIP_SCHD_DT_CALC_R rsltR = _calcRsltL.getFirst(MSW_SHIP_SCHD_DT_CALC_R.$peg_no, dtlR.peg_no());
		if (!isNull(rsltR) && !isNull(rsltR.ship_schd_tm())) {
			cndR.gi_schd_dt(rsltR.ship_schd_tm().trunc(MCDateFieldType.DAY));
		}
		else {
			cndR.gi_schd_dt(hdrR.ship_schd_tm().trunc(MCDateFieldType.DAY));
		}
		if (!isNull(rsltR) && !isNull(rsltR.dlv_schd_tm())) {
			cndR.gr_schd_dt(rsltR.dlv_schd_tm().trunc(MCDateFieldType.DAY));
		}
		else {
			cndR.gr_schd_dt(hdrR.dlv_schd_tm().trunc(MCDateFieldType.DAY));
		}

		cndR.itm_cd(dtlR.itm_cd());
		cndR.itm_sub1(dtlR.itm_sub1());
		cndR.itm_sub2(dtlR.itm_sub2());
		cndR.itm_sub3(dtlR.itm_sub3());
		cndR.ver_no(dtlR.alloc_ver_no());
		cndR.alt_flg(false);
		cndR.alt_grp_cd(null);
		cndR.alt_grp_seq(null);
		cndR.oper_inst_no(null);
		cndR.alt_itm_typ(null);
		cndR.alt_alloc_prio(null);
		cndR.inpt_loc_cd(null);
		cndR.inpt_str_ln_cd(null);
		ShipSchd_Chk01_DtlR up2R = up2L.getFirst(ShipSchd_Chk01_DtlR.$tmp_inst_d_no, dtlR.tmp_inst_d_no());
		cndR.dlv_lg_grp_cd(up2R.dlv_lg_grp_cd());
		cndR.alloc_grp_cd(up2R.sp().alloc_grp_cd());
		cndR.gi_lg_grp_cd(hdrR.ship_fr_lg_grp_cd());
		cndR.gi_loc_cd(dtlR.alloc_loc_cd());
		cndR.gi_str_ln_cd(dtlR.alloc_str_ln_cd());
		cndR.gi_stk_arrv_bp_cd(dtlR.stk_arrv_bp_cd());
		if (MSC_SHIP_TO_ID_TYP.isLOC(hdrR.ship_to_id_typ())) {
			cndR.gr_loc_cd(hdrR.ship_to_id_cd());
		}
		else {
			cndR.gr_loc_cd(null);
		}
		cndR.gr_str_ln_cd(null);
		cndR.quality_typ(dtlR.quality_typ());
		cndR.stk_id_typ(dtlR.stk_id_typ());
		cndR.stk_bp_cd(dtlR.stk_bp_cd());
		cndR.gd_cd(dtlR.gd_cd());
		cndR.lot_no(dtlR.alloc_lot_no());
		cndR.sublot_no(dtlR.alloc_sublot_no());
		cndR.sno1(nvl(dtlR.alloc_sno1(), dtlR.sno1()));
		cndR.sno1_null_flg(dtlR.sno1_null_flg());
		cndR.sno2(nvl(dtlR.alloc_sno2(), dtlR.sno2()));
		cndR.sno2_null_flg(dtlR.sno2_null_flg());
		cndR.sno3(nvl(dtlR.alloc_sno3(), dtlR.sno3()));
		cndR.sno3_null_flg(dtlR.sno3_null_flg());
		cndR.sno4(nvl(dtlR.alloc_sno4(), dtlR.sno4()));
		cndR.sno4_null_flg(dtlR.sno4_null_flg());
		if (isPackUnit(dtlR)) {
			cndR.pack_unit_cd(dtlR.alloc_ent_unit_cd());
			cndR.pack_unit_qty(dtlR.alloc_ent_unit_qty());
		}
		else {
			cndR.pack_unit_cd(null);
			cndR.pack_unit_qty(null);
		}
		cndR.base_unit_cd(dtlR.alloc_base_unit_cd());
		cndR.base_unit_qty(dtlR.alloc_base_unit_qty());
		cndR.cont_qty(null);
		cndR.not_lot_fix_flg(dtlR.lot_none_flg());
		cndR.not_lot_mix_flg(dtlR.not_lot_mix_flg());
		cndR.not_sublot_mix_flg(dtlR.not_sublot_mix_flg());
		if (isShipLotChk(dtlR.trd_ptn_typ())) {
			cndR.vld_dt_fr(dtlR.getDateNE(_tmp_valid_dt_fr));
			cndR.vld_dt_fr_grp(dtlR.getNumberNE(_tmp_valid_dt_fr_grp));
			cndR.vld_dt_to(dtlR.getDateNE(_tmp_valid_dt_to));
		}
		else {
			cndR.vld_dt_fr(dtlR.valid_dt_from());
			cndR.vld_dt_fr_grp(null);
			cndR.vld_dt_to(dtlR.valid_dt_to());
		}
		
		cndR.ship_term_cd(hdrR.ship_term_cd());
		cndR.io_schd_typ(getIoSchdTyp(dtlR, up2L));
		cndR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());
		cndR.stk_alloc_flg(false);
		cndR.alloc_scope_typ(dtlR.alloc_scope_typ());
		
		if (MAC_TRD_PTN_TYP.isPROV(dtlR.trd_ptn_typ()) && isNull(dtlR.alloc_loc_cd())) {
			cndR.stk_info_loc_typ(MSC_STK_INFO_LOC_TYP.HOUSE.value());
		}
		cndR.cst_cd(dtlR.getStringNE("cst_cd"));
		cndR.chk_ship_flg(!dtlR.skip_chk_ship_flg());
	}

	/**
	 * 出荷済みのロットから最小・最大の有効期限を取得する
	 */
	protected void shipLotChk(MCList<ShipInst_Chk01_DtlR> allocL, MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MSBEL_ShipLotChkService.ShipLotChk_Srch01 o = MSBEL_ShipLotChkService.crtShipLotChk_Srch01();
		MCIndexKey up2Idx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);

		MCList<ShipInst_Chk01_DtlR> chkL = allocL.subList(r -> isShipLotChk(r.trd_ptn_typ()));
		for (ShipInst_Chk01_DtlR r : chkL) {
			ShipSchd_Chk01_DtlR prR = up2L.getFirst(up2Idx, r.tmp_inst_d_no());
			if (isNull(prR)) continue;	// 未指図のとき（1度実行しているはず）

			ShipInst_Chk01_HdrR hdrR = getHdrR(up0L, r.hdr_dtl_peg());
			if (hdrR.lot_chk_off_flg()) continue;

			ShipLot_DtlR cndR = ShipLot_DtlR.create();
			cndR.peg_no(r.peg_no());
			cndR.cst_cd(prR.sp().cst_cd());
			if (MSC_SHIP_TO_ID_TYP.isDLV(prR.sp().dlv_id_typ())) {
				cndR.dlv_cd(prR.sp().dlv_id_cd());
			}
			cndR.itm_cd(r.itm_cd());
			cndR.itm_sub1(r.itm_sub1());
			cndR.itm_sub2(r.itm_sub2());
			cndR.itm_sub3(r.itm_sub3());
			cndR.base_dt(hdrR.dlv_schd_tm().trunc(MCDateFieldType.DAY));
			cndR.lock_flg(false);
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				cndR.ship_schd_no(r.sas().ship_schd_no());
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				cndR.ship_inst_d_no(r.ship_inst_d_no());
			}

			o.up0().add(cndR);
		}
		if (!o.up0().isEmpty()) {
			o.exec();

			for (ShipInst_Chk01_DtlR r : chkL) {
				ShipLot_DtlR down0R = o.down0().getFirst(ShipLot_DtlR.$peg_no, r.peg_no());
				if (!isNull(down0R)) {
					r.setDateNE(_tmp_valid_dt_fr, down0R.valid_dt_fr());
					r.setNumberNE(_tmp_valid_dt_fr_grp, down0R.valid_dt_fr_grp());
					r.setDateNE(_tmp_valid_dt_to, down0R.valid_dt_to());
				}
			}
		}
	}

	/**
	 * 出荷ロットチェック対象かどうか
	 */
	protected boolean isShipLotChk(String trd_ptn_typ) {
		return MAC_TRD_PTN_TYP.isSLS(trd_ptn_typ) || MAC_TRD_PTN_TYP.isSHIP(trd_ptn_typ);
	}

	/**
	 * 荷姿かどうか
	 */
	protected boolean isPackUnit(ShipInst_Chk01_DtlR r) {
		MAVM_ITM_UNIT_R itmUnitR = getItmUnit(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.alloc_ent_unit_cd());
		return itmUnitR.pack_flg();
	}

	/**
	 * 出荷予定更新サービス電文up1設定（Chk01、Ins01用）
	 */
	protected MCList<ShipSchd_DtlR> setCnd_ShipSchd_ShipSchd_DtlR_Ins(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> up1L, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCIndexKey up1Idx = up1L.createIndex(ShipInst_Chk01_DtlR.$tmp_inst_d_no);
		MCList<ShipSchd_DtlR> l = MCList.create(ShipSchd_DtlR.class);
		MCNumber tmp_inst_no_new = (MCNumber) up1L.max(ShipInst_Chk01_DtlR.$tmp_inst_d_no);
		tmp_inst_no_new = tmp_inst_no_new.add(MCNumber.ONE);
		
		MCList<ShipSchd_Chk01_DtlR>[] gl = up2L.groupList(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);
		for (MCList<ShipSchd_Chk01_DtlR> up2L_sub : gl) {
			ShipSchd_DtlR lastinstR = ShipSchd_DtlR.create();

			// 対応する上り電文取得
			MCList<ShipInst_Chk01_DtlR> up1L_inst = up1L.subList(up1Idx, up2L_sub.get(0).tmp_inst_d_no());
			if (up1L_inst.isEmpty()) continue;
			ShipInst_Chk01_DtlR up1R = up1L_inst.get(0);

			// ロットが割れている場合のため、数量合計
			MCNumber base_unit_qty = up1L_inst.sum(ShipInst_Chk01_DtlR.$alloc_base_unit_qty);

			for (ShipSchd_Chk01_DtlR up2R : up2L_sub) {
				MST_SHIP_SCHD_R schdR = up2R.ss();
				ShipInst_Chk01_HdrR up0R = getHdrR(up0L, up2R.hdr_dtl_peg());

				MAVM_ITM_UNIT_R itmUnitR = getItmUnit(up1R.itm_cd(), up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3(), schdR.trd_unit_cd());
				MAVM_ITM_UNIT_R itmBaseUnitR = getItmUnit(up1R.itm_cd(), up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3(), schdR.base_unit_cd());

				// 出荷指図数が出荷予定数より少ない場合は未指図分の出荷予定を作成する
				MCNumber un_inst_qty_b = schdR.base_unit_qty().subtract(base_unit_qty);
				if (un_inst_qty_b.isPositive()) {
					ShipSchd_DtlR uninstR = ShipSchd_DtlR.create();
					setCnd_ShipSchd_ShipSchd_DtlR_Cmn(uninstR, up0R, up1R, up2R);
					// 個別設定
					uninstR.peg_no(tmp_inst_no_new);
					tmp_inst_no_new = tmp_inst_no_new.add(MCNumber.ONE);
					uninstR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					uninstR.ship_schd_no(null);
					uninstR.ship_inst_d_no(null);
					uninstR.abort_flg(up1R.abort_flg());
					uninstR.inst_ship_schd_tm(null);
					uninstR.inst_dlv_schd_tm(null);

					uninstR.base_unit_qty(un_inst_qty_b);

					// （出荷予定の）取引単位に変換
					MCNumber un_inst_qty_t = rvrsBaseUnitConv(un_inst_qty_b, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(), itmUnitR.rnd_typ());
					MCNumber re_un_inst_qty_b = convToBaseUnit(un_inst_qty_t, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
					if(isSame(re_un_inst_qty_b, un_inst_qty_b)) {
						uninstR.trd_unit_cd(schdR.trd_unit_cd());
						uninstR.trd_unit_qty(un_inst_qty_t);
					}
					else {
						uninstR.trd_unit_cd(up1R.base_unit_cd());
						uninstR.trd_unit_qty(un_inst_qty_b);
					}
					uninstR.inst_qty(null);
					uninstR.inst_unit_cd(null);
					uninstR.inst_bndl_flg(false);
					if (schdR.iv_schd_qty().isPositive()) {
						MCNumber uninstIvSchdQty = schdR.iv_schd_qty().subtract(base_unit_qty);
						if (uninstIvSchdQty.isPositive()) {
							uninstR.iv_schd_qty(uninstIvSchdQty);
							uninstR.iv_schd_qty_upd_flg(true);
						}
					}

					l.add(uninstR);
					
					// 未指図引当用
					if ( !(up1R.abort_flg() || up1R.inst_bndl_flg()) ) {
						// 指図まとめ時の残数は引当状況から引き継がない(出荷予定SVで作成する)
						MCList<ShipInst_Chk01_DtlR> notInstL = up1L_inst.clone();
						notInstL.setNumber(ShipInst_Chk01_DtlR.$tmp_inst_d_no, uninstR.peg_no());
						notInstL.setString(ShipInst_Chk01_DtlR.$trd_unit_cd, uninstR.trd_unit_cd());
						_notInstL.addAll(notInstL);
						ShipSchd_Chk01_DtlR r = up2R.clone();
						r.tmp_inst_d_no(uninstR.peg_no());
						up2L.add(r);
					}
				}

				// 指図分
				ShipSchd_DtlR instR = ShipSchd_DtlR.create();
				setCnd_ShipSchd_ShipSchd_DtlR_Cmn(instR, up0R, up1R, up2R);
				// 個別設定
				instR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				instR.ship_schd_no(up2R.ship_schd_no());
				instR.ship_inst_d_no(up1R.ship_inst_d_no());
				instR.inst_unit_cd(up1R.base_unit_cd());
				instR.abort_flg(false);
				if (base_unit_qty.gte(schdR.base_unit_qty())) {
					instR.base_unit_qty(schdR.base_unit_qty());
					instR.trd_unit_cd(schdR.trd_unit_cd());
					instR.trd_unit_qty(schdR.trd_unit_qty());
					instR.inst_qty(schdR.base_unit_qty());
				}
				else {
					instR.base_unit_qty(base_unit_qty);
					MCNumber trd_unit_qty = rvrsBaseUnitConv(base_unit_qty, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(), itmUnitR.rnd_typ());
					MCNumber re_un_inst_qty_b = convToBaseUnit(trd_unit_qty, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
					if(isSame(re_un_inst_qty_b, base_unit_qty)) {
						instR.trd_unit_cd(schdR.trd_unit_cd());
						instR.trd_unit_qty(trd_unit_qty);
					}
					else {
						instR.trd_unit_cd(up1R.base_unit_cd());
						instR.trd_unit_qty(base_unit_qty);
					}
					instR.inst_qty(base_unit_qty);
				}
				if (un_inst_qty_b.isPositive() && schdR.iv_schd_qty().isPositive() && schdR.iv_schd_qty().gt(instR.base_unit_qty())) {
					// インボイスが登録済み かつ 一部出荷指図した場合、出荷予定のインボイス数量を更新
					instR.iv_schd_qty(instR.base_unit_qty());
					instR.iv_schd_qty_upd_flg(true);
				}
				l.add(instR);
				base_unit_qty = base_unit_qty.subtract(instR.base_unit_qty());
				lastinstR = instR;
			}
			// 指図数のほうが出荷予定数より多い場合
			if (base_unit_qty.isPositive()) {
				lastinstR.inst_qty(lastinstR.inst_qty().add(base_unit_qty));
			}
		}
		return l;
	}
	/**
	 * 出荷予定更新サービス電文up1設定（Chk02、Upd01用）
	 */
	protected MCList<ShipSchd_DtlR> setCnd_ShipSchd_ShipSchd_DtlR_Upd(MCList<ShipInst_Chk01_HdrR> up0L, MCList<ShipInst_Chk01_DtlR> up1L, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCList<ShipSchd_DtlR> l = MCList.create(ShipSchd_DtlR.class);
		MCNumber tmp_inst_no_new = (MCNumber) up1L.max(ShipInst_Chk01_DtlR.$tmp_inst_d_no);
		tmp_inst_no_new = tmp_inst_no_new.add(MCNumber.ONE);
		
		MCList<ShipSchd_Chk01_DtlR>[] gl = up2L.groupList(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);
		for (MCList<ShipSchd_Chk01_DtlR> up2L_sub : gl) {
			ShipSchd_DtlR lastinstR = ShipSchd_DtlR.create();

			// 対応する上り電文取得
			MCList<ShipInst_Chk01_DtlR> up1L_inst = up1L.subList(r -> isInst(r, up2L_sub.get(0).ss().ship_inst_d_no()));
			MCList<ShipInst_Chk01_DtlR> up1L_del = up1L.subList(r -> isDel(r, up2L_sub.get(0).ss().ship_inst_d_no()));
			ShipInst_Chk01_DtlR up1R;
			if (!up1L_inst.isEmpty()) {
				up1R = up1L_inst.get(0);
			}
			else if (!up1L_del.isEmpty()){
				up1R = up1L_del.get(0);
			}
			else {
				continue;
			}

			// ロットが割れている場合のため、数量合計
			MCNumber base_unit_qty_inst = MCNumber.ZERO;
			if (!up1L_inst.isEmpty()) {
				base_unit_qty_inst = up1L_inst.sum(ShipInst_Chk01_DtlR.$alloc_base_unit_qty);
			}

			for (ShipSchd_Chk01_DtlR up2R : up2L_sub) {
				MST_SHIP_SCHD_R schdR = up2R.ss();
				ShipInst_Chk01_HdrR up0R = getHdrR(up0L, up2R.hdr_dtl_peg());
				
				// 打切の場合は数量の入力を無視する
				if (up1R.abort_flg() || schdR.abort_flg()) {
					base_unit_qty_inst = schdR.base_unit_qty();
				}

				// データ更新区分が行削除だったら行削除を優先させる
				if (MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ())) {
					base_unit_qty_inst = MCNumber.ZERO;
				}

				MAVM_ITM_UNIT_R itmUnitR = getItmUnit(up1R.itm_cd(), up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3(), schdR.trd_unit_cd());
				MAVM_ITM_UNIT_R itmBaseUnitR = getItmUnit(up1R.itm_cd(), up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3(), schdR.base_unit_cd());

				MCNumber un_inst_qty_b = schdR.base_unit_qty().subtract(base_unit_qty_inst);
				// 出荷指図明細が行削除された場合
				if (base_unit_qty_inst.isZero()) {
					ShipSchd_DtlR uninstR = ShipSchd_DtlR.create();
					setCnd_ShipSchd_ShipSchd_DtlR_Del_sub(uninstR, schdR);
					if (MAC_SHIP_INST_TYP.isNO_PICK(up2R.sp().ship_inst_typ())) {
						uninstR.ship_fr_lg_grp_cd(null);
						uninstR.wg_cd(null);
					}
					if (up2L_sub.size() > 1) {	// まとめ
						uninstR.peg_no(tmp_inst_no_new);
						tmp_inst_no_new = tmp_inst_no_new.add(MCNumber.ONE);
					}
					else {
						uninstR.peg_no(tmp_inst_no_new);
						tmp_inst_no_new = tmp_inst_no_new.add(MCNumber.ONE);
					}
					l.add(uninstR);
				}
				// 出荷指図数が出荷予定数より少ない場合は未指図分の出荷予定を作成する
				else if (un_inst_qty_b.isPositive()) {
					ShipSchd_DtlR uninstR = ShipSchd_DtlR.create();
					setCnd_ShipSchd_ShipSchd_DtlR_Cmn(uninstR, up0R, up1R, up2R);
					// 個別設定
					uninstR.peg_no(tmp_inst_no_new);
					tmp_inst_no_new = tmp_inst_no_new.add(MCNumber.ONE);
					uninstR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					uninstR.ship_schd_no(null);
					uninstR.ship_inst_d_no(null);
					uninstR.abort_flg(up1R.abort_flg());
					uninstR.inst_ship_schd_tm(null);
					uninstR.inst_dlv_schd_tm(null);
					if (MAC_SHIP_INST_TYP.isNO_PICK(up2R.sp().ship_inst_typ())) {
						uninstR.ship_fr_lg_grp_cd(null);
						uninstR.wg_cd(null);
					}

					uninstR.base_unit_qty(un_inst_qty_b);

					// （出荷予定の）取引単位に変換
					MCNumber un_inst_qty_t = rvrsBaseUnitConv(un_inst_qty_b, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(), itmUnitR.rnd_typ());
					MCNumber re_un_inst_qty_b = convToBaseUnit(un_inst_qty_t, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
					if(isSame(re_un_inst_qty_b, un_inst_qty_b)) {
						uninstR.trd_unit_cd(schdR.trd_unit_cd());
						uninstR.trd_unit_qty(un_inst_qty_t);
					}
					else {
						uninstR.trd_unit_cd(up1R.base_unit_cd());
						uninstR.trd_unit_qty(un_inst_qty_b);
					}
					uninstR.inst_qty(null);
					uninstR.inst_unit_cd(null);
					uninstR.inst_ship_schd_tm(null);
					uninstR.inst_dlv_schd_tm(null);

					if (schdR.iv_schd_qty().isPositive()) {
						MCNumber uninstIvSchdQty = schdR.iv_schd_qty().subtract(base_unit_qty_inst);
						if (uninstIvSchdQty.isPositive()) {
							uninstR.iv_schd_qty(uninstIvSchdQty);
							uninstR.iv_schd_qty_upd_flg(true);
						}
					}
					
					l.add(uninstR);

					// 未指図引当用
					if (!up1R.abort_flg()) {
						MCList<ShipInst_Chk01_DtlR> notInstL = up1L_inst.clone();
						notInstL.setNumber(ShipInst_Chk01_DtlR.$tmp_inst_d_no, uninstR.peg_no());
						notInstL.setString(ShipInst_Chk01_DtlR.$trd_unit_cd, uninstR.trd_unit_cd());
						_notInstL.addAll(notInstL);
						ShipSchd_Chk01_DtlR r = up2R.clone();
						r.tmp_inst_d_no(uninstR.peg_no());
						up2L.add(r);
					}
				}
				if (!up1L_inst.isEmpty() && base_unit_qty_inst.isPositive() && !isNull(up1R.data_crud_typ())) {
					// 指図分
					ShipSchd_DtlR instR = ShipSchd_DtlR.create();
					setCnd_ShipSchd_ShipSchd_DtlR_Cmn(instR, up0R, up1R, up2R);
					// 個別設定
					instR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					instR.ship_schd_no(up2R.ship_schd_no());
					instR.ship_inst_d_no(up1R.ship_inst_d_no());
					instR.inst_unit_cd(up1R.base_unit_cd());
					instR.abort_flg(up1R.abort_flg());
					if (base_unit_qty_inst.gte(schdR.base_unit_qty())) {
						instR.base_unit_qty(schdR.base_unit_qty());
						instR.trd_unit_cd(schdR.trd_unit_cd());
						instR.trd_unit_qty(schdR.trd_unit_qty());
						instR.inst_qty(schdR.base_unit_qty());
					}
					else {
						instR.base_unit_qty(base_unit_qty_inst);
						MCNumber trd_unit_qty = rvrsBaseUnitConv(base_unit_qty_inst, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(), itmUnitR.rnd_typ());
						MCNumber re_trd_unit_qty = convToBaseUnit(trd_unit_qty, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
						if(isSame(re_trd_unit_qty, base_unit_qty_inst)) {
							instR.trd_unit_cd(schdR.trd_unit_cd());
							instR.trd_unit_qty(trd_unit_qty);
						}
						else {
							instR.trd_unit_cd(up1R.base_unit_cd());
							instR.trd_unit_qty(base_unit_qty_inst);
						}
						instR.inst_qty(base_unit_qty_inst);
					}
					if (un_inst_qty_b.isPositive() && schdR.iv_schd_qty().isPositive() && schdR.iv_schd_qty().gt(instR.base_unit_qty())) {
						// インボイスが登録済み かつ 一部出荷指図した場合、出荷予定のインボイス数量を更新
						instR.iv_schd_qty(instR.base_unit_qty());
						instR.iv_schd_qty_upd_flg(true);
					}

					l.add(instR);
					base_unit_qty_inst = base_unit_qty_inst.subtract(instR.base_unit_qty());
					lastinstR = instR;
				}
			}
			// 指図数のほうが出荷予定数より多い場合
			if (base_unit_qty_inst.isPositive() && !lastinstR.isEmpty()) {
				lastinstR.inst_qty(lastinstR.inst_qty().add(base_unit_qty_inst));
			}
		}
		return l;
	}
	/**
	 * 出荷予定更新サービス電文up1設定（Chk03、Del01用）
	 */
	protected MCList<MST_SHIP_SCHD_R> setCnd_ShipSchd_ShipSchd_DtlR_Del_pre(MCList<ShipInst_Chk03_HdrR> up0L) {
		// 出荷予定ＮＯ取得
		MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
		MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
		MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
		MST_SHIP_INST_D_R d = MST_SHIP_INST_D_R.create("D");
		schdL.addStringColumn("ship_inst_no");
		schdL_bldr.addSelect(d.ship_inst_no);
		schdL_bldr.addInnerJoin(d, bracket( t.ship_inst_d_no.eq(d.ship_inst_d_no)));
		schdL_bldr.addWhereWithAnd(d.ship_inst_no.eq(bind("ship_inst_no")));
		dbSelect("MSBEL5530_MST_SHIP_SCHD_S05", schdL, schdL_bldr, up0L);
		
		return schdL;
	}
	/**
	 * 出荷予定更新サービス電文up1設定（Chk03、Del01用）
	 */
	protected MCList<ShipSchd_DtlR> setCnd_ShipSchd_ShipSchd_DtlR_Del(MCList<MST_SHIP_SCHD_R> schdL) {
		MCList<ShipSchd_DtlR> l = MCList.create(ShipSchd_DtlR.class);
		
		MCList<MST_SHIP_PR_R> prL = getShipPr2(schdL);
		MCIndexKey idxkey = prL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
		for (MST_SHIP_SCHD_R schdR : schdL) {
			ShipSchd_DtlR instR = ShipSchd_DtlR.create();
			setCnd_ShipSchd_ShipSchd_DtlR_Del_sub(instR, schdR);
			if (MAC_SHIP_INST_TYP.isNO_PICK(prL.getFirst(idxkey, schdR.ship_pr_no()).ship_inst_typ())) {
				instR.ship_fr_lg_grp_cd(null);
				instR.wg_cd(null);
			}

			l.add(instR);
		}
		setPegNo(l);
		return l;
	}

	/**
	 * 出荷予定更新サービス電文up1共通設定
	 */
	protected void setCnd_ShipSchd_ShipSchd_DtlR_Cmn(ShipSchd_DtlR destR, ShipInst_Chk01_HdrR up0R, ShipInst_Chk01_DtlR up1R, ShipSchd_Chk01_DtlR up2R) {
		copy(destR, up2R.ss(), createMap_ShipSchd_DtlR_MST_SHIP_SCHD_R());
		destR.peg_no(up1R.tmp_inst_d_no());
		destR.ship_pr_no(up2R.ship_pr_no());
		destR.inst_bndl_flg(up1R.inst_bndl_flg());
		destR.inst_ship_schd_tm(up0R.ship_schd_tm());
		destR.inst_dlv_schd_tm(up0R.dlv_schd_tm());
		if (MAC_SHIP_INST_TYP.isNO_PICK(up2R.sp().ship_inst_typ())) {
			destR.not_dt_calc_flg(false);
		}
		else {
			destR.not_dt_calc_flg(true);
		}

	}

	/**
	 * 出荷予定更新サービス電文設定（取消用）
	 */
	protected void setCnd_ShipSchd_ShipSchd_DtlR_Del_sub(ShipSchd_DtlR destR, MST_SHIP_SCHD_R schdR) {
		copy(destR, schdR, createMap_ShipSchd_DtlR_MST_SHIP_SCHD_R());
		destR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		destR.ship_inst_d_no(null);
		destR.inst_bndl_flg(false);
		destR.base_unit_qty(schdR.base_unit_qty());
		destR.trd_unit_qty(schdR.trd_unit_qty());
		destR.trd_unit_cd(schdR.trd_unit_cd());
		destR.inst_qty(null);
		destR.inst_unit_cd(null);
		destR.not_dt_calc_flg(schdR.not_dt_calc_flg());
	}

	/**
	 * 受払進捗管理ＮＯ取得
	 */
	protected String getIoSchdPrNo(String axfr_schd_no) {
		MST_XFR_SCHD_R r = MST_XFR_SCHD_R.create();
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(MST_XFR_SCHD_R.create("T"));
		dbSelectKey("MSBEL5530_MST_XFR_SCHD_S04", r, r_bldr, axfr_schd_no);
		return r.io_schd_pr_no();
	}

	/**
	 * 受払進捗管理ＮＯ取得
	 */
	protected String getIoSchdPrNo_del(String aship_pr_no) {
		MST_XFR_SCHD_R r = MST_XFR_SCHD_R.create();
		MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		MST_SHIP_PR_R p = MST_SHIP_PR_R.create("P");
		r_bldr.addInnerJoin(p, bracket(t.xfr_schd_no.eq(p.xfr_schd_no)));
		r_bldr.addWhereWithAnd(p.ship_pr_no.eq(bind("1")), aship_pr_no);
		dbSelect("MSBEL5530_MST_XFR_SCHD_S05", r, r_bldr);
		return r.io_schd_pr_no();
	}

	/**
	 * 指図済かどうか
	 */
	protected boolean isInst(ShipInst_Chk01_DtlR r, String no) {
		return isSame(r.ship_inst_d_no(), no) && !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ());
	}
	/**
	 * 削除かどうか
	 */
	protected boolean isDel(ShipInst_Chk01_DtlR r, String no) {
		return isSame(r.ship_inst_d_no(), no) && MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ());
	}
	/**
	 * 出荷予定更新サービス電文設定up2
	 */
	protected MCList<Alloc_RsltR> setCnd_ShipSchd_Alloc_RsltR(MCList<ShipInst_Chk01_DtlR> up1L, MCList<ShipSchd_DtlR> schdL) {
		MCList<Alloc_RsltR> l = MCList.create(Alloc_RsltR.class);
		MCList<Srch_RsltR> rsltL = MCList.create(Srch_RsltR.class);
		
		// 行削除された指図明細
		MCList<ShipInst_Chk01_DtlR> delL =  createShipInst_Chk01_DtlL();
		for (MCList<ShipInst_Chk01_DtlR> lst : up1L.groupList(ShipInst_Chk01_DtlR.$ship_inst_d_no)) {
			MCList<ShipInst_Chk01_DtlR> up1L_del = lst.subList(r -> isDel(r, lst.get(0).ship_inst_d_no()));
			if (lst.size() == up1L_del.size()) {
				delL.add(lst.get(0));
			}
		}
		if (!delL.isEmpty()) {
			MCList<MST_SHIP_ALLOC_STS_SV_R> stsL = MCList.create(MST_SHIP_ALLOC_STS_SV_R.class);
			MST_SHIP_ALLOC_STS_SV_R t = MST_SHIP_ALLOC_STS_SV_R.create("T");
			MCQueryApiBuilder stsL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R s = MST_SHIP_SCHD_R.create("S");
			stsL_bldr.addInnerJoin(s, bracket(t.ship_schd_no.eq(s.ship_schd_no)));
			stsL_bldr.addWhereWithAnd(s.ship_inst_d_no.eq(bind("ship_inst_d_no")));
			stsL_bldr.addConstWhereWithAnd(t.ship_inst_no.isNotNull());
			dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_SV_S02", stsL, stsL_bldr, delL, null);
		
			l.addAll(setCnd_ShipSchd_Alloc_RsltR_Del(stsL, schdL, stsL_bldr));
		}

		Map<ShipInst_Chk01_DtlR, Alloc_RsltR> wmsMap = new HashMap<>();
		Map<ShipInst_Chk01_DtlR, ShipInst_Chk01_DtlR> up1Map = new HashMap<>();
		int peg = 0;
		MCIndexKey idx = object(CLAZZ)._allocRsltL.createIndex(Srch_RsltR.$peg_no);
		for (ShipInst_Chk01_DtlR up1R : up1L) {
			if (MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ()) || isNull(up1R.data_crud_typ())) {
				continue;
			}
			MCNumber remain_qty = MCNumber.ZERO;
			
			rsltL.init();
			if (!object(CLAZZ)._allocRsltL.isEmpty()) {
				rsltL = object(CLAZZ)._allocRsltL.subList(idx, up1R.peg_no());
			}
			if (rsltL.isEmpty()) {
				// 引当できなかった(しなかった）
				// 引当できない(しない)分のレコード作成
				Alloc_RsltR arR = Alloc_RsltR.create();
				setCnd_ShipSchd_Alloc_RsltR_notalloc(arR, up1R);
				l.add(arR);
			}
			else {
				// 引当できた
				remain_qty = up1R.alloc_base_unit_qty();

				for (Srch_RsltR rsltR : rsltL) {
					// 引当できた分のレコード作成
					Alloc_RsltR arR = Alloc_RsltR.create();
					copy(arR, rsltR, createMap_Alloc_RsltR_Srch_RsltR());
					arR.peg_no(up1R.tmp_inst_d_no());
					arR.alloc_flg(true);
					arR.alloc_scope_typ(up1R.alloc_scope_typ());
					arR.ent_unit_cd(up1R.alloc_ent_unit_cd());

					l.add(arR);

					// 残数
					remain_qty = remain_qty.subtract(rsltR.base_unit_qty());
					arR.wms_flg(up1R.wms_flg());

					if (isNull(up1R.alloc_loc_cd())) {
						// WMSフラグ設定用に退避
						ShipInst_Chk01_DtlR tmpR = up1R.clone();
						tmpR.peg_no(peg++);
						tmpR.alloc_loc_cd(rsltR.stk_loc_cd());
						tmpR.ship_lg_grp_cd(rsltR.stk_lg_grp_cd());
						wmsMap.put(tmpR, arR);

						up1R.wms_flg(false);		// 引当結果から再設定するのでクリア
						up1Map.put(tmpR, up1R);
					}
				}
				// 残数がある場合は未引当レコードを作成する
				if (remain_qty.isPositive()) {
					Alloc_RsltR arR = Alloc_RsltR.create();
					setCnd_ShipSchd_Alloc_RsltR_notalloc(arR, up1R);
					// 数量は残数で上書き
					arR.base_unit_qty(remain_qty);
					l.add(arR);
				}
			}
		}
		// 引当結果からWMSフラグを設定
		MCList<ShipInst_Chk01_DtlR> lst = MCList.create(ShipInst_Chk01_DtlR.class);
		wmsMap.keySet().forEach(k -> lst.add(k));
		setWmsFlg(lst);
		wmsMap.entrySet().forEach(e -> {
			e.getValue().wms_flg(e.getKey().wms_flg());
		});

		// WMSフラグの設定をコピー元(up1R)に設定する
		up1Map.entrySet().forEach(e -> {
			ShipInst_Chk01_DtlR up1R = e.getValue();
			if (!up1R.wms_flg()) {
				up1R.wms_flg(e.getKey().wms_flg());
			}
		});
		return l;
	}
	/**
	 * 出荷予定更新サービス電文設定up2未引当
	 */
	protected void setCnd_ShipSchd_Alloc_RsltR_notalloc(Alloc_RsltR destR, ShipInst_Chk01_DtlR up1R) {
		destR.peg_no(up1R.tmp_inst_d_no());
		destR.itm_cd(up1R.itm_cd());
		destR.itm_sub1(up1R.itm_sub1());
		destR.itm_sub2(up1R.itm_sub2());
		destR.itm_sub3(up1R.itm_sub3());
		destR.stk_loc_cd(up1R.alloc_loc_cd());
		destR.stk_str_ln_cd(up1R.alloc_str_ln_cd());
		destR.stk_lg_grp_cd(null);
		destR.quality_typ(up1R.quality_typ());
		destR.stk_insp_typ(up1R.stk_insp_typ());
		destR.stk_id_typ(up1R.stk_id_typ());
		destR.stk_arrv_bp_cd(up1R.stk_arrv_bp_cd());
		destR.stk_bp_cd(up1R.stk_bp_cd());
		destR.gd_cd(up1R.gd_cd());
		destR.lot_no(up1R.alloc_lot_no());
		destR.sublot_no(up1R.alloc_sublot_no());
		destR.sno1(up1R.alloc_sno1());
		destR.sno2(up1R.alloc_sno2());
		destR.sno3(up1R.alloc_sno3());
		destR.sno4(up1R.alloc_sno4());
		destR.ver_no(up1R.alloc_ver_no());
		if (up1R.alloc_flg()) {	// 指図一覧から引当対象外(まとめ以外)の時のみオンがありえる
			destR.pack_unit_cd(up1R.pack_unit_cd());
			destR.pack_unit_qty(up1R.pack_unit_qty());
			destR.alloc_flg(true);
		}
		else {
			destR.pack_unit_cd(null);
			destR.pack_unit_qty(null);
			destR.alloc_flg(false);
		}
		destR.base_unit_cd(up1R.alloc_base_unit_cd());
		destR.base_unit_qty(up1R.alloc_base_unit_qty());
		destR.ent_unit_cd(up1R.alloc_ent_unit_cd());
		destR.vld_dt_fr(up1R.valid_dt_from());
		destR.vld_dt_to(up1R.valid_dt_to());
		destR.alloc_scope_typ(up1R.alloc_scope_typ());
		destR.stk_lg_grp_cd(up1R.ship_lg_grp_cd());
		destR.wms_flg(up1R.wms_flg());
	}
	/**
	 * 出荷予定更新サービス電文設定up2指図取消
	 */
	protected MCList<Alloc_RsltR> setCnd_ShipSchd_Alloc_RsltR_Del(
			MCList<MST_SHIP_ALLOC_STS_SV_R> stsL, MCList<ShipSchd_DtlR> schdL, MCQueryApiBuilder stsL_bldr) {
		MCList<Alloc_RsltR> allocL = MCList.create(Alloc_RsltR.class);

		MCIndexKey schdIdx = schdL.createIndex(ShipSchd_DtlR.$ship_schd_no);
		MCList<MST_SHIP_ALLOC_STS_SV_R>[] gl = stsL.groupList(MST_SHIP_ALLOC_STS_SV_R.$ship_schd_no);
		for (MCList<MST_SHIP_ALLOC_STS_SV_R> l : gl) {
			MST_SHIP_SCHD_R ssR = schdL.getFirst(schdIdx, l.get(0).ship_schd_no()).ss();
			MCNumber ss_base_qty = ssR.base_unit_qty();
			for (MST_SHIP_ALLOC_STS_SV_R stsR : l) {

				Alloc_RsltR arR = Alloc_RsltR.create();
				copy(arR, stsR, createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_SV_R());
				ShipSchd_DtlR selectR = schdL.getFirst(ShipSchd_DtlR.$ship_schd_no, stsR.ship_schd_no());
				arR.peg_no(selectR.peg_no());
				arR.itm_cd(ssR.itm_cd());
				arR.itm_sub1(ssR.itm_sub1());
				arR.itm_sub2(ssR.itm_sub2());
				arR.itm_sub3(ssR.itm_sub3());
				arR.stk_lg_grp_cd(getLoc(stsR.ship_loc_cd()).lg_grp_cd());
				
				if (ss_base_qty.lt(stsR.base_unit_qty())) {
					// 出荷予定数量が引当数量より少ない
					MAVM_ITM_UNIT_R unitR = getItmUnit(ssR.itm_cd(), ssR.itm_sub1(), ssR.itm_sub2(), ssR.itm_sub3(), stsR.pack_unit_cd());
					MCNumber pack_q = rvrsBaseUnitConv(ss_base_qty, unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ());
					MAVM_ITM_UNIT_R baseUnitR = getItmUnit(ssR.itm_cd(), ssR.itm_sub1(), ssR.itm_sub2(), ssR.itm_sub3(), stsR.base_unit_cd());
					MCNumber base_q = convToBaseUnit(pack_q, unitR.conv_base_qty(), unitR.conv_qty(), baseUnitR.dec_place(), baseUnitR.rnd_typ());
					if(!isSame(base_q, ss_base_qty)) {
						// 荷姿単位に換算できないときは維持しない
						continue;
					}
					else {
						arR.base_unit_qty(ss_base_qty);
						arR.pack_unit_qty(pack_q);
					}
				}
				allocL.add(arR);

				ss_base_qty = ss_base_qty.subtract(stsR.base_unit_qty());
				if (!ss_base_qty.isPositive()) break;
			}
		}
		
		// 引当状況保存の削除
		dbDeleteKey("MSBEL5530_MST_SHIP_ALLOC_STS_SV_D01", stsL, stsL_bldr);
		
		return allocL;
	}

	/**
	 * GroupByPolicy
	 */
	protected MCGroupByPolicy groupByForSloSts() {
		MCGroupByPolicy gp = new MCGroupByPolicy(
				SloSts_DtlR.$slo_d_no,
				SloSts_DtlR.$slo_sts_typ,
				SloSts_DtlR.$unit_cd,
				SloSts_DtlR.$ship_lg_grp_cd,
				SloSts_DtlR.$iv_no,
				SloSts_DtlR.$iv_d_no,
				SloSts_DtlR.$dlv_slip_no,
				SloSts_DtlR.$dlv_slip_d_no,
				SloSts_DtlR.$biz_tm,
				SloSts_DtlR.$ship_inst_no
				);
		gp.sum(SloSts_DtlR.$qty);
		return gp;
	}
	/**
	 * インボイス登録サービスを実行する。
	 */
	protected void callIvRegSrv(MCList<ShipInst_Chk01_DtlR> dtlL) {
		
		MCList<MST_IV_MAP_R> ivMapL = getIvMap(dtlL);
		MCIndexKey idxkey = ivMapL.createIndex(MST_IV_MAP_R.$ship_schd_no);
				
		MSBEL_IvRegService.Iv_Upd02 ope = MSBEL_IvRegService.crtIv_Upd02();
		
		for (ShipInst_Chk01_DtlR dtlR : dtlL.distinctNE(ShipInst_Chk01_DtlR.$ship_inst_d_no, ShipInst_Chk01_DtlR.$iv_d_no)) {
			MST_IV_MAP_R ivMapR = ivMapL.getFirst(idxkey, dtlR.sas().ship_schd_no());
			if (!isNull(ivMapR)) {
				
				Iv_Upd02_Ctrl2R upR = Iv_Upd02_Ctrl2R.create();
				upR.ship_inst_d_no(dtlR.ship_inst_d_no());
				
				if (!isNull(dtlR.iv_d_no())) {
					upR.data_crud_typ(dtlR.data_crud_typ());
					upR.iv_no(dtlR.iv_no());
					upR.iv_d_no(dtlR.iv_d_no());
					upR.ship_schd_no(dtlR.sas().ship_schd_no());
					upR.base_unit_qty(dtlR.base_unit_qty());
					upR.ship_inst_fix_flg(true);
				}
				
				ope.up1().add(upR);
			}
		}
			
		if (!ope.up1().isEmpty()) {
			ope.up0().ship_inst_reg_flg(true);
			ope.exec();
		}
	}
	
	/**
	 * インボイスマップを取得する。
	 * @param dtlL 出荷指図明細リスト
	 * @return インボイスマップリスト
	 */
	protected MCList<MST_IV_MAP_R> getIvMap(MCList<ShipInst_Chk01_DtlR> dtlL) {
		
		MCList<MST_IV_MAP_R> bindL = MCList.create(MST_IV_MAP_R.class);
		for (ShipInst_Chk01_DtlR dltR : dtlL) {
			MST_IV_MAP_R bindR = MST_IV_MAP_R.create();
			bindR.ship_schd_no(dltR.sas().ship_schd_no());
			bindL.add(bindR);
		}
		
		MCList<MST_IV_MAP_R> ivMapL = MCList.create(MST_IV_MAP_R.class);
		
		MST_IV_MAP_R ivMap = MST_IV_MAP_R.create("IVMAP");
		
		MCQueryApiBuilder ivMap_bldr = MCQueryApiBuilder.create(ivMap);
		ivMap_bldr.setWhere(ivMap.ship_schd_no.eq(bind(MST_IV_MAP_R.$ship_schd_no)));
		
		dbSelect("MSBEL5530_MST_IV_MAP_S05", ivMapL, ivMap_bldr, bindL);
		
		return ivMapL;
	}
	
	/**
	 * インボイス出荷指図マップを取得する。
	 * @param bindL 出荷指図NOが格納されているリスト
	 * @return インボイス出荷指図マップリスト
	 */
	protected MCList<MST_IV_SHIP_INST_MAP_R> getIvShipInstMap(MCList<?> bindL) {
		
		MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = MCList.create(MST_IV_SHIP_INST_MAP_R.class);
		ivShipInstMapL.addStringColumn(MST_IV_R.$iv_no);
		
		MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
		MST_IV_D_R ivDR = MST_IV_D_R.create("IVD");
		MST_IV_R ivR = MST_IV_R.create("IV");
		MST_SHIP_INST_D_R shipInstD = MST_SHIP_INST_D_R.create("SHIPINSTD");
		
		MCQueryApiBuilder ivShipInstMap_bldr = MCQueryApiBuilder.create(ivShipInstMap);
		ivShipInstMap_bldr.addSelect(ivR.iv_no);
		
		ivShipInstMap_bldr.addInnerJoin(ivDR, ivShipInstMap.iv_d_no.eq(ivDR.iv_d_no));
		ivShipInstMap_bldr.addInnerJoin(ivR, ivDR.iv_mng_no.eq(ivR.iv_mng_no));
		ivShipInstMap_bldr.addInnerJoin(shipInstD, ivShipInstMap.ship_inst_d_no.eq(shipInstD.ship_inst_d_no));
		ivShipInstMap_bldr.setWhere(shipInstD.ship_inst_no.eq(bind(MST_SHIP_INST_D_R.$ship_inst_no)));
		
		dbSelect("MSBEL5530_MST_IV_SHIP_INST_MAP_S02", ivShipInstMapL, ivShipInstMap_bldr, bindL);
		
		return ivShipInstMapL;
	}


	/**
	 * 出荷引当状況取得
	 */
	protected void getShipAllocSts(MCList<ShipInst_Chk01_DtlR> up1L) {
		MST_SHIP_INST_D_R d = MST_SHIP_INST_D_R.create("D");
		MST_SHIP_INST_R h = MST_SHIP_INST_R.create("H");
		MST_SHIP_SCHD_R s = MST_SHIP_SCHD_R.create("S");
		MST_SHIP_PR_R p = MST_SHIP_PR_R.create("P");
		MST_SLO_D_R sd = MST_SLO_D_R.create("SD");
		MST_SLO_R sh = MST_SLO_R.create("SH");
		MST_DLV_INST_RCPT_R dr = MST_DLV_INST_RCPT_R.create("DR");
		MAM_ITM_R m1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R m2 = MAM_SUNDRY_ITM_R.create("M2");
		MSW_SHIP_INST_D_KEY_R w = MSW_SHIP_INST_D_KEY_R.create("W");
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_D_R.create("T"));
		MCList<MST_SHIP_INST_D_R> wkL = MCList.create(MST_SHIP_INST_D_R.class);
		for (ShipInst_Chk01_DtlR up2R : up1L.groupBy(ShipInst_Chk01_DtlR.$ship_inst_d_no)) {
			MST_SHIP_INST_D_R wkR = MST_SHIP_INST_D_R.create();
			wkR.ship_inst_d_no(up2R.ship_inst_d_no());
			wkL.add(wkR);
		}
		dbWkDelete("MSBEL5530_MSW_SHIP_INST_D_D01", wkL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5530_MSW_SHIP_INST_D_I01", wkL, wkL_bldr.getBaseDbc());

		_stsL.init();
		_stsL_bldr = MCQueryApiBuilder.create(_stsL_t);
		_stsL_bldr.setDistinct();
		_stsL_bldr.addSelect(sh.sls_dpt_cd, sh.sls_usr_cd, sh.cst_po_no);
		_stsL_bldr.addSelect(sh.slo_no, sh.wg_cd.as("sls_wg_cd"));
		_stsL_bldr.addSelect(sh.trd_cur_cd, sh.xrate, sh.ptax_xrate, sh.trd_rmrks);
		_stsL_bldr.addSelect(sd.trd_unit_qty.as("slo_qty"),
				sd.trd_unit_cd.as("slo_unit_cd"));
		_stsL_bldr.addSelect(sd.trd_cur_upri, sd.trd_cur_amt, sd.trd_cur_dscnt_amt);
		_stsL_bldr.addSelect(sd.tax_cd, sd.trd_cur_tax_amt);
		_stsL_bldr.addSelect(sd.cst_po_d_no, sd.cst_itm_cd, sd.cst_itm_nm);
		_stsL_bldr.addSelect(sd.slo_d_no);
		_stsL_bldr.addSelect(
						decode(p.slo_d_no, nullValue(), value(false),
								decode(s.stk_id_typ, value(MSC_STK_ID_TYP.CSTSTK.value()),
										value(false), sd.pri_prnt_flg)).as("pri_prnt_flg"));
		_stsL_bldr.addSelect(p.cst_cd);
		_stsL_bldr.addSelect(p.dlv_id_typ, nvl(s.dlv_cd, p.dlv_id_cd).as("dlv_id_cd"),
				nvl2(s.dlv_cd, s.dlv_nm, p.dlv_id_nm).as("dlv_id_nm"));
		_stsL_bldr.addSelect(nvl(s.dlv_zip_cd, p.dlv_zip_cd).as("dlv_zip_cd"),
				nvl2(s.dlv_cd, s.dlv_addr1, p.dlv_addr1).as("dlv_addr1"),
				nvl2(s.dlv_cd, s.dlv_addr2, p.dlv_addr2).as("dlv_addr2"),
				nvl2(s.dlv_cd, s.dlv_addr3, p.dlv_addr3).as("dlv_addr3"),
				nvl2(s.dlv_cd, s.dlv_addr4, p.dlv_addr4).as("dlv_addr4"));
		_stsL_bldr.addSelect(
				nvl2(s.dlv_cd, s.dlv_cntct_dpt, p.dlv_cntct_dpt).as("dlv_cntct_dpt"),
				nvl2(s.dlv_cd, s.dlv_cntct_psn, p.dlv_cntct_psn).as("dlv_cntct_psn"),
				nvl2(s.dlv_cd, s.dlv_tel, p.dlv_tel).as("dlv_tel"),
				nvl2(s.dlv_cd, s.dlv_fax, p.dlv_fax).as("dlv_fax"),
				nvl2(s.dlv_cd, s.dlv_sundry_flg, p.dlv_sundry_flg).as("dlv_sundry_flg"));
		_stsL_bldr.addSelect(s.dlv_inst_rcpt_no);
		_stsL_bldr.addSelect(h.ship_schd_tm, h.dlv_schd_tm, h.ship_inst_no);
		_stsL_bldr.addSelect(h.ship_fr_lg_grp_cd, h.wg_cd);
		_stsL_bldr.addSelect(h.inst_dpt_cd, h.inst_usr_cd);
		_stsL_bldr.addSelect(h.dlv_prnt_flg, h.dlv_prnt_tm, h.ship_adv_prnt_flg, h.ship_adv_prnt_tm);
		_stsL_bldr.addSelect(h.sub_char1.as("h_sub_char1"), h.sub_char2.as("h_sub_char2"),
				h.sub_char3.as("h_sub_char3"));
		_stsL_bldr.addSelect(d.disp_seq.as("d_disp_seq"));
		_stsL_bldr.addSelect(d.trd_cd, d.trd_ptn_typ);
		_stsL_bldr.addSelect(d.itm_cd, d.itm_sub1, d.itm_sub2, d.itm_sub3);
		_stsL_bldr.addSelect(d.rsn_cd, d.bd_dpt_cd, d.trd_d_rmrks);
		_stsL_bldr.addSelect(m1.sundry_itm_flg);
		_stsL_bldr.addSelect(decode(m1.sundry_itm_flg, value(true),
				nvl(m2.itm_nm, d.itm_nm), nullValue()).as("itm_nm"));
		_stsL_bldr.addSelect(dr.trd_unit_qty.as("dlv_inst_rcpt_qty"),
				dr.trd_unit_cd.as("dlv_inst_rcpt_unit_cd"));
		_stsL_bldr.addSelect(d.abort_flg);
		_stsL_bldr.addSelect(
						decode(p.slo_d_no, nullValue(), value(false),
								decode(s.stk_id_typ, value(MSC_STK_ID_TYP.CSTSTK.value()),
										value(true), value(false))).as("cststk_ship_flg"));
		_stsL_bldr.addSelect(decode(p.trd_ptn_typ, value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
						_stsL_t.ship_loc_cd, nullValue()).as("xfr_loc_cd"));
				_stsL_bldr.addSelect(d.base_ac_dt);
		_stsL_bldr.addInnerJoin(w, bracket( w.ship_inst_d_no.eq(_stsL_t.ship_inst_d_no)));
		_stsL_bldr.addLeftOuterJoin(d,
				bracket(_stsL_t.ship_inst_d_no.eq(d.ship_inst_d_no)));
		_stsL_bldr.addLeftOuterJoin(h, bracket(d.ship_inst_no.eq(h.ship_inst_no)));
		_stsL_bldr.addLeftOuterJoin(s, bracket(d.ship_inst_d_no.eq(s.ship_inst_d_no)));
		_stsL_bldr.addLeftOuterJoin(p, bracket(s.ship_pr_no.eq(p.ship_pr_no)));
		_stsL_bldr.addLeftOuterJoin(sd, bracket(p.slo_d_no.eq(sd.slo_d_no)));
		_stsL_bldr.addLeftOuterJoin(sh, bracket(sd.slo_no.eq(sh.slo_no)));
		_stsL_bldr.addLeftOuterJoin(dr,
				bracket(s.dlv_inst_rcpt_no.eq(dr.dlv_inst_rcpt_no)));
		_stsL_bldr.addLeftOuterJoin(m1, bracket(d.itm_cd.eq(m1.itm_cd)
						.and(d.itm_sub1.eq(m1.itm_sub1))
						.and(d.itm_sub2.eq(m1.itm_sub2))
						.and(d.itm_sub3.eq(m1.itm_sub3))));
		_stsL_bldr.addLeftOuterJoin(m2, bracket(d.itm_cd.eq(m2.itm_cd)
						.and(d.itm_sub1.eq(m2.itm_sub1))
						.and(d.itm_sub2.eq(m2.itm_sub2))
						.and(d.itm_sub3.eq(m2.itm_sub3))
						.and(_stsL_t.sno1.eq(m2.sno1))
						.and(_stsL_t.sno2.eq(m2.sno2))
						.and(_stsL_t.sno3.eq(m2.sno3))
						.and(_stsL_t.sno4.eq(m2.sno4))));
		_stsL_bldr.setOrderByAsc(d.disp_seq, _stsL_t.disp_seq);
		dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_S08", _stsL, _stsL_bldr);
	}

	/**
	 * 納品伝票出力
	 */
	protected void prntDlvSlip(MCList<ShipInst_Chk01_HdrR> up0L, ShipInst_Ins01_CndR cndR) { 
		MCList<ShipRprt_Upd01_DtlR> rslt = updDlvSlip(up0L, cndR);
		
		aftrCallPrntDlvSlip(rslt, up0L);
		updShipInst(up0L);
		updShipAllocSts();
		
		if (!rslt.isEmpty()) {
			callPrntDlvSlip(up0L, cndR);
		}
	}

	/**
	 * 出荷帳票発行サービス呼び出し
	 */
	protected MCList<ShipRprt_Upd01_DtlR> updDlvSlip(MCList<ShipInst_Chk01_HdrR> up0L, ShipInst_Ins01_CndR cndR) {
		MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Upd01();
		MCList<MST_SHIP_ALLOC_STS_R> delDlvL = bfrShipRprt_Upd01();
		setShipRprt_Upd01(o, up0L, delDlvL);
		o.up2().bndl_prnt_flg(cndR.bndl_prnt_flg());
		o.exec();
		return o.down0();
	}
	
	protected MCList<MST_SHIP_ALLOC_STS_R> bfrShipRprt_Upd01() {
		// 更新前の納品書ＮＯを引き継ぐ
		MCIndexKey idx = _orgStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
		MCList<MST_SHIP_ALLOC_STS_R> stsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		for (MST_SHIP_ALLOC_STS_R r : _stsL) {
			MST_SHIP_ALLOC_STS_R orgR = _orgStsL.getFirst(idx, r.ship_alloc_sts_no());
			if (isSame(r.getStringNE("abort_flg"), "1")) continue;
			if (!isNull(orgR)) {
				r.dlv_slip_no(orgR.dlv_slip_no());
				r.dlv_slip_seq(orgR.dlv_slip_seq());
				r.dlv_slip_d_no(orgR.dlv_slip_d_no());
			}
			if (!isNull(r.dlv_slip_no())) {
				stsL.add(r);
			}
		}
		
		// 作成しなおす分
		MCList<MST_SHIP_ALLOC_STS_R> delDlvL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		for (MCList<MST_SHIP_ALLOC_STS_R> stsGL : stsL.groupList(MST_SHIP_ALLOC_STS_R.$ship_inst_no)) {
			
			MCList<MST_SHIP_ALLOC_STS_R>[] dlvGL = stsGL.groupList(MST_SHIP_ALLOC_STS_R.$dlv_slip_no);
			List<MCList<MST_SHIP_ALLOC_STS_R>> remakeL = new ArrayList<>();
			
			boolean remake = false;
			for (MCList<MST_SHIP_ALLOC_STS_R> dlvL : dlvGL) {
				MCNumber min = (MCNumber)dlvL.min(MST_SHIP_ALLOC_STS_R.$ship_act_qty);
				MCNumber max = (MCNumber)dlvL.max(MST_SHIP_ALLOC_STS_R.$ship_act_qty);
				
				if (min.isZero() && max.isPositive()) {
					// 納品書ＮＯ内に未出荷と出荷済みが混在する場合、未出荷分は納品書ＮＯをクリアする
					dlvL.subList(r -> r.ship_act_qty().isZero()).forEach(r -> {
						r.dlv_slip_no(null);
						r.dlv_slip_d_no(null);
					});
					// また指図内に納品書が複数存在する場合は、
					// 納品書に混在していた未出荷分を含めて納品書を作成しなおす
					if (dlvGL.length > 1) {
						remake = true;
					}
				}
				else if (min.isZero() && max.isZero()) {
					// 未出荷分はまとめて作成しなおす
					remakeL.add(dlvL);
				}
			}
			if (remake) {
				for (MCList<MST_SHIP_ALLOC_STS_R> l : remakeL) {
					// 作成しなおす納品書は削除する
					delDlvL.add(l.get(0).clone());
					l.forEach(r -> {
						r.dlv_slip_no(null);
						r.dlv_slip_d_no(null);
					});
				}
			}
		}
		
		// 削除する分
		idx = _stsL.createIndex(MST_SHIP_ALLOC_STS_R.$dlv_slip_no);
		MCIndexKey instIdx = _stsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_inst_no);
		for (MST_SHIP_ALLOC_STS_R r: _orgStsL.distinctNE(MST_SHIP_ALLOC_STS_R.$dlv_slip_no)) {
			MST_SHIP_ALLOC_STS_R stsR = _stsL.getFirst(idx, r.dlv_slip_no());
			if (isNull(stsR)
				&& existAct(_stsL.subList(instIdx, r.ship_inst_no()))) {
				// 行削除によって不要になった納品書は削除する
				delDlvL.add(r);
			}
		}
		
		return delDlvL;
	}

	/**
	 * 出荷帳票発行サービス電文設定
	 */
	protected void setShipRprt_Upd01(
		MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o,
		MCList<ShipInst_Chk01_HdrR> up0L, MCList<MST_SHIP_ALLOC_STS_R> delDlvL) {
		int i = 0;
		MCIndexKey up0Idx = up0L.createIndex(ShipInst_Chk01_HdrR.$ship_inst_no);
		if (!isNull(delDlvL)) {
			// 作成しなおす納品書を削除する（発行済みの場合は取消の納品書が発行する）
			for (MST_SHIP_ALLOC_STS_R r : delDlvL.distinctNE(MST_SHIP_ALLOC_STS_R.$dlv_slip_no)) {
				ShipInst_Chk01_HdrR up0R = up0L.getFirst(up0Idx, r.ship_inst_no());
				ShipRprt_Upd01_HdrR hdrR = o.up0().add();
				hdrR.hdr_peg_no(i++);
				hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				hdrR.dlv_slip_prnt_flg(up0R.dlv_prnt_flg());
				hdrR.ship_adv_prnt_flg(up0R.adv_prnt_flg());
				hdrR.dlv_slip_no(r.dlv_slip_no());
				hdrR.setAttributes(up0R);
			}
		}
		
		MCIndexKey idx = _stsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_inst_no);
		for (MCList<MST_SHIP_ALLOC_STS_R> l : rprtGrpList()) {
			l.sort("d_disp_seq", "disp_seq");
		
			if (existAct(l)) {
				continue;
			}
			ShipRprt_Upd01_HdrR hdrR = ShipRprt_Upd01_HdrR.create();
			copy(hdrR, l.get(0), createMap_ShipRprt_Upd01_HdrR_MST_SHIP_ALLOC_STS_R());
			hdrR.hdr_peg_no(i++);
			ShipInst_Chk01_HdrR up0R = up0L.getFirst(up0Idx, l.get(0).getStringNE("ship_inst_no"));
			hdrR.data_crud_typ(up0R.data_crud_typ());
			if (existAct(_stsL.subList(idx, hdrR.dlv_slip_inst_no()))) {
				hdrR.dlv_slip_no(l.get(0).dlv_slip_no());
				if (isNull(hdrR.dlv_slip_no())) {
					hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
			}
			hdrR.dlv_slip_prnt_flg(up0R.dlv_prnt_flg());
			hdrR.ship_adv_prnt_flg(up0R.adv_prnt_flg());
			
			o.up0().add(hdrR);
			
			for (MST_SHIP_ALLOC_STS_R r : l) {
				if (isSame(r.getStringNE("abort_flg"), "1")) continue;
				
				ShipRprt_Upd01_DtlR dtlR = ShipRprt_Upd01_DtlR.create();
				copy(dtlR, r, createMap_ShipRprt_Upd01_DtlR_MST_SHIP_ALLOC_STS_R());
				dtlR.hdr_peg_no(hdrR.hdr_peg_no());
				
				dtlR.base_cur_upri(convToBaseCur(dtlR.trd_cur_upri(), hdrR.xrate(), getBaseCur().upri_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), hdrR.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.base_cur_dscnt_amt(convToBaseCur(dtlR.trd_cur_dscnt_amt(), hdrR.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), hdrR.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				
				o.up1().add(dtlR);
			}
		}
	}
	
	protected List<MCList<MST_SHIP_ALLOC_STS_R>> rprtGrpList() {
		// 指図内に実績が含まれる場合、納品書ＮＯごとに出荷帳票発行サービスを実行する（実績が含まれる納品書は更新しないので）
		// 指図内に実績が含まれない場合、出荷指図ＮＯごとに出荷帳票発行サービスを実行する
		String[] defKey = getGrpCols();
		List<MCList<MST_SHIP_ALLOC_STS_R>> arr = new ArrayList<>();
		for (MCList<MST_SHIP_ALLOC_STS_R> instL : _stsL.groupList(MST_SHIP_ALLOC_STS_R.$ship_inst_no)) {
			String[] key;
			if (existAct(instL)) {
				key = new String[defKey.length + 1];
				System.arraycopy(defKey, 0, key, 0, defKey.length);
				key[key.length - 1] = "dlv_slip_no";
			}
			else {
				key = defKey;
			}
			for (MCList<MST_SHIP_ALLOC_STS_R> gl : instL.groupList(key)) {
				arr.add(gl);
			}
		}
		return arr;
	}
	protected boolean existAct(MCList<MST_SHIP_ALLOC_STS_R> stsL) {
		for (MST_SHIP_ALLOC_STS_R r : stsL) {
			if (r.ship_act_qty().isPositive()) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * グルーピング用配列作成
	 */
	protected String[] getGrpCols() {
		return new String[]{
				"slo_no",
				"ship_inst_no",
				"sls_dpt_cd",
				"sls_usr_cd",
				"ship_schd_tm",
				"dlv_schd_tm",
				"trd_cd",
				"trd_ptn_typ",
				"cst_po_no",
				"pri_prnt_flg",
				"trd_cur_cd",
				"xrate",
				"ptax_xrate",
				"cst_cd",
				"dlv_id_typ",
				"dlv_id_cd",
				"dlv_id_nm",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_tel",
				"dlv_fax",
				"dlv_sundry_flg",
				"xfr_loc_cd",	// 支給返品の時に出荷場所を設定
				"ship_fr_lg_grp_cd",
				"wg_cd",
				"cststk_ship_flg",
				"trd_rmrks",
				"h_sub_char1",
				"h_sub_char2",
				"h_sub_char3"
		};
	}

	/**
	 * 出荷帳票発行サービス
	 */
	protected void callPrntDlvSlip(MCList<ShipInst_Chk01_HdrR> up0L, ShipInst_Ins01_CndR cndR) {
		MSBEL_ShipRprtPrntService.ShipRprt_Prnt02 o = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt02();
		MCList<ShipRprt_Prnt02_HdrR> hdrL = MCList.create(ShipRprt_Prnt02_HdrR.class);
		addAll(hdrL, up0L, createMap_ShipRprt_Prnt02_HdrR_ShipInst_Chk01_HdrR());
		o.up0().addAll(hdrL);
		o.up1().bndl_prnt_flg(cndR.bndl_prnt_flg());
		o.up1().bndl_inst_prnt_flg(cndR.bndl_inst_prnt_flg());
		o.exec();
	}

	protected void aftrCallPrntDlvSlip(MCList<ShipRprt_Upd01_DtlR> rslt, MCList<ShipInst_Chk01_HdrR> up0L) {
		MCIndexKey up0Idx = up0L.createIndex(ShipInst_Chk01_HdrR.$ship_inst_no);
		MCIndexKey stsIdx = _stsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
		for (ShipRprt_Upd01_DtlR r : rslt) {
			MST_SHIP_ALLOC_STS_R selectR = _stsL.getFirst(stsIdx, r.dtl_uniq_no());
			if (!isNull(selectR)) {
				selectR.dlv_slip_d_no(r.dlv_slip_d_no());
				selectR.dlv_slip_no(r.dlv_slip_no());
				selectR.dlv_slip_seq(r.dlv_slip_seq());
				
				ShipInst_Chk01_HdrR up0R = up0L.getFirst(up0Idx, selectR.ship_inst_no());
				up0R.setBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg,
					up0R.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg) || r.upded_flg());
				if (up0R.dlv_prnt_flg()) {
					up0R.setBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg,
						up0R.getBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg) || r.dlv_slip_prnted_flg());
				}
				if (up0R.adv_prnt_flg()) {
					up0R.setBooleanNE(ShipRprt_Upd01_DtlR.$ship_adv_prnted_flg,
						up0R.getBooleanNE(ShipRprt_Upd01_DtlR.$ship_adv_prnted_flg) || r.ship_adv_prnted_flg());
				}
			}
		}
	}
	
	/**
	 * 出荷指図ヘッダを更新する
	 */
	protected void updShipInst(MCList<ShipInst_Chk01_HdrR> up0L) {
		// 発行済フラグ、発行日時を更新する
		MCIndexKey stsIdx = _stsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_inst_no);
		MCList<MST_SHIP_INST_R> updL = MCList.create(MST_SHIP_INST_R.class);
		MCDate sysnow = MCDate.now();
		for (ShipInst_Chk01_HdrR up0R : up0L) {
			MST_SHIP_INST_R updR = updL.add();
			updR.ship_inst_no(up0R.ship_inst_no());
			
			// 発行済み
			if (up0R.getBooleanNE(ShipRprt_Upd01_DtlR.$dlv_slip_prnted_flg)) {
				updR.dlv_prnt_flg(true);
				updR.dlv_prnt_tm(sysnow);
			}
			// 未発行かつ登録対象
			else if (up0R.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg)) {
				updR.dlv_prnt_flg(false);
				MST_SHIP_ALLOC_STS_R bfrR = _stsL.getFirst(stsIdx, up0R.ship_inst_no());
				if (!isNull(bfrR)) {
					updR.dlv_prnt_tm(bfrR.getDateNE(MST_SHIP_INST_R.$dlv_prnt_tm));
				}
				else {
					updR.dlv_prnt_tm(null);
				}
			}
			// 未発行かつ登録対象外（更新前の納品書と同じ内容なので登録不要）
			else {
				MST_SHIP_ALLOC_STS_R bfrR = _stsL.getFirst(stsIdx, up0R.ship_inst_no());
				if (!isNull(bfrR)) {
					updR.dlv_prnt_flg(
						MCBooleanUtil.dbStringToBoolean(bfrR.getStringNE(MST_SHIP_INST_R.$dlv_prnt_flg)));
					updR.dlv_prnt_tm(bfrR.getDateNE(MST_SHIP_INST_R.$dlv_prnt_tm));
				}
			}
			
			if (up0R.getBooleanNE(ShipRprt_Upd01_DtlR.$ship_adv_prnted_flg)) {
				updR.ship_adv_prnt_flg(true);
				updR.ship_adv_prnt_tm(sysnow);
			}
			else if (up0R.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg)) {
				updR.ship_adv_prnt_flg(false);
				MST_SHIP_ALLOC_STS_R bfrR = _stsL.getFirst(stsIdx, up0R.ship_inst_no());
				if (!isNull(bfrR)) {
					updR.ship_adv_prnt_tm(bfrR.getDateNE(MST_SHIP_INST_R.$ship_adv_prnt_tm));
				}
				else {
					updR.ship_adv_prnt_tm(null);
				}
			}
			else {
				MST_SHIP_ALLOC_STS_R bfrR = _stsL.getFirst(stsIdx, up0R.ship_inst_no());
				if (!isNull(bfrR)) {
					updR.ship_adv_prnt_flg(
						MCBooleanUtil.dbStringToBoolean(bfrR.getStringNE(MST_SHIP_INST_R.$ship_adv_prnt_flg)));
					updR.ship_adv_prnt_tm(bfrR.getDateNE(MST_SHIP_INST_R.$ship_adv_prnt_tm));
				}
			}
		}
		MST_SHIP_INST_R act = MST_SHIP_INST_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(act);
		bldr.setSet(
			act.dlv_prnt_flg, act.dlv_prnt_tm, act.ship_adv_prnt_flg, act.ship_adv_prnt_tm
		);
		dbUpdateKey("MSBEL5530_MST_SHIP_INST_U03", updL, bldr);
	}

	/**
	 * 出荷引当状況更新
	 */
	protected void updShipAllocSts() {
		_stsL_bldr.setSet(_stsL_t.dlv_slip_d_no, _stsL_t.dlv_slip_no, _stsL_t.dlv_slip_seq);
		dbUpdateKey("MSBEL5530_MST_SHIP_ALLOC_STS_U02", _stsL, _stsL_bldr);
	}

	/**
	 * 受払予定区分を取得する<br>
	 */
	protected String getIoSchdTyp(ShipInst_Chk01_DtlR up1R, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCList<ShipSchd_Chk01_DtlR> up2L_sub = up2L.subList("tmp_inst_d_no", up1R.tmp_inst_d_no());
		String trdPtnTyp = up1R.trd_ptn_typ();
		String stk_id_typ = up2L_sub.get(0).ss().stk_id_typ();
		MCNumber ship_act_qty = MCNumber.ZERO;
		for (ShipSchd_Chk01_DtlR up2R : up2L_sub) {
			ship_act_qty = ship_act_qty.add(up2R.ss().ship_act_qty());
		}

		return getIoSchdTypForShip(
				trdPtnTyp,
				stk_id_typ,
				ship_act_qty.isPositive(),
				isEx(up2L_sub.get(0)));
	}

	/**
	 * 輸出取引（輸出実績を登録するパタン）かを判定する
	 * @param prR
	 * @return
	 */
	protected boolean isEx(ShipSchd_Chk01_DtlR up2R) {
		// インボイス取引、かつ配送先を経由する
		boolean iv_trd_flg = up2R.iv_trd_flg() || up2R.cst_iv_flg();
		return iv_trd_flg && MAC_VIA_DLV_TYP.isVIA(nvl(up2R.ss().via_dlv_typ(), up2R.sp().via_dlv_typ()));
	}

	/**
	 * 受払予定状況区分を取得する
	 */
	protected String getIoSchdStsTyp(ShipInst_Chk01_DtlR up1R, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCList<ShipSchd_Chk01_DtlR> up2L_sub = up2L.subList("tmp_inst_d_no", up1R.tmp_inst_d_no());
		ShipSchd_Chk01_DtlR up2R = up2L_sub.get(0);
		MCNumber ship_inst_qty = up2L.sum("ss.ship_inst_qty");
		MCNumber ship_act_qty = up2L.sum("ss.ship_act_qty");
		MCNumber iv_act_qty = up2L.sum("ss.iv_act_qty");

		return getIoSchdStsTypForShip(
			up1R.trd_ptn_typ(),
			up2R.ss().dlv_inst_rcpt_no(),
			up2R.ss().slo_prms_no(),
			up2R.sp().purc_ddlv_flg(),
			nvl(ship_inst_qty, MCNumber.ZERO).isPositive(),
			nvl(ship_act_qty, MCNumber.ZERO).isPositive()
					&& !isNull(up1R.sas()) && nvl(up1R.sas().ship_act_qty(), MCNumber.ZERO).isPositive(),
			nvl(iv_act_qty, MCNumber.ZERO).isPositive(), up2R.ss().stk_id_typ());
	}
	/**
	 * 出荷指図送信ＩＦサービスの呼び出し
	 */
	protected void callShipInstSendIf(MCList<ShipInst_Chk01_DtlR> up1L) {

		MCList<ShipInst_Chk01_DtlR>
			sendL = MCList.create(ShipInst_Chk01_DtlR.class),
			crtUpdL = MCList.create(ShipInst_Chk01_DtlR.class);

		for (ShipInst_Chk01_DtlR r : up1L) {
			if (r.wms_flg()) {
				sendL.add(r);
			}
			if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				// 新規、更新がある場合は出荷引当状況が変わっているので再取得する
				crtUpdL.add(r);
			}
		}

		if (!crtUpdL.isEmpty()) {
			// 登録・更新後に発番された出荷引当状況を取得する
			MCList<MST_SHIP_ALLOC_STS_R> dbc = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.ship_inst_no, t.ship_alloc_sts_no);
			dbc_bldr.setWhere(t.ship_inst_no.eq(bind("ship_inst_no")));
			dbc_bldr.addWhereWithAnd(t.wms_flg.eq(value(true)));
			dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_S09", dbc, dbc_bldr,
					crtUpdL.groupBy(ShipInst_Chk01_DtlR.$ship_inst_no));

			MCIndexKey up1LIdx = up1L.createIndex(ShipInst_Chk01_DtlR.$ship_alloc_sts_no);
			for (MST_SHIP_ALLOC_STS_R r : dbc) {
				ShipInst_Chk01_DtlR up1R = up1L.getFirst(up1LIdx, r.ship_alloc_sts_no());
				if (isNull(up1R)) {
					ShipInst_Chk01_DtlR sendR = sendL.add();
					sendR.ship_inst_no(r.ship_inst_no());
					sendR.ship_alloc_sts_no(r.ship_alloc_sts_no());
					sendR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (!MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ())) {
					up1R.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
		if (!sendL.isEmpty()) {
			MSLAL_ShipInstSendIfService.ShipInstSendIf_Upd01 o = MSLAL_ShipInstSendIfService.crtShipInstSendIf_Upd01();
			setAll(o.up0(), sendL, createMap_ShipInstSendIf_Upd01_DtlR_ShipInst_Chk01_DtlR());
			o.exec();
		}
	}
	protected Map_ShipInstSendIf_Upd01_DtlR_ShipInst_Chk01_DtlR<ShipInstSendIf_Upd01_DtlR,ShipInst_Chk01_DtlR> createMap_ShipInstSendIf_Upd01_DtlR_ShipInst_Chk01_DtlR() {
		return new Map_ShipInstSendIf_Upd01_DtlR_ShipInst_Chk01_DtlR<ShipInstSendIf_Upd01_DtlR, ShipInst_Chk01_DtlR>();
	}
	public class Map_ShipInstSendIf_Upd01_DtlR_ShipInst_Chk01_DtlR<D extends ShipInstSendIf_Upd01_DtlR, S extends ShipInst_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.ship_inst_no(src.ship_inst_no());
			dest.ship_alloc_sts_no(src.ship_alloc_sts_no());
			dest.data_crud_typ(nvl(src.data_crud_typ(), MAC_DATA_CRUD_TYP.UPD.value()));
		}
	}
	
	/**
	 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
	 * @param up0L
	 */
	protected void callRevDataIns01(MCList<MST_SHIP_INST_R> up0L) {

		MCQueryApiBuilder up0L_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
		dbWkDelete("MSBEL5530_MSW_SHIP_INST_D01", up0L_bldr.getBaseDbc());
		MCList<MST_SHIP_INST_R> up0L2 = up0L.groupBy(up0L_bldr.getBaseDbc().getKeyColumn());
		dbWkInsert("MSBEL5530_MSW_SHIP_INST_I01", up0L2, up0L_bldr.getBaseDbc());
		
		MCList<MST_SHIP_INST_R> hdrL = MCList.create(MST_SHIP_INST_R.class);
		MST_SHIP_INST_R hdrL_t = MST_SHIP_INST_R.create("T");
		MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(hdrL_t);
		MSW_SHIP_INST_KEY_R w = MSW_SHIP_INST_KEY_R.create("W");
		hdrL_bldr.setSelect(hdrL_t.ship_inst_no, hdrL_t.ship_inst_rev);
		hdrL_bldr.addInnerJoin(w, bracket(hdrL_t.ship_inst_no.eq(w.ship_inst_no)));
		dbSelect("MSBEL5530_MST_SHIP_INST_S03", hdrL, hdrL_bldr);
		
		MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
		for (MST_SHIP_INST_R hdrR : hdrL) {
			RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
			opeR.rev_data_src_no(hdrR.ship_inst_no());
			opeR.rev_no(hdrR.ship_inst_rev());
			opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_INST.value());
			ope.up0().add(opeR);
		}
		ope.exec();
	}


	protected void callRevDataIns01ForUpd02(MCList<ShipInst_Upd02_DtlR> up0L) {

		MCList<MST_SHIP_INST_R> bindL = createBindRevDataIns01(up0L);

		MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
		for (MST_SHIP_INST_R bindR : bindL) {
			RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
			opeR.rev_data_src_no(bindR.ship_inst_no());
			opeR.rev_no(bindR.ship_inst_rev());
			opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_INST.value());
			ope.up0().add(opeR);
		}
		ope.exec();
	}

	protected MCList<MST_SHIP_INST_R> createBindRevDataIns01(MCList<ShipInst_Upd02_DtlR> up0L) {
		MCQueryApiBuilder instDWKBldr = MCQueryApiBuilder.create(MST_SHIP_INST_D_R.create("T"));
		dbWkDelete("MSBEL5530_MSW_SHIP_INST_D_D01", instDWKBldr.getBaseDbc());
		dbWkInsert("MSBEL5530_MSW_SHIP_INST_D_I01", up0L.groupBy(ShipInst_Upd02_DtlR.$ship_inst_d_no), instDWKBldr.getBaseDbc());

		MCList<MST_SHIP_INST_R> bindL = MCList.create(MST_SHIP_INST_R.class);
		MST_SHIP_INST_R inst = MST_SHIP_INST_R.create("INST");
		MST_SHIP_INST_D_R instD = MST_SHIP_INST_D_R.create("INSTD");
		MSW_SHIP_INST_D_KEY_R instDK = MSW_SHIP_INST_D_KEY_R.create("WKINSTD");
		MCQueryApiBuilder instBldr = MCQueryApiBuilder.create(inst);

		instBldr.setSelect(inst.ship_inst_no, inst.ship_inst_rev);
		instBldr.addInnerJoin(instD, bracket(inst.ship_inst_no.eq(instD.ship_inst_no)));
		instBldr.addInnerJoin(instDK, bracket(instD.ship_inst_d_no.eq(instDK.ship_inst_d_no)));
		dbSelect("MSBEL5530_MST_SHIP_INST_S04", bindL, instBldr);
		
		dbWkDelete("MSBEL5530_MSW_SHIP_INST_D_D02", instDWKBldr.getBaseDbc());
		
		return bindL;
	}
	
	/**
	 * WMS対象フラグを取得・設定する
	 */
	protected void setWmsFlg(MCList<ShipInst_Chk01_DtlR> up1L) {

		MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

		for (ShipInst_Chk01_DtlR up1R : up1L) {

			SCMLinkUtil_Srch01_CndR r = o.up0().add();
			r.peg_no(up1R.peg_no());
			r.if_proc_typ(MAC_IF_PROC_TYP.WMS_SHIP_INST_SEND.value());
			r.loc_cd(up1R.alloc_loc_cd());
			r.lg_grp_cd(up1R.ship_lg_grp_cd());
			if (MSC_DLV_ID_TYP.isDLV(up1R.getStringNE(_tmp_dlv_id_typ))) {
				r.dlv_cd(up1R.getStringNE(_tmp_dlv_id_cd));
			}
			else if (MSC_DLV_ID_TYP.isLOC(up1R.getStringNE(_tmp_dlv_id_typ))) {
				r.gr_loc_cd(up1R.getStringNE(_tmp_dlv_id_cd));
			}
			r.master_dt(getToday());
		}
		if (!o.up0().isEmpty()) {
			o.exec();

			MCIndexKey idx = o.down0().createIndex(SCMLinkUtil_Srch01_CndR.$peg_no);
			for (ShipInst_Chk01_DtlR up1R : up1L) {
				SCMLinkUtil_Srch01_CndR dR = o.down0().getFirst(idx, up1R.peg_no());
				if (!isNull(dR)) {
					up1R.wms_flg(!isNull(dR.ext_sys_cd()));
				}
			}
		}
	}

	/**
	 * 送信対象のリストを取得する
	 */
	protected MCList<ShipInst_Chk01_DtlR> getSendIfL(MCList<ShipInst_Chk01_DtlR> up1L, MCList<ShipSchd_Chk01_DtlR> up2L) {
		MCList<ShipInst_Chk01_DtlR>
			sendL = MCList.create(ShipInst_Chk01_DtlR.class),
			chgL = MCList.create(ShipInst_Chk01_DtlR.class);

		MCIndexKey
			stsIdx = _orgStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no),
			up2LIdx = up2L.createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);

		for (ShipInst_Chk01_DtlR r : up1L) {
			r = r.clone();
			r.ship_alloc_sts_no(r.getStringNE(_org_ship_alloc_sts_no));
			if (r.wms_flg()) {
				sendL.add(r);
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				// 今回WMSはオフだが、前回送信時から場所が変更された場合は送信対象とする
				// 送信するかはSCMIF制御マスタ次第
				MST_SHIP_ALLOC_STS_R stsR = _orgStsL.getFirst(stsIdx, r.ship_alloc_sts_no());
				ShipSchd_Chk01_DtlR ssR = up2L.getFirst(up2LIdx, r.tmp_inst_d_no());
				if (!isNull(stsR) && !isNull(ssR)) {
					if (stsR.wms_flg() && !isSame(r.alloc_loc_cd(), stsR.ship_loc_cd())) {
						r.alloc_loc_cd(stsR.ship_loc_cd());
						chgL.add(r);
					}
				}
			}
		}
		if (!chgL.isEmpty()) {
			setWmsFlg(chgL);
			sendL.addAll(chgL.subList(r -> r.wms_flg()));
		}

		return sendL;
	}

	/**
	 * 送信後訂正不可チェック
	 * 
	 * @param up0L	WMS対象の出荷指図NOを含むリスト
	 */
	protected <E extends MCRow>MCMessageList chkSendIf(MCList<E> up0L) {
		// up0Lは送信対象のみ(本メソッドを実行する前に絞り込んでおく)
		MCMessageList msgL = new MCMessageList();
		MCList<MST_SHIP_INST_SEND_IF_R> sendOkL = MCList.create(MST_SHIP_INST_SEND_IF_R.class);
		MST_SHIP_INST_SEND_IF_R t = MST_SHIP_INST_SEND_IF_R.create("T");
		MCQueryApiBuilder sendOkL_bldr = MCQueryApiBuilder.create(t);
		PFT_SDRV_IF_R t1 = PFT_SDRV_IF_R.create("T1");
		sendOkL_bldr.setSelect(t.ship_inst_no);
		sendOkL_bldr.setDistinct();
		sendOkL_bldr.addInnerJoin(t1, bracket(t1.data_no.eq(t.data_no)));
		sendOkL_bldr.setWhere(t.ship_inst_no.eq(bind("ship_inst_no")));
		sendOkL_bldr.addConstWhereWithAnd(t1.not_send_upd_flg.eq(value(true))
				.and(t1.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.SEND_OK.value()))));
		dbSelect("MSBEL5530_MST_SHIP_INST_SEND_IF_S01", sendOkL, sendOkL_bldr, up0L, null);
		MCIndexKey sendOkIdx = sendOkL.createIndex(MST_SHIP_INST_SEND_IF_R.$ship_inst_no);
		for (MCRow r : up0L) {
			MST_SHIP_INST_SEND_IF_R sendOkR = sendOkL.getFirst(sendOkIdx, r.getString("ship_inst_no"));
			if (!isNull(sendOkR)) {
				msgL.add(new MCMessage(r, null, MSBEL1045, r.getString("ship_inst_no")));
			}
		}
		return msgL;
	}
	/**
	 * 与信の更新対象を扱うクラス
	 */
	public class CredList {
		protected Map<Set<String>, Cred_Upd01_CndR> _credMap;
		public CredList() {
			init();
		}
		protected Cred_Upd01_CndR get(String cstCd, String curCd) {
			Set<String> key = createKey(cstCd, curCd);
			if (!_credMap.containsKey(key)) {
				// 存在しない場合は追加する
				Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
				credR.cst_cd(cstCd);
				credR.cur_cd(curCd);
				credR.trd_ptn_typ(MAC_TRD_PTN_TYP.SLS.value());
				credR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD_CHK.value());
				credR.amt(0);
				_credMap.put(key, credR);
			}
			return _credMap.get(key);
		}
		protected MCList<Cred_Upd01_CndR> toMCList() {
			MCList<Cred_Upd01_CndR> list = MCList.create(Cred_Upd01_CndR.class);
			_credMap.entrySet().forEach(r -> {
				list.add(r.getValue());
			});
			return list;
		}
		protected Set<String> createKey(String cstCd, String curCd) {
			Set<String> key = new HashSet<>();
			key.add(cstCd);
			key.add(curCd);
			return key;
		}
		protected void init() {
			_credMap = new HashMap<>();
		}
	}

	/**
	 * 与信の更新対象
	 */
	protected CredList _credL = new CredList();

	/**
	 * 与信更新
	 */
	protected void callCredUpd() {
		MCList<Cred_Upd01_CndR> credL = _credL.toMCList().subList(r -> !r.amt().isZero());
		if (!credL.isEmpty()) {
			MSBGL_CredService.Cred_Upd01 o = MSBGL_CredService.crtCred_Upd01();
			o.up0().setAll(credL);
			o.exec();
			if (!o.down1().isEmpty()){
				MCMessageList msgList = new MCMessageList();
				for (Cred_Upd01_ErrR errR : o.down1()) {

					MCMessage msg = new MCMessage(MSBBL0124, errR.cred_cd(), errR.cur_cd(), errR.cred_amt(), errR.cred_limit());
					msgList.add(msg);
				}

				MCAppException ex = new MCAppException(msgList.get(0));
				msgList.remove(0);
				ex.addCauseMessageList(msgList);

				throw ex;
			}
		}
	}

	/**
	 * 与信更新対象のレコードを取得する
	 * @param up0L	「出荷指図ＮＯ」を含んだリスト
	 * @return	与信更新対象のリスト
	 */
	protected MCList<MST_DLV_SLIP_D_R> getCredTgtL(MCList<?> up0L) {

		MCList<MST_DLV_SLIP_D_R> tgtL = MCList.create(MST_DLV_SLIP_D_R.class);
		tgtL.addStringColumn("ship_schd_no");
		tgtL.addStringColumn("trd_cur_cd");
		tgtL.addStringColumn("cst_cd");
		tgtL.addStringColumn("sls_amt_rnd_typ");
		tgtL.addStringColumn("sls_tax_rnd_typ");
		tgtL.addNumberColumn("amt_dec_place");
		tgtL.addNumberColumn("ship_schd_qty");
		tgtL.addNumberColumn("ship_inst_qty");
		tgtL.addNumberColumn("ship_act_qty");
		tgtL.addNumberColumn("abort_qty");
		tgtL.addNumberColumn("slo_trd_cur_amt");
		tgtL.addNumberColumn("slo_trd_cur_tax_amt");
		tgtL.addBooleanColumn(MAM_BP_R.$cst_iv_flg);

		MCList<MST_SHIP_INST_R> shipInstDbc = MCList.create(MST_SHIP_INST_R.class);
		MCQueryApiBuilder shipInstDbc_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
		up0L.forEach(r -> shipInstDbc.add().ship_inst_no(r.getStringNE("ship_inst_no")));
		dbWkDelete("MSBEL5530_MSW_SHIP_INST_D02", shipInstDbc_bldr.getBaseDbc());
		dbWkInsert("MSBEL5530_MSW_SHIP_INST_I02", shipInstDbc.groupBy(shipInstDbc_bldr.getBaseDbc().getKeyColumn()), shipInstDbc_bldr.getBaseDbc());
		// 指図時 or 訂正前 or 取消前のいずれか時点の金額
		MCList<MST_DLV_SLIP_D_R> dlvL = tgtL.clone();
		MST_DLV_SLIP_D_R dlvL_t = MST_DLV_SLIP_D_R.create("T");
		MCQueryApiBuilder dlvL_bldr = MCQueryApiBuilder.create(dlvL_t);
		MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");
		MCTempView t3 = createTempView("T3");
		MSW_SHIP_INST_KEY_R S1W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_ALLOC_STS_R S1W2 = MST_SHIP_ALLOC_STS_R.create("W2");
		dlvL_bldr.addGroupBy(t3.pr(S1W2.ship_schd_no));
		dlvL_bldr.addGroupFunc(nvl(sum(dlvL_t.trd_cur_amt), value(0)), "trd_cur_amt");
		dlvL_bldr.addGroupFunc(nvl(sum(dlvL_t.trd_cur_tax_amt), value(0)), "trd_cur_tax_amt");
		dlvL_bldr.addInnerJoin(t2, bracket(t2.dlv_slip_no.eq(dlvL_t.dlv_slip_no)
				.and(t2.dlv_slip_seq.eq(dlvL_t.dlv_slip_seq))));
		dlvL_bldr.addInnerJoin(subQuery()
				.selectDistinct(S1W2.dlv_slip_no, S1W2.dlv_slip_seq, S1W2.dlv_slip_d_no, S1W2.ship_schd_no)
				.from(S1W1.innerJoin(S1W2).on(bracket(S1W2.ship_inst_no.eq(S1W1.ship_inst_no))))
				.view(t3),
				bracket(t3.pr(S1W2.dlv_slip_no).eq(t2.dlv_slip_no)
						.and(t3.pr(S1W2.dlv_slip_seq).eq(t2.dlv_slip_seq))
						.and(t3.pr(S1W2.dlv_slip_d_no).eq(dlvL_t.dlv_slip_d_no))));
		dlvL_bldr.setWhere(t2.dlv_slip_inst_no.eq(bind("ship_inst_no")));
		dlvL_bldr.addConstWhereWithAnd(
				t2.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value()))
				.and(t2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))));
		dbSelect("MSBEL5530_MST_DLV_SLIP_D_S02", dlvL, dlvL_bldr, up0L, null);
		MCIndexKey dlvIdx = dlvL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
		dbWkDelete("MSBEL5530_MSW_SHIP_INST_D03", shipInstDbc_bldr.getBaseDbc());

		// 予定数 or 打切数
		MCList<MST_SHIP_SCHD_R> ssL = MCList.create(MST_SHIP_SCHD_R.class);
		MST_SHIP_SCHD_R ssL_t = MST_SHIP_SCHD_R.create("T");
		MCQueryApiBuilder ssL_bldr = MCQueryApiBuilder.create(ssL_t);
		MST_SHIP_INST_D_R t4 = MST_SHIP_INST_D_R.create("T4");
		MST_SHIP_PR_R t5 = MST_SHIP_PR_R.create("T5");
		ssL_bldr.setSelect(ssL_t.ship_schd_no, ssL_t.base_unit_qty, ssL_t.ship_inst_qty,
				ssL_t.ship_act_qty, ssL_t.abort_qty, t5.slo_d_no);
		ssL_bldr.addInnerJoin(t4, bracket(t4.ship_inst_d_no.eq(ssL_t.ship_inst_d_no)));
		ssL_bldr.addInnerJoin(t5, bracket(t5.ship_pr_no.eq(ssL_t.ship_pr_no)));
		ssL_bldr.setWhere(t4.ship_inst_no.eq(bind("ship_inst_no")));
		ssL_bldr.addConstWhereWithAnd(
				t5.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())));
		dbSelect("MSBEL5530_MST_SHIP_SCHD_S06", ssL, ssL_bldr, up0L, null);

		// 受注明細の金額
		MCList<MST_SLO_D_R> sloL = MCList.create(MST_SLO_D_R.class);
		sloL.addBooleanColumn(MAM_BP_R.$cst_iv_flg);
		
		MST_SLO_D_R sloL_t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(sloL_t);
		MST_SLO_R t6 = MST_SLO_R.create("T6");
		MAM_BP_R m1 = MAM_BP_R.create("M1");
		MAM_CUR_R m2 = MAM_CUR_R.create("M2");
		sloL_bldr.setSelect(sloL_t.slo_d_no, sloL_t.base_unit_qty, sloL_t.sls_cststk_flg,
				nvl(sloL_t.trd_cur_amt, value(0)).as("trd_cur_amt"),
				nvl(sloL_t.trd_cur_tax_amt, value(0)).as("trd_cur_tax_amt"), t6.cst_cd,
				t6.trd_cur_cd, m1.sls_amt_rnd_typ, m1.sls_tax_rnd_typ, m1.cst_iv_flg ,m2.amt_dec_place);
		sloL_bldr.addInnerJoin(t6, bracket(t6.slo_no.eq(sloL_t.slo_no)));
		sloL_bldr.addLeftOuterJoin(m1, bracket(m1.bp_cd.eq(t6.cst_cd)));
		sloL_bldr.addLeftOuterJoin(m2, bracket(m2.cur_cd.eq(t6.trd_cur_cd)));
		sloL_bldr.setWhere(sloL_t.slo_d_no.eq(bind("slo_d_no")));
		dbSelect("MSBEL5530_MST_SLO_D_S04", sloL, sloL_bldr, ssL);
		MCIndexKey sloIdx = sloL.createIndex(MST_SLO_D_R.$slo_d_no);

		// 出荷予定ごとに集計
		for (MST_SHIP_SCHD_R ssR : ssL) {
			MST_SLO_D_R sloR = sloL.getFirst(sloIdx, ssR.getString("slo_d_no"));
			if (sloR.sls_cststk_flg()) {
				continue;
			}
			
			MST_DLV_SLIP_D_R dlvR = dlvL.getFirst(dlvIdx, ssR.ship_schd_no());
			
			if (isNull(dlvR)) {
				dlvR = tgtL.createRow();
				dlvR.setString("ship_schd_no", ssR.ship_schd_no());
				dlvR.slo_d_no(ssR.getString("slo_d_no"));
				dlvR.trd_cur_amt(0);
				dlvR.trd_cur_tax_amt(0);
			}
			dlvR.setNumber("ship_schd_qty", ssR.base_unit_qty());
			dlvR.setNumber("ship_inst_qty", ssR.ship_inst_qty());
			dlvR.setNumber("ship_act_qty", ssR.ship_act_qty());
			dlvR.setNumber("abort_qty", ssR.abort_qty());
			dlvR.setNumber("slo_qty", sloR.base_unit_qty());
			dlvR.setNumber("slo_trd_cur_amt", sloR.trd_cur_amt());
			dlvR.setNumber("slo_trd_cur_tax_amt", sloR.trd_cur_tax_amt());
			dlvR.setString("cst_cd", sloR.getString("cst_cd"));
			dlvR.setString("trd_cur_cd", sloR.getString("trd_cur_cd"));
			dlvR.setString("sls_amt_rnd_typ", sloR.getString("sls_amt_rnd_typ"));
			dlvR.setString("sls_tax_rnd_typ", sloR.getString("sls_tax_rnd_typ"));
			dlvR.setNumber("amt_dec_place", sloR.getNumber("amt_dec_place"));
			dlvR.setBooleanNE(MAM_BP_R.$cst_iv_flg, sloR.getBooleanNE(MAM_BP_R.$cst_iv_flg));

			tgtL.add(dlvR);
		}

		return tgtL;	
	}

	protected Map_MSW_ALLOC_LOC_MAP_R_ShipInst_Chk01_DtlR<MSW_ALLOC_LOC_MAP_R,ShipInst_Chk01_DtlR> createMap_MSW_ALLOC_LOC_MAP_R_ShipInst_Chk01_DtlR() {
		return new Map_MSW_ALLOC_LOC_MAP_R_ShipInst_Chk01_DtlR<MSW_ALLOC_LOC_MAP_R, ShipInst_Chk01_DtlR>();
	}

	public class Map_MSW_ALLOC_LOC_MAP_R_ShipInst_Chk01_DtlR<D extends MSW_ALLOC_LOC_MAP_R, S extends ShipInst_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, ShipInst_Chk01_DtlR.$itm_cd);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, ShipInst_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, ShipInst_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, ShipInst_Chk01_DtlR.$itm_sub3);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			if (!isNull(src.alloc_loc_cd())) {
				dest.gi_loc_cd(src.alloc_loc_cd());
			}
			else if (!isNull(src.ship_loc_cd())) {
				dest.gi_loc_cd(src.ship_loc_cd());
			}
			else {
				dest.gi_lg_grp_cd(src.ship_lg_grp_cd());
			}
			dest.alloc_scope_typ(src.alloc_scope_typ());
		}
	}

	protected Map_MST_SHIP_INST_R_ShipInst_Chk01_HdrR<MST_SHIP_INST_R,ShipInst_Chk01_HdrR> createMap_MST_SHIP_INST_R_ShipInst_Chk01_HdrR() {
		return new Map_MST_SHIP_INST_R_ShipInst_Chk01_HdrR<MST_SHIP_INST_R, ShipInst_Chk01_HdrR>();
	}

	public class Map_MST_SHIP_INST_R_ShipInst_Chk01_HdrR<D extends MST_SHIP_INST_R, S extends ShipInst_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SHIP_INST_R.$ship_inst_no, ShipInst_Chk01_HdrR.$ship_inst_no);
			addColumnPathMap(MST_SHIP_INST_R.$ship_fr_lg_grp_cd, ShipInst_Chk01_HdrR.$ship_fr_lg_grp_cd);
			addColumnPathMap(MST_SHIP_INST_R.$wg_cd, ShipInst_Chk01_HdrR.$wg_cd);
			addColumnPathMap(MST_SHIP_INST_R.$ship_schd_tm, ShipInst_Chk01_HdrR.$ship_schd_tm);
			addColumnPathMap(MST_SHIP_INST_R.$dlv_schd_tm, ShipInst_Chk01_HdrR.$dlv_schd_tm);
			addColumnPathMap(MST_SHIP_INST_R.$ship_wk_cd, ShipInst_Chk01_HdrR.$ship_wk_cd);
			addColumnPathMap(MST_SHIP_INST_R.$ship_term_cd, ShipInst_Chk01_HdrR.$ship_term_cd);
			addColumnPathMap(MST_SHIP_INST_R.$inst_dpt_cd, ShipInst_Chk01_HdrR.$inst_dpt_cd);
			addColumnPathMap(MST_SHIP_INST_R.$inst_usr_cd, ShipInst_Chk01_HdrR.$inst_usr_cd);
			addColumnPathMap(MST_SHIP_INST_R.$ship_inst_tm, ShipInst_Chk01_HdrR.$ship_inst_tm);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_lg_grp_cd, ShipInst_Chk01_HdrR.$ship_to_lg_grp_cd);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_id_typ, ShipInst_Chk01_HdrR.$ship_to_id_typ);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_id_cd, ShipInst_Chk01_HdrR.$ship_to_id_cd);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_zip_cd, ShipInst_Chk01_HdrR.$ship_to_zip_cd);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_addr1, ShipInst_Chk01_HdrR.$ship_to_addr1);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_addr2, ShipInst_Chk01_HdrR.$ship_to_addr2);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_addr3, ShipInst_Chk01_HdrR.$ship_to_addr3);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_addr4, ShipInst_Chk01_HdrR.$ship_to_addr4);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_cntct_dpt, ShipInst_Chk01_HdrR.$ship_to_cntct_dpt);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_cntct_psn, ShipInst_Chk01_HdrR.$ship_to_cntct_psn);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_tel, ShipInst_Chk01_HdrR.$ship_to_tel);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_fax, ShipInst_Chk01_HdrR.$ship_to_fax);
			addColumnPathMap(MST_SHIP_INST_R.$ship_to_sundry_flg, ShipInst_Chk01_HdrR.$ship_to_sundry_flg);
			addColumnPathMap(MST_SHIP_INST_R.$via_dlv_typ, ShipInst_Chk01_HdrR.$via_dlv_typ);
			addColumnPathMap(MST_SHIP_INST_R.$iv_no, ShipInst_Chk01_HdrR.$iv_no);
			addColumnPathMap(MST_SHIP_INST_R.$pick_prnt_flg, ShipInst_Chk01_HdrR.$pck_prnt_flg);
			addColumnPathMap(MST_SHIP_INST_R.$ship_inst_prnt_flg, ShipInst_Chk01_HdrR.$ship_prnt_flg);
			addColumnPathMap(MST_SHIP_INST_R.$intr_rmrks, ShipInst_Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(MST_SHIP_INST_R.$inst_rmrks, ShipInst_Chk01_HdrR.$inst_rmrks);
			addColumnPathMap(MST_SHIP_INST_R.$sub_char1, ShipInst_Chk01_HdrR.$sub_char1);
			addColumnPathMap(MST_SHIP_INST_R.$sub_char2, ShipInst_Chk01_HdrR.$sub_char2);
			addColumnPathMap(MST_SHIP_INST_R.$sub_char3, ShipInst_Chk01_HdrR.$sub_char3);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (src.ship_to_sundry_flg()) {
				dest.ship_to_id_nm(src.ship_to_id_nm());
			}
			else {
				dest.ship_to_id_nm(null);
			}
			if (src.pck_prnt_flg()) {
				dest.pick_prnt_tm(MCDate.now());
			}
			if (src.ship_prnt_flg()) {
				dest.ship_inst_prnt_tm(MCDate.now());
			}
		}
	}

	protected Map_MST_SHIP_INST_D_R_ShipInst_Chk01_DtlR<MST_SHIP_INST_D_R,ShipInst_Chk01_DtlR> createMap_MST_SHIP_INST_D_R_ShipInst_Chk01_DtlR() {
		return new Map_MST_SHIP_INST_D_R_ShipInst_Chk01_DtlR<MST_SHIP_INST_D_R, ShipInst_Chk01_DtlR>();
	}

	public class Map_MST_SHIP_INST_D_R_ShipInst_Chk01_DtlR<D extends MST_SHIP_INST_D_R, S extends ShipInst_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SHIP_INST_D_R.$ship_inst_d_no, ShipInst_Chk01_DtlR.$ship_inst_d_no);
			addColumnPathMap(MST_SHIP_INST_D_R.$ship_inst_no, ShipInst_Chk01_DtlR.$ship_inst_no);
			addColumnPathMap(MST_SHIP_INST_D_R.$disp_seq, ShipInst_Chk01_DtlR.$disp_seq);
			addColumnPathMap(MST_SHIP_INST_D_R.$ship_loc_cd, ShipInst_Chk01_DtlR.$ship_loc_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$ship_str_ln_cd, ShipInst_Chk01_DtlR.$ship_str_ln_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$ship_lg_grp_cd, ShipInst_Chk01_DtlR.$ship_lg_grp_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$dlv_str_ln_cd, ShipInst_Chk01_DtlR.$dlv_str_ln_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$trd_cd, ShipInst_Chk01_DtlR.$trd_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$trd_ptn_typ, ShipInst_Chk01_DtlR.$trd_ptn_typ);
			addColumnPathMap(MST_SHIP_INST_D_R.$itm_cd, ShipInst_Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$itm_sub1, ShipInst_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_SHIP_INST_D_R.$itm_sub2, ShipInst_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_SHIP_INST_D_R.$itm_sub3, ShipInst_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MST_SHIP_INST_D_R.$iv_itm_nm, ShipInst_Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(MST_SHIP_INST_D_R.$sundry_itm_flg, ShipInst_Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(MST_SHIP_INST_D_R.$sno1, ShipInst_Chk01_DtlR.$sno1);
			addColumnPathMap(MST_SHIP_INST_D_R.$sno1_null_flg, ShipInst_Chk01_DtlR.$sno1_null_flg);
			addColumnPathMap(MST_SHIP_INST_D_R.$sno2, ShipInst_Chk01_DtlR.$sno2);
			addColumnPathMap(MST_SHIP_INST_D_R.$sno2_null_flg, ShipInst_Chk01_DtlR.$sno2_null_flg);
			addColumnPathMap(MST_SHIP_INST_D_R.$sno3, ShipInst_Chk01_DtlR.$sno3);
			addColumnPathMap(MST_SHIP_INST_D_R.$sno3_null_flg, ShipInst_Chk01_DtlR.$sno3_null_flg);
			addColumnPathMap(MST_SHIP_INST_D_R.$sno4, ShipInst_Chk01_DtlR.$sno4);
			addColumnPathMap(MST_SHIP_INST_D_R.$sno4_null_flg, ShipInst_Chk01_DtlR.$sno4_null_flg);
			addColumnPathMap(MST_SHIP_INST_D_R.$lot_no, ShipInst_Chk01_DtlR.$lot_no);
			addColumnPathMap(MST_SHIP_INST_D_R.$sublot_no, ShipInst_Chk01_DtlR.$sublot_no);
			addColumnPathMap(MST_SHIP_INST_D_R.$ver_no, ShipInst_Chk01_DtlR.$ver_no);
			addColumnPathMap(MST_SHIP_INST_D_R.$stk_arrv_bp_cd, ShipInst_Chk01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$gd_cd, ShipInst_Chk01_DtlR.$gd_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$quality_typ, ShipInst_Chk01_DtlR.$quality_typ);
			addColumnPathMap(MST_SHIP_INST_D_R.$stk_insp_typ, ShipInst_Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(MST_SHIP_INST_D_R.$stk_id_typ, ShipInst_Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(MST_SHIP_INST_D_R.$stk_bp_cd, ShipInst_Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$trd_unit_qty, ShipInst_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(MST_SHIP_INST_D_R.$trd_unit_cd, ShipInst_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$base_unit_qty, ShipInst_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(MST_SHIP_INST_D_R.$base_unit_cd, ShipInst_Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$rsn_cd, ShipInst_Chk01_DtlR.$rsn_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$bd_dpt_cd, ShipInst_Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(MST_SHIP_INST_D_R.$not_lot_mix_flg, ShipInst_Chk01_DtlR.$not_lot_mix_flg);
			addColumnPathMap(MST_SHIP_INST_D_R.$not_sublot_mix_flg, ShipInst_Chk01_DtlR.$not_sublot_mix_flg);
			addColumnPathMap(MST_SHIP_INST_D_R.$vld_dt_fr, ShipInst_Chk01_DtlR.$valid_dt_from);
			addColumnPathMap(MST_SHIP_INST_D_R.$vld_dt_to, ShipInst_Chk01_DtlR.$valid_dt_to);
			addColumnPathMap(MST_SHIP_INST_D_R.$base_dlv_slip_no, ShipInst_Chk01_DtlR.$base_dlv_slip_no);
			addColumnPathMap(MST_SHIP_INST_D_R.$base_prov_act_no, ShipInst_Chk01_DtlR.$base_prov_act_no);
			addColumnPathMap(MST_SHIP_INST_D_R.$base_ac_dt, ShipInst_Chk01_DtlR.$base_ac_dt);
			addColumnPathMap(MST_SHIP_INST_D_R.$ship_cnt_rmrks, ShipInst_Chk01_DtlR.$ship_cnt_rmrks);
			addColumnPathMap(MST_SHIP_INST_D_R.$trd_rmrks, ShipInst_Chk01_DtlR.$trd_rmrks);
			addColumnPathMap(MST_SHIP_INST_D_R.$trd_d_rmrks, ShipInst_Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(MST_SHIP_INST_D_R.$intr_d_rmrks, ShipInst_Chk01_DtlR.$intr_d_rmrks);
			addColumnPathMap(MST_SHIP_INST_D_R.$inst_d_rmrks, ShipInst_Chk01_DtlR.$inst_d_rmrks);
			addColumnPathMap(MST_SHIP_INST_D_R.$sub_char1, ShipInst_Chk01_DtlR.$sub_char1);
			addColumnPathMap(MST_SHIP_INST_D_R.$sub_char2, ShipInst_Chk01_DtlR.$sub_char2);
			addColumnPathMap(MST_SHIP_INST_D_R.$sub_char3, ShipInst_Chk01_DtlR.$sub_char3);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (src.sundry_itm_flg()) {
				dest.itm_nm(src.itm_nm());
			}
			else {
				dest.itm_nm(null);
			}
		}
	}

	protected Map_ShipSchd_DtlR_MST_SHIP_SCHD_R<ShipSchd_DtlR,MST_SHIP_SCHD_R> createMap_ShipSchd_DtlR_MST_SHIP_SCHD_R() {
		return new Map_ShipSchd_DtlR_MST_SHIP_SCHD_R<ShipSchd_DtlR, MST_SHIP_SCHD_R>();
	}

	public class Map_ShipSchd_DtlR_MST_SHIP_SCHD_R<D extends ShipSchd_DtlR, S extends MST_SHIP_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipSchd_DtlR.$ship_schd_no, MST_SHIP_SCHD_R.$ship_schd_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_pr_no, MST_SHIP_SCHD_R.$ship_pr_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_inst_d_no, MST_SHIP_SCHD_R.$ship_inst_d_no);
			addColumnPathMap(ShipSchd_DtlR.$dlv_inst_rcpt_no, MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
			addColumnPathMap(ShipSchd_DtlR.$slo_prms_no, MST_SHIP_SCHD_R.$slo_prms_no);
			addColumnPathMap(ShipSchd_DtlR.$sls_act_d_no, MST_SHIP_SCHD_R.$sls_act_d_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_fr_lg_grp_cd, MST_SHIP_SCHD_R.$ship_fr_lg_grp_cd);
			addColumnPathMap(ShipSchd_DtlR.$wg_cd, MST_SHIP_SCHD_R.$wg_cd);
			addColumnPathMap(ShipSchd_DtlR.$pd_inst_dlv_tm, MST_SHIP_SCHD_R.$pd_inst_dlv_tm);
			addColumnPathMap(ShipSchd_DtlR.$ship_rqst_tm, MST_SHIP_SCHD_R.$ship_rqst_tm);
			addColumnPathMap(ShipSchd_DtlR.$ship_schd_tm, MST_SHIP_SCHD_R.$ship_schd_tm);
			addColumnPathMap(ShipSchd_DtlR.$dlv_schd_tm, MST_SHIP_SCHD_R.$dlv_schd_tm);
			addColumnPathMap(ShipSchd_DtlR.$ship_term_cd, MST_SHIP_SCHD_R.$ship_term_cd);
			addColumnPathMap(ShipSchd_DtlR.$ship_wk_cd, MST_SHIP_SCHD_R.$ship_wk_cd);
			addColumnPathMap(ShipSchd_DtlR.$itm_cd, MST_SHIP_SCHD_R.$itm_cd);
			addColumnPathMap(ShipSchd_DtlR.$itm_sub1, MST_SHIP_SCHD_R.$itm_sub1);
			addColumnPathMap(ShipSchd_DtlR.$itm_sub2, MST_SHIP_SCHD_R.$itm_sub2);
			addColumnPathMap(ShipSchd_DtlR.$itm_sub3, MST_SHIP_SCHD_R.$itm_sub3);
			addColumnPathMap(ShipSchd_DtlR.$itm_nm, MST_SHIP_SCHD_R.$itm_nm);
			addColumnPathMap(ShipSchd_DtlR.$iv_itm_nm, MST_SHIP_SCHD_R.$iv_itm_nm);
			addColumnPathMap(ShipSchd_DtlR.$sundry_itm_flg, MST_SHIP_SCHD_R.$sundry_itm_flg);
			addColumnPathMap(ShipSchd_DtlR.$sno1, MST_SHIP_SCHD_R.$sno1);
			addColumnPathMap(ShipSchd_DtlR.$sno1_null_flg, MST_SHIP_SCHD_R.$sno1_null_flg);
			addColumnPathMap(ShipSchd_DtlR.$sno2, MST_SHIP_SCHD_R.$sno2);
			addColumnPathMap(ShipSchd_DtlR.$sno2_null_flg, MST_SHIP_SCHD_R.$sno2_null_flg);
			addColumnPathMap(ShipSchd_DtlR.$sno3, MST_SHIP_SCHD_R.$sno3);
			addColumnPathMap(ShipSchd_DtlR.$sno3_null_flg, MST_SHIP_SCHD_R.$sno3_null_flg);
			addColumnPathMap(ShipSchd_DtlR.$sno4, MST_SHIP_SCHD_R.$sno4);
			addColumnPathMap(ShipSchd_DtlR.$sno4_null_flg, MST_SHIP_SCHD_R.$sno4_null_flg);
			addColumnPathMap(ShipSchd_DtlR.$lot_no, MST_SHIP_SCHD_R.$lot_no);
			addColumnPathMap(ShipSchd_DtlR.$sublot_no, MST_SHIP_SCHD_R.$sublot_no);
			addColumnPathMap(ShipSchd_DtlR.$ver_no, MST_SHIP_SCHD_R.$ver_no);
			addColumnPathMap(ShipSchd_DtlR.$stk_arrv_bp_cd, MST_SHIP_SCHD_R.$stk_arrv_bp_cd);
			addColumnPathMap(ShipSchd_DtlR.$gd_cd, MST_SHIP_SCHD_R.$gd_cd);
			addColumnPathMap(ShipSchd_DtlR.$quality_typ, MST_SHIP_SCHD_R.$quality_typ);
			addColumnPathMap(ShipSchd_DtlR.$stk_id_typ, MST_SHIP_SCHD_R.$stk_id_typ);
			addColumnPathMap(ShipSchd_DtlR.$stk_bp_cd, MST_SHIP_SCHD_R.$stk_bp_cd);
			addColumnPathMap(ShipSchd_DtlR.$base_unit_cd, MST_SHIP_SCHD_R.$base_unit_cd);
			addColumnPathMap(ShipSchd_DtlR.$fix_flg, MST_SHIP_SCHD_R.$fix_flg);
			addColumnPathMap(ShipSchd_DtlR.$ship_block_flg, MST_SHIP_SCHD_R.$ship_block_flg);
			addColumnPathMap(ShipSchd_DtlR.$not_lot_mix_flg, MST_SHIP_SCHD_R.$not_lot_mix_flg);
			addColumnPathMap(ShipSchd_DtlR.$not_sublot_mix_flg, MST_SHIP_SCHD_R.$not_sublot_mix_flg);
			addColumnPathMap(ShipSchd_DtlR.$vld_dt_fr, MST_SHIP_SCHD_R.$vld_dt_fr);
			addColumnPathMap(ShipSchd_DtlR.$vld_dt_to, MST_SHIP_SCHD_R.$vld_dt_to);
			addColumnPathMap(ShipSchd_DtlR.$re_ship_schd_flg, MST_SHIP_SCHD_R.$re_ship_schd_flg);
			addColumnPathMap(ShipSchd_DtlR.$base_dlv_slip_no, MST_SHIP_SCHD_R.$base_dlv_slip_no);
			addColumnPathMap(ShipSchd_DtlR.$base_prov_act_no, MST_SHIP_SCHD_R.$base_prov_act_no);
			addColumnPathMap(ShipSchd_DtlR.$base_ac_dt, MST_SHIP_SCHD_R.$base_ac_dt);
			addColumnPathMap(ShipSchd_DtlR.$intr_rmrks, MST_SHIP_SCHD_R.$intr_rmrks);
			addColumnPathMap(ShipSchd_DtlR.$trd_rmrks, MST_SHIP_SCHD_R.$trd_rmrks);
			addColumnPathMap(ShipSchd_DtlR.$trd_d_rmrks, MST_SHIP_SCHD_R.$trd_d_rmrks);
			addColumnPathMap(ShipSchd_DtlR.$ship_cnt_rmrks, MST_SHIP_SCHD_R.$ship_cnt_rmrks);
			addColumnPathMap(ShipSchd_DtlR.$sub_char1, MST_SHIP_SCHD_R.$sub_char1);
			addColumnPathMap(ShipSchd_DtlR.$sub_char2, MST_SHIP_SCHD_R.$sub_char2);
			addColumnPathMap(ShipSchd_DtlR.$sub_char3, MST_SHIP_SCHD_R.$sub_char3);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.not_dt_calc_flg(true);
			dest.ship_schd_split_flg(false);
			dest.ship_judge_flg(false);
			dest.is_src_ship_inst_flg(true);
		}
	}
	
	protected Map_Alloc_RsltR_Srch_RsltR<Alloc_RsltR,Srch_RsltR> createMap_Alloc_RsltR_Srch_RsltR() {
		return new Map_Alloc_RsltR_Srch_RsltR<Alloc_RsltR, Srch_RsltR>();
	}

	public class Map_Alloc_RsltR_Srch_RsltR<D extends Alloc_RsltR, S extends Srch_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Alloc_RsltR.$itm_cd, Srch_RsltR.$itm_cd);
			addColumnPathMap(Alloc_RsltR.$itm_sub1, Srch_RsltR.$itm_sub1);
			addColumnPathMap(Alloc_RsltR.$itm_sub2, Srch_RsltR.$itm_sub2);
			addColumnPathMap(Alloc_RsltR.$itm_sub3, Srch_RsltR.$itm_sub3);
			addColumnPathMap(Alloc_RsltR.$ver_no, Srch_RsltR.$ver_no);
			addColumnPathMap(Alloc_RsltR.$stk_loc_cd, Srch_RsltR.$stk_loc_cd);
			addColumnPathMap(Alloc_RsltR.$stk_str_ln_cd, Srch_RsltR.$stk_str_ln_cd);
			addColumnPathMap(Alloc_RsltR.$stk_lg_grp_cd, Srch_RsltR.$stk_lg_grp_cd);
			addColumnPathMap(Alloc_RsltR.$quality_typ, Srch_RsltR.$quality_typ);
			addColumnPathMap(Alloc_RsltR.$stk_insp_typ, Srch_RsltR.$stk_insp_typ);
			addColumnPathMap(Alloc_RsltR.$stk_id_typ, Srch_RsltR.$stk_id_typ);
			addColumnPathMap(Alloc_RsltR.$stk_arrv_bp_cd, Srch_RsltR.$stk_arrv_bp_cd);
			addColumnPathMap(Alloc_RsltR.$stk_bp_cd, Srch_RsltR.$stk_bp_cd);
			addColumnPathMap(Alloc_RsltR.$gd_cd, Srch_RsltR.$gd_cd);
			addColumnPathMap(Alloc_RsltR.$lot_no, Srch_RsltR.$lot_no);
			addColumnPathMap(Alloc_RsltR.$sublot_no, Srch_RsltR.$sublot_no);
			addColumnPathMap(Alloc_RsltR.$sno1, Srch_RsltR.$sno1);
			addColumnPathMap(Alloc_RsltR.$sno2, Srch_RsltR.$sno2);
			addColumnPathMap(Alloc_RsltR.$sno3, Srch_RsltR.$sno3);
			addColumnPathMap(Alloc_RsltR.$sno4, Srch_RsltR.$sno4);
			addColumnPathMap(Alloc_RsltR.$pack_unit_cd, Srch_RsltR.$pack_unit_cd);
			addColumnPathMap(Alloc_RsltR.$pack_unit_qty, Srch_RsltR.$pack_unit_qty);
			addColumnPathMap(Alloc_RsltR.$base_unit_cd, Srch_RsltR.$base_unit_cd);
			addColumnPathMap(Alloc_RsltR.$base_unit_qty, Srch_RsltR.$base_unit_qty);
			addColumnPathMap(Alloc_RsltR.$vld_dt_fr, Srch_RsltR.$vld_dt_fr);
			addColumnPathMap(Alloc_RsltR.$vld_dt_to, Srch_RsltR.$vld_dt_to);

		}
	}

	protected Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_SV_R<Alloc_RsltR,MST_SHIP_ALLOC_STS_SV_R> createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_SV_R() {
		return new Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_SV_R<Alloc_RsltR, MST_SHIP_ALLOC_STS_SV_R>();
	}

	public class Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_SV_R<D extends Alloc_RsltR, S extends MST_SHIP_ALLOC_STS_SV_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Alloc_RsltR.$ver_no, MST_SHIP_ALLOC_STS_SV_R.$ver_no);
			addColumnPathMap(Alloc_RsltR.$stk_loc_cd, MST_SHIP_ALLOC_STS_SV_R.$ship_loc_cd);
			addColumnPathMap(Alloc_RsltR.$stk_str_ln_cd, MST_SHIP_ALLOC_STS_SV_R.$ship_str_ln_cd);
			addColumnPathMap(Alloc_RsltR.$quality_typ, MST_SHIP_ALLOC_STS_SV_R.$quality_typ);
			addColumnPathMap(Alloc_RsltR.$stk_insp_typ, MST_SHIP_ALLOC_STS_SV_R.$stk_insp_typ);
			addColumnPathMap(Alloc_RsltR.$stk_id_typ, MST_SHIP_ALLOC_STS_SV_R.$stk_id_typ);
			addColumnPathMap(Alloc_RsltR.$stk_arrv_bp_cd, MST_SHIP_ALLOC_STS_SV_R.$stk_arrv_bp_cd);
			addColumnPathMap(Alloc_RsltR.$stk_bp_cd, MST_SHIP_ALLOC_STS_SV_R.$stk_bp_cd);
			addColumnPathMap(Alloc_RsltR.$gd_cd, MST_SHIP_ALLOC_STS_SV_R.$gd_cd);
			addColumnPathMap(Alloc_RsltR.$lot_no, MST_SHIP_ALLOC_STS_SV_R.$lot_no);
			addColumnPathMap(Alloc_RsltR.$sublot_no, MST_SHIP_ALLOC_STS_SV_R.$sublot_no);
			addColumnPathMap(Alloc_RsltR.$sno1, MST_SHIP_ALLOC_STS_SV_R.$sno1);
			addColumnPathMap(Alloc_RsltR.$sno2, MST_SHIP_ALLOC_STS_SV_R.$sno2);
			addColumnPathMap(Alloc_RsltR.$sno3, MST_SHIP_ALLOC_STS_SV_R.$sno3);
			addColumnPathMap(Alloc_RsltR.$sno4, MST_SHIP_ALLOC_STS_SV_R.$sno4);
			addColumnPathMap(Alloc_RsltR.$pack_unit_cd, MST_SHIP_ALLOC_STS_SV_R.$pack_unit_cd);
			addColumnPathMap(Alloc_RsltR.$pack_unit_qty, MST_SHIP_ALLOC_STS_SV_R.$pack_unit_qty);
			addColumnPathMap(Alloc_RsltR.$base_unit_cd, MST_SHIP_ALLOC_STS_SV_R.$base_unit_cd);
			addColumnPathMap(Alloc_RsltR.$base_unit_qty, MST_SHIP_ALLOC_STS_SV_R.$base_unit_qty);
			addColumnPathMap(Alloc_RsltR.$ent_unit_cd, MST_SHIP_ALLOC_STS_SV_R.$ent_unit_cd);
			addColumnPathMap(Alloc_RsltR.$alloc_scope_typ, MST_SHIP_ALLOC_STS_SV_R.$alloc_scope_typ);
			addColumnPathMap(Alloc_RsltR.$alloc_flg, MST_SHIP_ALLOC_STS_SV_R.$alloc_flg);
			addColumnPathMap(Alloc_RsltR.$alloc_wait_flg, MST_SHIP_ALLOC_STS_SV_R.$alloc_wait_flg);
			addColumnPathMap(Alloc_RsltR.$vld_dt_fr, MST_SHIP_ALLOC_STS_SV_R.$vld_dt_fr);
			addColumnPathMap(Alloc_RsltR.$vld_dt_to, MST_SHIP_ALLOC_STS_SV_R.$vld_dt_to);

		}
	}

	protected Map_PlntAprv_Chk02_RsltR_ShipInst_Chk01_DtlR<PlntAprv_Chk02_RsltR,ShipInst_Chk01_DtlR> createMap_PlntAprv_Chk02_RsltR_ShipInst_Chk01_DtlR() {
		return new Map_PlntAprv_Chk02_RsltR_ShipInst_Chk01_DtlR<PlntAprv_Chk02_RsltR, ShipInst_Chk01_DtlR>();
	}

	public class Map_PlntAprv_Chk02_RsltR_ShipInst_Chk01_DtlR<D extends PlntAprv_Chk02_RsltR, S extends ShipInst_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PlntAprv_Chk02_RsltR.$peg_no, ShipInst_Chk01_DtlR.$peg_no);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_cd, ShipInst_Chk01_DtlR.$itm_cd);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_sub1, ShipInst_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_sub2, ShipInst_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_sub3, ShipInst_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$lot_no, ShipInst_Chk01_DtlR.$alloc_lot_no);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$sublot_no, ShipInst_Chk01_DtlR.$alloc_sublot_no);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.pre_inst_flg(false);
		}
	}

	protected Map_MrktJudg_Chk02_RsltR_ShipInst_Chk01_DtlR<MrktJudg_Chk02_RsltR,ShipInst_Chk01_DtlR> createMap_MrktJudg_Chk02_RsltR_ShipInst_Chk01_DtlR() {
		return new Map_MrktJudg_Chk02_RsltR_ShipInst_Chk01_DtlR<MrktJudg_Chk02_RsltR, ShipInst_Chk01_DtlR>();
	}

	public class Map_MrktJudg_Chk02_RsltR_ShipInst_Chk01_DtlR<D extends MrktJudg_Chk02_RsltR, S extends ShipInst_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MrktJudg_Chk02_RsltR.$peg_no, ShipInst_Chk01_DtlR.$peg_no);
			addColumnPathMap(MrktJudg_Chk02_RsltR.$itm_cd, ShipInst_Chk01_DtlR.$itm_cd);
			addColumnPathMap(MrktJudg_Chk02_RsltR.$itm_sub1, ShipInst_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MrktJudg_Chk02_RsltR.$itm_sub2, ShipInst_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MrktJudg_Chk02_RsltR.$itm_sub3, ShipInst_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MrktJudg_Chk02_RsltR.$lot_no, ShipInst_Chk01_DtlR.$alloc_lot_no);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.pre_inst_flg(false);
		}
	}

	protected Map_LotTrace_Chk01_RsltR_ShipInst_Chk01_DtlR<LotTrace_Chk01_RsltR,ShipInst_Chk01_DtlR> createMap_LotTrace_Chk01_RsltR_ShipInst_Chk01_DtlR() {
		return new Map_LotTrace_Chk01_RsltR_ShipInst_Chk01_DtlR<LotTrace_Chk01_RsltR, ShipInst_Chk01_DtlR>();
	}

	public class Map_LotTrace_Chk01_RsltR_ShipInst_Chk01_DtlR<D extends LotTrace_Chk01_RsltR, S extends ShipInst_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(LotTrace_Chk01_RsltR.$peg_no, ShipInst_Chk01_DtlR.$peg_no);
			addColumnPathMap(LotTrace_Chk01_RsltR.$skip_chk_ship_flg, ShipInst_Chk01_DtlR.$skip_chk_ship_flg);
			addColumnPathMap(LotTrace_Chk01_RsltR.$loc_cd, ShipInst_Chk01_DtlR.$alloc_loc_cd);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_cd, ShipInst_Chk01_DtlR.$itm_cd);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub1, ShipInst_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub2, ShipInst_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub3, ShipInst_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(LotTrace_Chk01_RsltR.$lot_no, ShipInst_Chk01_DtlR.$alloc_lot_no);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sublot_no, ShipInst_Chk01_DtlR.$alloc_sublot_no);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno1, ShipInst_Chk01_DtlR.$alloc_sno1);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno2, ShipInst_Chk01_DtlR.$alloc_sno2);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno3, ShipInst_Chk01_DtlR.$alloc_sno3);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno4, ShipInst_Chk01_DtlR.$alloc_sno4);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.plnt_aprv_flg(false);
			dest.site_cd(getLoc(src.alloc_loc_cd()).site_cd());
		}
	}

	protected Map_ShipInst_Chk01_DtlR_MST_SHIP_ALLOC_STS_R<ShipInst_Chk01_DtlR,MST_SHIP_ALLOC_STS_R> createMap_ShipInst_Chk01_DtlR_MST_SHIP_ALLOC_STS_R() {
		return new Map_ShipInst_Chk01_DtlR_MST_SHIP_ALLOC_STS_R<ShipInst_Chk01_DtlR, MST_SHIP_ALLOC_STS_R>();
	}

	public class Map_ShipInst_Chk01_DtlR_MST_SHIP_ALLOC_STS_R<D extends ShipInst_Chk01_DtlR, S extends MST_SHIP_ALLOC_STS_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_loc_cd, MST_SHIP_ALLOC_STS_R.$ship_loc_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_str_ln_cd, MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_sno1, MST_SHIP_ALLOC_STS_R.$sno1);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_sno2, MST_SHIP_ALLOC_STS_R.$sno2);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_sno3, MST_SHIP_ALLOC_STS_R.$sno3);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_sno4, MST_SHIP_ALLOC_STS_R.$sno4);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_lot_no, MST_SHIP_ALLOC_STS_R.$lot_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_sublot_no, MST_SHIP_ALLOC_STS_R.$sublot_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_ver_no, MST_SHIP_ALLOC_STS_R.$ver_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$stk_arrv_bp_cd, MST_SHIP_ALLOC_STS_R.$stk_arrv_bp_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$gd_cd, MST_SHIP_ALLOC_STS_R.$gd_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$quality_typ, MST_SHIP_ALLOC_STS_R.$quality_typ);
			addColumnPathMap(ShipInst_Chk01_DtlR.$stk_insp_typ, MST_SHIP_ALLOC_STS_R.$stk_insp_typ);
			addColumnPathMap(ShipInst_Chk01_DtlR.$stk_id_typ, MST_SHIP_ALLOC_STS_R.$stk_id_typ);
			addColumnPathMap(ShipInst_Chk01_DtlR.$stk_bp_cd, MST_SHIP_ALLOC_STS_R.$stk_bp_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_ent_unit_qty, MST_SHIP_ALLOC_STS_R.$ent_unit_qty);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_ent_unit_cd, MST_SHIP_ALLOC_STS_R.$ent_unit_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_base_unit_qty, MST_SHIP_ALLOC_STS_R.$base_unit_qty);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_base_unit_cd, MST_SHIP_ALLOC_STS_R.$base_unit_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$not_lot_mix_flg, MST_SHIP_ALLOC_STS_R.$not_lot_mix_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$not_sublot_mix_flg, MST_SHIP_ALLOC_STS_R.$not_sublot_mix_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_tgt_flg, MST_SHIP_ALLOC_STS_R.$alloc_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$dlv_slip_d_no, MST_SHIP_ALLOC_STS_R.$dlv_slip_d_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$dlv_slip_no, MST_SHIP_ALLOC_STS_R.$dlv_slip_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$ship_alloc_sts_no, MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
		}
	}

	protected Map_MSW_SHIP_SCHD_DT_CALC_R_ShipInst_Chk01_HdrR<MSW_SHIP_SCHD_DT_CALC_R,ShipInst_Chk01_HdrR> createMap_MSW_SHIP_SCHD_DT_CALC_R_ShipInst_Chk01_HdrR() {
		return new Map_MSW_SHIP_SCHD_DT_CALC_R_ShipInst_Chk01_HdrR<MSW_SHIP_SCHD_DT_CALC_R, ShipInst_Chk01_HdrR>();
	}

	public class Map_MSW_SHIP_SCHD_DT_CALC_R_ShipInst_Chk01_HdrR<D extends MSW_SHIP_SCHD_DT_CALC_R, S extends ShipInst_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_typ, ShipInst_Chk01_HdrR.$ship_to_id_typ);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_cd, ShipInst_Chk01_HdrR.$ship_to_id_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_lg_grp_cd, ShipInst_Chk01_HdrR.$ship_to_lg_grp_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_fr_lg_grp_cd, ShipInst_Chk01_HdrR.$ship_fr_lg_grp_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_term_cd, ShipInst_Chk01_HdrR.$ship_term_cd);

		}
	}

	protected Map_ShipRprt_Upd01_HdrR_MST_SHIP_ALLOC_STS_R<ShipRprt_Upd01_HdrR,MST_SHIP_ALLOC_STS_R> createMap_ShipRprt_Upd01_HdrR_MST_SHIP_ALLOC_STS_R() {
		return new Map_ShipRprt_Upd01_HdrR_MST_SHIP_ALLOC_STS_R<ShipRprt_Upd01_HdrR, MST_SHIP_ALLOC_STS_R>();
	}

	public class Map_ShipRprt_Upd01_HdrR_MST_SHIP_ALLOC_STS_R<D extends ShipRprt_Upd01_HdrR, S extends MST_SHIP_ALLOC_STS_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_HdrR.$slo_no, "slo_no");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_inst_no, "ship_inst_no");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_tm, "ship_schd_tm");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_tm, "dlv_schd_tm");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_cd, "trd_cd");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_ptn_typ, "trd_ptn_typ");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$cst_po_no, "cst_po_no");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_cur_cd, "trd_cur_cd");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$bp_cd, "cst_cd");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_typ, "dlv_id_typ");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_cd, "dlv_id_cd");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_nm, "dlv_id_nm");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_zip_cd, "dlv_zip_cd");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr1, "dlv_addr1");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr2, "dlv_addr2");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr3, "dlv_addr3");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr4, "dlv_addr4");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_cntct_dpt, "dlv_cntct_dpt");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_cntct_psn, "dlv_cntct_psn");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_tel, "dlv_tel");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_fax, "dlv_fax");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_fr_lg_grp_cd, "ship_fr_lg_grp_cd");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$wg_cd, "wg_cd");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_rmrks, "trd_rmrks");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char1, "h_sub_char1");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char2, "h_sub_char2");
			addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char3, "h_sub_char3");

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.can_ac_dt(null);
			dest.r_inst_no(null);
			dest.split_flg(true);
			dest.ds().trn_typ(MSC_TRN_TYP.SHIP.value());
			dest.dlv_slip_act_no(null);
			dest.ds().ac_dt(null);
			dest.xfr_loc_cd(null);
			if (MAC_TRD_PTN_TYP.isSLS(src.getStringNE("trd_ptn_typ"))
					|| MAC_TRD_PTN_TYP.isSHIP(src.getStringNE("trd_ptn_typ"))) {
				dest.dpt_cd(src.getStringNE("sls_dpt_cd"));
				dest.usr_cd(src.getStringNE("sls_usr_cd"));
				dest.wg_cd(src.getStringNE("sls_wg_cd"));
			}
			else {
				dest.dpt_cd(src.getStringNE("inst_dpt_cd"));
				dest.usr_cd(src.getStringNE("inst_usr_cd"));
			}
			dest.dlv_sundry_flg(isSame(src.getStringNE("dlv_sundry_flg"), "1"));
			dest.adjst_slip_flg(false);
			
			// 預り出荷の場合、預り出荷ＦＬＧをオンにし、価格印字ＦＬＧはオフのまま
			if (MSC_STK_ID_TYP.isCSTSTK(src.stk_id_typ())) {
				dest.cststk_ship_flg(true);
			}
			else if (MAC_TRD_PTN_TYP.isPROV(src.getStringNE("trd_ptn_typ"))) {
				MAM_LOC_R locR = getLoc(src.getString("dlv_id_cd"));
				dest.bp_cd(locR.sppl_cd());
				dest.pri_prnt_flg(true);
			}
			else if (MAC_TRD_PTN_TYP.isPROV_RTN(src.getStringNE("trd_ptn_typ"))) {
				dest.xfr_loc_cd(src.getString("xfr_loc_cd"));
				MAM_LOC_R locR = getLoc(dest.xfr_loc_cd());
				dest.bp_cd(locR.sppl_cd());
				dest.pri_prnt_flg(true);
			}
			else {
				dest.pri_prnt_flg(isSame(src.getStringNE("pri_prnt_flg"), "1"));
			}
		}
	}

	protected Map_ShipRprt_Upd01_DtlR_MST_SHIP_ALLOC_STS_R<ShipRprt_Upd01_DtlR,MST_SHIP_ALLOC_STS_R> createMap_ShipRprt_Upd01_DtlR_MST_SHIP_ALLOC_STS_R() {
		return new Map_ShipRprt_Upd01_DtlR_MST_SHIP_ALLOC_STS_R<ShipRprt_Upd01_DtlR, MST_SHIP_ALLOC_STS_R>();
	}

	public class Map_ShipRprt_Upd01_DtlR_MST_SHIP_ALLOC_STS_R<D extends ShipRprt_Upd01_DtlR, S extends MST_SHIP_ALLOC_STS_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dtl_uniq_no, MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_inst_rcpt_no, "dlv_inst_rcpt_no");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_d_no, MST_SHIP_ALLOC_STS_R.$dlv_slip_d_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_no, MST_SHIP_ALLOC_STS_R.$dlv_slip_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_cd, "itm_cd");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub1, "itm_sub1");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub2, "itm_sub2");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub3, "itm_sub3");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_nm, "itm_nm");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno1, MST_SHIP_ALLOC_STS_R.$sno1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno2, MST_SHIP_ALLOC_STS_R.$sno2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno3, MST_SHIP_ALLOC_STS_R.$sno3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno4, MST_SHIP_ALLOC_STS_R.$sno4);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$lot_no, MST_SHIP_ALLOC_STS_R.$lot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sublot_no, MST_SHIP_ALLOC_STS_R.$sublot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$gd_cd, MST_SHIP_ALLOC_STS_R.$gd_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_qty, MST_SHIP_ALLOC_STS_R.$pack_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_cd, MST_SHIP_ALLOC_STS_R.$pack_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_qty, MST_SHIP_ALLOC_STS_R.$base_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_cd, MST_SHIP_ALLOC_STS_R.$base_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$rsn_cd, "rsn_cd");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$bd_dpt_cd, "bd_dpt_cd");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$cst_po_d_no, "cst_po_no");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$cst_itm_cd, "cst_itm_cd");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$cst_itm_nm, "cst_itm_nm");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$slo_d_no, "slo_d_no");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$ship_schd_no, "ship_schd_no");
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_ac_dt, ShipInst_Chk01_DtlR.$base_ac_dt);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_d_rmrks, ShipInst_Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char1, MST_SHIP_ALLOC_STS_R.$sub_char1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char2, MST_SHIP_ALLOC_STS_R.$sub_char2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char3, MST_SHIP_ALLOC_STS_R.$sub_char3);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.str_ln_cd(null);
			dest.stk_arrv_bp_cd(null);
			dest.quality_typ(null);
			dest.stk_insp_typ(null);
			dest.stk_id_typ(null);
			dest.stk_bp_cd(null);
			dest.fix_no_typ(null);
			dest.fix_no(null);
			dest.wtax_rate(null);
			dest.wtax_amt(null);
			dest.prov_typ(null);
			dest.prov_basis_typ(null);
			dest.io_typ(null);
			dest.sundry_itm_flg(isSame(src.getStringNE("sundry_itm_flg"), "1"));
		}
	}

	protected Map_ShipRprt_Prnt02_HdrR_ShipInst_Chk01_HdrR<ShipRprt_Prnt02_HdrR,ShipInst_Chk01_HdrR> createMap_ShipRprt_Prnt02_HdrR_ShipInst_Chk01_HdrR() {
		return new Map_ShipRprt_Prnt02_HdrR_ShipInst_Chk01_HdrR<ShipRprt_Prnt02_HdrR, ShipInst_Chk01_HdrR>();
	}

	public class Map_ShipRprt_Prnt02_HdrR_ShipInst_Chk01_HdrR<D extends ShipRprt_Prnt02_HdrR, S extends ShipInst_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$ship_inst_no, ShipInst_Chk01_HdrR.$ship_inst_no);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$inst_prnt_flg, ShipInst_Chk01_HdrR.$ship_prnt_flg);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$pick_prnt_flg, ShipInst_Chk01_HdrR.$pck_prnt_flg);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trn_typ(MSC_TRN_TYP.SHIP.value());
			dest.xfr_inst_no(null);
		}
	}

	protected Map_ShipRprt_Del01_HdrR_MST_DLV_SLIP_D_R<ShipRprt_Del01_HdrR,MST_DLV_SLIP_D_R> createMap_ShipRprt_Del01_HdrR_MST_DLV_SLIP_D_R() {
		return new Map_ShipRprt_Del01_HdrR_MST_DLV_SLIP_D_R<ShipRprt_Del01_HdrR, MST_DLV_SLIP_D_R>();
	}

	public class Map_ShipRprt_Del01_HdrR_MST_DLV_SLIP_D_R<D extends ShipRprt_Del01_HdrR, S extends MST_DLV_SLIP_D_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Del01_HdrR.$dlv_slip_no, MST_DLV_SLIP_D_R.$dlv_slip_no);

		}
	}

	protected Map_ShipLot_DtlR_ShipInst_Chk01_DtlR<ShipLot_DtlR,ShipInst_Chk01_DtlR> createMap_ShipLot_DtlR_ShipInst_Chk01_DtlR() {
		return new Map_ShipLot_DtlR_ShipInst_Chk01_DtlR<ShipLot_DtlR, ShipInst_Chk01_DtlR>();
	}

	public class Map_ShipLot_DtlR_ShipInst_Chk01_DtlR<D extends ShipLot_DtlR, S extends ShipInst_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipLot_DtlR.$peg_no, ShipInst_Chk01_DtlR.$peg_no);
			addColumnPathMap(ShipLot_DtlR.$itm_cd, ShipInst_Chk01_DtlR.$itm_cd);
			addColumnPathMap(ShipLot_DtlR.$itm_sub1, ShipInst_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(ShipLot_DtlR.$itm_sub2, ShipInst_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(ShipLot_DtlR.$itm_sub3, ShipInst_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(ShipLot_DtlR.$lot_no, ShipInst_Chk01_DtlR.$alloc_lot_no);
			addColumnPathMap(ShipLot_DtlR.$sublot_no, ShipInst_Chk01_DtlR.$alloc_sublot_no);

		}
	}

	protected Map_Aprv_Chk02_Rslt1R_ShipInst_Chk01_DtlR<Aprv_Chk02_Rslt1R, ShipInst_Chk01_DtlR, ShipSchd_Chk01_DtlR> createMap_Aprv_Chk02_Rslt1R_ShipInst_Chk01_DtlR() {
		return new Map_Aprv_Chk02_Rslt1R_ShipInst_Chk01_DtlR<Aprv_Chk02_Rslt1R, ShipInst_Chk01_DtlR, ShipSchd_Chk01_DtlR>();
	}
	public class Map_Aprv_Chk02_Rslt1R_ShipInst_Chk01_DtlR<D extends Aprv_Chk02_Rslt1R, S extends ShipInst_Chk01_DtlR, W extends ShipSchd_Chk01_DtlR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipSchd_Chk01_DtlR _schdR;
		@Override
		public void setWith(W schdR) {
			_schdR = schdR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(src.peg_no());
			dest.aprv_no(_schdR.sp().getString("aprv_no"));
		}
	}

	protected Map_Lot_Chk03_CndR_ShipInst_Chk01_DtlR<Lot_Chk03_CndR,ShipInst_Chk01_DtlR> createMap_Lot_Chk03_CndR_ShipInst_Chk01_DtlR() {
		return new Map_Lot_Chk03_CndR_ShipInst_Chk01_DtlR<Lot_Chk03_CndR, ShipInst_Chk01_DtlR>();
	}
	public class Map_Lot_Chk03_CndR_ShipInst_Chk01_DtlR<D extends Lot_Chk03_CndR, S extends ShipInst_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, ShipInst_Chk01_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, ShipInst_Chk01_DtlR.$itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, ShipInst_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, ShipInst_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, ShipInst_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, ShipInst_Chk01_DtlR.$alloc_lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, ShipInst_Chk01_DtlR.$alloc_sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$ver_no, ShipInst_Chk01_DtlR.$alloc_ver_no);
		}
	}
	/**
	 * ShipInst_RevUpd01オペレーション.<p>
	 *
	 * 出荷指図改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	public class ShipInst_RevUpd01 extends MSBEL_ShipInstService_MC_A.ShipInst_RevUpd01 {

		MCList<MST_SHIP_INST_R> _hCurrentL = MCList.create(MST_SHIP_INST_R.class);
		MCList<MST_SHIP_INST_D_R> _dCurrentL = MCList.create(MST_SHIP_INST_D_R.class);
		MCList<MST_SHIP_ALLOC_STS_R> _stsCurrentL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		MCList<MST_SHIP_INST_P_R> _hRevL = MCList.create(MST_SHIP_INST_P_R.class);
		MCList<MST_SHIP_INST_D_P_R> _dRevL = MCList.create(MST_SHIP_INST_D_P_R.class);
		MCList<MST_SHIP_ALLOC_STS_P_R> _stsRevL = MCList.create(MST_SHIP_ALLOC_STS_P_R.class);

		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			wkInsert();
			selectCurrentAndRev();
			revisionInsOrUpd();
		}
		
		/**
		 * 上り電文の項目を本体・改訂履歴ヘッダーのワークテーブルに設定
		 */
		protected void wkInsert() {
			MCList<MST_SHIP_INST_R> wkL = MCList.create(MST_SHIP_INST_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_SHIP_INST_R wkR = MST_SHIP_INST_R.create();
				wkR.ship_inst_no(r.rev_data_src_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			dbWkDelete("MSBEL5530_MSW_SHIP_INST_D04", wkL_bldr.getBaseDbc());
			MCList<MST_SHIP_INST_R> wkL2 = wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn());
			dbWkInsert("MSBEL5530_MSW_SHIP_INST_I03", wkL2, wkL_bldr.getBaseDbc());
			
			MCList<MST_SHIP_INST_P_R> wkpL = MCList.create(MST_SHIP_INST_P_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_SHIP_INST_P_R wkpR = MST_SHIP_INST_P_R.create();
				wkpR.ship_inst_no(r.rev_data_src_no());
				wkpR.ship_inst_rev(r.rev_no());
				wkpL.add(wkpR);
			}
			MCQueryApiBuilder wkpL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_P_R.create("T"));
			dbWkDelete("MSBEL5530_MSW_SHIP_INST_P_D01", wkpL_bldr.getBaseDbc());
			MCList<MST_SHIP_INST_P_R> wkpL2 = wkpL.groupBy(wkpL_bldr.getBaseDbc().getKeyColumn());
			dbWkInsert("MSBEL5530_MSW_SHIP_INST_P_I01", wkpL2, wkpL_bldr.getBaseDbc());
		}
		
		/**
		 * 本体テーブルと改訂履歴テーブルからリストを取得
		 */
		protected void selectCurrentAndRev() {
			MSW_SHIP_INST_KEY_R w1 = MSW_SHIP_INST_KEY_R.create("W");
			
			MST_SHIP_INST_R hCurrentL_t = MST_SHIP_INST_R.create("T");
			MCQueryApiBuilder hCurrentL_bldr = MCQueryApiBuilder.create(hCurrentL_t);
			hCurrentL_bldr.addInnerJoin(w1, bracket(hCurrentL_t.ship_inst_no.eq(w1.ship_inst_no)));
			dbSelect("MSBEL5530_MST_SHIP_INST_S04", _hCurrentL, hCurrentL_bldr);

			MST_SHIP_INST_D_R dCurrentL_t = MST_SHIP_INST_D_R.create("T");
			MCQueryApiBuilder dCurrentL_bldr = MCQueryApiBuilder.create(dCurrentL_t);
			dCurrentL_bldr.addInnerJoin(w1, bracket(dCurrentL_t.ship_inst_no.eq(w1.ship_inst_no)));
			dbSelect("MSBEL5530_MST_SHIP_INST_D_S05", _dCurrentL, dCurrentL_bldr);
			

			MST_SHIP_ALLOC_STS_R stsCurrentL_t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder stsCurrentL_bldr = MCQueryApiBuilder.create(stsCurrentL_t);
			stsCurrentL_bldr.addInnerJoin(w1, bracket(stsCurrentL_t.ship_inst_no.eq(w1.ship_inst_no)));
			dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_S10", _stsCurrentL, stsCurrentL_bldr);

			MSW_SHIP_INST_P_KEY_R w2 = MSW_SHIP_INST_P_KEY_R.create("W");

			MST_SHIP_INST_P_R hRevL_t = MST_SHIP_INST_P_R.create("T");
			MCQueryApiBuilder hRevL_bldr = MCQueryApiBuilder.create(hRevL_t);
			hRevL_bldr.addInnerJoin(w2, bracket(hRevL_t.ship_inst_no.eq(w2.ship_inst_no)
					.and(hRevL_t.ship_inst_rev.eq(w2.ship_inst_rev))));
			dbSelect("MSBEL5530_MST_SHIP_INST_P_S01", _hRevL, hRevL_bldr);
			
			MST_SHIP_INST_D_P_R dRevL_t = MST_SHIP_INST_D_P_R.create("T");
			MCQueryApiBuilder dRevL_bldr = MCQueryApiBuilder.create(dRevL_t);
			dRevL_bldr.addInnerJoin(w2, bracket(dRevL_t.ship_inst_no.eq(w2.ship_inst_no)
					.and(dRevL_t.ship_inst_rev.eq(w2.ship_inst_rev))));
			dbSelect("MSBEL5530_MST_SHIP_INST_D_P_S01", _dRevL, dRevL_bldr);

			MST_SHIP_ALLOC_STS_P_R stsRevL_t = MST_SHIP_ALLOC_STS_P_R.create("T");
			MCQueryApiBuilder stsRevL_bldr = MCQueryApiBuilder.create(stsRevL_t);
			stsRevL_bldr.addInnerJoin(w2, bracket(stsRevL_t.ship_inst_no.eq(w2.ship_inst_no)
							.and(stsRevL_t.ship_inst_rev.eq(w2.ship_inst_rev))));
			dbSelect("MSBEL5530_MST_SHIP_ALLOC_STS_P_S01", _stsRevL, stsRevL_bldr);
		}
		
		/**
		 * 本番テーブルのデータを元に、改訂履歴テーブルを追加又は更新する。
		 */
		protected void revisionInsOrUpd() {
			revisionInsOrUpdHeader();
			revisionInsOrUpdDetails();
			revisionInsOrUpdSts();
		}
		
		/**
		 * ヘッダーの改訂履歴テーブルを追加又は更新する。
		 */
		protected void revisionInsOrUpdHeader() {
			MCIndexKey hRevIdx = _hRevL.createIndex(MST_SHIP_INST_P_R.$ship_inst_no, MST_SHIP_INST_P_R.$ship_inst_rev);
			MCList<MST_SHIP_INST_P_R> hUpd = MCList.create(MST_SHIP_INST_P_R.class);
			MCList<MST_SHIP_INST_P_R> hIns = MCList.create(MST_SHIP_INST_P_R.class);
			for (MST_SHIP_INST_R hcurrentR : _hCurrentL) {
				
				MST_SHIP_INST_P_R tempRevR = MST_SHIP_INST_P_R.create();
				tempRevR.setByName(hcurrentR);
				if (_hRevL == null || isNull(_hRevL.getFirst(hRevIdx, hcurrentR.ship_inst_no(), hcurrentR.ship_inst_rev()))) {
					hIns.add(tempRevR);
				}
				else {
					hUpd.add(tempRevR);
				}
			}
			if (!isNull(hIns)) {
				MCQueryApiBuilder hIns_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_P_R.create("T"));
				dbInsert("MSBEL5530_MST_SHIP_INST_P_I01", hIns, hIns_bldr);
			}
			if (!isNull(hUpd)) {
				MCQueryApiBuilder hUpd_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_P_R.create("T"));
				hUpd_bldr.removeSet(hUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBEL5530_MST_SHIP_INST_P_U01", hUpd, hUpd_bldr);
			}
		}
		
		/**
		 * 明細部の改訂履歴テーブルを追加又は更新する。
		 */
		protected void revisionInsOrUpdDetails() {
			MCIndexKey dRevIdx = _dRevL.createIndex(MST_SHIP_INST_D_P_R.$ship_inst_d_no, MST_SHIP_INST_D_P_R.$ship_inst_rev);
			MCIndexKey hCurrentIdx = _hCurrentL.createIndex(MST_SHIP_INST_R.$ship_inst_no);
			MCList<MST_SHIP_INST_D_P_R> dUpd = MCList.create(MST_SHIP_INST_D_P_R.class);
			MCList<MST_SHIP_INST_D_P_R> dIns = MCList.create(MST_SHIP_INST_D_P_R.class);
			for (MST_SHIP_INST_D_R dcurrentR : _dCurrentL) {
				MST_SHIP_INST_D_P_R tempRevR = MST_SHIP_INST_D_P_R.create();
				tempRevR.setByName(dcurrentR);
				
				MST_SHIP_INST_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, dcurrentR.ship_inst_no());
				tempRevR.ship_inst_rev(hCurrentR.ship_inst_rev());
				
				if (_dRevL == null ||isNull(_dRevL.getFirst(dRevIdx, tempRevR.ship_inst_d_no(), tempRevR.ship_inst_rev()))) {
					dIns.add(tempRevR);
				}
				else {
					dUpd.add(tempRevR);
				}
				
			}
			
			if (!isNull(dIns)) {
				MCQueryApiBuilder dIns_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_D_P_R.create("T"));
				dbInsert("MSBEL5530_MST_SHIP_INST_D_P_I01", dIns, dIns_bldr);
			}
			if (!isNull(dUpd)) {
				MCQueryApiBuilder dUpd_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_D_P_R.create("T"));
				dUpd_bldr.removeSet(dUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBEL5530_MST_SHIP_INST_D_P_U01", dUpd, dUpd_bldr);
			}
		}
		
		/**
		 * 引当状況の改訂履歴テーブルを追加又は更新する。
		 */
		protected void revisionInsOrUpdSts() {
			MCIndexKey stsRevIdx = _stsRevL.createIndex(MST_SHIP_ALLOC_STS_P_R.$ship_alloc_sts_no, MST_SHIP_ALLOC_STS_P_R.$ship_inst_rev);
			MCIndexKey hCurrentIdx = _hCurrentL.createIndex(MST_SHIP_INST_R.$ship_inst_no);
			MCList<MST_SHIP_ALLOC_STS_P_R> stsUpd = MCList.create(MST_SHIP_ALLOC_STS_P_R.class);
			MCList<MST_SHIP_ALLOC_STS_P_R> stsIns = MCList.create(MST_SHIP_ALLOC_STS_P_R.class);
			for (MST_SHIP_ALLOC_STS_R stscurrentR : _stsCurrentL) {
				MST_SHIP_ALLOC_STS_P_R tempRevR = MST_SHIP_ALLOC_STS_P_R.create();
				tempRevR.setByName(stscurrentR);
				
				MST_SHIP_INST_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, stscurrentR.ship_inst_no());
				tempRevR.ship_inst_rev(hCurrentR.ship_inst_rev());
				
				if (_stsRevL == null ||isNull(_stsRevL.getFirst(stsRevIdx, tempRevR.ship_alloc_sts_no(), tempRevR.ship_inst_rev()))) {
					stsIns.add(tempRevR);
				}
				else {
					stsUpd.add(tempRevR);
				}
				
			}
			
			if (!isNull(stsIns)) {
				MCQueryApiBuilder stsIns_bldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_P_R.create("T"));
				dbInsert("MSBEL5530_MST_SHIP_ALLOC_STS_P_I01", stsIns, stsIns_bldr);
			}
			if (!isNull(stsUpd)) {
				MCQueryApiBuilder stsUpd_bldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_P_R.create("T"));
				stsUpd_bldr.removeSet(stsUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBEL5530_MST_SHIP_ALLOC_STS_P_U01", stsUpd, stsUpd_bldr);
			}
		}
	}

	//FMCB CUSTOM END
}