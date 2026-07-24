package mcframe.serverMGBG.MGBGL0210;

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
import mcframe.serverMGBG.MGBGL0210.*; // このimportはFrameManagerの自動生成で追加されました。

import static mcframe.serverMGBG.MGBGL0210.Query.*;

import mcframe.serverFXUC.FXUCL0170.FXUCL_DuplicateValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
import mcframe.commonMA.meta.MA_META;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_GpAlcReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_GpAlcReg_MC extends MGBGL_GpAlcReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 汎用配賦対象を検索する<br>
	 */
	public class Srch01 extends MGBGL_GpAlcReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			srchGpAlc();
		}

		protected void editUp() {
			up0().addStringColumn("no_po_no_flg_str", toTrueStr(up0().no_po_no_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));

			setGrpFlg(up0(), "itm_grp");
			setGrpFlg(up0(), "bp_grp");
		}

		protected void srchGpAlc() {
			executeQuery(down0(), MGBGL0210_MGT_GP_ALC_S01(), up0());
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 汎用配賦対象を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBGL_GpAlcReg_MC_A.Chk01 {
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

			msgL.addAll(chk());

			return msgL;
		}

		@Override
		protected boolean useChkErrUpperLimit() {
			return up1().file_ins_flg();
		}

		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MGT_GP_ALC_R> selectL = MCList.create(MGT_GP_ALC_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_GP_ALC_R.create("T"));

			if (up1().file_imp_flg()) {
				selectPkWk("MGBGL0210_MGT_GP_ALC_S01", selectL, selectL_bldr.getBaseDbc(), notErrL, false);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBGL0210_MGT_GP_ALC_S02", selectL, selectL_bldr.getBaseDbc(), notErrL);
			}

			MCIndexKey idxkey = selectL.createIndex(getGpAlcKey());

			for (Chk01_RsltR rsltR : notErrL) {
				MGT_GP_ALC_R selectR = selectL.getFirst(idxkey, getKeyValues(rsltR));

				if (isNull(selectR)) {
					if (up1().file_imp_flg() || up1().file_ins_flg()) {
						rsltR.setStatus(MCRow.CREATE);
					}
					else {
						if (rsltR.isStatusModify()) {
							msgL.addAll(
									getRecordNotFoundMsg(getModuleID(), selectL.createRow().createInstance(), rsltR));
						}
					}
				}
				else {
					selectR.setAttributes(rsltR);

					// 更新カウンタチェック
					if (up1().file_imp_flg() || up1().file_ins_flg()) {
						rsltR.setStatus(MCRow.MODIFY);
						rsltR.upd_cntr(selectR.upd_cntr());
					}
					else {
						if (rsltR.isStatusModify()) {
							msgL.addAll(checkUpdCntrNE(rsltR, Chk01_RsltR.$upd_cntr,
									selectR));
						}
						else {
							msgL.addAll(getRecordFoundMsg(getModuleID(), selectL.createRow(), rsltR));
						}
					}

					if (rsltR.isStatusModify()) {
						// DACチェック
						msgL.addAll(checkWritableWgCdDac(selectR, MGT_GP_ALC_R.$wg_cd));
					}
				}
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			for (Chk01_RsltR upR : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(upR, MGT_GP_ALC_R.$wg_cd));

				// 資産区分のチェック
				msgL.add(chkAsstNoOth(upR, Chk01_RsltR.$asst_typ));
			}

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 汎用配賦対象を削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBGL_GpAlcReg_MC_A.Chk02 {
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

			msgL.addAll(chk());

			return msgL;
		}

		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());

			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MGT_GP_ALC_R> selectL = MCList.create(MGT_GP_ALC_R.class);

			selectForUpdateNoWaitPkWk("MGBGL0210_MGT_GP_ALC_S03", selectL, MCQueryApiBuilder.create(MGT_GP_ALC_R.create("T")).getBaseDbc(), notErrL);

			MCIndexKey idxkey = selectL.createIndex(getGpAlcKey());

			for (Chk02_RsltR rsltR : notErrL) {
				MGT_GP_ALC_R selectR = selectL.getFirst(idxkey, getKeyValues(rsltR));

				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), rsltR));
				}
				else {
					selectR.setAttributes(rsltR);

					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(rsltR, Chk02_RsltR.$upd_cntr, selectR));

					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_GP_ALC_R.$wg_cd));
				}
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 何もしない

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 汎用配賦対象を一括で削除するために、チェックを行う<br>
	 */
	public class Chk03 extends MGBGL_GpAlcReg_MC_A.Chk03 {
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

			msgL.addAll(chk());

			return msgL;
		}

		/**
		 * DAC
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(checkWritableWgCdDac(up0(), Chk03_CndR.$wg_cd));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 何もしない

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ汎用配賦対象のチェック処理を行う<br>
	 */
	public class Imp01 extends MGBGL_GpAlcReg_MC_A.Imp01 {
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
			MGBGL_GpAlcReg.Chk01 ope = MGBGL_GpAlcReg.crtChk01();

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
	 * Upd01オペレーション.<p>
	 *
	 * 汎用配賦対象を登録、訂正する<br>
	 */
	public class Upd01 extends MGBGL_GpAlcReg_MC_A.Upd01 {
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
			doItSub(up0(), false);
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
	 * Del01オペレーション.<p>
	 *
	 * 汎用配賦対象を削除する<br>
	 */
	public class Del01 extends MGBGL_GpAlcReg_MC_A.Del01 {
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
			callThisChk02();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			del(notErrL);
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
		protected void callThisChk02() {
			MGBGL_GpAlcReg.Chk02 ope = MGBGL_GpAlcReg.crtChk02();

			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 汎用配賦対象情報の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk02_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}

			MCList<MGT_GP_ALC_R> dbcL = MCList.create(MGT_GP_ALC_R.class);

			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBGL0210_MGT_GP_ALC_D01", dbcL, MCQueryApiBuilder.create(MGT_GP_ALC_R.create("T")));
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
	 * 汎用配賦対象を一括で削除する<br>
	 */
	public class Del02 extends MGBGL_GpAlcReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk03();
			throwDelErr();

			MGT_GP_ALC_R t = MGT_GP_ALC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			createDbc(dbc_bldr, t);

			lock(dbc_bldr, t);
			del(dbc_bldr, t);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MGBGL_GpAlcReg.Chk03 ope = MGBGL_GpAlcReg.crtChk03();

			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
		}

		protected void createDbc(MCQueryApiBuilder dbc_bldr, MGT_GP_ALC_R t) {
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.gte(bind("ym_fr")));
			dbc_bldr.addWhereWithAnd(t.ym.lte(bind("ym_to")));
			dbc_bldr.addWhereWithCutOffAnd(t.mng_dpt_cd.like(bind("mng_dpt_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.gp_alc_cd.like(bind("gp_alc_cd")));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		}

		protected void lock(MCQueryApiBuilder dbc_bldr, MGT_GP_ALC_R t) {
			dbSelectForUpdateNoWaitNoFetch("MGBGL0210_MGT_GP_ALC_S04", dbc_bldr, up0());
		}

		protected void del(MCQueryApiBuilder dbc_bldr, MGT_GP_ALC_R t) {
			dbc_bldr.buildDelete("MGBGL0210_MGT_GP_ALC_D02").executeUpdate(up0());
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * ファイルから取り込んだ汎用配賦対象を登録する<br>
	 */
	public class Ins01 extends MGBGL_GpAlcReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doItSub(up0(), true);
		}
	}

	/**
	 * Ins02オペレーション.<p>
	 *
	 * 一括削除後にファイルから取り込んだ汎用配賦対象を登録する<br>
	 */
	public class Ins02 extends MGBGL_GpAlcReg_MC_A.Ins02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisDel02();
			doItSub(up1(), true);
		}

		protected void callThisDel02() {
			MGBGL_GpAlcReg.Del02 ope = MGBGL_GpAlcReg.crtDel02();
			MCRow.copyall(ope.up0(), up0());

			ope.exec();
		}
	}

	protected void doItSub(MCList<Chk01_RsltR> upL, boolean file_ins_flg) {
		editUp(upL);
		callThisChk01(upL, file_ins_flg);
		MCList<Chk01_RsltR> notErrL = getChkList(upL);
		upd(notErrL);
	}

	protected void editUp(MCList<Chk01_RsltR> upL) {
		setPegNo(upL);
	}

	protected void callThisChk01(MCList<Chk01_RsltR> upL, boolean file_ins_flg) {
		MGBGL_GpAlcReg.Chk01 ope = MGBGL_GpAlcReg.crtChk01();

		ope.up0().setAll(upL);
		ope.up1().file_ins_flg(file_ins_flg);
		ope.exec();
		upL.setAll(ope.down0());
	}

	protected void upd(MCList<Chk01_RsltR> notErrL) {
		if (notErrL.isEmpty()) {
			return;
		}

		MCList<MGT_GP_ALC_R> dbcL = MCList.create(MGT_GP_ALC_R.class);

		notErrL.forEach(r -> dbcL.add(r.dbc()));
		dbUpdByStatus(dbcL);
	}

	protected String[] getGpAlcKey() {
		MGT_GP_ALC_R dbc = MGT_GP_ALC_R.create();

		return dbc.getKeyColumn();
	}

	protected Comparable<?>[] getKeyValues(MCRow row) {
		String[] keyCols = getGpAlcKey();
		ArrayList<Comparable<?>> keyValues = new ArrayList<Comparable<?>>();

		for (String col : keyCols) {
			if (isSame(MA_META.YM.ID(), row.getConstMeta(col).ID())) {
				if (isNull(row.getDateNE(col))) {
					continue;
				}

				keyValues.add(row.getDateNE(col));
			}
			else {
				keyValues.add(row.getStringNE(col));
			}
		}

		return (Comparable<?>[]) keyValues.toArray(new Comparable<?>[] {});
	}

	//FMCB CUSTOM END
}