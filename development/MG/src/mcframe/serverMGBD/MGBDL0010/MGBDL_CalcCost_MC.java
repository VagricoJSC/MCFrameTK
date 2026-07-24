package mcframe.serverMGBD.MGBDL0010;

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
import mcframe.serverMGBD.MGBDL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_CalcCost"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_CalcCost_MC extends MGBDL_CalcCost_MC_A{
	//FMCB CUSTOM START

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 原価計算を実行する。<br>
	 */
	public class Ins01 extends MGBDL_CalcCost_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execMain();
		}

		protected void execMain() {
			editUp();
			callThisChk();
			throwErr(msgOpeErr());
			callInsSrv();
			setDown();
			throwErr(msgOpeErr());
		}

		/**
		 * 上り電文編集
		 */
		protected void editUp() {
			//原価計算実行画面では常にfalse
			up0().carry_flg(false);
		}

		/**
		 * チェック実行
		 */
		protected void callThisChk() {
			MGBDL_CalcCost.Chk01 ope = MGBDL_CalcCost.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
		}

		/**
		 * サービス実行
		 */
		protected void callInsSrv() {
			MGBDL_CalcCostService.CalcCost_Ins01 ope = MGBDL_CalcCostService.crtCalcCost_Ins01();
			ope.up0().add(up0());
			try {
				ope.exec();
			}
			finally {
				if (!isNull(ope.down0())) {
					MCRow.copyall(up0(), ope.down0().get(0));
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 原価計算実行時のチェックをする。<br>
	 */
	public class Chk01 extends MGBDL_CalcCost_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価計算確定情報を検索する。<br>
	 */
	public class Srch01 extends MGBDL_CalcCost_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MGT_CALC_FIX_R t = down0();
			t.setAlias("T");
			MCQueryApiBuilder d_bldr = MCQueryApiBuilder.create(t);
			editSql(t, d_bldr);
			select(t, d_bldr);
		}

		/**
		 * SQL文の編集
		 */
		protected void editSql(MGT_CALC_FIX_R t, MCQueryApiBuilder d_bldr) {
			Srch01_CndR u = up0();

			MAM_TERM_R r = MAM_TERM_R.create();
			dbSelectKey("MGBDL0010_MAM_TERM_S01", r, MCQueryApiBuilder.create(MAM_TERM_R.create("T")), u);

			d_bldr.addMax(t.ym, MGT_CALC_FIX_R.$ym);
			d_bldr.addWhereWithAnd(t.calc_grp_cd.eq(bind("1")), u.calc_grp_cd());
			d_bldr.addWhereWithAnd(t.ym.gte(bind("1")), r.term());
			d_bldr.addWhereWithAnd(t.ym.lt(bind("1")), r.term_end_ym());
		}

		protected void select(MGT_CALC_FIX_R t, MCQueryApiBuilder d_bldr) {
			dbSelect("MGBDL0010_MGT_CALC_FIX_S01", t, d_bldr, up0());
		}

		// メモ：
		// 仕様としては、「指定された期・計算Ｇに対して確定情報がある場合」
		// となっているので、YM の絞込みが必要。
		// 結果、指定された期が 2011/04-2011/10 の場合に、
		// 2011/12 の確定情報のみ存在する場合は、2011/04 の期に対する確定情報
		// は存在しないということになる。
		// 2011/12 の確定情報が存在している場合で、確定情報が存在しない
		// パターンの初期値をセットするのは、使いにくい初期値提案となるが、
		// 通常は、「2011/12 の確定情報のみ存在する」という状況は少なく、
		// 2011/12 の確定情報がある場合は、その前の年月の確定情報もあるはず
		// なので、おかしな初期値提案にはならないことが大半だと思われるので
		// 「2011/12 の確定情報のみ存在していて過去の期を計算する」状況を
		// 加味して初期値提案は行わない仕様となっている。	
	}

	//FMCB CUSTOM END
}