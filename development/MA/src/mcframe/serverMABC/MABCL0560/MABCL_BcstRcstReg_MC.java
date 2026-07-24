package mcframe.serverMABC.MABCL0560;

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

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABS.MABSL1230.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL1020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL1030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL1040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL0560.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_BcstRcstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_BcstRcstReg_MC extends MABCL_BcstRcstReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * BpBcst_UpdChk01オペレーション.<p>
	 *
	 * 取引先マスタ（請求先・入金先関連）の登録前のチェックを行います。<br>
	 */
	public class BpBcst_UpdChk01 extends MABCL_BcstRcstReg_MC_A.BpBcst_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (BpBcst_UpdChk01_DtlR r : up0()) {
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if(r.bcst_flg()) {
					msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$rcst_cd, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$bill_dpt_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$bill_cl_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$bill_prnt_typ, new FXUCL_RequiredValidater()));
					if (!isNull(r.bill_prnt_typ()) && !MAC_BILL_PRNT_TYP.isNOT_PRNT(r.bill_prnt_typ())) {
						msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$bill_dtl_subttl_typ, new FXUCL_RequiredValidater()));
						msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$bill_dtl_brk_typ, new FXUCL_RequiredValidater()));
						msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$bill_dtl_sort_typ, new FXUCL_RequiredValidater()));
						msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$bill_can_slip_typ, new FXUCL_RequiredValidater()));
					}
				}
				// 請求先担当部門ＣＤ
				if (MAC_BILL_DPT_TYP.isBILL(r.bill_dpt_typ())) {
					msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$bcst_dpt_cd, new FXUCL_RequiredValidater()));
				}
				// 請求締日１
				if (MAC_BILL_CL_TYP.isBATCH(r.bill_cl_typ()) || MAC_BILL_CL_TYP.isMANUAL(r.bill_cl_typ())) {
					msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$bill_cl_day1, new FXUCL_RequiredValidater()));
				}
				// 請求税額端数処理区分
				if(r.tax_on_bill_flg()) {
					msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$bill_tax_rnd_typ, new FXUCL_RequiredValidater()));
				}
				// 請求締遅延日数
				if (MAC_BILL_CL_TYP.isBATCH(r.bill_cl_typ())) {
					msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$bill_cl_delay_days, new FXUCL_RequiredValidater()));
				}
				// 請求締前後区分
				if (MCNumber.ZERO.eq(r.bill_cl_delay_days())) {
					msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$bill_cl_ba_typ, new FXUCL_RequiredValidater()));
				}
				// 入金予定前後区分
				if (!isNull(r.bill_cal_cd())) {
					msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$rcv_ba_typ, new FXUCL_RequiredValidater()));
				}
				// 売上明細書出力区分
				if (MAC_BILL_CL_TYP.isBATCH(r.bill_cl_typ()) 
				 || MAC_BILL_CL_TYP.isMANUAL(r.bill_cl_typ())
				 || MAC_BILL_CL_TYP.isSEL(r.bill_cl_typ())) {
					if (!isNull(r.bill_prnt_typ()) && !MAC_BILL_PRNT_TYP.isNOT_PRNT(r.bill_prnt_typ())) {
						msgList.addAll(check(r, BpBcst_UpdChk01_DtlR.$sls_dtl_outp_typ, new FXUCL_RequiredValidater()));
					}
				}

				// 個別チェック
				if (!MAC_BILL_CL_TYP.isBATCH(r.bill_cl_typ()) && !MAC_BILL_CL_TYP.isMANUAL(r.bill_cl_typ())) {
					if (!isNull(r.bill_cl_day1())) {
						msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_day1, MABCL0247, 
								getLabel(r, BpBcst_UpdChk01_DtlR.$bill_cl_day1), toDispGUIIndex(r)));
					}
					if (!isNull(r.bill_cl_day2())) {
						msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_day2, MABCL0247, 
								getLabel(r, BpBcst_UpdChk01_DtlR.$bill_cl_day2), toDispGUIIndex(r)));
					}
					if (!isNull(r.bill_cl_day3())) {
						msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_day3, MABCL0247, 
								getLabel(r, BpBcst_UpdChk01_DtlR.$bill_cl_day3), toDispGUIIndex(r)));
					}
					if (!isNull(r.bill_cl_day4())) {
						msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_day4, MABCL0247, 
								getLabel(r, BpBcst_UpdChk01_DtlR.$bill_cl_day4), toDispGUIIndex(r)));
					}
					if (!isNull(r.bill_cl_day5())) {
						msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_day5, MABCL0247, 
								getLabel(r, BpBcst_UpdChk01_DtlR.$bill_cl_day5), toDispGUIIndex(r)));
					}
				}
				if (!checkDay(r.bill_cl_day1())) {
					msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_day1, MABCL0267, 
							getLabel(r, BpBcst_UpdChk01_DtlR.$bill_cl_day1), toDispGUIIndex(r)));
				}
				if (!checkDay(r.bill_cl_day2())) {
					msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_day2, MABCL0267, 
							getLabel(r, BpBcst_UpdChk01_DtlR.$bill_cl_day2), toDispGUIIndex(r)));
				}
				if (!checkDay(r.bill_cl_day3())) {
					msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_day3, MABCL0267, 
							getLabel(r, BpBcst_UpdChk01_DtlR.$bill_cl_day3), toDispGUIIndex(r)));
				}
				if (!checkDay(r.bill_cl_day4())) {
					msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_day4, MABCL0267, 
							getLabel(r, BpBcst_UpdChk01_DtlR.$bill_cl_day4), toDispGUIIndex(r)));
				}
				if (!checkDay(r.bill_cl_day5())) {
					msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_day5, MABCL0267, 
							getLabel(r, BpBcst_UpdChk01_DtlR.$bill_cl_day5), toDispGUIIndex(r)));
				}
				if (!checkClDays(r,
						new String[] { BpBcst_UpdChk01_DtlR.$bill_cl_day1, BpBcst_UpdChk01_DtlR.$bill_cl_day2,
								BpBcst_UpdChk01_DtlR.$bill_cl_day3, BpBcst_UpdChk01_DtlR.$bill_cl_day4,
								BpBcst_UpdChk01_DtlR.$bill_cl_day5 })) {
					msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_day1, MABCL0292, toDispGUIIndex(r)));
				}
				if (!isNull(r.bill_cl_delay_days()) && !MCNumber.ZERO.eq(r.bill_cl_delay_days())) {
					if (!isNull(r.bill_cl_ba_typ())) {
						msgList.add(
								new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_ba_typ, MABCL0301, toDispGUIIndex(r)));
					}
				}
				if (isNull(r.bill_cal_cd())) {
					if (!isNull(r.rcv_ba_typ())) {
						msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$rcv_ba_typ, MABCL0302, toDispGUIIndex(r)));
					}
				}
				if (!MAC_BILL_DPT_TYP.isBILL(r.bill_dpt_typ()) && !isNull(r.bcst_dpt_cd())) {
					msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bcst_dpt_cd, MABCL0130, toDispGUIIndex(r)));
				}
				if (!MAC_BILL_CL_TYP.isBATCH(r.bill_cl_typ()) && !isNull(r.bill_cl_delay_days())) {
					msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bill_cl_delay_days, MABCL0131, toDispGUIIndex(r)));
				}
				if (!MAC_BILL_CL_TYP.isBATCH(r.bill_cl_typ()) 
				 && !MAC_BILL_CL_TYP.isMANUAL(r.bill_cl_typ())
				 && !MAC_BILL_CL_TYP.isSEL(r.bill_cl_typ()))  {
					if (!isNull(r.sls_dtl_outp_typ())) {
						msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$sls_dtl_outp_typ, MABCL0132, toDispGUIIndex(r)));
					}
				}
				if (MAC_BILL_CL_TYP.isEACH_SLS(r.bill_cl_typ())) {
					if (r.bfw_bal_disp_flg()) {
						msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$bfw_bal_disp_flg, MABCL0133, toDispGUIIndex(r)));
					}
				}
				if (!r.tax_on_bill_flg()) {
					if (!isNull(r.bill_tax_rnd_typ())){
						msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$tax_on_bill_flg, MABCL0311, toDispGUIIndex(r)));
					}
				}
				if (!r.rcv_amt_match_flg() && r.calc_com_paid_flg()) {
					msgList.add(new MCMessage(r, BpBcst_UpdChk01_DtlR.$calc_com_paid_flg, MABCL0134, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}

		protected boolean checkDay(MCNumber val) {
			MCNumber min = MCNumber.ONE;
			MCNumber max = new MCNumber(31);
			MCNumber last = new MCNumber(99);
			return isNull(val) || (min.lte(val) && val.lte(max)) || last.eq(val);
		}
		/**
		 * 締日重複チェック
		 */
		protected boolean checkClDays(MCRow r, String[] clDayCol) {
			for (int i = 0; i < clDayCol.length; i++) {
				MCNumber vi = r.getNumber(clDayCol[i]);
				if (isNull(vi)) {
					break;
				}
				for (int j = i+1; j < clDayCol.length; j++) {
					MCNumber vj = r.getNumber(clDayCol[j]);
					if (isNull(vi)) {
						break;
					}
					if (isSame(vi, vj)) {
						return false;
					}
				}
			}
			return true;
		}
	}
	/**
	 * BpBcst_Upd01オペレーション.<p>
	 *
	 * 取引先マスタ（請求先・入金先関連）の登録を行います。<br>
	 */
	public class BpBcst_Upd01 extends MABCL_BcstRcstReg_MC_A.BpBcst_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void updDbcCustomize(
				MCQueryApiBuilder builder, MCList<R> list) {
			super.updDbcCustomize(builder, list);
			if(builder.getBaseDbc() instanceof MAM_BP_R){
				dbcCustomizeSet(builder);
			}
		}

		// 上り電文だけを更新する
		protected void dbcCustomizeSet(MCQueryApiBuilder builder) {

			String[] cols = BpBcst_UpdChk01_DtlR.colnames();
			String[] keyCols = builder.getBaseDbc().getKeyColumn();
			
			int i = 0;
			for (String c : cols) {
				boolean isContains = false;
				for (String k : keyCols) {
					if (isSame(c, k) || isSame(c, BpBcst_UpdChk01_DtlR.$check_bcst_dpt_cd)) {
						isContains = true;
					}
				}
				if (!isContains) {
					if (i==0) {
						builder.setSet(builder.getBaseDbc().getColumn$(c));
					}
					else {
						builder.addSet(builder.getBaseDbc().getColumn$(c));
					}
					i++;
				}
			}
		}
	}
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 請求先・入金先関連の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_BcstRcstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_BP_R) {
				dbcCustomizeSub_Bp(builder);
			} else if (builder.getBaseDbc() instanceof MAM_RCV_SCHD_CTL__R) {
				dbcCustomizeSub_bcst(builder);
			} else if (builder.getBaseDbc() instanceof MAM_COM_PAID_R) {
				dbcCustomizeSub_rcst(builder);
			}
		}

		protected void dbcCustomizeSub_Bp(MCQueryApiBuilder builder) {
			MAM_BP_R t = MAM_BP_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithAnd(t.bcst_flg.eq(value(true)).or(t.rcst_flg.eq(value(true))));
		}

		protected void dbcCustomizeSub_bcst(MCQueryApiBuilder builder) {
			MAVM_RD_WG_R S1RD_WG1 = MAVM_RD_WG_R.create("RD_WG1");
			MAM_RCV_SCHD_CTL__R t = MAM_RCV_SCHD_CTL__R.create(builder.getBaseDbcAlias());
			MAM_CUR_R cur1 = MAM_CUR_R.create(MAM_RCV_SCHD_CTL__R.$CUR1);

			builder.addWhereWithCutOffAnd(t.bcst_cd.eq(bind(Srch01_CndR.$bp_cd)));
			builder.addSelect(cur1.amt_dec_place);
			
			builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or( exists( subQuery() .select(S1RD_WG1.prAll()) .from(S1RD_WG1) .where( t.wg_cd.eq(S1RD_WG1.wg_cd) ) )));
		}

		protected void dbcCustomizeSub_rcst(MCQueryApiBuilder builder) {
			MAM_COM_PAID_R t = MAM_COM_PAID_R.create(builder.getBaseDbcAlias());
			MAM_CUR_R cur1 = MAM_CUR_R.create(MAM_COM_PAID_R.$CUR1);
			
			builder.addWhereWithCutOffAnd(t.rcst_cd.eq(bind(Srch01_CndR.$bp_cd)));
			builder.addSelect(cur1.amt_dec_place);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 請求先・入金先関連の登録を行います。<br>
	 */
	public class Upd01 extends MABCL_BcstRcstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}