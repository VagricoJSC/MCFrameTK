package mcframe.serverMSBB.MSBBL6090;

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
import mcframe.serverMSBB.MSBBL6090.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import static mcframe.commonCore.container.MCRow.*;
import mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R;
import mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R;
import mcframe.serverMBBA.MBBAL5010.MBBAL_AprvService;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import static mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil.*;
import mcframe.serverMABC.MABCL5010.MABCL_SundryItmRegService;
import mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR;
import mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.CstSloStkGdCols;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.BpCols;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_QtnRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_QtnRegService_MC extends MSBBL_QtnRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * QtnReg_Chk01オペレーション.<p>
	 *
	 * 見積登録前チェック及び項目補完処理を行う。<br>
	 */
	public class QtnReg_Chk01 extends MSBBL_QtnRegService_MC_A.QtnReg_Chk01 {
		
		/**
		 * 更新カウンタチェックエラー
		 */
		protected boolean _updCntrErr = false;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			ListLogicBind cstBind = getListLogicBind(up0(), HdrR.$cst_cd);
			cstBind.putBind(BpCols.$i_bp_is_srch_typ, 
					(Comparable<?>)(MSC_QTN_TYP.isQTN(up0().qtn_typ()) ? MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY.value() : MAC_BP_IS_SRCH_TYP.CST.value()));
			
			ListLogicBind gdBind = getListLogicBind(up1(), DtlR.$gd_cd);
			gdBind.putBind(CstSloStkGdCols.$i_cst_cd, up0(), HdrR.$cst_cd);
			
			ListLogicBind dlvBind = getListLogicBind(up1(), DtlR.$dlv_cd);
			dlvBind.putBind(BpCols.$i_dt, up0(), HdrR.$qtn_dt);
		}
		
		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (isSame(paramIndex, 0)) {
				if (isCstCols(column)) {
					if (row.getBoolean(HdrR.$cst_sundry_flg)) {
						return false;
					}
				}
			}
			if (isSame(paramIndex, 1)) {
				if (isDlvCols(column)) {
					if (row.getBoolean(DtlR.$dlv_sundry_flg)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}
		
		protected boolean isCstCols(String column) {
			return isSame(column, HdrR.$cst_zip_cd)
				|| isSame(column, HdrR.$cst_addr1)
				|| isSame(column, HdrR.$cst_addr2)
				|| isSame(column, HdrR.$cst_addr3)
				|| isSame(column, HdrR.$cst_addr4)
				|| isSame(column, HdrR.$cst_tel)
				|| isSame(column, HdrR.$cst_fax)
				|| isSame(column, HdrR.$cst_cntct_dpt)
				|| isSame(column, HdrR.$cst_cntct_psn);
		}
		
		protected boolean isDlvCols(String column) {
			return isSame(column, DtlR.$dlv_zip_cd)
				|| isSame(column, DtlR.$dlv_addr1)
				|| isSame(column, DtlR.$dlv_addr2)
				|| isSame(column, DtlR.$dlv_addr3)
				|| isSame(column, DtlR.$dlv_addr4)
				|| isSame(column, DtlR.$dlv_tel)
				|| isSame(column, DtlR.$dlv_fax)
				|| isSame(column, DtlR.$dlv_cntct_dpt)
				|| isSame(column, DtlR.$dlv_cntct_psn);
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			setDown();
		}
		
		@Override
		protected MCMessageList updCntChkReq() {
			
			MCMessageList msgL = super.updCntChkReq();
			
			if (MAC_DATA_CRUD_TYP.isUPD(up0().data_crud_typ())) {
				msgL.addAll(check(up0(), HdrR.$qtn_no, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), HdrR.$qtn_rev, new FXUCL_RequiredValidater()));
			}
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkQtn());
			
			if (!_updCntrErr) {
				
				complQtn();
			}
			
			return msgL;
		}
		
		/**
		 * 補完処理を行う。
		 */
		protected void complQtn() {
			
			MCList<MST_QTN_D_R> qtnDL = getQtnD(up0().qtn_no(), up0().qtn_rev());
			
			MST_QTN_D_R qtnD = null;
			
			for (DtlR dtlR : up1()) {
				
				if (!isNull(dtlR.qtn_d_no())) {
					qtnD = qtnDL.getFirst(MST_QTN_D_R.$qtn_d_no, dtlR.qtn_d_no());
					
					if (!isNull(qtnD) && !qtnD.isEmpty()) {
						dtlR.slo_trnst_qty(qtnD.slo_trnst_qty());
						dtlR.sls_trnst_qty(qtnD.sls_trnst_qty());
					}
				}
			}
		}
		

		/**
		 * 見積のロック、更新カウンタチェック、売上部門のＤＡＣチェックを行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkQtn() {
			
			MCMessageList msgL = new MCMessageList();
			
			if (MAC_DATA_CRUD_TYP.isUPD(up0().data_crud_typ())) {
				MST_QTN_R qtnR = MST_QTN_R.create();
				MST_QTN_R t = MST_QTN_R.create("T");
				MCQueryApiBuilder qtnR_bldr = MCQueryApiBuilder.create(t);
					qtnR_bldr.setSelect(
							t.qtn_no, 
							t.qtn_rev, 
							t.qtn_typ, 
							t.sls_dpt_cd, 
							t.aprv_flg, 
							t.aprv_no, 
							t.aprv_sts_typ, 
							t.sls_dpt_cd, 
							t.qtn_prnt_flg, 
							t.qtn_prnt_seq, 
							t.failure_flg, 
							t.upd_cntr);
				
				dbSelectKeyForUpdateNoWait("MSBBL6090_MST_QTN_S01", qtnR, qtnR_bldr, up0());

				msgL.addAll(checkUpdCntrNE(up0(), HdrR.$qtn_upd_cntr, qtnR));
				
				if (!msgL.isEmpty()) {
					_updCntrErr = true;
				}
				
				if (!_updCntrErr) {
					
					msgL.addAll(checkWritableDptCdDac(qtnR, MST_QTN_R.$sls_dpt_cd));
					if (!isNull(qtnR) && !qtnR.isEmpty()) {
						
						up0().aprv_flg(qtnR.aprv_flg());
						up0().aprv_no(qtnR.aprv_no());
						up0().aprv_sts_typ(qtnR.aprv_sts_typ());
						up0().qtn_prnt_seq(qtnR.qtn_prnt_seq());
						up0().qtn_prnt_flg(qtnR.qtn_prnt_flg());
						up0().bef_qtn_typ(qtnR.qtn_typ());
						up0().bef_failure_flg(qtnR.failure_flg());
					}
				}
			}
			
			if (!_updCntrErr) {
				msgL.addAll(checkWritableDptCdDac(up0(), HdrR.$sls_dpt_cd));
			}
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			
			MCMessageList msgL = super.doServerCheck();
			
			msgL.addAll(chkReq());
			
			return msgL;
		}
		
		/**
		 * 必須チェックを行う。
		 * @return  エラーメッセージリスト
		 */
		protected MCMessageList chkReq() {
			
			MCMessageList msgL = new MCMessageList();
			
			if (up0().rev_upd_flg()) {
				
				msgL.addAll(check(up0(), HdrR.$qtn_no, new FXUCL_RequiredValidater()));
			}
			msgL.addAll(check(up0(), HdrR.$xrate, new FXUCL_RequiredValidater()));
			
			msgL.addAll(check(up1().subList(Status.MODIFY, Status.DELETE, Status.NONE), DtlR.$qtn_d_no, new FXUCL_RequiredValidater()));
			
			MCList<DtlR> notErrL = getChkList(up1(), Status.CREATE, Status.MODIFY, Status.NONE);
			
			for (DtlR dtlR: notErrL) {
				
				if (up0().cst_iv_flg() && dtlR.sundry_itm_flg()) {
					msgL.addAll(check(dtlR, DtlR.$iv_itm_nm, new FXUCL_RequiredValidater()));
				}
				msgL.addAll(check(dtlR, DtlR.$tax_cd, new FXUCL_RequiredValidater()));
			}
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<DtlR> notErrL = getChkList(up1(), Status.CREATE, Status.MODIFY, Status.NONE);
			
			msgL.addAll(chkSub(up0(), notErrL));
			
			msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
			
			calcBaseUnitQty(notErrL);
			
			setSundryNm(up0(), notErrL);
			
			setIv(up0(), notErrL);
			
			setDispSeq(notErrL);
			
			return msgL;
		}
		
		/**
		 * 基準単位数量を算出する。
		 * @param dtlL 見積明細
		 */
		protected void calcBaseUnitQty(MCList<DtlR> dtlL) {

			for (DtlR dtlR: dtlL) {
				
				dtlR.base_unit_qty(
						convToBaseUnit(dtlR.trd_unit_qty(), 
								dtlR.trd_unit_conv_base_qty(), 
								dtlR.trd_unit_conv_qty(), 
								dtlR.base_unit_dec_place(), 
								dtlR.base_unit_rnd_typ()));
			}
		}
		
		/**
		 * 諸口以外の場合は、名称をクリアする。
		 * @param hdrR 見積ヘッダ
		 * @param dtlL 見積明細
		 */
		protected void setSundryNm(HdrR hdrR, MCList<DtlR> dtlL) {
			
			if (!hdrR.cst_sundry_flg()) {
				hdrR.clear(HdrR.$cst_nm);
			}
			
			for (DtlR dtlR: dtlL) {
				
				if (!dtlR.sundry_itm_flg()) {
					
					dtlR.clear(DtlR.$itm_nm);
				}
				
				if (!dtlR.dlv_sundry_flg()) {
					
					dtlR.clear(DtlR.$dlv_nm);
				}
			}
		}
		
		/**
		 * インボイス取引関連項目を設定する。
		 * @param hdrR 見積ヘッダ
		 * @param dtlL 見積明細
		 */
		protected void setIv(HdrR hdrR, MCList<DtlR> dtlL) {
			
			for (DtlR dtlR: dtlL) {
				if (!hdrR.cst_iv_flg() || !dtlR.sundry_itm_flg()) {
					dtlR.clear(DtlR.$iv_itm_nm);
				}
				if (!hdrR.cst_iv_flg()) {
					dtlR.clear(DtlR.$cntry_org_cd);
				}

			}
		}
		
		/**
		 * データ整合性チェック以外のチェックを行う。
		 * @param hdrR 見積ヘッダ
		 * @param dtlL　見積明細
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkSub(HdrR hdrR, MCList<DtlR> dtlL) {
			
			MCMessageList msgL = new MCMessageList();
			
			// 得意先取引禁止チェック
			msgL.addAll(chkCstStop(hdrR));

			// 見積区分チェック
			msgL.addAll(chkQtnTyp(hdrR));

			for (DtlR dtlR: dtlL) {
				// 受注禁止チェック
				msgL.addAll(chkSloStop(hdrR, dtlR));

				// 輸出禁止チェック
				msgL.addAll(chkExStop(hdrR, dtlR));

				// 手配ＮＯ必須・存在・発番チェック
				msgL.addAll(chkSno(hdrR, dtlR));
				
				msgL.addAll(chkTrnstQty(dtlR));
			}
			
			// 見積区分と承認状況区分によるチェック
			msgL.addAll(chkQtnAprvSts(hdrR));
			
			return msgL;
		}
		
		/**
		 * 得意先取引禁止チェックを行う。
		 * @param hdrR 見積ヘッダ
		 */
		protected MCMessageList chkCstStop(HdrR hdrR) {
			
			MCMessageList msgL = new MCMessageList();

			if (execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_BP$F_IS_SLO_STOP", "01"),
					MAPA_BP$F_IS_SLO_STOP( value(hdrR.cst_cd()), value(hdrR.qtn_dt())))) {
				msgL.add(new MCMessage(hdrR, HdrR.$cst_cd, MSBBL0008, hdrR.cst_cd(), toYMDString(hdrR.qtn_dt())));
			}
			
			return msgL;
		}
		
		/**
		 * 見積区分チェックを行う。
		 * @param hdrR 見積ヘッダ
		 * @return　エラーメッセージ
		 */
		protected MCMessageList chkQtnTyp(HdrR hdrR) {
			
			MCMessageList msgL = new MCMessageList();
			
			if (hdrR.qtn_prnt_flg() && MSC_QTN_TYP.isCREATING(hdrR.qtn_typ())) {
				msgL.add(new MCMessage(hdrR, HdrR.$qtn_typ, MSBBL0009));
			}
			return msgL;
		}
		
		/**
		 * 受注禁止チェックを行う。
		 * @param hdrR　見積ヘッダ
		 * @param dtlR 見積明細
		 * @return　エラーメッセージリスト
		 */
		protected MCMessageList chkSloStop(HdrR hdrR, DtlR dtlR) {
			
			MCMessageList msgL = new MCMessageList();
	
			MCRow r = MCRow.create();
			r.setStringNE("itm_cd", dtlR.itm_cd());
			r.setStringNE("itm_sub1", dtlR.itm_sub1());
			r.setStringNE("itm_sub2", dtlR.itm_sub2());
			r.setStringNE("itm_sub3", dtlR.itm_sub3());
			if (execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_ITM$F_IS_SLO_STOP", "01"),
					MAPA_ITM$F_IS_SLO_STOP(
					bind("itm_cd"),
					bind("itm_sub1"),
					bind("itm_sub2"),
					bind("itm_sub3"),
					value(hdrR.qtn_dt())), r)) {

				msgL.add(new MCMessage(dtlR,
						DtlR.$itm_cd,
						MSBBL0014, 
						toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						toYMDString(hdrR.qtn_dt()),
						toDispGUIIndex(dtlR)));
			}
			return msgL;
		}
		
		/**
		 * 輸出禁止チェックを行う。
		 * @param hdrR　見積ヘッダ
		 * @param dtlR 見積明細
		 * @return　エラーメッセージリスト
		 */
		protected MCMessageList chkExStop(HdrR hdrR, DtlR dtlR) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCRow r = MCRow.create();
			r.setStringNE("itm_cd", dtlR.itm_cd());
			r.setStringNE("itm_sub1", dtlR.itm_sub1());
			r.setStringNE("itm_sub2", dtlR.itm_sub2());
			r.setStringNE("itm_sub3", dtlR.itm_sub3());
			r.setStringNE("cntry_cd", dtlR.cntry_cd());
			if (execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_ITM$F_IS_EX_STOP", "01"),
					MAPA_ITM$F_IS_EX_STOP(
					bind("itm_cd"),
					bind("itm_sub1"),
					bind("itm_sub2"),
					bind("itm_sub3"),
					bind("cntry_cd"),
					value(hdrR.qtn_dt())), r)){
				
				msgL.add(new MCMessage(dtlR,
						DtlR.$itm_cd,
						MSBBL0015, 
						toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()), 
						dtlR.cntry_cd(),
						toYMDString(hdrR.qtn_dt()),
						toDispGUIIndex(dtlR)));
			}
			return msgL;
		}

		/**
		 * 手配ＮＯチェックを行う。<br>
		 *  手配ＮＯ必須チェック<br>
		 *  手配ＮＯ存在チェック
		 *  
		 * @param hdrR　見積ヘッダ
		 * @param dtlR 見積明細
		 * @return　エラーメッセージリスト
		 */
		protected MCMessageList chkSno(HdrR hdrR, DtlR dtlR) {
			
			MCMessageList msgL = new MCMessageList();
			
			if (!isNull(hdrR.wrk_no())) {
				// 手配ＮＯ必須チェック
				if (isNullOrNullVal(dtlR.sno1()) && (!dtlR.sno_auto_flg() || MAC_SNO_NO_TYP.isMANUAL(dtlR.sno1_num_typ()))) {
					msgL.add(new MCMessage(dtlR, DtlR.$sno1, MSBBL0016, toDispGUIIndex(dtlR)));
				}
				
					if (!dtlR.sno_auto_flg() || !MAC_SNO_NO_TYP.isAUTO(dtlR.sno1_num_typ())) {
						// 自動発番の場合は、手配ＮＯが発番されるため、チェックしない
					
					// 手配ＮＯ存在チェック
					MST_WRK_SNO_R wrkSnoR = MST_WRK_SNO_R.create();
					MST_WRK_SNO_R t = MST_WRK_SNO_R.create("T");
					MCQueryApiBuilder wrkSnoR_bldr = MCQueryApiBuilder.create(t);
					wrkSnoR_bldr.setSelect(t.wrk_no);
					wrkSnoR_bldr.setWhere(t.sno1.eq(bind("1")), dtlR.sno1());
					dbSelect("MSBBL6090_MST_WRK_SNO_S01", wrkSnoR, wrkSnoR_bldr);
					
					if (!wrkSnoR.isEmpty() && !isSame(hdrR.wrk_no(), wrkSnoR.wrk_no())) {
						msgL.add(new MCMessage(dtlR,
								DtlR.$sno1, 
								MSBBL0017, 
								dtlR.sno1(),
								wrkSnoR.wrk_no(),
								toDispGUIIndex(dtlR)));
					}
				}
				// 手配ＮＯ発番チェック
				// ヘッダの案件ＮＯが入力された場合、手配ＮＯ１が必須
				// 手配ＮＯ管理区分：必須、手配ＮＯ発番区分：手動、の場合必須
				// 手配ＮＯ1
				if (dtlR.slo_sno1_flg() && MAC_SNO_NO_TYP.isMANUAL(dtlR.sno1_num_typ()) && isNullOrNullVal(dtlR.sno1())) {
					dtlR.sno1(null);
					msgL.addAll(check(dtlR, DtlR.$sno1, new FXUCL_RequiredValidater()));
				}
				// 手配ＮＯ2
				if (dtlR.slo_sno2_flg() && MAC_SNO_NO_TYP.isMANUAL(dtlR.sno2_num_typ()) && isNullOrNullVal(dtlR.sno2())) {
					dtlR.sno2(null);
					msgL.addAll(check(dtlR, DtlR.$sno2, new FXUCL_RequiredValidater()));
				}
				// 手配ＮＯ3
				if (dtlR.slo_sno3_flg() && MAC_SNO_NO_TYP.isMANUAL(dtlR.sno3_num_typ()) && isNullOrNullVal(dtlR.sno3())) {
					dtlR.sno3(null);
					msgL.addAll(check(dtlR, DtlR.$sno3, new FXUCL_RequiredValidater()));
				}
				// 手配ＮＯ4
				if (dtlR.slo_sno4_flg() && MAC_SNO_NO_TYP.isMANUAL(dtlR.sno4_num_typ()) && isNullOrNullVal(dtlR.sno4())) {
					dtlR.sno4(null);
					msgL.addAll(check(dtlR, DtlR.$sno4, new FXUCL_RequiredValidater()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 見積数が引き継ぎ数量の合計が下回ったかどうかチェックする。
		 * 
		 * @param dtlR 見積明細
		 * @return　エラーメッセージリスト
		 */
		protected MCMessageList chkTrnstQty(DtlR dtlR) {
			
			MCMessageList msgL = new MCMessageList();
			
			if (dtlR.isStatusModify()) {
				
				if (dtlR.trd_unit_qty().lt(sum(dtlR.sls_trnst_qty(), dtlR.slo_trnst_qty()))) {
					
					msgL.add(new MCMessage(dtlR,
							DtlR.$trd_unit_qty, 
							MSBBL0242, 
							dtlR.qtn_d_no(),
							dtlR.trd_unit_qty(),
							sum(dtlR.sls_trnst_qty(), dtlR.slo_trnst_qty()),
							toDispGUIIndex(dtlR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 見積区分「作成中」、かつ、失注ＦＬＧがＯＮの場合エラー<br>
		 * 見積区分「作成中」、かつ、承認状況区分「一次承認済」「最終承認済」の場合エラー
		 * 
		 * @param hdrR 見積ヘッダ
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkQtnAprvSts(HdrR hdrR) {
			
			MCMessageList msgL = new MCMessageList();
			
			if (isQtn(hdrR.bef_qtn_typ()) && MSC_QTN_TYP.isCREATING(hdrR.qtn_typ())) {
				
				if (isAcptOrFix(hdrR.aprv_sts_typ())) {
					msgL.add(new MCMessage(hdrR, HdrR.$qtn_typ, MSBBL0208));
				}
				
				if (!hdrR.bef_failure_flg() && hdrR.failure_flg() && (
						isAcptOrFix(hdrR.aprv_sts_typ()) || isRjctOrLastRjct(hdrR.aprv_sts_typ()))) {
					msgL.add(new MCMessage(hdrR, HdrR.$qtn_typ, MSBBL0209));
				}
			}
			return msgL;
		}
		
		/**
		 * 見積区分が「仮見積」「本見積」かどうかを判定します。
		 * 
		 * @param qtnTyp 見積区分
		 * @return 判定結果
		 */
		protected boolean isQtn(String qtnTyp) {
			return MSC_QTN_TYP.isPRE_QTN(qtnTyp) || MSC_QTN_TYP.isQTN(qtnTyp);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}
	
	/**
	 * QtnReg_Chk02オペレーション.<p>
	 *
	 * 取消前時チェック処理 を行う。<br>
	 */
	public class QtnReg_Chk02 extends MSBBL_QtnRegService_MC_A.QtnReg_Chk02 {
		
		protected MST_QTN_R _qtnR = null;
		
		/**
		 * 更新カウンタチェックエラー
		 */
		protected boolean _updCntrErr = false;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgL = super.doServerCheckSub();
			
			if (_updCntrErr) {
				return msgL;
			}
			
			msgL.addAll(chkQtnTrnst());
			
			return msgL;
		}
		
		/**
		 * 引き継済みの見積明細が存在するかチェックする。
		 */
		protected MCMessageList chkQtnTrnst() {
			
			MCMessageList msgL = new MCMessageList();
			
			if (isQtnNextOper(up0().qtn_no(), up0().qtn_rev())) {
				
				msgL.add(new MCMessage(MSBBL0243));
			}
			
			return msgL;
		}

		/**
		 * 更新カウンタチェック、排他ロック獲得を行う。
		 * @return　エラーメッセージリスト
		 */
		protected MCMessageList lockAndCheckBase() {

			MCMessageList msgL = new MCMessageList();

			_qtnR = MST_QTN_R.create();
			MST_QTN_R t = MST_QTN_R.create("T");
			MCQueryApiBuilder qtnR_bldr = MCQueryApiBuilder.create(t);
			
			qtnR_bldr.setSelect(
						t.qtn_no, 
						t.qtn_rev, 
						t.sls_dpt_cd, 
						t.aprv_no, 
						t.upd_cntr);
			
			dbSelectKeyForUpdateNoWait("MSBBL6090_MST_QTN_S02", _qtnR, qtnR_bldr, up0());
			
			msgL.addAll(checkUpdCntrNE(up0(), QtnReg_Chk02_HdrR.$qtn_upd_cntr, _qtnR));
			
			if (!msgL.isEmpty()) {
				_updCntrErr = true;
			}
			else {

				msgL.addAll(checkWritableDptCdDac(_qtnR, MST_QTN_R.$sls_dpt_cd));
			}
			return msgL;
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			copyall(down0(), up0());
			down0().aprv_no(_qtnR.aprv_no());
		}
	}
	
	/**
	 * QtnReg_Ins01オペレーション.<p>
	 * 
	 * 見積を新規登録する。<br>
	 */
	public class QtnReg_Ins01 extends MSBBL_QtnRegService_MC_A.QtnReg_Ins01 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			editUp();
			
			callSundryItmRegServiceChk01(up1());
			
			callSundryItmRegServiceUpd01(up1());
			
			calcAmtPerLine(up0(), up1());
			
			callAprvServiceChk01(up0(), false);
			
			callAprvServiceUpd01(up0(), false);
			
			updWrkSno(up0(), up1());
			
			crtQtn();
			
			crtQtnD();
			
			setDown();
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {

			up0().qtn_prnt_seq(0);
			
			setQtnNo();
			setQtnDNo(up1());
			setSno(up0(), up1());
		}
		
		/**
		 * 見積を登録する。
		 */
		protected void crtQtn() {

			MST_QTN_R qtnR = MST_QTN_R.create();
			copy(qtnR, up0(), createMap_MST_QTN_R_HdrR());
			
			dbInsertEx("MSBBL6090_MST_QTN_I01", qtnR,
					MCQueryApiBuilder.create(MST_QTN_R.create("T")));
		}
		
		/**
		 * 見積明細を登録する。
		 */
		protected void crtQtnD() {
			
			MCList<MST_QTN_D_R> qtnDL = MCList.create(MST_QTN_D_R.class);
			addAll(qtnDL, up1(), createMap_MST_QTN_D_R_DtlR());
			qtnDL.setValue(MST_QTN_D_R.$qtn_no, up0().qtn_no());
			qtnDL.setValue(MST_QTN_D_R.$qtn_rev, up0().qtn_rev());
			
			dbInsertEx("MSBBL6090_MST_QTN_D_I01", qtnDL,
					MCQueryApiBuilder.create(MST_QTN_D_R.create("T")));
		}
		
		/**
		 * 見積ＮＯを発番する。
		 */
		protected void setQtnNo() {
			
			if (!up0().rev_upd_flg()){
				
				ElmArgsR args = ElmArgsR.create();

				args.co_cd(getCo().co_cd());
				
				args.dt(up0().qtn_dt());
				args.dpt_cd(up0().sls_dpt_cd());
				args.bp_cd(up0().cst_cd());
				args.wg_cd(up0().wg_cd());
				args.trd_cd(up0().trd_cd());
				
				up0().qtn_no(getNum(MAC_NUM_BIZ_TYP.QTN, args));
				up0().qtn_rev(1);
			}
			// 改訂更新する場合
			else {
				
				up0().qtn_no(up0().qtn_no());
				up0().qtn_rev(getQtnUpdRev());
			}
		}
		
		/**
		 * アップした改訂番号を返す。
		 */
		protected MCNumber getQtnUpdRev() {
			
			MCList<MST_QTN_R> qtnL = MCList.create(MST_QTN_R.class);
			MST_QTN_R t = MST_QTN_R.create("T");
			MCQueryApiBuilder qtnL_bldr = MCQueryApiBuilder.create(t);
			qtnL_bldr.setSelect(t.qtn_rev);
			qtnL_bldr.setWhere(t.qtn_no.eq(bind("1")), up0().qtn_no());
			dbSelectForUpdate("MSBBL6090_MST_QTN_S03", qtnL, qtnL_bldr);

			MCNumber max = (MCNumber)qtnL.max(MST_QTN_R.$qtn_rev);

			if (isNull(max)) {
				return MCNumber.ZERO;
			}

			return max.add(1);
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {

			down0().qtn_no(up0().qtn_no());
			down0().qtn_rev(up0().qtn_rev());
			
			down0().aprv_flg(up0().aprv_flg());
			down0().aprv_no(up0().aprv_no());
			down0().aprv_sts_typ(up0().aprv_sts_typ());
			
			for (DtlR up : up1()) {
				DtlR down = DtlR.create();
				down.peg_no(up.peg_no());
				down.qtn_d_no(up.qtn_d_no());
				down.sno1(up.sno1());
				down.sno2(up.sno2());
				down.sno3(up.sno3());
				down.sno4(up.sno4());
				down.disp_seq(up.disp_seq());
				down.setAttributes(up);
				
				down1().add(down);
			}
		}
	}
	
	/**
	 * QtnReg_Upd01オペレーション.<p>
	 * 
	 * 登録済みの見積を訂正する。<br>
	 */
	public class QtnReg_Upd01 extends MSBBL_QtnRegService_MC_A.QtnReg_Upd01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			editUp();
			
			calcAmtPerLine(up0(), up1());
			
			callAprvServiceChk01(up0(), true);
			
			callAprvServiceUpd01(up0(), true);
			
			updWrkSno(up0(), up1());
			
			updQtn();
			
			updQtnD();
			
			callSundryItmRegServiceChk01(up1());
			
			callSundryItmRegServiceUpd01(up1());
			
			setDown();
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			
			setQtnDNo(up1());
			setSno(up0(), up1());
		}
		
		/**
		 * 見積を更新する。
		 */
		protected void updQtn() {

			MST_QTN_R qtnR = MST_QTN_R.create();
			MCQueryApiBuilder qtnR_bldr = MCQueryApiBuilder.create(MST_QTN_R.create("T"));

			copy(qtnR, up0(), createMap_MST_QTN_R_HdrR());
			
			if (qtnR.qtn_prnt_flg() && isPrntItmChng()) {
				
				qtnR.qtn_prnt_seq(qtnR.qtn_prnt_seq().add(MCNumber.ONE));
				qtnR.qtn_prnt_dt(null);
				qtnR.qtn_prnt_flg(false);
			}
			else {
				qtnR_bldr.removeSet(MST_QTN_R.$qtn_prnt_seq, MST_QTN_R.$qtn_prnt_dt, MST_QTN_R.$qtn_prnt_flg);
			}
			
			dbUpdateKey("MSBBL6090_MST_QTN_U01", qtnR, qtnR_bldr);

		}
		
		/**
		 * 見積書に印刷の項目が変更されたかどうか。
		 * @return 変更された場合はtrue
		 */
		protected boolean isPrntItmChng() {
			
			if (!up1().subList(Status.DELETE, Status.CREATE).isEmpty()) {
				return true;
			}
			
			MST_QTN_R qtnR = MST_QTN_R.create();
			dbSelectKey("MSBBL6090_MST_QTN_S04", qtnR,
					MCQueryApiBuilder.create(MST_QTN_R.create("T")),
					up0().qtn_no(), up0().qtn_rev());
			
			if (isChanged(getCmpQtnHdrPrnt(up0(), qtnR)))  {
				return true;
			}
			
			MCList<MST_QTN_D_R> qtnDL = getQtnD(up0().qtn_no(), up0().qtn_rev());
			DtlR dtlR = null;
			for (MST_QTN_D_R qtnDR : qtnDL) {
				
				dtlR = up1().getFirst(DtlR.$qtn_d_no, qtnDR.qtn_d_no());
				
				if (isNull(dtlR) || dtlR.isEmpty() || isChanged(getCmpQtnDtlPrnt(dtlR, qtnDR))) {
					
					return true;
				}
			}
			
			return false;
		}
		
		/**
		 * 見積ヘッダ変更前後比較用Comparable配列
		 * @param hdrR 見積ヘッダ(変更後)
		 * @param qtnR 見積ヘッダ(変更前)
		 * @return Comparable配列
		 */
		protected Comparable<?>[][] getCmpQtnHdrPrnt(HdrR hdrR, MST_QTN_R qtnR) {
			
			Comparable<?>[][] cmp = new Comparable[][] {
				
				{ hdrR.trd_cd(), qtnR.trd_cd() },
				{ hdrR.cst_cd(), qtnR.cst_cd() },
				{ hdrR.cst_zip_cd(), qtnR.cst_zip_cd() },
				{ hdrR.cst_addr1(), qtnR.cst_addr1() },
				{ hdrR.cst_addr2(), qtnR.cst_addr2() },
				{ hdrR.cst_addr3(), qtnR.cst_addr3() },
				{ hdrR.cst_addr4(), qtnR.cst_addr4() },
				{ hdrR.cst_nm(), qtnR.cst_nm() },
				{ hdrR.cst_cntct_dpt(), qtnR.cst_cntct_dpt() },
				{ hdrR.cst_cntct_psn(), qtnR.cst_cntct_psn() },
				{ hdrR.cst_tel(), qtnR.cst_tel() },
				{ hdrR.cst_fax(), qtnR.cst_fax() },
				{ hdrR.sls_dpt_cd(), qtnR.sls_dpt_cd() },
				{ hdrR.sls_usr_cd(), qtnR.sls_usr_cd() },
				{ hdrR.trd_cur_cd(), qtnR.trd_cur_cd() },
				{ hdrR.wrk_no(), qtnR.wrk_no() },
				{ hdrR.qtn_dt(), qtnR.qtn_dt() },
				{ hdrR.valid_dt(), qtnR.valid_dt() },
				{ hdrR.sub_char1(), qtnR.sub_char1() },
				{ hdrR.sub_char2(), qtnR.sub_char2() },
				{ hdrR.sub_char3(), qtnR.sub_char3() },
				{ hdrR.trnspt_cd(), qtnR.trnspt_cd() },
				{ hdrR.tterm_cd1(), qtnR.tterm_cd1() },
				{ hdrR.tterm_cd2(), qtnR.tterm_cd2() },
				{ hdrR.tterm_cd3(), qtnR.tterm_cd3() },
				{ hdrR.tterm_rmrks1(), qtnR.tterm_rmrks1() },
				{ hdrR.tterm_rmrks2(), qtnR.tterm_rmrks2() },
				{ hdrR.tterm_rmrks3(), qtnR.tterm_rmrks3() },
				{ hdrR.qtn_term_cd(), qtnR.qtn_term_cd() },
				{ hdrR.qtn_rmrks(), qtnR.qtn_rmrks() }
			};
			
			return cmp;
		}

		/**
		 * 見積明細変更前後比較用Comparable配列
		 * @param dtlR 見積明細(変更後)
		 * @param qtnDR 見積明細(変更前)
		 * @return Comparable配列
		 */
		protected Comparable<?>[][] getCmpQtnDtlPrnt(DtlR dtlR, MST_QTN_D_R qtnDR) {
			
			Comparable<?>[][] cmp = new Comparable[][] {
				
				{ dtlR.itm_cd(), qtnDR.itm_cd() },
				{ dtlR.itm_sub1(), qtnDR.itm_sub1() },
				{ dtlR.itm_sub2(), qtnDR.itm_sub2() },
				{ dtlR.itm_sub3(), qtnDR.itm_sub3() },
				{ dtlR.itm_nm(), qtnDR.itm_nm() },
				{ dtlR.iv_itm_nm(), qtnDR.iv_itm_nm() },
				{ dtlR.cst_itm_cd(), qtnDR.cst_itm_cd() },
				{ dtlR.cst_itm_nm(), qtnDR.cst_itm_nm() },
				{ dtlR.trd_unit_qty(), qtnDR.trd_unit_qty() },
				{ dtlR.trd_unit_cd(), qtnDR.trd_unit_cd() },
				{ dtlR.cntry_org_cd(), qtnDR.cntry_org_cd() },
				{ dtlR.interim_flg(), qtnDR.interim_flg() },
				{ dtlR.trd_cur_upri(), qtnDR.trd_cur_upri() },
				{ dtlR.tax_cd(), qtnDR.tax_cd() },
				{ dtlR.trd_cur_std_sls_upri(), qtnDR.trd_cur_std_sls_upri() },
				{ dtlR.trd_cur_amt(), qtnDR.trd_cur_amt() },
				{ dtlR.trd_cur_std_sls_amt(), qtnDR.trd_cur_std_sls_amt() },
				{ dtlR.trd_cur_dscnt_amt(), qtnDR.trd_cur_dscnt_amt() },
				{ dtlR.trd_cur_tax_amt(), qtnDR.trd_cur_tax_amt() },
				{ dtlR.dlv_cd(), qtnDR.dlv_cd() },
				{ dtlR.dlv_nm(), qtnDR.dlv_nm() },
				{ dtlR.qtn_d_rmrks(), qtnDR.qtn_d_rmrks() },
				{ dtlR.disp_seq(), qtnDR.disp_seq() },
				{ dtlR.sub_char1(), qtnDR.sub_char1() },
				{ dtlR.sub_char2(), qtnDR.sub_char2() },
				{ dtlR.sub_char3(), qtnDR.sub_char3() }
			};
			
			return cmp;
		}
		
		/**
		 * 見積明細を更新する。
		 */
		protected void updQtnD() {
			
			MCList<MST_QTN_D_R> qtnDL = MCList.create(MST_QTN_D_R.class);
			MCQueryApiBuilder qtnDL_bldr = MCQueryApiBuilder.create(MST_QTN_D_R.create("T"));
			
			addAll(qtnDL, up1(), createMap_MST_QTN_D_R_DtlR());
			
			qtnDL.setValue(MST_QTN_D_R.$qtn_no, up0().qtn_no());
			qtnDL.setValue(MST_QTN_D_R.$qtn_rev, up0().qtn_rev());
			
			qtnDL_bldr.removeSet(MST_QTN_D_R.$slo_trnst_qty,
					MST_QTN_D_R.$sls_trnst_qty,
					MST_QTN_D_R.$itm_comp_seq,
					MST_QTN_D_R.$itm_spec_seq);
			
			dbLockInsUpdDelByStatusNoCheck("MSBBL6090_MST_QTN_D_U01", qtnDL, qtnDL_bldr);
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {

			down0().qtn_no(up0().qtn_no());
			down0().qtn_rev(up0().qtn_rev());
			
			down0().aprv_flg(up0().aprv_flg());
			down0().aprv_no(up0().aprv_no());
			down0().aprv_sts_typ(up0().aprv_sts_typ());
			
			for (DtlR up : up1()) {
				DtlR down = DtlR.create();
				down.peg_no(up.peg_no());
				down.qtn_d_no(up.qtn_d_no());
				down.sno1(up.sno1());
				down.sno2(up.sno2());
				down.sno3(up.sno3());
				down.sno4(up.sno4());
				down.disp_seq(up.disp_seq());
				down.setAttributes(up);
				
				down1().add(down);
			}
		}
	}
	
	/**
	 * QtnReg_Del01オペレーション.<p>
	 *
	 * 登録済みの見積を取消する。<br>
	 */
	public class QtnReg_Del01 extends MSBBL_QtnRegService_MC_A.QtnReg_Del01 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			callAprvServiceChk04();
			
			callAprvServiceDel01();
			
			delQtn();
			
			callAttachServiceDel01();
		}
		
		/**
		 * 見積を削除する。
		 * 
		 */
		protected void delQtn() {
			MST_QTN_R dbc = MST_QTN_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);

			builder.setSet("can_flg", dbc.can_flg, value(true));
			dbUpdateKey("MSBBL6090_MST_QTN_U02", up0(), builder);
		}
		
		/**
		 * 承認提供サービスの承認情報削除前チェックを行う。
		 */
		protected void callAprvServiceChk04() {
			
			if (isNull(up0().aprv_no())) {
				return;
			}
			
			MBBAL_AprvService.Aprv_Chk04 ope = MBBAL_AprvService.crtAprv_Chk04();

			Aprv_Chk04_Rslt1R cndR = Aprv_Chk04_Rslt1R.create();
			cndR.aprv_no(up0().aprv_no());
			cndR.peg_no(up0().peg_no());
			
			ope.up0().add(cndR);
			
			ope.exec();
		}
		
		/**
		 * 承認提供サービスの承認情報削除を呼び出す。
		 */
		protected void callAprvServiceDel01() {
			
			if (isNull(up0().aprv_no())) {
				return;
			}
			
			MBBAL_AprvService.Aprv_Del01 ope = MBBAL_AprvService.crtAprv_Del01();

			Aprv_Chk04_Rslt1R cndR = Aprv_Chk04_Rslt1R.create();
			cndR.aprv_no(up0().aprv_no());
			cndR.peg_no(up0().peg_no());
			
			ope.up0().add(cndR);
			
			ope.exec();
		}
		/**
		 * 添付帳票登録サービスの削除オペレーションを呼び出す。
		 */
		protected void callAttachServiceDel01() {
			MBBCL_AttachService.Attach_Del01 ope = MBBCL_AttachService.crtAttach_Del01();
			Attach_Chk02_DtlR dtlR = Attach_Chk02_DtlR.create();
			editUpAttachSrv(dtlR);
			ope.up0().add(dtlR);
			ope.exec();
		}
		protected void editUpAttachSrv(Attach_Chk02_DtlR r) {
			r.biz_typ(MAC_BIZ_TYP.QTN.value());
			r.report_id(up0().cst_iv_flg() ? "MSBBR0020":"MSBBR0010");
			r.biz_key1(up0().qtn_no());
			r.biz_key2(up0().qtn_rev().toString());
		}
	}
	
	/**
	 * 見積明細ＮＯを発番する。
	 * 
	 * @param dtlL 見積明細
	 */
	protected void setQtnDNo(MCList<DtlR> dtlL) {
		
		for (DtlR dtlR : dtlL) {
			
			if (dtlR.isStatusCreate()) {
				
				dtlR.qtn_d_no(getStrSeq(MSC_NUM_SYS_TYP.QTND));
			}
		}
	}
	
	/**
	 * 発番対象行を取得する。
	 * @param dtlL
	 * @return
	 */
	protected MCList<DtlR> getSetSno(MCList<DtlR> dtlL) {
		MCList<DtlR> l = MCList.create(DtlR.class);
		
		// システムパラメータで 手配ＮＯ を使用しない設定になっている場合は対象なし。
		int use_att = Integer.parseInt(getSysParm("SNO_TYP"));
		if (!(1 <= use_att && use_att <= 4)) {
			return l;
		}
				
		l = dtlL.subList(DtlR.$sno_auto_flg, true);
		return l;
	}
	
	/**
	 * 手配ＮＯを発番する。
	 */
	protected void setSno(HdrR hdrR, MCList<DtlR> dtlL) {
		
		MCList<DtlR> l = getSetSno(dtlL);
		if (l.isEmpty()) {
			chkSno(hdrR, dtlL);
			return;
		}
		
		MCList<MAM_ITM_R> itmL = getItm(l);
		
		MCIndexKey idxkey = itmL.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		for (DtlR dtlR : l) {
			MAM_ITM_R itmR = itmL.getFirst(idxkey, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
			if (isNull(itmR)) {
				continue;
			}
			
			ElmArgsR argsR = ElmArgsR.create();
			
			argsR.dpt_cd(hdrR.sls_dpt_cd()); // 売上部門ＣＤ
			argsR.co_cd(getCo().co_cd()); // 自社ＣＤ
			argsR.bp_cd(hdrR.cst_cd()); // 得意先ＣＤ
			argsR.wg_cd(hdrR.wg_cd()); // WGCD
			argsR.trd_cd(hdrR.trd_cd()); // 取引ＣＤ
			argsR.dt(hdrR.qtn_dt()); // 見積日
			argsR.str(hdrR.qtn_no()); // 文字列（見積NO）
			argsR.str2(dtlR.qtn_d_no()); // 文字列２（見積明細NO）
			argsR.str3(hdrR.wrk_no()); // 文字列３（案件ＮＯ）
			argsR.itm_cd(dtlR.itm_cd()); // 品目ＣＤ
			argsR.itm_sub1(dtlR.itm_sub1()); // 枝番１
			argsR.itm_sub2(dtlR.itm_sub2()); // 枝番２
			argsR.itm_sub3(dtlR.itm_sub3()); // 枝番３

			// 手配ＮＯ１
			//　手配ＮＯがNull文字の場合も発番しない。 新規登録時は発番したくない場合はNull文字を指定する。更新時に発番させたい場合はNull文字を消す。
			// 手配ＮＯ管理区分が「2:自動」の場合、常に発番する。
			// ただし、案件管理の場合に、手配ＮＯ１がNull文字の場合も発番する。
			if (!MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno1_mng_typ()) 
					&& !MAC_SNO_NO_TYP.isMANUAL(dtlR.sno1_num_typ()) 
					&& (isNull(dtlR.sno1()) || MAC_SNO_NO_TYP.isAUTO(dtlR.sno1_num_typ()) || (isNullOrNullVal(dtlR.sno1()) && !isNull(hdrR.wrk_no())))) {
				argsR.num_ptn_cd(itmR.sno1_ptn_cd()); // 発番パタンＣＤ
				dtlR.sno1(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));
			}
			// 手配ＮＯ２
			//　手配ＮＯがNull文字の場合も発番しない。 新規登録時は発番したくない場合はNull文字を指定する。更新時に発番させたい場合はNull文字を消す。
			// 手配ＮＯ管理区分が「2:自動」の場合、常に発番する。
			if (!MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno2_mng_typ()) 
					&& !MAC_SNO_NO_TYP.isMANUAL(dtlR.sno2_num_typ()) 
					&& (isNull(dtlR.sno2()) || MAC_SNO_NO_TYP.isAUTO(dtlR.sno2_num_typ()))) {
				argsR.num_ptn_cd(itmR.sno2_ptn_cd()); // 発番パタンＣＤ
				dtlR.sno2(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));
			}
			// 手配ＮＯ３
			//　手配ＮＯがNull文字の場合も発番しない。 新規登録時は発番したくない場合はNull文字を指定する。更新時に発番させたい場合はNull文字を消す。
			// 手配ＮＯ管理区分が「2:自動」の場合、常に発番する。
			if (!MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno3_mng_typ()) 
					&& !MAC_SNO_NO_TYP.isMANUAL(dtlR.sno3_num_typ()) 
					&& (isNull(dtlR.sno3()) || MAC_SNO_NO_TYP.isAUTO(dtlR.sno3_num_typ()))) {
				argsR.num_ptn_cd(itmR.sno3_ptn_cd()); // 発番パタンＣＤ
				dtlR.sno3(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));
			}
			// 手配ＮＯ４
			//　手配ＮＯがNull文字の場合も発番しない。 新規登録時は発番したくない場合はNull文字を指定する。更新時に発番させたい場合はNull文字を消す。
			// 手配ＮＯ管理区分が「2:自動」の場合、常に発番する。
			if (!MAC_SNO_MNG_TYP.isNOT_MNG(dtlR.sno4_mng_typ()) 
					&& !MAC_SNO_NO_TYP.isMANUAL(dtlR.sno4_num_typ()) 
					&& (isNull(dtlR.sno4()) || MAC_SNO_NO_TYP.isAUTO(dtlR.sno4_num_typ()))) {
				argsR.num_ptn_cd(itmR.sno4_ptn_cd()); // 発番パタンＣＤ
				dtlR.sno4(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));
			}
		}
		chkSno(hdrR, dtlL);
	}
	
	/**
	 * 手配ＮＯをチェックする。
	 * @param dtlL 見積明細
	 */
	protected void chkSno(HdrR hdrR, MCList<DtlR> dtlL) {
		
		MCMessageList msgL = new MCMessageList();
		
		for (DtlR dtlR: dtlL) {
			// 手配ＮＯがNullになる場合はNUll文字を保管する。
			if (isNull(dtlR.sno1())) {
				dtlR.sno1(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dtlR.sno2())) {
				dtlR.sno2(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dtlR.sno3())) {
				dtlR.sno3(MAC_STR.NULL_VAL.value());
			}
			if (isNull(dtlR.sno4())) {
				dtlR.sno4(MAC_STR.NULL_VAL.value());
			}
			
			if ((dtlR.slo_sno1_flg() || !isNull(hdrR.wrk_no())) && isNullOrNullVal(dtlR.sno1())){
				dtlR.sno1(null);
				msgL.addAll(check(dtlR, DtlR.$sno1, new FXUCL_RequiredValidater()));
			}
			if (dtlR.slo_sno2_flg() && isNullOrNullVal(dtlR.sno2())) {
				dtlR.sno2(null);
				msgL.addAll(check(dtlR, DtlR.$sno2, new FXUCL_RequiredValidater()));
			}
			if (dtlR.slo_sno3_flg() && isNullOrNullVal(dtlR.sno3())) {
				dtlR.sno3(null);
				msgL.addAll(check(dtlR, DtlR.$sno3, new FXUCL_RequiredValidater()));
			}
			if (dtlR.slo_sno4_flg() && isNullOrNullVal(dtlR.sno4())) {
				dtlR.sno4(null);
				msgL.addAll(check(dtlR, DtlR.$sno4, new FXUCL_RequiredValidater()));
			}
		}
		
		MCMessagePool.addAll(msgL);
		
		throwUpdErr();
	}
	
	protected MCList<MAM_ITM_R> getItm(MCList<DtlR> l) {
		MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
		
		itmL_bldr.setSelect(t.itm_cd);
		itmL_bldr.addSelect(t.itm_sub1);
		itmL_bldr.addSelect(t.itm_sub2);
		itmL_bldr.addSelect(t.itm_sub3);
		itmL_bldr.addSelect(t.sno1_ptn_cd);
		itmL_bldr.addSelect(t.sno2_ptn_cd);
		itmL_bldr.addSelect(t.sno3_ptn_cd);
		itmL_bldr.addSelect(t.sno4_ptn_cd);
		itmL_bldr.addSelect(t.slo_sno1_flg);
		itmL_bldr.addSelect(t.slo_sno2_flg);
		itmL_bldr.addSelect(t.slo_sno3_flg);
		itmL_bldr.addSelect(t.slo_sno4_flg);
		dbSelectKey("MSBBL6090_MAM_ITM_S01", itmL, itmL_bldr, l);
		return itmL;
	}
	
	/**
	 * 承認提供サービスの承認情報作成前チェックを呼び出す。
	 * @param hdrR 見積ヘッダ
	 * @param updFlg 更新フラグ
	 */
	protected void callAprvServiceChk01(HdrR hdrR, boolean updFlg) {
		
		if (!needExecAprvService(hdrR, updFlg)) {
			return;
		}
		
		MBBAL_AprvService.Aprv_Chk01 ope = MBBAL_AprvService.crtAprv_Chk01();
		Aprv_Chk01_Rslt1R aprvR = Aprv_Chk01_Rslt1R.create();

		aprvR.aprv_no(hdrR.aprv_no());
		aprvR.biz_usr_cd(hdrR.sls_usr_cd());
		aprvR.master_dt(hdrR.qtn_dt());
		aprvR.aprv_func_typ(MAC_APRV_FUNC_TYP.QTN_SLO.value());
		aprvR.src_dpt_cd(hdrR.sls_dpt_cd());
		aprvR.src_bp_cd(hdrR.cst_cd());
		aprvR.src_cur_cd1(hdrR.trd_cur_cd());
		if (!isNull(hdrR.trd_cur_amt()) && !isNull(hdrR.trd_cur_tax_amt())) {
			aprvR.src_amt1(hdrR.trd_cur_amt().add(hdrR.trd_cur_tax_amt()));
		}
		aprvR.aprv_src_no1(hdrR.qtn_no());
		aprvR.aprv_src_no2(hdrR.qtn_rev().toString());
		aprvR.peg_no(hdrR.peg_no());

		ope.up0().add(aprvR);
		ope.exec();
	}
	
	/**
	 * 承認提供サービスの承認情報作成を呼び出す。
	 * @param hdrR 見積ヘッダ
	 * @param updFlg 更新フラグ
	 */
	protected void callAprvServiceUpd01(HdrR hdrR, boolean updFlg) {
		
		if (!needExecAprvService(hdrR, updFlg)) {
			return;
		}
		
		if (isAprvDel(hdrR)) {
			if (isNull(hdrR.aprv_no())) {
				return;
			}
			
			MBBAL_AprvService.Aprv_Del01 ope = MBBAL_AprvService.crtAprv_Del01();

			Aprv_Chk04_Rslt1R cndR = Aprv_Chk04_Rslt1R.create();
			cndR.aprv_no(hdrR.aprv_no());
			cndR.peg_no(hdrR.peg_no());
			
			ope.up0().add(cndR);
			ope.exec();
			
			hdrR.aprv_flg(false);
			hdrR.aprv_no(null);
			hdrR.aprv_sts_typ(null);
		}
		else {
			MBBAL_AprvService.Aprv_Upd01 ope = MBBAL_AprvService.crtAprv_Upd01();
			Aprv_Chk01_Rslt1R aprvR = Aprv_Chk01_Rslt1R.create();
			
			aprvR.aprv_no(hdrR.aprv_no());
			aprvR.biz_usr_cd(hdrR.sls_usr_cd());
			aprvR.master_dt(hdrR.qtn_dt());
			aprvR.aprv_func_typ(MAC_APRV_FUNC_TYP.QTN_SLO.value());
			aprvR.src_dpt_cd(hdrR.sls_dpt_cd());
			aprvR.src_bp_cd(hdrR.cst_cd());
			aprvR.src_cur_cd1(hdrR.trd_cur_cd());
			if (!isNull(hdrR.trd_cur_amt()) && !isNull(hdrR.trd_cur_tax_amt())) {
				aprvR.src_amt1(hdrR.trd_cur_amt().add(hdrR.trd_cur_tax_amt()));
			}
			aprvR.aprv_src_no1(hdrR.qtn_no());
			aprvR.aprv_src_no2(hdrR.qtn_rev().toString());
			aprvR.peg_no(hdrR.peg_no());

			ope.up0().add(aprvR);
			ope.exec();
			
			if (ope.down0().get(0).aprv_flg()) {
				chkAprv(hdrR);
			}
			
			hdrR.aprv_flg(ope.down0().get(0).aprv_flg());
			hdrR.aprv_no(ope.down0().get(0).aprv_no());
			hdrR.aprv_sts_typ(hdrR.aprv_flg() ? MAC_APRV_STS_TYP.OPN.value() : null);
		}
	}
	
	/**
	 * 承認提供サービスの削除処理を呼び出すかどうか判定する
	 * 
	 * @param hdrR 見積ヘッダ
	 * @return 判定結果
	 */
	protected boolean isAprvDel(HdrR hdrR) {
		// 承認提供サービスの削除処理を呼び出すかどうか判定する
		if (MSC_QTN_TYP.isCREATING(hdrR.qtn_typ())) {
			if (MAC_APRV_STS_TYP.isOPN(hdrR.aprv_sts_typ())) {
				return true;
			}
			else if (!hdrR.failure_flg() && isRjctOrLastRjct(hdrR.aprv_sts_typ())) {
				return true;
			}
		}
		else {
			if (hdrR.failure_flg() && MAC_APRV_STS_TYP.isOPN(hdrR.aprv_sts_typ())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 承認サービスを実行するかどうか。
	 * @param hdrR 見積ヘッダ
	 * @param updFlg 更新フラグ
	 * @return 承認サービスを実行する必要の場合はtrue <br>
	 * ■新規<br>
	 * 見積区分が「作成中」、かつ、失注ＦＬＧがオフの場合以外<br>
	 * 
	 * ■更新<br>
	 * 以下の条件に全て当てはまる場合に、承認サービスの承認情報登録を実行する。<br>
	 * ・上り電文の見積区分が「仮見積」「本見積」	<br>
	 * ・承認状況区分が「一次承認済」「最終承認済」以外。「一次承認済」「最終承認済」の場合は、上り電文の承認引戻FLGがオンの場合<br>
	 * ・上り電文の失注FLGがオフ<br>
	 */
	protected boolean needExecAprvService(HdrR hdrR, boolean updFlg) {
		
		if (updFlg) {
			
			// 承認状況区分が「未承認」の場合
			if (MAC_APRV_STS_TYP.isOPN(hdrR.aprv_sts_typ())) {
				return true;
			}

			// 見積区分「作成中」
			if (MSC_QTN_TYP.isCREATING(hdrR.qtn_typ())) {
				// 失注フラグがオフ、かつ、承認状況区分が「却下」「否認」の場合
				if (isRjctOrLastRjct(hdrR.aprv_sts_typ()) && !hdrR.failure_flg()) {
					return true;
				}
			}
			// 見積区分「仮見積」「本見積」
			else {
				// 失注フラグがオフ
				if (!hdrR.failure_flg()) {
					// 「一次承認済」「最終承認済」の場合
					if (isAcptOrFix(hdrR.aprv_sts_typ())) {
						// 引戻フラグがオンの場合
						if (hdrR.aprv_back_flg()) {
							return true;
						}
					}
					// 「一次承認済」「最終承認済」以外の場合
					else {
						return true;
					}
				}
			}
		}
		else {
			
			if (!MSC_QTN_TYP.isCREATING(hdrR.qtn_typ()) && !hdrR.failure_flg()) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 承認状況区分が「一次承認済」「最終承認済」かどうかを判定します
	 * 
	 * @param aprvStsTyp 承認状況区分
	 * @return 判定結果
	 */
	protected boolean isAcptOrFix(String aprvStsTyp) {
		return MAC_APRV_STS_TYP.isACPT(aprvStsTyp) || MAC_APRV_STS_TYP.isFIX(aprvStsTyp);
	}

	/**
	 * 承認状況区分が「否認」「却下」かどうかを判定します
	 * 
	 * @param aprvStsTyp 承認状況区分
	 * @return 判定結果
	 */
	protected boolean isRjctOrLastRjct(String aprvStsTyp) {
		return MAC_APRV_STS_TYP.isRJCT(aprvStsTyp) || MAC_APRV_STS_TYP.isLAST_RJCT(aprvStsTyp);
	}
	
	/**　
	 * 承認対象チェックを行う。
	 * @param hdrR 見積ヘッダ
	 */
	protected void chkAprv(HdrR hdrR) {
		
		if ((!hdrR.aprv_flg() || MAC_APRV_STS_TYP.isACPT(hdrR.aprv_sts_typ())) && isQtnNextOper(hdrR.qtn_no(), hdrR.qtn_rev())) {
			
			MCMessagePool.add(new MCMessage(hdrR, HdrR.$aprv_flg, MSBBL0018));
		}
	}
	
	/**
	 * 案件・手配ＮＯ紐付け情報を登録する。
	 * @param hdrR 見積ヘッダ
	 * @param dtlL 見積明細
	 */
	protected void updWrkSno(HdrR hdrR, MCList<DtlR> dtlL) {
		
		for (DtlR dtlR : dtlL) {
			if (dtlR.isStatusCreate() ||dtlR.isStatusModify()) {
				if (!isNull(dtlR.sno1()) && !isNull(hdrR.wrk_no())) {
					regWrkNoSno1(dtlR.sno1(), hdrR.wrk_no(), dtlR);
				}
			}
		}
	}
	
	/**
	 * 行単位で金額計算を行う。
	 * 
	 * @param hdrR 見積ヘッダ
	 * @param dtlL 見積明細
	 */
	protected void calcAmtPerLine(HdrR hdrR, MCList<DtlR> dtlL) {
	
		MCNumber trdCurAmtSum = MCNumber.ZERO;
		MCNumber trdCurTaxAmtSum = MCNumber.ZERO;
		
		for (DtlR dtlR : dtlL) {
			
			if (dtlR.trd_cur_upri().isZero()) {
				
				dtlR.trd_cur_amt(MCNumber.ZERO);
				dtlR.trd_cur_tax_amt(MCNumber.ZERO);
			}
			else {
				
				MCRow amtR = getAmtAndTax(
						dtlR.trd_cur_upri(), 
						dtlR.trd_unit_qty(),
						dtlR.tax_rate(), 
						dtlR.inc_tax_flg(), 
						hdrR.amt_dec_place(), 
						hdrR.sls_amt_rnd_typ(), 
						hdrR.sls_tax_rnd_typ(),
						dtlR.trd_cur_dscnt_amt());
				
				dtlR.trd_cur_amt(amtR.getNumber("amt"));
				dtlR.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
			}
			
			if (dtlR.trd_cur_std_sls_upri().isZero()) {
				
				dtlR.trd_cur_std_sls_amt(MCNumber.ZERO);
				dtlR.trd_cur_std_sls_tax_amt(MCNumber.ZERO);
			} 
			else {
				
				MCRow amtR = getAmtAndTax(
						dtlR.trd_cur_std_sls_upri(), 
						dtlR.trd_unit_qty(),
						dtlR.tax_rate(), 
						dtlR.inc_tax_flg(), 
						hdrR.amt_dec_place(), 
						hdrR.sls_amt_rnd_typ(), 
						hdrR.sls_tax_rnd_typ(),
						dtlR.trd_cur_dscnt_amt());
				
				dtlR.trd_cur_std_sls_amt(amtR.getNumber("amt"));
				dtlR.trd_cur_std_sls_tax_amt(amtR.getNumber("tax_amt"));
			}
			
			if (!dtlR.isStatusDelete()) {
				
				trdCurAmtSum = trdCurAmtSum.add(dtlR.dscnt_itm_flg() ? dtlR.trd_cur_amt().negate() : dtlR.trd_cur_amt());
				trdCurTaxAmtSum = trdCurTaxAmtSum.add(dtlR.dscnt_itm_flg() ? dtlR.trd_cur_tax_amt().negate() : dtlR.trd_cur_tax_amt());
			}
			
			if (!isNull(dtlR.cost_upri())) {
				
				if (dtlR.cost_upri().isZero()) {
					dtlR.cost_amt(MCNumber.ZERO);
				}
				else {
					dtlR.cost_amt(MSUCL_SlsUtil.getCostAmt(dtlR.cost_upri(), dtlR.base_unit_qty(), getBaseCur().amt_dec_place()));
				}
			}
		}
		
		hdrR.trd_cur_amt(trdCurAmtSum);
		hdrR.trd_cur_tax_amt(trdCurTaxAmtSum);
	}
	
	/**
	 * 諸口品登録サービスの登録・更新前チェック処理を呼び出す。
	 * @param dtlL 見積明細
	 */
	protected void callSundryItmRegServiceChk01(MCList<DtlR> dtlL) {

		MABCL_SundryItmRegService.SundryItm_Chk01 ope = MABCL_SundryItmRegService.crtSundryItm_Chk01();
		
		setAll(ope.up0(), dtlL.subList(DtlR.$sundry_itm_flg, true), createMap_SundryItm_Chk01_DtlR_DtlR());
		
		ope.exec();
		
		throwUpdErr();
	}
	
	/**
	 * 諸口品登録サービスの登録・更新処理を呼び出す。
	 * @param dtlL 見積明細
	 */
	protected void callSundryItmRegServiceUpd01(MCList<DtlR> dtlL) {

		MABCL_SundryItmRegService.SundryItm_Upd01 ope = MABCL_SundryItmRegService.crtSundryItm_Upd01();
		
		setAll(ope.up0(), dtlL.subList(DtlR.$sundry_itm_flg, true), createMap_SundryItm_Upd01_DtlR_DtlR());
		
		ope.exec();
	}
	
	
	/**
	 * 見積明細を取得する。
	 * @return 見積明細
	 */
	protected MCList<MST_QTN_D_R> getQtnD(String qtnNo, MCNumber qtnRev) {
		
		MCList<MST_QTN_D_R> qtnDL = MCList.create(MST_QTN_D_R.class);
		MST_QTN_D_R t = MST_QTN_D_R.create("T");
		MCQueryApiBuilder qtnDL_bldr = MCQueryApiBuilder.create(t);
		
		qtnDL_bldr.setWhere(t.qtn_no.eq(bind("1")), qtnNo);
		qtnDL_bldr.addWhereWithAnd(t.qtn_rev.eq(bind("1")), qtnRev);
		dbSelect("MSBBL6090_MST_QTN_D_S01", qtnDL, qtnDL_bldr);
		
		return qtnDL;
	}
	
	/**
	 * 引数に指定されたパラメータが一致するかどうか。
	 * @param cmp Comparable配列
	 * @return 一致しない場合はtrue
	 */
	protected boolean isChanged(Comparable<?>[][] cmp) {
		
		for (Comparable<?>[] c : cmp) {
			if (!isSame(c[0], c[1])) {
				return true;
			}
		}
		return false;
	}
	
	protected Map_MST_QTN_R_HdrR<MST_QTN_R,HdrR> createMap_MST_QTN_R_HdrR() {
		return new Map_MST_QTN_R_HdrR<MST_QTN_R, HdrR>();
	}

	public class Map_MST_QTN_R_HdrR<D extends MST_QTN_R, S extends HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_QTN_R.$qtn_no, HdrR.$qtn_no);
			addColumnPathMap(MST_QTN_R.$qtn_rev, HdrR.$qtn_rev);
			addColumnPathMap(MST_QTN_R.$qtn_typ, HdrR.$qtn_typ);
			addColumnPathMap(MST_QTN_R.$failure_flg, HdrR.$failure_flg);
			addColumnPathMap(MST_QTN_R.$trd_cd, HdrR.$trd_cd);
			addColumnPathMap(MST_QTN_R.$trd_ptn_typ, HdrR.$trd_ptn_typ);
			addColumnPathMap(MST_QTN_R.$qtn_dt, HdrR.$qtn_dt);
			addColumnPathMap(MST_QTN_R.$valid_dt, HdrR.$valid_dt);
			addColumnPathMap(MST_QTN_R.$cst_cd, HdrR.$cst_cd);
			addColumnPathMap(MST_QTN_R.$cst_sundry_flg, HdrR.$cst_sundry_flg);
			addColumnPathMap(MST_QTN_R.$cst_nm, HdrR.$cst_nm);
			addColumnPathMap(MST_QTN_R.$cst_cntct_dpt, HdrR.$cst_cntct_dpt);
			addColumnPathMap(MST_QTN_R.$cst_cntct_psn, HdrR.$cst_cntct_psn);
			addColumnPathMap(MST_QTN_R.$cst_zip_cd, HdrR.$cst_zip_cd);
			addColumnPathMap(MST_QTN_R.$cst_addr1, HdrR.$cst_addr1);
			addColumnPathMap(MST_QTN_R.$cst_addr2, HdrR.$cst_addr2);
			addColumnPathMap(MST_QTN_R.$cst_addr3, HdrR.$cst_addr3);
			addColumnPathMap(MST_QTN_R.$cst_addr4, HdrR.$cst_addr4);
			addColumnPathMap(MST_QTN_R.$cst_tel, HdrR.$cst_tel);
			addColumnPathMap(MST_QTN_R.$cst_fax, HdrR.$cst_fax);
			addColumnPathMap(MST_QTN_R.$tterm_cd1, HdrR.$tterm_cd1);
			addColumnPathMap(MST_QTN_R.$tterm_rmrks1, HdrR.$tterm_rmrks1);
			addColumnPathMap(MST_QTN_R.$tterm_cd2, HdrR.$tterm_cd2);
			addColumnPathMap(MST_QTN_R.$tterm_rmrks2, HdrR.$tterm_rmrks2);
			addColumnPathMap(MST_QTN_R.$tterm_cd3, HdrR.$tterm_cd3);
			addColumnPathMap(MST_QTN_R.$tterm_rmrks3, HdrR.$tterm_rmrks3);
			addColumnPathMap(MST_QTN_R.$trnspt_cd, HdrR.$trnspt_cd);
			addColumnPathMap(MST_QTN_R.$trd_cur_cd, HdrR.$trd_cur_cd);
			addColumnPathMap(MST_QTN_R.$xrate_inpt_flg, HdrR.$xrate_inpt_flg);
			addColumnPathMap(MST_QTN_R.$xrate, HdrR.$xrate);
			addColumnPathMap(MST_QTN_R.$sls_usr_cd, HdrR.$sls_usr_cd);
			addColumnPathMap(MST_QTN_R.$sls_dpt_cd, HdrR.$sls_dpt_cd);
			addColumnPathMap(MST_QTN_R.$wg_cd, HdrR.$wg_cd);
			addColumnPathMap(MST_QTN_R.$qtn_rmrks, HdrR.$qtn_rmrks);
			addColumnPathMap(MST_QTN_R.$intr_rmrks, HdrR.$intr_rmrks);
			addColumnPathMap(MST_QTN_R.$qtn_term_cd, HdrR.$qtn_term_cd);
			addColumnPathMap(MST_QTN_R.$qtn_rslt_rsn_cd, HdrR.$qtn_rslt_rsn_cd);
			addColumnPathMap(MST_QTN_R.$qtn_rslt_rsn_rmrks, HdrR.$qtn_rslt_rsn_rmrks);
			addColumnPathMap(MST_QTN_R.$wrk_no, HdrR.$wrk_no);
			addColumnPathMap(MST_QTN_R.$cst_qtn_rqst_no, HdrR.$cst_qtn_rqst_no);
			addColumnPathMap(MST_QTN_R.$rcpt_dt, HdrR.$rcpt_dt);
			addColumnPathMap(MST_QTN_R.$rcpt_usr_cd, HdrR.$rcpt_usr_cd);
			addColumnPathMap(MST_QTN_R.$aprv_flg, HdrR.$aprv_flg);
			addColumnPathMap(MST_QTN_R.$aprv_no, HdrR.$aprv_no);
			addColumnPathMap(MST_QTN_R.$aprv_sts_typ, HdrR.$aprv_sts_typ);
			addColumnPathMap(MST_QTN_R.$sub_char1, HdrR.$sub_char1);
			addColumnPathMap(MST_QTN_R.$sub_char2, HdrR.$sub_char2);
			addColumnPathMap(MST_QTN_R.$sub_char3, HdrR.$sub_char3);
			addColumnPathMap(MST_QTN_R.$qtn_prnt_flg, HdrR.$qtn_prnt_flg);
			addColumnPathMap(MST_QTN_R.$qtn_prnt_seq, HdrR.$qtn_prnt_seq);

		}
	}
	
	protected Map_MST_QTN_D_R_DtlR<MST_QTN_D_R,DtlR> createMap_MST_QTN_D_R_DtlR() {
		return new Map_MST_QTN_D_R_DtlR<MST_QTN_D_R, DtlR>();
	}

	public class Map_MST_QTN_D_R_DtlR<D extends MST_QTN_D_R, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_QTN_D_R.$qtn_d_no, DtlR.$qtn_d_no);
			addColumnPathMap(MST_QTN_D_R.$disp_seq, DtlR.$disp_seq);
			addColumnPathMap(MST_QTN_D_R.$itm_cd, DtlR.$itm_cd);
			addColumnPathMap(MST_QTN_D_R.$itm_sub1, DtlR.$itm_sub1);
			addColumnPathMap(MST_QTN_D_R.$itm_sub2, DtlR.$itm_sub2);
			addColumnPathMap(MST_QTN_D_R.$itm_sub3, DtlR.$itm_sub3);
			addColumnPathMap(MST_QTN_D_R.$sno1, DtlR.$sno1);
			addColumnPathMap(MST_QTN_D_R.$sno2, DtlR.$sno2);
			addColumnPathMap(MST_QTN_D_R.$sno3, DtlR.$sno3);
			addColumnPathMap(MST_QTN_D_R.$sno4, DtlR.$sno4);
			addColumnPathMap(MST_QTN_D_R.$itm_nm, DtlR.$itm_nm);
			addColumnPathMap(MST_QTN_D_R.$iv_itm_nm, DtlR.$iv_itm_nm);
			addColumnPathMap(MST_QTN_D_R.$gd_cd, DtlR.$gd_cd);
			addColumnPathMap(MST_QTN_D_R.$cntry_org_cd, DtlR.$cntry_org_cd);
			addColumnPathMap(MST_QTN_D_R.$dest_cd1, DtlR.$dest_cd1);
			addColumnPathMap(MST_QTN_D_R.$dest_cd2, DtlR.$dest_cd2);
			addColumnPathMap(MST_QTN_D_R.$dest_cd3, DtlR.$dest_cd3);
			addColumnPathMap(MST_QTN_D_R.$dlv_cd, DtlR.$dlv_cd);
			addColumnPathMap(MST_QTN_D_R.$dlv_sundry_flg, DtlR.$dlv_sundry_flg);
			addColumnPathMap(MST_QTN_D_R.$dlv_nm, DtlR.$dlv_nm);
			addColumnPathMap(MST_QTN_D_R.$dlv_cntct_dpt, DtlR.$dlv_cntct_dpt);
			addColumnPathMap(MST_QTN_D_R.$dlv_cntct_psn, DtlR.$dlv_cntct_psn);
			addColumnPathMap(MST_QTN_D_R.$dlv_zip_cd, DtlR.$dlv_zip_cd);
			addColumnPathMap(MST_QTN_D_R.$dlv_addr1, DtlR.$dlv_addr1);
			addColumnPathMap(MST_QTN_D_R.$dlv_addr2, DtlR.$dlv_addr2);
			addColumnPathMap(MST_QTN_D_R.$dlv_addr3, DtlR.$dlv_addr3);
			addColumnPathMap(MST_QTN_D_R.$dlv_addr4, DtlR.$dlv_addr4);
			addColumnPathMap(MST_QTN_D_R.$dlv_tel, DtlR.$dlv_tel);
			addColumnPathMap(MST_QTN_D_R.$dlv_fax, DtlR.$dlv_fax);
			addColumnPathMap(MST_QTN_D_R.$trd_unit_cd, DtlR.$trd_unit_cd);
			addColumnPathMap(MST_QTN_D_R.$trd_unit_qty, DtlR.$trd_unit_qty);
			addColumnPathMap(MST_QTN_D_R.$base_unit_cd, DtlR.$base_unit_cd);
			addColumnPathMap(MST_QTN_D_R.$base_unit_qty, DtlR.$base_unit_qty);
			addColumnPathMap(MST_QTN_D_R.$sundry_itm_flg, DtlR.$sundry_itm_flg);
			addColumnPathMap(MST_QTN_D_R.$sls_itm_no, DtlR.$sls_itm_no);
			addColumnPathMap(MST_QTN_D_R.$no_itm_cd_flg, DtlR.$no_itm_cd_flg);
			addColumnPathMap(MST_QTN_D_R.$interim_flg, DtlR.$interim_flg);
			addColumnPathMap(MST_QTN_D_R.$upri_not_tgt_flg, DtlR.$upri_not_tgt_flg);
			addColumnPathMap(MST_QTN_D_R.$trd_cur_std_sls_upri, DtlR.$trd_cur_std_sls_upri);
			addColumnPathMap(MST_QTN_D_R.$trd_cur_std_sls_amt, DtlR.$trd_cur_std_sls_amt);
			addColumnPathMap(MST_QTN_D_R.$trd_cur_dscnt_amt, DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(MST_QTN_D_R.$upri_rate, DtlR.$upri_rate);
			addColumnPathMap(MST_QTN_D_R.$trd_cur_upri, DtlR.$trd_cur_upri);
			addColumnPathMap(MST_QTN_D_R.$trd_cur_amt, DtlR.$trd_cur_amt);
			addColumnPathMap(MST_QTN_D_R.$dscnt_rsn_cd, DtlR.$dscnt_rsn_cd);
			addColumnPathMap(MST_QTN_D_R.$tax_fix_flg, DtlR.$tax_fix_flg);
			addColumnPathMap(MST_QTN_D_R.$tax_cd, DtlR.$tax_cd);
			addColumnPathMap(MST_QTN_D_R.$trd_cur_std_sls_tax_amt, DtlR.$trd_cur_std_sls_tax_amt);
			addColumnPathMap(MST_QTN_D_R.$trd_cur_tax_amt, DtlR.$trd_cur_tax_amt);
			addColumnPathMap(MST_QTN_D_R.$set_itm_grp_no, DtlR.$set_itm_grp_no);
			addColumnPathMap(MST_QTN_D_R.$cost_upri, DtlR.$cost_upri);
			addColumnPathMap(MST_QTN_D_R.$cost_amt, DtlR.$cost_amt);
			addColumnPathMap(MST_QTN_D_R.$cst_itm_cd, DtlR.$cst_itm_cd);
			addColumnPathMap(MST_QTN_D_R.$cst_itm_nm, DtlR.$cst_itm_nm);
			addColumnPathMap(MST_QTN_D_R.$qtn_d_rmrks, DtlR.$qtn_d_rmrks);
			addColumnPathMap(MST_QTN_D_R.$intr_rmrks, DtlR.$intr_rmrks);
			addColumnPathMap(MST_QTN_D_R.$qtn_d_rslt_rsn_cd, DtlR.$qtn_d_rslt_rsn_cd);
			addColumnPathMap(MST_QTN_D_R.$qtn_d_rslt_rsn_rmrks, DtlR.$qtn_d_rslt_rsn_rmrks);
			addColumnPathMap(MST_QTN_D_R.$cst_qtn_rqst_d_no, DtlR.$cst_qtn_rqst_d_no);
			addColumnPathMap(MST_QTN_D_R.$sub_char1, DtlR.$sub_char1);
			addColumnPathMap(MST_QTN_D_R.$sub_char2, DtlR.$sub_char2);
			addColumnPathMap(MST_QTN_D_R.$sub_char3, DtlR.$sub_char3);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.setStatus(src.isStatusNone() ? Status.MODIFY : src.getStatus());
			
			if (src.isStatusCreate()) {
				
				dest.slo_trnst_qty(MCNumber.ZERO);
				dest.sls_trnst_qty(MCNumber.ZERO);
				dest.itm_comp_seq(MCNumber.ZERO);
				dest.itm_spec_seq(MCNumber.ZERO);
			}
		}
	}
	
	protected Map_SundryItm_Upd01_DtlR_DtlR<SundryItm_Upd01_DtlR,DtlR> createMap_SundryItm_Upd01_DtlR_DtlR() {
		return new Map_SundryItm_Upd01_DtlR_DtlR<SundryItm_Upd01_DtlR, DtlR>();
	}

	public class Map_SundryItm_Upd01_DtlR_DtlR<D extends SundryItm_Upd01_DtlR, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_cd, DtlR.$itm_cd);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub1, DtlR.$itm_sub1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub2, DtlR.$itm_sub2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub3, DtlR.$itm_sub3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno1, DtlR.$sno1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno2, DtlR.$sno2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno3, DtlR.$sno3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno4, DtlR.$sno4);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_nm, DtlR.$itm_nm);

		}
	}
	
	protected Map_SundryItm_Chk01_DtlR_DtlR<SundryItm_Chk01_DtlR,DtlR> createMap_SundryItm_Chk01_DtlR_DtlR() {
		return new Map_SundryItm_Chk01_DtlR_DtlR<SundryItm_Chk01_DtlR, DtlR>();
	}

	public class Map_SundryItm_Chk01_DtlR_DtlR<D extends SundryItm_Chk01_DtlR, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Chk01_DtlR.$peg_no, DtlR.$peg_no);
			addColumnPathMap(SundryItm_Chk01_DtlR.$data_crud_typ, DtlR.$data_crud_typ);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_cd, DtlR.$itm_cd);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub1, DtlR.$itm_sub1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub2, DtlR.$itm_sub2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub3, DtlR.$itm_sub3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno1, DtlR.$sno1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno2, DtlR.$sno2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno3, DtlR.$sno3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno4, DtlR.$sno4);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_nm, DtlR.$itm_nm);

		}
	}

	//FMCB CUSTOM END
}