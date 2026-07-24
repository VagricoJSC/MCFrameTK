package mcframe.serverMSBB.MSBBL1400;

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
import mcframe.serverMSBB.MSBBL1400.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBB.MSBBL1400.Query.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsSumSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsSumSrch_MC extends MSBBL_SlsSumSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 部門別に集計して検索する<br>
	 */
	public class Srch01 extends MSBBL_SlsSumSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editCmnCnd(up0());
			mkWk(up0());
			executeQuery(down0(), MSBBL1400_MSW_SLO_SLS_SUM_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			editDown(down0(), up0());
			setDown(down0());
			delWk();
		}

		/**
		 * 売上集計受注ワークを作成する
		 * 
		 * @param cndR 上り電文の検索条件
		 */
		protected void mkWk(CndR cndR) {
			// 指定された部門階層に属する部門ＣＤのリストを取得する
			// 画面で部門ＣＤまで指定された場合は、その部門ＣＤを設定したリストを取得する
			MCList<MAM_DPT_R> dptL = getDptInLvl(cndR);

			mkWk(dptL, cndR);
		}

		/**
		 * 部門階層ＣＤに紐づく部門ＣＤのリストを取得する
		 * 
		 * @param cndR 検索条件
		 * @return 検索結果の部門ＣＤリスト
		 */
		protected MCList<MAM_DPT_R> getDptInLvl(CndR cndR) {
			MCList<MAM_DPT_R> dptL = MCList.create(MAM_DPT_R.class);
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dptL_bldr = MCQueryApiBuilder.create(t);
			MAVM_RD_DPT_R m1 = MAVM_RD_DPT_R.create("M1");
			dptL_bldr.setSelect(t.dpt_cd);
			dptL_bldr.addInnerJoin(m1, bracket(t.dpt_cd.eq(m1.dpt_cd)));
			dptL_bldr.setWhere(t.dpt_lvl_cd.eq(bind("dpt_lvl_cd")));
			dptL_bldr.addWhereWithAnd(bind("base_dt").between(t.st_dt, t.end_dt));
			dptL_bldr.addWhereWithCutOffAnd(t.dpt_cd.like(bind("dpt_cd")));
			dptL_bldr.addWhereWithCutOffAnd(t.dpt_nm.like(bind("dpt_nm")));
			dptL_bldr.addWhereWithAnd(t.sls_dpt_flg.eq(value(true)));
			dbSelect("MSBBL1400_MAM_DPT_S01", dptL, dptL_bldr, cndR);

			return dptL;
		}

		/**
		 * 売上集計受注ワークを登録する。
		 * 
		 * @param dptL
		 * @param cndR
		 */
		protected void mkWk(MCList<MAM_DPT_R> dptL, CndR cndR) {

			MCList<MSW_SLS_SUM_DPT_LVL_R> dptLvlL =
					MCList.create(MSW_SLS_SUM_DPT_LVL_R.class);

			// 指定部門階層の部門毎のループ
			for (MAM_DPT_R dptR : dptL) {
				MSW_SLS_SUM_DPT_LVL_R dptLvlR = MSW_SLS_SUM_DPT_LVL_R.create();
				dptLvlR.ym(cndR.inpt_ym());
				dptLvlR.sls_dpt_cd(dptR.dpt_cd());
				dptLvlR.crnt_dpt_cd(dptR.dpt_cd());
				dptLvlR.dw_dpt_cd(null);
				dptLvlR.lvl(1);
				dptLvlL.add(dptLvlR);
			}

			if (dptLvlL.isEmpty()) {
				return;
			}
			// 売上集計部門階層ワークに登録する
			dbInsertEx("MSBBL1400_MSW_SLS_SUM_DPT_LVL_I01", dptLvlL,
					MCQueryApiBuilder.create(MSW_SLS_SUM_DPT_LVL_R.create("T")));

			// 売上集計受注ワークに登録するためプロシージャを呼び出す
			MCRow inbind = MCRow.create();
			inbind.addDateColumn("I_YM", cndR.inpt_ym());
			inbind.addNumberColumn("I_SLS_DISP_TERM", cndR.sls_disp_term());
			inbind.addStringColumn("I_DPT_LVL_CD", cndR.dpt_lvl_cd());
			inbind.addBooleanColumn("I_USE_ACT_XRATE_FLG", cndR.use_act_xrate_flg());
			inbind.addStringColumn("I_SLS_BDG_GRP", cndR.sls_bdg_grp());
			inbind.addStringColumn("I_XRATE_CD", cndR.xrate_cd());
			
			String procId = "MSPA_SLO_SLS_SUM$P_SLS_SUM_DPT_MAIN";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, inbind, null, 
					":I_YM, :I_SLS_DISP_TERM, :I_DPT_LVL_CD, "
					+ ":I_USE_ACT_XRATE_FLG, :I_SLS_BDG_GRP, :I_XRATE_CD");

		}
		
		/**
		 * 売上集計受注ワークを削除する
		 */
		protected void delWk() {
			execDbWkDelete("MSBBL1400_MSW_SLO_SLS_SUM_D01", MSW_SLO_SLS_SUM_R.create("T"));
			
			execDbWkDelete("MSBBL1400_MSW_SLS_SUM_DPT_LVL_D01", MSW_SLS_SUM_DPT_LVL_R.create("T"));
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 品目体系別に集計して検索する<br>
	 */
	public class Srch02 extends MSBBL_SlsSumSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCmnCnd(up0());
			mkWk(up0());
			executeQuery(down0(), MSBBL1400_MSW_SLO_SLS_SUM_S02(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			editDown(down0(), up0());
			setDown(down0());
			delWk();
		}

		/**
		 * 売上集計受注ワークを作成する
		 * 
		 * @param cndR 上り電文の検索条件
		 */
		protected void mkWk(CndR cndR) {
			// 指定された品目体系階層に属する品目体系ＣＤのリストを取得する
			// 画面で品目体系ＣＤまで指定された場合は、その品目体系ＣＤを設定したリストを取得する
			MCList<MAM_SLS_ITM_GRP_R> itmGrpL = getItmGrpLvl(cndR);

			mkWk(itmGrpL, cndR);
		}

		/**
		 * 品目体系階層に紐づく品目体系ＣＤのリストを取得する
		 * 
		 * @param cndR 検索条件
		 * @return 検索結果の品目体系ＣＤリスト
		 */
		protected MCList<MAM_SLS_ITM_GRP_R> getItmGrpLvl(CndR cndR) {
			MCList<MAM_SLS_ITM_GRP_R> itmGrpL = MCList.create(MAM_SLS_ITM_GRP_R.class);
			MAM_SLS_ITM_GRP_R t = MAM_SLS_ITM_GRP_R.create("T");
			MCQueryApiBuilder itmGrpL_bldr = MCQueryApiBuilder.create(t);
			itmGrpL_bldr.setSelect(t.sls_itm_grp_cd);
			itmGrpL_bldr.setWhere(t.sls_itm_grp_lvl.eq(bind("sls_itm_grp_lvl")));
			itmGrpL_bldr.addWhereWithCutOffAnd(t.sls_itm_grp_cd.like(bind("sls_itm_grp_cd")));
			itmGrpL_bldr.addWhereWithCutOffAnd(t.sls_itm_grp_nm.like(bind("sls_itm_grp_nm")));
			dbSelect("MSBBL1400_MAM_SLS_ITM_GRP_S01", itmGrpL, itmGrpL_bldr, cndR);
			return itmGrpL;
		}

		/**
		 * 売上集計受注ワークを登録する。
		 * 
		 * @param itmGrpL
		 * @param cndR
		 */
		protected void mkWk(MCList<MAM_SLS_ITM_GRP_R> itmGrpL, CndR cndR) {

			MCList<MSW_SLS_SUM_IG_LVL_R> igLvlL =
					MCList.create(MSW_SLS_SUM_IG_LVL_R.class);

			for (MAM_SLS_ITM_GRP_R itmGrpR : itmGrpL) {
				MSW_SLS_SUM_IG_LVL_R igLvlR = MSW_SLS_SUM_IG_LVL_R.create();
				igLvlR.sls_itm_grp_cd(itmGrpR.sls_itm_grp_cd());
				igLvlR.crnt_sls_itm_grp_cd(itmGrpR.sls_itm_grp_cd());
				igLvlR.dw_sls_itm_grp_cd(null);
				igLvlR.lvl(1);
				igLvlL.add(igLvlR);
			}

			if (igLvlL.isEmpty()) {
				return;
			}

			dbInsertEx("MSBBL1400_MSW_SLS_SUM_IG_LVL_I01", igLvlL,
					MCQueryApiBuilder.create(MSW_SLS_SUM_IG_LVL_R.create("T")));

			// 売上集計受注ワークに登録するためプロシージャを呼び出す
			MCRow inbind = MCRow.create();
			inbind.addDateColumn("I_YM", cndR.inpt_ym());
			inbind.addNumberColumn("I_SLS_DISP_TERM", cndR.sls_disp_term());
			inbind.addNumberColumn("I_SLS_ITM_GRP_LVL", cndR.sls_itm_grp_lvl());
			inbind.addBooleanColumn("I_USE_ACT_XRATE_FLG", cndR.use_act_xrate_flg());
			inbind.addStringColumn("I_SLS_BDG_GRP", cndR.sls_bdg_grp());
			inbind.addStringColumn("I_XRATE_CD", cndR.xrate_cd());
			
			String procId = "MSPA_SLO_SLS_SUM$P_SLS_SUM_IG_MAIN";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, inbind, null, 
					":I_YM, :I_SLS_DISP_TERM, :I_SLS_ITM_GRP_LVL, "
					+ ":I_USE_ACT_XRATE_FLG, :I_SLS_BDG_GRP, :I_XRATE_CD");
		}
		
		/**
		 * 売上集計受注ワークを削除する
		 */
		protected void delWk() {
			execDbWkDelete("MSBBL1400_MSW_SLO_SLS_SUM_D02", MSW_SLO_SLS_SUM_R.create("T"));
			
			execDbWkDelete("MSBBL1400_MSW_SLS_SUM_IG_LVL_D01", MSW_SLS_SUM_IG_LVL_R.create("T"));
		}
	}

	/**
	 * 検索条件を編集する
	 * 
	 * @param cndR 上り電文の検索条件
	 */
	protected void editCmnCnd(CndR cndR) {
		cndR.addNumberColumn("upri_dec_place", getBaseCur().upri_dec_place());
		cndR.addNumberColumn("amt_dec_place", getBaseCur().amt_dec_place());
		cndR.addStringColumn("rnd_typ", getCo().xrate_rnd_typ());
		cndR.addNumberColumn("ac_cl_day", getCo().ac_cl_day());
		cndR.addNumberColumn("ac_cl_mon_base", getCo().ac_cl_mon_base());
		cndR.addDateColumn("base_dt", getYmStDt(cndR.inpt_ym()));
	}

	/**
	 * 合計、粗利率、進捗率を設定
	 * @param l 下り電文
	 */
	protected void setDown(MCList<RsltR> l){
		for (RsltR r :l) {
			// 合計
			calcSum(r, RsltR.$sum_qty, RsltR.$slo_bl_qty, RsltR.$sls_qty);
			calcSum(r, RsltR.$sum_amt, RsltR.$slo_bl_amt, RsltR.$sls_amt);
			calcSum(r, RsltR.$sum_prof_amt, RsltR.$slo_bl_prof_amt, RsltR.$sls_prof_amt);

			// 粗利率
			calcRate(r, RsltR.$slo_prof_rate, RsltR.$slo_amt,  RsltR.$slo_prof_amt);
			calcRate(r, RsltR.$slo_bl_prof_rate, RsltR.$slo_bl_amt,  RsltR.$slo_bl_prof_amt);
			calcRate(r, RsltR.$sls_prof_rate, RsltR.$sls_amt,  RsltR.$sls_prof_amt);
			calcRate(r, RsltR.$sum_prof_rate, RsltR.$sum_amt,  RsltR.$sum_prof_amt);
			calcRate(r, RsltR.$bdg_sls_prof_rate, RsltR.$bdg_sls_amt, RsltR.$bdg_sls_prof_amt);

			// 販売計画数量進捗率
			calcRate(r, RsltR.$spln_per_cmpl_slo_qty, RsltR.$spln_qty, RsltR.$slo_qty);
			calcRate(r, RsltR.$spln_per_cmpl_slo_bl_qty, RsltR.$spln_qty, RsltR.$slo_bl_qty);
			calcRate(r, RsltR.$spln_per_cmpl_sls_qty, RsltR.$spln_qty, RsltR.$sls_qty);
			calcRate(r, RsltR.$spln_per_cmpl_sum_qty, RsltR.$spln_qty, RsltR.$sum_qty);
			
			// 販売計画金額進捗率
			calcRate(r, RsltR.$spln_per_cmpl_slo_amt, RsltR.$spln_amt, RsltR.$slo_amt);
			calcRate(r, RsltR.$spln_per_cmpl_slo_bl_amt, RsltR.$spln_amt, RsltR.$slo_bl_amt);
			calcRate(r, RsltR.$spln_per_cmpl_sls_amt, RsltR.$spln_amt, RsltR.$sls_amt);
			calcRate(r, RsltR.$spln_per_cmpl_sum_amt, RsltR.$spln_amt, RsltR.$sum_amt);
			
			// 予算金額進捗率
			calcRate(r, RsltR.$bdg_per_cmpl_slo_amt, RsltR.$bdg_sls_amt, RsltR.$slo_amt);
			calcRate(r, RsltR.$bdg_per_cmpl_slo_bl_amt, RsltR.$bdg_sls_amt, RsltR.$slo_bl_amt);
			calcRate(r, RsltR.$bdg_per_cmpl_sls_amt, RsltR.$bdg_sls_amt, RsltR.$sls_amt);
			calcRate(r, RsltR.$bdg_per_cmpl_sum_amt, RsltR.$bdg_sls_amt, RsltR.$sum_amt);
			
			// 粗利進捗率
			calcRate(r, RsltR.$bdg_per_cmpl_slo_prof_amt, RsltR.$bdg_sls_prof_amt, RsltR.$slo_prof_amt);
			calcRate(r, RsltR.$bdg_per_cmpl_slo_bl_prof_amt, RsltR.$bdg_sls_prof_amt, RsltR.$slo_bl_prof_amt);
			calcRate(r, RsltR.$bdg_per_cmpl_sls_prof_amt, RsltR.$bdg_sls_prof_amt, RsltR.$sls_prof_amt);
			calcRate(r, RsltR.$bdg_per_cmpl_sum_prof_amt, RsltR.$bdg_sls_prof_amt, RsltR.$sum_prof_amt);
			r.rate_dec_place(mcframe.commonMA.meta.MA_META.PER.scale());
		}
	}

	/**
	 * 合計を計算します。
	 * 
	 * @param r ロウ
	 * @param sum_col 合計のカラム
	 * @param slo_col 受注のカラム
	 * @param sls_col 売上のカラム
	 */
	protected void calcSum(RsltR r, String sum_col, String slo_col, String sls_col) {
		MCNumber a1 = r.getNumberNE(slo_col);
		MCNumber a2 = r.getNumberNE(sls_col);
		if (isNull(a1) && isNull(a2)) {
			return;
		}

		if (isNull(a1)) {
			a1 = MCNumber.ZERO;
		}
		if (isNull(a2)) {
			a2 = MCNumber.ZERO;
		}

		r.setNumberNE(sum_col, a1.add(a2));
	}

	/**
	 * #C.RATEメタの百分率を計算します。
	 * 
	 * @param r ロウ
	 * @param rate_col 率のカラム
	 * @param d_col 分母のカラム
	 * @param n_col 分子のカラム
	 */
	protected void calcRate(RsltR r, String rate_col, String d_col, String n_col) {
		MCNumber d = r.getNumberNE(d_col);
		if (isNull(d) || d.isZero()) {
			return;
		}

		MCNumber n = r.getNumberNE(n_col);
		if (isNull(n) || d.isZero()) {
			// 分子がnull、または0の場合は0
			r.setNumberNE(rate_col, MCNumber.ZERO);
			return;
		}

		r.setNumberNE(rate_col, (n.multiply(100)).divide(d
				, mcframe.commonMA.meta.MA_META.PER.scale()
				, MAC_RND_TYP.RNDUP.toMC()));
	}
	
	/**
	 * 集計期間が設定されている場合の下り電文の編集
	 * （例）
	 * 指定年月：2016/04、表示期間：5、集計期間：3の場合、年月を以下のように上書きする
	 * 2016/04→2016/04
	 * 2016/05→2016/04
	 * 2016/06→2016/04
	 * 2016/07→2016/07
	 * 2016/08→2016/07
	 * 
	 * @param l 下り電文（検索結果）
	 * @param cndR 上り電文（検索条件）
	 */
	protected void editDown(MCList<RsltR> l, CndR cndR) {
		// 売上推移表示がオン、かつ、集計期間が設定されている場合、下り電文を編集する
		if (cndR.sls_trnst_disp() && !isNull(cndR.sum_term())) {
			MCNumber sumTerm = cndR.sum_term().isZero() ? MCNumber.ONE : cndR.sum_term();
			MCNumber loopCntDivAndRem[] = cndR.sls_disp_term().divideAndRemainder(sumTerm);
			MCNumber loopCnt = 
					loopCntDivAndRem[0].isZero() || !loopCntDivAndRem[1].isZero() ?
							loopCntDivAndRem[0].add(2) : loopCntDivAndRem[0].add(1);
			MCList<RsltR> rsltL = MCList.create(RsltR.class);
			// 売上表示期間÷集計期間分だけループ
			for (int i = 0; i < loopCnt.intValue(); i++) {
				// 集計期間分だけループ
				for (int j = 0; j < sumTerm.intValue(); j++) {
					// 下り電文から年月が開始年月＋Ｎ月のデータを抜き出す
					MCList<RsltR> list = l.subList(
							RsltR.$ym, cndR.inpt_ym().addMonth(sumTerm.multiply(i)).addMonth(j));
					// 開始年月＋Ｎ月を開始年月に上書き設定する
					list.setValue(RsltR.$ym, cndR.inpt_ym().addMonth(sumTerm.multiply(i)));
					rsltL.addAll(list);
				}
			}
			l.setAll(rsltL);
		}
	}

	//FMCB CUSTOM END
}