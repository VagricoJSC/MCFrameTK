package mcframe.serverMSBH.MSBHL5080;

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
import mcframe.serverMSBH.MSBHL5080.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBH.MSBHL5080.Query.*;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import java.util.ArrayList;
import java.util.List;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_ApSetoffService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_ApSetoffService_MC extends MSBHL_ApSetoffService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ApSetoff_Srch01オペレーション.<p>
	 *
	 * 月次売掛残高・入金・支払照合ヘッダ・支払予定から、指定した相殺先ＣＤ、相殺部門ＣＤ、取引通貨ＣＤの売掛金残高を取得する。<br>
	 */
	public class ApSetoff_Srch01 extends MSBHL_ApSetoffService_MC_A.ApSetoff_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			getEndBal();
			getNotProcBal();
			getSchdAmt();
			calcArBalAmt();
		}

		protected void getEndBal() {
			executeQuery(down0(), MSBHL5080_MST_MLY_AR_BAL_S01(), up0());
		}

		protected void getNotProcBal() {
			executeQuery(down0(), MSBHL5080_MST_RCV_S01(), up0());
		}

		protected void getSchdAmt() {
			executeQuery(down0(), MSBHL5080_MST_PAY_SCHD_S01(), up0());
		}

		protected void calcArBalAmt() {
			down0().ar_bal_amt(
					nvl(down0().end_bal(), MCNumber.ZERO)
					.subtract(nvl(down0().not_proc_bal(), MCNumber.ZERO))
					.subtract(nvl(down0().schd_amt(), MCNumber.ZERO)));
		}
	}
	/**
	 * ApSetoff_Srch03オペレーション.<p>
	 *
	 * 買掛明細に投入された有償支給金額を取得する。<br>
	 */
	public class ApSetoff_Srch03 extends MSBHL_ApSetoffService_MC_A.ApSetoff_Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			insWk();
			getOnrProvVal();
		}

		protected void insWk() {
			MCList<MST_AP_D_R> dbc = MCList.create(MST_AP_D_R.class);
			up0().forEach(r -> dbc.add().ap_d_no(r.ap_d_no()));
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
			dbWkDelete("MSBHL5080_MSW_AP_D_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBHL5080_MSW_AP_D_I01", dbc, dbc_bldr.getBaseDbc());
		}

		protected void getOnrProvVal() {
			executeQuery(down0(), MSBHL5080_MST_PROV_ACT_S01());

			// 仕入を分割して計上すると支給金額が重複して取得されるので仕入数量で案分する
			for (MCList<ApSetoff_Srch03_DtlR> l :down0().groupList(ApSetoff_Srch03_DtlR.$prov_act_no)) {
				if (l.size() > 1) {
					ApSetoff_Srch03_DtlR r = l.get(0);
					FXUCC_Divide.prop(l, r.onr_prov_bal(), r.amt_dec_place().intValue(),
							ApSetoff_Srch03_DtlR.$base_unit_qty, ApSetoff_Srch03_DtlR.$onr_prov_bal);
				}
			}
		}
	}
	/**
	 * ApSetoff_Srch04オペレーション.<p>
	 *
	 * 支給実績・支払実績、有償支給残高から指定した計上年月の有償支給情報を取得する<br>
	 */
	public class ApSetoff_Srch04 extends MSBHL_ApSetoffService_MC_A.ApSetoff_Srch04 {
		protected MCList<ApSetoff_Srch04_DtlR> _rsltL = MCList.create(ApSetoff_Srch04_DtlR.class);
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			setUpTmpCol(up0());

			MCQueryPlan sql = MSBHL5080_MST_PROV_ACT_S02();
			sql.addDynamicSQLInfo(orderBySqlStr());

			searchForDL(sql, up0(), down0(), getGroupByColumns());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			
			//月初残高、当月残高の計算、設定
			setInitEnd();
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up
		 */
		protected void setUpTmpCol(ApSetoff_Srch04_CndR up) {
			// ＤＡＣ有効
			up.addStringColumn("TMP_DAC_VLD_FLG_CUTOFF", toTrueStr(up.dac_vld_flg()));
			
			// 最新計上年月を取得
			MST_ONR_PROV_BAL_R dbc = MST_ONR_PROV_BAL_R.create();
			MST_ONR_PROV_BAL_R t = MST_ONR_PROV_BAL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(max(t.ac_ym).as("ac_ym"));
			dbSelect("MSBHL5080_MST_ONR_PROV_BAL_S01", dbc, dbc_bldr);
			up.addDateColumn("TMP_MAX_AC_YM", dbc.ac_ym());
			
			if (!isNull(up0().ac_ym_fr()) && !isNull(dbc.ac_ym())) {
				if (up0().ac_ym_fr().lt(dbc.ac_ym())) {
					up.addDateColumn("TMP_AC_YM_FR", up0().ac_ym_fr());
				}
				else {
					up.addDateColumn("TMP_AC_YM_FR", dbc.ac_ym().addMonth(-1));
				}
			}
			
			if (up.is_src_payschd_flg()) {
				// 最新計上年月が取得できた時は上りの条件を上書きする
				// （取得できなかった場合は上り電文の日付（支払予定日）を使用する）
				if (!isNull(dbc.ac_ym())) {
					up.ac_ym_fr(dbc.ac_ym().addMonth(2));
					up.ac_ym_to(up.ac_ym_fr());
				}
			}
			up.addNumberColumn("BASE_CUR_AMT_DEC_PLACE", getBaseCur().amt_dec_place());
			up.addStringColumn("XRTE_RND_TYP", getCo().xrate_rnd_typ());
		}

		/**
		 * ソート順の付与
		 * @return
		 */
		protected MCDynamicSQLInfo orderBySqlStr() {
			// ftchGrpColsのカラム＋計上年月をソート順とする
			MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
			
			return when(null).orderBy(ORDERBY,
					pr(ApSetoff_Srch04_DtlR.$asppl_cd).asc(),
					pr(ApSetoff_Srch04_DtlR.$ap_dpt_cd).asc(),
					pr(ApSetoff_Srch04_DtlR.$trd_cur_cd).asc(),
					pr(ApSetoff_Srch04_DtlR.$ac_ym).asc());
		}

		protected boolean isAllZero(ApSetoff_Srch04_DtlR r) {
			return r.init_bal().isZero() && r.onr_prov_amt().isZero()
					&& r.onr_prov_ret_amt().isZero() && r.tax_amt().isZero()
					&& r.setoff_amt().isZero()&& r.setoff_schd_amt().isZero()
					&& r.end_bal().isZero()
					&& r.base_cur_init_bal().isZero()
					&& r.base_cur_onr_prov_amt().isZero()
					&& r.base_cur_onr_prov_ret_amt().isZero()
					&& r.base_cur_tax_amt().isZero() && r.base_cur_setoff_amt().isZero()
					&& r.base_cur_end_bal().isZero();
		}

		protected String[] getGroupByColumns() {
			return new String[] {
					ApSetoff_Srch04_DtlR.$asppl_cd, 
					ApSetoff_Srch04_DtlR.$ap_dpt_cd, 
					ApSetoff_Srch04_DtlR.$trd_cur_cd
			};
		}
		
		protected List<String> getSortColumns() {
			List<String> l = new ArrayList<>();
			for (String col : getGroupByColumns()) {
				l.add(col);
			}
			l.add(ApSetoff_Srch04_DtlR.$ac_ym);
			return l;
		}
		
		protected MCList<ApSetoff_Srch04_DtlR> fillRows(MCList<ApSetoff_Srch04_DtlR> subL) {
			MCDate tgtYm = up0().ac_ym_fr();
			MCDate toYm = up0().ac_ym_to();
			MCList<ApSetoff_Srch04_DtlR> retL = MCList.create(ApSetoff_Srch04_DtlR.class);
			subL.sort(ApSetoff_Srch04_DtlR.$ac_ym);
			while (true) {
				ApSetoff_Srch04_DtlR r = subL.getFirst(ApSetoff_Srch04_DtlR.$ac_ym, tgtYm);
				if (isNull(r)) {
					r = crtfillRow(subL.get(0));
					r.ac_ym(tgtYm);
					retL.add(r);
				}
				if (tgtYm.eq(toYm)) {
					break;
				}
				tgtYm = tgtYm.addMonth(1);
				
			}

			retL.addAll(subL);
			retL.sort(ApSetoff_Srch04_DtlR.$ac_ym);

			return retL;
		}
		
		protected ApSetoff_Srch04_DtlR crtfillRow(ApSetoff_Srch04_DtlR r) {
			ApSetoff_Srch04_DtlR retR = ApSetoff_Srch04_DtlR.create();

			retR.asppl_cd(r.asppl_cd());
			retR.asppl_nm(r.asppl_nm());
			retR.ap_dpt_cd(r.ap_dpt_cd());
			retR.ap_dpt_nm(r.ap_dpt_nm());
			retR.trd_cur_cd(r.trd_cur_cd());
			retR.trd_cur_nm(r.trd_cur_nm());
			retR.trd_cur_amt_dec_place(r.trd_cur_amt_dec_place());
			retR.init_bal(0);
			retR.onr_prov_amt(0);
			retR.onr_prov_ret_amt(0);
			retR.tax_amt(0);
			retR.setoff_amt(0);
			retR.setoff_schd_amt(0);
			retR.end_bal(0);
			retR.base_cur_cd(r.base_cur_cd());
			retR.base_cur_nm(r.base_cur_nm());
			retR.base_cur_amt_dec_place(r.base_cur_amt_dec_place());
			retR.base_cur_init_bal(0);
			retR.base_cur_onr_prov_amt(0);
			retR.base_cur_onr_prov_ret_amt(0);
			retR.base_cur_tax_amt(0);
			retR.base_cur_setoff_amt(0);
			retR.base_cur_setoff_schd_amt(0);
			retR.base_cur_end_bal(0);
			retR.asppl_grp_cd1(r.asppl_grp_cd1());
			retR.asppl_grp_nm1(r.asppl_grp_nm1());
			retR.asppl_grp_cd2(r.asppl_grp_cd2());
			retR.asppl_grp_nm2(r.asppl_grp_nm2());
			retR.asppl_grp_cd3(r.asppl_grp_cd3());
			retR.asppl_grp_nm3(r.asppl_grp_nm3());
			retR.asppl_grp_cd4(r.asppl_grp_cd4());
			retR.asppl_grp_nm4(r.asppl_grp_nm4());
			retR.asppl_grp_cd5(r.asppl_grp_cd5());
			retR.asppl_grp_nm5(r.asppl_grp_nm5());
			retR.asppl_grp_cd6(r.asppl_grp_cd6());
			retR.asppl_grp_nm6(r.asppl_grp_nm6());
			retR.asppl_grp_cd7(r.asppl_grp_cd7());
			retR.asppl_grp_nm7(r.asppl_grp_nm7());
			retR.asppl_grp_cd8(r.asppl_grp_cd8());
			retR.asppl_grp_nm8(r.asppl_grp_nm8());
			retR.asppl_grp_cd9(r.asppl_grp_cd9());
			retR.asppl_grp_nm9(r.asppl_grp_nm9());
			retR.asppl_grp_cd10(r.asppl_grp_cd10());
			retR.asppl_grp_nm10(r.asppl_grp_nm10());

			return retR;
		}

		protected void setInitEnd() {

			// 結果一時保管用
			MCList<ApSetoff_Srch04_DtlR> tmpL = MCList.create(ApSetoff_Srch04_DtlR.class);

			for (MCList<ApSetoff_Srch04_DtlR> subL : down0().groupList(getGroupByColumns())) {

				ApSetoff_Srch04_DtlR prev = null;
				//検索条件ＦＲＯＭ、ＴＯの間で検索結果の存在しない年月にダミー行を挿入する
				MCList<ApSetoff_Srch04_DtlR> tgtL = fillRows(subL);

				MCNumber balAmt = MCNumber.ZERO;
				MCNumber baseBalAmt = MCNumber.ZERO;

				for (int i = 0; i < tgtL.size(); i++) {
					ApSetoff_Srch04_DtlR tgtR = tgtL.get(i);
					if (0 == i) {
						if (!isNull(tgtR.init_bal())) {
							balAmt = tgtR.init_bal();
							baseBalAmt = tgtR.base_cur_init_bal();
						}
					}
					else {
						balAmt = prev.end_bal();
						baseBalAmt = prev.base_cur_end_bal();
					}
					tgtR.init_bal(balAmt);
					tgtR.base_cur_init_bal(baseBalAmt);
					tgtR.end_bal(tgtR.init_bal().add(tgtR.onr_prov_amt())
							.add(tgtR.tax_amt()).add(tgtR.onr_prov_ret_amt())
							.subtract(tgtR.setoff_amt()));
					tgtR.base_cur_end_bal(tgtR.base_cur_init_bal()
							.add(tgtR.base_cur_onr_prov_amt())
							.add(tgtR.base_cur_tax_amt())
							.add(tgtR.base_cur_onr_prov_ret_amt())
							.subtract(tgtR.base_cur_setoff_amt()));
					if (up0().is_src_payschd_flg()) {
						// 支払予定登録からの呼出の場合のみ、相殺予定額を算入させる
						tgtR.end_bal(
							tgtR.end_bal().subtract(tgtR.setoff_schd_amt())
						);
						tgtR.base_cur_end_bal(
							tgtR.base_cur_end_bal().subtract(tgtR.base_cur_setoff_schd_amt())
						);
					}
					tmpL.add(tgtR);
					prev = tgtR;
				}
			}
			
			setDptCols(tmpL);
			
			// 下り電文を設定する
			setDown(tmpL);
		}
		
		protected void setDptCols(MCList<ApSetoff_Srch04_DtlR> tmpL) {
			if (isNull(tmpL)) {
				return ;
			}
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dptDbc_bldr = MCQueryApiBuilder.create(t);
			dptDbc_bldr.setSelect(t.dpt_cd);
			dptDbc_bldr.addSelect(t.dpt_nm);
			FXUCL_MCDbcCacheStEnd<MAM_DPT_R> dptCache = new FXUCL_MCDbcCacheStEnd<>(dptDbc_bldr, tmpL, ApSetoff_Srch04_DtlR.$ap_dpt_cd);
			
			for (ApSetoff_Srch04_DtlR tmpR : tmpL) {
				MAM_DPT_R dptR = dptCache.get(tmpR.ac_ym(), tmpR.ap_dpt_cd());
				if (dptR != null) {
					tmpR.ap_dpt_nm(dptR.dpt_nm());
				}
			}
		}
		
		protected void setDown(MCList<ApSetoff_Srch04_DtlR> tmpL) {
			down0().clear();
			
			//すべての金額が0のデータ、検索期間外のデータは排除する
			for (ApSetoff_Srch04_DtlR r : tmpL) {
				if (isAllZero(r)) {
					continue;
				}
				if (!isNull(up0().ac_ym_fr()) && up0().ac_ym_fr().gt(r.ac_ym())) {
					continue;
				}
				if (!isNull(up0().ap_dpt_nm()) && !isLike(r.ap_dpt_nm(), up0().ap_dpt_nm())) {
					continue;
				}
				
				down0().add(r);
			}
			
			down0().sort(getSortColumns());
		}
		
	}

	//FMCB CUSTOM END
}