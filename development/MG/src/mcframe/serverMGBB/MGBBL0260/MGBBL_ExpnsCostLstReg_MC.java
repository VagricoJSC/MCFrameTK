package mcframe.serverMGBB.MGBBL0260;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMG.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBB.MGBBL0260.*;
import mcframe.serverMGBB.MGBBL0010.*;
import static mcframe.serverMGBB.MGBBL0260.Query.*;
import java.util.ArrayList;
import java.util.Map;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.autoCommitDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_ExpnsCostLstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_ExpnsCostLstReg_MC extends MGBBL_ExpnsCostLstReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする（投入）<br>
	 */
	public class Srch01 extends MGBBL_ExpnsCostLstReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srch();
		}

		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			// 他社資産除く＝ＯＮのときは資産区分＝１，２
			up0().addStringColumn("chd_asst_cnd", toTrueStr(up0().except_other_flg()));
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			up0().addStringColumn("no_stk_bp_flg_str", toTrueStr(up0().no_stk_bp_flg()));
			up0().addStringColumn("no_ac_rsn_flg_str", toTrueStr(up0().no_ac_rsn_flg()));
			up0().addStringColumn("no_rec_eval_typ_flg_str", toTrueStr(up0().no_rec_eval_typ_flg()));
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBBL0260_MGT_ACT_INPT_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			calcUpri(down0());
		}

	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 検索処理をする（入出庫）<br>
	 */
	public class Srch02 extends MGBBL_ExpnsCostLstReg_MC_A.Srch02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srch();
		}

		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			up0().addStringColumn("no_stk_bp_flg_str", toTrueStr(up0().no_stk_bp_flg()));
			up0().addStringColumn("no_ac_rsn_flg_str", toTrueStr(up0().no_ac_rsn_flg()));
			up0().addStringColumn("no_rec_eval_typ_flg_str", toTrueStr(up0().no_rec_eval_typ_flg()));
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBBL0260_MGT_ACT_IO_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			calcUpri(down0());
		}

	}

	/**
	 * Srch03オペレーション.<p>
	 *
	 * 検索処理をする（売上）<br>
	 */
	public class Srch03 extends MGBBL_ExpnsCostLstReg_MC_A.Srch03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srch();
		}

		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			up0().addStringColumn("no_stk_bp_flg_str", toTrueStr(up0().no_stk_bp_flg()));
			up0().addStringColumn("no_ac_rsn_flg_str", toTrueStr(up0().no_ac_rsn_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));
			up0().addStringColumn("no_rec_eval_typ_flg_str", toTrueStr(up0().no_rec_eval_typ_flg()));
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBBL0260_MGT_ACT_SLS_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			calcUpri(down0());
		}

	}

	/**
	 * Srch04オペレーション.<p>
	 *
	 * 確定情報検索処理をする<br>
	 */
	public class Srch04 extends MGBBL_ExpnsCostLstReg_MC_A.Srch04 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			callMGBBL0010Srch02();
		}

		protected void callMGBBL0010Srch02() {
			MGBBL_InsScm2MgtIf.Srch02 ope = MGBBL_InsScm2MgtIf.crtSrch02();
			ope.exec();

			down0().ym(ope.down0().ym());
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録・訂正する前のチェックを行う（投入）<br>
	 */
	public class Chk01 extends MGBBL_ExpnsCostLstReg_MC_A.Chk01 {

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
			msgL.addAll(doServerCheckBaseInpt(up0(), up1()));
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(doServerCheckSubInpt(up0(), true));
			return msgL;
		}

		@Override
		protected boolean useChkErrUpperLimit() {
			return up1().file_ins_flg();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 登録・訂正する前のチェックを行う（入出庫）<br>
	 */
	public class Chk02 extends MGBBL_ExpnsCostLstReg_MC_A.Chk02 {

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
			msgL.addAll(doServerCheckBaseIo(up0(), up1()));
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(doServerCheckSubIo(up0(), true));
			return msgL;
		}

		@Override
		protected boolean useChkErrUpperLimit() {
			return up1().file_ins_flg();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 登録・訂正する前のチェックを行う（売上）<br>
	 */
	public class Chk03 extends MGBBL_ExpnsCostLstReg_MC_A.Chk03 {

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
			msgL.addAll(doServerCheckBaseSls(up0(), up1()));
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(doServerCheckSubSls(up0(), true));
			return msgL;
		}

		@Override
		protected boolean useChkErrUpperLimit() {
			return up1().file_ins_flg();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk04オペレーション.<p>
	 *
	 * 削除する前のチェックを行う（投入）<br>
	 */
	public class Chk04 extends MGBBL_ExpnsCostLstReg_MC_A.Chk04 {

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
			msgL.addAll(doServerCheckBaseInpt(up0(), null));
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(doServerCheckSubInpt(up0(), false));
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk05オペレーション.<p>
	 *
	 * 削除する前のチェックを行う（入出庫）<br>
	 */
	public class Chk05 extends MGBBL_ExpnsCostLstReg_MC_A.Chk05 {

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
			msgL.addAll(doServerCheckBaseIo(up0(), null));
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(doServerCheckSubIo(up0(), false));
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk06オペレーション.<p>
	 *
	 * 削除する前のチェックを行う（売上）<br>
	 */
	public class Chk06 extends MGBBL_ExpnsCostLstReg_MC_A.Chk06 {

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
			msgL.addAll(doServerCheckBaseSls(up0(), null));
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(doServerCheckSubSls(up0(), false));
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録・訂正処理をする（投入）<br>
	 */
	public class Upd01 extends MGBBL_ExpnsCostLstReg_MC_A.Upd01 {

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
			upd01Main(up0(), false);
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

	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * 登録・訂正処理をする（入出庫）<br>
	 */
	public class Upd02 extends MGBBL_ExpnsCostLstReg_MC_A.Upd02 {
		
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
			upd02Main(up0(), false);
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

	}

	/**
	 * Upd03オペレーション.<p>
	 *
	 * 登録・訂正処理をする（売上）<br>
	 */
	public class Upd03 extends MGBBL_ExpnsCostLstReg_MC_A.Upd03 {

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
			upd03Main(up0(), false);
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

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理をする（投入）<br>
	 */
	public class Del01 extends MGBBL_ExpnsCostLstReg_MC_A.Del01 {
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
			editUp();
			callThisChk04();
			del(getChkList(up0()));
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk04() {
			MGBBL_ExpnsCostLstReg.Chk04 ope = MGBBL_ExpnsCostLstReg.crtChk04();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 投入実績費目別原価の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk04_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_ACT_INPT_R> dbcL = MCList.create(MGT_ACT_INPT_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));

			MGT_ACT_INPT_R t = MGT_ACT_INPT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MGBBL0260_MGW_ACT_INPT_D03", dbcL_bldr.getBaseDbc());
			dbWkInsert("MGBBL0260_MGW_ACT_INPT_I02", dbcL, dbcL_bldr.getBaseDbc());
			delByWkInpt();
			dbWkDelete("MGBBL0260_MGW_ACT_INPT_D04", dbcL_bldr.getBaseDbc());

			dbcL_bldr.setSet(t.rec_eval_typ);
			dbcL.setValue(MGT_ACT_INPT_R.$rec_eval_typ, null);
			dbUpdateKey("MGBBL0260_MGT_ACT_INPT_U02", dbcL, dbcL_bldr);
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

	}

	/**
	 * Del02オペレーション.<p>
	 *
	 * 削除処理をする（入出庫）<br>
	 */
	public class Del02 extends MGBBL_ExpnsCostLstReg_MC_A.Del02 {

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
			editUp();
			callThisChk05();
			del(getChkList(up0()));
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk05() {
			MGBBL_ExpnsCostLstReg.Chk05 ope = MGBBL_ExpnsCostLstReg.crtChk05();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 入出庫実績費目別原価の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk05_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_ACT_IO_R> dbcL = MCList.create(MGT_ACT_IO_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			
			MGT_ACT_IO_R t = MGT_ACT_IO_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MGBBL0260_MGW_ACT_IO_D03", dbcL_bldr.getBaseDbc());
			dbWkInsert("MGBBL0260_MGW_ACT_IO_I02", dbcL, dbcL_bldr.getBaseDbc());
			delByWkIo();
			dbWkDelete("MGBBL0260_MGW_ACT_IO_D04", dbcL_bldr.getBaseDbc());

			dbcL_bldr.setSet(t.rec_eval_typ);
			dbcL.setValue(MGT_ACT_IO_R.$rec_eval_typ, null);
			dbUpdateKey("MGBBL0260_MGT_ACT_IO_U02", dbcL, dbcL_bldr);
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

	}

	/**
	 * Del03オペレーション.<p>
	 *
	 * 削除処理をする（売上）<br>
	 */
	public class Del03 extends MGBBL_ExpnsCostLstReg_MC_A.Del03 {

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
			editUp();
			callThisChk06();
			del(getChkList(up0()));
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk06() {
			MGBBL_ExpnsCostLstReg.Chk06 ope = MGBBL_ExpnsCostLstReg.crtChk06();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 売上実績費目別原価の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk06_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_ACT_SLS_R> dbcL = MCList.create(MGT_ACT_SLS_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			
			MGT_ACT_SLS_R t = MGT_ACT_SLS_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MGBBL0260_MGW_ACT_SLS_D03", dbcL_bldr.getBaseDbc());
			dbWkInsert("MGBBL0260_MGW_ACT_SLS_I02", dbcL, dbcL_bldr.getBaseDbc());
			delByWkSls();
			dbWkDelete("MGBBL0260_MGW_ACT_SLS_D04", dbcL_bldr.getBaseDbc());

			dbcL_bldr.setSet(t.rec_eval_typ);
			dbcL.setValue(MGT_ACT_SLS_R.$rec_eval_typ, null);
			dbUpdateKey("MGBBL0260_MGT_ACT_SLS_U02", dbcL, dbcL_bldr);
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

	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイル取込処理をする（投入）<br>
	 */
	public class Imp01 extends MGBBL_ExpnsCostLstReg_MC_A.Imp01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			setDown();
		}

		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBBL_ExpnsCostLstReg.Chk01 ope = MGBBL_ExpnsCostLstReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	/**
	 * Imp02オペレーション.<p>
	 *
	 * ファイル取込処理をする（入出庫）<br>
	 */
	public class Imp02 extends MGBBL_ExpnsCostLstReg_MC_A.Imp02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			setDown();
		}

		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MGBBL_ExpnsCostLstReg.Chk02 ope = MGBBL_ExpnsCostLstReg.crtChk02();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	/**
	 * Imp03オペレーション.<p>
	 *
	 * ファイル取込処理をする（売上）<br>
	 */
	public class Imp03 extends MGBBL_ExpnsCostLstReg_MC_A.Imp03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk03();
			setDown();
		}

		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MGBBL_ExpnsCostLstReg.Chk03 ope = MGBBL_ExpnsCostLstReg.crtChk03();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * ファイル取込処理をする（投入）<br>
	 */
	public class Ins01 extends MGBBL_ExpnsCostLstReg_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			upd01Main(up0(), true);
		}
	}

	/**
	 * Ins02オペレーション.<p>
	 *
	 * ファイル取込処理をする（入出庫）<br>
	 */
	public class Ins02 extends MGBBL_ExpnsCostLstReg_MC_A.Ins02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			upd02Main(up0(), true);
		}
	}

	/**
	 * Ins03オペレーション.<p>
	 *
	 * ファイル取込処理をする（売上）<br>
	 */
	public class Ins03 extends MGBBL_ExpnsCostLstReg_MC_A.Ins03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			upd03Main(up0(), true);
		}
	}

	//////////////////////////////////////////////////////////////////////
	// DynamicSql
	/**
	 * 有効な費目区分を取得する
	 *
	 * @return 有効な費目区分
	 */
	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		return list;
	}

	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = { "T.amt" };
		return stringArray;
	}

	//////////////////////////////////////////////////////////////////////
	// Common
	protected void calcUpri(MCList<Srch01_RsltR> down) {
		for (Srch01_RsltR r : down) {
			r.upri(calcUnit(r.ttl(), r.qty(), Srch01_RsltR.upri_META.scale()));
		}
	}

	protected MCMessageList chkFixAct(MCList<?> list, String arg) {
		MCMessageList msgL = new MCMessageList();
		if(list.isEmpty()) {
			return msgL;
		}
		initBatchLogger(dbTran());
		String procId = "MGPA_CALC_FIX$P_CHK_FIX_ACT";

		for(MCList<?> chkList: list.groupList("calc_ctg_cd", "wg_cd", "ym")) {
			MCRow r =  chkList.get(0);
			String calcCtgCd = r.getStringNE("calc_ctg_cd");
			String wgCd = r.getStringNE("wg_cd");
			MCDate ym = r.getDateNE("ym");
			if (isNullOr(calcCtgCd, wgCd, ym)) {
				continue;
			}

			r.addBooleanColumn(arg, true);
			try {
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null,
					":calc_ctg_cd, :wg_cd, :ym, :mfg, :purc, :inpt, :inst_wk, :other_wk, :inst_wip, :io, :sls, :stk");
			}
			catch (MCAppException e) {
				if (isSame(e.getMCMessage().getID(), MGBXD0005)) {
					for(MCRow upR: chkList) {
						msgL.add(new MCMessage(upR, null,MGBBL0026, calcCtgCd, wgCd, toYMString(ym), toDispGUIIndex(upR)));
					}
				}
				else {
					throw e;
				}
			}
		}

		return msgL;
	}

	protected void chkAmtDecPlaceAndTtl(MCRow upR, MCMessageList msgL) {
		MCNumber ttl = MCNumber.ZERO;

		// AtLeastOneチェック
		msgL.addAll(check(upR, getExpnsColNames(), new MAUDL_AtLeastOneValidater_NULL_VAL()));

		// 費目別金額の小数有効桁数チェック
		int amtDecPlace = getBaseCur().amt_dec_place().intValue();
		for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
			msgL.addAll(checkDecPlace(upR, amtDecPlace, e.getKey()));
			ttl = ttl.add(nvl(upR.getNumber(e.getKey()), MCNumber.ZERO));
		}
		// 合計金額≠０チェック
		if (ttl.isZero()) {
			msgL.add(new MCMessage(upR, null, MGBBL0025, toDispGUIIndex(upR)));
		}
	}

	//////////////////////////////////////////////////////////////////////
	// Chk01/Chk04 Common

	protected MCMessageList doServerCheckBaseInpt(MCList<?> up0L, Chk01_CtrlR up1R) {
		MCMessageList msgL = new MCMessageList();
		MCList<?> notErrUpdL = getChkList(up0L);
		if (notErrUpdL.isEmpty()) {
			return msgL;
		}

		MCList<MGT_ACT_INPT_R> selectL = MCList.create(MGT_ACT_INPT_R.class);
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_ACT_INPT_R. create("T"));
		String[] colsForChkFix = new String[] {MGT_ACT_INPT_R.$wg_cd, MGT_ACT_INPT_R.$calc_ctg_cd, MGT_ACT_INPT_R.$ym};
		if (up1R != null && up1R.file_imp_flg()) {
			selectPkWk("MGBBL0260_MGT_ACT_INPT_S01", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, false, colsForChkFix);
		}
		else {
			selectForUpdateNoWaitPkWk("MGBBL0260_MGT_ACT_INPT_S01", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, colsForChkFix);
		}

		MCIndexKey idxkey = selectL.createIndex(MGT_ACT_INPT_R.$act_inpt_id, MGT_ACT_INPT_R.$act_inpt_id_sub);
		for (MCRow r : notErrUpdL) {
			MGT_ACT_INPT_R dbc = r.getInnerRow("dbc", MGT_ACT_INPT_R.class);
			MGT_ACT_INPT_R selectR = selectL.getFirst(idxkey, dbc.act_inpt_id(), dbc.act_inpt_id_sub());

			if (isNull(selectR)) {
				msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
			}
			else {
				selectR.setAttributes(r);

				if (up1R != null && (up1R.file_imp_flg() || up1R.file_ins_flg())) {
					dbc.upd_cntr(selectR.upd_cntr());
				}
				else {
					msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
				}
				msgL.addAll(checkWritableWgCdDac(selectR, MGT_ACT_INPT_R.$wg_cd));

				// 確定チェック用
				dbc.calc_ctg_cd(selectR.calc_ctg_cd());
				dbc.wg_cd(selectR.wg_cd());
				dbc.ym(selectR.ym());
			}
		}
		return msgL;
	}

	protected MCMessageList doServerCheckSubInpt(MCList<?> up0L, boolean upd_flg) {
		MCMessageList msgL = new MCMessageList();
		MCList<?> notErrUpdL = getChkList(up0L);
		if (notErrUpdL.isEmpty()) {
			return msgL;
		}

		msgL.addAll(chkFixAct(notErrUpdL, "inpt"));
		if (upd_flg) {
			for (MCRow upR : notErrUpdL){
				// 費目別金額の小数有効桁数チェック、合計金額≠０チェック
				chkAmtDecPlaceAndTtl(upR, msgL);
			}
		}

		return msgL;
	}

	//////////////////////////////////////////////////////////////////////
	// Chk02/Chk05 Common
	protected MCMessageList doServerCheckBaseIo(MCList<?> up0L, Chk02_CtrlR up1R) {
		MCMessageList msgL = new MCMessageList();
		MCList<?> notErrUpdL = getChkList(up0L);
		if (notErrUpdL.isEmpty()) {
			return msgL;
		}

		MCList<MGT_ACT_IO_R> selectL = MCList.create(MGT_ACT_IO_R.class);
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_ACT_IO_R. create("T"));
		String[] colsForChkFix = new String[] {MGT_ACT_IO_R.$wg_cd, MGT_ACT_IO_R.$calc_ctg_cd, MGT_ACT_IO_R.$ym};
		if (up1R != null && up1R.file_imp_flg()) {
			selectPkWk("MGBBL0260_MGT_ACT_IO_S01",selectL, selectL_bldr.getBaseDbc(), notErrUpdL, false, colsForChkFix);
		}
		else {
			selectForUpdateNoWaitPkWk("MGBBL0260_MGT_ACT_IO_S01", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, colsForChkFix);
		}

		MCIndexKey idxkey = selectL.createIndex(MGT_ACT_IO_R.$act_io_id, MGT_ACT_IO_R.$act_io_id_sub);
		for (MCRow r : notErrUpdL) {
			MGT_ACT_IO_R dbc = r.getInnerRow("dbc", MGT_ACT_IO_R.class);
			MGT_ACT_IO_R selectR = selectL.getFirst(idxkey, dbc.act_io_id(), dbc.act_io_id_sub());

			if (isNull(selectR)) {
				msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
			}
			else {
				selectR.setAttributes(r);

				if (up1R != null && (up1R.file_imp_flg() || up1R.file_ins_flg())) {
					dbc.upd_cntr(selectR.upd_cntr());
				}
				else {
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
				}
				msgL.addAll(checkWritableWgCdDac(selectR, MGT_ACT_IO_R.$wg_cd));

				// 確定チェック用
				dbc.calc_ctg_cd(selectR.calc_ctg_cd());
				dbc.wg_cd(selectR.wg_cd());
				dbc.ym(selectR.ym());

			}
		}
		return msgL;
	}

	protected MCMessageList doServerCheckSubIo(MCList<?> up0L, boolean upd_flg) {
		MCMessageList msgL = new MCMessageList();
		MCList<?> notErrUpdL = getChkList(up0L);
		if (notErrUpdL.isEmpty()) {
			return msgL;
		}

		msgL.addAll(chkFixAct(notErrUpdL, "io"));
		if (upd_flg) {
			for (MCRow upR : notErrUpdL){
				// 費目別金額の小数有効桁数チェック、合計金額≠０チェック
				chkAmtDecPlaceAndTtl(upR, msgL);
			}
		}

		return msgL;
	}

	//////////////////////////////////////////////////////////////////////
	// Chk03/Chk06 Common
	protected MCMessageList doServerCheckBaseSls(MCList<?> up0L, Chk03_CtrlR up1R) {
		MCMessageList msgL = new MCMessageList();
		MCList<?> notErrUpdL = getChkList(up0L);
		if (notErrUpdL.isEmpty()) {
			return msgL;
		}

		MCList<MGT_ACT_SLS_R> selectL = MCList.create(MGT_ACT_SLS_R.class);
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_ACT_SLS_R. create("T"));
		String[] colsForChkFix = new String[] {MGT_ACT_SLS_R.$wg_cd, MGT_ACT_SLS_R.$calc_ctg_cd, MGT_ACT_SLS_R.$ym};
		if (up1R != null && up1R.file_imp_flg()) {
			selectPkWk("MGBBL0260_MGT_ACT_SLS_S01", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, false, colsForChkFix);
		}
		else {
			selectForUpdateNoWaitPkWk("MGBBL0260_MGT_ACT_SLS_S01", selectL,selectL_bldr.getBaseDbc(), notErrUpdL, colsForChkFix);
		}

		MCIndexKey idxkey = selectL.createIndex(MGT_ACT_SLS_R.$act_sls_id, MGT_ACT_SLS_R.$act_sls_id_sub);
		for (MCRow r : notErrUpdL) {
			MGT_ACT_SLS_R dbc = r.getInnerRow("dbc", MGT_ACT_SLS_R.class);
			MGT_ACT_SLS_R selectR = selectL.getFirst(idxkey, dbc.act_sls_id(), dbc.act_sls_id_sub());

			if (isNull(selectR)) {
				msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
			}
			else {
				selectR.setAttributes(r);

				if (up1R != null && (up1R.file_imp_flg() || up1R.file_ins_flg())) {
					dbc.upd_cntr(selectR.upd_cntr());
				}
				else {
					msgL.addAll(checkUpdCntrNE(r, Chk03_RsltR.$upd_cntr, selectR));
				}
				msgL.addAll(checkWritableWgCdDac(selectR, MGT_ACT_SLS_R.$wg_cd));

				// 確定チェック用
				dbc.calc_ctg_cd(selectR.calc_ctg_cd());
				dbc.wg_cd(selectR.wg_cd());
				dbc.ym(selectR.ym());
			}
		}
		return msgL;
	}

	protected MCMessageList doServerCheckSubSls(MCList<?> up0L, boolean upd_flg) {
		MCMessageList msgL = new MCMessageList();
		MCList<?> notErrUpdL = getChkList(up0L);
		if (notErrUpdL.isEmpty()) {
			return msgL;
		}

		msgL.addAll(chkFixAct(notErrUpdL, "sls"));
		if (upd_flg) {
			for (MCRow upR : notErrUpdL){
				// 費目別金額の小数有効桁数チェック、合計金額≠０チェック
				chkAmtDecPlaceAndTtl(upR, msgL);
			}
		}

		return msgL;
	}

	//////////////////////////////////////////////////////////////////////
	// Upd01/Ins01 Common
	protected void upd01Main(MCList<Chk01_RsltR> upL, boolean file_ins_flg) {
		upd01Edit(upL);
		upd01Chk(upL, file_ins_flg);
		if (file_ins_flg) {
			throwUpdErr();
		}
		MCList<Chk01_RsltR> notErrL = getChkList(upL);
		upd01Reg(notErrL);
	}

	/**
	 * 上り電文設定
	 */
	protected void upd01Edit(MCList<Chk01_RsltR> upL) {
		setPegNo(upL);
	}

	/**
	 * チェック処理を実行する
	 */
	protected void upd01Chk(MCList<Chk01_RsltR> upL, boolean file_ins_flg) {
		MGBBL_ExpnsCostLstReg.Chk01 ope = MGBBL_ExpnsCostLstReg.crtChk01();
		ope.up0().setAll(upL);
		ope.up1().file_ins_flg(file_ins_flg);
		ope.exec();
		upL.setAll(ope.down0());
	}

	/**
	 * 投入実績費目別原価の登録を行う。
	 * @param notErrL エラーのない上り電文
	 */
	protected void upd01Reg(MCList<Chk01_RsltR> notErrL) {
		if(notErrL.isEmpty()) {
			return;
		}

		MCList<Chk01_RsltR> updL = notErrL.subList(MCRow.MODIFY);
		MCList<MGT_ACT_INPT_R> dbcL = MCList.create(MGT_ACT_INPT_R.class);
		updL.forEach(r -> dbcL.add(r.dbc()));
		MGT_ACT_INPT_R t1 = MGT_ACT_INPT_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t1);
		dbWkDelete("MGBBL0260_MGW_ACT_INPT_D01", dbcL_bldr.getBaseDbc());
		dbWkInsert("MGBBL0260_MGW_ACT_INPT_I01", dbcL, dbcL_bldr.getBaseDbc());
		delByWkInpt();
		dbWkDelete("MGBBL0260_MGW_ACT_INPT_D02", dbcL_bldr.getBaseDbc());
		
		MCList<MGT_ACT_INPT_EXPNS_R> expns = MCList.create(MGT_ACT_INPT_EXPNS_R.class);
		for (Chk01_RsltR r: notErrL) {
			for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
				MCNumber n = r.getNumber(e.getKey());
				if (!isNull(n)) {
					MGT_ACT_INPT_EXPNS_R rec = MGT_ACT_INPT_EXPNS_R.create();
					rec.act_inpt_id(r.act_inpt_id());
					rec.act_inpt_id_sub(r.act_inpt_id_sub());
					rec.expns_cd(e.getValue());
					rec.amt(n);
					expns.add(rec);
				}
			}
		}
		dbInsertEx("MGBBL0260_MGT_ACT_INPT_EXPNS_I01", expns, MCQueryApiBuilder.create(MGT_ACT_INPT_EXPNS_R.create("T")));

		dbcL_bldr.setSet(t1.rec_eval_typ);
		dbcL.setValue(MGT_ACT_INPT_R.$rec_eval_typ, MGC_REC_EVAL_TYP.EXPNS.value());
		dbUpdateKey("MGBBL0260_MGT_ACT_INPT_U01", dbcL, dbcL_bldr);
	}

	//////////////////////////////////////////////////////////////////////
	// Upd02/Ins02 Common
	protected void upd02Main(MCList<Chk02_RsltR> upL, boolean file_ins_flg) {
		upd02Edit(upL);
		upd02Chk(upL, file_ins_flg);
		if (file_ins_flg) {
			throwUpdErr();
		}
		MCList<Chk02_RsltR> notErrL = getChkList(upL);
		upd02Reg(notErrL);
	}

	/**
	 * 上り電文設定
	 */
	protected void upd02Edit(MCList<Chk02_RsltR> upL) {
		setPegNo(upL);
	}

	/**
	 * チェック処理を実行する
	 */
	protected void upd02Chk(MCList<Chk02_RsltR> upL, boolean file_ins_flg) {
		MGBBL_ExpnsCostLstReg.Chk02 ope = MGBBL_ExpnsCostLstReg.crtChk02();
		ope.up0().setAll(upL);
		ope.up1().file_ins_flg(file_ins_flg);
		ope.exec();
		upL.setAll(ope.down0());
	}

	/**
	 * 入出庫実績費目別原価の登録を行う。
	 * @param notErrL エラーのない上り電文
	 */
	protected void upd02Reg(MCList<Chk02_RsltR> notErrL) {
		if(notErrL.isEmpty()) {
			return;
		}

		MCList<Chk02_RsltR> updL = notErrL.subList(MCRow.MODIFY);
		MCList<MGT_ACT_IO_R> dbcL = MCList.create(MGT_ACT_IO_R.class);
		updL.forEach(r -> dbcL.add(r.dbc()));
		MGT_ACT_IO_R t1 = MGT_ACT_IO_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t1);
		dbWkDelete("MGBBL0260_MGW_ACT_IO_D01", dbcL_bldr.getBaseDbc());
		dbWkInsert("MGBBL0260_MGW_ACT_IO_I01", dbcL, dbcL_bldr.getBaseDbc());
		delByWkIo();
		dbWkDelete("MGBBL0260_MGW_ACT_IO_D02", dbcL_bldr.getBaseDbc());

		MCList<MGT_ACT_IO_EXPNS_R> expns = MCList.create(MGT_ACT_IO_EXPNS_R.class);
		for (Chk02_RsltR r: notErrL) {
			for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
				MCNumber n = r.getNumber(e.getKey());
				if (!isNull(n)) {
					MGT_ACT_IO_EXPNS_R rec = MGT_ACT_IO_EXPNS_R.create();
					rec.act_io_id(r.act_io_id());
					rec.act_io_id_sub(r.act_io_id_sub());
					rec.expns_cd(e.getValue());
					rec.amt(n);
					expns.add(rec);
				}
			}
		}
		dbInsertEx("MGBBL0260_MGT_ACT_IO_EXPNS_I01", expns, MCQueryApiBuilder.create(MGT_ACT_IO_EXPNS_R.create("T")));

		dbcL_bldr.setSet(t1.rec_eval_typ);
		dbcL.setValue(MGT_ACT_IO_R.$rec_eval_typ, MGC_REC_EVAL_TYP.EXPNS.value());
		dbUpdateKey("MGBBL0260_MGT_ACT_IO_U01", dbcL, dbcL_bldr);
	}

	//////////////////////////////////////////////////////////////////////
	// Upd03/Ins03 Common
	protected void upd03Main(MCList<Chk03_RsltR> upL, boolean file_ins_flg) {
		upd03Edit(upL);
		upd03Chk(upL, file_ins_flg);
		if (file_ins_flg) {
			throwUpdErr();
		}
		MCList<Chk03_RsltR> notErrL = getChkList(upL);
		upd03Reg(notErrL);
	}

	/**
	 * 上り電文設定
	 */
	protected void upd03Edit(MCList<Chk03_RsltR> upL) {
		setPegNo(upL);
	}

	/**
	 * チェック処理を実行する
	 */
	protected void upd03Chk(MCList<Chk03_RsltR> upL, boolean file_ins_flg) {
		MGBBL_ExpnsCostLstReg.Chk03 ope = MGBBL_ExpnsCostLstReg.crtChk03();
		ope.up0().setAll(upL);
		ope.up1().file_ins_flg(file_ins_flg);
		ope.exec();
		upL.setAll(ope.down0());
	}

	/**
	 * 売上実績費目別原価の登録を行う。
	 * @param notErrL エラーのない上り電文
	 */
	protected void upd03Reg(MCList<Chk03_RsltR> notErrL) {
		if(notErrL.isEmpty()) {
			return;
		}

		MCList<Chk03_RsltR> updL = notErrL.subList(MCRow.MODIFY);
		MCList<MGT_ACT_SLS_R> dbcL = MCList.create(MGT_ACT_SLS_R.class);
		updL.forEach(r -> dbcL.add(r.dbc()));
		MGT_ACT_SLS_R t1 = MGT_ACT_SLS_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t1);
		dbWkDelete("MGBBL0260_MGW_ACT_SLS_D01", dbcL_bldr.getBaseDbc());
		dbWkInsert("MGBBL0260_MGW_ACT_SLS_I01", dbcL, dbcL_bldr.getBaseDbc());
		delByWkSls();
		dbWkDelete("MGBBL0260_MGW_ACT_SLS_D02", dbcL_bldr.getBaseDbc());

		MCList<MGT_ACT_SLS_EXPNS_R> expns = MCList.create(MGT_ACT_SLS_EXPNS_R.class);
		for (Chk03_RsltR r: notErrL) {
			for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
				MCNumber n = r.getNumber(e.getKey());
				if (!isNull(n)) {
					MGT_ACT_SLS_EXPNS_R rec = MGT_ACT_SLS_EXPNS_R.create();
					rec.act_sls_id(r.act_sls_id());
					rec.act_sls_id_sub(r.act_sls_id_sub());
					rec.expns_cd(e.getValue());
					rec.amt(n);
					expns.add(rec);
				}
			}
		}
		dbInsertEx("MGBBL0260_MGT_ACT_SLS_EXPNS_I01", expns, MCQueryApiBuilder.create(MGT_ACT_SLS_EXPNS_R.create("T")));

		dbcL_bldr.setSet(t1.rec_eval_typ);
		dbcL.setValue(MGT_ACT_SLS_R.$rec_eval_typ, MGC_REC_EVAL_TYP.EXPNS.value());
		dbUpdateKey("MGBBL0260_MGT_ACT_SLS_U01", dbcL, dbcL_bldr);
	}

	protected void delByWkInpt() {
		MGW_ACT_INPT_KEY_R S1W1 = MGW_ACT_INPT_KEY_R.create("W1");
		MGT_ACT_INPT_EXPNS_R t = MGT_ACT_INPT_EXPNS_R.create("T");
		MCQueryApiBuilder expns_bldr = MCQueryApiBuilder.create(t);
		expns_bldr.setWhere(exists(subQuery().select(value("X")).from(S1W1).where(S1W1.act_inpt_id.eq(t.act_inpt_id).and(S1W1.act_inpt_id_sub.eq(t.act_inpt_id_sub)))));
		expns_bldr.buildDelete("MGBBL0260_MGT_ACT_INPT_EXPNS_D01").executeUpdate();
	}

	protected void delByWkIo() {
		MGW_ACT_IO_KEY_R S1W1 = MGW_ACT_IO_KEY_R.create("W1");
		MGT_ACT_IO_EXPNS_R t = MGT_ACT_IO_EXPNS_R.create("T");
		MCQueryApiBuilder expns_bldr = MCQueryApiBuilder.create(t);
		expns_bldr.setWhere(exists(subQuery().select(value("X")).from(S1W1)
				.where(S1W1.act_io_id.eq(t.act_io_id).and(S1W1.act_io_id_sub.eq(t.act_io_id_sub)))));
		expns_bldr.buildDelete("MGBBL0260_MGT_ACT_IO_EXPNS_D01").executeUpdate();
	}

	protected void delByWkSls() {
		MGW_ACT_SLS_KEY_R S1W1 = MGW_ACT_SLS_KEY_R.create("W1");
		MGT_ACT_SLS_EXPNS_R t = MGT_ACT_SLS_EXPNS_R.create("T");
		MCQueryApiBuilder expns_bldr = MCQueryApiBuilder.create(t);
		expns_bldr.setWhere(exists(subQuery().select(value("X")).from(S1W1)
				.where(S1W1.act_sls_id.eq(t.act_sls_id).and(S1W1.act_sls_id_sub.eq(t.act_sls_id_sub)))));
		expns_bldr.buildDelete("MGBBL0260_MGT_ACT_SLS_EXPNS_D01").executeUpdate();
	}

	//FMCB CUSTOM END
}