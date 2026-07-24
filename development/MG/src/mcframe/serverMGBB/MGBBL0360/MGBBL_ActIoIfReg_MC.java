package mcframe.serverMGBB.MGBBL0360;

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
import mcframe.serverMGBB.MGBBL0360.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBB.MGBBL0360.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_ActIoIfReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_ActIoIfReg_MC extends MGBBL_ActIoIfReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 入出庫実績ＩＦを検索する<br>
	 */
	public class Srch01 extends MGBBL_ActIoIfReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srchActIo();
		}

		protected void editUp() {
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			up0().addStringColumn("no_stk_bp_flg_str", toTrueStr(up0().no_stk_bp_flg()));
			up0().addStringColumn("no_ac_rsn_flg_str", toTrueStr(up0().no_ac_rsn_flg()));
			setGrpFlg(up0(), "itm_grp");
			setGrpFlg(up0(), "BP_grp");
		}

		protected void srchActIo() {
			executeQuery(down0(), MGBBL0360_MGT_ACT_IO_IF_S01(), up0());
		}

	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 入出庫実績ＩＦを登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBBL_ActIoIfReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			super.doIt();
			setDown();
		}

		protected void editUp() {
			for(Chk01_RsltR r : up0()) {
				if(isNull(r.alc_itm_cd())) {
					r.alc_itm_sub1(null);
					r.alc_itm_sub2(null);
					r.alc_itm_sub3(null);
				}
			}
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

			MCList<Chk01_RsltR> notErrUpdL = up0().subList(r -> !r.err_flg() && r.isStatusModify());
			if (notErrUpdL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_ACT_IO_IF_R> selectL = MCList.create(MGT_ACT_IO_IF_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_ACT_IO_IF_R.create("T"));
			if (up1().file_imp_flg()) {
				selectPkWk("MGBBL0360_MGT_ACT_IO_IF_S01", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, false, MGT_ACT_IO_IF_R.$wg_cd);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBBL0360_MGT_ACT_IO_IF_S02", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, MGT_ACT_IO_IF_R.$wg_cd);
			}
			
			MCIndexKey idxkey = selectL.createIndex(MGT_ACT_IO_IF_R.$data_lno);
			for (Chk01_RsltR r : notErrUpdL) {
				MGT_ACT_IO_IF_R selectR = selectL.getFirst(idxkey, r.data_lno());
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(),
							selectL.createRow().tableName(), selectL.createRow().getKeyColumn(),
							r.toArray(selectL.createRow().getKeyColumn()), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					if (up1().file_imp_flg() || up1().file_ins_flg()) {
						r.upd_cntr(selectR.upd_cntr());
					}
					else {
						msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
					}
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_ACT_IO_IF_R.$wg_cd));
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
				msgL.addAll(checkWritableWgCdDac(upR, MGT_ACT_IO_IF_R.$wg_cd));

				// 小数有効桁数チェック
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$dec_place, Chk01_RsltR.$qty));
				msgL.addAll(checkDecPlace(upR, getBaseCur().amt_dec_place().intValue(), Chk01_RsltR.$amt));
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$trd_amt_dec_place, Chk01_RsltR.$trd_cur_amt));

				// 会計伝票区分チェック
				msgL.add(chkAcSlipWithAttr(upR, Chk01_RsltR.$ac_slip_typ, MAC_AC_SLIP_TYP.$IS_IO_TYP));
				
				// 個別評価区分のチェック
				msgL.add(chkRecEvalNoExpns(upR, Chk01_RsltR.$rec_eval_typ));

			}

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
	 * 入出庫実績ＩＦを削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBBL_ActIoIfReg_MC_A.Chk02 {
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
			
			MCList<MGT_ACT_IO_IF_R> selectL = MCList.create(MGT_ACT_IO_IF_R.class);
			selectForUpdateNoWaitPkWk("MGBBL0360_MGT_ACT_IO_IF_S03",
					selectL, MCQueryApiBuilder.create(MGT_ACT_IO_IF_R.create("T")).getBaseDbc(), notErrL, MGT_ACT_IO_IF_R.$wg_cd);

			MCIndexKey idxkey = selectL.createIndex(MGT_ACT_IO_IF_R.$data_lno);
			for (Chk02_RsltR r : notErrL) {
				MGT_ACT_IO_IF_R selectR = selectL.getFirst(idxkey, r.data_lno());
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(),
							selectL.createRow().tableName(), selectL.createRow().getKeyColumn(),
							r.toArray(selectL.createRow().getKeyColumn()), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_ACT_IO_IF_R.$wg_cd));
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
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 入出庫実績ＩＦを一括で削除するために、チェックを行う<br>
	 */
	public class Chk03 extends MGBBL_ActIoIfReg_MC_A.Chk03 {
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
		
		/** 下り電文設定 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ入出庫実績ＩＦのチェック処理を行う<br>
	 */
	public class Imp01 extends MGBBL_ActIoIfReg_MC_A.Imp01 {
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
			MGBBL_ActIoIfReg.Chk01 ope = MGBBL_ActIoIfReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 入出庫実績ＩＦを登録、訂正する<br>
	 */
	public class Upd01 extends MGBBL_ActIoIfReg_MC_A.Upd01 {
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
	 * 入出庫実績ＩＦを削除する<br>
	 */
	public class Del01 extends MGBBL_ActIoIfReg_MC_A.Del01 {
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
			MGBBL_ActIoIfReg.Chk02 ope = MGBBL_ActIoIfReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 入出庫実績ＩＦの削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk02_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_ACT_IO_IF_R> dbcL = MCList.create(MGT_ACT_IO_IF_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBBL0360_MGT_ACT_IO_IF_D01", dbcL, MCQueryApiBuilder.create(MGT_ACT_IO_IF_R.create("T")));
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
	 * 入出庫実績ＩＦを一括で削除する<br>
	 */
	public class Del02 extends MGBBL_ActIoIfReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callThisChk03();
			throwDelErr();
			MGT_ACT_IO_IF_R t = MGT_ACT_IO_IF_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			createDbc(t, dbc_bldr);
			lock(t, dbc_bldr);
			del(t, dbc_bldr);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MGBBL_ActIoIfReg.Chk03 ope = MGBBL_ActIoIfReg.crtChk03();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyvalue(up0(), ope.down0());
		}

		protected void createDbc(MGT_ACT_IO_IF_R t, MCQueryApiBuilder dbc_bldr) {
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			dbc_bldr.addWhereWithCutOffAnd(t.mng_dpt_cd.like(bind("mng_dpt_cd")));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		}
		protected void lock(MGT_ACT_IO_IF_R dbc, MCQueryApiBuilder dbc_bldr) {
			dbSelectForUpdateNoWaitNoFetch("MGBBL0360_MGT_ACT_IO_IF_S04", dbc_bldr, up0());
		}
		protected void del(MGT_ACT_IO_IF_R dbc, MCQueryApiBuilder dbc_bldr) {
			dbc_bldr.buildDelete("MGBBL0360_MGT_ACT_IO_IF_D02").executeUpdate(up0());
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * ファイルから取り込んだ入出庫実績ＩＦを登録する<br>
	 */
	public class Ins01 extends MGBBL_ActIoIfReg_MC_A.Ins01 {
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
	 * 一括削除後にファイルから取り込んだ入出庫実績ＩＦを登録する<br>
	 */
	public class Ins02 extends MGBBL_ActIoIfReg_MC_A.Ins02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisDel02();
			upd01Main(up1(), true);
		}
		
		protected void callThisDel02() {
			MGBBL_ActIoIfReg.Del02 ope = MGBBL_ActIoIfReg.crtDel02();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}
	}
	
	//////////////////////////////////////////////////////////////////////
	// Upd01/Ins01/Ins02 Common
	protected void upd01Main(MCList<Chk01_RsltR> upL, boolean file_ins_flg) {
		upd01Edit(upL);
		upd01Chk(upL, file_ins_flg);
		if (file_ins_flg) {
			throwUpdErr();
		}
		upd01Reg(upL);
	}

	protected void upd01Edit(MCList<Chk01_RsltR> upL) {
		setPegNo(upL);
	}
	
	protected void upd01Chk(MCList<Chk01_RsltR> upL, boolean file_ins_flg) {
		MGBBL_ActIoIfReg.Chk01 ope = MGBBL_ActIoIfReg.crtChk01();
		ope.up0().setAll(upL);
		ope.up1().file_ins_flg(file_ins_flg);
		ope.exec();
		upL.setAll(ope.down0());
	}
	
	protected void upd01Reg(MCList<Chk01_RsltR> upL) {
		MCList<Chk01_RsltR> notErrL = upL.subList(r -> !r.err_flg());
		if(notErrL.isEmpty()) {
			return;
		}
		MCList<Chk01_RsltR> insL = notErrL.subList(MCRow.CREATE);
		doSeqCache(MGC_NUM_SYS_TYP.ACT_IO_IF_DATA_LNO.value(), insL.size());
		for (Chk01_RsltR r : insL) {
			r.data_lno(getSequence(MGC_NUM_SYS_TYP.ACT_IO_IF_DATA_LNO.value()));
		}

		MCList<MGT_ACT_IO_IF_R> dbcL = MCList.create(MGT_ACT_IO_IF_R.class);
		notErrL.forEach(r -> dbcL.add(r.dbc()));
		dbUpdByStatus(dbcL);

	}
	//////////////////////////////////////////////////////////////////////

	//FMCB CUSTOM END
}