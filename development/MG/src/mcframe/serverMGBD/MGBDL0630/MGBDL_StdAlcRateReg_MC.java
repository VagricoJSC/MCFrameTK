package mcframe.serverMGBD.MGBDL0630;

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
import mcframe.serverMGBD.MGBDL0630.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBD.MGBDL0630.Query.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_DuplicateValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_StdAlcRateReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_StdAlcRateReg_MC extends MGBDL_StdAlcRateReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 標準配賦率情報を検索する<br>
	 */
	public class Srch01 extends MGBDL_StdAlcRateReg_MC_A.Srch01 {
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
		
		protected void editUp() {
			up0().addStringColumn("no_dpt_flg_str", toTrueStr(up0().no_dpt_flg()));
			up0().addStringColumn("no_loc_flg_str", toTrueStr(up0().no_loc_flg()));
			up0().addStringColumn("no_oper_flg_str", toTrueStr(up0().no_oper_flg()));
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			up0().addStringColumn("no_ctg_flg_str", toTrueStr(up0().no_ctg_flg()));
			up0().addStringColumn("no_itm_flg_str", toTrueStr(up0().no_itm_flg()));
			up0().addStringColumn("non_calc_flg_str", toOnOffStr(up0().on_non_calc_flg(), up0().off_non_calc_flg()));
			up0().addStringColumn("fix_flg_str", toOnOffStr(up0().on_fix_flg(), up0().off_fix_flg()));
		}

		protected void srch() {
			executeQuery(down0(), MGBDL0630_MGT_STD_ALC_RATE_S01(), up0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 標準配賦率情報を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBDL_StdAlcRateReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initUpSub() {
			super.initUpSub();
			for(Chk01_RsltR r : up0()) {
				if(isNull(r.itm_cd())) {
					r.itm_sub1(null);
					r.itm_sub2(null);
					r.itm_sub3(null);
				}
			}
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

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_STD_ALC_RATE_R> selectL = MCList.create(MGT_STD_ALC_RATE_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_STD_ALC_RATE_R.create("T"));
			if (up1().file_imp_flg()) {
				selectPkWk("MGBDL0630_MGT_STD_ALC_RATE_S01", selectL, selectL_bldr.getBaseDbc(), notErrL, false, "FIX_FLG");
			}
			else {
				selectForUpdateNoWaitPkWk("MGBDL0630_MGT_STD_ALC_RATE_S02", selectL, selectL_bldr.getBaseDbc(), notErrL, "FIX_FLG");
			}

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk01_RsltR r : notErrL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_STD_ALC_RATE_R selectR = selectL.getFirst(idxkey, binds);

				if (isNull(selectR)) {
					if (up1().file_imp_flg()) {
						r.setStatus(MCRow.CREATE);
					}
					else {
						if (r.isStatusModify()) {
							msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
						}
					}
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					if (up1().file_imp_flg()) {
						r.setStatus(MCRow.MODIFY);
						r.upd_cntr(selectR.upd_cntr());
					}
					else {
						if (r.isStatusModify()) {
							msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
						}
						else {
							msgL.addAll(getRecordFoundMsg(getModuleID(), selectL.createRow(), r));
						}
					}
					if (r.isStatusModify()) {
						// DACチェック
						msgL.addAll(checkWritableWgCdDac(selectR, MGT_STD_ALC_RATE_R.$wg_cd));
						// 確定チェック
						if(selectR.fix_flg()){
							msgL.add(new MCMessage(r, null, MGBDL0027,
								toYMString(r.term()), r.calc_ctg_cd(), r.wg_cd(), r.alc_ac_cd(), 
								r.dpt_cd(), r.loc_cd(), r.oper_cd(), r.bp_cd(), r.ctg_cd(),
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								toDispGUIIndex(r)));
						}
					}
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			for (Chk01_RsltR upR : notErrL){
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(upR, MGT_STD_ALC_RATE_R.$wg_cd));
				
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
	 * Upd01オペレーション.<p>
	 *
	 * 標準配賦率情報を登録、訂正する<br>
	 */
	public class Upd01 extends MGBDL_StdAlcRateReg_MC_A.Upd01 {
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
			callThisChk01();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			upd(notErrL);
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
		protected void callThisChk01() {
			MGBDL_StdAlcRateReg.Chk01 ope = MGBDL_StdAlcRateReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(false);
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 標準配賦率情報の登録を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk01_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_STD_ALC_RATE_R> dbcL = MCList.create(MGT_STD_ALC_RATE_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbUpdByStatus(dbcL);
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
	 * ファイルから取り込んだ標準配賦率情報のチェック処理を行う<br>
	 */
	public class Imp01 extends MGBDL_StdAlcRateReg_MC_A.Imp01 {
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
			MGBDL_StdAlcRateReg.Chk01 ope = MGBDL_StdAlcRateReg.crtChk01();
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
	 * Chk02オペレーション.<p>
	 *
	 * 標準配賦率情報を削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBDL_StdAlcRateReg_MC_A.Chk02 {
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
			
			MCList<MGT_STD_ALC_RATE_R> selectL = MCList.create(MGT_STD_ALC_RATE_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_STD_ALC_RATE_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBDL0630_MGT_STD_ALC_RATE_S03", selectL, selectL_bldr.getBaseDbc(), notErrL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk02_RsltR r : notErrL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_STD_ALC_RATE_R selectR = selectL.getFirst(idxkey, binds);

				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_STD_ALC_RATE_R.$wg_cd));
				}
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
	 * Del01オペレーション.<p>
	 *
	 * 標準配賦率情報を削除する<br>
	 */
	public class Del01 extends MGBDL_StdAlcRateReg_MC_A.Del01 {
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
			MGBDL_StdAlcRateReg.Chk02 ope = MGBDL_StdAlcRateReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 標準配賦率情報の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk02_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_STD_ALC_RATE_R> dbcL = MCList.create(MGT_STD_ALC_RATE_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBDL0630_MGT_STD_ALC_RATE_D01", dbcL, MCQueryApiBuilder.create(MGT_STD_ALC_RATE_R.create("T")));
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

	//FMCB CUSTOM END
}