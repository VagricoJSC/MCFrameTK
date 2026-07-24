package mcframe.serverMGBD.MGBDL0030;

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
import mcframe.serverMA.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBD.MGBDL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBD.MGBDL0030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBD.MGBDL5010.MGBDL_CalcCostService;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_ArgSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_ArgSrch_MC extends MGBDL_ArgSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 原価計算設定情報を訂正時のチェックをする。<br>
	 */
	public class Chk01 extends MGBDL_ArgSrch_MC_A.Chk01 {

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
			MCList<DtlR> up = up0();
			MCList<MGT_ARG_R> locked = lock(up);
			MCJoinKey<MCList<MGT_ARG_R>> a2b = up.join(
					up.createRow().getKeyColumn(), locked, locked.createRow().getKeyColumn());

			msgL.addAll(chkBase(up, a2b));

			if (!msgL.isEmpty()) {
				return msgL;
			}
			compBase(up0(), a2b);
			return msgL;
		}

		/**
		 * 更新チェック処理
		 * @param up0 上り電文
		 * @param a2bLocked 上り電文からロックした行を取得するためのキー
		 * @return メッセージ
		 */
		protected MCMessageList chkBase(MCList<DtlR> up0, MCJoinKey<MCList<MGT_ARG_R>> a2bLocked) {
			MCMessageList ml = new MCMessageList();
			ml.addAll(chkUpdCntrArg(up0, a2bLocked));
			return ml;
		}

		/**
		 * 上り電文を修正する
		 * @param up0 上り電文
		 * @param a2b 上り電文からロックした行（変更前のデータ）を取得するためのキー
		 */
		protected void compBase(MCList<DtlR> up0, MCJoinKey<MCList<MGT_ARG_R>> a2bLocked) {

			up0.forEach(ar -> {
				//ロックした変更前データ
				MGT_ARG_R lockedRow = ar.getJoinedRow(a2bLocked);
				if (lockedRow != null) {
					//確定済みの場合は削除不可の変更はできない
					if (lockedRow.fix_flg()) {
						ar.non_del_flg(lockedRow.non_del_flg());
					}
				}
			});
		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * 更新対象をロックし、ロックした行を返す。
	 * @param list 更新対象
	 * @return ロックした行
	 */
	protected MCList<MGT_ARG_R> lock(MCList<DtlR> list) {
		if (list.isEmpty()) {
			return null;
		}

		list.sort(list.createRow().getKeyColumn());// ロック順の指定
		MCList<MGT_ARG_R> locked = MCList.create(MGT_ARG_R.class);
		dbSelectKeyForUpdateNoWait("MGBDL0030_MGT_ARG_S01", locked, MCQueryApiBuilder.create(MGT_ARG_R.create("T")), list);
		return locked;
	}

	/**
	 * 原価計算設定情報の排他制御
	 * @param list 上り電文
	 * @param a2bLocked 上り電文からロックした行を取得するためのキー
	 * @return メッセージ
	 */
	protected MCMessageList chkUpdCntrArg(MCList<DtlR> list, MCJoinKey<MCList<MGT_ARG_R>> a2bLocked) {
		MCMessageList ml = new MCMessageList();
		if (list.isEmpty()) {
			return ml;
		}

		list.forEach(ar -> {
			//ロックした変更前データ
			MGT_ARG_R lockedRow = ar.getJoinedRow(a2bLocked);
			ml.addAll(checkUpdCntrNE(ar, DtlR.$upd_cntr, lockedRow));
		});
		return ml;
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価計算設定情報を訂正する。<br>
	 */
	public class Upd01 extends MGBDL_ArgSrch_MC_A.Upd01 {

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
				down0().setAll(up0());
			}
		}

		@Override
		protected void doIt() {
			MCList<DtlR> up = up0();
			editUp(up);
			callThisChk(up);
			MCList<DtlR> list =(DtlL)getChkList(up);
			upd(list);
		}

		protected void editUp(MCList<DtlR> up) {

		}

		protected void callThisChk(MCList<DtlR> up) {
			MGBDL_ArgSrch.Chk01 o = MGBDL_ArgSrch.crtChk01();
			o.up0().setAll(up);
			o.exec();
			up.setAll(o.down0());
		}

		protected void upd(MCList<DtlR> up) {
			if (up.isEmpty()) {
				return;
			}
			MCList<MGT_ARG_R> updL = MCList.create(MGT_ARG_R.class);
			up.forEach(r -> {
				updL.add(r);
			});
			MGT_ARG_R t = MGT_ARG_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
			updL_bldr.setSet(t.non_del_flg, t.rmrks, t.sub_char1, t.sub_char2, t.sub_char3);
			dbUpdateKey("MGBDL0030_MGT_ARG_U01", updL, updL_bldr);
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価計算設定情報を削除する。<br>
	 */
	public class Del01 extends MGBDL_ArgSrch_MC_A.Del01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callSrv();
		}

		protected void callSrv() {
			MGBDL_CalcCostService.CalcRsltDel_Del01 o = MGBDL_CalcCostService.crtCalcRsltDel_Del01();
			o.up0().setAll(up0());
			o.up1().del_admin_flg(isSame(up1().ope(),"DEL_ADMIN"));
			o.exec();
		}

	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価計算設定情報を検索する。<br>
	 */
	public class Srch01 extends MGBDL_ArgSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd();
			MCList<MGT_ARG_R> srchL = MCList.create(MGT_ARG_R.class);
			MGT_ARG_R srchL_t = MGT_ARG_R.create("T");
			MCQueryApiBuilder srchL_bldr = MCQueryApiBuilder.create(srchL_t);
			editSql(srchL_t, srchL_bldr);
			select(srchL, srchL_t, srchL_bldr);
		}

		/**
		 * 検索条件の編集
		 */
		protected void editCnd(){
			if (up0().fix_true_flg() && !up0().fix_false_flg()){
				up0().addBooleanColumn("_fix_flg", true);
			}
			else if (!up0().fix_true_flg() && up0().fix_false_flg()){
				up0().addBooleanColumn("_fix_flg", false);
			}

			if (up0().non_del_true_flg() && !up0().non_del_false_flg()){
				up0().addBooleanColumn("_non_del_flg", true);
			}
			else if (!up0().non_del_true_flg() && up0().non_del_false_flg()){
				up0().addBooleanColumn("_non_del_flg", false);
			}

			if (up0().calc_err_true_flg() && !up0().calc_err_false_flg()){
				up0().addBooleanColumn("_calc_err_flg", true);
			}
			else if (!up0().calc_err_true_flg() && up0().calc_err_false_flg()){
				up0().addBooleanColumn("_calc_err_flg", false);
			}
		}

		protected void editSql(MGT_ARG_R srchL_t, MCQueryApiBuilder srchL_bldr) {
			MAM_XRATE_R m1 = MAM_XRATE_R.create("M1");
			MAM_USR_R m2 = MAM_USR_R.create("M2");
			
			srchL_bldr.addSelect(m1.xrate_nm, srchL_t.ins_usr_id.as("calc_usr_cd"), m2.usr_nm.as("calc_usr_nm"));
			srchL_bldr.addLeftOuterJoin(m1, bracket(srchL_t.xrate_cd.eq(m1.xrate_cd)));
			srchL_bldr.addLeftOuterJoin(m2, bracket(srchL_t.ins_usr_id.eq(m2.usr_cd)));
			srchL_bldr.setWhere(srchL_t.term.eq(bind("term")));
			srchL_bldr.addWhereWithAnd(srchL_t.calc_grp_cd.eq(bind("calc_grp_cd")));
			srchL_bldr.addWhereWithCutOffAnd(srchL_t.st_ym.eq(bind("st_ym")));
			srchL_bldr.addWhereWithCutOffAnd(srchL_t.end_ym.eq(bind("end_ym")));
			srchL_bldr.addWhereWithCutOffAnd(srchL_t.calc_no.like(bind("calc_no")));
			srchL_bldr.addWhereWithCutOffAnd(srchL_t.ins_usr_id.like(bind("calc_usr_cd")));
			srchL_bldr.addWhereWithCutOffAnd(m2.usr_nm.like(bind("calc_usr_nm")));
			srchL_bldr.addWhereWithCutOffAnd(srchL_t.rmrks.like(bind("rmrks")));
			srchL_bldr.addWhereWithCutOffAnd(srchL_t.sub_char1.like(bind("sub_char1")));
			srchL_bldr.addWhereWithCutOffAnd(srchL_t.sub_char2.like(bind("sub_char2")));
			srchL_bldr.addWhereWithCutOffAnd(srchL_t.sub_char3.like(bind("sub_char3")));
			srchL_bldr.addWhereWithCutOffAnd(srchL_t.non_del_flg.eq(bind("_non_del_flg")));
			srchL_bldr.addWhereWithCutOffAnd(srchL_t.calc_err_flg.eq(bind("_calc_err_flg")));
			srchL_bldr.addWhereWithCutOffAnd(srchL_t.fix_flg.eq(bind("_fix_flg")));
			srchL_bldr.setOrderByAsc(srchL_t.calc_no);
		}

		protected void select(MCList<MGT_ARG_R> srchL, MGT_ARG_R srchL_t, MCQueryApiBuilder srchL_bldr) {
			dbSelect("MGBDL0030_MGT_ARG_S02", srchL, srchL_bldr, up0());
			down0().addAllByName(srchL);
		}

	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 原価メニューを検索する。<br>
	 */
	public class Srch02 extends MGBDL_ArgSrch_MC_A.Srch02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCList<MAM_MENU_CONFIG_R> srchL = MCList.create(MAM_MENU_CONFIG_R.class);
			MAM_MENU_CONFIG_R srchL_t = MAM_MENU_CONFIG_R.create("T");
			MCQueryApiBuilder srchL_bldr = MCQueryApiBuilder.create(srchL_t);
			editSql(srchL_t, srchL_bldr);
			select(srchL, srchL_t, srchL_bldr);
		}

		/**
		 * SQL文の編集
		 */
		protected void editSql(MAM_MENU_CONFIG_R srchL_t, MCQueryApiBuilder srchL_bldr) {
			srchL_bldr.setSelect(srchL_t.menu_no, srchL_t.module_id, srchL_t.scrn_id);
			srchL_bldr.setWhere(srchL_t.menu_cd.eq(bind("menu_cd")));
		}

		protected void select(MCList<MAM_MENU_CONFIG_R> srchL, MAM_MENU_CONFIG_R srchL_t, MCQueryApiBuilder srchL_bldr) {
			dbSelect("MGBDL0030_MAM_MENU_CONFIG_S01", srchL, srchL_bldr, up0());
			down0().addAllByName(srchL);
		}

	}

	//FMCB CUSTOM END
}