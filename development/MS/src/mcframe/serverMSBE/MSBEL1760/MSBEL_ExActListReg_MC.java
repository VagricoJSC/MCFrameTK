package mcframe.serverMSBE.MSBEL1760;

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
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
import mcframe.serverMSBE.MSBEL1760.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5710.*;
import mcframe.serverMSBI.MSBIL5010.*;
import static mcframe.serverMSBE.MSBEL1760.Query.*;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ExActListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ExActListReg_MC extends MSBEL_ExActListReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 輸出実績の登録前チェックをする<br>
	 */
	public class Chk01 extends MSBEL_ExActListReg_MC_A.Chk01 {
		
		/** up2のインボイスＮＯのインデックスキー */
		protected MCIndexKey _ikup2Iv;
		
		/** ロックした出荷進捗トラン */
		protected MCList<MST_SHIP_PR_R> _prL;
		
		/** ロックした出荷進捗トランの出荷進捗ＮＯのインデックスキー*/
		protected MCIndexKey _ikPrShipPr;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();

			setErrToRtnStsTyp();
			setDown();
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			MCList<Chk01_RsltR> crrctL = createChk01_RsltL();
			crrctL = up1().subList(r -> isNull(r.bcst_cd()));
			
			if (!crrctL.isEmpty()) {
				// データ補完
				crrctData(crrctL);
			}
			initBpCache(up1());
			
			if (msgL.isEmpty()) {
				chkUpdCntrIv(msgL);
			}
			if (msgL.isEmpty()) {
				chkUpdCntrShipPr(msgL);
			}
			
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			checkDac(msgL);
			checkCl(msgL);
			checkOther(msgL);

			return msgL;
		}
		

		/**
		 * インボイスヘッダに対する更新カウンタチェック
		 * 
		 * @param msgL
		 */
		protected void chkUpdCntrIv(MCMessageList msgL) {
			
			MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
			MST_IV_R t = MST_IV_R.create("T");
			MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(t);
			ivL_bldr.setSelect(t.iv_mng_no,
					t.iv_rev,
					t.iv_no,
					t.trd_ptn_typ,
					t.ac_dt,
					t.upd_cntr);
			ivL_bldr.setOrderByAsc(ivL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBEL1760_MST_IV_S01", ivL, ivL_bldr, up1());
			
			MCIndexKey ik = ivL.createIndex(MST_IV_R.$iv_no);
			for (Chk01_RsltR upR : up1()) {
				MST_IV_R ivR = ivL.getFirst(ik, upR.iv_no());
				msgL.addAll(checkUpdCntrNE(upR, Chk01_RsltR.$iv_upd_cntr, ivR));
				
				if (MAC_DATA_CRUD_TYP.isDEL(up0().data_crud_typ()) && ivR != null) {
					// 取消時のＤＡＣチェック用に補完する
					upR.iv_mng_no(ivR.iv_mng_no());
					upR.ac_dt(ivR.ac_dt()); // ＤＡＣチェックでのみ使用するので、下り電文からはクリアする
					upR.trd_ptn_typ(ivR.trd_ptn_typ());
				}
				upR.iv_rev(ivR.iv_rev());
			}
		}
		
		/**
		 * 出荷進捗に対する更新カウンタチェック
		 * 
		 * @param msgL
		 */
		protected void chkUpdCntrShipPr(MCMessageList msgL) {

			// 移送の更新権限チェック用に、物流グループのワーキンググループも合わせて取得する
			_prL = MCList.create(MST_SHIP_PR_R.class);
			MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
			MCQueryApiBuilder prL_bldr = MCQueryApiBuilder.create(t);
			MAM_LG_GRP_R m1 = MAM_LG_GRP_R.create("M1");
			prL_bldr.setSelect(t.ship_pr_no);
			prL_bldr.addSelect(t.upd_cntr);
			prL_bldr.addSelect(m1.wg_cd.as("lg_grp_wg_cd"));
			prL_bldr.addLeftOuterJoin(m1, bracket(t.ship_lg_grp_cd.eq(m1.lg_grp_cd)));
			prL_bldr.setLockTable(t.ship_pr_no);
			prL_bldr.setOrderByAsc(prL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBEL1760_MST_SHIP_PR_S01", _prL, prL_bldr, up2());

			_ikup2Iv = up2().createIndex(Chk01_ShipPrCntR.$iv_no);
			_ikPrShipPr = _prL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
			for (Chk01_RsltR up1R : up1()) {
				for (Chk01_ShipPrCntR up2R : up2().subList(_ikup2Iv, up1R.iv_no())) {
					MST_SHIP_PR_R prR = _prL.getFirst(_ikPrShipPr, up2R.ship_pr_no());
					MCMessageList tmpMsg = checkUpdCntrNE(up2R, Chk01_ShipPrCntR.$ship_pr_upd_cntr, prR);
					if (!tmpMsg.isEmpty()) {
						// インボイス明細の行のエラーフラグがオンとなるようにする
						tmpMsg.get(0).setCauseRow(up1R, null);
						msgL.addAll(tmpMsg);
						break;
					}
				}	
			}
		}
		
		/**
		 * データアクセスコントロールの更新権限チェック
		 * 
		 * @param msgL
		 */
		protected void checkDac(MCMessageList msgL) {

			MCList<Chk01_RsltR> notErrL = getChkList(up1());
			MCMessageList tmpMsgL = null;
			
			for(Chk01_RsltR r : notErrL) {
				if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
					
					MCList<MST_IV_D_R> ivDL = MCList.create(MST_IV_D_R.class);
					MST_IV_D_R t1 = MST_IV_D_R.create("T");
					MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(t1);
					MST_IV_R t2 = MST_IV_R.create("T2");
					MST_SLO_R t3 = MST_SLO_R.create("T3");
					MAM_DPT_R m1 = MAM_DPT_R.create("M1");
					ivDL_bldr.setDistinct();
					ivDL_bldr.setSelect(m1.wg_cd.as("sls_dpt_wg_cd"));
					ivDL_bldr.setWhere(t1.iv_mng_no.eq(bind("iv_mng_no")));
					ivDL_bldr.addLeftOuterJoin(t2, bracket(t1.iv_mng_no.eq(t2.iv_mng_no)));
					ivDL_bldr.addLeftOuterJoin(t3, bracket(t1.slo_no.eq(t3.slo_no)));
					ivDL_bldr.addLeftOuterJoin(m1, bracket(t1.sls_dpt_cd.eq(m1.dpt_cd)
							.and(nvl(t3.slo_dt, t2.iv_dt).between(m1.st_dt, m1.end_dt))));
					dbSelect("MSBEL1760_MST_IV_D_S01", ivDL, ivDL_bldr, r);
					
					tmpMsgL = checkWritableWgCdDac(ivDL, "sls_dpt_wg_cd");
				}
				else {
					
					MCList<MST_IV_D_R> ivDL = MCList.create(MST_IV_D_R.class);
					MST_IV_D_R t1 = MST_IV_D_R.create("T");
					MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(t1);
					MST_XFR_SCHD_R t2 = MST_XFR_SCHD_R.create("T2");
					MAM_ITM_LG_GRP_R m1 = MAM_ITM_LG_GRP_R.create("M1");
					MAM_LOC_R m2 = MAM_LOC_R.create("M2");
					ivDL.addStringColumn("chk_gi_loc_cd");
					ivDL_bldr.setDistinct();
					ivDL_bldr
							.setSelect(coalesce(t2.gi_loc_cd, m1.lg_def_loc_cd, m2.loc_cd)
									.as("chk_gi_loc_cd"));
					ivDL_bldr.setWhere(t1.iv_mng_no.eq(bind("iv_mng_no")));
					ivDL_bldr.addLeftOuterJoin(t2,
							bracket(t1.xfr_schd_no.eq(t2.xfr_schd_no)));
					ivDL_bldr.addLeftOuterJoin(m1,
							bracket(m1.itm_cd.eq(t2.itm_cd)
									.and(m1.itm_sub1.eq(t2.itm_sub1))
									.and(m1.itm_sub2.eq(t2.itm_sub2))
									.and(m1.itm_sub3.eq(t2.itm_sub3))
									.and(m1.lg_grp_cd.eq(t2.gi_lg_grp_cd))));
					ivDL_bldr.addLeftOuterJoin(m2, bracket(m2.lg_grp_cd
							.eq(t2.gi_lg_grp_cd)
							.and(m2.lg_def_flg.eq(value(true)))));
					dbSelect("MSBEL1760_MST_IV_D_S02", ivDL, ivDL_bldr, r);
					
					tmpMsgL = checkWritableLocCdDac(ivDL, "chk_gi_loc_cd");
				}
				
				for (MCMessage tmpMsg : tmpMsgL) {
					tmpMsg.setCauseRow(r, null);
				}
				msgL.addAll(tmpMsgL);
			}
		}
		
		/**
		 * 締日チェック
		 * 
		 * @param msgL
		 */
		protected void checkCl(MCMessageList msgL) {
			
			MCList<Chk01_RsltR> notErrL = getChkList(up1());
			MSBIL_ClService.Cl_Chk03 ope = MSBIL_ClService.crtCl_Chk03();
			setAll(ope.up0(), notErrL, createMap_Cl_Chk03_CndR_Chk01_RsltR());
			ope.exec();
			copyErrFlg(notErrL, ope.down0());
		}
		
		/**
		 * 固有チェック
		 * 
		 * @param msgL
		 */
		protected void checkOther(MCMessageList msgL) {
			
			if (MAC_DATA_CRUD_TYP.isDEL(up0().data_crud_typ())) {
				return;
			}
			MCList<Chk01_RsltR> notErrL = getChkList(up1());
			// 計上日≦請求起算日チェック
			msgL.addAll(checkAcDtBillBasisDt(notErrL));
			
			//取引先禁止チェック
			msgL.addAll(checkBpStop(notErrL));
			
			//品目禁止チェック
			msgL.addAll(checkItmStop(notErrL));
		}
		
		/**
		 * 計上日≦請求起算日チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkAcDtBillBasisDt(MCList<Chk01_RsltR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_RsltR r : notErrL) {
				MAM_BP_R bcstR = getBpCache(r.bcst_cd());
				// 売上都度請求以外、計上日≦請求起算日チェック
				if (!MAC_BILL_CL_TYP.isEACH_SLS(bcstR.bill_cl_typ())) {
					msgL.addAll(check(r, new String[] {Chk01_RsltR.$ac_dt, Chk01_RsltR.$bill_basis_dt}, new FXUCL_BeforeAfterValidater()));
				}
			}
			return msgL;
		}
		
		/**
		 * 取引先禁止チェック
		 * 
		 * @param notErrL
		 * @return
		 */
		protected MCMessageList checkBpStop(MCList<Chk01_RsltR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for(Chk01_RsltR r : notErrL) {
				// 売上・出荷禁止チェックのみ行う。移送・移動禁止チェックは出荷後の輸出では行わない
				if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())) {
					boolean rslt = execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_BP$F_IS_SLS_STOP", "01"),
							MAPA_BP$F_IS_SLS_STOP(bind("ship_rqst_id_cd"),
									bind("cmpl_dt")), r);
					if (rslt) {
						msgL.add(new MCMessage(r, null, MSBEL0143, r.ship_rqst_id_cd(), 
								toYMDString(r.cmpl_dt()), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		/**
		 * 品目禁止チェック
		 * 
		 * @param notErrL
		 * @return
		 */
		protected MCMessageList checkItmStop(MCList<Chk01_RsltR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			
			for(Chk01_RsltR r : notErrL) {

				// 売上・出荷禁止チェックのみ行う。移送・移動禁止チェックは出荷後の輸出では行わない
				if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())) {
					MCList<MST_IV_D_R> ivDL = MCList.create(MST_IV_D_R.class);
					MST_IV_D_R t = MST_IV_D_R.create("T");
					MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(t);
					ivDL.addBooleanColumn("itm_stop_flg");

					ivDL_bldr.setDistinct();
					ivDL_bldr.setSelect(t.itm_cd);
					ivDL_bldr.addSelect(t.itm_sub1);
					ivDL_bldr.addSelect(t.itm_sub2);
					ivDL_bldr.addSelect(t.itm_sub3);
					ivDL_bldr.setWhere(t.iv_mng_no.eq(bind("iv_mng_no")));
					ivDL_bldr.addSelect(MAPA_ITM$F_IS_SLS_STOP(t.itm_cd, t.itm_sub1,
							t.itm_sub2, t.itm_sub3, bind("cmpl_dt")).as("itm_stop_flg"));
					dbSelect("MSBEL1760_MST_IV_D_S03", ivDL, ivDL_bldr, r);
						
					for (MST_IV_D_R ivR : ivDL.subList("itm_stop_flg", true)) {
						msgL.add(new MCMessage(r, null, MSBEL0128, r.iv_no(), 
								toDispItm(ivR.itm_cd(), ivR.itm_sub1(), ivR.itm_sub2(), ivR.itm_sub3()),
								toYMDString(r.cmpl_dt()), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			if (MAC_DATA_CRUD_TYP.isDEL(up0().data_crud_typ())) {
				up1().setDate(Chk01_RsltR.$ac_dt, null); // ＤＡＣ用に補完した値はクリアする
			}
			
			down0().setAll(up1());
		}
		
		protected Map_Cl_Chk03_CndR_Chk01_RsltR<Cl_Chk03_CndR,Chk01_RsltR> createMap_Cl_Chk03_CndR_Chk01_RsltR() {
			return new Map_Cl_Chk03_CndR_Chk01_RsltR<Cl_Chk03_CndR, Chk01_RsltR>();
		}

		public class Map_Cl_Chk03_CndR_Chk01_RsltR<D extends Cl_Chk03_CndR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cl_Chk03_CndR.$peg_no, Chk01_RsltR.$peg_no);
				if (!MAC_DATA_CRUD_TYP.isDEL(up0().data_crud_typ())) {
					addColumnPathMap(Cl_Chk03_CndR.$ac_dt, Chk01_RsltR.$ac_dt);
				}
				addColumnPathMap(Cl_Chk03_CndR.$can_ac_dt, Chk01_RsltR.$can_ac_dt);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.stk_cls_chk_flg(true);
				// 入出庫制限についてはチェックしない
				// 売上の仮締は売上実績サービス内でチェック
			}
		}
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 輸出実績を登録・訂正する<br>
	 */
	public class Upd01 extends MSBEL_ExActListReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up1());
			}
			catch (Exception e) {
				handleEx(e, up1());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			// 初期処理
			editUp();

			// チェック処理
			callThisChk01();
			
			MCList<Chk01_RsltR> notErrL = up1().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				//輸出実績管理サービスを呼び出す
				callExActUpd01(notErrL);
			}

		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(up1());
		}
		
		/**
		 * 登録前チェック処理を実行する
		 */
		protected void callThisChk01() {

			MSBEL_ExActListReg.Chk01 o = MSBEL_ExActListReg.crtChk01();
			MCRow.copyall(o.up0(), up0());
			o.up1().setAll(up1());
			o.up2().setAll(up2());
			o.exec();
			
			up1().setAll(o.down0());
		}

		/**
		 * 輸出実績管理サービス実行呼び出し
		 */
		protected void callExActUpd01(MCList<Chk01_RsltR> notErrL) {
			MSBEL_ExActService.ExAct_Upd01 o = MSBEL_ExActService.crtExAct_Upd01();
			
			o.up0().data_crud_typ(up0().data_crud_typ());
			setAll(o.up1(), notErrL, createMap_ExAct_Upd01_DtlR_Chk01_RsltR());

			o.exec();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up1());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up1().size());
		}
		
		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			MCList<T> ret = (MCList<T>) up1();
			return ret;
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_RsltR>> list = splitUp(up1(), getSplitRowCount());
			MCIndexKey idx = up2().createIndex(Chk01_ShipPrCntR.$iv_no);
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				Chk01_HdrR up0R = (Chk01_HdrR)ope.up(0);
				@SuppressWarnings("unchecked")
				MCList<Chk01_RsltR> up1L = ((MCList<Chk01_RsltR>)ope.up(1));
				@SuppressWarnings("unchecked")
				MCList<Chk01_ShipPrCntR> up2L = ((MCList<Chk01_ShipPrCntR>)ope.up(2));
				MCRow.copyall(up0R, up0());
				up1L.setAll(l);
				for (Chk01_RsltR hdrR : l) {
					up2L.addAll(up2().subList(idx, hdrR.iv_no()));
				}
				opeL.add(ope);
			}
			return opeL;
		}

	}
	
	protected void handleSuccess(MCList<Chk01_RsltR> l) {
		dbTran().commit();
		for (Chk01_RsltR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	protected void handleEx(Exception e, MCList<Chk01_RsltR> l) {
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
		for (Chk01_RsltR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}
	
	/**
	 * インボイスＮＯまたは請求先ＣＤが同一の上り電文行が、同じMCListに格納されるように分割する
	 * @param list クライアントから渡された上り電文
	 * @param max １スレッドあたりの最大件数
	 * @return
	 */
	protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
		List<MCList<Chk01_RsltR>> ret = new ArrayList<>();
		// データ補完
		crrctData(list);

		// 与信管理先ＣＤ
		MCList<Chk01_RsltR>[] credCdGrpL = list.groupList(Chk01_RsltR.$cred_cd);
		MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
		for (MCList<Chk01_RsltR> credCdL : credCdGrpL) {
			if (!isNull(credCdL.get(0).cred_cd())) {
				if (tmp.size() >=  max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_RsltR.class);
				}
				tmp.addAll(credCdL);
			}
			else {
				// 与信管理先ＣＤがなければ請求先ＣＤ
				MCList<Chk01_RsltR>[] bcstCdGrpL = credCdL
						.groupList(Chk01_RsltR.$bcst_cd);
				for (MCList<Chk01_RsltR> bcstCdL : bcstCdGrpL) {
					if (tmp.size() >= max) {
						ret.add(tmp);
						tmp = MCList.create(Chk01_RsltR.class);
					}
					tmp.addAll(bcstCdL);
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
	protected void crrctData(MCList<Chk01_RsltR> list) {
		MCList<MST_IV_R> insWkL = MCList.create(MST_IV_R.class);
		MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_IV_R.create("T"));
		dbWkDelete("MSBEL1760_MSW_IV_D01", insWkL_bldr.getBaseDbc());
		for (Chk01_RsltR dtlR : list) {
			MST_IV_R r = MST_IV_R.create();
			r.iv_mng_no(dtlR.iv_mng_no());
			insWkL.add(r);
		}
		dbWkInsert("MSBEL1760_MSW_IV_I01", insWkL, insWkL_bldr.getBaseDbc());
		
		
		// SELECT
		MAM_CO_R co = MAM_CO_R.create("CO");
		MSW_IV_KEY_R t1w = MSW_IV_KEY_R.create("T1W");
		MAM_BP_R cst = MAM_BP_R.create("CST");
		MAM_BP_R acst = MAM_BP_R.create("ACST");
		MAM_BP_R bcst = MAM_BP_R.create("BCST");
		MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
		MST_IV_R t2 = MST_IV_R.create("T");
		MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(t2);
		ivL_bldr.setSelect(t2.iv_mng_no);
		ivL_bldr.addSelect(acst.bcst_cd);
		ivL_bldr.addSelect(bcst.ar_cred_cd);
		ivL_bldr.addCrossJoin(co);
		ivL_bldr.addInnerJoin(t1w, bracket(t2.iv_mng_no.eq(t1w.iv_mng_no)));
		ivL_bldr.addLeftOuterJoin(cst, bracket(t2.ship_rqst_id_cd.eq(cst.bp_cd)));
		ivL_bldr.addLeftOuterJoin(acst, bracket(cst.acst_cd.eq(acst.bp_cd)));
		ivL_bldr.addLeftOuterJoin(bcst, bracket(acst.bcst_cd.eq(bcst.bp_cd)));
		dbSelect("MSBEL1760_MST_IV_S02", ivL, ivL_bldr);
		
		
		MCIndexKey idxKey = ivL.createIndex(MST_IV_R.$iv_mng_no);
		
		for (Chk01_RsltR dtlR : list) {
			MCList<MST_IV_R> tmpL = ivL.subList(idxKey, dtlR.iv_mng_no());
			dtlR.bcst_cd(tmpL.get(0).getStringNE("bcst_cd"));
			dtlR.cred_cd(tmpL.get(0).getStringNE("ar_cred_cd"));
		}
		dbWkDelete("MSBEL1760_MSW_IV_D02", insWkL_bldr.getBaseDbc());
	}
	
	/**
	 * Del01オペレーション.<p>
	 *
	 * 輸出実績を取り消す<br>
	 */
	public class Del01 extends MSBEL_ExActListReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			// 初期処理
			editUp();

			// チェック処理
			callThisChk01();
			
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				//輸出実績管理サービスを呼び出す
				callExActDel01(notErrL);
			}
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(up0());
		}
		
		/**
		 * 登録前チェック処理を実行する
		 */
		protected void callThisChk01() {

			MSBEL_ExActListReg.Chk01 o = MSBEL_ExActListReg.crtChk01();
			o.up0().data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			o.up1().setAll(up0());
			o.up2().setAll(up1());
			o.exec();
			
			up0().setAll(o.down0());
		}
		
		/**
		 * 輸出実績管理サービス実行呼び出し
		 */
		protected void callExActDel01(MCList<Chk01_RsltR> notErrL) {
			MSBEL_ExActService.ExAct_Del01 o = MSBEL_ExActService.crtExAct_Del01();
			
			setAll(o.up0(), notErrL, createMap_ExAct_Upd01_DtlR_Chk01_RsltR());

			o.exec();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			MCList<T> ret = (MCList<T>) up0();
			return ret;
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			MCIndexKey idx = up1().createIndex(Chk01_ShipPrCntR.$iv_no);
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				@SuppressWarnings("unchecked")
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));
				@SuppressWarnings("unchecked")
				MCList<Chk01_ShipPrCntR> up1L = (MCList<Chk01_ShipPrCntR>)ope.up(1);
				up0L.setAll(l);
				for (Chk01_RsltR hdrR : l) {
					up1L.addAll(up1().subList(idx, hdrR.iv_no()));
				}
				opeL.add(ope);
			}
			return opeL;
		}
	}
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 輸出実績登録対象のインボイス情報を検索する<br>
	 */
	public class Srch01 extends MSBEL_ExActListReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			editUp();

			MCQueryPlan sql = MSBEL1760_MST_IV_S01();
			MCList<Srch01_RsltR> dL = MCList.create(Srch01_RsltR.class);
			executeQuery(dL, sql, up0());
			
			dL = chkDac(dL);
			if(dL.isEmpty()) {
				return;
			}

			setDown(dL);
		}
		
		protected void editUp() {
			up0().addDateColumn("today", getToday());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
		
		}
		
		protected MCList<Srch01_RsltR> chkDac(MCList<Srch01_RsltR> chkL){
			if(chkL.isEmpty()) {
				return chkL;
			}

			MCList<Srch01_RsltR> rsltL = chkL.createInstance();

			for (MCList<Srch01_RsltR> subL : chkL.groupList(Srch01_RsltR.$iv_no)) {

				String trd_ptn_typ = subL.get(0).trd_ptn_typ();
				if(MAC_TRD_PTN_TYP.isSLS(trd_ptn_typ) || MAC_TRD_PTN_TYP.isSHIP(trd_ptn_typ)){
					boolean dacOK = true;
					for(Srch01_RsltR r : subL){
						if(!readableWgCdDac(r.sls_dpt_wg_cd())){
							dacOK = false;
							break;
						}
					}
					if(dacOK) {
						rsltL.addAll(subL);
					}
				}
				// 支給・移送の場合
				else if(MAC_TRD_PTN_TYP.isPROV(trd_ptn_typ)
						|| MAC_TRD_PTN_TYP.isXFR(trd_ptn_typ)
						|| MAC_TRD_PTN_TYP.isXFR_RTN(trd_ptn_typ)){
					boolean dacOK = true;
					for(Srch01_RsltR r : subL){
						if(!readableLocCdDac(r.getStringNE("chk_gi_loc_cd"))){
							dacOK = false;
							break;
						}
					}
					if(dacOK) {
						rsltL.addAll(subL);
					}
				}
			}
			
			return rsltL;
		}

		protected void setDown(MCList<Srch01_RsltR> dL) {
			//一覧表示用の下り電文設定
			setDown0(dL);
			
			//出荷進捗更新カウンタチェック用の下り電文設定
			setDown1(dL);
		}
		
		protected void setDown0(MCList<Srch01_RsltR> dL) {

			MCList<Srch01_RsltR>[] ivLs = dL.groupList(Srch01_RsltR.$iv_no);
			for(MCList<Srch01_RsltR> ivL : ivLs) {
				Srch01_RsltR down0R = ivL.subList(r->!isNullOrNullVal(r.ship_pr_no())).get(0).clone();
				setIvAmt(down0R, ivL);
				down0().add(down0R);
			}
			down0().sort(Srch01_RsltR.$iv_no);	
		}
		
		protected void setDown1(MCList<Srch01_RsltR> dL) {
			
			Map_Srch01_ShipPrCntR_Srch01_RsltR<Srch01_ShipPrCntR,Srch01_RsltR> mpr = 
					createMap_Srch01_ShipPrCntR_Srch01_RsltR();
			MCList<Srch01_RsltR> prL = dL.groupBy(Srch01_RsltR.$iv_no, Srch01_RsltR.$ship_pr_no, Srch01_RsltR.$ship_pr_upd_cntr);
			for (Srch01_RsltR prR : prL) {
				// インボイス登録でマニュアル行追加した明細は、出荷進捗トランがないため除外する
				if (!isNull(prR.ship_pr_no())) {
					Srch01_ShipPrCntR down1R = Srch01_ShipPrCntR.create();
					copy(down1R, prR, mpr);
					down1().add(down1R);
				}
			}
		}
		
		/**
		 * 金額の設定
		 * 
		 * @param rsltR
		 * @param subL
		 */
		protected void setIvAmt(Srch01_RsltR rsltR, MCList<Srch01_RsltR> subL) {

			//取引金額計
			MCNumber ttlTrdCurAmt = getTtlAmt(subL, Srch01_RsltR.$trd_cur_amt);

			rsltR.ttl_iv_amt(getTtlAmt(subL, Srch01_RsltR.$iv_amt)); 					//Ｉ／Ｖ計
			rsltR.ttl_ncv_amt(rsltR.ttl_iv_amt().subtract(ttlTrdCurAmt));				//無償計（＝Ｉ／Ｖ計－取引金額計）

			// 取引金額を輸出入諸掛区分ごとに集計
			MCList<Srch01_RsltR> baseL = subL.subList(Srch01_RsltR.$exim_xpns_typ, null);
			rsltR.ttl_base_amt(getTtlAmt(baseL, Srch01_RsltR.$trd_cur_amt));			//本体（＝「輸出入諸掛区分」が未設定の取引金額の合算値）
			
			MCList<Srch01_RsltR> freightL = subL.subList(Srch01_RsltR.$exim_xpns_typ, MAC_EXIM_XPNS_TYP.FREIGHT.value());
			rsltR.ttl_freight_amt(getTtlAmt(freightL, Srch01_RsltR.$trd_cur_amt));		//運賃
			
			MCList<Srch01_RsltR> insuranceL = subL.subList(Srch01_RsltR.$exim_xpns_typ, MAC_EXIM_XPNS_TYP.INSURANCE.value());
			rsltR.ttl_insurance_amt(getTtlAmt(insuranceL, Srch01_RsltR.$trd_cur_amt));	//保険料
			
			rsltR.ttl_other_amt(ttlTrdCurAmt
					.subtract(rsltR.ttl_base_amt())
					.subtract(rsltR.ttl_freight_amt())
					.subtract(rsltR.ttl_insurance_amt()));								//その他経費（＝取引金額計－本体－運賃－保険料）
		}

		/**
		 * 合計金額を取得する
		 * 
		 * @param subL：インボイスごとのリスト
		 * @param col：集計するカラム名
		 * @return
		 */
		protected MCNumber getTtlAmt(MCList<Srch01_RsltR> subL, String col) {
			
			MCNumber ttlAmt = MCNumber.ZERO;
			for (Srch01_RsltR subR : subL) {
				MCNumber amt = subR.getNumberNE(col);
				if (isNull(amt)) {
					continue;
				}
				if (subR.dscnt_itm_flg()) {
					ttlAmt = ttlAmt.subtract(amt);
				}
				else {
					ttlAmt = ttlAmt.add(amt);
				}
			}
			return ttlAmt;
		}

	}

//マッパー
	protected Map_Srch01_ShipPrCntR_Srch01_RsltR<Srch01_ShipPrCntR,Srch01_RsltR> createMap_Srch01_ShipPrCntR_Srch01_RsltR() {
		return new Map_Srch01_ShipPrCntR_Srch01_RsltR<Srch01_ShipPrCntR, Srch01_RsltR>();
	}

	public class Map_Srch01_ShipPrCntR_Srch01_RsltR<D extends Srch01_ShipPrCntR, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_ShipPrCntR.$iv_no, Srch01_RsltR.$iv_no);
			addColumnPathMap(Srch01_ShipPrCntR.$ship_pr_no, Srch01_RsltR.$ship_pr_no);
			addColumnPathMap(Srch01_ShipPrCntR.$ship_pr_upd_cntr, Srch01_RsltR.$ship_pr_upd_cntr);

		}
	}

	protected Map_ExAct_Upd01_DtlR_Chk01_RsltR<ExAct_Upd01_DtlR,Chk01_RsltR> createMap_ExAct_Upd01_DtlR_Chk01_RsltR() {
		return new Map_ExAct_Upd01_DtlR_Chk01_RsltR<ExAct_Upd01_DtlR, Chk01_RsltR>();
	}

	public class Map_ExAct_Upd01_DtlR_Chk01_RsltR<D extends ExAct_Upd01_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ExAct_Upd01_DtlR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
			addColumnPathMap(ExAct_Upd01_DtlR.$iv_mng_no, Chk01_RsltR.$iv_mng_no);
			addColumnPathMap(ExAct_Upd01_DtlR.$iv_rev, Chk01_RsltR.$iv_rev);
			addColumnPathMap(ExAct_Upd01_DtlR.$iv_no, Chk01_RsltR.$iv_no);
			addColumnPathMap(ExAct_Upd01_DtlR.$cmpl_dt, Chk01_RsltR.$cmpl_dt);
			addColumnPathMap(ExAct_Upd01_DtlR.$ac_dt, Chk01_RsltR.$ac_dt);
			addColumnPathMap(ExAct_Upd01_DtlR.$can_ac_dt, Chk01_RsltR.$can_ac_dt);
			addColumnPathMap(ExAct_Upd01_DtlR.$arr_schd_dt, Chk01_RsltR.$arr_schd_dt);
			addColumnPathMap(ExAct_Upd01_DtlR.$sls_schd_dt, Chk01_RsltR.$sls_schd_dt);
			addColumnPathMap(ExAct_Upd01_DtlR.$bill_basis_dt, Chk01_RsltR.$bill_basis_dt);
			addColumnPathMap(ExAct_Upd01_DtlR.$rcv_schd_dt, Chk01_RsltR.$rcv_schd_dt);
			addColumnPathMap(ExAct_Upd01_DtlR.$bl_no, Chk01_RsltR.$bl_no);
			addColumnPathMap(ExAct_Upd01_DtlR.$bl_dt, Chk01_RsltR.$bl_dt);
			addColumnPathMap(ExAct_Upd01_DtlR.$bl_rmrks, Chk01_RsltR.$bl_rmrks);

		}
	}

	/**
	 * 	マスタキャッシュ
	 */
	FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
	
	/**
	 * 取引先マスタの取得
	 * @param cst_cd
	 * @return
	 */
	protected MAM_BP_R getBpCache(String bpCd) {
		return _cacheBp.get(bpCd);
	}
	
	protected void initBpCache(MCList<Chk01_RsltR> bindL) {
		_cacheBp = null;
		_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(
				MCQueryApiBuilder.create(MAM_BP_R.create("T")), bindL, Chk01_RsltR.$bcst_cd);
	}

	//FMCB CUSTOM END
}