package mcframe.serverMGBG.MGBGL0030;

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
import mcframe.serverMG.dbc.*;
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
import mcframe.serverMGBG.MGBGL0030.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBG.MGBGL0030.Query.*;
import mcframe.serverMGBG.MGBGL5100.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_PlnAlcAmtIfReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_PlnAlcAmtIfReg_MC extends MGBGL_PlnAlcAmtIfReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 配賦費用計画ＩＦを検索する<br>
	 */
	public class Srch01 extends MGBGL_PlnAlcAmtIfReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srchPlnAlcAmt();
		}

		protected void srchPlnAlcAmt() {
			executeQuery(down0(), MGBGL0030_MGT_PLN_ALC_AMT_IF_S01(), up0());
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 配賦費用計画ＩＦを登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBGL_PlnAlcAmtIfReg_MC_A.Chk01 {

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
				if(isNull(r.itm_cd())) {
					r.itm_sub1(null);
					r.itm_sub2(null);
					r.itm_sub3(null);
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

			MCList<MGT_PLN_ALC_AMT_IF_R> selectL = MCList.create(MGT_PLN_ALC_AMT_IF_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_PLN_ALC_AMT_IF_R.create("T"));
			if (up1().file_imp_flg()) {
				selectPkWk("MGBGL0030_MGT_PLN_ALC_AMT_IF_S01", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, false, MGT_PLN_ALC_AMT_IF_R.$wg_cd);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBGL0030_MGT_PLN_ALC_AMT_IF_S02", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, MGT_PLN_ALC_AMT_IF_R.$wg_cd);
			}

			MCIndexKey idxkey = selectL.createIndex(MGT_PLN_ALC_AMT_IF_R.$data_lno);
			for (Chk01_RsltR r : notErrUpdL) {
				MGT_PLN_ALC_AMT_IF_R selectR = selectL.getFirst(idxkey, r.data_lno());
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(),
							selectL.createRow().tableName(), selectL_bldr.getBaseDbc().getKeyColumn(),
							r.toArray(selectL_bldr.getBaseDbc().getKeyColumn()), r));
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
					if (!up1().batch_flg()) {
						msgL.addAll(checkWritableWgCdDac(selectR, MGT_PLN_ALC_AMT_IF_R.$wg_cd));
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
				if (!up1().batch_flg()) {
					msgL.addAll(checkWritableWgCdDac(upR, MGT_PLN_ALC_AMT_IF_R.$wg_cd));
				}

				// 小数有効桁数チェック
				msgL.addAll(checkDecPlace(upR, getBaseCur().amt_dec_place().intValue(), Chk01_RsltR.$amt));
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
	 * 配賦費用計画ＩＦを削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBGL_PlnAlcAmtIfReg_MC_A.Chk02 {

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

			MCList<MGT_PLN_ALC_AMT_IF_R> selectL = MCList.create(MGT_PLN_ALC_AMT_IF_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_PLN_ALC_AMT_IF_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBGL0030_MGT_PLN_ALC_AMT_IF_S03", selectL, selectL_bldr.getBaseDbc(), notErrL, MGT_PLN_ALC_AMT_IF_R.$wg_cd);

			MCIndexKey idxkey = selectL.createIndex(MGT_PLN_ALC_AMT_IF_R.$data_lno);
			for (Chk02_RsltR r : notErrL) {
				MGT_PLN_ALC_AMT_IF_R selectR = selectL.getFirst(idxkey, r.data_lno());
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(),
							selectL.createRow().tableName(), selectL_bldr.getBaseDbc().getKeyColumn(),
							r.toArray(selectL_bldr.getBaseDbc().getKeyColumn()), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_PLN_ALC_AMT_IF_R.$wg_cd));
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
	 * 配賦費用計画ＩＦを一括で削除するために、チェックを行う<br>
	 */
	public class Chk03 extends MGBGL_PlnAlcAmtIfReg_MC_A.Chk03 {

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

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}

	/**
	 * Chk05オペレーション.<p>
	 *
	 * 配賦費用計画データを作成するために、チェックを行う<br>
	 */
	public class Chk05 extends MGBGL_PlnAlcAmtIfReg_MC_A.Chk05 {

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

		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			// DACチェック
			for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
				Chk05_CndR wk = Chk05_CndR.create();
				wk.wg_cd(wg);
				msgL.addAll(checkWritableWgCdDac(wk, Chk05_CndR.$wg_cd));
			}

			return msgL;
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ配賦費用計画ＩＦのチェック処理を行う<br>
	 */
	public class Imp01 extends MGBGL_PlnAlcAmtIfReg_MC_A.Imp01 {

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
			MGBGL_PlnAlcAmtIfReg.Chk01 ope = MGBGL_PlnAlcAmtIfReg.crtChk01();
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
	 * 配賦費用計画ＩＦを登録、訂正する<br>
	 */
	public class Upd01 extends MGBGL_PlnAlcAmtIfReg_MC_A.Upd01 {

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
	 * Upd02オペレーション.<p>
	 *
	 * 登録・訂正処理をする（バッチから実行用）<br>
	 */
	public class Upd02 extends MGBGL_PlnAlcAmtIfReg_MC_A.Upd02 {
	
		@Override
		protected void call() {
			super.call();
		}
	
		@Override
		protected void doIt() {
			editUp();
			upd01Reg(up0());
			setDown();
		}
	
		protected void setDown() {
			down0().setAll(up0());
		}
	
		protected void editUp() {
			for (Chk01_RsltR r : up0()) {
				if (!isNullOrNullVal(r.itm_cd())) {
					if (isNull(r.itm_sub1())) {
						r.itm_sub1(MAC_STR.NULL_VAL.value());
					}
					if (isNull(r.itm_sub2())) {
						r.itm_sub2(MAC_STR.NULL_VAL.value());
					}
					if (isNull(r.itm_sub3())) {
						r.itm_sub3(MAC_STR.NULL_VAL.value());
					}
				}
				else {
					r.itm_sub1(null);
					r.itm_sub2(null);
					r.itm_sub3(null);
				}
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 配賦費用計画ＩＦを削除する<br>
	 */
	public class Del01 extends MGBGL_PlnAlcAmtIfReg_MC_A.Del01 {

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
			MGBGL_PlnAlcAmtIfReg.Chk02 ope = MGBGL_PlnAlcAmtIfReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 配賦費用計画ＩＦの削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk02_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_PLN_ALC_AMT_IF_R> dbcL = MCList.create(MGT_PLN_ALC_AMT_IF_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBGL0030_MGT_PLN_ALC_AMT_IF_D01", dbcL, MCQueryApiBuilder.create(MGT_PLN_ALC_AMT_IF_R.create("T")));
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
	 * 配賦費用計画ＩＦを一括で削除する<br>
	 */
	public class Del02 extends MGBGL_PlnAlcAmtIfReg_MC_A.Del02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk03();
			throwDelErr();
			MGT_PLN_ALC_AMT_IF_R t = MGT_PLN_ALC_AMT_IF_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			createDbc(dbc_bldr, t);
			lock(dbc_bldr, t);
			del(dbc_bldr, t);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MGBGL_PlnAlcAmtIfReg.Chk03 ope = MGBGL_PlnAlcAmtIfReg.crtChk03();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
		}

		protected void createDbc(MCQueryApiBuilder dbc_bldr, MGT_PLN_ALC_AMT_IF_R t) {
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.between(bind("ym_fr"), bind("ym_to")));
			dbc_bldr.addWhereWithCutOffAnd(t.alc_ac_cd.like(bind("alc_ac_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.dpt_cd.like(bind("dpt_cd")));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		}

		protected void lock(MCQueryApiBuilder dbc_bldr, MGT_PLN_ALC_AMT_IF_R t) {
			dbSelectForUpdateNoWaitNoFetch("MGBGL0030_MGT_PLN_ALC_AMT_IF_S04", dbc_bldr, up0());
		}

		protected void del(MCQueryApiBuilder dbc_bldr, MGT_PLN_ALC_AMT_IF_R t) {
			dbc_bldr.buildDelete("MGBGL0030_MGT_PLN_ALC_AMT_IF_D02").executeUpdate(up0());
		}

	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * ファイルから取り込んだ配賦費用計画ＩＦを登録する<br>
	 */
	public class Ins01 extends MGBGL_PlnAlcAmtIfReg_MC_A.Ins01 {

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
	 * 一括削除後にファイルから取り込んだ配賦費用計画ＩＦを登録する<br>
	 */
	public class Ins02 extends MGBGL_PlnAlcAmtIfReg_MC_A.Ins02 {

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
			MGBGL_PlnAlcAmtIfReg.Del02 ope = MGBGL_PlnAlcAmtIfReg.crtDel02();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}

	}

	/**
	 * Ins04オペレーション.<p>
	 *
	 * 配賦費用計画ＩＦを反映する<br>
	 */
	public class Ins04 extends MGBGL_PlnAlcAmtIfReg_MC_A.Ins04 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execMain();
		}

		protected void execMain() {
			callThisChk05();
			throwUpdErr();
			callInsSrv();
		}

		/**
		 * チェック実行
		 */
		protected void callThisChk05() {
			MGBGL_PlnAlcAmtIfReg.Chk05 ope = MGBGL_PlnAlcAmtIfReg.crtChk05();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
		}

		/**
		 * サービス実行
		 */
		protected void callInsSrv() {
			MGBGL_PlnAlcService.PlnAlc_Upd01 ope = MGBGL_PlnAlcService.crtPlnAlc_Upd01();
			copy(ope.up0(), up0(), createMap_PlnAlc_Chk01_CndR_Chk05_CndR());
			ope.exec();
		}

		protected Map_PlnAlc_Chk01_CndR_Chk05_CndR<PlnAlc_Chk01_CndR, Chk05_CndR> createMap_PlnAlc_Chk01_CndR_Chk05_CndR() {
			return new Map_PlnAlc_Chk01_CndR_Chk05_CndR<PlnAlc_Chk01_CndR, Chk05_CndR>();
		}

		public class Map_PlnAlc_Chk01_CndR_Chk05_CndR<D extends PlnAlc_Chk01_CndR, S extends Chk05_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PlnAlc_Chk01_CndR.$calc_ctg_cd_fr, Chk05_CndR.$calc_ctg_cd_fr);
				addColumnPathMap(PlnAlc_Chk01_CndR.$wg_cd, Chk05_CndR.$wg_cd);
				addColumnPathMap(PlnAlc_Chk01_CndR.$ym_fr, Chk05_CndR.$ym_fr);
				addColumnPathMap(PlnAlc_Chk01_CndR.$ym_to, Chk05_CndR.$ym_to);
				addColumnPathMap(PlnAlc_Chk01_CndR.$calc_ctg_cd_to, Chk05_CndR.$calc_ctg_cd_to);
			}
		}

	}

	//////////////////////////////////////////////////////////////////////
	// Upd01/Ins01/Ins02/Ins04 Common
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
		MGBGL_PlnAlcAmtIfReg.Chk01 ope = MGBGL_PlnAlcAmtIfReg.crtChk01();
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
		doSeqCache(MGC_NUM_SYS_TYP.PLN_ALC_IF_DATA_LNO.value(), insL.size());
		for (Chk01_RsltR r : insL) {
			r.data_lno(getSequence(MGC_NUM_SYS_TYP.PLN_ALC_IF_DATA_LNO.value()));
		}

		MCList<MGT_PLN_ALC_AMT_IF_R> dbcL = MCList.create(MGT_PLN_ALC_AMT_IF_R.class);
		notErrL.forEach(r -> dbcL.add(r.dbc()));
		dbUpdByStatus(dbcL);
	}

	//////////////////////////////////////////////////////////////////////

	//FMCB CUSTOM END
}