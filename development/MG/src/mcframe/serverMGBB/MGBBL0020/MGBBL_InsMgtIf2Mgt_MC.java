package mcframe.serverMGBB.MGBBL0020;

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
import mcframe.serverMGBB.MGBBL0020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBB.MGBBL0010.*;
import mcframe.serverMGBB.MGBBL5010.*;
import mcframe.serverMGBB.MGBBL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_InsMgtIf2Mgt"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_InsMgtIf2Mgt_MC extends MGBBL_InsMgtIf2Mgt_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価実績ＩＦデータ、原価実績データを検索する。<br>
	 */
	public class Srch01 extends MGBBL_InsMgtIf2Mgt_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srchIfAct();
			down0().addAll(up1());
		}

		protected void editUp() {
			String defWgCd = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(defWgCd)) {
				up0().wg_cd(defWgCd);
			}
		}

		protected void srchIfAct() {
			Srch01_CndR cR = up0();
			for (Srch01_RsltR rR : up1()) {
				if(MGC_COST_ACT_TYP.isITM_MFG_INST(rR.cost_act_typ())){
					srchItmMfgInst(cR, rR);
				}
				else if(MGC_COST_ACT_TYP.isINST_OPER(rR.cost_act_typ())){
					srchInstOper(cR, rR);
				}
				else if(MGC_COST_ACT_TYP.isMFG(rR.cost_act_typ())){
					srchMfg(cR, rR);
				}
				else if(MGC_COST_ACT_TYP.isPURC(rR.cost_act_typ())){
					srchPurc(cR, rR);
				}
				else if(MGC_COST_ACT_TYP.isINPT(rR.cost_act_typ())){
					srchInpt(cR, rR);
				}
				else if(MGC_COST_ACT_TYP.isINST_WK(rR.cost_act_typ())){
					srchInstWk(cR, rR);
				}
				else if(MGC_COST_ACT_TYP.isOTHER_WK(rR.cost_act_typ())){
					srchOtherWk(cR, rR);
				}
				else if(MGC_COST_ACT_TYP.isWIP(rR.cost_act_typ())){
					srchWip(cR, rR);
				}
				else if(MGC_COST_ACT_TYP.isIO(rR.cost_act_typ())){
					srchIo(cR, rR);
				}
				else if(MGC_COST_ACT_TYP.isSLS(rR.cost_act_typ())){
					srchSls(cR, rR);
				}
				else if(MGC_COST_ACT_TYP.isSTK(rR.cost_act_typ())){
					srchStk(cR, rR);
				}
			}
		}

		protected void srchItmMfgInst(Srch01_CndR cR, Srch01_RsltR rR){
			MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
			MGT_ITM_MFG_INST_R dbc = MGT_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);

			dbc_bldr.addMax(dbc.upd_ts, Srch01_RsltR.$last_upd_dt);
			dbc_bldr.addWhereWithAnd(dbc.wg_cd.eq(bind("1")), cR.wg_cd());
			dbc_bldr.addWhereWithAnd(dbc.calc_ctg_cd.eq(bind("1")), cR.calc_ctg_cd());
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W).where(dbc.wg_cd.eq(S1W.wg_cd))));
			dbSelect("MGBBL0020_MGT_ITM_MFG_INST_S01", dbc, dbc_bldr, rR);
			rR.last_upd_dt(dbc.getTimestampNE(Srch01_RsltR.$last_upd_dt));
		}

		protected void srchInstOper(Srch01_CndR cR, Srch01_RsltR rR){
			MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
			MGT_INST_OPER_R dbc = MGT_INST_OPER_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);

			dbc_bldr.addMax(dbc.upd_ts, Srch01_RsltR.$last_upd_dt);
			dbc_bldr.addWhereWithAnd(dbc.wg_cd.eq(bind("1")), cR.wg_cd());
			dbc_bldr.addWhereWithAnd(dbc.calc_ctg_cd.eq(bind("1")), cR.calc_ctg_cd());
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W).where(dbc.wg_cd.eq(S1W.wg_cd))));
			dbSelect("MGBBL0020_MGT_INST_OPER_S01", dbc, dbc_bldr, rR);
			rR.last_upd_dt(dbc.getTimestampNE(Srch01_RsltR.$last_upd_dt));
		}

		protected void srchMfg(Srch01_CndR cR, Srch01_RsltR rR){
			srchIfLastUpdDt(MGT_ACT_MFG_IF_R.create("T"), cR, rR);
			srchActLastUpdDt(MGT_ACT_MFG_R.create("T"), cR, rR);
		}

		protected void srchPurc(Srch01_CndR cR, Srch01_RsltR rR){
			srchIfLastUpdDt(MGT_ACT_PURC_IF_R.create("T"), cR, rR);
			srchActLastUpdDt(MGT_ACT_PURC_R.create("T"), cR, rR);
		}

		protected void srchInpt(Srch01_CndR cR, Srch01_RsltR rR){
			srchIfLastUpdDt(MGT_ACT_INPT_IF_R.create("T"), cR, rR);
			srchActLastUpdDt(MGT_ACT_INPT_R.create("T"), cR, rR);
		}

		protected void srchInstWk(Srch01_CndR cR, Srch01_RsltR rR){
			srchIfLastUpdDt(MGT_ACT_INST_WK_IF_R.create("T"), cR, rR);
			srchActLastUpdDt(MGT_ACT_INST_WK_R.create("T"), cR, rR);
		}

		protected void srchOtherWk(Srch01_CndR cR, Srch01_RsltR rR){
			srchIfLastUpdDt(MGT_ACT_OTHER_WK_IF_R.create("T"), cR, rR);
			srchActLastUpdDt(MGT_ACT_OTHER_WK_R.create("T"), cR, rR);
		}

		protected void srchWip(Srch01_CndR cR, Srch01_RsltR rR){
			srchIfLastUpdDt(MGT_ACT_INST_WIP_IF_R.create("T"), cR, rR);
			srchActLastUpdDt(MGT_ACT_INST_WIP_R.create("T"), cR, rR);
		}

		protected void srchSls(Srch01_CndR cR, Srch01_RsltR rR){
			srchIfLastUpdDt(MGT_ACT_SLS_IF_R.create("T"), cR, rR);
			srchActLastUpdDt(MGT_ACT_SLS_R.create("T"), cR, rR);
		}

		protected void srchStk(Srch01_CndR cR, Srch01_RsltR rR){
			srchIfLastUpdDt(MGT_ACT_STK_IF_R.create("T"), cR, rR);
			srchActLastUpdDt(MGT_ACT_STK_R.create("T"), cR, rR);
		}

		protected void srchIo(Srch01_CndR cR, Srch01_RsltR rR){
			srchIfLastUpdDt(MGT_ACT_IO_IF_R.create("T"), cR, rR);
			srchActLastUpdDt(MGT_ACT_IO_R.create("T"), cR, rR);
		}

		protected void srchIfLastUpdDt(MCDBContainer d, Srch01_CndR cR, Srch01_RsltR rR){
			MCQueryApiBuilder d_bldr = MCQueryApiBuilder.create(d);

			d_bldr.addMax(d.getColumn$("upd_ts"), Srch01_RsltR.$if_last_upd_dt);
			d_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(d.getColumn$("wg_cd"), value(cR.wg_cd())));
			d_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(d.getColumn$("ym"), value(cR.ym())));
			d_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(d.getColumn$("calc_ctg_cd"), value(cR.calc_ctg_cd())));
			dbSelect(createSqlId(LOGIC_ID, d_bldr.getBaseDbc(), "S50"), d, d_bldr, rR);
			rR.if_last_upd_dt(d.getTimestampNE(Srch01_RsltR.$if_last_upd_dt));
		}

		protected void srchActLastUpdDt(MCDBContainer d, Srch01_CndR cR, Srch01_RsltR rR){
			MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
			MCQueryApiBuilder d_bldr = MCQueryApiBuilder.create(d);

			d_bldr.addMax(d.getColumn$("upd_ts"), Srch01_RsltR.$last_upd_dt);
			d_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(d.getColumn$("wg_cd"), value(cR.wg_cd())));
			d_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(d.getColumn$("ym"), value(cR.ym())));
			d_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(d.getColumn$("calc_ctg_cd"), value(cR.calc_ctg_cd())));
			d_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W).where(MCQueryApiBuilder.makeEq(d.getColumn$("wg_cd"), S1W.wg_cd))));
			dbSelect(createSqlId(LOGIC_ID, d_bldr.getBaseDbc(), "S51"), d, d_bldr, rR);
			rR.last_upd_dt(d.getTimestampNE(Srch01_RsltR.$last_upd_dt));
		}

	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 原価計算確定情報を検索する。<br>
	 */
	public class Srch02 extends MGBBL_InsMgtIf2Mgt_MC_A.Srch02 {

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
	 * Ins01オペレーション.<p>
	 *
	 * 原価実績ＩＦデータから原価実績データを作成する。<br>
	 */
	public class Ins01 extends MGBBL_InsMgtIf2Mgt_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execUpd(up0(), up1(), false);
			throwErr(msgOpeErr());
		}

	}

	/**
	 * Ins02オペレーション.<p>
	 *
	 * ＩＦデータ取込、実績データ作成を一括で行う。<br>
	 */
	public class Ins02 extends MGBBL_InsMgtIf2Mgt_MC_A.Ins02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execLump(up0(), up1(), false);
			throwErr(msgOpeErr());
		}

	}

	/**
	 * Ins03オペレーション.<p>
	 *
	 * ＩＦデータ取込、実績データ作成を一括（再取込）で行う。<br>
	 */
	public class Ins03 extends MGBBL_InsMgtIf2Mgt_MC_A.Ins03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execLump(up0(), up1(), true);
			throwErr(msgOpeErr());
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価実績データを削除する。<br>
	 */
	public class Del01 extends MGBBL_InsMgtIf2Mgt_MC_A.Del01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execUpd(up0(), up1(), true);
			throwErr(msgOpeErr());
		}

	}

	/**
	 * 実績データの作成／削除処理
	 */
	protected void execUpd(Ins01_CndR cR, MCList<Ins01_RsltR> rL, boolean delFlg) {
		// 原価実績データ作成サービス実行
		callPcmActService(cR, rL, delFlg);
	}

	/**
	 * ＩＦデータ取込、実績データ作成の一括処理
	 */
	protected void execLump(Ins01_CndR cR, MCList<Ins01_RsltR> rL, boolean rerunFlg) {
		// 原価ＩＦデータ取込サービス実行
		callPcmIfService(cR, rerunFlg);
		throwErr(msgOpeErr());

		// 原価実績データ作成サービス実行
		callPcmActService(cR, rL, false);
	}

	///////////////////////////////////////////////////////////////////////////////
	// PcmActService
	protected void callPcmActService(Ins01_CndR cR, MCList<Ins01_RsltR> rL, boolean delFlg) {
		MGBBL_PcmActService.PcmAct_Upd01 ope = MGBBL_PcmActService.crtPcmAct_Upd01();
		setOpeUp(ope.up0(), cR, rL, delFlg);
		ope.exec();
	}

	protected void setOpeUp(PcmAct_Chk01_CndR up, Ins01_CndR cR, MCList<Ins01_RsltR> rL, boolean delFlg) {
		up.calc_ctg_cd(cR.calc_ctg_cd());
		up.wg_cd(cR.wg_cd());
		up.ym(cR.ym());
		up.del_flg(delFlg);
		up.setAttributes(cR);

		for (MGC_IF_DATA_TYP typ : MGC_IF_DATA_TYP.array()){
			up.setBooleanNE(typ.key().toLowerCase() + "_flg", checkTyp(typ, rL));
		}
	}

	protected boolean checkTyp(MGC_IF_DATA_TYP typ, MCList<Ins01_RsltR> rL){
		String col = Srch01_RsltR.$if_data_typ;
		String val = typ.value();
		return  rL.getFirst(col, val) != null;
	}

	///////////////////////////////////////////////////////////////////////////////
	// PcmIfService
	protected void callPcmIfService(Ins01_CndR cR, boolean rerunFlg) {
		MGBBL_PcmIfService.PcmIf_Upd01 ope = MGBBL_PcmIfService.crtPcmIf_Upd01();
		setOpeUp(ope.up0(), cR, rerunFlg);
		ope.exec();
	}

	protected void setOpeUp(PcmIf_Chk01_CndR up, Ins01_CndR cR, boolean rerunFlg) {
		up.ym(cR.ym());
		up.calc_ctg_cd(cR.calc_ctg_cd());
		up.io_flg(true);
		up.wk_flg(true);
		up.wip_flg(true);
		up.stk_flg(true);
		up.rerun_flg(rerunFlg);
		up.non_mov_flg(cR.non_mov_flg());
		up.setAttributes(cR);
	}

	//FMCB CUSTOM END
}