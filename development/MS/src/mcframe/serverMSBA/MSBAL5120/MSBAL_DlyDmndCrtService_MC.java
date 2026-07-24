package mcframe.serverMSBA.MSBAL5120;

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
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBAL_DlyDmndCrtService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBAL_DlyDmndCrtService_MC extends MSBAL_DlyDmndCrtService_MC_A{
	//FMCB CUSTOM START

	/**
	 * DlyDmndCrt_Upd01オペレーション.<p>
	 *
	 * 需要情報を元に日次需要情報を作成する。<br>
	 */
	public class DlyDmndCrt_Upd01 extends MSBAL_DlyDmndCrtService_MC_A.DlyDmndCrt_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			insDlyDmnd();
		}		
		
		/**
		 * 日次需要情報の削除
		 */
		protected void delDlyDmnd(MCDate stDt) {
			// 登録対象外の場合は消込のみ行う
			if(!up0().isEmpty() && !up0().get(0).reg_flg()) {
				return;
			}
			
			// 対象期間の日次需要情報は削除
			MCList<MST_DLY_DMND_R> dlyDmndL = MCList.create(MST_DLY_DMND_R.class);
			MST_DLY_DMND_R t = MST_DLY_DMND_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.dlv_schd_end_dt.gte(bind("1")), stDt);
			dbc_bldr.addWhereWithCutOffAnd(t.dlv_schd_st_dt.lte(bind("end_dt")));
			if(!up0().isEmpty() && !isNull(up0().get(0).itm_cd())) {
				dbc_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
				dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
				dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
				dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			}
			if(!up0().isEmpty() && !isNull(up0().get(0).dpt_cd())) {
				dbc_bldr.addWhereWithAnd(t.dmnd_dpt_cd.eq(bind("dpt_cd")));
			}
			dbSelectForUpdate("MSBAL5120_MST_DLY_DMND_S01", dlyDmndL, dbc_bldr, up0());
			
			if(!dlyDmndL.isEmpty()) {
				dbDeleteKey("MSBAL5120_MST_DLY_DMND_D01", dlyDmndL, dbc_bldr);
			}

			// 元となる需要情報がない日次需要情報も削除
			dlyDmndL = MCList.create(MST_DLY_DMND_R.class);
			MST_DLY_DMND_R t1 = MST_DLY_DMND_R.create("T");
			dbc_bldr = MCQueryApiBuilder.create(t1);
			MST_DMND_R S1TMP = MST_DMND_R.create("TMP");
			dbc_bldr.addWhereWithAnd(t1.itm_cd.eq(bind("itm_cd")));
			dbc_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("itm_sub1")));
			dbc_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("itm_sub2")));
			dbc_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("itm_sub3")));
			dbc_bldr.addWhereWithAnd(t1.dmnd_dpt_cd.eq(bind("dpt_cd")));
			dbc_bldr.addWhereWithAnd(notExists( subQuery() .select(nullValue()) .from(S1TMP)
					.where(value(0).eq(value(0))
							.and(S1TMP.dmnd_no.eq(t1.dmnd_no)))));
			dbSelectForUpdate("MSBAL5120_MST_DLY_DMND_S02", dlyDmndL, dbc_bldr, up0());
			
			if(!dlyDmndL.isEmpty()) {
				dbDeleteKey("MSBAL5120_MST_DLY_DMND_D02", dlyDmndL, dbc_bldr);
			}
		}
		
		/**
		 * 期間需要の取得、日ばらし後に消込を行い、日次需要情報を作成する。
		 */
		protected void insDlyDmnd() {
			MCList<MST_DLY_DMND_R> dlyDmndL = MCList.create(MST_DLY_DMND_R.class);
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			MST_DMND_R t = MST_DMND_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_ITM_R m2 = MAM_ITM_R.create("M2");
			builder.removeSelect(MST_DMND_R.$dmnd_qty);
			builder.addSelect(m1.wg_cd);
			builder.addSelect(m2.dec_place);
			builder.addSelect(t.input_qty.as("dmnd_qty"));
			builder.addInnerJoin(m1, bracket( m1.loc_cd.eq(t.dmnd_loc_cd)));
			builder.addInnerJoin(m2, bracket( m2.itm_cd.eq(t.itm_cd)
					.and(m2.itm_sub1.eq(t.itm_sub1))
					.and(m2.itm_sub2.eq(t.itm_sub2))
					.and(m2.itm_sub3.eq(t.itm_sub3))));
			builder.setWhere(t.dlv_schd_end_dt.gte(bind("st_dt")));
			builder.addWhereWithCutOffAnd(t.dlv_schd_st_dt.lte(bind("end_dt")));
			if(!up0().isEmpty() && !isNull(up0().get(0).itm_cd())) {
				builder.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
				builder.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
				builder.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
				builder.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			}
			if(!up0().isEmpty() && !isNull(up0().get(0).dpt_cd())) {
				builder.addWhereWithAnd(t.dmnd_dpt_cd.eq(bind("dpt_cd")));
			}
			dbSelect("MSBAL5120_MST_DMND_S01", dmndL, builder, up0());
			
			if(dmndL.isEmpty()) {
				return;
			}
			
			dmndL = getTgtDmndL(dmndL);
			delDlyDmnd((MCDate)dmndL.min(MST_DMND_R.$dmnd_st_dt));
			if(!up0().isEmpty() && !up0().get(0).fr_screen_flg()) {
				delDmndRecMap(dmndL);
			}
			
			// 日ばらしを行う
			for(MST_DMND_R dmndR : dmndL) {
				dlyDmndL.addAll(dlyDivDmnd(dmndR));
			}
			
			// 顧客期間内示の集計を行う
			delInsFrcstSum(dlyDmndL);
			
			// 需要情報消込マップの作成、需要情報の消込を行う
			// 需要情報一覧登録から起動した場合は対象外
			if(!up0().isEmpty() && !up0().get(0).fr_screen_flg()) {
				crtDmndRecMap(dlyDmndL.clone());
			}
			
			// 登録対象外の場合は消込のみ行う
			if(!up0().isEmpty() && !up0().get(0).reg_flg()) {
				return;
			}

			// 日次需要の消込を行う
			recDmnd(dlyDmndL);
			
			MCList<MST_DLY_DMND_R> insDlyDmndL = MCList.create(MST_DLY_DMND_R.class);
			MCIndexKey dlyDmndKey = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_no);
			for(MST_DMND_R dmndR : dmndL) {
				MCList<MST_DLY_DMND_R> tmpDlyDmndL = dlyDmndL.subList(dlyDmndKey, dmndR.dmnd_no());
				
				if(dmndR.dly_div_flg()) {
					for(MST_DLY_DMND_R tmpDlyDmndR : tmpDlyDmndL) {
						if(!tmpDlyDmndR.dmnd_qty().isZero()) {
							insDlyDmndL.add(tmpDlyDmndR);
						}
					}
				}
				// 日ばらししない場合は期間需要のまま登録
				else {
					MCNumber sumQty = MCNumber.ZERO;
					for(MST_DLY_DMND_R tmpDlyDmndR : tmpDlyDmndL) {
						sumQty = sumQty.add(tmpDlyDmndR.dmnd_qty());
					}
					MST_DLY_DMND_R dlyDmndR = MST_DLY_DMND_R.create();
					dlyDmndR.dmnd_no(dmndR.dmnd_no());
					dlyDmndR.dmnd_dt(dmndR.dmnd_st_dt());
					dlyDmndR.dmnd_st_dt(dmndR.dmnd_st_dt());
					dlyDmndR.dmnd_end_dt(dmndR.dmnd_end_dt());
					dlyDmndR.dlv_schd_st_dt(dmndR.dlv_schd_st_dt());
					dlyDmndR.dlv_schd_end_dt(dmndR.dlv_schd_end_dt());
					dlyDmndR.dmnd_period_typ(dmndR.dmnd_period_typ());
					dlyDmndR.itm_cd(dmndR.itm_cd());
					dlyDmndR.itm_sub1(dmndR.itm_sub1());
					dlyDmndR.itm_sub2(dmndR.itm_sub2());
					dlyDmndR.itm_sub3(dmndR.itm_sub3());
					dlyDmndR.spln_itm_cd(dmndR.spln_itm_cd());
					dlyDmndR.dmnd_typ(dmndR.dmnd_typ());
					dlyDmndR.dmnd_qty(sumQty);
					dlyDmndR.dmnd_dpt_cd(dmndR.dmnd_dpt_cd());
					dlyDmndR.wrk_no(dmndR.wrk_no());
					dlyDmndR.dmnd_usr_cd(dmndR.dmnd_usr_cd());
					dlyDmndR.cst_cd(dmndR.cst_cd());
					dlyDmndR.dlv_cd(dmndR.dlv_cd());
					dlyDmndR.slo_d_no(dmndR.slo_d_no());
					dlyDmndR.slo_no(dmndR.slo_no());
					dlyDmndR.cst_frcst_d_no(dmndR.cst_frcst_d_no());
					dlyDmndR.cst_frcst_no(dmndR.cst_frcst_no());
					dlyDmndR.ym(dmndR.ym());
					dlyDmndR.spln_vers(dmndR.spln_vers());
					dlyDmndR.cur_cd(dmndR.cur_cd());
					dlyDmndR.sno1(dmndR.sno1());
					dlyDmndR.sno2(dmndR.sno2());
					dlyDmndR.sno3(dmndR.sno3());
					dlyDmndR.sno4(dmndR.sno4());
					dlyDmndR.dmnd_loc_cd(dmndR.dmnd_loc_cd());
					dlyDmndR.wg_cd(dmndR.getStringNE("WG_CD"));
					dlyDmndR.addNumberColumn("DEC_PLACE", dmndR.getNumberNE("DEC_PLACE"));
					
					if(!dlyDmndR.dmnd_qty().isZero()) {
						insDlyDmndL.add(dlyDmndR);
					}
				}
			}
			
			MCSortPolicy sortPolicy = new MCSortPolicy();
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_typ);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_period_typ);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$slo_d_no);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$cst_frcst_d_no);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$spln_vers);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$cur_cd);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$cst_cd);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dlv_cd);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_cd);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub1);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub2);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub3);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_dt);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_st_dt);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_end_dt);
			insDlyDmndL.sort(sortPolicy);
			
			if(!insDlyDmndL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.DLYDMND, insDlyDmndL.size());
				for(MST_DLY_DMND_R row : insDlyDmndL) {
					row.dly_dmnd_no(getStrSeq(MSC_NUM_SYS_TYP.DLYDMND));
				}
				dbInsert("MSBAL5120_MST_DLY_DMND_I01", insDlyDmndL,
						MCQueryApiBuilder.create(MST_DLY_DMND_R.create("T")));
			}
		}
		
		/**
		 * 期間需要を日ばらしする。
		 * @param dmndR
		 * @return
		 */
		protected MCList<MST_DLY_DMND_R> dlyDivDmnd(MST_DMND_R dmndR) {
			MCList<MST_DLY_DMND_R> dlyDmndL = MCList.create(MST_DLY_DMND_R.class);
			
			MCNumber dt = MCNumber.valueOf(dmndR.dmnd_end_dt().diffDay(dmndR.dmnd_st_dt())).add(MCNumber.ONE);
			MCNumber qty = dmndR.input_qty().divide(dt, dmndR.getNumberNE("DEC_PLACE").intValue(), MAC_RND_TYP.CUTOFF.toMC());
			MCNumber balQty = dmndR.input_qty().subtract(qty.multiply(dt));
			
			// 対象期間内でループ
			for(int i = 0; i < dt.intValue(); i++) {
				MST_DLY_DMND_R dlyDmndR = MST_DLY_DMND_R.create();
				dlyDmndR.dmnd_no(dmndR.dmnd_no());
				dlyDmndR.dmnd_dt(dmndR.dmnd_st_dt().addDay(i));
				dlyDmndR.dmnd_st_dt(dmndR.dmnd_st_dt());
				dlyDmndR.dmnd_end_dt(dmndR.dmnd_end_dt());
				dlyDmndR.dlv_schd_st_dt(dmndR.dlv_schd_st_dt());
				dlyDmndR.dlv_schd_end_dt(dmndR.dlv_schd_end_dt());
				dlyDmndR.dmnd_period_typ(dmndR.dmnd_period_typ());
				dlyDmndR.itm_cd(dmndR.itm_cd());
				dlyDmndR.itm_sub1(dmndR.itm_sub1());
				dlyDmndR.itm_sub2(dmndR.itm_sub2());
				dlyDmndR.itm_sub3(dmndR.itm_sub3());
				dlyDmndR.spln_itm_cd(dmndR.spln_itm_cd());
				dlyDmndR.dmnd_typ(dmndR.dmnd_typ());
				if(balQty.isZero()) {
					dlyDmndR.dmnd_qty(qty);
				}
				else {
					dlyDmndR.dmnd_qty(qty.add(MCNumber.ONE.divide(Math.pow(10, dmndR.getNumberNE("DEC_PLACE").intValue()))));
					balQty = balQty.subtract(MCNumber.ONE.divide(Math.pow(10, dmndR.getNumberNE("DEC_PLACE").intValue())));
				}
				dlyDmndR.dmnd_dpt_cd(dmndR.dmnd_dpt_cd());
				dlyDmndR.wrk_no(dmndR.wrk_no());
				dlyDmndR.dmnd_usr_cd(dmndR.dmnd_usr_cd());
				dlyDmndR.cst_cd(dmndR.cst_cd());
				dlyDmndR.dlv_cd(dmndR.dlv_cd());
				dlyDmndR.slo_d_no(dmndR.slo_d_no());
				dlyDmndR.slo_no(dmndR.slo_no());
				dlyDmndR.cst_frcst_d_no(dmndR.cst_frcst_d_no());
				dlyDmndR.cst_frcst_no(dmndR.cst_frcst_no());
				dlyDmndR.ym(dmndR.ym());
				dlyDmndR.spln_vers(dmndR.spln_vers());
				dlyDmndR.cur_cd(dmndR.cur_cd());
				dlyDmndR.sno1(dmndR.sno1());
				dlyDmndR.sno2(dmndR.sno2());
				dlyDmndR.sno3(dmndR.sno3());
				dlyDmndR.sno4(dmndR.sno4());
				dlyDmndR.dmnd_loc_cd(dmndR.dmnd_loc_cd());
				dlyDmndR.wg_cd(dmndR.getStringNE("WG_CD"));
				dlyDmndR.addNumberColumn("DEC_PLACE", dmndR.getNumberNE("DEC_PLACE"));

				dlyDmndL.add(dlyDmndR);
			}
			
			return dlyDmndL;
		}
		/**
		 * 対象データが期間を跨がらない範囲での需要情報を取得する
		 * @param dmndL
		 * @return
		 */
		protected MCList<MST_DMND_R> getTgtDmndL(MCList<MST_DMND_R> dmndL) {
			MCList<MST_DMND_R> tgtDmndL = MCList.create(MST_DMND_R.class);
			MCDate stDt = getTgtStDt((MCDate) dmndL.min(MST_DMND_R.$dmnd_st_dt));

			MST_DMND_R t = MST_DMND_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_ITM_R m2 = MAM_ITM_R.create("M2");
			builder.removeSelect(MST_DMND_R.$dmnd_qty);
			builder.addSelect(m1.wg_cd);
			builder.addSelect(m2.dec_place);
			builder.addSelect(t.input_qty.as("dmnd_qty"));
			builder.addInnerJoin(m1, bracket(m1.loc_cd.eq(t.dmnd_loc_cd)));
			builder.addInnerJoin(m2, bracket(m2.itm_cd.eq(t.itm_cd)
							.and(m2.itm_sub1.eq(t.itm_sub1))
							.and(m2.itm_sub2.eq(t.itm_sub2))
							.and(m2.itm_sub3.eq(t.itm_sub3))));
			builder.setWhere(t.dlv_schd_end_dt.gte(bind("1")), stDt);
			builder.addWhereWithCutOffAnd(t.dlv_schd_st_dt.lte(bind("end_dt")));
			builder.addWhereWithCutOffAnd(t.itm_cd.eq(bind("itm_cd")));
			builder.addWhereWithCutOffAnd(t.itm_sub1.eq(bind("itm_sub1")));
			builder.addWhereWithCutOffAnd(t.itm_sub2.eq(bind("itm_sub2")));
			builder.addWhereWithCutOffAnd(t.itm_sub3.eq(bind("itm_sub3")));
			builder.addWhereWithCutOffAnd(t.dmnd_dpt_cd.eq(bind("dpt_cd")));
			dbSelect("MSBAL5120_MST_DMND_S02", tgtDmndL, builder, up0());

			return tgtDmndL;
		}
		
		/**
		 * 対象データが期間を跨がらない需要期間開始日を取得する
		 * @param aDt
		 * @return
		 */
		protected MCDate getTgtStDt(MCDate aDt) {
			MCDate tgtDt = MAUCL_DateUtil.getPeriodStDt(aDt, MAC_PERIOD_TYP.MONTHLY.value());;
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			MST_DMND_R t = MST_DMND_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.addMin(t.dmnd_st_dt, MST_DMND_R.$dmnd_st_dt);
			
			// 再帰的に最古日を取得する
			while(true) {
				builder.setWhere(bind("1").between(t.dmnd_st_dt, t.dmnd_end_dt), tgtDt);
				builder.addWhereWithCutOffAnd(t.dlv_schd_st_dt.lte(bind("end_dt")));
				builder.addWhereWithCutOffAnd(t.itm_cd.eq(bind("itm_cd")));
				builder.addWhereWithCutOffAnd(t.itm_sub1.eq(bind("itm_sub1")));
				builder.addWhereWithCutOffAnd(t.itm_sub2.eq(bind("itm_sub2")));
				builder.addWhereWithCutOffAnd(t.itm_sub3.eq(bind("itm_sub3")));
				builder.addWhereWithCutOffAnd(t.dmnd_dpt_cd.eq(bind("dpt_cd")));
				dbSelect("MSBAL5120_MST_DMND_S03", dmndL, builder, up0());
				
				if (isNull(dmndL) || isNull(dmndL.get(0).dmnd_st_dt()) || isSame(dmndL.get(0).dmnd_st_dt(), tgtDt)) {
					return tgtDt;
				}
				else {
					tgtDt = MAUCL_DateUtil.getPeriodStDt(dmndL.get(0).dmnd_st_dt(), MAC_PERIOD_TYP.MONTHLY.value());
				}
			}
		}
		
		/**
		 * 需要情報消込マップを削除し、消込状況をリセットする
		 * @param dmndL
		 */
		protected void delDmndRecMap(MCList<MST_DMND_R> dmndL) {
			// 消込先需要ＮＯに対する需要情報がない需要情報消込マップを削除
			MCList<MST_DMND_REC_MAP_R> delDmndRecMapL = MCList.create(MST_DMND_REC_MAP_R.class);
			MST_DMND_REC_MAP_R t = MST_DMND_REC_MAP_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setSelect(t.fr_dmnd_no);
			builder.addSelect(t.to_dmnd_no);
			builder.setWhere(t.to_dmnd_no.eq(bind("dmnd_no")));
			dbSelectForUpdate("MSBAL5120_MST_DMND_REC_MAP_S01", delDmndRecMapL, builder, dmndL);
			
			if(!delDmndRecMapL.isEmpty()) {
				dbDeleteKey("MSBAL5120_MST_DMND_REC_MAP_D01", delDmndRecMapL, builder);
			}
			
			// 消込元需要ＮＯに対する需要情報がない需要情報消込マップを削除
			delDmndRecMapL = MCList.create(MST_DMND_REC_MAP_R.class);
			MST_DMND_REC_MAP_R t1 = MST_DMND_REC_MAP_R.create("T");
			builder = MCQueryApiBuilder.create(t1);
			builder.setWhere(t1.fr_dmnd_no.eq(bind("dmnd_no")));
			dbSelectForUpdate("MSBAL5120_MST_DMND_REC_MAP_S02", delDmndRecMapL, builder, dmndL);
			
			if(!delDmndRecMapL.isEmpty()) {
				dbDeleteKey("MSBAL5120_MST_DMND_REC_MAP_D02", delDmndRecMapL, builder);
			}
			
			// 消込先需要ＮＯに対する需要情報の消込数を更新
			MCList<MST_DMND_REC_MAP_R> bindDmndRecMapL = MCList.create(MST_DMND_REC_MAP_R.class);
			for(MST_DMND_REC_MAP_R r : delDmndRecMapL) {
				if(!r.rec_qty().isZero()) {
					bindDmndRecMapL.add(r);
				}
			}
			
			if(!bindDmndRecMapL.isEmpty()) {
				MCList<MST_DMND_R> tgtDmndL = MCList.create(MST_DMND_R.class);
				MCList<MST_DMND_R> updDmndL = MCList.create(MST_DMND_R.class);
				MST_DMND_R t2 = MST_DMND_R.create("T");
				MCQueryApiBuilder builder2 = MCQueryApiBuilder.create(t2);
				builder2.setWhere(t2.dmnd_no.eq(bind("to_dmnd_no")));
				dbSelectForUpdate("MSBAL5120_MST_DMND_S04", tgtDmndL, builder2, bindDmndRecMapL);
				
				if(tgtDmndL.isEmpty()) {
					return;
				}
				
				MCIndexKey dmndKey = tgtDmndL.createIndex(MST_DMND_R.$dmnd_no);
				
				for(MST_DMND_REC_MAP_R dmndRecMapR : bindDmndRecMapL) {
					MST_DMND_R tgtDmndR = tgtDmndL.getFirst(dmndKey, dmndRecMapR.to_dmnd_no());
					if(!isNull(tgtDmndR)) {
						tgtDmndR.rec_qty(tgtDmndR.rec_qty().subtract(dmndRecMapR.rec_qty()));
						tgtDmndR.dmnd_qty(tgtDmndR.dmnd_qty().add(dmndRecMapR.rec_qty()));
						updDmndL.add(tgtDmndR);
					}
				}
				
				if(!updDmndL.isEmpty()) {
					MST_DMND_R t3 = MST_DMND_R.create("T");
					MCQueryApiBuilder builder3 = MCQueryApiBuilder.create(t3);
					editUpdSetStmt(builder3, t3);
					dbUpdateKey("MSBAL5120_MST_DMND_U01", updDmndL, builder3);
				}
				
			}
		}
		
		/**
		 * 更新時のset句の編集
		 * @param updL
		 */
		protected void editUpdSetStmt(MCQueryApiBuilder builder, MST_DMND_R t) {
			builder.setSet(t.dmnd_qty, t.rec_qty);
		}
		
		/**
		 * 顧客期間内示の集計を行う
		 * @param dlyDmndL　消込前の日次需要情報
		 */
		protected void delInsFrcstSum(MCList<MST_DLY_DMND_R> dlyDmndL) {
			MCList<MST_DLY_DMND_R> copyDlyDmndL = dlyDmndL.clone();
			
			if(up0().isEmpty()) {
				return;
			}
			
			// 顧客期間内示集計を削除
			MCDate stYm = MAUCL_DateUtil.getPeriodStDt(up0().get(0).st_dt(), MAC_PERIOD_TYP.MONTHLY.value()).trunc(MCDateFieldType.MONTH);
			if (stYm.gtDate((MCDate)dlyDmndL.min(MST_DLY_DMND_R.$dmnd_st_dt))) {
				stYm = MAUCL_DateUtil.getPeriodStDt((MCDate)dlyDmndL.min(MST_DLY_DMND_R.$dmnd_st_dt), MAC_PERIOD_TYP.MONTHLY.value()).trunc(MCDateFieldType.MONTH);
			}
			MCDate endYm = null;
			if(!isNull(up0().get(0).end_dt())) {
				endYm = MAUCL_DateUtil.getPeriodEndDt(up0().get(0).end_dt(), MAC_PERIOD_TYP.MONTHLY.value()).trunc(MCDateFieldType.MONTH);
			}
			
			up0().addDateColumn("stYm", stYm);
			up0().addDateColumn("endYm", endYm);
			
			MST_FRCST_SUM_R t = MST_FRCST_SUM_R.create("T");
			execDbDelete("MSBAL5120_MST_FRCST_SUM_D01", t, t.itm_cd.eq(bind("itm_cd"))
					.and(t.itm_sub1.eq(bind("itm_sub1")))
					.and(t.itm_sub2.eq(bind("itm_sub2")))
					.and(t.itm_sub3.eq(bind("itm_sub3")))
					.and(t.sls_dpt_cd.eq(bind("dpt_cd")))
					.and(t.ym.gte(bind("stym"))).cutoff$and(t.ym.lte(bind("endym"))), up0());
			
			// 顧客期間内示間での消込を行う
			MCIndexKey dlyDmndKey = copyDlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ);
			
			MCIndexKey dlyDmndTgtKey = copyDlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$dlv_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey2 = copyDlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey3 = copyDlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$dlv_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd, MST_DLY_DMND_R.$dmnd_dt);
			MCIndexKey dlyDmndTgtKey4 = copyDlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd, MST_DLY_DMND_R.$dmnd_dt);
			
			// 週次の顧客期間内示の消込
			for(MST_DLY_DMND_R r : copyDlyDmndL.subList(dlyDmndKey, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value())) {
				MCNumber qty = r.dmnd_qty();

				// 旬次の顧客期間内示での消込
				for(MST_DLY_DMND_R tgtR : copyDlyDmndL.subList(dlyDmndTgtKey3, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
					qty = calcDmndQty(qty, tgtR);
					if(qty.isZero()) {
						break;
					}
				}
				if(qty.isPositive()) {
					for(MST_DLY_DMND_R tgtR : copyDlyDmndL.subList(dlyDmndTgtKey, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
						if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
							if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
								qty = calcDmndQty(qty, tgtR);
								if(qty.isZero()) {
									break;
								}
							}
						}
					}
				}
				
				if(qty.isPositive()) {
					for(MST_DLY_DMND_R tgtR : copyDlyDmndL.subList(dlyDmndTgtKey4, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						qty = calcDmndQty(qty, tgtR);
						if(qty.isZero()) {
							break;
						}
					}
					for(MST_DLY_DMND_R tgtR : copyDlyDmndL.subList(dlyDmndTgtKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
							if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
								qty = calcDmndQty(qty, tgtR);
								if(qty.isZero()) {
									break;
								}
							}
						}
					}
				}
				
				// 月次の顧客期間内示での消込
				qty = r.dmnd_qty();
				for(MST_DLY_DMND_R tgtR : copyDlyDmndL.subList(dlyDmndTgtKey3, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
					qty = calcDmndQty(qty, tgtR);
					if(qty.isZero()) {
						break;
					}
				}
				if(qty.isPositive()) {
					for(MST_DLY_DMND_R tgtR : copyDlyDmndL.subList(dlyDmndTgtKey, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
						if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
							if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
								qty = calcDmndQty(qty, tgtR);
								if(qty.isZero()) {
									break;
								}
							}	
						}
					}
				}
				
				if(qty.isPositive()) {
					for(MST_DLY_DMND_R tgtR : copyDlyDmndL.subList(dlyDmndTgtKey4, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						qty = calcDmndQty(qty, tgtR);
						if(qty.isZero()) {
							break;
						}
					}
					for(MST_DLY_DMND_R tgtR : copyDlyDmndL.subList(dlyDmndTgtKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
						if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
							if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
								qty = calcDmndQty(qty, tgtR);
								if(qty.isZero()) {
									break;
								}
							}
						}
					}
				}
			}
			
			// 旬次の顧客期間内示の消込
			for(MST_DLY_DMND_R r : copyDlyDmndL.subList(dlyDmndKey, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value())) {
				MCNumber qty = r.dmnd_qty();				

				// 月次の顧客期間内示での消込
				for(MST_DLY_DMND_R tgtR : copyDlyDmndL.subList(dlyDmndTgtKey3, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
					qty = calcDmndQty(qty, tgtR);
					if(qty.isZero()) {
						break;
					}
				}
				if(qty.isPositive()) {
					for(MST_DLY_DMND_R tgtR : copyDlyDmndL.subList(dlyDmndTgtKey, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
						if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
							if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
								qty = calcDmndQty(qty, tgtR);
								if(qty.isZero()) {
									break;
								}
							}	
						}
					}
				}
				
				if(qty.isPositive()) {
					for(MST_DLY_DMND_R tgtR : copyDlyDmndL.subList(dlyDmndTgtKey4, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						qty = calcDmndQty(qty, tgtR);
						if(qty.isZero()) {
							break;
						}
					}
					for(MST_DLY_DMND_R tgtR : copyDlyDmndL.subList(dlyDmndTgtKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
						if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
							if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
								qty = calcDmndQty(qty, tgtR);
								if(qty.isZero()) {
									break;
								}
							}
						}
					}
				}
			}

			
			// 顧客期間内示集計を作成
			MCList<MST_FRCST_SUM_R> frcstSumL = MCList.create(MST_FRCST_SUM_R.class);
			for(MST_DLY_DMND_R tgtR : copyDlyDmndL) {
				if(tgtR.dmnd_qty().isZero()) {
					continue;
				}
				if(!MSC_DMND_TYP.isCST_FRCST(tgtR.dmnd_typ())) {
					continue;
				}
				
				MCIndexKey frcstSumKey = frcstSumL.createIndex(MST_FRCST_SUM_R.$sls_dpt_cd, MST_FRCST_SUM_R.$sls_usr_cd, MST_FRCST_SUM_R.$cst_cd, MST_FRCST_SUM_R.$wrk_no, MST_FRCST_SUM_R.$itm_cd, MST_FRCST_SUM_R.$itm_sub1, MST_FRCST_SUM_R.$itm_sub2, MST_FRCST_SUM_R.$itm_sub3, MST_FRCST_SUM_R.$ym);
				MCDate tgtYm = MAUCL_DateUtil.getPeriodEndDt(tgtR.dmnd_dt(), MAC_PERIOD_TYP.MONTHLY.value()).trunc(MCDateFieldType.MONTH);
				MST_FRCST_SUM_R frcstSumR = frcstSumL.getFirst(frcstSumKey, tgtR.dmnd_dpt_cd(), tgtR.dmnd_usr_cd(), tgtR.cst_cd(), tgtR.wrk_no(), tgtR.itm_cd(), tgtR.itm_sub1(), tgtR.itm_sub2(), tgtR.itm_sub3(), tgtYm);
				if(isNull(frcstSumR)) {
					frcstSumR = MST_FRCST_SUM_R.create();
					frcstSumR.sls_dpt_cd(tgtR.dmnd_dpt_cd());
					frcstSumR.sls_usr_cd(tgtR.dmnd_usr_cd());
					frcstSumR.cst_cd(tgtR.cst_cd());
					frcstSumR.wrk_no(tgtR.wrk_no());
					frcstSumR.itm_cd(tgtR.itm_cd());
					frcstSumR.itm_sub1(tgtR.itm_sub1());
					frcstSumR.itm_sub2(tgtR.itm_sub2());
					frcstSumR.itm_sub3(tgtR.itm_sub3());
					frcstSumR.ym(tgtYm);
					frcstSumR.cst_frcst_qty(tgtR.dmnd_qty());
					frcstSumL.add(frcstSumR);
				}
				else {
					frcstSumR.cst_frcst_qty(frcstSumR.cst_frcst_qty().add(tgtR.dmnd_qty()));
				}
			}
			
			if(!frcstSumL.isEmpty()) {
				dbInsert("MSBAL5120_MST_FRCST_SUM_I01", frcstSumL,
						MCQueryApiBuilder.create(MST_FRCST_SUM_R.create("T")));
			}
		}
		
		/**
		 * 消込数量を計算し、需要消込マップを登録する
		 * @param dlyDmndL
		 */
		protected void crtDmndRecMap(MCList<MST_DLY_DMND_R> dlyDmndL) {
			MCList<MST_DMND_REC_MAP_R> dmndRecMapL = MCList.create(MST_DMND_REC_MAP_R.class);
			
			MCSortPolicy sortPolicy = new MCSortPolicy();
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_typ);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_period_typ);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_cd);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub1);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub2);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub3);
			sortPolicy.add(MCList.SortType.DESC, MST_DLY_DMND_R.$dmnd_dt);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_st_dt);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_end_dt);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$cst_cd);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dlv_cd);
			dlyDmndL.sort(sortPolicy);
			
			MCSortPolicy tgtSortPolicy = new MCSortPolicy();
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_cd);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub1);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub2);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub3);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_dt);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_st_dt);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_end_dt);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$cst_cd);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dlv_cd);
			
			MCIndexKey dlyDmndKey = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ);
			MCIndexKey dlyDmndKey2 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ);

			// 受注・仮受注の消込
			MCList<MST_DLY_DMND_R> tmpL = dlyDmndL.subList(dlyDmndKey, MSC_DMND_TYP.SLO.value());
			tmpL.addAll(dlyDmndL.subList(dlyDmndKey, MSC_DMND_TYP.PRE_SLO.value()));
			tmpL.sort(tgtSortPolicy);
			doDmndRec(dlyDmndL,	tmpL, dmndRecMapL);
			
			// 週次の顧客期間内示の消込
			tmpL = dlyDmndL.subList(dlyDmndKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value());
			tmpL.sort(tgtSortPolicy);
			doDmndRec(dlyDmndL,	tmpL, dmndRecMapL);
			
			// 旬次の顧客期間内示の消込
			tmpL = dlyDmndL.subList(dlyDmndKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value());
			tmpL.sort(tgtSortPolicy);
			doDmndRec(dlyDmndL,	tmpL, dmndRecMapL);
			
			// 月次の顧客期間内示の消込
			tmpL = dlyDmndL.subList(dlyDmndKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value());
			tmpL.sort(tgtSortPolicy);
			doDmndRec(dlyDmndL,	tmpL, dmndRecMapL);
			
			
			// 需要情報消込マップに追加
			MCList<MST_DMND_REC_MAP_R> insDmndRecMapL = MCList.create(MST_DMND_REC_MAP_R.class);
			if(!dmndRecMapL.isEmpty()) {
				MCIndexKey dmndRecMapKey = dmndRecMapL.createIndex(MST_DMND_REC_MAP_R.$fr_dmnd_no, MST_DMND_REC_MAP_R.$to_dmnd_no);
				
				for(MST_DMND_REC_MAP_R r : dmndRecMapL.groupBy(MST_DMND_REC_MAP_R.$fr_dmnd_no, MST_DMND_REC_MAP_R.$to_dmnd_no)) {
					MCList<MST_DMND_REC_MAP_R> tmpDmndRecMapL = dmndRecMapL.subList(dmndRecMapKey, r.fr_dmnd_no(), r.to_dmnd_no());
					if(!isNull(tmpDmndRecMapL)) {
						MST_DMND_REC_MAP_R tmpR = MST_DMND_REC_MAP_R.create();
						tmpR.fr_dmnd_no(r.fr_dmnd_no());
						tmpR.to_dmnd_no(r.to_dmnd_no());
						tmpR.rec_qty(tmpDmndRecMapL.sum(MST_DMND_REC_MAP_R.$rec_qty));
						insDmndRecMapL.add(tmpR);
					}
				}
				
				if(!insDmndRecMapL.isEmpty()) {
					dbInsert("MSBAL5120_MST_DMND_REC_MAP_I01", insDmndRecMapL,
							MCQueryApiBuilder.create(MST_DMND_REC_MAP_R.create("T")));
				}
			}
			
			if(insDmndRecMapL.isEmpty()) {
				return;
			}

			// 需要情報消込マップを元に需要情報の消込数、需要数を更新
			MCList<MST_DMND_R> tgtDmndL = MCList.create(MST_DMND_R.class);
			MCList<MST_DMND_R> updDmndL = MCList.create(MST_DMND_R.class);
			if(!insDmndRecMapL.isEmpty()) {
				MST_DMND_R t2 = MST_DMND_R.create("T");
				MCQueryApiBuilder builder2 = MCQueryApiBuilder.create(t2);
				builder2.setSelect(t2.dmnd_no);
				builder2.addSelect(t2.input_qty);
				builder2.setWhere(t2.dmnd_no.eq(bind("to_dmnd_no")));
				dbSelectForUpdate("MSBAL5120_MST_DMND_S05", tgtDmndL, builder2, insDmndRecMapL.groupBy(MST_DMND_REC_MAP_R.$to_dmnd_no));
			}
			MCIndexKey dmndKey = tgtDmndL.createIndex(MST_DMND_R.$dmnd_no);
			
			MCIndexKey dmndRecMapKey = insDmndRecMapL.createIndex(MST_DMND_REC_MAP_R.$to_dmnd_no);
			for(MST_DMND_REC_MAP_R r : insDmndRecMapL.groupBy(MST_DMND_REC_MAP_R.$to_dmnd_no)) {
				MCList<MST_DMND_REC_MAP_R> tmpDmndRecMapL = insDmndRecMapL.subList(dmndRecMapKey, r.to_dmnd_no());
				MCNumber recQty = tmpDmndRecMapL.sum(MST_DMND_REC_MAP_R.$rec_qty);
				
				MST_DMND_R tgtDmndR = tgtDmndL.getFirst(dmndKey, r.to_dmnd_no());
				if(!isNull(tgtDmndR)) {
					tgtDmndR.rec_qty(recQty);
					tgtDmndR.dmnd_qty(tgtDmndR.input_qty().subtract(recQty));
					updDmndL.add(tgtDmndR);
				}
			}
			
			if(!updDmndL.isEmpty()) {
				MST_DMND_R t3 = MST_DMND_R.create("T");
				MCQueryApiBuilder builder3 = MCQueryApiBuilder.create(t3);
				builder3.setSet(t3.dmnd_qty);
				builder3.addSet(t3.rec_qty);
				dbUpdateKey("MSBAL5120_MST_DMND_U02", updDmndL, builder3);
			}
		}
		
		/**
		 * 需要情報の消込計算を行う
		 * @param dlyDmndL
		 * @param tgtL
		 * @param dmndRecMapL
		 */
		protected void doDmndRec(MCList<MST_DLY_DMND_R> dlyDmndL,
				MCList<MST_DLY_DMND_R> tgtL, MCList<MST_DMND_REC_MAP_R> dmndRecMapL) {
			
			MCIndexKey dlyDmndTgtKey = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ,
					MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd,
					MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$dlv_cd,
					MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1,
					MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3,
					MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey2 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ,
					MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd,
					MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$itm_cd,
					MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2,
					MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey3 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ,
					MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd,
					MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1,
					MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3,
					MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey4 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ,
					MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd,
					MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$dlv_cd,
					MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1,
					MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3,
					MST_DLY_DMND_R.$dmnd_dpt_cd, MST_DLY_DMND_R.$dmnd_dt);
			MCIndexKey dlyDmndTgtKey5 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ,
					MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd,
					MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$itm_cd,
					MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2,
					MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd,
					MST_DLY_DMND_R.$dmnd_dt);
			MCIndexKey dlyDmndTgtKey6 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ,
					MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd,
					MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1,
					MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3,
					MST_DLY_DMND_R.$dmnd_dpt_cd, MST_DLY_DMND_R.$dmnd_dt);
			MCIndexKey dlyDmndTgtKey7 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ,
					MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd,
					MST_DLY_DMND_R.$wrk_no, MST_DLY_DMND_R.$cst_cd,
					MST_DLY_DMND_R.$dlv_cd, MST_DLY_DMND_R.$itm_cd,
					MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2,
					MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey8 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ,
					MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd,
					MST_DLY_DMND_R.$wrk_no, MST_DLY_DMND_R.$cst_cd,
					MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1,
					MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3,
					MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey9 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ,
					MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd,
					MST_DLY_DMND_R.$wrk_no, MST_DLY_DMND_R.$itm_cd,
					MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2,
					MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey10 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ,
					MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd,
					MST_DLY_DMND_R.$wrk_no, MST_DLY_DMND_R.$cst_cd,
					MST_DLY_DMND_R.$dlv_cd, MST_DLY_DMND_R.$itm_cd,
					MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2,
					MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd,
					MST_DLY_DMND_R.$dmnd_dt);
			MCIndexKey dlyDmndTgtKey11 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ,
					MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd,
					MST_DLY_DMND_R.$wrk_no, MST_DLY_DMND_R.$cst_cd,
					MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1,
					MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3,
					MST_DLY_DMND_R.$dmnd_dpt_cd, MST_DLY_DMND_R.$dmnd_dt);
			MCIndexKey dlyDmndTgtKey12 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ,
					MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd,
					MST_DLY_DMND_R.$wrk_no, MST_DLY_DMND_R.$itm_cd,
					MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2,
					MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd,
					MST_DLY_DMND_R.$dmnd_dt);

			for(MST_DLY_DMND_R r : tgtL) {
				MCNumber qty = r.dmnd_qty();
				
				boolean exists = false;
				
				
				// 受注、仮受注の場合のみ
				if(MSC_DMND_TYP.isPRE_SLO(r.dmnd_typ()) || MSC_DMND_TYP.isSLO(r.dmnd_typ())) {
					// 週次の顧客期間内示での消込
					// 案件、得意先、納品先一致での消込
					// 日付が一致する需要を優先して消込
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey10, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						exists = true;
						qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
						if(qty.isZero()) {
							break;
						}
					}
					
					// 日付が一致せず、期間が含まれる場合
					if(qty.isPositive()) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey7, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									exists = true;
									qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
									if(qty.isZero()) {
										break;
									}
								}
							}
						}
					}
	
					// 案件、得意先一致での消込
					if(!exists) {
						// 日付が一致する需要を優先して消込
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey11, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							exists = true;
							qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
							if(qty.isZero()) {
								break;
							}
						}
						
						// 日付が一致せず、期間が含まれる場合
						if(qty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey8, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNull(tgtR.dlv_cd())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
										if(qty.isZero()) {
											break;
										}
									}
								}
							}
						}
					}
					
					// 得意先、納品先一致での消込
					// 日付が一致する需要を優先して消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey4, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							exists = true;
							qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
							if(qty.isZero()) {
								break;
							}
						}
						
						// 日付が一致せず、期間が含まれる場合
						if(qty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
										if(qty.isZero()) {
											break;
										}
									}
								}
							}
						}
					}
	
					// 得意先一致での消込
					if(!exists) {
						// 日付が一致する需要を優先して消込
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey5, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							exists = true;
							qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
							if(qty.isZero()) {
								break;
							}
						}
						
						// 日付が一致せず、期間が含まれる場合
						if(qty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(!isNull(tgtR.dlv_cd())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
										if(qty.isZero()) {
											break;
										}
									}
								}
							}
						}
					}
				}
				
				
				
				// 受注、仮受注、週次の顧客期間内示は消込を行う
				if(MSC_DMND_TYP.isPRE_SLO(r.dmnd_typ()) || MSC_DMND_TYP.isSLO(r.dmnd_typ())
						|| (MSC_DMND_TYP.isCST_FRCST(r.dmnd_typ()) && MAC_PERIOD_TYP.isWEEKLY(r.dmnd_period_typ()))) {
					
					// 旬次の顧客期間内示での消込
					exists = false;
					qty = r.dmnd_qty();
					// 案件、得意先、納品先一致での消込
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey10, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						exists = true;
						qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
						if(qty.isZero()) {
							break;
						}
					}
					if(qty.isPositive()) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey7, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									exists = true;
									qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
									if(qty.isZero()) {
										break;
									}
								}
							}
						}
					}
					
					// 案件、得意先一致での消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey11, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							exists = true;
							qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
							if(qty.isZero()) {
								break;
							}
						}
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey8, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									exists = true;
									qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
									if(qty.isZero()) {
										break;
									}
								}
							}
						}
					}
	
					// 得意先、納品先一致での消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey4, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							exists = true;
							qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
							if(qty.isZero()) {
								break;
							}
						}
						if(qty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
										if(qty.isZero()) {
											break;
										}
									}
								}
							}
						}
					}
					
					// 得意先一致での消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey5, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							exists = true;
							qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
							if(qty.isZero()) {
								break;
							}
						}
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									exists = true;
									qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
									if(qty.isZero()) {
										break;
									}
								}
							}
						}
					}
				}
				
				
				// 受注、仮受注、週次・旬次の顧客期間内示は消込を行う
				if(MSC_DMND_TYP.isPRE_SLO(r.dmnd_typ()) || MSC_DMND_TYP.isSLO(r.dmnd_typ())
						|| (MSC_DMND_TYP.isCST_FRCST(r.dmnd_typ()) && MAC_PERIOD_TYP.isWEEKLY(r.dmnd_period_typ()))
						|| (MSC_DMND_TYP.isCST_FRCST(r.dmnd_typ()) && MAC_PERIOD_TYP.isTENDAYS(r.dmnd_period_typ()))) {
					
					// 月次の顧客期間内示での消込
					exists = false;
					qty = r.dmnd_qty();
					// 案件、得意先、納品先一致での消込
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey10, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						exists = true;
						qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
						if(qty.isZero()) {
							break;
						}
					}
					if(qty.isPositive()) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey7, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									exists = true;
									qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
									if(qty.isZero()) {
										break;
									}
								}
							}
						}
					}
					
					// 案件、得意先一致での消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey11, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							exists = true;
							qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
							if(qty.isZero()) {
								break;
							}
						}
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey8, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									exists = true;
									qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
									if(qty.isZero()) {
										break;
									}
								}
							}
						}
					}
	
					// 得意先、納品先一致での消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey4, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							exists = true;
							qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
							if(qty.isZero()) {
								break;
							}
						}
						if(qty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
										if(qty.isZero()) {
											break;
										}
									}
								}
							}
						}
					}
					
					// 得意先一致での消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey5, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							exists = true;
							qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
							if(qty.isZero()) {
								break;
							}
						}
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									exists = true;
									qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
									if(qty.isZero()) {
										break;
									}
								}
							}
						}
					}
				}
				
				
				// 販売計画での消込はすべて行う
				exists = false;
				qty = r.dmnd_qty();
				// 案件、得意先一致での消込
				for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey11, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
					exists = true;
					qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
					if(qty.isZero()) {
						break;
					}
				}
				for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey8, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
					if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
						if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
							exists = true;
							qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
							if(qty.isZero()) {
								break;
							}
						}
					}
				}
				
				// 販売計画のみ案件一致での消込を行う
				if(!exists) {
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey12, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if(isNullOrNullVal(tgtR.wrk_no())) {
							continue;
						}
						exists = true;
						qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
						if(qty.isZero()) {
							break;
						}
					}
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey9, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if(isNullOrNullVal(tgtR.wrk_no())) {
							continue;
						}
						if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
							if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
								exists = true;
								qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
								if(qty.isZero()) {
									break;
								}
							}
						}
					}
				}

				// 得意先一致での消込
				if(!exists) {
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey5, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if(!isNullOrNullVal(tgtR.wrk_no())) {
							continue;
						}
						if(!isNull(tgtR.dlv_cd())) {
							continue;
						}
						exists = true;
						qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
						if(qty.isZero()) {
							break;
						}
					}
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey2, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if(!isNullOrNullVal(tgtR.wrk_no())) {
							continue;
						}
						if(!isNull(tgtR.dlv_cd())) {
							continue;
						}
						if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
							if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
								exists = true;
								qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
								if(qty.isZero()) {
									break;
								}
							}
						}
					}
				}
				
				// 販売計画のみキー一致しないものでの消込
				if(!exists) {
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey6, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if(!isNullOrNullVal(tgtR.wrk_no())) {
							continue;
						}
						if(!isNullOrNullVal(tgtR.dlv_cd()) || !isNullOrNullVal(tgtR.cst_cd())) {
							continue;
						}
						qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
						if(qty.isZero()) {
							break;
						}
					}
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey3, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if(!isNullOrNullVal(tgtR.wrk_no())) {
							continue;
						}
						if(!isNullOrNullVal(tgtR.dlv_cd()) || !isNullOrNullVal(tgtR.cst_cd())) {
							continue;
						}
						if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
							if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
								qty = calcDmndRecQty(dmndRecMapL, qty, r, tgtR);
								if(qty.isZero()) {
									break;
								}
							}
						}
					}
				}
			}
		}
		
		/**
		 * 需要情報消込マップの情報を作成、需要数の算出を行う
		 * @param dmndRecMapL　需要情報消込マップのリスト
		 * @param qty　消込残数
		 * @param r　消込元の日次需要
		 * @param tgtR　消込先の日次需要
		 */
		protected MCNumber calcDmndRecQty(MCList<MST_DMND_REC_MAP_R> dmndRecMapL, MCNumber qty, MST_DLY_DMND_R r, MST_DLY_DMND_R tgtR) {
			MST_DMND_REC_MAP_R dmndRecMapR = MST_DMND_REC_MAP_R.create();
			dmndRecMapR.fr_dmnd_no(r.dmnd_no());
			dmndRecMapR.to_dmnd_no(tgtR.dmnd_no());
			
			// 残数より消込先の需要数より大きい場合
			if(qty.gt(tgtR.dmnd_qty())) {
				qty = qty.subtract(tgtR.dmnd_qty());
				dmndRecMapR.rec_qty(tgtR.dmnd_qty());
				tgtR.dmnd_qty(MCNumber.ZERO);
				dmndRecMapL.add(dmndRecMapR);
			}
			else {
				dmndRecMapR.rec_qty(qty);
				tgtR.dmnd_qty(tgtR.dmnd_qty().subtract(qty));
				qty = MCNumber.ZERO;
				dmndRecMapL.add(dmndRecMapR);
			}
			
			return qty;
		}
		
		/**
		 * 日次需要情報の消込を行う
		 * @param dlyDmndL　消込前の日次需要情報
		 */
		protected void recDmnd(MCList<MST_DLY_DMND_R> dlyDmndL) {
			MCSortPolicy sortPolicy = new MCSortPolicy();
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_typ);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_period_typ);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_cd);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub1);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub2);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub3);
			sortPolicy.add(MCList.SortType.DESC, MST_DLY_DMND_R.$dmnd_dt);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_st_dt);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_end_dt);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$cst_cd);
			sortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dlv_cd);
			dlyDmndL.sort(sortPolicy);
			
			MCIndexKey dlyDmndKey = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ);
			MCIndexKey dlyDmndKey2 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ);

			MCSortPolicy tgtSortPolicy = new MCSortPolicy();
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_cd);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub1);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub2);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$itm_sub3);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_dt);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_st_dt);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dmnd_end_dt);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$cst_cd);
			tgtSortPolicy.add(MCList.SortType.ASC, MST_DLY_DMND_R.$dlv_cd);
			
			// 月次の顧客期間内示の消込
			MCList<MST_DLY_DMND_R> tmpL = dlyDmndL.subList(dlyDmndKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value());
			tmpL.sort(tgtSortPolicy);
			doDlyDmndRec(dlyDmndL, tmpL);

			// 旬次の顧客期間内示の消込
			tmpL = dlyDmndL.subList(dlyDmndKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value());
			tmpL.sort(tgtSortPolicy);
			doDlyDmndRec(dlyDmndL, tmpL);
			
			// 週次の顧客期間内示の消込
			tmpL = dlyDmndL.subList(dlyDmndKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value());
			tmpL.sort(tgtSortPolicy);
			doDlyDmndRec(dlyDmndL, tmpL);
			
			// 受注・仮受注の消込
			tmpL = dlyDmndL.subList(dlyDmndKey, MSC_DMND_TYP.SLO.value());
			tmpL.addAll(dlyDmndL.subList(dlyDmndKey, MSC_DMND_TYP.PRE_SLO.value()));
			tmpL.sort(tgtSortPolicy);

			doDlyDmndRec(dlyDmndL, tmpL);
		}
		
		/**
		 * 日次需要の消込計算
		 * @param dlyDmndL
		 * @param tgtL
		 */
		protected void doDlyDmndRec(MCList<MST_DLY_DMND_R> dlyDmndL, MCList<MST_DLY_DMND_R> tgtL) {
			MCIndexKey dlyDmndTgtKey = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd, MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$dlv_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey2 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd, MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey3 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey4 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd, MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$dlv_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd, MST_DLY_DMND_R.$dmnd_dt);
			MCIndexKey dlyDmndTgtKey5 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd, MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd, MST_DLY_DMND_R.$dmnd_dt);
			MCIndexKey dlyDmndTgtKey6 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd, MST_DLY_DMND_R.$dmnd_dt);
			MCIndexKey dlyDmndTgtKey7 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd, MST_DLY_DMND_R.$wrk_no, MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$dlv_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey8 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd, MST_DLY_DMND_R.$wrk_no, MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey9 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd, MST_DLY_DMND_R.$wrk_no, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd);
			MCIndexKey dlyDmndTgtKey10 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd, MST_DLY_DMND_R.$wrk_no, MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$dlv_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd, MST_DLY_DMND_R.$dmnd_dt);
			MCIndexKey dlyDmndTgtKey11 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd, MST_DLY_DMND_R.$wrk_no, MST_DLY_DMND_R.$cst_cd, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd, MST_DLY_DMND_R.$dmnd_dt);
			MCIndexKey dlyDmndTgtKey12 = dlyDmndL.createIndex(MST_DLY_DMND_R.$dmnd_typ, MST_DLY_DMND_R.$dmnd_period_typ, MST_DLY_DMND_R.$dmnd_loc_cd, MST_DLY_DMND_R.$wrk_no, MST_DLY_DMND_R.$itm_cd, MST_DLY_DMND_R.$itm_sub1, MST_DLY_DMND_R.$itm_sub2, MST_DLY_DMND_R.$itm_sub3, MST_DLY_DMND_R.$dmnd_dpt_cd, MST_DLY_DMND_R.$dmnd_dt);
			
			
			for(MST_DLY_DMND_R r : tgtL) {

				MCNumber recQty = r.dmnd_qty();
				boolean exists = false;
				
				// 受注、仮受注の場合のみ
				if(MSC_DMND_TYP.isPRE_SLO(r.dmnd_typ()) || MSC_DMND_TYP.isSLO(r.dmnd_typ())) {

					// 週次の顧客期間内示での消込
					
					// 案件、得意先、納品先一致での消込
					// 日付が一致する需要を優先して消込
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey10, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if(isNullOrNullVal(tgtR.wrk_no())) {
							continue;
						}
						exists = true;
						recQty = calcDmndQty(recQty, tgtR);
					}
					
					// 日付が一致せず、期間が含まれる場合
					if(recQty.isPositive()) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey7, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
							if(isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									exists = true;
									recQty = calcDmndQty(recQty, tgtR);
								}
							}
						}
					}
					
					// 案件、得意先一致での消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey11, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNull(tgtR.dlv_cd()) || isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							exists = true;
							recQty = calcDmndQty(recQty, tgtR);
						}
						if(recQty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey8, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNull(tgtR.dlv_cd()) || isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										recQty = calcDmndQty(recQty, tgtR);
									}
								}
							}
						}
					}
					
					// 得意先、納品先一致での消込
					// 日付が一致する需要を優先して消込
					if(!exists) {
						// 日付が一致する需要を優先して消込
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey4, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							exists = true;
							recQty = calcDmndQty(recQty, tgtR);
						}
						
						// 日付が一致せず、期間が含まれる場合
						if(recQty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										recQty = calcDmndQty(recQty, tgtR);
									}
								}
							}
						}
					}
	
					// 得意先一致での消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey5, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							exists = true;
							recQty = calcDmndQty(recQty, tgtR);
						}
						if(recQty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.WEEKLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(!isNull(tgtR.dlv_cd())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										recQty = calcDmndQty(recQty, tgtR);
									}
								}
							}
						}
					}
				}
				
				// 受注、仮受注、週次の顧客期間内示は消込を行う
				if(MSC_DMND_TYP.isPRE_SLO(r.dmnd_typ()) || MSC_DMND_TYP.isSLO(r.dmnd_typ())
						|| (MSC_DMND_TYP.isCST_FRCST(r.dmnd_typ()) && MAC_PERIOD_TYP.isWEEKLY(r.dmnd_period_typ()))) {

					// 旬次の顧客期間内示での消込
					exists = false;
					
					// 案件、得意先、納品先一致での消込
					// 日付が一致する需要を優先して消込
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey10, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if(isNullOrNullVal(tgtR.wrk_no())) {
							continue;
						}
						exists = true;
						recQty = calcDmndQty(recQty, tgtR);
					}
					
					// 日付が一致せず、期間が含まれる場合
					if(recQty.isPositive()) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey7, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
							if(isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									exists = true;
									recQty = calcDmndQty(recQty, tgtR);
								}
							}
						}
					}
					
					// 案件、得意先一致での消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey11, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNull(tgtR.dlv_cd()) || isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							exists = true;
							recQty = calcDmndQty(recQty, tgtR);
						}
						if(recQty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey8, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNull(tgtR.dlv_cd()) || isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										recQty = calcDmndQty(recQty, tgtR);
									}
								}
							}
						}
					}
					
					// 得意先、納品先一致での消込
					// 日付が一致する需要を優先して消込
					if(!exists) {
						// 日付が一致する需要を優先して消込
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey4, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							exists = true;
							recQty = calcDmndQty(recQty, tgtR);
						}
						
						// 日付が一致せず、期間が含まれる場合
						if(recQty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										recQty = calcDmndQty(recQty, tgtR);
									}
								}
							}
						}
					}
	
					// 得意先一致での消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey5, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							exists = true;
							recQty = calcDmndQty(recQty, tgtR);
						}
						if(recQty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.TENDAYS.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(!isNull(tgtR.dlv_cd())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										recQty = calcDmndQty(recQty, tgtR);
									}
								}
							}
						}
					}					
				}
				
				
				// 受注、仮受注、週次・旬次の顧客期間内示は消込を行う
				if(MSC_DMND_TYP.isPRE_SLO(r.dmnd_typ()) || MSC_DMND_TYP.isSLO(r.dmnd_typ())
						|| (MSC_DMND_TYP.isCST_FRCST(r.dmnd_typ()) && MAC_PERIOD_TYP.isWEEKLY(r.dmnd_period_typ()))
						|| (MSC_DMND_TYP.isCST_FRCST(r.dmnd_typ()) && MAC_PERIOD_TYP.isTENDAYS(r.dmnd_period_typ()))) {

					// 月次の顧客期間内示での消込
					exists = false;
					
					// 案件、得意先、納品先一致での消込
					// 日付が一致する需要を優先して消込
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey10, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if(isNullOrNullVal(tgtR.wrk_no())) {
							continue;
						}
						exists = true;
						recQty = calcDmndQty(recQty, tgtR);
					}
					
					// 日付が一致せず、期間が含まれる場合
					if(recQty.isPositive()) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey7, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
							if(isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									exists = true;
									recQty = calcDmndQty(recQty, tgtR);
								}
							}
						}
					}
					
					// 案件、得意先一致での消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey11, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNull(tgtR.dlv_cd()) || isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							exists = true;
							recQty = calcDmndQty(recQty, tgtR);
						}
						if(recQty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey8, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNull(tgtR.dlv_cd()) || isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										recQty = calcDmndQty(recQty, tgtR);
									}
								}
							}
						}
					}
					
					// 得意先、納品先一致での消込
					// 日付が一致する需要を優先して消込
					if(!exists) {
						// 日付が一致する需要を優先して消込
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey4, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							exists = true;
							recQty = calcDmndQty(recQty, tgtR);
						}
						
						// 日付が一致せず、期間が含まれる場合
						if(recQty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.dlv_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										recQty = calcDmndQty(recQty, tgtR);
									}
								}
							}
						}
					}
	
					// 得意先一致での消込
					if(!exists) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey5, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							exists = true;
							recQty = calcDmndQty(recQty, tgtR);
						}
						if(recQty.isPositive()) {
							for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey2, MSC_DMND_TYP.CST_FRCST.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
								if(!isNullOrNullVal(tgtR.wrk_no())) {
									continue;
								}
								if(!isNull(tgtR.dlv_cd())) {
									continue;
								}
								if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
									if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
										exists = true;
										recQty = calcDmndQty(recQty, tgtR);
									}
								}
							}
						}
					}
				}

				
				
				// 販売計画での消込はすべて行う
				
				// 案件、得意先一致での消込
				exists = false;
				for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey11, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
					if(!isNull(tgtR.dlv_cd()) || isNullOrNullVal(tgtR.wrk_no())) {
						continue;
					}
					exists = true;
					recQty = calcDmndQty(recQty, tgtR);
				}
				if(recQty.isPositive()) {
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey8, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
						if(!isNull(tgtR.dlv_cd()) || isNullOrNullVal(tgtR.wrk_no())) {
							continue;
						}
						if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
							if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
								exists = true;
								recQty = calcDmndQty(recQty, tgtR);
								if(recQty.isZero()) {
									break;
								}
							}
						}
					}
				}
				
				// 販売計画のみ案件一致での消込
				if(!exists) {
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey12, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if (isNullOrNullVal(tgtR.wrk_no())) {
							continue;
						}
						exists = true;
						recQty = calcDmndQty(recQty, tgtR);
					}
					if(recQty.isPositive()) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey9, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.wrk_no(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
							if (isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									exists = true;
									recQty = calcDmndQty(recQty, tgtR);
								}
							}
						}
					}
				}
				
				// 得意先一致での消込
				if(!exists) {
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey5, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if(!isNullOrNullVal(tgtR.wrk_no())) {
							continue;
						}
						if(!isNull(tgtR.dlv_cd())) {
							continue;
						}
						exists = true;
						recQty = calcDmndQty(recQty, tgtR);
					}
					if(recQty.isPositive()) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey2, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.cst_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
							if(!isNullOrNullVal(tgtR.wrk_no())) {
								continue;
							}
							if(!isNull(tgtR.dlv_cd())) {
								continue;
							}
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									exists = true;
									recQty = calcDmndQty(recQty, tgtR);
								}
							}
						}
					}
				}
				
				// 販売計画のみキー一致しないものでの消込
				if(!exists) {
					for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey6, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd(), r.dmnd_dt())) {
						if(!isNullOrNullVal(tgtR.wrk_no()) || !isNullOrNullVal(tgtR.dlv_cd()) || !isNullOrNullVal(tgtR.cst_cd())) {
							continue;
						}
						recQty = calcDmndQty(recQty, tgtR);
					}
					if(recQty.isPositive()) {
						for(MST_DLY_DMND_R tgtR : dlyDmndL.subList(dlyDmndTgtKey3, MSC_DMND_TYP.PLN_SLS.value(), MAC_PERIOD_TYP.MONTHLY.value(), r.dmnd_loc_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dmnd_dpt_cd())) {
							if(!isNullOrNullVal(tgtR.wrk_no()) || !isNullOrNullVal(tgtR.dlv_cd()) || !isNullOrNullVal(tgtR.cst_cd())) {
								continue;
							}
							if(tgtR.dmnd_st_dt().lte(r.dmnd_dt()) && tgtR.dmnd_end_dt().gte(r.dmnd_dt())) {
								if(!isSame(r.dmnd_dt(), tgtR.dmnd_dt())) {
									recQty = calcDmndQty(recQty, tgtR);
								}
							}
						}
					}
				}
			}
		}
		
		/**
		 * 日次需要の消込後の数量を算出する
		 * @param recQty　消込残数量
		 * @param tgtR　消込先の日次需要
		 * @return
		 */
		protected MCNumber calcDmndQty(MCNumber recQty, MST_DLY_DMND_R tgtR) {
			if(!recQty.isZero()) {
				if(recQty.gt(tgtR.dmnd_qty())) {
					recQty = recQty.subtract(tgtR.dmnd_qty());
					tgtR.dmnd_qty(MCNumber.ZERO);
				}
				else {
					tgtR.dmnd_qty(tgtR.dmnd_qty().subtract(recQty));
					recQty = MCNumber.ZERO;
				}
			}
			return recQty;
		}
	}

	//FMCB CUSTOM END
}