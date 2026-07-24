package mcframe.serverMGBD.MGBDL0100;

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
import mcframe.serverMGBD.MGBDL0100.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBD.MGBDL0100.Query.*;
import static mcframe.commonCore.lang.MCBooleanUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_ExpCalcSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_ExpCalcSrch_MC extends MGBDL_ExpCalcSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 展開計算結果を検索する。<br>
	 */
	public class Srch01 extends MGBDL_ExpCalcSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			srch();
		}

		/** 展開結果およびMGT_ARGを検索する */
		protected void srch() {
			executeQuery(down0(), MGBDL0100_MGT_EXP_MFG_PURC_S01(), up0());
			if (!down0().isEmpty()) {
				MGT_ARG_R arg = getArg(up0().calc_grp_cd(), up0().calc_no(), false, null);
				down1().st_ym(arg.st_ym());
				down1().end_ym(arg.end_ym());
			}
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			setCur();
		}

		/** 通貨関連項目を設定する */
		protected void setCur() {
			down0().setStringNE(Srch01_RsltR.$bcur_cd, getBaseCur().cur_cd());
			down0().setStringNE(Srch01_RsltR.$cur_nm, getBaseCur().cur_nm());
			down0().setNumberNE(Srch01_RsltR.$amt_dec_place, getBaseCur().amt_dec_place());
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 展開計算結果を計画データに反映するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBDL_ExpCalcSrch_MC_A.Chk01 {

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
			msgL.addAll(compArg());
			return msgL;
		}

		protected MCMessageList compArg() {
			MCMessageList msgL = new MCMessageList();
			MGT_ARG_R arg = getArg(up0().calc_grp_cd(), up0().calc_no(), false, msgL);
			if(msgL.isEmpty()) {
				up0().st_ym(arg.st_ym());
				up0().end_ym(arg.end_ym());
			}

			return msgL;
		}

		/** 下り電文設定 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 展開計算結果を計画データに反映する。<br>
	 */
	public class Ins01 extends MGBDL_ExpCalcSrch_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// チェック処理
			callThisChk01();

			// エラーがあれば例外をthrow
			throwUpdErr();

			// 反映処理
			makePln();

		}

		protected void editUp() {
			up0().addStringColumn("amt_flg_str", MCBooleanUtil.booleanToDBString(up0().amt_flg()));
			if(up0().amt_flg()) {
				up0().addStringColumn("bcur_cd", getBaseCur().cur_cd());
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBDL_ExpCalcSrch.Chk01 ope = MGBDL_ExpCalcSrch.crtChk01();
			MCRow.copyall(ope.up0(), up0());

			ope.exec();

			MCRow.copyvalue(up0(), ope.up0());
		}

		protected void makePln() {

			if (up0().mfg_flg()) {
				//製造計画に反映
				lockDelInsPlnMfg();
			}
			if (up0().purc_flg()) {
				//購買計画に反映
				lockDelInsPlnPurc();
			}
		}

		/** 製造展開計算結果を製造計画に反映する */
		protected void lockDelInsPlnMfg() {

			MGT_PLN_MFG_R t = MGT_PLN_MFG_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			createPlnMfgDbc(t, dbc_bldr);

			// Lock
			dbSelectForUpdateNoWaitNoFetch("MGBDL0100_MGT_PLN_MFG_S01", dbc_bldr, up0());

			// Delete
			dbc_bldr.buildDelete("MGBDL0100_MGT_PLN_MFG_D01").executeUpdate(up0());

			// Insert
			executeUpdate(MGBDL0100_MGT_PLN_MFG_I01(), up0());

		}

		/** 購買展開計算結果を購買計画に反映する */
		protected void lockDelInsPlnPurc() {

			MGT_PLN_PURC_R t = MGT_PLN_PURC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			createPlnPurcDbc(t, dbc_bldr);

			// Lock
			dbSelectForUpdateNoWaitNoFetch("MGBDL0100_MGT_PLN_PURC_S01", dbc_bldr, up0());

			// Delete
			dbc_bldr.buildDelete("MGBDL0100_MGT_PLN_PURC_D01").executeUpdate(up0());


			// Insert
			executeUpdate(MGBDL0100_MGT_PLN_PURC_I01(), up0());

		}

		protected void createPlnMfgDbc(MGT_PLN_MFG_R t, MCQueryApiBuilder dbc_bldr) {
			MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");

			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.gte(bind("st_ym")));
			dbc_bldr.addWhereWithAnd(t.ym.lte(bind("end_ym")));
			dbc_bldr.addWhereWithCutOffAnd(t.wg_cd.like(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W)
					.where(value(0).eq(value(0))
							.and(t.wg_cd.eq(S1W.wg_cd)))));
			dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		}

		protected void createPlnPurcDbc(MGT_PLN_PURC_R t, MCQueryApiBuilder dbc_bldr) {
			MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
			
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.gte(bind("st_ym")));
			dbc_bldr.addWhereWithAnd(t.ym.lte(bind("end_ym")));
			dbc_bldr.addWhereWithCutOffAnd(t.wg_cd.like(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W)
					.where(value(0).eq(value(0))
							.and(t.wg_cd.eq(S1W.wg_cd)))));
			dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		}

	}

	/** MGT_ARGのレコードを取得する。 */
	protected MGT_ARG_R getArg(String calcGrpCd, String calcNo, boolean lock, MCMessageList msgL) {
		MGT_ARG_R arg = MGT_ARG_R.create();
		MCQueryApiBuilder arg_bldr = MCQueryApiBuilder.create(MGT_ARG_R.create("T"));
		if(lock) {
			dbSelectKeyForUpdateNoWait("MGBDL0100_MGT_ARG_S01", arg, arg_bldr.getBaseDbc(), calcNo, calcGrpCd);
		}
		else {
			dbSelectKey("MGBDL0100_MGT_ARG_S02", arg, arg_bldr, calcNo, calcGrpCd);
		}
		if(msgL != null && isNull(arg.calc_no())) {
			msgL.add(new MCMessage(MGUCL0003, calcGrpCd, calcNo));
		}
		return arg;
	}

	//FMCB CUSTOM END
}