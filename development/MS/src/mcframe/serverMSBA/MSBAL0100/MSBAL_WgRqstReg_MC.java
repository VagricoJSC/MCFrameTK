package mcframe.serverMSBA.MSBAL0100;

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
import mcframe.serverMSBA.MSBAL0100.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBA.MSBAL5100.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import mcframe.serverMSUC.MSUCL0110.MSUCL_StrLnUtil;
import mcframe.serverMSUC.MSUCL0110.StrLnUtil_Srch01_CndR;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil_FW.isNull;
import static mcframe.serverMSBA.MSBAL0100.Query.*;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;

import java.util.ArrayList;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverMSBD.MSBDL5040.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBAL_WgRqstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBAL_WgRqstReg_MC extends MSBAL_WgRqstReg_MC_A{
	//FMCB CUSTOM START
	String _sysParm = getSysParm("MASTER_DT_BASE");
	/**
	 * Chk02オペレーション.<p>
	 *
	 * ＷＧ間依頼を取り消すために、チェックを行う<br>
	 */
	public class Chk02 extends MSBAL_WgRqstReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			callWgRqstSrvChk01();
			
			setErrToRtnStsTyp();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkWgRqst());
			
			return msgL;
		}

		/**
		 * ＷＧ間依頼のロック、更新カウンタチェック
		 */
		protected MCMessageList chkWgRqst() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MST_WG_RQST_R t = MST_WG_RQST_R.create("T");
			MCList<MST_WG_RQST_R> selectL = MCList.create(MST_WG_RQST_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.wg_rqst_no, t.rqst_fr_wg_cd, t.gr_loc_cd, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.wg_rqst_no);
			MCList<Chk02_RsltR> bindL = notErrL;
			bindL.sort(Chk02_RsltR.$wg_rqst_no);
			dbSelectKeyForUpdateNoWait("MSBAL0100_MST_WG_RQST_S01", selectL, selectL_bldr, bindL);
			
			MCIndexKey idxkey = selectL.createIndex(MST_WG_RQST_R.$wg_rqst_no);
			for (Chk02_RsltR r : notErrL) {
				MST_WG_RQST_R selectR = selectL.getFirst(idxkey, r.wg_rqst_no());
				if(!isNull(selectR)) {
					msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$wg_rqst_upd_cntr, selectR));
					selectR.setAttributes(r);
					msgL.addAll(checkWritableWgCdDac(selectR, MST_WG_RQST_R.$rqst_fr_wg_cd));
					msgL.addAll(checkWritableLocCdDac(selectR, MST_WG_RQST_R.$gr_loc_cd));
				}
			}
			return msgL;
		}

		/**
		 * ＷＧ間依頼サービスのチェック処理を実行する
		 */
		protected void callWgRqstSrvChk01() {
			MSBAL_WgRqstService.WgRqst_Chk01 ope = MSBAL_WgRqstService.crtWgRqst_Chk01();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			for(Chk02_RsltR r : notErrL) {
				WgRqst_Chk01_DtlR wgRqstChk01DtlR = WgRqst_Chk01_DtlR.create();
				copy(wgRqstChk01DtlR, r, createMap_WgRqst_Chk01_DtlR_Chk02_RsltR());
				ope.up0().add(wgRqstChk01DtlR);
			}
			
			if(!ope.up0().isEmpty()) {
				ope.exec();
			}
			copyErrFlg(up0(), ope.down0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_WgRqst_Chk01_DtlR_Chk02_RsltR<WgRqst_Chk01_DtlR,Chk02_RsltR> createMap_WgRqst_Chk01_DtlR_Chk02_RsltR() {
			return new Map_WgRqst_Chk01_DtlR_Chk02_RsltR<WgRqst_Chk01_DtlR, Chk02_RsltR>();
		}

		public class Map_WgRqst_Chk01_DtlR_Chk02_RsltR<D extends WgRqst_Chk01_DtlR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Chk01_DtlR.$data_crud_typ, Chk02_RsltR.$data_crud_typ);
				addColumnPathMap(WgRqst_Chk01_DtlR.$peg_no, Chk02_RsltR.$peg_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$wg_rqst_no, Chk02_RsltR.$wg_rqst_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$wg_rqst_typ, Chk02_RsltR.$wg_rqst_typ);
				addColumnPathMap(WgRqst_Chk01_DtlR.$wg_rqst_src_typ, Chk02_RsltR.$wg_rqst_src_typ);
				addColumnPathMap(WgRqst_Chk01_DtlR.$wg_rqst_src_no, Chk02_RsltR.$wg_rqst_src_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$rqst_fr_wg_cd, Chk02_RsltR.$rqst_fr_wg_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$rqst_to_wg_cd, Chk02_RsltR.$rqst_to_wg_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.screen_crct_flg(true);
			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * ＷＧ間依頼、ＷＧ間依頼回答を検索する<br>
	 */
	public class Srch01 extends MSBAL_WgRqstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());
			
			MCQueryPlan wgRqstSql = MSBAL0100_MST_WG_RQST_S01();
			searchForDL(wgRqstSql, up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
		}

		@Override
		protected void doSearchSub() {
			super.doSearchSub();

			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			for(Srch01_Rslt1R r : down0()) {
				MST_WG_RQST_R wgRqstR = MST_WG_RQST_R.create();
				wgRqstR.wg_rqst_no(r.wg_rqst_no());
				wgRqstL.add(wgRqstR);
			}
			if(!wgRqstL.isEmpty()) {
				dbWkInsert("MSBAL0100_MSW_WG_RQST_I01", wgRqstL, MCQueryApiBuilder.create(MST_WG_RQST_R.create("T")).getBaseDbc());
			}
			executeQuery(down1(), MSBAL0100_MST_WG_RQST_PRMS_S01());
		}

		@Override
		protected void editListSub() {
			super.editListSub();
			
			// 確定済の数量を集計
			MCIndexKey down1Key = down1().createIndex(Srch01_Rslt2R.$wg_rqst_no, Srch01_Rslt2R.$fix_flg);
			for(Srch01_Rslt1R rslt1R : down0()) {
				MCNumber cmplQty = MCNumber.ZERO;
				for(Srch01_Rslt2R rslt2R : down1().subList(down1Key, rslt1R.wg_rqst_no(), true)) {
					cmplQty = cmplQty.add(rslt2R.prms_base_unit_qty());
				}
				rslt1R.cmpl_qty(cmplQty);
			}
			
			for(Srch01_Rslt2R r : down1()) {
				if(isNull(r.gi_str_ln_cd())) {
					r.gi_str_ln_cd_none_flg(true);
				}
			}
		}
		
		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up 上り電文
		 */
		protected void setUpTmpCol(Srch01_CndR up) {
			if(up.xfr_rqst_flg()) {
				up.addStringColumn("TMP_XFR_RQST", MSC_WG_RQST_TYP.XFR.value());
			}
			if(up.purc_rqst_flg()) {
				up.addStringColumn("TMP_PURC_RQST", MSC_WG_RQST_TYP.PURC.value());
			}
			if(up.ship_rqst_flg()) {
				up.addStringColumn("TMP_SHIP_RQST", MSC_WG_RQST_TYP.SHIP.value());
			}
			if(up.rqst_sts_flg()) {
				up.addStringColumn("TMP_RQST_STS", MSC_WG_RQST_STS_TYP.RQST.value());
			}
			if(up.prms_sts_flg()) {
				up.addStringColumn("TMP_PRMS_STS", MSC_WG_RQST_STS_TYP.PRMS.value());
			}
			if(up.part_inst_sts_flg()) {
				up.addStringColumn("TMP_PART_INST_STS", MSC_WG_RQST_STS_TYP.PART_INST.value());
			}
			if(up.inst_sts_flg()) {
				up.addStringColumn("TMP_INST_STS", MSC_WG_RQST_STS_TYP.INST.value());
			}
			if(up.cmpl_sts_flg()) {
				up.addStringColumn("TMP_CMPL_STS", MSC_WG_RQST_STS_TYP.CMPL.value());
			}
			if(!isNull(up.gr_schd_dt_fr())
					|| !isNull(up.gr_schd_dt_to())
					|| !isNull(up.gi_schd_dt_fr())
					|| !isNull(up.gi_schd_dt_to())
			) {
				up.addStringColumn("TMP_PRMS_CHK", toTrueStr(true));
			}
			else {
				up.addStringColumn("TMP_PRMS_CHK", toFalseStr(false));
			}
			up.addStringColumn("TMP_SLO_RQST", toTrueStr(up.slo_rqst_flg()));
			up.addStringColumn("TMP_UN_SLO", toTrueStr(up.un_slo_flg()));
			
			up.addStringColumn("TMP_RE_RQST", toTrueStr(up.re_rqst_flg()));
			up.addStringColumn("TMP_PRMS_DIV", toTrueStr(up.prms_div_flg()));
			up.addStringColumn("TMP_PRMS_SHRTG", toTrueStr(up.prms_shrtg_flg()));
			up.addStringColumn("TMP_DUE_DELAY", toTrueStr(up.due_delay_flg()));
			up.addStringColumn("TMP_PRMS_UNCN", toTrueStr(up.prms_uncn_flg()));
			up.addStringColumn("TMP_INC_CAN", toTrueStr(up.inc_can_flg()));
			
			if(isNull(up.wg_rqst_ntc_day_typ())) {
				up.addStringColumn("WG_RQST_SRCH_DTY_TYP_NONE", toTrueStr(true));
			}
			else {
				if(MSC_WG_RQST_NTC_DAY_TYP.isRQST_DT(up.wg_rqst_ntc_day_typ())) {
					up.addDateColumn("WG_RQST_RQST_DT_FR", up.srch_dt_fr());
					up.addDateColumn("WG_RQST_RQST_DT_TO", up.srch_dt_to());
				}
				else if(MSC_WG_RQST_NTC_DAY_TYP.isRQST_CRRCT_DT(up.wg_rqst_ntc_day_typ())) {
					up.addDateColumn("WG_RQST_RQST_CRRCT_DT_FR", up.srch_dt_fr());
					up.addDateColumn("WG_RQST_RQST_CRRCT_DT_TO", up.srch_dt_to());
				}
				else if (MSC_WG_RQST_NTC_DAY_TYP.isRQST_CAN_DT(up.wg_rqst_ntc_day_typ())) {
					up.addDateColumn("WG_RQST_RQST_CAN_DT_FR", up.srch_dt_fr());
					up.addDateColumn("WG_RQST_RQST_CAN_DT_TO", up.srch_dt_to());
				}
				else if (MSC_WG_RQST_NTC_DAY_TYP.isPRMS_DT(up.wg_rqst_ntc_day_typ())) {
					up.addDateColumn("WG_RQST_PRMS_DT_FR", up.srch_dt_fr());
					up.addDateColumn("WG_RQST_PRMS_DT_TO", up.srch_dt_to());
				}
				else if (MSC_WG_RQST_NTC_DAY_TYP.isPRMS_CAN_DT(up.wg_rqst_ntc_day_typ())) {
					up.addDateColumn("WG_RQST_PRMS_CAN_DT_FR", up.srch_dt_fr());
					up.addDateColumn("WG_RQST_PRMS_CAN_DT_TO", up.srch_dt_to());
				}
				else if (MSC_WG_RQST_NTC_DAY_TYP.isINST_DT(up.wg_rqst_ntc_day_typ())) {
					up.addDateColumn("WG_RQST_INST_DT_FR", up.srch_dt_fr());
					up.addDateColumn("WG_RQST_INST_DT_TO", up.srch_dt_to());
				}
				else if (MSC_WG_RQST_NTC_DAY_TYP.isINST_CAN_DT(up.wg_rqst_ntc_day_typ())) {
					up.addDateColumn("WG_RQST_INST_CAN_DT_FR", up.srch_dt_fr());
					up.addDateColumn("WG_RQST_INST_CAN_DT_TO", up.srch_dt_to());
				}
				else if (MSC_WG_RQST_NTC_DAY_TYP.isACT_DT(up.wg_rqst_ntc_day_typ())) {
					up.addDateColumn("WG_RQST_ACT_DT_FR", up.srch_dt_fr());
					up.addDateColumn("WG_RQST_ACT_DT_TO", up.srch_dt_to());
				}
				else if (MSC_WG_RQST_NTC_DAY_TYP.isACT_CAN_DT(up.wg_rqst_ntc_day_typ())) {
					up.addDateColumn("WG_RQST_ACT_CAN_DT_FR", up.srch_dt_fr());
					up.addDateColumn("WG_RQST_ACT_CAN_DT_TO", up.srch_dt_to());
				}
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * ＷＧ間依頼を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MSBAL_WgRqstReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			callWgRqstSrvChk01();
			
			setErrToRtnStsTyp();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkWgRqst());
			
			crrctDataBeforeDoServerChk();
			getDataForExistChk(up0());
			
			return msgL;
		}
		
		/**
		 * ＷＧ間依頼のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkWgRqst() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_WG_RQST_R> selectL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t = MST_WG_RQST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.wg_rqst_no);
			MCList<Chk01_RsltR> bindL = notErrL;
			bindL.sort(Chk01_RsltR.$wg_rqst_no);
			if (up1().file_imp_flg()) {
				dbSelectKey("MSBAL0100_MST_WG_RQST_S02", selectL, selectL_bldr, bindL);
			}
			else {
				dbSelectKeyForUpdateNoWait("MSBAL0100_MST_WG_RQST_S03", selectL, selectL_bldr, bindL);
			}
			
			MCIndexKey idxkey = selectL.createIndex(MST_WG_RQST_R.$wg_rqst_no);
			for (Chk01_RsltR r : notErrL) {
				MST_WG_RQST_R selectR = selectL.getFirst(idxkey, r.wg_rqst_no());
				if (up1().file_imp_flg()) {
					if (!isNull(r.wg_rqst_no())) {
						// 存在チェック
						if (selectR == null) {
							msgL.add(msgNotExistInTable(t, r, Chk01_RsltR.$wg_rqst_no));
						}
						else {
							r.rqst_dt(selectR.rqst_dt());
							r.prms_ntc_flg(selectR.prms_ntc_flg());
							r.prms_dt(selectR.prms_dt());
							r.re_prms_ntc_flg(selectR.re_prms_ntc_flg());
							r.re_prms_dt(selectR.re_prms_dt());
							r.wg_rqst_typ(selectR.wg_rqst_typ());
							r.wg_rqst_sts_typ(selectR.wg_rqst_sts_typ());
							r.wg_rqst_src_typ(selectR.wg_rqst_src_typ());
							r.wg_rqst_src_no(selectR.wg_rqst_src_no());
							r.rqst_fr_wg_cd(selectR.rqst_fr_wg_cd());
							r.rqst_fr_usr_cd(selectR.rqst_fr_usr_cd());
							r.rqst_fr_dpt_cd(selectR.rqst_fr_dpt_cd());
							r.itm_ord_no(selectR.itm_ord_no());
							r.slo_no(selectR.slo_no());
							r.slo_d_no(selectR.slo_d_no());
							r.io_schd_pr_no(selectR.io_schd_pr_no());
							r.wg_rqst_upd_cntr(selectR.upd_cntr());
							if (!MSC_WG_RQST_SRC_TYP.isMNL(r.wg_rqst_src_typ())) {
								r.itm_cd(selectR.itm_cd());
								r.itm_sub1(selectR.itm_sub1());
								r.itm_sub2(selectR.itm_sub2());
								r.itm_sub3(selectR.itm_sub3());
								r.itm_nm(selectR.itm_nm());
								r.iv_itm_nm(selectR.iv_itm_nm());
							}
							if (!isNull(selectR.slo_no())) {
								msgL.add(new MCMessage(r, null, MSBAL0019, selectR.wg_rqst_no(), toDispGUIIndex(r)));
							}
							if (selectR.can_flg()) {
								msgL.add(new MCMessage(r, null, MSBAL0020, selectR.wg_rqst_no(), toDispGUIIndex(r)));
							}
						}
					}
					else {
						// 出荷依頼をファイル入力した場合はエラー
						if(MSC_WG_RQST_TYP.isSHIP(r.wg_rqst_typ())) {
							msgL.add(new MCMessage(r, null, MSBAL0024, toDispGUIIndex(r)));
						}
					}
				}
				else {
					if(!isNull(selectR)) {
						msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$wg_rqst_upd_cntr, selectR));
					}
				}
				if(!isNull(selectR)) {
					selectR.setAttributes(r);
					msgL.addAll(checkWritableWgCdDac(selectR, MST_WG_RQST_R.$rqst_fr_wg_cd));
					msgL.addAll(checkWritableLocCdDac(selectR, MST_WG_RQST_R.$gr_loc_cd));
				}
			}
			return msgL;
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			for(Chk01_RsltR r : notErrL) {
				if(r.isStatusCreate() && !up1().file_imp_flg()) {
					r.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.MNL.value());
				}
				
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					r.gi_rqst_tm(null);
					r.rqst_to_loc_cd(MAC_STR.NULL_VAL.value());
					r.rqst_to_str_ln_cd(MAC_STR.NULL_VAL.value());
					r.lot_no(MAC_STR.NULL_VAL.value());
					r.sublot_no(MAC_STR.NULL_VAL.value());
					r.sno1_null_flg(false);
					r.sno2_null_flg(false);
					r.sno3_null_flg(false);
					r.sno4_null_flg(false);
					r.gd_cd(null);
					if(isNullOrNullVal(r.mfg_loc_cd())) {
						r.bom_ptn(MAC_STR.NULL_VAL.value());
					}
				}
				else {
					r.mfg_loc_cd(MAC_STR.NULL_VAL.value());
					r.bom_ptn(MAC_STR.NULL_VAL.value());
					r.sppl_cd(MAC_STR.NULL_VAL.value());
					r.maker_cd(MAC_STR.NULL_VAL.value());
					r.purc_rsn_cd(null);
					r.trd_cd(null);
				}
												
				// 負担品目に対する枝番のNULL文字補完
				if(!isNull(r.bd_itm_cd())) {
					if(isNull(r.bd_itm_sub1())) {
						r.bd_itm_sub1(MAC_STR.NULL_VAL.value());
					}
					if(isNull(r.bd_itm_sub2())) {
						r.bd_itm_sub2(MAC_STR.NULL_VAL.value());
					}
					if(isNull(r.bd_itm_sub3())) {
						r.bd_itm_sub3(MAC_STR.NULL_VAL.value());
					}
				}
				else {
					r.bd_itm_sub1(null);
					r.bd_itm_sub2(null);
					r.bd_itm_sub3(null);
					r.bd_itm_nm(null);
				}
			}
		}
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			ListLogicBind trdBind = getListLogicBind(up0(), Chk01_RsltR.$trd_cd);
			trdBind.putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.TrdCols.$i_func_id, (Comparable<?>)"MSBAP0100");
		}

		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row,
				String column) {
			if (isSame(paramIndex, 0)) {
				if (isSame(column, Chk01_RsltR.$itm_nm)) {
					if (row.getBoolean(Chk01_RsltR.$sundry_itm_flg)) {
						return false;
					}
				}
				if (isSame(column, Chk01_RsltR.$sppl_cd) || isSame(column, Chk01_RsltR.$maker_cd)) {
					if (isNullOrNullVal(row.getString(Chk01_RsltR.$mfg_loc_cd))) {
						return false;
					}
				}
				if (isSame(column, Chk01_RsltR.$rqst_to_wg_cd)) {
					if(isNullOrNullVal(row.getString(Chk01_RsltR.$rqst_to_loc_cd))) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			callPurcUtilSrch01();

			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			MCList<MST_WG_RQST_PRMS_R> wgRqstPrmsL = MCList.create(MST_WG_RQST_PRMS_R.class);
			if (!notErrL.isEmpty()) {
				MST_WG_RQST_PRMS_R t = MST_WG_RQST_PRMS_R.create("T");
				MCQueryApiBuilder wgRqstPrmsL_bldr = MCQueryApiBuilder.create(t);
				wgRqstPrmsL_bldr.setGroupBy(t.wg_rqst_no);
				wgRqstPrmsL_bldr.addSum(t.prms_base_unit_qty, "PRMS_BASE_UNIT_QTY");
				wgRqstPrmsL_bldr.setWhere(t.fix_flg.eq(value(true)));
				wgRqstPrmsL_bldr.addWhereWithAnd(t.wg_rqst_no.eq(bind("wg_rqst_no")));
				dbSelect("MSBAL0100_MST_WG_RQST_PRMS_S01", 
						wgRqstPrmsL, wgRqstPrmsL_bldr, notErrL.groupBy(Chk01_RsltR.$wg_rqst_no));
			}
			MCIndexKey wgRqstPrmsKey = wgRqstPrmsL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_no);
			
			for(Chk01_RsltR r : notErrL) {				
				msgL.addAll(checkWritableWgCdDac(r, Chk01_RsltR.$rqst_fr_wg_cd));
				msgL.addAll(checkWritableLocCdDac(r, Chk01_RsltR.$gr_loc_cd));
				if(r.re_rqst_flg()) {
					msgL.addAll(check(r, Chk01_RsltR.$re_rqst_dt, new FXUCL_RequiredValidater()));
				}
				
				if(r.ver_flg()) {
					msgL.addAll(check(r, Chk01_RsltR.$ver_no, new FXUCL_RequiredValidater()));
				}
				
				if(isSame(r.rqst_fr_wg_cd(), r.rqst_to_wg_cd())) {
					msgL.add(new MCMessage(r, null , MSBAL0001, r.rqst_fr_wg_cd(), r.rqst_to_wg_cd(), toDispGUIIndex(r)));
				}
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					if(isSame(r.sppl_cd(), MAC_STR.NULL_VAL.value())) {
						msgL.add(new MCMessage(r, null , MSBAL0002, toDispGUIIndex(r)));
					}
				}
				else if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					if(isSame(r.rqst_to_loc_cd(), MAC_STR.NULL_VAL.value())) {
						msgL.add(new MCMessage(r, null , MSBAL0003, toDispGUIIndex(r)));
					}
					if(isSame(r.gr_loc_wg_cd(), r.rqst_to_wg_cd())) {
						msgL.add(new MCMessage(r, null , MSBAL0035, r.gr_loc_wg_cd(), r.rqst_to_wg_cd(), toDispGUIIndex(r)));
					}
				}
				
				// 値引品の場合
				if (r.dscnt_itm_flg()) {
					r.trd_unit_qty(MCNumber.ONE);
					r.trd_unit_cd(r.base_unit_cd());
					r.trd_unit_nm(r.base_unit_nm());
					r.trd_unit_rnd_typ(r.base_unit_rnd_typ());
					r.trd_unit_dec_place(r.base_unit_dec_place());
				}
				
				if(!r.sundry_itm_flg() || !r.sppl_iv_flg()) {
					r.iv_itm_nm(null);
				}
				
				// 手配ＮＯ１～４
				// ※checkerで補完した場合も含め、NULL文字を一旦クリアしてから必須チェックする
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
					r.sno1(nullValToNull(r.sno1()));
					msgL.addAll(check(r, Chk01_RsltR.$sno1, new FXUCL_RequiredValidater()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
					r.sno2(nullValToNull(r.sno2()));
					msgL.addAll(check(r, Chk01_RsltR.$sno2, new FXUCL_RequiredValidater()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
					r.sno3(nullValToNull(r.sno3()));
					msgL.addAll(check(r, Chk01_RsltR.$sno3, new FXUCL_RequiredValidater()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
					r.sno4(nullValToNull(r.sno4()));
					msgL.addAll(check(r, Chk01_RsltR.$sno4, new FXUCL_RequiredValidater()));
				}

				// 手配ＮＯ１～４　管理しない場合
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
					r.sno1(MAC_STR.NULL_VAL.value());
					r.sno1_null_flg(false);
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
					r.sno2(MAC_STR.NULL_VAL.value());
					r.sno2_null_flg(false);
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
					r.sno3(MAC_STR.NULL_VAL.value());
					r.sno3_null_flg(false);
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
					r.sno4(MAC_STR.NULL_VAL.value());
					r.sno4_null_flg(false);
				}
				
				if(!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					setBaseUnitQty(r);
					
					// 依頼残数量を計算
					if (up1().file_imp_flg()) {
						if (!isNull(r.wg_rqst_no())) {
							MST_WG_RQST_PRMS_R wgRqstPrmsR = wgRqstPrmsL
									.getFirst(wgRqstPrmsKey, r.wg_rqst_no());
							if (!isNull(wgRqstPrmsR)) {
								r.cmpl_qty(wgRqstPrmsR.prms_base_unit_qty());
								MCNumber notCmplQty = r.base_unit_qty()
										.subtract(nvl(r.cmpl_qty(), MCNumber.ZERO));
								if (notCmplQty.isNegative()) {
									notCmplQty = MCNumber.ZERO;
								}
								r.not_cmpl_qty(notCmplQty);
							}
							else {
								r.not_cmpl_qty(r.base_unit_qty());
							}
						}
						else {
							r.not_cmpl_qty(r.base_unit_qty());
						}
					}
				}
				
				// 資産管理しない品目の購買依頼以外は負担部品の項目を全てnullにする
				if (!MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ())
						|| !MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					r.bd_dpt_cd(null);
					r.bd_dpt_nm(null);
					r.bd_itm_cd(null);
					r.bd_itm_sub1(null);
					r.bd_itm_sub2(null);
					r.bd_itm_sub3(null);
					r.bd_itm_nm(null);
					r.bd_lot_mng_typ(null);
					r.bd_sublot_mng_typ(null);
					r.bd_lot_no_typ(null);
					r.bd_sublot_no_typ(null);
					r.bd_sno1_mng_typ(null);
					r.bd_sno2_mng_typ(null);
					r.bd_sno3_mng_typ(null);
					r.bd_sno4_mng_typ(null);
					r.bd_lot_no(null);
					r.bd_sublot_no(null);
					r.bd_sno1(null);
					r.bd_sno2(null);
					r.bd_sno3(null);
					r.bd_sno4(null);
					r.bd_loc_cd(null);
					r.bd_loc_nm(null);
					r.bd_ctg_cd(null);
					r.bd_ctg_nm(null);
					r.bd_oper_cd(null);
					r.bd_oper_nm(null);
					r.bd_iv_no(null);
					r.bd_slo_no(null);
					r.bd_po_no(null);
				}
				
				// 負担手配ＮＯ対応
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.bd_sno1_mng_typ())) {
					r.bd_sno1(nullValToNull(r.bd_sno1()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.bd_sno2_mng_typ())) {
					r.bd_sno2(nullValToNull(r.bd_sno2()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.bd_sno3_mng_typ())) {
					r.bd_sno3(nullValToNull(r.bd_sno3()));
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.bd_sno4_mng_typ())) {
					r.bd_sno4(nullValToNull(r.bd_sno4()));
				}
				
				// 負担手配ＮＯ１～４　管理しない場合
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.bd_sno1_mng_typ())) {
					r.bd_sno1(null);
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.bd_sno2_mng_typ())) {
					r.bd_sno2(null);
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.bd_sno3_mng_typ())) {
					r.bd_sno3(null);
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.bd_sno4_mng_typ())) {
					r.bd_sno4(null);
				}
				
				// 負担ロットＮＯ、負担サブロットＮＯの補完
				if(MAC_LOT_MNG_TYP.isNOT_MNG(r.bd_lot_mng_typ())) {
					r.bd_lot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					r.bd_lot_no(nullValToNull(r.bd_lot_no()));
				}
				if(MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.bd_sublot_mng_typ())) {
					r.bd_sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					r.bd_sublot_no(nullValToNull(r.bd_sublot_no()));
				}
				
				// 負担発注ＮＯ、負担受注ＮＯ、負担インボイスＮＯの存在チェック
				if (!isNull(r.bd_po_no())) {
					if (!existsPoNo(r.bd_po_no())) {
						msgL.add(new MCMessage(r, Chk01_RsltR.$bd_po_no, MSBAL0028, r.bd_po_no(), toDispGUIIndex(r)));
					}
				}
				if (!isNull(r.bd_slo_no())) {
					if (!existsSloNo(r.bd_slo_no())) {
						msgL.add(new MCMessage(r, Chk01_RsltR.$bd_slo_no, MSBAL0029, r.bd_slo_no(), toDispGUIIndex(r)));
					}
				}
				if (!isNull(r.bd_iv_no())) {
					if (!existsBdIvNo(r.bd_iv_no())) {
						msgL.add(new MCMessage(r, Chk01_RsltR.$bd_iv_no, MSBAL0030, r.bd_iv_no(), toDispGUIIndex(r)));
					}
				}
				
				//----------------------------
				// 経費購買関連チェック
				//----------------------------
				if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					// 経費購買の場合、資産管理しない品目しか登録できない
					if (MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()) && MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
						msgL.add(new MCMessage(r, null, MSBAL0025, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								toDispGUIIndex(r)));
					}
					// 資産管理する品目に経費理由を設定できない
					if (MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ()) && r.xpns_purc_flg()) {
						msgL.add(new MCMessage(r, null, MSBAL0026, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								r.purc_rsn_cd(), toDispGUIIndex(r)));
					}
					// 資産管理しない品目には経費理由しか設定できない
					if (MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ()) && !isNull(r.purc_rsn_cd()) && !r.xpns_purc_flg()) {
						msgL.add(new MCMessage(r, null, MSBAL0027, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								r.purc_rsn_cd(), toDispGUIIndex(r)));
					}					
				}
				
				// 品目詳細マスタの存在チェックを行う
				MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
				itmDtlR.setAttributes(r);
				itmDtlR.itm_cd(r.itm_cd());
				itmDtlR.itm_sub1(r.itm_sub1());
				itmDtlR.itm_sub2(r.itm_sub2());
				itmDtlR.itm_sub3(r.itm_sub3());
				itmDtlR.mfg_loc_cd(r.mfg_loc_cd());
				if(isNullOrNullVal(r.mfg_loc_cd())) {
					itmDtlR.sppl_cd(r.sppl_cd());
					itmDtlR.maker_cd(r.maker_cd());
				}
				else {
					itmDtlR.sppl_cd(MAC_STR.NULL_VAL.value());
					itmDtlR.maker_cd(MAC_STR.NULL_VAL.value());
				}
				itmDtlR.rqst_loc_cd(r.rqst_to_loc_cd());
				itmDtlR.wg_cd(r.gr_loc_wg_cd());
				itmDtlR.bom_ptn(r.bom_ptn());
				if (isSame(_sysParm, "1")) {
					if (MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
						itmDtlR.st_dt(r.getDate("avl_schd_dt"));
					}
					else {
						itmDtlR.st_dt(r.gr_rqst_tm());
					}
				}
				else {
					itmDtlR.st_dt(r.po_schd_dt());
				}
				if (!MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					itmDtlL.add(itmDtlR);
				}
				
				// ロットＮＯ、サブロットＮＯ
				if(!MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					if(!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
						r.lot_no(nullValToNull(r.lot_no()));
					}
					else {
						r.lot_no(MAC_STR.NULL_VAL.value());
					}
					
					if(!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
						r.sublot_no(nullValToNull(r.sublot_no()));
					}
					else {
						r.sublot_no(MAC_STR.NULL_VAL.value());
					}
				}
			}

			// Ｉ／Ｖ表記品名を設定
			setIvItmNm();
			
			// 品目詳細マスタのチェック・補完
			msgL.addAll(MSUCL_ProdUtil.chkItmDtlKey(itmDtlL, true));
			
			// 依頼先ＷＧを補完する
			setRqstWgCd(itmDtlL);
			
			msgL.addAll(chkDecPlace());
			
			for(Chk01_RsltR r : notErrL) {
				msgL.addAll(check(r, Chk01_RsltR.$rqst_to_wg_cd, new FXUCL_RequiredValidater()));
			}
			
			notErrL = getChkList(up0());
			chkLot(notErrL);
			
			return msgL;
		}
		
		/**
		 * Ｉ／Ｖ表記品名を設定
		 * @return
		 */
		protected void setIvItmNm() {
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if(isNull(notErrL)) {
				return;
			}
			
			MCList<MAM_ITM_LCL_R> bindL = MCList.create(MAM_ITM_LCL_R.class);
			for (Chk01_RsltR r : notErrL
					.subList(Chk01_RsltR.$wg_rqst_typ, MSC_WG_RQST_TYP.PURC.value())
					.groupBy(Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1,
							Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3,
							Chk01_RsltR.$prnt_lcl_cd)) {
				
				MAM_ITM_LCL_R itmLclR = MAM_ITM_LCL_R.create();
				itmLclR.itm_cd(r.itm_cd());
				itmLclR.itm_sub1(r.itm_sub1());
				itmLclR.itm_sub2(r.itm_sub2());
				itmLclR.itm_sub3(r.itm_sub3());
				itmLclR.lcl_cd(r.prnt_lcl_cd());
				bindL.add(itmLclR);
			}
			MCList<MAM_ITM_LCL_R> itmLclL = MCList.create(MAM_ITM_LCL_R.class);
			if(!isNull(bindL)) {
				MAM_ITM_LCL_R t = MAM_ITM_LCL_R.create("T");
				MCQueryApiBuilder itmLclL_bldr = MCQueryApiBuilder.create(t);
				itmLclL_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.lcl_cd, t.itm_nm);
				dbSelectKey("MSBAL0100_MAM_ITM_LCL_S01", itmLclL, itmLclL_bldr, bindL);
			}
			MCIndexKey itmLclKey = itmLclL.createIndex(MAM_ITM_LCL_R.$itm_cd,
					MAM_ITM_LCL_R.$itm_sub1, MAM_ITM_LCL_R.$itm_sub2,
					MAM_ITM_LCL_R.$itm_sub3, MAM_ITM_LCL_R.$lcl_cd);

			for(Chk01_RsltR r : notErrL) {
				if (!r.sppl_iv_flg()) {
					r.iv_itm_nm(null);
				}
				else {
					if(r.sundry_itm_flg()) {
						if(isNull(r.iv_itm_nm())) {
							MAM_ITM_LCL_R itmLclR = itmLclL.getFirst(itmLclKey, r.itm_cd(),
									r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
									r.prnt_lcl_cd());
							if(!isNull(itmLclR)) {
								r.iv_itm_nm(itmLclR.itm_nm());
							}							
						}
					}
					else {
						MAM_ITM_LCL_R itmLclR = itmLclL.getFirst(itmLclKey, r.itm_cd(),
								r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
								r.prnt_lcl_cd());
						if(!isNull(itmLclR)) {
							r.iv_itm_nm(itmLclR.itm_nm());
						}
					}
				}
			}
		}
		
		/**
		 * 品目詳細マスタチェックで補完した依頼先ＷＧを設定する
		 * @param itmDtlL
		 */
		protected void setRqstWgCd(MCList<MAM_ITM_DTL_R> itmDtlL) {
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if(isNull(notErrL)) {
				return;
			}
			
			MCIndexKey itmDtlKey = itmDtlL.createIndex(MAM_ITM_DTL_R.$itm_cd,
					MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$mfg_loc_cd,
					MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd,
					MAM_ITM_DTL_R.$rqst_loc_cd, MAM_ITM_DTL_R.$wg_cd,
					MAM_ITM_DTL_R.$bom_ptn, MAM_ITM_DTL_R.$st_dt);
			
			for (Chk01_RsltR r : notErrL.subList(Chk01_RsltR.$wg_rqst_typ, MSC_WG_RQST_TYP.PURC.value())) {
				// 資産管理しない品目は指定通りにするため、補完しない
				if(!MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ())) {
					MAM_ITM_DTL_R chkItmDtlR = itmDtlL.getFirst(itmDtlKey,
							r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
							r.mfg_loc_cd(),
							isNullOrNullVal(r.mfg_loc_cd()) ? r.sppl_cd() : MAC_STR.NULL_VAL.value(),
							isNullOrNullVal(r.mfg_loc_cd()) ? r.maker_cd() : MAC_STR.NULL_VAL.value(),
							r.rqst_to_loc_cd(),
							r.gr_loc_wg_cd(),
							r.bom_ptn(),
							isSame(_sysParm, "1") ? r.gr_rqst_tm() : r.po_schd_dt());
					if(!isNull(chkItmDtlR)) {
						r.rqst_to_wg_cd(chkItmDtlR.rqst_wg_cd());
						r.rqst_to_wg_nm(chkItmDtlR.getStringNE("RQST_WG_NM"));
					}
				}
			}
		}
		
		/**
		 * 数量の小数有効桁数チェック
		 */
		protected MCMessageList chkDecPlace() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			
			// 小数有効桁数チェック
			for (Chk01_RsltR upR : notErrL){
				if (!isNull(upR.trd_unit_qty())) {
					msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$trd_unit_dec_place, Chk01_RsltR.$trd_unit_qty));
				}
				if (!isNull(upR.base_unit_qty())) {
					msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$base_unit_dec_place, Chk01_RsltR.$base_unit_qty));
				}
			}
			return msgL;
		}
		
		/**
		 * ロット情報サービスのロット存在チェックを行う
		 * @param notErrL
		 */
		protected void chkLot(MCList<Chk01_RsltR> notErrL) {
			MSBFL_LotService.Lot_Chk03 lotChk03 = MSBFL_LotService.crtLot_Chk03();
			
			for(Chk01_RsltR r : notErrL) {
				if(MSC_WG_RQST_TYP.isXFR(r.wg_rqst_typ())) {
					if(!isNullOrNullVal(r.lot_no())) {
						Lot_Chk03_CndR lotChk03CndR = Lot_Chk03_CndR.create();
						copy(lotChk03CndR, r, createMap_Lot_Chk03_CndR_Chk01_RsltR());
						lotChk03.up0().add(lotChk03CndR);
					}
				}
				else if(MSC_WG_RQST_TYP.isPURC(r.wg_rqst_typ())) {
					if(!isNullOrNullVal(r.bd_lot_no()) && !isNullOrNullVal(r.bd_itm_cd())) {
						Lot_Chk03_CndR lotChk03CndR = Lot_Chk03_CndR.create();
						copy(lotChk03CndR, r, createMap_Lot_Chk03_CndR_Chk01_RsltR_For_BdLot());
						lotChk03.up0().add(lotChk03CndR);						
					}
				}
			}
			
			if(!lotChk03.up0().isEmpty()) {
				lotChk03.exec();
				
				copyErrFlg(notErrL, lotChk03.down0());
			}
		}

		/**
		 * ＷＧ間依頼サービスのチェック処理を実行する
		 */
		protected void callWgRqstSrvChk01() {
			MSBAL_WgRqstService.WgRqst_Chk01 ope = MSBAL_WgRqstService.crtWgRqst_Chk01();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			for(Chk01_RsltR r : notErrL) {
				WgRqst_Chk01_DtlR wgRqstChk01DtlR = WgRqst_Chk01_DtlR.create();
				copy(wgRqstChk01DtlR, r, createMap_WgRqst_Chk01_DtlR_Chk01_RsltR());
				ope.up0().add(wgRqstChk01DtlR);
			}
			
			if(!ope.up0().isEmpty()) {
				ope.exec();
			}
			copyErrFlg(up0(), ope.down0());
		}
		
		/**
		 * 基準単位数量を設定する
		 * @param rsltR
		 */
		protected void setBaseUnitQty(Chk01_RsltR rsltR) {
			if (isSame(rsltR.trd_unit_cd(), rsltR.base_unit_cd())) {
				rsltR.base_unit_qty(rsltR.trd_unit_qty());
			}
			else {
				rsltR.base_unit_qty(convToBaseUnit(rsltR.trd_unit_qty(),
						rsltR.trd_unit_conv_base_qty(), rsltR.trd_unit_conv_qty(),
						rsltR.base_unit_dec_place(), rsltR.base_unit_rnd_typ()));
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			// 基準単位数量を補完
			for(Chk01_RsltR r : up0()) {
				if(isNull(r.base_unit_qty())) {
					r.base_unit_qty(convToBaseUnit(r.trd_unit_qty(), r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ()));
				}
			}
			
			down0().setAll(up0());
		}
		
		protected Map_WgRqst_Chk01_DtlR_Chk01_RsltR<WgRqst_Chk01_DtlR,Chk01_RsltR> createMap_WgRqst_Chk01_DtlR_Chk01_RsltR() {
			return new Map_WgRqst_Chk01_DtlR_Chk01_RsltR<WgRqst_Chk01_DtlR, Chk01_RsltR>();
		}

		public class Map_WgRqst_Chk01_DtlR_Chk01_RsltR<D extends WgRqst_Chk01_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Chk01_DtlR.$data_crud_typ, Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(WgRqst_Chk01_DtlR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$wg_rqst_no, Chk01_RsltR.$wg_rqst_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$wg_rqst_typ, Chk01_RsltR.$wg_rqst_typ);
				addColumnPathMap(WgRqst_Chk01_DtlR.$wg_rqst_src_typ, Chk01_RsltR.$wg_rqst_src_typ);
				addColumnPathMap(WgRqst_Chk01_DtlR.$wg_rqst_src_no, Chk01_RsltR.$wg_rqst_src_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$rqst_dt, Chk01_RsltR.$rqst_dt);
				addColumnPathMap(WgRqst_Chk01_DtlR.$rqst_fr_wg_cd, Chk01_RsltR.$rqst_fr_wg_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$rqst_fr_dpt_cd, Chk01_RsltR.$rqst_fr_dpt_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$gr_loc_cd, Chk01_RsltR.$gr_loc_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$gr_str_ln_cd, Chk01_RsltR.$gr_str_ln_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$gr_rqst_tm, Chk01_RsltR.$gr_rqst_tm);
				addColumnPathMap(WgRqst_Chk01_DtlR.$rqst_to_wg_cd, Chk01_RsltR.$rqst_to_wg_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$gi_loc_cd, Chk01_RsltR.$rqst_to_loc_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$gi_str_ln_cd, Chk01_RsltR.$rqst_to_str_ln_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$gi_rqst_tm, Chk01_RsltR.$gi_rqst_tm);
				addColumnPathMap(WgRqst_Chk01_DtlR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(WgRqst_Chk01_DtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(WgRqst_Chk01_DtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(WgRqst_Chk01_DtlR.$itm_nm, Chk01_RsltR.$itm_nm);
				addColumnPathMap(WgRqst_Chk01_DtlR.$iv_itm_nm, Chk01_RsltR.$iv_itm_nm);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno1, Chk01_RsltR.$sno1);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno1_null_flg, Chk01_RsltR.$sno1_null_flg);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno2, Chk01_RsltR.$sno2);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno2_null_flg, Chk01_RsltR.$sno2_null_flg);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno3, Chk01_RsltR.$sno3);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno3_null_flg, Chk01_RsltR.$sno3_null_flg);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno4, Chk01_RsltR.$sno4);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sno4_null_flg, Chk01_RsltR.$sno4_null_flg);
				addColumnPathMap(WgRqst_Chk01_DtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
				addColumnPathMap(WgRqst_Chk01_DtlR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$maker_cd, Chk01_RsltR.$maker_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$itm_ord_no, Chk01_RsltR.$itm_ord_no);
				addColumnPathMap(WgRqst_Chk01_DtlR.$mfg_loc_cd, Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(WgRqst_Chk01_DtlR.$bom_ptn, Chk01_RsltR.$bom_ptn);
				addColumnPathMap(WgRqst_Upd01_DtlR.$trd_cd, Chk01_RsltR.$trd_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.screen_crct_flg(true);
			}
		}
		
		protected Map_Lot_Chk03_CndR_Chk01_RsltR<Lot_Chk03_CndR,Chk01_RsltR> createMap_Lot_Chk03_CndR_Chk01_RsltR() {
			return new Map_Lot_Chk03_CndR_Chk01_RsltR<Lot_Chk03_CndR, Chk01_RsltR>();
		}

		public class Map_Lot_Chk03_CndR_Chk01_RsltR<D extends Lot_Chk03_CndR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_RsltR.$lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_RsltR.$sublot_no);
				addColumnPathMap(Lot_Chk03_CndR.$ver_no, Chk01_RsltR.$ver_no);
			}
		}
		
		protected Map_Lot_Chk03_CndR_Chk01_RsltR_For_BdLot<Lot_Chk03_CndR,Chk01_RsltR> createMap_Lot_Chk03_CndR_Chk01_RsltR_For_BdLot() {
			return new Map_Lot_Chk03_CndR_Chk01_RsltR_For_BdLot<Lot_Chk03_CndR, Chk01_RsltR>();
		}

		public class Map_Lot_Chk03_CndR_Chk01_RsltR_For_BdLot<D extends Lot_Chk03_CndR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_RsltR.$bd_itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_RsltR.$bd_itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_RsltR.$bd_itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_RsltR.$bd_itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_RsltR.$bd_lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_RsltR.$bd_sublot_no);
				addColumnPathMap(Lot_Chk03_CndR.$ver_no, Chk01_RsltR.$ver_no);
			}
		}

		protected void callPurcUtilSrch01() {
			// 購買依頼に対してのみ発注予定日を設定
			MCList<Chk01_RsltR> purcL = up0().subList(r->MAC_WG_RQST_TYP.isPURC(r.wg_rqst_typ()));
			if (purcL.isEmpty()) {
				return ;
			}
			cmplPoSchdDtByOrd(purcL);
			purcL = purcL.subList(r->isNull(r.po_schd_dt()));
			
			MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
			addAll(purcUtilSrch01.up0(), purcL, createMap_PurcUtil_Srch01_DtlR_Chk01_RsltR());
			purcUtilSrch01.exec();

			MCIndexKey idx = purcUtilSrch01.down0().createIndex("peg_no");
			for (Chk01_RsltR r : purcL) {
				PurcUtil_Srch01_DtlR rsltR = purcUtilSrch01.down0().getFirst(idx,
						r.peg_no());
				if (rsltR.err_flg()) {
					MCMessagePool.add(new MCMessage(r, null, MSBAL0101,
							toDispItm(r.itm_cd(),r.itm_sub1(),r.itm_sub2(),r.itm_sub3()),
							r.gr_loc_wg_cd(),
							r.sppl_cd(),
							r.maker_cd(),
							r.mfg_loc_cd(),
							r.bom_ptn(),
							toYMDHMSString(r.gr_rqst_tm()),
							toDispGUIIndex(r)));
					r.err_flg(true);
				}
				else {
					r.po_schd_dt(rsltR.po_schd_dt());
					r.setDateNE("avl_schd_dt", rsltR.rqst_dlv_rqst_dt());
				}
			}
		}
		protected void cmplPoSchdDtByOrd(MCList<Chk01_RsltR> purcL) {
			MCList<MST_ITM_ORDER_R> itmOrdL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(t);
			dbSelectKey("MSBAL0100_MST_ITM_ORDER_S01", itmOrdL, itmOrdL_bldr, purcL.groupBy(Chk01_RsltR.$itm_ord_no));
			
			MCIndexKey itmOrdKey = itmOrdL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (Chk01_RsltR purcR : purcL) {
				if (isNull(purcR.itm_ord_no())) {
					continue;
				}
				MST_ITM_ORDER_R itmOrdR = itmOrdL.getFirst(itmOrdKey, purcR.itm_ord_no());
				if(isCmplPoSchdDtByOrd(purcR, itmOrdR)) {
					purcR.po_schd_dt(itmOrdR.po_schd_dt());
					purcR.setDateNE("avl_schd_dt", itmOrdR.avl_schd_dt());
				}
			}
		}
		protected boolean isCmplPoSchdDtByOrd(Chk01_RsltR purcR, MST_ITM_ORDER_R itmOrdR) {
			if(!isNull(itmOrdR)
					&& isSame(itmOrdR.strg_schd_dt(), purcR.gr_rqst_tm())) {
				if(!isNullOrNullVal(purcR.mfg_loc_cd()) //外注
						&& isSame(itmOrdR.mfg_loc_cd(), nvl(purcR.mfg_loc_cd(), MAC_STR.NULL_VAL.value()))
						&& isSame(itmOrdR.bom_ptn(), nvl(purcR.bom_ptn(), MAC_STR.NULL_VAL.value()))) {
					return true;
				}
				else if(isNullOrNullVal(purcR.mfg_loc_cd()) // 購買
						&& isSame(itmOrdR.sppl_cd(), nvl(purcR.sppl_cd(), MAC_STR.NULL_VAL.value()))
						&& isSame(itmOrdR.maker_cd(), nvl(purcR.maker_cd(), MAC_STR.NULL_VAL.value()))) {
					return true;
				}
			}
			return false;
		}
		protected Map_PurcUtil_Srch01_DtlR_Chk01_RsltR<PurcUtil_Srch01_DtlR,Chk01_RsltR> createMap_PurcUtil_Srch01_DtlR_Chk01_RsltR() {
			return new Map_PurcUtil_Srch01_DtlR_Chk01_RsltR<PurcUtil_Srch01_DtlR, Chk01_RsltR>();
		}
		public class Map_PurcUtil_Srch01_DtlR_Chk01_RsltR<D extends PurcUtil_Srch01_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch01_DtlR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$dlv_rqst_dt, Chk01_RsltR.$gr_rqst_tm);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$mfg_loc_cd, Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$maker_cd, Chk01_RsltR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$bom_ptn, Chk01_RsltR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cd, Chk01_RsltR.$gr_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$site_cd, Chk01_RsltR.$gr_site_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cal_cd, Chk01_RsltR.$sppl_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cal_cd, Chk01_RsltR.$gr_loc_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$wg_cd, Chk01_RsltR.$gr_loc_wg_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.prov_ddlv_flg(!isNull(src.gr_loc_sppl_cd()));
				dest.lg_grp_cd(src.gr_lg_grp_cd());
			}
		}
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ＷＧ間依頼をファイル入力する<br>
	 */
	public class Imp01 extends MSBAL_WgRqstReg_MC_A.Imp01 {
		/** 担当者権限マスタのキャッシュ */
		protected FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R> _cacheUsrAcl = null;
		/** 部門マスタのキャッシュ */
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt = null;
		/** 場所マスタキャッシュ */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc = null;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			setDown();
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
			setDefDpt();

			for (Chk01_RsltR r : up0()) {
				if(r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					r.prms_uncn_flg(false);
					r.re_rqst_flg(false);
					r.re_rqst_dt(null);
					r.wg_re_rqst_cnt_rmrks(null);
				}
				else if(r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					if(r.re_rqst_flg()) {
						r.prms_uncn_flg(false);
						r.re_rqst_dt((MCDate)complInputFileValue(Chk01_RsltR.$re_rqst_dt, r.re_rqst_dt(), getToday()));
					}
					else {
						r.re_rqst_dt(null);
					}
				}
			}
			createCache();
			complLoc();
			setDefStrLnCd();
		}

		/**
		 * キャッシュ作成
		 */
		protected void createCache() {
			createLocCache();
		}

		protected void complLoc() {
			for (Chk01_RsltR r : up0()) {
				MAM_LOC_R locR = getCacheLoc(r.gr_loc_cd());
				if (!isNull(locR)) {
					r.gr_str_ln_tgt_flg(locR.str_ln_tgt_flg());
				}
			}
		}

		/**
		 * 依頼元部門ＣＤの補完を行う。
		 */
		protected void setDefDpt() {
			
			MCList<Chk01_RsltR> tgtL = up0().subList(r -> !isNull(r.rqst_fr_usr_cd()) && isNull(r.rqst_fr_dpt_cd()));
			
			tgtL.addStringColumn("def_dpt_cd");
			crtUsrAclCache(tgtL);
			
			for (Chk01_RsltR r : tgtL) {
				MAM_USR_ACL_R usrAclR = _cacheUsrAcl.get(r.rqst_dt(), r.rqst_fr_usr_cd());
				if (!isNull(usrAclR)) {
					r.setValueNE("def_dpt_cd", usrAclR.dpt_cd());
				}
			}
			
			crtDptCache(tgtL);
			
			for (Chk01_RsltR r : tgtL) {
				MAM_DPT_R dptR = _cacheDpt.get(r.rqst_dt(), r.getStringNE("def_dpt_cd"));
				if (!isNull(dptR) && isSCEDpt(dptR)) {
					r.rqst_fr_dpt_cd((String)complInputFileValue(Chk01_RsltR.$rqst_fr_dpt_cd, r.rqst_fr_dpt_cd(), dptR.dpt_cd()));
				}
			}
		}

		/**
		 * 標準の棚・ラインCDを設定します。
		 */
		protected void setDefStrLnCd() {
			MSUCL_StrLnUtil.StrLnUtil_Srch01 ope = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
			for (Chk01_RsltR r : up0()) {
				if (!r.gr_str_ln_tgt_flg() || isNull(r.itm_cd()) || isNull(r.gr_loc_cd())) {
					continue;
				}
				StrLnUtil_Srch01_CndR cndR = StrLnUtil_Srch01_CndR.create();
				cndR.peg_no(r.peg_no());
				cndR.itm_cd(r.itm_cd());
				cndR.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
				cndR.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
				cndR.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
				cndR.loc_cd(r.gr_loc_cd());
				ope.up0().add(cndR);
			}
			ope.exec();
			MCIndexKey idxkey = ope.down0().createIndex(StrLnUtil_Srch01_CndR.$peg_no);
			for (Chk01_RsltR r : up0()) {
				StrLnUtil_Srch01_CndR downR = ope.down0().getFirst(idxkey, r.peg_no());
				if (!r.gr_str_ln_tgt_flg()) {
					r.gr_str_ln_cd_none_flg(false);
				}
				else if (!isNull(r.gr_str_ln_cd())) {
					r.gr_str_ln_cd_none_flg(false);
				}
				else if (!isNull(downR) && !isNullOrNullVal(downR.str_ln_cd())) {
					if (!r.gr_str_ln_cd_none_flg()) {
						r.gr_str_ln_cd(downR.str_ln_cd());
					}
				}
				else {
					r.gr_str_ln_cd_none_flg(false);
				}
			}
		}

		/**
		 * 指定された部門が実行部門かどうか。
		 * @param dptR 部門マスタ
		 * @return 実行部門の場合はtrue
		 */
		protected boolean isSCEDpt(MAM_DPT_R dptR) {
			
			return dptR.sls_dpt_flg() 
					|| dptR.purc_dpt_flg() 
					|| dptR.ship_dpt_flg() 
					|| dptR.arr_dpt_flg() 
					|| dptR.mfg_dpt_flg() 
					|| dptR.sd_dpt_flg() 
					|| dptR.insp_dpt_flg();
		}
		
		/**
		 * 担当者権限マスタのキャッシュを作成する。
		 * @param rsltL ＷＧ間依頼リスト
		 */
		protected void crtUsrAclCache(MCList<Chk01_RsltR> rsltL) {
			_cacheUsrAcl = new FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R>(MCQueryApiBuilder.create(MAM_USR_ACL_R.create("T")),
					rsltL, Chk01_RsltR.$rqst_fr_usr_cd);
		}
		
		/**
		 * 部門マスタのキャッシュを作成する。
		 * @param rsltL ＷＧ間依頼リスト
		 */
		protected void crtDptCache(MCList<Chk01_RsltR> rsltL) {
			_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(MCQueryApiBuilder.create(MAM_DPT_R.create("T")),
					rsltL, "def_dpt_cd");
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBAL_WgRqstReg.Chk01 ope = MSBAL_WgRqstReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		protected void createLocCache() {
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")),
					up0(), Chk01_RsltR.$gr_loc_cd);
		}

		protected MAM_LOC_R getCacheLoc(String locCd) {
			return _cacheLoc.get(locCd);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＷＧ間依頼を登録・訂正する<br>
	 */
	public class Upd01 extends MSBAL_WgRqstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callWgRqstSrvUpd01(notErrL);
			}
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());

			for (Chk01_RsltR r : up0()) {
				if(r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if(r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());					
				}
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBAL_WgRqstReg.Chk01 ope = MSBAL_WgRqstReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * ＷＧ間依頼サービスの更新処理を実行する
		 * @param notErrL エラーのない上り電文
		 */
		protected void callWgRqstSrvUpd01(MCList<Chk01_RsltR> notErrL) {
			MSBAL_WgRqstService.WgRqst_Upd01 ope = MSBAL_WgRqstService.crtWgRqst_Upd01();
			for(Chk01_RsltR r : notErrL) {
				WgRqst_Upd01_DtlR wgRqstUpd01DtlR = WgRqst_Upd01_DtlR.create();
				copy(wgRqstUpd01DtlR, r, createMap_WgRqst_Upd01_DtlR_Chk01_RsltR());
				ope.up0().add(wgRqstUpd01DtlR);
			}
			
			if(!ope.up0().isEmpty()) {
				ope.exec();
				
				String[] destCols = new String[] {Chk01_RsltR.$wg_rqst_no};
				String[] srcCols = new String[] {WgRqst_Upd01_DtlR.$wg_rqst_no};
				copyByPegNo(notErrL, destCols, ope.down0(), srcCols);
			}
		}

		protected void handleSuccess(MCList<Chk01_RsltR> l) {
			dbTran().commit();

			for (Chk01_RsltR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e,
				MCList<Chk01_RsltR> l) {
			dbTran().rollback();
			
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk01_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		protected Map_WgRqst_Upd01_DtlR_Chk01_RsltR<WgRqst_Upd01_DtlR,Chk01_RsltR> createMap_WgRqst_Upd01_DtlR_Chk01_RsltR() {
			return new Map_WgRqst_Upd01_DtlR_Chk01_RsltR<WgRqst_Upd01_DtlR, Chk01_RsltR>();
		}

		public class Map_WgRqst_Upd01_DtlR_Chk01_RsltR<D extends WgRqst_Upd01_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Upd01_DtlR.$data_crud_typ, Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(WgRqst_Upd01_DtlR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_no, Chk01_RsltR.$wg_rqst_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$last_wg_rqst_no, Chk01_RsltR.$last_wg_rqst_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_typ, Chk01_RsltR.$wg_rqst_typ);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_src_typ, Chk01_RsltR.$wg_rqst_src_typ);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_src_no, Chk01_RsltR.$wg_rqst_src_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_sts_typ, Chk01_RsltR.$wg_rqst_sts_typ);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_dt, Chk01_RsltR.$rqst_dt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$prms_uncn_flg, Chk01_RsltR.$prms_uncn_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$re_rqst_flg, Chk01_RsltR.$re_rqst_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$re_rqst_dt, Chk01_RsltR.$re_rqst_dt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_fr_wg_cd, Chk01_RsltR.$rqst_fr_wg_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_fr_dpt_cd, Chk01_RsltR.$rqst_fr_dpt_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_fr_usr_cd, Chk01_RsltR.$rqst_fr_usr_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gr_loc_cd, Chk01_RsltR.$gr_loc_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gr_str_ln_cd, Chk01_RsltR.$gr_str_ln_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gr_rqst_tm, Chk01_RsltR.$gr_rqst_tm);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_to_wg_cd, Chk01_RsltR.$rqst_to_wg_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gi_loc_cd, Chk01_RsltR.$rqst_to_loc_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gi_str_ln_cd, Chk01_RsltR.$rqst_to_str_ln_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gi_rqst_tm, Chk01_RsltR.$gi_rqst_tm);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_nm, Chk01_RsltR.$itm_nm);
				addColumnPathMap(WgRqst_Upd01_DtlR.$iv_itm_nm, Chk01_RsltR.$iv_itm_nm);
				addColumnPathMap(WgRqst_Upd01_DtlR.$lot_no, Chk01_RsltR.$lot_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sublot_no, Chk01_RsltR.$sublot_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno1, Chk01_RsltR.$sno1);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno1_null_flg, Chk01_RsltR.$sno1_null_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno2, Chk01_RsltR.$sno2);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno2_null_flg, Chk01_RsltR.$sno2_null_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno3, Chk01_RsltR.$sno3);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno3_null_flg, Chk01_RsltR.$sno3_null_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno4, Chk01_RsltR.$sno4);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sno4_null_flg, Chk01_RsltR.$sno4_null_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$ver_no, Chk01_RsltR.$ver_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gd_cd, Chk01_RsltR.$gd_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
				addColumnPathMap(WgRqst_Upd01_DtlR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
				addColumnPathMap(WgRqst_Upd01_DtlR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$not_cmpl_qty, Chk01_RsltR.$not_cmpl_qty);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$maker_cd, Chk01_RsltR.$maker_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$io_schd_pr_no, Chk01_RsltR.$io_schd_pr_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_ord_no, Chk01_RsltR.$itm_ord_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$mfg_loc_cd, Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bom_ptn, Chk01_RsltR.$bom_ptn);
				addColumnPathMap(WgRqst_Upd01_DtlR.$purc_rsn_cd, Chk01_RsltR.$purc_rsn_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$xpns_po_flg, Chk01_RsltR.$xpns_purc_flg);
				addColumnPathMap(WgRqst_Upd01_DtlR.$trd_cd, Chk01_RsltR.$trd_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_itm_cd, Chk01_RsltR.$bd_itm_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_itm_sub1, Chk01_RsltR.$bd_itm_sub1);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_itm_sub2, Chk01_RsltR.$bd_itm_sub2);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_itm_sub3, Chk01_RsltR.$bd_itm_sub3);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_sno1, Chk01_RsltR.$bd_sno1);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_sno2, Chk01_RsltR.$bd_sno2);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_sno3, Chk01_RsltR.$bd_sno3);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_sno4, Chk01_RsltR.$bd_sno4);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_lot_no, Chk01_RsltR.$bd_lot_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_sublot_no, Chk01_RsltR.$bd_sublot_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_loc_cd, Chk01_RsltR.$bd_loc_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_dpt_cd, Chk01_RsltR.$bd_dpt_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_ctg_cd, Chk01_RsltR.$bd_ctg_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_oper_cd, Chk01_RsltR.$bd_oper_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_slo_no, Chk01_RsltR.$bd_slo_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_iv_no, Chk01_RsltR.$bd_iv_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$bd_po_no, Chk01_RsltR.$bd_po_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_cnt_rmrks, Chk01_RsltR.$wg_rqst_cnt_rmrks);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_re_rqst_cnt_rmrks, Chk01_RsltR.$wg_re_rqst_cnt_rmrks);
				addColumnPathMap(WgRqst_Upd01_DtlR.$intr_rmrks, Chk01_RsltR.$wg_rqst_intr_rmrks);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sub_char1, Chk01_RsltR.$sub_char1);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sub_char2, Chk01_RsltR.$sub_char2);
				addColumnPathMap(WgRqst_Upd01_DtlR.$sub_char3, Chk01_RsltR.$sub_char3);
				addColumnPathMap(WgRqst_Upd01_DtlR.$gi_schd_dt, Chk01_RsltR.$gi_rqst_tm);
				addColumnPathMap(WgRqst_Upd01_DtlR.$strg_schd_dt, Chk01_RsltR.$gr_rqst_tm);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.screen_crct_flg(true);
				if (MSC_WG_RQST_TYP.isPURC(src.wg_rqst_typ())) {
					dest.avl_schd_dt(src.getDate("avl_schd_dt"));
				}
				else {
					dest.avl_schd_dt(src.gr_rqst_tm());
				}
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * ＷＧ間依頼を取り消す<br>
	 */
	public class Del01 extends MSBAL_WgRqstReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e){
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callWgRqstSrvUpd01(notErrL);
			}
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(Chk02_RsltR.$peg_no, up0());

			for (Chk02_RsltR r : up0()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBAL_WgRqstReg.Chk02 ope = MSBAL_WgRqstReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * ＷＧ間依頼サービスの更新処理を実行する
		 * @param notErrL　チェックでエラーのなかった上り電文
		 */
		protected void callWgRqstSrvUpd01(MCList<Chk02_RsltR> notErrL) {
			MSBAL_WgRqstService.WgRqst_Upd01 ope = MSBAL_WgRqstService.crtWgRqst_Upd01();
			for(Chk02_RsltR r : notErrL) {
				WgRqst_Upd01_DtlR wgRqstUpd01DtlR = WgRqst_Upd01_DtlR.create();
				copy(wgRqstUpd01DtlR, r, createMap_WgRqst_Upd01_DtlR_Chk02_RsltR());
				ope.up0().add(wgRqstUpd01DtlR);
			}
			
			if(!ope.up0().isEmpty()) {
				ope.exec();
			}
		}

		protected void handleSuccess(MCList<Chk02_RsltR> l) {
			dbTran().commit();

			for (Chk02_RsltR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e,
				MCList<Chk02_RsltR> l) {
			dbTran().rollback();
			
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk02_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}	

				
		protected Map_WgRqst_Upd01_DtlR_Chk02_RsltR<WgRqst_Upd01_DtlR,Chk02_RsltR> createMap_WgRqst_Upd01_DtlR_Chk02_RsltR() {
			return new Map_WgRqst_Upd01_DtlR_Chk02_RsltR<WgRqst_Upd01_DtlR, Chk02_RsltR>();
		}

		public class Map_WgRqst_Upd01_DtlR_Chk02_RsltR<D extends WgRqst_Upd01_DtlR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Upd01_DtlR.$data_crud_typ, Chk02_RsltR.$data_crud_typ);
				addColumnPathMap(WgRqst_Upd01_DtlR.$peg_no, Chk02_RsltR.$peg_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_no, Chk02_RsltR.$wg_rqst_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_typ, Chk02_RsltR.$wg_rqst_typ);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_src_typ, Chk02_RsltR.$wg_rqst_src_typ);
				addColumnPathMap(WgRqst_Upd01_DtlR.$wg_rqst_src_no, Chk02_RsltR.$wg_rqst_src_no);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_fr_wg_cd, Chk02_RsltR.$rqst_fr_wg_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_dt, Chk02_RsltR.$rqst_dt);
				addColumnPathMap(WgRqst_Upd01_DtlR.$rqst_to_wg_cd, Chk02_RsltR.$rqst_to_wg_cd);
				addColumnPathMap(WgRqst_Upd01_DtlR.$itm_ord_no, Chk02_RsltR.$itm_ord_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.screen_crct_flg(true);
			}
		}
	}

	//FMCB CUSTOM END
}