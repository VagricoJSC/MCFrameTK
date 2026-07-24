package mcframe.serverMABC.MABCL0580;

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
import mcframe.serverMABS.MABSL1010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL0580.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_BspplPspplReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_BspplPspplReg_MC extends MABCL_BspplPspplReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * BpBsppl_UpdChk01オペレーション.<p>
	 *
	 * 取引先マスタを登録する前のチェックを行う<br>
	 */
	public class BpBsppl_UpdChk01 extends MABCL_BspplPspplReg_MC_A.BpBsppl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (BpBsppl_UpdChk01_DtlR r : up0()) {
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if(r.bsppl_flg()) {
					msgList.addAll(check(r, BpBsppl_UpdChk01_DtlR.$psppl_cd, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, BpBsppl_UpdChk01_DtlR.$bsppl_dpt_cd, new FXUCL_RequiredValidater()));
					if (!r.pay_spot_flg()) {
						msgList.addAll(check(r, BpBsppl_UpdChk01_DtlR.$psppl_cl_day1, new FXUCL_RequiredValidater()));
					}
				}
				if (r.tax_on_pay_flg()) {
					msgList.addAll(check(r, BpBsppl_UpdChk01_DtlR.$pay_tax_rnd_typ, new FXUCL_RequiredValidater()));
				}
				if (r.batch_pay_schd_cl_flg()) {
					msgList.addAll(check(r, BpBsppl_UpdChk01_DtlR.$pay_schd_cl_delay_days, new FXUCL_RequiredValidater()));
				}
				if (MCNumber.ZERO.eq(r.pay_schd_cl_delay_days())) {
					msgList.addAll(check(r, BpBsppl_UpdChk01_DtlR.$pay_schd_cl_ba_typ, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!checkDay(r.psppl_cl_day1())) {
					msgList.add(new MCMessage(r, BpBsppl_UpdChk01_DtlR.$psppl_cl_day1, MABCL0267, 
							getLabel(r, BpBsppl_UpdChk01_DtlR.$psppl_cl_day1), toDispGUIIndex(r)));
				}
				if (!checkDay(r.psppl_cl_day2())) {
					msgList.add(new MCMessage(r, BpBsppl_UpdChk01_DtlR.$psppl_cl_day2, MABCL0267, 
							getLabel(r, BpBsppl_UpdChk01_DtlR.$psppl_cl_day2), toDispGUIIndex(r)));
				}
				if (!checkDay(r.psppl_cl_day3())) {
					msgList.add(new MCMessage(r, BpBsppl_UpdChk01_DtlR.$psppl_cl_day3, MABCL0267, 
							getLabel(r, BpBsppl_UpdChk01_DtlR.$psppl_cl_day3), toDispGUIIndex(r)));
				}
				if (!checkDay(r.psppl_cl_day4())) {
					msgList.add(new MCMessage(r, BpBsppl_UpdChk01_DtlR.$psppl_cl_day4, MABCL0267, 
							getLabel(r, BpBsppl_UpdChk01_DtlR.$psppl_cl_day4), toDispGUIIndex(r)));
				}
				if (!checkDay(r.psppl_cl_day5())) {
					msgList.add(new MCMessage(r, BpBsppl_UpdChk01_DtlR.$psppl_cl_day5, MABCL0267, 
							getLabel(r, BpBsppl_UpdChk01_DtlR.$psppl_cl_day5), toDispGUIIndex(r)));
				}
				if (!checkClDays(r,
						new String[] { BpBsppl_UpdChk01_DtlR.$psppl_cl_day1, BpBsppl_UpdChk01_DtlR.$psppl_cl_day2,
								BpBsppl_UpdChk01_DtlR.$psppl_cl_day3, BpBsppl_UpdChk01_DtlR.$psppl_cl_day4,
								BpBsppl_UpdChk01_DtlR.$psppl_cl_day5 })) {
					msgList.add(new MCMessage(r, BpBsppl_UpdChk01_DtlR.$psppl_cl_day1, MABCL0291, toDispGUIIndex(r)));
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
	 * BpBsppl_Upd01オペレーション.<p>
	 *
	 * 取引先マスタを登録する<br>
	 */
	public class BpBsppl_Upd01 extends MABCL_BspplPspplReg_MC_A.BpBsppl_Upd01 {
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

			String[] cols = BpBsppl_UpdChk01_DtlR.colnames();
			String[] keyCols = builder.getBaseDbc().getKeyColumn();
			
			int i = 0;
			for (String c : cols) {
				boolean isContains = false;
				for (String k : keyCols) {
					if (isSame(c, k) 
							|| isSame(c, BpBsppl_UpdChk01_DtlR.$check_bsppl_dpt_cd) 
							|| isSame(c, BpBsppl_UpdChk01_DtlR.$check_pay_dpt_cd)) {
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
	 * 検索処理を行う<br>
	 */
	public class Srch01 extends MABCL_BspplPspplReg_MC_A.Srch01 {
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
			} else if (builder.getBaseDbc() instanceof MAM_PAY_SCHD_CTL__R) {
				dbcCustomizeSub_bcst(builder);
			}
		}

		protected void dbcCustomizeSub_Bp(MCQueryApiBuilder builder) {
			MAM_BP_R t = MAM_BP_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithAnd(t.bsppl_flg.eq(value(true)).or(t.psppl_flg.eq(value(true))));
		}

		protected void dbcCustomizeSub_bcst(MCQueryApiBuilder builder) {
			MAVM_RD_WG_R S1RD_WG1 = MAVM_RD_WG_R.create("RD_WG1");
			MAM_PAY_SCHD_CTL__R t = MAM_PAY_SCHD_CTL__R.create(builder.getBaseDbcAlias());
			MAM_CUR_R cur1 = MAM_CUR_R.create(MAM_PAY_SCHD_CTL__R.$CUR1);
			MAM_STTL_R sttl1 = MAM_STTL_R.create(MAM_PAY_SCHD_CTL__R.$STTL1);

			builder.addWhereWithCutOffAnd(t.bsppl_cd.eq(bind(Srch01_CndR.$bp_cd)));
			builder.addSelect(cur1.amt_dec_place);
			builder.addSelect(sttl1.ap_sttl_typ);
			
			builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or( exists( subQuery() .select(S1RD_WG1.prAll()) .from(S1RD_WG1) .where( t.wg_cd.eq(S1RD_WG1.wg_cd) ) )));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABCL_BspplPspplReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}