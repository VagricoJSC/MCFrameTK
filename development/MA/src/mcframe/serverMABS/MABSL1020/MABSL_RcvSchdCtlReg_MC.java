package mcframe.serverMABS.MABSL1020;

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
import mcframe.serverMABS.MABSL1020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_RcvSchdCtlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_RcvSchdCtlReg_MC extends MABSL_RcvSchdCtlReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * RcvSchdCtl_UpdChk01オペレーション.<p>
	 *
	 * 入金予定制御マスタの登録前のチェックを行います。<br>
	 */
	public class RcvSchdCtl_UpdChk01 extends MABSL_RcvSchdCtlReg_MC_A.RcvSchdCtl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					RcvSchdCtl_UpdChk01_DtlR.$wg_cd));
			
			return msgLst;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (RcvSchdCtl_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (MAC_CRRYOVR_MONS_TYP.isMM(r.crryovr_mons_typ())) {
					msgList.addAll(check(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day1, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (MAC_CRRYOVR_MONS_TYP.isDD(r.crryovr_mons_typ())) {
					if (!isNull(r.rcv_day1())) {
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day1, MABSL0044, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day1), toDispGUIIndex(r)));
					}
					if (!isNull(r.rcv_day2())) {
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day2, MABSL0044, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day2), toDispGUIIndex(r)));
					}
					if (!isNull(r.rcv_day3())) {
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day3, MABSL0044, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day3), toDispGUIIndex(r)));
					}
					if (!isNull(r.rcv_day4())) {
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day4, MABSL0044, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day4), toDispGUIIndex(r)));
					}
					if (!isNull(r.rcv_day5())) {
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day5, MABSL0044, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day5), toDispGUIIndex(r)));
					}

					if (!isNull(r.bill_cl_day1()) && isNull(r.rcv_crryovr_mons1())){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons1, MABSL0178, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day1), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons1), 
								toDispGUIIndex(r)));
					}
					if (!isNull(r.bill_cl_day2()) && isNull(r.rcv_crryovr_mons2())){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons2, MABSL0178, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day2), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons2), 
								toDispGUIIndex(r)));
					}
					if (!isNull(r.bill_cl_day3()) && isNull(r.rcv_crryovr_mons3())){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons3, MABSL0178, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day3), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons3), 
								toDispGUIIndex(r)));
					}
					if (!isNull(r.bill_cl_day4()) && isNull(r.rcv_crryovr_mons4())){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons4, MABSL0178, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day4), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons4), 
								toDispGUIIndex(r)));
					}
					if (!isNull(r.bill_cl_day5()) && isNull(r.rcv_crryovr_mons5())){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons5, MABSL0178, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day5), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons5), 
								toDispGUIIndex(r)));
					}
				}
				if (MAC_CRRYOVR_MONS_TYP.isMM(r.crryovr_mons_typ())) {
					if (isNull(r.bill_cl_day2()) && (!isNull(r.rcv_day2()) || !isNull(r.rcv_crryovr_mons2()))){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day2, MABSL0176, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day2), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons2), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day2), 
								toDispGUIIndex(r)));
					}
					if (isNull(r.bill_cl_day3()) && (!isNull(r.rcv_day3()) || !isNull(r.rcv_crryovr_mons3()))){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day3, MABSL0176, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day3), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons3), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day3), 
								toDispGUIIndex(r)));
					}
					if (isNull(r.bill_cl_day4()) && (!isNull(r.rcv_day4()) || !isNull(r.rcv_crryovr_mons4()))){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day4, MABSL0176, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day4), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons4), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day4), 
								toDispGUIIndex(r)));
					}
					if (isNull(r.bill_cl_day5()) && (!isNull(r.rcv_day5()) || !isNull(r.rcv_crryovr_mons5()))){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day5, MABSL0176, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day5), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons5), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day5), 
								toDispGUIIndex(r)));
					}

					if (!isNull(r.bill_cl_day1()) && (isNull(r.rcv_day1()) || isNull(r.rcv_crryovr_mons1()))){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day1, MABSL0177, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day1), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons1), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day1), 
								toDispGUIIndex(r)));
					}
					if (!isNull(r.bill_cl_day2()) && (isNull(r.rcv_day2()) || isNull(r.rcv_crryovr_mons2()))){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day2, MABSL0177, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day2), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons2), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day2), 
								toDispGUIIndex(r)));
					}
					if (!isNull(r.bill_cl_day3()) && (isNull(r.rcv_day3()) || isNull(r.rcv_crryovr_mons3()))){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day3, MABSL0177, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day3), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons3), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day3), 
								toDispGUIIndex(r)));
					}
					if (!isNull(r.bill_cl_day4()) && (isNull(r.rcv_day4()) || isNull(r.rcv_crryovr_mons4()))){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day4, MABSL0177, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day4), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons4), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day4), 
								toDispGUIIndex(r)));
					}
					if (!isNull(r.bill_cl_day5()) && (isNull(r.rcv_day5()) || isNull(r.rcv_crryovr_mons5()))){
						msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day5, MABSL0177, 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$bill_cl_day5), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons5), 
								getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day5), 
								toDispGUIIndex(r)));
					}
				}
				if (isNull(r.rcv_day1()) && !isNull(r.rcv_day2())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day2, MABSL0045, toDispGUIIndex(r)));
				}
				if (isNull(r.rcv_day2()) && !isNull(r.rcv_day3())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day3, MABSL0046, toDispGUIIndex(r)));
				}
				if (isNull(r.rcv_day3()) && !isNull(r.rcv_day4())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day4, MABSL0047, toDispGUIIndex(r)));
				}
				if (isNull(r.rcv_day4()) && !isNull(r.rcv_day5())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day5, MABSL0048, toDispGUIIndex(r)));
				}
				if (isNull(r.rcv_crryovr_mons1()) && !isNull(r.rcv_crryovr_mons2())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons2, MABSL0049, toDispGUIIndex(r)));
				}
				if (isNull(r.rcv_crryovr_mons2()) && !isNull(r.rcv_crryovr_mons3())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons3, MABSL0050, toDispGUIIndex(r)));
				}
				if (isNull(r.rcv_crryovr_mons3()) && !isNull(r.rcv_crryovr_mons4())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons4, MABSL0051, toDispGUIIndex(r)));
				}
				if (isNull(r.rcv_crryovr_mons4()) && !isNull(r.rcv_crryovr_mons5())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_crryovr_mons5, MABSL0052, toDispGUIIndex(r)));
				}
				if (!checkDay(r.rcv_day1())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day1, MABCL0267, 
							getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day1), toDispGUIIndex(r)));
				}
				if (!checkDay(r.rcv_day2())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day2, MABCL0267, 
							getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day2), toDispGUIIndex(r)));
				}
				if (!checkDay(r.rcv_day2())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day3, MABCL0267, 
							getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day3), toDispGUIIndex(r)));
				}
				if (!checkDay(r.rcv_day2())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day4, MABCL0267, 
							getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day4), toDispGUIIndex(r)));
				}
				if (!checkDay(r.rcv_day2())) {
					msgList.add(new MCMessage(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day5, MABCL0267, 
							getLabel(r, RcvSchdCtl_UpdChk01_DtlR.$rcv_day5), toDispGUIIndex(r)));
				}
				
				msgList.addAll(checkDecPlace(r, RcvSchdCtl_UpdChk01_DtlR.$amt_dec_place, RcvSchdCtl_UpdChk01_DtlR.$min_amt));
			}
			return msgList;
		}
	}
	
	protected boolean checkDay(MCNumber val) {
		MCNumber min = MCNumber.ONE;
		MCNumber max = new MCNumber(31);
		MCNumber last = new MCNumber(99);
		return isNull(val) || (min.lte(val) && val.lte(max)) || last.eq(val);
	}
	
	/**
	 * RcvSchdCtl_Upd01オペレーション.<p>
	 *
	 * 入金予定制御マスタの登録を行います。<br>
	 */
	public class RcvSchdCtl_Upd01 extends MABSL_RcvSchdCtlReg_MC_A.RcvSchdCtl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RcvSchdCtl_DelChk01オペレーション.<p>
	 *
	 * 入金予定制御マスタの削除前のチェックを行います。<br>
	 */
	public class RcvSchdCtl_DelChk01 extends MABSL_RcvSchdCtlReg_MC_A.RcvSchdCtl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					RcvSchdCtl_DelChk01_DtlR.$wg_cd));
			
			return msgLst;
		}
	}
	/**
	 * RcvSchdCtl_Del01オペレーション.<p>
	 *
	 * 入金予定制御マスタの削除を行います。<br>
	 */
	public class RcvSchdCtl_Del01 extends MABSL_RcvSchdCtlReg_MC_A.RcvSchdCtl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 入金予定制御マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_RcvSchdCtlReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_RCV_SCHD_CTL__R) {
				dbcCustomizeSub(builder);
			}
		}				
						
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			MAM_RCV_SCHD_CTL__R t = MAM_RCV_SCHD_CTL__R.create(builder.getBaseDbcAlias());
			
			if (up0().cmn_flg() == up0().wg_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
						.or( exists( subQuery() .select(S1WG2.prAll()) .from(S1WG2)
								.where( value(0).eq(value(0))
										.and(t.wg_cd.eq(S1WG2.wg_cd))))));
			}
			else if (up0().cmn_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())));
			}
			else if (up0().wg_flg()) {
				builder.addWhereWithAnd(exists( subQuery() .select(S1WG2.prAll()) .from(S1WG2)
						.where( value(0).eq(value(0))
								.and(t.wg_cd.eq(S1WG2.wg_cd)) )));
			}

			MAM_BP_R bp1 = MAM_BP_R.create(MAM_RCV_SCHD_CTL__R.$BP1);
			MAM_CUR_R cur1 = MAM_CUR_R.create(MAM_RCV_SCHD_CTL__R.$CUR1);
			builder.addSelect(cur1.amt_dec_place);
			builder.addSelect(bp1.bill_cl_day1);
			builder.addSelect(bp1.bill_cl_day2);
			builder.addSelect(bp1.bill_cl_day3);
			builder.addSelect(bp1.bill_cl_day4);
			builder.addSelect(bp1.bill_cl_day5);
						
			if(!isNull(up0().bp_grp_nm1())) {
				MAM_BP_GRP_R bg1 = MAM_BP_GRP_R.create("BG1");
				builder.addLeftOuterJoin(bg1, bp1.bp_grp_cd1.eq(bg1.bp_grp_cd)
						.and(bg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(bg1.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm1)));
			}
			if(!isNull(up0().bp_grp_nm2())) {
				MAM_BP_GRP_R bg2 = MAM_BP_GRP_R.create("BG2");
				builder.addLeftOuterJoin(bg2, bp1.bp_grp_cd2.eq(bg2.bp_grp_cd)
						.and(bg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(bg2.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm2)));
			}
			if(!isNull(up0().bp_grp_nm3())) {
				MAM_BP_GRP_R bg3 = MAM_BP_GRP_R.create("BG3");
				builder.addLeftOuterJoin(bg3, bp1.bp_grp_cd3.eq(bg3.bp_grp_cd)
						.and(bg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(bg3.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm3)));
			}
			if(!isNull(up0().bp_grp_nm4())) {
				MAM_BP_GRP_R bg4 = MAM_BP_GRP_R.create("BG4");
				builder.addLeftOuterJoin(bg4, bp1.bp_grp_cd4.eq(bg4.bp_grp_cd)
						.and(bg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(bg4.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm4)));
			}
			if(!isNull(up0().bp_grp_nm5())) {
				MAM_BP_GRP_R bg5 = MAM_BP_GRP_R.create("BG5");
				builder.addLeftOuterJoin(bg5, bp1.bp_grp_cd5.eq(bg5.bp_grp_cd)
						.and(bg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(bg5.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm5)));
			}
			if(!isNull(up0().bp_grp_nm6())) {
				MAM_BP_GRP_R bg6 = MAM_BP_GRP_R.create("BG6");
				builder.addLeftOuterJoin(bg6, bp1.bp_grp_cd6.eq(bg6.bp_grp_cd)
						.and(bg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(bg6.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm6)));
			}
			if(!isNull(up0().bp_grp_nm7())) {
				MAM_BP_GRP_R bg7 = MAM_BP_GRP_R.create("BG7");
				builder.addLeftOuterJoin(bg7, bp1.bp_grp_cd7.eq(bg7.bp_grp_cd)
						.and(bg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(bg7.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm7)));
			}
			if(!isNull(up0().bp_grp_nm8())) {
				MAM_BP_GRP_R bg8 = MAM_BP_GRP_R.create("BG8");
				builder.addLeftOuterJoin(bg8, bp1.bp_grp_cd8.eq(bg8.bp_grp_cd)
						.and(bg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(bg8.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm8)));
			}
			if(!isNull(up0().bp_grp_nm9())) {
				MAM_BP_GRP_R bg9 = MAM_BP_GRP_R.create("BG9");
				builder.addLeftOuterJoin(bg9, bp1.bp_grp_cd9.eq(bg9.bp_grp_cd)
						.and(bg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(bg9.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm9)));
			}
			if(!isNull(up0().bp_grp_nm10())) {
				MAM_BP_GRP_R bg10 = MAM_BP_GRP_R.create("BG10");
				builder.addLeftOuterJoin(bg10, bp1.bp_grp_cd10.eq(bg10.bp_grp_cd)
						.and(bg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(bg10.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm10)));
			}
						
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd1.like(bind(Srch01_CndR.$bp_grp_cd1)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd2.like(bind(Srch01_CndR.$bp_grp_cd2)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd3.like(bind(Srch01_CndR.$bp_grp_cd3)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd4.like(bind(Srch01_CndR.$bp_grp_cd4)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd5.like(bind(Srch01_CndR.$bp_grp_cd5)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd6.like(bind(Srch01_CndR.$bp_grp_cd6)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd7.like(bind(Srch01_CndR.$bp_grp_cd7)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd8.like(bind(Srch01_CndR.$bp_grp_cd8)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd9.like(bind(Srch01_CndR.$bp_grp_cd9)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd10.like(bind(Srch01_CndR.$bp_grp_cd10)));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 入金予定制御マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_RcvSchdCtlReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 入金予定制御マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_RcvSchdCtlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}