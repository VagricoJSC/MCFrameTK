package mcframe.serverMSBC.MSBCL1090;

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
import static mcframe.serverMSBC.MSBCL1090.Query.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import java.util.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_InptListSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_InptListSrch_MC extends MSBCL_InptListSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 未着手の製造指図または登録済みの製造実績を検索する<br>
	 */
	public class Srch01 extends MSBCL_InptListSrch_MC_A.Srch01 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			selectRslt();
		}

		/**
		 * 上り電文の編集
		 * 
		 */
		protected void editUp() {
			// 状況（工程）
			if (up0().oper_cmpl_flg()) {
				up0().addStringColumn("tmp_oper_sts_cmpl_str", MSC_MFG_STS_TYP.CMPL.value());
			}
			if (up0().oper_stt_flg()) {
				up0().addStringColumn("tmp_oper_sts_stt_str", MSC_MFG_STS_TYP.STT.value());
			}
			if (up0().oper_ord_flg()) {
				up0().addStringColumn("tmp_oper_sts_ord_str", MSC_MFG_STS_TYP.ORD.value());
			}
			if (up0().oper_sav_flg()) {
				up0().addStringColumn("tmp_oper_sts_sav_str", MSC_MFG_STS_TYP.SAV.value());
			}
			
			// 状況（投入）
			if (up0().inpt_cmpl_flg()) {
				up0().addStringColumn("tmp_inpt_sts_cmpl_str", MSC_MFG_STS_TYP.CMPL.value());
			}
			if (up0().inpt_stt_flg()) {
				up0().addStringColumn("tmp_inpt_sts_stt_str", MSC_MFG_STS_TYP.STT.value());
			}
			if (up0().inpt_ord_flg()) {
				up0().addStringColumn("tmp_inpt_sts_ord_str", MSC_MFG_STS_TYP.ORD.value());
			}
			if (up0().inpt_sav_flg()) {
				up0().addStringColumn("tmp_inpt_sts_sav_str", MSC_MFG_STS_TYP.SAV.value());
			}
			if (up0().inpt_no_schd_flg()) {
				up0().addStringColumn("tmp_inpt_no_schd_str", "1");
			}
			
			// 未引当のみ
			if (up0().not_alloc_srch_flg()) {
				up0().addStringColumn("tmp_not_alloc_srch_str", "1");
			}
			// 収率計算用子品目のみ
			if (up0().yield_calc_flg()) {
				up0().addStringColumn("tmp_yield_calc_str", "1");
			}
			// 進捗率にロスを加味する
			if (up0().pr_rate_inc_loss_flg()) {
				up0().addStringColumn("tmp_pr_rate_inc_loss_str", "1");
			}
		}
		
		/**
		 *一覧（製造・工程実績）の検索
		 * 
		 */
		protected void selectRslt() {
			if (isSame(up0().srch_mode1(), "SCHD")) {
				// 投入予定の検索
				MCQueryPlan actHdrSql = MSBCL1090_MST_INPT_SCHD_S01();
				searchForDL(actHdrSql, up0(), down0());
			}
			else if (isSame(up0().srch_mode1(), "ACT")) {
				if (isSame(up0().srch_mode2(), "INPT")) {
					// 投入実績の検索
					MCQueryPlan actHdrSql = MSBCL1090_MST_INPT_ACT_S01();
					searchForDL(actHdrSql, up0(), down0());
				}
				else if (isSame(up0().srch_mode2(), "LOSS")) {
					MCQueryPlan actHdrSql = MSBCL1090_MST_LOSS_ACT_S01();
					searchForDL(actHdrSql, up0(), down0());
				}
			}
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			selectLot();
			Map<String, MCList<Srch01_YieldRsltR>> yieldMap = getYieldMap();
			editDown(yieldMap);
		}

		/**
		 * 出来高ロットの検索
		 * 
		 */
		protected void selectLot() {
			// 出来高取得用にヘッダのワークテーブルを作成
			insHdrWk(down0());
			
			// 出来高実績の検索
			executeQuery(Srch01_YieldRslt(), MSBCL1090_MST_YIELD_ACT_S01());
		}
		
		protected void insHdrWk(MCList<Srch01_RsltR> hdrL) {
			MCList<MST_MFG_ACT_R> actWkL = MCList.create(MST_MFG_ACT_R.class);
			for (Srch01_RsltR hdrR : hdrL) {
				// 製造実績ＮＯのワーク
				if (!isNull(hdrR.mfg_act_no())) {
					MST_MFG_ACT_R actWkR = MST_MFG_ACT_R.create();
					actWkR.mfg_act_no(hdrR.mfg_act_no());
					actWkL.add(actWkR);
				}
			}

			if (!actWkL.isEmpty()) {
				MCQueryApiBuilder actWkL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_R.create("T"));
				dbWkDelete("MSBCL1090_MSW_MFG_ACT_D01", actWkL_bldr.getBaseDbc());
				dbWkInsert("MSBCL1090_MSW_MFG_ACT_I01", actWkL.groupBy(MST_MFG_ACT_R.$mfg_act_no), actWkL_bldr.getBaseDbc());
			}
		}

		/**
		 * 製造実績ＮＯごとの出来高のマップを取得
		 */
		protected Map<String, MCList<Srch01_YieldRsltR>> getYieldMap() {
			Map<String, MCList<Srch01_YieldRsltR>> ret = new HashMap<String, MCList<Srch01_YieldRsltR>>();
			for (Srch01_YieldRsltR r : Srch01_YieldRslt()) {
				MCList<Srch01_YieldRsltR> lst = ret.get(r.mfg_act_no());
				if (lst == null) {
					lst = MCList.create(Srch01_YieldRsltR.class);
					ret.put(r.mfg_act_no(), lst);
				}
				lst.add(r);
			}
			
			return ret;
		}
		
		protected void editDown(Map<String, MCList<Srch01_YieldRsltR>> yieldMap) {
			for (Srch01_RsltR r : down0()) {
				
				calcOperNum(r);
				calcContQty(r);
				calcContAcxfrNum(r);
				
				MCList<Srch01_YieldRsltR> yL = yieldMap.get(r.mfg_act_no());
				if (!isNull(yL)) {
					MCList<Srch01_YieldRsltR> lotL = yL.groupBy(
							Srch01_YieldRsltR.$lot_no);
					if (lotL.size() == 1) {
						r.par_act_lot_no(lotL.get(0).lot_no());
					}
					
					MCList<Srch01_YieldRsltR> sublotL = yL.groupBy(
							Srch01_YieldRsltR.$lot_no,
							Srch01_YieldRsltR.$sublot_no);
					if (sublotL.size() == 1) {
						r.par_act_sublot_no(sublotL.get(0).sublot_no());
					}
				}
			}
		}
		
		protected void calcOperNum(Srch01_RsltR r) {
			r.oper_unit_schd_qty(convQtyBaseToOper(r.base_unit_oper_schd_qty(),
					r.oper_conv_qty(), r.oper_std_qty(), r.oper_unit_dec_place(),
					r.oper_unit_conv_rnd_typ()));
		}
		
		protected void calcContQty(Srch01_RsltR r) {
			MCNumber contFctr = nvl(r.act_cont_fctr(),r.std_cont_fctr());
			if (isNull(contFctr)) {
				return;
			}
			return ;
		}
		protected void calcContAcxfrNum(Srch01_RsltR r) {
			r.cont_acxfr_act_qty(convToContFctrUnit(r.acxfr_act_qty(),
					nvl(r.act_cont_fctr(),r.std_cont_fctr()), r.cont_fctr_dec_place(),
					r.cont_fctr_rnd_typ()));
		}
	}

	//FMCB CUSTOM END
}