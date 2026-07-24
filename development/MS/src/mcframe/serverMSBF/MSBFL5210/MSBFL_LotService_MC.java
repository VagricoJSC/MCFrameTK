package mcframe.serverMSBF.MSBFL5210;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMSBF.MSBFL5010.*;
import static mcframe.serverMSBF.MSBFL5210.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_LotService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_LotService_MC extends MSBFL_LotService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Lot_Srch01オペレーション.<p>
	 *
	 * 有効期限・使用期限を取得する。<br>
	 */
	public class Lot_Srch01 extends MSBFL_LotService_MC_A.Lot_Srch01 {
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			for (Lot_Srch01_CndR up0R : up0()) {
				if (!isCalcLmt(up0R)) {
					Lot_Srch01_RsltR down0R = Lot_Srch01_RsltR.create();
					down0R.peg_no(up0R.peg_no());
					down0R.lmt_dt_frm(up0R.lmt_dt_frm());
					down0R.vld_dt(null);
					down0R.lmt_dt(up0R.lmt_dt());
					down0().add(down0R);
				}
				else {
					Lot_Srch01_RsltR down0R = setLmt(up0R);
					down0R.peg_no(up0R.peg_no());
					down0().add(down0R);
				}
			}
		}
		
		protected MCDate getLmtDtFrm(Lot_Srch01_CndR up0R) {
			if (!isNull(up0R.lmt_dt_frm())) {
				//起算日が渡されてきた場合は、期限起算日区分に関わらずその日付を使用する。
				return up0R.lmt_dt_frm();
			}
			if (MSC_INSP_TYP.isACCPT(up0R.insp_typ())) {
				return getAccptLmtDtFrm(up0R);
			}
			else if (MSC_INSP_TYP.isPRDCT(up0R.insp_typ())) {
				return getPrdctLmtDtFrm(up0R);
			}
			
			return null;
		}
		
		protected MCDate getAccptLmtDtFrm(Lot_Srch01_CndR up0R) {
			if (MAC_LMT_DT_FRM_TYP.isARR_DT(up0R.lmt_dt_frm_typ())){
				return getArrDt(up0R);
			}
			if (MAC_LMT_DT_FRM_TYP.isMFG_ST(up0R.lmt_dt_frm_typ())) {
				// 外注の場合、品目製造指図：製造実績＝１：Ｎの場合になることはないので、
				// 出来高実績ＮＯは設定しない。
				return getMfgActStDt(getSpplItmMfgInstNo(up0R), null);
			}
			else if (MAC_LMT_DT_FRM_TYP.isMFG_CMPL(up0R.lmt_dt_frm_typ())) {
				return getMfgEndActDt(up0R);
			}
			else if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD_FR_DT(up0R.lmt_dt_frm_typ())) {
				return getChldFrDt(getSpplItmMfgInstNo(up0R), null);
			}
			return up0R.lmt_dt_frm();
		}
		
		protected MCDate getPrdctLmtDtFrm(Lot_Srch01_CndR up0R) {
			if (MAC_LMT_DT_FRM_TYP.isMFG_ST(up0R.lmt_dt_frm_typ())) {
				return getMfgActStDt(up0R.src_no2(), up0R.src_no4());
			}
			else if (MAC_LMT_DT_FRM_TYP.isMFG_CMPL(up0R.lmt_dt_frm_typ())) {
				return getYiledActDt(up0R);
			}
			else if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD_FR_DT(up0R.lmt_dt_frm_typ())) {
				return getChldFrDt(up0R.src_no2(), up0R.src_no4());
			}
			return up0R.lmt_dt_frm();
		}
		
		protected MCDate getArrDt(Lot_Srch01_CndR up0R) {
			MST_ARR_ACT_R dbc = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			createStArrDR(up0R, dbc, dbc_bldr);
			dbSelect("MSBFL5210_MST_ARR_ACT_S01", dbc, dbc_bldr);
			return dbc.arr_tm();
		}
		
		// 外注品入荷時で期限起算日区分が製造完了日の場合
		protected MCDate getMfgEndActDt(Lot_Srch01_CndR up0R) {
			MCList<MST_MFG_ACT_R> dbc = MCList.create(MST_MFG_ACT_R.class);
			MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			createSpplMfgActR(up0R, t, dbc_bldr);
			dbSelect("MSBFL5210_MST_MFG_ACT_S01", dbc, dbc_bldr);
			if (!isNull((MCDate) dbc.min(MST_MFG_ACT_R.$end_act_tm))) {
				return (MCDate) dbc.min(MST_MFG_ACT_R.$end_act_tm);
			}
			else {
				// 製造実績の終了実績日時が取得できない場合は、入荷実績の入荷日時
				return getArrDt(up0R);
			}
		}
		
		protected void createSpplMfgActR(Lot_Srch01_CndR up0R, MST_MFG_ACT_R t, MCQueryApiBuilder dbc_bldr) {
			MST_MFG_INST_R t2 = MST_MFG_INST_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			dbc_bldr.setSelect(t.end_act_tm);
			dbc_bldr.setWhere(t3.arr_schd_no.eq(bind("1")), up0R.src_no3());
			dbc_bldr.addInnerJoin(t2, bracket( t.mfg_inst_no.eq(t2.mfg_inst_no)));
			dbc_bldr.addInnerJoin(t3, bracket( t2.mfg_inst_no.eq(t3.mfg_inst_no)));
		}
		
		protected MCDate getMfgActStDt(String itmMfgInstNo, String yieldActNo) {
			MST_OPER_ACT_R actR = MST_OPER_ACT_R.create();
			Lot_Srch01_CndR bindR = Lot_Srch01_CndR.create();
			bindR.src_no2(itmMfgInstNo);
			
			executeQuery(actR, MSBFL5210_MST_ITM_MFG_INST_S01(), bindR);
			
			if (!isNull(actR.itm_mfg_inst_no())) {
				if (!isNull(actR.st_act_tm())) {
					return actR.st_act_tm().startTimeOfDay();
				}
				else {
					return null;
				}
			}
			else {
				MCList<MST_MFG_ACT_R> dbc = MCList.create(MST_MFG_ACT_R.class);
				MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				createMfgActR(itmMfgInstNo, yieldActNo, t, dbc_bldr);
				dbSelect("MSBFL5210_MST_MFG_ACT_S02", dbc, dbc_bldr);
				return (MCDate)dbc.min(MST_MFG_ACT_R.$st_act_tm);
			}
		}

		/**
		 * 引継対象子品目の起算日を取得する
		 * @param itmMfgInstNo 品目製造指図ＮＯ
		 * @param yieldActNo 出来高実績ＮＯ
		 * @return 起算日
		 */
		protected MCDate getChldFrDt(String itmMfgInstNo, String yieldActNo) {
			MSVT_LOT_LIST_R lot = getChldLotR(itmMfgInstNo, yieldActNo);
			return lot.lmt_dt_frm();
		}
		
		/**
		 * 引継対象子品目のロット情報を取得する
		 * @param itmMfgInstNo 品目製造指図ＮＯ
		 * @param yieldActNo 出来高実績ＮＯ
		 * @return ロット情報
		 */
		protected MSVT_LOT_LIST_R getChldLotR(String itmMfgInstNo, String yieldActNo) {

			// 出来高実績ＮＯまたは品目製造指図ＮＯから該当のロット情報を取得
			MCList<MSVT_LOT_LIST_R> lotL = getChldLotL(itmMfgInstNo, yieldActNo);
			
			if (lotL.isEmpty()) {
				return MSVT_LOT_LIST_R.create();
			}
			
			// 有効期限、最古入庫日、ロットシーケンスを元に引継ぎ対象の子品目を１件取得する
			lotL.sort(MSVT_LOT_LIST_R.$vld_dt,
					MSVT_LOT_LIST_R.$first_gr_dt,
					MSVT_LOT_LIST_R.$lot_seq);
			
			return lotL.get(0);
		}
		
		/**
		 * 引継対象子品目のロット情報をリストで取得する
		 * @param itmMfgInstNo 品目製造指図ＮＯ
		 * @param yieldActNo 出来高実績ＮＯ
		 * @return ロット情報リスト
		 */
		protected MCList<MSVT_LOT_LIST_R> getChldLotL(String itmMfgInstNo, String yieldActNo) {
			MCList<MSVT_LOT_LIST_R> lotL = MCList.create(MSVT_LOT_LIST_R.class);
		
			// 出来高実績ＮＯをワークテーブルに追加
			if (!isNull(yieldActNo)) {
				MCList<MST_YIELD_ACT_R> yaL = MCList.create(MST_YIELD_ACT_R.class);
				MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder yaL_bldr = MCQueryApiBuilder.create(t);
				MST_YIELD_ACT_R yaR = MST_YIELD_ACT_R.create();
				yaR.yield_act_no(yieldActNo);
				yaL.add(yaR);
				dbWkDelete("MSBFL5210_MSW_YIELD_ACT_D01", yaL_bldr.getBaseDbc());
				dbWkInsert("MSBFL5210_MSW_YIELD_ACT_I01", yaL, yaL_bldr.getBaseDbc());
			
				// 出来高実績ＮＯを元に投入実績からロット情報を取得
				executeQuery(lotL, MSBFL5210_MST_INPT_ACT_S01());
				
				if (!lotL.isEmpty()) {
					return lotL;
				}
			}
			
			// 品目製造指図ＮＯをワークテーブルに追加（品目単位製造指図）
			MCList<MST_ITM_MFG_INST_R> imiL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder imiL_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_MFG_INST_R imiR = MST_ITM_MFG_INST_R.create();
			imiR.itm_mfg_inst_no(itmMfgInstNo);
			imiL.add(imiR);
			dbWkDelete("MSBFL5210_MSW_ITM_MFG_INST_D01", imiL_bldr.getBaseDbc());
			dbWkInsert("MSBFL5210_MSW_ITM_MFG_INST_I01", imiL, imiL_bldr.getBaseDbc());

			// 品目製造指図ＮＯを元に投入実績からロット情報を取得（工程単位製造指図）
			executeQuery(lotL, MSBFL5210_MST_INPT_ACT_S02());
			
			if (!lotL.isEmpty()) {
				return lotL;
			}
			
			// 品目製造指図ＮＯを元に投入予定からロット情報を取得（投入実績未発生または外注）
			executeQuery(lotL, MSBFL5210_MST_INPT_SCHD_S01());
			
			return lotL;
		}
		
		protected MCDate getYiledActDt(Lot_Srch01_CndR up0R) {
			MST_OPER_ACT_R actR = MST_OPER_ACT_R.create();

			executeQuery(actR, MSBFL5210_MST_ITM_MFG_INST_S01(), up0R);
			
			if (!isNull(actR.itm_mfg_inst_no())) {
				if (!isNull(actR.end_act_tm())) {
					return actR.end_act_tm().startTimeOfDay();
				}
				else {
					return null;
				}
			}
			else {
				return getPrdctMfgEndActDt(up0R);
			}
		}
		
		protected Lot_Srch01_RsltR setLmt(Lot_Srch01_CndR up0R) {
			Lot_Srch01_RsltR down0R = Lot_Srch01_RsltR.create();
			
			// 起算日を設定
			down0R.lmt_dt_frm(getLmtDtFrm(up0R));
			
			if (!isNull(down0R.lmt_dt_frm())) {
				//起算日を元に有効期限・使用期限算出。
				down0R.vld_dt(calcDt(down0R.lmt_dt_frm(), up0R.calc_pd_typ(), up0R.vld_pd()));
				down0R.lmt_dt(calcDt(down0R.lmt_dt_frm(), up0R.calc_pd_typ(), up0R.lmt_pd()));
			}
			else {
				if (MSC_INSP_TYP.isACCPT(up0R.insp_typ())) {
					setAccptLmtNonLmtDtFrm(up0R, down0R);
				}
				else if (MSC_INSP_TYP.isPRDCT(up0R.insp_typ())) {
					setPrdctLmtNonLmtDtFrm(up0R, down0R);
				}
			}
			
			//ロット検査の場合は、使用期限を延長できないため
			//算出した値を破棄して上り電文の値に上書き。
			if (MSC_INSP_TYP.isLOT(up0R.insp_typ())) {
				if (!isNull(up0R.lmt_dt())) {
					down0R.lmt_dt(up0R.lmt_dt());
				}
			}
			
			//仮に有効期限＞使用期限となった場合、有効期限は使用期限までとする。
			if (!isNull(down0R.vld_dt()) && !isNull(down0R.lmt_dt())) {
				if (down0R.lmt_dt().lt(down0R.vld_dt())) {
					down0R.vld_dt(down0R.lmt_dt());
				}
			}
			
			return down0R;
		}
		/**
		 * 起算日を元にしない場合の期限算出(受入検査)。
		 */
		protected void setAccptLmtNonLmtDtFrm(Lot_Srch01_CndR up0R, Lot_Srch01_RsltR down0R) {
			if (MAC_LMT_DT_FRM_TYP.isDPND_SHIP_FR(up0R.lmt_dt_frm_typ())){
				MST_ARR_ACT_R dbc = MST_ARR_ACT_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
				createStArrDR(up0R, dbc, dbc_bldr);
				dbSelect("MSBFL5210_MST_ARR_ACT_S02", dbc, dbc_bldr);
				down0R.vld_dt(dbc.ship_fr_valid_dt());
				down0R.lmt_dt(dbc.ship_fr_valid_dt());
			}
			else if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD(up0R.lmt_dt_frm_typ())){
				MSVT_LOT_LIST_R lot = getChldLotR(getSpplItmMfgInstNo(up0R), null);
				down0R.vld_dt(lot.vld_dt());
				down0R.lmt_dt(lot.lmt_dt());
			}
		}
		/**
		 * 起算日を元にしない場合の期限算出(製造検査)。
		 */
		protected void setPrdctLmtNonLmtDtFrm(Lot_Srch01_CndR up0R, Lot_Srch01_RsltR down0R) {
			if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD(up0R.lmt_dt_frm_typ())){
				MSVT_LOT_LIST_R lot = getChldLotR(up0R.src_no2(), up0R.src_no4());
				down0R.vld_dt(lot.vld_dt());
				down0R.lmt_dt(lot.lmt_dt());
			}
		}
		
		protected String getSpplItmMfgInstNo(Lot_Srch01_CndR up0R) {
			MST_ITM_MFG_INST_R dbc = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			MST_MFG_INST_R t2 = MST_MFG_INST_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			dbc_bldr.setSelect(dbc.itm_mfg_inst_no);
			dbc_bldr.addInnerJoin(t2, bracket( dbc.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
			dbc_bldr.addInnerJoin(t3, bracket( t2.mfg_inst_no.eq(t3.mfg_inst_no)));
			dbc_bldr.setWhere(t3.arr_schd_no.eq(bind("1")), up0R.src_no3());
			dbSelect("MSBFL5210_MST_ITM_MFG_INST_S01", dbc, dbc_bldr);
			return dbc.itm_mfg_inst_no();
		}
		
		protected void createStArrDR(Lot_Srch01_CndR up0R, MST_ARR_ACT_R dbc,
				MCQueryApiBuilder dbc_bldr) {
			dbc_bldr.setSelect(dbc.ship_fr_valid_dt);
			dbc_bldr.addSelect(dbc.arr_tm);
			dbc_bldr.setWhere(dbc.arr_act_no.eq(bind("1")), up0R.src_no4());
			dbc_bldr.addWhereWithAnd(dbc.can_flg.eq(value(false)));
			if (MAC_LMT_DT_FRM_TYP.isDPND_SHIP_FR(up0R.lmt_dt_frm_typ())) {
				MAM_ITM_R m1 = MAM_ITM_R.create("M1");
				
				dbc_bldr.addInnerJoin(m1, bracket(m1.itm_cd.eq(dbc.itm_cd)
						.and(m1.itm_sub1.eq(dbc.itm_sub1))
						.and(m1.itm_sub2.eq(dbc.itm_sub2))
						.and(m1.itm_sub3.eq(dbc.itm_sub3))));
				
				dbc_bldr.addWhereWithAnd(m1.lmt_ctl_flg.eq(value(true)));
			}
		}
		
		protected void createMfgActR(String itmMfgInstNo, String yieldActNo,
				MST_MFG_ACT_R t, MCQueryApiBuilder dbc_bldr) {
			// 品目製造指図：製造実績＝１：Ｎの場合を考慮し、リストでＳＱＬを発行する
			MST_YIELD_ACT_R t1 = MST_YIELD_ACT_R.create("T1");
			dbc_bldr.setSelect(t.st_act_tm);
			dbc_bldr.setWhere(t.itm_mfg_inst_no.eq(bind("1")), itmMfgInstNo);
			if (!isNull(yieldActNo)) {
				dbc_bldr.setWhere(t1.yield_act_no.eq(bind("1")), yieldActNo);
				dbc_bldr.addInnerJoin(t1, bracket(t.mfg_act_no.eq(t1.mfg_act_no)));
			}
		}
		
		protected void createYieldActR(Lot_Srch01_CndR up0R, MST_YIELD_ACT_R t,
				MCQueryApiBuilder dbc_bldr) {
			MST_OPER_ACT_R t2 = MST_OPER_ACT_R.create("T2");
			dbc_bldr.setSelect(t.act_tm);
			if (MSC_INSP_TYP.isACCPT(up0R.insp_typ())) {
				dbc_bldr.addInnerJoin(t2, bracket(t.oper_act_no.eq(t2.oper_act_no)));
				dbc_bldr.setWhere(t2.arr_act_no.eq(bind("1")), up0R.src_no4());
			}
			if (MSC_INSP_TYP.isPRDCT(up0R.insp_typ())) {
				dbc_bldr.setWhere(t.yield_act_no.eq(bind("1")), up0R.src_no4());
			}
		}
		
		protected MCDate getPrdctMfgEndActDt(Lot_Srch01_CndR up0R) {
			MCList<MST_MFG_ACT_R> dbc = MCList.create(MST_MFG_ACT_R.class);
			MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_YIELD_ACT_R t2 = MST_YIELD_ACT_R.create("T2");
			dbc_bldr.setSelect(t.end_act_tm);
			dbc_bldr.addInnerJoin(t2, bracket( t.mfg_act_no.eq(t2.mfg_act_no)));
			dbc_bldr.setWhere(t2.yield_act_no.eq(bind("1")), up0R.src_no4());
			dbSelect("MSBFL5210_MST_MFG_ACT_S03", dbc, dbc_bldr);

			if (!isNull((MCDate) dbc.min(MST_MFG_ACT_R.$end_act_tm))) {
				return (MCDate) dbc.min(MST_MFG_ACT_R.$end_act_tm);
			}
			else {
				MCList<MST_YIELD_ACT_R> actL = MCList.create(MST_YIELD_ACT_R.class);
				MST_YIELD_ACT_R actL_t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(actL_t);
				createYieldActR(up0R, actL_t, actL_bldr);
				dbSelect("MSBFL5210_MST_YIELD_ACT_S01", actL, actL_bldr);
				if (!isNull(actL.min(MST_YIELD_ACT_R.$act_tm))) {
					return (MCDate) actL.min(MST_YIELD_ACT_R.$act_tm);
				}
				return null;
			}
		}
		
		/**
		 * 期限算出
		 * @param lmtDtFrm
		 * @param calcPdTyp
		 * @param basePd
		 * @return
		 */
		protected MCDate calcDt(MCDate lmtDtFrm, String calcPdTyp, MCNumber basePd) {
			if (isNullOr(lmtDtFrm, basePd)) {
				return null;
			}
			
			if (MAC_CALC_PD_TYP.isMTH(calcPdTyp)) {
				// 月単位
				return lmtDtFrm.addMonth(basePd).endOfMonth();
			}
			else if (MAC_CALC_PD_TYP.isDT(calcPdTyp)) {
				// 日単位
				return lmtDtFrm.addDay(basePd);
			}
			else if (MAC_CALC_PD_TYP.isMTH_LAST_END(calcPdTyp)) {
				// 月（前月末起算）
				return lmtDtFrm.addMonth(basePd.subtract(1)).endOfMonth();
			}
			else if (MAC_CALC_PD_TYP.isMTH_LMT_DT(calcPdTyp)) {
				// 月（当日起算）
				// システムパラメータの値が "1" なら、月末であるかないかに関わらず、同日を指定する
				if (isSame(getSysParm("LMT_DT_END_OF_MONTH_FLG"),"1")){
					return lmtDtFrm.addMonth(basePd);
				}
				if (lmtDtFrm.eqDate(lmtDtFrm.endOfMonth())) {
					return lmtDtFrm.addMonth(basePd).endOfMonth();
				}
				else {
					return lmtDtFrm.addMonth(basePd);
				}
			}
			else if (MAC_CALC_PD_TYP.isMTH_PREV_LMT_DT(calcPdTyp)) {
				// 月（前日起算）
				MCDate bfrDt = lmtDtFrm.addDay(-1);
				if (bfrDt.eqDate(bfrDt.endOfMonth())) {
					return bfrDt.addMonth(basePd).endOfMonth();
				}
				else {
					return bfrDt.addMonth(basePd);
				}
			}
			return null;
		}
		/**
		 * 期限計算を行う必要があるかどうかを返す。
		 * @return
		 */
		protected boolean isCalcLmt(Lot_Srch01_CndR up0R) {
			if (MSC_INSP_TYP.isPRDCT(up0R.insp_typ())) {
				return isValidLmtDtFrmTypForPrdct(up0R);
			}
			else if (MSC_INSP_TYP.isACCPT(up0R.insp_typ())) {
				return isValidLmtDtFrmTypForAccpt(up0R);
			}
			else if (isNull(up0R.insp_typ())) {
				return MAC_LMT_DT_FRM_TYP.isDPND_CHLD_FR_DT(up0R.lmt_dt_frm_typ());
			}
			return true;
		}
		/**
		 * 製造検査の場合に有効な期限起算日区分かどうか
		 * @return
		 */
		protected boolean isValidLmtDtFrmTypForPrdct(Lot_Srch01_CndR up0R) {
			if (MAC_LMT_DT_FRM_TYP.isMFG_ST(up0R.lmt_dt_frm_typ())) return true;
			if (MAC_LMT_DT_FRM_TYP.isMFG_CMPL(up0R.lmt_dt_frm_typ())) return true;
			if (MAC_LMT_DT_FRM_TYP.isINSP_JUDG(up0R.lmt_dt_frm_typ())) return true;
			if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD(up0R.lmt_dt_frm_typ())) return true;
			if (MAC_LMT_DT_FRM_TYP.isMANUAL(up0R.lmt_dt_frm_typ())) return true;
			if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD_FR_DT(up0R.lmt_dt_frm_typ())) return true;
			return false;
		}
		/**
		 * 受入検査の場合に有効な期限起算日区分かどうか
		 * @return
		 */
		protected boolean isValidLmtDtFrmTypForAccpt(Lot_Srch01_CndR up0R) {
			if (MAC_LMT_DT_FRM_TYP.isMFG_ST(up0R.lmt_dt_frm_typ())) return true;
			if (MAC_LMT_DT_FRM_TYP.isMFG_CMPL(up0R.lmt_dt_frm_typ())) return true;
			if (MAC_LMT_DT_FRM_TYP.isINSP_JUDG(up0R.lmt_dt_frm_typ())) return true;
			if (MAC_LMT_DT_FRM_TYP.isDPND_SHIP_FR(up0R.lmt_dt_frm_typ())) return true;
			if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD(up0R.lmt_dt_frm_typ())) return true;
			if (MAC_LMT_DT_FRM_TYP.isARR_DT(up0R.lmt_dt_frm_typ())) return true;
			if (MAC_LMT_DT_FRM_TYP.isMANUAL(up0R.lmt_dt_frm_typ())) return true;
			if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD_FR_DT(up0R.lmt_dt_frm_typ())) return true;
			return false;
		}
	}
	/**
	 * Lot_Srch02オペレーション.<p>
	 *
	 * 検査指図単位で、有効期限・使用期限を取得する。<br>
	 */
	public class Lot_Srch02 extends MSBFL_LotService_MC_A.Lot_Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<Lot_Srch02_CndR> schdL = MCList.create(Lot_Srch02_CndR.class);
			MCList<Lot_Srch02_CndR> subUpL = MCList.create(Lot_Srch02_CndR.class);
			MCList<Lot_Srch02_CndR> calcUpL = MCList.create(Lot_Srch02_CndR.class);
			for (Lot_Srch02_CndR up0R : up0()) {
				MCList<Lot_Srch02_CndR> schdDbL = MCList.create(Lot_Srch02_CndR.class);
				Lot_Srch02_RsltR down0R = Lot_Srch02_RsltR.create();
				
				//検査指図に紐づく検査予定を取得
				//（予定をまとめていた場合は複数レコード取得される。）
				executeQuery(schdDbL, MSBFL5210_MST_INSP_SCHD_S01(), up0R);

				down0R.peg_no(up0R.peg_no());
				if (schdDbL.isEmpty()) {
					down0R.lmt_dt_frm_typ(null);
					down0R.lmt_dt_frm(up0R.lmt_dt_frm());
					down0R.vld_dt(null);
					down0R.lmt_dt(null);
					down0().add(down0R);
					continue;
				}

				schdDbL.addNumberColumn("par_peg_no", up0R.peg_no());
				schdL.addAll(schdDbL);
				subUpL.add(up0R);
			}
			
			setItmInsp(schdL);
			MCIndexKey schdIdxkey = schdL.createIndex("par_peg_no");
			for (Lot_Srch02_CndR up0R : subUpL) {
				MCList<Lot_Srch02_CndR> subSchdL = schdL.subList(schdIdxkey, up0R.peg_no());
				if (isNull(subSchdL.getFirst("sel_flg", true))) {
					// 品目品管マスタ情報が取得できない場合、エラーメッセージを出す
					if (!isNull(up0R.lmt_dt_frm())) {
						MCMessagePool.add(new MCMessage(up0R, null, MSBFL0112, up0R.insp_no(), toDispItm(
								schdL.get(0).itm_cd(), schdL.get(0).itm_sub1(), schdL.get(0).itm_sub2(), schdL.get(0).itm_sub3())
								, toDispGUIIndex(up0R)));
						continue;
					}
				}
				calcUpL.add(up0R);
			}
			
			down0().addAll(calcLmt(calcUpL, schdL));
		}
		
		protected void setItmInsp(MCList<Lot_Srch02_CndR> schdL) {
			MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			setPegNo(schdL);
			for (Lot_Srch02_CndR schdR : schdL) {
				InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
				
				oR.peg_no(schdR.peg_no());
				oR.itm_cd(schdR.itm_cd());
				oR.itm_sub1(schdR.itm_sub1());
				oR.itm_sub2(schdR.itm_sub2());
				oR.itm_sub3(schdR.itm_sub3());
				oR.mfg_loc_cd(schdR.mfg_loc_cd());
				oR.sppl_cd(schdR.sppl_cd());
				oR.maker_cd(schdR.maker_cd());
				oR.from_site_cd(null);
				oR.to_loc_cd(schdR.loc_cd());
				oR.insp_typ(schdR.insp_typ());
				oR.base_dt(schdR.master_dt());
				oR.insp_ptn_cd(null);
				oR.no_insp_srch_flg(true);
				
				o.up0().add(oR);
			}
			
			o.exec();

			MCIndexKey idx = o.down0().createIndex(InspSchd_Srch01_CndR.$peg_no);
			for (Lot_Srch02_CndR schdR : schdL) {
				InspSchd_Srch01_CndR downR = o.down0().getFirst(idx, schdR.peg_no());

				if (isNull(downR)) {
					schdR.addBooleanColumn("sel_flg", false);
					continue;
				}

				schdR.addBooleanColumn("sel_flg", true);
				if (MSC_INSP_TYP.isLOT(schdR.insp_typ())) {
					schdR.lmt_dt_frm_typ(nvl(downR.lot_insp_lmt_dt_frm_typ(), MAC_LMT_DT_FRM_TYP.INSP_JUDG.value()));
					schdR.vld_pd(nvl(downR.lot_insp_vld_pd(), downR.vld_pd()));
				}
				else {
					schdR.lmt_dt_frm_typ(downR.lmt_dt_frm_typ());
					schdR.vld_pd(downR.vld_pd());
				}
				schdR.lmt_pd(downR.lmt_pd());
				schdR.calc_pd_typ(downR.calc_pd_typ());
			}
		}
		
		/**
		 * Srch01から取得した期限をLot_Srch02_RtnRに格納して返す。<br>
		 * ※ある検査指図に対して複数の検査予定が存在し、かつ期限の候補が複数存在する場合は<br>
		 * 最も厳しい有効期限、使用期限を持つ行を返す。
		 * 
		 * @param up0L
		 * @param schdL
		 * @return
		 */
		protected MCList<Lot_Srch02_RsltR> calcLmt(MCList<Lot_Srch02_CndR> up0L, MCList<Lot_Srch02_CndR> schdL) {
			
			MCList<Lot_Srch02_RsltR> retRsltL = MCList.create(Lot_Srch02_RsltR.class);
			
			MCList<Lot_Srch01_RsltR> srch01RsltL = callLotSrch01(up0L, schdL);
			MCIndexKey idxkey = srch01RsltL.createIndex(Lot_Srch01_RsltR.$peg_no);
			MCIndexKey parIdxkey = schdL.createIndex("par_peg_no");
			for (Lot_Srch02_CndR upR : up0L) {
				MCList<Lot_Srch02_CndR> subSchdL = schdL.subList(parIdxkey, upR.peg_no());
				MCList<Lot_Srch02_RsltR> tmpL = MCList.create(Lot_Srch02_RsltR.class);
				for (Lot_Srch02_CndR schdR : subSchdL) {

					Lot_Srch01_RsltR oDown0R = srch01RsltL.getFirst(idxkey, schdR.peg_no());
					Lot_Srch02_RsltR rsltR = Lot_Srch02_RsltR.create();
					
					rsltR.lmt_dt_frm_typ(upR.lmt_dt_frm_typ());
					rsltR.lmt_dt_frm(oDown0R.lmt_dt_frm());
					rsltR.vld_dt(oDown0R.vld_dt());
					rsltR.lmt_dt(oDown0R.lmt_dt());
					tmpL.add(rsltR);
				}
				
				if (tmpL.size() == 1) {
					tmpL.get(0).peg_no(upR.peg_no());
					retRsltL.add(tmpL.get(0));
				}
				else {
					//最も厳しい有効期限を持つListを取得。
					MCDate minValidDt = (MCDate)tmpL.min(Lot_Srch02_RsltR.$vld_dt);
					MCList<Lot_Srch02_RsltR> minValidDtList = tmpL.subList(Lot_Srch02_RsltR.$vld_dt, minValidDt);
					
					if (minValidDtList.size() == 1) {
						//size() == 0はありえないので考慮しない。
						minValidDtList.get(0).peg_no(upR.peg_no());
						retRsltL.add(minValidDtList.get(0));
					}
					else {
						//最も厳しい使用期限を持つ行が複数存在した場合、
						//その中で最も厳しい使用期限を持つ行を取得。
						MCDate minLmtDt = (MCDate)minValidDtList.min(Lot_Srch02_RsltR.$lmt_dt);
						//複数行存在したとしても一行目を取得する。size() == 0はありえないので考慮しない。
						Lot_Srch02_RsltR rsltR = minValidDtList.subList(Lot_Srch02_RsltR.$lmt_dt, minLmtDt).get(0);
						rsltR.peg_no(upR.peg_no());
						retRsltL.add(rsltR);
					}
				}
			}

			return retRsltL;
		}

		/**
		 * 有効期限、使用期限取得サービスCALL
		 * 
		 * @param up0L
		 * @param schdL
		 * @return MCList<Lot_Srch01_RsltR>
		 */
		protected MCList<Lot_Srch01_RsltR> callLotSrch01(MCList<Lot_Srch02_CndR> up0L, MCList<Lot_Srch02_CndR> schdL) {
			MSBFL_LotService.Lot_Srch01 o = MSBFL_LotService.crtLot_Srch01();
			MCIndexKey idxkey = up0L.createIndex(Lot_Srch02_CndR.$peg_no);
			for (Lot_Srch02_CndR r : schdL) {
				Lot_Srch02_CndR up0R = up0L.getFirst(idxkey, r.getNumberNE("par_peg_no"));
				if (isNull(up0R)) {
					continue;
				}
				Lot_Srch01_CndR oR = Lot_Srch01_CndR.create();
				oR.lmt_dt_frm(up0R.lmt_dt_frm());
				oR.peg_no(r.peg_no());
				oR.insp_typ(r.insp_typ());
				oR.src_no1(r.src_no1());
				oR.src_no2(r.src_no2());
				oR.src_no3(r.src_no3());
				oR.src_no4(r.src_no4());
				oR.lmt_dt_frm_typ(r.lmt_dt_frm_typ());
				oR.vld_pd(r.vld_pd());
				oR.lmt_pd(r.lmt_pd());
				oR.calc_pd_typ(r.calc_pd_typ());
				oR.lmt_dt(r.lmt_dt());
				oR.base_dt(r.master_dt());
				oR.setAttributes(up0R);
				o.up0().add(oR);
			}

			if (!isNull(o.up0())) {
				o.exec();
			}
			
			return o.down0();
		}
	}
	/**
	 * Lot_Chk01オペレーション.<p>
	 *
	 * ロットの削除前にチェックを行う。<br>
	 */
	public class Lot_Chk01 extends MSBFL_LotService_MC_A.Lot_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(checkMain());

			MCMessagePool.addAll(msgL);

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		
		protected void createItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.sublot_mng_typ);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, up0(),
					MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3);
		}

		/**
		 * チェック処理
		 */
		protected MCMessageList checkMain() {
			createItmCache();
			
			MCMessageList msgL = new MCMessageList();
			for (Lot_Chk01_CndR up0R : up0()) {
				MAM_ITM_R itmR = _itmCache.get(up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3());
				
				//出来高指図チェック（予定ロットを削除する際に必要なチェック）
				if (existsYieldInst(up0R, itmR)) {
					if (up0R.exception_flg()) {
						up0R.err_flg(true);
					}
					else {
						msgL.add(new MCMessage(up0R, null, MSBFL0030, toDispItm(
								up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3()),
								up0R.lot_no(), up0R.sublot_no(), toDispGUIIndex(up0R)));
						up0R.err_flg(true);
					}
				}
				
				//入荷予定チェック（予定ロットを削除する際に必要なチェック）
				if (existsArrSchd(up0R, itmR)) {
					if (up0R.exception_flg()) {
						up0R.err_flg(true);
					}
					else {
						msgL.add(new MCMessage(up0R, null, MSBFL0031, toDispItm(
								up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3()),
								up0R.lot_no(), up0R.sublot_no(), toDispGUIIndex(up0R)));
						up0R.err_flg(true);
					}
				}
				
				//品目製造指図チェック（予定ロットを削除する際に必要なチェック）				
				if (existsItmMfgInst(up0R, itmR)) {
					if (up0R.exception_flg()) {	
						up0R.err_flg(true);
					}
					else {
						msgL.add(new MCMessage(up0R, null, MSBFL0141, toDispItm(		
								up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3()),
								up0R.lot_no(), up0R.sublot_no(), toDispGUIIndex(up0R)));
						up0R.err_flg(true);
					}
				}
				
				//入庫の受払実績チェック
				if (existsLotTraceGr(up0R, itmR)) {
					if (up0R.exception_flg()) {
						up0R.err_flg(true);
					}
					else {
						msgL.add(new MCMessage(up0R, null, MSBFL0032, toDispItm(
								up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3()),
								up0R.lot_no(), up0R.sublot_no(), toDispGUIIndex(up0R)));
						up0R.err_flg(true);
					}
				}
			}
			return msgL;
		}
		
		protected boolean chkReq(Lot_Chk01_CndR up0R) {
			return isNullOr(up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3(),
					up0R.lot_no(), up0R.sublot_no());
		}
		
		/**
		 * 上り電文で渡された値と同一ロットの受払実績が存在するかどうか
		 * @return
		 */
		protected boolean existsLotTraceGr(Lot_Chk01_CndR r, MAM_ITM_R itmR) {
			MST_LOT_TRACE_GR_R lotTraceGrR = MST_LOT_TRACE_GR_R.create("T");
			MCQueryApiBuilder lotTraceGrR_bldr = MCQueryApiBuilder.create(lotTraceGrR);
			String cntStr = "cnt";
			lotTraceGrR.addNumberColumn(cntStr);
			lotTraceGrR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			lotTraceGrR_bldr.setWhere(lotTraceGrR.itm_cd.eq(bind("1")), r.itm_cd());
			lotTraceGrR_bldr.addWhereWithAnd(lotTraceGrR.itm_sub1.eq(bind("1")), r.itm_sub1());
			lotTraceGrR_bldr.addWhereWithAnd(lotTraceGrR.itm_sub2.eq(bind("1")), r.itm_sub2());
			lotTraceGrR_bldr.addWhereWithAnd(lotTraceGrR.itm_sub3.eq(bind("1")), r.itm_sub3());
			lotTraceGrR_bldr.addWhereWithAnd(lotTraceGrR.lot_no.eq(bind("1")), r.lot_no());
			if (!MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
				lotTraceGrR_bldr.addWhereWithAnd(lotTraceGrR.sublot_no.eq(bind("1")), r.sublot_no());
			}
			lotTraceGrR_bldr.addWhereWithAnd(lotTraceGrR.schd_act_typ.eq(bind("1")), MSC_SCHD_ACT_TYP.ACT.value());
			dbSelect("MSBFL5210_MST_LOT_TRACE_GR_S01", lotTraceGrR, lotTraceGrR_bldr);
			
			return !lotTraceGrR.getNumber(cntStr).isZero();
		}
		
		/**
		 * 上り電文で渡された値と同一ロットの出来高指図が存在するかどうか
		 * @return
		 */
		protected boolean existsYieldInst(Lot_Chk01_CndR r ,MAM_ITM_R itmR) {
			MST_YIELD_SCHD_R yieldSchdR = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder yieldSchdR_bldr = MCQueryApiBuilder.create(yieldSchdR);
			String cntStr = "cnt";
			yieldSchdR.addNumberColumn(cntStr);
			yieldSchdR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			yieldSchdR_bldr.setWhere(yieldSchdR.itm_cd.eq(bind("1")), r.itm_cd());
			yieldSchdR_bldr.addWhereWithAnd(yieldSchdR.itm_sub1.eq(bind("1")), r.itm_sub1());
			yieldSchdR_bldr.addWhereWithAnd(yieldSchdR.itm_sub2.eq(bind("1")), r.itm_sub2());
			yieldSchdR_bldr.addWhereWithAnd(yieldSchdR.itm_sub3.eq(bind("1")), r.itm_sub3());
			yieldSchdR_bldr.addWhereWithAnd(yieldSchdR.lot_no.eq(bind("1")), r.lot_no());
			if (!MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
				yieldSchdR_bldr.addWhereWithAnd(yieldSchdR.sublot_no.eq(bind("1")), r.sublot_no());
			}
			yieldSchdR_bldr.addWhereWithAnd(yieldSchdR.can_flg.eq(value(false)));
			dbSelect("MSBFL5210_MST_YIELD_SCHD_S01", yieldSchdR, yieldSchdR_bldr);
			
			return !yieldSchdR.getNumber(cntStr).isZero();
		}
		
		/**
		 * 上り電文で渡された値と同一ロットの入荷予定が存在するかどうか
		 * @return
		 */
		protected boolean existsArrSchd(Lot_Chk01_CndR r, MAM_ITM_R itmR) {
			MST_ARR_SCHD_R arrSchdR = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrSchdR_bldr = MCQueryApiBuilder.create(arrSchdR);
			String cntStr = "cnt";
			arrSchdR.addNumberColumn(cntStr);
			arrSchdR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			arrSchdR_bldr.setWhere(arrSchdR.itm_cd.eq(bind("1")), r.itm_cd());
			arrSchdR_bldr.addWhereWithAnd(arrSchdR.itm_sub1.eq(bind("1")), r.itm_sub1());
			arrSchdR_bldr.addWhereWithAnd(arrSchdR.itm_sub2.eq(bind("1")), r.itm_sub2());
			arrSchdR_bldr.addWhereWithAnd(arrSchdR.itm_sub3.eq(bind("1")), r.itm_sub3());
			arrSchdR_bldr.addWhereWithAnd(arrSchdR.lot_no.eq(bind("1")), r.lot_no());
			if (!MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
				arrSchdR_bldr.addWhereWithAnd(arrSchdR.sublot_no.eq(bind("1")), r.sublot_no());
			}
			arrSchdR_bldr.addWhereWithAnd(arrSchdR.abort_flg.eq(value(false)));
			dbSelect("MSBFL5210_MST_ARR_SCHD_S01", arrSchdR, arrSchdR_bldr);
			
			return !arrSchdR.getNumber(cntStr).isZero();
		}
		
		/**
		 * 上り電文で渡された値と同一ロットの品目製造指図が存在するかどうか
		 * @return
		 */
		protected boolean existsItmMfgInst(Lot_Chk01_CndR r, MAM_ITM_R itmR) {
			MST_ITM_MFG_INST_R mfgSchdR = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder mfgSchdR_bldr = MCQueryApiBuilder.create(mfgSchdR);
			String cntStr = "cnt";
			mfgSchdR.addNumberColumn(cntStr);
			mfgSchdR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			mfgSchdR_bldr.setWhere(mfgSchdR.itm_cd.eq(bind("1")), r.itm_cd());
			mfgSchdR_bldr.addWhereWithAnd(mfgSchdR.itm_sub1.eq(bind("1")), r.itm_sub1());
			mfgSchdR_bldr.addWhereWithAnd(mfgSchdR.itm_sub2.eq(bind("1")), r.itm_sub2());
			mfgSchdR_bldr.addWhereWithAnd(mfgSchdR.itm_sub3.eq(bind("1")), r.itm_sub3());
			mfgSchdR_bldr.addWhereWithAnd(mfgSchdR.lot_no.eq(bind("1")), r.lot_no());
			if (!MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
				mfgSchdR_bldr.addWhereWithAnd(mfgSchdR.sublot_no.eq(bind("1")), r.sublot_no());
			}
			mfgSchdR_bldr.addWhereWithAnd(mfgSchdR.can_flg.eq(value(false)));
			dbSelect("MSBFL5210_MST_ITM_MFG_INST_S01", mfgSchdR, mfgSchdR_bldr);
			
			return !mfgSchdR.getNumber(cntStr).isZero();
		}
	}
	/**
	 * Lot_Chk02オペレーション.<p>
	 *
	 * ロットの重複チェックを行う。<br>
	 */
	public class Lot_Chk02 extends MSBFL_LotService_MC_A.Lot_Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			MCMessageList msgL = new MCMessageList();

			msgL.addAll(checkLotMain());

			MCMessagePool.addAll(msgL);

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		
		protected void createItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.itm_cd);
			dbc_bldr.addSelect(t.lot_mng_typ);
			dbc_bldr.addSelect(t.sublot_mng_typ);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, up0(),
					MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3);
		}
		
		protected void setSublot(MCList<Lot_Chk02_CndR> upL) {
			// サブロット管理区分：在庫のみサブロット管理するの場合の考慮
			for (Lot_Chk02_CndR upR : upL) {
				MAM_ITM_R itmR = _itmCache.get(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
				
				if (!itmR.isEmpty() && MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					upR.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		protected MCMessageList checkLotMain(){
			MCMessageList msgL = new MCMessageList();
			if (up0().size() == 0) {
				return msgL;
			}
			
			createItmCache();
			
			// 上り電文とロット管理情報それぞれのキーを突き合わせるため、
			// サブロット管理区分：在庫のみサブロット管理するの場合の考慮を行う。
			setSublot(up0());
			
			MAM_ITM_R itm = MAM_ITM_R.create();
			Lot_Chk02_CndR prev = null;
			String[] lotInfoKeyCols = new String[] {
					Lot_Chk02_CndR.$itm_cd, Lot_Chk02_CndR.$itm_sub1,
					Lot_Chk02_CndR.$itm_sub2, Lot_Chk02_CndR.$itm_sub3,
					Lot_Chk02_CndR.$lot_no
			};
			String[] sublotInfoKeyCols = new String[] {
					Lot_Chk02_CndR.$itm_cd, Lot_Chk02_CndR.$itm_sub1,
					Lot_Chk02_CndR.$itm_sub2, Lot_Chk02_CndR.$itm_sub3,
					Lot_Chk02_CndR.$lot_no, Lot_Chk02_CndR.$sublot_no
			};
			
			MCList<MST_LOT_R> dupChkL = getLotForDupChk(up0());
			MCIndexKey lotDupIdxKey = dupChkL.createIndex(MST_LOT_R.$itm_cd,
					MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no);
			MCIndexKey sublotDupIdxKey = dupChkL.createIndex(MST_LOT_R.$itm_cd,
					MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
			
			// 同一ロット・サブロットが連続して出現するようにソートする
			MCList<Lot_Chk02_CndR> sortL = MCList.create(Lot_Chk02_CndR.class);
			sortL.addAll(up0());
			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.ASC, Lot_Chk02_CndR.$itm_cd);
			sp.add(SortType.ASC, Lot_Chk02_CndR.$itm_sub1);
			sp.add(SortType.ASC, Lot_Chk02_CndR.$itm_sub2);
			sp.add(SortType.ASC, Lot_Chk02_CndR.$itm_sub3);
			sp.add(SortType.ASC, Lot_Chk02_CndR.$lot_no);
			sp.add(SortType.ASC, Lot_Chk02_CndR.$sublot_no);
			sortL.sort(sp);
			for (Lot_Chk02_CndR current : sortL) {
				
				if(isNullOr(current.lot_mng_typ(), current.sublot_mng_typ())){
					if (!isSame(current.itm_cd(), itm.itm_cd())) {
						itm.clear();
						itm = _itmCache.get(current.itm_cd(),
								current.itm_sub1(), current.itm_sub2(), current.itm_sub3());
					}
					current.lot_mng_typ(itm.lot_mng_typ());
					current.sublot_mng_typ(itm.sublot_mng_typ());
				}
				
				if (MAC_LOT_MNG_TYP.isUNIQ(current.lot_mng_typ()) && !current.lot_not_change_flg()) {
					if (prev != null
							&& isColSame(prev, current, lotInfoKeyCols)) {
						// 引数内のロットＮＯ重複
						if (!prev.err_flg()) {
							msgL.add(msgDupLotNo(prev));
							prev.err_flg(true);
						}
						msgL.add(msgDupLotNo(current));
						current.err_flg(true);
						prev = current;
						continue;
					}
					else if (!isNull(dupChkL.getFirst(lotDupIdxKey, current.itm_cd(),
							current.itm_sub1(), current.itm_sub2(), current.itm_sub3(),
							current.lot_no()))) {
						msgL.add(msgDupLotNo(current));
						current.err_flg(true);
						prev = current;
						continue;
					}
				}
				if (MAC_SUBLOT_MNG_TYP.isUNIQ(current.sublot_mng_typ())) {
					if (prev != null
							&& isColSame(prev, current, sublotInfoKeyCols)) {
						// 引数内のサブロットＮＯ重複
						if (!prev.err_flg()) {
							msgL.add(msgDupSublotNo(prev));
							prev.err_flg(true);
						}
						msgL.add(msgDupSublotNo(current));
						current.err_flg(true);
						prev = current;
						continue;
					}
					else if (!isNull(dupChkL.getFirst(sublotDupIdxKey, current.itm_cd(),
							current.itm_sub1(), current.itm_sub2(), current.itm_sub3(),
							current.lot_no(), current.sublot_no()))) {
						// ＤＢのサブロットＮＯと重複
						msgL.add(msgDupSublotNo(current));
						current.err_flg(true);
						prev = current;
						continue;
					}
				}
				prev = current;
			}
			return msgL;
		}
		
		protected MCList<MST_LOT_R> getLotForDupChk(MCList<Lot_Chk02_CndR> chkL) {
			MCList<Lot_Chk02_CndR> gbL = chkL.groupBy(Lot_Chk02_CndR.$itm_cd, Lot_Chk02_CndR.$lot_no,
					Lot_Chk02_CndR.$itm_sub1, Lot_Chk02_CndR.$itm_sub2, Lot_Chk02_CndR.$itm_sub3);
			
			// ワークテーブルinsert
			MCList<MST_LOT_R> wkL = MCList.create(MST_LOT_R.class);
			
			for (Lot_Chk02_CndR r : gbL) {
				if (isNullOr(r.itm_cd(), r.lot_no(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())) {
					continue;
				}
				MAM_ITM_R itmR = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (MAC_LOT_MNG_TYP.isUNIQ(itmR.lot_mng_typ())
						|| MAC_SUBLOT_MNG_TYP.isUNIQ(itmR.sublot_mng_typ())) {
					MST_LOT_R wkR = MST_LOT_R.create();
					wkR.itm_cd(r.itm_cd());
					wkR.itm_sub1(r.itm_sub1());
					wkR.itm_sub2(r.itm_sub2());
					wkR.itm_sub3(r.itm_sub3());
					wkR.lot_no(r.lot_no());
					wkR.sublot_no(MAC_STR.NULL_VAL.value());
					wkL.add(wkR);
				}
			}
			MCList<MST_LOT_R> retL = MCList.create(MST_LOT_R.class);
			if (!wkL.isEmpty()) {
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_LOT_R.create("T"));
				dbWkDelete("MSBFL5210_MSW_LOT_D01", wkL_bldr.getBaseDbc());
				dbWkInsert("MSBFL5210_MSW_LOT_I01", wkL, wkL_bldr.getBaseDbc());

				MST_LOT_R retL_t = MST_LOT_R.create("T");
				MCQueryApiBuilder retL_bldr = MCQueryApiBuilder.create(retL_t);
				MSW_LOT_KEY_R retL_t2 = MSW_LOT_KEY_R.create("T2");
				retL_bldr.setSelect(retL_t.itm_cd);
				retL_bldr.addSelect(retL_t.itm_sub1);
				retL_bldr.addSelect(retL_t.itm_sub2);
				retL_bldr.addSelect(retL_t.itm_sub3);
				retL_bldr.addSelect(retL_t.lot_no);
				retL_bldr.addSelect(retL_t.sublot_no);
				retL_bldr.addInnerJoin(retL_t2, bracket(retL_t.itm_cd.eq(retL_t2.itm_cd)
								.and(retL_t.itm_sub1.eq(retL_t2.itm_sub1))
								.and(retL_t.itm_sub2.eq(retL_t2.itm_sub2))
								.and(retL_t.itm_sub3.eq(retL_t2.itm_sub3))
								.and(retL_t.lot_no.eq(retL_t2.lot_no))));
				retL_bldr.setDistinct();
				dbSelect("MSBFL5210_MST_LOT_S01", retL, retL_bldr);

				dbWkDelete("MSBFL5210_MSW_LOT_D02", MST_LOT_R.create("T"));
			}
			return retL;
		}
		
		protected MCMessage msgDupLotNo(Lot_Chk02_CndR row) {
			MCMessage msg = new MCMessage(row, null, MSBFL0033, toDispItm(
					row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3()),
					row.lot_no(), row.sublot_no(), toDispGUIIndex(row));
			return msg;
		}
		
		protected MCMessage msgDupSublotNo(Lot_Chk02_CndR row) {
			MCMessage msg = new MCMessage(row, null, MSBFL0034, toDispItm(
					row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3()),
					row.lot_no(), row.sublot_no(), toDispGUIIndex(row));
			return msg;
		}
	}
	/**
	 * Lot_Chk03オペレーション.<p>
	 *
	 * ロットの存在チェックを行う。<br>
	 */
	public class Lot_Chk03 extends MSBFL_LotService_MC_A.Lot_Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			MCMessageList msgL = new MCMessageList();

			msgL.addAll(checkMain());

			MCMessagePool.addAll(msgL);

			// 下り電文設定
			setDown();
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected MCMessageList checkMain() {
			MCMessageList msgL = new MCMessageList();

			createItmCache();
			MCList<Lot_Chk03_CndR> list = getChkTgt();
			
			if (list.isEmpty()) {
				return msgL;
			}
			
			setSublot(list);
			
			MCList<Lot_Chk03_CndR> noSubLotList = MCList.create(Lot_Chk03_CndR.class);
			MCList<Lot_Chk03_CndR> hasSubLotList = MCList.create(Lot_Chk03_CndR.class);
			for (Lot_Chk03_CndR r : list) {
				if (isNull(r.sublot_no())) {
					noSubLotList.add(r);
				}
				else {
					hasSubLotList.add(r);
				}
			}
			MCList<MST_LOT_R> dbLotL = getLot(hasSubLotList, true);
			MCIndexKey idxkey = dbLotL.createIndex(dbLotL.createRow().getKeyColumn());
			
			for (Lot_Chk03_CndR up0R : hasSubLotList) {
				MST_LOT_R tmpLotR = dbLotL.getFirst(idxkey, up0R.itm_cd(), up0R.itm_sub1(),
						up0R.itm_sub2(), up0R.itm_sub3(), up0R.lot_no(), up0R.sublot_no());
				if (isNull(tmpLotR)) {
					msgL.add(new MCMessage(up0R, null, MSBFL0035, toDispItm(
							up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3()),
							up0R.lot_no(), up0R.sublot_no(), toDispGUIIndex(up0R)));
					up0R.err_flg(true);
				}
				else {
					if (!isNull(up0R.ver_no()) && !isNull(tmpLotR.ver_no()) && !isSame(up0R.ver_no(), tmpLotR.ver_no())) {
						msgL.add(new MCMessage(up0R, null, MSBFL0117, toDispItm(
								up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3()),
								up0R.ver_no(), tmpLotR.ver_no(), toDispGUIIndex(up0R)));
						up0R.err_flg(true);
					}
					else {
						setLot(up0R, tmpLotR);
					}
				}
			}
			if (!noSubLotList.isEmpty()) {
				dbLotL = getLot(noSubLotList, false);
				idxkey = dbLotL.createIndex(MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1,
						MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3, MST_LOT_R.$lot_no);
			
				for (Lot_Chk03_CndR up0R : noSubLotList) {
					MST_LOT_R tmpLotR = dbLotL.getFirst(idxkey, up0R.itm_cd(), up0R.itm_sub1(),
							up0R.itm_sub2(), up0R.itm_sub3(), up0R.lot_no());
					if (isNull(tmpLotR)) {
						msgL.add(new MCMessage(up0R, null, MSBFL0130, toDispItm(
								up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3()),
								up0R.lot_no(), toDispGUIIndex(up0R)));
						up0R.err_flg(true);
					}
				}
			}

			return msgL;
		}
		
		protected void setLot(Lot_Chk03_CndR r, MST_LOT_R lotR) {
			if (!isNull(lotR.ver_no())) {
				r.ver_no(lotR.ver_no());
			}
			r.vld_dt(lotR.vld_dt());
			r.first_gr_dt(lotR.first_gr_dt());
			r.lot_seq(lotR.lot_seq());
			r.stk_insp_typ(lotR.stk_insp_typ());
			r.quality_typ(lotR.quality_typ());
			r.mfg_aprv_sts_typ(lotR.mfg_aprv_sts_typ());
			r.insp_aprv_sts_typ(lotR.insp_aprv_sts_typ());
			r.plnt_aprv_sts_typ(lotR.plnt_aprv_sts_typ());
			r.mrkt_judg_sts_typ(lotR.mrkt_judg_sts_typ());
			r.act_cont_fctr(lotR.act_cont_fctr());
		}
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		
		protected void createItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.itm_cd);
			dbc_bldr.addSelect(t.itm_sub1);
			dbc_bldr.addSelect(t.itm_sub2);
			dbc_bldr.addSelect(t.itm_sub3);
			dbc_bldr.addSelect(t.lot_mng_typ);
			dbc_bldr.addSelect(t.sublot_mng_typ);
			
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, up0(),
					MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3);
		}
		
		protected void setSublot(MCList<Lot_Chk03_CndR> upL) {
			// サブロット管理区分：在庫のみサブロット管理するの場合の考慮
			for (Lot_Chk03_CndR upR : upL) {
				MAM_ITM_R itmR = _itmCache.get(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
				
				if (!itmR.isEmpty() && MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					upR.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * ロット存在チェック対象のリストを取得する。
		 * @return
		 */
		protected MCList<Lot_Chk03_CndR> getChkTgt() {
			// 以下の場合はロット存在チェック対象外
			// ・ロット管理区分：ロット管理しないの場合
			// ・ロットが設定されていない場合
			MCList<Lot_Chk03_CndR> retL = MCList.create(Lot_Chk03_CndR.class);
			
			for (Lot_Chk03_CndR upR : up0()) {
				MAM_ITM_R itmR = _itmCache.get(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
				if (isNull(itmR) || MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) continue;
				if (isNull(upR.lot_no())) continue;
				
				retL.add(upR);
			}
			
			return retL;
		}
		
		protected MCList<MST_LOT_R> getLot(MCList<Lot_Chk03_CndR> upL, boolean hasSubLotFlg) {
			MCList<MST_LOT_R> lotL = MCList.create(MST_LOT_R.class);
			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(t);
			
			lotL_bldr.setSelect(t.itm_cd);
			lotL_bldr.addSelect(t.itm_sub1);
			lotL_bldr.addSelect(t.itm_sub2);
			lotL_bldr.addSelect(t.itm_sub3);
			lotL_bldr.addSelect(t.lot_no);
			lotL_bldr.addSelect(t.sublot_no);
			lotL_bldr.addSelect(t.ver_no);
			lotL_bldr.addSelect(t.vld_dt);
			lotL_bldr.addSelect(t.first_gr_dt);
			lotL_bldr.addSelect(t.lot_seq);
			lotL_bldr.addSelect(t.stk_insp_typ);
			lotL_bldr.addSelect(t.quality_typ);
			lotL_bldr.addSelect(t.mfg_aprv_sts_typ);
			lotL_bldr.addSelect(t.insp_aprv_sts_typ);
			lotL_bldr.addSelect(t.plnt_aprv_sts_typ);
			lotL_bldr.addSelect(t.mrkt_judg_sts_typ);
			lotL_bldr.addSelect(t.act_cont_fctr);
			
			lotL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			lotL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			lotL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			lotL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			lotL_bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
			if (hasSubLotFlg) {
				lotL_bldr.addWhereWithAnd(t.sublot_no.eq(bind("sublot_no")));
			}
			
			dbSelect("MSBFL5210_MST_LOT_S02", lotL, lotL_bldr, upL);
			
			return lotL;
		}
	}
	/**
	 * Lot_Upd01オペレーション.<p>
	 *
	 * ロットの追加・更新を行う。<br>
	 */
	public class Lot_Upd01 extends MSBFL_LotService_MC_A.Lot_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			createItmCache();
			createMrktJudgList();
			getItmInsp();
			
			doInsLotList(up0());

			MCList<Lot_Upd01_CndR> lotSubL = getUpdL(up0());
			
			insOrUpdMain(lotSubL);
		}
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected MCList<InspSchd_Srch01_CndR> _itmInspCache = MCList.create(InspSchd_Srch01_CndR.class);
		
		protected void createItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.lot_mng_typ);
			dbc_bldr.addSelect(t.sublot_mng_typ);
			dbc_bldr.addSelect(t.cont_fctr_flg);
			dbc_bldr.addSelect(t.std_cont_fctr);
			dbc_bldr.addSelect(t.lmt_ctl_flg);
			dbc_bldr.addSelect(t.mrkt_judg_flg);
			dbc_bldr.addSelect(t.insp_flg);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, up0(),
					MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		
		MCList<MST_MRKT_JUDG_R> _mrktJudgList = MCList.create(MST_MRKT_JUDG_R.class);
		protected MCIndexKey _mrktJudgKey;
		
		protected void createMrktJudgList() {
			MST_MRKT_JUDG_R t = MST_MRKT_JUDG_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			
			dbc_bldr.setSelect(t.itm_cd);
			dbc_bldr.addSelect(t.itm_sub1);
			dbc_bldr.addSelect(t.itm_sub2);
			dbc_bldr.addSelect(t.itm_sub3);
			dbc_bldr.addSelect(t.lot_no);
			dbc_bldr.addSelect(t.mrkt_judg_sts_typ);
			
			dbc_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dbc_bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
			
			dbSelect("MSBFL5210_MST_MRKT_JUDG_S01", _mrktJudgList, dbc_bldr, up0());
			_mrktJudgKey = _mrktJudgList.createIndex(MST_MRKT_JUDG_R.$itm_cd, MST_MRKT_JUDG_R.$itm_sub1,
					MST_MRKT_JUDG_R.$itm_sub2, MST_MRKT_JUDG_R.$itm_sub3, MST_MRKT_JUDG_R.$lot_no);
		}
		
		protected void getItmInsp() {
			MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			MCList<Lot_Upd01_CndR> actBindL = MCList.create(Lot_Upd01_CndR.class);
			MCList<Lot_Upd01_CndR> prBindL = MCList.create(Lot_Upd01_CndR.class);
			for (Lot_Upd01_CndR up0R : up0()) {
				if (!isNull(up0R.arr_act_no())) actBindL.add(up0R);
				if (!isNull(up0R.arr_pr_no())) prBindL.add(up0R);
			}
			if (!actBindL.isEmpty()) {
				MCList<MST_ARR_ACT_R> aaL = MCList.create(MST_ARR_ACT_R.class);
				MST_ARR_ACT_R aaL_t = MST_ARR_ACT_R.create("T");
				MCQueryApiBuilder aaL_bldr = MCQueryApiBuilder.create(aaL_t);
				aaL_bldr.setSelect(aaL_t.arr_act_no);
				aaL_bldr.addSelect(aaL_t.sppl_cd);
				aaL_bldr.addSelect(aaL_t.maker_cd);
				aaL_bldr.addSelect(aaL_t.arr_loc_cd);
				dbSelectKey("MSBFL5210_MST_ARR_ACT_S03", aaL, aaL_bldr, actBindL);
				MCIndexKey idx = aaL.createIndex(MST_ARR_ACT_R.$arr_act_no);
				
				for (Lot_Upd01_CndR r : actBindL) {
					MST_ARR_ACT_R aaR = aaL.getFirst(idx, r.arr_act_no());
					
					if (!isNull(aaR)) {
						r.sppl_cd(aaR.sppl_cd());
						r.maker_cd(aaR.maker_cd());
						r.loc_cd(aaR.arr_loc_cd());
					}
				}
			}
			if (!prBindL.isEmpty()) {
				MCList<MST_ARR_PR_R> apL = MCList.create(MST_ARR_PR_R.class);
				MST_ARR_PR_R apL_t = MST_ARR_PR_R.create("T");
				MCQueryApiBuilder apL_bldr = MCQueryApiBuilder.create(apL_t);
				apL_bldr.setSelect(apL_t.arr_pr_no);
				apL_bldr.addSelect(apL_t.sppl_cd);
				dbSelectKey("MSBFL5210_MST_ARR_PR_S01", apL, apL_bldr, prBindL);
				MCIndexKey idx = apL.createIndex(MST_ARR_PR_R.$arr_pr_no);
				
				for (Lot_Upd01_CndR r : prBindL) {
					MST_ARR_PR_R apR = apL.getFirst(idx, r.arr_pr_no());
					
					if (!isNull(apR)) {
						r.sppl_cd(apR.sppl_cd());
					}
				}
			}
			
			setPegNo(up0());
			for (Lot_Upd01_CndR up0R : up0()) {
				if (!isNull(up0R.mfg_loc_cd())) {
					up0R.insp_typ(MSC_INSP_TYP.PRDCT.value());
				}
				else if (!isNull(up0R.sppl_cd())) {
					up0R.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
				else {
					continue;
				}
				
				InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
				
				oR.peg_no(up0R.peg_no());
				oR.itm_cd(up0R.itm_cd());
				oR.itm_sub1(up0R.itm_sub1());
				oR.itm_sub2(up0R.itm_sub2());
				oR.itm_sub3(up0R.itm_sub3());
				oR.mfg_loc_cd(up0R.mfg_loc_cd());
				oR.sppl_cd(up0R.sppl_cd());
				oR.maker_cd(up0R.maker_cd());
				oR.from_site_cd(null);
				oR.to_site_cd(null);
				oR.to_loc_cd(up0R.loc_cd());
				oR.insp_typ(up0R.insp_typ());
				oR.base_dt(up0R.base_dt());
				oR.insp_ptn_cd(null);
				oR.no_insp_srch_flg(true);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
			
			if (!o.down0().isEmpty()) {
				_itmInspCache = o.down0();
			}
		}
		
		protected InspSchd_Srch01_CndR getItmInspR(MCNumber pegNo) {
			if (isNull(_itmInspCache)) {
				return null;
			}
			else {
				return _itmInspCache.getFirst(InspSchd_Srch01_CndR.$peg_no, pegNo);
			}
		}
		
		protected MCList<Lot_Upd01_CndR> getUpdL(MCList<Lot_Upd01_CndR> upL) {
			MCList<Lot_Upd01_CndR> retL = MCList.create(Lot_Upd01_CndR.class);
			// サブロット管理区分：在庫のみサブロット管理するの場合の考慮
			for (Lot_Upd01_CndR upR : upL) {
				MAM_ITM_R itmR = _itmCache.get(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
				if (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
					continue;
				}
				if (!isNull(itmR) && MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					upR.sublot_no(MAC_STR.NULL_VAL.value());
				}
				retL.add(upR);
			}
			return retL;
		}
		
		/**
		 * 追加、更新メイン処理
		 */
		protected void insOrUpdMain(MCList<Lot_Upd01_CndR> cndL) {
			//同一のMST_LOTのキーを持つ上り電文が同時に渡されることもあるので、
			//まずは、lotのキーでグループ化する。
			MCList<Lot_Upd01_CndR>[] upLotGList = getLotGroup(cndL);
			
			MCList<MST_LOT_R> insL = MCList.create(MST_LOT_R.class);
			MCList<MST_LOT_R> updL = MCList.create(MST_LOT_R.class);
			
			MCList<MST_LOT_R> dbLotL = getLotL(upLotGList);
			MCIndexKey idxkey = dbLotL.createIndex(dbLotL.createRow().getKeyColumn());
			
			for (MCList<Lot_Upd01_CndR> upLotG : upLotGList) {
				//insert,updateに使用するコンテナ
				MST_LOT_R lotR = MST_LOT_R.create();
				
				//lotRにinsert,update共通で使用する項目を設定
				setLotValCmn(lotR, upLotG);
				
				//MST_LOTの更新前の値を取得
				MST_LOT_R bfrUpdLot = getFirstLotR(dbLotL, idxkey, lotR);
				
				if (isIns(bfrUpdLot, upLotG)) {
					//insert用の項目設定
					setLotValForIns(lotR, upLotG);
					insL.add(lotR);
				}
				else {
					//update用の項目設定
					setLotValForUpd(lotR, bfrUpdLot);
					if (isUpd(lotR, bfrUpdLot)) {
						updL.add(lotR);
					}
				}
			}
			
			if (!insL.isEmpty()) {
				insL = truncDate(insL);
				doIns(insL);
			}
			if (!updL.isEmpty()) {
				updL = truncDate(updL);
				doUpd(updL);
			}
		}
		
		protected MCList<Lot_Upd01_CndR>[] getLotGroup(MCList<Lot_Upd01_CndR> cndL) {
			MST_LOT_R sublotR = MST_LOT_R.create();
			//上り電文コンテナのMST_LOTのキー項目に対して、
			//MST_LOT_Rと同じ項目名のエイリアスが定義されている前提。
			return cndL.groupList(sublotR.getKeyColumn());
		}
		
		protected MCList<Lot_Upd01_CndR>[] getLotListGroup(MCList<Lot_Upd01_CndR> cndL) {
			return cndL.groupList(Lot_Upd01_CndR.$itm_cd, Lot_Upd01_CndR.$itm_sub1,
					Lot_Upd01_CndR.$itm_sub2, Lot_Upd01_CndR.$itm_sub3,
					Lot_Upd01_CndR.$lot_no, Lot_Upd01_CndR.$sublot_no_org);
		}

		protected MCList<MST_LOT_R> getLotL(MCList<Lot_Upd01_CndR>[] lotGList) {
			MCList<MST_LOT_R> retL = MCList.create(MST_LOT_R.class);
			MCList<Lot_Upd01_CndR> lotBindL = MCList.create(Lot_Upd01_CndR.class);
			
			for (MCList<Lot_Upd01_CndR> lotList : lotGList) {
				lotBindL.add(lotList.get(0));
			}

			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder retL_bldr = MCQueryApiBuilder.create(t);
			getLotSql(t, retL_bldr);
			dbSelect("MSBFL5210_MST_LOT_S03", retL, retL_bldr, lotBindL);
			
			return retL;
		}
		
		protected MCList<MST_LOT_LIST_R> getLotListL(MCList<Lot_Upd01_CndR>[] lotGList) {
			MCList<MST_LOT_LIST_R> retL = MCList.create(MST_LOT_LIST_R.class);
			MCList<Lot_Upd01_CndR> lotBindL = MCList.create(Lot_Upd01_CndR.class);
			
			for (MCList<Lot_Upd01_CndR> lotList : lotGList) {
				lotBindL.add(lotList.get(0));
			}

			MST_LOT_LIST_R t = MST_LOT_LIST_R.create("T");
			MCQueryApiBuilder retL_bldr = MCQueryApiBuilder.create(t);
			getLotListSql(t, retL_bldr);
			dbSelect("MSBFL5210_MST_LOT_LIST_S01", retL, retL_bldr, lotBindL);
			
			return retL;
		}

		protected void getLotSql(MST_LOT_R t, MCQueryApiBuilder retL_bldr) {
			retL_bldr.setSelect(t.itm_cd);
			retL_bldr.addSelect(t.itm_sub1);
			retL_bldr.addSelect(t.itm_sub2);
			retL_bldr.addSelect(t.itm_sub3);
			retL_bldr.addSelect(t.lot_no);
			retL_bldr.addSelect(t.sublot_no);
			retL_bldr.addSelect(t.schd_flg);
			retL_bldr.addSelect(t.first_gr_dt_save_flg);
			retL_bldr.addSelect(t.first_gr_dt);
			
			retL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			retL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			retL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			retL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			retL_bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
			retL_bldr.addWhereWithAnd(t.sublot_no.eq(bind("sublot_no")));
		}

		protected void getLotListSql(MST_LOT_LIST_R t, MCQueryApiBuilder retL_bldr) {
			retL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			retL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			retL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			retL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			retL_bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
			retL_bldr.addWhereWithAnd(t.sublot_no.eq(bind("sublot_no_org")));
		}

		protected void setLotValCmn(MST_LOT_R lotR, MCList<Lot_Upd01_CndR> upLotG) {
			//ここで設定した値は、updateの分岐に入ったときは
			//setLotValForUpdメソッドで上書きされることがある。
			//※updateの場合はデータベースの値と比較して条件判断されるので。
			
			//キーをコピー
			setLotKey(lotR, upLotG);
			
			//予定ＦＬＧを設定
			setSchdFlg(lotR, upLotG);
			
			setFiDtVal(lotR, upLotG);
		}
		
		protected void setLotKey(MST_LOT_R lotR, MCList<Lot_Upd01_CndR> upLotG) {
			MST_LOT_R tmp = upLotG.get(0).lot_p();
			
			for (String col : tmp.getKeyColumn()) {
				lotR.setValue(col, tmp.getValue(col));
			}
		}
		
		protected void setFiDtVal(MST_LOT_R lotR, MCList<Lot_Upd01_CndR> upLotG) {
			MCDate minDt = (MCDate)upLotG.min(Lot_Upd01_CndR.$base_dt);
			lotR.first_gr_dt(minDt.startTimeOfDay());
		}
		
		protected void setSchdFlg(MST_LOT_R lotR, MCList<Lot_Upd01_CndR> upLotG) {
			//予定ＦＬＧは、falseのものが一件でも存在していたらfalse。
			//※予定ロットでない行が一件でも存在していたら、そのロットは
			//予定ロットではないということ。
			if (!isNull(upLotG.getFirst(Lot_Upd01_CndR.$schd_flg, false))) {
				lotR.schd_flg(false);
			}
			else {
				lotR.schd_flg(true);
			}
		}
		
		protected void setLotValForIns(MST_LOT_R lotR, MCList<Lot_Upd01_CndR> upLotG) {
			// ロットシーケンスはListでまとめて発番したいのでinsert直前に設定する。
			lotR.base_gr_dt(lotR.first_gr_dt());
			setItmMasterVal(lotR);
			setStsTyp(lotR, upLotG);
			setUnregLmtFlg(lotR, upLotG);
		}
		
		protected void setItmMasterVal(MST_LOT_R lotR) {
			MAM_ITM_R itmR = _itmCache.get(lotR.itm_cd(), lotR.itm_sub1(), lotR.itm_sub2(), lotR.itm_sub3());
			if (isNull(itmR)) {
				return;
			}
			lotR.lot_mng_typ(itmR.lot_mng_typ());
			lotR.sublot_mng_typ(itmR.sublot_mng_typ());
			if (itmR.cont_fctr_flg()) {
				lotR.act_cont_fctr(itmR.std_cont_fctr());
			}
		}
		
		protected void setStsTyp(MST_LOT_R lotR,  MCList<Lot_Upd01_CndR> upLotG) {
			MAM_ITM_R itmR = _itmCache.get(lotR.itm_cd(), lotR.itm_sub1(), lotR.itm_sub2(), lotR.itm_sub3());
			InspSchd_Srch01_CndR itmInspR = getItmInspR(upLotG.get(0).peg_no());

			if (!isNull(itmInspR) && !itmInspR.no_insp_flg() && itmInspR.plnt_aprv_flg()) {
				lotR.plnt_aprv_sts_typ(MSC_PLNT_APRV_STS_TYP.OPN.value());
			}
			if (itmR.mrkt_judg_flg()) {
				if (isNull(itmInspR) || !itmInspR.no_mrkt_judg_flg()) {
					MST_MRKT_JUDG_R mrktJudgR = _mrktJudgList.getFirst(_mrktJudgKey,
							lotR.itm_cd(), lotR.itm_sub1(), lotR.itm_sub2(), lotR.itm_sub3(), lotR.lot_no());
					
					if (isNull(mrktJudgR)) {
						lotR.mrkt_judg_sts_typ(MSC_MRKT_JUDG_STS_TYP.OPN.value());
					}
					else {
						lotR.mrkt_judg_sts_typ(mrktJudgR.mrkt_judg_sts_typ());
					}
				}
			}
		}
		
		protected void setUnregLmtFlg(MST_LOT_R lotR, MCList<Lot_Upd01_CndR> upLotG) {
			lotR.unreg_lmt_flg(false);
			
			for (Lot_Upd01_CndR r : upLotG) {
				MAM_ITM_R itmR = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (!isNull(itmR) && itmR.lmt_ctl_flg()) {
					//仮に計画Ｇや基準日が混在した上り電文が渡された場合、
					//一件でも期限管理対象の品目マスタが存在したらtrueとする仕様。
					//※一件でも存在すれば、後の処理で期限算出処理が実行され、
					//フラグがfalseに更新されるはずなのでtrueで問題ない。
					lotR.unreg_lmt_flg(true);
					return;
				}
			}
		}
		
		protected boolean isIns(MST_LOT_R bfrUpdLot, MCList<Lot_Upd01_CndR> upLotG) {
			return isNull(bfrUpdLot.itm_cd());
		}
		
		protected boolean isChkLotExists(MCList<Lot_Upd01_CndR> upLotG) {
			for (Lot_Upd01_CndR r : upLotG) {
				if (r.schd_flg()) {
					//一件でも予定ロット(製造指図時に作成されるロット)が
					//存在していたらinsert可能
					return false;
				}
				if (MAC_STR.isNULL_VAL(r.lot_no()) && MAC_STR.isNULL_VAL(r.sublot_no())) {
					//ロットＮＯとサブロットＮＯが両方NULL文字
					//(＝ロット管理もサブロット管理もしない)
					//の場合、insert可能
					return false;
				}
			}
			return true;
		}
		
		protected void setLotValForUpd(MST_LOT_R lotR, MST_LOT_R bfrUpdLot) {
			//予定ＦＬＧの再設定
			if (!bfrUpdLot.schd_flg()) {
				//既に予定ＦＬＧが'0'の場合は、updateの必要がないので
				//falseを設定する。
				lotR.schd_flg(false);
			}
			
			//最古入庫日の再設定
			if (!isUpdStkFiDt(lotR, bfrUpdLot)) {
				lotR.first_gr_dt(bfrUpdLot.first_gr_dt());
			}
		}
		
		protected boolean isUpdStkFiDt(MST_LOT_R lotR, MST_LOT_R bfrUpdLot) {
			if (isNull(lotR.first_gr_dt())) {
				return false;
			}
			if (bfrUpdLot.first_gr_dt_save_flg()) {
				return false;
			}
			if (bfrUpdLot.schd_flg() && !lotR.schd_flg()) {
				//予定ロットの場合は、実績時に必ず更新する。
				return true;
			}
			return lotR.first_gr_dt().lt(bfrUpdLot.first_gr_dt());
		}
		
		protected boolean isUpd(MST_LOT_R lotR, MST_LOT_R bfrUpdLot) {
			//更新前(bfrUpdSublot)と更新後(sublotR)が変わらない場合は、
			//対象としない。
			//※更新対象のカラムは
			//・予定ＦＬＧ
			//・最古入庫日
			//だけなので、上記２カラムを比較している。
			if (!isSame(lotR.schd_flg(), bfrUpdLot.schd_flg())
					|| !isSame(lotR.first_gr_dt(), bfrUpdLot.first_gr_dt())) {
				return true;
			}
			return false;
		}
		
		protected void doIns(MCList<MST_LOT_R> insL) {
			doSeqCache(MSC_NUM_SYS_TYP.LOTSEQ, insL.size());
			insL.sort(MST_LOT_R.$first_gr_dt, MST_LOT_R.$itm_cd, MST_LOT_R.$lot_no);
			for (MST_LOT_R r : insL) {
				r.lot_seq(getStrSeq(MSC_NUM_SYS_TYP.LOTSEQ));
			}
			//存在チェックを行ってからINSERTまでの間に他の処理により
			//同一キーをInsertされてしまった場合は、dbInsertExによって
			//エラーメッセージが返される。
			dbInsertEx("MSBFL5210_MST_LOT_I01", insL, MCQueryApiBuilder.create(MST_LOT_R.create("T")));
		}
		
		protected void doUpd(MCList<MST_LOT_R> updL) {
			updL.sort(updL.get(0).getKeyColumn());

			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
			updL_bldr.setSet(t.schd_flg);
			updL_bldr.addSet(t.first_gr_dt);
			
			dbUpdateKey("MSBFL5210_MST_LOT_U01", updL, updL_bldr);
		}
		
		protected void doInsLotList(MCList<Lot_Upd01_CndR> upL) {
			MCList<Lot_Upd01_CndR> subL = MCList.create(Lot_Upd01_CndR.class);
			// サブロット管理区分：在庫のみサブロット管理するの場合の考慮
			for (Lot_Upd01_CndR upR : upL) {
				upR.sublot_no_org(upR.sublot_no());
				MAM_ITM_R itmR = _itmCache.get(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
				if (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ()) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
					continue;
				}
				if (!isNull(itmR) && MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					upR.sublot_no(MAC_STR.NULL_VAL.value());
				}
				subL.add(upR);
			}

			if (subL.isEmpty()) {
				return ;
			}

			MCList<Lot_Upd01_CndR>[] upLotGList = getLotListGroup(subL);
			
			MCList<MST_LOT_LIST_R> dbLotL = getLotListL(upLotGList);
			MCIndexKey idxkey = dbLotL.createIndex(dbLotL.createRow().getKeyColumn());

			MCList<MST_LOT_LIST_R> insLotListL = MCList.create(MST_LOT_LIST_R.class);
			for (MCList<Lot_Upd01_CndR> upLotG : upLotGList) {
				MST_LOT_LIST_R newLotListR = MST_LOT_LIST_R.create();
				
				copy(newLotListR, upLotG.get(0), createMap_MST_LOT_LIST_R_Lot_Upd01_CndR());
				
				//MST_LOT_LISTの更新前の値を取得
				MST_LOT_LIST_R bfrUpdLot = getFirstLotListR(dbLotL, idxkey, newLotListR);
				
				if (isNull(bfrUpdLot.itm_cd())) {
					insLotListL.add(newLotListR);
				}
			}

			if (!insLotListL.isEmpty()) {
				dbInsertEx("MSBFL5210_MST_LOT_LIST_I01", insLotListL,
						MCQueryApiBuilder.create(MST_LOT_LIST_R.create("T")));
			}
		}

		protected Map_MST_LOT_LIST_R_Lot_Upd01_CndR<MST_LOT_LIST_R,Lot_Upd01_CndR> createMap_MST_LOT_LIST_R_Lot_Upd01_CndR() {
			return new Map_MST_LOT_LIST_R_Lot_Upd01_CndR<MST_LOT_LIST_R, Lot_Upd01_CndR>();
		}

		public class Map_MST_LOT_LIST_R_Lot_Upd01_CndR<D extends MST_LOT_LIST_R, S extends Lot_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_LOT_LIST_R.$itm_cd, Lot_Upd01_CndR.$itm_cd);
				addColumnPathMap(MST_LOT_LIST_R.$itm_sub1, Lot_Upd01_CndR.$itm_sub1);
				addColumnPathMap(MST_LOT_LIST_R.$itm_sub2, Lot_Upd01_CndR.$itm_sub2);
				addColumnPathMap(MST_LOT_LIST_R.$itm_sub3, Lot_Upd01_CndR.$itm_sub3);
				addColumnPathMap(MST_LOT_LIST_R.$lot_no, Lot_Upd01_CndR.$lot_no);
				addColumnPathMap(MST_LOT_LIST_R.$sublot_no, Lot_Upd01_CndR.$sublot_no_org);
				addColumnPathMap(MST_LOT_LIST_R.$lot_tbl_sublot_no, Lot_Upd01_CndR.$sublot_no);
			}
		}
	}
	/**
	 * Lot_Upd02オペレーション.<p>
	 *
	 * ロットの備考・予備項目を更新する。<br>
	 */
	public class Lot_Upd02 extends MSBFL_LotService_MC_A.Lot_Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<MST_LOT_R> lotL = MCList.create(MST_LOT_R.class);
			MST_LOT_R lotL_t = MST_LOT_R.create("T");
			MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(lotL_t);
			
			for (Lot_Upd02_CndR up0R : up0()) {
				lotL.add(up0R.lot_p());
			}
			editLotSetStmt(lotL, lotL_t, lotL_bldr);
			updLot(lotL, lotL_t, lotL_bldr);
		}
		
		protected void editLotSetStmt(MCList<MST_LOT_R> sublotL, MST_LOT_R t,
				MCQueryApiBuilder sublotL_bldr) {
			sublotL_bldr.setSet(t.lot_rmrks);
		}
		
		protected void updLot(MCList<MST_LOT_R> lotL, MST_LOT_R lotL_t,
				MCQueryApiBuilder lotL_bldr) {
			lotL = truncDate(lotL);
			lotL.sort(lotL_bldr.getBaseDbc().getKeyColumn());
			dbUpdateKey("MSBFL5210_MST_LOT_U02", lotL, lotL_bldr);
		}
	}
	/**
	 * Lot_Upd03オペレーション.<p>
	 *
	 * ロットの製造承認状況を更新する。<br>
	 */
	public class Lot_Upd03 extends MSBFL_LotService_MC_A.Lot_Upd03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			if (!isSame(getSysParm("MFG_APRV_ENABLE_FLG"),"1")) {
				return;
			}
			
			// 製造系トランザクションの更新が終わった後に実行される前提
			if (!up0().isEmpty()) {
				setMfgAprvStsTyp(up0());
				updMfgAprvStsTyp(up0());
			}
		}
		
		/**
		 * 製造承認状況区分を設定する。
		 * @param list
		 */
		protected void setMfgAprvStsTyp(MCList<Lot_Upd03_CndR> list) {
			for (Lot_Upd03_CndR r : list) {
				MCList<MST_MFG_INST_R> miL = getMiL(r);
				if (isAprvTgt(miL)) {
					if (isAllAbortOrCan(miL)) {
						r.mfg_aprv_sts_typ(null);
					}
					else {
						String min = getMinMfgAprvStsTyp(miL);
						if (MSC_MFG_APRV_STS_TYP.isINST_OPN(min)) {
							r.mfg_aprv_sts_typ(min);
						}
						else {
							if (isInstAPartOfOperInst(r.itm_mfg_inst_no())) {
								r.mfg_aprv_sts_typ(MSC_MFG_APRV_STS_TYP.INST_OPN.value());
							}
							else {
								r.mfg_aprv_sts_typ(min);
							}
						}
					}
				}
				else {
					// 製造指図保存の取り消し後に実行された場合は、元々承認対象であったとしても、
					// 製造指図が存在しない場合がある。その場合は、NULLに更新する。
					r.mfg_aprv_sts_typ(null);
				}
			}
		}
		
		/**
		 * 品目製造指図に紐づく製造指図を取得する。
		 * @return
		 */
		protected MCList<MST_MFG_INST_R> getMiL(Lot_Upd03_CndR r) {
			MCList<MST_MFG_INST_R> miL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder miL_bldr = MCQueryApiBuilder.create(t);
			
			miL_bldr.setSelect(t.aprv_flg);
			miL_bldr.addSelect(t.mfg_aprv_sts_typ);
			miL_bldr.addSelect(t.abort_flg);
			miL_bldr.addSelect(t.can_flg);
			
			// 最遅の製造承認状況区分を取得するために、状態遷移の順番を保持しておく。
			miL.addNumberColumn(MSC_MFG_APRV_STS_TYP.$STATE_ORDER);
			miL_bldr.addSelect(MSC_MFG_APRV_STS_TYP$STATE_ORDER(t.mfg_aprv_sts_typ)
					.as(MSC_MFG_APRV_STS_TYP.$STATE_ORDER));
			miL_bldr.addSelect(t.itm_mfg_inst_no);
			miL_bldr.setWhere(t.itm_mfg_inst_no.eq(bind("1")), r.itm_mfg_inst_no());
			dbSelect("MSBFL5210_MST_MFG_INST_S01", miL, miL_bldr);
			
			// 以降の処理で使用するため、品目製造指図ＮＯを設定する
			// （全行に同じ値が設定されているはずなので、１行目の値を設定する）
			if (!miL.isEmpty()) {
				r.itm_mfg_inst_no(miL.get(0).getString("itm_mfg_inst_no"));
			}
			
			return miL;
		}
		
		/**
		 * 承認対象かどうか
		 * @param piL
		 * @return
		 */
		protected boolean isAprvTgt(MCList<MST_MFG_INST_R> miL) {
			// 承認対象の製造指図が1件でも存在したら、承認対象とみなす。
			if (!isNull(miL.getFirst(MST_MFG_INST_R.$aprv_flg, true))) {
				return true;
			}
			else {
				return false;
			}
		}
		
		protected boolean isAllAbortOrCan(MCList<MST_MFG_INST_R> miL) {
			if (miL.isEmpty()) {
				return false;
			}
			for (MST_MFG_INST_R miR : miL) {
				if (!miR.abort_flg() && !miR.can_flg()) {
					return false;
				}
			}
			return true;
		}
		
		/**
		 * 最遅の製造承認状況区分を返す。
		 * @param piL
		 * @return
		 */
		protected String getMinMfgAprvStsTyp(MCList<MST_MFG_INST_R> miL) {
			miL.sort(MSC_MFG_APRV_STS_TYP.$STATE_ORDER);
			for (MST_MFG_INST_R miR : miL) {
				// 打切または取消を除いた最遅を返す。
				if (!miR.abort_flg() && !miR.can_flg() && miR.aprv_flg()) {
					return miR.mfg_aprv_sts_typ();
				}
			}
			return null;
		}
		
		/**
		 * 複数工程のうち一部工程のみ指図されているか
		 * @param itmProdInstNo
		 * @return
		 */
		protected boolean isInstAPartOfOperInst(String itmMfgInstNo) {
			MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
			int cnt = execDbCount("MSBFL5210_MST_OPER_INST_S01", t,
					t.itm_mfg_inst_no.eq(bind("1"))
					.and(t.mfg_inst_no.isNull()), itmMfgInstNo);
			if (cnt == 0) {
				return false;
			}
			else {
				return true;
			}
		}
		
		/**
		 * 品目製造指図ＮＯから更新対象のサブロットを取得する
		 * @param itmProdInstNo
		 * @return
		 */
		protected MCList<MST_LOT_R> getUpdLot(String itmMfgInstNo) {
			MCList<MST_LOT_R> retLot = MCList.create(MST_LOT_R.class);
			// 品目製造指図からサブロットを取得
			// ※仮に指図時に決めたロットの出来高を登録しなかったとしても、
			// 指図ロットの製造承認状況区分を更新する仕様。
			MST_ITM_MFG_INST_R imiR = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder imiR_bldr = MCQueryApiBuilder.create(imiR);
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			imiR_bldr.setSelect(imiR.itm_cd);
			imiR_bldr.addSelect(imiR.itm_sub1);
			imiR_bldr.addSelect(imiR.itm_sub2);
			imiR_bldr.addSelect(imiR.itm_sub3);
			imiR_bldr.addSelect(imiR.lot_no);
			imiR_bldr.addSelect(imiR.sublot_no);
			imiR_bldr.addSelect(m1.sublot_mng_typ);
			imiR_bldr.addInnerJoin(m1,
					bracket(imiR.itm_cd.eq(m1.itm_cd)
							.and(imiR.itm_sub1.eq(m1.itm_sub1))
							.and(imiR.itm_sub2.eq(m1.itm_sub2))
							.and(imiR.itm_sub3.eq(m1.itm_sub3))));
			dbSelectKey("MSBFL5210_MST_ITM_MFG_INST_S02", imiR, imiR_bldr, itmMfgInstNo);
			
			if (!isNull(imiR.lot_no()) && !isNull(imiR.sublot_no())) {
				MST_LOT_R lotR = MST_LOT_R.create();
				lotR.itm_cd(imiR.itm_cd());
				lotR.itm_sub1(imiR.itm_sub1());
				lotR.itm_sub2(imiR.itm_sub2());
				lotR.itm_sub3(imiR.itm_sub3());
				lotR.lot_no(imiR.lot_no());
				if (MAC_SUBLOT_MNG_TYP.isSTK(imiR.getStringNE(MAM_ITM_R.$sublot_mng_typ))) {
					lotR.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					lotR.sublot_no(imiR.sublot_no());
				}
				retLot.add(lotR);
			}
			
			// 品目製造指図に紐づく出来高実績からサブロットを取得
			// 製造実績を分割した場合の考慮が必要。
			// 結論としては6.3.1の仕様を踏襲し、あくまで製造指図の製造承認状況区分のみを参照して、ロットの値を設定する。
			// 出来高実績を参照するのではなく、MSVT_YIELD_ACT_LOTビューからロットを取得する必要がある
			// （外注製造実績を先行着手した場合、入荷実績からしかロットがとれないので）
			// ※製造実績を分割しても製造指図が同一であれば、指図のロットで実績計上可能であるため、
			// 分割した製造実績が１件だけ記録承認済みであったとしても、
			// 他に完了していない製造指図や、記録未承認が存在するのであれば、記録承認済みにはしない。

			MCList<MSVT_YIELD_ACT_LOT_R> yaL = MCList.create(MSVT_YIELD_ACT_LOT_R.class);
			MSVT_YIELD_ACT_LOT_R yaL_t = MSVT_YIELD_ACT_LOT_R.create("T");
			MCQueryApiBuilder yaL_bldr = MCQueryApiBuilder.create(yaL_t);
			yaL_bldr.setSelect(yaL_t.itm_cd);
			yaL_bldr.addSelect(yaL_t.itm_sub1);
			yaL_bldr.addSelect(yaL_t.itm_sub2);
			yaL_bldr.addSelect(yaL_t.itm_sub3);
			yaL_bldr.addSelect(yaL_t.lot_no);
			yaL_bldr.addSelect(yaL_t.sublot_no);
			yaL_bldr.addSelect(m1.sublot_mng_typ);
			yaL_bldr.addInnerJoin(m1, bracket( yaL_t.itm_cd.eq(m1.itm_cd)
					.and(yaL_t.itm_sub1.eq(m1.itm_sub1))
					.and(yaL_t.itm_sub2.eq(m1.itm_sub2))
					.and(yaL_t.itm_sub3.eq(m1.itm_sub3))));
			yaL_bldr.setWhere(yaL_t.itm_mfg_inst_no.eq(bind("1")), itmMfgInstNo);
			dbSelect("MSBFL5210_MSVT_YIELD_ACT_LOT_S01", yaL, yaL_bldr);
			
			for (MSVT_YIELD_ACT_LOT_R yaR : yaL) {
				MST_LOT_R lotR = MST_LOT_R.create();
				lotR.itm_cd(yaR.itm_cd());
				lotR.itm_sub1(yaR.itm_sub1());
				lotR.itm_sub2(yaR.itm_sub2());
				lotR.itm_sub3(yaR.itm_sub3());
				lotR.lot_no(yaR.lot_no());
				if (MAC_SUBLOT_MNG_TYP.isSTK(yaR.getStringNE(MAM_ITM_R.$sublot_mng_typ))) {
					lotR.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					lotR.sublot_no(yaR.sublot_no());
				}
				retLot.add(lotR);
			}
			
			return retLot.groupBy(MST_LOT_R.colnames());
		}
		
		/**
		 * MST_LOTの製造承認状況区分を更新する。
		 * @param list
		 */
		protected void updMfgAprvStsTyp(MCList<Lot_Upd03_CndR> list) {
			MCList<MST_LOT_R> updL = MCList.create(MST_LOT_R.class);
			for (Lot_Upd03_CndR r : list) {
				MCList<MST_LOT_R> tmp = getUpdLot(r.itm_mfg_inst_no());
				tmp.setString(MST_LOT_R.$mfg_aprv_sts_typ, r.mfg_aprv_sts_typ());
				updL.addAll(tmp);
			}
			updL = truncDate(updL);
			updL.sort(MST_LOT_R.colnames());
			
			MST_LOT_R t = MST_LOT_R.create("T");
			execDbUpdate("MSBFL5210_MST_LOT_U03", t, updL,
					t.itm_cd.eq(bindEx("itm_cd"))
							.and(t.lot_no.eq(bindEx("lot_no")))
							.and(t.sublot_no.eq(bindEx("sublot_no")))
							.and(t.itm_sub1.eq(bindEx("itm_sub1")))
							.and(t.itm_sub2.eq(bindEx("itm_sub2")))
							.and(t.itm_sub3.eq(bindEx("itm_sub3"))),
					t.mfg_aprv_sts_typ);
		}
	}
	/**
	 * Lot_Upd04オペレーション.<p>
	 *
	 * ロットの有効期限・使用期限・実際有効成分係数を更新する。<br>
	 */
	public class Lot_Upd04 extends MSBFL_LotService_MC_A.Lot_Upd04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<MST_LOT_R> lotL = MCList.create(MST_LOT_R.class);
			
			sortUp();
			createCache();
			for (Lot_Upd04_CndR r : up0()) {
				MST_LOT_R lotR = _lotCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
						r.lot_no(), r.sublot_no());
				if (isNull(lotR)) {
					continue;
				}
				setData(r, lotR);
				lotL.add(lotR);
			}
			MST_LOT_R lotL_t = MST_LOT_R.create("T");
			MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(lotL_t);
			editSublotSetStmt(lotL, lotL_t, lotL_bldr);
			updLot(lotL, lotL_t, lotL_bldr);
		}
		
		protected void sortUp() {
			MST_LOT_R lotR = MST_LOT_R.create();
			up0().sort(lotR.getKeyColumn());
		}
		
		protected FXUCL_MCDbcCache<MST_LOT_R> _lotCache;
		
		protected void createCache() {
			_lotCache = new FXUCL_MCDbcCache<MST_LOT_R>(MCQueryApiBuilder.create(MST_LOT_R.create("T")), up0(),
					MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
			
		}
		
		protected void setData(Lot_Upd04_CndR r, MST_LOT_R lotR) {
			if (isUpdActContFctr(r)) {
				setActContFctr(r, lotR);
			}
			if (isUpdLmt(r)) {
				setLmt(r, lotR);
			}
			if (isUpdBaseInDt(r)) {
				setBaseInDt(r, lotR);
			}
			if (isUpdLmtDtFrm(r)) {
				setLmtDtFrm(r, lotR);
			}
		}
		
		protected boolean isUpdActContFctr(Lot_Upd04_CndR r) {
			return !isNull(r.act_cont_fctr());
		}
		
		protected void setActContFctr(Lot_Upd04_CndR r, MST_LOT_R lotR) {
			lotR.act_cont_fctr(r.act_cont_fctr());
		}

		protected boolean isUpdLmt(Lot_Upd04_CndR r) {
			return r.vld_dt_flg();
		}
		
		protected void setLmt(Lot_Upd04_CndR r, MST_LOT_R lotR) {
			lotR.vld_dt(r.vld_dt());
			lotR.lmt_dt(r.lmt_dt());
			if (!isNull(lotR.vld_dt()) && !isNull(lotR.lmt_dt())) {
				lotR.unreg_lmt_flg(false);
			}
		}
		
		protected boolean isUpdBaseInDt(Lot_Upd04_CndR r) {
			if (isUpdLmt(r)) {
				return MSC_INSP_TYP.isLOT(r.insp_typ());
			}
			return false;
		}
		
		protected void setBaseInDt(Lot_Upd04_CndR r, MST_LOT_R lotR) {
			lotR.base_gr_dt(r.base_gr_dt());
		}
		
		protected boolean isUpdLmtDtFrm(Lot_Upd04_CndR r) {
			if (isUpdLmt(r)) {
				return !MSC_INSP_TYP.isLOT(r.insp_typ());
			}
			return false;
		}
		
		protected void setLmtDtFrm(Lot_Upd04_CndR r, MST_LOT_R lotR) {
			lotR.lmt_dt_frm_typ(r.lmt_dt_frm_typ());
			lotR.lmt_dt_frm(r.lmt_dt_frm());
		}
		
		protected void editSublotSetStmt(MCList<MST_LOT_R> sublotL, MST_LOT_R t, MCQueryApiBuilder sublotL_bldr) {
			sublotL_bldr.setSet(t.act_cont_fctr);
			sublotL_bldr.addSet(t.vld_dt);
			sublotL_bldr.addSet(t.lmt_dt);
			sublotL_bldr.addSet(t.unreg_lmt_flg);
			sublotL_bldr.addSet(t.base_gr_dt);
			sublotL_bldr.addSet(t.lmt_dt_frm_typ);
			sublotL_bldr.addSet(t.lmt_dt_frm);
		}
		
		protected void updLot(MCList<MST_LOT_R> lotL, MST_LOT_R t, MCQueryApiBuilder lotL_bldr) {
			lotL = truncDate(lotL);
			lotL.sort(lotL_bldr.getBaseDbc().getKeyColumn());
			dbUpdateKey("MSBFL5210_MST_LOT_U04", lotL, lotL_bldr);
		}
	}
	/**
	 * Lot_Upd05オペレーション.<p>
	 *
	 * ロットの在庫検査区分・良品区分・工場出荷承認区分を更新する。<br>
	 */
	public class Lot_Upd05 extends MSBFL_LotService_MC_A.Lot_Upd05 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			createItmCache();
			MCList<Lot_Upd05_CndR> lotSubL = getUpdL(up0());
			
			MCList<MST_LOT_R> lotL = MCList.create(MST_LOT_R.class);
			
			MCList<MST_LOT_R> dbLotL = getLotL(lotSubL);
			MCIndexKey idxkey;
			if (up0().get(0).mrkt_judg_flg()) {
				idxkey = dbLotL.createIndex(MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1,
						MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3, MST_LOT_R.$lot_no);
			}
			else {
				idxkey = dbLotL.createIndex(dbLotL.createRow().getKeyColumn());
			}
			
			for (Lot_Upd05_CndR r : lotSubL) {
				editUp(r);
				
				MST_LOT_R upLotR = r.lot_p().clone();
				MST_LOT_R oldLotR = getFirstLotR(dbLotL, idxkey, upLotR, r.mrkt_judg_flg());
				if (isNull(oldLotR)) {
					continue;
				}
				MCRow.copyvalue(upLotR, oldLotR);
				
				MAM_ITM_R itmR = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (r.lot_insp_schd_flg() && MAC_INSP_BIND_TYP.isLOT(itmR.insp_bind_typ())) {
					// 期限再検査の場合、本サービスは呼ばれないので期限再検査を考慮しなくてよい。
					upLotR.stk_insp_typ(r.stk_insp_typ());
				}
				else if (r.insp_inst_flg()) {
					setWhenInspInst(r, upLotR, oldLotR);
				}
				else if (r.insp_inst_aprv_flg()) {
					setWhenInspAprv(r, upLotR, oldLotR);
				}
				else if (r.insp_act_flg()) {
					setWhenInspAct(r, upLotR, oldLotR);
				}
				else if (r.insp_judg_flg()) {
					setWhenInspJudg(r, upLotR, oldLotR);
				}
				else if (r.plnt_aprv_flg()) {
					upLotR.plnt_aprv_sts_typ(r.plnt_aprv_sts_typ());
				}
				else if (r.mrkt_judg_flg()) {
					setWhenMrktJudg(r, upLotR, lotL);
				}
				
				lotL.add(upLotR);
			}
			
			if (!lotL.isEmpty()) {
				MST_LOT_R lotL_t = MST_LOT_R.create("T");
				MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(lotL_t);
				editLotSetStmt(lotL, lotL_t, lotL_bldr);
				updLot(lotL, lotL_t, lotL_bldr);
			}
		}
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		
		protected void createItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.sublot_mng_typ);
			dbc_bldr.addSelect(t.lot_mng_typ);
			dbc_bldr.addSelect(t.insp_bind_typ);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, up0(),
					MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		
		protected MCList<Lot_Upd05_CndR> getUpdL(MCList<Lot_Upd05_CndR> upL) {
			MCList<Lot_Upd05_CndR> retL = MCList.create(Lot_Upd05_CndR.class);
			// サブロット管理区分：在庫のみサブロット管理するの場合の考慮
			for (Lot_Upd05_CndR upR : up0()) {
				MAM_ITM_R itmR = _itmCache.get(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
				if (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
					continue;
				}
				if (!isNull(itmR) && MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					upR.sublot_no(MAC_STR.NULL_VAL.value());
				}
				retL.add(upR);
			}
			return retL;
		}
		protected MST_LOT_R getFirstLotR(MCList<MST_LOT_R> dbLotL, MCIndexKey idxkey, MST_LOT_R upLotR, boolean mrktJudgFlg) {
			MST_LOT_R ret = dbLotL.getFirst(idxkey, getVals(upLotR, upLotR.getKeyColumn()));
			if (mrktJudgFlg) {
				ret = dbLotL.getFirst(idxkey, upLotR.itm_cd(), upLotR.itm_sub1(), upLotR.itm_sub2(), upLotR.itm_sub3(), upLotR.lot_no());
			}
			else {
				ret = dbLotL.getFirst(idxkey, getVals(upLotR, upLotR.getKeyColumn()));
			}
			
			if (isNull(ret)) {
				return null;
			}
			else {
				return ret;
			}
		}
		
		protected void setWhenInspInst(Lot_Upd05_CndR r, MST_LOT_R upLotR, MST_LOT_R oldLotR) {
			if (!r.plnt_aprv_flg() && !isNull(upLotR.plnt_aprv_sts_typ())) {
				//何もしない
			}
			else{
				upLotR.plnt_aprv_sts_typ(r.plnt_aprv_sts_typ());
			}
			
			if (MSC_INSP_TYP.isPRCD(r.insp_typ())) {
				// 何もしない
			}
			else if (MSC_INSP_TYP.isLOT(r.insp_typ())) {
				if (r.lmt_up_flg()) {
					// 何もしない
				}
				else if (!isNull(oldLotR.stk_insp_typ())) {
					upLotR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				}
			}
			else if (MSC_INSP_TYP.isACCPT(r.insp_typ()) || MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
				upLotR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
			}
		}
		
		protected void setWhenInspAprv(Lot_Upd05_CndR r, MST_LOT_R upLotR, MST_LOT_R oldLotR) {
			if (MSC_INSP_TYP.isPRCD(r.insp_typ())) {
				// 何もしない
			}
			else if (MSC_INSP_TYP.isLOT(r.insp_typ())) {
				if (r.lmt_up_flg()) {
					// 何もしない
				}
				else if (!isNull(oldLotR.stk_insp_typ())) {
					upLotR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				}
			}
			else if (MSC_INSP_TYP.isACCPT(r.insp_typ()) || MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
				upLotR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
			}
		}
		
		protected void setWhenInspAct(Lot_Upd05_CndR r, MST_LOT_R upLotR, MST_LOT_R oldLotR) {
			if (MSC_INSP_TYP.isPRCD(r.insp_typ())) {
				// 何もしない
			}
			else if (MSC_INSP_TYP.isLOT(r.insp_typ())) {
				if (r.lmt_up_flg()) {
					// 何もしない
				}
				else if (!isNull(oldLotR.stk_insp_typ())) {
					upLotR.stk_insp_typ(r.stk_insp_typ());
					upLotR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
					upLotR.quality_typ(r.quality_typ());
				}
			}
			else if (MSC_INSP_TYP.isACCPT(r.insp_typ()) || MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
				upLotR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				
				if (r.in_prmt_insp_flg() || MAC_INSP_BIND_TYP.isLOT(r.insp_bind_typ())) {
					upLotR.quality_typ(r.quality_typ());
					upLotR.stk_insp_typ(r.stk_insp_typ());
				}
			}
		}
		
		protected void setWhenInspJudg(Lot_Upd05_CndR r, MST_LOT_R upLotR, MST_LOT_R oldLotR) {
			if (MSC_INSP_TYP.isPRCD(r.insp_typ())) {
				// 何もしない
			}
			else if (MSC_INSP_TYP.isLOT(r.insp_typ())) {
				if (r.lmt_up_flg()) {
					// 何もしない
				}
				else if (!isNull(oldLotR.stk_insp_typ())) {
					upLotR.stk_insp_typ(r.stk_insp_typ());
					upLotR.quality_typ(r.quality_typ());
					upLotR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				}
			}
			else if (MSC_INSP_TYP.isACCPT(r.insp_typ()) || MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
				upLotR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				
				if (r.in_prmt_insp_flg() || MAC_INSP_BIND_TYP.isLOT(r.insp_bind_typ())) {
					upLotR.quality_typ(r.quality_typ());
					upLotR.stk_insp_typ(r.stk_insp_typ());
				}
			}
		}
		
		protected void setWhenMrktJudg(Lot_Upd05_CndR r, MST_LOT_R upLotR, MCList<MST_LOT_R> lotL) {
			upLotR.mrkt_judg_sts_typ(r.mrkt_judg_sts_typ());
			
			// 市場出荷判定では品目＋ロットＮＯ単位で管理しているため、
			// 同一品目同一ロットＮＯのロット管理情報を全て更新する。
			MCList<MST_LOT_R> lotForMrktJudgL = MCList.create(MST_LOT_R.class);
			MST_LOT_R lotForMrktJudgL_t = MST_LOT_R.create("T");
			MCQueryApiBuilder lotForMrktJudgL_bldr = MCQueryApiBuilder.create(lotForMrktJudgL_t);
			getLotForMrktJudgSql(lotForMrktJudgL_t, lotForMrktJudgL_bldr);
			dbSelect("MSBFL5210_MST_LOT_S04", lotForMrktJudgL, lotForMrktJudgL_bldr, upLotR);
			
			if (!lotForMrktJudgL.isEmpty()) {
				lotForMrktJudgL.setStringNE(MST_LOT_R.$mrkt_judg_sts_typ, upLotR.mrkt_judg_sts_typ());
				
				// 上り電文のロット以外を更新対象に追加する（上り電文のロットは後続処理で更新対象に追加する）
				MCList<MST_LOT_R> addL = MCList.create(MST_LOT_R.class);
				for (MST_LOT_R lotForMrktJudgR : lotForMrktJudgL) {
					if (!isSameLotKey(upLotR, lotForMrktJudgR)) {
						addL.add(lotForMrktJudgR);
					}
				}
				
				if (!isNull(addL)) {
					lotL.addAll(addL);
				}
			}
		}
		
		protected void editUp(Lot_Upd05_CndR r) {
			
			if (!isNull(r.insp_no())) {
				if (MSC_INSP_TYP.isACCPT(r.insp_typ()) || MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
					//市場出荷承認以外から実行された場合、受入、製造検査の場合は
					//検査中使用許可FLGと検査実施単位区分を取得する。
					//※検査予定にのみ保持しているため、検査予定から取得する。
					
					MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
					MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
					MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
					schdL_bldr.setSelect(t.in_prmt_insp_flg);
					schdL_bldr.addSelect(t.insp_bind_typ);
					schdL_bldr.setWhere(t.insp_no.eq(bind("1")), r.insp_no());
					dbSelect("MSBFL5210_MST_INSP_SCHD_S01", schdL, schdL_bldr);
			
					if (!schdL.isEmpty()) {
						if (!isNull(schdL.getFirst(MST_INSP_SCHD_R.$in_prmt_insp_flg, true))) {
							r.in_prmt_insp_flg(true);
						}
						// 検査指図がまとめられている場合でも検査実施単位区分が混在することはないので、
						// 最初の行の検査実施単位区分をそのまま設定している。
						r.insp_bind_typ(schdL.get(0).insp_bind_typ());
					}
				}
			}
		}
		
		protected MCList<MST_LOT_R> getLotL(MCList<Lot_Upd05_CndR> up0L) {
			MCList<MST_LOT_R> retL = MCList.create(MST_LOT_R.class);
			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder retL_bldr = MCQueryApiBuilder.create(t);
			getLotSql(t, retL_bldr);
			dbSelect("MSBFL5210_MST_LOT_S05", retL, retL_bldr, up0L);
			return retL;
		}
		
		protected void getLotSql(MST_LOT_R t, MCQueryApiBuilder retL_bldr) {
			retL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			retL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			retL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			retL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			retL_bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
			retL_bldr.addWhereWithCutOffAnd(t.sublot_no.eq(bind("sublot_no")));
		}
		
		protected void getLotForMrktJudgSql(MST_LOT_R t, MCQueryApiBuilder retL_bldr) {
			retL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			retL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			retL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			retL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			retL_bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
		}
		
		protected boolean isSameLotKey(MST_LOT_R r1, MST_LOT_R r2) {
			return isSame(r1.itm_cd(), r2.itm_cd()) && isSame(r1.itm_sub1(), r2.itm_sub1()) &&
					isSame(r1.itm_sub2(), r2.itm_sub2()) && isSame(r1.itm_sub3(), r2.itm_sub3()) &&
					isSame(r1.lot_no(), r2.lot_no()) && isSame(r1.sublot_no(), r2.sublot_no());
		}
		
		/**
		 * set句を編集する。
		 * @param lotL_bldr 
		 * @param t 
		 * @param sublotL
		 */
		protected void editLotSetStmt(MCList<MST_LOT_R> lotL, MST_LOT_R t, MCQueryApiBuilder lotL_bldr) {
			lotL_bldr.setSet(t.stk_insp_typ);
			lotL_bldr.addSet(t.quality_typ);
			lotL_bldr.addSet(t.insp_aprv_sts_typ);
			lotL_bldr.addSet(t.plnt_aprv_sts_typ);
			lotL_bldr.addSet(t.mrkt_judg_sts_typ);
		}
		
		protected void updLot(MCList<MST_LOT_R> lotL, MST_LOT_R t, MCQueryApiBuilder lotL_bldr) {
			lotL = truncDate(lotL);
			lotL.sort(lotL_bldr.getBaseDbc().getKeyColumn());
			dbUpdateKey("MSBFL5210_MST_LOT_U05", lotL, lotL_bldr);
		}
	}
	/**
	 * Lot_Upd06オペレーション.<p>
	 *
	 * ロットの有効期限・使用期限を更新する（子品目期限引継ぎ・子品目起算日引継ぎ）。<br>
	 */
	public class Lot_Upd06 extends MSBFL_LotService_MC_A.Lot_Upd06 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			sortUp();
			createCache();
			getItmInsp();
			setSublot();
			createOldestLotL();
			
			for (Lot_Upd06_DtlChdR up0R : up0()) {
				MST_LOT_R mainLotR = getMainLotR(up0R);
				mainLotR.addNumberColumn(Lot_Upd06_DtlChdR.$peg_no, up0R.peg_no());
				updLotLmt(mainLotR);
			}
		}
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache;
		protected MCList<InspSchd_Srch01_CndR> _itmInspCache = MCList.create(InspSchd_Srch01_CndR.class);
		// 品目・ロットごとに、最小の有効期限、使用期限、起算日などの情報を保持しておくためのリスト
		protected MCList<MST_LOT_R> _oldestLotL = MCList.create(MST_LOT_R.class);
		protected MCIndexKey _oldestLotLIdx;
		
		protected void createOldestLotL() {
			MCGroupByPolicy policy = new MCGroupByPolicy(Lot_Upd06_DtlParR.$itm_cd,
					Lot_Upd06_DtlParR.$itm_sub1, Lot_Upd06_DtlParR.$itm_sub2, Lot_Upd06_DtlParR.$itm_sub3,
					Lot_Upd06_DtlParR.$lot_no, Lot_Upd06_DtlParR.$sublot_no);
			
			MCList<Lot_Upd06_DtlParR> grpUp1L = MCList.create(Lot_Upd06_DtlParR.class);
			grpUp1L = up1().groupBy(policy);
			
			for (Lot_Upd06_DtlParR grpUp1R : grpUp1L) {
				MST_LOT_R lotR = MST_LOT_R.create();
				
				lotR.itm_cd(grpUp1R.itm_cd());
				lotR.itm_sub1(grpUp1R.itm_sub1());
				lotR.itm_sub2(grpUp1R.itm_sub2());
				lotR.itm_sub3(grpUp1R.itm_sub3());
				lotR.lot_no(grpUp1R.lot_no());
				lotR.sublot_no(grpUp1R.sublot_no());
				
				_oldestLotL.add(lotR);
			}
			
			_oldestLotLIdx = _oldestLotL.createIndex(
					MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
			
		}
		
		protected void sortUp() {
			MST_LOT_R lotR = MST_LOT_R.create();
			up1().sort(lotR.getKeyColumn());
		}
		
		protected void createCache() {
			MAM_ITM_R itm = MAM_ITM_R.create("T");
			MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(itm);
			itm_bldr.setSelect(itm.sublot_mng_typ);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itm_bldr, up1(),
					Lot_Upd06_DtlParR.$itm_cd, Lot_Upd06_DtlParR.$itm_sub1,
					Lot_Upd06_DtlParR.$itm_sub2, Lot_Upd06_DtlParR.$itm_sub3);

			MAM_LOC_R loc = MAM_LOC_R.create("T");
			MCQueryApiBuilder loc_bldr = MCQueryApiBuilder.create(loc);
			loc_bldr.setSelect(loc.sppl_cd, loc.maker_cd);
			_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(loc_bldr, up1(),
					Lot_Upd06_DtlParR.$mfg_loc_cd);

		}
		
		protected void getItmInsp() {
			MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			setPegNo(up1());
			for (Lot_Upd06_DtlParR up1R : up1()) {
				InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
				
				oR.peg_no(up1R.chd_peg_no());
				oR.itm_cd(up1R.itm_cd());
				oR.itm_sub1(up1R.itm_sub1());
				oR.itm_sub2(up1R.itm_sub2());
				oR.itm_sub3(up1R.itm_sub3());
				MAM_LOC_R locR = _locCache.get(up1R.mfg_loc_cd());
				if (isNull(locR.sppl_cd())) {
					oR.mfg_loc_cd(up1R.mfg_loc_cd());
					oR.sppl_cd(null);
					oR.maker_cd(null);
					oR.insp_typ(MSC_INSP_TYP.PRDCT.value());
				}
				else {
					oR.mfg_loc_cd(null);
					oR.sppl_cd(locR.sppl_cd());
					oR.maker_cd(locR.maker_cd());
					oR.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
				oR.from_site_cd(null);
				oR.to_site_cd(up1R.site_cd());
				oR.base_dt(up1R.gr_dt());
				oR.insp_ptn_cd(null);
				oR.no_insp_srch_flg(true);
				
				o.up0().add(oR);
			}
			
			o.exec();
			
			if (!o.down0().isEmpty()) {
				_itmInspCache = o.down0();
			}
		}
		
		protected void setSublot() {
			// サブロット管理区分：在庫のみサブロット管理するの場合の考慮
			for (Lot_Upd06_DtlParR r : up1()) {
				MAM_ITM_R itmR = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
					continue;
				}
				if (!isNull(itmR) && MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * 主原料ロットが決定されていない場合true
		 * @return
		 */
		protected boolean isMainLotUndefined(Lot_Upd06_DtlChdR up0R) {
			if (isNullOr(up0R.main_itm_cd(),up0R.main_lot_no(), up0R.main_sublot_no(),
					up0R.main_itm_sub1(), up0R.main_itm_sub2(), up0R.main_itm_sub3())) {
				return true;
			}
			return false;
		}
		
		protected MST_LOT_R getMainLotR(Lot_Upd06_DtlChdR up0R) {
			MST_LOT_R r = MST_LOT_R.create();
			if (isMainLotUndefined(up0R)) {
				return r;
			}
			r.itm_cd(up0R.main_itm_cd());
			r.itm_sub1(up0R.main_itm_sub1());
			r.itm_sub1(up0R.main_itm_sub2());
			r.itm_sub1(up0R.main_itm_sub3());
			r.lot_no(up0R.main_lot_no());
			r.sublot_no(up0R.main_sublot_no());
			r.sublot_mng_typ(up0R.sublot_mng_typ());
			r.vld_dt(up0R.vld_dt());
			r.lmt_dt(up0R.lmt_dt());
			r.lmt_dt_frm(up0R.lmt_dt_frm());
			
			return r;
		}
		
		protected void updLotLmt(MST_LOT_R mainLotR) {
			MCList<MST_LOT_R> lotL = createLotL(mainLotR);
			
			if (!lotL.isEmpty()) {
				MST_LOT_R lotL_t = MST_LOT_R.create("T");
				MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(lotL_t);
				editLotSetStmt(lotL, lotL_t, lotL_bldr);
				lotL = truncDate(lotL);
				setMinDt(lotL);
				
				dbUpdateKey("MSBFL5210_MST_LOT_U06", lotL, lotL_bldr);
			}
		}
		
		/**
		 * 有効期限、使用期限、起算日を最小の日付に設定する
		 * @param lotL
		 * @return lotL
		 */
		protected void setMinDt(MCList<MST_LOT_R> lotL) {
			for (MST_LOT_R lotR : lotL) {
				MST_LOT_R oldestLotR = _oldestLotL.getFirst(_oldestLotLIdx,
						lotR.itm_cd(), lotR.itm_sub1(), lotR.itm_sub2(), lotR.itm_sub3(),
						lotR.lot_no(), lotR.sublot_no());
				
				if (isNull(oldestLotR.vld_dt())
						&& isNull(oldestLotR.lmt_dt())) {
					oldestLotR.vld_dt(lotR.vld_dt());
					oldestLotR.lmt_dt(lotR.lmt_dt());
					oldestLotR.lmt_dt_frm(lotR.lmt_dt_frm());
				}
				else {
					// 保持している有効期限より小さい日付の場合
					if (lotR.vld_dt().lt(oldestLotR.vld_dt())) {
						oldestLotR.vld_dt(lotR.vld_dt());
						oldestLotR.lmt_dt(lotR.lmt_dt());
						oldestLotR.lmt_dt_frm(lotR.lmt_dt_frm());
					}
					// 保持している有効期限と等しい日付の場合
					else if (isSame(lotR.vld_dt(), oldestLotR.vld_dt())) {
						// 起算日がnullでない場合、保持している起算日より小さい日付かどうかも確認
						if (!isNull(lotR.lmt_dt_frm()) && !isNull(oldestLotR.lmt_dt_frm())) {
							if (lotR.lmt_dt_frm().lt(oldestLotR.lmt_dt_frm())) {
								oldestLotR.vld_dt(lotR.vld_dt());
								oldestLotR.lmt_dt(lotR.lmt_dt());
								oldestLotR.lmt_dt_frm(lotR.lmt_dt_frm());
							}
						}
						
					}
					// 保持している有効期限より大きい日付の場合
					else if (lotR.vld_dt().gt(oldestLotR.vld_dt())) {
						lotR.vld_dt(oldestLotR.vld_dt());
						lotR.lmt_dt(oldestLotR.lmt_dt());
						lotR.lmt_dt_frm(oldestLotR.lmt_dt_frm());
					}
				}
			}
		}
		
		protected MCList<MST_LOT_R> createLotL(MST_LOT_R mainLotR) {
			MCList<MST_LOT_R> lotL = MCList.create(MST_LOT_R.class);
			
			MCList<Lot_Upd06_DtlParR> up1L = up1().subList(Lot_Upd06_DtlParR.$chd_peg_no,
					mainLotR.getNumber(Lot_Upd06_DtlChdR.$peg_no));
			
			for (Lot_Upd06_DtlParR up1R : up1L) {
				up1R.upd_flg(isLmtUpd(up1R, mainLotR));
				if (up1R.upd_flg()) {
					// upd_flg:trueの場合、品目品管マスタが存在するので、
					// itmInspRのNULLチェックは行わない。
					InspSchd_Srch01_CndR itmInspR = getItmInspR(up1R.chd_peg_no());
					
					if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD_FR_DT(itmInspR.lmt_dt_frm_typ())) {
						up1R.lmt_dt_frm(mainLotR.lmt_dt_frm());
						up1R.lmt_dt_frm_typ(itmInspR.lmt_dt_frm_typ());
					}
					
					if (itmInspR.lmt_ctl_flg()) {
						if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD(itmInspR.lmt_dt_frm_typ())) {
							up1R.vld_dt(mainLotR.vld_dt());
							up1R.lmt_dt(mainLotR.lmt_dt());
							up1R.lmt_dt_frm_typ(itmInspR.lmt_dt_frm_typ());
						}
						else if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD_FR_DT(itmInspR.lmt_dt_frm_typ())) {
							MSBFL_LotService.Lot_Srch01 o = MSBFL_LotService.crtLot_Srch01();
							Lot_Srch01_CndR oR = Lot_Srch01_CndR.create();
							
							oR.peg_no(up1R.chd_peg_no());
							oR.lmt_dt_frm(mainLotR.lmt_dt_frm());
							oR.lmt_dt_frm_typ(itmInspR.lmt_dt_frm_typ());
							oR.vld_pd(itmInspR.vld_pd());
							oR.lmt_pd(itmInspR.lmt_pd());
							oR.calc_pd_typ(itmInspR.calc_pd_typ());
							oR.base_dt(up1R.gr_dt());
							oR.setAttributes(up1R);
							
							o.up0().add(oR);
							
							o.exec();
							
							Lot_Srch01_RsltR down0R = o.down0().getFirst(Lot_Srch01_RsltR.$peg_no, up1R.chd_peg_no());
							up1R.vld_dt(down0R.vld_dt());
							up1R.lmt_dt(down0R.lmt_dt());
						}
						
						if (isNullOr(up1R.vld_dt(), up1R.lmt_dt())) {
							up1R.unreg_lmt_flg(true);
						}
						else {
							up1R.unreg_lmt_flg(false);
						}
					}
					
					lotL.add(up1R.lot_p());
				}
			}
			
			return lotL;
		}
		
		protected boolean isLmtUpd(Lot_Upd06_DtlParR up1R, MST_LOT_R mainLotR) {
			if (isNullOr(up1R.itm_cd(), up1R.lot_no(), up1R.sublot_no(),
					up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3())) {
				//更新対象のロットが決まっていない場合
				return false;
			}
			
			InspSchd_Srch01_CndR itmInspR = getItmInspR(up1R.chd_peg_no());
			if (isNull(itmInspR)) {
				return false;
			}
			
			if (itmInspR.lmt_ctl_flg()) {
				if (!MAC_LMT_DT_FRM_TYP.isDPND_CHLD(itmInspR.lmt_dt_frm_typ())
						&& !MAC_LMT_DT_FRM_TYP.isDPND_CHLD_FR_DT(itmInspR.lmt_dt_frm_typ())) {
					return false;
				}
			}
			else {
				if (!MAC_LMT_DT_FRM_TYP.isDPND_CHLD_FR_DT(itmInspR.lmt_dt_frm_typ())) {
					return false;
				}
			}
			return true;
		}
		
		protected boolean isInspJudg(Lot_Upd06_DtlParR up1R) {
			MST_INSP_INST_R instR = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder instR_bldr = MCQueryApiBuilder.create(instR);
			String cntStr = "cnt";
			instR.addNumberColumn(cntStr);
			instR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			instR_bldr.setWhere(instR.itm_cd.eq(bind("1")), up1R.itm_cd());
			instR_bldr.addWhereWithAnd(instR.itm_sub1.eq(bind("1")), up1R.itm_sub1());
			instR_bldr.addWhereWithAnd(instR.itm_sub2.eq(bind("1")), up1R.itm_sub2());
			instR_bldr.addWhereWithAnd(instR.itm_sub3.eq(bind("1")), up1R.itm_sub3());
			instR_bldr.addWhereWithAnd(instR.lot_no.eq(bind("1")), up1R.lot_no());
			instR_bldr.addWhereWithAnd(instR.sublot_no.eq(bind("1")), up1R.sublot_no());
			instR_bldr.addWhereWithAnd(instR.insp_sts_typ.eq(bind("1")), MSC_INSP_STS_TYP.JDG.value());
			dbSelect("MSBFL5210_MST_INSP_INST_S01", instR, instR_bldr);
			
			return !instR.getNumber(cntStr).isZero();
		}
		
		protected InspSchd_Srch01_CndR getItmInspR(MCNumber pegNo) {
			if (isNull(_itmInspCache)) {
				return null;
			}
			else {
				return _itmInspCache.getFirst(InspSchd_Srch01_CndR.$peg_no, pegNo);
			}
		}
		
		protected void editLotSetStmt(MCList<MST_LOT_R> lotL, MST_LOT_R t, MCQueryApiBuilder lotL_bldr) {
			lotL_bldr.setSet(t.vld_dt);
			lotL_bldr.addSet(t.lmt_dt);
			lotL_bldr.addSet(t.unreg_lmt_flg);
			lotL_bldr.addSet(t.lmt_dt_frm);
			lotL_bldr.addSet(t.lmt_dt_frm_typ);
		}
	}
	/**
	 * Lot_Upd07オペレーション.<p>
	 *
	 * ロットの有効期限・使用期限を更新する（工程着手実績日・終了実績日起算）。<br>
	 */
	public class Lot_Upd07 extends MSBFL_LotService_MC_A.Lot_Upd07 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<Lot_Upd08_CndR> oUpL = getSrvUp();
			if (!oUpL.isEmpty()) {
				editSrvUp(oUpL);
				execSrv(oUpL);
			}
		}
		
		protected MCList<Lot_Upd08_CndR> getSrvUp() {
			MCList<Lot_Upd08_CndR> tmpL = MCList.create(Lot_Upd08_CndR.class);
			MCList<Lot_Upd08_CndR> retL = MCList.create(Lot_Upd08_CndR.class);
			for (Lot_Upd07_CndR r : up0().groupBy(Lot_Upd07_CndR.$data_crud_typ, Lot_Upd07_CndR.$mfg_act_no, 
					Lot_Upd07_CndR.$oper_inst_no)) {
				executeQuery(tmpL, MSBFL5210_MST_MFG_ACT_S01(), r);
				retL.addAll(tmpL);
			}
			return retL;
		}
		
		protected void editSrvUp(MCList<Lot_Upd08_CndR> oUpL) {
			for (Lot_Upd08_CndR oUpR : oUpL) {
				oUpR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				oUpR.insp_typ(MSC_INSP_TYP.PRDCT.value());
			}
		}
		
		protected void execSrv(MCList<Lot_Upd08_CndR> oUpL) {
			MSBFL_LotService.Lot_Upd08 o = MSBFL_LotService.crtLot_Upd08();
			o.up0().setAll(oUpL);
			o.exec();
		}
	}
	/**
	 * Lot_Upd08オペレーション.<p>
	 *
	 * 出来高、入荷実績後にロットを更新する。<br>
	 */
	public class Lot_Upd08 extends MSBFL_LotService_MC_A.Lot_Upd08 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			preProc();
			getItmInsp();
			createItmCache();
			setSublot(up0());
			sortUp();
			
			MCList<MST_LOT_R> updL = MCList.create(MST_LOT_R.class);
			
			MCList<MST_LOT_R> oldLotL = getLotL();
			MCIndexKey idxkey = oldLotL.createIndex(oldLotL.createRow().getKeyColumn());
			_yieldActList = getYieldAct();
			_yieldActKey = _yieldActList.createIndex(_yieldActList.createRow().getKeyColumn());
			_yieldActBySrcNo3List = getYieldActBySrcNo3();
			_yieldActBySrcNo3Key = _yieldActBySrcNo3List.createIndex(MST_YIELD_ACT_R.$yield_schd_no);
			
			for (Lot_Upd08_CndR r : up0()) {
				MST_LOT_R oldLotR = getFirstLotR(oldLotL, idxkey, r.lot_p());
				if (!isNull(oldLotR.itm_cd())) {
					updL.add(createLotR(r, oldLotR));
				}
			}
			
			if (!updL.isEmpty()) {
				editUpdL(updL);
			}
			
			if (!updL.isEmpty()) {
				MCList<MST_LOT_R> grpL = getGrpLForMinDt(updL);
				setMinDt(updL, grpL);
				
				updLot(updL);
			}
		}
		
		protected void editUpdL(MCList<MST_LOT_R> updL){
			// updLの中からチェック対象のリストを作成
			MCList<MST_LOT_R> chkTgtUpdL = MCList.create(MST_LOT_R.class);
			chkTgtUpdL = updL.subList(r ->
				isSame(r.lmt_dt_frm_typ(), MAC_LMT_DT_FRM_TYP.DPND_CHLD.value())
				|| isSame(r.lmt_dt_frm_typ(), MAC_LMT_DT_FRM_TYP.DPND_CHLD_FR_DT.value())
				|| isSame(r.lmt_dt_frm_typ(), MAC_LMT_DT_FRM_TYP.MFG_ST.value())
				|| isSame(r.lmt_dt_frm_typ(), MAC_LMT_DT_FRM_TYP.MFG_CMPL.value()));
			
			if (chkTgtUpdL.isEmpty()) {
				return;
			}
			
			// 最終的にupdLから取り除くためのリストを作成
			MCList<MST_LOT_R> removeL = MCList.create(MST_LOT_R.class);
			
			// chkTgtUpdLの品目・ロット情報をもとに、出来高実績を検索する。
			MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
			yieldActL = searchYieldAct(chkTgtUpdL);
			
			MCIndexKey yieldActIdx = yieldActL.createIndex(
					MST_YIELD_ACT_R.$itm_cd,
					MST_YIELD_ACT_R.$itm_sub1,
					MST_YIELD_ACT_R.$itm_sub2,
					MST_YIELD_ACT_R.$itm_sub3,
					MST_YIELD_ACT_R.$lot_no,
					MST_YIELD_ACT_R.$sublot_no);
			MCList<MST_YIELD_ACT_R> tgtYieldActL = MCList.create(MST_YIELD_ACT_R.class);
			
			for (MST_LOT_R chkTgtUpdR : chkTgtUpdL) {
				tgtYieldActL = yieldActL.subList(yieldActIdx,
						chkTgtUpdR.itm_cd(),
						chkTgtUpdR.itm_sub1(),
						chkTgtUpdR.itm_sub2(),
						chkTgtUpdR.itm_sub3(),
						chkTgtUpdR.lot_no(),
						chkTgtUpdR.sublot_no());
				
				// 同一製造実績ＮＯ内で複数の出来高実績がある場合を考慮して、製造実績ＮＯの重複を除く
				tgtYieldActL = tgtYieldActL.distinctNE(MST_YIELD_ACT_R.$mfg_act_no);
				
				// 対応する出来高実績が見つからなかった場合の考慮
				if (isNull(tgtYieldActL)) {
					continue;
				}
				
				// 親品目のロットに有効期限、使用期限が設定されているかどうかで分岐
				if (!isNull(tgtYieldActL.get(0).getDateNE(MST_LOT_R.$vld_dt))
						|| !isNull(tgtYieldActL.get(0).getDateNE(MST_LOT_R.$lmt_dt))){
					if (tgtYieldActL.size() > 1) {
						// ２件以上取得で更新対象外
						removeL.add(chkTgtUpdR);
					}
				}
			}
			
			// updLから更新対象外のレコードを除く
			updL.removeAll(removeL);
		}
		
		protected MCList<MST_YIELD_ACT_R> searchYieldAct(MCList<MST_LOT_R> chkTgtUpdL) {
			MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R yieldActR = MST_YIELD_ACT_R.create("T");
			MST_LOT_R lotR = MST_LOT_R.create("T2");
			MCQueryApiBuilder yieldActR_bldr = MCQueryApiBuilder.create(yieldActR);
			
			yieldActR_bldr.addSelect(lotR.vld_dt, lotR.lmt_dt);
			yieldActR_bldr.addLeftOuterJoin(lotR, bracket(
					lotR.itm_cd.eq(yieldActR.itm_cd))
					.and(lotR.itm_sub1.eq(yieldActR.itm_sub1))
					.and(lotR.itm_sub2.eq(yieldActR.itm_sub2))
					.and(lotR.itm_sub3.eq(yieldActR.itm_sub3))
					.and(lotR.lot_no.eq(yieldActR.lot_no))
					.and(lotR.sublot_no.eq(yieldActR.sublot_no)));
			
			yieldActR_bldr.setWhere(yieldActR.itm_cd.eq(bind("itm_cd")));
			yieldActR_bldr.addWhereWithAnd(yieldActR.itm_sub1.eq(bind("itm_sub1")));
			yieldActR_bldr.addWhereWithAnd(yieldActR.itm_sub2.eq(bind("itm_sub2")));
			yieldActR_bldr.addWhereWithAnd(yieldActR.itm_sub3.eq(bind("itm_sub3")));
			yieldActR_bldr.addWhereWithAnd(yieldActR.lot_no.eq(bind("lot_no")));
			yieldActR_bldr.addWhereWithAnd(yieldActR.sublot_no.eq(bind("sublot_no")));
			dbSelect("MSBFL5210_MST_YIELD_ACT_S03", yieldActL, yieldActR_bldr, chkTgtUpdL);
			
			return yieldActL;
		}
		
		/**
		 * 同一品目の同一ロットに対する内容が複数件存在する場合、
		 * 期限起算日、有効期限、使用期限は最小の値が採用されるよう、
		 * グループ化で最小の値を特定する
		 **/
		protected MCList<MST_LOT_R> getGrpLForMinDt(MCList<MST_LOT_R> updL) {
			MCGroupByPolicy policy = new MCGroupByPolicy(MST_LOT_R.$itm_cd,
					MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
			
			policy.min(MST_LOT_R.$vld_dt);
			policy.min(MST_LOT_R.$lmt_dt);
			policy.min(MST_LOT_R.$lmt_dt_frm);
			
			MCList<MST_LOT_R> grpL = updL.groupBy(policy);
			
			return grpL;
		}
		
		protected void setMinDt(MCList<MST_LOT_R> updL, MCList<MST_LOT_R> grpL) {
			MCIndexKey grpLIdx = grpL.createIndex(MST_LOT_R.$itm_cd,
					MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
			
			for (MST_LOT_R updR : updL) {
				if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD(updR.lmt_dt_frm_typ())
						|| MAC_LMT_DT_FRM_TYP.isDPND_CHLD_FR_DT(updR.lmt_dt_frm_typ())
						|| MAC_LMT_DT_FRM_TYP.isMFG_ST(updR.lmt_dt_frm_typ())
						|| MAC_LMT_DT_FRM_TYP.isMFG_CMPL(updR.lmt_dt_frm_typ())) {
					MST_LOT_R grpR = grpL.getFirst(grpLIdx, updR.itm_cd(),
							updR.itm_sub1(), updR.itm_sub2(), updR.itm_sub3(),
							updR.lot_no(), updR.sublot_no());
					
					updR.setDate(MST_LOT_R.$vld_dt, grpR.vld_dt());
					updR.setDate(MST_LOT_R.$lmt_dt, grpR.lmt_dt());
					updR.setDate(MST_LOT_R.$lmt_dt_frm, grpR.lmt_dt_frm());
				}
			}
		}
		
		MCList<MST_INSP_SCHD_R> _schdList = MCList.create(MST_INSP_SCHD_R.class);
		MCIndexKey _schdKey;
		MCList<MST_INSP_SCHD_R> _actList = MCList.create(MST_INSP_SCHD_R.class);
		MCIndexKey _actKey;
		MCList<MST_YIELD_ACT_R> _yieldActList = MCList.create(MST_YIELD_ACT_R.class);
		MCIndexKey _yieldActKey;
		MCList<MST_YIELD_ACT_R> _yieldActBySrcNo3List = MCList.create(MST_YIELD_ACT_R.class);
		MCIndexKey _yieldActBySrcNo3Key;
		/** 品目品管マスタレコードキャッシュ */
		protected MCList<InspSchd_Srch01_CndR> _itmInspCache = MCList.create(InspSchd_Srch01_CndR.class);
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		
		protected void getItmInsp() {
			MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			setPegNo(up0());
			for (Lot_Upd08_CndR up0R : up0()) {
				InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
				
				oR.peg_no(up0R.peg_no());
				oR.itm_cd(up0R.itm_cd());
				oR.itm_sub1(up0R.itm_sub1());
				oR.itm_sub2(up0R.itm_sub2());
				oR.itm_sub3(up0R.itm_sub3());
				oR.mfg_loc_cd(up0R.mfg_loc_cd());
				oR.sppl_cd(up0R.sppl_cd());
				oR.maker_cd(up0R.maker_cd());
				oR.from_site_cd(up0R.from_site_cd());
				oR.to_loc_cd(up0R.loc_cd());
				oR.insp_typ(up0R.insp_typ());
				oR.base_dt(up0R.base_dt());
				oR.insp_ptn_cd(null);
				oR.no_insp_srch_flg(true);
				
				o.up0().add(oR);
			}
			
			o.exec();
			
			if (!o.down0().isEmpty()) {
				_itmInspCache = o.down0();
			}
		}
		
		protected void createItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.sublot_mng_typ);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, up0(),
					MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3);
		}
		
		protected void setSublot(MCList<Lot_Upd08_CndR> upL) {
			// サブロット管理区分：在庫のみサブロット管理するの場合の考慮
			for (Lot_Upd08_CndR upR : upL) {
				MAM_ITM_R itmR = _itmCache.get(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
				
				upR.stk_sublot_no(upR.sublot_no());
				if (!itmR.isEmpty() && MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					upR.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		protected void preProc() {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_SCHD_R> actL = MCList.create(MST_INSP_SCHD_R.class);

			for (Lot_Upd08_CndR r : up0()) {
				MST_INSP_SCHD_R schdR = MST_INSP_SCHD_R.create();
				schdR.insp_typ(r.insp_typ());
				schdR.src_no3(r.src_no3());
				schdL.add(schdR);
				if (!isNull(r.src_no4())) {
					MST_INSP_SCHD_R actR = MST_INSP_SCHD_R.create();
					actR.insp_typ(r.insp_typ());
					actR.src_no4(r.src_no4());
					actL.add(actR);
				}
			}
			MST_INSP_SCHD_R schd_t = MST_INSP_SCHD_R.create("T");
			if (!schdL.isEmpty()) {
				MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(schd_t);
				getInspSchdL(false, schd_t, schdL_bldr);
				dbSelect("MSBFL5210_MST_INSP_SCHD_S02", schdL, schdL_bldr, schdL);
			}
			if (!actL.isEmpty()) {
				MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(schd_t);
				getInspSchdL(true, schd_t, actL_bldr);
				dbSelect("MSBFL5210_MST_INSP_SCHD_S03", actL, actL_bldr, actL);
			}
			_schdList.setAll(schdL);
			_schdKey = _schdList.createIndex(MST_INSP_SCHD_R.$src_no3, MST_INSP_SCHD_R.$insp_typ);
			_actList.setAll(actL);
			_actKey = _actList.createIndex(MST_INSP_SCHD_R.$src_no4, MST_INSP_SCHD_R.$insp_typ);
			_itmInspCache = null;
		}
		
		protected void getInspSchdL(boolean isAct, MST_INSP_SCHD_R t,
				MCQueryApiBuilder ret_bldr) {
			MST_INSP_INST_R w1 = MST_INSP_INST_R.create("W1");
			ret_bldr.setSelect(t.insp_schd_no);
			ret_bldr.addSelect(t.insp_typ);
			ret_bldr.addSelect(t.src_no3);
			ret_bldr.addSelect(t.src_no4);
			ret_bldr.addSelect(t.mfg_loc_cd);
			ret_bldr.addSelect(t.sppl_cd);
			ret_bldr.addSelect(t.maker_cd);
			ret_bldr.addSelect(t.from_site_cd);
			ret_bldr.addSelect(t.loc_cd);
			ret_bldr.addSelect(t.in_prmt_insp_flg);
			ret_bldr.addSelect(w1.insp_sts_typ.as("inst_insp_sts_typ"));
			ret_bldr.addLeftOuterJoin(w1, bracket(t.insp_no.eq(w1.insp_no)));
			ret_bldr.setWhere(t.insp_typ.eq(bind("insp_typ")));
			if (isAct) {
				ret_bldr.addWhereWithAnd(t.src_no4.eq(bind("src_no4")));
			}
			else {
				ret_bldr.addWhereWithAnd(t.src_no3.eq(bind("src_no3")));
				ret_bldr.addWhereWithAnd(t.src_no4.isNull());
			}
			ret_bldr.addWhereWithAnd(t.latest_flg.eq(value(true)));
		}
		
		/**
		 * 上り電文をソートする。
		 */
		protected void sortUp() {
			MST_LOT_R tmpR = MST_LOT_R.create();
			up0().sort(tmpR.getKeyColumn());
		}
		
		/**
		 * ロットのリストを返す。
		 * @return
		 */
		protected MCList<MST_LOT_R> getLotL() {
			MCList<Lot_Upd08_CndR> gbL = up0().groupBy(Lot_Upd08_CndR.$itm_cd,
					Lot_Upd08_CndR.$itm_sub1, Lot_Upd08_CndR.$itm_sub2, Lot_Upd08_CndR.$itm_sub3,
					Lot_Upd08_CndR.$lot_no, Lot_Upd08_CndR.$sublot_no);
			
			insWk(gbL);
			
			MCList<MST_LOT_R> retL = MCList.create(MST_LOT_R.class);
			MST_LOT_R retL_t = MST_LOT_R.create("T");
			MCQueryApiBuilder retL_bldr = MCQueryApiBuilder.create(retL_t);
			MSW_LOT_KEY_R w = MSW_LOT_KEY_R.create("W");

			retL_bldr.addInnerJoin(w,
					bracket(retL_t.itm_cd.eq(w.itm_cd)
							.and(retL_t.itm_sub1.eq(w.itm_sub1))
							.and(retL_t.itm_sub2.eq(w.itm_sub2))
							.and(retL_t.itm_sub3.eq(w.itm_sub3))
							.and(retL_t.lot_no.eq(w.lot_no))
							.and(retL_t.sublot_no.eq(w.sublot_no))));
			dbSelect("MSBFL5210_MST_LOT_S06", retL, retL_bldr);

			dbWkDelete("MSBFL5210_MSW_LOT_D03", MST_LOT_R.create("T"));

			return retL;
		}
		
		/**
		 * MSW_LOT_KEYをinsertする。
		 * @param gbL
		 */
		protected void insWk(MCList<Lot_Upd08_CndR> gbL) {
			MCList<MST_LOT_R> wkL = MCList.create(MST_LOT_R.class);
			for (Lot_Upd08_CndR r : gbL) {
				if (isNullOr(r.itm_cd(), r.lot_no(), r.sublot_no())) {
					continue;
				}
				MST_LOT_R wkR = MST_LOT_R.create();
				wkR.itm_cd(r.itm_cd());
				wkR.itm_sub1(r.itm_sub1());
				wkR.itm_sub2(r.itm_sub2());
				wkR.itm_sub3(r.itm_sub3());
				wkR.lot_no(r.lot_no());
				wkR.sublot_no(r.sublot_no());
				wkL.add(wkR);
			}
			dbWkInsert("MSBFL5210_MSW_LOT_I02", wkL, MST_LOT_R.create("T"));
		}
		
		/**
		 * MST_LOTの更新処理
		 */
		protected void updLot(MCList<MST_LOT_R> lotL) {
			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(t);
			editLotSetStmt(lotL, t, lotL_bldr);
			lotL = truncDate(lotL);
			dbUpdateKey("MSBFL5210_MST_LOT_U07", lotL, lotL_bldr);
		}

		/**
		 * set句を編集する。
		 */
		protected void editLotSetStmt(MCList<MST_LOT_R> lotL, MST_LOT_R t,
				MCQueryApiBuilder lotL_bldr) {
			lotL_bldr.setSet(t.ver_no);
			lotL_bldr.addSet(t.bp_lot_no);
			lotL_bldr.addSet(t.vld_dt);
			lotL_bldr.addSet(t.lmt_dt);
			lotL_bldr.addSet(t.lmt_dt_frm_typ);
			lotL_bldr.addSet(t.lmt_dt_frm);
			lotL_bldr.addSet(t.unreg_lmt_flg);
			lotL_bldr.addSet(t.stk_insp_typ);
			lotL_bldr.addSet(t.plnt_aprv_sts_typ);
		}
		
		/**
		 * ロット更新用のDBContainerを返す。
		 * @return
		 */
		protected MST_LOT_R createLotR(Lot_Upd08_CndR r, MST_LOT_R oldLotR) {
			
			MST_LOT_R lotR = MST_LOT_R.create();
			MCRow.copyvalue(lotR, oldLotR);
			
			if (isCrtOrUpd(r)) {
				lotR.ver_no(r.ver_no());
				lotR.bp_lot_no(r.bp_lot_no());
				if (isUpdLmt(r, lotR)) {
					setLmt(r, lotR);
				}

				if (isUpdUnregLmtFlg(r, lotR)) {
					lotR.unreg_lmt_flg(false);
				}
				
				MST_INSP_SCHD_R schdR = getLatestInspSchdR(r.insp_typ(), r.src_no3(), r.src_no4());
				if (isUpdLotStkInspTyp(schdR, lotR, r.src_no3(), r.src_no4())) {
					setLotStkInspTypForUpd(r, lotR, schdR);
				}
			}
			else if (isDel(r)){
				setLotStkTypForDel(r, lotR);
			}
			return lotR;
		}

		/**
		 * CRTまたはUPDかどうか
		 * @return
		 */
		protected boolean isCrtOrUpd(Lot_Upd08_CndR r) {
			return MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ());
		}
		
		/**
		 * DELかどうか
		 * @return
		 */
		protected boolean isDel(Lot_Upd08_CndR r) {
			return MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ());
		}
		
		protected InspSchd_Srch01_CndR getItmInspR(MCNumber pegNo) {
			if (isNull(_itmInspCache)) {
				return null;
			}
			else {
				return _itmInspCache.getFirst(InspSchd_Srch01_CndR.$peg_no, pegNo);
			}
		}
		
		/**
		 * 期限更新が必要かどうかを返す。
		 */
		protected boolean isUpdLmt(Lot_Upd08_CndR r, MST_LOT_R lotR) {
			InspSchd_Srch01_CndR itmInspR = getItmInspR(r.peg_no());
			
			if (!isNull(itmInspR) && !itmInspR.lmt_ctl_flg()) {
				if (!isNull(itmInspR.lmt_dt_frm_typ())) {
					if (MAC_LMT_DT_FRM_TYP.isDPND_CHLD(itmInspR.lmt_dt_frm_typ())
							|| MAC_LMT_DT_FRM_TYP.isDPND_CHLD_FR_DT(itmInspR.lmt_dt_frm_typ())) {
						return false;
					}else {
						return true;
					}
				}
				else {
					return false;
				}
			}
			else if (!isNull(itmInspR)) {
				// 期限管理対象ＦＬＧがONの場合、期限起算日区分が以下のいずれかの場合は、期間更新を行う必要有りとする
				// 製造着手日、製造完了日、子品目起算日引継ぎ
				if (MAC_LMT_DT_FRM_TYP.isMFG_ST(itmInspR.lmt_dt_frm_typ())
						|| MAC_LMT_DT_FRM_TYP.isMFG_CMPL(itmInspR.lmt_dt_frm_typ())
						|| MAC_LMT_DT_FRM_TYP.isDPND_CHLD_FR_DT(itmInspR.lmt_dt_frm_typ())) {
					if (MAC_LOT_MNG_TYP.isUNIQ(lotR.lot_mng_typ())
							|| (MAC_LOT_MNG_TYP.isDUPL_ABL(lotR.lot_mng_typ()) && MAC_SUBLOT_MNG_TYP.isUNIQ(lotR.sublot_mng_typ()))) {
						return true;
					}
				}
			}
			else if (isNull(itmInspR)) {
				return false;
			}
			
			if (isInspJdg(r.lot_p())) {
				return false;
			}
			
			if (isNotLotUpdTgt(r, lotR, itmInspR)) {
				return false;
			}
			return true;
		}
		
		/**
		 * MST_LOTの期限関連項目の更新値を設定する。
		 */
		protected void setLmt(Lot_Upd08_CndR r, MST_LOT_R lotR) {
			InspSchd_Srch01_CndR itmInspR = getItmInspR(r.peg_no());
			
			Lot_Srch01_RsltR oRow = getVldDt(r, itmInspR);
			
			if (!isNull(oRow.vld_dt())) {
				lotR.vld_dt(oRow.vld_dt());
			}
			if (!isNull(oRow.lmt_dt())) {
				lotR.lmt_dt(oRow.lmt_dt());
			}
			lotR.lmt_dt_frm_typ(itmInspR.lmt_dt_frm_typ());
			if (!isNull(oRow.lmt_dt_frm())) {
				lotR.lmt_dt_frm(oRow.lmt_dt_frm());
			}
		}

		/**
		 *有効期限、使用期限取得サービスCALL
		 */
		protected Lot_Srch01_RsltR getVldDt(Lot_Upd08_CndR r, InspSchd_Srch01_CndR itmInspR) {
			if (isNull(itmInspR.itm_cd())) {
				return Lot_Srch01_RsltR.create();
			}

			MSBFL_LotService.Lot_Srch01 o = MSBFL_LotService.crtLot_Srch01();
			
			Lot_Srch01_CndR oR = Lot_Srch01_CndR.create();
			copy(oR, r, createMap_Lot_Srch01_CndR_Lot_Upd08_CndR());
			
			oR.lmt_dt_frm_typ(itmInspR.lmt_dt_frm_typ());
			if (itmInspR.lmt_ctl_flg()) {
				oR.vld_pd(itmInspR.vld_pd());
				oR.lmt_pd(itmInspR.lmt_pd());
				oR.calc_pd_typ(itmInspR.calc_pd_typ());
			}
			else {
				oR.vld_pd(0);
				oR.lmt_pd(0);
				oR.calc_pd_typ(null);
			}
			
			o.up0().add(oR);
			
			o.exec();
			return o.down0().get(0);
		}
		
		// Lot_Upd05_CndR -> Lot_Srch03_CndR
		protected Map_Lot_Srch01_CndR_Lot_Upd08_CndR<Lot_Srch01_CndR,Lot_Upd08_CndR> createMap_Lot_Srch01_CndR_Lot_Upd08_CndR() {
			return new Map_Lot_Srch01_CndR_Lot_Upd08_CndR<Lot_Srch01_CndR, Lot_Upd08_CndR>();
		}

		public class Map_Lot_Srch01_CndR_Lot_Upd08_CndR<D extends Lot_Srch01_CndR, S extends Lot_Upd08_CndR> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src){
				dest.peg_no(src.peg_no());
				dest.insp_typ(src.insp_typ());
				dest.src_no1(src.src_no1());
				dest.src_no2(src.src_no2());
				dest.src_no3(src.src_no3());
				dest.src_no4(src.src_no4());
				dest.base_dt(src.base_dt());
			}
		}
		
		/**
		 * 検査種類区分、作成元ＮＯ３、作成元ＮＯ４を元に、
		 * 「最新の検査回数」のMST_INSP_SCHD_Rを取得する。<br>
		 * @param inspTyp
		 * @param srcNo3
		 * @param srcNo4
		 * @return
		 */
		protected MST_INSP_SCHD_R getLatestInspSchdR(String inspTyp, String srcNo3, String srcNo4) {
			MST_INSP_SCHD_R ret;
			if (!isNull(srcNo4)) {
				ret = _actList.getFirst(_actKey, srcNo4, inspTyp);
				if (!isNull(ret)) {
					return ret;
				}
			}
			ret = _schdList.getFirst(_schdKey, srcNo3, inspTyp);
			if (!isNull(ret)) {
				return ret;
			}
			return MST_INSP_SCHD_R.create();
		}
		
		/**
		 * MST_LOTの在庫検査区分を更新するかどうか
		 */
		protected boolean isUpdLotStkInspTyp(MST_INSP_SCHD_R schdR, MST_LOT_R lotR, String srcNo3, String srcNo4) {
			//検査実績済みであれば、検査実績時に異なる値に更新されているため設定しない。
			String sts = schdR.getStringNE("inst_insp_sts_typ");
			
			if (isNull(schdR.insp_schd_no())) {
				if (!isNull(lotR.stk_insp_typ())) {
					MST_YIELD_ACT_R yieldActR = _yieldActList.getFirst(_yieldActKey, srcNo4);
					if (!isNull(yieldActR)) {
						// 良品区分が「良品」以外であれば更新しない
						if (!MAC_QUALITY_TYP.isGOOD(yieldActR.quality_typ())) {
							return false;
						}
					}
					if (isNull(srcNo4)) {
						MCList<MST_YIELD_ACT_R> yieldActL = _yieldActBySrcNo3List.subList(_yieldActBySrcNo3Key, srcNo3);
						if (!yieldActL.isEmpty()) {
							return false;
						}
					}
					// 検査対象外、かつ更新前に在庫検査区分が設定されていれば更新する
					return true;
				}
				// 検査対象外であれば更新しない
				return false;
			}
			else if (isNull(sts)) {
				return true;
			}
			else {
				return MSC_INSP_STS_TYP.isORD(sts);
			}
		}
		protected MCList<MST_YIELD_ACT_R> getYieldAct() {
			MCList<MST_YIELD_ACT_R> bindL = MCList.create(MST_YIELD_ACT_R.class);
			for (Lot_Upd08_CndR r : up0()) {
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ()) && !isNull(r.src_no4())) {
					MST_YIELD_ACT_R yieldActR = MST_YIELD_ACT_R.create();
					yieldActR.yield_act_no(r.src_no4());
					bindL.add(yieldActR);
				}
			}
			MCQueryApiBuilder yieldActWkBldr = MCQueryApiBuilder.create(MST_YIELD_ACT_R.create("YIELD_ACT_KEY"));
			dbWkDelete("MSBFL5210_MSW_YIELD_ACT_D02", yieldActWkBldr.getBaseDbc());
			dbWkInsert("MSBFL5210_MSW_YIELD_ACT_I02", bindL, yieldActWkBldr.getBaseDbc());

			MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R yieldAct = MST_YIELD_ACT_R.create("YIELD_ACT");
			MSW_YIELD_ACT_KEY_R yieldActKey = MSW_YIELD_ACT_KEY_R.create("YIELD_ACT_KEY");
			MCQueryApiBuilder yieldSchdL_bldr = MCQueryApiBuilder.create(yieldAct);
			yieldSchdL_bldr.setSelect(yieldAct.yield_act_no);
			yieldSchdL_bldr.addSelect(yieldAct.quality_typ);
			yieldSchdL_bldr.addInnerJoin(yieldActKey, yieldAct.yield_act_no.eq(yieldActKey.yield_act_no));
			dbSelect("MSBFL5210_MST_YIELD_ACT_S02", yieldActL, yieldSchdL_bldr);
			return yieldActL;
		}
		protected MCList<MST_YIELD_ACT_R> getYieldActBySrcNo3() {
			MCList<MST_YIELD_ACT_R> bindL = MCList.create(MST_YIELD_ACT_R.class);
			for (Lot_Upd08_CndR r : up0()) {
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ()) && isNull(r.src_no4()) && !isNull(r.src_no3())) {
					MST_YIELD_ACT_R yieldActR = MST_YIELD_ACT_R.create();
					yieldActR.yield_schd_no(r.src_no3());
					yieldActR.lot_no(r.lot_no());
					yieldActR.sublot_no(r.sublot_no());
					bindL.add(yieldActR);
				}
			}
			MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R yieldAct = MST_YIELD_ACT_R.create("YIELD_ACT");
			MAM_ITM_R itm = MAM_ITM_R.create("ITM");
			MCQueryApiBuilder yieldActL_bldr = MCQueryApiBuilder.create(yieldAct);
			yieldActL_bldr.setSelect(yieldAct.yield_act_no);
			yieldActL_bldr.addSelect(yieldAct.yield_schd_no);
			yieldActL_bldr.addSelect(itm.sublot_mng_typ);
			yieldActL_bldr.addLeftOuterJoin(itm, bracket(yieldAct.itm_cd.eq(itm.itm_cd)
					.and(yieldAct.itm_sub1.eq(itm.itm_sub1))
					.and(yieldAct.itm_sub2.eq(itm.itm_sub2))
					.and(yieldAct.itm_sub3.eq(itm.itm_sub3))));
			yieldActL_bldr.setWhere(yieldAct.yield_schd_no.eq(bind("yield_schd_no")));
			yieldActL_bldr.addWhereWithAnd(yieldAct.lot_no.eq(bind("lot_no")));
			yieldActL_bldr.addWhereWithAnd(bind("sublot_no").eq(
					cases()
					.when(itm.sublot_mng_typ.eq(value(MAC_SUBLOT_MNG_TYP.STK.value())))
					.then(value(MAC_STR.NULL_VAL.value()))
					.otherwise(yieldAct.sublot_no)));
			dbSelect("MSBFL5210_MST_YIELD_ACT_S03", yieldActL, yieldActL_bldr, bindL);
			return yieldActL;
		}
		/**
		 * 期限未設定フラグを更新するかどうかを返す。
		 * @return
		 */
		protected boolean isUpdUnregLmtFlg(Lot_Upd08_CndR r, MST_LOT_R lotR) {
			return (!isNull(lotR.vld_dt()) && !isNull(lotR.lmt_dt()));
		}
		
		/**
		 * MST_LOTの在庫検査区分の更新値を設定する。(CRT,UPD用)
		 */
		protected void setLotStkInspTypForUpd(Lot_Upd08_CndR r, MST_LOT_R lotR, MST_INSP_SCHD_R schdR) {
			if (isPrmtInsp(schdR) || isInspBindLot(r)) {
				lotR.stk_insp_typ(MSC_STK_INSP_TYP.YET.value());
			}
			else {
				lotR.stk_insp_typ(null);
			}
		}
		
		/**
		 * 検査中使用許可かどうか
		 * @return
		 */
		protected boolean isPrmtInsp(MST_INSP_SCHD_R schdR) {
			return schdR.in_prmt_insp_flg();
		}
		
		protected boolean isInspBindLot(Lot_Upd08_CndR r) {
			InspSchd_Srch01_CndR itmInspR = getItmInspR(r.peg_no());
			
			 if (!isNull(itmInspR) && !isNull(itmInspR.insp_mtd_typ()) 
					&& !itmInspR.no_insp_flg() 
					&& MAC_INSP_BIND_TYP.isLOT(itmInspR.insp_bind_typ())) {
				return true;
			}
			return false;
		}
		
		/**
		 * MST_LOTの在庫検査区分、工場出荷承認区分の更新値を設定する。(DEL用)
		 */
		protected void setLotStkTypForDel(Lot_Upd08_CndR r, MST_LOT_R lotR) {
			//同一サブロットの検査予定が他に存在するかどうか
			boolean boo = existsSameLotInspSchd(r);
			
			if (!boo) {
				lotR.stk_insp_typ(null);
			}
		}
		
		/**
		 * 上り電文で渡された値と同一サブロットの検査予定が存在するかどうか
		 * @return
		 */
		protected boolean existsSameLotInspSchd(Lot_Upd08_CndR r) {
			MST_INSP_SCHD_R schdR = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdR_bldr = MCQueryApiBuilder.create(schdR);
			String cntStr = "cnt";
			schdR.addNumberColumn(cntStr);
			schdR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			schdR_bldr.setWhere(schdR.itm_cd.eq(bind("1")), r.itm_cd());
			schdR_bldr.addWhereWithAnd(schdR.itm_sub1.eq(bind("1")), r.itm_sub1());
			schdR_bldr.addWhereWithAnd(schdR.itm_sub2.eq(bind("1")), r.itm_sub2());
			schdR_bldr.addWhereWithAnd(schdR.itm_sub3.eq(bind("1")), r.itm_sub3());
			schdR_bldr.addWhereWithAnd(schdR.lot_no.eq(bind("1")), r.lot_no());
			schdR_bldr.addWhereWithAnd(schdR.sublot_no.eq(bind("1")), r.stk_sublot_no());
			dbSelect("MSBFL5210_MST_INSP_SCHD_S04", schdR, schdR_bldr);
			
			return !schdR.getNumber(cntStr).isZero();
		}
		
		protected boolean isNotLotUpdTgt(Lot_Upd08_CndR r, MST_LOT_R lotR, InspSchd_Srch01_CndR itmInspR) {
			
			// 同一ロットのサブリストを作成
			String[] keys = new String[] {
					MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, 
					MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3, 
					MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no,
					Lot_Upd08_CndR.$src_no4
			};
			Comparable<?>[] vals = new Comparable[] {
					r.itm_cd(), r.itm_sub1(), 
					r.itm_sub2(), r.itm_sub3(), 
					r.lot_no(), r.sublot_no(),
					r.src_no4()
			};
			MCList<Lot_Upd08_CndR> lotList = up0().subList(keys, vals);
			if (lotList.size() > 1) {
				return true;
			}
			
			if (MSC_INSP_TYP.isLOT(r.insp_typ())) {
				return false;
			}
			
			if (lotR.unreg_lmt_flg() || isNull(lotR.lmt_dt()) || isNull(lotR.vld_dt())) {
				return false;
			}
			
			if (MAC_LMT_DT_FRM_TYP.isDPND_SHIP_FR(itmInspR.lmt_dt_frm_typ())
					|| MAC_LMT_DT_FRM_TYP.isMANUAL(itmInspR.lmt_dt_frm_typ())) {
				return false;
			}
			
			if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
				// 作成元ＮＯ４には呼び出し元で出来高実績ＮＯが設定される
				if (isNull(r.src_no4())) {
					// 設定されていない=指図
					// 自分以外の品目製造指図が取得できなかった場合は更新対象
					MCNumber itmMfgInstCnt = getItmMfgInstCnt(r);
					return !itmMfgInstCnt.isZero();
				}
				else {
					// 設定されている=実績
					// 自分以外の出来高実績が取得できなかった場合は更新対象
					MCNumber yieldActCnt = getYieldActCnt(r);
					return !yieldActCnt.isZero();
				}
			}
			else if (MSC_INSP_TYP.isACCPT(r.insp_typ())) {
				// 自分以外の入荷実績が取得できなかった場合は更新対象
				MCNumber arrActCnt = getArrActCnt(r);
				return !arrActCnt.isZero();
			}
			
			return false;
		}
		
		protected MCNumber getItmMfgInstCnt(Lot_Upd08_CndR r) {
			String cntStr = "cnt";
			
			MST_ITM_MFG_INST_R itmMfgInstR = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder itmMfgInstR_bldr = MCQueryApiBuilder.create(itmMfgInstR);
			itmMfgInstR.addNumberColumn(cntStr);
			itmMfgInstR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			itmMfgInstR_bldr.setWhere(itmMfgInstR.itm_mfg_inst_no.neq(value(r.src_no2())));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.itm_cd.eq(value(r.itm_cd())));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.itm_sub1.eq(value(r.itm_sub1())));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.itm_sub2.eq(value(r.itm_sub2())));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.itm_sub3.eq(value(r.itm_sub3())));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.lot_no.eq(value(r.lot_no())));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.sublot_no.eq(value(r.sublot_no())));
			itmMfgInstR_bldr.addWhereWithAnd(itmMfgInstR.can_flg.eq(value(false)));
			dbSelect("MSBFL5210_MST_ITM_MFG_INST_S03", itmMfgInstR, itmMfgInstR_bldr, r);
			
			return itmMfgInstR.getNumber(cntStr);
		}
		
		protected MCNumber getYieldActCnt(Lot_Upd08_CndR r) {
			String cntStr = "cnt";
			
			MST_MFG_ACT_R mfgActR = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder mfgActR_bldr = MCQueryApiBuilder.create(mfgActR);
			MST_YIELD_ACT_R yieldActR = MST_YIELD_ACT_R.create("T2");
			mfgActR.addNumberColumn(cntStr);
			mfgActR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			mfgActR_bldr.addInnerJoin(yieldActR, bracket(mfgActR.mfg_act_no.eq(yieldActR.mfg_act_no)));
			mfgActR_bldr.setWhere(yieldActR.yield_act_no.neq(value(r.src_no4())));
			mfgActR_bldr.addWhereWithAnd(yieldActR.itm_cd.eq(value(r.itm_cd())));
			mfgActR_bldr.addWhereWithAnd(yieldActR.itm_sub1.eq(value(r.itm_sub1())));
			mfgActR_bldr.addWhereWithAnd(yieldActR.itm_sub2.eq(value(r.itm_sub2())));
			mfgActR_bldr.addWhereWithAnd(yieldActR.itm_sub3.eq(value(r.itm_sub3())));
			mfgActR_bldr.addWhereWithAnd(yieldActR.lot_no.eq(value(r.lot_no())));
			mfgActR_bldr.addWhereWithAnd(yieldActR.sublot_no.eq(value(r.sublot_no())));
			dbSelect("MSBFL5210_MST_MFG_ACT_S04", mfgActR, mfgActR_bldr);
			
			return mfgActR.getNumber(cntStr);
		}
		
		protected MCNumber getArrActCnt(Lot_Upd08_CndR r) {
			String cntStr = "cnt";
			
			MST_ARR_ACT_R arrActR = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder arrActR_bldr = MCQueryApiBuilder.create(arrActR);
			arrActR.addNumberColumn(cntStr);
			arrActR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			arrActR_bldr.setWhere(arrActR.arr_act_no.neq(value(r.src_no4())));
			arrActR_bldr.addWhereWithAnd(arrActR.itm_cd.eq(value(r.itm_cd())));
			arrActR_bldr.addWhereWithAnd(arrActR.itm_sub1.eq(value(r.itm_sub1())));
			arrActR_bldr.addWhereWithAnd(arrActR.itm_sub2.eq(value(r.itm_sub2())));
			arrActR_bldr.addWhereWithAnd(arrActR.itm_sub3.eq(value(r.itm_sub3())));
			arrActR_bldr.addWhereWithAnd(arrActR.lot_no.eq(value(r.lot_no())));
			arrActR_bldr.addWhereWithAnd(arrActR.sublot_no.eq(value(r.sublot_no())));
			arrActR_bldr.addWhereWithAnd(arrActR.can_flg.eq(value(false)));
			dbSelect("MSBFL5210_MST_ARR_ACT_S04", arrActR, arrActR_bldr);
			
			return arrActR.getNumber(cntStr);
		}
	}
	/**
	 * Lot_Del01オペレーション.<p>
	 *
	 * ロットを削除する。
	 */
	public class Lot_Del01 extends MSBFL_LotService_MC_A.Lot_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			createItmCache();
			setSublot();
			compData();

			MCList<Lot_Del01_CndR> delChkL = getDelChkTgtL();
			
			if (!delChkL.isEmpty()) {
				MCList<MST_LOT_R> delLotL = MCList.create(MST_LOT_R.class);
				for (Lot_Del01_CndR delChkR : delChkL) {
					delLotL.add(delChkR.lot_p());
				}
				
				if (!delLotL.isEmpty()) {
					delLotList(delLotL);
					delLot(delLotL);
				}
			}
		}
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		
		protected void createItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.sublot_mng_typ);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, up0(),
					MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		
		protected void setSublot() {
			// サブロット管理区分：在庫のみサブロット管理するの場合の考慮
			for (Lot_Del01_CndR upR : up0()) {
				// Lot_Chk01の上り電文のsublot_noにはstk_sublot_noを設定する。
				// （ロットトレース入庫情報、出来高予定、入庫予定を見ているため。）
				upR.stk_sublot_no(upR.sublot_no());
				
				MAM_ITM_R itmR = _itmCache.get(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
				if (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
					
					continue;
				}
				if (!isNull(itmR) && MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					upR.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * データ補完する。
		 */
		protected void compData() {
			
			
			MCList<MST_LOT_R> selectL = MCList.create(MST_LOT_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_LOT_R.create("T"));
			dbSelectKey("MSBFL5210_MST_LOT_S07", selectL, selectL_bldr, up0());
			
			MCIndexKey idxkey = selectL.createIndex(MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, 
					MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3, MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);

			for (Lot_Del01_CndR upR : up0()) {
				MST_LOT_R selectR = selectL.getFirst(idxkey, upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(), upR.lot_no(), upR.sublot_no());

				if (!isNull(selectR)) {
					upR.no_del_flg(selectR.no_del_flg());
				}
			}
		}

		protected MCList<Lot_Del01_CndR> getDelChkTgtL() {
			MCList<Lot_Del01_CndR> retL = MCList.create(Lot_Del01_CndR.class);
			for (Lot_Del01_CndR r : up0()) {
				if (isDelChkTgtRow(r)) {
					retL.add(r);
				}
			}
			
			if (!retL.isEmpty()) {
				return callLotChk01(retL);
			}
			return retL;
		}
		
		protected MCList<Lot_Del01_CndR> callLotChk01(MCList<Lot_Del01_CndR> retL) {
			MSBFL_LotService.Lot_Chk01 o = MSBFL_LotService.crtLot_Chk01();
			setPegNo(retL);
			for (Lot_Del01_CndR r : retL) {
				Lot_Chk01_CndR oR = Lot_Chk01_CndR.create();
				oR.peg_no(r.peg_no());
				oR.exception_flg(true);
				oR.itm_cd(r.itm_cd());
				oR.itm_sub1(r.itm_sub1());
				oR.itm_sub2(r.itm_sub2());
				oR.itm_sub3(r.itm_sub3());
				oR.lot_no(r.lot_no());
				oR.sublot_no(r.stk_sublot_no());
				o.up0().add(oR);
			}
			
			o.exec();
			
			String[] destCols = new String[] {Lot_Chk01_CndR.$err_flg};
			String[] srcCols = new String[] {Lot_Del01_CndR.$err_flg};

			copyByPegNo(retL, destCols, o.down0(), srcCols);
			up0().clear();
			up0().addAll(retL);
			return up0().subList(r -> !r.err_flg());
		}
		
		/**
		 * 削除対象の行かどうか
		 * @return
		 */
		protected boolean isDelChkTgtRow(Lot_Del01_CndR r) {
			if (MAC_STR.isNULL_VAL(r.lot_no()) && MAC_STR.isNULL_VAL(r.sublot_no())) {
				//ロットＮＯとサブロットＮＯが両方NULL文字の場合
				//(＝ロット管理もサブロット管理もしない場合)
				//ロットは削除しない。
				
				//※ロット管理もサブロット管理もしないということは、
				//一度実績を取り消した後の、同一ロット許可チェックに引っかかる
				//こともなく、ロットレコード自体があまり重要ではない。
				//※また、仮に削除する仕様としたとしても、
				//その品目の最初の入荷・出来高以外の実績取り消し以外で
				//削除されることはほぼない。
				
				//上記理由から、パフォーマンスも考慮すると、ロットを自動で削除する
				//必要性が低いため、falseを返す。
				return false;
			}
			else if (r.no_del_flg()) {
				return false;
			}
			return true;
		}
		
		/**
		 * MST_LOTを削除する。
		 * @param delLotL_bldr 
		 */
		protected void delLot(MCList<MST_LOT_R> delLotL) {
			dbDeleteKey("MSBFL5210_MST_LOT_D01", delLotL,
					MCQueryApiBuilder.create(MST_LOT_R.create("T")));
		}

		/**
		 * MST_LOT_LISTを削除する。
		 */
		protected void delLotList(MCList<MST_LOT_R> delLotL) {
			MCList<MST_LOT_LIST_R> lotListL = MCList.create(MST_LOT_LIST_R.class);
			MST_LOT_LIST_R t = MST_LOT_LIST_R.create("T");
			MCQueryApiBuilder lotListL_bldr = MCQueryApiBuilder.create(t);
			lotListL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			lotListL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			lotListL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			lotListL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			lotListL_bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
			lotListL_bldr.addWhereWithAnd(t.sublot_no.eq(bind("sublot_no")));
			dbSelect("MSBFL5210_MST_LOT_LIST_S02", lotListL, lotListL_bldr, delLotL);
			if (!lotListL.isEmpty()) {
				dbDeleteKey("MSBFL5210_MST_LOT_LIST_D01", lotListL, lotListL_bldr);
			}
		}
	}
	
	protected MST_LOT_R getFirstLotR(MCList<MST_LOT_R> dbLotL, MCIndexKey idxkey, MST_LOT_R upLotR) {
		MST_LOT_R ret = dbLotL.getFirst(idxkey, getVals(upLotR, upLotR.getKeyColumn()));
		if (isNull(ret)) {
			return MST_LOT_R.create();
		}
		else {
			return ret;
		}
	}

	protected MST_LOT_LIST_R getFirstLotListR(MCList<MST_LOT_LIST_R> dbLotL, MCIndexKey idxkey, MST_LOT_LIST_R upLotR) {
		MST_LOT_LIST_R ret = dbLotL.getFirst(idxkey, getVals(upLotR, upLotR.getKeyColumn()));
		if (isNull(ret)) {
			return MST_LOT_LIST_R.create();
		}
		else {
			return ret;
		}
	}
	
	protected Comparable[] getVals(MCRow row, String[] keys) {
		Comparable[] vals = new Comparable[keys.length];
		int i = 0;
		for (String col : keys) {
			vals[i] = row.getValueNE(col);
			i++;
		}
		return vals;
	}
	
	protected boolean isInspJdg(MST_LOT_R lotR) {
		MST_INSP_INST_R instR = MST_INSP_INST_R.create("T");
		MCQueryApiBuilder instR_bldr = MCQueryApiBuilder.create(instR);
		String cntStr = "cnt";
		instR.addNumberColumn(cntStr);
		instR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
		instR_bldr.setWhere(instR.itm_cd.eq(bind("1")), lotR.itm_cd());
		instR_bldr.addWhereWithAnd(instR.itm_sub1.eq(bind("1")), lotR.itm_sub1());
		instR_bldr.addWhereWithAnd(instR.itm_sub2.eq(bind("1")), lotR.itm_sub2());
		instR_bldr.addWhereWithAnd(instR.itm_sub3.eq(bind("1")), lotR.itm_sub3());
		instR_bldr.addWhereWithAnd(instR.lot_no.eq(bind("1")), lotR.lot_no());
		instR_bldr.addWhereWithAnd(instR.sublot_no.eq(bind("1")), lotR.sublot_no());
		instR_bldr.addWhereWithAnd(instR.insp_sts_typ.eq(bind("1")), MSC_INSP_STS_TYP.JDG.value());
		dbSelect("MSBFL5210_MST_INSP_INST_S02", instR, instR_bldr);
		
		return !instR.getNumber(cntStr).isZero();
	}
	/**
	 * ロット情報の有効期限、使用期限、起算日に対して、年月日までで値を設定しなおす
	 * @param lotL
	 * @return lotL
	 */
	protected MCList<MST_LOT_R> truncDate(MCList<MST_LOT_R> lotL) {
		if (isNull(lotL)) {
			return lotL;
		}
		for (MST_LOT_R r : lotL) {
			//有効期限、使用期限、起算日は、時分秒を切り捨てる
			if (!isNull(r.vld_dt())) {
				r.vld_dt(r.vld_dt().trunc(MCDateFieldType.DAY));
			}
			if (!isNull(r.lmt_dt())) {
				r.lmt_dt(r.lmt_dt().trunc(MCDateFieldType.DAY));
			}
			if (!isNull(r.lmt_dt_frm())) {
				r.lmt_dt_frm(r.lmt_dt_frm().trunc(MCDateFieldType.DAY));
			}
		}
		return lotL;
	}

	//FMCB CUSTOM END
}