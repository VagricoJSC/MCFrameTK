package mcframe.serverMGBA.MGBAL0010;

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
import mcframe.serverMGBA.MGBAL0010.*; // このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBA.MGBAL0010.Query.*;
import mcframe.serverMGBA.MGBAL5010.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBAL_PlnSlsReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBAL_PlnSlsReg_MC extends MGBAL_PlnSlsReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売上計画を検索する<br>
	 */
	public class Srch01 extends MGBAL_PlnSlsReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			srchPln();
		}

		protected void editUp() {
			setGrpFlg(up0(), "itm_grp");
			setGrpFlg(up0(), "cst_grp");
			setGrpFlg(up0(), "dlv_grp");
		}

		protected void srchPln() {
			MCQueryPlan sql = MGBAL0010_MGT_PLN_SLS_S01();
			executeQuery(down0(), sql, up0());
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 売上計画を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBAL_PlnSlsReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected boolean useChkErrUpperLimit() {
			return up1().file_ins_flg();
		}

		@Override
		protected void doIt() {
			super.doIt();

			crrctDataAfterChk();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(lockAndCheckBase());
			return msgL;
		}

		/** ロック、更新カウンタチェック、更新前データDACチェック */
		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			//チェック対象
			MCList<Chk01_RsltR> chkL = getChkList(up0(), MCRow.MODIFY);
			if (chkL.isEmpty()) {
				return msgL;
			}

			// ロック取得(ファイル取り込みの場合はロックしない)
			MCList<MGT_PLN_SLS_R> selectL = MCList.create(MGT_PLN_SLS_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_PLN_SLS_R.create("T"));

			if (up1().file_imp_flg()) {
				selectPkWk("MGBAL0010_MGT_PLN_SLS_S01", selectL, selectL_bldr.getBaseDbc(), chkL, false, MGT_PLN_SLS_R.$wg_cd);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBAL0010_MGT_PLN_SLS_S02", selectL, selectL_bldr.getBaseDbc(), chkL, MGT_PLN_SLS_R.$wg_cd);
			}

			MCIndexKey idxKey = selectL.createIndex(MGT_PLN_SLS_R.$pln_sls_key);
			for (Chk01_RsltR r : chkL) {
				MGT_PLN_SLS_R selectR = selectL.getFirst(idxKey, r.pln_sls_key());

				// 更新カウンタチェック(ファイル入力、ファイル取込の場合は存在チェック)
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					if (up1().file_imp_flg() || up1().file_ins_flg()) {
						r.upd_cntr(selectR.upd_cntr());
					}
					else {
						msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
					}

					selectR.setAttributes(r);
					// 更新前データDACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_PLN_SLS_R.$wg_cd));
				}
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			crrctDataAfterDoServerChk(notErrL);

			for (Chk01_RsltR r : notErrL) {
				// 更新後データDACチェック
				msgL.addAll(checkWritableWgCdDac(r, MGT_PLN_SLS_R.$wg_cd));

				// 資産区分のチェック
				msgL.add(chkAsstNoOth(r, Chk01_RsltR.$asst_typ));
				// 小数部有効桁数チェック
				msgL.addAll(checkDecPlace(r, Chk01_RsltR.$dec_place, Chk01_RsltR.$qty));
				msgL.addAll(checkDecPlace(r, Chk01_RsltR.$amt_dec_place, Chk01_RsltR.$amt));
			}
			return msgL;
		}

		/** doServerChk（リストロジックによるチェックなど）実行後に行うべきデータの補正 */
		protected void crrctDataAfterDoServerChk(MCList<Chk01_RsltR> notErrL){
			for (Chk01_RsltR r: notErrL) {
				compCur(r);
			}
		}

		protected void compCur(Chk01_RsltR r) {
			if (isNull(r.amt())) {
				r.cur_cd(null);
				r.cur_nm(null);
				r.amt_dec_place(null);
			}
			else if (isNull(r.cur_cd())) {
				r.cur_cd(getBaseCur().cur_cd());
				r.cur_nm(getBaseCur().cur_nm());
				r.amt_dec_place(getBaseCur().amt_dec_place());
			}
		}

		/** チェック実行後に行うべきデータの補正 */
		protected void crrctDataAfterChk() {
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (up1().file_imp_flg()) {
				notErrL.forEach(r -> cmplBaseUnitQty(r));
			}
		}

		/** 基準単位以外の単位から基準単位へ単位変換します。 */
		protected void cmplBaseUnitQty(Chk01_RsltR r) {
			r.base_unit_qty(
				convToBaseUnit(r.qty(), r.conv_base_qty() , r.conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ())
			);
		}

		/** 下り電文設定 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 売上計画を削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBAL_PlnSlsReg_MC_A.Chk02 {

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
			msgL.addAll(lockAndCheckBase());
			return msgL;
		}

		/** ロック、更新カウンタチェック、更新前データDACチェック */
		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			//チェック対象
			MCList<Chk02_RsltR> chkL = getChkList(up0());
			if (chkL.isEmpty()) {
				return msgL;
			}

			// ロック取得
			MCList<MGT_PLN_SLS_R> selectL = MCList.create(MGT_PLN_SLS_R.class);
			selectForUpdateNoWaitPkWk("MGBAL0010_MGT_PLN_SLS_S03",
					selectL, MCQueryApiBuilder.create(MGT_PLN_SLS_R.create("T")).getBaseDbc(), chkL, MGT_PLN_SLS_R.$wg_cd);

			MCIndexKey idx = selectL.createIndex(MGT_PLN_SLS_R.$pln_sls_key);
			for (Chk02_RsltR r : chkL) {
				MGT_PLN_SLS_R selectR = selectL.getFirst(idx, r.pln_sls_key());
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));

					selectR.setAttributes(r);
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_PLN_SLS_R.$wg_cd));
				}
			}
			return msgL;
		}

		/** 下り電文設定 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 売上計画を一括削除するために、チェックを行う<br>
	 */
	public class Chk03 extends MGBAL_PlnSlsReg_MC_A.Chk03 {

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
			msgL.addAll(checkBase());
			return msgL;
		}

		/** DACチェック */
		protected MCMessageList checkBase() {
			MCMessageList msgL = new MCMessageList();
			// DACチェック
			msgL.addAll(checkWritableWgCdDac(up0(), Chk03_CndR.$wg_cd));

			return msgL;
		}

		/** 下り電文設定 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}

	/**
	 * Chk04オペレーション.<p>
	 *
	 * ＳＣＭから売上計画を取り込むために、チェックを行う<br>
	 */
	public class Chk04 extends MGBAL_PlnSlsReg_MC_A.Chk04 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		/** 下り電文設定 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売上計画を登録、更新する<br>
	 */
	public class Upd01 extends MGBAL_PlnSlsReg_MC_A.Upd01 {

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

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
			// チェック＆登録処理
			upd01Main(up0(), false);
		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ売上計画のチェック処理を行う<br>
	 */
	public class Imp01 extends MGBAL_PlnSlsReg_MC_A.Imp01 {

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 上り電文編集
			editUp();

			// チェック処理
			callThisChk01();

			// 下り電文設定
			setDown();

		}

		/** 上り電文編集 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * 更新用チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBAL_PlnSlsReg.Chk01 ope = MGBAL_PlnSlsReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);

			ope.exec();

			up0().setAll(ope.down0());
		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 売上計画を削除する<br>
	 */
	public class Del01 extends MGBAL_PlnSlsReg_MC_A.Del01 {

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

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

			// 上り電文編集
			editUp();

			// チェック処理
			callThisChk02();

			// エラーがない行のみ削除処理
			delPln(getChkList(up0()));
		}

		/** 上り電文編集 */
		protected void editUp() {
			setPegNo(up0());
		}

		/** 削除用チェック処理を実行する */
		protected void callThisChk02() {
			MGBAL_PlnSlsReg.Chk02 ope = MGBAL_PlnSlsReg.crtChk02();
			ope.up0().setAll(up0());

			ope.exec();

			up0().setAll(ope.down0());
		}

		protected void delPln(MCList<Chk02_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}

			MCList<MGT_PLN_SLS_R> dbcL = MCList.create(MGT_PLN_SLS_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			//バッチ削除
			dbDeleteKey("MGBAL0010_MGT_PLN_SLS_D01", dbcL, MCQueryApiBuilder.create(MGT_PLN_SLS_R.create("T")));
		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Del02オペレーション.<p>
	 *
	 * 売上計画を一括で削除する<br>
	 */
	public class Del02 extends MGBAL_PlnSlsReg_MC_A.Del02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// チェック処理
			callThisChk03();

			// エラーがあれば例外をthrow
			throwDelErr();

			// 一括削除
			lockAndDelPln(up0());

		}

		/**
		 * 一括削除用チェック処理を実行する
		 */
		protected void callThisChk03() {
			MGBAL_PlnSlsReg.Chk03 ope = MGBAL_PlnSlsReg.crtChk03();
			MCRow.copyall(ope.up0(), up0());

			ope.exec();

			MCRow.copyvalue(up0(), ope.down0());
		}

		/** 指定条件でロックして一括削除する */
		protected void lockAndDelPln(Chk03_CndR r) {
			//一括削除処理では同一Where句を使用してロックと削除するので
			//削除時に合わせてロックするようにしている
			MGT_PLN_SLS_R t = MGT_PLN_SLS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			createDbcForDelLump(dbc_bldr, t);
			//ロック取得
			dbSelectForUpdateNoWaitNoFetch("MGBAL0010_MGT_PLN_SLS_S04", dbc_bldr, r);
			//一括削除
			dbc_bldr.buildDelete("MGBAL0010_MGT_PLN_SLS_D02").executeUpdate(r);
		}

		/** 指定条件のwhere句を設定したDBコンテナを返す */
		protected void createDbcForDelLump(MCQueryApiBuilder dbc_bldr, MGT_PLN_SLS_R t) {
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.between(bind("ym_fr"), bind("ym_to")));
			dbc_bldr.addWhereWithCutOffAnd(t.mng_dpt_cd.like(bind("mng_dpt_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.cst_cd.like(bind("cst_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.dlv_cd.like(bind("dlv_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.sls_dpt_cd.like(bind("sls_dpt_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.sls_usr_cd.like(bind("sls_usr_cd")));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		}

	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * ファイルから取り込んだ売上計画を登録する<br>
	 */
	public class Ins01 extends MGBAL_PlnSlsReg_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// チェック＆登録処理
			upd01Main(up0(), true);
		}

	}

	/**
	 * Ins02オペレーション.<p>
	 *
	 * 一括削除後にファイルから取り込んだ売上計画を登録する<br>
	 */
	public class Ins02 extends MGBAL_PlnSlsReg_MC_A.Ins02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 一括削除処理
			callThisDel02(up0());

			// チェック＆登録処理
			upd01Main(up1(), true);
		}

		/** 一括削除処理を実行する */
		protected void callThisDel02(Chk03_CndR up) {
			MGBAL_PlnSlsReg.Del02 ope = MGBAL_PlnSlsReg.crtDel02();
			MCRow.copyall(ope.up0(), up);

			ope.exec();
		}

	}

	/**
	 * Ins03オペレーション.<p>
	 *
	 * ＳＣＭから売上計画を取り込む<br>
	 */
	public class Ins03 extends MGBAL_PlnSlsReg_MC_A.Ins03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// チェック処理
			callThisChk04();

			throwUpdErr();
			execMain();
		}

		/**
		 * 取込用チェック処理を実行する
		 */
		protected void callThisChk04() {
			MGBAL_PlnSlsReg.Chk04 ope = MGBAL_PlnSlsReg.crtChk04();
			MCRow.copyall(ope.up0(), up0());

			ope.exec();

			MCRow.copyvalue(up0(), ope.down0());
		}

		/** 売上計画取り込み処理 */
		protected void execMain() {
			MGBAL_PlnSlsIfService.PlnSlsIf_Upd01 ope = MGBAL_PlnSlsIfService.crtPlnSlsIf_Upd01();
			copy(ope.up0(), up0(), createMap_PlnSlsIf_Chk01_CndR_Chk04_CndR());
			ope.exec();
		}

		protected Map_PlnSlsIf_Chk01_CndR_Chk04_CndR<PlnSlsIf_Chk01_CndR, Chk04_CndR> createMap_PlnSlsIf_Chk01_CndR_Chk04_CndR() {
			return new Map_PlnSlsIf_Chk01_CndR_Chk04_CndR<PlnSlsIf_Chk01_CndR, Chk04_CndR>();
		}

		public class Map_PlnSlsIf_Chk01_CndR_Chk04_CndR<D extends PlnSlsIf_Chk01_CndR, S extends Chk04_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PlnSlsIf_Chk01_CndR.$calc_ctg_cd, Chk04_CndR.$calc_ctg_cd);
				addColumnPathMap(PlnSlsIf_Chk01_CndR.$wg_cd, Chk04_CndR.$wg_cd);
				addColumnPathMap(PlnSlsIf_Chk01_CndR.$ym_fr, Chk04_CndR.$ym_fr);
				addColumnPathMap(PlnSlsIf_Chk01_CndR.$ym_to, Chk04_CndR.$ym_to);
				addColumnPathMap(PlnSlsIf_Chk01_CndR.$sls_pln_imp_typ, Chk04_CndR.$sls_pln_imp_typ);
			}
		}

	}

	// ////////////////////////////////////////////////////////////////////////
	// Upd01/Ins01/Ins02 Common
	protected void upd01Main(MCList<Chk01_RsltR> upL, boolean fileInsFlg) {
		upd01EditUp(upL);
		upd01Chk(upL, fileInsFlg);
		if (fileInsFlg) {
			throwUpdErr();
		}
		upd01Reg(upL);
	}

	protected void upd01EditUp(MCList<Chk01_RsltR> upL) {
		setPegNo(Chk01_RsltR.$peg_no, upL);
	}

	protected void upd01Chk(MCList<Chk01_RsltR> upL, boolean fileInsFlg) {
		MGBAL_PlnSlsReg.Chk01 ope = MGBAL_PlnSlsReg.crtChk01();
		ope.up0().setAll(upL);
		ope.up1().file_ins_flg(fileInsFlg);

		ope.exec();

		upL.setAll(ope.down0());
	}

	/** 計画キーを発番した後、ステータスに応じて挿入・更新する */
	protected void upd01Reg(MCList<Chk01_RsltR> upL) {
		MCList<Chk01_RsltR> notErrL = getChkList(upL);
		if (notErrL.isEmpty()) {
			return;
		}

		// 計画キー一括発番
		MCList<Chk01_RsltR> insL = notErrL.subList(MCRow.CREATE);
		doSeqCache(MGC_NUM_SYS_TYP.PLN_SLS_KEY.value(), insL.size());
		insL.forEach(r -> r.pln_sls_key(getSequence(MGC_NUM_SYS_TYP.PLN_SLS_KEY.value())));

		//ステータスに応じて挿入・更新
		MCList<MGT_PLN_SLS_R> dbcL = MCList.create(MGT_PLN_SLS_R.class);
		upL.forEach(r -> dbcL.add(r.dbc()));
		dbUpdByStatus(dbcL);

	}

	//FMCB CUSTOM END
}