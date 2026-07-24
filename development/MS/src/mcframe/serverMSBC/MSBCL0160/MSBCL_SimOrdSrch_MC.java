package mcframe.serverMSBC.MSBCL0160;

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
import mcframe.serverMSBC.MSBCL0160.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBC.MSBCL0160.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_SimOrdSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_SimOrdSrch_MC extends MSBCL_SimOrdSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * シミュレーション用の品目オーダを検索する。
	 */
	public class Srch01 extends MSBCL_SimOrdSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			//bind用一時カラム追加
			setUpTmpCol();
			//シミュ用品目オーダ検索
			srchSimItmOrd();
		}

		@Override
		protected void editListMain() {
			// editListMain()は複数回呼ばれる可能性がある
			super.editListMain();

			// 有効成分数量を設定
			setFctrQty();
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 */
		protected void setUpTmpCol() {
			// 上り電文に「品目オーダ区分」条件の設定
			if (up0().mfg_flg()) {
				up0().addStringColumn("wk_mfg", MSC_ITM_ORD_TYP.MFG.value());
			}
			if (up0().purc_flg()) {
				up0().addStringColumn("wk_purc", MSC_ITM_ORD_TYP.PURC.value());
			}
			if (up0().outsrc_flg()) {
				up0().addStringColumn("wk_outsrc", MSC_ITM_ORD_TYP.OUTSRC.value());
			}
			if (up0().xfr_flg()) {
				up0().addStringColumn("wk_xfr", MSC_ITM_ORD_TYP.XFR.value());
			}
			if (up0().wg_xfr_flg()) {
				up0().addStringColumn("wk_wg_xfr", MSC_ITM_ORD_TYP.WG_XFR.value());
			}

			// 上り電文に「反映」条件の設定
			if (up0().opn()) {
				up0().addStringColumn("wk_expflg_false", "0");
			}
			if (up0().exp()) {
				up0().addStringColumn("wk_expflg_true", "1");
			}

			// 上り電文に「手配区分」条件の設定
			if (up0().true_not_fix_flg() && !up0().false_not_fix_flg()) {
				up0().addStringColumn("wk_not_fix_flg", toTrueStr(true));
			}
			else if (!up0().true_not_fix_flg() && up0().false_not_fix_flg()) {
				up0().addStringColumn("wk_not_fix_flg", toFalseStr(false));
			}
		}

		/** シミュレーション用品目オーダ情報を検索する */
		protected void srchSimItmOrd() {
			MCQueryPlan itmOrdSql = MSBCL0160_MST_SIM_ITM_ORDER_S01();
			searchForDL(itmOrdSql, up0(), down0());
		}

		/**
		 * 有効成分(指図予定数量)、有効成分(出来高予定数量)の計算と設定を行う
		 */
		protected void setFctrQty() {
			for(Srch01_RsltR r : down0()) {
				MCNumber stdContInstQty = convToContFctrUnit(r.inst_qty(), r.std_cont_fctr(),
						r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
				r.cont_fctr_inst_qty(stdContInstQty);
				
				MCNumber stdContYieldQty = convToContFctrUnit(r.yield_schd_qty(), r.std_cont_fctr(),
						r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
				r.cont_fctr_schd_yield(stdContYieldQty);
			}
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * シミュレーション用品目オーダ反映前チェックを行う。
	 */
	public class Chk01 extends MSBCL_SimOrdSrch_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// シミュレーション品目オーダ情報のロック、更新カウンタチェックを行う
			MCList<MST_SIM_ITM_ORDER_R> simItmOrderL = MCList.create(MST_SIM_ITM_ORDER_R.class);
			MST_SIM_ITM_ORDER_R t = MST_SIM_ITM_ORDER_R.create("T");
			MCQueryApiBuilder simItmOrderL_bldr = MCQueryApiBuilder.create(t);
			simItmOrderL_bldr.setSelect(t.itm_ord_no, t.strg_loc_cd, t.upd_cntr);
			simItmOrderL_bldr.setOrderByAsc(t.itm_ord_no);
			dbSelectKeyForUpdateNoWait("MSBCL0160_MST_SIM_ITM_ORDER_S01", simItmOrderL, simItmOrderL_bldr, up0());

			MCIndexKey idx = simItmOrderL.createIndex(MST_SIM_ITM_ORDER_R.$itm_ord_no);
			for(Chk01_RsltR r : up0()){
				MST_SIM_ITM_ORDER_R simItmOrderR = simItmOrderL.getFirst(idx, r.itm_ord_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$itm_ord_upd_cntr, simItmOrderR));
				msgL.addAll(checkWritableLocCdDac(simItmOrderR, MST_SIM_ITM_ORDER_R.$strg_loc_cd));
			}

			// シミュレーション管理情報のロック、更新カウンタチェック、空更新を行う
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(Chk01_RsltR.$sim_mrp_no);
			gp.min(Chk01_RsltR.$sim_mrp_upd_cntr);
			MCList<Chk01_RsltR> selectSimMprL = up0().groupBy(gp);
			selectSimMprL.sort(Chk01_RsltR.$sim_mrp_no);
			for(Chk01_RsltR r : selectSimMprL){
				MST_SIM_MRP_R selectSimMprR = MST_SIM_MRP_R.create("T");
				MCQueryApiBuilder selectSimMprR_bldr = MCQueryApiBuilder.create(selectSimMprR);
				dbSelectKeyForUpdateNoWait("MSBCL0160_MST_SIM_MRP_S01", selectSimMprR, selectSimMprR_bldr, r);
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$sim_mrp_upd_cntr, selectSimMprR));
				dbTsUpdateKey("MSBCL0160_MST_SIM_MRP_U01", selectSimMprR, selectSimMprR_bldr.getBaseDbc());
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * シミュレーション用品目オーダ反映解除前チェックを行う。
	 */
	public class Chk02 extends MSBCL_SimOrdSrch_MC_A.Chk02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				callCheckSche();
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// シミュレーション品目オーダ情報のロック、更新カウンタチェックを行う
			MCList<MST_SIM_ITM_ORDER_R> simItmOrderL = MCList.create(MST_SIM_ITM_ORDER_R.class);
			MST_SIM_ITM_ORDER_R t = MST_SIM_ITM_ORDER_R.create("T");
			MCQueryApiBuilder simItmOrderL_bldr = MCQueryApiBuilder.create(t);
			simItmOrderL_bldr.setSelect(t.itm_ord_no, t.strg_loc_cd, t.upd_cntr);
			simItmOrderL_bldr.setOrderByAsc(t.itm_ord_no);
			dbSelectKeyForUpdateNoWait("MSBCL0160_MST_SIM_ITM_ORDER_S02", simItmOrderL, simItmOrderL_bldr, up0());

			MCIndexKey idx = simItmOrderL.createIndex(MST_SIM_ITM_ORDER_R.$itm_ord_no);
			for(Chk01_RsltR r : up0()){
				MST_SIM_ITM_ORDER_R simItmOrderR = simItmOrderL.getFirst(idx, r.itm_ord_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$itm_ord_upd_cntr, simItmOrderR));
				msgL.addAll(checkWritableLocCdDac(simItmOrderR, MST_SIM_ITM_ORDER_R.$strg_loc_cd));
			}

			// 品目オーダ情報の品目オーダ状況区分のチェックを行う
			MCList<MST_ITM_ORDER_R> itmOrderL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t1 = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder itmOrderL_bldr = MCQueryApiBuilder.create(t1);
			itmOrderL_bldr.setSelect(t1.itm_ord_no, t1.itm_ord_sts_typ);
			itmOrderL_bldr.setOrderByAsc(t1.itm_ord_no);
			dbSelectKeyForUpdate("MSBCL0160_MST_ITM_ORDER_S01", itmOrderL, itmOrderL_bldr, up0());

			idx = itmOrderL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (Chk01_RsltR r : up0()) {
				MST_ITM_ORDER_R itmOrderR = itmOrderL.getFirst(idx, r.itm_ord_no());
				if (!isNull(itmOrderR) &&
						!(MSC_ITM_ORD_STS_TYP.isOPN(itmOrderR.itm_ord_sts_typ()) 
							|| MSC_ITM_ORD_STS_TYP.isSAV(itmOrderR.itm_ord_sts_typ()))) {
					msgL.add(new MCMessage(r, null, MSBCL0083, r.itm_ord_no(), toDispGUIIndex(r)));
				}
			}

			// シミュレーション管理情報のロック、更新カウンタチェック、空更新を行う
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(Chk01_RsltR.$sim_mrp_no);
			gp.min(Chk01_RsltR.$sim_mrp_upd_cntr);
			MCList<Chk01_RsltR> selectSimMprL = up0().groupBy(gp);
			selectSimMprL.sort(Chk01_RsltR.$sim_mrp_no);
			MST_SIM_MRP_R selectSimMprR = MST_SIM_MRP_R.create("T");
			MCQueryApiBuilder selectSimMprR_bldr = MCQueryApiBuilder.create(selectSimMprR);
			selectSimMprR_bldr.setSelect(selectSimMprR.sim_mrp_no, selectSimMprR.upd_cntr);
			for(Chk01_RsltR r : selectSimMprL){
				dbSelectKeyForUpdateNoWait("MSBCL0160_MST_SIM_MRP_S02", selectSimMprR, selectSimMprR_bldr, r);
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$sim_mrp_upd_cntr, selectSimMprR));
				dbTsUpdateKey("MSBCL0160_MST_SIM_MRP_U02", selectSimMprR, selectSimMprR_bldr.getBaseDbc());
			}

			return msgL;

		}

		/**
		 * スケジューリング実行チェック
		 */
		protected void callCheckSche() {
			// FSLink
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * シミュレーション用品目オーダの反映処理を行う。
	 */
	public class Upd01 extends MSBCL_SimOrdSrch_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
				up0().setBoolean(Chk01_RsltR.$exp_flg, true);
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

			editUp();

			callThisChk01();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				updMain(notErrL);
			}
		}

		/**
		 * 反映処理
		 * @param up
		 */
		protected void updMain(MCList<Chk01_RsltR> up) {
			executeBatchUpdate(MABCL0160_MST_ITM_ORDER_I01(), null, up);
			executeBatchUpdate(MABCL0160_MST_OPER_ORDER_I01(), null, up);
			executeBatchUpdate(MABCL0160_MST_SAVORD_IO_SCHD_I01(), null, up);
			executeBatchUpdate(MABCL0160_MST_ORD_IO_SCHD_I01(), null, up);
			executeBatchUpdate(MSBCL0160_MST_SIM_IO_SCHD_U01(), null, up);

			MCList<MST_SIM_ITM_ORDER_R> updL = MCList.create(MST_SIM_ITM_ORDER_R.class);
			for(Chk01_RsltR r : up){
				MST_SIM_ITM_ORDER_R updR = MST_SIM_ITM_ORDER_R.create();
				updR.itm_ord_no(r.itm_ord_no());
				updR.exp_dt(getToday());
				updL.add(updR);
			}
			MST_SIM_ITM_ORDER_R t = MST_SIM_ITM_ORDER_R.create("T");
			execDbUpdateKey("MSBCL0160_MST_SIM_ITM_ORDER_U01", t, updL, t.exp_dt);
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBCL_SimOrdSrch.Chk01 ope = MSBCL_SimOrdSrch.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 *　シミュレーション用品目オーダの反映解除処理を行う。
	 */
	public class Upd02 extends MSBCL_SimOrdSrch_MC_A.Upd02 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
				up0().setBoolean(Chk01_RsltR.$exp_flg, false);
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

			editUp();

			callThisChk02();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				
				updMain(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBCL_SimOrdSrch.Chk02 ope = MSBCL_SimOrdSrch.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());

		}

		/**
		 * 反映解除処理
		 * @param up
		 */
		protected void updMain(MCList<Chk01_RsltR> up) {

			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			execDbDeleteKey("MSBCL0160_MST_ITM_ORDER_D01", t, up);
			
			MST_OPER_ORDER_R t1 = MST_OPER_ORDER_R.create("T");
			execDbDelete("MSBCL0160_MST_OPER_ORDER_D01", t1, t1.itm_ord_no.eq(bind("itm_ord_no")), up);
			
			MST_ORD_IO_SCHD_R t2 = MST_ORD_IO_SCHD_R.create("T");
			execDbDelete("MSBCL0160_MST_ORD_IO_SCHD_D01", t2, t2.io_schd_pr_no.eq(bind("itm_ord_no")), up);
			
			MST_SAVORD_IO_SCHD_R t3 = MST_SAVORD_IO_SCHD_R.create("T");
			execDbDelete("MSBCL0160_MST_SAVORD_IO_SCHD_D01", t3, t3.io_schd_pr_no.eq(bind("itm_ord_no")), up);
			
			executeBatchUpdate(MSBCL0160_MST_SIM_IO_SCHD_U02(), null, up);

			MCList<MST_SIM_ITM_ORDER_R> updL = MCList.create(MST_SIM_ITM_ORDER_R.class);
			for(Chk01_RsltR r : up){
				MST_SIM_ITM_ORDER_R updR = MST_SIM_ITM_ORDER_R.create();
				updR.itm_ord_no(r.itm_ord_no());
				updR.exp_dt(null);
				updL.add(updR);
			}
			MST_SIM_ITM_ORDER_R t4 = MST_SIM_ITM_ORDER_R.create("T");
			execDbUpdateKey("MSBCL0160_MST_SIM_ITM_ORDER_U02", t4, updL, t4.exp_dt);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
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

	//FMCB CUSTOM END
}