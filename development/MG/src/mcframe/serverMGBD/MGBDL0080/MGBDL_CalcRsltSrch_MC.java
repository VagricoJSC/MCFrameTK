package mcframe.serverMGBD.MGBDL0080;

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
 * "MGBDL_CalcRsltSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_CalcRsltSrch_MC extends MGBDL_CalcRsltSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Del01オペレーション.<p>
	 *
	 * 計算結果を削除する。<br>
	 */
	public class Del01 extends MGBDL_CalcRsltSrch_MC_A.Del01 {

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
			o.exec();
		}

	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価計算情報を検索する。<br>
	 */
	public class Srch01 extends MGBDL_CalcRsltSrch_MC_A.Srch01 {

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
			editSql(srchL, srchL_t, srchL_bldr);
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

		protected void editSql(MCList<MGT_ARG_R> srchL, MGT_ARG_R srchL_t , MCQueryApiBuilder srchL_bldr) {
			MAM_XRATE_R m1 = MAM_XRATE_R.create("M1");
			MAM_USR_R m2 = MAM_USR_R.create("M2");
			MAM_CALC_GRP_R m3 = MAM_CALC_GRP_R.create("M3");
			MAM_TERM_R m4 = MAM_TERM_R.create("M4");

			srchL_bldr.addSelect(m1.xrate_nm, srchL_t.ins_usr_id.as("calc_usr_cd"), m2.usr_nm.as("calc_usr_nm"), m3.calc_grp_nm, m4.term_nm);
			srchL_bldr.addLeftOuterJoin(m1, bracket( srchL_t.xrate_cd.eq(m1.xrate_cd)));
			srchL_bldr.addLeftOuterJoin(m2, bracket( srchL_t.ins_usr_id.eq(m2.usr_cd)));
			srchL_bldr.addLeftOuterJoin(m3, bracket( srchL_t.calc_grp_cd.eq(m3.calc_grp_cd)));
			srchL_bldr.addLeftOuterJoin(m4, bracket( srchL_t.term.eq(m4.term)));
			srchL_bldr.setWhere(
				value(0).eq(value(0))
					.cutoff$and(srchL_t.calc_grp_cd.like(bind("calc_grp_cd")))
					.cutoff$and(m3.calc_grp_nm.like(bind("calc_grp_nm")))
					.cutoff$and(srchL_t.st_ym.eq(bind("st_ym")))
					.cutoff$and(srchL_t.end_ym.eq(bind("end_ym")))
					.cutoff$and(srchL_t.ins_srv_req_no.like(bind("ins_srv_req_no")))
					.cutoff$and(srchL_t.ins_usr_id.like(bind("calc_usr_cd")))
					.cutoff$and(m2.usr_nm.like(bind("calc_usr_nm")))
					.cutoff$and(srchL_t.rmrks.like(bind("rmrks")))
					.cutoff$and(srchL_t.sub_char1.like(bind("sub_char1")))
					.cutoff$and(srchL_t.sub_char2.like(bind("sub_char2")))
					.cutoff$and(srchL_t.sub_char3.like(bind("sub_char3")))
					.cutoff$and(srchL_t.fix_flg.eq(bind("_fix_flg")))
					.cutoff$and(srchL_t.non_del_flg.eq(bind("_non_del_flg")))
					.cutoff$and(srchL_t.calc_err_flg.eq(bind("_calc_err_flg")))
					.cutoff$and(srchL_t.term.gte(bind("term_fr")))
					.cutoff$and(srchL_t.term.lte(bind("term_to")))
					.cutoff$and(srchL_t.st_ym.gte(bind("st_ym_fr")))
					.cutoff$and(srchL_t.st_ym.lte(bind("st_ym_to")))
					.cutoff$and(srchL_t.end_ym.gte(bind("end_ym_fr")))
					.cutoff$and(srchL_t.end_ym.lte(bind("end_ym_to"))));

			srchL_bldr.setOrderByAsc(srchL_t.term, srchL_t.calc_grp_cd, srchL_t.calc_no);
		}

		protected void select(MCList<MGT_ARG_R> srchL, MGT_ARG_R srchL_t , MCQueryApiBuilder srchL_bldr) {
			dbSelect("MGBDL0080_MGT_ARG_S01", srchL, srchL_bldr, up0());
			down0().addAllByName(srchL);
		}

	}

	//FMCB CUSTOM END
}