package mcframe.serverMSBE.MSBEL0140;

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
import mcframe.serverMSBE.MSBEL0140.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverMSBE.MSBEL0140.Query.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5510.*;
import mcframe.serverMSBE.MSBEL5520.*;
import mcframe.serverMSBB.MSBBL6080.*;
import static mcframe.commonCore.notice.Core_Msg.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StkLumpAlloc"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StkLumpAlloc_MC extends MSBEL_StkLumpAlloc_MC_A{
	//FMCB CUSTOM START
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmR;
	
	protected void initMamItmCache(MCList<Upd02_ShipSchdR> list) {
		MAM_ITM_R itmR = MAM_ITM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(itmR);
		_itmR = new FXUCL_MCDbcCache<MAM_ITM_R>(builder, list,
				Upd02_ShipSchdR.$itm_cd, Upd02_ShipSchdR.$itm_sub1, Upd02_ShipSchdR.$itm_sub2, Upd02_ShipSchdR.$itm_sub3);
	}

	protected MAM_ITM_R getItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		if (_itmR == null) {
			_itmR = new FXUCL_MCDbcCache<MAM_ITM_R>(MCQueryApiBuilder.create(MAM_ITM_R.create("T")));
		}
		return _itmR.get(itmCd, itmSub1, itmSub2, itmSub3);
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録前チェック処理を実行する。<br>
	 */
	public class Chk01 extends MSBEL_StkLumpAlloc_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			setPrio();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkCst());
			
			return msgL;
		}
		
		/**
		 * 得意先をチェックする。
		 * @return メッセージリスト
		 */
		protected MCMessageList chkCst() {

			MCMessageList msgL = new MCMessageList();
			
			if (!isNull(up0().cst_slct_typ()) && up1().isEmpty()) {
				
				msgL.add(new MCMessage(up0(), HdrR.$cst_slct_typ, MSBEL0176));
			}
			
			if (isNull(up0().cst_slct_typ()) && !up1().isEmpty()) {
				
				msgL.add(new MCMessage(up0(), HdrR.$cst_slct_typ, MSBEL0177));
			}
			
			return msgL;
		}
		
		/**
		 * 得意先の引当順を設定する。<br/>
		 */
		protected void setPrio() {

			DtlR dtlR = null;
			for (int i = 0; i < up1().size(); i++) {
				
				dtlR = up1().get(i);
				dtlR.prio(i + 1);
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {

			MCRow.copyall(down0(), up0());
			
			down1().setAll(up1());
		}
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 「場所引当」、「総量引当」のいずれか、または両方をマルチスレッドで実行する。<br>
	 */
	public class Upd01 extends MSBEL_StkLumpAlloc_MC_A.Upd01 {
		
		/** 
		 * 対象件数 
		 */
		protected int _totalCnt;
		
		/**
		 * 全数引当件数 
		 */
		protected int _allAllocCnt;
		
		/**
		 * 一部引当件数 
		 */
		protected int _partAllocCnt;
		
		/**
		 * 引当できなかった件数
		 */
		protected int _nonAllocCnt;
		
		/** 
		 * エラー件数 
		 */
		protected int _errorCnt;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			editUp();
			
			callThisChk01();
			
			throwUpdErr();
			
			callThisUpd02();
			
			setAllocRslt();
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {

			doCompTime(up0(), true);
		}
		
		/**
		 * 登録チェック処理を実行する。
		 */
		protected void callThisChk01() {
			
			MSBEL_StkLumpAlloc.Chk01 ope = MSBEL_StkLumpAlloc.crtChk01();
			
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			
			ope.exec();
			
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * 登録（個別）をマルチスレッドで実行する。
		 */
		protected void callThisUpd02() {

			_totalCnt = 0;
			_allAllocCnt = 0;
			_partAllocCnt = 0;
			_nonAllocCnt = 0;
			_errorCnt = 0;
			
			List<MSBEL_StkLumpAlloc.Upd02> opeL = new ArrayList<>();
			
			MCList<HdrR> allocL = getAllocList();
			
			MCIndexKey idxkey = allocL.createIndex(HdrR.$thread_unit);
			
			MSBEL_StkLumpAlloc.Upd02 upd02Ope = null;
			
			if (MCServerThreadManager.getLimitThreadSize() == 1) {
				if (!allocL.isEmpty()) {
					upd02Ope =MSBEL_StkLumpAlloc.crtUpd02();
					upd02Ope.up0().setAll(allocL);
					upd02Ope.up1().setAll(up1());
					opeL.add(upd02Ope);
				}
			}
			else {
				MCGroupByPolicy policy = new MCGroupByPolicy(HdrR.$thread_unit);
				policy.sum(HdrR.$cnt);
			
				MCList<HdrR> threadGrpL = allocL.groupBy(policy);
				threadGrpL.sort(SortType.DESC, HdrR.$cnt);
			
				for (HdrR allocR : threadGrpL) {
				
					upd02Ope = MSBEL_StkLumpAlloc.crtUpd02();
				
					upd02Ope.up0().setAll(allocL.subList(idxkey, allocR.thread_unit()));
					upd02Ope.up1().setAll(up1());
				
					opeL.add(upd02Ope);
				}
			}
			
			if (!opeL.isEmpty()) {
				
				MCServerThreadManager.setCommitAndRollback(true);
				MCServerThreadManager.invokeAndWait(opeL);
				
				for (MSBEL_StkLumpAlloc.Upd02 ope : opeL) {
					
					_totalCnt += ope.down0().total_cnt().intValue();
					_allAllocCnt += ope.down0().all_alloc_cnt().intValue();
					_partAllocCnt += ope.down0().part_alloc_cnt().intValue();
					_nonAllocCnt += ope.down0().non_alloc_cnt().intValue();
					_errorCnt += ope.down0().error_cnt().intValue();
				}
			}
		}
		
		/**
		 * 出荷進捗、出荷予定、出荷引当状況から引当対象の出荷予定を取得しスレッド単体にまとめる。
		 * @return 引当対象
		 */
		protected MCList<HdrR> getAllocList() {

			MCList<HdrR> hdrL = MCList.create(HdrR.class);
			
			executeQuery(hdrL, MSBEL0140_MST_SHIP_PR_S01(), up0());
			
			setPegNo(hdrL);
			
			setThread(hdrL);
			
			hdrL.setValueNE(HdrR.$ship_schd_dt_fr, up0().ship_schd_dt_fr());
			hdrL.setValueNE(HdrR.$ship_schd_hm_fr, up0().ship_schd_hm_fr());
			hdrL.setValueNE(HdrR.$ship_schd_dt_to, up0().ship_schd_dt_to());
			hdrL.setValueNE(HdrR.$ship_schd_hm_to, up0().ship_schd_hm_to());
			hdrL.setValueNE(HdrR.$ship_schd_tm_prio_flg, up0().ship_schd_tm_prio_flg());
			hdrL.setValueNE(HdrR.$alloc_scope_typ, up0().alloc_scope_typ());
			hdrL.setValueNE(HdrR.$cst_slct_typ, up0().cst_slct_typ()); 
			
			return hdrL;
		}
		
		/**
		 * スレッド単位をまとめる。
		 * @param hdrL 引当対象
		 */
		protected void setThread(MCList<HdrR> hdrL) {
			
			MCList<MAM_LOC_R> shipLgGrpLocL = getShipLgGrpLoc(hdrL);

			MCList<MAM_LOC_R> allocGrpLocL = getAllocGrpLoc(hdrL);
			
			Integer thread = 0;
			Map<MCNumber, Integer> threadMap = new HashMap<MCNumber, Integer>();
			
			for (HdrR hdrR1 : hdrL) {
				
				if (threadMap.containsKey(hdrR1.peg_no())) {
					continue;
				}
				
				thread = thread + 1;
				
				for (HdrR hdrR2 : hdrL) {
					
					if (isSame(hdrR1, hdrR2) || threadMap.containsKey(hdrR2.peg_no())) {
						continue;
					}
					else {
						if (isSame(hdrR2.itm_cd(), hdrR1.itm_cd()) 
								&& isSame(hdrR2.itm_sub1(), hdrR1.itm_sub1())
								&& isSame(hdrR2.itm_sub2(), hdrR1.itm_sub2())
								&& isSame(hdrR2.itm_sub3(), hdrR1.itm_sub3())
								&& containsSameLoc(hdrR1, hdrR2, shipLgGrpLocL, allocGrpLocL)) {
							
							threadMap.put(hdrR2.peg_no(), thread);
						}
					}
				}
					
				threadMap.put(hdrR1.peg_no(), thread);
			}
			
			for (HdrR hdrR1 : hdrL) {
				
				hdrR1.thread_unit(threadMap.get(hdrR1.peg_no()));
			}
		}
		
		/**
		 * 出荷物流グループＣＤに属する場所を取得する。
		 * @param hdrL 引当条件
		 * @return 出荷物流グループＣＤに属する場所
		 */
		protected MCList<MAM_LOC_R> getShipLgGrpLoc(MCList<HdrR> hdrL) {
			
			MCList<MAM_LOC_R> shipLgGrpLocL = MCList.create(MAM_LOC_R.class);
			
			MCList<MAM_LOC_R> shipLgGrpLocCndL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R shipLgGrpLocCndR = null;
			for (HdrR hdrR : hdrL) {
				
				if (!isNull(hdrR.ship_lg_grp_cd())) {
					
					shipLgGrpLocCndR = MAM_LOC_R.create();
					shipLgGrpLocCndR.lg_grp_cd(hdrR.ship_lg_grp_cd());
					shipLgGrpLocCndL.add(shipLgGrpLocCndR);
				}
			}
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder shipLgGrpLocL_bldr = MCQueryApiBuilder.create(t);
			
			shipLgGrpLocL_bldr.setSelect(t.loc_cd, t.lg_grp_cd);
			
			dbSelectColumn("MSBEL0140_MAM_LOC_S01", shipLgGrpLocL, shipLgGrpLocL_bldr, shipLgGrpLocCndL, MAM_LOC_R.$lg_grp_cd);
			
			return shipLgGrpLocL;
		}
		
		/**
		 * 総量引当場所グループに属する場所を取得する。
		 * hdrL 引当条件
		 * @return 総量引当場所グループに属する場所
		 */
		protected MCList<MAM_LOC_R> getAllocGrpLoc(MCList<HdrR> hdrL) {
			
			MCList<MAM_LOC_R> allocGrpLocL = MCList.create(MAM_LOC_R.class);
			
			MCList<MAM_LOC_R> allocGrpLocCndL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R allocGrpLocCndR = null;
			for (HdrR hdrR : hdrL) {
				
				if (!isNull(hdrR.alloc_grp_cd())) {
					
					allocGrpLocCndR = MAM_LOC_R.create();
					allocGrpLocCndR.alloc_grp_cd(hdrR.alloc_grp_cd());
					allocGrpLocCndL.add(allocGrpLocCndR);
				}
			}
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder allocGrpLocL_bldr = MCQueryApiBuilder.create(t);
			
			allocGrpLocL_bldr.setSelect(t.loc_cd, t.alloc_grp_cd);
			
			dbSelectColumn("MSBEL0140_MAM_LOC_S02", allocGrpLocL, allocGrpLocL_bldr, allocGrpLocCndL, MAM_LOC_R.$alloc_grp_cd);
			
			return allocGrpLocL;
		}
		
		/**
		 * 出荷場所、出荷物流グループに属する場所、総量引当グループに属する場所に同一場所があるかどうか。
		 * 
		 * @param hdrR1 引当条件１
		 * @param hdrR2 引当条件２
		 * @param shipLgGrpLocL 出荷物流グループに属する場所
		 * @param allocGrpLocL 総量引当グループに属する場所
		 * @return 同一場所がある場合はtrue
		 */
		protected boolean containsSameLoc(HdrR hdrR1, HdrR hdrR2, MCList<MAM_LOC_R> shipLgGrpLocL, MCList<MAM_LOC_R> allocGrpLocL) {
			
			MCList<MAM_LOC_R> locL1 = getAllocCollectLoc(hdrR1, shipLgGrpLocL, allocGrpLocL);
			
			MCList<MAM_LOC_R> locL2 = getAllocCollectLoc(hdrR2, shipLgGrpLocL, allocGrpLocL);
			
			MCIndexKey idxkey = locL2.createIndex(MAM_LOC_R.$loc_cd);
			for (MAM_LOC_R locR1 : locL1) {
				
				if (locL2.contains(idxkey, locR1.loc_cd())) {
					return true;
				}
			}
			
			return false;
		}
		
		/**
		 * 指定された引当条件に応じて、まとめ可能な場所を取得する。
		 * @param hdrR 引当条件
		 * @param shipLgGrpLocL 出荷物流グループに属する場所
		 * @param allocGrpLocL 総量引当グループに属する場所
		 * @return　まとめ可能な場所
		 */
		protected MCList<MAM_LOC_R> getAllocCollectLoc(HdrR hdrR, MCList<MAM_LOC_R> shipLgGrpLocL, MCList<MAM_LOC_R> allocGrpLocL) {
			
			MCIndexKey lgGrpIdx = shipLgGrpLocL.createIndex(MAM_LOC_R.$lg_grp_cd);
			MCIndexKey allocGrpIdx = allocGrpLocL.createIndex(MAM_LOC_R.$alloc_grp_cd);
			
			MCList<MAM_LOC_R> locWL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R locWR = null;
			
			if (!isNull(hdrR.ship_loc_cd())) {
				
				locWR = MAM_LOC_R.create();
				locWR.loc_cd(hdrR.ship_loc_cd());
				locWL.add(locWR);
			}
			
			locWL.addAll(shipLgGrpLocL.subList(lgGrpIdx, hdrR.ship_lg_grp_cd()));
			locWL.addAll(allocGrpLocL.subList(allocGrpIdx, hdrR.alloc_grp_cd()));
			MCQueryApiBuilder locWL_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));
			dbWkInsert("MSBEL0140_MAW_LOC_I01", locWL, locWL_bldr.getBaseDbc());
			
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			
			executeQuery(locL, MSBEL0140_MAM_LOC_S01());
			dbWkDelete("MSBEL0140_MAW_LOC_D01", locWL_bldr.getBaseDbc());
			
			return locL;
		}
		
		/**
		 * 引当結果をメッセージプールに追加する。
		 */
		protected void setAllocRslt() {

 			MCMessagePool.add(new MCMessage(MSBEL0179, _totalCnt, _allAllocCnt, _partAllocCnt, _nonAllocCnt, _errorCnt));
		}
	}
	
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 「場所引当」、「総量引当」のいずれか、または両方を実行する。<br>
	 */
	public class Upd02 extends MSBEL_StkLumpAlloc_MC_A.Upd02 {
		
		/** 
		 * 対象件数 
		 */
		protected int _totalCnt;
		
		/**
		 * 全数引当件数 
		 */
		protected int _allAllocCnt;
		
		/**
		 * 一部引当件数 
		 */
		protected int _partAllocCnt;
		
		/**
		 * 引当できなかった件数
		 */
		protected int _nonAllocCnt;
		
		/** 
		 * エラー件数 
		 */
		protected int _errorCnt;
		
		/**
		 * ロット提案結果（全体）
		 */
		protected MCList<Srch_RsltR> _allAllocRsltL = null;
		
		/**
		 * ロット提案結果（全体）のインデックスキー
		 */
		protected MCIndexKey _ikAllAllocRslt = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			initCnt();
			
			lumpAlloc();
			
			setDown();
		}
		
		/**
		 * 処理件数を初期化する。
		 */
		protected void initCnt() {
			
			_totalCnt = 0;
			_allAllocCnt = 0;
			_partAllocCnt = 0;
			_nonAllocCnt = 0;
			_errorCnt = 0;
			
			_allAllocRsltL = null;
			_ikAllAllocRslt = null;
		}
		
		/**
		 * 引当区分「後引当」のオーダに対し、一括で引当を行う。
		 */
		protected void lumpAlloc() {
			
			MCList<Upd02_ShipSchdR> tar = MCList.create(Upd02_ShipSchdR.class);
			// 優先得意先分
			tar.addAll(getAllocForCst());
			
			// その他
			if (isNull(up0().get(0).cst_slct_typ()) 
					|| MSC_CST_SLCT_TYP.isPRIO(up0().get(0).cst_slct_typ())) {
				
				tar.addAll(getAllocForOther());
			}
			setPegNo(tar);
			setshipFrLgGrpCd(tar);
			
			allocMain(tar);
		}
		
		/**
		 * 優先得意先の引当対象を取得する。
		 * 
		 * @return 引当対象（出荷予定）
		 */
		protected MCList<Upd02_ShipSchdR> getAllocForCst() {
			
			MCList<Upd02_ShipSchdR> shiSchdL  = MCList.create(Upd02_ShipSchdR.class);
			
			if (!up1().isEmpty()) {
				
				for (HdrR hdrR : up0()) {
					
					MCList<Upd02_ShipSchdR> subL = MCList.create(Upd02_ShipSchdR.class);
				
					hdrR.addStringColumn("CST_SLCT_RSTRCT", toTrueStr(true));
					
					getAllocCommnon(hdrR, subL);
					
					shiSchdL.addAll(subL);
				}
			}
			
			setAllocPrio(shiSchdL, true);
			
			return shiSchdL;
		}
		
		/**
		 * 出荷元物流グループＣＤを設定する。
		 * @param shiSchdL 引当条件(出荷予定リスト)
		 */
		protected void setshipFrLgGrpCd(MCList<Upd02_ShipSchdR> shiSchdL) {
			
			MCList<MAM_LOC_R> locL = getLocL(shiSchdL);
			
			MAM_LOC_R locR = null;
			for (Upd02_ShipSchdR shiSchdR : shiSchdL) {
				
				shiSchdR.alloc_ship_lg_grp_cd(shiSchdR.ship_fr_lg_grp_cd());
				
				if (isNull(shiSchdR.ship_fr_lg_grp_cd())) {
					
					locR = locL.getFirst(MAM_LOC_R.$loc_cd, nvl(shiSchdR.loc_cd(), shiSchdR.def_loc_cd()));
					
					if (!isNull(locR)) {
						shiSchdR.ship_fr_lg_grp_cd(locR.lg_grp_cd());
						shiSchdR.wg_cd(locR.getStringNE("lg_grp_wg_cd"));
					}
				}
			}
		}
		
		/**
		 * 場所マスタの情報を取得する。
		 * @param shiSchdL 引当条件(出荷予定リスト)
		 * @return 場所マスタリスト
		 */
		protected MCList<MAM_LOC_R> getLocL(MCList<Upd02_ShipSchdR> shiSchdL) {
			
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			MAM_LG_GRP_R m1 = MAM_LG_GRP_R.create("M1");
			locL_bldr.setSelect(t.loc_cd, t.lg_grp_cd, t.wg_cd);
			locL.addStringColumn("lg_grp_wg_cd");
			locL_bldr.addSelect(m1.wg_cd.as("lg_grp_wg_cd"));
			locL_bldr.addLeftOuterJoin(m1, bracket(t.lg_grp_cd.eq(m1.lg_grp_cd)));
			
			MCList<MAM_LOC_R> bindL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R bindR = null;
			
			for (Upd02_ShipSchdR shiSchdR : shiSchdL) {
				
				if (isNull(shiSchdR.ship_fr_lg_grp_cd())) {
					bindR = MAM_LOC_R.create();
					bindR.loc_cd(nvl(shiSchdR.loc_cd(), shiSchdR.def_loc_cd()));
					bindL.add(bindR);
				}
			}
			
			dbSelectKey("MSBEL0140_MAM_LOC_S03", locL, locL_bldr, bindL);

			return locL;
		}
		
		/**
		 * 優先得意先以外の引当対象を取得する。
		 * 
		 * @param hdrR 引当条件
		 * @return 引当対象（出荷予定）
		 */
		protected MCList<Upd02_ShipSchdR> getAllocForOther() {

			MCList<Upd02_ShipSchdR> shiSchdL = MCList.create(Upd02_ShipSchdR.class);
			
			for (HdrR hdrR : up0()) {
				
				MCList<Upd02_ShipSchdR> subL = MCList.create(Upd02_ShipSchdR.class);
				
				hdrR.setValueNE("CST_SLCT_RSTRCT", null);
				hdrR.addStringColumn("CST_SLCT_OTHER", toTrueStr(true));
				
				getAllocCommnon(hdrR, subL);
				
				shiSchdL.addAll(subL);
			}
			
			setAllocPrio(shiSchdL, false);
			
			return shiSchdL;
		}
		
		/**
		 * 引当対象取得の共通処理
		 * @param bindR 条件
		 * @param shiSchdL 引当対象（出荷予定）
		 */
		protected void getAllocCommnon(HdrR bindR, MCList<Upd02_ShipSchdR> shiSchdL) {
			
			MCList<MAM_BP_R> insL = MCList.create(MAM_BP_R.class);
			MAM_BP_R insR = null;
			
			for (DtlR dtlR : up1()) {
				
				insR = MAM_BP_R.create();
				
				insR.bp_cd(dtlR.cst_cd());
				
				insL.add(insR);
			}
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			dbWkInsert("MSBEL0140_MAW_BP_I01", insL, insL_bldr.getBaseDbc());
			
			executeQuery(shiSchdL, MSBEL0140_MST_SHIP_PR_S02(), bindR);
			
			dbWkDelete("MSBEL0140_MAW_BP_D01", insL_bldr.getBaseDbc());
		}
		
		/**
		 * 引当優先順位を設定する。
		 * @param shiSchdL 引当条件
		 * @param cstPrioFlg 得意先優先ＦＬＧ
		 */
		protected void setAllocPrio(MCList<Upd02_ShipSchdR> shiSchdL, boolean cstPrioFlg) {
			
			shiSchdL.addNumberColumn("CST_PRIO");
			
			if (!up1().isEmpty() && cstPrioFlg) {
				
				MCIndexKey idxkey = shiSchdL.createIndex(Upd02_ShipSchdR.$cst_cd);
			
				for (DtlR dtlR : up1()) {
					shiSchdL.subList(idxkey, dtlR.cst_cd()).setValueNE("CST_PRIO", dtlR.prio());
				}
			}
			
			if (up0().get(0).ship_schd_tm_prio_flg()) {
				
				shiSchdL.sort("CST_PRIO", Upd02_ShipSchdR.$ship_schd_tm, Upd02_ShipSchdR.$alloc_prio);
			}
			else {
				shiSchdL.sort("CST_PRIO", Upd02_ShipSchdR.$alloc_prio, Upd02_ShipSchdR.$ship_schd_tm);
			}
		}
		
		/**
		 * 指定された出荷予定に対して、引当処理を行う。
		 * 
		 * @param shipSchdL 引当対象（出荷予定）
		 */
		protected void allocMain(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			initMamItmCache(shipSchdL);
			
			try {
				_totalCnt = _totalCnt + shipSchdL.size();
				lockShipPr(shipSchdL);
				alloc(shipSchdL);
				
				dbTran().commit();
			}
			catch (MCAppException ex) {
				
				MCLog.write(ex);

				MCMessage msg = ex.getMCMessage();
				MCMessagePool.add(msg);
				MCMessagePool.addAll(ex.getCauseMessageList());
				
				dbTran().rollback();
				_errorCnt = _errorCnt + shipSchdL.size();
			}
		}

		/**
		 * 出荷進捗をロックする。
		 * @param shipSchdL 出荷予定
		 */
		protected void lockShipPr(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			MCList<MST_SHIP_PR_R> wkL = MCList.create(MST_SHIP_PR_R.class);
			for (Upd02_ShipSchdR shipSchdR : shipSchdL) {
				MST_SHIP_PR_R wkR = MST_SHIP_PR_R.create();
				wkR.ship_pr_no(shipSchdR.ship_pr_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_PR_R.create("T"));
			dbWkDelete("MSBEL0140_MSW_SHIP_PR_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL0140_MSW_SHIP_PR_I01", wkL, wkL_bldr.getBaseDbc());
			
			MCList<MST_SHIP_PR_R> lockL = MCList.create(MST_SHIP_PR_R.class);
			MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
			MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(t);
			MSW_SHIP_PR_KEY_R w = MSW_SHIP_PR_KEY_R.create("W");
			lockL_bldr.setSelect(t.ship_pr_no);
			lockL_bldr.addSelect(t.upd_cntr);
			lockL_bldr.addInnerJoin(w, bracket(t.ship_pr_no.eq(w.ship_pr_no)));
			lockL_bldr.setLockTable(t.ship_pr_no);
			lockL_bldr.setOrderByAsc(lockL_bldr.getBaseDbc().getKeyColumn$());
			try {
				dbSelectForUpdateNoWait("MSBEL0140_MST_SHIP_PR_S01", lockL, lockL_bldr);
			}
			catch (MCException ex) {
				if (!isSame(ex.getID(), FCBCC0110)) {
					throw ex;
				}
				else {
					throwExclusionErr(shipSchdL);
				}
			}
			finally {
				dbWkDelete("MSBEL0140_MSW_SHIP_PR_D02", wkL_bldr.getBaseDbc());
			}
			
			MCIndexKey ik = lockL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
			for (Upd02_ShipSchdR shipSchdR : shipSchdL) {
				MST_SHIP_PR_R lockR = lockL.getFirst(ik, shipSchdR.ship_pr_no());
				
				MCMessageList msgL = checkUpdCntrNE(shipSchdR, MST_SHIP_PR_R.$upd_cntr, lockR);
				
				if (!msgL.isEmpty()) {
					throwExclusionErr(shipSchdL);
				}
			}
		}
		
		/**
		 * 排他制御でエラーになった場合の例外をthrowする
		 * 
		 * @param shipSchdL
		 */
		protected void throwExclusionErr(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			MCList<Upd02_ShipSchdR> tmpL = shipSchdL.distinctNE(
					Upd02_ShipSchdR.$loc_cd, 
					Upd02_ShipSchdR.$ship_lg_grp_cd, 
					Upd02_ShipSchdR.$alloc_grp_cd, 
					Upd02_ShipSchdR.$itm_cd, 
					Upd02_ShipSchdR.$itm_sub1,
					Upd02_ShipSchdR.$itm_sub2, 
					Upd02_ShipSchdR.$itm_sub3
					);
			
			MCAppException ex = null;
			for (int i=0; i<tmpL.size(); i++) {
				Upd02_ShipSchdR tmpR = tmpL.get(i);
				MCMessage msg = new MCMessage(tmpR, null,
						MSBEL0178, 
						tmpR.loc_cd(), 
						tmpR.ship_lg_grp_cd(), 
						tmpR.alloc_grp_cd(), 
						toDispItm(tmpR.itm_cd(), tmpR.itm_sub1(), tmpR.itm_sub2(), tmpR.itm_sub3()));
				if (i==0) {
					ex = new MCAppException(msg);
				}
				else {
					ex.addCauseMessage(msg);
				}
			}
			throw ex;
		}

		/**
		 * 引当処理を行う。
		 * 
		 * @param shipSchdL 出荷予定
		 */
		protected void alloc(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			callShipSchdDtServiceSrch02(shipSchdL);
			callAllocMngServiceAllocAvlSprt01(shipSchdL);
			
			MCList<Upd02_ShipSchdR> shipSchdL2 = shipSchdL.subList(Upd02_ShipSchdR.$exceed_alloc_days_flg, false);
			if (!shipSchdL2.isEmpty()) {
				callShipLotChkServiceSrch01(shipSchdL2);
				callAllocMngServiceLockUpd01(shipSchdL2);
				callAllocMngServiceAllocSrch01(shipSchdL2);
				
				MCList<Upd02_ShipSchdR> shipSchdL3 = getShipSchdSrvTarL(shipSchdL2);
				if (!shipSchdL3.isEmpty()) {
					callShipSchdServiceChk02(shipSchdL3);
					throwUpdErr();
					callShipSchdServiceUpd02(shipSchdL3);
					callSloStsRegServiceIns01(shipSchdL3);
				}
			}
			
			setAllocCnt(shipSchdL);
		}
		
		/**
		 * 出荷予定日計算サービスの出荷予定日計算を呼び出す。<br>
		 * 出荷予定に対して、出荷予定日、納品予定日を出荷予定日計算サービスで再計算する。
		 * 
		 * @param shipSchdL
		 */
		protected void callShipSchdDtServiceSrch02(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 ope = MSBEL_ShipSchdDtCalcService.crtShipSchdDt_Srch01();
			
			for (Upd02_ShipSchdR shipSchdR : shipSchdL) {
				if (!shipSchdR.not_dt_calc_flg()) {
					MSW_SHIP_SCHD_DT_CALC_R opeUp0R = MSW_SHIP_SCHD_DT_CALC_R.create();
					copy(opeUp0R, shipSchdR, createMap_MSW_SHIP_SCHD_DT_CALC_R_Upd02_ShipSchdR());
					ope.up0().add(opeUp0R);
				}
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
				
				String[] destCols = new String[]{Upd02_ShipSchdR.$ship_schd_tm, Upd02_ShipSchdR.$dlv_schd_tm, Upd02_ShipSchdR.$ship_wk_cd};
				String[] srcCols = new String[]{MSW_SHIP_SCHD_DT_CALC_R.$ship_schd_tm, MSW_SHIP_SCHD_DT_CALC_R.$dlv_schd_tm, MSW_SHIP_SCHD_DT_CALC_R.$ship_wk_cd};
				
				copyByPegNo(shipSchdL, destCols, ope.down0(), srcCols);
			}
		}
		
		/**
		 * 引当管理サービスの引当可能数チェックを呼び出す<br>
		 * 物流制御マスタから引当可能日数を取得し、範囲外であれば引当処理を実行しない。
		 * 
		 * @param shipSchdL
		 */
		protected void callAllocMngServiceAllocAvlSprt01(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			MSBEL_AllocMngService.Alloc_Avl_Sprt01 ope = MSBEL_AllocMngService.crtAlloc_Avl_Sprt01();
			
			setAll(ope.up0(), shipSchdL, createMap_Alloc_Avl_Sprt01_CndR_Upd02_ShipSchdR());
			ope.exec();
			
			String[] destCols = new String[]{Upd02_ShipSchdR.$exceed_alloc_days_flg};
			String[] srcCols = new String[]{Alloc_Avl_Sprt01_CndR.$exceed_alloc_days_flg};

			copyByPegNo(shipSchdL, destCols, ope.down0(), srcCols);
		}
		
		/**
		 * 出荷ロットチェックサービスの有効期限取得処理を呼び出す。<br>
		 * 出荷ロットから最小・最大の有効期限を取得する。
		 * 
		 * @param shipSchdL
		 */
		protected void callShipLotChkServiceSrch01(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			MSBEL_ShipLotChkService.ShipLotChk_Srch01 ope = MSBEL_ShipLotChkService.crtShipLotChk_Srch01();
			setAll(ope.up0(), shipSchdL, createMap_ShipLot_DtlR_Upd02_ShipSchdR());
			ope.exec();
			
			String[] destCols = new String[]{Upd02_ShipSchdR.$valid_dt_fr, Upd02_ShipSchdR.$valid_dt_fr_grp, Upd02_ShipSchdR.$valid_dt_to};
			String[] srcCols = new String[]{ShipLot_DtlR.$valid_dt_fr, ShipLot_DtlR.$valid_dt_fr_grp, ShipLot_DtlR.$valid_dt_to};

			copyByPegNo(shipSchdL, destCols, ope.down0(), srcCols);
		}
		
		/**
		 * 在庫引当管理サービスのロックを呼び出す。<br>
		 * 引当処理の前にロックを取得する。
		 * 
		 * @param shipSchdL
		 */
		protected void callAllocMngServiceLockUpd01(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			MSBEL_AllocMngService.Alloc_Lock_Upd01 ope = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			setAll(ope.up0(), shipSchdL, createMap_MSW_ALLOC_LOC_MAP_R_Upd02_ShipSchdR());
			ope.exec();
		}
		
		/**
		 * 引当管理サービスのロット提案算出を呼び出す。<br>
		 * 出荷予定に適する在庫や入庫予定を算出する
		 * 
		 * @param shipSchdL
		 */
		protected void callAllocMngServiceAllocSrch01(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			MSBEL_AllocMngService.Alloc_Srch01 ope = MSBEL_AllocMngService.crtAlloc_Srch01();
			
			crtMSBEL5040Up0(ope);
			crtMSBEL5040Up1(ope, shipSchdL);
			
			ope.exec();
			
			_allAllocRsltL = ope.down0();
			_ikAllAllocRslt = _allAllocRsltL.createIndex(Srch_RsltR.$peg_no);
		}
		
		/**
		 * 引当管理サービスのロット提案算出の上り電文０を設定する。
		 * @param ope ロット提案算出オペレーション
		 */
		protected void crtMSBEL5040Up0(MSBEL_AllocMngService.Alloc_Srch01 ope) {

			ope.up0().stk_flg(false);
			ope.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			ope.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
			ope.up0().except_alloc_wait_flg(true);
			ope.up0().nm_srch_flg(false);
		}
		
		/**
		 * 引当管理サービスのロット提案算出の上り電文１を設定する。
		 * @param ope ロット提案算出オペレーション
		 * @param shipSchdL
		 */
		protected void crtMSBEL5040Up1(MSBEL_AllocMngService.Alloc_Srch01 ope, MCList<Upd02_ShipSchdR> shipSchdL) {
			
			setAll(ope.up1(), shipSchdL, createMap_Srch_TgtR_Upd02_ShipSchdR());
		}

		/**
		 * 出荷予定サービスの呼出対象を取得する
		 * 
		 * @param shipSchdL
		 * @return
		 */
		protected MCList<Upd02_ShipSchdR> getShipSchdSrvTarL(MCList<Upd02_ShipSchdR> shipSchdL) {
		
			MCList<Upd02_ShipSchdR> tarL = shipSchdL.createInstance();
			for (Upd02_ShipSchdR shipSchdR : shipSchdL) {
				MCList<Srch_RsltR> allocRsltL = _allAllocRsltL.subList(_ikAllAllocRslt, shipSchdR.peg_no());
				
				if (!allocRsltL.isEmpty()) {
					tarL.add(shipSchdR);
				}
				else if (isAllocWait(shipSchdR)) {
					// 引当可能日数を満たし、引当可能日数に満たないことにによる未引当データが存在する場合は、
					// 引当結果に関わらず出荷予定サービスを実行し、引当保留ＦＬＧを更新する
					tarL.add(shipSchdR);
				}
			}
			return tarL;
		}
		
		/**
		 * 出荷予定サービスの更新（出荷予定）前チェックを呼び出す。
		 * 
		 * @param shipSchdL
		 */
		protected void callShipSchdServiceChk02(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			MSBEL_ShipSchdService.ShipSchd_Chk02 op = MSBEL_ShipSchdService.crtShipSchd_Chk02();
			setAll(op.up0(), shipSchdL, createMap_ShipSchd_DtlR_Upd02_ShipSchdR());
			op.exec();
		}
		
		/**
		 * 出荷予定サービスの更新（出荷予定）を呼び出す。<br>
		 * 出荷予定の追加・更新・削除を行う。
		 * 
		 * @param shipSchdL
		 */
		protected void callShipSchdServiceUpd02(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			MSBEL_ShipSchdService.ShipSchd_Upd02 ope = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			
			ope.up0().lot_chk_flg(true);
			
			crtMSBEL5500Up1(ope, shipSchdL);
			crtMSBEL5500Up2(ope, shipSchdL);
			
			ope.exec();
		}
		
		/**
		 * 引当保留でないデータが存在するか<br>
		 * 
		 * @param shipSchdR
		 * @return
		 */
		protected boolean isAllocWait(Upd02_ShipSchdR shipSchdR) {
			
			MCList<MST_SHIP_ALLOC_STS_R> allocL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder allocL_bldr = MCQueryApiBuilder.create(t);
			allocL_bldr.setSelect(t.alloc_wait_flg);
			allocL_bldr.setWhere(t.ship_schd_no.eq(bind("1")), shipSchdR.ship_schd_no());
			allocL_bldr.addWhereWithAnd(t.alloc_wait_flg.eq(value(false)));
			int cnt = dbSelect("MSBEL0140_MST_SHIP_ALLOC_STS_S01", allocL, allocL_bldr);
			
			return cnt > 0;
		}
		
		/**
		 * 出荷予定サービスの更新（出荷予定）の上り電文１を設定する。
		 * @param ope 出荷予定サービスの更新（出荷予定）オペレーション
		 * @param shipSchdL
		 */
		protected void crtMSBEL5500Up1(MSBEL_ShipSchdService.ShipSchd_Upd02 ope, MCList<Upd02_ShipSchdR> shipSchdL) {
			
			setAll(ope.up1(), shipSchdL, createMap_ShipSchd_DtlR_Upd02_ShipSchdR());
		}
		
		/**
		 * 出荷予定サービスの更新（出荷予定）の上り電文２を設定する。
		 * @param ope 出荷予定サービスの更新（出荷予定）オペレーション
		 * @param shipSchdL
		 */
		protected void crtMSBEL5500Up2(MSBEL_ShipSchdService.ShipSchd_Upd02 ope, MCList<Upd02_ShipSchdR> shipSchdL) {
			
			// 既存の出荷引当状況を取得する
			MCList<MST_SHIP_SCHD_R> wkL = MCList.create(MST_SHIP_SCHD_R.class);
			for (Upd02_ShipSchdR shipSchdR : shipSchdL) {
				MST_SHIP_SCHD_R wkR = MST_SHIP_SCHD_R.create();
				wkR.ship_schd_no(shipSchdR.ship_schd_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			dbWkDelete("MSBEL0140_MSW_SHIP_SCHD_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL0140_MSW_SHIP_SCHD_I01", wkL, wkL_bldr.getBaseDbc());
			
			MCList<MST_SHIP_ALLOC_STS_R> allAllocL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder allAllocL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			MSW_SHIP_SCHD_KEY_R w = MSW_SHIP_SCHD_KEY_R.create("W");
			allAllocL_bldr.addSelect(t1.ship_fr_lg_grp_cd);
			allAllocL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(true)));
			allAllocL_bldr.addInnerJoin(t1, t.ship_schd_no.eq(t1.ship_schd_no));
			allAllocL_bldr.addInnerJoin(w, t1.ship_schd_no.eq(w.ship_schd_no));
			dbSelect("MSBEL0140_MST_SHIP_ALLOC_STS_S02", allAllocL, allAllocL_bldr);
			
			dbWkDelete("MSBEL0140_MSW_SHIP_SCHD_D02", wkL_bldr.getBaseDbc());
			MCIndexKey ik = allAllocL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_schd_no);
			
			for (Upd02_ShipSchdR shipSchdR : shipSchdL) {
				
				MCList<MST_SHIP_ALLOC_STS_R> allocL = allAllocL.subList(ik, shipSchdR.ship_schd_no()); // 既存の出荷引当状況
				MCList<Srch_RsltR> allocRsltL = _allAllocRsltL.subList(_ikAllAllocRslt, shipSchdR.peg_no()); // 新規に引当した結果
				
				if (!allocL.isEmpty()) {
					// 既存の出荷引当状況を引き継ぐ
					
					MCList<Alloc_RsltR> up2L = MCList.create(Alloc_RsltR.class);
					
					setAll(up2L, allocL, createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R());
					
					up2L.setValue(Alloc_RsltR.$itm_cd, shipSchdR.itm_cd());
					up2L.setValue(Alloc_RsltR.$itm_sub1, shipSchdR.itm_sub1());
					up2L.setValue(Alloc_RsltR.$itm_sub2, shipSchdR.itm_sub2());
					up2L.setValue(Alloc_RsltR.$itm_sub3, shipSchdR.itm_sub3());
					
					up2L.setValueNE(Alloc_RsltR.$peg_no, shipSchdR.peg_no());
					ope.up2().addAll(up2L);
				}
				
				if (!isNull(allocRsltL) && !allocRsltL.isEmpty()) {
					// ロット提案の結果
					
					MCList<Alloc_RsltR> up2L = MCList.create(Alloc_RsltR.class);
					setAll(up2L, allocRsltL, createMap_Alloc_RsltR_Srch_RsltR());
					
					up2L.setValueNE(Alloc_RsltR.$peg_no, shipSchdR.peg_no());
					
					if (MAC_ALLOC_SCOPE_TYP.isLOC(shipSchdR.alloc_scope_typ()) || MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(shipSchdR.alloc_scope_typ())) {
						up2L.setValueNE(Alloc_RsltR.$alloc_flg, true);
					}
					
					for(Alloc_RsltR up2R : up2L) {
						if (!isSetStrLn(shipSchdR)) {
							up2R.stk_str_ln_cd (MAC_STR.NULL_VAL.value());
						}
					}
					
					ope.up2().addAll(up2L);
				}
				
			}
		}
		
		protected boolean isSetStrLn(Upd02_ShipSchdR dtlR) {
			MAM_ITM_R itmR = getItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
			if (isNullOrNullVal(dtlR.str_ln_cd())
					&& !MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())
							&& isNullOrNullVal(dtlR.lot_no())) {
				return false;
			}
			return true;
		}
		
		/**
		 * 受注状況更新サービスの受注状況登録処理を呼び出す。<br>
		 * 受注状況に「在庫引当」を登録する。<br>
		 * 
		 * @param shipSchdL
		 */
		protected void callSloStsRegServiceIns01(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			MSBBL_SloStsRegService.SloSts_Ins01 ope = MSBBL_SloStsRegService.crtSloSts_Ins01();
			Map_SloSts_DtlR_Upd02_ShipSchdR<SloSts_DtlR,Upd02_ShipSchdR> mpr = createMap_SloSts_DtlR_Upd02_ShipSchdR();
			
			for (Upd02_ShipSchdR shipSchdR : shipSchdL) {
				if (isNull(shipSchdR.slo_d_no())) {
					continue;
				}
				
				MCList<Srch_RsltR> allocRsltL = _allAllocRsltL.subList(_ikAllAllocRslt, shipSchdR.peg_no());
				
				if (allocRsltL.isEmpty()) {
					continue;
				}
				
				MCGroupByPolicy gp = new MCGroupByPolicy(Srch_RsltR.$pack_unit_cd);
				gp.sum(Srch_RsltR.$pack_unit_qty);
				MCList<Srch_RsltR> sumAllocRsltL = allocRsltL.groupBy(gp);

				for (Srch_RsltR sumAllocRsltR : sumAllocRsltL) {
					SloSts_DtlR upR = SloSts_DtlR.create();
					copy(upR, shipSchdR, mpr);
					upR.unit_cd(sumAllocRsltR.pack_unit_cd());
					upR.qty(sumAllocRsltR.pack_unit_qty());

					ope.up0().add(upR);
				}
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}

		/**
		 * 全数引当、一部引当、引当できなっかた件数を設定する。
		 * 
		 * @param shipSchdL
		 */
		protected void setAllocCnt(MCList<Upd02_ShipSchdR> shipSchdL) {
			
			for (Upd02_ShipSchdR shipSchdR : shipSchdL) {
				if (isNull(_allAllocRsltL)) {
					_nonAllocCnt++;
					continue;
				}
				MCList<Srch_RsltR> allocRsltL = _allAllocRsltL.subList(_ikAllAllocRslt, shipSchdR.peg_no());
				if (isNull(allocRsltL) || allocRsltL.isEmpty()) {
					_nonAllocCnt++;
				}
				else {
					if (isSame(shipSchdR.wait_qty(), allocRsltL.sum(Srch_RsltR.$base_unit_qty))) {
						_allAllocCnt++;
					}
					else {
						_partAllocCnt++;
					}
				}
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			down0().total_cnt(_totalCnt);
			down0().all_alloc_cnt(_allAllocCnt);
			down0().part_alloc_cnt(_partAllocCnt);
			down0().non_alloc_cnt(_nonAllocCnt);
			down0().error_cnt(_errorCnt);
		}
	}
	
	protected Map_MSW_SHIP_SCHD_DT_CALC_R_Upd02_ShipSchdR<MSW_SHIP_SCHD_DT_CALC_R,Upd02_ShipSchdR> createMap_MSW_SHIP_SCHD_DT_CALC_R_Upd02_ShipSchdR() {
		return new Map_MSW_SHIP_SCHD_DT_CALC_R_Upd02_ShipSchdR<MSW_SHIP_SCHD_DT_CALC_R, Upd02_ShipSchdR>();
	}

	public class Map_MSW_SHIP_SCHD_DT_CALC_R_Upd02_ShipSchdR<D extends MSW_SHIP_SCHD_DT_CALC_R, S extends Upd02_ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_typ, Upd02_ShipSchdR.$ship_to_id_typ);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_id_cd, Upd02_ShipSchdR.$ship_to_id_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_to_lg_grp_cd, Upd02_ShipSchdR.$ship_to_lg_grp_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_fr_lg_grp_cd, Upd02_ShipSchdR.$ship_fr_lg_grp_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_term_cd, Upd02_ShipSchdR.$ship_term_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$dlv_day_week_typ, Upd02_ShipSchdR.$dlv_day_week_typ);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_inst_typ, Upd02_ShipSchdR.$ship_inst_typ);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$peg_no, Upd02_ShipSchdR.$peg_no);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.dlv_rqst_tm(nvl(src.pd_inst_dlv_tm(), src.dlv_rqst_tm()));
			dest.ship_rqst_tm(nvl(src.ship_rqst_tm(), src.ship_pr_ship_rqst_tm()));
			
			dest.base_dt(getToday());
			dest.cl_time_chk_flg(true);
			dest.ship_dt_chk_flg(true);
			dest.ship_cal_cd_chk_flg(true);
			dest.early_ship_dt_add_days_chk_flg(true);
		}
	}
	
	protected Map_ShipLot_DtlR_Upd02_ShipSchdR<ShipLot_DtlR,Upd02_ShipSchdR> createMap_ShipLot_DtlR_Upd02_ShipSchdR() {
		return new Map_ShipLot_DtlR_Upd02_ShipSchdR<ShipLot_DtlR, Upd02_ShipSchdR>();
	}

	public class Map_ShipLot_DtlR_Upd02_ShipSchdR<D extends ShipLot_DtlR, S extends Upd02_ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipLot_DtlR.$peg_no, Upd02_ShipSchdR.$peg_no);
			addColumnPathMap(ShipLot_DtlR.$cst_cd, Upd02_ShipSchdR.$cst_cd);
			addColumnPathMap(ShipLot_DtlR.$itm_cd, Upd02_ShipSchdR.$itm_cd);
			addColumnPathMap(ShipLot_DtlR.$itm_sub1, Upd02_ShipSchdR.$itm_sub1);
			addColumnPathMap(ShipLot_DtlR.$itm_sub2, Upd02_ShipSchdR.$itm_sub2);
			addColumnPathMap(ShipLot_DtlR.$itm_sub3, Upd02_ShipSchdR.$itm_sub3);
			
			addColumnPathMap(ShipLot_DtlR.$dlv_cd, Upd02_ShipSchdR.$dlv_id_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.base_dt(isNull(src.dlv_schd_tm()) ? null : src.dlv_schd_tm().startTimeOfDay());
			dest.lock_flg(true);
		}
	}
	
	protected Map_MSW_ALLOC_LOC_MAP_R_Upd02_ShipSchdR<MSW_ALLOC_LOC_MAP_R,Upd02_ShipSchdR> createMap_MSW_ALLOC_LOC_MAP_R_Upd02_ShipSchdR() {
		return new Map_MSW_ALLOC_LOC_MAP_R_Upd02_ShipSchdR<MSW_ALLOC_LOC_MAP_R, Upd02_ShipSchdR>();
	}

	public class Map_MSW_ALLOC_LOC_MAP_R_Upd02_ShipSchdR<D extends MSW_ALLOC_LOC_MAP_R, S extends Upd02_ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, Upd02_ShipSchdR.$itm_cd);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, Upd02_ShipSchdR.$itm_sub1);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, Upd02_ShipSchdR.$itm_sub2);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, Upd02_ShipSchdR.$itm_sub3);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$alloc_grp_cd, Upd02_ShipSchdR.$alloc_grp_cd);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$alloc_scope_typ, Upd02_ShipSchdR.$alloc_scope_typ);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_lg_grp_cd, Upd02_ShipSchdR.$alloc_ship_lg_grp_cd);
			
		}
	}
	
	protected Map_Srch_TgtR_Upd02_ShipSchdR<Srch_TgtR,Upd02_ShipSchdR> createMap_Srch_TgtR_Upd02_ShipSchdR() {
		return new Map_Srch_TgtR_Upd02_ShipSchdR<Srch_TgtR, Upd02_ShipSchdR>();
	}

	public class Map_Srch_TgtR_Upd02_ShipSchdR<D extends Srch_TgtR, S extends Upd02_ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_TgtR.$peg_no, Upd02_ShipSchdR.$peg_no);
			addColumnPathMap(Srch_TgtR.$itm_cd, Upd02_ShipSchdR.$itm_cd);
			addColumnPathMap(Srch_TgtR.$itm_sub1, Upd02_ShipSchdR.$itm_sub1);
			addColumnPathMap(Srch_TgtR.$itm_sub2, Upd02_ShipSchdR.$itm_sub2);
			addColumnPathMap(Srch_TgtR.$itm_sub3, Upd02_ShipSchdR.$itm_sub3);
			addColumnPathMap(Srch_TgtR.$ver_no, Upd02_ShipSchdR.$ver_no);
			addColumnPathMap(Srch_TgtR.$alloc_grp_cd, Upd02_ShipSchdR.$alloc_grp_cd);
			addColumnPathMap(Srch_TgtR.$quality_typ, Upd02_ShipSchdR.$quality_typ);
			addColumnPathMap(Srch_TgtR.$stk_id_typ, Upd02_ShipSchdR.$stk_id_typ);
			addColumnPathMap(Srch_TgtR.$stk_bp_cd, Upd02_ShipSchdR.$stk_bp_cd);
			addColumnPathMap(Srch_TgtR.$gd_cd, Upd02_ShipSchdR.$gd_cd);
			addColumnPathMap(Srch_TgtR.$lot_no, Upd02_ShipSchdR.$lot_no);
			addColumnPathMap(Srch_TgtR.$sublot_no, Upd02_ShipSchdR.$sublot_no);
			addColumnPathMap(Srch_TgtR.$sno1, Upd02_ShipSchdR.$sno1);
			addColumnPathMap(Srch_TgtR.$sno1_null_flg, Upd02_ShipSchdR.$sno1_null_flg);
			addColumnPathMap(Srch_TgtR.$sno2, Upd02_ShipSchdR.$sno2);
			addColumnPathMap(Srch_TgtR.$sno2_null_flg, Upd02_ShipSchdR.$sno2_null_flg);
			addColumnPathMap(Srch_TgtR.$sno3, Upd02_ShipSchdR.$sno3);
			addColumnPathMap(Srch_TgtR.$sno3_null_flg, Upd02_ShipSchdR.$sno3_null_flg);
			addColumnPathMap(Srch_TgtR.$sno4, Upd02_ShipSchdR.$sno4);
			addColumnPathMap(Srch_TgtR.$sno4_null_flg, Upd02_ShipSchdR.$sno4_null_flg);
			addColumnPathMap(Srch_TgtR.$base_unit_cd, Upd02_ShipSchdR.$base_unit_cd);
			addColumnPathMap(Srch_TgtR.$not_lot_mix_flg, Upd02_ShipSchdR.$not_lot_mix_flg);
			addColumnPathMap(Srch_TgtR.$not_sublot_mix_flg, Upd02_ShipSchdR.$not_sublot_mix_flg);
			addColumnPathMap(Srch_TgtR.$vld_dt_fr, Upd02_ShipSchdR.$valid_dt_fr);
			addColumnPathMap(Srch_TgtR.$vld_dt_fr_grp, Upd02_ShipSchdR.$valid_dt_fr_grp);
			addColumnPathMap(Srch_TgtR.$vld_dt_to, Upd02_ShipSchdR.$valid_dt_to);
			addColumnPathMap(Srch_TgtR.$alloc_scope_typ, Upd02_ShipSchdR.$alloc_scope_typ);
			addColumnPathMap(Srch_TgtR.$ship_term_cd, Upd02_ShipSchdR.$ship_term_cd);
			addColumnPathMap(Srch_TgtR.$pack_alloc_flg, Upd02_ShipSchdR.$pack_alloc_flg);
			addColumnPathMap(Srch_TgtR.$gi_lg_grp_cd, Upd02_ShipSchdR.$alloc_ship_lg_grp_cd);
			addColumnPathMap(Srch_TgtR.$gi_loc_cd, Upd02_ShipSchdR.$loc_cd);
			addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, Upd02_ShipSchdR.$str_ln_cd);
			addColumnPathMap(Srch_TgtR.$cst_cd, Upd02_ShipSchdR.$cst_cd);
			addColumnPathMap(Srch_TgtR.$not_lg_mix_flg, Upd02_ShipSchdR.$not_lg_mix_flg);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			if (src.sls_cststk_flg()) {
				// 預り売上の場合は、売上予定日を出庫予定日とする。
				dest.gi_schd_dt(src.sls_schd_dt());
			}
			else {
				dest.gi_schd_dt(isNull(src.ship_schd_tm()) ? null : src.ship_schd_tm().startTimeOfDay());
			}
			dest.gr_schd_dt(isNull(src.dlv_schd_tm()) ? null : src.dlv_schd_tm().startTimeOfDay());
			
			if (MSC_DLV_ID_TYP.isLOC(src.dlv_id_typ())) {
				dest.gr_str_ln_cd(src.dlv_str_ln_cd());
				dest.gr_loc_cd(src.dlv_id_cd());
			}

			dest.dlv_lg_grp_cd(src.ship_to_lg_grp_cd());
			
			if (src.pack_alloc_flg() && src.pack_flg()) {
				
				dest.pack_unit_cd(src.trd_unit_cd());
				if (isSame(dest.pack_unit_cd(), src.base_unit_cd())) {
					dest.pack_unit_qty(src.wait_qty());
				}
				else {
					dest.pack_unit_qty(rvrsBaseUnitConv(
							src.wait_qty(), 
							src.trd_unit_conv_base_qty(),  
							src.trd_unit_conv_qty(), 
							src.trd_unit_dec_place(),
							src.trd_unit_rnd_typ()));
				}
			}
			
			dest.base_unit_qty(src.wait_qty());
			
			if (isNull(src.lot_no())) {
				dest.not_lot_fix_flg(true);
			}
			
			if (MAC_TRD_PTN_TYP.isSLS(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
			}
			else if (MAC_TRD_PTN_TYP.isSHIP(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_OUT.value());
			}
			else if (MAC_TRD_PTN_TYP.isXFR(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI.value());
			}
			else if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_GI_PROV.value());
			}
			else if (MAC_TRD_PTN_TYP.isXFR_RTN(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GI.value());
			}
			else if (MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_RTN_GI_PROV.value());
			}
			
			// 受払予定状況区分は、売上の細かい区分までは設定しなくてよい。
			if (MAC_TRD_PTN_TYP.isSLS(src.trd_ptn_typ())) {
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SLO.value());
			}
			else {
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			}
			
			// 移動・移送予定の場合は、ＶＭＩ在庫を引当できるよう、在庫識別区分が自社在庫の場合、在庫識別区分をクリアする
			if ((MAC_TRD_PTN_TYP.isXFR(src.trd_ptn_typ()) 
				|| MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_RTN(src.trd_ptn_typ()) 
				|| MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) 
					&& MSC_STK_ID_TYP.isCOSTK(dest.stk_id_typ())) {
				dest.stk_id_typ(null);
				dest.stk_bp_cd(null);
			}
			
			dest.stk_alloc_flg(false);
		}
	}
	
	protected Map_ShipSchd_DtlR_Upd02_ShipSchdR<ShipSchd_DtlR,Upd02_ShipSchdR> createMap_ShipSchd_DtlR_Upd02_ShipSchdR() {
		return new Map_ShipSchd_DtlR_Upd02_ShipSchdR<ShipSchd_DtlR, Upd02_ShipSchdR>();
	}

	public class Map_ShipSchd_DtlR_Upd02_ShipSchdR<D extends ShipSchd_DtlR, S extends Upd02_ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipSchd_DtlR.$peg_no, Upd02_ShipSchdR.$peg_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_schd_no, Upd02_ShipSchdR.$ship_schd_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_pr_no, Upd02_ShipSchdR.$ship_pr_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_inst_d_no, Upd02_ShipSchdR.$ship_inst_d_no);
			addColumnPathMap(ShipSchd_DtlR.$dlv_inst_rcpt_no, Upd02_ShipSchdR.$dlv_inst_rcpt_no);
			addColumnPathMap(ShipSchd_DtlR.$slo_prms_no, Upd02_ShipSchdR.$slo_prms_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_fr_lg_grp_cd, Upd02_ShipSchdR.$ship_fr_lg_grp_cd);
			addColumnPathMap(ShipSchd_DtlR.$wg_cd, Upd02_ShipSchdR.$wg_cd);
			addColumnPathMap(ShipSchd_DtlR.$pd_inst_dlv_tm, Upd02_ShipSchdR.$pd_inst_dlv_tm);
			addColumnPathMap(ShipSchd_DtlR.$ship_rqst_tm, Upd02_ShipSchdR.$ship_rqst_tm);
			addColumnPathMap(ShipSchd_DtlR.$ship_schd_tm, Upd02_ShipSchdR.$ship_schd_tm);
			addColumnPathMap(ShipSchd_DtlR.$dlv_schd_tm, Upd02_ShipSchdR.$dlv_schd_tm);
			addColumnPathMap(ShipSchd_DtlR.$ship_term_cd, Upd02_ShipSchdR.$ship_term_cd);
			addColumnPathMap(ShipSchd_DtlR.$ship_wk_cd, Upd02_ShipSchdR.$ship_wk_cd);
			addColumnPathMap(ShipSchd_DtlR.$itm_cd, Upd02_ShipSchdR.$itm_cd);
			addColumnPathMap(ShipSchd_DtlR.$itm_sub1, Upd02_ShipSchdR.$itm_sub1);
			addColumnPathMap(ShipSchd_DtlR.$itm_sub2, Upd02_ShipSchdR.$itm_sub2);
			addColumnPathMap(ShipSchd_DtlR.$itm_sub3, Upd02_ShipSchdR.$itm_sub3);
			addColumnPathMap(ShipSchd_DtlR.$itm_nm, Upd02_ShipSchdR.$itm_nm);
			addColumnPathMap(ShipSchd_DtlR.$iv_itm_nm, Upd02_ShipSchdR.$iv_itm_nm);
			addColumnPathMap(ShipSchd_DtlR.$sundry_itm_flg, Upd02_ShipSchdR.$sundry_itm_flg);
			addColumnPathMap(ShipSchd_DtlR.$sno1, Upd02_ShipSchdR.$sno1);
			addColumnPathMap(ShipSchd_DtlR.$sno1_null_flg, Upd02_ShipSchdR.$sno1_null_flg);
			addColumnPathMap(ShipSchd_DtlR.$sno2, Upd02_ShipSchdR.$sno2);
			addColumnPathMap(ShipSchd_DtlR.$sno2_null_flg, Upd02_ShipSchdR.$sno2_null_flg);
			addColumnPathMap(ShipSchd_DtlR.$sno3, Upd02_ShipSchdR.$sno3);
			addColumnPathMap(ShipSchd_DtlR.$sno3_null_flg, Upd02_ShipSchdR.$sno3_null_flg);
			addColumnPathMap(ShipSchd_DtlR.$sno4, Upd02_ShipSchdR.$sno4);
			addColumnPathMap(ShipSchd_DtlR.$sno4_null_flg, Upd02_ShipSchdR.$sno4_null_flg);
			addColumnPathMap(ShipSchd_DtlR.$lot_no, Upd02_ShipSchdR.$lot_no);
			addColumnPathMap(ShipSchd_DtlR.$sublot_no, Upd02_ShipSchdR.$sublot_no);
			addColumnPathMap(ShipSchd_DtlR.$ver_no, Upd02_ShipSchdR.$ver_no);
			addColumnPathMap(ShipSchd_DtlR.$stk_arrv_bp_cd, Upd02_ShipSchdR.$stk_arrv_bp_cd);
			addColumnPathMap(ShipSchd_DtlR.$gd_cd, Upd02_ShipSchdR.$gd_cd);
			addColumnPathMap(ShipSchd_DtlR.$quality_typ, Upd02_ShipSchdR.$quality_typ);
			addColumnPathMap(ShipSchd_DtlR.$stk_id_typ, Upd02_ShipSchdR.$stk_id_typ);
			addColumnPathMap(ShipSchd_DtlR.$stk_bp_cd, Upd02_ShipSchdR.$stk_bp_cd);
			addColumnPathMap(ShipSchd_DtlR.$trd_unit_qty, Upd02_ShipSchdR.$trd_unit_qty);
			addColumnPathMap(ShipSchd_DtlR.$trd_unit_cd, Upd02_ShipSchdR.$trd_unit_cd);
			addColumnPathMap(ShipSchd_DtlR.$base_unit_qty, Upd02_ShipSchdR.$base_unit_qty);
			addColumnPathMap(ShipSchd_DtlR.$base_unit_cd, Upd02_ShipSchdR.$base_unit_cd);
			addColumnPathMap(ShipSchd_DtlR.$abort_flg, Upd02_ShipSchdR.$abort_flg);
			addColumnPathMap(ShipSchd_DtlR.$fix_flg, Upd02_ShipSchdR.$fix_flg);
			addColumnPathMap(ShipSchd_DtlR.$ship_block_flg, Upd02_ShipSchdR.$ship_block_flg);
			addColumnPathMap(ShipSchd_DtlR.$inst_bndl_flg, Upd02_ShipSchdR.$inst_bndl_flg);
			addColumnPathMap(ShipSchd_DtlR.$not_lot_mix_flg, Upd02_ShipSchdR.$not_lot_mix_flg);
			addColumnPathMap(ShipSchd_DtlR.$not_sublot_mix_flg, Upd02_ShipSchdR.$not_sublot_mix_flg);
			addColumnPathMap(ShipSchd_DtlR.$vld_dt_fr, Upd02_ShipSchdR.$vld_dt_fr);
			addColumnPathMap(ShipSchd_DtlR.$vld_dt_to, Upd02_ShipSchdR.$vld_dt_to);
			addColumnPathMap(ShipSchd_DtlR.$re_ship_schd_flg, Upd02_ShipSchdR.$re_ship_schd_flg);
			addColumnPathMap(ShipSchd_DtlR.$intr_rmrks, Upd02_ShipSchdR.$intr_rmrks);
			addColumnPathMap(ShipSchd_DtlR.$trd_rmrks, Upd02_ShipSchdR.$trd_rmrks);
			addColumnPathMap(ShipSchd_DtlR.$trd_d_rmrks, Upd02_ShipSchdR.$trd_d_rmrks);
			addColumnPathMap(ShipSchd_DtlR.$ship_cnt_rmrks, Upd02_ShipSchdR.$ship_cnt_rmrks);
			addColumnPathMap(ShipSchd_DtlR.$sub_char1, Upd02_ShipSchdR.$sub_char1);
			addColumnPathMap(ShipSchd_DtlR.$sub_char2, Upd02_ShipSchdR.$sub_char2);
			addColumnPathMap(ShipSchd_DtlR.$sub_char3, Upd02_ShipSchdR.$sub_char3);
			addColumnPathMap(ShipSchd_DtlR.$not_dt_calc_flg, Upd02_ShipSchdR.$not_dt_calc_flg);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			dest.ship_schd_split_flg(true);
			dest.ship_judge_flg(false);
			dest.iv_chk_skip_flg(true);
		}
	}
	
	
	protected Map_Alloc_Avl_Sprt01_CndR_Upd02_ShipSchdR<Alloc_Avl_Sprt01_CndR,Upd02_ShipSchdR> createMap_Alloc_Avl_Sprt01_CndR_Upd02_ShipSchdR() {
		return new Map_Alloc_Avl_Sprt01_CndR_Upd02_ShipSchdR<Alloc_Avl_Sprt01_CndR, Upd02_ShipSchdR>();
	}

	public class Map_Alloc_Avl_Sprt01_CndR_Upd02_ShipSchdR<D extends Alloc_Avl_Sprt01_CndR, S extends Upd02_ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$peg_no, Upd02_ShipSchdR.$peg_no);
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$dlv_lg_grp_cd, Upd02_ShipSchdR.$ship_to_lg_grp_cd);
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$gi_lg_grp_cd, Upd02_ShipSchdR.$ship_fr_lg_grp_cd);
			addColumnPathMap(Alloc_Avl_Sprt01_CndR.$ship_term_cd, Upd02_ShipSchdR.$ship_term_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			if (src.sls_cststk_flg()) {
				// 預り売上の場合は、売上予定日を出庫予定日とする。
				dest.gi_schd_dt(src.sls_schd_dt());
			}
			else {
				dest.gi_schd_dt(src.ship_schd_tm().startTimeOfDay());
			}
		}
	}
	
	protected Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<Alloc_RsltR,MST_SHIP_ALLOC_STS_R> createMap_Alloc_RsltR_MST_SHIP_ALLOC_STS_R() {
		return new Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<Alloc_RsltR, MST_SHIP_ALLOC_STS_R>();
	}

	public class Map_Alloc_RsltR_MST_SHIP_ALLOC_STS_R<D extends Alloc_RsltR, S extends MST_SHIP_ALLOC_STS_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Alloc_RsltR.$ver_no, MST_SHIP_ALLOC_STS_R.$ver_no);
			
			addColumnPathMap(Alloc_RsltR.$stk_loc_cd, MST_SHIP_ALLOC_STS_R.$ship_loc_cd);
			addColumnPathMap(Alloc_RsltR.$stk_str_ln_cd, MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd);
			addColumnPathMap(Alloc_RsltR.$quality_typ, MST_SHIP_ALLOC_STS_R.$quality_typ);
			addColumnPathMap(Alloc_RsltR.$stk_insp_typ, MST_SHIP_ALLOC_STS_R.$stk_insp_typ);
			addColumnPathMap(Alloc_RsltR.$stk_id_typ, MST_SHIP_ALLOC_STS_R.$stk_id_typ);
			addColumnPathMap(Alloc_RsltR.$stk_bp_cd, MST_SHIP_ALLOC_STS_R.$stk_bp_cd);
			addColumnPathMap(Alloc_RsltR.$gd_cd, MST_SHIP_ALLOC_STS_R.$gd_cd);
			addColumnPathMap(Alloc_RsltR.$lot_no, MST_SHIP_ALLOC_STS_R.$lot_no);
			addColumnPathMap(Alloc_RsltR.$sublot_no, MST_SHIP_ALLOC_STS_R.$sublot_no);
			addColumnPathMap(Alloc_RsltR.$sno1, MST_SHIP_ALLOC_STS_R.$sno1);
			addColumnPathMap(Alloc_RsltR.$sno2, MST_SHIP_ALLOC_STS_R.$sno2);
			addColumnPathMap(Alloc_RsltR.$sno3, MST_SHIP_ALLOC_STS_R.$sno3);
			addColumnPathMap(Alloc_RsltR.$sno4, MST_SHIP_ALLOC_STS_R.$sno4);
			addColumnPathMap(Alloc_RsltR.$pack_unit_cd, MST_SHIP_ALLOC_STS_R.$pack_unit_cd);
			addColumnPathMap(Alloc_RsltR.$pack_unit_qty, MST_SHIP_ALLOC_STS_R.$pack_unit_qty);
			addColumnPathMap(Alloc_RsltR.$base_unit_cd, MST_SHIP_ALLOC_STS_R.$base_unit_cd);
			addColumnPathMap(Alloc_RsltR.$base_unit_qty, MST_SHIP_ALLOC_STS_R.$base_unit_qty);
			addColumnPathMap(Alloc_RsltR.$vld_dt_fr, MST_SHIP_ALLOC_STS_R.$vld_dt_fr);
			addColumnPathMap(Alloc_RsltR.$vld_dt_to, MST_SHIP_ALLOC_STS_R.$vld_dt_to);
			addColumnPathMap(Alloc_RsltR.$alloc_flg, MST_SHIP_ALLOC_STS_R.$alloc_flg);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.stk_lg_grp_cd(src.getStringNE("ship_fr_lg_grp_cd"));
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
	
	protected Map_SloSts_DtlR_Upd02_ShipSchdR<SloSts_DtlR,Upd02_ShipSchdR> createMap_SloSts_DtlR_Upd02_ShipSchdR() {
		return new Map_SloSts_DtlR_Upd02_ShipSchdR<SloSts_DtlR, Upd02_ShipSchdR>();
	}

	public class Map_SloSts_DtlR_Upd02_ShipSchdR<D extends SloSts_DtlR, S extends Upd02_ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
			addColumnPathMap(SloSts_DtlR.$slo_d_no, Upd02_ShipSchdR.$slo_d_no);
			addColumnPathMap(SloSts_DtlR.$loc_cd, Upd02_ShipSchdR.$loc_cd);
			addColumnPathMap(SloSts_DtlR.$alloc_grp_cd, Upd02_ShipSchdR.$alloc_grp_cd);
			addColumnPathMap(SloSts_DtlR.$ship_lg_grp_cd, Upd02_ShipSchdR.$ship_fr_lg_grp_cd);
			
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.slo_sts_typ(MSC_SLO_STS_TYP.ALLOC.value());
		}
	}

	//FMCB CUSTOM END
}