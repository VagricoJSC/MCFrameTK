package mcframe.serverMSBH.MSBHL0050;

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
import mcframe.serverMSBH.MSBHL0050.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBH.MSBHL0050.Query.*;
import mcframe.serverMSBH.MSBHL5090.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_PaySchdSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_PaySchdSrch_MC extends MSBHL_PaySchdSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支払予定を検索する（支払照合ヘッダ単位）<br>
	 */
	public class Srch01 extends MSBHL_PaySchdSrch_MC_A.Srch01 {

		/**
		 * ヘッダ作成用グループ配列
		 */
		protected String[] _grpCols;
		/**
		 * 検索SQL用グループ配列
		 */
		protected String[] _grpColsForSrch;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initSearch() {
			super.initSearch();
			
			setUpTmpCol(up0());
			setGrpCols();
			setGrpColsForSrch();
		}

		/**
		 * 集計グループ配列作成
		 */
		protected void setGrpCols() {
			java.util.List<String> grpCols = new java.util.ArrayList<>();
			// ヘッダ項目
			grpCols.add(Srch01_RsltR.$bsppl_dpt_cd);
			grpCols.add(Srch01_RsltR.$bsppl_dpt_nm);
			grpCols.add(Srch01_RsltR.$wg_cd);
			grpCols.add(Srch01_RsltR.$bsppl_cd);
			grpCols.add(Srch01_RsltR.$bsppl_cl_ym);
			grpCols.add(Srch01_RsltR.$bsppl_cl_day);
			grpCols.add(Srch01_RsltR.$trd_cur_cd);
			grpCols.add(Srch01_RsltR.$pay_xrate);
			grpCols.add(Srch01_RsltR.$pay_chk_no);
			grpCols.add(Srch01_RsltR.$rcpt_iv_no);
			grpCols.add(Srch01_RsltR.$rcpt_iv_mng_no);
			grpCols.add(Srch01_RsltR.$purc_act_no);
			grpCols.add(Srch01_RsltR.$wrk_no);
			grpCols.add(Srch01_RsltR.$wrk_nm);
			grpCols.add(Srch01_RsltR.$psppl_cd);
			grpCols.add(Srch01_RsltR.$pay_sts_typ);
			grpCols.add(Srch01_RsltR.$aprv_no);
			grpCols.add(Srch01_RsltR.$aprv_sts_typ);
			grpCols.add(Srch01_RsltR.$aprv_flg);
			// 支払予定管理先分類
			if (up0().bsppl_grp_flg1()) {
				grpCols.add(Srch01_RsltR.$bsppl_grp_cd1);
				grpCols.add(Srch01_RsltR.$bsppl_grp_nm1);
			}
			if (up0().bsppl_grp_flg2()) {
				grpCols.add(Srch01_RsltR.$bsppl_grp_cd2);
				grpCols.add(Srch01_RsltR.$bsppl_grp_nm2);
			}
			if (up0().bsppl_grp_flg3()) {
				grpCols.add(Srch01_RsltR.$bsppl_grp_cd3);
				grpCols.add(Srch01_RsltR.$bsppl_grp_nm3);
			}
			if (up0().bsppl_grp_flg4()) {
				grpCols.add(Srch01_RsltR.$bsppl_grp_cd4);
				grpCols.add(Srch01_RsltR.$bsppl_grp_nm4);
			}
			if (up0().bsppl_grp_flg5()) {
				grpCols.add(Srch01_RsltR.$bsppl_grp_cd5);
				grpCols.add(Srch01_RsltR.$bsppl_grp_nm5);
			}
			if (up0().bsppl_grp_flg6()) {
				grpCols.add(Srch01_RsltR.$bsppl_grp_cd6);
				grpCols.add(Srch01_RsltR.$bsppl_grp_nm6);
			}
			if (up0().bsppl_grp_flg7()) {
				grpCols.add(Srch01_RsltR.$bsppl_grp_cd7);
				grpCols.add(Srch01_RsltR.$bsppl_grp_nm7);
			}
			if (up0().bsppl_grp_flg8()) {
				grpCols.add(Srch01_RsltR.$bsppl_grp_cd8);
				grpCols.add(Srch01_RsltR.$bsppl_grp_nm8);
			}
			if (up0().bsppl_grp_flg9()) {
				grpCols.add(Srch01_RsltR.$bsppl_grp_cd9);
				grpCols.add(Srch01_RsltR.$bsppl_grp_nm9);
			}
			if (up0().bsppl_grp_flg10()) {
				grpCols.add(Srch01_RsltR.$bsppl_grp_cd10);
				grpCols.add(Srch01_RsltR.$bsppl_grp_nm10);
			}
			// 支払先分類
			if (up0().psppl_grp_flg1()) {
				grpCols.add(Srch01_RsltR.$psppl_grp_cd1);
				grpCols.add(Srch01_RsltR.$psppl_grp_nm1);
			}
			if (up0().psppl_grp_flg2()) {
				grpCols.add(Srch01_RsltR.$psppl_grp_cd2);
				grpCols.add(Srch01_RsltR.$psppl_grp_nm2);
			}
			if (up0().psppl_grp_flg3()) {
				grpCols.add(Srch01_RsltR.$psppl_grp_cd3);
				grpCols.add(Srch01_RsltR.$psppl_grp_nm3);
			}
			if (up0().psppl_grp_flg4()) {
				grpCols.add(Srch01_RsltR.$psppl_grp_cd4);
				grpCols.add(Srch01_RsltR.$psppl_grp_nm4);
			}
			if (up0().psppl_grp_flg5()) {
				grpCols.add(Srch01_RsltR.$psppl_grp_cd5);
				grpCols.add(Srch01_RsltR.$psppl_grp_nm5);
			}
			if (up0().psppl_grp_flg6()) {
				grpCols.add(Srch01_RsltR.$psppl_grp_cd6);
				grpCols.add(Srch01_RsltR.$psppl_grp_nm6);
			}
			if (up0().psppl_grp_flg7()) {
				grpCols.add(Srch01_RsltR.$psppl_grp_cd7);
				grpCols.add(Srch01_RsltR.$psppl_grp_nm7);
			}
			if (up0().psppl_grp_flg8()) {
				grpCols.add(Srch01_RsltR.$psppl_grp_cd8);
				grpCols.add(Srch01_RsltR.$psppl_grp_nm8);
			}
			if (up0().psppl_grp_flg9()) {
				grpCols.add(Srch01_RsltR.$psppl_grp_cd9);
				grpCols.add(Srch01_RsltR.$psppl_grp_nm9);
			}
			if (up0().psppl_grp_flg10()) {
				grpCols.add(Srch01_RsltR.$psppl_grp_cd10);
				grpCols.add(Srch01_RsltR.$psppl_grp_nm10);
			}
			_grpCols = grpCols.toArray(new String[grpCols.size()]);
		}

		/**
		 * 検索SQL用グループ配列作成
		 */
		protected void setGrpColsForSrch() {
			java.util.List<String> grpColsForSrch = new java.util.ArrayList<>();
			grpColsForSrch.add(Srch01_RsltR.$bsppl_dpt_cd);
			grpColsForSrch.add(Srch01_RsltR.$bsppl_dpt_nm);
			grpColsForSrch.add(Srch01_RsltR.$wg_cd);
			grpColsForSrch.add(Srch01_RsltR.$bsppl_cd);
			grpColsForSrch.add(Srch01_RsltR.$bsppl_cl_ym);
			grpColsForSrch.add(Srch01_RsltR.$bsppl_cl_day);
			grpColsForSrch.add(Srch01_RsltR.$trd_cur_cd);
			grpColsForSrch.add(Srch01_RsltR.$pay_chk_no);
			grpColsForSrch.add(Srch01_RsltR.$wrk_no);
			_grpColsForSrch = grpColsForSrch.toArray(new String[grpColsForSrch.size()]);
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan sql = MSBHL0050_MST_PAY_SCHD_S01();
			sql.addDynamicSQLInfo(orderBySqlStr());
			searchForDL(sql, up0(), down0(), _grpColsForSrch);
		}
		
		/**
		 * @return ORDER BY句
		 */
		protected MCDynamicSQLInfo orderBySqlStr() {
			MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
			
			MCOrder[] ord = new MCOrder[_grpColsForSrch.length];
			for (int i = 0; i < _grpColsForSrch.length; i++) {
				ord[i] = pr(_grpColsForSrch[i]).asc();
			}
			return when(null).orderBy(ORDERBY, ord);
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			
			// 手数料を結果に含まない場合は、手数料行を結果から除く
			if (!up0().inc_com_paid_flg()) {
				MCList<Srch01_RsltR> subL = down0().createInstance();
				subL = down0().subList(new ExceptComPaidMatcher());
				down0().setAll(subL);
			}
			
			MCList<Srch01_RsltR> down0Group = groupSortDown0();

			MCList<Srch01_RsltR> rsltL = down0().createInstance();
			MCIndexKey ik = down0().createIndex(_grpCols);

			for (Srch01_RsltR r : down0Group) {
				MCList<Srch01_RsltR> down0SubL  = down0().subList(ik, r.toArray(_grpCols));
				down0SubL.sort(getSortPolicyDtl());

				// 明細行作成
				MCList<Srch01_RsltR> subL = createSubList(down0SubL);
				// ヘッダ行作成・追加
				MCList<Srch01_RsltR> exceptComPaiL = subL.subList(new ExceptComPaidMatcher());
				if (!exceptComPaiL.isEmpty()) {
					r.pay_schd_amt(exceptComPaiL.sum(Srch01_RsltR.$pay_schd_amt));
					r.pay_act_amt(exceptComPaiL.sum(Srch01_RsltR.$pay_act_amt));
					if (!isNull(r.pay_schd_amt()) && !isNull(r.pay_act_amt())) {
						r.not_appl_bal(r.pay_schd_amt().subtract(r.pay_act_amt()));
					}
					rsltL.add(r);

					//内訳表示ＦＬＧで明細行を追加するか決める
					if (up0().dtl_flg()) {
						rsltL.addAll(subL);
						rsltL.add(); //空行を追加
					}
				}
			}
			down0().setAll(rsltL);
			// 補完
			setValuesDbc(up0(), down0());
		}
		
		/**
		 * 下り電文を明示的にソート
		 */
		protected MCList<Srch01_RsltR> groupSortDown0() {
			MCList<Srch01_RsltR> down0Group = down0().groupBy(_grpCols);
			down0Group.sort(_grpColsForSrch);
			return down0Group;
		}
		
		/**
		 * @return 明細行のソートポリシー
		 */
		protected MCSortPolicy getSortPolicyDtl() {
			MCSortPolicy sortPolicy = new MCSortPolicy();
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$pay_schd_act_dt);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$act_flg);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$ap_sttl_cd);
			sortPolicy.add(SortType.DESC, Srch01_RsltR.$pay_schd_amt);
			
			return sortPolicy;
		}
		
		/**
		 * 金額と遅延の設定
		 */
		protected MCList<Srch01_RsltR> createSubList(MCList<Srch01_RsltR> down0SubL) {
			// 金額挿入済み明細行
			MCList<Srch01_RsltR> amtRsltL = down0().createInstance();
			// 予定残高
			MCNumber notApplBal = MCNumber.ZERO;
			// 前回処理行
			Srch01_RsltR preR = Srch01_RsltR.create(); 
			// 処理対象行の「支払予定日／実績日」より過去日かつ直近の日付時点の予定残高
			MCNumber preNotApplBal = MCNumber.ZERO;
			
			// 予定残高算出 & 遅延の発生する日付保持
			for (Srch01_RsltR amtR : down0SubL) {
				if (MAC_AP_STTL_TYP.is_com_paid(amtR.ap_sttl_typ())) {
					// 手数料行の場合は金額がnullまたは0であっても表示
					amtRsltL.add(amtR);
				}
				else {
					// 手数料行でない場合は、残高と遅延を設定する
					// 処理対象行の残高を算出する
					MCNumber paySchdAmt = nvl(amtR.pay_schd_amt(), MCNumber.ZERO);
					MCNumber payActAmt = nvl(amtR.pay_act_amt(), MCNumber.ZERO);
					payActAmt = payActAmt.negate();
					notApplBal = MCNumber.sum(notApplBal, paySchdAmt).add(payActAmt);
					amtR.not_appl_bal(notApplBal);	
					
					// 遅延設定
					if (!isNull(up0().rfrnc_dt()) && !isNull(amtR.pay_schd_act_dt()) && amtR.pay_schd_act_dt().lt(up0().rfrnc_dt())) {
						if (!isSame(preR.pay_schd_act_dt(), amtR.pay_schd_act_dt())) {
							preNotApplBal = nvl(preR.not_appl_bal(), MCNumber.ZERO);
						}
						
						MCList<Srch01_RsltR> subL = down0SubL.subList(new MCRowMatcher<Srch01_RsltR>() {
							@Override
							public boolean match(Srch01_RsltR row) {
								if (MAC_AP_STTL_TYP.is_com_paid(row.ap_sttl_typ())) {
									return false;
								}
								if (!isSame(row.pay_schd_act_dt(), amtR.pay_schd_act_dt())) {
									return false;
								}
								return true;
							}
						});
						
						MCNumber sumPaySchdAmt = nvl(subL.sum(Srch01_RsltR.$pay_schd_amt),MCNumber.ZERO);
						MCNumber sumPayActAmt = nvl(subL.sum(Srch01_RsltR.$pay_act_amt), MCNumber.ZERO);
						MCNumber sumNotApplBal = nvl(preNotApplBal, MCNumber.ZERO).add(sumPaySchdAmt);
						
						sumPayActAmt = sumPayActAmt.negate();
						sumNotApplBal = sumNotApplBal.add(sumPayActAmt);
						
						if (sumNotApplBal.gt(0)) {
							amtR.delay(MSC_DLY_MRK.CIRCLE.name());
						}
					}
					
					// 支払予定額、支払実績額、予定残高のいずれかが０でない場合、下り電文に設定する。
					if(!((isNull(amtR.pay_schd_amt()) || amtR.pay_schd_amt().isZero()) 
							&& (isNull(amtR.pay_act_amt()) || amtR.pay_act_amt().isZero()) 
							&& (isNull(amtR.not_appl_bal()) || amtR.not_appl_bal().isZero()))){
						amtRsltL.add(amtR);
					}
					
					preR = amtR;
				}
			}
			return amtRsltL;
		}
		
		public class ExceptComPaidMatcher implements MCRowMatcher<Srch01_RsltR> {
			@Override
			public boolean match(Srch01_RsltR row) {
				if (MAC_AP_STTL_TYP.is_com_paid(row.ap_sttl_typ())) {
					return false;
				}
				return true;
			}
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 支払予定表を発行する<br>
	 */
	public class Prnt01 extends MSBHL_PaySchdSrch_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MSBHL_ApPrntService.ApPrnt_Prnt01 ope = MSBHL_ApPrntService.crtApPrnt_Prnt01();
			addAll(ope.up0(), up0(), createMap_ApPrnt_Prnt01_HdrR_Srch01_RsltR());
			ope.exec();
		}
		
		protected Map_ApPrnt_Prnt01_HdrR_Srch01_RsltR<ApPrnt_Prnt01_HdrR,Srch01_RsltR> createMap_ApPrnt_Prnt01_HdrR_Srch01_RsltR() {
			return new Map_ApPrnt_Prnt01_HdrR_Srch01_RsltR<ApPrnt_Prnt01_HdrR, Srch01_RsltR>();
		}

		public class Map_ApPrnt_Prnt01_HdrR_Srch01_RsltR<D extends ApPrnt_Prnt01_HdrR, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ApPrnt_Prnt01_HdrR.$pay_schd_no, Srch01_RsltR.$pay_schd_no);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 支払予定を検索する<br>
	 */
	public class Srch02 extends MSBHL_PaySchdSrch_MC_A.Srch02 {

		/**
		 * 集計グループ配列
		 */
		protected String[] _grpCols;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initSearch() {
			super.initSearch();
			
			setUpTmpCol(up0());
			setGrpCols();
		}

		/**
		 * 集計グループ配列作成
		 */
		protected void setGrpCols() {
			java.util.List<String> grpCols = new java.util.ArrayList<>();
			if (isAggregateAll()) {
				grpCols.add(Srch02_RsltR.$pay_chk_no);
			}
			else {
				if (up0().bsppl_dpt_cd_flg()) {
					grpCols.add(Srch02_RsltR.$bsppl_dpt_cd);	
				}
				if (up0().bsppl_dpt_nm_flg()) {
					grpCols.add(Srch02_RsltR.$bsppl_dpt_nm);
				}
				if (up0().wg_cd_flg()) {
					grpCols.add(Srch02_RsltR.$wg_cd);
				}
				if (up0().bsppl_cd_flg()) {
					grpCols.add(Srch02_RsltR.$bsppl_cd);
				}
				if (up0().trd_cur_cd_flg()) {
					grpCols.add(Srch02_RsltR.$trd_cur_cd);
				}
				if (up0().wrk_no_flg()) {
					grpCols.add(Srch02_RsltR.$wrk_no);
				}
				if (up0().pay_schd_dt_flg()) {
					grpCols.add(Srch02_RsltR.$pay_schd_dt);
				}
				if (up0().ap_sttl_cd_flg()) {
					grpCols.add(Srch02_RsltR.$ap_sttl_cd);
				}
				if (up0().pay_chk_no_flg()) {
					grpCols.add(Srch02_RsltR.$pay_chk_no);
				}
				if (up0().pay_schd_no_flg()) {
					grpCols.add(Srch02_RsltR.$pay_schd_no);
					grpCols.add(Srch02_RsltR.$sw_flg);
				}
				if (up0().ap_sttl_typ_flg()) {
					grpCols.add(Srch02_RsltR.$ap_sttl_typ);
				}
				if (up0().ap_typ_flg()) {
					grpCols.add(Srch02_RsltR.$ap_typ);
				}
				if (up0().bsppl_cl_ym_flg()) {
					grpCols.add(Srch02_RsltR.$bsppl_cl_ym);	
				}
				if (up0().bsppl_cl_day_flg()) {
					grpCols.add(Srch02_RsltR.$bsppl_cl_day);	
				}
				if (up0().rcpt_iv_no_flg()) {
					grpCols.add(Srch02_RsltR.$rcpt_iv_no);
				}
				if (up0().rcpt_iv_mng_no_flg()) {
					grpCols.add(Srch02_RsltR.$rcpt_iv_mng_no);
				}
				if (up0().purc_act_no_flg()) {
					grpCols.add(Srch02_RsltR.$purc_act_no);
				}
				if (up0().psppl_cd_flg()) {
					grpCols.add(Srch02_RsltR.$psppl_cd);
				}
				if (up0().pay_dpt_cd_flg()) {
					grpCols.add(Srch02_RsltR.$pay_dpt_cd);
				}
				if (up0().pay_dpt_nm_flg()) {
					grpCols.add(Srch02_RsltR.$pay_dpt_nm);
				}
				if (up0().asppl_cd_flg()) {
					grpCols.add(Srch02_RsltR.$asppl_cd);
				}
				if (up0().pay_sts_typ_flg()) {
					grpCols.add(Srch02_RsltR.$pay_sts_typ);
				}
				if (up0().ap_dpt_cd_flg()) {
					grpCols.add(Srch02_RsltR.$ap_dpt_cd);
				}
				if (up0().ap_dpt_nm_flg()) {
					grpCols.add(Srch02_RsltR.$ap_dpt_nm);
				}
				if (up0().pay_bank_ac_cd_flg()) {
					grpCols.add(Srch02_RsltR.$pay_bank_ac_cd);
				}
				if (up0().bank_ac_cd_flg()) {
					grpCols.add(Srch02_RsltR.$bank_ac_cd);
				}
				if (up0().setoff_info_flg()) {
					grpCols.add(Srch02_RsltR.$ap_setoff_typ);
					grpCols.add(Srch02_RsltR.$setoff_cd);
					grpCols.add(Srch02_RsltR.$so_dpt_cd);
					grpCols.add(Srch02_RsltR.$so_dpt_nm);
				}
				if (up0().xrate_flg()) {
					grpCols.add(Srch02_RsltR.$xrate);
				}
				if (up0().com_paid_tax_cd_flg()) {
					grpCols.add(Srch02_RsltR.$com_paid_tax_cd);
				}
				if (up0().rcv_bill_no_flg()) {
					grpCols.add(Srch02_RsltR.$rcv_bill_no);
				}
				if (up0().adv_pay_act_no_flg()) {
					grpCols.add(Srch02_RsltR.$adv_pay_act_no);
				}
				if (up0().note_info_flg()) {
					grpCols.add(Srch02_RsltR.$note_no);
					grpCols.add(Srch02_RsltR.$note_typ);
					grpCols.add(Srch02_RsltR.$note_rsn_cd);
					grpCols.add(Srch02_RsltR.$draw_dt);
					grpCols.add(Srch02_RsltR.$due_dt);
					grpCols.add(Srch02_RsltR.$note_days);
					grpCols.add(Srch02_RsltR.$drawer_nm);
					grpCols.add(Srch02_RsltR.$draw_bank_cd);
					grpCols.add(Srch02_RsltR.$draw_branch_cd);
					grpCols.add(Srch02_RsltR.$endrsr);
					grpCols.add(Srch02_RsltR.$accptr);
				}
				if (up0().rmrks_flg()) {
					grpCols.add(Srch02_RsltR.$pay_schd_print_rmrks);
					grpCols.add(Srch02_RsltR.$pay_ntc_d_print_rmrks);
					grpCols.add(Srch02_RsltR.$trd_d_rmrks);
					grpCols.add(Srch02_RsltR.$intr_rmrks);
					grpCols.add(Srch02_RsltR.$sub_char1);
					grpCols.add(Srch02_RsltR.$sub_char2);
					grpCols.add(Srch02_RsltR.$sub_char3);
				}
			}
			_grpCols = grpCols.toArray(new String[grpCols.size()]);
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			searchForDL(getSql(), up0(), down0(), _grpCols);
		}

		/**
		 * 検索SQL
		 * 
		 * @return
		 */
		protected MCQueryPlan getSql() {
			MCQueryPlan sql = MSBHL0050_MST_PAY_SCHD_S02();
			if (isAggregateAll()) {
				MCColumnSubQuery subQuery = sql.toSubQuery();
				MCTempView S0T1 = createTempView("T");
				MCMainQuery mainQuery = sql("MSBHL0050_MST_PAY_SCHD_Query_S02").mainQuery()
						.select(sum(S0T1.pr("pay_schd_amt")).as("pay_schd_amt"),
								sum(S0T1.pr("com_paid_tax_amt")).as("com_paid_tax_amt"),
								sum(S0T1.pr("exc_com_paid")).as("exc_com_paid"),
								S0T1.pr("xrate"))
						.from(subQuery.view("T"))
						.groupBy(S0T1.pr("xrate"));
				
				sql.setQuery(mainQuery);
			}
			else {
				sql.addDynamicSQLInfo(orderBySqlStr());
			}
			return sql;
		}
		
		/**
		 * @return ORDER BY句
		 */
		protected MCDynamicSQLInfo[] orderBySqlStr() {
			if (_grpCols.length > 0) {
				List<MCDynamicSQLInfo> infoList = new ArrayList<>();
				MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
				
				for (int i = 0; i < _grpCols.length; i++) {
					infoList.add(when(null).orderBy(ORDERBY, pr(_grpCols[i]).asc()));
				}
				return infoList.toArray(new MCDynamicSQLInfo[0]);
			}
			else {
				return null;
			}
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			// 補完
			setValuesDbc(up0(), down0());
			// 基準通貨換算
			if (!up0().trd_cur_cd_flg()) {
				convToBaseCurAmt();	
			}
			// 手数料を結果に含まない場合は、手数料行を結果から除く
			if (!up0().inc_com_paid_flg()) {
				MCList<Srch02_RsltR> subL = down0().createInstance();
				subL = down0().subList(new ExceptComPaidMatcher());
				down0().setAll(subL);
			}
			// 集計
			aggregate();
			
			MCList<Srch02_RsltR> rsltL = down0().createInstance();
			for (Srch02_RsltR r : down0()) {
				if(MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ())) {
					rsltL.add(r);	
				}
				else if(!isNull(r.pay_schd_amt()) && !r.pay_schd_amt().isZero()) {
					rsltL.add(r);
				}
				if (!MAC_AP_SETOFF_TYP.isFLEX(r.ap_setoff_typ())) {
					r.setoff_nm(r.setoff_nm_bp());
				}
			}
			down0().setAll(rsltL);
		}
		
		/**
		 * 基準通貨金額に換算する
		 */
		protected void convToBaseCurAmt() {
			MCNumber paySchdAmt = MCNumber.ZERO;
			MCNumber comPaidTaxAmt = MCNumber.ZERO;
			MCNumber excComPaid = MCNumber.ZERO;
			
			for (Srch02_RsltR r : down0()) {
				// 基準通貨支払予定額
				paySchdAmt = convToBaseCur(
						r.pay_schd_amt()
						, r.xrate()
						, getBaseCur().amt_dec_place()
						, getCo().xrate_rnd_typ());
				// 基準通貨手数料税額
				comPaidTaxAmt = convToBaseCur(
						r.com_paid_tax_amt()
						, r.xrate()
						, getBaseCur().amt_dec_place()
						, getCo().xrate_rnd_typ());
				// 基準通貨手数料税抜額
				excComPaid = convToBaseCur(
						r.exc_com_paid()
						, r.xrate()
						, getBaseCur().amt_dec_place()
						, getCo().xrate_rnd_typ());
				
				r.base_cur_pay_schd_amt(paySchdAmt);
				r.base_cur_com_paid_tax_amt(comPaidTaxAmt);
				r.base_cur_exc_com_paid(excComPaid);
			}
		}
		
		/**
		 * 集計
		 */
		@SuppressWarnings("unchecked")
		protected void aggregate() {
			if (!isAggregate()) {
				return;
			}
			
			MCList<Srch02_RsltR> rsltL = down0().createInstance();
			
			MCList<Srch02_RsltR>[] grpL = null;
			if (_grpCols.length > 0) {
				grpL = down0().groupList(_grpCols);
			}
			else {
				grpL = (MCList<Srch02_RsltR>[]) Array.newInstance(down0().getClass(), 1);
				grpL[0] = down0();
			}
			
			for (MCList<Srch02_RsltR> l : grpL) {
				rsltL.add(aggregateSub(l));
			}

			down0().setAll(rsltL);
		}
		
		/**
		 * 集計
		 */
		protected Srch02_RsltR aggregateSub(MCList<Srch02_RsltR> l) {
			Srch02_RsltR rsltR = l.createRow();
			l.sort(Srch02_RsltR.colnames());
			MCRow.copyall(rsltR, l.get(0));

			if (!up0().bsppl_dpt_cd_flg()) {
				rsltR.bsppl_dpt_cd(null);
			}
			if (!up0().bsppl_dpt_nm_flg()) {
				rsltR.bsppl_dpt_nm(null);
			}
			if (!up0().wg_cd_flg()) {
				rsltR.wg_cd(null);
				rsltR.wg_nm(null);
			}
			if (!up0().bsppl_cd_flg()) {
				rsltR.bsppl_cd(null);
				rsltR.bsppl_nm(null);
				rsltR.bsppl_grp_cd1(null);
				rsltR.bsppl_grp_nm1(null);
				rsltR.bsppl_grp_cd2(null);
				rsltR.bsppl_grp_nm2(null);
				rsltR.bsppl_grp_cd3(null);
				rsltR.bsppl_grp_nm3(null);
				rsltR.bsppl_grp_cd4(null);
				rsltR.bsppl_grp_nm4(null);
				rsltR.bsppl_grp_cd5(null);
				rsltR.bsppl_grp_nm5(null);
				rsltR.bsppl_grp_cd6(null);
				rsltR.bsppl_grp_nm6(null);
				rsltR.bsppl_grp_cd7(null);
				rsltR.bsppl_grp_nm7(null);
				rsltR.bsppl_grp_cd8(null);
				rsltR.bsppl_grp_nm8(null);
				rsltR.bsppl_grp_cd9(null);
				rsltR.bsppl_grp_nm9(null);
				rsltR.bsppl_grp_cd10(null);
				rsltR.bsppl_grp_nm10(null);
			}
			if (!up0().ap_typ_flg()) {
				rsltR.ap_typ(null);
				rsltR.ap_typ_nm(null);
			}
			if (!up0().pay_schd_dt_flg()) {
				rsltR.pay_schd_dt(null);
			}
			if (!up0().ap_sttl_cd_flg()) {
				rsltR.ap_sttl_cd(null);
				rsltR.ap_sttl_nm(null);
			}
			if (!up0().ap_sttl_typ_flg()) {
				rsltR.ap_sttl_typ(null);
				rsltR.ap_sttl_typ_nm(null);
			}
			if (!up0().bsppl_cl_ym_flg()) {
				rsltR.bsppl_cl_ym(null);
			}
			if (!up0().bsppl_cl_day_flg()) {
				rsltR.bsppl_cl_day(null);
			}
			if (!up0().pay_chk_no_flg()) {
				rsltR.pay_chk_no(null);
			}
			if (!up0().pay_schd_no_flg()) {
				rsltR.pay_schd_no(null);
				rsltR.sw_flg(false);
			}
			if (!up0().rcpt_iv_no_flg()) {
				rsltR.rcpt_iv_no(null);
			}
			if (!up0().rcpt_iv_mng_no_flg()) {
				rsltR.rcpt_iv_mng_no(null);
			}
			if (!up0().purc_act_no_flg()) {
				rsltR.purc_act_no(null);
			}
			if (!up0().wrk_no_flg()) {
				rsltR.wrk_no(null);
				rsltR.wrk_nm(null);
			}
			if (!up0().psppl_cd_flg()) {
				rsltR.psppl_cd(null);
				rsltR.psppl_nm(null);
				rsltR.psppl_grp_cd1(null);
				rsltR.psppl_grp_nm1(null);
				rsltR.psppl_grp_cd2(null);
				rsltR.psppl_grp_nm2(null);
				rsltR.psppl_grp_cd3(null);
				rsltR.psppl_grp_nm3(null);
				rsltR.psppl_grp_cd4(null);
				rsltR.psppl_grp_nm4(null);
				rsltR.psppl_grp_cd5(null);
				rsltR.psppl_grp_nm5(null);
				rsltR.psppl_grp_cd6(null);
				rsltR.psppl_grp_nm6(null);
				rsltR.psppl_grp_cd7(null);
				rsltR.psppl_grp_nm7(null);
				rsltR.psppl_grp_cd8(null);
				rsltR.psppl_grp_nm8(null);
				rsltR.psppl_grp_cd9(null);
				rsltR.psppl_grp_nm9(null);
				rsltR.psppl_grp_cd10(null);
				rsltR.psppl_grp_nm10(null);
			}
			if (!up0().pay_dpt_cd_flg()) {
				rsltR.pay_dpt_cd(null);
			}
			if (!up0().pay_dpt_nm_flg()) {
				rsltR.pay_dpt_nm(null);
			}
			if (!up0().asppl_cd_flg()) {
				rsltR.asppl_cd(null);
				rsltR.asppl_nm(null);
			}
			if (!up0().pay_sts_typ_flg()) {
				rsltR.pay_sts_typ(null);
				rsltR.pay_sts_typ_nm(null);
			}
			if (!up0().ap_dpt_cd_flg()) {
				rsltR.ap_dpt_cd(null);
			}
			if (!up0().ap_dpt_nm_flg()) {
				rsltR.ap_dpt_nm(null);
			}
			if (!up0().pay_bank_ac_cd_flg()) {
				rsltR.pay_bank_ac_cd(null);
				rsltR.pay_bank_ac_nm(null);
			}
			if (!up0().bank_ac_cd_flg()) {
				rsltR.bank_ac_cd(null);
				rsltR.bank_ac_nm(null);
			}
			if (!up0().setoff_info_flg()) {
				rsltR.ap_setoff_typ(null);
				rsltR.setoff_cd(null);
				rsltR.so_dpt_cd(null);
				rsltR.so_dpt_nm(null);
			}
			if (!up0().xrate_flg()) {
				rsltR.xrate(null);
			}
			if (!up0().com_paid_tax_cd_flg()) {
				rsltR.com_paid_tax_cd(null);
				rsltR.com_paid_tax_nm(null);
				rsltR.com_paid_tax_rate(null);
			}
			if (!up0().rcv_bill_no_flg()) {
				rsltR.rcv_bill_no(null);
			}
			if (!up0().adv_pay_act_no_flg()) {
				rsltR.adv_pay_act_no(null);
			}
			if (!up0().note_info_flg()) {
				rsltR.note_no(null);
				rsltR.note_typ(null);
				rsltR.note_rsn_cd(null);
				rsltR.draw_dt(null);
				rsltR.due_dt(null);
				rsltR.note_days(null);
				rsltR.drawer_nm(null);
				rsltR.draw_bank_cd(null);
				rsltR.draw_branch_cd(null);
				rsltR.endrsr(null);
				rsltR.accptr(null);
			}
			if (!up0().rmrks_flg()) {
				rsltR.pay_schd_print_rmrks(null);
				rsltR.trd_d_rmrks(null);
				rsltR.intr_rmrks(null);
				rsltR.sub_char1(null);
				rsltR.sub_char2(null);
				rsltR.sub_char3(null);
			}
			if (!up0().trd_cur_cd_flg()) {
				rsltR.trd_cur_cd(null);
				rsltR.trd_cur_nm(null);
				rsltR.pay_schd_amt(l.sum(Srch02_RsltR.$base_cur_pay_schd_amt));
				rsltR.com_paid_tax_amt(l.sum(Srch02_RsltR.$base_cur_com_paid_tax_amt));
				rsltR.exc_com_paid(l.sum(Srch02_RsltR.$base_cur_exc_com_paid));
			}
			else {
				rsltR.pay_schd_amt(l.sum(Srch02_RsltR.$pay_schd_amt));
				rsltR.com_paid_tax_amt(l.sum(Srch02_RsltR.$com_paid_tax_amt));
				rsltR.exc_com_paid(l.sum(Srch02_RsltR.$exc_com_paid));
			}
			rsltR.aprv_flg(false);
			rsltR.aprv_no(null);
			rsltR.aprv_sts_typ(null);
			rsltR.ins_usr_id(null);
			rsltR.ins_usr_nm(null);
			rsltR.ins_func_id(null);
			rsltR.ins_ts(null);
			rsltR.upd_usr_id(null);
			rsltR.upd_usr_nm(null);
			rsltR.upd_func_id(null);
			rsltR.upd_ts(null);
			rsltR.upd_srv_req_no(null);

			return rsltR;
		}
		
		/**
		 * 集計処理が必要な場合true
		 */
		protected boolean isAggregate() {
			return !(up0().bsppl_dpt_cd_flg()
					&& up0().bsppl_dpt_nm_flg()
					&& up0().wg_cd_flg()
					&& up0().bsppl_cd_flg()
					&& up0().ap_typ_flg()
					&& up0().pay_schd_dt_flg()
					&& up0().ap_sttl_cd_flg()
					&& up0().bsppl_cl_ym_flg()
					&& up0().bsppl_cl_day_flg()
					&& up0().trd_cur_cd_flg()
					&& up0().pay_chk_no_flg()
					&& up0().pay_schd_no_flg() 
					&& up0().rcpt_iv_no_flg()
					&& up0().rcpt_iv_mng_no_flg() 
					&& up0().purc_act_no_flg()
					&& up0().wrk_no_flg()
					&& up0().psppl_cd_flg()
					&& up0().pay_dpt_cd_flg()
					&& up0().pay_dpt_nm_flg()
					&& up0().asppl_cd_flg()
					&& up0().pay_sts_typ_flg()
					&& up0().ap_dpt_cd_flg()
					&& up0().ap_dpt_nm_flg()
					&& up0().pay_bank_ac_cd_flg()
					&& up0().bank_ac_cd_flg()
					&& up0().setoff_info_flg()
					&& up0().xrate_flg()
					&& up0().com_paid_tax_cd_flg()
					&& up0().rcv_bill_no_flg()
					&& up0().adv_pay_act_no_flg()
					&& up0().note_info_flg()
					&& up0().rmrks_flg());
		}
		
		/**
		 * 全体の集計処理が必要な場合true
		 */
		protected boolean isAggregateAll() {
			return !up0().bsppl_dpt_cd_flg()
					&& !up0().bsppl_dpt_nm_flg()
					&& !up0().wg_cd_flg()
					&& !up0().bsppl_cd_flg()
					&& !up0().ap_typ_flg()
					&& !up0().pay_schd_dt_flg()
					&& !up0().ap_sttl_cd_flg()
					&& !up0().bsppl_cl_ym_flg()
					&& !up0().bsppl_cl_day_flg()
					&& !up0().trd_cur_cd_flg()
					&& !up0().pay_chk_no_flg()
					&& !up0().pay_schd_no_flg() 
					&& !up0().rcpt_iv_no_flg()
					&& !up0().rcpt_iv_mng_no_flg() 
					&& !up0().purc_act_no_flg()
					&& !up0().wrk_no_flg()
					&& !up0().psppl_cd_flg()
					&& !up0().pay_dpt_cd_flg()
					&& !up0().pay_dpt_nm_flg()
					&& !up0().asppl_cd_flg()
					&& !up0().pay_sts_typ_flg()
					&& !up0().ap_dpt_cd_flg()
					&& !up0().ap_dpt_nm_flg()
					&& !up0().pay_bank_ac_cd_flg()
					&& !up0().bank_ac_cd_flg()
					&& !up0().setoff_info_flg()
					&& !up0().xrate_flg()
					&& !up0().com_paid_tax_cd_flg()
					&& !up0().rcv_bill_no_flg()
					&& !up0().adv_pay_act_no_flg()
					&& !up0().note_info_flg()
					&& !up0().rmrks_flg();
		}
		
		public class ExceptComPaidMatcher implements MCRowMatcher<Srch02_RsltR> {
			@Override
			public boolean match(Srch02_RsltR row) {
				if (MAC_AP_STTL_TYP.is_com_paid(row.ap_sttl_typ())) {
					return false;
				}
				return true;
			}
		}
	}
	
	/**
	 * 検索条件に対する一時カラムを設定する
	 */
	protected void setUpTmpCol(Srch01_CndR up0) {
		if (!up0.inc_appl_flg()) {
			up0.addStringColumn("tmp_pay_sts_typ", MSC_PAY_STS_TYP.PAY.value());
		}
		
		List<String> aprvStsL = new ArrayList<String>();
		if (up0.opn_flg()) {
			aprvStsL.add(MAC_APRV_STS_TYP.OPN.value());
		}
		if (up0.fix_flg()) {
			aprvStsL.add(MAC_APRV_STS_TYP.FIX.value());
		}
		if (up0.acpt_flg()) {
			aprvStsL.add(MAC_APRV_STS_TYP.ACPT.value());
		}
		if (up0.rjct_flg()) {
			aprvStsL.add(MAC_APRV_STS_TYP.RJCT.value());
		}
		if (up0.last_rjct_flg()) {
			aprvStsL.add(MAC_APRV_STS_TYP.LAST_RJCT.value());
		}
		up0.addStringColumn("tmp_aprv_sts_typ", MCStringUtil.arrayValueJoin(aprvStsL.toArray(new String[aprvStsL.size()])));
		up0.addStringColumn("tmp_aprv_flg", MCBooleanUtil.booleanToDBString(up0.excld_flg()));
	}
	
	protected void setValuesDbc(MCRow upR, MCList<? extends MCConstRow> down) {
		if (down.createRow() instanceof Srch01_RsltR) {
			setValuesDbc(MSBHL0050_Srch01_RsltR_J01(), upR, down);
		}
		if (down.createRow() instanceof Srch02_RsltR) {
			setValuesDbc(MSBHL0050_Srch02_RsltR_J01(), upR, down);
		}
	}

	//FMCB CUSTOM END
}