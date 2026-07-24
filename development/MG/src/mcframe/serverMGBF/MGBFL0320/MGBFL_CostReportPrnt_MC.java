package mcframe.serverMGBF.MGBFL0320;

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
import mcframe.serverMGBF.MGBFL0320.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonMGBF.MGBFR0010.*;
import mcframe.commonMGBF.MGBFR0020.*;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;
import static mcframe.serverMGBF.MGBFL0320.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_CostReportPrnt"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_CostReportPrnt_MC extends MGBFL_CostReportPrnt_MC_A{
	//FMCB CUSTOM START

	protected static final String GROSS_AVE_UNIT_PRICE_LST = "MGBFR0010";

	protected static final String END_STK_AMT_LST = "MGBFR0020";

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 印刷前のチェックをする。<br>
	 */
	public class Chk01 extends MGBFL_CostReportPrnt_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Prnt02オペレーション.<p>
	 *
	 * 総平均単価一覧を印刷する。<br>
	 */
	public class Prnt02 extends MGBFL_CostReportPrnt_MC_A.Prnt02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// オペレーションの実装

			MCList<GrossAveUnitPriceLstDtlR> data = getPrntData(up0());
			if (data.isEmpty()) {
				return;
			}
			MGBFR_GrossAveUnitPriceLst rs = MGBFR_GrossAveUnitPriceLst.create();
			editPrntData(up0(), rs, data);
			sortPrntData(data);
			execPrnt(rs, data);
		}

		/**
		 * 総平均単価一覧用データ取得処理
		 * @return
		 */
		protected MCList<GrossAveUnitPriceLstDtlR> getPrntData(CndR cnd) {
			if (cnd.no_bp_flg()) cnd.addStringColumn("no_bp_flg_str", "1");
			MCList<GrossAveUnitPriceLstDtlR> data = MCList
					.create(GrossAveUnitPriceLstDtlR.class);
			executeQuery(data, MGBFL0320_MGT_ACC_TOP_S01(), cnd);
			return data;
		}

		/**
		 * 総平均単価一覧用データ編集処理
		 * @param data
		 */
		protected void editPrntData(CndR cnd, MGBFR_GrossAveUnitPriceLst rs,
				MCList<GrossAveUnitPriceLstDtlR> data) {
			//計算対象年月設定
			MGT_ARG_R arg = MGT_ARG_R.create();
			MGT_ARG_R t = MGT_ARG_R.create("T");
			MCQueryApiBuilder arg_bldr = MCQueryApiBuilder.create(t);
			arg_bldr.setSelect(t.st_ym, t.end_ym);
			dbSelectKey("MGBFL0320_MGT_ARG_S01", arg, arg_bldr, cnd);
			data.setDate(GrossAveUnitPriceLstDtlR.$st_ym, arg.st_ym());
			data.setDate(GrossAveUnitPriceLstDtlR.$end_ym, arg.end_ym());

			//出力日設定
			data.setDate(GrossAveUnitPriceLstDtlR.$prnt_dt, MCDate.now());

			//基準通貨、通貨小数部有効桁数設定
			data.setString(GrossAveUnitPriceLstDtlR.$cur_cd, getBaseCur().cur_cd());
			data.setString(GrossAveUnitPriceLstDtlR.$cur_nm, getBaseCur().cur_nm());
			data.setNumber(GrossAveUnitPriceLstDtlR.$upri_dec_place,
					getBaseCur().upri_dec_place());

			//基準数、総平均単価、標準原価を整数部と小数部に分ける
			putNumStr(rs, data, GrossAveUnitPriceLstDtlR.$s_int_qty,
					GrossAveUnitPriceLstDtlR.$s_dec_qty, GrossAveUnitPriceLstDtlR.$qty,
					GrossAveUnitPriceLstDtlR.$unit_dec_place, MAC_RND_TYP.RNDOFF.toMC());
			putNumStr(rs, data, GrossAveUnitPriceLstDtlR.$s_int_amt,
					GrossAveUnitPriceLstDtlR.$s_dec_amt, GrossAveUnitPriceLstDtlR.$amt,
					GrossAveUnitPriceLstDtlR.$upri_dec_place, MAC_RND_TYP.RNDOFF.toMC());
			putNumStr(rs, data, GrossAveUnitPriceLstDtlR.$s_int_std_amt,
					GrossAveUnitPriceLstDtlR.$s_dec_std_amt,
					GrossAveUnitPriceLstDtlR.$std_amt,
					GrossAveUnitPriceLstDtlR.$upri_dec_place, MAC_RND_TYP.RNDOFF.toMC());

			for (GrossAveUnitPriceLstDtlR r : data) {
				//品目ＣＤを表示用に変換
				putPrntItmSub1(r, GrossAveUnitPriceLstDtlR.$itm_sub1_view,
						GrossAveUnitPriceLstDtlR.$itm_sub1_data);
				putPrntItmSub2(r, GrossAveUnitPriceLstDtlR.$itm_sub2_view,
						GrossAveUnitPriceLstDtlR.$itm_sub2_data);
				putPrntItmSub3(r, GrossAveUnitPriceLstDtlR.$itm_sub3_view,
						GrossAveUnitPriceLstDtlR.$itm_sub3_data);

				//ロットＮＯを表示用に変換
				putPrntStr(r, GrossAveUnitPriceLstDtlR.$lot_no_view,
						GrossAveUnitPriceLstDtlR.$lot_no_data);
				putPrntStr(r, GrossAveUnitPriceLstDtlR.$sublot_no_view,
						GrossAveUnitPriceLstDtlR.$sublot_no_data);

				//手配ＮＯを表示用に変換
				putPrntSnoLabel1(r, GrossAveUnitPriceLstDtlR.$sno1_lbl);
				putPrntSnoLabel2(r, GrossAveUnitPriceLstDtlR.$sno2_lbl);
				putPrntSnoLabel3(r, GrossAveUnitPriceLstDtlR.$sno3_lbl);
				putPrntSnoLabel4(r, GrossAveUnitPriceLstDtlR.$sno4_lbl);
				putPrntSno1(r, GrossAveUnitPriceLstDtlR.$sno1_view,
						GrossAveUnitPriceLstDtlR.$sno1_data);
				putPrntSno2(r, GrossAveUnitPriceLstDtlR.$sno2_view,
						GrossAveUnitPriceLstDtlR.$sno2_data);
				putPrntSno3(r, GrossAveUnitPriceLstDtlR.$sno3_view,
						GrossAveUnitPriceLstDtlR.$sno3_data);
				putPrntSno4(r, GrossAveUnitPriceLstDtlR.$sno4_view,
						GrossAveUnitPriceLstDtlR.$sno4_data);

				//定数名設定
				r.asst_typ_nm(MAC_ASST_TYP.get(r.asst_typ()).name(MCSys.user.locale()));
			}
		}

		/**
		 * 総平均単価一覧用データソート処理<br>
		 * ※印刷用データ編集後に実行する。
		 */
		protected void sortPrntData(MCList<GrossAveUnitPriceLstDtlR> data) {
			data.sort(SortType.ASC, GrossAveUnitPriceLstDtlR.$mng_dpt_cd,
					GrossAveUnitPriceLstDtlR.$itm_jnl_cd,
					GrossAveUnitPriceLstDtlR.$asst_typ, GrossAveUnitPriceLstDtlR.$ym,
					GrossAveUnitPriceLstDtlR.$itm_cd,
					GrossAveUnitPriceLstDtlR.$itm_sub1_view,
					GrossAveUnitPriceLstDtlR.$itm_sub2_view,
					GrossAveUnitPriceLstDtlR.$itm_sub3_view,
					GrossAveUnitPriceLstDtlR.$lot_no_view,
					GrossAveUnitPriceLstDtlR.$sublot_no_view,
					GrossAveUnitPriceLstDtlR.$sno1_view,
					GrossAveUnitPriceLstDtlR.$sno2_view,
					GrossAveUnitPriceLstDtlR.$sno3_view,
					GrossAveUnitPriceLstDtlR.$sno4_view);
		}

		/**
		 * 印刷実行
		 */
		protected void execPrnt(MGBFR_GrossAveUnitPriceLst rs,
				MCList<GrossAveUnitPriceLstDtlR> data) {
			// 業務情報設定
			rs.setAppReportNo1(up0().calc_grp_cd());
			rs.setAppReportNo2(up0().calc_no());
			rs.setAppRmrks1(up0().rmrks());
			rs.setAppRmrks2(up0().memo1());
			rs.setAppRmrks3(up0().memo2());
			rs.setAppRmrks4(up0().memo3());
			rs.setLocale(MCSys.user.locale());
			rs.addAll(data);
			MCServerReportManager.request(rs);
		}
	}

	/**
	 * Prnt03オペレーション.<p>
	 *
	 * 月末在庫金額一覧を印刷する。<br>
	 */
	public class Prnt03 extends MGBFL_CostReportPrnt_MC_A.Prnt03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// オペレーションの実装
			MCList<EndStkAmtLstDtlR> data = getPrntData(up0());
			if (data.isEmpty()) {
				return;
			}
			MGBFR_EndStkAmtLst rs = MGBFR_EndStkAmtLst.create();
			editPrntData(up0(), rs, data);
			sortPrntData(data);
			execPrnt(rs, data);
		}

		/**
		 * 月末在庫金額一覧用データ取得処理
		 * @return
		 */
		protected MCList<EndStkAmtLstDtlR> getPrntData(CndR cnd) {
			if (cnd.no_bp_flg()) cnd.addStringColumn("no_bp_flg_str", "1");
			MCList<EndStkAmtLstDtlR> data = MCList.create(EndStkAmtLstDtlR.class);
			executeQuery(data, MGBFL0320_MGT_ACC_TOP_S02(), cnd);
			return data;
		}

		/**
		 * 月末在庫金額一覧用データ編集処理
		 * @param data
		 */
		protected void editPrntData(CndR cnd, MGBFR_EndStkAmtLst rs,
				MCList<EndStkAmtLstDtlR> data) {
			//金額合計の設定
			setSumAmt(data);

			//出力日設定
			data.setDate(EndStkAmtLstDtlR.$prnt_dt, MCDate.now());

			//基準通貨、通貨小数部有効桁数設定
			data.setString(EndStkAmtLstDtlR.$cur_cd, getBaseCur().cur_cd());
			data.setString(EndStkAmtLstDtlR.$cur_nm, getBaseCur().cur_nm());
			data.setNumber(EndStkAmtLstDtlR.$upri_dec_place,
					getBaseCur().upri_dec_place());
			data.setNumber(EndStkAmtLstDtlR.$amt_dec_place, getBaseCur().amt_dec_place());

			for (EndStkAmtLstDtlR r : data) {
				//品目ＣＤを表示用に変換
				putPrntItmSub1(r, EndStkAmtLstDtlR.$itm_sub1_view,
						EndStkAmtLstDtlR.$itm_sub1_data);
				putPrntItmSub2(r, EndStkAmtLstDtlR.$itm_sub2_view,
						EndStkAmtLstDtlR.$itm_sub2_data);
				putPrntItmSub3(r, EndStkAmtLstDtlR.$itm_sub3_view,
						EndStkAmtLstDtlR.$itm_sub3_data);

				//ロットＮＯを表示用に変換
				putPrntStr(r, EndStkAmtLstDtlR.$lot_no_view,
						EndStkAmtLstDtlR.$lot_no_data);
				putPrntStr(r, EndStkAmtLstDtlR.$sublot_no_view,
						EndStkAmtLstDtlR.$sublot_no_data);

				//手配ＮＯを表示用に変換
				putPrntSnoLabel1(r, EndStkAmtLstDtlR.$sno1_lbl);
				putPrntSnoLabel2(r, EndStkAmtLstDtlR.$sno2_lbl);
				putPrntSnoLabel3(r, EndStkAmtLstDtlR.$sno3_lbl);
				putPrntSnoLabel4(r, EndStkAmtLstDtlR.$sno4_lbl);
				putPrntSno1(r, EndStkAmtLstDtlR.$sno1_view, EndStkAmtLstDtlR.$sno1_data);
				putPrntSno2(r, EndStkAmtLstDtlR.$sno2_view, EndStkAmtLstDtlR.$sno2_data);
				putPrntSno3(r, EndStkAmtLstDtlR.$sno3_view, EndStkAmtLstDtlR.$sno3_data);
				putPrntSno4(r, EndStkAmtLstDtlR.$sno4_view, EndStkAmtLstDtlR.$sno4_data);

				//定数名設定
				r.asst_typ_nm(MAC_ASST_TYP.get(r.asst_typ()).name(MCSys.user.locale()));

				//容積単価・重量単価・入り目単価設定
				int scale;
				if (!isNull(r.dim_qty()) && !r.dim_qty().isZero()) {
					scale = !isNull(r.dim_unit_dec_place())
							? r.dim_unit_dec_place().intValue() : 2;
					r.dim_amt(r.amt().divide(r.dim_qty(), scale,
							MAC_RND_TYP.RNDOFF.toMC()));
				}
				if (!isNull(r.wt_qty()) && !r.wt_qty().isZero()) {
					scale = !isNull(r.wt_unit_dec_place())
							? r.wt_unit_dec_place().intValue() : 2;
					r.wt_amt(
							r.amt().divide(r.wt_qty(), scale, MAC_RND_TYP.RNDOFF.toMC()));
				}
				if (!isNull(r.conts_qty()) && !r.conts_qty().isZero()) {
					scale = !isNull(r.conts_unit_dec_place())
							? r.conts_unit_dec_place().intValue() : 2;
					r.conts_amt(r.amt().divide(r.conts_qty(), scale,
							MAC_RND_TYP.RNDOFF.toMC()));
				}
			}

			//金額合計、数量、容積、重量、入り目、金額、総平均単価、標準原価を
			//整数部と小数部に分ける
			putNumStr(rs, data, EndStkAmtLstDtlR.$s_sum_amt, EndStkAmtLstDtlR.$sum_amt,
					EndStkAmtLstDtlR.$amt_dec_place, MAC_RND_TYP.RNDOFF.toMC());
			putNumStr(rs, data, EndStkAmtLstDtlR.$s_int_qty, EndStkAmtLstDtlR.$s_dec_qty,
					EndStkAmtLstDtlR.$qty, EndStkAmtLstDtlR.$unit_dec_place,
					MAC_RND_TYP.RNDOFF.toMC());
			putNumStr(rs, data, EndStkAmtLstDtlR.$s_int_amt, EndStkAmtLstDtlR.$s_dec_amt,
					EndStkAmtLstDtlR.$amt, EndStkAmtLstDtlR.$amt_dec_place,
					MAC_RND_TYP.RNDOFF.toMC());
			putNumStr(rs, data, EndStkAmtLstDtlR.$s_int_ave_amt,
					EndStkAmtLstDtlR.$s_dec_ave_amt, EndStkAmtLstDtlR.$ave_amt,
					EndStkAmtLstDtlR.$upri_dec_place, MAC_RND_TYP.RNDOFF.toMC());
			putNumStr(rs, data, EndStkAmtLstDtlR.$s_int_std_amt,
					EndStkAmtLstDtlR.$s_dec_std_amt, EndStkAmtLstDtlR.$std_amt,
					EndStkAmtLstDtlR.$upri_dec_place, MAC_RND_TYP.RNDOFF.toMC());
			putNumStr(rs, data, EndStkAmtLstDtlR.$s_int_dim_qty,
					EndStkAmtLstDtlR.$s_dec_dim_qty, EndStkAmtLstDtlR.$dim_qty,
					EndStkAmtLstDtlR.$dim_unit_dec_place, MAC_RND_TYP.RNDOFF.toMC());
			putNumStr(rs, data, EndStkAmtLstDtlR.$s_int_wt_qty,
					EndStkAmtLstDtlR.$s_dec_wt_qty, EndStkAmtLstDtlR.$wt_qty,
					EndStkAmtLstDtlR.$wt_unit_dec_place, MAC_RND_TYP.RNDOFF.toMC());
			putNumStr(rs, data, EndStkAmtLstDtlR.$s_int_conts_qty,
					EndStkAmtLstDtlR.$s_dec_conts_qty, EndStkAmtLstDtlR.$conts_qty,
					EndStkAmtLstDtlR.$conts_unit_dec_place, MAC_RND_TYP.RNDOFF.toMC());
			putNumStr(rs, data, EndStkAmtLstDtlR.$s_int_dim_amt,
					EndStkAmtLstDtlR.$s_dec_dim_amt, EndStkAmtLstDtlR.$dim_amt,
					EndStkAmtLstDtlR.$upri_dec_place, MAC_RND_TYP.RNDOFF.toMC());
			putNumStr(rs, data, EndStkAmtLstDtlR.$s_int_wt_amt,
					EndStkAmtLstDtlR.$s_dec_wt_amt, EndStkAmtLstDtlR.$wt_amt,
					EndStkAmtLstDtlR.$upri_dec_place, MAC_RND_TYP.RNDOFF.toMC());
			putNumStr(rs, data, EndStkAmtLstDtlR.$s_int_conts_amt,
					EndStkAmtLstDtlR.$s_dec_conts_amt, EndStkAmtLstDtlR.$conts_amt,
					EndStkAmtLstDtlR.$upri_dec_place, MAC_RND_TYP.RNDOFF.toMC());
		}

		protected void setSumAmt(MCList<EndStkAmtLstDtlR> data) {
			String[] grpCols = new String[] {
					EndStkAmtLstDtlR.$ym, EndStkAmtLstDtlR.$mng_dpt_cd,
					EndStkAmtLstDtlR.$itm_jnl_cd, EndStkAmtLstDtlR.$asst_typ,
					EndStkAmtLstDtlR.$bp_cd
			};

			MCGroupByPolicy policy = new MCGroupByPolicy(grpCols);
			policy.sum(EndStkAmtLstDtlR.$amt);

			MCIndexKey idx = data.createIndex(grpCols);
			for (EndStkAmtLstDtlR r : data.groupBy(policy)) {
				data.subList(idx, r.ym(), r.mng_dpt_cd(), r.itm_jnl_cd(), r.asst_typ(),
						r.bp_cd()).setNumber(EndStkAmtLstDtlR.$sum_amt, r.amt());
			}
		}

		/**
		 * 月末在庫金額一覧用データソート処理<br>
		 * ※印刷用データ編集後に実行する。
		 */
		protected void sortPrntData(MCList<EndStkAmtLstDtlR> data) {
			data.sort(SortType.ASC, EndStkAmtLstDtlR.$ym, EndStkAmtLstDtlR.$mng_dpt_cd,
					EndStkAmtLstDtlR.$itm_jnl_cd, EndStkAmtLstDtlR.$asst_typ,
					EndStkAmtLstDtlR.$bp_cd, EndStkAmtLstDtlR.$itm_cd,
					EndStkAmtLstDtlR.$lot_no_view, EndStkAmtLstDtlR.$sublot_no_view,
					EndStkAmtLstDtlR.$sno1_view, EndStkAmtLstDtlR.$sno2_view,
					EndStkAmtLstDtlR.$sno3_view, EndStkAmtLstDtlR.$sno4_view);
		}

		/**
		 * 印刷実行
		 */
		protected void execPrnt(MGBFR_EndStkAmtLst rs, MCList<EndStkAmtLstDtlR> data) {
			// 業務情報設定
			rs.setAppReportNo1(up0().calc_grp_cd());
			rs.setAppReportNo2(up0().calc_no());
			rs.setAppRmrks1(up0().rmrks());
			rs.setAppRmrks2(up0().memo1());
			rs.setAppRmrks3(up0().memo2());
			rs.setAppRmrks4(up0().memo3());
			rs.setLocale(MCSys.user.locale());
			rs.addAll(data);
			MCServerReportManager.request(rs);
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 原価帳票を印刷する。<br>
	 */
	public class Prnt01 extends MGBFL_CostReportPrnt_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			prnt();
		}

		protected void editUp() {
			setGrpFlg(up0(), "itm_grp");
			setGrpFlg(up0(), "bp_grp");
		}

		protected void prnt() {
			for (DtlR r : up1()) {
				//メモ設定
				up0().memo1(r.memo1());
				up0().memo2(r.memo2());
				up0().memo3(r.memo3());

				if (isSame(r.report_id(), GROSS_AVE_UNIT_PRICE_LST)) {
					prntGrossAveUnitPriceLst(up0());
				}
				else if (isSame(r.report_id(), END_STK_AMT_LST)) {
					prntEndStkAmtList(up0());
				}
			}
		}

		protected void prntGrossAveUnitPriceLst(CndR cnd) {
			MGBFL_CostReportPrnt.Prnt02 o = crtPrnt02();
			o.up0().setByName(cnd);
			o.exec();
		}

		protected void prntEndStkAmtList(CndR cnd) {
			MGBFL_CostReportPrnt.Prnt03 o = crtPrnt03();
			o.up0().setByName(cnd);
			o.exec();
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価計算情報を検索する。<br>
	 */
	public class Srch01 extends MGBFL_CostReportPrnt_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			int cnt = selectArg();
			if (cnt < 1) {
				return;
			}

			if (selectCostReport() < 1) {
				down0().clear();
				return;
			}

			editDown();
		}

		/**
		 * 原価計算情報検索
		 * @return 検索件数
		 */
		protected int selectArg() {
			MAM_CALC_GRP_R m = MAM_CALC_GRP_R.create("M");

			MGT_ARG_R d0 = down0();
			MGT_ARG_R t= MGT_ARG_R.create("T");
			MCQueryApiBuilder d0_bldr = MCQueryApiBuilder.create(t);
			d0_bldr.addSelect(m.calc_grp_nm);
			d0_bldr.addLeftOuterJoin(m, bracket( t.calc_grp_cd.eq(m.calc_grp_cd)));
			return dbSelectKey("MGBFL0320_MGT_ARG_S02", d0, d0_bldr, up0());
		}

		/**
		 * 原価帳票検索
		 * @return 検索件数
		 */
		protected int selectCostReport() {
			MCList<MAM_COST_REPORT_R> dbc = MCList.create(MAM_COST_REPORT_R.class);
			MAM_COST_REPORT_R t = MAM_COST_REPORT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.calc_grp_cd.eq(bind("calc_grp_cd")));
			int cnt = dbSelect("MGBFL0320_MAM_COST_REPORT_S01", dbc, dbc_bldr, up0());
			down1().addAllByName(dbc);
			return cnt;
		}

		/**
		 * 下り電文加工
		 */
		protected void editDown() {
			down1().forEach(dr -> {
				dr.report_nm(MCConst.repotlbl
						.getString(MCConst.createKey("MG", dr.report_id(), "label")));
			});
		}
	}

	//FMCB CUSTOM END
}