package mcframe.serverMSBE.MSBEL2430;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMSBE.MSBEL5550.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL2430.Query.*;
import mcframe.serverMAUC.MAUCL5020.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_AcXfrSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_AcXfrSrch_MC extends MSBEL_AcXfrSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 他勘定振替予定情報を検索する。<br>
	 */
	public class Srch01 extends MSBEL_AcXfrSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件編集
			editUpCond();

			// 検索を実行する。
			MCQueryPlan stkXfrSql = MSBEL2430_MST_ACXFR_SCHD_S01();
			searchForDL(stkXfrSql, up0(), down0());
		}

		public void editUpCond() {
			// 廃棄申請書のチェック
			if (!isSame(up0().ope(), "4")) {
				up0().ope(null);
			}

			// 予定未承認含むのチェック
			if (!up0().schd_no_aprv_flg()) {
				up0().addStringColumn("aprv_sts_opn", MAC_APRV_STS_TYP.OPN.value());
			}

			// 進捗状況区分: 未指図のチェック
			if (up0().not_inst_flg()) {
				up0().addStringColumn("not_inst", MSC_PR_STS_TYP.NOT_INST.value());
			}
			// 進捗状況区分: 指図済のチェック
			if (up0().inst_flg()) {
				up0().addStringColumn("inst", MSC_PR_STS_TYP.INST.value());
			}
			// 進捗状況区分: 一部完了のチェック
			if (up0().part_comp_flg()) {
				up0().addStringColumn("part_comp", MSC_PR_STS_TYP.PART_COMP.value());
			}
			// 進捗状況区分: 完了のチェック
			if (up0().comp_flg()) {
				up0().addStringColumn("comp", MSC_PR_STS_TYP.COMP.value());
			}
		}

		protected void beforeSearchForBizDatDLCmn() {
			// 品目分類
			up0().itm_grp_flg1(true);
			up0().itm_grp_flg2(true);
			up0().itm_grp_flg3(true);
			up0().itm_grp_flg4(true);
			up0().itm_grp_flg5(true);
			up0().itm_grp_flg6(true);
			up0().itm_grp_flg7(true);
			up0().itm_grp_flg8(true);
			up0().itm_grp_flg9(true);
			up0().itm_grp_flg10(true);
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 他勘定振替指図情報を検索する。<br>
	 */
	public class Srch02 extends MSBEL_AcXfrSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件編集
			editUpCond();

			// 検索を実行する。
			MCQueryPlan stkXfrSql = MSBEL2430_MST_ACXFR_INST_S01();
			searchForDL(stkXfrSql, up0(), down0());
		}

		public void editUpCond() {
			// 廃棄申請書は対象外
			up0().ope(null);

			// 指図未承認含むのチェック＝＝＞対象外？？？
			// if (!up0().schd_no_aprv_flg()) {
			// 	up0().addStringColumn("aprv_sts_opn", MAC_APRV_STS_TYP.OPN.value());
			// }

			// 進捗状況区分: 未指図のチェック
			if (up0().not_inst_flg()) {
				up0().addStringColumn("not_inst", MSC_PR_STS_TYP.NOT_INST.value());
			}
			// 進捗状況区分: 指図済のチェック
			if (up0().inst_flg()) {
				up0().addStringColumn("inst", MSC_PR_STS_TYP.INST.value());
			}
			// 進捗状況区分: 一部完了のチェック
			if (up0().part_comp_flg()) {
				up0().addStringColumn("part_comp", MSC_PR_STS_TYP.PART_COMP.value());
			}
			// 進捗状況区分: 完了のチェック
			if (up0().comp_flg()) {
				up0().addStringColumn("comp", MSC_PR_STS_TYP.COMP.value());
			}
			// 打切含む
			up0().addStringColumn("abort_false", toTrueStr(!up0().abort_flg()));
		}

		protected void beforeSearchForBizDatDLCmn() {
			// 品目分類
			up0().itm_grp_flg1(true);
			up0().itm_grp_flg2(true);
			up0().itm_grp_flg3(true);
			up0().itm_grp_flg4(true);
			up0().itm_grp_flg5(true);
			up0().itm_grp_flg6(true);
			up0().itm_grp_flg7(true);
			up0().itm_grp_flg8(true);
			up0().itm_grp_flg9(true);
			up0().itm_grp_flg10(true);
		}
	}

	/**
	 * Srch03オペレーション.<p>
	 *
	 * 他勘定振替実績情報を検索する。<br>
	 */
	public class Srch03 extends MSBEL_AcXfrSrch_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件編集
			editUpCond();

			// 検索を実行する。
			MCQueryPlan stkXfrSql = MSBEL2430_MST_ACXFR_ACT_S01();
			searchForDL(stkXfrSql, up0(), down0());
		}

		public void editUpCond() {
			// 廃棄申請書のチェック
			if (!isSame(up0().ope(), "5")) {
				// 打切含む
				up0().addStringColumn("abort_false", toTrueStr(!up0().abort_flg()));
				up0().ope(null);
			}

			// 実績未承認含むのチェック＝＝＞対象外？？？
			// if (!up0().schd_no_aprv_flg()) {
			// 	up0().addStringColumn("aprv_sts_opn", MAC_APRV_STS_TYP.OPN.value());
			// }

			// 進捗状況区分: 未指図のチェック
			if (up0().not_inst_flg()) {
				up0().addStringColumn("not_inst", MSC_PR_STS_TYP.NOT_INST.value());
			}
			// 進捗状況区分: 指図済のチェック
			if (up0().inst_flg()) {
				up0().addStringColumn("inst", MSC_PR_STS_TYP.INST.value());
			}
			// 進捗状況区分: 一部完了のチェック
			if (up0().part_comp_flg()) {
				up0().addStringColumn("part_comp", MSC_PR_STS_TYP.PART_COMP.value());
			}
			// 進捗状況区分: 完了のチェック
			if (up0().comp_flg()) {
				up0().addStringColumn("comp", MSC_PR_STS_TYP.COMP.value());
			}
		}

		protected void beforeSearchForBizDatDLCmn() {
			// 品目分類
			up0().itm_grp_flg1(true);
			up0().itm_grp_flg2(true);
			up0().itm_grp_flg3(true);
			up0().itm_grp_flg4(true);
			up0().itm_grp_flg5(true);
			up0().itm_grp_flg6(true);
			up0().itm_grp_flg7(true);
			up0().itm_grp_flg8(true);
			up0().itm_grp_flg9(true);
			up0().itm_grp_flg10(true);
		}
	}

	/**
	 * Prnt02オペレーション.<p>
	 *
	 * 振替伝票を発行する。<br>
	 */
	public class Prnt02 extends MSBEL_AcXfrSrch_MC_A.Prnt02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 振替伝票発行
			callShipRprtPrnt01();
			
			updPrintFlg();
		}

		/**
		 * 振替伝票発行サービスを実行する。
		 */
		protected void callShipRprtPrnt01() {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 srp = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();

			MCList<ShipRprt_Prnt01_HdrR> hdrL = up0().groupBy(ShipRprt_Prnt01_HdrR.$dlv_slip_no,ShipRprt_Prnt01_HdrR.$dlv_slip_act_no);

			for (ShipRprt_Prnt01_HdrR r : hdrL){

				r.trn_typ(MSC_TRN_TYP.ACXFR.value());
				r.dlv_slip_prnt_flg(true);

				srp.up0().add(r);
			}

			srp.exec();
		}

		/**
		 * 印刷ＦＬＧを更新する。
		 */
		protected void updPrintFlg() {
			MCList<ShipRprt_Prnt01_HdrR> hdrL = up0().groupBy(ShipRprt_Prnt01_HdrR.$dlv_slip_act_no);

			MCList<MST_ACXFR_ACT_R> actL = MCList.create(MST_ACXFR_ACT_R.class);
			for (ShipRprt_Prnt01_HdrR r : hdrL){
				actL.add().acxfr_act_no(r.dlv_slip_act_no());
			}
			MST_ACXFR_ACT_R t = MST_ACXFR_ACT_R.create("T");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
			actL_bldr.setSetVL(t.prnt_flg, value(true));
			dbUpdateKey("MSBEL2430_MST_ACXFR_ACT_U01", actL, actL_bldr);
			callRevDataIns01(actL);
		}
		
		
		protected void callRevDataIns01(MCList<MST_ACXFR_ACT_R> argL) {
			MCList<MST_ACXFR_ACT_R> wkL = MCList.create(MST_ACXFR_ACT_R.class);
			for (MST_ACXFR_ACT_R r : argL) {
				MST_ACXFR_ACT_R wkR = MST_ACXFR_ACT_R.create();
				wkR.acxfr_act_no(r.acxfr_act_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			dbWkDelete("MSBEL2430_MSW_ACXFR_ACT_D01", wkL_bldr.getBaseDbc());
			MCQueryApiBuilder wkL2_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			MCList<MST_ACXFR_ACT_R> wkL2 = wkL.groupBy(wkL2_bldr.getBaseDbc().getKeyColumn());
			dbWkInsert("MSBEL2430_MSW_ACXFR_ACT_I01", wkL2, wkL2_bldr.getBaseDbc());

			MCList<MST_ACXFR_ACT_R> hdrL = MCList.create(MST_ACXFR_ACT_R.class);
			MST_ACXFR_ACT_R t3 = MST_ACXFR_ACT_R.create("T");
			MSW_ACXFR_ACT_KEY_R w = MSW_ACXFR_ACT_KEY_R.create("W");
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t3);
			hdrL_bldr.setSelect(t3.acxfr_act_no, t3.acxfr_act_rev);
			hdrL_bldr.addInnerJoin(w, bracket( t3.acxfr_act_no.eq(w.acxfr_act_no)));
			dbSelect("MSBEL2430_MST_ACXFR_ACT_S01", hdrL, hdrL_bldr);
			
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_ACXFR_ACT_R r : hdrL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(r.acxfr_act_no());
				opeR.rev_no(r.acxfr_act_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_ACXFR_ACT.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
	}

	//FMCB CUSTOM END
}